package com.mypinpad.tsdk.isolation;

import androidx.databinding.c;

/* JADX INFO: loaded from: classes10.dex */
public final class avn extends adw {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f53983t0 = 0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static int f53984u0 = 1;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public byte[] f53985r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public byte[] f53986s0;

    public avn(byte[] bArr, byte[] bArr2) {
        this.f53985r0 = bArr;
        this.f53986s0 = bArr2;
    }

    public static Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        int i13;
        int i14 = (((~i10) | i11) * 160) + (i11 * (-159)) + (i10 * (-159));
        int i15 = ~i12;
        int i16 = ((i10 | (~((~i11) | i15))) * 160) + (((~(i15 | i10)) | (~(i10 | i11))) * (-160)) + i14;
        if (i16 == 1) {
            avn avnVar = (avn) objArr[0];
            adh adhVar = new adh();
            adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, new aft(avnVar.f53985r0)}, 240298319, -240298315, System.identityHashCode(adhVar));
            afv afvVarA = c.a(adhVar, new Object[]{adhVar, new aft(avnVar.f53986s0)}, 240298319, -240298315, adhVar);
            int i17 = f53983t0;
            int i18 = (i17 ^ 43) + ((i17 & 43) << 1);
            f53984u0 = i18 % 128;
            int i19 = i18 % 2;
            return afvVarA;
        }
        avn avnVar2 = null;
        if (i16 == 2) {
            avn avnVar3 = (avn) objArr[0];
            int i20 = f53983t0;
            int i21 = ((i20 | 109) << 1) - (i20 ^ 109);
            f53984u0 = i21 % 128;
            int i22 = i21 % 2;
            byte[] bArr = avnVar3.f53986s0;
            Object[] objArr2 = new Object[1];
            if (i22 != 0) {
                objArr2[0] = bArr;
                return (byte[]) bek.setOnFocusChangeListener(objArr2, -150521869, 150521882, (int) System.currentTimeMillis());
            }
            objArr2[0] = bArr;
            throw null;
        }
        if (i16 == 3) {
            avn avnVar4 = (avn) objArr[0];
            int i23 = f53984u0;
            int i24 = i23 | 103;
            int i25 = i24 << 1;
            int i26 = -((~(i23 & 103)) & i24);
            int i27 = (i25 & i26) + (i26 | i25);
            f53983t0 = i27 % 128;
            int i28 = i27 % 2;
            byte[] bArr2 = avnVar4.f53985r0;
            Object[] objArr3 = new Object[1];
            if (i28 != 0) {
                objArr3[0] = bArr2;
                throw null;
            }
            objArr3[0] = bArr2;
            byte[] bArr3 = (byte[]) bek.setOnFocusChangeListener(objArr3, -150521869, 150521882, (int) System.currentTimeMillis());
            int i29 = f53983t0;
            int i30 = i29 & 23;
            int i31 = (i29 | 23) & (~i30);
            int i32 = -(-(i30 << 1));
            int i33 = ((i31 | i32) << 1) - (i31 ^ i32);
            f53984u0 = i33 % 128;
            if (i33 % 2 != 0) {
                return bArr3;
            }
            throw null;
        }
        Object obj = objArr[0];
        int i34 = f53983t0;
        int i35 = i34 & 17;
        int i36 = (i35 - (~((i34 ^ 17) | i35))) - 1;
        f53984u0 = i36 % 128;
        int i37 = i36 % 2;
        if (obj instanceof avn) {
            int i38 = i34 & 35;
            int i39 = (i34 | 35) & (~i38);
            int i40 = -(-(i38 << 1));
            int i41 = ((i39 | i40) << 1) - (i39 ^ i40);
            int i42 = i41 % 128;
            f53984u0 = i42;
            int i43 = i41 % 2;
            avnVar2 = (avn) obj;
            i13 = ((i42 ^ 124) + ((i42 & 124) << 1)) - 1;
            f53983t0 = i13 % 128;
        } else {
            if (obj != null) {
                aed compoundDrawableTintBlendMode = aed.setCompoundDrawableTintBlendMode(obj);
                avn avnVar5 = new avn();
                ads adsVar = (ads) ads.setDividerPadding(new Object[]{compoundDrawableTintBlendMode.setX(0)}, 1337255032, -1337255030, (int) System.currentTimeMillis());
                avnVar5.f53985r0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{(byte[]) ads.setDividerPadding(new Object[]{adsVar}, -952512304, 952512305, System.identityHashCode(adsVar))}, -150521869, 150521882, (int) System.currentTimeMillis());
                ads adsVar2 = (ads) ads.setDividerPadding(new Object[]{compoundDrawableTintBlendMode.setX(1)}, 1337255032, -1337255030, (int) System.currentTimeMillis());
                avnVar5.f53986s0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{(byte[]) ads.setDividerPadding(new Object[]{adsVar2}, -952512304, 952512305, System.identityHashCode(adsVar2))}, -150521869, 150521882, (int) System.currentTimeMillis());
                int i44 = f53984u0;
                int i45 = i44 ^ 25;
                int i46 = ((((i44 & 25) | i45) << 1) - (~(-i45))) - 1;
                f53983t0 = i46 % 128;
                if (i46 % 2 == 0) {
                    return avnVar5;
                }
                int i47 = 45 / 0;
                return avnVar5;
            }
            int i48 = i34 & 115;
            i13 = ((((i34 ^ 115) | i48) << 1) - (~(-((i34 | 115) & (~i48))))) - 1;
            f53984u0 = i13 % 128;
        }
        int i49 = i13 % 2;
        return avnVar2;
    }

    public static avn setY(Object obj) {
        return (avn) setDividerPadding(new Object[]{obj}, -469735755, 469735755, (int) System.currentTimeMillis());
    }

    @Override // com.mypinpad.tsdk.isolation.adw, com.mypinpad.tsdk.isolation.add
    public final ady UiMessageCallbackKtWhenMappings() {
        return (ady) setDividerPadding(new Object[]{this}, 1577793498, -1577793497, System.identityHashCode(this));
    }

    public final byte[] setX() {
        return (byte[]) setDividerPadding(new Object[]{this}, -1424884788, 1424884791, System.identityHashCode(this));
    }

    public final byte[] setDividerPadding() {
        return (byte[]) setDividerPadding(new Object[]{this}, 1319934164, -1319934162, System.identityHashCode(this));
    }
}
