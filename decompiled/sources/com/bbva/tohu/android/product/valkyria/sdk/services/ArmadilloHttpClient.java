package com.bbva.tohu.android.product.valkyria.sdk.services;

import com.bbva.tohu.android.core.exceptions.NetworkNotPresentException;
import com.bbva.tohu.android.core.exceptions.backend.TohuBackendException;
import com.bbva.tohu.android.core.response.backend.AuthResponse;
import com.bbva.tohu.android.product.valkyria.sdk.request.backend.AuthRequest;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public interface ArmadilloHttpClient {
    AuthResponse callAuthArmadillo(AuthRequest authRequest, Map<String, String> map) throws TohuBackendException, NetworkNotPresentException;
}
