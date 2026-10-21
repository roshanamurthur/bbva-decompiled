package com.mypinpad.tsdk.isolation;

import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public final class afq extends adr {
    public static final afq setY = new afq();
    public static final byte[] v0 = new byte[0];

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static int f52600w0 = 0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static int f52601x0 = 1;

    static {
        int i10 = f52601x0;
        int i11 = ((i10 ^ 55) | (i10 & 55)) << 1;
        int i12 = -(((~i10) & 55) | (i10 & (-56)));
        int i13 = (i11 & i12) + (i12 | i11);
        f52600w0 = i13 % 128;
        int i14 = i13 % 2;
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) throws IOException {
        Object x4;
        int i13 = ((i10 | (~(i11 | (~i12)))) * 56) + ((~(i10 | i11)) * (-56)) + (((~(i10 | i12)) | i11) * 56) + (i11 * (-55)) + (i10 * (-55));
        if (i13 == 1) {
            int i14 = f52600w0;
            int i15 = i14 & 85;
            int i16 = -(-(i14 | 85));
            int i17 = (i15 & i16) + (i15 | i16);
            f52601x0 = i17 % 128;
            int i18 = i17 % 2;
            int i19 = i14 + 39;
            f52601x0 = i19 % 128;
            int i20 = i19 % 2;
            return Boolean.FALSE;
        }
        if (i13 == 2) {
            aeb aebVar = (aeb) objArr[1];
            boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
            int i21 = f52600w0 + 67;
            f52601x0 = i21 % 128;
            int i22 = i21 % 2;
            byte[] bArr = v0;
            if (i22 == 0) {
                aeb.setX(new Object[]{aebVar, Boolean.valueOf(zBooleanValue), 2, bArr}, 478760665, -478760661, 2);
            } else {
                aeb.setX(new Object[]{aebVar, Boolean.valueOf(zBooleanValue), 5, bArr}, 478760665, -478760661, 5);
            }
            int i23 = f52600w0 + 85;
            f52601x0 = i23 % 128;
            int i24 = i23 % 2;
            return null;
        }
        boolean zBooleanValue2 = ((Boolean) objArr[1]).booleanValue();
        int i25 = f52601x0;
        int i26 = (i25 ^ 93) + ((i25 & 93) << 1);
        f52600w0 = i26 % 128;
        int i27 = i26 % 2;
        Object[] objArr2 = new Object[2];
        Boolean boolValueOf = Boolean.valueOf(zBooleanValue2);
        if (i27 != 0) {
            objArr2[0] = boolValueOf;
            objArr2[1] = 1;
            x4 = aeb.setX(objArr2, 1150803379, -1150803367, 1);
        } else {
            objArr2[0] = boolValueOf;
            objArr2[1] = 0;
            x4 = aeb.setX(objArr2, 1150803379, -1150803367, 0);
        }
        return Integer.valueOf(((Integer) x4).intValue());
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final int b(boolean z10) {
        return ((Integer) setCompoundDrawableTintBlendMode(new Object[]{this, Boolean.valueOf(z10)}, 620118974, -620118974, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final void c(aeb aebVar, boolean z10) throws IOException {
        setCompoundDrawableTintBlendMode(new Object[]{this, aebVar, Boolean.valueOf(z10)}, -180033289, 180033291, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final boolean setY() {
        return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{this}, -1353055185, 1353055186, System.identityHashCode(this))).booleanValue();
    }
}
