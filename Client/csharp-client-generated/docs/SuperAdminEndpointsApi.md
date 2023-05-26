# IO.Swagger.Api.SuperAdminEndpointsApi

All URIs are relative to *https://project-seeker.duckdns.org:8090*

Method | HTTP request | Description
------------- | ------------- | -------------
[**DisableUser**](SuperAdminEndpointsApi.md#disableuser) | **PUT** /api/secured/super/disable-user | Disable user
[**EnableUser**](SuperAdminEndpointsApi.md#enableuser) | **PUT** /api/secured/super/enable-user | Enable user
[**GetUserByEmail**](SuperAdminEndpointsApi.md#getuserbyemail) | **GET** /api/secured/super/user | Get user by email

<a name="disableuser"></a>
# **DisableUser**
> void DisableUser (string email)

Disable user

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class DisableUserExample
    {
        public void main()
        {
            var apiInstance = new SuperAdminEndpointsApi();
            var email = email_example;  // string | 

            try
            {
                // Disable user
                apiInstance.DisableUser(email);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling SuperAdminEndpointsApi.DisableUser: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **string**|  | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="enableuser"></a>
# **EnableUser**
> void EnableUser (string email)

Enable user

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class EnableUserExample
    {
        public void main()
        {
            var apiInstance = new SuperAdminEndpointsApi();
            var email = email_example;  // string | 

            try
            {
                // Enable user
                apiInstance.EnableUser(email);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling SuperAdminEndpointsApi.EnableUser: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **string**|  | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="getuserbyemail"></a>
# **GetUserByEmail**
> ProfileDTO GetUserByEmail (string email)

Get user by email

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class GetUserByEmailExample
    {
        public void main()
        {
            var apiInstance = new SuperAdminEndpointsApi();
            var email = email_example;  // string | 

            try
            {
                // Get user by email
                ProfileDTO result = apiInstance.GetUserByEmail(email);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling SuperAdminEndpointsApi.GetUserByEmail: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **string**|  | 

### Return type

[**ProfileDTO**](ProfileDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
