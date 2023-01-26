# Kotlin client library for ForestVPN API

ForestVPN - Fast, secure, and modern VPN. It offers Distributed Computing, Crypto Mining, P2P, Ad Blocking, TOR over VPN,
30+ locations, and a free version with unlimited data.

For more information, please visit [https://forestvpn.com/](https://forestvpn.com/)

## Requires

* Kotlin 1.6.10
* Gradle 7.5

## Build

First, create the gradle wrapper script:

```
gradle wrapper
```

Then, run:

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in OpenAPI definitions.
* Implementation of ApiClient is intended to reduce method counts, specifically to benefit Android targets.

<a name="documentation-for-api-endpoints"></a>

## Documentation for API Endpoints

All URIs are relative to *https://api.forestvpn.com/v2*

 Class                       | Method                                                                                                       | HTTP request                                                       | Description                                                                    
-----------------------------|--------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------|--------------------------------------------------------------------------------
 *AdsForestVPNAPI*           | [**createAdUnitRequestLog**](docs/AdsForestVPNAPI.md#createadunitrequestlog)                                 | **POST** /ads/request-logs/                                        | Create ad unit request log                                                     
 *AdsForestVPNAPI*           | [**listAdPlacements**](docs/AdsForestVPNAPI.md#listadplacements)                                             | **GET** /ads/placements/                                           | Get ad placement list                                                          
 *AnalyticsForestVPNAPI*     | [**getDataUsageStats**](docs/AnalyticsForestVPNAPI.md#getdatausagestats)                                     | **GET** /analytics/data-usage/                                     | Data Usage Stats                                                               
 *AppForestVPNAPI*           | [**getCurrentUserDevice**](docs/AppForestVPNAPI.md#getcurrentuserdevice)                                     | **GET** /app/devices/current/                                      | Get user device info                                                           
 *AppForestVPNAPI*           | [**updateCurrentUserDevice**](docs/AppForestVPNAPI.md#updatecurrentuserdevice)                               | **PATCH** /app/devices/current/                                    | Update user device                                                             
 *AppleForestVPNAPI*         | [**verifyAppStoreReceipt**](docs/AppleForestVPNAPI.md#verifyappstorereceipt)                                 | **POST** /purchase/apple/verify/                                   | App store receipt verification                                                 
 *AuthForestVPNAPI*          | [**loginToken**](docs/AuthForestVPNAPI.md#logintoken)                                                        | **POST** /auth/token/login/                                        | Login with JWT token                                                           
 *AuthForestVPNAPI*          | [**migrateLegacyAuth**](docs/AuthForestVPNAPI.md#migratelegacyauth)                                          | **GET** /legacy/auth/                                              | Legacy auth migration                                                          
 *AuthForestVPNAPI*          | [**obtainToken**](docs/AuthForestVPNAPI.md#obtaintoken)                                                      | **GET** /auth/token/obtain/                                        | Obtain JWT token                                                               
 *AuthForestVPNAPI*          | [**updateUserProfile**](docs/AuthForestVPNAPI.md#updateuserprofile)                                          | **PATCH** /auth/profile/                                           | Update profile                                                                 
 *AuthForestVPNAPI*          | [**userProfile**](docs/AuthForestVPNAPI.md#userprofile)                                                      | **GET** /auth/profile/                                             | Profile                                                                        
 *AuthForestVPNAPI*          | [**whoAmI**](docs/AuthForestVPNAPI.md#whoami)                                                                | **GET** /auth/whoami/                                              | Who am I                                                                       
 *BillingForestVPNAPI*       | [**cancelSubscription**](docs/BillingForestVPNAPI.md#cancelsubscription)                                     | **DELETE** /billing/subscriptions/{subscriptionID}/                | Cancel subscription                                                            
 *BillingForestVPNAPI*       | [**createPaymentMethodStripeSetupIntent**](docs/BillingForestVPNAPI.md#createpaymentmethodstripesetupintent) | **POST** /billing/payment-methods/stripe/setup-intents/            | Create stripe's setup intent for add new payment method.                       
 *BillingForestVPNAPI*       | [**createSubscription**](docs/BillingForestVPNAPI.md#createsubscription)                                     | **POST** /billing/subscriptions/                                   | Create subscription                                                            
 *BillingForestVPNAPI*       | [**deletePaymentMethod**](docs/BillingForestVPNAPI.md#deletepaymentmethod)                                   | **DELETE** /billing/payment-methods/{paymentMethodID}/             | Delete payment method                                                          
 *BillingForestVPNAPI*       | [**getBillingAccount**](docs/BillingForestVPNAPI.md#getbillingaccount)                                       | **GET** /billing/account/                                          | Billing account info                                                           
 *BillingForestVPNAPI*       | [**getBillingBundle**](docs/BillingForestVPNAPI.md#getbillingbundle)                                         | **GET** /billing/bundles/{bundleID}/                               | Bundle info                                                                    
 *BillingForestVPNAPI*       | [**getBillingPaymentOption**](docs/BillingForestVPNAPI.md#getbillingpaymentoption)                           | **GET** /billing/payment-options/{paymentOptionID}/                | Payment option info                                                            
 *BillingForestVPNAPI*       | [**getBillingProduct**](docs/BillingForestVPNAPI.md#getbillingproduct)                                       | **GET** /billing/products/{productID}/                             | Product info                                                                   
 *BillingForestVPNAPI*       | [**getPaymentMethod**](docs/BillingForestVPNAPI.md#getpaymentmethod)                                         | **GET** /billing/payment-methods/{paymentMethodID}/                | Payment method info                                                            
 *BillingForestVPNAPI*       | [**getSubscription**](docs/BillingForestVPNAPI.md#getsubscription)                                           | **GET** /billing/subscriptions/{subscriptionID}/                   | Subscription info                                                              
 *BillingForestVPNAPI*       | [**getSubscriptionItem**](docs/BillingForestVPNAPI.md#getsubscriptionitem)                                   | **GET** /billing/subscription-items/{subscriptionItemID}/          | Subscription item info                                                         
 *BillingForestVPNAPI*       | [**listBillingBundles**](docs/BillingForestVPNAPI.md#listbillingbundles)                                     | **GET** /billing/bundles/                                          | Billing bundles list                                                           
 *BillingForestVPNAPI*       | [**listBillingFeatures**](docs/BillingForestVPNAPI.md#listbillingfeatures)                                   | **GET** /billing/features/                                         | Billing feature list                                                           
 *BillingForestVPNAPI*       | [**listBillingPaymentOptions**](docs/BillingForestVPNAPI.md#listbillingpaymentoptions)                       | **GET** /billing/payment-options/                                  | Billing payment option list                                                    
 *BillingForestVPNAPI*       | [**listBillingProducts**](docs/BillingForestVPNAPI.md#listbillingproducts)                                   | **GET** /billing/products/                                         | Billing products list                                                          
 *BillingForestVPNAPI*       | [**listPaymentMethods**](docs/BillingForestVPNAPI.md#listpaymentmethods)                                     | **GET** /billing/payment-methods/                                  | Payment method list                                                            
 *BillingForestVPNAPI*       | [**listSubscriptionItems**](docs/BillingForestVPNAPI.md#listsubscriptionitems)                               | **GET** /billing/subscription-items/                               | Subscription items list                                                        
 *BillingForestVPNAPI*       | [**listSubscriptions**](docs/BillingForestVPNAPI.md#listsubscriptions)                                       | **GET** /billing/subscriptions/                                    | Billing subscriptions list                                                     
 *BillingForestVPNAPI*       | [**reactivateSubscription**](docs/BillingForestVPNAPI.md#reactivatesubscription)                             | **POST** /billing/subscriptions/{subscriptionID}/reactivate/       | Reactivate subscription                                                        
 *BillingForestVPNAPI*       | [**updateBillingAccount**](docs/BillingForestVPNAPI.md#updatebillingaccount)                                 | **PATCH** /billing/account/                                        | Update billing account                                                         
 *BillingForestVPNAPI*       | [**updateSubscriptionItem**](docs/BillingForestVPNAPI.md#updatesubscriptionitem)                             | **PATCH** /billing/subscription-items/{subscriptionItemID}/        | Update subscription item                                                       
 *CheckoutForestVPNAPI*      | [**applyCouponCheckoutSession**](docs/CheckoutForestVPNAPI.md#applycouponcheckoutsession)                    | **POST** /checkout/sessions/{sessionID}/apply_coupon/              | Apply coupon to session                                                        
 *CheckoutForestVPNAPI*      | [**createCheckoutSession**](docs/CheckoutForestVPNAPI.md#createcheckoutsession)                              | **POST** /checkout/sessions/                                       | Create checkout session                                                        
 *CheckoutForestVPNAPI*      | [**createWaitListRequest**](docs/CheckoutForestVPNAPI.md#createwaitlistrequest)                              | **POST** /checkout/wait-list/                                      | Create request to add country in wait list                                     
 *CheckoutForestVPNAPI*      | [**expireCheckoutSession**](docs/CheckoutForestVPNAPI.md#expirecheckoutsession)                              | **POST** /checkout/sessions/{sessionID}/expire/                    | Expire checkout session                                                        
 *CheckoutForestVPNAPI*      | [**getCheckoutSession**](docs/CheckoutForestVPNAPI.md#getcheckoutsession)                                    | **GET** /checkout/sessions/{sessionID}/                            | Checkout session details                                                       
 *CheckoutForestVPNAPI*      | [**getStripeCheckoutSession**](docs/CheckoutForestVPNAPI.md#getstripecheckoutsession)                        | **GET** /checkout/sessions/{sessionID}/stripe/checkout/session/    | Stripe checkout session details                                                
 *CheckoutForestVPNAPI*      | [**getStripePaymentIntent**](docs/CheckoutForestVPNAPI.md#getstripepaymentintent)                            | **GET** /checkout/sessions/{sessionID}/stripe/payment/intent/      | Stripe payment intent details                                                  
 *CheckoutForestVPNAPI*      | [**processCloudPaymentsAuth**](docs/CheckoutForestVPNAPI.md#processcloudpaymentsauth)                        | **POST** /checkout/sessions/{sessionID}/cloud-payments/auth/       | Cloud payments auth                                                            
 *CheckoutForestVPNAPI*      | [**processCloudPaymentsPost3ds**](docs/CheckoutForestVPNAPI.md#processcloudpaymentspost3ds)                  | **POST** /checkout/sessions/{sessionID}/cloud-payments/post3ds/    | Cloud payments post3ds                                                         
 *DeviceForestVPNAPI*        | [**createDevice**](docs/DeviceForestVPNAPI.md#createdevice)                                                  | **POST** /devices/                                                 | Create new device                                                              
 *DeviceForestVPNAPI*        | [**createDevicePortForwarding**](docs/DeviceForestVPNAPI.md#createdeviceportforwarding)                      | **POST** /devices/{deviceID}/port-forwarding/                      | Create new device port forwarding                                              
 *DeviceForestVPNAPI*        | [**deleteDevice**](docs/DeviceForestVPNAPI.md#deletedevice)                                                  | **DELETE** /devices/{deviceID}/                                    | Delete Device                                                                  
 *DeviceForestVPNAPI*        | [**deleteDevicePortForwarding**](docs/DeviceForestVPNAPI.md#deletedeviceportforwarding)                      | **DELETE** /devices/{deviceID}/port-forwarding/{portForwardingID}/ | Delete Device's Port Forwarding                                                
 *DeviceForestVPNAPI*        | [**getDevice**](docs/DeviceForestVPNAPI.md#getdevice)                                                        | **GET** /devices/{deviceID}/                                       | Device Info                                                                    
 *DeviceForestVPNAPI*        | [**getDeviceStats**](docs/DeviceForestVPNAPI.md#getdevicestats)                                              | **GET** /devices/{deviceID}/stats/{statsID}/                       | Device's stats detail                                                          
 *DeviceForestVPNAPI*        | [**getDeviceWireGuard**](docs/DeviceForestVPNAPI.md#getdevicewireguard)                                      | **GET** /devices/{deviceID}/wireguards/{wireGuardID}/              | Device's wireguard profile detail                                              
 *DeviceForestVPNAPI*        | [**listDeviceBindings**](docs/DeviceForestVPNAPI.md#listdevicebindings)                                      | **GET** /devices/{deviceID}/bindings/                              | Device bindings                                                                
 *DeviceForestVPNAPI*        | [**listDeviceConnectionModes**](docs/DeviceForestVPNAPI.md#listdeviceconnectionmodes)                        | **GET** /devices/{deviceID}/connection-modes/                      | Device connection modes                                                        
 *DeviceForestVPNAPI*        | [**listDeviceDetailStats**](docs/DeviceForestVPNAPI.md#listdevicedetailstats)                                | **GET** /devices/{deviceID}/detail-stats/                          | Device's detail stats list                                                     
 *DeviceForestVPNAPI*        | [**listDevicePortForwardings**](docs/DeviceForestVPNAPI.md#listdeviceportforwardings)                        | **GET** /devices/{deviceID}/port-forwarding/                       | Device Port Forwarding List                                                    
 *DeviceForestVPNAPI*        | [**listDeviceStats**](docs/DeviceForestVPNAPI.md#listdevicestats)                                            | **GET** /devices/{deviceID}/stats/                                 | Device's stats list                                                            
 *DeviceForestVPNAPI*        | [**listDeviceWireGuardPeers**](docs/DeviceForestVPNAPI.md#listdevicewireguardpeers)                          | **GET** /devices/{deviceID}/wireguards/{wireGuardID}/peers/        | Device's wireguard peers                                                       
 *DeviceForestVPNAPI*        | [**listDeviceWireGuards**](docs/DeviceForestVPNAPI.md#listdevicewireguards)                                  | **GET** /devices/{deviceID}/wireguards/                            | Device's wireguard profiles list                                               
 *DeviceForestVPNAPI*        | [**listDevices**](docs/DeviceForestVPNAPI.md#listdevices)                                                    | **GET** /devices/                                                  | Device List                                                                    
 *DeviceForestVPNAPI*        | [**updateDevice**](docs/DeviceForestVPNAPI.md#updatedevice)                                                  | **PATCH** /devices/{deviceID}/                                     | Update device properties                                                       
 *DeviceForestVPNAPI*        | [**updateDevicePortForwarding**](docs/DeviceForestVPNAPI.md#updatedeviceportforwarding)                      | **PATCH** /devices/{deviceID}/port-forwarding/{portForwardingID}/  | Update device's port forwarding                                                
 *FcmForestVPNAPI*           | [**createFCMDevice**](docs/FcmForestVPNAPI.md#createfcmdevice)                                               | **POST** /notification/fcm/                                        | Device registration for push notification through out Firebase Cloud Messaging 
 *FcmForestVPNAPI*           | [**deleteFCMDevice**](docs/FcmForestVPNAPI.md#deletefcmdevice)                                               | **DELETE** /notification/fcm/{registrationID}/                     | Delete fcm device                                                              
 *FcmForestVPNAPI*           | [**getFCMDevice**](docs/FcmForestVPNAPI.md#getfcmdevice)                                                     | **GET** /notification/fcm/{registrationID}/                        | Device info                                                                    
 *FcmForestVPNAPI*           | [**updateFCMDevice**](docs/FcmForestVPNAPI.md#updatefcmdevice)                                               | **PATCH** /notification/fcm/{registrationID}/                      | Update device fcm properties                                                   
 *FriendshipForestVPNAPI*    | [**acceptFriendshipInvitation**](docs/FriendshipForestVPNAPI.md#acceptfriendshipinvitation)                  | **PATCH** /friendship/invitations/{code}/                          | Accept friendship invitation                                                   
 *FriendshipForestVPNAPI*    | [**createFriendshipInvitation**](docs/FriendshipForestVPNAPI.md#createfriendshipinvitation)                  | **POST** /friendship/invitations/                                  | Create friendship invitation                                                   
 *FriendshipForestVPNAPI*    | [**deleteFriend**](docs/FriendshipForestVPNAPI.md#deletefriend)                                              | **DELETE** /friendship/friends/{id}/                               | Delete friend                                                                  
 *FriendshipForestVPNAPI*    | [**getFriend**](docs/FriendshipForestVPNAPI.md#getfriend)                                                    | **GET** /friendship/friends/{id}/                                  | Friend details                                                                 
 *FriendshipForestVPNAPI*    | [**getFriendshipInvitation**](docs/FriendshipForestVPNAPI.md#getfriendshipinvitation)                        | **GET** /friendship/invitations/{code}/                            | Friendship invitation details                                                  
 *FriendshipForestVPNAPI*    | [**listFriends**](docs/FriendshipForestVPNAPI.md#listfriends)                                                | **GET** /friendship/friends/                                       | Get friends list                                                               
 *FriendshipForestVPNAPI*    | [**rejectFriendshipInvitation**](docs/FriendshipForestVPNAPI.md#rejectfriendshipinvitation)                  | **DELETE** /friendship/invitations/{code}/                         | Reject friendship invitation                                                   
 *GeoForestVPNAPI*           | [**listCountries**](docs/GeoForestVPNAPI.md#listcountries)                                                   | **GET** /geo/countries/                                            | Countries list                                                                 
 *GeoForestVPNAPI*           | [**listCurrencies**](docs/GeoForestVPNAPI.md#listcurrencies)                                                 | **GET** /geo/currencies/                                           | Correncies list                                                                
 *GeoForestVPNAPI*           | [**listLocations**](docs/GeoForestVPNAPI.md#listlocations)                                                   | **GET** /locations/                                                | Location list                                                                  
 *GoogleForestVPNAPI*        | [**verifyPlayStorePurchase**](docs/GoogleForestVPNAPI.md#verifyplaystorepurchase)                            | **POST** /purchase/google/verify/                                  | Play store purchase verification                                               
 *NotificationsForestVPNAPI* | [**getNotificationsUnreadCount**](docs/NotificationsForestVPNAPI.md#getnotificationsunreadcount)             | **GET** /notifications/unread_count/                               | Get unread notifications count                                                 
 *NotificationsForestVPNAPI* | [**listNotifications**](docs/NotificationsForestVPNAPI.md#listnotifications)                                 | **GET** /notifications/all_list/                                   | Get notifications list                                                         
 *NotificationsForestVPNAPI* | [**updateNotificationMarkRead**](docs/NotificationsForestVPNAPI.md#updatenotificationmarkread)               | **GET** /notifications/mark_read/{slug}/                           | Mark notification as read by user                                              
 *NotificationsForestVPNAPI* | [**updateNotificationMarkReadAll**](docs/NotificationsForestVPNAPI.md#updatenotificationmarkreadall)         | **GET** /notifications/mark-all-as-read/                           | Mark all notifications as read by user                                         
 *SupportForestVPNAPI*       | [**createSupportTicket**](docs/SupportForestVPNAPI.md#createsupportticket)                                   | **POST** /support/tickets/                                         | Create support ticket                                                          
 *SupportForestVPNAPI*       | [**getSupportTicketCategory**](docs/SupportForestVPNAPI.md#getsupportticketcategory)                         | **GET** /support/ticket-categories/                                | Get ticket categories                                                          
 *WireguardForestVPNAPI*     | [**getWireGuardPeerInfo**](docs/WireguardForestVPNAPI.md#getwireguardpeerinfo)                               | **GET** /wireguard/peers/{pubKey}/                                 | Wireguard peer info                                                            
 *WireguardForestVPNAPI*     | [**listWireGuardPeers**](docs/WireguardForestVPNAPI.md#listwireguardpeers)                                   | **GET** /wireguard/peers/                                          | Wireguard peers list                                                           

<a name="documentation-for-models"></a>

## Documentation for Models

- [com.forestvpn.api.client.models.AdPlacement](docs/AdPlacement.md)
- [com.forestvpn.api.client.models.AdProvider](docs/AdProvider.md)
- [com.forestvpn.api.client.models.AdReward](docs/AdReward.md)
- [com.forestvpn.api.client.models.AdUnit](docs/AdUnit.md)
- [com.forestvpn.api.client.models.AggregatedDataUsageStats](docs/AggregatedDataUsageStats.md)
- [com.forestvpn.api.client.models.AppStoreReceiptVerificationRequest](docs/AppStoreReceiptVerificationRequest.md)
- [com.forestvpn.api.client.models.BillingAccount](docs/BillingAccount.md)
- [com.forestvpn.api.client.models.BillingFeature](docs/BillingFeature.md)
- [com.forestvpn.api.client.models.Bundle](docs/Bundle.md)
- [com.forestvpn.api.client.models.CheckoutSession](docs/CheckoutSession.md)
- [com.forestvpn.api.client.models.CheckoutSessionProduct](docs/CheckoutSessionProduct.md)
- [com.forestvpn.api.client.models.CloudPaymentsAuth](docs/CloudPaymentsAuth.md)
- [com.forestvpn.api.client.models.CloudPaymentsPost3ds](docs/CloudPaymentsPost3ds.md)
- [com.forestvpn.api.client.models.CloudPaymentsSecure3d](docs/CloudPaymentsSecure3d.md)
- [com.forestvpn.api.client.models.ConnectionMode](docs/ConnectionMode.md)
- [com.forestvpn.api.client.models.Constraint](docs/Constraint.md)
- [com.forestvpn.api.client.models.Country](docs/Country.md)
- [com.forestvpn.api.client.models.CouponCheckoutSession](docs/CouponCheckoutSession.md)
- [com.forestvpn.api.client.models.CreateAdUnitRequestLogRequest](docs/CreateAdUnitRequestLogRequest.md)
- [com.forestvpn.api.client.models.CreateCheckoutSessionProduct](docs/CreateCheckoutSessionProduct.md)
- [com.forestvpn.api.client.models.CreateCheckoutSessionRequest](docs/CreateCheckoutSessionRequest.md)
- [com.forestvpn.api.client.models.CreateCloudPaymentsAuth](docs/CreateCloudPaymentsAuth.md)
- [com.forestvpn.api.client.models.CreateCloudPaymentsPost3ds](docs/CreateCloudPaymentsPost3ds.md)
- [com.forestvpn.api.client.models.CreateCouponCheckoutSession](docs/CreateCouponCheckoutSession.md)
- [com.forestvpn.api.client.models.CreateFCMDeviceRequest](docs/CreateFCMDeviceRequest.md)
- [com.forestvpn.api.client.models.CreateOrUpdateDeviceRequest](docs/CreateOrUpdateDeviceRequest.md)
- [com.forestvpn.api.client.models.CreateOrUpdateDeviceRequestInfo](docs/CreateOrUpdateDeviceRequestInfo.md)
- [com.forestvpn.api.client.models.CreateOrUpdatePortForwardingRequest](docs/CreateOrUpdatePortForwardingRequest.md)
- [com.forestvpn.api.client.models.CreateStripeSetupIntentRequest](docs/CreateStripeSetupIntentRequest.md)
- [com.forestvpn.api.client.models.CreateSubscriptionRequest](docs/CreateSubscriptionRequest.md)
- [com.forestvpn.api.client.models.CreateTokenLogin](docs/CreateTokenLogin.md)
- [com.forestvpn.api.client.models.Currency](docs/Currency.md)
- [com.forestvpn.api.client.models.Device](docs/Device.md)
- [com.forestvpn.api.client.models.DeviceRecord](docs/DeviceRecord.md)
- [com.forestvpn.api.client.models.DeviceStats](docs/DeviceStats.md)
- [com.forestvpn.api.client.models.DeviceType](docs/DeviceType.md)
- [com.forestvpn.api.client.models.Discount](docs/Discount.md)
- [com.forestvpn.api.client.models.Environment](docs/Environment.md)
- [com.forestvpn.api.client.models.Error](docs/Error.md)
- [com.forestvpn.api.client.models.FCMDevice](docs/FCMDevice.md)
- [com.forestvpn.api.client.models.Friendship](docs/Friendship.md)
- [com.forestvpn.api.client.models.FriendshipInvitation](docs/FriendshipInvitation.md)
- [com.forestvpn.api.client.models.LegacyAuthMigrationToken](docs/LegacyAuthMigrationToken.md)
- [com.forestvpn.api.client.models.Location](docs/Location.md)
- [com.forestvpn.api.client.models.NetworkService](docs/NetworkService.md)
- [com.forestvpn.api.client.models.Notification](docs/Notification.md)
- [com.forestvpn.api.client.models.NotificationAllList](docs/NotificationAllList.md)
- [com.forestvpn.api.client.models.NotificationUnreadCount](docs/NotificationUnreadCount.md)
- [com.forestvpn.api.client.models.PaymentMethod](docs/PaymentMethod.md)
- [com.forestvpn.api.client.models.PaymentMethodCard](docs/PaymentMethodCard.md)
- [com.forestvpn.api.client.models.PaymentMethodType](docs/PaymentMethodType.md)
- [com.forestvpn.api.client.models.PaymentOption](docs/PaymentOption.md)
- [com.forestvpn.api.client.models.PlayStorePurchaseVerificationRequest](docs/PlayStorePurchaseVerificationRequest.md)
- [com.forestvpn.api.client.models.PortForwarding](docs/PortForwarding.md)
- [com.forestvpn.api.client.models.Price](docs/Price.md)
- [com.forestvpn.api.client.models.Product](docs/Product.md)
- [com.forestvpn.api.client.models.ProductWithoutPrice](docs/ProductWithoutPrice.md)
- [com.forestvpn.api.client.models.Recurring](docs/Recurring.md)
- [com.forestvpn.api.client.models.Server](docs/Server.md)
- [com.forestvpn.api.client.models.StripeCheckoutSession](docs/StripeCheckoutSession.md)
- [com.forestvpn.api.client.models.StripePaymentIntent](docs/StripePaymentIntent.md)
- [com.forestvpn.api.client.models.StripeSetupIntent](docs/StripeSetupIntent.md)
- [com.forestvpn.api.client.models.Subscription](docs/Subscription.md)
- [com.forestvpn.api.client.models.SubscriptionItem](docs/SubscriptionItem.md)
- [com.forestvpn.api.client.models.SubscriptionSource](docs/SubscriptionSource.md)
- [com.forestvpn.api.client.models.SubscriptionStatus](docs/SubscriptionStatus.md)
- [com.forestvpn.api.client.models.TicketCategory](docs/TicketCategory.md)
- [com.forestvpn.api.client.models.TokenLogin](docs/TokenLogin.md)
- [com.forestvpn.api.client.models.TokenObtain](docs/TokenObtain.md)
- [com.forestvpn.api.client.models.UpdateFCMDeviceRequest](docs/UpdateFCMDeviceRequest.md)
- [com.forestvpn.api.client.models.UpdateUserDeviceRequest](docs/UpdateUserDeviceRequest.md)
- [com.forestvpn.api.client.models.User](docs/User.md)
- [com.forestvpn.api.client.models.UserDevice](docs/UserDevice.md)
- [com.forestvpn.api.client.models.WireGuard](docs/WireGuard.md)
- [com.forestvpn.api.client.models.WireGuardPeer](docs/WireGuardPeer.md)
- [com.forestvpn.api.client.models.WireGuardPeerDevice](docs/WireGuardPeerDevice.md)
- [com.forestvpn.api.client.models.WireGuardPeerInfo](docs/WireGuardPeerInfo.md)
- [com.forestvpn.api.client.models.WireGuardPeerUser](docs/WireGuardPeerUser.md)

<a name="documentation-for-authorization"></a>

## Documentation for Authorization

<a name="bearerAuth"></a>

### bearerAuth

- **Type**: HTTP basic authentication

<a name="wireguardAuth"></a>

### wireguardAuth

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header

## Author

- ForestVPN.com [Free VPN](https://forestvpn.com) for all
- support@forestvpn.com
