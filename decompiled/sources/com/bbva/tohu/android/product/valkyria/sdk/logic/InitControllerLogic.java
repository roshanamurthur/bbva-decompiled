package com.bbva.tohu.android.product.valkyria.sdk.logic;

import android.os.ResultReceiver;
import com.bbva.tohu.android.product.valkyria.sdk.managers.CallbackManager;
import com.bbva.tohu.android.product.valkyria.sdk.managers.PropertiesManager;
import com.bbva.tohu.android.product.valkyria.sdk.managers.SdkSharedPreferencesManager;
import com.bbva.tohu.android.product.valkyria.sdk.managers.impl.ManagerFactory;

/* JADX INFO: loaded from: classes6.dex */
public class InitControllerLogic {
    private static final String JCA_PROVIDER_SC = "SC";
    private static final String TAG = "InitControllerLogic";
    private PropertiesManager propertiesManager;
    private SdkSharedPreferencesManager sdkPreferencesManager;

    public InitControllerLogic(SdkSharedPreferencesManager sdkSharedPreferencesManager, PropertiesManager propertiesManager) {
        this.sdkPreferencesManager = sdkSharedPreferencesManager;
        this.propertiesManager = propertiesManager;
    }

    public void init(String str, ResultReceiver resultReceiver) {
        CallbackManager callbackManager = ManagerFactory.getCallbackManager(resultReceiver);
        this.sdkPreferencesManager.setInitIsCalled(true);
        callbackManager.sendResultOk();
    }
}
