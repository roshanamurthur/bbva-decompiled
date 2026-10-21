package com.bbva.ethermobilesdk.passchecker.util;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Levenshtein.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¨\u0006\u0005"}, d2 = {"levenshtein", "", "lhs", "", "rhs", "passchecker_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class LevenshteinKt {
    public static final int levenshtein(@NotNull CharSequence lhs, @NotNull CharSequence rhs) {
        Intrinsics.checkNotNullParameter(lhs, "lhs");
        Intrinsics.checkNotNullParameter(rhs, "rhs");
        if (Intrinsics.areEqual(lhs, rhs)) {
            return 0;
        }
        if (lhs.length() == 0) {
            return rhs.length();
        }
        if (rhs.length() == 0) {
            return lhs.length();
        }
        int length = lhs.length();
        int i10 = length + 1;
        int length2 = rhs.length() + 1;
        Integer[] numArr = new Integer[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            numArr[i11] = Integer.valueOf(i11);
        }
        Integer[] numArr2 = new Integer[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            numArr2[i12] = 0;
        }
        int i13 = 1;
        while (i13 < length2) {
            numArr2[0] = Integer.valueOf(i13);
            for (int i14 = 1; i14 < i10; i14++) {
                int i15 = i14 - 1;
                numArr2[i14] = Integer.valueOf(Math.min(Math.min(numArr[i14].intValue() + 1, numArr2[i15].intValue() + 1), numArr[i15].intValue() + (lhs.charAt(i15) == rhs.charAt(i13 + (-1)) ? 0 : 1)));
            }
            i13++;
            Integer[] numArr3 = numArr2;
            numArr2 = numArr;
            numArr = numArr3;
        }
        return numArr[length].intValue();
    }
}
