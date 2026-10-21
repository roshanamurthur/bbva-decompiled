package com.bbva.tohu.android.product.valkyria.sdk.services.impl;

import android.util.Base64;
import androidx.annotation.NonNull;
import com.bbva.tohu.android.core.exceptions.CryptoInitException;
import com.bbva.tohu.android.core.exceptions.LoginNeededException;
import com.bbva.tohu.android.core.exceptions.NetworkNotPresentException;
import com.bbva.tohu.android.core.exceptions.backend.Tohu428Exception;
import com.bbva.tohu.android.core.exceptions.backend.TohuBackendException;
import com.bbva.tohu.android.core.request.backend.CypheredRequest;
import com.bbva.tohu.android.core.response.Response;
import com.bbva.tohu.android.core.response.backend.CypheredResponse;
import com.bbva.tohu.android.core.utils.DeviceInfo;
import com.bbva.tohu.android.core.utils.HexUtils;
import com.bbva.tohu.android.core.utils.Integrity;
import com.bbva.tohu.android.core.utils.LogTohu;
import com.bbva.tohu.android.core.utils.PlatformPreferencesManager;
import com.bbva.tohu.android.product.valkyria.sdk.constants.ProviderType;
import com.bbva.tohu.android.product.valkyria.sdk.export.requests.Card;
import com.bbva.tohu.android.product.valkyria.sdk.export.responses.TransactionDetailsResponse;
import com.bbva.tohu.android.product.valkyria.sdk.export.responses.TransactionHistoryResponse;
import com.bbva.tohu.android.product.valkyria.sdk.managers.CryptoKeyManager;
import com.bbva.tohu.android.product.valkyria.sdk.model.Token;
import com.bbva.tohu.android.product.valkyria.sdk.request.DeleteTokenRequest;
import com.bbva.tohu.android.product.valkyria.sdk.request.DeviceDeleteRequest;
import com.bbva.tohu.android.product.valkyria.sdk.request.ProvisionResult;
import com.bbva.tohu.android.product.valkyria.sdk.request.backend.ConfirmReplenishRequest;
import com.bbva.tohu.android.product.valkyria.sdk.request.backend.DeviceStatusRequest;
import com.bbva.tohu.android.product.valkyria.sdk.request.backend.DigitizeRequest;
import com.bbva.tohu.android.product.valkyria.sdk.request.backend.GetTokenRequest;
import com.bbva.tohu.android.product.valkyria.sdk.request.backend.GetTransactionHistoryRequest;
import com.bbva.tohu.android.product.valkyria.sdk.request.backend.NotifyProvisionResultRequest;
import com.bbva.tohu.android.product.valkyria.sdk.request.backend.PanInfo;
import com.bbva.tohu.android.product.valkyria.sdk.request.backend.ReplenishRequest;
import com.bbva.tohu.android.product.valkyria.sdk.request.backend.SuspendTokenRequest;
import com.bbva.tohu.android.product.valkyria.sdk.response.ConfirmReplenishResponse;
import com.bbva.tohu.android.product.valkyria.sdk.response.DeleteTokenResponse;
import com.bbva.tohu.android.product.valkyria.sdk.response.DeviceDeleteResponse;
import com.bbva.tohu.android.product.valkyria.sdk.response.DigitizeResponse;
import com.bbva.tohu.android.product.valkyria.sdk.response.GetTokenResponse;
import com.bbva.tohu.android.product.valkyria.sdk.response.NotifyProvisionResultResponse;
import com.bbva.tohu.android.product.valkyria.sdk.response.backend.Digitize;
import com.bbva.tohu.android.product.valkyria.sdk.response.backend.GetToken;
import com.bbva.tohu.android.product.valkyria.sdk.response.backend.ReplenishResponseData;
import com.bbva.tohu.android.product.valkyria.sdk.response.backend.TransactionDetails;
import com.bbva.tohu.android.product.valkyria.sdk.response.backend.TransactionHistoryResponseData;
import com.bbva.tohu.android.product.valkyria.sdk.services.BackendService;
import com.bbva.tohu.android.product.valkyria.sdk.services.EncoderService;
import com.bbva.tohu.android.product.valkyria.sdk.services.HubHttpClient;
import com.bbva.tohu.android.product.valkyria.sdk.services.ProviderService;
import com.bbva.tohu.android.product.valkyria.sdk.services.SdkCryptoServiceCaas;
import com.bbva.tohu.android.product.valkyria.sdk.services.SerializerService;
import com.bbva.tohu.android.product.valkyria.sdk.utils.CardUtils;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class BackendServiceDefaultImpl implements BackendService {
    public static final String AUTHORIZATION_HEADER = "Authorization";
    public static final String DEVICE_CODE_HEADER = "device_code";
    public static final String DEVICE_NAME_HEADER = "device_name";
    public static final String JWS = "icJWS";
    public static final String JWT_HEADER = "jwt ";
    public static final String OS_VERSION_HEADER = "os_version";
    public static final String PUSH_TOKEN_HEADER = "push_token";
    public static final String REPLENISH_REASON_HEADER = "x-tohu-sdk-replenish-reason";
    private static final String TAG = "BackendServiceDefaultImpl";
    private CryptoKeyManager cryptoKeyManager;
    private DeviceInfo deviceInfo;
    private EncoderService encoderService;
    private HubHttpClient httpClient;
    private Integrity integrity;
    private PlatformPreferencesManager platformPreferencesManager;
    private ProviderService providerService;
    private SdkCryptoServiceCaas sdkCryptoServiceCaas;
    private SerializerService serializerService;

    public BackendServiceDefaultImpl(HubHttpClient hubHttpClient, SerializerService serializerService, CryptoKeyManager cryptoKeyManager, SdkCryptoServiceCaas sdkCryptoServiceCaas, EncoderService encoderService, ProviderService providerService, Integrity integrity, DeviceInfo deviceInfo, PlatformPreferencesManager platformPreferencesManager) {
        this.httpClient = hubHttpClient;
        this.serializerService = serializerService;
        this.cryptoKeyManager = cryptoKeyManager;
        this.sdkCryptoServiceCaas = sdkCryptoServiceCaas;
        this.encoderService = encoderService;
        this.providerService = providerService;
        this.integrity = integrity;
        this.deviceInfo = deviceInfo;
        this.platformPreferencesManager = platformPreferencesManager;
    }

    private TransactionHistoryResponse buildTransactionHistoryResponse(TransactionHistoryResponseData transactionHistoryResponseData) {
        TransactionHistoryResponse transactionHistoryResponse = new TransactionHistoryResponse();
        ArrayList arrayList = new ArrayList();
        for (TransactionDetails transactionDetails : transactionHistoryResponseData.getTransactionsDetails()) {
            TransactionDetailsResponse transactionDetailsResponse = new TransactionDetailsResponse();
            transactionDetailsResponse.setAmount(transactionDetails.getAmount());
            transactionDetailsResponse.setCurrencyCode(transactionDetails.getCurrencyCode());
            transactionDetailsResponse.setMerchantName(transactionDetails.getMerchantName());
            transactionDetailsResponse.setTransactionDate(transactionDetails.getTransactionDate());
            transactionDetailsResponse.setTokenId(transactionDetails.getTokenId());
            transactionDetailsResponse.setTransactionStatus(transactionDetails.getTransactionStatus());
            transactionDetailsResponse.setTransactionType(transactionDetails.getTransactionType());
            arrayList.add(transactionDetailsResponse);
        }
        transactionHistoryResponse.setTransactionsDetails(arrayList);
        return transactionHistoryResponse;
    }

    private String callGoogleSafetyNet(String str) {
        return this.integrity.getAttestJWS(str);
    }

    private Map<String, String> createAuthHeaders(String str) {
        HashMap map = new HashMap();
        map.put("Authorization", "jwt ".concat(str));
        LogTohu.d(TAG, "JWT: %s", str);
        return map;
    }

    private Map<String, String> createDeviceHubHeaders() {
        HashMap map = new HashMap();
        String deviceCode = this.deviceInfo.getDeviceCode();
        String deviceName = this.deviceInfo.getDeviceName();
        String osVersion = this.deviceInfo.getOsVersion();
        String pushToken = this.platformPreferencesManager.getPushToken();
        map.put(DEVICE_CODE_HEADER, deviceCode);
        map.put("device_name", deviceName);
        map.put(OS_VERSION_HEADER, osVersion);
        if (pushToken != null && !pushToken.isEmpty()) {
            map.put(PUSH_TOKEN_HEADER, pushToken);
        }
        return map;
    }

    private CypheredRequest createDigitizeCypheredRequest(List<Card> list) throws CryptoInitException {
        return this.cryptoKeyManager.encryptTransportWithSecChannelPayment(this.serializerService.serialize(createDigitizeRequest(list)));
    }

    @NonNull
    private DigitizeRequest createDigitizeRequest(List<Card> list) throws CryptoInitException {
        DigitizeRequest digitizeRequest = new DigitizeRequest();
        ArrayList arrayList = new ArrayList();
        for (Card card : list) {
            com.bbva.tohu.android.product.valkyria.sdk.request.backend.Card card2 = new com.bbva.tohu.android.product.valkyria.sdk.request.backend.Card();
            card2.setCardUniqueReference(card.getCardUniqueReference());
            card2.setExpiryMonth(card.getExpiryMonth());
            card2.setExpiryYear(card.getExpiryYear());
            card2.setPanInfo(createPanInfo(card));
            arrayList.add(card2);
        }
        digitizeRequest.setCards(arrayList);
        return digitizeRequest;
    }

    private Response<Digitize> createDigitizeResponse(CypheredResponse cypheredResponse) throws CryptoInitException {
        DigitizeResponse digitizeResponse = (DigitizeResponse) this.serializerService.deserialize(this.cryptoKeyManager.decryptTransportWithSecChannelPayment(cypheredResponse), DigitizeResponse.class);
        LogTohu.d(TAG, "Digitize response : \n%s", digitizeResponse);
        return new Response<>(digitizeResponse.getData(), digitizeResponse.getResult());
    }

    private CypheredRequest createGetTokenCypheredRequest(String str) throws CryptoInitException {
        GetTokenRequest getTokenRequest = new GetTokenRequest();
        getTokenRequest.setCardUniqueReference(str);
        LogTohu.d(TAG, "Get Token request : \n %s", getTokenRequest);
        return this.cryptoKeyManager.encryptTransportWithSecChannelPayment(this.serializerService.serialize(getTokenRequest));
    }

    private Response<GetToken> createGetTokenResponse(CypheredResponse cypheredResponse) throws CryptoInitException {
        GetTokenResponse getTokenResponse = (GetTokenResponse) this.serializerService.deserialize(this.cryptoKeyManager.decryptTransportWithSecChannelPayment(cypheredResponse), GetTokenResponse.class);
        LogTohu.d(TAG, "Get Token response : \n%s", getTokenResponse);
        return new Response<>(getTokenResponse.getData(), getTokenResponse.getResult());
    }

    private NotifyProvisionResultRequest createNotifyProvisionResultRequest(ProvisionResult provisionResult) {
        NotifyProvisionResultRequest notifyProvisionResultRequest = new NotifyProvisionResultRequest();
        notifyProvisionResultRequest.setErrorCode(provisionResult.getErrorCode());
        notifyProvisionResultRequest.setErrorDescription(provisionResult.getErrorDescription());
        notifyProvisionResultRequest.setCardUniqueReference(provisionResult.getCardUniqueReference());
        notifyProvisionResultRequest.setResult(provisionResult.getResult());
        return notifyProvisionResultRequest;
    }

    @NonNull
    private PanInfo createPanInfo(Card card) throws CryptoInitException {
        PanInfo panInfo = new PanInfo();
        panInfo.setRange(CardUtils.getRange(card.getPan()));
        panInfo.setPanTrunc(CardUtils.truncatePan(card.getPan()));
        panInfo.setRaw(this.encoderService.base64urlFromBytes(this.cryptoKeyManager.encryptWithSecContent(card.getPan().getBytes(StandardCharsets.UTF_8))));
        panInfo.setMdes(getCypheredProviderJson(card, ProviderType.PROVIDER_ID_MASTERCARD));
        panInfo.setVts(getCypheredProviderJson(card, ProviderType.PROVIDER_ID_VISA));
        return panInfo;
    }

    private Map<String, String> createTohuBasicHeaders(String str) {
        HashMap map = new HashMap();
        map.putAll(createAuthHeaders(str));
        map.putAll(createDeviceHubHeaders());
        return map;
    }

    private Map<String, String> createTohuCustomHeaders() {
        HashMap map = new HashMap();
        map.putAll(createDeviceHubHeaders());
        return map;
    }

    private String getCypheredProviderJson(Card card, String str) throws CryptoInitException {
        return this.encoderService.base64urlFromBytes(this.cryptoKeyManager.encryptWithSecContent(this.providerService.getPanInfoJsonByProvider(card, str).getBytes(StandardCharsets.UTF_8)));
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.services.BackendService
    public ConfirmReplenishResponse confirmReplenish(ConfirmReplenishRequest confirmReplenishRequest) throws TohuBackendException, NetworkNotPresentException, CryptoInitException {
        String str = TAG;
        LogTohu.d(str, "ConfirmReplenishRequest request :\n%s", confirmReplenishRequest);
        ConfirmReplenishResponse confirmReplenishResponse = (ConfirmReplenishResponse) this.sdkCryptoServiceCaas.decryptTransportWithSecChannelAndDeserialize(this.httpClient.callConfirmReplenish(this.sdkCryptoServiceCaas.serializeAndEncryptTransportWithSecChannel(confirmReplenishRequest), createTohuCustomHeaders()), ConfirmReplenishResponse.class);
        LogTohu.d(str, "ConfirmReplenishResponse response : \n%s", confirmReplenishResponse);
        return confirmReplenishResponse;
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.services.BackendService
    public DeviceDeleteResponse deleteDevice(String str, String str2) throws LoginNeededException, TohuBackendException, NetworkNotPresentException, CryptoInitException {
        DeviceDeleteRequest deviceDeleteRequest = new DeviceDeleteRequest();
        deviceDeleteRequest.setDeviceCode(str);
        LogTohu.d(TAG, "Delete device request : \n%s", deviceDeleteRequest);
        return (DeviceDeleteResponse) this.serializerService.deserialize(this.cryptoKeyManager.decryptTransportWithSecChannel(this.httpClient.callDeviceDelete(this.cryptoKeyManager.encryptTransportWithSecChannel(this.serializerService.serialize(deviceDeleteRequest)), createTohuBasicHeaders(str2))), DeviceDeleteResponse.class);
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.services.BackendService
    public DeleteTokenResponse deleteToken(String str, String str2) throws TohuBackendException, NetworkNotPresentException, CryptoInitException {
        DeleteTokenRequest deleteTokenRequest = new DeleteTokenRequest();
        deleteTokenRequest.setCardUniqueReference(str);
        LogTohu.d(TAG, "Delete token request : \n%s", deleteTokenRequest);
        return (DeleteTokenResponse) this.serializerService.deserialize(this.cryptoKeyManager.decryptTransportWithSecChannel(this.httpClient.callDeleteToken(this.cryptoKeyManager.encryptTransportWithSecChannel(this.serializerService.serialize(deleteTokenRequest)), createTohuBasicHeaders(str2))), DeleteTokenResponse.class);
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.services.BackendService
    public Response<Digitize> digitize(List<Card> list, String str) throws TohuBackendException, NetworkNotPresentException, CryptoInitException {
        CypheredResponse cypheredResponseCallDigitize;
        Map<String, String> mapCreateTohuBasicHeaders = createTohuBasicHeaders(str);
        CypheredRequest cypheredRequestCreateDigitizeCypheredRequest = createDigitizeCypheredRequest(list);
        LogTohu.d(TAG, "Digitize cyphered request : \n%s", cypheredRequestCreateDigitizeCypheredRequest);
        try {
            cypheredResponseCallDigitize = this.httpClient.callDigitize(cypheredRequestCreateDigitizeCypheredRequest, mapCreateTohuBasicHeaders);
        } catch (Tohu428Exception e5) {
            mapCreateTohuBasicHeaders.put(JWS, callGoogleSafetyNet(Base64.encodeToString(HexUtils.byteArrayFromHexString(e5.getNonce()), 10)));
            cypheredResponseCallDigitize = this.httpClient.callDigitize(cypheredRequestCreateDigitizeCypheredRequest, mapCreateTohuBasicHeaders);
        }
        return createDigitizeResponse(cypheredResponseCallDigitize);
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.services.BackendService
    public Response<GetToken> getToken(String str) throws TohuBackendException, NetworkNotPresentException, CryptoInitException {
        return createGetTokenResponse(this.httpClient.callGetToken(createGetTokenCypheredRequest(str), createTohuCustomHeaders()));
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.services.BackendService
    public Response<TransactionHistoryResponse> getTransactionHistory(String str, String str2) throws TohuBackendException, NetworkNotPresentException, CryptoInitException {
        GetTransactionHistoryRequest getTransactionHistoryRequest = new GetTransactionHistoryRequest(str);
        String str3 = TAG;
        LogTohu.d(str3, "Get Transaction History Request: \n %s", getTransactionHistoryRequest);
        Response<TransactionHistoryResponseData> responseDeserializeGetTransactionHistoryResponse = this.serializerService.deserializeGetTransactionHistoryResponse(this.cryptoKeyManager.decryptTransportWithSecChannel(this.httpClient.callGetTransactionHistory(this.sdkCryptoServiceCaas.serializeAndEncryptTransportWithSecChannel(getTransactionHistoryRequest), createTohuBasicHeaders(str2))));
        TransactionHistoryResponse transactionHistoryResponseBuildTransactionHistoryResponse = buildTransactionHistoryResponse(responseDeserializeGetTransactionHistoryResponse.getData());
        LogTohu.d(str3, "Transaction History Response: \n %s", transactionHistoryResponseBuildTransactionHistoryResponse);
        return new Response<>(transactionHistoryResponseBuildTransactionHistoryResponse, responseDeserializeGetTransactionHistoryResponse.getResult());
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.services.BackendService
    public NotifyProvisionResultResponse notifyProvisionResult(ProvisionResult provisionResult, Token token) throws TohuBackendException, NetworkNotPresentException, CryptoInitException {
        NotifyProvisionResultRequest notifyProvisionResultRequestCreateNotifyProvisionResultRequest = createNotifyProvisionResultRequest(provisionResult);
        LogTohu.d(TAG, "Notify Provision Result Request : \n%s", notifyProvisionResultRequestCreateNotifyProvisionResultRequest);
        return (NotifyProvisionResultResponse) this.serializerService.deserialize(this.cryptoKeyManager.decryptTransportWithSecChannel(this.httpClient.callNotifyProvisionResult(this.cryptoKeyManager.encryptTransportWithSecChannel(this.serializerService.serialize(notifyProvisionResultRequestCreateNotifyProvisionResultRequest)), createTohuCustomHeaders())), NotifyProvisionResultResponse.class);
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.services.BackendService
    public Response<ReplenishResponseData> replenish(ReplenishRequest replenishRequest, String str) throws TohuBackendException, NetworkNotPresentException, CryptoInitException {
        String str2 = TAG;
        LogTohu.d(str2, "ReplenishRequest: \n%s", replenishRequest);
        CypheredRequest cypheredRequestEncryptTransportWithSecChannelPayment = this.cryptoKeyManager.encryptTransportWithSecChannelPayment(this.serializerService.serialize(replenishRequest));
        Map<String, String> mapCreateDeviceHubHeaders = createDeviceHubHeaders();
        if (str != null && !str.isEmpty()) {
            mapCreateDeviceHubHeaders.put(REPLENISH_REASON_HEADER, str);
        }
        Response<ReplenishResponseData> responseDeserializeReplenishResponse = this.serializerService.deserializeReplenishResponse(this.cryptoKeyManager.decryptTransportWithSecChannelPayment(this.httpClient.callReplenish(cypheredRequestEncryptTransportWithSecChannelPayment, mapCreateDeviceHubHeaders)));
        LogTohu.d(str2, "ReplenishResponseData: \n%s", responseDeserializeReplenishResponse);
        return responseDeserializeReplenishResponse;
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.services.BackendService
    public void sendStatus(DeviceStatusRequest deviceStatusRequest) throws TohuBackendException, NetworkNotPresentException, CryptoInitException {
        LogTohu.d(TAG, "DeviceStatusRequest: \n%s", deviceStatusRequest);
        this.httpClient.callDeviceStatusInfo(this.cryptoKeyManager.encryptTransportWithSecChannel(this.serializerService.serialize(deviceStatusRequest)), createDeviceHubHeaders());
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.services.BackendService
    public void suspendToken(String str, String str2) throws TohuBackendException, NetworkNotPresentException, CryptoInitException {
        SuspendTokenRequest suspendTokenRequest = new SuspendTokenRequest(str);
        CypheredRequest cypheredRequestSerializeAndEncryptTransportWithSecChannel = this.sdkCryptoServiceCaas.serializeAndEncryptTransportWithSecChannel(suspendTokenRequest);
        Map<String, String> mapCreateTohuBasicHeaders = createTohuBasicHeaders(str2);
        LogTohu.d(TAG, "SuspendTokenRequest: \n%s", suspendTokenRequest);
        this.httpClient.callSuspendToken(cypheredRequestSerializeAndEncryptTransportWithSecChannel, mapCreateTohuBasicHeaders);
    }
}
