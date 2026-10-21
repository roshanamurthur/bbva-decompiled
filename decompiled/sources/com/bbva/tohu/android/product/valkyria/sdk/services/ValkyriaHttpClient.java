package com.bbva.tohu.android.product.valkyria.sdk.services;

import com.bbva.tohu.android.core.exceptions.CryptoInitException;
import com.bbva.tohu.android.core.exceptions.NetworkNotPresentException;
import com.bbva.tohu.android.core.exceptions.backend.TohuBackendException;
import com.bbva.tohu.android.core.request.backend.CypheredRequest;
import com.bbva.tohu.android.core.response.backend.CypheredResponse;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public interface ValkyriaHttpClient {
    CypheredResponse postCypheredEndpoint(CypheredRequest cypheredRequest, Map<String, String> map, String str) throws TohuBackendException, NetworkNotPresentException, CryptoInitException;
}
