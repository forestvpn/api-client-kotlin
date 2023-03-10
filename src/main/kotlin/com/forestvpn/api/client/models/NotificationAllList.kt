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

import com.forestvpn.api.client.models.Notification

import com.squareup.moshi.Json

/**
 * 
 *
 * @param allList 
 * @param unreadCount 
 */


data class NotificationAllList (

    @Json(name = "all_list")
    val allList: kotlin.collections.List<Notification>,

    @Json(name = "unread_count")
    val unreadCount: kotlin.Int? = null

)

