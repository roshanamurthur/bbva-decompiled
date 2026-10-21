package com.bbva.actionlauncher.converter;

import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ZoomConverter.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001\u001a\n\u0010\u0002\u001a\u00020\u0003*\u00020\u0003¨\u0006\u0004"}, d2 = {"convert", "", "getZoomAndReplaceValue", "", "actionlauncher_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ZoomConverterKt {
    public static final int convert(int i10) {
        if (i10 >= 0 && i10 < 50) {
            return 20;
        }
        if (50 <= i10 && i10 < 100) {
            return 19;
        }
        if (100 <= i10 && i10 < 1000) {
            return 18;
        }
        if (1000 <= i10 && i10 < 2000) {
            return 17;
        }
        if (2000 <= i10 && i10 < 4000) {
            return 16;
        }
        if (4000 <= i10 && i10 < 8000) {
            return 15;
        }
        if (8000 <= i10 && i10 < 15000) {
            return 14;
        }
        if (15000 <= i10 && i10 < 35000) {
            return 13;
        }
        if (35000 <= i10 && i10 < 70000) {
            return 12;
        }
        if (70000 <= i10 && i10 < 150000) {
            return 11;
        }
        if (150000 <= i10 && i10 < 250000) {
            return 10;
        }
        if (250000 <= i10 && i10 < 500000) {
            return 9;
        }
        if (500000 <= i10 && i10 < 1000000) {
            return 8;
        }
        if (1000000 <= i10 && i10 < 2000000) {
            return 7;
        }
        if (2000000 <= i10 && i10 < 4000000) {
            return 6;
        }
        if (4000000 <= i10 && i10 < 10000000) {
            return 5;
        }
        if (10000000 <= i10 && i10 < 15000000) {
            return 4;
        }
        if (15000000 <= i10 && i10 < 35000000) {
            return 3;
        }
        if (35000000 > i10 || i10 >= 70000000) {
            return (70000000 > i10 || i10 >= 150000000) ? 0 : 1;
        }
        return 2;
    }

    @NotNull
    public static final String getZoomAndReplaceValue(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Regex regex = new Regex("z=\\d+");
        MatchResult matchResultFind$default = Regex.find$default(regex, str, 0, 2, null);
        if (matchResultFind$default != null) {
            String strReplace = regex.replace(str, "z=" + convert(Integer.parseInt((String) CollectionsKt___CollectionsKt.last(StringsKt__StringsKt.split$default((CharSequence) matchResultFind$default.getValue(), new String[]{"z="}, false, 0, 6, (Object) null)))));
            if (strReplace != null) {
                return strReplace;
            }
        }
        return str;
    }
}
