package com.bbva.tohu.android.product.valkyria.sdk.managers.impl;

import android.content.Context;
import com.bbva.tohu.android.product.valkyria.sdk.export.MobilePayment;
import com.bbva.tohu.android.product.valkyria.sdk.export.exceptions.LoadPropertiesException;
import com.bbva.tohu.android.product.valkyria.sdk.managers.PropertiesManager;
import java.io.IOException;
import java.util.Properties;

/* JADX INFO: loaded from: classes6.dex */
public class PropertiesManagerDefaultImpl implements PropertiesManager {
    private static final String ARMADILLO_AUTH_BASIC = "armadillo.auth.basic";
    private static final String ARMADILLO_BASE_URL = "mobile.payment.armadillo.base.url";
    private static final String ARMADILLO_PATH_URL = "mobile.payment.armadillo.path.url";
    private static final String BROADCAST_RECEIVER_CLASS = "broadcast.receiver.class";
    private static final String BROADCAST_RECEIVER_PACKAGE = "broadcast.receiver.package";
    private static final String CDCVM_SUPPORTED = "cdcvmSupported";
    private static final String JCA_PROVIDER_KEY = "jca.provider";
    private static final String KM_CONFIG = "mobile.payment.kmconfig";
    private static final String LOCK_MAX_TIME_KEY = "lock.max_time_in_mills";
    private static final String OVERWRITE_CDCVM_PIN_ONLINE_KEY = "overwrite_cdcvm_with_online_pin";
    private static final String SCHEDULER_GET_TOKEN_INITIAL_DELAY_KEY = "scheduler.get_token_task.initial_delay_in_seconds";
    private static final String SCHEDULER_GET_TOKEN_MAX_TIME_KEY = "scheduler.get_token_task.max_time_in_seconds";
    private static final String TOHU_HOST_KEY = "mobile.payment.host";
    private static final String USER_AUTHENTICATION_TTL_IN_SECONDS = "userAuthenticationTtlInSeconds";
    private static final String VISA_BULLET_TTL_KEY = "visa.bullet.ttl_in_seconds";
    private Properties properties = new Properties();

    @Override // com.bbva.tohu.android.product.valkyria.sdk.managers.PropertiesManager
    public Boolean cdcvmSupported() {
        return Boolean.valueOf(this.properties.getProperty(CDCVM_SUPPORTED));
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.managers.PropertiesManager
    public String getArmadilloAuthBasic() {
        return this.properties.getProperty(ARMADILLO_AUTH_BASIC);
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.managers.PropertiesManager
    public String getArmadilloBaseUrl() {
        return this.properties.getProperty(ARMADILLO_BASE_URL);
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.managers.PropertiesManager
    public String getArmadilloPathUrl() {
        return this.properties.getProperty(ARMADILLO_PATH_URL);
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.managers.PropertiesManager
    public String getBroadcastReceiverClass() {
        return this.properties.getProperty(BROADCAST_RECEIVER_CLASS);
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.managers.PropertiesManager
    public String getBroadcastReceiverPackage() {
        return this.properties.getProperty(BROADCAST_RECEIVER_PACKAGE);
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.managers.PropertiesManager
    public String getKmConfig() {
        return this.properties.getProperty(KM_CONFIG);
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.managers.PropertiesManager
    public void loadProperties(Context context) throws LoadPropertiesException {
        try {
            if (MobilePayment.getInstance().getContext() == null) {
                MobilePayment.getInstance().setContext(context);
            }
            this.properties.load(MobilePayment.getInstance().getContext().getAssets().open("sdkcatalog/gp2_mobilepayment/config.properties"));
        } catch (IOException e5) {
            throw new LoadPropertiesException(e5);
        }
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.managers.PropertiesManager
    public Long lockMaxTimeMillis() {
        try {
            return Long.valueOf(this.properties.getProperty(LOCK_MAX_TIME_KEY));
        } catch (NumberFormatException unused) {
            return 0L;
        }
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.managers.PropertiesManager
    public Boolean overwriteCDCVMWithPinOnline() {
        return Boolean.valueOf(this.properties.getProperty(OVERWRITE_CDCVM_PIN_ONLINE_KEY));
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.managers.PropertiesManager
    public Long schedulerGetTokenTaskInitialDelaySeconds() {
        return Long.valueOf(this.properties.getProperty(SCHEDULER_GET_TOKEN_INITIAL_DELAY_KEY));
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.managers.PropertiesManager
    public Long schedulerGetTokenTaskMaxTimeSeconds() {
        return Long.valueOf(this.properties.getProperty(SCHEDULER_GET_TOKEN_MAX_TIME_KEY));
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.managers.PropertiesManager
    public String tohuHost() {
        return this.properties.getProperty(TOHU_HOST_KEY);
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.managers.PropertiesManager
    public Long userAuthenticationTtlInSeconds() {
        return Long.valueOf(this.properties.getProperty(USER_AUTHENTICATION_TTL_IN_SECONDS));
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.managers.PropertiesManager
    public Long visaBulletTTL() {
        return Long.valueOf(this.properties.getProperty(VISA_BULLET_TTL_KEY));
    }
}
