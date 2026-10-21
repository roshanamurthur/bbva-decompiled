package com.mypinpad.tsdk.isolation;

import bh.a;

/* JADX INFO: loaded from: classes10.dex */
public final class r2 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f58047g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f58048h = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f58049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f58050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f58051c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f58052d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f58053e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final s2 f58054f;

    public r2(int i10, boolean z10, boolean z11) {
        int i11;
        this.f58049a = i10;
        if (i10 == 2) {
            this.f58050b = 10;
            this.f58051c = 3;
        } else {
            if (i10 == 3) {
                this.f58050b = 8;
                i11 = 4;
            } else {
                i11 = 6;
                this.f58050b = 6;
            }
            this.f58051c = i11;
        }
        if (z10) {
            new t2.a();
        } else {
            new t2.b();
        }
        if (z11) {
            this.f58052d = 12;
        } else {
            this.f58052d = 13;
            int i12 = (this.f58050b << 8) / 8;
        }
        this.f58053e = (this.f58052d << 8) / 8;
        int i13 = (this.f58051c << 8) / 8;
        s2 s2Var = new s2();
        ((Integer) a(new Object[]{this}, 2125025788, -2125025786, System.identityHashCode(this))).intValue();
        ((Integer) a(new Object[]{this}, -1092823705, 1092823708, System.identityHashCode(this))).intValue();
        ((Integer) a(new Object[]{this}, -347295360, 347295361, System.identityHashCode(this))).intValue();
        this.f58054f = s2Var;
        new a(this);
    }

    public static /* synthetic */ Object a(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i11;
        int i14 = ~i12;
        int i15 = (((~(i10 | i14)) | (~(i12 | (~i10))) | i13) * 45) + (((~(i11 | i10)) | (~(i13 | i12))) * (-45)) + (((~(i13 | i14)) | i10) * (-90)) + (i11 * 46) + (i10 * 46);
        if (i15 == 1) {
            r2 r2Var = (r2) objArr[0];
            int i16 = f58047g;
            int i17 = ((i16 ^ 33) | (i16 & 33)) << 1;
            int i18 = -(((~i16) & 33) | (i16 & (-34)));
            int i19 = (i17 & i18) + (i18 | i17);
            int i20 = i19 % 128;
            f58048h = i20;
            int i21 = i19 % 2;
            int i22 = r2Var.f58053e;
            int i23 = ((i20 ^ 99) - (~(-(-((i20 & 99) << 1))))) - 1;
            f58047g = i23 % 128;
            int i24 = i23 % 2;
            return Integer.valueOf(i22);
        }
        if (i15 == 2) {
            r2 r2Var2 = (r2) objArr[0];
            int i25 = f58047g;
            int i26 = i25 & 125;
            int i27 = i26 + ((i25 ^ 125) | i26);
            f58048h = i27 % 128;
            int i28 = i27 % 2;
            int i29 = r2Var2.f58049a;
            if (i28 == 0) {
                int i30 = 48 / 0;
            }
            return Integer.valueOf(i29);
        }
        if (i15 != 3) {
            r2 r2Var3 = (r2) objArr[0];
            int i31 = f58048h + 79;
            int i32 = i31 % 128;
            f58047g = i32;
            int i33 = i31 % 2;
            s2 s2Var = r2Var3.f58054f;
            int i34 = ((i32 | 121) << 1) - (i32 ^ 121);
            f58048h = i34 % 128;
            if (i34 % 2 != 0) {
                return s2Var;
            }
            throw null;
        }
        r2 r2Var4 = (r2) objArr[0];
        System.identityHashCode(r2Var4);
        System.identityHashCode(r2Var4);
        int i35 = r2Var4.f58051c;
        int i36 = f58047g;
        int i37 = i36 & 89;
        int i38 = (i37 - (~((i36 ^ 89) | i37))) - 1;
        f58048h = i38 % 128;
        if (i38 % 2 != 0) {
            return Integer.valueOf(i35);
        }
        throw null;
    }
}
