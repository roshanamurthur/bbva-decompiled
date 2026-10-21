package com.mypinpad.tsdk.isolation;

import java.security.SecureRandom;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class setRemoteViewsAdapter {
    public static final void setOnFocusChangeListener(@NotNull byte[] bArr) {
        setX(new Object[]{bArr}, 1811924153, -1811924153, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        byte[] bArr = (byte[]) objArr[0];
        Intrinsics.checkNotNullParameter(bArr, "");
        new SecureRandom().nextBytes(bArr);
        return null;
    }
}
