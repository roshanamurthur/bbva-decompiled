package com.bbva.tohu.android.product.valkyria.sdk.services;

import com.bbva.tohu.android.core.exceptions.CryptoInitException;
import com.bbva.tohu.android.product.valkyria.sdk.export.exceptions.TohuSdkException;
import com.bbva.tohu.android.product.valkyria.sdk.export.requests.Card;
import com.bbva.tohu.android.product.valkyria.sdk.payments.HceLogic;
import com.bbva.tohu.android.product.valkyria.sdk.response.backend.GetToken;

/* JADX INFO: loaded from: classes6.dex */
public interface ProviderService {
    HceLogic getHceLogicByProvider(String str) throws TohuSdkException;

    String getPanInfoJsonByProvider(Card card, String str);

    String getTokenByProvider(GetToken getToken) throws CryptoInitException;

    boolean needConfirmReplenishInBackend(String str);
}
