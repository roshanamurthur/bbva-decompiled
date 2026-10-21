package com.mypinpad.tsdk.isolation;

import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes10.dex */
public final class b3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f54251c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f54252d = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aky f54253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f54254b;

    public b3(int i10, adu aduVar) {
        if (aduVar == null) {
            throw new NullPointerException("digest == null");
        }
        this.f54253a = (aky) z2.a(new Object[]{aduVar}, -70585841, 70585843, (int) System.currentTimeMillis());
        this.f54254b = i10;
    }

    public static /* synthetic */ Object a(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (i11 * Constant.ERROR_CODE_408) + (i10 * (-813));
        int i14 = ~i11;
        int i15 = ~(i14 | i10);
        int i16 = ~(i10 | i12);
        int i17 = ((i15 | i16) * (-814)) + i13;
        int i18 = ~(i14 | (~i12));
        int i19 = ~i10;
        int i20 = ~(i19 | i11);
        int i21 = (((~(i19 | i12)) | i20 | (~(i11 | i12))) * 407) + ((i18 | i20 | i16) * 407) + i17;
        if (i21 == 1) {
            b3 b3Var = (b3) objArr[0];
            byte[] bArr = (byte[]) objArr[1];
            byte[] bArr2 = (byte[]) objArr[2];
            int i22 = f54252d;
            int i23 = ((i22 ^ 31) | (i22 & 31)) << 1;
            int i24 = -(((~i22) & 31) | (i22 & (-32)));
            int i25 = (i23 ^ i24) + ((i24 & i23) << 1);
            f54251c = i25 % 128;
            int i26 = i25 % 2;
            int length = bArr.length;
            int i27 = b3Var.f54254b;
            if (length != i27) {
                throw new IllegalArgumentException("wrong key length");
            }
            if (bArr2.length != i27 * 2) {
                throw new IllegalArgumentException("wrong in length");
            }
            byte[] bArr3 = (byte[]) a(new Object[]{b3Var, 1, bArr, bArr2}, -888433214, 888433217, 1);
            int i28 = f54251c;
            int i29 = (i28 & (-98)) | ((~i28) & 97);
            int i30 = -(-((i28 & 97) << 1));
            int i31 = ((i29 | i30) << 1) - (i30 ^ i29);
            f54252d = i31 % 128;
            int i32 = i31 % 2;
            return bArr3;
        }
        if (i21 == 2) {
            b3 b3Var2 = (b3) objArr[0];
            byte[] bArr4 = (byte[]) objArr[1];
            byte[] bArr5 = (byte[]) objArr[2];
            int i33 = f54252d + 31;
            f54251c = i33 % 128;
            int i34 = i33 % 2;
            int length2 = bArr4.length;
            int i35 = b3Var2.f54254b;
            if (length2 != i35) {
                throw new IllegalArgumentException("wrong key length");
            }
            if (bArr5.length != i35) {
                throw new IllegalArgumentException("wrong in length");
            }
            byte[] bArr6 = (byte[]) a(new Object[]{b3Var2, 0, bArr4, bArr5}, -888433214, 888433217, 0);
            int i36 = f54252d;
            int i37 = ((i36 | 107) << 1) - (i36 ^ 107);
            f54251c = i37 % 128;
            if (i37 % 2 == 0) {
                return bArr6;
            }
            throw null;
        }
        if (i21 != 3) {
            b3 b3Var3 = (b3) objArr[0];
            byte[] bArr7 = (byte[]) objArr[1];
            byte[] bArr8 = (byte[]) objArr[2];
            int i38 = f54251c;
            int i39 = (i38 ^ 47) + ((i38 & 47) << 1);
            f54252d = i39 % 128;
            int i40 = i39 % 2;
            if (bArr7.length != b3Var3.f54254b) {
                throw new IllegalArgumentException("wrong key length");
            }
            if (bArr8.length != 32) {
                throw new IllegalArgumentException("wrong address length");
            }
            byte[] bArr9 = (byte[]) a(new Object[]{b3Var3, 3, bArr7, bArr8}, -888433214, 888433217, 3);
            int i41 = f54252d;
            int i42 = ((i41 | 47) << 1) - (i41 ^ 47);
            f54251c = i42 % 128;
            int i43 = i42 % 2;
            return bArr9;
        }
        b3 b3Var4 = (b3) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        byte[] bArr10 = (byte[]) objArr[2];
        byte[] bArr11 = (byte[]) objArr[3];
        int i44 = f54251c;
        int i45 = i44 & 5;
        int i46 = (i44 ^ 5) | i45;
        int i47 = ((i45 | i46) << 1) - (i46 ^ i45);
        f54252d = i47 % 128;
        int i48 = i47 % 2;
        long j10 = iIntValue;
        int i49 = b3Var4.f54254b;
        byte[] bArr12 = (byte[]) bbi.setOnFocusChangeListener(new Object[]{Long.valueOf(j10), Integer.valueOf(i49)}, 450291415, -450291415, i49);
        int length3 = bArr12.length;
        aky akyVar = b3Var4.f54253a;
        akyVar.setCompoundDrawableTintBlendMode(bArr12, 0, length3);
        akyVar.setCompoundDrawableTintBlendMode(bArr10, 0, bArr10.length);
        akyVar.setCompoundDrawableTintBlendMode(bArr11, 0, bArr11.length);
        int i50 = b3Var4.f54254b;
        byte[] bArr13 = new byte[i50];
        if (akyVar instanceof alf) {
            int i51 = f54252d;
            int i52 = (i51 ^ 109) + ((i51 & 109) << 1);
            f54251c = i52 % 128;
            int i53 = i52 % 2;
            ((alf) akyVar).setDividerPadding(bArr13, 0, i50);
            int i54 = f54251c;
            int i55 = (((i54 | 34) << 1) - (i54 ^ 34)) - 1;
            f54252d = i55 % 128;
            int i56 = i55 % 2;
        } else {
            akyVar.setCompoundDrawableTintBlendMode(bArr13, 0);
            int i57 = f54251c;
            int i58 = (i57 & (-98)) | ((~i57) & 97);
            int i59 = -(-((i57 & 97) << 1));
            int i60 = (i58 & i59) + (i59 | i58);
            f54252d = i60 % 128;
            int i61 = i60 % 2;
        }
        int i62 = f54252d;
        int i63 = i62 & 89;
        int i64 = i62 | 89;
        int i65 = ((i63 | i64) << 1) - (i64 ^ i63);
        f54251c = i65 % 128;
        int i66 = i65 % 2;
        return bArr13;
    }
}
