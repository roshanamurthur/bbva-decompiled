package com.mypinpad.tsdk.isolation;

import c2.b;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class setTextFilterEnabled {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f60669d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f60670e = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f60671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f60672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final List<String> f60673c;

    public setTextFilterEnabled(@NotNull String str, @NotNull String str2, @NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.f60671a = str;
        this.f60672b = str2;
        this.f60673c = list;
        component2.setX(new Object[]{str}, -703410752, 703410758, (int) System.currentTimeMillis());
        component2.setX(new Object[]{str2}, -1859662003, 1859662007, (int) System.currentTimeMillis());
        component2.setX(new Object[]{list}, 1124287968, -1124287945, (int) System.currentTimeMillis());
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            component2.setX(new Object[]{(String) it.next()}, 1611427519, -1611427508, (int) System.currentTimeMillis());
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00f5  */
    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (i11 * (-667)) + (i10 * (-1335));
        int i14 = ~i11;
        int i15 = i10 | i12;
        int i16 = ((i14 | i15) * 668) + ((i10 | (~(i12 | i14))) * 1336) + (((~i15) | i14) * (-668)) + i13;
        boolean z10 = false;
        if (i16 == 1) {
            setTextFilterEnabled settextfilterenabled = (setTextFilterEnabled) objArr[0];
            int i17 = f60669d;
            int i18 = (i17 ^ 39) + ((i17 & 39) << 1);
            f60670e = i18 % 128;
            int i19 = i18 % 2;
            String str = settextfilterenabled.f60671a;
            int i20 = (((i17 | 8) << 1) - (i17 ^ 8)) - 1;
            f60670e = i20 % 128;
            if (i20 % 2 != 0) {
                return str;
            }
            throw null;
        }
        if (i16 == 2) {
            int i21 = f60669d;
            int i22 = i21 & 125;
            int i23 = (i21 ^ 125) | i22;
            int i24 = (i22 ^ i23) + ((i23 & i22) << 1);
            int i25 = i24 % 128;
            f60670e = i25;
            int i26 = i24 % 2;
            int i27 = i25 + 35;
            f60669d = i27 % 128;
            int i28 = i27 % 2;
            return "RPKCD";
        }
        if (i16 == 3) {
            setTextFilterEnabled settextfilterenabled2 = (setTextFilterEnabled) objArr[0];
            int i29 = f60670e;
            int i30 = i29 & 67;
            int i31 = i30 + ((i29 ^ 67) | i30);
            f60669d = i31 % 128;
            int i32 = i31 % 2;
            List<String> list = settextfilterenabled2.f60673c;
            if (i32 == 0) {
                return list;
            }
            int i33 = 58 / 0;
            return list;
        }
        if (i16 != 4) {
            if (i16 == 5) {
                setTextFilterEnabled settextfilterenabled3 = (setTextFilterEnabled) objArr[0];
                int i34 = f60669d;
                int i35 = (i34 & 39) + (i34 | 39);
                f60670e = i35 % 128;
                int i36 = i35 % 2;
                String str2 = settextfilterenabled3.f60672b;
                int i37 = i34 & 25;
                int i38 = (i34 | 25) & (~i37);
                int i39 = i37 << 1;
                int i40 = (i38 ^ i39) + ((i38 & i39) << 1);
                f60670e = i40 % 128;
                if (i40 % 2 != 0) {
                    return str2;
                }
                throw null;
            }
            setTextFilterEnabled settextfilterenabled4 = (setTextFilterEnabled) objArr[0];
            int i41 = f60669d;
            int i42 = i41 & 29;
            int i43 = (i41 ^ 29) | i42;
            int i44 = (i42 ^ i43) + ((i43 & i42) << 1);
            f60670e = i44 % 128;
            int i45 = i44 % 2;
            int iE = (b.e(settextfilterenabled4.f60671a.hashCode() * 31, ~(-(~(-(-settextfilterenabled4.f60672b.hashCode())))), 2, 31) - (~(-(-settextfilterenabled4.f60673c.hashCode())))) - 1;
            int i46 = f60670e;
            int i47 = (i46 & (-4)) | ((~i46) & 3);
            int i48 = -(-((i46 & 3) << 1));
            int i49 = (i47 & i48) + (i48 | i47);
            f60669d = i49 % 128;
            if (i49 % 2 != 0) {
                int i50 = 87 / 0;
            }
            return Integer.valueOf(iE);
        }
        setTextFilterEnabled settextfilterenabled5 = (setTextFilterEnabled) objArr[0];
        Object obj = objArr[1];
        int i51 = f60670e;
        int i52 = i51 + 50;
        int i53 = (i52 ^ (-1)) + (i52 << 1);
        f60669d = i53 % 128;
        int i54 = i53 % 2;
        if (settextfilterenabled5 == obj) {
            int i55 = i51 & 121;
            int i56 = -(-(i51 | 121));
            int i57 = (i55 & i56) + (i55 | i56);
            f60669d = i57 % 128;
            z10 = i57 % 2 == 0;
            int i58 = i51 + 61;
            f60669d = i58 % 128;
            if (i58 % 2 != 0) {
                throw null;
            }
        } else if (obj instanceof setTextFilterEnabled) {
            setTextFilterEnabled settextfilterenabled6 = (setTextFilterEnabled) obj;
            if (!Intrinsics.areEqual(settextfilterenabled5.f60671a, settextfilterenabled6.f60671a)) {
                int i59 = f60670e;
                int i60 = i59 & 67;
                int i61 = (i59 ^ 67) | i60;
                int i62 = (i60 ^ i61) + ((i61 & i60) << 1);
                int i63 = i62 % 128;
                f60669d = i63;
                int i64 = i62 % 2;
                int i65 = (-2) - (((i63 ^ 110) + ((i63 & 110) << 1)) ^ (-1));
                f60670e = i65 % 128;
                int i66 = i65 % 2;
                return Boolean.FALSE;
            }
            if (!Intrinsics.areEqual(settextfilterenabled5.f60672b, settextfilterenabled6.f60672b)) {
                int i67 = f60670e;
                int i68 = (i67 & 69) + (i67 | 69);
                int i69 = i68 % 128;
                f60669d = i69;
                z10 = i68 % 2 != 0;
                int i70 = ((((i69 ^ 17) | (i69 & 17)) << 1) - (~(-(((~i69) & 17) | (i69 & (-18)))))) - 1;
                f60670e = i70 % 128;
                int i71 = i70 % 2;
            } else {
                if (Intrinsics.areEqual(settextfilterenabled5.f60673c, settextfilterenabled6.f60673c)) {
                    int i72 = f60670e;
                    int i73 = i72 & 9;
                    int i74 = ((i72 | 9) & (~i73)) + (i73 << 1);
                    f60669d = i74 % 128;
                    int i75 = i74 % 2;
                    return Boolean.TRUE;
                }
                int i76 = f60670e + 125;
                f60669d = i76 % 128;
                if (i76 % 2 != 0) {
                    z10 = true;
                }
            }
        } else {
            int i77 = i51 & 123;
            int i78 = -(-((i51 ^ 123) | i77));
            int i79 = (i77 & i78) + (i77 | i78);
            f60669d = i79 % 128;
            if (i79 % 2 != 0) {
                z10 = true;
            }
        }
        return Boolean.valueOf(z10);
    }

    public final boolean equals(@Nullable Object obj) {
        return ((Boolean) setX(new Object[]{this, obj}, 1868805494, -1868805490, System.identityHashCode(this))).booleanValue();
    }

    public final int hashCode() {
        return ((Integer) setX(new Object[]{this}, 1873597368, -1873597368, System.identityHashCode(this))).intValue();
    }

    @NotNull
    public final List<String> setOnFocusChangeListener() {
        return (List) setX(new Object[]{this}, 1964626400, -1964626397, System.identityHashCode(this));
    }

    @NotNull
    public final String setY() {
        return (String) setX(new Object[]{this}, -878664251, 878664256, System.identityHashCode(this));
    }

    @NotNull
    public final String toString() {
        return (String) setX(new Object[]{this}, 1794506510, -1794506508, System.identityHashCode(this));
    }

    @NotNull
    public final String setX() {
        return (String) setX(new Object[]{this}, 1304105018, -1304105017, System.identityHashCode(this));
    }
}
