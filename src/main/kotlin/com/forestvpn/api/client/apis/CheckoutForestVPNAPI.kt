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

import com.forestvpn.api.client.models.CheckoutSession
import com.forestvpn.api.client.models.CloudPaymentsAuth
import com.forestvpn.api.client.models.CloudPaymentsPost3ds
import com.forestvpn.api.client.models.CouponCheckoutSession
import com.forestvpn.api.client.models.CreateCheckoutSessionRequest
import com.forestvpn.api.client.models.CreateCloudPaymentsAuth
import com.forestvpn.api.client.models.CreateCloudPaymentsPost3ds
import com.forestvpn.api.client.models.CreateCouponCheckoutSession
import com.forestvpn.api.client.models.Error
import com.forestvpn.api.client.models.StripeCheckoutSession
import com.forestvpn.api.client.models.StripePaymentIntent

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

class CheckoutForestVPNAPI(basePath: kotlin.String = defaultBasePath, client: OkHttpClient = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "https://api.forestvpn.com/v2")
        }
    }

    /**
     * Apply coupon to session
     * 
     * @param sessionID 
     * @param createCouponCheckoutSession 
     * @return CouponCheckoutSession
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun applyCouponCheckoutSession(sessionID: java.util.UUID, createCouponCheckoutSession: CreateCouponCheckoutSession) : CouponCheckoutSession {
        val localVarResponse = applyCouponCheckoutSessionWithHttpInfo(sessionID = sessionID, createCouponCheckoutSession = createCouponCheckoutSession)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as CouponCheckoutSession
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
     * Apply coupon to session
     * 
     * @param sessionID 
     * @param createCouponCheckoutSession 
     * @return ApiResponse<CouponCheckoutSession?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun applyCouponCheckoutSessionWithHttpInfo(sessionID: java.util.UUID, createCouponCheckoutSession: CreateCouponCheckoutSession) : ApiResponse<CouponCheckoutSession?> {
        val localVariableConfig = applyCouponCheckoutSessionRequestConfig(sessionID = sessionID, createCouponCheckoutSession = createCouponCheckoutSession)

        return request<CreateCouponCheckoutSession, CouponCheckoutSession>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation applyCouponCheckoutSession
     *
     * @param sessionID 
     * @param createCouponCheckoutSession 
     * @return RequestConfig
     */
    fun applyCouponCheckoutSessionRequestConfig(sessionID: java.util.UUID, createCouponCheckoutSession: CreateCouponCheckoutSession) : RequestConfig<CreateCouponCheckoutSession> {
        val localVariableBody = createCouponCheckoutSession
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/checkout/sessions/{sessionID}/apply_coupon/".replace("{"+"sessionID"+"}", encodeURIComponent(sessionID.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * Create checkout session
     * 
     * @param createCheckoutSessionRequest  (optional)
     * @return CheckoutSession
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun createCheckoutSession(createCheckoutSessionRequest: CreateCheckoutSessionRequest? = null) : CheckoutSession {
        val localVarResponse = createCheckoutSessionWithHttpInfo(createCheckoutSessionRequest = createCheckoutSessionRequest)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as CheckoutSession
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
     * Create checkout session
     * 
     * @param createCheckoutSessionRequest  (optional)
     * @return ApiResponse<CheckoutSession?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun createCheckoutSessionWithHttpInfo(createCheckoutSessionRequest: CreateCheckoutSessionRequest?) : ApiResponse<CheckoutSession?> {
        val localVariableConfig = createCheckoutSessionRequestConfig(createCheckoutSessionRequest = createCheckoutSessionRequest)

        return request<CreateCheckoutSessionRequest, CheckoutSession>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation createCheckoutSession
     *
     * @param createCheckoutSessionRequest  (optional)
     * @return RequestConfig
     */
    fun createCheckoutSessionRequestConfig(createCheckoutSessionRequest: CreateCheckoutSessionRequest?) : RequestConfig<CreateCheckoutSessionRequest> {
        val localVariableBody = createCheckoutSessionRequest
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/checkout/sessions/",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * Create request to add country in wait list
     * 
     * @param xCountry  (optional)
     * @return void
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun createWaitListRequest(xCountry: kotlin.String? = null) : Unit {
        val localVarResponse = createWaitListRequestWithHttpInfo(xCountry = xCountry)

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
     * Create request to add country in wait list
     * 
     * @param xCountry  (optional)
     * @return ApiResponse<Unit?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Throws(IllegalStateException::class, IOException::class)
    fun createWaitListRequestWithHttpInfo(xCountry: kotlin.String?) : ApiResponse<Unit?> {
        val localVariableConfig = createWaitListRequestRequestConfig(xCountry = xCountry)

        return request<Unit, Unit>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation createWaitListRequest
     *
     * @param xCountry  (optional)
     * @return RequestConfig
     */
    fun createWaitListRequestRequestConfig(xCountry: kotlin.String?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        xCountry?.apply { localVariableHeaders["X-Country"] = this.toString() }
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/checkout/wait-list/",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * Expire checkout session
     * 
     * @param sessionID 
     * @return void
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun expireCheckoutSession(sessionID: java.util.UUID) : Unit {
        val localVarResponse = expireCheckoutSessionWithHttpInfo(sessionID = sessionID)

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
     * Expire checkout session
     * 
     * @param sessionID 
     * @return ApiResponse<Unit?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Throws(IllegalStateException::class, IOException::class)
    fun expireCheckoutSessionWithHttpInfo(sessionID: java.util.UUID) : ApiResponse<Unit?> {
        val localVariableConfig = expireCheckoutSessionRequestConfig(sessionID = sessionID)

        return request<Unit, Unit>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation expireCheckoutSession
     *
     * @param sessionID 
     * @return RequestConfig
     */
    fun expireCheckoutSessionRequestConfig(sessionID: java.util.UUID) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/checkout/sessions/{sessionID}/expire/".replace("{"+"sessionID"+"}", encodeURIComponent(sessionID.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * Checkout session details
     * 
     * @param sessionID 
     * @return CheckoutSession
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getCheckoutSession(sessionID: java.util.UUID) : CheckoutSession {
        val localVarResponse = getCheckoutSessionWithHttpInfo(sessionID = sessionID)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as CheckoutSession
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
     * Checkout session details
     * 
     * @param sessionID 
     * @return ApiResponse<CheckoutSession?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun getCheckoutSessionWithHttpInfo(sessionID: java.util.UUID) : ApiResponse<CheckoutSession?> {
        val localVariableConfig = getCheckoutSessionRequestConfig(sessionID = sessionID)

        return request<Unit, CheckoutSession>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation getCheckoutSession
     *
     * @param sessionID 
     * @return RequestConfig
     */
    fun getCheckoutSessionRequestConfig(sessionID: java.util.UUID) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/checkout/sessions/{sessionID}/".replace("{"+"sessionID"+"}", encodeURIComponent(sessionID.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * Stripe checkout session details
     * 
     * @param sessionID 
     * @return StripeCheckoutSession
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getStripeCheckoutSession(sessionID: java.util.UUID) : StripeCheckoutSession {
        val localVarResponse = getStripeCheckoutSessionWithHttpInfo(sessionID = sessionID)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as StripeCheckoutSession
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
     * Stripe checkout session details
     * 
     * @param sessionID 
     * @return ApiResponse<StripeCheckoutSession?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun getStripeCheckoutSessionWithHttpInfo(sessionID: java.util.UUID) : ApiResponse<StripeCheckoutSession?> {
        val localVariableConfig = getStripeCheckoutSessionRequestConfig(sessionID = sessionID)

        return request<Unit, StripeCheckoutSession>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation getStripeCheckoutSession
     *
     * @param sessionID 
     * @return RequestConfig
     */
    fun getStripeCheckoutSessionRequestConfig(sessionID: java.util.UUID) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/checkout/sessions/{sessionID}/stripe/checkout/session/".replace("{"+"sessionID"+"}", encodeURIComponent(sessionID.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * Stripe payment intent details
     * 
     * @param sessionID 
     * @param useStripeSdk  (optional)
     * @param returnUrl  (optional)
     * @return StripePaymentIntent
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getStripePaymentIntent(sessionID: java.util.UUID, useStripeSdk: kotlin.Boolean? = null, returnUrl: kotlin.String? = null) : StripePaymentIntent {
        val localVarResponse = getStripePaymentIntentWithHttpInfo(sessionID = sessionID, useStripeSdk = useStripeSdk, returnUrl = returnUrl)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as StripePaymentIntent
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
     * Stripe payment intent details
     * 
     * @param sessionID 
     * @param useStripeSdk  (optional)
     * @param returnUrl  (optional)
     * @return ApiResponse<StripePaymentIntent?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun getStripePaymentIntentWithHttpInfo(sessionID: java.util.UUID, useStripeSdk: kotlin.Boolean?, returnUrl: kotlin.String?) : ApiResponse<StripePaymentIntent?> {
        val localVariableConfig = getStripePaymentIntentRequestConfig(sessionID = sessionID, useStripeSdk = useStripeSdk, returnUrl = returnUrl)

        return request<Unit, StripePaymentIntent>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation getStripePaymentIntent
     *
     * @param sessionID 
     * @param useStripeSdk  (optional)
     * @param returnUrl  (optional)
     * @return RequestConfig
     */
    fun getStripePaymentIntentRequestConfig(sessionID: java.util.UUID, useStripeSdk: kotlin.Boolean?, returnUrl: kotlin.String?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                if (useStripeSdk != null) {
                    put("use_stripe_sdk", listOf(useStripeSdk.toString()))
                }
                if (returnUrl != null) {
                    put("return_url", listOf(returnUrl.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/checkout/sessions/{sessionID}/stripe/payment/intent/".replace("{"+"sessionID"+"}", encodeURIComponent(sessionID.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * Cloud payments auth
     * 
     * @param sessionID 
     * @param createCloudPaymentsAuth 
     * @return CloudPaymentsAuth
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun processCloudPaymentsAuth(sessionID: java.util.UUID, createCloudPaymentsAuth: CreateCloudPaymentsAuth) : CloudPaymentsAuth {
        val localVarResponse = processCloudPaymentsAuthWithHttpInfo(sessionID = sessionID, createCloudPaymentsAuth = createCloudPaymentsAuth)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as CloudPaymentsAuth
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
     * Cloud payments auth
     * 
     * @param sessionID 
     * @param createCloudPaymentsAuth 
     * @return ApiResponse<CloudPaymentsAuth?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun processCloudPaymentsAuthWithHttpInfo(sessionID: java.util.UUID, createCloudPaymentsAuth: CreateCloudPaymentsAuth) : ApiResponse<CloudPaymentsAuth?> {
        val localVariableConfig = processCloudPaymentsAuthRequestConfig(sessionID = sessionID, createCloudPaymentsAuth = createCloudPaymentsAuth)

        return request<CreateCloudPaymentsAuth, CloudPaymentsAuth>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation processCloudPaymentsAuth
     *
     * @param sessionID 
     * @param createCloudPaymentsAuth 
     * @return RequestConfig
     */
    fun processCloudPaymentsAuthRequestConfig(sessionID: java.util.UUID, createCloudPaymentsAuth: CreateCloudPaymentsAuth) : RequestConfig<CreateCloudPaymentsAuth> {
        val localVariableBody = createCloudPaymentsAuth
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/checkout/sessions/{sessionID}/cloud-payments/auth/".replace("{"+"sessionID"+"}", encodeURIComponent(sessionID.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * Cloud payments post3ds
     * 
     * @param sessionID 
     * @param createCloudPaymentsPost3ds 
     * @return CloudPaymentsPost3ds
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun processCloudPaymentsPost3ds(sessionID: java.util.UUID, createCloudPaymentsPost3ds: CreateCloudPaymentsPost3ds) : CloudPaymentsPost3ds {
        val localVarResponse = processCloudPaymentsPost3dsWithHttpInfo(sessionID = sessionID, createCloudPaymentsPost3ds = createCloudPaymentsPost3ds)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as CloudPaymentsPost3ds
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
     * Cloud payments post3ds
     * 
     * @param sessionID 
     * @param createCloudPaymentsPost3ds 
     * @return ApiResponse<CloudPaymentsPost3ds?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun processCloudPaymentsPost3dsWithHttpInfo(sessionID: java.util.UUID, createCloudPaymentsPost3ds: CreateCloudPaymentsPost3ds) : ApiResponse<CloudPaymentsPost3ds?> {
        val localVariableConfig = processCloudPaymentsPost3dsRequestConfig(sessionID = sessionID, createCloudPaymentsPost3ds = createCloudPaymentsPost3ds)

        return request<CreateCloudPaymentsPost3ds, CloudPaymentsPost3ds>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation processCloudPaymentsPost3ds
     *
     * @param sessionID 
     * @param createCloudPaymentsPost3ds 
     * @return RequestConfig
     */
    fun processCloudPaymentsPost3dsRequestConfig(sessionID: java.util.UUID, createCloudPaymentsPost3ds: CreateCloudPaymentsPost3ds) : RequestConfig<CreateCloudPaymentsPost3ds> {
        val localVariableBody = createCloudPaymentsPost3ds
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/checkout/sessions/{sessionID}/cloud-payments/post3ds/".replace("{"+"sessionID"+"}", encodeURIComponent(sessionID.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}
