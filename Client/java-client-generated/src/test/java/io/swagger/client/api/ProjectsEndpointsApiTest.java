/*
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

package io.swagger.client.api;

import io.swagger.client.model.AssignProjectDTO;
import io.swagger.client.model.CreateProjectDTO;
import io.swagger.client.model.ErrorDTO;
import io.swagger.client.model.ProjectInfoDTO;
import io.swagger.client.model.SubmitOfferDTO;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for ProjectsEndpointsApi
 */
@Ignore
public class ProjectsEndpointsApiTest {

    private final ProjectsEndpointsApi api = new ProjectsEndpointsApi();

    /**
     * Assign freelancer
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void assignFreelancerTest() throws Exception {
        AssignProjectDTO body = null;
        ProjectInfoDTO response = api.assignFreelancer(body);

        // TODO: test validations
    }
    /**
     * Create project
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createProjectTest() throws Exception {
        CreateProjectDTO body = null;
        ProjectInfoDTO response = api.createProject(body);

        // TODO: test validations
    }
    /**
     * Finish project
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void finishProjectTest() throws Exception {
        String id = null;
        ProjectInfoDTO response = api.finishProject(id);

        // TODO: test validations
    }
    /**
     * Get the projects I have created that are in progress
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getInProgressProjectsByClientIdTest() throws Exception {
        List<ProjectInfoDTO> response = api.getInProgressProjectsByClientId();

        // TODO: test validations
    }
    /**
     * Get all open projects
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getOpenProjectsTest() throws Exception {
        List<ProjectInfoDTO> response = api.getOpenProjects();

        // TODO: test validations
    }
    /**
     * Get the projects I have created that are open
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getOpenProjectsByClientTest() throws Exception {
        List<ProjectInfoDTO> response = api.getOpenProjectsByClient();

        // TODO: test validations
    }
    /**
     * Get open projects by skills
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getOpenProjectsBySkillsTest() throws Exception {
        List<String> body = null;
        List<ProjectInfoDTO> response = api.getOpenProjectsBySkills(body);

        // TODO: test validations
    }
    /**
     * Get project info
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getPrjectInfoTest() throws Exception {
        String id = null;
        ProjectInfoDTO response = api.getPrjectInfo(id);

        // TODO: test validations
    }
    /**
     * Get projects assigned to me
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getProjectsByAssignedFreelancerTest() throws Exception {
        List<ProjectInfoDTO> response = api.getProjectsByAssignedFreelancer();

        // TODO: test validations
    }
    /**
     * Get the projects I have created
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getProjectsByClientTest() throws Exception {
        List<ProjectInfoDTO> response = api.getProjectsByClient();

        // TODO: test validations
    }
    /**
     * Get projects where I have made an offer
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getProjectsByOfferFreelancerTest() throws Exception {
        List<ProjectInfoDTO> response = api.getProjectsByOfferFreelancer();

        // TODO: test validations
    }
    /**
     * Submit offer
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void submitOfferTest() throws Exception {
        SubmitOfferDTO body = null;
        ProjectInfoDTO response = api.submitOffer(body);

        // TODO: test validations
    }
}
