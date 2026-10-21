package com.bbva.tohu.android.product.valkyria.sdk.managers;

import android.content.Context;
import com.bbva.tohu.android.product.valkyria.sdk.export.exceptions.LoadPropertiesException;

/* JADX INFO: loaded from: classes6.dex */
public interface PropertiesManager {
    Boolean cdcvmSupported();

    String getArmadilloAuthBasic();

    String getArmadilloBaseUrl();

    String getArmadilloPathUrl();

    String getBroadcastReceiverClass();

    String getBroadcastReceiverPackage();

    String getKmConfig();

    void loadProperties(Context context) throws LoadPropertiesException;

    Long lockMaxTimeMillis();

    Boolean overwriteCDCVMWithPinOnline();

    Long schedulerGetTokenTaskInitialDelaySeconds();

    Long schedulerGetTokenTaskMaxTimeSeconds();

    String tohuHost();

    Long userAuthenticationTtlInSeconds();

    Long visaBulletTTL();
}
