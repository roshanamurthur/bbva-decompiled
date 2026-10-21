package com.bbva.softtokenbase.usecase;

import com.bbva.glomo.localstorage.LocalStorageConstantsKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DefaultDeviceAccessConfig.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006H\u0016¨\u0006\t"}, d2 = {"Lcom/bbva/softtokenbase/usecase/DefaultDeviceAccessConfig;", "Lcom/bbva/softtokenbase/usecase/DeviceAccessConfig;", "()V", "isBiometryEnabled", "", "value", "", "", "", "softtokenbase_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDefaultDeviceAccessConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultDeviceAccessConfig.kt\ncom/bbva/softtokenbase/usecase/DefaultDeviceAccessConfig\n+ 2 MapExtensions.kt\ncom/bbva/glomoutils/MapExtensionsKt\n*L\n1#1,12:1\n12#2:13\n*S KotlinDebug\n*F\n+ 1 DefaultDeviceAccessConfig.kt\ncom/bbva/softtokenbase/usecase/DefaultDeviceAccessConfig\n*L\n9#1:13\n*E\n"})
public final class DefaultDeviceAccessConfig implements DeviceAccessConfig {
    @Override // com.bbva.softtokenbase.usecase.DeviceAccessConfig
    public boolean isBiometryEnabled(@NotNull Map<String, ? extends Object> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        Boolean bool = Boolean.FALSE;
        Object obj = value.get(LocalStorageConstantsKt.KEY_ACTIVE_BIO);
        if (!(obj instanceof Boolean)) {
            obj = null;
        }
        Boolean bool2 = (Boolean) obj;
        if (bool2 != null) {
            bool = bool2;
        }
        return bool.booleanValue();
    }
}
