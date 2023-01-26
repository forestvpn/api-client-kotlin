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

import com.forestvpn.api.client.models.Environment

import com.squareup.moshi.Json

/**
 * 
 *
 * @param id 
 * @param username 
 * @param promoCode 
 * @param firstName 
 * @param lastName 
 * @param email 
 * @param emailVerified 
 * @param photoUrl 
 * @param dateJoined 
 * @param country 
 * @param currencyCode 
 * @param environments 
 */


data class User (

    @Json(name = "id")
    val id: java.util.UUID,

    @Json(name = "username")
    val username: kotlin.String,

    @Json(name = "promo_code")
    val promoCode: kotlin.String? = null,

    @Json(name = "first_name")
    val firstName: kotlin.String? = null,

    @Json(name = "last_name")
    val lastName: kotlin.String? = null,

    @Json(name = "email")
    val email: kotlin.String? = null,

    @Json(name = "email_verified")
    val emailVerified: kotlin.Boolean? = null,

    @Json(name = "photo_url")
    val photoUrl: kotlin.String? = null,

    @Json(name = "date_joined")
    val dateJoined: java.time.OffsetDateTime? = null,

    @Json(name = "country")
    val country: kotlin.String? = null,

    @Json(name = "currency_code")
    val currencyCode: kotlin.String? = null,

    @Json(name = "environments")
    val environments: kotlin.collections.List<Environment>? = null

)
