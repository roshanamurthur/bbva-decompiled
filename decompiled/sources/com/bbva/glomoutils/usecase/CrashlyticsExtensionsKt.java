package com.bbva.glomoutils.usecase;

import android.content.Context;
import android.webkit.WebSettings;
import com.bbva.glomoutils.mobileservices.craslytics.Crashlytics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CrashlyticsExtensions.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"setUncaughtCrashCustomKeys", "", "Lcom/bbva/glomoutils/mobileservices/craslytics/Crashlytics;", "context", "Landroid/content/Context;", "gl-utils_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class CrashlyticsExtensionsKt {
    public static final void setUncaughtCrashCustomKeys(@NotNull Crashlytics crashlytics, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(crashlytics, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        String defaultUserAgent = WebSettings.getDefaultUserAgent(context);
        Intrinsics.checkNotNull(defaultUserAgent);
        crashlytics.setCustomKey("browser", defaultUserAgent);
        crashlytics.setCustomKey("CRITICAL_CRASH_ERROR", true);
    }
}
