package com.bbva.tohu.android.product.valkyria.sdk.services;

import com.bbva.tohu.android.core.exceptions.CryptoInitException;
import com.bbva.tohu.android.core.exceptions.NetworkNotPresentException;
import com.bbva.tohu.android.core.exceptions.backend.TohuBackendException;
import com.bbva.tohu.android.core.request.backend.CypheredRequest;
import com.bbva.tohu.android.core.response.backend.CypheredResponse;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public interface HubHttpClient {
    CypheredResponse callConfirmReplenish(CypheredRequest cypheredRequest, Map<String, String> map) throws TohuBackendException, NetworkNotPresentException, CryptoInitException;

    CypheredResponse callDeleteToken(CypheredRequest cypheredRequest, Map<String, String> map) throws TohuBackendException, NetworkNotPresentException, CryptoInitException;

    CypheredResponse callDeviceDelete(CypheredRequest cypheredRequest, Map<String, String> map) throws TohuBackendException, NetworkNotPresentException, CryptoInitException;

    CypheredResponse callDeviceStatusInfo(CypheredRequest cypheredRequest, Map<String, String> map) throws TohuBackendException, NetworkNotPresentException, CryptoInitException;

    CypheredResponse callDigitize(CypheredRequest cypheredRequest, Map<String, String> map) throws TohuBackendException, NetworkNotPresentException, CryptoInitException;

    CypheredResponse callGetToken(CypheredRequest cypheredRequest, Map<String, String> map) throws TohuBackendException, NetworkNotPresentException, CryptoInitException;

    CypheredResponse callGetTokenInfo(CypheredRequest cypheredRequest, Map<String, String> map) throws TohuBackendException, NetworkNotPresentException, CryptoInitException;

    CypheredResponse callGetTransactionHistory(CypheredRequest cypheredRequest, Map<String, String> map) throws TohuBackendException, NetworkNotPresentException, CryptoInitException;

    CypheredResponse callNotifyProvisionResult(CypheredRequest cypheredRequest, Map<String, String> map) throws TohuBackendException, NetworkNotPresentException, CryptoInitException;

    CypheredResponse callReplenish(CypheredRequest cypheredRequest, Map<String, String> map) throws TohuBackendException, NetworkNotPresentException, CryptoInitException;

    CypheredResponse callSuspendToken(CypheredRequest cypheredRequest, Map<String, String> map) throws TohuBackendException, NetworkNotPresentException, CryptoInitException;
}
