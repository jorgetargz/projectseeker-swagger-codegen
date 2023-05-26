# IO.Swagger - the C# library for the Project Seeker API

Project Seeker API

This C# SDK is automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen) project:

- API version: 1.0
- SDK version: 1.0.0
- Build package: io.swagger.codegen.v3.generators.dotnet.CSharpClientCodegen

<a name="frameworks-supported"></a>
## Frameworks supported
- .NET 4.0 or later
- Windows Phone 7.1 (Mango)

<a name="dependencies"></a>
## Dependencies
- [RestSharp](https://www.nuget.org/packages/RestSharp) - 105.1.0 or later
- [Json.NET](https://www.nuget.org/packages/Newtonsoft.Json/) - 7.0.0 or later
- [JsonSubTypes](https://www.nuget.org/packages/JsonSubTypes/) - 1.2.0 or later

The DLLs included in the package may not be the latest version. We recommend using [NuGet](https://docs.nuget.org/consume/installing-nuget) to obtain the latest version of the packages:
```
Install-Package RestSharp
Install-Package Newtonsoft.Json
Install-Package JsonSubTypes
```

NOTE: RestSharp versions greater than 105.1.0 have a bug which causes file uploads to fail. See [RestSharp#742](https://github.com/restsharp/RestSharp/issues/742)

<a name="installation"></a>
## Installation
Run the following command to generate the DLL
- [Mac/Linux] `/bin/sh build.sh`
- [Windows] `build.bat`

Then include the DLL (under the `bin` folder) in the C# project, and use the namespaces:
```csharp
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;
```
<a name="packaging"></a>
## Packaging

A `.nuspec` is included with the project. You can follow the Nuget quickstart to [create](https://docs.microsoft.com/en-us/nuget/quickstart/create-and-publish-a-package#create-the-package) and [publish](https://docs.microsoft.com/en-us/nuget/quickstart/create-and-publish-a-package#publish-the-package) packages.

This `.nuspec` uses placeholders from the `.csproj`, so build the `.csproj` directly:

```
nuget pack -Build -OutputDirectory out IO.Swagger.csproj
```

Then, publish to a [local feed](https://docs.microsoft.com/en-us/nuget/hosting-packages/local-feeds) or [other host](https://docs.microsoft.com/en-us/nuget/hosting-packages/overview) and consume the new package via Nuget as usual.

<a name="getting-started"></a>
## Getting Started

```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class Example
    {
        public void main()
        {
            var apiInstance = new ProjectsEndpointsApi();
            var body = new AssignProjectDTO(); // AssignProjectDTO | 

            try
            {
                // Assign freelancer
                ProjectInfoDTO result = apiInstance.AssignFreelancer(body);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ProjectsEndpointsApi.AssignFreelancer: " + e.Message );
            }
        }
    }
}
```

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://project-seeker.duckdns.org:8090*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ProjectsEndpointsApi* | [**AssignFreelancer**](docs/ProjectsEndpointsApi.md#assignfreelancer) | **POST** /api/secured/projects/client/assignFreelancer | Assign freelancer
*ProjectsEndpointsApi* | [**CreateProject**](docs/ProjectsEndpointsApi.md#createproject) | **POST** /api/secured/projects/client/createProject | Create project
*ProjectsEndpointsApi* | [**FinishProject**](docs/ProjectsEndpointsApi.md#finishproject) | **POST** /api/secured/projects/client/finishProject | Finish project
*ProjectsEndpointsApi* | [**GetInProgressProjectsByClientId**](docs/ProjectsEndpointsApi.md#getinprogressprojectsbyclientid) | **GET** /api/secured/projects/client/getMyInProgressProjects | Get the projects I have created that are in progress
*ProjectsEndpointsApi* | [**GetOpenProjects**](docs/ProjectsEndpointsApi.md#getopenprojects) | **GET** /api/secured/projects/openProjects | Get all open projects
*ProjectsEndpointsApi* | [**GetOpenProjectsByClient**](docs/ProjectsEndpointsApi.md#getopenprojectsbyclient) | **GET** /api/secured/projects/client/getMyOpenProjects | Get the projects I have created that are open
*ProjectsEndpointsApi* | [**GetOpenProjectsBySkills**](docs/ProjectsEndpointsApi.md#getopenprojectsbyskills) | **POST** /api/secured/projects/openProjectsBySkills | Get open projects by skills
*ProjectsEndpointsApi* | [**GetPrjectInfo**](docs/ProjectsEndpointsApi.md#getprjectinfo) | **GET** /api/secured/projects/projectInfo | Get project info
*ProjectsEndpointsApi* | [**GetProjectsByAssignedFreelancer**](docs/ProjectsEndpointsApi.md#getprojectsbyassignedfreelancer) | **GET** /api/secured/projects/freelancer/getProjectsAssignedToMe | Get projects assigned to me
*ProjectsEndpointsApi* | [**GetProjectsByClient**](docs/ProjectsEndpointsApi.md#getprojectsbyclient) | **GET** /api/secured/projects/client/myProjects | Get the projects I have created
*ProjectsEndpointsApi* | [**GetProjectsByOfferFreelancer**](docs/ProjectsEndpointsApi.md#getprojectsbyofferfreelancer) | **GET** /api/secured/projects/freelancer/getProjectsWhereIHaveOffer | Get projects where I have made an offer
*ProjectsEndpointsApi* | [**SubmitOffer**](docs/ProjectsEndpointsApi.md#submitoffer) | **POST** /api/secured/projects/freelancer/submitOffer | Submit offer
*SessionEndpointsApi* | [**SessionLogin**](docs/SessionEndpointsApi.md#sessionlogin) | **POST** /api/session/login | Login user with firebase token and create session cookie
*SessionEndpointsApi* | [**SessionLogout**](docs/SessionEndpointsApi.md#sessionlogout) | **POST** /api/session/logout | Logout user and delete session cookie
*SessionEndpointsApi* | [**SessionLogoutEverywhere**](docs/SessionEndpointsApi.md#sessionlogouteverywhere) | **POST** /api/session/logout-everywhere | Logout user everywhere and delete session cookie
*SuperAdminEndpointsApi* | [**DisableUser**](docs/SuperAdminEndpointsApi.md#disableuser) | **PUT** /api/secured/super/disable-user | Disable user
*SuperAdminEndpointsApi* | [**EnableUser**](docs/SuperAdminEndpointsApi.md#enableuser) | **PUT** /api/secured/super/enable-user | Enable user
*SuperAdminEndpointsApi* | [**GetUserByEmail**](docs/SuperAdminEndpointsApi.md#getuserbyemail) | **GET** /api/secured/super/user | Get user by email
*UsersEndpointsApi* | [**AddOrUpdateDeviceFCMToken**](docs/UsersEndpointsApi.md#addorupdatedevicefcmtoken) | **POST** /api/secured/users/addDevice | Add device for notifications
*UsersEndpointsApi* | [**ChangeRole**](docs/UsersEndpointsApi.md#changerole) | **PUT** /api/secured/users/changeRole | Change user role
*UsersEndpointsApi* | [**CreateUser**](docs/UsersEndpointsApi.md#createuser) | **POST** /api/secured/users/createUser | Create user
*UsersEndpointsApi* | [**DeleteUser**](docs/UsersEndpointsApi.md#deleteuser) | **DELETE** /api/secured/users/deleteUser | Delete user
*UsersEndpointsApi* | [**GetMyProfile**](docs/UsersEndpointsApi.md#getmyprofile) | **GET** /api/secured/users/myProfile | Get my profile
*UsersEndpointsApi* | [**GetProfile**](docs/UsersEndpointsApi.md#getprofile) | **GET** /api/secured/users/profile | Get profile
*UsersEndpointsApi* | [**ModifyClientProfile**](docs/UsersEndpointsApi.md#modifyclientprofile) | **PUT** /api/secured/users/modifyClientProfile | Modify client profile
*UsersEndpointsApi* | [**ModifyFreelancerProfile**](docs/UsersEndpointsApi.md#modifyfreelancerprofile) | **PUT** /api/secured/users/modifyFreelancerProfile | Modify freelancer profile

<a name="documentation-for-models"></a>
## Documentation for Models

 - [Model.AddDeviceDTO](docs/AddDeviceDTO.md)
 - [Model.AssignProjectDTO](docs/AssignProjectDTO.md)
 - [Model.ChangeUserRoleDTO](docs/ChangeUserRoleDTO.md)
 - [Model.CreateProjectDTO](docs/CreateProjectDTO.md)
 - [Model.CreateUserDTO](docs/CreateUserDTO.md)
 - [Model.ErrorDTO](docs/ErrorDTO.md)
 - [Model.ModifyClientProfileDTO](docs/ModifyClientProfileDTO.md)
 - [Model.ModifyFreelancerProfileDTO](docs/ModifyFreelancerProfileDTO.md)
 - [Model.OfferInfoDTO](docs/OfferInfoDTO.md)
 - [Model.ProfileDTO](docs/ProfileDTO.md)
 - [Model.ProjectInfoDTO](docs/ProjectInfoDTO.md)
 - [Model.SubmitOfferDTO](docs/SubmitOfferDTO.md)

<a name="documentation-for-authorization"></a>
## Documentation for Authorization

All endpoints do not require authorization.