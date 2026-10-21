package com.mypinpad.tsdk.isolation;

import androidx.constraintlayout.core.motion.utils.TypedValues;

/* JADX INFO: loaded from: classes10.dex */
public final class alu extends all {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f53102h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f53103i = 1;

    public alu() {
        super(((Integer) setY(new Object[]{256}, 75278906, -75278905, 256)).intValue(), akp.getNavBarTitleString);
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ((~(i11 | i12)) * TypedValues.CycleType.TYPE_EASING) + (i11 * 421) + (i10 * (-419));
        int i14 = ~i10;
        int i15 = (((~(i14 | (~i11))) | (~(i11 | (~i12)))) * TypedValues.CycleType.TYPE_EASING) + ((i11 | i14) * (-420)) + i13;
        if (i15 == 1) {
            int iIntValue = ((Number) objArr[0]).intValue();
            int i16 = f53102h;
            int i17 = ((i16 | 99) << 1) - (i16 ^ 99);
            int i18 = i17 % 128;
            f53103i = i18;
            int i19 = i17 % 2;
            if (iIntValue == 224 || iIntValue == 256 || iIntValue == 384 || iIntValue == 512) {
                int i20 = ((-1) << 1) - ((i18 + 120) ^ (-1));
                f53102h = i20 % 128;
                int i21 = i20 % 2;
                return Integer.valueOf(iIntValue);
            }
            StringBuilder sb2 = new StringBuilder("'bitLength' ");
            sb2.append(iIntValue);
            sb2.append(" not supported for SHA-3");
            throw new IllegalArgumentException(sb2.toString());
        }
        if (i15 != 2) {
            alu aluVar = (alu) objArr[0];
            StringBuilder sb3 = new StringBuilder("SHA3-");
            sb3.append(aluVar.setDividerPadding);
            String string = sb3.toString();
            int i22 = f53102h;
            int i23 = (i22 ^ 99) + ((i22 & 99) << 1);
            f53103i = i23 % 128;
            int i24 = i23 % 2;
            return string;
        }
        alu aluVar2 = (alu) objArr[0];
        byte[] bArr = (byte[]) objArr[1];
        int iIntValue2 = ((Number) objArr[2]).intValue();
        int i25 = f53103i;
        int i26 = ((i25 ^ 16) + ((i25 & 16) << 1)) - 1;
        f53102h = i26 % 128;
        if (i26 % 2 != 0) {
            aluVar2.setX(2, 3);
        } else {
            aluVar2.setX(2, 2);
        }
        int compoundDrawableTintBlendMode = super.setCompoundDrawableTintBlendMode(bArr, iIntValue2);
        int i27 = f53103i;
        int i28 = i27 & 29;
        int i29 = ((i27 ^ 29) | i28) << 1;
        int i30 = -((i27 | 29) & (~i28));
        int i31 = ((i29 | i30) << 1) - (i30 ^ i29);
        f53102h = i31 % 128;
        int i32 = i31 % 2;
        return Integer.valueOf(compoundDrawableTintBlendMode);
    }

    @Override // com.mypinpad.tsdk.isolation.all, com.mypinpad.tsdk.isolation.aky
    public final int setCompoundDrawableTintBlendMode(byte[] bArr, int i10) {
        return ((Integer) setY(new Object[]{this, bArr, Integer.valueOf(i10)}, -270560318, 270560320, i10)).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.all, com.mypinpad.tsdk.isolation.aky
    public final String setX() {
        return (String) setY(new Object[]{this}, -28009056, 28009056, System.identityHashCode(this));
    }

    public alu(int i10) {
        super(((Integer) setY(new Object[]{Integer.valueOf(i10)}, 75278906, -75278905, i10)).intValue(), akp.getNavBarTitleString);
    }
}
