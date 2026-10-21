package com.mypinpad.tsdk.isolation;

import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public class q0 extends aeb {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f57795d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f57796e = 1;

    @Override // com.mypinpad.tsdk.isolation.aeb
    public void d(ady[] adyVarArr) throws IOException {
        int i10 = f57796e;
        int i11 = i10 & 11;
        int i12 = (i10 ^ 11) | i11;
        int i13 = (i11 & i12) + (i12 | i11);
        f57795d = i13 % 128;
        int i14 = i13 % 2;
        int length = adyVarArr.length;
        int i15 = i14 != 0 ? 1 : 0;
        while (i15 < length) {
            int i16 = f57796e + 33;
            f57795d = i16 % 128;
            int i17 = i16 % 2;
            adyVarArr[i15].a().c(this, true);
            int i18 = i15 & 1;
            i15 = ((i15 ^ 1) | i18) + i18;
            int i19 = f57796e + 83;
            f57795d = i19 % 128;
            int i20 = i19 % 2;
        }
        int i21 = f57796e;
        int i22 = ((i21 | 33) << 1) - (i21 ^ 33);
        f57795d = i22 % 128;
        if (i22 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.mypinpad.tsdk.isolation.aeb
    public final q0 h() {
        System.identityHashCode(this);
        q0 q0Var = (q0) new Object[]{this}[0];
        int i10 = f57795d;
        int i11 = ((i10 | 43) << 1) - (i10 ^ 43);
        int i12 = i11 % 128;
        f57796e = i12;
        int i13 = i11 % 2;
        int i14 = i12 & 43;
        int i15 = (i12 ^ 43) | i14;
        int i16 = (i14 & i15) + (i14 | i15);
        f57795d = i16 % 128;
        int i17 = i16 % 2;
        return q0Var;
    }

    @Override // com.mypinpad.tsdk.isolation.aeb
    public void i(add[] addVarArr) throws IOException {
        int i10 = f57795d;
        int i11 = i10 & 35;
        int i12 = (i11 - (~(-(-((i10 ^ 35) | i11))))) - 1;
        f57796e = i12 % 128;
        int i13 = i12 % 2;
        int length = addVarArr.length;
        int i14 = (i10 ^ 123) + ((i10 & 123) << 1);
        f57796e = i14 % 128;
        int i15 = i14 % 2;
        int i16 = 0;
        while (i16 < length) {
            int i17 = f57796e;
            int i18 = i17 & 61;
            int i19 = ((i17 ^ 61) | i18) << 1;
            int i20 = -((i17 | 61) & (~i18));
            int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
            f57795d = i21 % 128;
            if (i21 % 2 != 0) {
                addVarArr[i16].UiMessageCallbackKtWhenMappings().a().c(this, true);
                int i22 = i16 & 100;
                int i23 = -(-(i16 | 100));
                i16 = (((i22 | i23) << 1) - (i23 ^ i22)) + 11;
            } else {
                addVarArr[i16].UiMessageCallbackKtWhenMappings().a().c(this, true);
                int i24 = i16 ^ 1;
                i16 = ((((i16 & 1) | i24) << 1) - (~(-i24))) - 1;
            }
            int i25 = f57795d;
            int i26 = i25 & 3;
            int i27 = -(-((i25 ^ 3) | i26));
            int i28 = ((i26 | i27) << 1) - (i27 ^ i26);
            f57796e = i28 % 128;
            int i29 = i28 % 2;
        }
        int i30 = f57796e;
        int i31 = i30 & 93;
        int i32 = -(-((i30 ^ 93) | i31));
        int i33 = (i31 ^ i32) + ((i32 & i31) << 1);
        f57795d = i33 % 128;
        if (i33 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.mypinpad.tsdk.isolation.aeb
    public void m(ady adyVar) throws IOException {
        int i10 = f57795d;
        int i11 = (i10 ^ 61) + ((i10 & 61) << 1);
        f57796e = i11 % 128;
        int i12 = i11 % 2;
        adyVar.a().c(this, true);
        int i13 = f57795d;
        int i14 = ((i13 | 108) << 1) - (i13 ^ 108);
        int i15 = (i14 ^ (-1)) + (i14 << 1);
        f57796e = i15 % 128;
        int i16 = i15 % 2;
    }
}
