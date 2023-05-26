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
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UsersEndpointsApi;


UsersEndpointsApi apiInstance = new UsersEndpointsApi();
AddDeviceDTO body = new AddDeviceDTO(); // AddDeviceDTO | 
try {
    apiInstance.addOrUpdateDeviceFCMToken(body);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersEndpointsApi#addOrUpdateDeviceFCMToken");
    e.printStackTrace();
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
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UsersEndpointsApi;


UsersEndpointsApi apiInstance = new UsersEndpointsApi();
ChangeUserRoleDTO body = new ChangeUserRoleDTO(); // ChangeUserRoleDTO | 
try {
    ProfileDTO result = apiInstance.changeRole(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersEndpointsApi#changeRole");
    e.printStackTrace();
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
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UsersEndpointsApi;


UsersEndpointsApi apiInstance = new UsersEndpointsApi();
CreateUserDTO body = new CreateUserDTO(); // CreateUserDTO | 
try {
    ProfileDTO result = apiInstance.createUser(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersEndpointsApi#createUser");
    e.printStackTrace();
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
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UsersEndpointsApi;


UsersEndpointsApi apiInstance = new UsersEndpointsApi();
try {
    apiInstance.deleteUser();
} catch (ApiException e) {
    System.err.println("Exception when calling UsersEndpointsApi#deleteUser");
    e.printStackTrace();
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
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UsersEndpointsApi;


UsersEndpointsApi apiInstance = new UsersEndpointsApi();
try {
    ProfileDTO result = apiInstance.getMyProfile();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersEndpointsApi#getMyProfile");
    e.printStackTrace();
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
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UsersEndpointsApi;


UsersEndpointsApi apiInstance = new UsersEndpointsApi();
String id = "id_example"; // String | 
try {
    ProfileDTO result = apiInstance.getProfile(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersEndpointsApi#getProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

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
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UsersEndpointsApi;


UsersEndpointsApi apiInstance = new UsersEndpointsApi();
ModifyClientProfileDTO body = new ModifyClientProfileDTO(); // ModifyClientProfileDTO | 
try {
    ProfileDTO result = apiInstance.modifyClientProfile(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersEndpointsApi#modifyClientProfile");
    e.printStackTrace();
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
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UsersEndpointsApi;


UsersEndpointsApi apiInstance = new UsersEndpointsApi();
ModifyFreelancerProfileDTO body = new ModifyFreelancerProfileDTO(); // ModifyFreelancerProfileDTO | 
try {
    ProfileDTO result = apiInstance.modifyFreelancerProfile(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersEndpointsApi#modifyFreelancerProfile");
    e.printStackTrace();
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

