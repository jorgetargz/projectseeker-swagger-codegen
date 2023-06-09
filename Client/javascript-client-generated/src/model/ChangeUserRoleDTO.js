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
 * The ChangeUserRoleDTO model module.
 * @module model/ChangeUserRoleDTO
 * @version 1.0
 */
export class ChangeUserRoleDTO {
  /**
   * Constructs a new <code>ChangeUserRoleDTO</code>.
   * @alias module:model/ChangeUserRoleDTO
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>ChangeUserRoleDTO</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/ChangeUserRoleDTO} obj Optional instance to populate.
   * @return {module:model/ChangeUserRoleDTO} The populated <code>ChangeUserRoleDTO</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new ChangeUserRoleDTO();
      if (data.hasOwnProperty('activeRole'))
        obj.activeRole = ApiClient.convertToType(data['activeRole'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} activeRole
 */
ChangeUserRoleDTO.prototype.activeRole = undefined;

