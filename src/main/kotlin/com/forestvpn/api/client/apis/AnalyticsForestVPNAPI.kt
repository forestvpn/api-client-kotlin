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

package com.forestvpn.api.client.apis

import java.io.IOException
import okhttp3.OkHttpClient
import okhttp3.HttpUrl

import com.forestvpn.api.client.models.AggregatedDataUsageStats
import com.forestvpn.api.client.models.Error

import com.squareup.moshi.Json

import com.forestvpn.api.client.infrastructure.ApiClient
import com.forestvpn.api.client.infrastructure.ApiResponse
import com.forestvpn.api.client.infrastructure.ClientException
import com.forestvpn.api.client.infrastructure.ClientError
import com.forestvpn.api.client.infrastructure.ServerException
import com.forestvpn.api.client.infrastructure.ServerError
import com.forestvpn.api.client.infrastructure.MultiValueMap
import com.forestvpn.api.client.infrastructure.PartConfig
import com.forestvpn.api.client.infrastructure.RequestConfig
import com.forestvpn.api.client.infrastructure.RequestMethod
import com.forestvpn.api.client.infrastructure.ResponseType
import com.forestvpn.api.client.infrastructure.Success
import com.forestvpn.api.client.infrastructure.toMultiValue

class AnalyticsForestVPNAPI(basePath: kotlin.String = defaultBasePath, client: OkHttpClient = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "https://api.forestvpn.com/v2")
        }
    }

    /**
     * enum for parameter sortBy
     */
     enum class SortBy_getDataUsageStats(val value: kotlin.String) {
         @Json(name = "total_bytes") totalBytes("total_bytes"),
         @Json(name = "received_bytes") receivedBytes("received_bytes"),
         @Json(name = "transmitted_bytes") transmittedBytes("transmitted_bytes"),
         @Json(name = "usage_time") usageTime("usage_time")
     }

    /**
     * Data Usage Stats
     * Users data usage dtatistics for each device 
     * @param aggrInterval No more than 3 days for hour aggregation type
     * @param dateAfter No more than 3 months between date_after and date_before (optional)
     * @param dateBefore No more than 3 months between date_after and date_before (optional)
     * @param deviceTypeIn Filter by device type (optional)
     * @param deviceIn Filter by device (optional)
     * @param sortBy Sort output by (optional)
     * @return kotlin.collections.List<AggregatedDataUsageStats>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getDataUsageStats(aggrInterval: kotlin.String, dateAfter: java.time.LocalDate? = null, dateBefore: java.time.LocalDate? = null, deviceTypeIn: kotlin.collections.List<kotlin.String>? = null, deviceIn: kotlin.collections.List<java.util.UUID>? = null, sortBy: SortBy_getDataUsageStats? = null) : kotlin.collections.List<AggregatedDataUsageStats> {
        val localVarResponse = getDataUsageStatsWithHttpInfo(aggrInterval = aggrInterval, dateAfter = dateAfter, dateBefore = dateBefore, deviceTypeIn = deviceTypeIn, deviceIn = deviceIn, sortBy = sortBy)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.collections.List<AggregatedDataUsageStats>
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * Data Usage Stats
     * Users data usage dtatistics for each device 
     * @param aggrInterval No more than 3 days for hour aggregation type
     * @param dateAfter No more than 3 months between date_after and date_before (optional)
     * @param dateBefore No more than 3 months between date_after and date_before (optional)
     * @param deviceTypeIn Filter by device type (optional)
     * @param deviceIn Filter by device (optional)
     * @param sortBy Sort output by (optional)
     * @return ApiResponse<kotlin.collections.List<AggregatedDataUsageStats>?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun getDataUsageStatsWithHttpInfo(aggrInterval: kotlin.String, dateAfter: java.time.LocalDate?, dateBefore: java.time.LocalDate?, deviceTypeIn: kotlin.collections.List<kotlin.String>?, deviceIn: kotlin.collections.List<java.util.UUID>?, sortBy: SortBy_getDataUsageStats?) : ApiResponse<kotlin.collections.List<AggregatedDataUsageStats>?> {
        val localVariableConfig = getDataUsageStatsRequestConfig(aggrInterval = aggrInterval, dateAfter = dateAfter, dateBefore = dateBefore, deviceTypeIn = deviceTypeIn, deviceIn = deviceIn, sortBy = sortBy)

        return request<Unit, kotlin.collections.List<AggregatedDataUsageStats>>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation getDataUsageStats
     *
     * @param aggrInterval No more than 3 days for hour aggregation type
     * @param dateAfter No more than 3 months between date_after and date_before (optional)
     * @param dateBefore No more than 3 months between date_after and date_before (optional)
     * @param deviceTypeIn Filter by device type (optional)
     * @param deviceIn Filter by device (optional)
     * @param sortBy Sort output by (optional)
     * @return RequestConfig
     */
    fun getDataUsageStatsRequestConfig(aggrInterval: kotlin.String, dateAfter: java.time.LocalDate?, dateBefore: java.time.LocalDate?, deviceTypeIn: kotlin.collections.List<kotlin.String>?, deviceIn: kotlin.collections.List<java.util.UUID>?, sortBy: SortBy_getDataUsageStats?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                put("aggr_interval", listOf(aggrInterval.toString()))
                if (dateAfter != null) {
                    put("date_after", listOf(parseDateToQueryString(dateAfter)))
                }
                if (dateBefore != null) {
                    put("date_before", listOf(parseDateToQueryString(dateBefore)))
                }
                if (deviceTypeIn != null) {
                    put("device_type__in", toMultiValue(deviceTypeIn.toList(), "multi"))
                }
                if (deviceIn != null) {
                    put("device__in", toMultiValue(deviceIn.toList(), "multi"))
                }
                if (sortBy != null) {
                    put("sort_by", listOf(sortBy.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/analytics/data-usage/",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}
