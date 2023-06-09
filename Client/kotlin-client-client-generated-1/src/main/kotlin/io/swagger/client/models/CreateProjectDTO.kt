/**
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
package io.swagger.client.models


/**
 * 
 * @param title 
 * @param description 
 * @param skills 
 * @param minBudget 
 * @param maxBudget 
 * @param startDate 
 * @param deadlineDate 
 */
data class CreateProjectDTO (

    val title: kotlin.String? = null,
    val description: kotlin.String? = null,
    val skills: kotlin.Array<kotlin.String>? = null,
    val minBudget: kotlin.Double? = null,
    val maxBudget: kotlin.Double? = null,
    val startDate: java.time.LocalDate? = null,
    val deadlineDate: java.time.LocalDate? = null
) {
}