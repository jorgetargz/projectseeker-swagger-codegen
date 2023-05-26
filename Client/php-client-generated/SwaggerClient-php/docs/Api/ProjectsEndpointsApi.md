# Swagger\Client\ProjectsEndpointsApi

All URIs are relative to *https://project-seeker.duckdns.org:8090*

Method | HTTP request | Description
------------- | ------------- | -------------
[**assignFreelancer**](ProjectsEndpointsApi.md#assignfreelancer) | **POST** /api/secured/projects/client/assignFreelancer | Assign freelancer
[**createProject**](ProjectsEndpointsApi.md#createproject) | **POST** /api/secured/projects/client/createProject | Create project
[**finishProject**](ProjectsEndpointsApi.md#finishproject) | **POST** /api/secured/projects/client/finishProject | Finish project
[**getInProgressProjectsByClientId**](ProjectsEndpointsApi.md#getinprogressprojectsbyclientid) | **GET** /api/secured/projects/client/getMyInProgressProjects | Get the projects I have created that are in progress
[**getOpenProjects**](ProjectsEndpointsApi.md#getopenprojects) | **GET** /api/secured/projects/openProjects | Get all open projects
[**getOpenProjectsByClient**](ProjectsEndpointsApi.md#getopenprojectsbyclient) | **GET** /api/secured/projects/client/getMyOpenProjects | Get the projects I have created that are open
[**getOpenProjectsBySkills**](ProjectsEndpointsApi.md#getopenprojectsbyskills) | **POST** /api/secured/projects/openProjectsBySkills | Get open projects by skills
[**getPrjectInfo**](ProjectsEndpointsApi.md#getprjectinfo) | **GET** /api/secured/projects/projectInfo | Get project info
[**getProjectsByAssignedFreelancer**](ProjectsEndpointsApi.md#getprojectsbyassignedfreelancer) | **GET** /api/secured/projects/freelancer/getProjectsAssignedToMe | Get projects assigned to me
[**getProjectsByClient**](ProjectsEndpointsApi.md#getprojectsbyclient) | **GET** /api/secured/projects/client/myProjects | Get the projects I have created
[**getProjectsByOfferFreelancer**](ProjectsEndpointsApi.md#getprojectsbyofferfreelancer) | **GET** /api/secured/projects/freelancer/getProjectsWhereIHaveOffer | Get projects where I have made an offer
[**submitOffer**](ProjectsEndpointsApi.md#submitoffer) | **POST** /api/secured/projects/freelancer/submitOffer | Submit offer

# **assignFreelancer**
> \Swagger\Client\Model\ProjectInfoDTO assignFreelancer($body)

Assign freelancer

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Swagger\Client\Api\ProjectsEndpointsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$body = new \Swagger\Client\Model\AssignProjectDTO(); // \Swagger\Client\Model\AssignProjectDTO | 

try {
    $result = $apiInstance->assignFreelancer($body);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ProjectsEndpointsApi->assignFreelancer: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**\Swagger\Client\Model\AssignProjectDTO**](../Model/AssignProjectDTO.md)|  |

### Return type

[**\Swagger\Client\Model\ProjectInfoDTO**](../Model/ProjectInfoDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createProject**
> \Swagger\Client\Model\ProjectInfoDTO createProject($body)

Create project

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Swagger\Client\Api\ProjectsEndpointsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$body = new \Swagger\Client\Model\CreateProjectDTO(); // \Swagger\Client\Model\CreateProjectDTO | 

try {
    $result = $apiInstance->createProject($body);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ProjectsEndpointsApi->createProject: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**\Swagger\Client\Model\CreateProjectDTO**](../Model/CreateProjectDTO.md)|  |

### Return type

[**\Swagger\Client\Model\ProjectInfoDTO**](../Model/ProjectInfoDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **finishProject**
> \Swagger\Client\Model\ProjectInfoDTO finishProject($id)

Finish project

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Swagger\Client\Api\ProjectsEndpointsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$id = "id_example"; // string | 

try {
    $result = $apiInstance->finishProject($id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ProjectsEndpointsApi->finishProject: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **string**|  |

### Return type

[**\Swagger\Client\Model\ProjectInfoDTO**](../Model/ProjectInfoDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getInProgressProjectsByClientId**
> \Swagger\Client\Model\ProjectInfoDTO[] getInProgressProjectsByClientId()

Get the projects I have created that are in progress

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Swagger\Client\Api\ProjectsEndpointsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);

try {
    $result = $apiInstance->getInProgressProjectsByClientId();
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ProjectsEndpointsApi->getInProgressProjectsByClientId: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**\Swagger\Client\Model\ProjectInfoDTO[]**](../Model/ProjectInfoDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getOpenProjects**
> \Swagger\Client\Model\ProjectInfoDTO[] getOpenProjects()

Get all open projects

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Swagger\Client\Api\ProjectsEndpointsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);

try {
    $result = $apiInstance->getOpenProjects();
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ProjectsEndpointsApi->getOpenProjects: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**\Swagger\Client\Model\ProjectInfoDTO[]**](../Model/ProjectInfoDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getOpenProjectsByClient**
> \Swagger\Client\Model\ProjectInfoDTO[] getOpenProjectsByClient()

Get the projects I have created that are open

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Swagger\Client\Api\ProjectsEndpointsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);

try {
    $result = $apiInstance->getOpenProjectsByClient();
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ProjectsEndpointsApi->getOpenProjectsByClient: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**\Swagger\Client\Model\ProjectInfoDTO[]**](../Model/ProjectInfoDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getOpenProjectsBySkills**
> \Swagger\Client\Model\ProjectInfoDTO[] getOpenProjectsBySkills($body)

Get open projects by skills

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Swagger\Client\Api\ProjectsEndpointsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$body = array("body_example"); // string[] | 

try {
    $result = $apiInstance->getOpenProjectsBySkills($body);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ProjectsEndpointsApi->getOpenProjectsBySkills: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**string[]**](../Model/string.md)|  |

### Return type

[**\Swagger\Client\Model\ProjectInfoDTO[]**](../Model/ProjectInfoDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getPrjectInfo**
> \Swagger\Client\Model\ProjectInfoDTO getPrjectInfo($id)

Get project info

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Swagger\Client\Api\ProjectsEndpointsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$id = "id_example"; // string | 

try {
    $result = $apiInstance->getPrjectInfo($id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ProjectsEndpointsApi->getPrjectInfo: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **string**|  |

### Return type

[**\Swagger\Client\Model\ProjectInfoDTO**](../Model/ProjectInfoDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getProjectsByAssignedFreelancer**
> \Swagger\Client\Model\ProjectInfoDTO[] getProjectsByAssignedFreelancer()

Get projects assigned to me

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Swagger\Client\Api\ProjectsEndpointsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);

try {
    $result = $apiInstance->getProjectsByAssignedFreelancer();
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ProjectsEndpointsApi->getProjectsByAssignedFreelancer: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**\Swagger\Client\Model\ProjectInfoDTO[]**](../Model/ProjectInfoDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getProjectsByClient**
> \Swagger\Client\Model\ProjectInfoDTO[] getProjectsByClient()

Get the projects I have created

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Swagger\Client\Api\ProjectsEndpointsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);

try {
    $result = $apiInstance->getProjectsByClient();
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ProjectsEndpointsApi->getProjectsByClient: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**\Swagger\Client\Model\ProjectInfoDTO[]**](../Model/ProjectInfoDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getProjectsByOfferFreelancer**
> \Swagger\Client\Model\ProjectInfoDTO[] getProjectsByOfferFreelancer()

Get projects where I have made an offer

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Swagger\Client\Api\ProjectsEndpointsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);

try {
    $result = $apiInstance->getProjectsByOfferFreelancer();
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ProjectsEndpointsApi->getProjectsByOfferFreelancer: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**\Swagger\Client\Model\ProjectInfoDTO[]**](../Model/ProjectInfoDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **submitOffer**
> \Swagger\Client\Model\ProjectInfoDTO submitOffer($body)

Submit offer

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Swagger\Client\Api\ProjectsEndpointsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$body = new \Swagger\Client\Model\SubmitOfferDTO(); // \Swagger\Client\Model\SubmitOfferDTO | 

try {
    $result = $apiInstance->submitOffer($body);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ProjectsEndpointsApi->submitOffer: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**\Swagger\Client\Model\SubmitOfferDTO**](../Model/SubmitOfferDTO.md)|  |

### Return type

[**\Swagger\Client\Model\ProjectInfoDTO**](../Model/ProjectInfoDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

