package com.mypinpad.tsdk.isolation;

import androidx.databinding.c;

/* JADX INFO: loaded from: classes10.dex */
public final class avx extends adw {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f54027t0 = 0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static int f54028u0 = 1;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final byte[] f54029r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final byte[] f54030s0;

    public avx(aed aedVar) {
        if (!((Boolean) adp.setOnFocusChangeListener(new Object[]{(adp) adp.setOnFocusChangeListener(new Object[]{aedVar.setX(0)}, -837021952, 837021958, (int) System.currentTimeMillis()), 0}, 920356441, -920356436, 0)).booleanValue()) {
            throw new IllegalArgumentException("unknown version of sequence");
        }
        ads adsVar = (ads) ads.setDividerPadding(new Object[]{aedVar.setX(1)}, 1337255032, -1337255030, (int) System.currentTimeMillis());
        this.f54029r0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{(byte[]) ads.setDividerPadding(new Object[]{adsVar}, -952512304, 952512305, System.identityHashCode(adsVar))}, -150521869, 150521882, (int) System.currentTimeMillis());
        ads adsVar2 = (ads) ads.setDividerPadding(new Object[]{aedVar.setX(2)}, 1337255032, -1337255030, (int) System.currentTimeMillis());
        this.f54030s0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{(byte[]) ads.setDividerPadding(new Object[]{adsVar2}, -952512304, 952512305, System.identityHashCode(adsVar2))}, -150521869, 150521882, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        Object avxVar;
        int i13 = ~i10;
        int i14 = ~i11;
        int i15 = i13 | i14;
        int i16 = ~i15;
        int i17 = ~i12;
        int i18 = ((i16 | (~(i13 | i17)) | (~(i14 | i17))) * (-1136)) + (i11 * 569) + (i10 * 569);
        int i19 = i10 | i17;
        int i20 = (((~i19) | (~(i11 | i17)) | (~(i15 | i12))) * 568) + (((~(i13 | i12)) | (~(i14 | i12)) | (~(i19 | i11))) * (-568)) + i18;
        if (i20 == 1) {
            avx avxVar2 = (avx) objArr[0];
            int i21 = f54027t0;
            int i22 = i21 & 69;
            int i23 = (((i21 | 69) & (~i22)) - (~(-(-(i22 << 1))))) - 1;
            f54028u0 = i23 % 128;
            int i24 = i23 % 2;
            byte[] bArr = (byte[]) bek.setOnFocusChangeListener(new Object[]{avxVar2.f54030s0}, -150521869, 150521882, (int) System.currentTimeMillis());
            int i25 = f54027t0;
            int i26 = (i25 & 43) + (i25 | 43);
            f54028u0 = i26 % 128;
            int i27 = i26 % 2;
            return bArr;
        }
        if (i20 == 2) {
            Object obj = objArr[0];
            int i28 = f54027t0;
            int i29 = (i28 & 59) + (i28 | 59);
            int i30 = i29 % 128;
            f54028u0 = i30;
            int i31 = i29 % 2;
            if (obj == null) {
                int i32 = i30 & 79;
                int i33 = (i30 ^ 79) | i32;
                int i34 = (i32 ^ i33) + ((i32 & i33) << 1);
                f54027t0 = i34 % 128;
                int i35 = i34 % 2;
                return null;
            }
            avxVar = new avx(aed.setCompoundDrawableTintBlendMode(obj));
            int i36 = f54027t0;
            int i37 = ((((i36 ^ 23) | (i36 & 23)) << 1) - (~(-(((~i36) & 23) | (i36 & (-24)))))) - 1;
            f54028u0 = i37 % 128;
            int i38 = i37 % 2;
        } else {
            if (i20 != 3) {
                avx avxVar3 = (avx) objArr[0];
                adh adhVar = new adh();
                adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, new adp(0L)}, 240298319, -240298315, System.identityHashCode(adhVar));
                adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, new aft(avxVar3.f54029r0)}, 240298319, -240298315, System.identityHashCode(adhVar));
                afv afvVarA = c.a(adhVar, new Object[]{adhVar, new aft(avxVar3.f54030s0)}, 240298319, -240298315, adhVar);
                int i39 = f54028u0;
                int i40 = i39 ^ 61;
                int i41 = ((i39 & 61) | i40) << 1;
                int i42 = -i40;
                int i43 = ((i41 | i42) << 1) - (i41 ^ i42);
                f54027t0 = i43 % 128;
                int i44 = i43 % 2;
                return afvVarA;
            }
            avx avxVar4 = (avx) objArr[0];
            int i45 = f54027t0;
            int i46 = (((i45 | 46) << 1) - (i45 ^ 46)) - 1;
            f54028u0 = i46 % 128;
            int i47 = i46 % 2;
            byte[] bArr2 = avxVar4.f54029r0;
            Object[] objArr2 = new Object[1];
            if (i47 == 0) {
                objArr2[0] = bArr2;
                avxVar = (byte[]) bek.setOnFocusChangeListener(objArr2, -150521869, 150521882, (int) System.currentTimeMillis());
                int i48 = 78 / 0;
            } else {
                objArr2[0] = bArr2;
                avxVar = (byte[]) bek.setOnFocusChangeListener(objArr2, -150521869, 150521882, (int) System.currentTimeMillis());
            }
            System.identityHashCode(avxVar4);
            System.identityHashCode(avxVar4);
        }
        return avxVar;
    }

    public static avx setX(Object obj) {
        return (avx) setDividerPadding(new Object[]{obj}, 744650889, -744650887, (int) System.currentTimeMillis());
    }

    @Override // com.mypinpad.tsdk.isolation.adw, com.mypinpad.tsdk.isolation.add
    public final ady UiMessageCallbackKtWhenMappings() {
        return (ady) setDividerPadding(new Object[]{this}, 2077600986, -2077600986, System.identityHashCode(this));
    }

    public final byte[] setOnFocusChangeListener() {
        return (byte[]) setDividerPadding(new Object[]{this}, 628529069, -628529066, System.identityHashCode(this));
    }

    public final byte[] setY() {
        return (byte[]) setDividerPadding(new Object[]{this}, 1442270359, -1442270358, System.identityHashCode(this));
    }

    public avx(byte[] bArr, byte[] bArr2) {
        this.f54029r0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr}, -150521869, 150521882, (int) System.currentTimeMillis());
        this.f54030s0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr2}, -150521869, 150521882, (int) System.currentTimeMillis());
    }
}
