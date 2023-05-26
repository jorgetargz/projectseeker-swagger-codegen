# swagger_client.UsersEndpointsApi

All URIs are relative to *https://project-seeker.duckdns.org:8090*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_or_update_device_fcm_token**](UsersEndpointsApi.md#add_or_update_device_fcm_token) | **POST** /api/secured/users/addDevice | Add device for notifications
[**change_role**](UsersEndpointsApi.md#change_role) | **PUT** /api/secured/users/changeRole | Change user role
[**create_user**](UsersEndpointsApi.md#create_user) | **POST** /api/secured/users/createUser | Create user
[**delete_user**](UsersEndpointsApi.md#delete_user) | **DELETE** /api/secured/users/deleteUser | Delete user
[**get_my_profile**](UsersEndpointsApi.md#get_my_profile) | **GET** /api/secured/users/myProfile | Get my profile
[**get_profile**](UsersEndpointsApi.md#get_profile) | **GET** /api/secured/users/profile | Get profile
[**modify_client_profile**](UsersEndpointsApi.md#modify_client_profile) | **PUT** /api/secured/users/modifyClientProfile | Modify client profile
[**modify_freelancer_profile**](UsersEndpointsApi.md#modify_freelancer_profile) | **PUT** /api/secured/users/modifyFreelancerProfile | Modify freelancer profile

# **add_or_update_device_fcm_token**
> add_or_update_device_fcm_token(body)

Add device for notifications

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.UsersEndpointsApi()
body = swagger_client.AddDeviceDTO() # AddDeviceDTO | 

try:
    # Add device for notifications
    api_instance.add_or_update_device_fcm_token(body)
except ApiException as e:
    print("Exception when calling UsersEndpointsApi->add_or_update_device_fcm_token: %s\n" % e)
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

# **change_role**
> ProfileDTO change_role(body)

Change user role

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.UsersEndpointsApi()
body = swagger_client.ChangeUserRoleDTO() # ChangeUserRoleDTO | 

try:
    # Change user role
    api_response = api_instance.change_role(body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling UsersEndpointsApi->change_role: %s\n" % e)
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

# **create_user**
> ProfileDTO create_user(body)

Create user

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.UsersEndpointsApi()
body = swagger_client.CreateUserDTO() # CreateUserDTO | 

try:
    # Create user
    api_response = api_instance.create_user(body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling UsersEndpointsApi->create_user: %s\n" % e)
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

# **delete_user**
> delete_user()

Delete user

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.UsersEndpointsApi()

try:
    # Delete user
    api_instance.delete_user()
except ApiException as e:
    print("Exception when calling UsersEndpointsApi->delete_user: %s\n" % e)
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

# **get_my_profile**
> ProfileDTO get_my_profile()

Get my profile

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.UsersEndpointsApi()

try:
    # Get my profile
    api_response = api_instance.get_my_profile()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling UsersEndpointsApi->get_my_profile: %s\n" % e)
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

# **get_profile**
> ProfileDTO get_profile(id)

Get profile

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.UsersEndpointsApi()
id = 'id_example' # str | 

try:
    # Get profile
    api_response = api_instance.get_profile(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling UsersEndpointsApi->get_profile: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**|  | 

### Return type

[**ProfileDTO**](ProfileDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **modify_client_profile**
> ProfileDTO modify_client_profile(body)

Modify client profile

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.UsersEndpointsApi()
body = swagger_client.ModifyClientProfileDTO() # ModifyClientProfileDTO | 

try:
    # Modify client profile
    api_response = api_instance.modify_client_profile(body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling UsersEndpointsApi->modify_client_profile: %s\n" % e)
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

# **modify_freelancer_profile**
> ProfileDTO modify_freelancer_profile(body)

Modify freelancer profile

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.UsersEndpointsApi()
body = swagger_client.ModifyFreelancerProfileDTO() # ModifyFreelancerProfileDTO | 

try:
    # Modify freelancer profile
    api_response = api_instance.modify_freelancer_profile(body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling UsersEndpointsApi->modify_freelancer_profile: %s\n" % e)
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

