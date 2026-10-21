package com.bbva.tohu.android.product.valkyria.sdk.services.impl;

import com.bbva.tohu.android.core.exceptions.NetworkNotPresentException;
import com.bbva.tohu.android.core.exceptions.backend.TohuBackendException;
import com.bbva.tohu.android.core.response.backend.AuthResponse;
import com.bbva.tohu.android.product.valkyria.sdk.request.backend.AuthRequest;
import com.bbva.tohu.android.product.valkyria.sdk.services.ArmadilloHttpClient;
import com.bbva.tohu.android.product.valkyria.sdk.services.ArmadilloService;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public class ArmadilloServiceDefaultImpl implements ArmadilloService {
    public static final String AUTHORIZATION_HEADER = "Authorization";
    public static final String VND_BBVA_PKCS7 = "vnd.bbva.pkcs7";
    private final ArmadilloHttpClient armadilloHttpClient;

    public ArmadilloServiceDefaultImpl(ArmadilloHttpClient armadilloHttpClient) {
        this.armadilloHttpClient = armadilloHttpClient;
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.services.ArmadilloService
    public AuthResponse getAuthToken(String str, String str2) throws TohuBackendException, NetworkNotPresentException {
        HashMap map = new HashMap();
        map.put("Authorization", str);
        map.put(VND_BBVA_PKCS7, str2);
        return this.armadilloHttpClient.callAuthArmadillo(new AuthRequest(), map);
    }
}
