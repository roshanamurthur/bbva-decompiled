package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class acw {
    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i11;
        int i14 = ~(i13 | i10);
        int i15 = ~i12;
        int i16 = ~(i15 | i10);
        if (((i13 | i16) * 712) + (((~(i10 | i11 | i12)) | (~(i13 | i15 | i10))) * (-712)) + ((i14 | i16) * (-712)) + (i11 * 713) + (i10 * (-711)) != 1) {
            byte[] bArr = (byte[]) objArr[0];
            Intrinsics.checkNotNullParameter(bArr, "");
            return new String(bArr, Charsets.UTF_8);
        }
        String str = (String) objArr[0];
        Intrinsics.checkNotNullParameter(str, "");
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        return bytes;
    }

    @NotNull
    public static final byte[] setX(@NotNull String str) {
        return (byte[]) setDividerPadding(new Object[]{str}, 211431428, -211431427, (int) System.currentTimeMillis());
    }

    @NotNull
    public static final String setY(@NotNull byte[] bArr) {
        return (String) setDividerPadding(new Object[]{bArr}, 1446332990, -1446332990, (int) System.currentTimeMillis());
    }
}
