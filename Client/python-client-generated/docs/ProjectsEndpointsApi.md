# swagger_client.ProjectsEndpointsApi

All URIs are relative to *https://project-seeker.duckdns.org:8090*

Method | HTTP request | Description
------------- | ------------- | -------------
[**assign_freelancer**](ProjectsEndpointsApi.md#assign_freelancer) | **POST** /api/secured/projects/client/assignFreelancer | Assign freelancer
[**create_project**](ProjectsEndpointsApi.md#create_project) | **POST** /api/secured/projects/client/createProject | Create project
[**finish_project**](ProjectsEndpointsApi.md#finish_project) | **POST** /api/secured/projects/client/finishProject | Finish project
[**get_in_progress_projects_by_client_id**](ProjectsEndpointsApi.md#get_in_progress_projects_by_client_id) | **GET** /api/secured/projects/client/getMyInProgressProjects | Get the projects I have created that are in progress
[**get_open_projects**](ProjectsEndpointsApi.md#get_open_projects) | **GET** /api/secured/projects/openProjects | Get all open projects
[**get_open_projects_by_client**](ProjectsEndpointsApi.md#get_open_projects_by_client) | **GET** /api/secured/projects/client/getMyOpenProjects | Get the projects I have created that are open
[**get_open_projects_by_skills**](ProjectsEndpointsApi.md#get_open_projects_by_skills) | **POST** /api/secured/projects/openProjectsBySkills | Get open projects by skills
[**get_prject_info**](ProjectsEndpointsApi.md#get_prject_info) | **GET** /api/secured/projects/projectInfo | Get project info
[**get_projects_by_assigned_freelancer**](ProjectsEndpointsApi.md#get_projects_by_assigned_freelancer) | **GET** /api/secured/projects/freelancer/getProjectsAssignedToMe | Get projects assigned to me
[**get_projects_by_client**](ProjectsEndpointsApi.md#get_projects_by_client) | **GET** /api/secured/projects/client/myProjects | Get the projects I have created
[**get_projects_by_offer_freelancer**](ProjectsEndpointsApi.md#get_projects_by_offer_freelancer) | **GET** /api/secured/projects/freelancer/getProjectsWhereIHaveOffer | Get projects where I have made an offer
[**submit_offer**](ProjectsEndpointsApi.md#submit_offer) | **POST** /api/secured/projects/freelancer/submitOffer | Submit offer

# **assign_freelancer**
> ProjectInfoDTO assign_freelancer(body)

Assign freelancer

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ProjectsEndpointsApi()
body = swagger_client.AssignProjectDTO() # AssignProjectDTO | 

try:
    # Assign freelancer
    api_response = api_instance.assign_freelancer(body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProjectsEndpointsApi->assign_freelancer: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AssignProjectDTO**](AssignProjectDTO.md)|  | 

### Return type

[**ProjectInfoDTO**](ProjectInfoDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_project**
> ProjectInfoDTO create_project(body)

Create project

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ProjectsEndpointsApi()
body = swagger_client.CreateProjectDTO() # CreateProjectDTO | 

try:
    # Create project
    api_response = api_instance.create_project(body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProjectsEndpointsApi->create_project: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateProjectDTO**](CreateProjectDTO.md)|  | 

### Return type

[**ProjectInfoDTO**](ProjectInfoDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **finish_project**
> ProjectInfoDTO finish_project(id)

Finish project

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ProjectsEndpointsApi()
id = 'id_example' # str | 

try:
    # Finish project
    api_response = api_instance.finish_project(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProjectsEndpointsApi->finish_project: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**|  | 

### Return type

[**ProjectInfoDTO**](ProjectInfoDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_in_progress_projects_by_client_id**
> list[ProjectInfoDTO] get_in_progress_projects_by_client_id()

Get the projects I have created that are in progress

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ProjectsEndpointsApi()

try:
    # Get the projects I have created that are in progress
    api_response = api_instance.get_in_progress_projects_by_client_id()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProjectsEndpointsApi->get_in_progress_projects_by_client_id: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**list[ProjectInfoDTO]**](ProjectInfoDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_open_projects**
> list[ProjectInfoDTO] get_open_projects()

Get all open projects

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ProjectsEndpointsApi()

try:
    # Get all open projects
    api_response = api_instance.get_open_projects()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProjectsEndpointsApi->get_open_projects: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**list[ProjectInfoDTO]**](ProjectInfoDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_open_projects_by_client**
> list[ProjectInfoDTO] get_open_projects_by_client()

Get the projects I have created that are open

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ProjectsEndpointsApi()

try:
    # Get the projects I have created that are open
    api_response = api_instance.get_open_projects_by_client()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProjectsEndpointsApi->get_open_projects_by_client: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**list[ProjectInfoDTO]**](ProjectInfoDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_open_projects_by_skills**
> list[ProjectInfoDTO] get_open_projects_by_skills(body)

Get open projects by skills

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ProjectsEndpointsApi()
body = ['body_example'] # list[str] | 

try:
    # Get open projects by skills
    api_response = api_instance.get_open_projects_by_skills(body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProjectsEndpointsApi->get_open_projects_by_skills: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**list[str]**](str.md)|  | 

### Return type

[**list[ProjectInfoDTO]**](ProjectInfoDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_prject_info**
> ProjectInfoDTO get_prject_info(id)

Get project info

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ProjectsEndpointsApi()
id = 'id_example' # str | 

try:
    # Get project info
    api_response = api_instance.get_prject_info(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProjectsEndpointsApi->get_prject_info: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**|  | 

### Return type

[**ProjectInfoDTO**](ProjectInfoDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_projects_by_assigned_freelancer**
> list[ProjectInfoDTO] get_projects_by_assigned_freelancer()

Get projects assigned to me

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ProjectsEndpointsApi()

try:
    # Get projects assigned to me
    api_response = api_instance.get_projects_by_assigned_freelancer()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProjectsEndpointsApi->get_projects_by_assigned_freelancer: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**list[ProjectInfoDTO]**](ProjectInfoDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_projects_by_client**
> list[ProjectInfoDTO] get_projects_by_client()

Get the projects I have created

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ProjectsEndpointsApi()

try:
    # Get the projects I have created
    api_response = api_instance.get_projects_by_client()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProjectsEndpointsApi->get_projects_by_client: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**list[ProjectInfoDTO]**](ProjectInfoDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_projects_by_offer_freelancer**
> list[ProjectInfoDTO] get_projects_by_offer_freelancer()

Get projects where I have made an offer

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ProjectsEndpointsApi()

try:
    # Get projects where I have made an offer
    api_response = api_instance.get_projects_by_offer_freelancer()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProjectsEndpointsApi->get_projects_by_offer_freelancer: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**list[ProjectInfoDTO]**](ProjectInfoDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **submit_offer**
> ProjectInfoDTO submit_offer(body)

Submit offer

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ProjectsEndpointsApi()
body = swagger_client.SubmitOfferDTO() # SubmitOfferDTO | 

try:
    # Submit offer
    api_response = api_instance.submit_offer(body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProjectsEndpointsApi->submit_offer: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SubmitOfferDTO**](SubmitOfferDTO.md)|  | 

### Return type

[**ProjectInfoDTO**](ProjectInfoDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

