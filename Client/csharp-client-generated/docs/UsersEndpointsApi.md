# IO.Swagger.Api.UsersEndpointsApi

All URIs are relative to *https://project-seeker.duckdns.org:8090*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AddOrUpdateDeviceFCMToken**](UsersEndpointsApi.md#addorupdatedevicefcmtoken) | **POST** /api/secured/users/addDevice | Add device for notifications
[**ChangeRole**](UsersEndpointsApi.md#changerole) | **PUT** /api/secured/users/changeRole | Change user role
[**CreateUser**](UsersEndpointsApi.md#createuser) | **POST** /api/secured/users/createUser | Create user
[**DeleteUser**](UsersEndpointsApi.md#deleteuser) | **DELETE** /api/secured/users/deleteUser | Delete user
[**GetMyProfile**](UsersEndpointsApi.md#getmyprofile) | **GET** /api/secured/users/myProfile | Get my profile
[**GetProfile**](UsersEndpointsApi.md#getprofile) | **GET** /api/secured/users/profile | Get profile
[**ModifyClientProfile**](UsersEndpointsApi.md#modifyclientprofile) | **PUT** /api/secured/users/modifyClientProfile | Modify client profile
[**ModifyFreelancerProfile**](UsersEndpointsApi.md#modifyfreelancerprofile) | **PUT** /api/secured/users/modifyFreelancerProfile | Modify freelancer profile

<a name="addorupdatedevicefcmtoken"></a>
# **AddOrUpdateDeviceFCMToken**
> void AddOrUpdateDeviceFCMToken (AddDeviceDTO body)

Add device for notifications

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class AddOrUpdateDeviceFCMTokenExample
    {
        public void main()
        {
            var apiInstance = new UsersEndpointsApi();
            var body = new AddDeviceDTO(); // AddDeviceDTO | 

            try
            {
                // Add device for notifications
                apiInstance.AddOrUpdateDeviceFCMToken(body);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling UsersEndpointsApi.AddOrUpdateDeviceFCMToken: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AddDeviceDTO**](AddDeviceDTO.md)|  | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="changerole"></a>
# **ChangeRole**
> ProfileDTO ChangeRole (ChangeUserRoleDTO body)

Change user role

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class ChangeRoleExample
    {
        public void main()
        {
            var apiInstance = new UsersEndpointsApi();
            var body = new ChangeUserRoleDTO(); // ChangeUserRoleDTO | 

            try
            {
                // Change user role
                ProfileDTO result = apiInstance.ChangeRole(body);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling UsersEndpointsApi.ChangeRole: " + e.Message );
            }
        }
    }
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="createuser"></a>
# **CreateUser**
> ProfileDTO CreateUser (CreateUserDTO body)

Create user

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class CreateUserExample
    {
        public void main()
        {
            var apiInstance = new UsersEndpointsApi();
            var body = new CreateUserDTO(); // CreateUserDTO | 

            try
            {
                // Create user
                ProfileDTO result = apiInstance.CreateUser(body);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling UsersEndpointsApi.CreateUser: " + e.Message );
            }
        }
    }
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="deleteuser"></a>
# **DeleteUser**
> void DeleteUser ()

Delete user

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class DeleteUserExample
    {
        public void main()
        {
            var apiInstance = new UsersEndpointsApi();

            try
            {
                // Delete user
                apiInstance.DeleteUser();
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling UsersEndpointsApi.DeleteUser: " + e.Message );
            }
        }
    }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="getmyprofile"></a>
# **GetMyProfile**
> ProfileDTO GetMyProfile ()

Get my profile

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class GetMyProfileExample
    {
        public void main()
        {
            var apiInstance = new UsersEndpointsApi();

            try
            {
                // Get my profile
                ProfileDTO result = apiInstance.GetMyProfile();
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling UsersEndpointsApi.GetMyProfile: " + e.Message );
            }
        }
    }
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="getprofile"></a>
# **GetProfile**
> ProfileDTO GetProfile (string id)

Get profile

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class GetProfileExample
    {
        public void main()
        {
            var apiInstance = new UsersEndpointsApi();
            var id = id_example;  // string | 

            try
            {
                // Get profile
                ProfileDTO result = apiInstance.GetProfile(id);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling UsersEndpointsApi.GetProfile: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **string**|  | 

### Return type

[**ProfileDTO**](ProfileDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="modifyclientprofile"></a>
# **ModifyClientProfile**
> ProfileDTO ModifyClientProfile (ModifyClientProfileDTO body)

Modify client profile

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class ModifyClientProfileExample
    {
        public void main()
        {
            var apiInstance = new UsersEndpointsApi();
            var body = new ModifyClientProfileDTO(); // ModifyClientProfileDTO | 

            try
            {
                // Modify client profile
                ProfileDTO result = apiInstance.ModifyClientProfile(body);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling UsersEndpointsApi.ModifyClientProfile: " + e.Message );
            }
        }
    }
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="modifyfreelancerprofile"></a>
# **ModifyFreelancerProfile**
> ProfileDTO ModifyFreelancerProfile (ModifyFreelancerProfileDTO body)

Modify freelancer profile

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class ModifyFreelancerProfileExample
    {
        public void main()
        {
            var apiInstance = new UsersEndpointsApi();
            var body = new ModifyFreelancerProfileDTO(); // ModifyFreelancerProfileDTO | 

            try
            {
                // Modify freelancer profile
                ProfileDTO result = apiInstance.ModifyFreelancerProfile(body);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling UsersEndpointsApi.ModifyFreelancerProfile: " + e.Message );
            }
        }
    }
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
