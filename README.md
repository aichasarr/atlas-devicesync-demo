# Realm & Atlas Device Sync demo app

__This repo should serve as a source code for SA’s wanting to deliver a mobile demo around Realm and Atlas Device Sync. The scope of the demo includes the ability to keep user data automatically synchronized between intermittently internet-connected devices and a central database (Atlas) using Atlas Device Sync.__

---
# Description
This demo leverages the Realm Kotlin SDK and is essentially based on the Kotlin Flexible Sync Template App, named kotlin.todo.flex, which illustrates the creation of a Todo Item List management application. This application enables users to:
- Register their email as a new user account.
- Sign in to their account with their email and password (and sign out later).
- View, create, modify, and delete todo items.

The demo uses the new __Flexible Sync subscription__ to only show items within a range of priorities for the user (based on _id, owner_id, and priority fields) and adds functionality to the Template App.
We have added a new ‘priority’ field to the existing Item model and updated the Flexible Sync subscription to only show items within a range of priorities depending on the connected user. User1 will sync all the tasks and User2 only tasks with priority Severe or High.

To make life easier for SA, there is no need to download and install android studio on your local environment and use an emulator. We have used online tools to build the artifacts and run the mobile application directly in a virtual device on your browser. These tools are respectively AppCircle and Appetize.

---
# Demo Setup


---
# Demo Execution