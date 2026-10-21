package com.mypinpad.tsdk.isolation;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.spec.MGF1ParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class dy {
    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) throws NoSuchAlgorithmException {
        byte[] bArr = (byte[]) objArr[0];
        Intrinsics.checkNotNullParameter(bArr, "");
        MessageDigest messageDigest = MessageDigest.getInstance(MGF1ParameterSpec.SHA1.getDigestAlgorithm());
        byte[] bArrDigest = messageDigest.digest(bArr);
        messageDigest.reset();
        Intrinsics.checkNotNullExpressionValue(bArrDigest, "");
        return bArrDigest;
    }

    @NotNull
    public static final byte[] setY(@NotNull byte[] bArr) {
        return (byte[]) setDividerPadding(new Object[]{bArr}, 504323118, -504323118, (int) System.currentTimeMillis());
    }
}
