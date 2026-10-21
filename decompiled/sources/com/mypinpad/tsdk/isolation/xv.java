package com.mypinpad.tsdk.isolation;

import androidx.room.a;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.data.util.EglobalUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class xv {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f61957c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f61958d = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f61959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Map<String, String> f61960b;

    public xv(@NotNull String str, @NotNull Map<String, String> map) {
        String strD;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.f61959a = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key == null) {
                strD = null;
            } else {
                Locale locale = Locale.US;
                strD = a.d(locale, "", key, locale, "");
            }
            linkedHashMap.put(strD, value);
        }
        Map<String, String> mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "");
        this.f61960b = mapUnmodifiableMap;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0126  */
    /* JADX WARN: Code duplicated, block: B:43:0x0132  */
    /* JADX WARN: Code duplicated, block: B:45:0x0148  */
    /* JADX WARN: Code duplicated, block: B:47:0x014e  */
    /* JADX WARN: Code duplicated, block: B:48:0x015f  */
    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        xv xvVar;
        int i13;
        Map<String, String> map;
        Map<String, String> map2;
        int i14 = ~i10;
        int i15 = (((~(i10 | i11)) | (~(i12 | i14))) * 433) + (((~((~i11) | i12)) | i14) * (-433)) + ((~((~i12) | i14 | i11)) * 433) + (i11 * 434) + (i10 * (-432));
        if (i15 == 1) {
            xv xvVar2 = (xv) objArr[0];
            int i16 = f61958d;
            int i17 = i16 & 119;
            int i18 = ((((i16 ^ 119) | i17) << 1) - (~(-((i16 | 119) & (~i17))))) - 1;
            int i19 = i18 % 128;
            f61957c = i19;
            int i20 = i18 % 2;
            String str = xvVar2.f61959a;
            int i21 = i19 + 85;
            f61958d = i21 % 128;
            int i22 = i21 % 2;
            return str;
        }
        if (i15 == 2) {
            xv xvVar3 = (xv) objArr[0];
            int i23 = f61958d;
            int i24 = i23 & 105;
            int i25 = (i23 | 105) & (~i24);
            int i26 = i24 << 1;
            int i27 = (i25 ^ i26) + ((i25 & i26) << 1);
            f61957c = i27 % 128;
            int i28 = i27 % 2;
            int iHashCode = xvVar3.f61959a.hashCode();
            int iIdentityHashCode = System.identityHashCode(xvVar3);
            int i29 = (iHashCode * (-574)) - 516026;
            int i30 = ~iHashCode;
            int i31 = ~iIdentityHashCode;
            int i32 = (i31 | iIdentityHashCode) & i31;
            int i33 = (i30 ^ i32) | (i30 & i32);
            int i34 = ~i33;
            int i35 = (i33 | i34) & i34;
            int i36 = ~((-900) | iIdentityHashCode);
            int i37 = ((i35 & i36) | (i35 ^ i36)) * 1150;
            int i38 = ((((~i37) & i29) | ((~i29) & i37)) - (~((i29 & i37) << 1))) - 1;
            int i39 = ((-900) ^ iIdentityHashCode) | ((-900) & iIdentityHashCode);
            int i40 = ~i39;
            int i41 = (i39 | i40) & i40;
            int i42 = i32 & EglobalUtils.DOUBLE_AUTH_ERROR_CODE;
            int i43 = ~(((i32 | EglobalUtils.DOUBLE_AUTH_ERROR_CODE) & (~i42)) | i42);
            int i44 = i41 & i43;
            int i45 = (i41 | i43) & (~i44);
            int i46 = (((i45 & i44) | (i45 ^ i44)) * (-575)) + i38;
            int i47 = i30 ^ iIdentityHashCode;
            int i48 = iIdentityHashCode & i30;
            int i49 = (i48 & i47) | (i47 ^ i48);
            int i50 = ~i49;
            int i51 = (i49 | i50) & i50;
            int i52 = (i30 & i31) | ((~i31) & iHashCode);
            int i53 = iHashCode & i31;
            int i54 = ~((i53 & i52) | (i52 ^ i53));
            int i55 = i51 & i54;
            int i56 = (((i54 | i51) & (~i55)) | i55) * 575;
            int i57 = ((((~i56) & i46) | ((~i46) & i56)) - (~((i56 & i46) << 1))) - 1;
            int i58 = i57 * 31;
            int iHashCode2 = xvVar3.f61960b.hashCode();
            int iIdentityHashCode2 = System.identityHashCode(xvVar3);
            int i59 = iHashCode2 * (-947);
            int i60 = -(-(i57 * 29419));
            int i61 = i59 ^ i60;
            int i62 = ((i60 & i59) | i61) << 1;
            int i63 = -i61;
            int i64 = (i62 & i63) + (i62 | i63);
            int i65 = ~iHashCode2;
            int i66 = ~i58;
            int i67 = (i58 | i66) & i66;
            int i68 = i67 & iIdentityHashCode2;
            int i69 = (i67 | iIdentityHashCode2) & (~i68);
            int i70 = (i69 & i68) | (i69 ^ i68);
            int i71 = ~i70;
            int i72 = -(-((((i70 | i71) & i71) | i65) * (-948)));
            int i73 = i64 | i72;
            int i74 = ((i73 << 1) - (~(-((~(i72 & i64)) & i73)))) - 1;
            int i75 = i65 & i66;
            int i76 = ((i65 | i66) & (~i75)) | i75;
            int i77 = ~iIdentityHashCode2;
            int i78 = i76 & i77;
            int i79 = (i77 | i76) & (~i78);
            int i80 = -(~(-(-((~((i79 & i78) | (i79 ^ i78))) * (-948)))));
            int i81 = ((i74 & i80) + (i80 | i74)) - 1;
            int i82 = (((~i66) & iHashCode2) | i75 | (iHashCode2 & i66)) * 948;
            int i83 = ((~i82) & i81) | ((~i81) & i82);
            int i84 = -(-((i82 & i81) << 1));
            int i85 = ((i83 | i84) << 1) - (i84 ^ i83);
            int i86 = f61958d;
            int i87 = i86 & 67;
            int i88 = (i86 ^ 67) | i87;
            int i89 = ((i87 | i88) << 1) - (i88 ^ i87);
            f61957c = i89 % 128;
            if (i89 % 2 == 0) {
                return Integer.valueOf(i85);
            }
            throw null;
        }
        if (i15 == 3) {
            xv xvVar4 = (xv) objArr[0];
            Object obj = objArr[1];
            int i90 = f61957c;
            int i91 = (i90 & (-106)) | ((~i90) & 105);
            int i92 = -(-((i90 & 105) << 1));
            int i93 = ((i91 | i92) << 1) - (i92 ^ i91);
            f61958d = i93 % 128;
            if (i93 % 2 == 0) {
                int i94 = 76 / 0;
                if (!(!(obj instanceof xv))) {
                    xvVar = (xv) obj;
                    if (Intrinsics.areEqual(xvVar.f61959a, xvVar4.f61959a)) {
                        int i95 = f61958d;
                        int i96 = i95 & 29;
                        int i97 = (i95 ^ 29) | i96;
                        int i98 = (i96 & i97) + (i97 | i96);
                        f61957c = i98 % 128;
                        i13 = i98 % 2;
                        map = xvVar.f61960b;
                        map2 = xvVar4.f61960b;
                        if (i13 == 0) {
                            Intrinsics.areEqual(map, map2);
                            throw null;
                        }
                        if (Intrinsics.areEqual(map, map2)) {
                            int i99 = f61957c;
                            int i100 = i99 & 125;
                            int i101 = i100 + ((i99 ^ 125) | i100);
                            f61958d = i101 % 128;
                            int i102 = i101 % 2;
                            return Boolean.TRUE;
                        }
                    }
                }
            } else if (!(!(obj instanceof xv))) {
                xvVar = (xv) obj;
                if (Intrinsics.areEqual(xvVar.f61959a, xvVar4.f61959a)) {
                    int i910 = f61958d;
                    int i911 = i910 & 29;
                    int i912 = (i910 ^ 29) | i911;
                    int i913 = (i911 & i912) + (i912 | i911);
                    f61957c = i913 % 128;
                    i13 = i913 % 2;
                    map = xvVar.f61960b;
                    map2 = xvVar4.f61960b;
                    if (i13 == 0) {
                        Intrinsics.areEqual(map, map2);
                        throw null;
                    }
                    if (Intrinsics.areEqual(map, map2)) {
                        int i914 = f61957c;
                        int i103 = i914 & 125;
                        int i104 = i103 + ((i914 ^ 125) | i103);
                        f61958d = i104 % 128;
                        int i105 = i104 % 2;
                        return Boolean.TRUE;
                    }
                }
            }
            int i106 = f61958d;
            int i107 = (i106 ^ 91) + ((i106 & 91) << 1);
            f61957c = i107 % 128;
            int i108 = i107 % 2;
            return Boolean.FALSE;
        }
        if (i15 == 4) {
            xv xvVar5 = (xv) objArr[0];
            int i109 = f61958d;
            int i110 = (i109 ^ 83) + ((i109 & 83) << 1);
            f61957c = i110 % 128;
            int i111 = i110 % 2;
            String str2 = xvVar5.f61960b.get("realm");
            if (i111 != 0) {
                throw null;
            }
            int i112 = f61957c;
            int i113 = ((i112 ^ 125) | (i112 & 125)) << 1;
            int i114 = -(((~i112) & 125) | (i112 & (-126)));
            int i115 = ((i113 | i114) << 1) - (i114 ^ i113);
            f61958d = i115 % 128;
            if (i115 % 2 != 0) {
                return str2;
            }
            int i116 = 77 / 0;
            return str2;
        }
        if (i15 == 5) {
            xv xvVar6 = (xv) objArr[0];
            StringBuilder sb2 = new StringBuilder();
            sb2.append(xvVar6.f61959a);
            sb2.append(" authParams=");
            sb2.append(xvVar6.f61960b);
            String string = sb2.toString();
            int i117 = f61958d;
            int i118 = i117 & 57;
            int i119 = ((i117 | 57) & (~i118)) + (i118 << 1);
            f61957c = i119 % 128;
            int i120 = i119 % 2;
            return string;
        }
        xv xvVar7 = (xv) objArr[0];
        int i121 = f61958d;
        int i122 = (((i121 | 68) << 1) - (i121 ^ 68)) - 1;
        f61957c = i122 % 128;
        if (i122 % 2 != 0) {
            xvVar7.f61960b.get("charset");
            throw null;
        }
        String str3 = xvVar7.f61960b.get("charset");
        if (str3 != null) {
            System.identityHashCode(xvVar7);
            System.identityHashCode(xvVar7);
            try {
                Charset charsetForName = Charset.forName(str3);
                Intrinsics.checkNotNullExpressionValue(charsetForName, "");
                int i123 = f61957c + 97;
                f61958d = i123 % 128;
                if (i123 % 2 != 0) {
                    return charsetForName;
                }
                int i124 = 75 / 0;
                return charsetForName;
            } catch (Exception unused) {
            }
        }
        Charset charset = StandardCharsets.ISO_8859_1;
        Intrinsics.checkNotNullExpressionValue(charset, "");
        int i125 = f61957c;
        int i126 = (i125 ^ 3) + ((i125 & 3) << 1);
        f61958d = i126 % 128;
        if (i126 % 2 != 0) {
            return charset;
        }
        throw null;
    }

    public final boolean equals(@Nullable Object obj) {
        return ((Boolean) setDividerPadding(new Object[]{this, obj}, 1757134809, -1757134806, System.identityHashCode(this))).booleanValue();
    }

    public final int hashCode() {
        return ((Integer) setDividerPadding(new Object[]{this}, -1148994371, 1148994373, System.identityHashCode(this))).intValue();
    }

    @JvmName(name = "charset")
    @NotNull
    public final Charset setCompoundDrawableTintBlendMode() {
        return (Charset) setDividerPadding(new Object[]{this}, 1989727062, -1989727062, System.identityHashCode(this));
    }

    @JvmName(name = "realm")
    @Nullable
    public final String setOnFocusChangeListener() {
        return (String) setDividerPadding(new Object[]{this}, 1186564851, -1186564847, System.identityHashCode(this));
    }

    @JvmName(name = "scheme")
    @NotNull
    public final String setY() {
        return (String) setDividerPadding(new Object[]{this}, 1571571604, -1571571603, System.identityHashCode(this));
    }

    @NotNull
    public final String toString() {
        return (String) setDividerPadding(new Object[]{this}, 1423568062, -1423568057, System.identityHashCode(this));
    }
}
