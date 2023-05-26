# ProjectSeekerApi.UsersEndpointsApi

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
```javascript
import {ProjectSeekerApi} from 'project_seeker_api';

let apiInstance = new ProjectSeekerApi.UsersEndpointsApi();
let body = new ProjectSeekerApi.AddDeviceDTO(); // AddDeviceDTO | 

apiInstance.addOrUpdateDeviceFCMToken(body, (error, data, response) => {
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
```javascript
import {ProjectSeekerApi} from 'project_seeker_api';

let apiInstance = new ProjectSeekerApi.UsersEndpointsApi();
let body = new ProjectSeekerApi.ChangeUserRoleDTO(); // ChangeUserRoleDTO | 

apiInstance.changeRole(body, (error, data, response) => {
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
```javascript
import {ProjectSeekerApi} from 'project_seeker_api';

let apiInstance = new ProjectSeekerApi.UsersEndpointsApi();
let body = new ProjectSeekerApi.CreateUserDTO(); // CreateUserDTO | 

apiInstance.createUser(body, (error, data, response) => {
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
```javascript
import {ProjectSeekerApi} from 'project_seeker_api';

let apiInstance = new ProjectSeekerApi.UsersEndpointsApi();
apiInstance.deleteUser((error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
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
```javascript
import {ProjectSeekerApi} from 'project_seeker_api';

let apiInstance = new ProjectSeekerApi.UsersEndpointsApi();
apiInstance.getMyProfile((error, data, response) => {
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
```javascript
import {ProjectSeekerApi} from 'project_seeker_api';

let apiInstance = new ProjectSeekerApi.UsersEndpointsApi();
let id = "id_example"; // String | 

apiInstance.getProfile(id, (error, data, response) => {
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
```javascript
import {ProjectSeekerApi} from 'project_seeker_api';

let apiInstance = new ProjectSeekerApi.UsersEndpointsApi();
let body = new ProjectSeekerApi.ModifyClientProfileDTO(); // ModifyClientProfileDTO | 

apiInstance.modifyClientProfile(body, (error, data, response) => {
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
```javascript
import {ProjectSeekerApi} from 'project_seeker_api';

let apiInstance = new ProjectSeekerApi.UsersEndpointsApi();
let body = new ProjectSeekerApi.ModifyFreelancerProfileDTO(); // ModifyFreelancerProfileDTO | 

apiInstance.modifyFreelancerProfile(body, (error, data, response) => {
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
 **body** | [**ModifyFreelancerProfileDTO**](ModifyFreelancerProfileDTO.md)|  | 

### Return type

[**ProfileDTO**](ProfileDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

