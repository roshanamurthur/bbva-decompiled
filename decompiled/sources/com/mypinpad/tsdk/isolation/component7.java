package com.mypinpad.tsdk.isolation;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class component7 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f54975c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f54976d = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<String> f54977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final List<component8> f54978b;

    public component7(@NotNull List<String> list, @NotNull List<component8> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.f54977a = list;
        this.f54978b = list2;
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        int i13;
        int i14 = ((i10 | (~(i11 | (~i12)))) * 56) + ((~(i10 | i11)) * (-56)) + (((~(i10 | i12)) | i11) * 56) + (i11 * (-55)) + (i10 * (-55));
        if (i14 == 1) {
            component7 component7Var = (component7) objArr[0];
            StringBuilder sb2 = new StringBuilder("OnlineRequestTagsConfigData(genericTags=");
            sb2.append(component7Var.f54977a);
            sb2.append(", kernelTags=");
            sb2.append(component7Var.f54978b);
            sb2.append(RootService.CLOSE_BRACKET);
            String string = sb2.toString();
            int i15 = f54975c;
            int i16 = i15 & 51;
            int i17 = (i16 - (~((i15 ^ 51) | i16))) - 1;
            f54976d = i17 % 128;
            if (i17 % 2 != 0) {
                return string;
            }
            throw null;
        }
        if (i14 == 2) {
            component7 component7Var2 = (component7) objArr[0];
            Object obj = objArr[1];
            int i18 = f54975c;
            int i19 = ((i18 | 85) << 1) - (((~i18) & 85) | (i18 & (-86)));
            int i20 = i19 % 128;
            f54976d = i20;
            int i21 = i19 % 2;
            if (component7Var2 != obj) {
                if (!(obj instanceof component7)) {
                    int i22 = ((i20 ^ 103) | (i20 & 103)) << 1;
                    int i23 = -((i20 & (-104)) | ((~i20) & 103));
                    int i24 = (i22 ^ i23) + ((i22 & i23) << 1);
                    f54975c = i24 % 128;
                    return Boolean.valueOf(i24 % 2 != 0);
                }
                component7 component7Var3 = (component7) obj;
                if (!Intrinsics.areEqual(component7Var2.f54977a, component7Var3.f54977a)) {
                    int i25 = f54975c;
                    int i26 = i25 & 21;
                    int i27 = (i26 - (~((i25 ^ 21) | i26))) - 1;
                    f54976d = i27 % 128;
                    int i28 = i27 % 2;
                } else if (Intrinsics.areEqual(component7Var2.f54978b, component7Var3.f54978b)) {
                    int i29 = f54976d;
                    i13 = ((i29 | 115) << 1) - (i29 ^ 115);
                } else {
                    int i30 = f54975c;
                    int i31 = (i30 | 65) << 1;
                    int i32 = ~i30;
                    int i33 = -((i30 & (-66)) | (i32 & 65));
                    int i34 = ((i31 | i33) << 1) - (i31 ^ i33);
                    f54976d = i34 % 128;
                    int i35 = i34 % 2;
                    int i36 = (i30 & (-10)) | (i32 & 9);
                    int i37 = (i30 & 9) << 1;
                    int i38 = ((i36 | i37) << 1) - (i37 ^ i36);
                    f54976d = i38 % 128;
                    if (i38 % 2 == 0) {
                        throw null;
                    }
                }
                return Boolean.FALSE;
            }
            int i39 = i20 + 41;
            f54975c = i39 % 128;
            int i40 = i39 % 2;
            int i41 = i20 | 109;
            i13 = ((i41 << 1) - (~(-(i41 & (~(i20 & 109)))))) - 1;
            f54975c = i13 % 128;
            int i42 = i13 % 2;
            return Boolean.TRUE;
        }
        if (i14 == 3) {
            component7 component7Var4 = (component7) objArr[0];
            int i43 = f54975c;
            int i44 = i43 & 81;
            int i45 = ((i43 ^ 81) | i44) << 1;
            int i46 = -((~i44) & (i43 | 81));
            int i47 = (i45 & i46) + (i45 | i46);
            f54976d = i47 % 128;
            int i48 = i47 % 2;
            List<component8> list = component7Var4.f54978b;
            if (i48 == 0) {
                throw null;
            }
            int i49 = i43 ^ 115;
            int i50 = ((i43 & 115) | i49) << 1;
            int i51 = -i49;
            int i52 = (i50 & i51) + (i50 | i51);
            f54976d = i52 % 128;
            int i53 = i52 % 2;
            return list;
        }
        if (i14 == 4) {
            component7 component7Var5 = (component7) objArr[0];
            int i54 = f54975c + 117;
            int i55 = i54 % 128;
            f54976d = i55;
            int i56 = i54 % 2;
            List<String> list2 = component7Var5.f54977a;
            if (i56 == 0) {
                int i57 = 10 / 0;
            }
            int i58 = i55 + 47;
            f54975c = i58 % 128;
            if (i58 % 2 == 0) {
                return list2;
            }
            throw null;
        }
        component7 component7Var6 = (component7) objArr[0];
        int i59 = f54976d;
        int i60 = (((i59 | 82) << 1) - (i59 ^ 82)) - 1;
        f54975c = i60 % 128;
        int i61 = i60 % 2;
        int iHashCode = component7Var6.f54977a.hashCode();
        int i62 = iHashCode * 31;
        int iHashCode2 = component7Var6.f54978b.hashCode();
        int iIdentityHashCode = System.identityHashCode(component7Var6);
        int i63 = ((iHashCode2 * 980) - (~(-(~(iHashCode * (-30318)))))) - 1;
        int i64 = (i63 ^ (-1)) + (i63 << 1);
        int i65 = ~i62;
        int i66 = ~iIdentityHashCode;
        int i67 = i65 ^ i66;
        int i68 = i65 & i66;
        int i69 = (i67 & i68) | (i67 ^ i68);
        int i70 = ~i69;
        int i71 = ((i69 | i70) & i70) * 979;
        int i72 = i64 & i71;
        int i73 = -(-((i64 ^ i71) | i72));
        int i74 = (i72 & i73) + (i73 | i72);
        int i75 = iHashCode2 & i66;
        int i76 = ((~iHashCode2) & iIdentityHashCode) | i75;
        int i77 = iHashCode2 & iIdentityHashCode;
        int i78 = -(-(((i76 & i77) | (i76 ^ i77)) * (-979)));
        int i79 = ((i74 | i78) << 1) - (i74 ^ i78);
        int i80 = i65 ^ iIdentityHashCode;
        int i81 = iIdentityHashCode & i65;
        int i82 = (i81 & i80) | (i80 ^ i81);
        int i83 = ~i82;
        int i84 = (i82 | i83) & i83;
        int i85 = (~i75) & (iHashCode2 | i66);
        int i86 = ~((i75 & i85) | (i85 ^ i75));
        int i87 = ((i84 & i86) | (i84 ^ i86)) * 979;
        int i88 = (i79 ^ i87) + ((i87 & i79) << 1);
        int i89 = f54975c;
        int i90 = i89 & 3;
        int i91 = (i90 - (~((i89 ^ 3) | i90))) - 1;
        f54976d = i91 % 128;
        if (i91 % 2 == 0) {
            int i92 = 94 / 0;
        }
        return Integer.valueOf(i88);
    }

    public final boolean equals(@Nullable Object obj) {
        return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{this, obj}, 999243292, -999243290, System.identityHashCode(this))).booleanValue();
    }

    public final int hashCode() {
        return ((Integer) setCompoundDrawableTintBlendMode(new Object[]{this}, -1392866258, 1392866258, System.identityHashCode(this))).intValue();
    }

    @NotNull
    public final List<String> setX() {
        return (List) setCompoundDrawableTintBlendMode(new Object[]{this}, -29687274, 29687278, System.identityHashCode(this));
    }

    @NotNull
    public final List<component8> setY() {
        return (List) setCompoundDrawableTintBlendMode(new Object[]{this}, 683859146, -683859143, System.identityHashCode(this));
    }

    @NotNull
    public final String toString() {
        return (String) setCompoundDrawableTintBlendMode(new Object[]{this}, 1271447701, -1271447700, System.identityHashCode(this));
    }
}
