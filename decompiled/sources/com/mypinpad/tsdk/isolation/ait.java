package com.mypinpad.tsdk.isolation;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class ait extends adw {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f52815s0 = 0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f52816t0 = 1;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final BigInteger f52817r0;

    public ait(BigInteger bigInteger) {
        if (bep.setCompoundDrawableTintBlendMode.compareTo(bigInteger) > 0) {
            throw new IllegalArgumentException("Invalid CRL number : not in (0..MAX)");
        }
        this.f52817r0 = bigInteger;
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (i11 * 253) + (i10 * 253);
        int i14 = ~i10;
        int i15 = ~i11;
        int i16 = ~(i14 | i15);
        int i17 = i15 | (~i12);
        int i18 = i16 | (~i17);
        int i19 = i11 | i10;
        int i20 = ~(i12 | i19);
        int i21 = (((~(i10 | i17)) | i20) * 252) + (i19 * (-252)) + ((i18 | i20) * (-252)) + i13;
        if (i21 == 1) {
            ait aitVar = (ait) objArr[0];
            StringBuilder sb2 = new StringBuilder("CRLNumber: ");
            sb2.append((BigInteger) setX(new Object[]{aitVar}, -955634571, 955634571, System.identityHashCode(aitVar)));
            String string = sb2.toString();
            int i22 = f52815s0;
            int i23 = (i22 & (-104)) | ((~i22) & 103);
            int i24 = -(-((i22 & 103) << 1));
            int i25 = (i23 & i24) + (i24 | i23);
            f52816t0 = i25 % 128;
            if (i25 % 2 != 0) {
                return string;
            }
            throw null;
        }
        if (i21 == 2) {
            adp adpVar = new adp(((ait) objArr[0]).f52817r0);
            int i26 = f52815s0;
            int i27 = i26 & 43;
            int i28 = ((i26 | 43) & (~i27)) + (i27 << 1);
            f52816t0 = i28 % 128;
            int i29 = i28 % 2;
            return adpVar;
        }
        ait aitVar2 = (ait) objArr[0];
        int i30 = f52816t0;
        int i31 = i30 & 29;
        int i32 = (i30 ^ 29) | i31;
        int i33 = (i31 ^ i32) + ((i32 & i31) << 1);
        int i34 = i33 % 128;
        f52815s0 = i34;
        int i35 = i33 % 2;
        BigInteger bigInteger = aitVar2.f52817r0;
        if (i35 != 0) {
            int i36 = 88 / 0;
        }
        int i37 = i34 + 43;
        f52816t0 = i37 % 128;
        int i38 = i37 % 2;
        return bigInteger;
    }

    @Override // com.mypinpad.tsdk.isolation.adw, com.mypinpad.tsdk.isolation.add
    public final ady UiMessageCallbackKtWhenMappings() {
        return (ady) setX(new Object[]{this}, 1947909219, -1947909217, System.identityHashCode(this));
    }

    public final String toString() {
        return (String) setX(new Object[]{this}, -4768765, 4768766, System.identityHashCode(this));
    }
}
