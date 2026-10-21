package com.bbva.tohu.android.product.valkyria.sdk.services.impl;

import com.bbva.gp2.android.libs.networking.http.Gp2HttpClient;
import com.bbva.gp2.android.libs.networking.http.requests.HttpMethod;
import com.bbva.gp2.android.libs.networking.http.requests.HttpRequest;
import com.bbva.gp2.android.libs.networking.http.requests.ServerURIByHostAndPath;
import com.bbva.gp2.android.libs.networking.http.requests.StringBody;
import com.bbva.gp2.android.libs.networking.http.responses.HttpResponse;
import com.bbva.tohu.android.core.exceptions.NetworkNotPresentException;
import com.bbva.tohu.android.core.exceptions.backend.Armadillo401Exception;
import com.bbva.tohu.android.core.exceptions.backend.TohuBackendException;
import com.bbva.tohu.android.core.managers.NetworkManagerUtil;
import com.bbva.tohu.android.product.valkyria.sdk.managers.PropertiesManager;
import com.bbva.tohu.android.product.valkyria.sdk.services.Gp2RestClient;
import com.bbva.tohu.android.product.valkyria.sdk.services.SerializerService;
import com.noknok.android.client.appsdk_plus.IAppSDKPlus;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class Gp2RestClientDefaultImpl implements Gp2RestClient {
    private final String TOHU_BACKEND_EXCEPTION_DEFAULT_MESSAGE = "Tohu backend error : ";
    private Gp2HttpClient httpClient;
    private NetworkManagerUtil networkManager;
    private PropertiesManager propertyManager;
    private SerializerService serializerService;

    public Gp2RestClientDefaultImpl(Gp2HttpClient gp2HttpClient, PropertiesManager propertiesManager, SerializerService serializerService, NetworkManagerUtil networkManagerUtil) {
        this.httpClient = gp2HttpClient;
        this.propertyManager = propertiesManager;
        this.serializerService = serializerService;
        this.networkManager = networkManagerUtil;
    }

    private void addNoCacheHeader(Map<String, String> map) {
        map.put("Cache-Control", "no-cache");
    }

    private Boolean isStatusSuccessful(HttpResponse httpResponse) {
        return Boolean.valueOf(httpResponse.getStatus() >= 200 && httpResponse.getStatus() < 300);
    }

    private String post(String str, Map<String, String> map, String str2) throws TohuBackendException, NetworkNotPresentException {
        if (!this.networkManager.isOnline()) {
            throw new NetworkNotPresentException();
        }
        HashMap map2 = new HashMap();
        map2.putAll(map);
        addNoCacheHeader(map2);
        HttpResponse httpResponseExecute = this.httpClient.execute(new HttpRequest(new ServerURIByHostAndPath(this.propertyManager.getArmadilloBaseUrl(), str2), HttpMethod.POST, map2, new StringBody(str)));
        validateResponse(httpResponseExecute);
        if (httpResponseExecute.getBody() != null) {
            return httpResponseExecute.getBody().getString();
        }
        throw new TohuBackendException("Tohu backend error : " + httpResponseExecute.getStatus());
    }

    private void validateResponse(HttpResponse httpResponse) throws TohuBackendException {
        if (isStatusSuccessful(httpResponse).booleanValue()) {
            return;
        }
        if (httpResponse.getStatus() == 401) {
            throw new Armadillo401Exception();
        }
        if (httpResponse.getStatus() != 428) {
            throw new TohuBackendException("Tohu backend error : " + httpResponse.getStatus());
        }
        if (httpResponse.getHeaders().isEmpty()) {
            throw new TohuBackendException("Tohu backend error : " + httpResponse.getStatus());
        }
        throw new TohuBackendException("Tohu backend error : " + httpResponse.getStatus() + "nonce: " + httpResponse.getHeaders().get(IAppSDKPlus.EXTRA_KEY_NONCE));
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.services.Gp2RestClient
    public <S, T> T postEndpoint(S s4, Map<String, String> map, String str, Class<T> cls) throws TohuBackendException, NetworkNotPresentException {
        return (T) this.serializerService.deserialize(post(this.serializerService.serialize(s4), map, str), cls);
    }
}
