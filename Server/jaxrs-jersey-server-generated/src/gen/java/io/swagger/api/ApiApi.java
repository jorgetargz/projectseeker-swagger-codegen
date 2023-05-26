package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.ApiApiService;
import io.swagger.api.factories.ApiApiServiceFactory;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

import io.swagger.model.AddDeviceDTO;
import io.swagger.model.AssignProjectDTO;
import io.swagger.model.ChangeUserRoleDTO;
import io.swagger.model.CreateProjectDTO;
import io.swagger.model.CreateUserDTO;
import io.swagger.model.ErrorDTO;
import io.swagger.model.ModifyClientProfileDTO;
import io.swagger.model.ModifyFreelancerProfileDTO;
import io.swagger.model.ProfileDTO;
import io.swagger.model.ProjectInfoDTO;
import io.swagger.model.SubmitOfferDTO;

import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;


@Path("/api")


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2023-05-26T20:15:53.324572324Z[GMT]")public class ApiApi  {
   private final ApiApiService delegate;

   public ApiApi(@Context ServletConfig servletContext) {
      ApiApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("ApiApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (ApiApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = ApiApiServiceFactory.getApiApi();
      }

      this.delegate = delegate;
   }

    @POST
    @Path("/secured/users/addDevice")
    @Consumes({ "application/json" })
    @Produces({ "*/*" })
    @Operation(summary = "Add device for notifications", description = "", tags={ "Users Endpoints" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK"),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "*/*", schema = @Schema(implementation = ErrorDTO.class))),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(mediaType = "*/*", schema = @Schema(implementation = ErrorDTO.class))),
        
        @ApiResponse(responseCode = "404", description = "Not Found", content = @Content(mediaType = "*/*", schema = @Schema(implementation = ErrorDTO.class))) })
    public Response addOrUpdateDeviceFCMToken(@Parameter(in = ParameterIn.DEFAULT, description = "" ,required=true) AddDeviceDTO body

,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.addOrUpdateDeviceFCMToken(body,securityContext);
    }
    @POST
    @Path("/secured/projects/client/assignFreelancer")
    @Consumes({ "application/json" })
    @Produces({ "*/*" })
    @Operation(summary = "Assign freelancer", description = "", tags={ "Projects Endpoints" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "*/*", schema = @Schema(implementation = ProjectInfoDTO.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "*/*", schema = @Schema(implementation = ErrorDTO.class))),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(mediaType = "*/*", schema = @Schema(implementation = ErrorDTO.class))),
        
        @ApiResponse(responseCode = "404", description = "Not Found", content = @Content(mediaType = "*/*", schema = @Schema(implementation = ErrorDTO.class))) })
    public Response assignFreelancer(@Parameter(in = ParameterIn.DEFAULT, description = "" ,required=true) AssignProjectDTO body

,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.assignFreelancer(body,securityContext);
    }
    @PUT
    @Path("/secured/users/changeRole")
    @Consumes({ "application/json" })
    @Produces({ "*/*" })
    @Operation(summary = "Change user role", description = "", tags={ "Users Endpoints" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "*/*", schema = @Schema(implementation = ProfileDTO.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "*/*", schema = @Schema(implementation = ErrorDTO.class))),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(mediaType = "*/*", schema = @Schema(implementation = ErrorDTO.class))),
        
        @ApiResponse(responseCode = "404", description = "Not Found", content = @Content(mediaType = "*/*", schema = @Schema(implementation = ErrorDTO.class))) })
    public Response changeRole(@Parameter(in = ParameterIn.DEFAULT, description = "" ,required=true) ChangeUserRoleDTO body

,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.changeRole(body,securityContext);
    }
    @POST
    @Path("/secured/projects/client/createProject")
    @Consumes({ "application/json" })
    @Produces({ "*/*" })
    @Operation(summary = "Create project", description = "", tags={ "Projects Endpoints" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "*/*", schema = @Schema(implementation = ProjectInfoDTO.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "*/*", schema = @Schema(implementation = ErrorDTO.class))),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(mediaType = "*/*", schema = @Schema(implementation = ErrorDTO.class))),
        
        @ApiResponse(responseCode = "404", description = "Not Found", content = @Content(mediaType = "*/*", schema = @Schema(implementation = ErrorDTO.class))) })
    public Response createProject(@Parameter(in = ParameterIn.DEFAULT, description = "" ,required=true) CreateProjectDTO body

,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createProject(body,securityContext);
    }
    @POST
    @Path("/secured/users/createUser")
    @Consumes({ "application/json" })
    @Produces({ "*/*" })
    @Operation(summary = "Create user", description = "", tags={ "Users Endpoints" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "*/*", schema = @Schema(implementation = ProfileDTO.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "*/*", schema = @Schema(implementation = ErrorDTO.class))),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(mediaType = "*/*", schema = @Schema(implementation = ErrorDTO.class))),
        
        @ApiResponse(responseCode = "404", description = "Not Found", content = @Content(mediaType = "*/*", schema = @Schema(implementation = ErrorDTO.class))) })
    public Response createUser(@Parameter(in = ParameterIn.DEFAULT, description = "" ,required=true) CreateUserDTO body

,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createUser(body,securityContext);
    }
    @DELETE
    @Path("/secured/users/deleteUser")
    
    @Produces({ "*/*" })
    @Operation(summary = "Delete user", description = "", tags={ "Users Endpoints" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK"),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "*/*", schema = @Schema(implementation = ErrorDTO.class))),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(mediaType = "*/*", schema = @Schema(implementation = ErrorDTO.class))),
        
        @ApiResponse(responseCode = "404", description = "Not Found", content = @Content(mediaType = "*/*", schema = @Schema(implementation = ErrorDTO.class))) })
    public Response deleteUser(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteUser(securityContext);
    }
    @PUT
    @Path("/secured/super/disable-user")
    
    @Produces({ "*/*" })
    @Operation(summary = "Disable user", description = "", tags={ "Super Admin Endpoints" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK"),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "*/*", schema = @Schema(implementation = ErrorDTO.class))),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(mediaType = "*/*", schema = @Schema(implementation = ErrorDTO.class))),
        
        @ApiResponse(responseCode = "404", description = "Not Found", content = @Content(mediaType = "*/*", schema = @Schema(implementation = ErrorDTO.class))) })
    public Response disableUser(@Parameter(in = ParameterIn.QUERY, description = "",required=true) @QueryParam("email") String email
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.disableUser(email,securityContext);
    }
    @PUT
    @Path("/secured/super/enable-user")
    
    @Produces({ "*/*" })
    @Operation(summary = "Enable user", description = "", tags={ "Super Admin Endpoints" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK"),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "*/*", schema = @Schema(implementation = ErrorDTO.class))),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(mediaType = "*/*", schema = @Schema(implementation = ErrorDTO.class))),
        
        @ApiResponse(responseCode = "404", description = "Not Found", content = @Content(mediaType = "*/*", schema = @Schema(implementation = ErrorDTO.class))) })
    public Response enableUser(@Parameter(in = ParameterIn.QUERY, description = "",required=true) @QueryParam("email") String email
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.enableUser(email,securityContext);
    }
    @POST
    @Path("/secured/projects/client/finishProject")
    
    @Produces({ "*/*" })
    @Operation(summary = "Finish project", description = "", tags={ "Projects Endpoints" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "*/*", schema = @Schema(implementation = ProjectInfoDTO.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "*/*", schema = @Schema(implementation = ErrorDTO.class))),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(mediaType = "*/*", schema = @Schema(implementation = ErrorDTO.class))),
        
        @ApiResponse(responseCode = "404", description = "Not Found", content = @Content(mediaType = "*/*", schema = @Schema(implementation = ErrorDTO.class))) })
    public Response finishProject(@Parameter(in = ParameterIn.QUERY, description = "",required=true) @QueryParam("id") String id
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.finishProject(id,securityContext);
    }
    @GET
    @Path("/secured/projects/client/getMyInProgressProjects")
    
    @Produces({ "*/*" })
    @Operation(summary = "Get the projects I have created that are in progress", description = "", tags={ "Projects Endpoints" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "*/*", array = @ArraySchema(schema = @Schema(implementation = ProjectInfoDTO.class)))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "*/*", schema = @Schema(implementation = ErrorDTO.class))),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(mediaType = "*/*", schema = @Schema(implementation = ErrorDTO.class))),
        
        @ApiResponse(responseCode = "404", description = "Not Found", content = @Content(mediaType = "*/*", schema = @Schema(implementation = ErrorDTO.class))) })
    public Response getInProgressProjectsByClientId(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getInProgressProjectsByClientId(securityContext);
    }
    @GET
    @Path("/secured/users/myProfile")
    
    @Produces({ "*/*" })
    @Operation(summary = "Get my profile", description = "", tags={ "Users Endpoints" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "*/*", schema = @Schema(implementation = ProfileDTO.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "*/*", schema = @Schema(implementation = ErrorDTO.class))),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(mediaType = "*/*", schema = @Schema(implementation = ErrorDTO.class))),
        
        @ApiResponse(responseCode = "404", description = "Not Found", content = @Content(mediaType = "*/*", schema = @Schema(implementation = ErrorDTO.class))) })
    public Response getMyProfile(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getMyProfile(securityContext);
    }
    @GET
    @Path("/secured/projects/openProjects")
    
    @Produces({ "*/*" })
    @Operation(summary = "Get all open projects", description = "", tags={ "Projects Endpoints" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "*/*", array = @ArraySchema(schema = @Schema(implementation = ProjectInfoDTO.class)))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "*/*", schema = @Schema(implementation = ErrorDTO.class))),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(mediaType = "*/*", schema = @Schema(implementation = ErrorDTO.class))),
        
        @ApiResponse(responseCode = "404", description = "Not Found", content = @Content(mediaType = "*/*", schema = @Schema(implementation = ErrorDTO.class))) })
    public Response getOpenProjects(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getOpenProjects(securityContext);
    }
    @GET
    @Path("/secured/projects/client/getMyOpenProjects")
    
    @Produces({ "*/*" })
    @Operation(summary = "Get the projects I have created that are open", description = "", tags={ "Projects Endpoints" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "*/*", array = @ArraySchema(schema = @Schema(implementation = ProjectInfoDTO.class)))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "*/*", schema = @Schema(implementation = ErrorDTO.class))),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(mediaType = "*/*", schema = @Schema(implementation = ErrorDTO.class))),
        
        @ApiResponse(responseCode = "404", description = "Not Found", content = @Content(mediaType = "*/*", schema = @Schema(implementation = ErrorDTO.class))) })
    public Response getOpenProjectsByClient(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getOpenProjectsByClient(securityContext);
    }
    @POST
    @Path("/secured/projects/openProjectsBySkills")
    @Consumes({ "application/json" })
    @Produces({ "*/*" })
    @Operation(summary = "Get open projects by skills", description = "", tags={ "Projects Endpoints" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "*/*", array = @ArraySchema(schema = @Schema(implementation = ProjectInfoDTO.class)))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "*/*", schema = @Schema(implementation = ErrorDTO.class))),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(mediaType = "*/*", schema = @Schema(implementation = ErrorDTO.class))),
        
        @ApiResponse(responseCode = "404", description = "Not Found", content = @Content(mediaType = "*/*", schema = @Schema(implementation = ErrorDTO.class))) })
    public Response getOpenProjectsBySkills(@Parameter(in = ParameterIn.DEFAULT, description = "" ,required=true) List<String> body

,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getOpenProjectsBySkills(body,securityContext);
    }
    @GET
    @Path("/secured/projects/projectInfo")
    
    @Produces({ "*/*" })
    @Operation(summary = "Get project info", description = "", tags={ "Projects Endpoints" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "*/*", schema = @Schema(implementation = ProjectInfoDTO.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "*/*", schema = @Schema(implementation = ErrorDTO.class))),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(mediaType = "*/*", schema = @Schema(implementation = ErrorDTO.class))),
        
        @ApiResponse(responseCode = "404", description = "Not Found", content = @Content(mediaType = "*/*", schema = @Schema(implementation = ErrorDTO.class))) })
    public Response getPrjectInfo(@Parameter(in = ParameterIn.QUERY, description = "",required=true) @QueryParam("id") String id
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getPrjectInfo(id,securityContext);
    }
    @GET
    @Path("/secured/users/profile")
    
    @Produces({ "*/*" })
    @Operation(summary = "Get profile", description = "", tags={ "Users Endpoints" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "*/*", schema = @Schema(implementation = ProfileDTO.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "*/*", schema = @Schema(implementation = ErrorDTO.class))),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(mediaType = "*/*", schema = @Schema(implementation = ErrorDTO.class))),
        
        @ApiResponse(responseCode = "404", description = "Not Found", content = @Content(mediaType = "*/*", schema = @Schema(implementation = ErrorDTO.class))) })
    public Response getProfile(@Parameter(in = ParameterIn.QUERY, description = "",required=true) @QueryParam("id") String id
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getProfile(id,securityContext);
    }
    @GET
    @Path("/secured/projects/freelancer/getProjectsAssignedToMe")
    
    @Produces({ "*/*" })
    @Operation(summary = "Get projects assigned to me", description = "", tags={ "Projects Endpoints" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "*/*", array = @ArraySchema(schema = @Schema(implementation = ProjectInfoDTO.class)))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "*/*", schema = @Schema(implementation = ErrorDTO.class))),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(mediaType = "*/*", schema = @Schema(implementation = ErrorDTO.class))),
        
        @ApiResponse(responseCode = "404", description = "Not Found", content = @Content(mediaType = "*/*", schema = @Schema(implementation = ErrorDTO.class))) })
    public Response getProjectsByAssignedFreelancer(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getProjectsByAssignedFreelancer(securityContext);
    }
    @GET
    @Path("/secured/projects/client/myProjects")
    
    @Produces({ "*/*" })
    @Operation(summary = "Get the projects I have created", description = "", tags={ "Projects Endpoints" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "*/*", array = @ArraySchema(schema = @Schema(implementation = ProjectInfoDTO.class)))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "*/*", schema = @Schema(implementation = ErrorDTO.class))),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(mediaType = "*/*", schema = @Schema(implementation = ErrorDTO.class))),
        
        @ApiResponse(responseCode = "404", description = "Not Found", content = @Content(mediaType = "*/*", schema = @Schema(implementation = ErrorDTO.class))) })
    public Response getProjectsByClient(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getProjectsByClient(securityContext);
    }
    @GET
    @Path("/secured/projects/freelancer/getProjectsWhereIHaveOffer")
    
    @Produces({ "*/*" })
    @Operation(summary = "Get projects where I have made an offer", description = "", tags={ "Projects Endpoints" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "*/*", array = @ArraySchema(schema = @Schema(implementation = ProjectInfoDTO.class)))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "*/*", schema = @Schema(implementation = ErrorDTO.class))),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(mediaType = "*/*", schema = @Schema(implementation = ErrorDTO.class))),
        
        @ApiResponse(responseCode = "404", description = "Not Found", content = @Content(mediaType = "*/*", schema = @Schema(implementation = ErrorDTO.class))) })
    public Response getProjectsByOfferFreelancer(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getProjectsByOfferFreelancer(securityContext);
    }
    @GET
    @Path("/secured/super/user")
    
    @Produces({ "*/*" })
    @Operation(summary = "Get user by email", description = "", tags={ "Super Admin Endpoints" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "*/*", schema = @Schema(implementation = ProfileDTO.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "*/*", schema = @Schema(implementation = ErrorDTO.class))),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(mediaType = "*/*", schema = @Schema(implementation = ErrorDTO.class))),
        
        @ApiResponse(responseCode = "404", description = "Not Found", content = @Content(mediaType = "*/*", schema = @Schema(implementation = ErrorDTO.class))) })
    public Response getUserByEmail(@Parameter(in = ParameterIn.QUERY, description = "",required=true) @QueryParam("email") String email
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getUserByEmail(email,securityContext);
    }
    @PUT
    @Path("/secured/users/modifyClientProfile")
    @Consumes({ "application/json" })
    @Produces({ "*/*" })
    @Operation(summary = "Modify client profile", description = "", tags={ "Users Endpoints" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "*/*", schema = @Schema(implementation = ProfileDTO.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "*/*", schema = @Schema(implementation = ErrorDTO.class))),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(mediaType = "*/*", schema = @Schema(implementation = ErrorDTO.class))),
        
        @ApiResponse(responseCode = "404", description = "Not Found", content = @Content(mediaType = "*/*", schema = @Schema(implementation = ErrorDTO.class))) })
    public Response modifyClientProfile(@Parameter(in = ParameterIn.DEFAULT, description = "" ,required=true) ModifyClientProfileDTO body

,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.modifyClientProfile(body,securityContext);
    }
    @PUT
    @Path("/secured/users/modifyFreelancerProfile")
    @Consumes({ "application/json" })
    @Produces({ "*/*" })
    @Operation(summary = "Modify freelancer profile", description = "", tags={ "Users Endpoints" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "*/*", schema = @Schema(implementation = ProfileDTO.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "*/*", schema = @Schema(implementation = ErrorDTO.class))),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(mediaType = "*/*", schema = @Schema(implementation = ErrorDTO.class))),
        
        @ApiResponse(responseCode = "404", description = "Not Found", content = @Content(mediaType = "*/*", schema = @Schema(implementation = ErrorDTO.class))) })
    public Response modifyFreelancerProfile(@Parameter(in = ParameterIn.DEFAULT, description = "" ,required=true) ModifyFreelancerProfileDTO body

,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.modifyFreelancerProfile(body,securityContext);
    }
    @POST
    @Path("/session/login")
    
    @Produces({ "*/*" })
    @Operation(summary = "Login user with firebase token and create session cookie", description = "", tags={ "Session Endpoints" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK"),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "*/*", schema = @Schema(implementation = ErrorDTO.class))),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(mediaType = "*/*", schema = @Schema(implementation = ErrorDTO.class))),
        
        @ApiResponse(responseCode = "404", description = "Not Found", content = @Content(mediaType = "*/*", schema = @Schema(implementation = ErrorDTO.class))) })
    public Response sessionLogin(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.sessionLogin(securityContext);
    }
    @POST
    @Path("/session/logout")
    
    @Produces({ "*/*" })
    @Operation(summary = "Logout user and delete session cookie", description = "", tags={ "Session Endpoints" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK"),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "*/*", schema = @Schema(implementation = ErrorDTO.class))),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(mediaType = "*/*", schema = @Schema(implementation = ErrorDTO.class))),
        
        @ApiResponse(responseCode = "404", description = "Not Found", content = @Content(mediaType = "*/*", schema = @Schema(implementation = ErrorDTO.class))) })
    public Response sessionLogout(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.sessionLogout(securityContext);
    }
    @POST
    @Path("/session/logout-everywhere")
    
    @Produces({ "*/*" })
    @Operation(summary = "Logout user everywhere and delete session cookie", description = "", tags={ "Session Endpoints" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK"),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "*/*", schema = @Schema(implementation = ErrorDTO.class))),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(mediaType = "*/*", schema = @Schema(implementation = ErrorDTO.class))),
        
        @ApiResponse(responseCode = "404", description = "Not Found", content = @Content(mediaType = "*/*", schema = @Schema(implementation = ErrorDTO.class))) })
    public Response sessionLogoutEverywhere(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.sessionLogoutEverywhere(securityContext);
    }
    @POST
    @Path("/secured/projects/freelancer/submitOffer")
    @Consumes({ "application/json" })
    @Produces({ "*/*" })
    @Operation(summary = "Submit offer", description = "", tags={ "Projects Endpoints" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "*/*", schema = @Schema(implementation = ProjectInfoDTO.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "*/*", schema = @Schema(implementation = ErrorDTO.class))),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(mediaType = "*/*", schema = @Schema(implementation = ErrorDTO.class))),
        
        @ApiResponse(responseCode = "404", description = "Not Found", content = @Content(mediaType = "*/*", schema = @Schema(implementation = ErrorDTO.class))) })
    public Response submitOffer(@Parameter(in = ParameterIn.DEFAULT, description = "" ,required=true) SubmitOfferDTO body

,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.submitOffer(body,securityContext);
    }
}
