# ProjectSeekerApi.SessionEndpointsApi

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
```javascript
import {ProjectSeekerApi} from 'project_seeker_api';

let apiInstance = new ProjectSeekerApi.SessionEndpointsApi();
apiInstance.sessionLogin((error, data, response) => {
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

<a name="sessionLogout"></a>
# **sessionLogout**
> sessionLogout()

Logout user and delete session cookie

### Example
```javascript
import {ProjectSeekerApi} from 'project_seeker_api';

let apiInstance = new ProjectSeekerApi.SessionEndpointsApi();
apiInstance.sessionLogout((error, data, response) => {
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

<a name="sessionLogoutEverywhere"></a>
# **sessionLogoutEverywhere**
> sessionLogoutEverywhere()

Logout user everywhere and delete session cookie

### Example
```javascript
import {ProjectSeekerApi} from 'project_seeker_api';

let apiInstance = new ProjectSeekerApi.SessionEndpointsApi();
apiInstance.sessionLogoutEverywhere((error, data, response) => {
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

