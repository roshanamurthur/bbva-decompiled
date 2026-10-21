package org.koin.ext;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.StringsKt___StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: StringExt.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001¨\u0006\u0002"}, d2 = {"clearQuotes", "", "koin-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class StringExtKt {
    @NotNull
    public static final String clearQuotes(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str.length() <= 1 || StringsKt___StringsKt.first(str) != '\"' || StringsKt___StringsKt.last(str) != '\"') {
            return str;
        }
        String strSubstring = str.substring(1, StringsKt__StringsKt.getLastIndex(str));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }
}
