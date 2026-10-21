package com.appsflyer.internal;

import android.app.Activity;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class AFf1qSDK implements AFf1tSDK {

    @Nullable
    private String AFInAppEventParameterName;

    private static String AFInAppEventParameterName(Activity activity) {
        Uri uriAFKeystoreWrapper = AFb1oSDK.AFKeystoreWrapper(activity);
        String string = uriAFKeystoreWrapper != null ? uriAFKeystoreWrapper.toString() : null;
        if (string == null) {
            string = "";
        }
        if (values(string)) {
            return null;
        }
        return string;
    }

    @Override // com.appsflyer.internal.AFf1tSDK
    @NotNull
    public final String AFInAppEventType(@Nullable Activity activity) {
        Uri uriAFKeystoreWrapper = AFb1oSDK.AFKeystoreWrapper(activity);
        String string = uriAFKeystoreWrapper != null ? uriAFKeystoreWrapper.toString() : null;
        return string == null ? "" : string;
    }

    @Override // com.appsflyer.internal.AFf1tSDK
    @Nullable
    public final String valueOf(@Nullable Activity activity) {
        String str = this.AFInAppEventParameterName;
        this.AFInAppEventParameterName = null;
        return (str == null || str.length() == 0) ? AFInAppEventParameterName(activity) : str;
    }

    @Override // com.appsflyer.internal.AFf1tSDK
    public final void values(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        String str = this.AFInAppEventParameterName;
        if (str == null || str.length() == 0) {
            this.AFInAppEventParameterName = AFInAppEventParameterName(activity);
        }
    }

    private static boolean values(String str) {
        return l.startsWith$default(str, "android-app://", false, 2, null);
    }
}
