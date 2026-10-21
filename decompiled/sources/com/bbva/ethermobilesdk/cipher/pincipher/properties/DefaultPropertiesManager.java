package com.bbva.ethermobilesdk.cipher.pincipher.properties;

import android.content.Context;
import com.bbva.ethermobilesdk.cipher.pincipher.exception.PinCipherException;
import java.util.Properties;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PropertiesManager.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\t\u001a\u00020\bH\u0016¨\u0006\u000f"}, d2 = {"Lcom/bbva/ethermobilesdk/cipher/pincipher/properties/DefaultPropertiesManager;", "Lcom/bbva/ethermobilesdk/cipher/pincipher/properties/PropertiesManager;", "", "key", "getProperty", "value", "", "putProperty", "Ljava/util/Properties;", "getProperties", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Companion", "cipher_release"}, k = 1, mv = {1, 8, 0})
public final class DefaultPropertiesManager implements PropertiesManager {

    @NotNull
    public static final String ERROR_LOADING_CONFIGURATION_FILE = "ERROR_LOADING_CONFIGURATION_FILE";

    @NotNull
    public static final String PROPERTIES_FILE = "etherMobile/cipher/pin_configuration.properties";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Properties f29355a;

    public DefaultPropertiesManager(@NotNull Context context) throws PinCipherException {
        Intrinsics.checkNotNullParameter(context, "context");
        Properties properties = new Properties();
        this.f29355a = properties;
        try {
            properties.load(context.getAssets().open(PROPERTIES_FILE));
        } catch (Exception e5) {
            throw new PinCipherException(e5, ERROR_LOADING_CONFIGURATION_FILE, "Error loading configuration file from directory etherMobile/cipher/pin_configuration.properties");
        }
    }

    @Override // com.bbva.ethermobilesdk.cipher.pincipher.properties.PropertiesManager
    @NotNull
    /* JADX INFO: renamed from: getProperties, reason: from getter */
    public Properties getF29355a() {
        return this.f29355a;
    }

    @Override // com.bbva.ethermobilesdk.cipher.pincipher.properties.PropertiesManager
    @Nullable
    public String getProperty(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f29355a.getProperty(key, null);
    }

    @Override // com.bbva.ethermobilesdk.cipher.pincipher.properties.PropertiesManager
    public void putProperty(@NotNull String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f29355a.setProperty(key, value);
    }
}
