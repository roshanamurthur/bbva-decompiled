package com.appsflyer.internal;

import android.content.Context;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface AFb1jSDK {

    public static final class AFa1xSDK {

        @Nullable
        public final String AFInAppEventType;
        public final float AFKeystoreWrapper;

        public AFa1xSDK(float f6, @Nullable String str) {
            this.AFKeystoreWrapper = f6;
            this.AFInAppEventType = str;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AFa1xSDK)) {
                return false;
            }
            AFa1xSDK aFa1xSDK = (AFa1xSDK) obj;
            return Intrinsics.areEqual((Object) Float.valueOf(this.AFKeystoreWrapper), (Object) Float.valueOf(aFa1xSDK.AFKeystoreWrapper)) && Intrinsics.areEqual(this.AFInAppEventType, aFa1xSDK.AFInAppEventType);
        }

        public final int hashCode() {
            int iFloatToIntBits = Float.floatToIntBits(this.AFKeystoreWrapper) * 31;
            String str = this.AFInAppEventType;
            return iFloatToIntBits + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("BatteryData(level=");
            sb2.append(this.AFKeystoreWrapper);
            sb2.append(", charging=");
            sb2.append(this.AFInAppEventType);
            sb2.append(RootService.CLOSE_BRACKET);
            return sb2.toString();
        }
    }

    @NotNull
    AFa1xSDK AFInAppEventParameterName(@NotNull Context context);
}
