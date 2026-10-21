package com.appsflyer.internal;

import androidx.annotation.VisibleForTesting;
import androidx.webkit.ProxyConfig;
import com.appsflyer.AFLogger;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class AFc1pSDK {

    @VisibleForTesting
    private static String AFInAppEventParameterName;

    @VisibleForTesting
    private static String AFKeystoreWrapper;
    public final ExecutorService valueOf;
    public final AFc1mSDK values;

    public AFc1pSDK() {
    }

    public AFc1pSDK(AFc1mSDK aFc1mSDK, ExecutorService executorService) {
        this.values = aFc1mSDK;
        this.valueOf = executorService;
    }

    public static void AFInAppEventParameterName(String str) {
        AFKeystoreWrapper = str;
        if (str == null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < str.length(); i10++) {
            if (i10 == 0 || i10 == str.length() - 1) {
                sb2.append(str.charAt(i10));
            } else {
                sb2.append(ProxyConfig.MATCH_ALL_SCHEMES);
            }
        }
        AFInAppEventParameterName = sb2.toString();
    }

    public static void AFKeystoreWrapper(String str) {
        if (AFKeystoreWrapper == null) {
            AFInAppEventParameterName(AFa1dSDK.valueOf().AFInAppEventParameterName().AFVersionDeclaration().AFInAppEventType);
        }
        String str2 = AFKeystoreWrapper;
        if (str2 != null) {
            AFLogger.afInfoLog(str.replace(str2, AFInAppEventParameterName));
        }
    }

    @NotNull
    public static final List<StackTraceElement> valueOf(@NotNull Throwable th2) {
        Intrinsics.checkNotNullParameter(th2, "");
        StackTraceElement[] stackTrace = th2.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "");
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTrace) {
            String className = stackTraceElement.getClassName();
            Intrinsics.checkNotNullExpressionValue(className, "");
            if (!l.startsWith$default(className, "com.appsflyer", false, 2, null)) {
                stackTraceElement = null;
            }
            if (stackTraceElement != null) {
                arrayList.add(stackTraceElement);
            }
        }
        return arrayList;
    }
}
