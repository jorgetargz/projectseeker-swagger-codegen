# SessionEndpointsApi

All URIs are relative to *https://project-seeker.duckdns.org:8090*

Method | HTTP request | Description
------------- | ------------- | -------------
[**sessionLogin**](SessionEndpointsApi.md#sessionLogin) | **POST** /api/session/login | Login user with firebase token and create session cookie
[**sessionLogout**](SessionEndpointsApi.md#sessionLogout) | **POST** /api/session/logout | Logout user and delete session cookie
[**sessionLogoutEverywhere**](SessionEndpointsApi.md#sessionLogoutEverywhere) | **POST** /api/session/logout-everywhere | Logout user everywhere and delete session cookie

<a name="sessionLogin"></a>
# **sessionLogin**
> sessionLogin()

Login user with firebase token and create session cookie

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = SessionEndpointsApi()
try {
    apiInstance.sessionLogin()
} catch (e: ClientException) {
    println("4xx response calling SessionEndpointsApi#sessionLogin")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SessionEndpointsApi#sessionLogin")
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

<a name="sessionLogout"></a>
# **sessionLogout**
> sessionLogout()

Logout user and delete session cookie

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = SessionEndpointsApi()
try {
    apiInstance.sessionLogout()
} catch (e: ClientException) {
    println("4xx response calling SessionEndpointsApi#sessionLogout")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SessionEndpointsApi#sessionLogout")
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

<a name="sessionLogoutEverywhere"></a>
# **sessionLogoutEverywhere**
> sessionLogoutEverywhere()

Logout user everywhere and delete session cookie

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = SessionEndpointsApi()
try {
    apiInstance.sessionLogoutEverywhere()
} catch (e: ClientException) {
    println("4xx response calling SessionEndpointsApi#sessionLogoutEverywhere")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SessionEndpointsApi#sessionLogoutEverywhere")
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

