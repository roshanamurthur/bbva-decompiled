package com.veridas.config;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PropertyNameNotFoundException.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/veridas/config/PropertyNameNotFoundException;", "Lcom/veridas/config/ConfigurationException;", "propertyName", "", "(Ljava/lang/String;)V", "common-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PropertyNameNotFoundException extends ConfigurationException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PropertyNameNotFoundException(@NotNull String propertyName) {
        super("Property name " + propertyName + " not found in configuration");
        Intrinsics.checkNotNullParameter(propertyName, "propertyName");
    }
}
