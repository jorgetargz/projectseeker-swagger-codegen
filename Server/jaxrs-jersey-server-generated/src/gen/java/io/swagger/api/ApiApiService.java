package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

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

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2023-05-26T20:15:53.324572324Z[GMT]")public abstract class ApiApiService {
    public abstract Response addOrUpdateDeviceFCMToken(AddDeviceDTO body,SecurityContext securityContext) throws NotFoundException;
    public abstract Response assignFreelancer(AssignProjectDTO body,SecurityContext securityContext) throws NotFoundException;
    public abstract Response changeRole(ChangeUserRoleDTO body,SecurityContext securityContext) throws NotFoundException;
    public abstract Response createProject(CreateProjectDTO body,SecurityContext securityContext) throws NotFoundException;
    public abstract Response createUser(CreateUserDTO body,SecurityContext securityContext) throws NotFoundException;
    public abstract Response deleteUser(SecurityContext securityContext) throws NotFoundException;
    public abstract Response disableUser( @NotNull String email,SecurityContext securityContext) throws NotFoundException;
    public abstract Response enableUser( @NotNull String email,SecurityContext securityContext) throws NotFoundException;
    public abstract Response finishProject( @NotNull String id,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getInProgressProjectsByClientId(SecurityContext securityContext) throws NotFoundException;
    public abstract Response getMyProfile(SecurityContext securityContext) throws NotFoundException;
    public abstract Response getOpenProjects(SecurityContext securityContext) throws NotFoundException;
    public abstract Response getOpenProjectsByClient(SecurityContext securityContext) throws NotFoundException;
    public abstract Response getOpenProjectsBySkills(List<String> body,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getPrjectInfo( @NotNull String id,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getProfile( @NotNull String id,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getProjectsByAssignedFreelancer(SecurityContext securityContext) throws NotFoundException;
    public abstract Response getProjectsByClient(SecurityContext securityContext) throws NotFoundException;
    public abstract Response getProjectsByOfferFreelancer(SecurityContext securityContext) throws NotFoundException;
    public abstract Response getUserByEmail( @NotNull String email,SecurityContext securityContext) throws NotFoundException;
    public abstract Response modifyClientProfile(ModifyClientProfileDTO body,SecurityContext securityContext) throws NotFoundException;
    public abstract Response modifyFreelancerProfile(ModifyFreelancerProfileDTO body,SecurityContext securityContext) throws NotFoundException;
    public abstract Response sessionLogin(SecurityContext securityContext) throws NotFoundException;
    public abstract Response sessionLogout(SecurityContext securityContext) throws NotFoundException;
    public abstract Response sessionLogoutEverywhere(SecurityContext securityContext) throws NotFoundException;
    public abstract Response submitOffer(SubmitOfferDTO body,SecurityContext securityContext) throws NotFoundException;
}
