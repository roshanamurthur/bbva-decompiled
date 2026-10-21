package com.mypinpad.tsdk.isolation;

import androidx.databinding.c;
import java.math.BigInteger;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes10.dex */
public final class aiz extends adw {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static int f52842u0 = 0;
    public static int v0 = 1;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public adp f52843r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public adp f52844s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public adp f52845t0;

    public aiz(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f52843r0 = new adp(bigInteger);
        this.f52844s0 = new adp(bigInteger2);
        this.f52845t0 = new adp(bigInteger3);
    }

    public static Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ~(i12 | i11);
        int i15 = (((~(i10 | (~i11))) | (~(i13 | i11))) * 110) + ((i14 | (~(i10 | i11))) * 220) + ((i13 | i14) * (-220)) + (i11 * 111) + (i10 * (-109));
        if (i15 == 1) {
            aiz aizVar = (aiz) objArr[0];
            int i16 = v0;
            int i17 = (i16 ^ 107) + ((i16 & 107) << 1);
            f52842u0 = i17 % 128;
            int i18 = i17 % 2;
            adp adpVar = aizVar.f52845t0;
            BigInteger bigInteger = (BigInteger) adp.setOnFocusChangeListener(new Object[]{adpVar}, 446421226, -446421218, System.identityHashCode(adpVar));
            int i19 = v0 + 123;
            f52842u0 = i19 % 128;
            int i20 = i19 % 2;
            return bigInteger;
        }
        if (i15 == 2) {
            aiz aizVar2 = (aiz) objArr[0];
            int i21 = f52842u0;
            int i22 = i21 & 75;
            int i23 = -(-((i21 ^ 75) | i22));
            int i24 = ((i22 | i23) << 1) - (i23 ^ i22);
            v0 = i24 % 128;
            int i25 = i24 % 2;
            adp adpVar2 = aizVar2.f52844s0;
            Object[] objArr2 = new Object[1];
            if (i25 != 0) {
                objArr2[0] = adpVar2;
                return (BigInteger) adp.setOnFocusChangeListener(objArr2, 446421226, -446421218, System.identityHashCode(adpVar2));
            }
            objArr2[0] = adpVar2;
            BigInteger bigInteger2 = (BigInteger) adp.setOnFocusChangeListener(objArr2, 446421226, -446421218, System.identityHashCode(adpVar2));
            int i26 = 93 / 0;
            return bigInteger2;
        }
        aiz aizVar3 = null;
        if (i15 != 3) {
            if (i15 != 4) {
                aiz aizVar4 = (aiz) objArr[0];
                adh adhVar = new adh(3);
                adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, aizVar4.f52843r0}, 240298319, -240298315, System.identityHashCode(adhVar));
                adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, aizVar4.f52844s0}, 240298319, -240298315, System.identityHashCode(adhVar));
                afv afvVarA = c.a(adhVar, new Object[]{adhVar, aizVar4.f52845t0}, 240298319, -240298315, adhVar);
                int i27 = f52842u0;
                int i28 = ((i27 | 121) << 1) - (i27 ^ 121);
                v0 = i28 % 128;
                if (i28 % 2 != 0) {
                    return afvVarA;
                }
                throw null;
            }
            aiz aizVar5 = (aiz) objArr[0];
            int i29 = f52842u0;
            int i30 = i29 ^ 15;
            int i31 = (((i29 & 15) | i30) << 1) - i30;
            v0 = i31 % 128;
            int i32 = i31 % 2;
            adp adpVar3 = aizVar5.f52843r0;
            BigInteger bigInteger3 = (BigInteger) adp.setOnFocusChangeListener(new Object[]{adpVar3}, 446421226, -446421218, System.identityHashCode(adpVar3));
            int i33 = f52842u0 + 123;
            v0 = i33 % 128;
            if (i33 % 2 != 0) {
                return bigInteger3;
            }
            throw null;
        }
        Object obj = objArr[0];
        int i34 = f52842u0;
        int i35 = (((i34 & (-124)) | ((~i34) & 123)) - (~((i34 & 123) << 1))) - 1;
        v0 = i35 % 128;
        if (i35 % 2 == 0) {
            throw null;
        }
        if (obj != null) {
            aed compoundDrawableTintBlendMode = aed.setCompoundDrawableTintBlendMode(obj);
            aiz aizVar6 = new aiz();
            if (compoundDrawableTintBlendMode.setCompoundDrawableTintBlendMode() != 3) {
                StringBuilder sb2 = new StringBuilder("Bad sequence size: ");
                sb2.append(compoundDrawableTintBlendMode.setCompoundDrawableTintBlendMode());
                throw new IllegalArgumentException(sb2.toString());
            }
            Enumeration dividerPadding = compoundDrawableTintBlendMode.setDividerPadding();
            aizVar6.f52843r0 = (adp) adp.setOnFocusChangeListener(new Object[]{dividerPadding.nextElement()}, -837021952, 837021958, (int) System.currentTimeMillis());
            aizVar6.f52844s0 = (adp) adp.setOnFocusChangeListener(new Object[]{dividerPadding.nextElement()}, -837021952, 837021958, (int) System.currentTimeMillis());
            aizVar6.f52845t0 = (adp) adp.setOnFocusChangeListener(new Object[]{dividerPadding.nextElement()}, -837021952, 837021958, (int) System.currentTimeMillis());
            int i36 = v0;
            int i37 = ((i36 ^ 89) | (i36 & 89)) << 1;
            int i38 = -(((~i36) & 89) | (i36 & (-90)));
            int i39 = (i37 & i38) + (i38 | i37);
            f52842u0 = i39 % 128;
            if (i39 % 2 != 0) {
                throw null;
            }
            aizVar3 = aizVar6;
        } else {
            int i40 = i34 & 79;
            int i41 = (i34 ^ 79) | i40;
            int i42 = ((i40 | i41) << 1) - (i40 ^ i41);
            v0 = i42 % 128;
            if (i42 % 2 == 0) {
                int i43 = 89 / 0;
            }
        }
        return aizVar3;
    }

    @Override // com.mypinpad.tsdk.isolation.adw, com.mypinpad.tsdk.isolation.add
    public final ady UiMessageCallbackKtWhenMappings() {
        return (ady) setOnFocusChangeListener(new Object[]{this}, 1305084710, -1305084710, System.identityHashCode(this));
    }

    public final BigInteger setCompoundDrawableTintBlendMode() {
        return (BigInteger) setOnFocusChangeListener(new Object[]{this}, 1823276491, -1823276487, System.identityHashCode(this));
    }

    public final BigInteger setDividerPadding() {
        return (BigInteger) setOnFocusChangeListener(new Object[]{this}, 1172369093, -1172369092, System.identityHashCode(this));
    }

    public final BigInteger setOnFocusChangeListener() {
        return (BigInteger) setOnFocusChangeListener(new Object[]{this}, 1785785750, -1785785748, System.identityHashCode(this));
    }

    public static aiz setOnFocusChangeListener(Object obj) {
        return (aiz) setOnFocusChangeListener(new Object[]{obj}, -845573931, 845573934, (int) System.currentTimeMillis());
    }
}
