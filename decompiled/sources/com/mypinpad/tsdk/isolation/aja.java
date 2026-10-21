package com.mypinpad.tsdk.isolation;

import androidx.databinding.c;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes10.dex */
public final class aja extends adw {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f52851t0 = 0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static int f52852u0 = 1;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public byte[] f52853r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public aiw f52854s0;

    public aja(aiw aiwVar, byte[] bArr) {
        this.f52853r0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr}, -150521869, 150521882, (int) System.currentTimeMillis());
        this.f52854s0 = aiwVar;
    }

    public static aja setX(Object obj) {
        return (aja) setY(new Object[]{obj}, -385857990, 385857991, (int) System.currentTimeMillis());
    }

    public static Object setY(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ((i10 | i11) * (-470)) + (i11 * 471) + (i10 * 471);
        int i14 = ~i10;
        int i15 = ~i11;
        int i16 = (~(i14 | i15)) | (~(i15 | i12));
        int i17 = ~(i11 | (~i12) | i10);
        int i18 = (((~(i10 | i15 | i12)) | i17) * 470) + ((i16 | i17) * (-470)) + i13;
        aja ajaVar = null;
        if (i18 != 1) {
            aja ajaVar2 = (aja) objArr[0];
            adh adhVar = new adh(2);
            adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, ajaVar2.f52854s0}, 240298319, -240298315, System.identityHashCode(adhVar));
            afv afvVarA = c.a(adhVar, new Object[]{adhVar, new aft(ajaVar2.f52853r0)}, 240298319, -240298315, adhVar);
            int i19 = f52851t0;
            int i20 = i19 & 79;
            int i21 = -(-(i19 | 79));
            int i22 = (i20 & i21) + (i21 | i20);
            f52852u0 = i22 % 128;
            if (i22 % 2 != 0) {
                return afvVarA;
            }
            throw null;
        }
        Object obj = objArr[0];
        int i23 = f52852u0;
        int i24 = ((((i23 ^ 77) | (i23 & 77)) << 1) - (~(-((i23 & (-78)) | ((~i23) & 77))))) - 1;
        f52851t0 = i24 % 128;
        if (i24 % 2 != 0) {
            throw null;
        }
        if (obj != null) {
            aed compoundDrawableTintBlendMode = aed.setCompoundDrawableTintBlendMode(obj);
            aja ajaVar3 = new aja();
            Enumeration dividerPadding = compoundDrawableTintBlendMode.setDividerPadding();
            ajaVar3.f52854s0 = (aiw) aiw.setOnFocusChangeListener(new Object[]{dividerPadding.nextElement()}, 866360717, -866360713, (int) System.currentTimeMillis());
            ads adsVar = (ads) ads.setDividerPadding(new Object[]{dividerPadding.nextElement()}, 1337255032, -1337255030, (int) System.currentTimeMillis());
            ajaVar3.f52853r0 = (byte[]) ads.setDividerPadding(new Object[]{adsVar}, -952512304, 952512305, System.identityHashCode(adsVar));
            int i25 = f52852u0;
            int i26 = i25 & 87;
            int i27 = (i26 - (~(-(-((i25 ^ 87) | i26))))) - 1;
            f52851t0 = i27 % 128;
            if (i27 % 2 != 0) {
                throw null;
            }
            ajaVar = ajaVar3;
        } else {
            int i28 = i23 & 87;
            int i29 = (i28 - (~((i23 ^ 87) | i28))) - 1;
            f52851t0 = i29 % 128;
            int i30 = i29 % 2;
        }
        return ajaVar;
    }

    @Override // com.mypinpad.tsdk.isolation.adw, com.mypinpad.tsdk.isolation.add
    public final ady UiMessageCallbackKtWhenMappings() {
        return (ady) setY(new Object[]{this}, 1732424932, -1732424932, System.identityHashCode(this));
    }
}
