package com.bbva.tohu.android.product.valkyria.sdk.services.impl;

import com.bbva.tohu.android.product.valkyria.sdk.managers.UserSharedPreferencesManager;
import com.bbva.tohu.android.product.valkyria.sdk.services.ActivePaymentService;

/* JADX INFO: loaded from: classes6.dex */
public class ActivePaymentServiceDefaultImpl implements ActivePaymentService {
    private UserSharedPreferencesManager userPreferencesManager;

    public ActivePaymentServiceDefaultImpl(UserSharedPreferencesManager userSharedPreferencesManager) {
        this.userPreferencesManager = userSharedPreferencesManager;
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.services.ActivePaymentService
    public void active(boolean z10) {
        this.userPreferencesManager.setActivePayment(z10);
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.services.ActivePaymentService
    public boolean getState() {
        return this.userPreferencesManager.isActivePayment();
    }
}
