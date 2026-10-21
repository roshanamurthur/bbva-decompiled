package com.bbva.tohu.android.product.valkyria.sdk.services.impl;

import com.bbva.tohu.android.core.exceptions.NetworkNotPresentException;
import com.bbva.tohu.android.core.exceptions.backend.TohuBackendException;
import com.bbva.tohu.android.core.response.backend.AuthResponse;
import com.bbva.tohu.android.product.valkyria.sdk.managers.PropertiesManager;
import com.bbva.tohu.android.product.valkyria.sdk.request.backend.AuthRequest;
import com.bbva.tohu.android.product.valkyria.sdk.services.ArmadilloHttpClient;
import com.bbva.tohu.android.product.valkyria.sdk.services.Gp2RestClient;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class ArmadilloHttpClientGp2NetworkingImpl implements ArmadilloHttpClient {
    private Gp2RestClient gp2RestClient;
    private PropertiesManager propertyManager;

    public ArmadilloHttpClientGp2NetworkingImpl(PropertiesManager propertiesManager, Gp2RestClient gp2RestClient) {
        this.propertyManager = propertiesManager;
        this.gp2RestClient = gp2RestClient;
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.services.ArmadilloHttpClient
    public AuthResponse callAuthArmadillo(AuthRequest authRequest, Map<String, String> map) throws TohuBackendException, NetworkNotPresentException {
        return (AuthResponse) this.gp2RestClient.postEndpoint(authRequest, map, this.propertyManager.getArmadilloPathUrl(), AuthResponse.class);
    }
}
