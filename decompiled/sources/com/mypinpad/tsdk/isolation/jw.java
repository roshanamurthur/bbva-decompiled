package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class jw {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f56716d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f56717e = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final iv f56718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final component10 f56719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final setFontFeatureSettings f56720c;

    public jw(@NotNull iv ivVar, @NotNull component10 component10Var, @NotNull setFontFeatureSettings setfontfeaturesettings) {
        Intrinsics.checkNotNullParameter(ivVar, "");
        Intrinsics.checkNotNullParameter(component10Var, "");
        Intrinsics.checkNotNullParameter(setfontfeaturesettings, "");
        this.f56718a = ivVar;
        this.f56719b = component10Var;
        this.f56720c = setfontfeaturesettings;
    }

    public static final /* synthetic */ component10 setCompoundDrawableTintBlendMode(jw jwVar) {
        return (component10) setOnFocusChangeListener(new Object[]{jwVar}, 174138397, -174138393, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        Object obj;
        int i13 = ~i10;
        int i14 = ((i11 | i13) * (-1434)) + (i11 * 1435) + (i10 * (-716));
        int i15 = ~i12;
        int i16 = ~(i15 | i11);
        int i17 = ~(i10 | i11);
        int i18 = i13 | (~i11);
        int i19 = ((i17 | (~(i18 | i15)) | (~(i11 | i12))) * 717) + ((i16 | i17 | (~(i18 | i12))) * 717) + i14;
        if (i19 == 1) {
            jw jwVar = (jw) objArr[0];
            int i20 = f56716d;
            int i21 = (i20 & 77) + (i20 | 77);
            f56717e = i21 % 128;
            int i22 = i21 % 2;
            obj = jwVar.f56720c;
            if (i22 == 0) {
                int i23 = 22 / 0;
            }
        } else {
            if (i19 == 2) {
                jw jwVar2 = (jw) objArr[0];
                int i24 = f56716d;
                int i25 = i24 & 21;
                int i26 = (((i24 ^ 21) | i25) << 1) - ((~i25) & (i24 | 21));
                f56717e = i26 % 128;
                int i27 = i26 % 2;
                iv ivVar = jwVar2.f56718a;
                int i28 = ((i24 ^ 111) | (i24 & 111)) << 1;
                int i29 = -(((~i24) & 111) | (i24 & (-112)));
                int i30 = (i28 & i29) + (i28 | i29);
                f56717e = i30 % 128;
                int i31 = i30 % 2;
                return ivVar;
            }
            if (i19 == 3) {
                jw jwVar3 = (jw) objArr[0];
                cz czVar = new cz(jwVar3.f56718a);
                cy cyVar = new cy(jwVar3.f56718a);
                int i32 = f56717e;
                int i33 = i32 & 117;
                int i34 = ((((i32 ^ 117) | i33) << 1) - (~(-((i32 | 117) & (~i33))))) - 1;
                f56716d = i34 % 128;
                if (i34 % 2 == 0) {
                    return null;
                }
                throw null;
            }
            if (i19 != 4) {
                jw jwVar4 = (jw) objArr[0];
                int i35 = f56717e;
                int i36 = ((i35 ^ 101) | (i35 & 101)) << 1;
                int i37 = -(((~i35) & 101) | (i35 & (-102)));
                int i38 = ((i36 | i37) << 1) - (i37 ^ i36);
                f56716d = i38 % 128;
                if (i38 % 2 != 0) {
                    setOnFocusChangeListener(new Object[]{jwVar4}, 1182142631, -1182142628, System.identityHashCode(jwVar4));
                    throw null;
                }
                setOnFocusChangeListener(new Object[]{jwVar4}, 1182142631, -1182142628, System.identityHashCode(jwVar4));
                int i39 = f56716d;
                int i40 = i39 & 45;
                int i41 = (i39 ^ 45) | i40;
                int i42 = (i40 ^ i41) + ((i41 & i40) << 1);
                f56717e = i42 % 128;
                if (i42 % 2 != 0) {
                    return null;
                }
                int i43 = 69 / 0;
                return null;
            }
            jw jwVar5 = (jw) objArr[0];
            int i44 = f56717e;
            int i45 = (((i44 ^ 27) | (i44 & 27)) << 1) - ((i44 & (-28)) | ((~i44) & 27));
            f56716d = i45 % 128;
            int i46 = i45 % 2;
            obj = jwVar5.f56719b;
            int i47 = i44 & 29;
            int i48 = (i44 ^ 29) | i47;
            int i49 = (i47 ^ i48) + ((i48 & i47) << 1);
            f56716d = i49 % 128;
            if (i49 % 2 != 0) {
                throw null;
            }
        }
        return obj;
    }

    public static final /* synthetic */ iv setX(jw jwVar) {
        return (iv) setOnFocusChangeListener(new Object[]{jwVar}, 481504288, -481504286, (int) System.currentTimeMillis());
    }

    public static final /* synthetic */ setFontFeatureSettings setY(jw jwVar) {
        return (setFontFeatureSettings) setOnFocusChangeListener(new Object[]{jwVar}, 395764677, -395764676, (int) System.currentTimeMillis());
    }

    public final void setOnFocusChangeListener() {
        setOnFocusChangeListener(new Object[]{this}, 927926171, -927926171, System.identityHashCode(this));
    }
}
