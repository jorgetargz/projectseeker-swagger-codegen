# UsersEndpointsApi

All URIs are relative to *https://project-seeker.duckdns.org:8090*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addOrUpdateDeviceFCMToken**](UsersEndpointsApi.md#addOrUpdateDeviceFCMToken) | **POST** /api/secured/users/addDevice | Add device for notifications
[**changeRole**](UsersEndpointsApi.md#changeRole) | **PUT** /api/secured/users/changeRole | Change user role
[**createUser**](UsersEndpointsApi.md#createUser) | **POST** /api/secured/users/createUser | Create user
[**deleteUser**](UsersEndpointsApi.md#deleteUser) | **DELETE** /api/secured/users/deleteUser | Delete user
[**getMyProfile**](UsersEndpointsApi.md#getMyProfile) | **GET** /api/secured/users/myProfile | Get my profile
[**getProfile**](UsersEndpointsApi.md#getProfile) | **GET** /api/secured/users/profile | Get profile
[**modifyClientProfile**](UsersEndpointsApi.md#modifyClientProfile) | **PUT** /api/secured/users/modifyClientProfile | Modify client profile
[**modifyFreelancerProfile**](UsersEndpointsApi.md#modifyFreelancerProfile) | **PUT** /api/secured/users/modifyFreelancerProfile | Modify freelancer profile

<a name="addOrUpdateDeviceFCMToken"></a>
# **addOrUpdateDeviceFCMToken**
> addOrUpdateDeviceFCMToken(body)

Add device for notifications

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = UsersEndpointsApi()
val body : AddDeviceDTO =  // AddDeviceDTO | 
try {
    apiInstance.addOrUpdateDeviceFCMToken(body)
} catch (e: ClientException) {
    println("4xx response calling UsersEndpointsApi#addOrUpdateDeviceFCMToken")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersEndpointsApi#addOrUpdateDeviceFCMToken")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AddDeviceDTO**](AddDeviceDTO.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="changeRole"></a>
# **changeRole**
> ProfileDTO changeRole(body)

Change user role

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = UsersEndpointsApi()
val body : ChangeUserRoleDTO =  // ChangeUserRoleDTO | 
try {
    val result : ProfileDTO = apiInstance.changeRole(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersEndpointsApi#changeRole")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersEndpointsApi#changeRole")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ChangeUserRoleDTO**](ChangeUserRoleDTO.md)|  |

### Return type

[**ProfileDTO**](ProfileDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createUser"></a>
# **createUser**
> ProfileDTO createUser(body)

Create user

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = UsersEndpointsApi()
val body : CreateUserDTO =  // CreateUserDTO | 
try {
    val result : ProfileDTO = apiInstance.createUser(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersEndpointsApi#createUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersEndpointsApi#createUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateUserDTO**](CreateUserDTO.md)|  |

### Return type

[**ProfileDTO**](ProfileDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteUser"></a>
# **deleteUser**
> deleteUser()

Delete user

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = UsersEndpointsApi()
try {
    apiInstance.deleteUser()
} catch (e: ClientException) {
    println("4xx response calling UsersEndpointsApi#deleteUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersEndpointsApi#deleteUser")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getMyProfile"></a>
# **getMyProfile**
> ProfileDTO getMyProfile()

Get my profile

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = UsersEndpointsApi()
try {
    val result : ProfileDTO = apiInstance.getMyProfile()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersEndpointsApi#getMyProfile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersEndpointsApi#getMyProfile")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ProfileDTO**](ProfileDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getProfile"></a>
# **getProfile**
> ProfileDTO getProfile(id)

Get profile

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = UsersEndpointsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : ProfileDTO = apiInstance.getProfile(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersEndpointsApi#getProfile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersEndpointsApi#getProfile")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

[**ProfileDTO**](ProfileDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="modifyClientProfile"></a>
# **modifyClientProfile**
> ProfileDTO modifyClientProfile(body)

Modify client profile

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = UsersEndpointsApi()
val body : ModifyClientProfileDTO =  // ModifyClientProfileDTO | 
try {
    val result : ProfileDTO = apiInstance.modifyClientProfile(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersEndpointsApi#modifyClientProfile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersEndpointsApi#modifyClientProfile")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ModifyClientProfileDTO**](ModifyClientProfileDTO.md)|  |

### Return type

[**ProfileDTO**](ProfileDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="modifyFreelancerProfile"></a>
# **modifyFreelancerProfile**
> ProfileDTO modifyFreelancerProfile(body)

Modify freelancer profile

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = UsersEndpointsApi()
val body : ModifyFreelancerProfileDTO =  // ModifyFreelancerProfileDTO | 
try {
    val result : ProfileDTO = apiInstance.modifyFreelancerProfile(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersEndpointsApi#modifyFreelancerProfile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersEndpointsApi#modifyFreelancerProfile")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ModifyFreelancerProfileDTO**](ModifyFreelancerProfileDTO.md)|  |

### Return type

[**ProfileDTO**](ProfileDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

