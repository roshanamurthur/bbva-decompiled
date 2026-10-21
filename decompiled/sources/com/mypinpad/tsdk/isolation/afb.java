package com.mypinpad.tsdk.isolation;

import com.bbva.sl.ar.android.sslpinning.result.ResultCode;
import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public final class afb extends aee {

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static int f52586w0 = 0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static int f52587x0 = 1;

    public afb(adh adhVar) {
        super(adhVar, false);
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) throws IOException {
        int i13 = (i11 * ResultCode.ERROR_TRUST_CERT_DATE_BEFOREVALIDITY) + (i10 * (-520));
        int i14 = ~i10;
        int i15 = ((~(i14 | i11 | i12)) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY) + i13;
        int i16 = ~(i10 | (~i11));
        int i17 = ((i16 | (~(i11 | (~i12) | i14))) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY) + (i16 * (-1042)) + i15;
        int i18 = 3;
        if (i17 == 1) {
            afb afbVar = (afb) objArr[0];
            aeb aebVar = (aeb) objArr[1];
            boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
            int i19 = f52587x0;
            int i20 = i19 & 45;
            int i21 = (((i19 ^ 45) | i20) << 1) - ((i19 | 45) & (~i20));
            f52586w0 = i21 % 128;
            int i22 = i21 % 2;
            add[] addVarArr = afbVar.setOnFocusChangeListener;
            Object[] objArr2 = new Object[4];
            if (i22 != 0) {
                objArr2[0] = aebVar;
                objArr2[1] = Boolean.valueOf(zBooleanValue);
                objArr2[2] = 1;
                objArr2[3] = addVarArr;
                aeb.setX(objArr2, -1072802770, 1072802770, 1);
            } else {
                objArr2[0] = aebVar;
                objArr2[1] = Boolean.valueOf(zBooleanValue);
                objArr2[2] = 49;
                objArr2[3] = addVarArr;
                aeb.setX(objArr2, -1072802770, 1072802770, 49);
            }
            int i23 = f52587x0;
            int i24 = (i23 | 77) << 1;
            int i25 = -(((~i23) & 77) | (i23 & (-78)));
            int i26 = (i24 ^ i25) + ((i25 & i24) << 1);
            f52586w0 = i26 % 128;
            int i27 = i26 % 2;
            return null;
        }
        afb afbVar2 = (afb) objArr[0];
        boolean zBooleanValue2 = ((Boolean) objArr[1]).booleanValue();
        int i28 = f52587x0;
        int i29 = (i28 ^ 57) + ((i28 & 57) << 1);
        int i30 = i29 % 128;
        f52586w0 = i30;
        if (i29 % 2 != 0) {
            throw null;
        }
        if (!(!zBooleanValue2)) {
            int i31 = i30 & 73;
            int i32 = ((i30 ^ 73) | i31) << 1;
            int i33 = -((~i31) & (i30 | 73));
            int i34 = (i32 ^ i33) + ((i32 & i33) << 1);
            int i35 = i34 % 128;
            f52587x0 = i35;
            int i36 = i34 % 2;
            int i37 = i35 ^ 53;
            int i38 = -(-((i35 & 53) << 1));
            int i39 = ((i37 | i38) << 1) - (i38 ^ i37);
            f52586w0 = i39 % 128;
            int i40 = i39 % 2;
            i18 = 4;
        } else {
            int i41 = i30 & 99;
            int i42 = i41 + ((i30 ^ 99) | i41);
            f52587x0 = i42 % 128;
            int i43 = i42 % 2;
        }
        int length = afbVar2.setOnFocusChangeListener.length;
        int i44 = f52587x0;
        int i45 = ((i44 ^ 112) + ((i44 & 112) << 1)) - 1;
        f52586w0 = i45 % 128;
        int i46 = i45 % 2;
        int i47 = 0;
        while (i47 < length) {
            int i48 = f52587x0;
            int i49 = ((i48 ^ 119) - (~(-(-((i48 & 119) << 1))))) - 1;
            f52586w0 = i49 % 128;
            int i50 = i49 % 2;
            int iB = afbVar2.setOnFocusChangeListener[i47].UiMessageCallbackKtWhenMappings().b(true);
            int i51 = i18 & iB;
            i18 = ((i18 | iB) & (~i51)) + (i51 << 1);
            int i52 = (((i47 ^ 88) | (i47 & 88)) << 1) - (((~i47) & 88) | (i47 & (-89)));
            i47 = ((i52 & 86) | ((~i52) & (-87))) + ((i52 & (-87)) << 1);
            int i53 = f52586w0;
            int i54 = i53 & 77;
            int i55 = (((i53 | 77) & (~i54)) - (~(i54 << 1))) - 1;
            f52587x0 = i55 % 128;
            int i56 = i55 % 2;
        }
        int i57 = f52586w0;
        int i58 = (i57 ^ 61) + ((i57 & 61) << 1);
        f52587x0 = i58 % 128;
        if (i58 % 2 == 0) {
            int i59 = 40 / 0;
        }
        return Integer.valueOf(i18);
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final int b(boolean z10) throws IOException {
        return ((Integer) setY(new Object[]{this, Boolean.valueOf(z10)}, 2137914275, -2137914275, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final void c(aeb aebVar, boolean z10) throws IOException {
        setY(new Object[]{this, aebVar, Boolean.valueOf(z10)}, -2014082669, 2014082670, System.identityHashCode(this));
    }

    public afb() {
    }
}
