package com.bbva.tohu.android.product.valkyria.sdk.managers.impl;

import com.bbva.tohu.android.core.utils.SharedPreferencesManager;
import com.bbva.tohu.android.product.valkyria.sdk.export.MobilePayment;
import com.bbva.tohu.android.product.valkyria.sdk.managers.SdkSharedPreferencesManager;

/* JADX INFO: loaded from: classes6.dex */
public class SdkSharedPreferencesManagerDefaultImpl extends SharedPreferencesManager implements SdkSharedPreferencesManager {
    public SdkSharedPreferencesManagerDefaultImpl() {
        super(MobilePayment.getInstance().getContext().getSharedPreferences(SdkSharedPreferencesManager.TOHU_SDK_SHARED_PREFERENCES_ID, 0));
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.managers.SdkSharedPreferencesManager
    public boolean isInitCalled() {
        return retrieveBoolean(SdkSharedPreferencesManager.INIT_IS_CALLED).booleanValue();
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.managers.SdkSharedPreferencesManager
    public void setInitIsCalled(boolean z10) {
        store(buildTuple(SdkSharedPreferencesManager.INIT_IS_CALLED, Boolean.valueOf(z10)));
    }
}
