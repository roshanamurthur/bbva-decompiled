package com.bbva.dynamiclinks.extensions;

import bk.q;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: StringExtensions.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\u001a\"\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u0002*\u00020\u00002\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0000¨\u0006\u0004"}, d2 = {"", "delimiter", "", "extractAllValues", "dynamiclinks_release"}, k = 2, mv = {1, 6, 0})
public final class StringExtensionsKt {
    @NotNull
    public static final Map<String, String> extractAllValues(@NotNull String str, @NotNull String delimiter) {
        Pair pair;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        if (!StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) delimiter, false, 2, (Object) null)) {
            return q.emptyMap();
        }
        List<String> listSplit$default = StringsKt__StringsKt.split$default((CharSequence) str, new String[]{delimiter}, false, 0, 6, (Object) null);
        ArrayList arrayList = new ArrayList();
        for (String str2 : listSplit$default) {
            int length = str2.length();
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    i10 = -1;
                    break;
                }
                int i11 = i10 + 1;
                if (str2.charAt(i10) == '=') {
                    break;
                }
                i10 = i11;
            }
            if (i10 != -1) {
                String strSubstring = str2.substring(0, i10);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                String strSubstring2 = str2.substring(i10 + 1, str2.length());
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                pair = TuplesKt.to(strSubstring, strSubstring2);
            } else {
                pair = null;
            }
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        return q.toMap(arrayList);
    }

    public static /* synthetic */ Map extractAllValues$default(String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str2 = "&";
        }
        return extractAllValues(str, str2);
    }
}
