package com.bbva.tohu.android.product.valkyria.sdk.services.impl;

import com.bbva.gp2.android.libs.networking.http.Gp2HttpClient;
import com.bbva.gp2.android.libs.networking.http.requests.HttpMethod;
import com.bbva.gp2.android.libs.networking.http.requests.HttpRequest;
import com.bbva.gp2.android.libs.networking.http.requests.ServerURIByHostAndPath;
import com.bbva.gp2.android.libs.networking.http.requests.StringBody;
import com.bbva.gp2.android.libs.networking.http.responses.HttpResponse;
import com.bbva.tohu.android.core.exceptions.CryptoInitException;
import com.bbva.tohu.android.core.exceptions.NetworkNotPresentException;
import com.bbva.tohu.android.core.exceptions.backend.Armadillo401Exception;
import com.bbva.tohu.android.core.exceptions.backend.Tohu400Exception;
import com.bbva.tohu.android.core.exceptions.backend.Tohu403Exception;
import com.bbva.tohu.android.core.exceptions.backend.Tohu404Exception;
import com.bbva.tohu.android.core.exceptions.backend.Tohu406Exception;
import com.bbva.tohu.android.core.exceptions.backend.Tohu409Exception;
import com.bbva.tohu.android.core.exceptions.backend.Tohu412Exception;
import com.bbva.tohu.android.core.exceptions.backend.Tohu423Exception;
import com.bbva.tohu.android.core.exceptions.backend.Tohu428Exception;
import com.bbva.tohu.android.core.exceptions.backend.Tohu429Exception;
import com.bbva.tohu.android.core.exceptions.backend.Tohu500Exception;
import com.bbva.tohu.android.core.exceptions.backend.Tohu503Exception;
import com.bbva.tohu.android.core.exceptions.backend.TohuBackendException;
import com.bbva.tohu.android.core.managers.NetworkManagerUtil;
import com.bbva.tohu.android.core.request.backend.CypheredRequest;
import com.bbva.tohu.android.core.response.backend.CypheredResponse;
import com.bbva.tohu.android.core.utils.LogTohu;
import com.bbva.tohu.android.product.valkyria.sdk.managers.CryptoKeyManager;
import com.bbva.tohu.android.product.valkyria.sdk.services.SerializerService;
import com.bbva.tohu.android.product.valkyria.sdk.services.ValkyriaHttpClient;
import com.noknok.android.client.appsdk_plus.IAppSDKPlus;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class ValkyriaHttpClientDefaultImpl implements ValkyriaHttpClient {
    private static final String TAG = "ValkyriaHttpClientDefaultImpl";
    private final CryptoKeyManager cryptoKeyManager;
    private final String host;
    private final Gp2HttpClient httpClient;
    private final NetworkManagerUtil networkmanager;
    private final SerializerService serializerSevice;

    public ValkyriaHttpClientDefaultImpl(Gp2HttpClient gp2HttpClient, String str, SerializerService serializerService, NetworkManagerUtil networkManagerUtil, CryptoKeyManager cryptoKeyManager) {
        this.httpClient = gp2HttpClient;
        this.host = str;
        this.serializerSevice = serializerService;
        this.networkmanager = networkManagerUtil;
        this.cryptoKeyManager = cryptoKeyManager;
    }

    private void addNoCacheHeader(Map<String, String> map) {
        if (map != null) {
            map.put("Cache-Control", "no-cache");
        }
    }

    private boolean isStatusSuccessful(HttpResponse httpResponse) {
        return httpResponse.getStatus() >= 200 && httpResponse.getStatus() < 300;
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.services.ValkyriaHttpClient
    public CypheredResponse postCypheredEndpoint(CypheredRequest cypheredRequest, Map<String, String> map, String str) throws TohuBackendException, NetworkNotPresentException, CryptoInitException {
        if (!this.networkmanager.isOnline()) {
            throw new NetworkNotPresentException();
        }
        addNoCacheHeader(map);
        HttpResponse httpResponseExecute = this.httpClient.execute(new HttpRequest(new ServerURIByHostAndPath(this.host, str), HttpMethod.POST, map, new StringBody(this.serializerSevice.serialize(cypheredRequest))));
        try {
            validateResponse(httpResponseExecute);
            if (httpResponseExecute.getBody() != null) {
                return (CypheredResponse) this.serializerSevice.deserialize(httpResponseExecute.getBody().getString(), CypheredResponse.class);
            }
            throw new TohuBackendException("Body expected but is null");
        } catch (Tohu409Exception e5) {
            this.cryptoKeyManager.forceCreateKeys();
            throw new CryptoInitException(e5);
        }
    }

    public void validateResponse(HttpResponse httpResponse) throws TohuBackendException {
        LogTohu.d(TAG, "Backend return code: %s", Integer.valueOf(httpResponse.getStatus()));
        if (isStatusSuccessful(httpResponse)) {
            return;
        }
        int status = httpResponse.getStatus();
        if (status == 400) {
            throw new Tohu400Exception();
        }
        if (status == 401) {
            throw new Armadillo401Exception();
        }
        if (status == 403) {
            throw new Tohu403Exception();
        }
        if (status == 404) {
            throw new Tohu404Exception();
        }
        if (status == 406) {
            throw new Tohu406Exception();
        }
        if (status == 409) {
            throw new Tohu409Exception();
        }
        if (status == 412) {
            throw new Tohu412Exception();
        }
        if (status == 423) {
            throw new Tohu423Exception();
        }
        if (status == 500) {
            throw new Tohu500Exception();
        }
        if (status == 503) {
            throw new Tohu503Exception();
        }
        if (status == 428) {
            throw new Tohu428Exception(httpResponse.getHeaders().get(IAppSDKPlus.EXTRA_KEY_NONCE));
        }
        if (status == 429) {
            throw new Tohu429Exception();
        }
        throw new TohuBackendException("Unexpected status code from backend: " + httpResponse.getStatus());
    }
}
