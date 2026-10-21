package com.mypinpad.tsdk.isolation;

import androidx.databinding.c;

/* JADX INFO: loaded from: classes10.dex */
public final class avj extends adw {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f53962s0 = 0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f53963t0 = 1;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public byte[] f53964r0;

    public avj(byte[] bArr) {
        this.f53964r0 = bArr;
    }

    public static Object setX(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i11;
        int i14 = (i13 * (-629)) + (i11 * (-628)) + (i10 * 630);
        int i15 = ~i10;
        int i16 = ((i15 | i11) * 629) + ((~(i13 | i15)) * (-629)) + i14;
        if (i16 == 1) {
            avj avjVar = (avj) objArr[0];
            adh adhVar = new adh();
            afv afvVarA = c.a(adhVar, new Object[]{adhVar, new aft(avjVar.f53964r0)}, 240298319, -240298315, adhVar);
            int i17 = f53963t0;
            int i18 = i17 | 99;
            int i19 = ((i18 << 1) - (~(-((~(i17 & 99)) & i18)))) - 1;
            f53962s0 = i19 % 128;
            int i20 = i19 % 2;
            return afvVarA;
        }
        if (i16 == 2) {
            avj avjVar2 = (avj) objArr[0];
            int i21 = f53963t0;
            int i22 = ((((i21 ^ 71) | (i21 & 71)) << 1) - (~(-(((~i21) & 71) | (i21 & (-72)))))) - 1;
            f53962s0 = i22 % 128;
            int i23 = i22 % 2;
            byte[] bArr = (byte[]) bek.setOnFocusChangeListener(new Object[]{avjVar2.f53964r0}, -150521869, 150521882, (int) System.currentTimeMillis());
            int i24 = f53962s0;
            int i25 = i24 & 65;
            int i26 = -(-(i24 | 65));
            int i27 = (i25 ^ i26) + ((i26 & i25) << 1);
            f53963t0 = i27 % 128;
            int i28 = i27 % 2;
            return bArr;
        }
        Object obj = objArr[0];
        int i29 = f53962s0;
        int i30 = i29 & 107;
        int i31 = (i29 ^ 107) | i30;
        int i32 = ((i30 | i31) << 1) - (i30 ^ i31);
        f53963t0 = i32 % 128;
        int i33 = i32 % 2;
        if (!(!(obj instanceof avj))) {
            int i34 = i29 + 69;
            int i35 = i34 % 128;
            f53963t0 = i35;
            int i36 = i34 % 2;
            avj avjVar3 = (avj) obj;
            int i37 = i35 + 17;
            f53962s0 = i37 % 128;
            int i38 = i37 % 2;
            return avjVar3;
        }
        if (obj == null) {
            int i39 = i29 & 45;
            int i40 = (i29 ^ 45) | i39;
            int i41 = (i39 ^ i40) + ((i39 & i40) << 1);
            f53963t0 = i41 % 128;
            if (i41 % 2 != 0) {
                return null;
            }
            int i42 = 94 / 0;
            return null;
        }
        aed compoundDrawableTintBlendMode = aed.setCompoundDrawableTintBlendMode(obj);
        avj avjVar4 = new avj();
        ads adsVar = (ads) ads.setDividerPadding(new Object[]{compoundDrawableTintBlendMode.setX(0)}, 1337255032, -1337255030, (int) System.currentTimeMillis());
        avjVar4.f53964r0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{(byte[]) ads.setDividerPadding(new Object[]{adsVar}, -952512304, 952512305, System.identityHashCode(adsVar))}, -150521869, 150521882, (int) System.currentTimeMillis());
        int i43 = f53963t0;
        int i44 = (-2) - (((i43 & 120) + (i43 | 120)) ^ (-1));
        f53962s0 = i44 % 128;
        int i45 = i44 % 2;
        return avjVar4;
    }

    public static avj setY(Object obj) {
        return (avj) setX(new Object[]{obj}, 557978652, -557978652, (int) System.currentTimeMillis());
    }

    @Override // com.mypinpad.tsdk.isolation.adw, com.mypinpad.tsdk.isolation.add
    public final ady UiMessageCallbackKtWhenMappings() {
        return (ady) setX(new Object[]{this}, -1971446477, 1971446478, System.identityHashCode(this));
    }

    public final byte[] setY() {
        return (byte[]) setX(new Object[]{this}, 143831184, -143831182, System.identityHashCode(this));
    }
}
