package com.mypinpad.tsdk.isolation;

import androidx.emoji2.text.flatbuffer.a;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class aju extends adw {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f52937s0 = 0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f52938t0 = 1;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public adp f52939r0;

    public static Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (i11 * 702) + (i10 * (-700));
        int i14 = ~i10;
        int i15 = ~i11;
        int i16 = (i15 * 701) + ((i14 | i11) * (-701)) + ((~(i14 | i15)) * 701) + i13;
        if (i16 == 1) {
            aju ajuVar = (aju) objArr[0];
            int i17 = f52938t0 + 29;
            f52937s0 = i17 % 128;
            int i18 = i17 % 2;
            adp adpVar = ajuVar.f52939r0;
            if (i18 != 0) {
                throw null;
            }
            BigInteger bigInteger = (BigInteger) adp.setOnFocusChangeListener(new Object[]{adpVar}, 446421226, -446421218, System.identityHashCode(adpVar));
            int i19 = f52937s0;
            int i20 = (i19 & (-64)) | ((~i19) & 63);
            int i21 = -(-((i19 & 63) << 1));
            int i22 = (i20 ^ i21) + ((i21 & i20) << 1);
            f52938t0 = i22 % 128;
            int i23 = i22 % 2;
            return bigInteger;
        }
        if (i16 == 2) {
            aju ajuVar2 = (aju) objArr[0];
            System.identityHashCode(ajuVar2);
            System.identityHashCode(ajuVar2);
            adp adpVar2 = ajuVar2.f52939r0;
            int i24 = f52937s0;
            int i25 = ((i24 & 94) + (i24 | 94)) - 1;
            f52938t0 = i25 % 128;
            int i26 = i25 % 2;
            return adpVar2;
        }
        Object obj = objArr[0];
        int i27 = f52937s0;
        int i28 = (i27 & 97) + (i27 | 97);
        int i29 = i28 % 128;
        f52938t0 = i29;
        int i30 = i28 % 2;
        if (obj == null) {
            int i31 = i29 + 102;
            int i32 = (i31 ^ (-1)) + (i31 << 1);
            f52937s0 = i32 % 128;
            int i33 = i32 % 2;
            aju ajuVar3 = (aju) obj;
            int i34 = ((i29 | 99) << 1) - (i29 ^ 99);
            f52937s0 = i34 % 128;
            int i35 = i34 % 2;
            return ajuVar3;
        }
        if (!(obj instanceof adp)) {
            throw new IllegalArgumentException(a.c(obj, "Invalid DHPublicKey: "));
        }
        aju ajuVar4 = new aju();
        ajuVar4.f52939r0 = (adp) obj;
        int i36 = f52937s0;
        int i37 = (i36 & (-118)) | ((~i36) & 117);
        int i38 = -(-((i36 & 117) << 1));
        int i39 = (i37 & i38) + (i38 | i37);
        f52938t0 = i39 % 128;
        if (i39 % 2 == 0) {
            int i40 = 7 / 0;
        }
        return ajuVar4;
    }

    public static aju setX(Object obj) {
        return (aju) setCompoundDrawableTintBlendMode(new Object[]{obj}, -758499763, 758499763, (int) System.currentTimeMillis());
    }

    @Override // com.mypinpad.tsdk.isolation.adw, com.mypinpad.tsdk.isolation.add
    public final ady UiMessageCallbackKtWhenMappings() {
        return (ady) setCompoundDrawableTintBlendMode(new Object[]{this}, -962193702, 962193704, System.identityHashCode(this));
    }

    public final BigInteger setCompoundDrawableTintBlendMode() {
        return (BigInteger) setCompoundDrawableTintBlendMode(new Object[]{this}, 323505899, -323505898, System.identityHashCode(this));
    }
}
