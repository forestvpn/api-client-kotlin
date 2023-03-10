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

import com.forestvpn.api.client.models.User

import com.squareup.moshi.Json

/**
 * 
 *
 * @param id 
 * @param createdAt 
 * @param user 
 */


data class Friendship (

    @Json(name = "id")
    val id: java.util.UUID,

    @Json(name = "created_at")
    val createdAt: java.time.OffsetDateTime,

    @Json(name = "user")
    val user: User? = null

)

