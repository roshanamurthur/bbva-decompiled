package com.bbva.tohu.android.product.valkyria.sdk.managers;

/* JADX INFO: loaded from: classes6.dex */
public interface SdkSharedPreferencesManager {
    public static final String INIT_IS_CALLED = "MP_INIT_IS_CALLED";
    public static final String TOHU_SDK_SHARED_PREFERENCES_ID = "tohuSdkSharedPreferences";

    boolean deleteAll();

    boolean isInitCalled();

    void setInitIsCalled(boolean z10);
}
