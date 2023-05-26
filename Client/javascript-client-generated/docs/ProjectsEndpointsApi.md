# ProjectSeekerApi.ProjectsEndpointsApi

All URIs are relative to *https://project-seeker.duckdns.org:8090*

Method | HTTP request | Description
------------- | ------------- | -------------
[**assignFreelancer**](ProjectsEndpointsApi.md#assignFreelancer) | **POST** /api/secured/projects/client/assignFreelancer | Assign freelancer
[**createProject**](ProjectsEndpointsApi.md#createProject) | **POST** /api/secured/projects/client/createProject | Create project
[**finishProject**](ProjectsEndpointsApi.md#finishProject) | **POST** /api/secured/projects/client/finishProject | Finish project
[**getInProgressProjectsByClientId**](ProjectsEndpointsApi.md#getInProgressProjectsByClientId) | **GET** /api/secured/projects/client/getMyInProgressProjects | Get the projects I have created that are in progress
[**getOpenProjects**](ProjectsEndpointsApi.md#getOpenProjects) | **GET** /api/secured/projects/openProjects | Get all open projects
[**getOpenProjectsByClient**](ProjectsEndpointsApi.md#getOpenProjectsByClient) | **GET** /api/secured/projects/client/getMyOpenProjects | Get the projects I have created that are open
[**getOpenProjectsBySkills**](ProjectsEndpointsApi.md#getOpenProjectsBySkills) | **POST** /api/secured/projects/openProjectsBySkills | Get open projects by skills
[**getPrjectInfo**](ProjectsEndpointsApi.md#getPrjectInfo) | **GET** /api/secured/projects/projectInfo | Get project info
[**getProjectsByAssignedFreelancer**](ProjectsEndpointsApi.md#getProjectsByAssignedFreelancer) | **GET** /api/secured/projects/freelancer/getProjectsAssignedToMe | Get projects assigned to me
[**getProjectsByClient**](ProjectsEndpointsApi.md#getProjectsByClient) | **GET** /api/secured/projects/client/myProjects | Get the projects I have created
[**getProjectsByOfferFreelancer**](ProjectsEndpointsApi.md#getProjectsByOfferFreelancer) | **GET** /api/secured/projects/freelancer/getProjectsWhereIHaveOffer | Get projects where I have made an offer
[**submitOffer**](ProjectsEndpointsApi.md#submitOffer) | **POST** /api/secured/projects/freelancer/submitOffer | Submit offer

<a name="assignFreelancer"></a>
# **assignFreelancer**
> ProjectInfoDTO assignFreelancer(body)

Assign freelancer

### Example
```javascript
import {ProjectSeekerApi} from 'project_seeker_api';

let apiInstance = new ProjectSeekerApi.ProjectsEndpointsApi();
let body = new ProjectSeekerApi.AssignProjectDTO(); // AssignProjectDTO | 

apiInstance.assignFreelancer(body, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AssignProjectDTO**](AssignProjectDTO.md)|  | 

### Return type

[**ProjectInfoDTO**](ProjectInfoDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createProject"></a>
# **createProject**
> ProjectInfoDTO createProject(body)

Create project

### Example
```javascript
import {ProjectSeekerApi} from 'project_seeker_api';

let apiInstance = new ProjectSeekerApi.ProjectsEndpointsApi();
let body = new ProjectSeekerApi.CreateProjectDTO(); // CreateProjectDTO | 

apiInstance.createProject(body, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateProjectDTO**](CreateProjectDTO.md)|  | 

### Return type

[**ProjectInfoDTO**](ProjectInfoDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="finishProject"></a>
# **finishProject**
> ProjectInfoDTO finishProject(id)

Finish project

### Example
```javascript
import {ProjectSeekerApi} from 'project_seeker_api';

let apiInstance = new ProjectSeekerApi.ProjectsEndpointsApi();
let id = "id_example"; // String | 

apiInstance.finishProject(id, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  | 

### Return type

[**ProjectInfoDTO**](ProjectInfoDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getInProgressProjectsByClientId"></a>
# **getInProgressProjectsByClientId**
> [ProjectInfoDTO] getInProgressProjectsByClientId()

Get the projects I have created that are in progress

### Example
```javascript
import {ProjectSeekerApi} from 'project_seeker_api';

let apiInstance = new ProjectSeekerApi.ProjectsEndpointsApi();
apiInstance.getInProgressProjectsByClientId((error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**[ProjectInfoDTO]**](ProjectInfoDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getOpenProjects"></a>
# **getOpenProjects**
> [ProjectInfoDTO] getOpenProjects()

Get all open projects

### Example
```javascript
import {ProjectSeekerApi} from 'project_seeker_api';

let apiInstance = new ProjectSeekerApi.ProjectsEndpointsApi();
apiInstance.getOpenProjects((error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**[ProjectInfoDTO]**](ProjectInfoDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getOpenProjectsByClient"></a>
# **getOpenProjectsByClient**
> [ProjectInfoDTO] getOpenProjectsByClient()

Get the projects I have created that are open

### Example
```javascript
import {ProjectSeekerApi} from 'project_seeker_api';

let apiInstance = new ProjectSeekerApi.ProjectsEndpointsApi();
apiInstance.getOpenProjectsByClient((error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**[ProjectInfoDTO]**](ProjectInfoDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getOpenProjectsBySkills"></a>
# **getOpenProjectsBySkills**
> [ProjectInfoDTO] getOpenProjectsBySkills(body)

Get open projects by skills

### Example
```javascript
import {ProjectSeekerApi} from 'project_seeker_api';

let apiInstance = new ProjectSeekerApi.ProjectsEndpointsApi();
let body = ["body_example"]; // [String] | 

apiInstance.getOpenProjectsBySkills(body, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**[String]**](String.md)|  | 

### Return type

[**[ProjectInfoDTO]**](ProjectInfoDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getPrjectInfo"></a>
# **getPrjectInfo**
> ProjectInfoDTO getPrjectInfo(id)

Get project info

### Example
```javascript
import {ProjectSeekerApi} from 'project_seeker_api';

let apiInstance = new ProjectSeekerApi.ProjectsEndpointsApi();
let id = "id_example"; // String | 

apiInstance.getPrjectInfo(id, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  | 

### Return type

[**ProjectInfoDTO**](ProjectInfoDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getProjectsByAssignedFreelancer"></a>
# **getProjectsByAssignedFreelancer**
> [ProjectInfoDTO] getProjectsByAssignedFreelancer()

Get projects assigned to me

### Example
```javascript
import {ProjectSeekerApi} from 'project_seeker_api';

let apiInstance = new ProjectSeekerApi.ProjectsEndpointsApi();
apiInstance.getProjectsByAssignedFreelancer((error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**[ProjectInfoDTO]**](ProjectInfoDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getProjectsByClient"></a>
# **getProjectsByClient**
> [ProjectInfoDTO] getProjectsByClient()

Get the projects I have created

### Example
```javascript
import {ProjectSeekerApi} from 'project_seeker_api';

let apiInstance = new ProjectSeekerApi.ProjectsEndpointsApi();
apiInstance.getProjectsByClient((error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**[ProjectInfoDTO]**](ProjectInfoDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getProjectsByOfferFreelancer"></a>
# **getProjectsByOfferFreelancer**
> [ProjectInfoDTO] getProjectsByOfferFreelancer()

Get projects where I have made an offer

### Example
```javascript
import {ProjectSeekerApi} from 'project_seeker_api';

let apiInstance = new ProjectSeekerApi.ProjectsEndpointsApi();
apiInstance.getProjectsByOfferFreelancer((error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**[ProjectInfoDTO]**](ProjectInfoDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="submitOffer"></a>
# **submitOffer**
> ProjectInfoDTO submitOffer(body)

Submit offer

### Example
```javascript
import {ProjectSeekerApi} from 'project_seeker_api';

let apiInstance = new ProjectSeekerApi.ProjectsEndpointsApi();
let body = new ProjectSeekerApi.SubmitOfferDTO(); // SubmitOfferDTO | 

apiInstance.submitOffer(body, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SubmitOfferDTO**](SubmitOfferDTO.md)|  | 

### Return type

[**ProjectInfoDTO**](ProjectInfoDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

