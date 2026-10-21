package com.bbva.tohu.android.product.valkyria.sdk.services;

import com.bbva.tohu.android.core.exceptions.NetworkNotPresentException;
import com.bbva.tohu.android.core.exceptions.backend.TohuBackendException;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public interface Gp2RestClient {
    <S, T> T postEndpoint(S s4, Map<String, String> map, String str, Class<T> cls) throws TohuBackendException, NetworkNotPresentException;
}
