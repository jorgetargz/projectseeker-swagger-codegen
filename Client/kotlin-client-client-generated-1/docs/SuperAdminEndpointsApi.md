# SuperAdminEndpointsApi

All URIs are relative to *https://project-seeker.duckdns.org:8090*

Method | HTTP request | Description
------------- | ------------- | -------------
[**disableUser**](SuperAdminEndpointsApi.md#disableUser) | **PUT** /api/secured/super/disable-user | Disable user
[**enableUser**](SuperAdminEndpointsApi.md#enableUser) | **PUT** /api/secured/super/enable-user | Enable user
[**getUserByEmail**](SuperAdminEndpointsApi.md#getUserByEmail) | **GET** /api/secured/super/user | Get user by email

<a name="disableUser"></a>
# **disableUser**
> disableUser(email)

Disable user

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = SuperAdminEndpointsApi()
val email : kotlin.String = email_example // kotlin.String | 
try {
    apiInstance.disableUser(email)
} catch (e: ClientException) {
    println("4xx response calling SuperAdminEndpointsApi#disableUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SuperAdminEndpointsApi#disableUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **kotlin.String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="enableUser"></a>
# **enableUser**
> enableUser(email)

Enable user

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = SuperAdminEndpointsApi()
val email : kotlin.String = email_example // kotlin.String | 
try {
    apiInstance.enableUser(email)
} catch (e: ClientException) {
    println("4xx response calling SuperAdminEndpointsApi#enableUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SuperAdminEndpointsApi#enableUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **kotlin.String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getUserByEmail"></a>
# **getUserByEmail**
> ProfileDTO getUserByEmail(email)

Get user by email

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = SuperAdminEndpointsApi()
val email : kotlin.String = email_example // kotlin.String | 
try {
    val result : ProfileDTO = apiInstance.getUserByEmail(email)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SuperAdminEndpointsApi#getUserByEmail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SuperAdminEndpointsApi#getUserByEmail")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **kotlin.String**|  |

### Return type

[**ProfileDTO**](ProfileDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

