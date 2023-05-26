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
 * The CreateProjectDTO model module.
 * @module model/CreateProjectDTO
 * @version 1.0
 */
export class CreateProjectDTO {
  /**
   * Constructs a new <code>CreateProjectDTO</code>.
   * @alias module:model/CreateProjectDTO
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>CreateProjectDTO</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/CreateProjectDTO} obj Optional instance to populate.
   * @return {module:model/CreateProjectDTO} The populated <code>CreateProjectDTO</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new CreateProjectDTO();
      if (data.hasOwnProperty('title'))
        obj.title = ApiClient.convertToType(data['title'], 'String');
      if (data.hasOwnProperty('description'))
        obj.description = ApiClient.convertToType(data['description'], 'String');
      if (data.hasOwnProperty('skills'))
        obj.skills = ApiClient.convertToType(data['skills'], ['String']);
      if (data.hasOwnProperty('minBudget'))
        obj.minBudget = ApiClient.convertToType(data['minBudget'], 'Number');
      if (data.hasOwnProperty('maxBudget'))
        obj.maxBudget = ApiClient.convertToType(data['maxBudget'], 'Number');
      if (data.hasOwnProperty('startDate'))
        obj.startDate = ApiClient.convertToType(data['startDate'], 'Date');
      if (data.hasOwnProperty('deadlineDate'))
        obj.deadlineDate = ApiClient.convertToType(data['deadlineDate'], 'Date');
    }
    return obj;
  }
}

/**
 * @member {String} title
 */
CreateProjectDTO.prototype.title = undefined;

/**
 * @member {String} description
 */
CreateProjectDTO.prototype.description = undefined;

/**
 * @member {Array.<String>} skills
 */
CreateProjectDTO.prototype.skills = undefined;

/**
 * @member {Number} minBudget
 */
CreateProjectDTO.prototype.minBudget = undefined;

/**
 * @member {Number} maxBudget
 */
CreateProjectDTO.prototype.maxBudget = undefined;

/**
 * @member {Date} startDate
 */
CreateProjectDTO.prototype.startDate = undefined;

/**
 * @member {Date} deadlineDate
 */
CreateProjectDTO.prototype.deadlineDate = undefined;
