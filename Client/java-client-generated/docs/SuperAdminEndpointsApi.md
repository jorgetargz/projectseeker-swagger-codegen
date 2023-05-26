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
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SuperAdminEndpointsApi;


SuperAdminEndpointsApi apiInstance = new SuperAdminEndpointsApi();
String email = "email_example"; // String | 
try {
    apiInstance.disableUser(email);
} catch (ApiException e) {
    System.err.println("Exception when calling SuperAdminEndpointsApi#disableUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **String**|  |

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
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SuperAdminEndpointsApi;


SuperAdminEndpointsApi apiInstance = new SuperAdminEndpointsApi();
String email = "email_example"; // String | 
try {
    apiInstance.enableUser(email);
} catch (ApiException e) {
    System.err.println("Exception when calling SuperAdminEndpointsApi#enableUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **String**|  |

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
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SuperAdminEndpointsApi;


SuperAdminEndpointsApi apiInstance = new SuperAdminEndpointsApi();
String email = "email_example"; // String | 
try {
    ProfileDTO result = apiInstance.getUserByEmail(email);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SuperAdminEndpointsApi#getUserByEmail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **String**|  |

### Return type

[**ProfileDTO**](ProfileDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

