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
import {ApiClient} from '../ApiClient';

/**
 * The AssignProjectDTO model module.
 * @module model/AssignProjectDTO
 * @version 1.0
 */
export class AssignProjectDTO {
  /**
   * Constructs a new <code>AssignProjectDTO</code>.
   * @alias module:model/AssignProjectDTO
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>AssignProjectDTO</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/AssignProjectDTO} obj Optional instance to populate.
   * @return {module:model/AssignProjectDTO} The populated <code>AssignProjectDTO</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new AssignProjectDTO();
      if (data.hasOwnProperty('projectId'))
        obj.projectId = ApiClient.convertToType(data['projectId'], 'String');
      if (data.hasOwnProperty('freelancerId'))
        obj.freelancerId = ApiClient.convertToType(data['freelancerId'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} projectId
 */
AssignProjectDTO.prototype.projectId = undefined;

/**
 * @member {String} freelancerId
 */
AssignProjectDTO.prototype.freelancerId = undefined;
