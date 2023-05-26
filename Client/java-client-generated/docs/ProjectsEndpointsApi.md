# ProjectsEndpointsApi

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
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProjectsEndpointsApi;


ProjectsEndpointsApi apiInstance = new ProjectsEndpointsApi();
AssignProjectDTO body = new AssignProjectDTO(); // AssignProjectDTO | 
try {
    ProjectInfoDTO result = apiInstance.assignFreelancer(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsEndpointsApi#assignFreelancer");
    e.printStackTrace();
}
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
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProjectsEndpointsApi;


ProjectsEndpointsApi apiInstance = new ProjectsEndpointsApi();
CreateProjectDTO body = new CreateProjectDTO(); // CreateProjectDTO | 
try {
    ProjectInfoDTO result = apiInstance.createProject(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsEndpointsApi#createProject");
    e.printStackTrace();
}
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
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProjectsEndpointsApi;


ProjectsEndpointsApi apiInstance = new ProjectsEndpointsApi();
String id = "id_example"; // String | 
try {
    ProjectInfoDTO result = apiInstance.finishProject(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsEndpointsApi#finishProject");
    e.printStackTrace();
}
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
> List&lt;ProjectInfoDTO&gt; getInProgressProjectsByClientId()

Get the projects I have created that are in progress

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProjectsEndpointsApi;


ProjectsEndpointsApi apiInstance = new ProjectsEndpointsApi();
try {
    List<ProjectInfoDTO> result = apiInstance.getInProgressProjectsByClientId();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsEndpointsApi#getInProgressProjectsByClientId");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;ProjectInfoDTO&gt;**](ProjectInfoDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getOpenProjects"></a>
# **getOpenProjects**
> List&lt;ProjectInfoDTO&gt; getOpenProjects()

Get all open projects

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProjectsEndpointsApi;


ProjectsEndpointsApi apiInstance = new ProjectsEndpointsApi();
try {
    List<ProjectInfoDTO> result = apiInstance.getOpenProjects();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsEndpointsApi#getOpenProjects");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;ProjectInfoDTO&gt;**](ProjectInfoDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getOpenProjectsByClient"></a>
# **getOpenProjectsByClient**
> List&lt;ProjectInfoDTO&gt; getOpenProjectsByClient()

Get the projects I have created that are open

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProjectsEndpointsApi;


ProjectsEndpointsApi apiInstance = new ProjectsEndpointsApi();
try {
    List<ProjectInfoDTO> result = apiInstance.getOpenProjectsByClient();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsEndpointsApi#getOpenProjectsByClient");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;ProjectInfoDTO&gt;**](ProjectInfoDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getOpenProjectsBySkills"></a>
# **getOpenProjectsBySkills**
> List&lt;ProjectInfoDTO&gt; getOpenProjectsBySkills(body)

Get open projects by skills

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProjectsEndpointsApi;


ProjectsEndpointsApi apiInstance = new ProjectsEndpointsApi();
List<String> body = Arrays.asList("body_example"); // List<String> | 
try {
    List<ProjectInfoDTO> result = apiInstance.getOpenProjectsBySkills(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsEndpointsApi#getOpenProjectsBySkills");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;String&gt;**](String.md)|  |

### Return type

[**List&lt;ProjectInfoDTO&gt;**](ProjectInfoDTO.md)

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
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProjectsEndpointsApi;


ProjectsEndpointsApi apiInstance = new ProjectsEndpointsApi();
String id = "id_example"; // String | 
try {
    ProjectInfoDTO result = apiInstance.getPrjectInfo(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsEndpointsApi#getPrjectInfo");
    e.printStackTrace();
}
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
> List&lt;ProjectInfoDTO&gt; getProjectsByAssignedFreelancer()

Get projects assigned to me

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProjectsEndpointsApi;


ProjectsEndpointsApi apiInstance = new ProjectsEndpointsApi();
try {
    List<ProjectInfoDTO> result = apiInstance.getProjectsByAssignedFreelancer();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsEndpointsApi#getProjectsByAssignedFreelancer");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;ProjectInfoDTO&gt;**](ProjectInfoDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getProjectsByClient"></a>
# **getProjectsByClient**
> List&lt;ProjectInfoDTO&gt; getProjectsByClient()

Get the projects I have created

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProjectsEndpointsApi;


ProjectsEndpointsApi apiInstance = new ProjectsEndpointsApi();
try {
    List<ProjectInfoDTO> result = apiInstance.getProjectsByClient();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsEndpointsApi#getProjectsByClient");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;ProjectInfoDTO&gt;**](ProjectInfoDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getProjectsByOfferFreelancer"></a>
# **getProjectsByOfferFreelancer**
> List&lt;ProjectInfoDTO&gt; getProjectsByOfferFreelancer()

Get projects where I have made an offer

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProjectsEndpointsApi;


ProjectsEndpointsApi apiInstance = new ProjectsEndpointsApi();
try {
    List<ProjectInfoDTO> result = apiInstance.getProjectsByOfferFreelancer();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsEndpointsApi#getProjectsByOfferFreelancer");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;ProjectInfoDTO&gt;**](ProjectInfoDTO.md)

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
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProjectsEndpointsApi;


ProjectsEndpointsApi apiInstance = new ProjectsEndpointsApi();
SubmitOfferDTO body = new SubmitOfferDTO(); // SubmitOfferDTO | 
try {
    ProjectInfoDTO result = apiInstance.submitOffer(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsEndpointsApi#submitOffer");
    e.printStackTrace();
}
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

