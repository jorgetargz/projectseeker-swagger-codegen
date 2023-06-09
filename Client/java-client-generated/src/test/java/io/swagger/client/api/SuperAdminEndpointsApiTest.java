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

import io.swagger.client.model.ErrorDTO;
import io.swagger.client.model.ProfileDTO;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for SuperAdminEndpointsApi
 */
@Ignore
public class SuperAdminEndpointsApiTest {

    private final SuperAdminEndpointsApi api = new SuperAdminEndpointsApi();

    /**
     * Disable user
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void disableUserTest() throws Exception {
        String email = null;
        api.disableUser(email);

        // TODO: test validations
    }
    /**
     * Enable user
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void enableUserTest() throws Exception {
        String email = null;
        api.enableUser(email);

        // TODO: test validations
    }
    /**
     * Get user by email
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getUserByEmailTest() throws Exception {
        String email = null;
        ProfileDTO response = api.getUserByEmail(email);

        // TODO: test validations
    }
}
