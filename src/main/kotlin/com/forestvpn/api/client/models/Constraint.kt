/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package com.forestvpn.api.client.models


import com.squareup.moshi.Json

/**
 * 
 *
 * @param namespace 
 * @param relation 
 * @param subject 
 */


data class Constraint (

    @Json(name = "namespace")
    val namespace: kotlin.String? = null,

    @Json(name = "relation")
    val relation: kotlin.String? = null,

    @Json(name = "subject")
    val subject: kotlin.collections.List<kotlin.String>? = null

)

