package com.mypinpad.tsdk.isolation;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007R\u001a\u0010\u0018\u001a\u00020\u00138\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/mypinpad/tsdk/i/getNavBarBgColor;", "Lcom/mypinpad/tsdk/i/getInstallationId;", "", "setY", "()Z", "", "toString", "()Ljava/lang/String;", "", GenerateActivationFormCommand.HASH_CODE, "()I", "", "p0", "equals", "(Ljava/lang/Object;)Z", "c", "Ljava/lang/String;", "setCompoundDrawableTintBlendMode", "setDividerPadding", "Lcom/mypinpad/tsdk/i/Terminal;", "d", "Lcom/mypinpad/tsdk/i/Terminal;", "setOnFocusChangeListener", "()Lcom/mypinpad/tsdk/i/Terminal;", "setX", "<init>", "(Ljava/lang/String;)V"}, k = 1, mv = {1, 5, 1})
public final /* data */ class getNavBarBgColor extends getInstallationId {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f55913e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f55914f = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String setDividerPadding;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Terminal setX;

    static {
        int i10 = f55914f + 3;
        f55913e = i10 % 128;
        int i11 = i10 % 2;
    }

    public getNavBarBgColor(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.setDividerPadding = str;
        this.setX = Terminal.KERNEL_EFTPOS;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0172  */
    /* JADX WARN: Code duplicated, block: B:41:0x018a  */
    /* JADX WARN: Code duplicated, block: B:42:0x018b  */
    /* JADX WARN: Code duplicated, block: B:44:0x018f  */
    /* JADX WARN: Code duplicated, block: B:45:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:47:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:49:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:51:0x01df  */
    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        int i13;
        int i14;
        boolean z10;
        int i15 = ~i10;
        int i16 = ((i11 | i15) * (-1434)) + (i11 * 1435) + (i10 * (-716));
        int i17 = ~i12;
        int i18 = ~(i17 | i11);
        int i19 = ~(i10 | i11);
        int i20 = i15 | (~i11);
        int i21 = ((i19 | (~(i20 | i17)) | (~(i11 | i12))) * 717) + ((i18 | i19 | (~(i20 | i12))) * 717) + i16;
        if (i21 == 1) {
            getNavBarBgColor getnavbarbgcolor = (getNavBarBgColor) objArr[0];
            int iIdentityHashCode = System.identityHashCode(getnavbarbgcolor);
            int i22 = ~iIdentityHashCode;
            int i23 = (-2093581333) & i22;
            int i24 = ~(((-2093581333) ^ i22) | i23);
            int i25 = ~((952349575 ^ iIdentityHashCode) | (952349575 & iIdentityHashCode));
            int i26 = ((~i25) & i24) | ((~i24) & i25);
            int i27 = i24 & i25;
            int i28 = ((i27 & i26) | (i26 ^ i27)) * 333;
            int i29 = 972878207 & i28;
            int i30 = i29 + ((i28 ^ 972878207) | i29);
            int i31 = (iIdentityHashCode & (-2093581333)) | (2093581332 & iIdentityHashCode) | i23;
            int i32 = ~i31;
            int i33 = (i31 | i32) & i32;
            int i34 = i22 & 952349575;
            int i35 = (i22 | 952349575) & (~i34);
            int i36 = ~((i35 & i34) | (i35 ^ i34));
            int i37 = ((~i36) & i33) | ((~i33) & i36);
            int i38 = i33 & i36;
            int i39 = -(-(((i38 & i37) | (i37 ^ i38)) * 333));
            int i40 = (i30 | i39) << 1;
            int i41 = -(i39 ^ i30);
            int i42 = (i40 ^ i41) + ((i41 & i40) << 1);
            int iIdentityHashCode2 = System.identityHashCode(getnavbarbgcolor);
            int i43 = (-204315616) & iIdentityHashCode2;
            int i44 = ((-204315616) | iIdentityHashCode2) & (~i43);
            int i45 = ~iIdentityHashCode2;
            int i46 = ~((i44 & i43) | (i44 ^ i43));
            int i47 = ((~i46) & (-1316078600)) | (i46 & 1316078599);
            int i48 = i46 & (-1316078600);
            int i49 = 167083573 - (~(((i48 & i47) | (i47 ^ i48)) * (-318)));
            int i50 = ((-1316078600) & i45) | (iIdentityHashCode2 & 1316078599);
            int i51 = (-1316078600) & iIdentityHashCode2;
            int i52 = ~((i50 & i51) | (i50 ^ i51));
            int i53 = i45 & 204315615;
            int i54 = (~i53) & (i45 | 204315615);
            int i55 = (i53 & i54) | (i54 ^ i53);
            int i56 = (i55 & (-1316078600)) | ((~i55) & 1316078599);
            int i57 = 1316078599 & i55;
            int i58 = (i57 & i56) | (i56 ^ i57);
            int i59 = ~i58;
            int i60 = (i58 | i59) & i59;
            int i61 = i52 ^ i60;
            int i62 = i52 & i60;
            int i63 = -(-(((i62 & i61) | (i61 ^ i62)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET));
            int i64 = i49 ^ i63;
            int i65 = (i63 & i49) << 1;
            int i66 = ((i64 | i65) << 1) - (i65 ^ i64);
            int i67 = (i45 | iIdentityHashCode2) & i45;
            int i68 = (-1316078600) & i67;
            int i69 = ((i67 | (-1316078600)) & (~i68)) | i68;
            int i70 = ~((i69 & 204315615) | (i69 ^ 204315615));
            int i71 = 1316872159 ^ iIdentityHashCode2;
            int i72 = iIdentityHashCode2 & 1316872159;
            int i73 = ~((i72 & i71) | (i71 ^ i72));
            int i74 = ((~i73) & i70) | ((~i70) & i73);
            int i75 = i73 & i70;
            int i76 = (i66 - (~(-(~(((i75 & i74) | (i74 ^ i75)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET))))) - 1;
            if (i42 > (i76 ^ (-1)) + (i76 << 1)) {
                throw null;
            }
            int i77 = f55914f;
            int i78 = (((i77 ^ 55) | (i77 & 55)) << 1) - (((~i77) & 55) | (i77 & (-56)));
            f55913e = i78 % 128;
            if (i78 % 2 == 0) {
                return "kec";
            }
            throw null;
        }
        if (i21 != 2) {
            if (i21 == 3) {
                getNavBarBgColor getnavbarbgcolor2 = (getNavBarBgColor) objArr[0];
                int i79 = f55914f;
                int i80 = i79 & 31;
                int i81 = ((i79 | 31) & (~i80)) + (i80 << 1);
                f55913e = i81 % 128;
                int i82 = i81 % 2;
                int iHashCode = getnavbarbgcolor2.setDividerPadding.hashCode();
                if (i82 != 0) {
                    int i83 = 76 / 0;
                }
                return Integer.valueOf(iHashCode);
            }
            if (i21 != 4) {
                if (i21 != 5) {
                    getNavBarBgColor getnavbarbgcolor3 = (getNavBarBgColor) objArr[0];
                    int i84 = f55913e + 41;
                    f55914f = i84 % 128;
                    int i85 = i84 % 2;
                    String str = getnavbarbgcolor3.setDividerPadding;
                    if (i85 != 0) {
                        return str;
                    }
                    throw null;
                }
                getNavBarBgColor getnavbarbgcolor4 = (getNavBarBgColor) objArr[0];
                int i86 = f55914f;
                int i87 = i86 & 5;
                int i88 = -(-((i86 ^ 5) | i87));
                int i89 = (i87 & i88) + (i88 | i87);
                int i90 = i89 % 128;
                f55913e = i90;
                int i91 = i89 % 2;
                Terminal terminal = getnavbarbgcolor4.setX;
                int i92 = i90 & 113;
                int i93 = ((i90 | 113) & (~i92)) + (i92 << 1);
                f55914f = i93 % 128;
                int i94 = i93 % 2;
                return terminal;
            }
            getNavBarBgColor getnavbarbgcolor5 = (getNavBarBgColor) objArr[0];
            int i95 = f55914f;
            int i96 = (i95 ^ 17) + ((i95 & 17) << 1);
            f55913e = i96 % 128;
            if (i96 % 2 == 0 ? getnavbarbgcolor5.setDividerPadding.length() != 10 : getnavbarbgcolor5.setDividerPadding.length() != 11) {
                int i97 = f55914f + 35;
                f55913e = i97 % 128;
                int i98 = i97 % 2;
                z10 = false;
            } else {
                int i99 = f55914f;
                int i100 = i99 & 21;
                int i101 = ((i99 ^ 21) | i100) << 1;
                int i102 = -((i99 | 21) & (~i100));
                int i103 = ((i101 | i102) << 1) - (i102 ^ i101);
                f55913e = i103 % 128;
                int i104 = i103 % 2;
                z10 = true;
            }
            if (!z10) {
                int i105 = f55913e;
                int i106 = i105 & 7;
                int i107 = -(-((i105 ^ 7) | i106));
                int i108 = (i106 & i107) + (i107 | i106);
                f55914f = i108 % 128;
                int i109 = i108 % 2;
                SouthPacificEndpoint southPacificEndpoint = SouthPacificEndpoint.setX;
                SouthPacificEndpoint.setX(new Object[]{Intrinsics.stringPlus("Invalid TAC - Denial length in Kernel Eftpos configuration, expected: 10, actual: ", Integer.valueOf(((String) setCompoundDrawableTintBlendMode(new Object[]{getnavbarbgcolor5}, 532765770, -532765770, System.identityHashCode(getnavbarbgcolor5))).length()))}, 818541572, -818541572, (int) System.currentTimeMillis());
                int i110 = f55913e + 73;
                f55914f = i110 % 128;
                int i111 = i110 % 2;
            }
            int i112 = f55914f;
            int i113 = (i112 | 13) << 1;
            int i114 = -(((~i112) & 13) | (i112 & (-14)));
            int i115 = (i113 ^ i114) + ((i114 & i113) << 1);
            f55913e = i115 % 128;
            int i116 = i115 % 2;
            return Boolean.valueOf(z10);
        }
        getNavBarBgColor getnavbarbgcolor6 = (getNavBarBgColor) objArr[0];
        Object obj = objArr[1];
        int i117 = f55913e;
        int i118 = ~i117;
        int i119 = (i117 & (-54)) | (53 & i118);
        int i120 = (i117 & 53) << 1;
        int i121 = (i119 & i120) + (i119 | i120);
        f55914f = i121 % 128;
        if (i121 % 2 == 0) {
            int i122 = 86 / 0;
            if (getnavbarbgcolor6 != obj) {
                if (!(obj instanceof getNavBarBgColor)) {
                    int i123 = i117 + 117;
                    f55914f = i123 % 128;
                    int i124 = i123 % 2;
                    int i125 = i117 & 101;
                    int i126 = ((i117 ^ 101) | i125) << 1;
                    int i127 = -((~i125) & (i117 | 101));
                    int i128 = (i126 & i127) + (i126 | i127);
                    f55914f = i128 % 128;
                    int i129 = i128 % 2;
                } else if (!Intrinsics.areEqual(getnavbarbgcolor6.setDividerPadding, ((getNavBarBgColor) obj).setDividerPadding)) {
                    int i130 = f55913e;
                    int i131 = ((i130 ^ 5) | (i130 & 5)) << 1;
                    int i132 = -(((~i130) & 5) | (i130 & (-6)));
                    int i133 = (i131 & i132) + (i132 | i131);
                    int i134 = i133 % 128;
                    f55914f = i134;
                    int i135 = i133 % 2;
                    i14 = i134 + 23;
                    f55913e = i14 % 128;
                    if (i14 % 2 != 0) {
                        int i136 = 66 / 0;
                    }
                } else {
                    int i137 = f55914f;
                    int i138 = (i137 | 57) << 1;
                    int i139 = -(i137 ^ 57);
                    int i140 = (i138 & i139) + (i139 | i138);
                    f55913e = i140 % 128;
                    int i141 = i140 % 2;
                }
                return Boolean.FALSE;
            }
            i13 = (((i117 & (-22)) | (i118 & 21)) - (~(-(-((i117 & 21) << 1))))) - 1;
            f55914f = i13 % 128;
            if (i13 % 2 == 0) {
                throw null;
            }
        } else {
            if (getnavbarbgcolor6 != obj) {
                if (!(obj instanceof getNavBarBgColor)) {
                    int i1210 = i117 + 117;
                    f55914f = i1210 % 128;
                    int i1211 = i1210 % 2;
                    int i1212 = i117 & 101;
                    int i1213 = ((i117 ^ 101) | i1212) << 1;
                    int i1214 = -((~i1212) & (i117 | 101));
                    int i1215 = (i1213 & i1214) + (i1213 | i1214);
                    f55914f = i1215 % 128;
                    int i1216 = i1215 % 2;
                } else if (!Intrinsics.areEqual(getnavbarbgcolor6.setDividerPadding, ((getNavBarBgColor) obj).setDividerPadding)) {
                    int i1310 = f55913e;
                    int i1311 = ((i1310 ^ 5) | (i1310 & 5)) << 1;
                    int i1312 = -(((~i1310) & 5) | (i1310 & (-6)));
                    int i1313 = (i1311 & i1312) + (i1312 | i1311);
                    int i1314 = i1313 % 128;
                    f55914f = i1314;
                    int i1315 = i1313 % 2;
                    i14 = i1314 + 23;
                    f55913e = i14 % 128;
                    if (i14 % 2 != 0) {
                        int i1316 = 66 / 0;
                    }
                } else {
                    int i1317 = f55914f;
                    int i1318 = (i1317 | 57) << 1;
                    int i1319 = -(i1317 ^ 57);
                    int i142 = (i1318 & i1319) + (i1319 | i1318);
                    f55913e = i142 % 128;
                    int i143 = i142 % 2;
                }
                return Boolean.FALSE;
            }
            i13 = (((i117 & (-22)) | (i118 & 21)) - (~(-(-((i117 & 21) << 1))))) - 1;
            f55914f = i13 % 128;
            if (i13 % 2 == 0) {
                throw null;
            }
        }
        return Boolean.TRUE;
    }

    public final boolean equals(@Nullable Object p4) {
        return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{this, p4}, 1691020540, -1691020538, System.identityHashCode(this))).booleanValue();
    }

    public final int hashCode() {
        return ((Integer) setCompoundDrawableTintBlendMode(new Object[]{this}, -2141125557, 2141125560, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.getInstallationId
    @JvmName(name = "setOnFocusChangeListener")
    @NotNull
    public final Terminal setOnFocusChangeListener() {
        return (Terminal) setCompoundDrawableTintBlendMode(new Object[]{this}, -1939344586, 1939344591, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.getInstallationId
    public final boolean setY() {
        return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{this}, -1394742868, 1394742872, System.identityHashCode(this))).booleanValue();
    }

    @NotNull
    public final String toString() {
        return (String) setCompoundDrawableTintBlendMode(new Object[]{this}, 821387925, -821387924, System.identityHashCode(this));
    }

    @JvmName(name = "setCompoundDrawableTintBlendMode")
    @NotNull
    public final String setCompoundDrawableTintBlendMode() {
        return (String) setCompoundDrawableTintBlendMode(new Object[]{this}, 532765770, -532765770, System.identityHashCode(this));
    }
}
