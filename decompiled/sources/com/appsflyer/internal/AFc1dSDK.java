package com.appsflyer.internal;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class AFc1dSDK {

    @NotNull
    final String AFInAppEventParameterName;

    @NotNull
    final String values;

    public AFc1dSDK(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.AFInAppEventParameterName = str;
        this.values = str2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFc1dSDK)) {
            return false;
        }
        AFc1dSDK aFc1dSDK = (AFc1dSDK) obj;
        return Intrinsics.areEqual(this.AFInAppEventParameterName, aFc1dSDK.AFInAppEventParameterName) && Intrinsics.areEqual(this.values, aFc1dSDK.values);
    }

    public final int hashCode() {
        return this.values.hashCode() + (this.AFInAppEventParameterName.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HostConfig(prefix=");
        sb2.append(this.AFInAppEventParameterName);
        sb2.append(", host=");
        sb2.append(this.values);
        sb2.append(RootService.CLOSE_BRACKET);
        return sb2.toString();
    }
}
