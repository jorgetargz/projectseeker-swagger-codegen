# ProjectSeekerApi.SuperAdminEndpointsApi

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
```javascript
import {ProjectSeekerApi} from 'project_seeker_api';

let apiInstance = new ProjectSeekerApi.SuperAdminEndpointsApi();
let email = "email_example"; // String | 

apiInstance.disableUser(email, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
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
```javascript
import {ProjectSeekerApi} from 'project_seeker_api';

let apiInstance = new ProjectSeekerApi.SuperAdminEndpointsApi();
let email = "email_example"; // String | 

apiInstance.enableUser(email, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
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
```javascript
import {ProjectSeekerApi} from 'project_seeker_api';

let apiInstance = new ProjectSeekerApi.SuperAdminEndpointsApi();
let email = "email_example"; // String | 

apiInstance.getUserByEmail(email, (error, data, response) => {
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
 **email** | **String**|  | 

### Return type

[**ProfileDTO**](ProfileDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

