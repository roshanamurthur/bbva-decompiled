package com.bbva.tohu.android.product.valkyria.sdk.services.impl;

import com.bbva.tohu.android.core.exceptions.CryptoInitException;
import com.bbva.tohu.android.core.exceptions.NetworkNotPresentException;
import com.bbva.tohu.android.core.exceptions.backend.TohuBackendException;
import com.bbva.tohu.android.core.request.backend.CypheredRequest;
import com.bbva.tohu.android.core.response.backend.CypheredResponse;
import com.bbva.tohu.android.product.valkyria.sdk.constants.UrlsBackend;
import com.bbva.tohu.android.product.valkyria.sdk.services.HubHttpClient;
import com.bbva.tohu.android.product.valkyria.sdk.services.ValkyriaHttpClient;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class HubHttpClientGp2NetworkingImpl implements HubHttpClient {
    private static final String TAG = "HubHttpClientGp2NetworkingImpl";
    private final ValkyriaHttpClient httpClient;

    public HubHttpClientGp2NetworkingImpl(ValkyriaHttpClient valkyriaHttpClient) {
        this.httpClient = valkyriaHttpClient;
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.services.HubHttpClient
    public CypheredResponse callConfirmReplenish(CypheredRequest cypheredRequest, Map<String, String> map) throws TohuBackendException, NetworkNotPresentException, CryptoInitException {
        return this.httpClient.postCypheredEndpoint(cypheredRequest, map, UrlsBackend.CONFIRM_REPLENISH);
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.services.HubHttpClient
    public CypheredResponse callDeleteToken(CypheredRequest cypheredRequest, Map<String, String> map) throws TohuBackendException, NetworkNotPresentException, CryptoInitException {
        return this.httpClient.postCypheredEndpoint(cypheredRequest, map, UrlsBackend.DELETE_TOKEN);
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.services.HubHttpClient
    public CypheredResponse callDeviceDelete(CypheredRequest cypheredRequest, Map<String, String> map) throws TohuBackendException, NetworkNotPresentException, CryptoInitException {
        return this.httpClient.postCypheredEndpoint(cypheredRequest, map, UrlsBackend.DELETE_DEVICE);
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.services.HubHttpClient
    public CypheredResponse callDeviceStatusInfo(CypheredRequest cypheredRequest, Map<String, String> map) throws TohuBackendException, NetworkNotPresentException, CryptoInitException {
        return this.httpClient.postCypheredEndpoint(cypheredRequest, map, UrlsBackend.DEVICE_STATUS_INFO);
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.services.HubHttpClient
    public CypheredResponse callDigitize(CypheredRequest cypheredRequest, Map<String, String> map) throws TohuBackendException, NetworkNotPresentException, CryptoInitException {
        return this.httpClient.postCypheredEndpoint(cypheredRequest, map, UrlsBackend.DIGITIZE);
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.services.HubHttpClient
    public CypheredResponse callGetToken(CypheredRequest cypheredRequest, Map<String, String> map) throws TohuBackendException, NetworkNotPresentException, CryptoInitException {
        return this.httpClient.postCypheredEndpoint(cypheredRequest, map, UrlsBackend.GET_TOKEN);
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.services.HubHttpClient
    public CypheredResponse callGetTokenInfo(CypheredRequest cypheredRequest, Map<String, String> map) throws TohuBackendException, NetworkNotPresentException, CryptoInitException {
        return this.httpClient.postCypheredEndpoint(cypheredRequest, map, UrlsBackend.GET_TOKEN_INFO);
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.services.HubHttpClient
    public CypheredResponse callGetTransactionHistory(CypheredRequest cypheredRequest, Map<String, String> map) throws TohuBackendException, NetworkNotPresentException, CryptoInitException {
        return this.httpClient.postCypheredEndpoint(cypheredRequest, map, UrlsBackend.GET_TRANSACTION_HISTORY);
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.services.HubHttpClient
    public CypheredResponse callNotifyProvisionResult(CypheredRequest cypheredRequest, Map<String, String> map) throws TohuBackendException, NetworkNotPresentException, CryptoInitException {
        return this.httpClient.postCypheredEndpoint(cypheredRequest, map, UrlsBackend.NOTIFY_PROVISION_RESULT);
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.services.HubHttpClient
    public CypheredResponse callReplenish(CypheredRequest cypheredRequest, Map<String, String> map) throws TohuBackendException, NetworkNotPresentException, CryptoInitException {
        return this.httpClient.postCypheredEndpoint(cypheredRequest, map, UrlsBackend.REPLENISH);
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.services.HubHttpClient
    public CypheredResponse callSuspendToken(CypheredRequest cypheredRequest, Map<String, String> map) throws TohuBackendException, NetworkNotPresentException, CryptoInitException {
        return this.httpClient.postCypheredEndpoint(cypheredRequest, map, UrlsBackend.SUSPEND_TOKEN);
    }
}
