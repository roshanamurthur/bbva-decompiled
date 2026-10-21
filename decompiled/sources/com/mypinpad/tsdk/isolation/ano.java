package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public class ano extends amw {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f53334s0 = 0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f53335t0 = 1;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final anr f53336r0;

    public ano(anr anrVar) {
        super(false);
        this.f53336r0 = anrVar;
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        ano anoVar = (ano) objArr[0];
        int i13 = f53335t0;
        int i14 = i13 & 23;
        int i15 = -(-(i13 | 23));
        int i16 = (i14 ^ i15) + ((i14 & i15) << 1);
        f53334s0 = i16 % 128;
        int i17 = i16 % 2;
        anr anrVar = anoVar.f53336r0;
        int i18 = (((i13 | 38) << 1) - (i13 ^ 38)) - 1;
        f53334s0 = i18 % 128;
        int i19 = i18 % 2;
        return anrVar;
    }

    public boolean equals(Object obj) {
        int i10 = f53334s0;
        int i11 = ((-1) << 1) - ((((i10 | 64) << 1) - (i10 ^ 64)) ^ (-1));
        int i12 = i11 % 128;
        f53335t0 = i12;
        int i13 = i11 % 2;
        if (!(obj instanceof ano)) {
            int i14 = ((-1) << 1) - ((((i12 | 118) << 1) - (i12 ^ 118)) ^ (-1));
            f53334s0 = i14 % 128;
            int i15 = i14 % 2;
            int i16 = i12 & 35;
            int i17 = i12 | 35;
            int i18 = ((i16 | i17) << 1) - (i16 ^ i17);
            f53334s0 = i18 % 128;
            if (i18 % 2 != 0) {
                int i19 = 67 / 0;
            }
            return false;
        }
        ano anoVar = (ano) obj;
        anr anrVar = this.f53336r0;
        if (anrVar != null) {
            boolean zEquals = anrVar.equals((anr) setCompoundDrawableTintBlendMode(new Object[]{anoVar}, 584013557, -584013557, System.identityHashCode(anoVar)));
            int i20 = f53335t0 + 45;
            f53334s0 = i20 % 128;
            if (i20 % 2 == 0) {
                return zEquals;
            }
            throw null;
        }
        int i21 = i10 & 41;
        int i22 = (((i10 ^ 41) | i21) << 1) - ((i10 | 41) & (~i21));
        f53335t0 = i22 % 128;
        Object[] objArr = new Object[1];
        if (i22 % 2 == 0) {
            objArr[0] = anoVar;
            throw null;
        }
        objArr[0] = anoVar;
        if (((anr) setCompoundDrawableTintBlendMode(objArr, 584013557, -584013557, System.identityHashCode(anoVar))) != null) {
            int i23 = f53335t0;
            int i24 = ((-1) << 1) - (((i23 ^ 88) + ((i23 & 88) << 1)) ^ (-1));
            f53334s0 = i24 % 128;
            if (i24 % 2 == 0) {
                return false;
            }
            throw null;
        }
        int i25 = f53334s0;
        int i26 = i25 ^ 103;
        int i27 = ((i25 & 103) | i26) << 1;
        int i28 = -i26;
        int i29 = (i27 ^ i28) + ((i27 & i28) << 1);
        f53335t0 = i29 % 128;
        int i30 = i29 % 2;
        return true;
    }

    public int hashCode() {
        int i10 = f53335t0;
        int i11 = i10 & 59;
        int i12 = (i10 ^ 59) | i11;
        int i13 = (i11 & i12) + (i11 | i12);
        int i14 = i13 % 128;
        f53334s0 = i14;
        if (i13 % 2 != 0) {
            throw null;
        }
        anr anrVar = this.f53336r0;
        if (anrVar == null) {
            int i15 = i14 + 63;
            f53335t0 = i15 % 128;
            if (i15 % 2 != 0) {
                return 0;
            }
            throw null;
        }
        int i16 = (i10 ^ 91) + ((i10 & 91) << 1);
        f53334s0 = i16 % 128;
        int i17 = i16 % 2;
        int iHashCode = anrVar.hashCode();
        if (i17 != 0) {
            int i18 = 59 / 0;
        }
        int i19 = f53334s0;
        int i20 = ((-1) << 1) - ((-1) ^ ((i19 ^ 114) + ((i19 & 114) << 1)));
        f53335t0 = i20 % 128;
        if (i20 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }
}
