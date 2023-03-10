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

import com.forestvpn.api.client.models.PaymentMethod

import com.squareup.moshi.Json

/**
 * Represents billing account
 *
 * @param id 
 * @param defaultPaymentMethod 
 * @param defaultPaymentMethodId 
 */


data class BillingAccount (

    @Json(name = "id")
    val id: kotlin.String,

    @Json(name = "default_payment_method")
    val defaultPaymentMethod: PaymentMethod,

    @Json(name = "default_payment_method_id")
    val defaultPaymentMethodId: java.util.UUID

)

