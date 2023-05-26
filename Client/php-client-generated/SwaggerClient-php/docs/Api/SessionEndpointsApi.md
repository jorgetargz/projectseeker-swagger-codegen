# Swagger\Client\SessionEndpointsApi

All URIs are relative to *https://project-seeker.duckdns.org:8090*

Method | HTTP request | Description
------------- | ------------- | -------------
[**sessionLogin**](SessionEndpointsApi.md#sessionlogin) | **POST** /api/session/login | Login user with firebase token and create session cookie
[**sessionLogout**](SessionEndpointsApi.md#sessionlogout) | **POST** /api/session/logout | Logout user and delete session cookie
[**sessionLogoutEverywhere**](SessionEndpointsApi.md#sessionlogouteverywhere) | **POST** /api/session/logout-everywhere | Logout user everywhere and delete session cookie

# **sessionLogin**
> sessionLogin()

Login user with firebase token and create session cookie

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Swagger\Client\Api\SessionEndpointsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);

try {
    $apiInstance->sessionLogin();
} catch (Exception $e) {
    echo 'Exception when calling SessionEndpointsApi->sessionLogin: ', $e->getMessage(), PHP_EOL;
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

# **sessionLogout**
> sessionLogout()

Logout user and delete session cookie

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Swagger\Client\Api\SessionEndpointsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);

try {
    $apiInstance->sessionLogout();
} catch (Exception $e) {
    echo 'Exception when calling SessionEndpointsApi->sessionLogout: ', $e->getMessage(), PHP_EOL;
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

# **sessionLogoutEverywhere**
> sessionLogoutEverywhere()

Logout user everywhere and delete session cookie

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Swagger\Client\Api\SessionEndpointsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);

try {
    $apiInstance->sessionLogoutEverywhere();
} catch (Exception $e) {
    echo 'Exception when calling SessionEndpointsApi->sessionLogoutEverywhere: ', $e->getMessage(), PHP_EOL;
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

