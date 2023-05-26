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
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = ProjectsEndpointsApi()
val body : AssignProjectDTO =  // AssignProjectDTO | 
try {
    val result : ProjectInfoDTO = apiInstance.assignFreelancer(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsEndpointsApi#assignFreelancer")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsEndpointsApi#assignFreelancer")
    e.printStackTrace()
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
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = ProjectsEndpointsApi()
val body : CreateProjectDTO =  // CreateProjectDTO | 
try {
    val result : ProjectInfoDTO = apiInstance.createProject(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsEndpointsApi#createProject")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsEndpointsApi#createProject")
    e.printStackTrace()
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
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = ProjectsEndpointsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : ProjectInfoDTO = apiInstance.finishProject(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsEndpointsApi#finishProject")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsEndpointsApi#finishProject")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

[**ProjectInfoDTO**](ProjectInfoDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getInProgressProjectsByClientId"></a>
# **getInProgressProjectsByClientId**
> kotlin.Array&lt;ProjectInfoDTO&gt; getInProgressProjectsByClientId()

Get the projects I have created that are in progress

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = ProjectsEndpointsApi()
try {
    val result : kotlin.Array<ProjectInfoDTO> = apiInstance.getInProgressProjectsByClientId()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsEndpointsApi#getInProgressProjectsByClientId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsEndpointsApi#getInProgressProjectsByClientId")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Array&lt;ProjectInfoDTO&gt;**](ProjectInfoDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getOpenProjects"></a>
# **getOpenProjects**
> kotlin.Array&lt;ProjectInfoDTO&gt; getOpenProjects()

Get all open projects

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = ProjectsEndpointsApi()
try {
    val result : kotlin.Array<ProjectInfoDTO> = apiInstance.getOpenProjects()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsEndpointsApi#getOpenProjects")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsEndpointsApi#getOpenProjects")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Array&lt;ProjectInfoDTO&gt;**](ProjectInfoDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getOpenProjectsByClient"></a>
# **getOpenProjectsByClient**
> kotlin.Array&lt;ProjectInfoDTO&gt; getOpenProjectsByClient()

Get the projects I have created that are open

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = ProjectsEndpointsApi()
try {
    val result : kotlin.Array<ProjectInfoDTO> = apiInstance.getOpenProjectsByClient()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsEndpointsApi#getOpenProjectsByClient")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsEndpointsApi#getOpenProjectsByClient")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Array&lt;ProjectInfoDTO&gt;**](ProjectInfoDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getOpenProjectsBySkills"></a>
# **getOpenProjectsBySkills**
> kotlin.Array&lt;ProjectInfoDTO&gt; getOpenProjectsBySkills(body)

Get open projects by skills

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = ProjectsEndpointsApi()
val body : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | 
try {
    val result : kotlin.Array<ProjectInfoDTO> = apiInstance.getOpenProjectsBySkills(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsEndpointsApi#getOpenProjectsBySkills")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsEndpointsApi#getOpenProjectsBySkills")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)|  |

### Return type

[**kotlin.Array&lt;ProjectInfoDTO&gt;**](ProjectInfoDTO.md)

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
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = ProjectsEndpointsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : ProjectInfoDTO = apiInstance.getPrjectInfo(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsEndpointsApi#getPrjectInfo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsEndpointsApi#getPrjectInfo")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

[**ProjectInfoDTO**](ProjectInfoDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getProjectsByAssignedFreelancer"></a>
# **getProjectsByAssignedFreelancer**
> kotlin.Array&lt;ProjectInfoDTO&gt; getProjectsByAssignedFreelancer()

Get projects assigned to me

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = ProjectsEndpointsApi()
try {
    val result : kotlin.Array<ProjectInfoDTO> = apiInstance.getProjectsByAssignedFreelancer()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsEndpointsApi#getProjectsByAssignedFreelancer")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsEndpointsApi#getProjectsByAssignedFreelancer")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Array&lt;ProjectInfoDTO&gt;**](ProjectInfoDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getProjectsByClient"></a>
# **getProjectsByClient**
> kotlin.Array&lt;ProjectInfoDTO&gt; getProjectsByClient()

Get the projects I have created

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = ProjectsEndpointsApi()
try {
    val result : kotlin.Array<ProjectInfoDTO> = apiInstance.getProjectsByClient()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsEndpointsApi#getProjectsByClient")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsEndpointsApi#getProjectsByClient")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Array&lt;ProjectInfoDTO&gt;**](ProjectInfoDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getProjectsByOfferFreelancer"></a>
# **getProjectsByOfferFreelancer**
> kotlin.Array&lt;ProjectInfoDTO&gt; getProjectsByOfferFreelancer()

Get projects where I have made an offer

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = ProjectsEndpointsApi()
try {
    val result : kotlin.Array<ProjectInfoDTO> = apiInstance.getProjectsByOfferFreelancer()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsEndpointsApi#getProjectsByOfferFreelancer")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsEndpointsApi#getProjectsByOfferFreelancer")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Array&lt;ProjectInfoDTO&gt;**](ProjectInfoDTO.md)

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
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = ProjectsEndpointsApi()
val body : SubmitOfferDTO =  // SubmitOfferDTO | 
try {
    val result : ProjectInfoDTO = apiInstance.submitOffer(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsEndpointsApi#submitOffer")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsEndpointsApi#submitOffer")
    e.printStackTrace()
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

