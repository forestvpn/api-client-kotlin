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

import com.forestvpn.api.client.models.AdUnit

import com.squareup.moshi.Json

/**
 * 
 *
 * @param id 
 * @param slug 
 * @param units 
 */


data class AdPlacement (

    @Json(name = "id")
    val id: kotlin.String,

    @Json(name = "slug")
    val slug: kotlin.String,

    @Json(name = "units")
    val units: kotlin.collections.List<AdUnit>

)
