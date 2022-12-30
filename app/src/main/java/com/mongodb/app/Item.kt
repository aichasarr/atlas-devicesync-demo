package com.mongodb.app

import io.realm.kotlin.types.ObjectId
import io.realm.kotlin.types.RealmObject
import io.realm.kotlin.types.annotations.PrimaryKey

enum class PriorityLevel(val priority: Int) {
        Severe(0),
        High(1),
        Medium(2),
        Low(3)
}

enum class UserList(val user: String) {
        User1("63aed88bc2f1d1cd241fea65"),
        User2("63aed8b445e112be72927b91")
}

open class Item() : RealmObject {
        @PrimaryKey
        var _id: ObjectId = ObjectId.create()
        var isComplete: Boolean = false
        var summary: String = ""
        var owner_id: String = ""
        var priority: Int = PriorityLevel.Low.priority
        constructor(ownerId: String = "") : this() {
                owner_id = ownerId
        }
}
