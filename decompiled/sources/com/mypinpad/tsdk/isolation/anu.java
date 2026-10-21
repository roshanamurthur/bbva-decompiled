package com.mypinpad.tsdk.isolation;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class anu extends anw {
    public static int E0 = 1;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static int f53353y0;

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = (((~(i10 | (~i11))) | (~(i11 | i13 | i12))) * 235) + (((~(i13 | i12)) | i11) * (-470)) + (((~((~i12) | i13)) | i11) * (-235)) + (i11 * 471) + (i10 * 236);
        if (i14 == 1) {
            anu anuVar = (anu) objArr[0];
            int i15 = E0;
            int i16 = ((i15 | 91) << 1) - (i15 ^ 91);
            f53353y0 = i16 % 128;
            int i17 = i16 % 2;
            anuVar.getClass();
            int i18 = f53353y0;
            int i19 = (i18 & (-98)) | ((~i18) & 97);
            int i20 = -(-((i18 & 97) << 1));
            int i21 = (i19 ^ i20) + ((i20 & i19) << 1);
            E0 = i21 % 128;
            int i22 = i21 % 2;
        } else if (i14 == 2) {
            anu anuVar2 = (anu) objArr[0];
            int i23 = E0;
            int i24 = (i23 ^ 101) + ((i23 & 101) << 1);
            f53353y0 = i24 % 128;
            int i25 = i24 % 2;
            anuVar2.getClass();
            if (i25 != 0) {
                int i26 = 61 / 0;
            }
            int i27 = f53353y0;
            int i28 = ((i27 ^ 26) + ((i27 & 26) << 1)) - 1;
            E0 = i28 % 128;
            if (i28 % 2 == 0) {
                int i29 = 11 / 0;
            }
        } else if (i14 == 3) {
            anu anuVar3 = (anu) objArr[0];
            int i30 = E0 + 125;
            f53353y0 = i30 % 128;
            int i31 = i30 % 2;
            anuVar3.getClass();
            if (i31 != 0) {
                int i32 = 87 / 0;
            }
            int i33 = E0;
            int i34 = (-2) - (((i33 ^ 76) + ((i33 & 76) << 1)) ^ (-1));
            f53353y0 = i34 % 128;
            int i35 = i34 % 2;
        } else if (i14 == 4) {
            anu anuVar4 = (anu) objArr[0];
            int i36 = f53353y0;
            int i37 = (i36 & (-6)) | ((~i36) & 5);
            int i38 = (i36 & 5) << 1;
            int i39 = (i37 & i38) + (i38 | i37);
            E0 = i39 % 128;
            int i40 = i39 % 2;
            anuVar4.getClass();
            int i41 = E0;
            int i42 = (i41 & 93) + (i41 | 93);
            f53353y0 = i42 % 128;
            if (i42 % 2 != 0) {
                int i43 = 30 / 0;
            }
        } else if (i14 != 5) {
            anu anuVar5 = (anu) objArr[0];
            int i44 = E0;
            int i45 = (i44 & 33) + (i44 | 33);
            f53353y0 = i45 % 128;
            int i46 = i45 % 2;
            anuVar5.getClass();
            if (i46 != 0) {
                throw null;
            }
            int i47 = f53353y0;
            int i48 = (i47 ^ 73) + ((i47 & 73) << 1);
            E0 = i48 % 128;
            if (i48 % 2 == 0) {
                throw null;
            }
        } else {
            anu anuVar6 = (anu) objArr[0];
            int i49 = f53353y0;
            int i50 = ((i49 & 96) + (i49 | 96)) - 1;
            E0 = i50 % 128;
            int i51 = i50 % 2;
            anuVar6.getClass();
            if (i51 == 0) {
                int i52 = 34 / 0;
            }
            int i53 = f53353y0;
            int i54 = (i53 & (-34)) | ((~i53) & 33);
            int i55 = (i53 & 33) << 1;
            int i56 = (i54 ^ i55) + ((i55 & i54) << 1);
            E0 = i56 % 128;
            if (i56 % 2 == 0) {
                int i57 = 72 / 0;
            }
        }
        return null;
    }

    public final BigInteger getNavBarTitleString() {
        return (BigInteger) setCompoundDrawableTintBlendMode(new Object[]{this}, -1306966966, 1306966970, System.identityHashCode(this));
    }

    public final BigInteger setLayoutAnimation() {
        return (BigInteger) setCompoundDrawableTintBlendMode(new Object[]{this}, -677268415, 677268415, System.identityHashCode(this));
    }

    public final BigInteger setNavigationOnClickListener() {
        return (BigInteger) setCompoundDrawableTintBlendMode(new Object[]{this}, 591889547, -591889545, System.identityHashCode(this));
    }

    public final BigInteger setOnLongClickListener() {
        return (BigInteger) setCompoundDrawableTintBlendMode(new Object[]{this}, 1257776024, -1257776023, System.identityHashCode(this));
    }

    public final BigInteger setY() {
        return (BigInteger) setCompoundDrawableTintBlendMode(new Object[]{this}, -120054056, 120054061, System.identityHashCode(this));
    }

    public final BigInteger setCompoundDrawableTintBlendMode() {
        return (BigInteger) setCompoundDrawableTintBlendMode(new Object[]{this}, -1732850302, 1732850305, System.identityHashCode(this));
    }
}
