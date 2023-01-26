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
 * @param id 
 * @param name 
 * @param emoji 
 * @param currencyCode 
 * @param alternativeNames 
 */


data class Country (

    @Json(name = "id")
    val id: kotlin.String,

    @Json(name = "name")
    val name: kotlin.String,

    @Json(name = "emoji")
    val emoji: kotlin.String,

    @Json(name = "currency_code")
    val currencyCode: kotlin.String? = null,

    @Json(name = "alternative_names")
    val alternativeNames: kotlin.collections.List<kotlin.String>? = null

)

