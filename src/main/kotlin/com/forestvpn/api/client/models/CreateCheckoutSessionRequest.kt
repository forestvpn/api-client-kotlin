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

import com.forestvpn.api.client.models.CreateCheckoutSessionProduct

import com.squareup.moshi.Json

/**
 * 
 *
 * @param cancelUrl 
 * @param successUrl 
 * @param products 
 * @param currency 
 * @param locale 
 * @param email 
 */


data class CreateCheckoutSessionRequest (

    @Json(name = "cancel_url")
    val cancelUrl: kotlin.String,

    @Json(name = "success_url")
    val successUrl: kotlin.String,

    @Json(name = "products")
    val products: kotlin.collections.List<CreateCheckoutSessionProduct>,

    @Json(name = "currency")
    val currency: kotlin.String? = null,

    @Json(name = "locale")
    val locale: kotlin.String? = null,

    @Json(name = "email")
    val email: kotlin.String? = null

)

