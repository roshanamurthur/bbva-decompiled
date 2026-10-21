package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class getAmount {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f55658c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f55659d = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f55660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f55661b;

    public getAmount(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.f55660a = str;
        this.f55661b = str2;
        getPinPadLandscape.setY(new Object[]{str}, -1901136937, 1901136939, (int) System.currentTimeMillis());
        getPinPadLandscape.setY(new Object[]{str2}, 165764303, -165764303, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        int iHashCode;
        int i13 = (i11 * 702) + (i10 * (-700));
        int i14 = ~i10;
        int i15 = ~i11;
        int i16 = (i15 * 701) + ((i14 | i11) * (-701)) + ((~(i14 | i15)) * 701) + i13;
        if (i16 == 1) {
            getAmount getamount = (getAmount) objArr[0];
            int i17 = f55658c;
            int i18 = ((i17 & 68) + (i17 | 68)) - 1;
            f55659d = i18 % 128;
            int i19 = i18 % 2;
            String str = getamount.f55660a;
            int i20 = i17 | 17;
            int i21 = i20 << 1;
            int i22 = -((~(i17 & 17)) & i20);
            int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
            f55659d = i23 % 128;
            int i24 = i23 % 2;
            return str;
        }
        if (i16 == 2) {
            getAmount getamount2 = (getAmount) objArr[0];
            int i25 = f55659d;
            int i26 = i25 & 35;
            int i27 = (i25 | 35) & (~i26);
            int i28 = i26 << 1;
            int i29 = (i27 & i28) + (i27 | i28);
            f55658c = i29 % 128;
            int i30 = i29 % 2;
            String str2 = getamount2.f55661b;
            if (i30 == 0) {
                return str2;
            }
            throw null;
        }
        if (i16 != 3) {
            if (i16 == 4) {
                int i31 = f55658c;
                int i32 = (i31 ^ 85) + ((i31 & 85) << 1);
                int i33 = i32 % 128;
                f55659d = i33;
                int i34 = i32 % 2;
                int i35 = i33 ^ 11;
                int i36 = ((i33 & 11) | i35) << 1;
                int i37 = -i35;
                int i38 = (i36 & i37) + (i36 | i37);
                f55658c = i38 % 128;
                int i39 = i38 % 2;
                return "TCD";
            }
            getAmount getamount3 = (getAmount) objArr[0];
            int i40 = f55659d + 93;
            f55658c = i40 % 128;
            if (i40 % 2 != 0) {
                int iHashCode2 = getamount3.f55660a.hashCode();
                int i41 = iHashCode2 & (-59);
                iHashCode = (((((iHashCode2 ^ (-59)) | i41) << 1) - (~(-((iHashCode2 | (-59)) & (~i41))))) - 1) / getamount3.f55661b.hashCode();
            } else {
                int iHashCode3 = getamount3.f55660a.hashCode() * 31;
                int iHashCode4 = getamount3.f55661b.hashCode();
                int i42 = iHashCode3 & iHashCode4;
                int i43 = (iHashCode4 ^ iHashCode3) | i42;
                iHashCode = ((i42 | i43) << 1) - (i43 ^ i42);
            }
            int i44 = f55658c;
            int i45 = i44 & 15;
            int i46 = (i44 | 15) & (~i45);
            int i47 = -(-(i45 << 1));
            int i48 = (i46 ^ i47) + ((i46 & i47) << 1);
            f55659d = i48 % 128;
            int i49 = i48 % 2;
            return Integer.valueOf(iHashCode);
        }
        getAmount getamount4 = (getAmount) objArr[0];
        Object obj = objArr[1];
        int i50 = (-2) - ((f55659d + 24) ^ (-1));
        int i51 = i50 % 128;
        f55658c = i51;
        int i52 = i50 % 2;
        if (getamount4 == obj) {
            int i53 = (i51 & 95) + (i51 | 95);
            int i54 = i53 % 128;
            f55659d = i54;
            int i55 = i53 % 2;
            int i56 = i54 & 49;
            int i57 = (i54 | 49) & (~i56);
            int i58 = i56 << 1;
            int i59 = (i57 & i58) + (i58 | i57);
            f55658c = i59 % 128;
            if (i59 % 2 != 0) {
                throw null;
            }
        } else {
            if (!(obj instanceof getAmount)) {
                int i60 = i51 & 101;
                int i61 = ((i51 ^ 101) | i60) << 1;
                int i62 = -((~i60) & (i51 | 101));
                int i63 = (i61 & i62) + (i61 | i62);
                f55659d = i63 % 128;
                return Boolean.valueOf(i63 % 2 == 0);
            }
            getAmount getamount5 = (getAmount) obj;
            if (!Intrinsics.areEqual(getamount4.f55660a, getamount5.f55660a)) {
                int i64 = f55658c;
                int i65 = i64 | 11;
                int i66 = i65 << 1;
                int i67 = -(i65 & (~(i64 & 11)));
                int i68 = (i66 ^ i67) + ((i67 & i66) << 1);
                f55659d = i68 % 128;
                int i69 = i68 % 2;
                int i70 = ((i64 ^ 77) - (~(-(-((i64 & 77) << 1))))) - 1;
                f55659d = i70 % 128;
                int i71 = i70 % 2;
                return Boolean.FALSE;
            }
            if (!Intrinsics.areEqual(getamount4.f55661b, getamount5.f55661b)) {
                int i72 = f55659d + 27;
                int i73 = i72 % 128;
                f55658c = i73;
                boolean z10 = i72 % 2 != 0;
                int i74 = ((i73 ^ 77) | (i73 & 77)) << 1;
                int i75 = -(((~i73) & 77) | (i73 & (-78)));
                int i76 = (i74 ^ i75) + ((i75 & i74) << 1);
                f55659d = i76 % 128;
                if (i76 % 2 == 0) {
                    int i77 = 23 / 0;
                }
                return Boolean.valueOf(z10);
            }
            int i78 = f55659d;
            int i79 = i78 & 97;
            int i80 = ((((i78 ^ 97) | i79) << 1) - (~(-((i78 | 97) & (~i79))))) - 1;
            f55658c = i80 % 128;
            int i81 = i80 % 2;
        }
        return Boolean.TRUE;
    }

    public final boolean equals(@Nullable Object obj) {
        return ((Boolean) setDividerPadding(new Object[]{this, obj}, 1514448011, -1514448008, System.identityHashCode(this))).booleanValue();
    }

    public final int hashCode() {
        return ((Integer) setDividerPadding(new Object[]{this}, 446035575, -446035575, System.identityHashCode(this))).intValue();
    }

    @NotNull
    public final String setOnFocusChangeListener() {
        return (String) setDividerPadding(new Object[]{this}, -974939786, 974939787, System.identityHashCode(this));
    }

    @NotNull
    public final String setX() {
        return (String) setDividerPadding(new Object[]{this}, 335580367, -335580365, System.identityHashCode(this));
    }

    @NotNull
    public final String toString() {
        return (String) setDividerPadding(new Object[]{this}, -1422372801, 1422372805, System.identityHashCode(this));
    }
}
