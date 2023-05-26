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
 * The AddDeviceDTO model module.
 * @module model/AddDeviceDTO
 * @version 1.0
 */
export class AddDeviceDTO {
  /**
   * Constructs a new <code>AddDeviceDTO</code>.
   * @alias module:model/AddDeviceDTO
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>AddDeviceDTO</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/AddDeviceDTO} obj Optional instance to populate.
   * @return {module:model/AddDeviceDTO} The populated <code>AddDeviceDTO</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new AddDeviceDTO();
      if (data.hasOwnProperty('firebaseId'))
        obj.firebaseId = ApiClient.convertToType(data['firebaseId'], 'String');
      if (data.hasOwnProperty('deviceModel'))
        obj.deviceModel = ApiClient.convertToType(data['deviceModel'], 'String');
      if (data.hasOwnProperty('deviceToken'))
        obj.deviceToken = ApiClient.convertToType(data['deviceToken'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} firebaseId
 */
AddDeviceDTO.prototype.firebaseId = undefined;

/**
 * @member {String} deviceModel
 */
AddDeviceDTO.prototype.deviceModel = undefined;

/**
 * @member {String} deviceToken
 */
AddDeviceDTO.prototype.deviceToken = undefined;
