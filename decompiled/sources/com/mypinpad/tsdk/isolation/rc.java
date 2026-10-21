package com.mypinpad.tsdk.isolation;

import com.bbva.sl.ar.android.libkeymanagement.exception.ReturnCode;
import com.esotericsoftware.asm.Opcodes;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class rc extends qw {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f58083s0 = 1;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f58084q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @Nullable
    public final String f58085r0;

    public rc(int i10, @Nullable String str, @Nullable String str2) {
        super(str2, null);
        this.f58084q0 = i10;
        this.f58085r0 = str;
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (i11 * Opcodes.INSTANCEOF) + (i10 * Opcodes.INSTANCEOF);
        int i14 = ~i12;
        int i15 = ~i10;
        int i16 = (((~(i15 | i11)) | i14) * (-192)) + i13;
        int i17 = ~i11;
        int i18 = i15 | i17;
        int i19 = i14 | i17;
        if ((((~(i10 | i11 | i12)) | (~(i19 | i10)) | (~(i18 | i12))) * 192) + (((~i19) | (~i18)) * (-384)) + i16 == 1) {
            rc rcVar = (rc) objArr[0];
            int i20 = f58083s0;
            int i21 = (i20 & 7) + (i20 | 7);
            int i22 = i21 % 128;
            int i23 = i21 % 2;
            int i24 = rcVar.f58084q0;
            int i25 = i22 & 15;
            int i26 = (i22 | 15) & (~i25);
            int i27 = -(-(i25 << 1));
            int i28 = (i26 & i27) + (i26 | i27);
            f58083s0 = i28 % 128;
            int i29 = i28 % 2;
            return Integer.valueOf(i24);
        }
        rc rcVar2 = (rc) objArr[0];
        int iIdentityHashCode = System.identityHashCode(rcVar2);
        int i30 = ~(2061225946 | iIdentityHashCode);
        int i31 = 17051680 & i30;
        int i32 = (-1328662706) - (~(-(-((((i30 | 17051680) & (~i31)) | i31) * ReturnCode.ERR_CONN_IO))));
        int i33 = 2078277626 & iIdentityHashCode;
        int i34 = (iIdentityHashCode | 2078277626) & (~i33);
        int i35 = -(-((~((i34 & i33) | (i34 ^ i33))) * (-1504)));
        int i36 = ((i32 | i35) << 1) - (i35 ^ i32);
        int i37 = i36 | 1334410000;
        int i38 = ((i37 << 1) - (~(-((~(1334410000 & i36)) & i37)))) - 1;
        int iIdentityHashCode2 = System.identityHashCode(rcVar2);
        int i39 = (-1604455985) & iIdentityHashCode2;
        int i40 = (~i39) & ((-1604455985) | iIdentityHashCode2);
        int i41 = ~iIdentityHashCode2;
        int i42 = i40 | i39;
        int i43 = ~i42;
        int i44 = (i42 | i43) & i43;
        int i45 = 1553991168 & i44;
        int i46 = (((i44 | 1553991168) & (~i45)) | i45) * (-280);
        int i47 = ((-1486946998) & i46) + (i46 | (-1486946998));
        int i48 = ~((i39 & i40) | (i40 ^ i39));
        int i49 = ((-587671603) ^ iIdentityHashCode2) | ((-587671603) & iIdentityHashCode2);
        int i50 = ~i49;
        int i51 = (i49 | i50) & i50;
        int i52 = ((~i51) & i48) | ((~i48) & i51);
        int i53 = i48 & i51;
        int i54 = -(-(((i53 & i52) | (i52 ^ i53)) * 140));
        int i55 = ((~i54) & i47) | ((~i47) & i54);
        int i56 = -(-((i54 & i47) << 1));
        int i57 = (i55 & i56) + (i56 | i55);
        int i58 = ~(((-50464817) & iIdentityHashCode2) | ((-50464817) ^ iIdentityHashCode2));
        int i59 = ((~i41) & (-1604455985)) | (i41 & 1604455984);
        int i60 = (-1604455985) & i41;
        int i61 = (i59 & i60) | (i59 ^ i60);
        int i62 = i61 ^ 587671602;
        int i63 = i61 & 587671602;
        int i64 = ~((i63 & i62) | (i62 ^ i63));
        int i65 = (i58 & i64) | (i58 ^ i64);
        int i66 = (iIdentityHashCode2 | i41) & i41;
        int i67 = (-587671603) & i66;
        int i68 = (i66 | (-587671603)) & (~i67);
        int i69 = (i68 & i67) | (i68 ^ i67);
        int i70 = ((-1604455985) & i69) | ((~i69) & 1604455984);
        int i71 = i69 & 1604455984;
        int i72 = (i71 & i70) | (i70 ^ i71);
        int i73 = ~i72;
        int i74 = (i72 | i73) & i73;
        int i75 = -(-(((i74 & i65) | (i65 ^ i74)) * 140));
        int i76 = ((i57 | i75) << 1) - (i75 ^ i57);
        String str = rcVar2.f58085r0;
        if (i38 > i76) {
            return str;
        }
        throw null;
    }

    @Nullable
    public final String setCompoundDrawableTintBlendMode() {
        return (String) setX(new Object[]{this}, 452546652, -452546652, System.identityHashCode(this));
    }

    public final int setOnFocusChangeListener() {
        return ((Integer) setX(new Object[]{this}, -1868871430, 1868871431, System.identityHashCode(this))).intValue();
    }
}
