package com.bbva.plugin.google.pay.utils;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Extensions.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0005"}, d2 = {"isAmex", "", "", "isValidPan", "isVisaOrMc", "google-pay-plugin_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ExtensionsKt {
    public static final boolean isAmex(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return str.length() == 15;
    }

    public static final boolean isValidPan(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return isVisaOrMc(str) || isAmex(str);
    }

    public static final boolean isVisaOrMc(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return str.length() == 16;
    }
}
