package com.mypinpad.tsdk.isolation;

import com.bbva.sl.ar.android.sslpinning.result.ResultCode;

/* JADX INFO: loaded from: classes10.dex */
public final class axj extends axg {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f54093t0 = 0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static int f54094u0 = 1;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final byte[] f54095s0;

    public axj(axi axiVar, byte[] bArr) {
        super(false, axiVar);
        this.f54095s0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr}, -150521869, 150521882, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        byte[] bArr;
        int i13 = (i11 * ResultCode.ERROR_TRUST_CERT_DATE_BEFOREVALIDITY) + (i10 * (-520));
        int i14 = ~i10;
        int i15 = ((~(i14 | i11 | i12)) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY) + i13;
        int i16 = ~(i10 | (~i11));
        if (((i16 | (~(i11 | (~i12) | i14))) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY) + (i16 * (-1042)) + i15 != 1) {
            axj axjVar = (axj) objArr[0];
            int i17 = f54093t0;
            int i18 = i17 | 15;
            int i19 = ((i18 << 1) - (~(-((~(i17 & 15)) & i18)))) - 1;
            f54094u0 = i19 % 128;
            if (i19 % 2 == 0) {
                throw null;
            }
            bArr = (byte[]) setX(new Object[]{axjVar}, 365718732, -365718731, System.identityHashCode(axjVar));
            int i20 = f54094u0;
            int i21 = (((i20 | 114) << 1) - (i20 ^ 114)) - 1;
            f54093t0 = i21 % 128;
            if (i21 % 2 != 0) {
                throw null;
            }
        } else {
            axj axjVar2 = (axj) objArr[0];
            System.identityHashCode(axjVar2);
            System.identityHashCode(axjVar2);
            bArr = (byte[]) bek.setOnFocusChangeListener(new Object[]{axjVar2.f54095s0}, -150521869, 150521882, (int) System.currentTimeMillis());
            int i22 = f54093t0;
            int i23 = i22 & 43;
            int i24 = (i22 | 43) & (~i23);
            int i25 = i23 << 1;
            int i26 = ((i24 | i25) << 1) - (i24 ^ i25);
            f54094u0 = i26 % 128;
            if (i26 % 2 == 0) {
                throw null;
            }
        }
        return bArr;
    }

    public final byte[] setY() {
        return (byte[]) setX(new Object[]{this}, -1260286548, 1260286548, System.identityHashCode(this));
    }
}
