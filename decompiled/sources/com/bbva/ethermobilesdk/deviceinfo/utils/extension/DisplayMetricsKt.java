package com.bbva.ethermobilesdk.deviceinfo.utils.extension;

import android.util.DisplayMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DisplayMetrics.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¨\u0006\u0003"}, d2 = {"Landroid/util/DisplayMetrics;", "", "scaleFactor", "deviceinfo_release"}, k = 2, mv = {1, 8, 0})
public final class DisplayMetricsKt {
    public static final IntRange a(int i10, int i11) {
        return new IntRange(i10 + 1, i11);
    }

    @NotNull
    public static final String scaleFactor(@NotNull DisplayMetrics displayMetrics) {
        Intrinsics.checkNotNullParameter(displayMetrics, "<this>");
        int i10 = displayMetrics.densityDpi;
        IntRange intRangeA = a(0, 120);
        int first = intRangeA.getFirst();
        if (i10 <= intRangeA.getLast() && first <= i10) {
            return "ldpi";
        }
        IntRange intRangeA2 = a(120, 160);
        int first2 = intRangeA2.getFirst();
        if (i10 > intRangeA2.getLast() || first2 > i10) {
            IntRange intRangeA3 = a(160, 240);
            int first3 = intRangeA3.getFirst();
            if (i10 <= intRangeA3.getLast() && first3 <= i10) {
                return "hdpi";
            }
            IntRange intRangeA4 = a(240, 320);
            int first4 = intRangeA4.getFirst();
            if (i10 <= intRangeA4.getLast() && first4 <= i10) {
                return "xhdpi";
            }
            IntRange intRangeA5 = a(320, 480);
            int first5 = intRangeA5.getFirst();
            if (i10 <= intRangeA5.getLast() && first5 <= i10) {
                return "xxhdpi";
            }
            IntRange intRangeA6 = a(480, 640);
            int first6 = intRangeA6.getFirst();
            if (i10 <= intRangeA6.getLast() && first6 <= i10) {
                return "xxxhdpi";
            }
        }
        return "mdpi";
    }
}
