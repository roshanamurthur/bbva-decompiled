package com.mypinpad.tsdk.isolation;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.sdkcatalog.openpay.plugin.data.error.ErrorCodes;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class setPopupTheme {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f60326c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f60327d = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<String> f60328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final List<SouthAmericaEndpoint> f60329b;

    public setPopupTheme(@NotNull List<String> list, @NotNull List<SouthAmericaEndpoint> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.f60328a = list;
        this.f60329b = list2;
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        int i13;
        int i14 = ~i12;
        int i15 = ~i10;
        int i16 = ~i11;
        int i17 = i14 | (~(i15 | i16));
        int i18 = ~(i10 | i11);
        int i19 = (((~(i10 | i16)) | (~(i11 | i15))) * ErrorCodes.STORAGE_PERMISSION) + (((~(i12 | i11)) | (~(i10 | i12)) | i18) * (-1444)) + ((i17 | i18) * 1444) + (i11 * (-721)) + (i10 * (-721));
        if (i19 == 1) {
            setPopupTheme setpopuptheme = (setPopupTheme) objArr[0];
            StringBuilder sb2 = new StringBuilder("OnlineRequestTags(genericTags=");
            sb2.append(setpopuptheme.f60328a);
            sb2.append(", kernelTags=");
            sb2.append(setpopuptheme.f60329b);
            sb2.append(RootService.CLOSE_BRACKET);
            String string = sb2.toString();
            int i20 = f60326c;
            int i21 = i20 & 123;
            int i22 = (i20 | 123) & (~i21);
            int i23 = i21 << 1;
            int i24 = ((i22 | i23) << 1) - (i22 ^ i23);
            f60327d = i24 % 128;
            int i25 = i24 % 2;
            return string;
        }
        if (i19 == 2) {
            setPopupTheme setpopuptheme2 = (setPopupTheme) objArr[0];
            Object obj = objArr[1];
            int i26 = f60327d;
            int i27 = (i26 & (-26)) | ((~i26) & 25);
            int i28 = -(-((i26 & 25) << 1));
            int i29 = (i27 ^ i28) + ((i27 & i28) << 1);
            f60326c = i29 % 128;
            int i30 = i29 % 2;
            if (setpopuptheme2 != obj) {
                if (obj instanceof setPopupTheme) {
                    setPopupTheme setpopuptheme3 = (setPopupTheme) obj;
                    if (!Intrinsics.areEqual(setpopuptheme2.f60328a, setpopuptheme3.f60328a)) {
                        int i31 = f60327d;
                        int i32 = (((i31 | 22) << 1) - (i31 ^ 22)) - 1;
                        f60326c = i32 % 128;
                        int i33 = i32 % 2;
                        int i34 = (i31 | 1) << 1;
                        int i35 = -(((~i31) & 1) | (i31 & (-2)));
                        int i36 = (i34 & i35) + (i35 | i34);
                        f60326c = i36 % 128;
                        if (i36 % 2 != 0) {
                            throw null;
                        }
                    } else {
                        if (!Intrinsics.areEqual(setpopuptheme2.f60329b, setpopuptheme3.f60329b)) {
                            int i37 = f60327d;
                            int i38 = ((((i37 ^ 71) | (i37 & 71)) << 1) - (~(-(((~i37) & 71) | (i37 & (-72)))))) - 1;
                            f60326c = i38 % 128;
                            return Boolean.valueOf(i38 % 2 != 0);
                        }
                        int i39 = f60326c + 54;
                        int i40 = (i39 ^ (-1)) + (i39 << 1);
                        f60327d = i40 % 128;
                        if (i40 % 2 == 0) {
                            i13 = 6;
                            int i41 = i13 / 0;
                        }
                    }
                } else {
                    int i42 = ((i26 | 37) << 1) - (i26 ^ 37);
                    f60326c = i42 % 128;
                    int i43 = i42 % 2;
                }
                return Boolean.FALSE;
            }
            int i44 = i26 + 25;
            int i45 = i44 % 128;
            f60326c = i45;
            int i46 = i44 % 2;
            int i47 = i45 + 21;
            f60327d = i47 % 128;
            if (i47 % 2 == 0) {
                i13 = 17;
                int i48 = i13 / 0;
            }
            return Boolean.TRUE;
        }
        if (i19 == 3) {
            setPopupTheme setpopuptheme4 = (setPopupTheme) objArr[0];
            int i49 = f60326c;
            int i50 = i49 & 57;
            int i51 = i50 + ((i49 ^ 57) | i50);
            f60327d = i51 % 128;
            int i52 = i51 % 2;
            List<String> list = setpopuptheme4.f60328a;
            if (i52 == 0) {
                int i53 = 83 / 0;
            }
            int i54 = i49 & 115;
            int i55 = -(-((i49 ^ 115) | i54));
            int i56 = (i54 ^ i55) + ((i55 & i54) << 1);
            f60327d = i56 % 128;
            if (i56 % 2 != 0) {
                return list;
            }
            int i57 = 45 / 0;
            return list;
        }
        if (i19 == 4) {
            setPopupTheme setpopuptheme5 = (setPopupTheme) objArr[0];
            int i58 = f60327d + 19;
            int i59 = i58 % 128;
            f60326c = i59;
            int i60 = i58 % 2;
            List<SouthAmericaEndpoint> list2 = setpopuptheme5.f60329b;
            int i61 = i59 + 79;
            f60327d = i61 % 128;
            if (i61 % 2 != 0) {
                return list2;
            }
            int i62 = 87 / 0;
            return list2;
        }
        setPopupTheme setpopuptheme6 = (setPopupTheme) objArr[0];
        int i63 = f60327d;
        int i64 = i63 & 35;
        int i65 = ((i63 ^ 35) | i64) << 1;
        int i66 = -((i63 | 35) & (~i64));
        int i67 = (i65 ^ i66) + ((i66 & i65) << 1);
        f60326c = i67 % 128;
        int i68 = i67 % 2;
        int iHashCode = setpopuptheme6.f60328a.hashCode();
        int i69 = iHashCode * 31;
        int iHashCode2 = setpopuptheme6.f60329b.hashCode();
        int iIdentityHashCode = System.identityHashCode(setpopuptheme6);
        int i70 = iHashCode2 * 303;
        int i71 = -(-(iHashCode * (-9331)));
        int i72 = i70 | i71;
        int i73 = (i72 << 1) - ((~(i71 & i70)) & i72);
        int i74 = ~iHashCode2;
        int i75 = (~iIdentityHashCode) & ((~iIdentityHashCode) | iIdentityHashCode);
        int i76 = i74 & i75;
        int i77 = (i74 | i75) & (~i76);
        int i78 = (i77 & i76) | (i77 ^ i76);
        int i79 = ~i69;
        int i80 = (i78 & i79) | ((~i78) & i69);
        int i81 = i78 & i69;
        int i82 = ~((i81 & i80) | (i80 ^ i81));
        int i83 = iHashCode2 ^ i69;
        int i84 = iHashCode2 & i69;
        int i85 = (i83 & i84) | (i83 ^ i84);
        int i86 = i85 & iIdentityHashCode;
        int i87 = ~(((i85 | iIdentityHashCode) & (~i86)) | i86);
        int i88 = -(-(((i82 & i87) | (i82 ^ i87)) * (-302)));
        int i89 = i73 & i88;
        int i90 = (((i88 | i73) & (~i89)) - (~(i89 << 1))) - 1;
        int i91 = ~iHashCode2;
        int i92 = (i79 & i91) | ((~i91) & i69);
        int i93 = i91 & i69;
        int i94 = (i92 & i93) | (i92 ^ i93);
        int i95 = i94 ^ iIdentityHashCode;
        int i96 = i94 & iIdentityHashCode;
        int i97 = (i96 & i95) | (i95 ^ i96);
        int i98 = -(~(((i97 | (~i97)) & (~i97)) * (-604)));
        int i99 = ((i90 ^ i98) + ((i90 & i98) << 1)) - 1;
        int i100 = ~i69;
        int i101 = i100 ^ iHashCode2;
        int i102 = i100 & iHashCode2;
        int i103 = ~((i102 & i101) | (i101 ^ i102));
        int i104 = ~(iIdentityHashCode | i69);
        int i105 = -(-(((i104 & i103) | (i103 ^ i104)) * 302));
        int i106 = ((i99 | i105) << 1) - (i105 ^ i99);
        int i107 = f60326c;
        int i108 = (i107 ^ 30) + ((i107 & 30) << 1);
        int i109 = (i108 ^ (-1)) + (i108 << 1);
        f60327d = i109 % 128;
        int i110 = i109 % 2;
        return Integer.valueOf(i106);
    }

    public final boolean equals(@Nullable Object obj) {
        return ((Boolean) setDividerPadding(new Object[]{this, obj}, -1430227217, 1430227219, System.identityHashCode(this))).booleanValue();
    }

    public final int hashCode() {
        return ((Integer) setDividerPadding(new Object[]{this}, 704874842, -704874842, System.identityHashCode(this))).intValue();
    }

    @NotNull
    public final List<SouthAmericaEndpoint> setCompoundDrawableTintBlendMode() {
        return (List) setDividerPadding(new Object[]{this}, -1681328695, 1681328699, System.identityHashCode(this));
    }

    @NotNull
    public final String toString() {
        return (String) setDividerPadding(new Object[]{this}, 791264648, -791264647, System.identityHashCode(this));
    }

    @NotNull
    public final List<String> setDividerPadding() {
        return (List) setDividerPadding(new Object[]{this}, 1215054017, -1215054014, System.identityHashCode(this));
    }
}
