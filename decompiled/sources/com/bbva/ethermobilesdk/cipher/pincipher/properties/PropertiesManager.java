package com.bbva.ethermobilesdk.cipher.pincipher.properties;

import java.util.Properties;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PropertiesManager.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H&¨\u0006\n"}, d2 = {"Lcom/bbva/ethermobilesdk/cipher/pincipher/properties/PropertiesManager;", "", "getProperties", "Ljava/util/Properties;", "getProperty", "", "key", "putProperty", "", "value", "cipher_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface PropertiesManager {
    @NotNull
    Properties getProperties();

    @Nullable
    String getProperty(@NotNull String key);

    void putProperty(@NotNull String key, @NotNull String value);
}
