package com.bbva.tohu.android.product.valkyria.sdk.services;

import com.bbva.tohu.android.core.exceptions.NetworkNotPresentException;
import com.bbva.tohu.android.core.exceptions.backend.TohuBackendException;

/* JADX INFO: loaded from: classes6.dex */
public interface CredentialService {
    String getJwt(String str) throws TohuBackendException, NetworkNotPresentException;
}
