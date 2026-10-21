package com.mypinpad.tsdk.isolation;

import androidx.databinding.c;
import com.bbva.sl.ar.android.sslpinning.result.ResultCode;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class ajt extends adw {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f52933t0 = 0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static int f52934u0 = 1;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public acz f52935r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public adp f52936s0;

    public static Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (i11 * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY) + (i10 * (-519));
        int i14 = ~i10;
        int i15 = ~i11;
        int i16 = ~i12;
        int i17 = (((~(i11 | i12)) | (~(i14 | i15 | i16))) * 520) + i13;
        int i18 = ~(i15 | i16);
        int i19 = ~(i12 | i10);
        int i20 = (((~(i10 | i15)) | (~(i14 | i16)) | i19) * 520) + ((i18 | i19) * (-1040)) + i17;
        if (i20 == 1) {
            ajt ajtVar = (ajt) objArr[0];
            adh adhVar = new adh(2);
            adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, ajtVar.f52935r0}, 240298319, -240298315, System.identityHashCode(adhVar));
            afv afvVarA = c.a(adhVar, new Object[]{adhVar, ajtVar.f52936s0}, 240298319, -240298315, adhVar);
            int i21 = f52934u0;
            int i22 = (i21 ^ 65) + ((i21 & 65) << 1);
            f52933t0 = i22 % 128;
            int i23 = i22 % 2;
            return afvVarA;
        }
        if (i20 == 2) {
            ajt ajtVar2 = (ajt) objArr[0];
            int i24 = f52933t0;
            int i25 = ((i24 & (-36)) | ((~i24) & 35)) + ((i24 & 35) << 1);
            f52934u0 = i25 % 128;
            int i26 = i25 % 2;
            adp adpVar = ajtVar2.f52936s0;
            BigInteger bigInteger = (BigInteger) adp.setOnFocusChangeListener(new Object[]{adpVar}, 446421226, -446421218, System.identityHashCode(adpVar));
            int i27 = f52934u0 + 125;
            f52933t0 = i27 % 128;
            if (i27 % 2 == 0) {
                return bigInteger;
            }
            throw null;
        }
        if (i20 == 3) {
            ajt ajtVar3 = (ajt) objArr[0];
            int i28 = f52933t0 + 73;
            f52934u0 = i28 % 128;
            int i29 = i28 % 2;
            acz aczVar = ajtVar3.f52935r0;
            byte[] bArr = (byte[]) acz.setDividerPadding(new Object[]{aczVar}, -2004692391, 2004692392, System.identityHashCode(aczVar));
            int i30 = f52933t0;
            int i31 = i30 & 65;
            int i32 = (((i30 | 65) & (~i31)) - (~(-(-(i31 << 1))))) - 1;
            f52934u0 = i32 % 128;
            int i33 = i32 % 2;
            return bArr;
        }
        Object obj = objArr[0];
        int i34 = f52934u0;
        int i35 = i34 & 11;
        int i36 = (i34 ^ 11) | i35;
        int i37 = (i35 & i36) + (i35 | i36);
        f52933t0 = i37 % 128;
        if (i37 % 2 != 0) {
            throw null;
        }
        if (obj == null) {
            int i38 = i34 ^ 57;
            int i39 = (i34 & 57) << 1;
            int i40 = ((i38 | i39) << 1) - (i38 ^ i39);
            f52933t0 = i40 % 128;
            if (i40 % 2 == 0) {
                return null;
            }
            throw null;
        }
        aed compoundDrawableTintBlendMode = aed.setCompoundDrawableTintBlendMode(obj);
        ajt ajtVar4 = new ajt();
        if (compoundDrawableTintBlendMode.setCompoundDrawableTintBlendMode() != 2) {
            StringBuilder sb2 = new StringBuilder("Bad sequence size: ");
            sb2.append(compoundDrawableTintBlendMode.setCompoundDrawableTintBlendMode());
            throw new IllegalArgumentException(sb2.toString());
        }
        ajtVar4.f52935r0 = (acz) acz.setDividerPadding(new Object[]{compoundDrawableTintBlendMode.setX(0)}, 1095238957, -1095238954, (int) System.currentTimeMillis());
        ajtVar4.f52936s0 = (adp) adp.setOnFocusChangeListener(new Object[]{compoundDrawableTintBlendMode.setX(1)}, -837021952, 837021958, (int) System.currentTimeMillis());
        int i41 = f52933t0;
        int i42 = i41 ^ 111;
        int i43 = -(-((i41 & 111) << 1));
        int i44 = ((i42 | i43) << 1) - (i43 ^ i42);
        f52934u0 = i44 % 128;
        int i45 = i44 % 2;
        return ajtVar4;
    }

    @Override // com.mypinpad.tsdk.isolation.adw, com.mypinpad.tsdk.isolation.add
    public final ady UiMessageCallbackKtWhenMappings() {
        return (ady) setCompoundDrawableTintBlendMode(new Object[]{this}, -997944094, 997944095, System.identityHashCode(this));
    }

    public final BigInteger setOnFocusChangeListener() {
        return (BigInteger) setCompoundDrawableTintBlendMode(new Object[]{this}, -212392432, 212392434, System.identityHashCode(this));
    }

    public final byte[] setX() {
        return (byte[]) setCompoundDrawableTintBlendMode(new Object[]{this}, -183474119, 183474122, System.identityHashCode(this));
    }

    public static ajt setX(Object obj) {
        return (ajt) setCompoundDrawableTintBlendMode(new Object[]{obj}, -794632281, 794632281, (int) System.currentTimeMillis());
    }
}
