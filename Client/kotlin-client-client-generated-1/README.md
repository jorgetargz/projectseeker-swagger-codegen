# io.swagger.client - Kotlin client library for Project Seeker API

## Requires

* Kotlin 1.4.30
* Gradle 5.3

## Build

First, create the gradle wrapper script:

```
gradle wrapper
```

Then, run:

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in Swagger definitions.
* Implementation of ApiClient is intended to reduce method counts, specifically to benefit Android targets.

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://project-seeker.duckdns.org:8090*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ProjectsEndpointsApi* | [**assignFreelancer**](docs/ProjectsEndpointsApi.md#assignfreelancer) | **POST** /api/secured/projects/client/assignFreelancer | Assign freelancer
*ProjectsEndpointsApi* | [**createProject**](docs/ProjectsEndpointsApi.md#createproject) | **POST** /api/secured/projects/client/createProject | Create project
*ProjectsEndpointsApi* | [**finishProject**](docs/ProjectsEndpointsApi.md#finishproject) | **POST** /api/secured/projects/client/finishProject | Finish project
*ProjectsEndpointsApi* | [**getInProgressProjectsByClientId**](docs/ProjectsEndpointsApi.md#getinprogressprojectsbyclientid) | **GET** /api/secured/projects/client/getMyInProgressProjects | Get the projects I have created that are in progress
*ProjectsEndpointsApi* | [**getOpenProjects**](docs/ProjectsEndpointsApi.md#getopenprojects) | **GET** /api/secured/projects/openProjects | Get all open projects
*ProjectsEndpointsApi* | [**getOpenProjectsByClient**](docs/ProjectsEndpointsApi.md#getopenprojectsbyclient) | **GET** /api/secured/projects/client/getMyOpenProjects | Get the projects I have created that are open
*ProjectsEndpointsApi* | [**getOpenProjectsBySkills**](docs/ProjectsEndpointsApi.md#getopenprojectsbyskills) | **POST** /api/secured/projects/openProjectsBySkills | Get open projects by skills
*ProjectsEndpointsApi* | [**getPrjectInfo**](docs/ProjectsEndpointsApi.md#getprjectinfo) | **GET** /api/secured/projects/projectInfo | Get project info
*ProjectsEndpointsApi* | [**getProjectsByAssignedFreelancer**](docs/ProjectsEndpointsApi.md#getprojectsbyassignedfreelancer) | **GET** /api/secured/projects/freelancer/getProjectsAssignedToMe | Get projects assigned to me
*ProjectsEndpointsApi* | [**getProjectsByClient**](docs/ProjectsEndpointsApi.md#getprojectsbyclient) | **GET** /api/secured/projects/client/myProjects | Get the projects I have created
*ProjectsEndpointsApi* | [**getProjectsByOfferFreelancer**](docs/ProjectsEndpointsApi.md#getprojectsbyofferfreelancer) | **GET** /api/secured/projects/freelancer/getProjectsWhereIHaveOffer | Get projects where I have made an offer
*ProjectsEndpointsApi* | [**submitOffer**](docs/ProjectsEndpointsApi.md#submitoffer) | **POST** /api/secured/projects/freelancer/submitOffer | Submit offer
*SessionEndpointsApi* | [**sessionLogin**](docs/SessionEndpointsApi.md#sessionlogin) | **POST** /api/session/login | Login user with firebase token and create session cookie
*SessionEndpointsApi* | [**sessionLogout**](docs/SessionEndpointsApi.md#sessionlogout) | **POST** /api/session/logout | Logout user and delete session cookie
*SessionEndpointsApi* | [**sessionLogoutEverywhere**](docs/SessionEndpointsApi.md#sessionlogouteverywhere) | **POST** /api/session/logout-everywhere | Logout user everywhere and delete session cookie
*SuperAdminEndpointsApi* | [**disableUser**](docs/SuperAdminEndpointsApi.md#disableuser) | **PUT** /api/secured/super/disable-user | Disable user
*SuperAdminEndpointsApi* | [**enableUser**](docs/SuperAdminEndpointsApi.md#enableuser) | **PUT** /api/secured/super/enable-user | Enable user
*SuperAdminEndpointsApi* | [**getUserByEmail**](docs/SuperAdminEndpointsApi.md#getuserbyemail) | **GET** /api/secured/super/user | Get user by email
*UsersEndpointsApi* | [**addOrUpdateDeviceFCMToken**](docs/UsersEndpointsApi.md#addorupdatedevicefcmtoken) | **POST** /api/secured/users/addDevice | Add device for notifications
*UsersEndpointsApi* | [**changeRole**](docs/UsersEndpointsApi.md#changerole) | **PUT** /api/secured/users/changeRole | Change user role
*UsersEndpointsApi* | [**createUser**](docs/UsersEndpointsApi.md#createuser) | **POST** /api/secured/users/createUser | Create user
*UsersEndpointsApi* | [**deleteUser**](docs/UsersEndpointsApi.md#deleteuser) | **DELETE** /api/secured/users/deleteUser | Delete user
*UsersEndpointsApi* | [**getMyProfile**](docs/UsersEndpointsApi.md#getmyprofile) | **GET** /api/secured/users/myProfile | Get my profile
*UsersEndpointsApi* | [**getProfile**](docs/UsersEndpointsApi.md#getprofile) | **GET** /api/secured/users/profile | Get profile
*UsersEndpointsApi* | [**modifyClientProfile**](docs/UsersEndpointsApi.md#modifyclientprofile) | **PUT** /api/secured/users/modifyClientProfile | Modify client profile
*UsersEndpointsApi* | [**modifyFreelancerProfile**](docs/UsersEndpointsApi.md#modifyfreelancerprofile) | **PUT** /api/secured/users/modifyFreelancerProfile | Modify freelancer profile

<a name="documentation-for-models"></a>
## Documentation for Models

 - [io.swagger.client.models.AddDeviceDTO](docs/AddDeviceDTO.md)
 - [io.swagger.client.models.AssignProjectDTO](docs/AssignProjectDTO.md)
 - [io.swagger.client.models.ChangeUserRoleDTO](docs/ChangeUserRoleDTO.md)
 - [io.swagger.client.models.CreateProjectDTO](docs/CreateProjectDTO.md)
 - [io.swagger.client.models.CreateUserDTO](docs/CreateUserDTO.md)
 - [io.swagger.client.models.ErrorDTO](docs/ErrorDTO.md)
 - [io.swagger.client.models.ModifyClientProfileDTO](docs/ModifyClientProfileDTO.md)
 - [io.swagger.client.models.ModifyFreelancerProfileDTO](docs/ModifyFreelancerProfileDTO.md)
 - [io.swagger.client.models.OfferInfoDTO](docs/OfferInfoDTO.md)
 - [io.swagger.client.models.ProfileDTO](docs/ProfileDTO.md)
 - [io.swagger.client.models.ProjectInfoDTO](docs/ProjectInfoDTO.md)
 - [io.swagger.client.models.SubmitOfferDTO](docs/SubmitOfferDTO.md)

<a name="documentation-for-authorization"></a>
## Documentation for Authorization

All endpoints do not require authorization.
