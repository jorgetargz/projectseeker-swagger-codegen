# swagger_client.SessionEndpointsApi

All URIs are relative to *https://project-seeker.duckdns.org:8090*

Method | HTTP request | Description
------------- | ------------- | -------------
[**session_login**](SessionEndpointsApi.md#session_login) | **POST** /api/session/login | Login user with firebase token and create session cookie
[**session_logout**](SessionEndpointsApi.md#session_logout) | **POST** /api/session/logout | Logout user and delete session cookie
[**session_logout_everywhere**](SessionEndpointsApi.md#session_logout_everywhere) | **POST** /api/session/logout-everywhere | Logout user everywhere and delete session cookie

# **session_login**
> session_login()

Login user with firebase token and create session cookie

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.SessionEndpointsApi()

try:
    # Login user with firebase token and create session cookie
    api_instance.session_login()
except ApiException as e:
    print("Exception when calling SessionEndpointsApi->session_login: %s\n" % e)
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

# **session_logout**
> session_logout()

Logout user and delete session cookie

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.SessionEndpointsApi()

try:
    # Logout user and delete session cookie
    api_instance.session_logout()
except ApiException as e:
    print("Exception when calling SessionEndpointsApi->session_logout: %s\n" % e)
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

# **session_logout_everywhere**
> session_logout_everywhere()

Logout user everywhere and delete session cookie

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.SessionEndpointsApi()

try:
    # Logout user everywhere and delete session cookie
    api_instance.session_logout_everywhere()
except ApiException as e:
    print("Exception when calling SessionEndpointsApi->session_logout_everywhere: %s\n" % e)
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

