package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class setKeyboardNavigationCluster extends Endpoint {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f59937q0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final byte[] f59938p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setKeyboardNavigationCluster(@NotNull byte[] bArr) {
        super(null, 1, null);
        Intrinsics.checkNotNullParameter(bArr, "");
        this.f59938p0 = bArr;
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        setKeyboardNavigationCluster setkeyboardnavigationcluster = (setKeyboardNavigationCluster) objArr[0];
        int i13 = f59937q0;
        int i14 = (i13 | 89) << 1;
        int i15 = -(i13 ^ 89);
        int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
        int i17 = i16 % 128;
        int i18 = i16 % 2;
        byte[] bArr = setkeyboardnavigationcluster.f59938p0;
        int i19 = i17 & 103;
        int i20 = i19 + ((i17 ^ 103) | i19);
        f59937q0 = i20 % 128;
        if (i20 % 2 == 0) {
            return bArr;
        }
        throw null;
    }

    @NotNull
    public final byte[] setX() {
        return (byte[]) setY(new Object[]{this}, 32326471, -32326471, System.identityHashCode(this));
    }
}
