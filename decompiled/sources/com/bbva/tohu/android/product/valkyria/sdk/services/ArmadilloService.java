package com.bbva.tohu.android.product.valkyria.sdk.services;

import com.bbva.tohu.android.core.exceptions.NetworkNotPresentException;
import com.bbva.tohu.android.core.exceptions.backend.TohuBackendException;
import com.bbva.tohu.android.core.response.backend.AuthResponse;

/* JADX INFO: loaded from: classes6.dex */
public interface ArmadilloService {
    AuthResponse getAuthToken(String str, String str2) throws TohuBackendException, NetworkNotPresentException;
}
