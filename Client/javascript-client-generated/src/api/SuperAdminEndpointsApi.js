/*
 * Project Seeker API
 * Project Seeker API
 *
 * OpenAPI spec version: 1.0
 * Contact: jorgetargz@gmail.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 3.0.42
 *
 * Do not edit the class manually.
 *
 */
import {ApiClient} from "../ApiClient";
import {ErrorDTO} from '../model/ErrorDTO';
import {ProfileDTO} from '../model/ProfileDTO';

/**
* SuperAdminEndpoints service.
* @module api/SuperAdminEndpointsApi
* @version 1.0
*/
export class SuperAdminEndpointsApi {

    /**
    * Constructs a new SuperAdminEndpointsApi. 
    * @alias module:api/SuperAdminEndpointsApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instanc
    e} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }

    /**
     * Callback function to receive the result of the disableUser operation.
     * @callback moduleapi/SuperAdminEndpointsApi~disableUserCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Disable user
     * @param {String} email 
     * @param {module:api/SuperAdminEndpointsApi~disableUserCallback} callback The callback function, accepting three arguments: error, data, response
     */
    disableUser(email, callback) {
      
      let postBody = null;
      // verify the required parameter 'email' is set
      if (email === undefined || email === null) {
        throw new Error("Missing the required parameter 'email' when calling disableUser");
      }

      let pathParams = {
        
      };
      let queryParams = {
        'email': email
      };
      let headerParams = {
        
      };
      let formParams = {
        
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['*/*'];
      let returnType = null;

      return this.apiClient.callApi(
        '/api/secured/super/disable-user', 'PUT',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the enableUser operation.
     * @callback moduleapi/SuperAdminEndpointsApi~enableUserCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Enable user
     * @param {String} email 
     * @param {module:api/SuperAdminEndpointsApi~enableUserCallback} callback The callback function, accepting three arguments: error, data, response
     */
    enableUser(email, callback) {
      
      let postBody = null;
      // verify the required parameter 'email' is set
      if (email === undefined || email === null) {
        throw new Error("Missing the required parameter 'email' when calling enableUser");
      }

      let pathParams = {
        
      };
      let queryParams = {
        'email': email
      };
      let headerParams = {
        
      };
      let formParams = {
        
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['*/*'];
      let returnType = null;

      return this.apiClient.callApi(
        '/api/secured/super/enable-user', 'PUT',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getUserByEmail operation.
     * @callback moduleapi/SuperAdminEndpointsApi~getUserByEmailCallback
     * @param {String} error Error message, if any.
     * @param {module:model/ProfileDTO{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get user by email
     * @param {String} email 
     * @param {module:api/SuperAdminEndpointsApi~getUserByEmailCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    getUserByEmail(email, callback) {
      
      let postBody = null;
      // verify the required parameter 'email' is set
      if (email === undefined || email === null) {
        throw new Error("Missing the required parameter 'email' when calling getUserByEmail");
      }

      let pathParams = {
        
      };
      let queryParams = {
        'email': email
      };
      let headerParams = {
        
      };
      let formParams = {
        
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['*/*'];
      let returnType = ProfileDTO;

      return this.apiClient.callApi(
        '/api/secured/super/user', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

}