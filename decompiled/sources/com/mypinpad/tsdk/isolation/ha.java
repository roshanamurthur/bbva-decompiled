package com.mypinpad.tsdk.isolation;

import com.esotericsoftware.asm.Opcodes;

/* JADX INFO: loaded from: classes10.dex */
public final class ha {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f56167a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f56168b = 1;

    public static final /* synthetic */ byte[] setCompoundDrawableTintBlendMode(getBeepOnFailure getbeeponfailure) {
        return (byte[]) setX(new Object[]{getbeeponfailure}, -409434670, 409434671, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        byte[] bArr;
        int i13 = (i11 * Opcodes.INSTANCEOF) + (i10 * Opcodes.INSTANCEOF);
        int i14 = ~i12;
        int i15 = ~i10;
        int i16 = (((~(i15 | i11)) | i14) * (-192)) + i13;
        int i17 = ~i11;
        int i18 = i15 | i17;
        int i19 = i14 | i17;
        if ((((~(i10 | i11 | i12)) | (~(i19 | i10)) | (~(i18 | i12))) * 192) + (((~i19) | (~i18)) * (-384)) + i16 != 1) {
            getBeepOnFailure getbeeponfailure = (getBeepOnFailure) objArr[0];
            int i20 = f56168b;
            int i21 = i20 & 19;
            int i22 = (i20 ^ 19) | i21;
            int i23 = (i21 ^ i22) + ((i22 & i21) << 1);
            f56167a = i23 % 128;
            int i24 = i23 % 2;
            if (getbeeponfailure == null) {
                throw new fh(4, null, 2, null);
            }
            bArr = (byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 252497730, -252497710, System.identityHashCode(getbeeponfailure));
            int i25 = f56168b;
            int i26 = i25 & 67;
            int i27 = -(-((i25 ^ 67) | i26));
            int i28 = ((i26 | i27) << 1) - (i27 ^ i26);
            f56167a = i28 % 128;
            if (i28 % 2 != 0) {
                throw null;
            }
        } else {
            getBeepOnFailure getbeeponfailure2 = (getBeepOnFailure) objArr[0];
            int i29 = f56167a;
            int i30 = ((i29 ^ 30) + ((i29 & 30) << 1)) - 1;
            f56168b = i30 % 128;
            int i31 = i30 % 2;
            bArr = (byte[]) setX(new Object[]{getbeeponfailure2}, -1578055969, 1578055969, (int) System.currentTimeMillis());
            int i32 = f56168b;
            int i33 = (((i32 ^ 11) | (i32 & 11)) << 1) - (((~i32) & 11) | (i32 & (-12)));
            f56167a = i33 % 128;
            if (i33 % 2 != 0) {
                throw null;
            }
        }
        return bArr;
    }
}
