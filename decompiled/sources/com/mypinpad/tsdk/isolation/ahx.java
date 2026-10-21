package com.mypinpad.tsdk.isolation;

import androidx.databinding.c;
import java.math.BigInteger;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes10.dex */
public final class ahx extends adw {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f52693t0 = 0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static int f52694u0 = 1;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public BigInteger f52695r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public BigInteger f52696s0;

    public ahx(BigInteger bigInteger, BigInteger bigInteger2) {
        this.f52695r0 = bigInteger;
        this.f52696s0 = bigInteger2;
    }

    public static Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ((~(i10 | i12)) * 216) + (i11 * (-215)) + (i10 * 217);
        int i14 = (~i11) | i10;
        int i15 = ~i12;
        int i16 = (((~(i10 | i15)) | i11) * 216) + ((i14 | i15) * (-216)) + i13;
        ahx ahxVar = null;
        if (i16 == 1) {
            ahx ahxVar2 = (ahx) objArr[0];
            int i17 = f52694u0;
            int i18 = (i17 & 67) + (i17 | 67);
            f52693t0 = i18 % 128;
            int i19 = i18 % 2;
            BigInteger bigInteger = ahxVar2.f52695r0;
            if (i19 == 0) {
                return bigInteger;
            }
            throw null;
        }
        if (i16 != 2) {
            if (i16 == 3) {
                ahx ahxVar3 = (ahx) objArr[0];
                int i20 = f52694u0;
                int i21 = (i20 & 125) + (i20 | 125);
                f52693t0 = i21 % 128;
                int i22 = i21 % 2;
                BigInteger bigInteger2 = ahxVar3.f52696s0;
                if (i22 == 0) {
                    return bigInteger2;
                }
                throw null;
            }
            ahx ahxVar4 = (ahx) objArr[0];
            adh adhVar = new adh(2);
            adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, new adp((BigInteger) setCompoundDrawableTintBlendMode(new Object[]{ahxVar4}, 397751114, -397751113, System.identityHashCode(ahxVar4)))}, 240298319, -240298315, System.identityHashCode(adhVar));
            afv afvVarA = c.a(adhVar, new Object[]{adhVar, new adp((BigInteger) setCompoundDrawableTintBlendMode(new Object[]{ahxVar4}, 389614071, -389614068, System.identityHashCode(ahxVar4)))}, 240298319, -240298315, adhVar);
            int i23 = f52694u0;
            int i24 = i23 & 59;
            int i25 = (i23 ^ 59) | i24;
            int i26 = ((i24 | i25) << 1) - (i25 ^ i24);
            f52693t0 = i26 % 128;
            if (i26 % 2 == 0) {
                return afvVarA;
            }
            int i27 = 15 / 0;
            return afvVarA;
        }
        Object obj = objArr[0];
        int i28 = f52694u0;
        int i29 = i28 & 27;
        int i30 = (~i29) & (i28 | 27);
        int i31 = -(-(i29 << 1));
        int i32 = (i30 ^ i31) + ((i31 & i30) << 1);
        int i33 = i32 % 128;
        f52693t0 = i33;
        if (i32 % 2 != 0) {
            boolean z10 = obj instanceof ahx;
            throw null;
        }
        if (obj instanceof ahx) {
            int i34 = i28 & 25;
            int i35 = (i28 | 25) & (~i34);
            int i36 = i34 << 1;
            int i37 = (i35 & i36) + (i35 | i36);
            int i38 = i37 % 128;
            f52693t0 = i38;
            if (i37 % 2 != 0) {
                throw null;
            }
            ahxVar = (ahx) obj;
            int i39 = i38 + 103;
            f52694u0 = i39 % 128;
            int i40 = i39 % 2;
        } else if (obj != null) {
            aed compoundDrawableTintBlendMode = aed.setCompoundDrawableTintBlendMode(obj);
            ahxVar = new ahx();
            if (compoundDrawableTintBlendMode.setCompoundDrawableTintBlendMode() != 2) {
                StringBuilder sb2 = new StringBuilder("Bad sequence size: ");
                sb2.append(compoundDrawableTintBlendMode.setCompoundDrawableTintBlendMode());
                throw new IllegalArgumentException(sb2.toString());
            }
            Enumeration dividerPadding = compoundDrawableTintBlendMode.setDividerPadding();
            adp adpVar = (adp) adp.setOnFocusChangeListener(new Object[]{dividerPadding.nextElement()}, -837021952, 837021958, (int) System.currentTimeMillis());
            ahxVar.f52695r0 = (BigInteger) adp.setOnFocusChangeListener(new Object[]{adpVar}, 446421226, -446421218, System.identityHashCode(adpVar));
            adp adpVar2 = (adp) adp.setOnFocusChangeListener(new Object[]{dividerPadding.nextElement()}, -837021952, 837021958, (int) System.currentTimeMillis());
            ahxVar.f52696s0 = (BigInteger) adp.setOnFocusChangeListener(new Object[]{adpVar2}, 446421226, -446421218, System.identityHashCode(adpVar2));
            int i41 = f52693t0;
            int i42 = i41 & 67;
            int i43 = ((i41 ^ 67) | i42) << 1;
            int i44 = -((i41 | 67) & (~i42));
            int i45 = (i43 ^ i44) + ((i44 & i43) << 1);
            f52694u0 = i45 % 128;
            int i46 = i45 % 2;
        } else {
            int i47 = i33 + 75;
            f52694u0 = i47 % 128;
            if (i47 % 2 == 0) {
                throw null;
            }
        }
        return ahxVar;
    }

    @Override // com.mypinpad.tsdk.isolation.adw, com.mypinpad.tsdk.isolation.add
    public final ady UiMessageCallbackKtWhenMappings() {
        return (ady) setCompoundDrawableTintBlendMode(new Object[]{this}, 1503991181, -1503991181, System.identityHashCode(this));
    }

    public final BigInteger setOnFocusChangeListener() {
        return (BigInteger) setCompoundDrawableTintBlendMode(new Object[]{this}, 397751114, -397751113, System.identityHashCode(this));
    }

    public final BigInteger setY() {
        return (BigInteger) setCompoundDrawableTintBlendMode(new Object[]{this}, 389614071, -389614068, System.identityHashCode(this));
    }

    public static ahx setY(Object obj) {
        return (ahx) setCompoundDrawableTintBlendMode(new Object[]{obj}, 1906174166, -1906174164, (int) System.currentTimeMillis());
    }
}
