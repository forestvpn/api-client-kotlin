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

import com.forestvpn.api.client.models.Error
import com.forestvpn.api.client.models.PlayStorePurchaseVerificationRequest

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

class GoogleForestVPNAPI(basePath: kotlin.String = defaultBasePath, client: OkHttpClient = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "https://api.forestvpn.com/v2")
        }
    }

    /**
     * Play store purchase verification
     * 
     * @param playStorePurchaseVerificationRequest 
     * @return void
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun verifyPlayStorePurchase(playStorePurchaseVerificationRequest: PlayStorePurchaseVerificationRequest) : Unit {
        val localVarResponse = verifyPlayStorePurchaseWithHttpInfo(playStorePurchaseVerificationRequest = playStorePurchaseVerificationRequest)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> Unit
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
     * Play store purchase verification
     * 
     * @param playStorePurchaseVerificationRequest 
     * @return ApiResponse<Unit?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Throws(IllegalStateException::class, IOException::class)
    fun verifyPlayStorePurchaseWithHttpInfo(playStorePurchaseVerificationRequest: PlayStorePurchaseVerificationRequest) : ApiResponse<Unit?> {
        val localVariableConfig = verifyPlayStorePurchaseRequestConfig(playStorePurchaseVerificationRequest = playStorePurchaseVerificationRequest)

        return request<PlayStorePurchaseVerificationRequest, Unit>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation verifyPlayStorePurchase
     *
     * @param playStorePurchaseVerificationRequest 
     * @return RequestConfig
     */
    fun verifyPlayStorePurchaseRequestConfig(playStorePurchaseVerificationRequest: PlayStorePurchaseVerificationRequest) : RequestConfig<PlayStorePurchaseVerificationRequest> {
        val localVariableBody = playStorePurchaseVerificationRequest
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/purchase/google/verify/",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}