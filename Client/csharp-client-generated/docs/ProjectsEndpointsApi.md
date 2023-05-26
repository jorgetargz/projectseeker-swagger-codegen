# IO.Swagger.Api.ProjectsEndpointsApi

All URIs are relative to *https://project-seeker.duckdns.org:8090*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AssignFreelancer**](ProjectsEndpointsApi.md#assignfreelancer) | **POST** /api/secured/projects/client/assignFreelancer | Assign freelancer
[**CreateProject**](ProjectsEndpointsApi.md#createproject) | **POST** /api/secured/projects/client/createProject | Create project
[**FinishProject**](ProjectsEndpointsApi.md#finishproject) | **POST** /api/secured/projects/client/finishProject | Finish project
[**GetInProgressProjectsByClientId**](ProjectsEndpointsApi.md#getinprogressprojectsbyclientid) | **GET** /api/secured/projects/client/getMyInProgressProjects | Get the projects I have created that are in progress
[**GetOpenProjects**](ProjectsEndpointsApi.md#getopenprojects) | **GET** /api/secured/projects/openProjects | Get all open projects
[**GetOpenProjectsByClient**](ProjectsEndpointsApi.md#getopenprojectsbyclient) | **GET** /api/secured/projects/client/getMyOpenProjects | Get the projects I have created that are open
[**GetOpenProjectsBySkills**](ProjectsEndpointsApi.md#getopenprojectsbyskills) | **POST** /api/secured/projects/openProjectsBySkills | Get open projects by skills
[**GetPrjectInfo**](ProjectsEndpointsApi.md#getprjectinfo) | **GET** /api/secured/projects/projectInfo | Get project info
[**GetProjectsByAssignedFreelancer**](ProjectsEndpointsApi.md#getprojectsbyassignedfreelancer) | **GET** /api/secured/projects/freelancer/getProjectsAssignedToMe | Get projects assigned to me
[**GetProjectsByClient**](ProjectsEndpointsApi.md#getprojectsbyclient) | **GET** /api/secured/projects/client/myProjects | Get the projects I have created
[**GetProjectsByOfferFreelancer**](ProjectsEndpointsApi.md#getprojectsbyofferfreelancer) | **GET** /api/secured/projects/freelancer/getProjectsWhereIHaveOffer | Get projects where I have made an offer
[**SubmitOffer**](ProjectsEndpointsApi.md#submitoffer) | **POST** /api/secured/projects/freelancer/submitOffer | Submit offer

<a name="assignfreelancer"></a>
# **AssignFreelancer**
> ProjectInfoDTO AssignFreelancer (AssignProjectDTO body)

Assign freelancer

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class AssignFreelancerExample
    {
        public void main()
        {
            var apiInstance = new ProjectsEndpointsApi();
            var body = new AssignProjectDTO(); // AssignProjectDTO | 

            try
            {
                // Assign freelancer
                ProjectInfoDTO result = apiInstance.AssignFreelancer(body);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ProjectsEndpointsApi.AssignFreelancer: " + e.Message );
            }
        }
    }
}
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
<a name="createproject"></a>
# **CreateProject**
> ProjectInfoDTO CreateProject (CreateProjectDTO body)

Create project

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class CreateProjectExample
    {
        public void main()
        {
            var apiInstance = new ProjectsEndpointsApi();
            var body = new CreateProjectDTO(); // CreateProjectDTO | 

            try
            {
                // Create project
                ProjectInfoDTO result = apiInstance.CreateProject(body);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ProjectsEndpointsApi.CreateProject: " + e.Message );
            }
        }
    }
}
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
<a name="finishproject"></a>
# **FinishProject**
> ProjectInfoDTO FinishProject (string id)

Finish project

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class FinishProjectExample
    {
        public void main()
        {
            var apiInstance = new ProjectsEndpointsApi();
            var id = id_example;  // string | 

            try
            {
                // Finish project
                ProjectInfoDTO result = apiInstance.FinishProject(id);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ProjectsEndpointsApi.FinishProject: " + e.Message );
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

[**ProjectInfoDTO**](ProjectInfoDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="getinprogressprojectsbyclientid"></a>
# **GetInProgressProjectsByClientId**
> List<ProjectInfoDTO> GetInProgressProjectsByClientId ()

Get the projects I have created that are in progress

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class GetInProgressProjectsByClientIdExample
    {
        public void main()
        {
            var apiInstance = new ProjectsEndpointsApi();

            try
            {
                // Get the projects I have created that are in progress
                List&lt;ProjectInfoDTO&gt; result = apiInstance.GetInProgressProjectsByClientId();
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ProjectsEndpointsApi.GetInProgressProjectsByClientId: " + e.Message );
            }
        }
    }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List<ProjectInfoDTO>**](ProjectInfoDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="getopenprojects"></a>
# **GetOpenProjects**
> List<ProjectInfoDTO> GetOpenProjects ()

Get all open projects

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class GetOpenProjectsExample
    {
        public void main()
        {
            var apiInstance = new ProjectsEndpointsApi();

            try
            {
                // Get all open projects
                List&lt;ProjectInfoDTO&gt; result = apiInstance.GetOpenProjects();
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ProjectsEndpointsApi.GetOpenProjects: " + e.Message );
            }
        }
    }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List<ProjectInfoDTO>**](ProjectInfoDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="getopenprojectsbyclient"></a>
# **GetOpenProjectsByClient**
> List<ProjectInfoDTO> GetOpenProjectsByClient ()

Get the projects I have created that are open

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class GetOpenProjectsByClientExample
    {
        public void main()
        {
            var apiInstance = new ProjectsEndpointsApi();

            try
            {
                // Get the projects I have created that are open
                List&lt;ProjectInfoDTO&gt; result = apiInstance.GetOpenProjectsByClient();
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ProjectsEndpointsApi.GetOpenProjectsByClient: " + e.Message );
            }
        }
    }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List<ProjectInfoDTO>**](ProjectInfoDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="getopenprojectsbyskills"></a>
# **GetOpenProjectsBySkills**
> List<ProjectInfoDTO> GetOpenProjectsBySkills (List<string> body)

Get open projects by skills

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class GetOpenProjectsBySkillsExample
    {
        public void main()
        {
            var apiInstance = new ProjectsEndpointsApi();
            var body = new List<string>(); // List<string> | 

            try
            {
                // Get open projects by skills
                List&lt;ProjectInfoDTO&gt; result = apiInstance.GetOpenProjectsBySkills(body);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ProjectsEndpointsApi.GetOpenProjectsBySkills: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;string&gt;**](string.md)|  | 

### Return type

[**List<ProjectInfoDTO>**](ProjectInfoDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="getprjectinfo"></a>
# **GetPrjectInfo**
> ProjectInfoDTO GetPrjectInfo (string id)

Get project info

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class GetPrjectInfoExample
    {
        public void main()
        {
            var apiInstance = new ProjectsEndpointsApi();
            var id = id_example;  // string | 

            try
            {
                // Get project info
                ProjectInfoDTO result = apiInstance.GetPrjectInfo(id);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ProjectsEndpointsApi.GetPrjectInfo: " + e.Message );
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

[**ProjectInfoDTO**](ProjectInfoDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="getprojectsbyassignedfreelancer"></a>
# **GetProjectsByAssignedFreelancer**
> List<ProjectInfoDTO> GetProjectsByAssignedFreelancer ()

Get projects assigned to me

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class GetProjectsByAssignedFreelancerExample
    {
        public void main()
        {
            var apiInstance = new ProjectsEndpointsApi();

            try
            {
                // Get projects assigned to me
                List&lt;ProjectInfoDTO&gt; result = apiInstance.GetProjectsByAssignedFreelancer();
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ProjectsEndpointsApi.GetProjectsByAssignedFreelancer: " + e.Message );
            }
        }
    }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List<ProjectInfoDTO>**](ProjectInfoDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="getprojectsbyclient"></a>
# **GetProjectsByClient**
> List<ProjectInfoDTO> GetProjectsByClient ()

Get the projects I have created

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class GetProjectsByClientExample
    {
        public void main()
        {
            var apiInstance = new ProjectsEndpointsApi();

            try
            {
                // Get the projects I have created
                List&lt;ProjectInfoDTO&gt; result = apiInstance.GetProjectsByClient();
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ProjectsEndpointsApi.GetProjectsByClient: " + e.Message );
            }
        }
    }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List<ProjectInfoDTO>**](ProjectInfoDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="getprojectsbyofferfreelancer"></a>
# **GetProjectsByOfferFreelancer**
> List<ProjectInfoDTO> GetProjectsByOfferFreelancer ()

Get projects where I have made an offer

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class GetProjectsByOfferFreelancerExample
    {
        public void main()
        {
            var apiInstance = new ProjectsEndpointsApi();

            try
            {
                // Get projects where I have made an offer
                List&lt;ProjectInfoDTO&gt; result = apiInstance.GetProjectsByOfferFreelancer();
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ProjectsEndpointsApi.GetProjectsByOfferFreelancer: " + e.Message );
            }
        }
    }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List<ProjectInfoDTO>**](ProjectInfoDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="submitoffer"></a>
# **SubmitOffer**
> ProjectInfoDTO SubmitOffer (SubmitOfferDTO body)

Submit offer

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class SubmitOfferExample
    {
        public void main()
        {
            var apiInstance = new ProjectsEndpointsApi();
            var body = new SubmitOfferDTO(); // SubmitOfferDTO | 

            try
            {
                // Submit offer
                ProjectInfoDTO result = apiInstance.SubmitOffer(body);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ProjectsEndpointsApi.SubmitOffer: " + e.Message );
            }
        }
    }
}
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
