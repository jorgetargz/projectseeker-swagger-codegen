/**
 * Project Seeker API
 * Project Seeker API
 *
 * OpenAPI spec version: 1.0
 * Contact: jorgetargz@gmail.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */
package io.swagger.client.apis

import io.swagger.client.models.AssignProjectDTO
import io.swagger.client.models.CreateProjectDTO
import io.swagger.client.models.ErrorDTO
import io.swagger.client.models.ProjectInfoDTO
import io.swagger.client.models.SubmitOfferDTO

import io.swagger.client.infrastructure.*

class ProjectsEndpointsApi(basePath: kotlin.String = "https://project-seeker.duckdns.org:8090") : ApiClient(basePath) {

    /**
     * Assign freelancer
     * 
     * @param body  
     * @return ProjectInfoDTO
     */
    @Suppress("UNCHECKED_CAST")
    fun assignFreelancer(body: AssignProjectDTO): ProjectInfoDTO {
        val localVariableBody: kotlin.Any? = body
        val localVariableConfig = RequestConfig(
                RequestMethod.POST,
                "/api/secured/projects/client/assignFreelancer"
        )
        val response = request<ProjectInfoDTO>(
                localVariableConfig, localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as ProjectInfoDTO
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
    /**
     * Create project
     * 
     * @param body  
     * @return ProjectInfoDTO
     */
    @Suppress("UNCHECKED_CAST")
    fun createProject(body: CreateProjectDTO): ProjectInfoDTO {
        val localVariableBody: kotlin.Any? = body
        val localVariableConfig = RequestConfig(
                RequestMethod.POST,
                "/api/secured/projects/client/createProject"
        )
        val response = request<ProjectInfoDTO>(
                localVariableConfig, localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as ProjectInfoDTO
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
    /**
     * Finish project
     * 
     * @param id  
     * @return ProjectInfoDTO
     */
    @Suppress("UNCHECKED_CAST")
    fun finishProject(id: kotlin.String): ProjectInfoDTO {
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>().apply {
            put("id", listOf(id.toString()))
        }
        val localVariableConfig = RequestConfig(
                RequestMethod.POST,
                "/api/secured/projects/client/finishProject", query = localVariableQuery
        )
        val response = request<ProjectInfoDTO>(
                localVariableConfig
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as ProjectInfoDTO
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
    /**
     * Get the projects I have created that are in progress
     * 
     * @return kotlin.Array<ProjectInfoDTO>
     */
    @Suppress("UNCHECKED_CAST")
    fun getInProgressProjectsByClientId(): kotlin.Array<ProjectInfoDTO> {
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/api/secured/projects/client/getMyInProgressProjects"
        )
        val response = request<kotlin.Array<ProjectInfoDTO>>(
                localVariableConfig
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as kotlin.Array<ProjectInfoDTO>
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
    /**
     * Get all open projects
     * 
     * @return kotlin.Array<ProjectInfoDTO>
     */
    @Suppress("UNCHECKED_CAST")
    fun getOpenProjects(): kotlin.Array<ProjectInfoDTO> {
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/api/secured/projects/openProjects"
        )
        val response = request<kotlin.Array<ProjectInfoDTO>>(
                localVariableConfig
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as kotlin.Array<ProjectInfoDTO>
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
    /**
     * Get the projects I have created that are open
     * 
     * @return kotlin.Array<ProjectInfoDTO>
     */
    @Suppress("UNCHECKED_CAST")
    fun getOpenProjectsByClient(): kotlin.Array<ProjectInfoDTO> {
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/api/secured/projects/client/getMyOpenProjects"
        )
        val response = request<kotlin.Array<ProjectInfoDTO>>(
                localVariableConfig
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as kotlin.Array<ProjectInfoDTO>
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
    /**
     * Get open projects by skills
     * 
     * @param body  
     * @return kotlin.Array<ProjectInfoDTO>
     */
    @Suppress("UNCHECKED_CAST")
    fun getOpenProjectsBySkills(body: kotlin.Array<kotlin.String>): kotlin.Array<ProjectInfoDTO> {
        val localVariableBody: kotlin.Any? = body
        val localVariableConfig = RequestConfig(
                RequestMethod.POST,
                "/api/secured/projects/openProjectsBySkills"
        )
        val response = request<kotlin.Array<ProjectInfoDTO>>(
                localVariableConfig, localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as kotlin.Array<ProjectInfoDTO>
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
    /**
     * Get project info
     * 
     * @param id  
     * @return ProjectInfoDTO
     */
    @Suppress("UNCHECKED_CAST")
    fun getPrjectInfo(id: kotlin.String): ProjectInfoDTO {
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>().apply {
            put("id", listOf(id.toString()))
        }
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/api/secured/projects/projectInfo", query = localVariableQuery
        )
        val response = request<ProjectInfoDTO>(
                localVariableConfig
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as ProjectInfoDTO
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
    /**
     * Get projects assigned to me
     * 
     * @return kotlin.Array<ProjectInfoDTO>
     */
    @Suppress("UNCHECKED_CAST")
    fun getProjectsByAssignedFreelancer(): kotlin.Array<ProjectInfoDTO> {
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/api/secured/projects/freelancer/getProjectsAssignedToMe"
        )
        val response = request<kotlin.Array<ProjectInfoDTO>>(
                localVariableConfig
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as kotlin.Array<ProjectInfoDTO>
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
    /**
     * Get the projects I have created
     * 
     * @return kotlin.Array<ProjectInfoDTO>
     */
    @Suppress("UNCHECKED_CAST")
    fun getProjectsByClient(): kotlin.Array<ProjectInfoDTO> {
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/api/secured/projects/client/myProjects"
        )
        val response = request<kotlin.Array<ProjectInfoDTO>>(
                localVariableConfig
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as kotlin.Array<ProjectInfoDTO>
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
    /**
     * Get projects where I have made an offer
     * 
     * @return kotlin.Array<ProjectInfoDTO>
     */
    @Suppress("UNCHECKED_CAST")
    fun getProjectsByOfferFreelancer(): kotlin.Array<ProjectInfoDTO> {
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/api/secured/projects/freelancer/getProjectsWhereIHaveOffer"
        )
        val response = request<kotlin.Array<ProjectInfoDTO>>(
                localVariableConfig
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as kotlin.Array<ProjectInfoDTO>
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
    /**
     * Submit offer
     * 
     * @param body  
     * @return ProjectInfoDTO
     */
    @Suppress("UNCHECKED_CAST")
    fun submitOffer(body: SubmitOfferDTO): ProjectInfoDTO {
        val localVariableBody: kotlin.Any? = body
        val localVariableConfig = RequestConfig(
                RequestMethod.POST,
                "/api/secured/projects/freelancer/submitOffer"
        )
        val response = request<ProjectInfoDTO>(
                localVariableConfig, localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as ProjectInfoDTO
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
}