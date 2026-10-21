package com.bbva.tohu.android.product.valkyria.sdk.services;

import com.bbva.tohu.android.core.exceptions.CryptoInitException;
import com.bbva.tohu.android.core.exceptions.NetworkNotPresentException;
import com.bbva.tohu.android.core.exceptions.backend.TohuBackendException;
import com.bbva.tohu.android.product.valkyria.sdk.exceptions.NotFoundEntityException;
import com.bbva.tohu.android.product.valkyria.sdk.model.Token;

/* JADX INFO: loaded from: classes6.dex */
public interface ConfirmReplenishService {
    public static final String AUTO_RESPONSE_INFO = "Avoid a call that is always ok";

    boolean confirmReplenish(Token token, boolean z10) throws TohuBackendException, NotFoundEntityException, NetworkNotPresentException, CryptoInitException;
}
