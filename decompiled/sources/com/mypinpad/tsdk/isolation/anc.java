package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public class anc extends amw {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f53296s0 = 0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f53297t0 = 1;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final ana f53298r0;

    public anc(ana anaVar) {
        super(false);
        this.f53298r0 = anaVar;
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        anc ancVar = (anc) objArr[0];
        int i13 = f53297t0;
        int i14 = i13 & 3;
        int i15 = (i13 ^ 3) | i14;
        int i16 = (i14 ^ i15) + ((i14 & i15) << 1);
        f53296s0 = i16 % 128;
        int i17 = i16 % 2;
        ana anaVar = ancVar.f53298r0;
        int i18 = i13 & 59;
        int i19 = i18 + ((i13 ^ 59) | i18);
        f53296s0 = i19 % 128;
        int i20 = i19 % 2;
        return anaVar;
    }

    public boolean equals(Object obj) {
        int i10 = f53296s0;
        int i11 = i10 + 33;
        int i12 = i11 % 128;
        f53297t0 = i12;
        if (i11 % 2 == 0) {
            boolean z10 = obj instanceof anc;
            throw null;
        }
        if (!(obj instanceof anc)) {
            int i13 = ((i10 & (-118)) | ((~i10) & 117)) + ((i10 & 117) << 1);
            int i14 = i13 % 128;
            f53297t0 = i14;
            int i15 = i13 % 2;
            int i16 = i14 & 9;
            int i17 = -(-((i14 ^ 9) | i16));
            int i18 = (i16 & i17) + (i16 | i17);
            f53296s0 = i18 % 128;
            int i19 = i18 % 2;
            return false;
        }
        anc ancVar = (anc) obj;
        ana anaVar = this.f53298r0;
        if (anaVar != null) {
            boolean zEquals = anaVar.equals((ana) setX(new Object[]{ancVar}, -75445348, 75445348, System.identityHashCode(ancVar)));
            int i20 = f53296s0;
            int i21 = i20 & 23;
            int i22 = (i20 | 23) & (~i21);
            int i23 = -(-(i21 << 1));
            int i24 = (i22 ^ i23) + ((i22 & i23) << 1);
            f53297t0 = i24 % 128;
            int i25 = i24 % 2;
            return zEquals;
        }
        int i26 = i12 & 89;
        int i27 = (i26 - (~((i12 ^ 89) | i26))) - 1;
        f53296s0 = i27 % 128;
        int i28 = i27 % 2;
        if (((ana) setX(new Object[]{ancVar}, -75445348, 75445348, System.identityHashCode(ancVar))) != null) {
            int i29 = f53297t0;
            int i30 = i29 ^ 23;
            int i31 = ((i29 & 23) | i30) << 1;
            int i32 = -i30;
            int i33 = (i31 ^ i32) + ((i31 & i32) << 1);
            f53296s0 = i33 % 128;
            int i34 = i33 % 2;
            return false;
        }
        int i35 = f53296s0;
        int i36 = (i35 ^ 24) + ((i35 & 24) << 1);
        int i37 = (i36 ^ (-1)) + (i36 << 1);
        int i38 = i37 % 128;
        f53297t0 = i38;
        int i39 = i37 % 2;
        int i40 = (i38 ^ 9) + ((i38 & 9) << 1);
        f53296s0 = i40 % 128;
        int i41 = i40 % 2;
        return true;
    }

    public int hashCode() {
        int i10;
        int i11 = f53296s0;
        int i12 = (((i11 | 57) << 1) - (~(-(((~i11) & 57) | (i11 & (-58)))))) - 1;
        f53297t0 = i12 % 128;
        int i13 = i12 % 2;
        if (!(!setX())) {
            int i14 = f53297t0;
            int i15 = ((-1) << 1) - ((i14 + 80) ^ (-1));
            f53296s0 = i15 % 128;
            i10 = i15 % 2 != 0 ? 1 : 0;
            int i16 = i14 & 113;
            int i17 = ((i14 ^ 113) | i16) << 1;
            int i18 = -((i14 | 113) & (~i16));
            int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
            f53296s0 = i19 % 128;
            int i20 = i19 % 2;
        } else {
            int i21 = f53297t0;
            int i22 = i21 & 61;
            int i23 = i22 + ((i21 ^ 61) | i22);
            f53296s0 = i23 % 128;
            int i24 = i23 % 2;
            i10 = 1;
        }
        ana anaVar = this.f53298r0;
        if (anaVar != null) {
            int i25 = f53296s0;
            int i26 = i25 & 23;
            int i27 = -(-((i25 ^ 23) | i26));
            int i28 = ((i26 | i27) << 1) - (i27 ^ i26);
            f53297t0 = i28 % 128;
            if (i28 % 2 == 0) {
                anaVar.hashCode();
                throw null;
            }
            int iHashCode = anaVar.hashCode();
            i10 = ((~i10) & iHashCode) | ((~iHashCode) & i10);
            int i29 = f53296s0;
            int i30 = i29 & 11;
            int i31 = (i29 | 11) & (~i30);
            int i32 = i30 << 1;
            int i33 = (i31 & i32) + (i32 | i31);
            f53297t0 = i33 % 128;
            int i34 = i33 % 2;
        }
        int i35 = f53297t0 + 115;
        f53296s0 = i35 % 128;
        if (i35 % 2 == 0) {
            return i10;
        }
        throw null;
    }
}
