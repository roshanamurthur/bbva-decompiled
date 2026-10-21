package com.bbva.gp2.android.trustdevice.sdk.export.manager.impl;

import com.bbva.glomohybrid.logs.LogKeysKt;
import com.bbva.gp2.android.trustdevice.sdk.export.exceptions.LoadPropertiesException;
import com.bbva.gp2.android.trustdevice.sdk.export.manager.PropertyManager;
import com.bbva.gp2.android.trustdevice.sdk.manager.ContextHolder;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PropertyManagerImpl.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\t\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\nH\u0016J\u000f\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0002\u0010\u0010J\b\u0010\u0011\u001a\u00020\nH\u0016J\b\u0010\u0012\u001a\u00020\nH\u0016J\b\u0010\u0013\u001a\u00020\nH\u0016J\b\u0010\u0014\u001a\u00020\nH\u0016J\b\u0010\u0015\u001a\u00020\nH\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0018"}, d2 = {"Lcom/bbva/gp2/android/trustdevice/sdk/export/manager/impl/PropertyManagerImpl;", "Lcom/bbva/gp2/android/trustdevice/sdk/export/manager/PropertyManager;", "()V", LogKeysKt.PROPERTIES, "Ljava/util/Properties;", "getProperties", "()Ljava/util/Properties;", "properties$delegate", "Lkotlin/Lazy;", "getCountryCode", "", "getCountryName", "getGp2ArmadilloAuthBasic", "getGp2ArmadilloUrlBasic", "getIntegrityCloudProjectNumber", "", "()Ljava/lang/Long;", "getKmconfig", "getPlatformBaseUrl", "getPreRegisterUrl", "getSafetyNetApiKey", "getSendPushTokenUrl", "loadProperties", "Companion", "sdk-bbva-payments-trustdevice_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class PropertyManagerImpl implements PropertyManager {

    @NotNull
    public static final String COUNTRY_CODE = "country.code";

    @NotNull
    public static final String COUNTRY_NAME = "country.name";

    @NotNull
    public static final String GP2_ARMADILLO_AUTH_BASIC = "gp2.armadillo.auth.basic";

    @NotNull
    public static final String GP2_ARMADILLO_URL_BASIC = "gp2.armadillo.url";

    @NotNull
    public static final String INTEGRITY_CLOUD_PROJECT_NUMBER = "integrity.cloudProjectNumber";

    @NotNull
    public static final String KMCONFIG_KEY_NAME = "gp2.kmconfig";

    @NotNull
    public static final String PLATFORM_BASE_URL = "gp2.base.url";

    @NotNull
    public static final String PRE_REGISTER_URL_KEY_NAME = "gp2.preregister.url";

    @NotNull
    public static final String SAFETY_NET_API_KEY = "safetynet.apikey";

    @NotNull
    public static final String SEND_PUSH_TOKEN_URL_KEY_NAME = "gp2.setpushtoken.url";

    /* JADX INFO: renamed from: properties$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy properties = LazyKt__LazyJVMKt.lazy(new Function0<Properties>() { // from class: com.bbva.gp2.android.trustdevice.sdk.export.manager.impl.PropertyManagerImpl$properties$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Properties invoke() {
            return this.this$0.loadProperties();
        }
    });

    private final Properties getProperties() {
        return (Properties) this.properties.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Properties loadProperties() throws LoadPropertiesException {
        try {
            InputStream inputStreamOpen = ContextHolder.Companion.getContext().getAssets().open("sdkcatalog/gp2_trustdevice/config.properties");
            Intrinsics.checkNotNullExpressionValue(inputStreamOpen, "assetManager\n           …evice/config.properties\")");
            Properties properties = new Properties();
            properties.load(inputStreamOpen);
            return properties;
        } catch (IOException e5) {
            throw new LoadPropertiesException(e5);
        }
    }

    @Override // com.bbva.gp2.android.trustdevice.sdk.export.manager.PropertyManager
    @NotNull
    public String getCountryCode() {
        String property = getProperties().getProperty(COUNTRY_CODE);
        Intrinsics.checkNotNullExpressionValue(property, "properties.getProperty(COUNTRY_CODE)");
        return property;
    }

    @Override // com.bbva.gp2.android.trustdevice.sdk.export.manager.PropertyManager
    @NotNull
    public String getCountryName() {
        String property = getProperties().getProperty(COUNTRY_NAME);
        Intrinsics.checkNotNullExpressionValue(property, "properties.getProperty(COUNTRY_NAME)");
        return property;
    }

    @Override // com.bbva.gp2.android.trustdevice.sdk.export.manager.PropertyManager
    @NotNull
    public String getGp2ArmadilloAuthBasic() {
        String property = getProperties().getProperty(GP2_ARMADILLO_AUTH_BASIC);
        Intrinsics.checkNotNullExpressionValue(property, "properties.getProperty(GP2_ARMADILLO_AUTH_BASIC)");
        return property;
    }

    @Override // com.bbva.gp2.android.trustdevice.sdk.export.manager.PropertyManager
    @NotNull
    public String getGp2ArmadilloUrlBasic() {
        String property = getProperties().getProperty(GP2_ARMADILLO_URL_BASIC);
        Intrinsics.checkNotNullExpressionValue(property, "properties.getProperty(GP2_ARMADILLO_URL_BASIC)");
        return property;
    }

    @Override // com.bbva.gp2.android.trustdevice.sdk.export.manager.PropertyManager
    @Nullable
    public Long getIntegrityCloudProjectNumber() {
        String property = getProperties().getProperty(INTEGRITY_CLOUD_PROJECT_NUMBER);
        if (property != null) {
            return k.toLongOrNull(property);
        }
        return null;
    }

    @Override // com.bbva.gp2.android.trustdevice.sdk.export.manager.PropertyManager
    @NotNull
    public String getKmconfig() {
        String property = getProperties().getProperty(KMCONFIG_KEY_NAME);
        Intrinsics.checkNotNullExpressionValue(property, "properties.getProperty(KMCONFIG_KEY_NAME)");
        return property;
    }

    @Override // com.bbva.gp2.android.trustdevice.sdk.export.manager.PropertyManager
    @NotNull
    public String getPlatformBaseUrl() {
        String property = getProperties().getProperty(PLATFORM_BASE_URL);
        Intrinsics.checkNotNullExpressionValue(property, "properties.getProperty(PLATFORM_BASE_URL)");
        return property;
    }

    @Override // com.bbva.gp2.android.trustdevice.sdk.export.manager.PropertyManager
    @NotNull
    public String getPreRegisterUrl() {
        String property = getProperties().getProperty(PRE_REGISTER_URL_KEY_NAME);
        Intrinsics.checkNotNullExpressionValue(property, "properties.getProperty(PRE_REGISTER_URL_KEY_NAME)");
        return property;
    }

    @Override // com.bbva.gp2.android.trustdevice.sdk.export.manager.PropertyManager
    @NotNull
    public String getSafetyNetApiKey() {
        String property = getProperties().getProperty(SAFETY_NET_API_KEY);
        Intrinsics.checkNotNullExpressionValue(property, "properties.getProperty(SAFETY_NET_API_KEY)");
        return property;
    }

    @Override // com.bbva.gp2.android.trustdevice.sdk.export.manager.PropertyManager
    @NotNull
    public String getSendPushTokenUrl() {
        String property = getProperties().getProperty(SEND_PUSH_TOKEN_URL_KEY_NAME);
        Intrinsics.checkNotNullExpressionValue(property, "properties.getProperty(S…_PUSH_TOKEN_URL_KEY_NAME)");
        return property;
    }
}
