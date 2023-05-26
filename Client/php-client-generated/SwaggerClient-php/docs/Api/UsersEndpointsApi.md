# Swagger\Client\UsersEndpointsApi

All URIs are relative to *https://project-seeker.duckdns.org:8090*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addOrUpdateDeviceFCMToken**](UsersEndpointsApi.md#addorupdatedevicefcmtoken) | **POST** /api/secured/users/addDevice | Add device for notifications
[**changeRole**](UsersEndpointsApi.md#changerole) | **PUT** /api/secured/users/changeRole | Change user role
[**createUser**](UsersEndpointsApi.md#createuser) | **POST** /api/secured/users/createUser | Create user
[**deleteUser**](UsersEndpointsApi.md#deleteuser) | **DELETE** /api/secured/users/deleteUser | Delete user
[**getMyProfile**](UsersEndpointsApi.md#getmyprofile) | **GET** /api/secured/users/myProfile | Get my profile
[**getProfile**](UsersEndpointsApi.md#getprofile) | **GET** /api/secured/users/profile | Get profile
[**modifyClientProfile**](UsersEndpointsApi.md#modifyclientprofile) | **PUT** /api/secured/users/modifyClientProfile | Modify client profile
[**modifyFreelancerProfile**](UsersEndpointsApi.md#modifyfreelancerprofile) | **PUT** /api/secured/users/modifyFreelancerProfile | Modify freelancer profile

# **addOrUpdateDeviceFCMToken**
> addOrUpdateDeviceFCMToken($body)

Add device for notifications

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Swagger\Client\Api\UsersEndpointsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$body = new \Swagger\Client\Model\AddDeviceDTO(); // \Swagger\Client\Model\AddDeviceDTO | 

try {
    $apiInstance->addOrUpdateDeviceFCMToken($body);
} catch (Exception $e) {
    echo 'Exception when calling UsersEndpointsApi->addOrUpdateDeviceFCMToken: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**\Swagger\Client\Model\AddDeviceDTO**](../Model/AddDeviceDTO.md)|  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **changeRole**
> \Swagger\Client\Model\ProfileDTO changeRole($body)

Change user role

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Swagger\Client\Api\UsersEndpointsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$body = new \Swagger\Client\Model\ChangeUserRoleDTO(); // \Swagger\Client\Model\ChangeUserRoleDTO | 

try {
    $result = $apiInstance->changeRole($body);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UsersEndpointsApi->changeRole: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**\Swagger\Client\Model\ChangeUserRoleDTO**](../Model/ChangeUserRoleDTO.md)|  |

### Return type

[**\Swagger\Client\Model\ProfileDTO**](../Model/ProfileDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createUser**
> \Swagger\Client\Model\ProfileDTO createUser($body)

Create user

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Swagger\Client\Api\UsersEndpointsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$body = new \Swagger\Client\Model\CreateUserDTO(); // \Swagger\Client\Model\CreateUserDTO | 

try {
    $result = $apiInstance->createUser($body);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UsersEndpointsApi->createUser: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**\Swagger\Client\Model\CreateUserDTO**](../Model/CreateUserDTO.md)|  |

### Return type

[**\Swagger\Client\Model\ProfileDTO**](../Model/ProfileDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deleteUser**
> deleteUser()

Delete user

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Swagger\Client\Api\UsersEndpointsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);

try {
    $apiInstance->deleteUser();
} catch (Exception $e) {
    echo 'Exception when calling UsersEndpointsApi->deleteUser: ', $e->getMessage(), PHP_EOL;
}
?>
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

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getMyProfile**
> \Swagger\Client\Model\ProfileDTO getMyProfile()

Get my profile

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Swagger\Client\Api\UsersEndpointsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);

try {
    $result = $apiInstance->getMyProfile();
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UsersEndpointsApi->getMyProfile: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**\Swagger\Client\Model\ProfileDTO**](../Model/ProfileDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getProfile**
> \Swagger\Client\Model\ProfileDTO getProfile($id)

Get profile

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Swagger\Client\Api\UsersEndpointsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$id = "id_example"; // string | 

try {
    $result = $apiInstance->getProfile($id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UsersEndpointsApi->getProfile: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **string**|  |

### Return type

[**\Swagger\Client\Model\ProfileDTO**](../Model/ProfileDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **modifyClientProfile**
> \Swagger\Client\Model\ProfileDTO modifyClientProfile($body)

Modify client profile

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Swagger\Client\Api\UsersEndpointsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$body = new \Swagger\Client\Model\ModifyClientProfileDTO(); // \Swagger\Client\Model\ModifyClientProfileDTO | 

try {
    $result = $apiInstance->modifyClientProfile($body);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UsersEndpointsApi->modifyClientProfile: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**\Swagger\Client\Model\ModifyClientProfileDTO**](../Model/ModifyClientProfileDTO.md)|  |

### Return type

[**\Swagger\Client\Model\ProfileDTO**](../Model/ProfileDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **modifyFreelancerProfile**
> \Swagger\Client\Model\ProfileDTO modifyFreelancerProfile($body)

Modify freelancer profile

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Swagger\Client\Api\UsersEndpointsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$body = new \Swagger\Client\Model\ModifyFreelancerProfileDTO(); // \Swagger\Client\Model\ModifyFreelancerProfileDTO | 

try {
    $result = $apiInstance->modifyFreelancerProfile($body);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UsersEndpointsApi->modifyFreelancerProfile: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**\Swagger\Client\Model\ModifyFreelancerProfileDTO**](../Model/ModifyFreelancerProfileDTO.md)|  |

### Return type

[**\Swagger\Client\Model\ProfileDTO**](../Model/ProfileDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

