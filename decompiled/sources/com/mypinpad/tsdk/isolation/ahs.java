package com.mypinpad.tsdk.isolation;

import androidx.databinding.c;
import java.math.BigInteger;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes10.dex */
public final class ahs extends adw {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f52672t0 = 0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static int f52673u0 = 1;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public adp f52674r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public adp f52675s0;

    public static Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        BigInteger bigInteger;
        int i13 = (i11 * (-463)) + (i10 * 465);
        int i14 = ~i11;
        int i15 = ~i12;
        int i16 = ~(i14 | i15);
        int i17 = ~(i14 | i10);
        int i18 = (((~(i10 | i12)) | i17) * 464) + ((i14 | (~i10) | i12) * (-464)) + (((~(i15 | i10)) | i16 | i17) * 464) + i13;
        if (i18 == 1) {
            ahs ahsVar = (ahs) objArr[0];
            int i19 = f52673u0;
            int i20 = i19 & 33;
            int i21 = (i20 - (~((i19 ^ 33) | i20))) - 1;
            f52672t0 = i21 % 128;
            int i22 = i21 % 2;
            adp adpVar = ahsVar.f52675s0;
            bigInteger = (BigInteger) adp.setOnFocusChangeListener(new Object[]{adpVar}, 446421226, -446421218, System.identityHashCode(adpVar));
            int i23 = f52672t0;
            int i24 = i23 & 33;
            int i25 = (i23 ^ 33) | i24;
            int i26 = (i24 & i25) + (i25 | i24);
            f52673u0 = i26 % 128;
            if (i26 % 2 == 0) {
                throw null;
            }
        } else {
            if (i18 == 2) {
                ahs ahsVar2 = (ahs) objArr[0];
                adh adhVar = new adh(2);
                adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, ahsVar2.f52674r0}, 240298319, -240298315, System.identityHashCode(adhVar));
                afv afvVarA = c.a(adhVar, new Object[]{adhVar, ahsVar2.f52675s0}, 240298319, -240298315, adhVar);
                int i27 = f52672t0;
                int i28 = i27 & 119;
                int i29 = -(-((i27 ^ 119) | i28));
                int i30 = (i28 & i29) + (i29 | i28);
                f52673u0 = i30 % 128;
                int i31 = i30 % 2;
                return afvVarA;
            }
            if (i18 != 3) {
                Object obj = objArr[0];
                int i32 = f52673u0;
                int i33 = (i32 & 89) + (i32 | 89);
                int i34 = i33 % 128;
                f52672t0 = i34;
                int i35 = i33 % 2;
                if (obj instanceof ahs) {
                    int i36 = i32 + 115;
                    int i37 = i36 % 128;
                    f52672t0 = i37;
                    ahs ahsVar3 = (ahs) obj;
                    if (i36 % 2 != 0) {
                        int i38 = 39 / 0;
                    }
                    int i39 = i37 + 25;
                    f52673u0 = i39 % 128;
                    int i40 = i39 % 2;
                    return ahsVar3;
                }
                if (obj == null) {
                    int i41 = ((i34 & (-96)) | ((~i34) & 95)) + ((i34 & 95) << 1);
                    f52673u0 = i41 % 128;
                    int i42 = i41 % 2;
                    return null;
                }
                aed compoundDrawableTintBlendMode = aed.setCompoundDrawableTintBlendMode(obj);
                ahs ahsVar4 = new ahs();
                Enumeration dividerPadding = compoundDrawableTintBlendMode.setDividerPadding();
                ahsVar4.f52674r0 = (adp) dividerPadding.nextElement();
                ahsVar4.f52675s0 = (adp) dividerPadding.nextElement();
                int i43 = f52672t0;
                int i44 = i43 ^ 119;
                int i45 = (i43 & 119) << 1;
                int i46 = (i44 & i45) + (i45 | i44);
                f52673u0 = i46 % 128;
                if (i46 % 2 != 0) {
                    return ahsVar4;
                }
                throw null;
            }
            ahs ahsVar5 = (ahs) objArr[0];
            int i47 = f52672t0;
            int i48 = (i47 | 119) << 1;
            int i49 = -(i47 ^ 119);
            int i50 = (i48 ^ i49) + ((i49 & i48) << 1);
            f52673u0 = i50 % 128;
            int i51 = i50 % 2;
            adp adpVar2 = ahsVar5.f52674r0;
            bigInteger = (BigInteger) adp.setOnFocusChangeListener(new Object[]{adpVar2}, 446421226, -446421218, System.identityHashCode(adpVar2));
            int i52 = f52673u0;
            int i53 = ((i52 ^ 21) | (i52 & 21)) << 1;
            int i54 = -(((~i52) & 21) | (i52 & (-22)));
            int i55 = (i53 & i54) + (i54 | i53);
            f52672t0 = i55 % 128;
            if (i55 % 2 != 0) {
                throw null;
            }
        }
        return bigInteger;
    }

    @Override // com.mypinpad.tsdk.isolation.adw, com.mypinpad.tsdk.isolation.add
    public final ady UiMessageCallbackKtWhenMappings() {
        return (ady) setCompoundDrawableTintBlendMode(new Object[]{this}, -612803467, 612803469, System.identityHashCode(this));
    }

    public final BigInteger setDividerPadding() {
        return (BigInteger) setCompoundDrawableTintBlendMode(new Object[]{this}, 1754691475, -1754691472, System.identityHashCode(this));
    }

    public static ahs setDividerPadding(Object obj) {
        return (ahs) setCompoundDrawableTintBlendMode(new Object[]{obj}, 482759757, -482759757, (int) System.currentTimeMillis());
    }

    public final BigInteger setCompoundDrawableTintBlendMode() {
        return (BigInteger) setCompoundDrawableTintBlendMode(new Object[]{this}, -608925958, 608925959, System.identityHashCode(this));
    }
}
