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
 * @param unreadCount 
 * @param unreadList 
 */


data class NotificationUnreadCount (

    @Json(name = "unread_count")
    val unreadCount: kotlin.Int,

    @Json(name = "unread_list")
    val unreadList: kotlin.collections.List<Notification>

)
