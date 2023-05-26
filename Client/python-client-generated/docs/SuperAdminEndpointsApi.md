# swagger_client.SuperAdminEndpointsApi

All URIs are relative to *https://project-seeker.duckdns.org:8090*

Method | HTTP request | Description
------------- | ------------- | -------------
[**disable_user**](SuperAdminEndpointsApi.md#disable_user) | **PUT** /api/secured/super/disable-user | Disable user
[**enable_user**](SuperAdminEndpointsApi.md#enable_user) | **PUT** /api/secured/super/enable-user | Enable user
[**get_user_by_email**](SuperAdminEndpointsApi.md#get_user_by_email) | **GET** /api/secured/super/user | Get user by email

# **disable_user**
> disable_user(email)

Disable user

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.SuperAdminEndpointsApi()
email = 'email_example' # str | 

try:
    # Disable user
    api_instance.disable_user(email)
except ApiException as e:
    print("Exception when calling SuperAdminEndpointsApi->disable_user: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **str**|  | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **enable_user**
> enable_user(email)

Enable user

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.SuperAdminEndpointsApi()
email = 'email_example' # str | 

try:
    # Enable user
    api_instance.enable_user(email)
except ApiException as e:
    print("Exception when calling SuperAdminEndpointsApi->enable_user: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **str**|  | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_user_by_email**
> ProfileDTO get_user_by_email(email)

Get user by email

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.SuperAdminEndpointsApi()
email = 'email_example' # str | 

try:
    # Get user by email
    api_response = api_instance.get_user_by_email(email)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SuperAdminEndpointsApi->get_user_by_email: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **str**|  | 

### Return type

[**ProfileDTO**](ProfileDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

