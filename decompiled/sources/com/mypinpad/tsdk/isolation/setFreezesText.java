package com.mypinpad.tsdk.isolation;

import android.util.Base64;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class setFreezesText {
    @NotNull
    public static final String setOnFocusChangeListener(@NotNull byte[] bArr) {
        return (String) setY(new Object[]{bArr}, -1175135662, 1175135662, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        byte[] bArr = (byte[]) objArr[0];
        Intrinsics.checkNotNullParameter(bArr, "");
        String strEncodeToString = Base64.encodeToString(bArr, 8);
        Intrinsics.checkNotNullExpressionValue(strEncodeToString, "");
        return strEncodeToString;
    }
}
