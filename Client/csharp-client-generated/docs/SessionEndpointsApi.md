# IO.Swagger.Api.SessionEndpointsApi

All URIs are relative to *https://project-seeker.duckdns.org:8090*

Method | HTTP request | Description
------------- | ------------- | -------------
[**SessionLogin**](SessionEndpointsApi.md#sessionlogin) | **POST** /api/session/login | Login user with firebase token and create session cookie
[**SessionLogout**](SessionEndpointsApi.md#sessionlogout) | **POST** /api/session/logout | Logout user and delete session cookie
[**SessionLogoutEverywhere**](SessionEndpointsApi.md#sessionlogouteverywhere) | **POST** /api/session/logout-everywhere | Logout user everywhere and delete session cookie

<a name="sessionlogin"></a>
# **SessionLogin**
> void SessionLogin ()

Login user with firebase token and create session cookie

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class SessionLoginExample
    {
        public void main()
        {
            var apiInstance = new SessionEndpointsApi();

            try
            {
                // Login user with firebase token and create session cookie
                apiInstance.SessionLogin();
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling SessionEndpointsApi.SessionLogin: " + e.Message );
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
<a name="sessionlogout"></a>
# **SessionLogout**
> void SessionLogout ()

Logout user and delete session cookie

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class SessionLogoutExample
    {
        public void main()
        {
            var apiInstance = new SessionEndpointsApi();

            try
            {
                // Logout user and delete session cookie
                apiInstance.SessionLogout();
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling SessionEndpointsApi.SessionLogout: " + e.Message );
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
<a name="sessionlogouteverywhere"></a>
# **SessionLogoutEverywhere**
> void SessionLogoutEverywhere ()

Logout user everywhere and delete session cookie

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class SessionLogoutEverywhereExample
    {
        public void main()
        {
            var apiInstance = new SessionEndpointsApi();

            try
            {
                // Logout user everywhere and delete session cookie
                apiInstance.SessionLogoutEverywhere();
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling SessionEndpointsApi.SessionLogoutEverywhere: " + e.Message );
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
