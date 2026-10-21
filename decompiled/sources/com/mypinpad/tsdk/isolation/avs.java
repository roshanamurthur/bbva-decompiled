package com.mypinpad.tsdk.isolation;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.databinding.c;

/* JADX INFO: loaded from: classes10.dex */
public final class avs extends adw {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f54000t0 = 0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static int f54001u0 = 1;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public byte[] f54002r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public byte[] f54003s0;

    public avs(byte[] bArr, byte[] bArr2) {
        this.f54002r0 = bArr;
        this.f54003s0 = bArr2;
    }

    public static Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ~i11;
        int i15 = (((~(i13 | i12)) | i14) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + (((~(i10 | i12)) | (~(i14 | i10))) * (-318)) + (((~(i11 | (~i12) | i10)) | (~(i13 | i14 | i12))) * (-318)) + (i11 * 319) + (i10 * (-317));
        if (i15 == 1) {
            avs avsVar = (avs) objArr[0];
            adh adhVar = new adh();
            adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, new aft(avsVar.f54002r0)}, 240298319, -240298315, System.identityHashCode(adhVar));
            afv afvVarA = c.a(adhVar, new Object[]{adhVar, new aft(avsVar.f54003s0)}, 240298319, -240298315, adhVar);
            int i16 = f54000t0 + 91;
            f54001u0 = i16 % 128;
            int i17 = i16 % 2;
            return afvVarA;
        }
        if (i15 != 2) {
            if (i15 != 3) {
                avs avsVar2 = (avs) objArr[0];
                int i18 = f54000t0;
                int i19 = i18 ^ 91;
                int i20 = (i18 & 91) << 1;
                int i21 = (i19 & i20) + (i20 | i19);
                f54001u0 = i21 % 128;
                int i22 = i21 % 2;
                byte[] bArr = (byte[]) bek.setOnFocusChangeListener(new Object[]{avsVar2.f54002r0}, -150521869, 150521882, (int) System.currentTimeMillis());
                int i23 = f54000t0;
                int i24 = i23 | 87;
                int i25 = (i24 << 1) - ((~(i23 & 87)) & i24);
                f54001u0 = i25 % 128;
                int i26 = i25 % 2;
                return bArr;
            }
            avs avsVar3 = (avs) objArr[0];
            int i27 = f54000t0;
            int i28 = i27 | 3;
            int i29 = (i28 << 1) - ((~(i27 & 3)) & i28);
            f54001u0 = i29 % 128;
            int i30 = i29 % 2;
            byte[] bArr2 = (byte[]) bek.setOnFocusChangeListener(new Object[]{avsVar3.f54003s0}, -150521869, 150521882, (int) System.currentTimeMillis());
            int i31 = f54001u0;
            int i32 = (i31 | 97) << 1;
            int i33 = -(((~i31) & 97) | (i31 & (-98)));
            int i34 = ((i32 | i33) << 1) - (i33 ^ i32);
            f54000t0 = i34 % 128;
            int i35 = i34 % 2;
            return bArr2;
        }
        Object obj = objArr[0];
        int i36 = f54000t0;
        int i37 = i36 & 89;
        int i38 = -(-((i36 ^ 89) | i37));
        int i39 = (i37 & i38) + (i37 | i38);
        f54001u0 = i39 % 128;
        int i40 = i39 % 2;
        if (obj instanceof avs) {
            int i41 = (-2) - ((i36 + 38) ^ (-1));
            f54001u0 = i41 % 128;
            avs avsVar4 = (avs) obj;
            if (i41 % 2 != 0) {
                return avsVar4;
            }
            int i42 = 98 / 0;
            return avsVar4;
        }
        if (obj == null) {
            int i43 = i36 & 57;
            int i44 = (i36 ^ 57) | i43;
            int i45 = (i43 ^ i44) + ((i43 & i44) << 1);
            f54001u0 = i45 % 128;
            int i46 = i45 % 2;
            return null;
        }
        aed compoundDrawableTintBlendMode = aed.setCompoundDrawableTintBlendMode(obj);
        avs avsVar5 = new avs();
        ads adsVar = (ads) ads.setDividerPadding(new Object[]{compoundDrawableTintBlendMode.setX(0)}, 1337255032, -1337255030, (int) System.currentTimeMillis());
        avsVar5.f54002r0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{(byte[]) ads.setDividerPadding(new Object[]{adsVar}, -952512304, 952512305, System.identityHashCode(adsVar))}, -150521869, 150521882, (int) System.currentTimeMillis());
        ads adsVar2 = (ads) ads.setDividerPadding(new Object[]{compoundDrawableTintBlendMode.setX(1)}, 1337255032, -1337255030, (int) System.currentTimeMillis());
        avsVar5.f54003s0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{(byte[]) ads.setDividerPadding(new Object[]{adsVar2}, -952512304, 952512305, System.identityHashCode(adsVar2))}, -150521869, 150521882, (int) System.currentTimeMillis());
        int i47 = f54000t0;
        int i48 = ((i47 & 119) - (~(-(-(i47 | 119))))) - 1;
        f54001u0 = i48 % 128;
        if (i48 % 2 != 0) {
            return avsVar5;
        }
        throw null;
    }

    @Override // com.mypinpad.tsdk.isolation.adw, com.mypinpad.tsdk.isolation.add
    public final ady UiMessageCallbackKtWhenMappings() {
        return (ady) setDividerPadding(new Object[]{this}, -2104897418, 2104897419, System.identityHashCode(this));
    }

    public final byte[] setCompoundDrawableTintBlendMode() {
        return (byte[]) setDividerPadding(new Object[]{this}, -402634163, 402634166, System.identityHashCode(this));
    }

    public final byte[] setOnFocusChangeListener() {
        return (byte[]) setDividerPadding(new Object[]{this}, -1584478043, 1584478043, System.identityHashCode(this));
    }

    public static avs setDividerPadding(Object obj) {
        return (avs) setDividerPadding(new Object[]{obj}, -1562201294, 1562201296, (int) System.currentTimeMillis());
    }
}
