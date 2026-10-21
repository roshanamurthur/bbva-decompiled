package com.mypinpad.tsdk.isolation;

import com.dasnano.vdvideoselfiecapture.config.VDVideoSelfieConfiguration;

/* JADX INFO: loaded from: classes10.dex */
public abstract class adr extends ady {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f52498t0 = 0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static int f52499u0 = 1;

    static {
        Integer num = 5;
        num.intValue();
        int i10 = f52499u0;
        int i11 = (i10 & 15) + (i10 | 15);
        f52498t0 = i11 % 128;
        int i12 = i11 % 2;
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        if ((((~(i10 | i12)) | (~(i11 | (~i12)))) * 627) + (((~((~i11) | i12)) | i10) * (-627)) + ((i11 | i12 | (~i10)) * (-627)) + (i11 * 628) + (i10 * 628) == 1) {
            byte[] bArr = (byte[]) objArr[0];
            int i13 = f52499u0;
            int i14 = (((i13 ^ 83) | (i13 & 83)) << 1) - (((~i13) & 83) | (i13 & (-84)));
            f52498t0 = i14 % 128;
            int i15 = i14 % 2;
            if (bArr.length != 0) {
                throw new IllegalStateException("malformed NULL encoding encountered");
            }
            afq afqVar = afq.setY;
            int i16 = f52498t0;
            int i17 = (((i16 & (-78)) | ((~i16) & 77)) - (~((i16 & 77) << 1))) - 1;
            f52499u0 = i17 % 128;
            if (i17 % 2 != 0) {
                return afqVar;
            }
            int i18 = 22 / 0;
            return afqVar;
        }
        ady adyVar = (ady) objArr[1];
        int i19 = f52498t0;
        int i20 = ((i19 ^ 116) + ((i19 & 116) << 1)) - 1;
        f52499u0 = i20 % 128;
        boolean z10 = adyVar instanceof adr;
        if (i20 % 2 == 0) {
            throw null;
        }
        if (!(!z10)) {
            int i21 = i19 + 107;
            f52499u0 = i21 % 128;
            int i22 = i21 % 2;
            return Boolean.TRUE;
        }
        int i23 = i19 & 29;
        int i24 = (i19 ^ 29) | i23;
        int i25 = (i23 ^ i24) + ((i23 & i24) << 1);
        f52499u0 = i25 % 128;
        int i26 = i25 % 2;
        int i27 = i19 + 93;
        f52499u0 = i27 % 128;
        int i28 = i27 % 2;
        return Boolean.FALSE;
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final boolean d(ady adyVar) {
        return ((Boolean) setX(new Object[]{this, adyVar}, 1356153545, -1356153545, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.adw
    public int hashCode() {
        int i10 = f52499u0;
        int i11 = i10 & 117;
        int i12 = (i10 ^ 117) | i11;
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        int i14 = i13 % 128;
        f52498t0 = i14;
        int i15 = i13 % 2;
        int i16 = ((-1) << 1) - ((((i14 | 92) << 1) - (i14 ^ 92)) ^ (-1));
        f52499u0 = i16 % 128;
        if (i16 % 2 != 0) {
            return -1;
        }
        throw null;
    }

    public String toString() {
        int i10 = f52498t0;
        int i11 = ((i10 ^ 9) | (i10 & 9)) << 1;
        int i12 = -((i10 & (-10)) | ((~i10) & 9));
        int i13 = ((i11 | i12) << 1) - (i11 ^ i12);
        f52499u0 = i13 % 128;
        int i14 = i13 % 2;
        int i15 = ((-1) << 1) - ((-1) ^ ((i10 & 72) + (i10 | 72)));
        f52499u0 = i15 % 128;
        int i16 = i15 % 2;
        return VDVideoSelfieConfiguration.NULL;
    }
}
