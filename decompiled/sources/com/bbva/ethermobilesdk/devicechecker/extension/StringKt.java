package com.bbva.ethermobilesdk.devicechecker.extension;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: String.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¨\u0006\u0004"}, d2 = {"toLowerCaseContains", "", "", "data", "devicechecker_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class StringKt {
    public static final boolean toLowerCaseContains(@NotNull String str, @NotNull String data) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(data, "data");
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
        String lowerCase = str.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return StringsKt__StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) data, false, 2, (Object) null);
    }
}
