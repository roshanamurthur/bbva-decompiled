package com.mypinpad.tsdk.isolation;

import java.io.Serializable;

/* JADX INFO: loaded from: classes10.dex */
public final class baw implements Serializable {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f54358r0 = 0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f54359s0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final int f54360p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final byte[] f54361q0;

    public baw(int i10, byte[] bArr) {
        this.f54360p0 = i10;
        this.f54361q0 = bArr;
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = (i13 * (-624)) + (i11 * (-623)) + (i10 * (-623));
        if (((i10 | i11) * 624) + ((i13 | i11) * 624) + i14 != 1) {
            baw bawVar = (baw) objArr[0];
            int i15 = f54359s0;
            int i16 = (i15 ^ 5) + ((i15 & 5) << 1);
            f54358r0 = i16 % 128;
            int i17 = i16 % 2;
            byte[] bArr = bawVar.f54361q0;
            Object[] objArr2 = new Object[1];
            if (i17 == 0) {
                objArr2[0] = bArr;
                return (byte[]) bbi.setOnFocusChangeListener(objArr2, -759448087, 759448096, (int) System.currentTimeMillis());
            }
            objArr2[0] = bArr;
            int i18 = 58 / 0;
            return (byte[]) bbi.setOnFocusChangeListener(objArr2, -759448087, 759448096, (int) System.currentTimeMillis());
        }
        baw bawVar2 = (baw) objArr[0];
        int i19 = f54358r0;
        int i20 = i19 + 61;
        f54359s0 = i20 % 128;
        int i21 = i20 % 2;
        int i22 = bawVar2.f54360p0;
        if (i21 == 0) {
            int i23 = 11 / 0;
        }
        int i24 = i19 & 101;
        int i25 = (i24 - (~((i19 ^ 101) | i24))) - 1;
        f54359s0 = i25 % 128;
        int i26 = i25 % 2;
        return Integer.valueOf(i22);
    }

    public final int setOnFocusChangeListener() {
        return ((Integer) setCompoundDrawableTintBlendMode(new Object[]{this}, 1955195146, -1955195145, System.identityHashCode(this))).intValue();
    }

    public final byte[] setCompoundDrawableTintBlendMode() {
        return (byte[]) setCompoundDrawableTintBlendMode(new Object[]{this}, 1592072604, -1592072604, System.identityHashCode(this));
    }
}
