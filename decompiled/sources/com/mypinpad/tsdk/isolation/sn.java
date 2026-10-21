package com.mypinpad.tsdk.isolation;

import java.io.Serializable;

/* JADX INFO: loaded from: classes10.dex */
public final class sn implements Serializable {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f60893t0 = 0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static int f60894u0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final float f60895p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final float f60896q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final float f60897r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final float f60898s0;

    public sn(float f6, float f10, float f11, float f12) {
        this.f60895p0 = f6;
        this.f60896q0 = f10;
        this.f60897r0 = f11;
        this.f60898s0 = f12;
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = (((~(i10 | i12)) | i11) * 272) + (((~(i13 | i12)) | (~(i13 | i11))) * (-272)) + (((~((~i11) | i13 | (~i12))) | (~(i10 | i11 | i12))) * (-272)) + (i11 * (-271)) + (i10 * 273);
        if (i14 == 1) {
            sn snVar = (sn) objArr[0];
            int i15 = f60894u0;
            int i16 = i15 & 63;
            int i17 = ((i15 ^ 63) | i16) << 1;
            int i18 = -((i15 | 63) & (~i16));
            int i19 = (i17 & i18) + (i18 | i17);
            int i20 = i19 % 128;
            f60893t0 = i20;
            int i21 = i19 % 2;
            float f6 = snVar.f60898s0;
            if (i21 != 0) {
                int i22 = 82 / 0;
            }
            int i23 = i20 ^ 3;
            int i24 = ((i20 & 3) | i23) << 1;
            int i25 = -i23;
            int i26 = ((i24 | i25) << 1) - (i24 ^ i25);
            f60894u0 = i26 % 128;
            int i27 = i26 % 2;
            return Float.valueOf(f6);
        }
        if (i14 == 2) {
            sn snVar2 = (sn) objArr[0];
            int i28 = f60893t0;
            int i29 = i28 & 81;
            int i30 = (i28 | 81) + i29;
            f60894u0 = i30 % 128;
            int i31 = i30 % 2;
            float f10 = snVar2.f60896q0;
            if (i31 == 0) {
                throw null;
            }
            int i32 = ((i29 | (i28 ^ 81)) << 1) - (((~i28) & 81) | (i28 & (-82)));
            f60894u0 = i32 % 128;
            if (i32 % 2 == 0) {
                int i33 = 43 / 0;
            }
            return Float.valueOf(f10);
        }
        if (i14 != 3) {
            sn snVar3 = (sn) objArr[0];
            int i34 = f60893t0;
            int i35 = (((i34 | 118) << 1) - (i34 ^ 118)) - 1;
            f60894u0 = i35 % 128;
            int i36 = i35 % 2;
            float f11 = snVar3.f60897r0;
            if (i36 != 0) {
                return Float.valueOf(f11);
            }
            throw null;
        }
        sn snVar4 = (sn) objArr[0];
        int i37 = f60893t0;
        int i38 = (((i37 ^ 101) | (i37 & 101)) << 1) - ((i37 & (-102)) | ((~i37) & 101));
        f60894u0 = i38 % 128;
        int i39 = i38 % 2;
        float f12 = snVar4.f60895p0;
        if (i39 == 0) {
            int i40 = 65 / 0;
        }
        int i41 = i37 ^ 81;
        int i42 = ((i37 & 81) | i41) << 1;
        int i43 = -i41;
        int i44 = ((i42 | i43) << 1) - (i42 ^ i43);
        f60894u0 = i44 % 128;
        if (i44 % 2 != 0) {
            return Float.valueOf(f12);
        }
        throw null;
    }

    public final float setCompoundDrawableTintBlendMode() {
        return ((Float) setX(new Object[]{this}, -1121733184, 1121733185, System.identityHashCode(this))).floatValue();
    }

    public final float setDividerPadding() {
        return ((Float) setX(new Object[]{this}, -1730009207, 1730009210, System.identityHashCode(this))).floatValue();
    }

    public final float setOnFocusChangeListener() {
        return ((Float) setX(new Object[]{this}, -2135379768, 2135379770, System.identityHashCode(this))).floatValue();
    }

    public final float setX() {
        return ((Float) setX(new Object[]{this}, 332549108, -332549108, System.identityHashCode(this))).floatValue();
    }
}
