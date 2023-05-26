package io.swagger.api;

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
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-05-26T20:13:25.761825281Z[GMT]")
@RestController
public class ApiApiController implements ApiApi {

    private static final Logger log = LoggerFactory.getLogger(ApiApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ApiApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> addOrUpdateDeviceFCMToken(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody AddDeviceDTO body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ProjectInfoDTO> assignFreelancer(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody AssignProjectDTO body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ProjectInfoDTO>(objectMapper.readValue("{\n  \"offers\" : [ {\n    \"freelancerId\" : \"freelancerId\",\n    \"description\" : \"description\",\n    \"budget\" : 1.4658129805029452,\n    \"status\" : \"status\"\n  }, {\n    \"freelancerId\" : \"freelancerId\",\n    \"description\" : \"description\",\n    \"budget\" : 1.4658129805029452,\n    \"status\" : \"status\"\n  } ],\n  \"clientId\" : \"clientId\",\n  \"deadlineDate\" : \"2000-01-23\",\n  \"description\" : \"description\",\n  \"maxBudget\" : 6.027456183070403,\n  \"realEndDate\" : \"2000-01-23\",\n  \"title\" : \"title\",\n  \"selectedFreelancerId\" : \"selectedFreelancerId\",\n  \"skills\" : [ \"skills\", \"skills\" ],\n  \"id\" : \"id\",\n  \"minBudget\" : 0.8008281904610115,\n  \"startDate\" : \"2000-01-23\",\n  \"status\" : \"status\"\n}", ProjectInfoDTO.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ProjectInfoDTO>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ProjectInfoDTO>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ProfileDTO> changeRole(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody ChangeUserRoleDTO body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ProfileDTO>(objectMapper.readValue("{\n  \"skills\" : [ \"skills\", \"skills\" ],\n  \"firebaseId\" : \"firebaseId\",\n  \"phone\" : \"phone\",\n  \"name\" : \"name\",\n  \"rating\" : 0.8008281904610115,\n  \"description\" : \"description\",\n  \"id\" : \"id\",\n  \"availability\" : \"availability\",\n  \"title\" : \"title\",\n  \"email\" : \"email\",\n  \"activeRole\" : \"activeRole\"\n}", ProfileDTO.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ProfileDTO>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ProfileDTO>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ProjectInfoDTO> createProject(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody CreateProjectDTO body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ProjectInfoDTO>(objectMapper.readValue("{\n  \"offers\" : [ {\n    \"freelancerId\" : \"freelancerId\",\n    \"description\" : \"description\",\n    \"budget\" : 1.4658129805029452,\n    \"status\" : \"status\"\n  }, {\n    \"freelancerId\" : \"freelancerId\",\n    \"description\" : \"description\",\n    \"budget\" : 1.4658129805029452,\n    \"status\" : \"status\"\n  } ],\n  \"clientId\" : \"clientId\",\n  \"deadlineDate\" : \"2000-01-23\",\n  \"description\" : \"description\",\n  \"maxBudget\" : 6.027456183070403,\n  \"realEndDate\" : \"2000-01-23\",\n  \"title\" : \"title\",\n  \"selectedFreelancerId\" : \"selectedFreelancerId\",\n  \"skills\" : [ \"skills\", \"skills\" ],\n  \"id\" : \"id\",\n  \"minBudget\" : 0.8008281904610115,\n  \"startDate\" : \"2000-01-23\",\n  \"status\" : \"status\"\n}", ProjectInfoDTO.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ProjectInfoDTO>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ProjectInfoDTO>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ProfileDTO> createUser(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody CreateUserDTO body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ProfileDTO>(objectMapper.readValue("{\n  \"skills\" : [ \"skills\", \"skills\" ],\n  \"firebaseId\" : \"firebaseId\",\n  \"phone\" : \"phone\",\n  \"name\" : \"name\",\n  \"rating\" : 0.8008281904610115,\n  \"description\" : \"description\",\n  \"id\" : \"id\",\n  \"availability\" : \"availability\",\n  \"title\" : \"title\",\n  \"email\" : \"email\",\n  \"activeRole\" : \"activeRole\"\n}", ProfileDTO.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ProfileDTO>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ProfileDTO>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteUser() {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> disableUser(@NotNull @Parameter(in = ParameterIn.QUERY, description = "" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "email", required = true) String email) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> enableUser(@NotNull @Parameter(in = ParameterIn.QUERY, description = "" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "email", required = true) String email) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ProjectInfoDTO> finishProject(@NotNull @Parameter(in = ParameterIn.QUERY, description = "" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "id", required = true) String id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ProjectInfoDTO>(objectMapper.readValue("{\n  \"offers\" : [ {\n    \"freelancerId\" : \"freelancerId\",\n    \"description\" : \"description\",\n    \"budget\" : 1.4658129805029452,\n    \"status\" : \"status\"\n  }, {\n    \"freelancerId\" : \"freelancerId\",\n    \"description\" : \"description\",\n    \"budget\" : 1.4658129805029452,\n    \"status\" : \"status\"\n  } ],\n  \"clientId\" : \"clientId\",\n  \"deadlineDate\" : \"2000-01-23\",\n  \"description\" : \"description\",\n  \"maxBudget\" : 6.027456183070403,\n  \"realEndDate\" : \"2000-01-23\",\n  \"title\" : \"title\",\n  \"selectedFreelancerId\" : \"selectedFreelancerId\",\n  \"skills\" : [ \"skills\", \"skills\" ],\n  \"id\" : \"id\",\n  \"minBudget\" : 0.8008281904610115,\n  \"startDate\" : \"2000-01-23\",\n  \"status\" : \"status\"\n}", ProjectInfoDTO.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ProjectInfoDTO>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ProjectInfoDTO>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<ProjectInfoDTO>> getInProgressProjectsByClientId() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<ProjectInfoDTO>>(objectMapper.readValue("[ {\n  \"offers\" : [ {\n    \"freelancerId\" : \"freelancerId\",\n    \"description\" : \"description\",\n    \"budget\" : 1.4658129805029452,\n    \"status\" : \"status\"\n  }, {\n    \"freelancerId\" : \"freelancerId\",\n    \"description\" : \"description\",\n    \"budget\" : 1.4658129805029452,\n    \"status\" : \"status\"\n  } ],\n  \"clientId\" : \"clientId\",\n  \"deadlineDate\" : \"2000-01-23\",\n  \"description\" : \"description\",\n  \"maxBudget\" : 6.027456183070403,\n  \"realEndDate\" : \"2000-01-23\",\n  \"title\" : \"title\",\n  \"selectedFreelancerId\" : \"selectedFreelancerId\",\n  \"skills\" : [ \"skills\", \"skills\" ],\n  \"id\" : \"id\",\n  \"minBudget\" : 0.8008281904610115,\n  \"startDate\" : \"2000-01-23\",\n  \"status\" : \"status\"\n}, {\n  \"offers\" : [ {\n    \"freelancerId\" : \"freelancerId\",\n    \"description\" : \"description\",\n    \"budget\" : 1.4658129805029452,\n    \"status\" : \"status\"\n  }, {\n    \"freelancerId\" : \"freelancerId\",\n    \"description\" : \"description\",\n    \"budget\" : 1.4658129805029452,\n    \"status\" : \"status\"\n  } ],\n  \"clientId\" : \"clientId\",\n  \"deadlineDate\" : \"2000-01-23\",\n  \"description\" : \"description\",\n  \"maxBudget\" : 6.027456183070403,\n  \"realEndDate\" : \"2000-01-23\",\n  \"title\" : \"title\",\n  \"selectedFreelancerId\" : \"selectedFreelancerId\",\n  \"skills\" : [ \"skills\", \"skills\" ],\n  \"id\" : \"id\",\n  \"minBudget\" : 0.8008281904610115,\n  \"startDate\" : \"2000-01-23\",\n  \"status\" : \"status\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<ProjectInfoDTO>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<ProjectInfoDTO>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ProfileDTO> getMyProfile() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ProfileDTO>(objectMapper.readValue("{\n  \"skills\" : [ \"skills\", \"skills\" ],\n  \"firebaseId\" : \"firebaseId\",\n  \"phone\" : \"phone\",\n  \"name\" : \"name\",\n  \"rating\" : 0.8008281904610115,\n  \"description\" : \"description\",\n  \"id\" : \"id\",\n  \"availability\" : \"availability\",\n  \"title\" : \"title\",\n  \"email\" : \"email\",\n  \"activeRole\" : \"activeRole\"\n}", ProfileDTO.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ProfileDTO>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ProfileDTO>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<ProjectInfoDTO>> getOpenProjects() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<ProjectInfoDTO>>(objectMapper.readValue("[ {\n  \"offers\" : [ {\n    \"freelancerId\" : \"freelancerId\",\n    \"description\" : \"description\",\n    \"budget\" : 1.4658129805029452,\n    \"status\" : \"status\"\n  }, {\n    \"freelancerId\" : \"freelancerId\",\n    \"description\" : \"description\",\n    \"budget\" : 1.4658129805029452,\n    \"status\" : \"status\"\n  } ],\n  \"clientId\" : \"clientId\",\n  \"deadlineDate\" : \"2000-01-23\",\n  \"description\" : \"description\",\n  \"maxBudget\" : 6.027456183070403,\n  \"realEndDate\" : \"2000-01-23\",\n  \"title\" : \"title\",\n  \"selectedFreelancerId\" : \"selectedFreelancerId\",\n  \"skills\" : [ \"skills\", \"skills\" ],\n  \"id\" : \"id\",\n  \"minBudget\" : 0.8008281904610115,\n  \"startDate\" : \"2000-01-23\",\n  \"status\" : \"status\"\n}, {\n  \"offers\" : [ {\n    \"freelancerId\" : \"freelancerId\",\n    \"description\" : \"description\",\n    \"budget\" : 1.4658129805029452,\n    \"status\" : \"status\"\n  }, {\n    \"freelancerId\" : \"freelancerId\",\n    \"description\" : \"description\",\n    \"budget\" : 1.4658129805029452,\n    \"status\" : \"status\"\n  } ],\n  \"clientId\" : \"clientId\",\n  \"deadlineDate\" : \"2000-01-23\",\n  \"description\" : \"description\",\n  \"maxBudget\" : 6.027456183070403,\n  \"realEndDate\" : \"2000-01-23\",\n  \"title\" : \"title\",\n  \"selectedFreelancerId\" : \"selectedFreelancerId\",\n  \"skills\" : [ \"skills\", \"skills\" ],\n  \"id\" : \"id\",\n  \"minBudget\" : 0.8008281904610115,\n  \"startDate\" : \"2000-01-23\",\n  \"status\" : \"status\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<ProjectInfoDTO>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<ProjectInfoDTO>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<ProjectInfoDTO>> getOpenProjectsByClient() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<ProjectInfoDTO>>(objectMapper.readValue("[ {\n  \"offers\" : [ {\n    \"freelancerId\" : \"freelancerId\",\n    \"description\" : \"description\",\n    \"budget\" : 1.4658129805029452,\n    \"status\" : \"status\"\n  }, {\n    \"freelancerId\" : \"freelancerId\",\n    \"description\" : \"description\",\n    \"budget\" : 1.4658129805029452,\n    \"status\" : \"status\"\n  } ],\n  \"clientId\" : \"clientId\",\n  \"deadlineDate\" : \"2000-01-23\",\n  \"description\" : \"description\",\n  \"maxBudget\" : 6.027456183070403,\n  \"realEndDate\" : \"2000-01-23\",\n  \"title\" : \"title\",\n  \"selectedFreelancerId\" : \"selectedFreelancerId\",\n  \"skills\" : [ \"skills\", \"skills\" ],\n  \"id\" : \"id\",\n  \"minBudget\" : 0.8008281904610115,\n  \"startDate\" : \"2000-01-23\",\n  \"status\" : \"status\"\n}, {\n  \"offers\" : [ {\n    \"freelancerId\" : \"freelancerId\",\n    \"description\" : \"description\",\n    \"budget\" : 1.4658129805029452,\n    \"status\" : \"status\"\n  }, {\n    \"freelancerId\" : \"freelancerId\",\n    \"description\" : \"description\",\n    \"budget\" : 1.4658129805029452,\n    \"status\" : \"status\"\n  } ],\n  \"clientId\" : \"clientId\",\n  \"deadlineDate\" : \"2000-01-23\",\n  \"description\" : \"description\",\n  \"maxBudget\" : 6.027456183070403,\n  \"realEndDate\" : \"2000-01-23\",\n  \"title\" : \"title\",\n  \"selectedFreelancerId\" : \"selectedFreelancerId\",\n  \"skills\" : [ \"skills\", \"skills\" ],\n  \"id\" : \"id\",\n  \"minBudget\" : 0.8008281904610115,\n  \"startDate\" : \"2000-01-23\",\n  \"status\" : \"status\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<ProjectInfoDTO>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<ProjectInfoDTO>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<ProjectInfoDTO>> getOpenProjectsBySkills(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody List<String> body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<ProjectInfoDTO>>(objectMapper.readValue("[ {\n  \"offers\" : [ {\n    \"freelancerId\" : \"freelancerId\",\n    \"description\" : \"description\",\n    \"budget\" : 1.4658129805029452,\n    \"status\" : \"status\"\n  }, {\n    \"freelancerId\" : \"freelancerId\",\n    \"description\" : \"description\",\n    \"budget\" : 1.4658129805029452,\n    \"status\" : \"status\"\n  } ],\n  \"clientId\" : \"clientId\",\n  \"deadlineDate\" : \"2000-01-23\",\n  \"description\" : \"description\",\n  \"maxBudget\" : 6.027456183070403,\n  \"realEndDate\" : \"2000-01-23\",\n  \"title\" : \"title\",\n  \"selectedFreelancerId\" : \"selectedFreelancerId\",\n  \"skills\" : [ \"skills\", \"skills\" ],\n  \"id\" : \"id\",\n  \"minBudget\" : 0.8008281904610115,\n  \"startDate\" : \"2000-01-23\",\n  \"status\" : \"status\"\n}, {\n  \"offers\" : [ {\n    \"freelancerId\" : \"freelancerId\",\n    \"description\" : \"description\",\n    \"budget\" : 1.4658129805029452,\n    \"status\" : \"status\"\n  }, {\n    \"freelancerId\" : \"freelancerId\",\n    \"description\" : \"description\",\n    \"budget\" : 1.4658129805029452,\n    \"status\" : \"status\"\n  } ],\n  \"clientId\" : \"clientId\",\n  \"deadlineDate\" : \"2000-01-23\",\n  \"description\" : \"description\",\n  \"maxBudget\" : 6.027456183070403,\n  \"realEndDate\" : \"2000-01-23\",\n  \"title\" : \"title\",\n  \"selectedFreelancerId\" : \"selectedFreelancerId\",\n  \"skills\" : [ \"skills\", \"skills\" ],\n  \"id\" : \"id\",\n  \"minBudget\" : 0.8008281904610115,\n  \"startDate\" : \"2000-01-23\",\n  \"status\" : \"status\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<ProjectInfoDTO>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<ProjectInfoDTO>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ProjectInfoDTO> getPrjectInfo(@NotNull @Parameter(in = ParameterIn.QUERY, description = "" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "id", required = true) String id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ProjectInfoDTO>(objectMapper.readValue("{\n  \"offers\" : [ {\n    \"freelancerId\" : \"freelancerId\",\n    \"description\" : \"description\",\n    \"budget\" : 1.4658129805029452,\n    \"status\" : \"status\"\n  }, {\n    \"freelancerId\" : \"freelancerId\",\n    \"description\" : \"description\",\n    \"budget\" : 1.4658129805029452,\n    \"status\" : \"status\"\n  } ],\n  \"clientId\" : \"clientId\",\n  \"deadlineDate\" : \"2000-01-23\",\n  \"description\" : \"description\",\n  \"maxBudget\" : 6.027456183070403,\n  \"realEndDate\" : \"2000-01-23\",\n  \"title\" : \"title\",\n  \"selectedFreelancerId\" : \"selectedFreelancerId\",\n  \"skills\" : [ \"skills\", \"skills\" ],\n  \"id\" : \"id\",\n  \"minBudget\" : 0.8008281904610115,\n  \"startDate\" : \"2000-01-23\",\n  \"status\" : \"status\"\n}", ProjectInfoDTO.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ProjectInfoDTO>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ProjectInfoDTO>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ProfileDTO> getProfile(@NotNull @Parameter(in = ParameterIn.QUERY, description = "" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "id", required = true) String id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ProfileDTO>(objectMapper.readValue("{\n  \"skills\" : [ \"skills\", \"skills\" ],\n  \"firebaseId\" : \"firebaseId\",\n  \"phone\" : \"phone\",\n  \"name\" : \"name\",\n  \"rating\" : 0.8008281904610115,\n  \"description\" : \"description\",\n  \"id\" : \"id\",\n  \"availability\" : \"availability\",\n  \"title\" : \"title\",\n  \"email\" : \"email\",\n  \"activeRole\" : \"activeRole\"\n}", ProfileDTO.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ProfileDTO>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ProfileDTO>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<ProjectInfoDTO>> getProjectsByAssignedFreelancer() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<ProjectInfoDTO>>(objectMapper.readValue("[ {\n  \"offers\" : [ {\n    \"freelancerId\" : \"freelancerId\",\n    \"description\" : \"description\",\n    \"budget\" : 1.4658129805029452,\n    \"status\" : \"status\"\n  }, {\n    \"freelancerId\" : \"freelancerId\",\n    \"description\" : \"description\",\n    \"budget\" : 1.4658129805029452,\n    \"status\" : \"status\"\n  } ],\n  \"clientId\" : \"clientId\",\n  \"deadlineDate\" : \"2000-01-23\",\n  \"description\" : \"description\",\n  \"maxBudget\" : 6.027456183070403,\n  \"realEndDate\" : \"2000-01-23\",\n  \"title\" : \"title\",\n  \"selectedFreelancerId\" : \"selectedFreelancerId\",\n  \"skills\" : [ \"skills\", \"skills\" ],\n  \"id\" : \"id\",\n  \"minBudget\" : 0.8008281904610115,\n  \"startDate\" : \"2000-01-23\",\n  \"status\" : \"status\"\n}, {\n  \"offers\" : [ {\n    \"freelancerId\" : \"freelancerId\",\n    \"description\" : \"description\",\n    \"budget\" : 1.4658129805029452,\n    \"status\" : \"status\"\n  }, {\n    \"freelancerId\" : \"freelancerId\",\n    \"description\" : \"description\",\n    \"budget\" : 1.4658129805029452,\n    \"status\" : \"status\"\n  } ],\n  \"clientId\" : \"clientId\",\n  \"deadlineDate\" : \"2000-01-23\",\n  \"description\" : \"description\",\n  \"maxBudget\" : 6.027456183070403,\n  \"realEndDate\" : \"2000-01-23\",\n  \"title\" : \"title\",\n  \"selectedFreelancerId\" : \"selectedFreelancerId\",\n  \"skills\" : [ \"skills\", \"skills\" ],\n  \"id\" : \"id\",\n  \"minBudget\" : 0.8008281904610115,\n  \"startDate\" : \"2000-01-23\",\n  \"status\" : \"status\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<ProjectInfoDTO>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<ProjectInfoDTO>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<ProjectInfoDTO>> getProjectsByClient() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<ProjectInfoDTO>>(objectMapper.readValue("[ {\n  \"offers\" : [ {\n    \"freelancerId\" : \"freelancerId\",\n    \"description\" : \"description\",\n    \"budget\" : 1.4658129805029452,\n    \"status\" : \"status\"\n  }, {\n    \"freelancerId\" : \"freelancerId\",\n    \"description\" : \"description\",\n    \"budget\" : 1.4658129805029452,\n    \"status\" : \"status\"\n  } ],\n  \"clientId\" : \"clientId\",\n  \"deadlineDate\" : \"2000-01-23\",\n  \"description\" : \"description\",\n  \"maxBudget\" : 6.027456183070403,\n  \"realEndDate\" : \"2000-01-23\",\n  \"title\" : \"title\",\n  \"selectedFreelancerId\" : \"selectedFreelancerId\",\n  \"skills\" : [ \"skills\", \"skills\" ],\n  \"id\" : \"id\",\n  \"minBudget\" : 0.8008281904610115,\n  \"startDate\" : \"2000-01-23\",\n  \"status\" : \"status\"\n}, {\n  \"offers\" : [ {\n    \"freelancerId\" : \"freelancerId\",\n    \"description\" : \"description\",\n    \"budget\" : 1.4658129805029452,\n    \"status\" : \"status\"\n  }, {\n    \"freelancerId\" : \"freelancerId\",\n    \"description\" : \"description\",\n    \"budget\" : 1.4658129805029452,\n    \"status\" : \"status\"\n  } ],\n  \"clientId\" : \"clientId\",\n  \"deadlineDate\" : \"2000-01-23\",\n  \"description\" : \"description\",\n  \"maxBudget\" : 6.027456183070403,\n  \"realEndDate\" : \"2000-01-23\",\n  \"title\" : \"title\",\n  \"selectedFreelancerId\" : \"selectedFreelancerId\",\n  \"skills\" : [ \"skills\", \"skills\" ],\n  \"id\" : \"id\",\n  \"minBudget\" : 0.8008281904610115,\n  \"startDate\" : \"2000-01-23\",\n  \"status\" : \"status\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<ProjectInfoDTO>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<ProjectInfoDTO>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<ProjectInfoDTO>> getProjectsByOfferFreelancer() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<ProjectInfoDTO>>(objectMapper.readValue("[ {\n  \"offers\" : [ {\n    \"freelancerId\" : \"freelancerId\",\n    \"description\" : \"description\",\n    \"budget\" : 1.4658129805029452,\n    \"status\" : \"status\"\n  }, {\n    \"freelancerId\" : \"freelancerId\",\n    \"description\" : \"description\",\n    \"budget\" : 1.4658129805029452,\n    \"status\" : \"status\"\n  } ],\n  \"clientId\" : \"clientId\",\n  \"deadlineDate\" : \"2000-01-23\",\n  \"description\" : \"description\",\n  \"maxBudget\" : 6.027456183070403,\n  \"realEndDate\" : \"2000-01-23\",\n  \"title\" : \"title\",\n  \"selectedFreelancerId\" : \"selectedFreelancerId\",\n  \"skills\" : [ \"skills\", \"skills\" ],\n  \"id\" : \"id\",\n  \"minBudget\" : 0.8008281904610115,\n  \"startDate\" : \"2000-01-23\",\n  \"status\" : \"status\"\n}, {\n  \"offers\" : [ {\n    \"freelancerId\" : \"freelancerId\",\n    \"description\" : \"description\",\n    \"budget\" : 1.4658129805029452,\n    \"status\" : \"status\"\n  }, {\n    \"freelancerId\" : \"freelancerId\",\n    \"description\" : \"description\",\n    \"budget\" : 1.4658129805029452,\n    \"status\" : \"status\"\n  } ],\n  \"clientId\" : \"clientId\",\n  \"deadlineDate\" : \"2000-01-23\",\n  \"description\" : \"description\",\n  \"maxBudget\" : 6.027456183070403,\n  \"realEndDate\" : \"2000-01-23\",\n  \"title\" : \"title\",\n  \"selectedFreelancerId\" : \"selectedFreelancerId\",\n  \"skills\" : [ \"skills\", \"skills\" ],\n  \"id\" : \"id\",\n  \"minBudget\" : 0.8008281904610115,\n  \"startDate\" : \"2000-01-23\",\n  \"status\" : \"status\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<ProjectInfoDTO>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<ProjectInfoDTO>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ProfileDTO> getUserByEmail(@NotNull @Parameter(in = ParameterIn.QUERY, description = "" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "email", required = true) String email) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ProfileDTO>(objectMapper.readValue("{\n  \"skills\" : [ \"skills\", \"skills\" ],\n  \"firebaseId\" : \"firebaseId\",\n  \"phone\" : \"phone\",\n  \"name\" : \"name\",\n  \"rating\" : 0.8008281904610115,\n  \"description\" : \"description\",\n  \"id\" : \"id\",\n  \"availability\" : \"availability\",\n  \"title\" : \"title\",\n  \"email\" : \"email\",\n  \"activeRole\" : \"activeRole\"\n}", ProfileDTO.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ProfileDTO>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ProfileDTO>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ProfileDTO> modifyClientProfile(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody ModifyClientProfileDTO body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ProfileDTO>(objectMapper.readValue("{\n  \"skills\" : [ \"skills\", \"skills\" ],\n  \"firebaseId\" : \"firebaseId\",\n  \"phone\" : \"phone\",\n  \"name\" : \"name\",\n  \"rating\" : 0.8008281904610115,\n  \"description\" : \"description\",\n  \"id\" : \"id\",\n  \"availability\" : \"availability\",\n  \"title\" : \"title\",\n  \"email\" : \"email\",\n  \"activeRole\" : \"activeRole\"\n}", ProfileDTO.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ProfileDTO>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ProfileDTO>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ProfileDTO> modifyFreelancerProfile(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody ModifyFreelancerProfileDTO body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ProfileDTO>(objectMapper.readValue("{\n  \"skills\" : [ \"skills\", \"skills\" ],\n  \"firebaseId\" : \"firebaseId\",\n  \"phone\" : \"phone\",\n  \"name\" : \"name\",\n  \"rating\" : 0.8008281904610115,\n  \"description\" : \"description\",\n  \"id\" : \"id\",\n  \"availability\" : \"availability\",\n  \"title\" : \"title\",\n  \"email\" : \"email\",\n  \"activeRole\" : \"activeRole\"\n}", ProfileDTO.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ProfileDTO>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ProfileDTO>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> sessionLogin() {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> sessionLogout() {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> sessionLogoutEverywhere() {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ProjectInfoDTO> submitOffer(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody SubmitOfferDTO body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ProjectInfoDTO>(objectMapper.readValue("{\n  \"offers\" : [ {\n    \"freelancerId\" : \"freelancerId\",\n    \"description\" : \"description\",\n    \"budget\" : 1.4658129805029452,\n    \"status\" : \"status\"\n  }, {\n    \"freelancerId\" : \"freelancerId\",\n    \"description\" : \"description\",\n    \"budget\" : 1.4658129805029452,\n    \"status\" : \"status\"\n  } ],\n  \"clientId\" : \"clientId\",\n  \"deadlineDate\" : \"2000-01-23\",\n  \"description\" : \"description\",\n  \"maxBudget\" : 6.027456183070403,\n  \"realEndDate\" : \"2000-01-23\",\n  \"title\" : \"title\",\n  \"selectedFreelancerId\" : \"selectedFreelancerId\",\n  \"skills\" : [ \"skills\", \"skills\" ],\n  \"id\" : \"id\",\n  \"minBudget\" : 0.8008281904610115,\n  \"startDate\" : \"2000-01-23\",\n  \"status\" : \"status\"\n}", ProjectInfoDTO.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ProjectInfoDTO>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ProjectInfoDTO>(HttpStatus.NOT_IMPLEMENTED);
    }

}
