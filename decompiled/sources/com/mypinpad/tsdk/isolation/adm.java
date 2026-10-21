package com.mypinpad.tsdk.isolation;

import androidx.camera.core.impl.utils.c;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bbva.ethermobilesdk.deviceinfo.component.Time;
import com.bbva.glomohybrid.base.deeplink.extensions.DeepLinkExtensionsKt;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes10.dex */
public class adm extends ady {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static int f52480u0 = 0;
    public static int v0 = 1;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final byte[] f52481t0;

    static {
        Integer num = 24;
        num.intValue();
        int i10 = v0;
        int i11 = i10 ^ 45;
        int i12 = -(-((i10 & 45) << 1));
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        f52480u0 = i13 % 128;
        if (i13 % 2 != 0) {
            int i14 = 32 / 0;
        }
    }

    public adm(byte[] bArr) {
        if (bArr.length < 4) {
            throw new IllegalArgumentException("GeneralizedTime string too short");
        }
        this.f52481t0 = bArr;
        if (!((Boolean) setDividerPadding(new Object[]{this, 0}, 2052402908, -2052402899, 0)).booleanValue() || !((Boolean) setDividerPadding(new Object[]{this, 1}, 2052402908, -2052402899, 1)).booleanValue() || !((Boolean) setDividerPadding(new Object[]{this, 2}, 2052402908, -2052402899, 2)).booleanValue() || !((Boolean) setDividerPadding(new Object[]{this, 3}, 2052402908, -2052402899, 3)).booleanValue()) {
            throw new IllegalArgumentException("illegal characters in GeneralizedTime string");
        }
    }

    public static /* synthetic */ Boolean f(Object[] objArr) {
        adm admVar = (adm) objArr[0];
        int i10 = f52480u0;
        int i11 = (i10 & (-118)) | ((~i10) & 117);
        int i12 = -(-((i10 & 117) << 1));
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        int i14 = i13 % 128;
        v0 = i14;
        int i15 = i13 % 2 == 0 ? 1 : 0;
        int i16 = (i14 ^ 19) + ((i14 & 19) << 1);
        f52480u0 = i16 % 128;
        int i17 = i16 % 2;
        while (true) {
            byte[] bArr = admVar.f52481t0;
            if (i15 == bArr.length) {
                int i18 = (-2) - ((f52480u0 + 78) ^ (-1));
                v0 = i18 % 128;
                if (i18 % 2 != 0) {
                    return Boolean.FALSE;
                }
                throw null;
            }
            int i19 = v0;
            int i20 = ((i19 | 70) << 1) - (i19 ^ 70);
            int i21 = (i20 ^ (-1)) + (i20 << 1);
            int i22 = i21 % 128;
            f52480u0 = i22;
            int i23 = i21 % 2;
            if (bArr[i15] == 46) {
                int i24 = i22 & 43;
                int i25 = ((i22 ^ 43) | i24) << 1;
                int i26 = -((~i24) & (i22 | 43));
                int i27 = ((i25 | i26) << 1) - (i25 ^ i26);
                v0 = i27 % 128;
                if (i27 % 2 == 0) {
                    if (i15 == 117) {
                        int i28 = i22 & 81;
                        int i29 = ((~i28) & (i22 | 81)) + (i28 << 1);
                        v0 = i29 % 128;
                        int i30 = i29 % 2;
                        return Boolean.TRUE;
                    }
                } else if (i15 == 14) {
                    int i210 = i22 & 81;
                    int i211 = ((~i210) & (i22 | 81)) + (i210 << 1);
                    v0 = i211 % 128;
                    int i31 = i211 % 2;
                    return Boolean.TRUE;
                }
            }
            i15++;
            int i32 = i22 + 9;
            v0 = i32 % 128;
            int i33 = i32 % 2;
        }
    }

    public static /* synthetic */ Boolean g(Object[] objArr) {
        adm admVar = (adm) objArr[0];
        ady adyVar = (ady) objArr[1];
        int i10 = v0 + 61;
        int i11 = i10 % 128;
        f52480u0 = i11;
        if (i10 % 2 != 0) {
            boolean z10 = adyVar instanceof adm;
            throw null;
        }
        if (!(adyVar instanceof adm)) {
            int i12 = i11 & 105;
            int i13 = -(-(i11 | 105));
            int i14 = ((i12 | i13) << 1) - (i12 ^ i13);
            v0 = i14 % 128;
            int i15 = i14 % 2;
            return Boolean.FALSE;
        }
        boolean zBooleanValue = ((Boolean) bek.setOnFocusChangeListener(new Object[]{admVar.f52481t0, ((adm) adyVar).f52481t0}, -576846525, 576846546, (int) System.currentTimeMillis())).booleanValue();
        int i16 = f52480u0;
        int i17 = (i16 ^ 41) + ((i16 & 41) << 1);
        v0 = i17 % 128;
        if (i17 % 2 != 0) {
            return Boolean.valueOf(zBooleanValue);
        }
        throw null;
    }

    public static /* synthetic */ SimpleDateFormat h(Object[] objArr) {
        SimpleDateFormat simpleDateFormat;
        int i10;
        adm admVar = (adm) objArr[0];
        int i11 = f52480u0;
        int i12 = (((i11 & (-48)) | ((~i11) & 47)) - (~((i11 & 47) << 1))) - 1;
        v0 = i12 % 128;
        int i13 = i12 % 2;
        if (((Boolean) setDividerPadding(new Object[]{admVar}, 524985054, -524985043, System.identityHashCode(admVar))).booleanValue()) {
            simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss.SSSz");
            int i14 = v0;
            int i15 = i14 & 107;
            int i16 = (((i14 | 107) & (~i15)) - (~(-(-(i15 << 1))))) - 1;
            f52480u0 = i16 % 128;
            int i17 = i16 % 2;
        } else {
            if (((Boolean) setDividerPadding(new Object[]{admVar}, 245719524, -245719518, System.identityHashCode(admVar))).booleanValue()) {
                simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmssz");
                int i18 = f52480u0;
                int i19 = i18 & 7;
                i10 = (((i18 ^ 7) | i19) << 1) - ((i18 | 7) & (~i19));
            } else {
                if (((Boolean) setDividerPadding(new Object[]{admVar}, -985108382, 985108390, System.identityHashCode(admVar))).booleanValue()) {
                    simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmz");
                    int i20 = v0;
                    int i21 = i20 & 125;
                    i10 = (((i20 ^ 125) | i21) << 1) - ((i20 | 125) & (~i21));
                    f52480u0 = i10 % 128;
                } else {
                    simpleDateFormat = new SimpleDateFormat("yyyyMMddHHz");
                    int i22 = f52480u0;
                    i10 = (i22 ^ 51) + ((i22 & 51) << 1);
                }
                int i23 = i10 % 2;
            }
            v0 = i10 % 128;
            int i24 = i10 % 2;
        }
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        int i25 = f52480u0;
        int i26 = i25 & 109;
        int i27 = ((i25 | 109) & (~i26)) + (i26 << 1);
        v0 = i27 % 128;
        if (i27 % 2 != 0) {
            return simpleDateFormat;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x014b A[PHI: r8
      0x014b: PHI (r8v47 int) = (r8v13 int), (r8v49 int) binds: [B:29:0x0149, B:20:0x0125] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:31:0x014d A[PHI: r8
      0x014d: PHI (r8v14 int) = (r8v13 int), (r8v49 int) binds: [B:29:0x0149, B:20:0x0125] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:33:0x016c  */
    /* JADX WARN: Code duplicated, block: B:59:0x02b6  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v14, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v2, types: [int] */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r12v1, types: [int] */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r8v22, types: [java.lang.Object, java.lang.StringBuilder] */
    public static /* synthetic */ String i(Object[] objArr) {
        String str;
        int i10;
        ?? r12;
        ?? r10;
        String str2;
        ?? r11;
        String str3;
        ?? r13;
        int i11;
        int i12;
        int i13;
        int i14;
        adm admVar = (adm) objArr[0];
        String str4 = (String) objArr[1];
        int i15 = f52480u0;
        int i16 = i15 & 103;
        int i17 = (i15 ^ 103) | i16;
        int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
        v0 = i18 % 128;
        if (i18 % 2 == 0) {
            TimeZone.getDefault().getRawOffset();
            throw null;
        }
        TimeZone timeZone = TimeZone.getDefault();
        int rawOffset = timeZone.getRawOffset();
        if (rawOffset < 0) {
            int i19 = f52480u0;
            int i20 = i19 & 93;
            int i21 = (i19 ^ 93) | i20;
            int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
            v0 = i22 % 128;
            if (i22 % 2 == 0) {
                throw null;
            }
            rawOffset = -rawOffset;
            str = Constant.DASH_STRING;
        } else {
            str = "+";
        }
        int i23 = rawOffset / 3600000;
        int i24 = -(3600000 * i23);
        int iIdentityHashCode = System.identityHashCode(admVar);
        int i25 = i24 * (-337);
        int i26 = rawOffset * 339;
        int i27 = i25 & i26;
        int i28 = ((~i27) & (i25 | i26)) + (i27 << 1);
        int i29 = ~i24;
        int i30 = (i29 | i24) & i29;
        int i31 = ~iIdentityHashCode;
        int i32 = i30 & i31;
        int i33 = ~((i30 ^ i31) | i32);
        int i34 = ~rawOffset;
        int i35 = i34 & i24;
        int i36 = ~((i34 ^ i24) | i35);
        int i37 = (i33 ^ i36) | (i36 & i33);
        int i38 = ~((i24 ^ iIdentityHashCode) | (i24 & iIdentityHashCode));
        ?? r14 = i37 & i38;
        String str5 = str;
        ?? r15 = ~r14;
        int i39 = -(~((((i37 | i38) & r15) | r14) * (-338)));
        int i40 = (i28 ^ i39) + ((i39 & i28) << 1);
        int i41 = (i40 ^ (-1)) + (i40 << 1);
        int i42 = i29 & rawOffset;
        int i43 = -(-((~((i29 & i34) | ((~i29) & rawOffset) | i42)) * 338));
        int i44 = ((i41 | i43) << 1) - (i41 ^ i43);
        int i45 = ((~i31) & i30) | ((~i30) & i31);
        int i46 = ~((i45 & i32) | (i45 ^ i32));
        int i47 = i35 | i42 | (i24 & rawOffset);
        int i48 = i47 ^ iIdentityHashCode;
        int i49 = i47 & iIdentityHashCode;
        int i50 = ~((i49 & i48) | (i48 ^ i49));
        int i51 = i46 & i50;
        int i52 = (i46 | i50) & (~i51);
        int i53 = ((i52 & i51) | (i52 ^ i51)) * 338;
        int i54 = i44 & i53;
        int i55 = ((i44 ^ i53) | i54) << 1;
        int i56 = -((i53 | i44) & (~i54));
        int i57 = ((i55 ^ i56) + ((i56 & i55) << 1)) / 60000;
        try {
            if (timeZone.useDaylightTime()) {
                int i58 = f52480u0;
                int i59 = i58 & 45;
                int i60 = (i58 | 45) & (~i59);
                int i61 = i59 << 1;
                int i62 = (i60 & i61) + (i60 | i61);
                v0 = i62 % 128;
                try {
                    if (i62 % 2 == 0) {
                        int i63 = 0 / 0;
                        i11 = 1;
                        if (!(!((Boolean) setDividerPadding(new Object[]{admVar}, 524985054, -524985043, System.identityHashCode(admVar))).booleanValue())) {
                            int i64 = v0;
                            int i65 = i64 & 111;
                            int i66 = ((i64 ^ 111) | i65) << i11;
                            int i67 = -((i64 | 111) & (~i65));
                            i12 = (i66 & i67) + (i67 | i66);
                            f52480u0 = i12 % 128;
                            if (i12 % 2 == 0) {
                                throw null;
                            }
                            str4 = (String) setDividerPadding(new Object[]{str4}, 579090450, -579090443, (int) System.currentTimeMillis());
                            i13 = 1;
                        } else {
                            i13 = i11;
                        }
                    } else {
                        i11 = 1;
                        if (!((Boolean) setDividerPadding(new Object[]{admVar}, 524985054, -524985043, System.identityHashCode(admVar))).booleanValue()) {
                            i13 = i11;
                        } else {
                            int i68 = v0;
                            int i69 = i68 & 111;
                            int i610 = ((i68 ^ 111) | i69) << i11;
                            int i611 = -((i68 | 111) & (~i69));
                            i12 = (i610 & i611) + (i611 | i610);
                            f52480u0 = i12 % 128;
                            if (i12 % 2 == 0) {
                                throw null;
                            }
                            str4 = (String) setDividerPadding(new Object[]{str4}, 579090450, -579090443, (int) System.currentTimeMillis());
                            i13 = 1;
                        }
                    }
                    Object[] objArr2 = new Object[i13];
                    objArr2[0] = admVar;
                    SimpleDateFormat simpleDateFormat = (SimpleDateFormat) setDividerPadding(objArr2, -965205668, 965205670, System.identityHashCode(admVar));
                    ?? sb2 = new StringBuilder();
                    sb2.append(str4);
                    sb2.append(Time.GMT);
                    r15 = str5;
                    try {
                        sb2.append(r15);
                        i24 = i23;
                        try {
                            sb2.append((String) setDividerPadding(new Object[]{Integer.valueOf(i23)}, 507205895, -507205892, i24));
                            String str6 = DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER;
                            sb2.append(str6);
                            sb2.append((String) setDividerPadding(new Object[]{Integer.valueOf(i57)}, 507205895, -507205892, i57));
                            r11 = r15;
                            str2 = str6;
                            if (timeZone.inDaylightTime(simpleDateFormat.parse(sb2.toString()))) {
                                int i70 = v0;
                                int i71 = (((i70 | 98) << 1) - (i70 ^ 98)) - 1;
                                f52480u0 = i71 % 128;
                                if (i71 % 2 != 0) {
                                    r15.equals("+");
                                    throw null;
                                }
                                if (r15.equals("+")) {
                                    int i72 = v0;
                                    int i73 = ((i72 | 125) << 1) - (i72 ^ 125);
                                    f52480u0 = i73 % 128;
                                    int i74 = i73 % 2;
                                    i14 = 1;
                                } else {
                                    int i75 = f52480u0;
                                    int i76 = (i75 ^ 111) + ((i75 & 111) << 1);
                                    v0 = i76 % 128;
                                    int i77 = i76 % 2;
                                    i14 = -1;
                                }
                                int iIdentityHashCode2 = System.identityHashCode(admVar);
                                int i78 = i14 * 934;
                                int i79 = i24 * (-932);
                                int i80 = i78 & i79;
                                int i81 = (i78 | i79) & (~i80);
                                int i82 = -(-(i80 << 1));
                                int i83 = ((i81 | i82) << 1) - (i81 ^ i82);
                                int i84 = ~i24;
                                int i85 = i84 & (i84 | i24);
                                int i86 = ~i14;
                                int i87 = ~iIdentityHashCode2;
                                int i88 = i86 & i87;
                                int i89 = (i86 | i87) & (~i88);
                                int i90 = ~((i89 & i88) | (i89 ^ i88));
                                int i91 = i85 ^ i90;
                                int i92 = i90 & i85;
                                int i93 = (-2) - ((-1) ^ ((i83 - (~(-(~(-(-(((i92 & i91) | (i91 ^ i92)) * (-933)))))))) - 1));
                                int i94 = i85 ^ i87;
                                int i95 = i87 & i85;
                                int i96 = ~((i95 & i94) | (i94 ^ i95));
                                int i97 = i85 ^ i14;
                                int i98 = i85 & i14;
                                int i99 = ~((i98 & i97) | (i97 ^ i98));
                                int i100 = i96 & i99;
                                int i101 = (i96 | i99) & (~i100);
                                int i102 = -(-(((i101 & i100) | (i101 ^ i100)) * 933));
                                int i103 = i93 ^ i102;
                                int i104 = -(-((i102 & i93) << 1));
                                int i105 = (i103 & i104) + (i104 | i103);
                                int i106 = i14 & i24;
                                int i107 = (i14 | i24) & (~i106);
                                int i108 = (~((i106 & i107) | (i107 ^ i106))) * 933;
                                int i109 = i105 & i108;
                                int i110 = (i108 | i105) & (~i109);
                                int i111 = -(-(i109 << 1));
                                i10 = (i110 | i111) + (i110 & i111);
                                int i112 = v0;
                                int i113 = (i112 ^ 6) + ((i112 & 6) << 1);
                                int i114 = (i113 ^ (-1)) + (i113 << 1);
                                f52480u0 = i114 % 128;
                                int i115 = i114 % 2;
                                r13 = r15;
                                str3 = str6;
                            }
                            int i116 = v0;
                            int i117 = (i116 & 85) + (i116 | 85);
                            f52480u0 = i117 % 128;
                            int i118 = i117 % 2;
                            r10 = r13;
                            r12 = str3;
                        } catch (ParseException unused) {
                            r14 = DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER;
                            i10 = i24;
                            r10 = r15;
                            r12 = r14;
                        }
                    } catch (ParseException unused2) {
                        i24 = i23;
                    }
                } catch (ParseException unused3) {
                }
                ?? sb3 = new StringBuilder(Time.GMT);
                sb3.append(r10);
                sb3.append((String) setDividerPadding(new Object[]{Integer.valueOf(i10)}, 507205895, -507205892, i10));
                sb3.append(r12);
                sb3.append((String) setDividerPadding(new Object[]{Integer.valueOf(i57)}, 507205895, -507205892, i57));
                String string = sb3.toString();
                int i119 = f52480u0;
                int i120 = ((i119 | 89) << 1) - (i119 ^ 89);
                v0 = i120 % 128;
                int i121 = i120 % 2;
                return string;
            }
            i24 = i23;
            str2 = DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER;
            r11 = str5;
            i10 = i24;
            r13 = r11;
            str3 = str2;
            int i1110 = v0;
            int i1111 = (i1110 & 85) + (i1110 | 85);
            f52480u0 = i1111 % 128;
            int i1112 = i1111 % 2;
            r10 = r13;
            r12 = str3;
        } catch (ParseException unused4) {
            i24 = i23;
            r14 = DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER;
            r15 = str5;
        }
        ?? sb4 = new StringBuilder(Time.GMT);
        sb4.append(r10);
        sb4.append((String) setDividerPadding(new Object[]{Integer.valueOf(i10)}, 507205895, -507205892, i10));
        sb4.append(r12);
        sb4.append((String) setDividerPadding(new Object[]{Integer.valueOf(i57)}, 507205895, -507205892, i57));
        String string2 = sb4.toString();
        int i1113 = f52480u0;
        int i122 = ((i1113 | 89) << 1) - (i1113 ^ 89);
        v0 = i122 % 128;
        int i123 = i122 % 2;
        return string2;
    }

    public static /* synthetic */ String j(Object[] objArr) {
        int iIntValue = ((Number) objArr[0]).intValue();
        int i10 = v0;
        int i11 = i10 & 67;
        int i12 = ((i10 ^ 67) | i11) << 1;
        int i13 = -((i10 | 67) & (~i11));
        int i14 = (i12 & i13) + (i13 | i12);
        int i15 = i14 % 128;
        f52480u0 = i15;
        int i16 = i14 % 2;
        if (iIntValue < 10) {
            int i17 = (i15 ^ 11) + ((i15 & 11) << 1);
            v0 = i17 % 128;
            int i18 = i17 % 2;
            String strValueOf = String.valueOf(iIntValue);
            if (i18 != 0) {
                return "0".concat(strValueOf);
            }
            "0".concat(strValueOf);
            throw null;
        }
        String string = Integer.toString(iIntValue);
        int i19 = v0;
        int i20 = i19 ^ 13;
        int i21 = (i19 & 13) << 1;
        int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
        f52480u0 = i22 % 128;
        if (i22 % 2 == 0) {
            return string;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0177  */
    /* JADX WARN: Code duplicated, block: B:16:0x01c3  */
    public static /* synthetic */ String k(Object[] objArr) {
        int iIndexOf;
        int i10;
        int i11;
        int i12;
        adm admVar = (adm) objArr[0];
        int i13 = v0;
        int i14 = ((i13 | 35) << 1) - (i13 ^ 35);
        f52480u0 = i14 % 128;
        int i15 = i14 % 2;
        String str = (String) bez.setX(new Object[]{admVar.f52481t0}, -1321203111, 1321203112, (int) System.currentTimeMillis());
        int length = str.length();
        int iIdentityHashCode = System.identityHashCode(admVar);
        int i16 = -(-(length * 713));
        int i17 = ((~i16) & 711) | (i16 & (-712));
        int i18 = -(-((i16 & 711) << 1));
        int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
        int i20 = ~length;
        int i21 = ~i20;
        int i22 = ~((i21 ^ i20) | (i21 & i20));
        int i23 = ~iIdentityHashCode;
        int i24 = ~((i23 ^ (-1)) | i23);
        int i25 = i22 ^ i24;
        int i26 = i22 & i24;
        int i27 = (-2) - (((i19 - (~(-(~(((i26 & i25) | (i25 ^ i26)) * (-712)))))) - 1) ^ (-1));
        int i28 = (i21 & i23) | ((~i23) & i20) | (i20 & i23);
        int i29 = i28 | (i28 ^ (-1));
        int i30 = ~i29;
        int i31 = (i29 | i30) & i30;
        int i32 = (i20 ^ length) | (i20 & length);
        int i33 = i32 & iIdentityHashCode;
        int i34 = (i32 | iIdentityHashCode) & (~i33);
        int i35 = ~((i34 & i33) | (i34 ^ i33));
        int i36 = i31 & i35;
        int i37 = (i31 | i35) & (~i36);
        int i38 = ((i37 & i36) | (i37 ^ i36)) * (-712);
        int i39 = ((~i38) & i27) | ((~i27) & i38);
        int i40 = (i38 & i27) << 1;
        int i41 = (i39 ^ i40) + ((i40 & i39) << 1);
        int i42 = (length | i20) & i20;
        int i43 = (iIdentityHashCode | i23) & i23;
        int i44 = i43 ^ (-1);
        int i45 = ~((i43 & i44) | (i44 ^ i43));
        int i46 = -(-(((i42 & i45) | (i42 ^ i45)) * 712));
        int i47 = i41 & i46;
        int i48 = ((i41 ^ i46) | i47) << 1;
        int i49 = -((i46 | i41) & (~i47));
        if (str.charAt((i48 ^ i49) + ((i49 & i48) << 1)) == 'Z') {
            StringBuilder sb2 = new StringBuilder();
            int length2 = str.length();
            int iIdentityHashCode2 = System.identityHashCode(admVar);
            int i50 = length2 * 713;
            int i51 = 711 & i50;
            int i52 = (i50 | 711) & (~i51);
            int i53 = i51 << 1;
            int i54 = ((i52 | i53) << 1) - (i52 ^ i53);
            int i55 = ~length2;
            int i56 = ~i55;
            int i57 = ~(i56 | i55);
            int i58 = ~iIdentityHashCode2;
            int i59 = ~i58;
            int i60 = ~((i59 & i58) | (i59 ^ i58));
            int i61 = i57 ^ i60;
            int i62 = i57 & i60;
            int i63 = (i54 - (~(((i62 & i61) | (i61 ^ i62)) * (-712)))) - 1;
            int i64 = (i55 | length2) & i55;
            int i65 = (i58 | iIdentityHashCode2) & i58;
            int i66 = i64 & i65;
            int i67 = (i64 | i65) & (~i66);
            int i68 = (i67 & i66) | (i67 ^ i66);
            int i69 = ~(i68 | (i68 ^ (-1)));
            int i70 = (length2 & i55) | (i55 ^ length2);
            int i71 = ~((iIdentityHashCode2 & i70) | (i58 & i70) | ((~i70) & iIdentityHashCode2));
            int i72 = (((i71 & i69) | ((~i71) & i69) | ((~i69) & i71)) * (-712)) + i63;
            int i73 = i65 ^ (-1);
            int i74 = ~((i73 & i65) | (i73 ^ i65));
            int i75 = ((~i74) & i55) | (i56 & i74);
            int i76 = i74 & i55;
            int i77 = -(-(((i76 & i75) | (i75 ^ i76)) * 712));
            sb2.append(str.substring(0, (i72 & i77) + (i72 | i77)));
            sb2.append("GMT+00:00");
            String string = sb2.toString();
            int i78 = v0 + 123;
            f52480u0 = i78 % 128;
            int i79 = i78 % 2;
            return string;
        }
        int length3 = str.length();
        int i80 = (length3 & (-6)) + (length3 | (-6));
        char cCharAt = str.charAt(i80);
        if (cCharAt != '-') {
            int i81 = f52480u0 + 69;
            v0 = i81 % 128;
            if (i81 % 2 != 0 ? cCharAt == '+' : cCharAt == 24) {
                iIndexOf = str.indexOf(Time.GMT);
                System.identityHashCode(admVar);
                int i82 = -(~(i80 * 825));
                int i83 = (((-4947) ^ i82) + ((i82 & (-4947)) << 1)) - 1;
                int i84 = ~i80;
                int i85 = (i84 | i80) & i84;
                int i86 = (-3) & i85;
                int i87 = (i85 | (-3)) & (~i86);
                int i88 = (i83 - (~(-(-(((i87 & i86) | (i87 ^ i86)) * (-824)))))) - 1;
                int i89 = (-3) & i80;
                int i90 = (i80 | (-3)) & (~i89);
                int i91 = -(~(-(-(((i90 & i89) | (i90 ^ i89)) * (-1648)))));
                i10 = ((i88 & i91) + (i91 | i88)) - 1;
                i11 = ((2 ^ i84) | (i84 & 2)) * 824;
                i12 = i10 & i11;
                if (iIndexOf == (i12 - (~(-(-((i11 ^ i10) | i12))))) - 1) {
                    int i92 = f52480u0;
                    int i93 = i92 & 41;
                    int i94 = i93 + ((i92 ^ 41) | i93);
                    v0 = i94 % 128;
                    int i95 = i94 % 2;
                    int i96 = i92 & 83;
                    int i97 = (i92 ^ 83) | i96;
                    int i98 = (i96 & i97) + (i97 | i96);
                    v0 = i98 % 128;
                    int i99 = i98 % 2;
                    return str;
                }
            }
        } else {
            iIndexOf = str.indexOf(Time.GMT);
            System.identityHashCode(admVar);
            int i810 = -(~(i80 * 825));
            int i811 = (((-4947) ^ i810) + ((i810 & (-4947)) << 1)) - 1;
            int i812 = ~i80;
            int i813 = (i812 | i80) & i812;
            int i814 = (-3) & i813;
            int i815 = (i813 | (-3)) & (~i814);
            int i816 = (i811 - (~(-(-(((i815 & i814) | (i815 ^ i814)) * (-824)))))) - 1;
            int i817 = (-3) & i80;
            int i910 = (i80 | (-3)) & (~i817);
            int i911 = -(~(-(-(((i910 & i817) | (i910 ^ i817)) * (-1648)))));
            i10 = ((i816 & i911) + (i911 | i816)) - 1;
            i11 = ((2 ^ i812) | (i812 & 2)) * 824;
            i12 = i10 & i11;
            if (iIndexOf == (i12 - (~(-(-((i11 ^ i10) | i12))))) - 1) {
                int i912 = f52480u0;
                int i913 = i912 & 41;
                int i914 = i913 + ((i912 ^ 41) | i913);
                v0 = i914 % 128;
                int i915 = i914 % 2;
                int i916 = i912 & 83;
                int i917 = (i912 ^ 83) | i916;
                int i918 = (i916 & i917) + (i917 | i916);
                v0 = i918 % 128;
                int i919 = i918 % 2;
                return str;
            }
        }
        int length4 = str.length();
        int i100 = (length4 ^ (-5)) + ((length4 & (-5)) << 1);
        char cCharAt2 = str.charAt(i100);
        if (cCharAt2 != '-') {
            int i101 = f52480u0;
            int i102 = (i101 ^ 121) + ((i101 & 121) << 1);
            v0 = i102 % 128;
            int i103 = i102 % 2;
            if (cCharAt2 != '+') {
                int length5 = str.length();
                int iIdentityHashCode3 = System.identityHashCode(admVar);
                int i104 = length5 * (-317);
                int i105 = (((-957) | i104) << 1) - (i104 ^ (-957));
                int i106 = ~length5;
                int i107 = ~iIdentityHashCode3;
                int i108 = 2 & i107;
                int i109 = (iIdentityHashCode3 & (-3)) | i108;
                int i110 = 2 & iIdentityHashCode3;
                int i111 = (i109 ^ i110) | (i109 & i110);
                int i112 = ~i111;
                int i113 = i112 & (i111 | i112);
                int i114 = ((~i106) & i113) | ((~i113) & i106);
                int i115 = i113 & i106;
                int i116 = ((i115 & i114) | (i114 ^ i115)) * (-318);
                int i117 = i105 & i116;
                int i118 = -(-((i116 ^ i105) | i117));
                int i119 = ((i117 | i118) << 1) - (i118 ^ i117);
                int i120 = (i106 | length5) & i106;
                int i121 = i120 ^ iIdentityHashCode3;
                int i122 = i120 & iIdentityHashCode3;
                int i123 = ~((i121 ^ i122) | (i121 & i122));
                int i124 = i108 | ((~i107) & (-3));
                int i125 = i107 & (-3);
                int i126 = ~((i124 ^ i125) | (i124 & i125) | length5);
                int i127 = i123 & i126;
                int i128 = (~i127) & (i123 | i126);
                int i129 = ((i128 & i127) | (i128 ^ i127)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET;
                int i130 = i119 & i129;
                int i131 = (i129 | i119) & (~i130);
                int i132 = i130 << 1;
                int i133 = (i131 & i132) + (i131 | i132);
                int i134 = i120 | i107;
                int i135 = ~((i134 & (-3)) | (i134 ^ (-3)));
                int i136 = ((-3) & i106) | (length5 & 2);
                int i137 = length5 & (-3);
                int i138 = (i136 & i137) | (i136 ^ i137);
                int i139 = (i138 & i107) | ((~i138) & iIdentityHashCode3);
                int i140 = i138 & iIdentityHashCode3;
                int i141 = ~((i140 & i139) | (i139 ^ i140));
                int i142 = -(-(((i135 & i141) | (i135 ^ i141)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET));
                int i143 = i133 & i142;
                int i144 = ((i142 | i133) & (~i143)) + (i143 << 1);
                char cCharAt3 = str.charAt(i144);
                if (cCharAt3 != '-') {
                    int i145 = (-2) - ((f52480u0 + 30) ^ (-1));
                    v0 = i145 % 128;
                    if (i145 % 2 != 0 ? cCharAt3 != '+' : cCharAt3 != 'i') {
                        StringBuilder sbD = c.d(str);
                        sbD.append((String) setDividerPadding(new Object[]{admVar, str}, 2044380661, -2044380656, System.identityHashCode(admVar)));
                        String string2 = sbD.toString();
                        int i146 = v0;
                        int i147 = i146 & 125;
                        int i148 = (i146 | 125) & (~i147);
                        int i149 = -(-(i147 << 1));
                        int i150 = (i148 ^ i149) + ((i148 & i149) << 1);
                        f52480u0 = i150 % 128;
                        if (i150 % 2 == 0) {
                            return string2;
                        }
                        throw null;
                    }
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str.substring(0, i144));
                sb3.append(Time.GMT);
                sb3.append(str.substring(i144));
                sb3.append(":00");
                String string3 = sb3.toString();
                int i151 = f52480u0;
                int i152 = i151 & 31;
                int i153 = (i152 - (~(-(-((i151 ^ 31) | i152))))) - 1;
                v0 = i153 % 128;
                if (i153 % 2 != 0) {
                    return string3;
                }
                throw null;
            }
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append(str.substring(0, i100));
        sb4.append(Time.GMT);
        sb4.append(str.substring(i100, ((i100 & 3) - (~(i100 | 3))) - 1));
        sb4.append(DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER);
        int iIdentityHashCode4 = System.identityHashCode(admVar);
        int i154 = (i100 * (-463)) + 1395;
        int i155 = ~i100;
        int i156 = (i100 | i155) & i155;
        int i157 = ~iIdentityHashCode4;
        int i158 = i156 ^ i157;
        int i159 = i156 & i157;
        int i160 = (i159 & i158) | (i158 ^ i159);
        int i161 = ~i160;
        int i162 = (i160 | i161) & i161;
        int i163 = i155 & 3;
        int i164 = (~i163) & (i155 | 3);
        int i165 = ~((i163 & i164) | (i164 ^ i163));
        int i166 = i162 & i165;
        int i167 = (i162 | i165) & (~i166);
        int i168 = (i167 & i166) | (i167 ^ i166);
        int i169 = i157 & (i157 | iIdentityHashCode4);
        int i170 = ~((i169 & 3) | (i169 ^ 3));
        int i171 = i168 ^ i170;
        int i172 = i168 & i170;
        int i173 = -(-(((i172 & i171) | (i171 ^ i172)) * 464));
        int i174 = i154 & i173;
        int i175 = (i154 ^ i173) | i174;
        int i176 = ((i174 | i175) << 1) - (i175 ^ i174);
        int i177 = (iIdentityHashCode4 ^ (-4)) | (iIdentityHashCode4 & (-4));
        int i178 = -(-(((i177 & i155) | (i177 ^ i155)) * (-464)));
        int i179 = i176 & i178;
        int i180 = (i179 - (~(-(-((i178 ^ i176) | i179))))) - 1;
        int i181 = iIdentityHashCode4 & 3;
        int i182 = (iIdentityHashCode4 | 3) & (~i181);
        int i183 = ~((i182 & i181) | (i182 ^ i181));
        int i184 = i165 & i183;
        int i185 = -(-((((i183 | i165) & (~i184)) | i184) * 464));
        int i186 = i180 & i185;
        int i187 = -(-((i185 ^ i180) | i186));
        sb4.append(str.substring((i186 ^ i187) + ((i187 & i186) << 1)));
        String string4 = sb4.toString();
        int i188 = v0;
        int i189 = i188 & 121;
        int i190 = i189 + ((i188 ^ 121) | i189);
        f52480u0 = i190 % 128;
        int i191 = i190 % 2;
        return string4;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x02e1  */
    public static /* synthetic */ Date l(Object[] objArr) throws ParseException {
        SimpleDateFormat simpleDateFormat;
        int i10;
        SimpleDateFormat simpleDateFormat2;
        int i11;
        int i12;
        adm admVar = (adm) objArr[0];
        int i13 = v0;
        int i14 = (i13 ^ 123) + ((i13 & 123) << 1);
        f52480u0 = i14 % 128;
        int i15 = i14 % 2;
        String str = (String) bez.setX(new Object[]{admVar.f52481t0}, -1321203111, 1321203112, (int) System.currentTimeMillis());
        if (str.endsWith("Z")) {
            int iIdentityHashCode = System.identityHashCode(admVar);
            int i16 = ~iIdentityHashCode;
            int i17 = (743658224 & (~i16)) | (i16 & (-743658225));
            int i18 = 743658224 & i16;
            int i19 = ~((i17 ^ i18) | (i17 & i18));
            int i20 = (-1490372027) & iIdentityHashCode;
            int i21 = (~i20) & ((-1490372027) | iIdentityHashCode);
            int i22 = (i21 ^ i20) | (i21 & i20);
            int i23 = ~i22;
            int i24 = (i22 | i23) & i23;
            int i25 = -(-(((i24 & i19) | (i19 ^ i24)) * (-370)));
            int i26 = (-2142054069) ^ i25;
            int i27 = (i25 & (-2142054069)) << 1;
            int i28 = (i26 & i27) + (i27 | i26);
            int i29 = (-1490372027) ^ i16;
            int i30 = (-1490372027) & i16;
            int i31 = (i29 & i30) | (i29 ^ i30);
            int i32 = ~i31;
            int i33 = (i31 | i32) & i32;
            int i34 = 743658224 & iIdentityHashCode;
            int i35 = (743658224 | iIdentityHashCode) & (~i34);
            int i36 = ~((i35 & i34) | (i35 ^ i34));
            int i37 = i33 & i36;
            int i38 = (i36 | i33) & (~i37);
            int i39 = (i38 & i37) | (i38 ^ i37);
            int i40 = ((i39 & 604115520) | (i39 ^ 604115520)) * (-370);
            int i41 = (i28 & i40) + (i40 | i28);
            int i42 = (i41 ^ 184443008) + ((184443008 & i41) << 1);
            int iIdentityHashCode2 = System.identityHashCode(admVar);
            int i43 = ~iIdentityHashCode2;
            int i44 = 1667217891 & i43;
            int i45 = (~i44) & (1667217891 | i43);
            int i46 = ~((i45 & i44) | (i45 ^ i44));
            int i47 = (i46 & (-1667218408)) | (i46 ^ (-1667218408));
            int i48 = i43 & 1633260325;
            int i49 = (i43 | 1633260325) & (~i48);
            int i50 = ~((i49 & i48) | (i49 ^ i48));
            int i51 = i47 ^ i50;
            int i52 = i50 & i47;
            int i53 = -(-(((i52 & i51) | (i51 ^ i52)) * (-397)));
            int i54 = (-358784436) & i53;
            int i55 = i54 + ((i53 ^ (-358784436)) | i54);
            int i56 = i55 & 460744392;
            int i57 = ((460744392 | i55) & (~i56)) + (i56 << 1);
            int i58 = iIdentityHashCode2 & (-1667218408);
            int i59 = (iIdentityHashCode2 | (-1667218408)) & (~i58);
            int i60 = (i59 & i58) | (i59 ^ i58);
            int i61 = i60 & 1633259809;
            int i62 = (i60 | 1633259809) & (~i61);
            if (i42 <= (i57 - (~(-(~(-(-(((i62 & i61) | (i62 ^ i61)) * 397))))))) - 2) {
                ((Boolean) setDividerPadding(new Object[]{admVar}, 524985054, -524985043, System.identityHashCode(admVar))).booleanValue();
                throw null;
            }
            if (((Boolean) setDividerPadding(new Object[]{admVar}, 524985054, -524985043, System.identityHashCode(admVar))).booleanValue()) {
                simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss.SSS'Z'", agv.setDividerPadding);
                int i63 = f52480u0;
                int i64 = i63 ^ 5;
                i12 = (((i63 & 5) | i64) << 1) - i64;
            } else if (((Boolean) setDividerPadding(new Object[]{admVar}, 245719524, -245719518, System.identityHashCode(admVar))).booleanValue()) {
                simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss'Z'", agv.setDividerPadding);
                i12 = f52480u0 + 99;
            } else {
                if (((Boolean) setDividerPadding(new Object[]{admVar}, -985108382, 985108390, System.identityHashCode(admVar))).booleanValue()) {
                    simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmm'Z'", agv.setDividerPadding);
                    i12 = f52480u0 + 101;
                } else {
                    simpleDateFormat = new SimpleDateFormat("yyyyMMddHH'Z'", agv.setDividerPadding);
                    int i65 = f52480u0;
                    int i66 = i65 & 19;
                    int i67 = (i65 | 19) & (~i66);
                    int i68 = -(-(i66 << 1));
                    int i69 = (i67 ^ i68) + ((i67 & i68) << 1);
                    v0 = i69 % 128;
                    int i70 = i69 % 2;
                }
                simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
                int i71 = f52480u0;
                int i72 = ((i71 ^ 83) | (i71 & 83)) << 1;
                int i73 = -(((~i71) & 83) | (i71 & (-84)));
                int i74 = ((i72 | i73) << 1) - (i73 ^ i72);
                v0 = i74 % 128;
                int i75 = i74 % 2;
            }
            v0 = i12 % 128;
            int i76 = i12 % 2;
            simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
            int i77 = f52480u0;
            int i78 = ((i77 ^ 83) | (i77 & 83)) << 1;
            int i79 = -(((~i77) & 83) | (i77 & (-84)));
            int i710 = ((i78 | i79) << 1) - (i79 ^ i78);
            v0 = i710 % 128;
            int i711 = i710 % 2;
        } else {
            if (str.indexOf(45) <= 0) {
                int i80 = (-2) - ((v0 + 38) ^ (-1));
                f52480u0 = i80 % 128;
                if (i80 % 2 == 0 ? str.indexOf(43) <= 0 : str.indexOf(37) <= 0) {
                    if (((Boolean) setDividerPadding(new Object[]{admVar}, 524985054, -524985043, System.identityHashCode(admVar))).booleanValue()) {
                        simpleDateFormat2 = new SimpleDateFormat("yyyyMMddHHmmss.SSS");
                        int i81 = f52480u0;
                        i11 = ((i81 | 109) << 1) - (i81 ^ 109);
                    } else {
                        if (((Boolean) setDividerPadding(new Object[]{admVar}, 245719524, -245719518, System.identityHashCode(admVar))).booleanValue()) {
                            simpleDateFormat2 = new SimpleDateFormat("yyyyMMddHHmmss");
                            int i82 = v0;
                            int i83 = ((i82 ^ 111) | (i82 & 111)) << 1;
                            int i84 = -(((~i82) & 111) | (i82 & (-112)));
                            int i85 = ((i83 | i84) << 1) - (i84 ^ i83);
                            f52480u0 = i85 % 128;
                            int i86 = i85 % 2;
                        } else if (((Boolean) setDividerPadding(new Object[]{admVar}, -985108382, 985108390, System.identityHashCode(admVar))).booleanValue()) {
                            simpleDateFormat2 = new SimpleDateFormat("yyyyMMddHHmm");
                            int i87 = f52480u0;
                            int i88 = i87 & 25;
                            i11 = ((((i87 ^ 25) | i88) << 1) - (~(-((i87 | 25) & (~i88))))) - 1;
                        } else {
                            simpleDateFormat2 = new SimpleDateFormat("yyyyMMddHH");
                            int i89 = v0;
                            int i90 = (i89 & 124) + (i89 | 124);
                            int i91 = (i90 ^ (-1)) + (i90 << 1);
                            f52480u0 = i91 % 128;
                            int i92 = i91 % 2;
                        }
                        simpleDateFormat = simpleDateFormat2;
                        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, TimeZone.getDefault().getID()));
                        int i93 = v0;
                        i10 = (i93 ^ 35) + ((i93 & 35) << 1);
                        f52480u0 = i10 % 128;
                    }
                    v0 = i11 % 128;
                    int i94 = i11 % 2;
                    simpleDateFormat = simpleDateFormat2;
                    simpleDateFormat.setTimeZone(new SimpleTimeZone(0, TimeZone.getDefault().getID()));
                    int i95 = v0;
                    i10 = (i95 ^ 35) + ((i95 & 35) << 1);
                    f52480u0 = i10 % 128;
                } else {
                    str = (String) setDividerPadding(new Object[]{admVar}, -742607419, 742607419, System.identityHashCode(admVar));
                    simpleDateFormat = (SimpleDateFormat) setDividerPadding(new Object[]{admVar}, -965205668, 965205670, System.identityHashCode(admVar));
                    int i96 = f52480u0;
                    int i97 = i96 & 45;
                    int i98 = -(-((45 ^ i96) | i97));
                    i10 = (i97 ^ i98) + ((i98 & i97) << 1);
                    v0 = i10 % 128;
                }
            } else {
                str = (String) setDividerPadding(new Object[]{admVar}, -742607419, 742607419, System.identityHashCode(admVar));
                simpleDateFormat = (SimpleDateFormat) setDividerPadding(new Object[]{admVar}, -965205668, 965205670, System.identityHashCode(admVar));
                int i99 = f52480u0;
                int i910 = i99 & 45;
                int i911 = -(-((45 ^ i99) | i910));
                i10 = (i910 ^ i911) + ((i911 & i910) << 1);
                v0 = i10 % 128;
            }
            int i100 = i10 % 2;
        }
        if (!(!((Boolean) setDividerPadding(new Object[]{admVar}, 524985054, -524985043, System.identityHashCode(admVar))).booleanValue())) {
            int i101 = v0 + 37;
            f52480u0 = i101 % 128;
            if (i101 % 2 != 0) {
                throw null;
            }
            str = (String) setDividerPadding(new Object[]{str}, 579090450, -579090443, (int) System.currentTimeMillis());
        }
        Date date = simpleDateFormat.parse(str);
        int i102 = v0;
        int i103 = (i102 ^ 104) + ((i102 & 104) << 1);
        int i104 = (i103 ^ (-1)) + (i103 << 1);
        f52480u0 = i104 % 128;
        int i105 = i104 % 2;
        return date;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:35:0x0158  */
    /* JADX WARN: Code duplicated, block: B:45:0x01b0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:52:0x022a  */
    /* JADX WARN: Code duplicated, block: B:54:0x0264  */
    /* JADX WARN: Code duplicated, block: B:56:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:58:0x0306  */
    /* JADX WARN: Code duplicated, block: B:60:0x0382  */
    /* JADX WARN: Code duplicated, block: B:73:0x0438  */
    /* JADX WARN: Code duplicated, block: B:77:0x0443  */
    /* JADX WARN: Code duplicated, block: B:89:0x01d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x01d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x01c4 A[SYNTHETIC] */
    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26 = ~i10;
        int i27 = ((i11 | i26) * (-1434)) + (i11 * 1435) + (i10 * (-716));
        int i28 = ~i12;
        int i29 = ~(i28 | i11);
        int i30 = ~(i10 | i11);
        int i31 = i26 | (~i11);
        int i32 = ((i30 | (~(i31 | i28)) | (~(i11 | i12))) * 717) + ((i29 | i30 | (~(i31 | i12))) * 717) + i27;
        Object admVar = Boolean.TRUE;
        switch (i32) {
            case 1:
                return g(objArr);
            case 2:
                return h(objArr);
            case 3:
                return j(objArr);
            case 4:
                return l(objArr);
            case 5:
                return i(objArr);
            case 6:
                adm admVar2 = (adm) objArr[0];
                int i33 = (-2) - ((v0 + 8) ^ (-1));
                f52480u0 = i33 % 128;
                int i34 = i33 % 2;
                if (!((Boolean) setDividerPadding(new Object[]{admVar2, 12}, 2052402908, -2052402899, 12)).booleanValue()) {
                    int i35 = v0;
                    int i36 = i35 & 31;
                    int i37 = (((i35 | 31) & (~i36)) - (~(-(-(i36 << 1))))) - 1;
                    f52480u0 = i37 % 128;
                    int i38 = i37 % 2;
                    admVar = Boolean.FALSE;
                } else {
                    int i39 = f52480u0;
                    int i40 = ((i39 ^ 5) | (i39 & 5)) << 1;
                    int i41 = -(((~i39) & 5) | (i39 & (-6)));
                    int i42 = (i40 & i41) + (i41 | i40);
                    v0 = i42 % 128;
                    Object[] objArr2 = new Object[2];
                    if (i42 % 2 != 0) {
                        objArr2[0] = admVar2;
                        objArr2[1] = 13;
                        if (!((Boolean) setDividerPadding(objArr2, 2052402908, -2052402899, 13)).booleanValue()) {
                            int i310 = v0;
                            int i311 = i310 & 31;
                            int i312 = (((i310 | 31) & (~i311)) - (~(-(-(i311 << 1))))) - 1;
                            f52480u0 = i312 % 128;
                            int i313 = i312 % 2;
                            admVar = Boolean.FALSE;
                        } else {
                            System.identityHashCode(admVar2);
                            System.identityHashCode(admVar2);
                        }
                    } else {
                        objArr2[0] = admVar2;
                        objArr2[1] = 99;
                        if (!((Boolean) setDividerPadding(objArr2, 2052402908, -2052402899, 99)).booleanValue()) {
                            int i314 = v0;
                            int i315 = i314 & 31;
                            int i316 = (((i314 | 31) & (~i315)) - (~(-(-(i315 << 1))))) - 1;
                            f52480u0 = i316 % 128;
                            int i317 = i316 % 2;
                            admVar = Boolean.FALSE;
                        } else {
                            System.identityHashCode(admVar2);
                            System.identityHashCode(admVar2);
                        }
                    }
                }
                break;
            case 7:
                String string = (String) objArr[0];
                int i43 = f52480u0 + 57;
                v0 = i43 % 128;
                int i44 = i43 % 2;
                String strSubstring = string.substring(14);
                int i45 = f52480u0;
                int i46 = (((i45 & (-8)) | ((~i45) & 7)) - (~(-(-((i45 & 7) << 1))))) - 1;
                v0 = i46 % 128;
                int i47 = i46 % 2;
                int i48 = 1;
                while (i48 < strSubstring.length()) {
                    int i49 = v0;
                    int i50 = (i49 & 47) + (i49 | 47);
                    f52480u0 = i50 % 128;
                    int i51 = i50 % 2;
                    char cCharAt = strSubstring.charAt(i48);
                    if (i51 != 0) {
                        if (30 <= cCharAt) {
                            if (cCharAt <= '9') {
                                int i52 = v0;
                                int i53 = i52 & 25;
                                int i54 = (i52 ^ 25) | i53;
                                i25 = (i53 & i54) + (i54 | i53);
                                f52480u0 = i25 % 128;
                                if (i25 % 2 != 0) {
                                    int i55 = i48 & 127;
                                    i48 = (((i48 ^ 127) | i55) << 1) - ((i48 | 127) & (~i55));
                                } else {
                                    i48++;
                                }
                            }
                        }
                    } else if ('0' <= cCharAt) {
                        if (cCharAt <= '9') {
                            int i56 = v0;
                            int i57 = i56 & 25;
                            int i58 = (i56 ^ 25) | i57;
                            i25 = (i57 & i58) + (i58 | i57);
                            f52480u0 = i25 % 128;
                            if (i25 % 2 != 0) {
                                int i59 = i48 & 127;
                                i48 = (((i48 ^ 127) | i59) << 1) - ((i48 | 127) & (~i59));
                            } else {
                                i48++;
                            }
                        }
                    }
                    int iCurrentTimeMillis = (int) System.currentTimeMillis();
                    int i60 = i48 * 829;
                    int i61 = (-829) ^ i60;
                    int i62 = ((((i60 & (-829)) | i61) << 1) - (~(-i61))) - 1;
                    i13 = ~i48;
                    i14 = ~i13;
                    int i63 = ~iCurrentTimeMillis;
                    int i64 = ~i63;
                    int i65 = (i64 & i63) | (i64 ^ i63);
                    int i66 = ~((i65 & i48) | (i65 ^ i48));
                    int i67 = ((~i66) & i14) | ((~i14) & i66);
                    int i68 = i66 & i14;
                    int i69 = (((i68 & i67) | (i67 ^ i68)) * (-828)) + i62;
                    i15 = ((-1) ^ i48) | i48;
                    int i70 = -(-(((i63 & i15) | (i15 ^ i63)) * (-828)));
                    int i71 = (i69 ^ i70) + ((i70 & i69) << 1);
                    int i72 = (~((i13 ^ i48) | (i13 & i48))) * 828;
                    int i73 = i71 & i72;
                    i16 = ((i71 ^ i72) | i73) << 1;
                    i17 = -((i72 | i71) & (~i73));
                    if (((i16 | i17) << 1) - (i17 ^ i16) > 3) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(strSubstring.substring(0, 4));
                        sb2.append(strSubstring.substring(i48));
                        String string2 = sb2.toString();
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(string.substring(0, 14));
                        sb3.append(string2);
                        string = sb3.toString();
                        int i74 = f52480u0;
                        i24 = (i74 ^ 83) + ((i74 & 83) << 1);
                        v0 = i24 % 128;
                    } else {
                        int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
                        int i75 = -(-(i48 * (-69)));
                        int i76 = (-71) & i75;
                        int i77 = (((((-71) ^ i75) | i76) << 1) - (~(-((i75 | (-71)) & (~i76))))) - 1;
                        int i78 = ~i48;
                        int i79 = i48 & iCurrentTimeMillis2;
                        int i80 = (~i79) & (i48 | iCurrentTimeMillis2);
                        int i81 = ~iCurrentTimeMillis2;
                        int i82 = ~(i79 | i80);
                        int i83 = i78 ^ i82;
                        int i84 = i82 & i78;
                        int i85 = (i77 - (~(((i83 ^ i84) | (i84 & i83)) * (-140)))) - 1;
                        int i86 = i15 | iCurrentTimeMillis2;
                        int i87 = ~i86;
                        int i88 = -(-(((i86 | i87) & i87) * 70));
                        int i89 = i85 & i88;
                        int i90 = -(-((i88 ^ i85) | i89));
                        int i91 = (i89 ^ i90) + ((i90 & i89) << 1);
                        int i92 = ~((i14 ^ i13) | (i14 & i13));
                        int i93 = (i78 & i92) | (i78 ^ i92);
                        int i94 = ~(iCurrentTimeMillis2 | i81);
                        int i95 = i93 ^ i94;
                        int i96 = i94 & i93;
                        int i97 = ((i96 & i95) | (i95 ^ i96)) * 70;
                        i18 = i91 & i97;
                        i19 = -(-((i97 ^ i91) | i18));
                        if (((i18 | i19) << 1) - (i19 ^ i18) == 1) {
                            int iCurrentTimeMillis3 = (int) System.currentTimeMillis();
                            int i98 = i48 * (-183);
                            int i99 = (183 ^ i98) + ((i98 & 183) << 1);
                            int i100 = ~iCurrentTimeMillis3;
                            int i101 = (iCurrentTimeMillis3 | i100) & i100;
                            int i102 = (i101 & i48) | (i101 & i13) | ((~i101) & i48);
                            int i103 = ~i102;
                            int i104 = (i102 | i103) & i103;
                            int i105 = (i13 | i48) & i13;
                            int i106 = ~i100;
                            int i107 = ~i105;
                            int i108 = (i105 & i106) | (i100 & i107);
                            int i109 = i105 & i100;
                            int i110 = (i108 ^ i109) | (i109 & i108);
                            int i111 = ~i110;
                            int i112 = ~((i111 ^ i110) | (i110 & i111));
                            int i113 = -(-(((i104 & i112) | (i104 ^ i112)) * (-184)));
                            int i114 = i99 & i113;
                            int i115 = (i114 - (~(-(-((i113 ^ i99) | i114))))) - 1;
                            int i116 = (i107 & i106) | ((~i106) & i107) | ((~i107) & i106);
                            int i117 = (i13 & i106) | (i14 & i100);
                            int i118 = i100 & i13;
                            int i119 = ~((i117 & i118) | (i117 ^ i118));
                            int i120 = -(-(((i116 & i119) | ((~i119) & i116) | ((~i116) & i119)) * 184));
                            int i121 = ((~i120) & i115) | ((~i115) & i120);
                            int i122 = -(-((i120 & i115) << 1));
                            int i123 = ((i121 | i122) << 1) - (i122 ^ i121);
                            int i124 = i15 * 184;
                            i20 = i123 & i124;
                            i21 = (i123 ^ i124) | i20;
                            if (((i20 | i21) << 1) - (i20 ^ i21) == 2) {
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append(strSubstring.substring(0, i48));
                                sb4.append("0");
                                sb4.append(strSubstring.substring(i48));
                                String string3 = sb4.toString();
                                StringBuilder sb5 = new StringBuilder();
                                sb5.append(string.substring(0, 14));
                                sb5.append(string3);
                                string = sb5.toString();
                                int i125 = v0;
                                i22 = i125 & 39;
                                i23 = i125 | 39;
                            }
                            int i126 = f52480u0 + 81;
                            v0 = i126 % 128;
                            int i127 = i126 % 2;
                            return string;
                        }
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append(strSubstring.substring(0, i48));
                        sb6.append("00");
                        sb6.append(strSubstring.substring(i48));
                        String string4 = sb6.toString();
                        StringBuilder sb7 = new StringBuilder();
                        sb7.append(string.substring(0, 14));
                        sb7.append(string4);
                        string = sb7.toString();
                        int i128 = v0;
                        i22 = i128 ^ 27;
                        i23 = (i128 & 27) << 1;
                        i24 = i22 + i23;
                        f52480u0 = i24 % 128;
                    }
                    int i129 = i24 % 2;
                    int i1210 = f52480u0 + 81;
                    v0 = i1210 % 128;
                    int i1211 = i1210 % 2;
                    return string;
                }
                int iCurrentTimeMillis4 = (int) System.currentTimeMillis();
                int i610 = i48 * 829;
                int i611 = (-829) ^ i610;
                int i612 = ((((i610 & (-829)) | i611) << 1) - (~(-i611))) - 1;
                i13 = ~i48;
                i14 = ~i13;
                int i613 = ~iCurrentTimeMillis4;
                int i614 = ~i613;
                int i615 = (i614 & i613) | (i614 ^ i613);
                int i616 = ~((i615 & i48) | (i615 ^ i48));
                int i617 = ((~i616) & i14) | ((~i14) & i616);
                int i618 = i616 & i14;
                int i619 = (((i618 & i617) | (i617 ^ i618)) * (-828)) + i612;
                i15 = ((-1) ^ i48) | i48;
                int i710 = -(-(((i613 & i15) | (i15 ^ i613)) * (-828)));
                int i711 = (i619 ^ i710) + ((i710 & i619) << 1);
                int i712 = (~((i13 ^ i48) | (i13 & i48))) * 828;
                int i713 = i711 & i712;
                i16 = ((i711 ^ i712) | i713) << 1;
                i17 = -((i712 | i711) & (~i713));
                if (((i16 | i17) << 1) - (i17 ^ i16) > 3) {
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append(strSubstring.substring(0, 4));
                    sb8.append(strSubstring.substring(i48));
                    String string5 = sb8.toString();
                    StringBuilder sb9 = new StringBuilder();
                    sb9.append(string.substring(0, 14));
                    sb9.append(string5);
                    string = sb9.toString();
                    int i714 = f52480u0;
                    i24 = (i714 ^ 83) + ((i714 & 83) << 1);
                    v0 = i24 % 128;
                } else {
                    int iCurrentTimeMillis5 = (int) System.currentTimeMillis();
                    int i715 = -(-(i48 * (-69)));
                    int i716 = (-71) & i715;
                    int i717 = (((((-71) ^ i715) | i716) << 1) - (~(-((i715 | (-71)) & (~i716))))) - 1;
                    int i718 = ~i48;
                    int i719 = i48 & iCurrentTimeMillis5;
                    int i810 = (~i719) & (i48 | iCurrentTimeMillis5);
                    int i811 = ~iCurrentTimeMillis5;
                    int i812 = ~(i719 | i810);
                    int i813 = i718 ^ i812;
                    int i814 = i812 & i718;
                    int i815 = (i717 - (~(((i813 ^ i814) | (i814 & i813)) * (-140)))) - 1;
                    int i816 = i15 | iCurrentTimeMillis5;
                    int i817 = ~i816;
                    int i818 = -(-(((i816 | i817) & i817) * 70));
                    int i819 = i815 & i818;
                    int i910 = -(-((i818 ^ i815) | i819));
                    int i911 = (i819 ^ i910) + ((i910 & i819) << 1);
                    int i912 = ~((i14 ^ i13) | (i14 & i13));
                    int i913 = (i718 & i912) | (i718 ^ i912);
                    int i914 = ~(iCurrentTimeMillis5 | i811);
                    int i915 = i913 ^ i914;
                    int i916 = i914 & i913;
                    int i917 = ((i916 & i915) | (i915 ^ i916)) * 70;
                    i18 = i911 & i917;
                    i19 = -(-((i917 ^ i911) | i18));
                    if (((i18 | i19) << 1) - (i19 ^ i18) == 1) {
                        int iCurrentTimeMillis6 = (int) System.currentTimeMillis();
                        int i918 = i48 * (-183);
                        int i919 = (183 ^ i918) + ((i918 & 183) << 1);
                        int i1010 = ~iCurrentTimeMillis6;
                        int i1011 = (iCurrentTimeMillis6 | i1010) & i1010;
                        int i1012 = (i1011 & i48) | (i1011 & i13) | ((~i1011) & i48);
                        int i1013 = ~i1012;
                        int i1014 = (i1012 | i1013) & i1013;
                        int i1015 = (i13 | i48) & i13;
                        int i1016 = ~i1010;
                        int i1017 = ~i1015;
                        int i1018 = (i1015 & i1016) | (i1010 & i1017);
                        int i1019 = i1015 & i1010;
                        int i1110 = (i1018 ^ i1019) | (i1019 & i1018);
                        int i1111 = ~i1110;
                        int i1112 = ~((i1111 ^ i1110) | (i1110 & i1111));
                        int i1113 = -(-(((i1014 & i1112) | (i1014 ^ i1112)) * (-184)));
                        int i1114 = i919 & i1113;
                        int i1115 = (i1114 - (~(-(-((i1113 ^ i919) | i1114))))) - 1;
                        int i1116 = (i1017 & i1016) | ((~i1016) & i1017) | ((~i1017) & i1016);
                        int i1117 = (i13 & i1016) | (i14 & i1010);
                        int i1118 = i1010 & i13;
                        int i1119 = ~((i1117 & i1118) | (i1117 ^ i1118));
                        int i1212 = -(-(((i1116 & i1119) | ((~i1119) & i1116) | ((~i1116) & i1119)) * 184));
                        int i1213 = ((~i1212) & i1115) | ((~i1115) & i1212);
                        int i1214 = -(-((i1212 & i1115) << 1));
                        int i1215 = ((i1213 | i1214) << 1) - (i1214 ^ i1213);
                        int i1216 = i15 * 184;
                        i20 = i1215 & i1216;
                        i21 = (i1215 ^ i1216) | i20;
                        if (((i20 | i21) << 1) - (i20 ^ i21) == 2) {
                            StringBuilder sb10 = new StringBuilder();
                            sb10.append(strSubstring.substring(0, i48));
                            sb10.append("0");
                            sb10.append(strSubstring.substring(i48));
                            String string6 = sb10.toString();
                            StringBuilder sb11 = new StringBuilder();
                            sb11.append(string.substring(0, 14));
                            sb11.append(string6);
                            string = sb11.toString();
                            int i1217 = v0;
                            i22 = i1217 & 39;
                            i23 = i1217 | 39;
                        }
                        int i1218 = f52480u0 + 81;
                        v0 = i1218 % 128;
                        int i1219 = i1218 % 2;
                        return string;
                    }
                    StringBuilder sb12 = new StringBuilder();
                    sb12.append(strSubstring.substring(0, i48));
                    sb12.append("00");
                    sb12.append(strSubstring.substring(i48));
                    String string7 = sb12.toString();
                    StringBuilder sb13 = new StringBuilder();
                    sb13.append(string.substring(0, 14));
                    sb13.append(string7);
                    string = sb13.toString();
                    int i1220 = v0;
                    i22 = i1220 ^ 27;
                    i23 = (i1220 & 27) << 1;
                    i24 = i22 + i23;
                    f52480u0 = i24 % 128;
                }
                int i1221 = i24 % 2;
                int i12110 = f52480u0 + 81;
                v0 = i12110 % 128;
                int i12111 = i12110 % 2;
                return string;
            case 8:
                adm admVar3 = (adm) objArr[0];
                int i130 = (-2) - ((v0 + 72) ^ (-1));
                f52480u0 = i130 % 128;
                if (i130 % 2 == 0 ? ((Boolean) setDividerPadding(new Object[]{admVar3, 10}, 2052402908, -2052402899, 10)).booleanValue() : !(!((Boolean) setDividerPadding(new Object[]{admVar3, 79}, 2052402908, -2052402899, 79)).booleanValue())) {
                    int i131 = f52480u0 + 123;
                    v0 = i131 % 128;
                    if (i131 % 2 != 0 ? ((Boolean) setDividerPadding(new Object[]{admVar3, 11}, 2052402908, -2052402899, 11)).booleanValue() : ((Boolean) setDividerPadding(new Object[]{admVar3, 110}, 2052402908, -2052402899, 110)).booleanValue()) {
                        int i132 = f52480u0 + 119;
                        v0 = i132 % 128;
                        int i133 = i132 % 2;
                    } else {
                        int i134 = f52480u0;
                        int i135 = (i134 & 115) + (i134 | 115);
                        v0 = i135 % 128;
                        int i136 = i135 % 2;
                        admVar = Boolean.FALSE;
                    }
                } else {
                    int i137 = f52480u0;
                    int i138 = (i137 & 115) + (i137 | 115);
                    v0 = i138 % 128;
                    int i139 = i138 % 2;
                    admVar = Boolean.FALSE;
                }
                break;
            case 9:
                adm admVar4 = (adm) objArr[0];
                int iIntValue = ((Number) objArr[1]).intValue();
                int i140 = f52480u0;
                int i141 = i140 + 126;
                int i142 = (i141 ^ (-1)) + (i141 << 1);
                v0 = i142 % 128;
                int i143 = i142 % 2;
                byte[] bArr = admVar4.f52481t0;
                if (bArr.length <= iIntValue) {
                    int i144 = v0;
                    int i145 = i144 & 19;
                    int i146 = (i144 | 19) & (~i145);
                    int i147 = i145 << 1;
                    int i148 = ((i146 | i147) << 1) - (i146 ^ i147);
                    f52480u0 = i148 % 128;
                    int i149 = i148 % 2;
                    admVar = Boolean.FALSE;
                } else {
                    int i150 = ((i140 | 93) << 1) - (i140 ^ 93);
                    int i151 = i150 % 128;
                    v0 = i151;
                    int i152 = i150 % 2;
                    byte b10 = bArr[iIntValue];
                    if (b10 < 48) {
                        int i1410 = v0;
                        int i1411 = i1410 & 19;
                        int i1412 = (i1410 | 19) & (~i1411);
                        int i1413 = i1411 << 1;
                        int i1414 = ((i1412 | i1413) << 1) - (i1412 ^ i1413);
                        f52480u0 = i1414 % 128;
                        int i1415 = i1414 % 2;
                        admVar = Boolean.FALSE;
                    } else {
                        int i153 = ((i151 | 93) << 1) - (i151 ^ 93);
                        f52480u0 = i153 % 128;
                        int i154 = i153 % 2;
                        if (b10 > 57) {
                            int i1416 = v0;
                            int i1417 = i1416 & 19;
                            int i1418 = (i1416 | 19) & (~i1417);
                            int i1419 = i1417 << 1;
                            int i14110 = ((i1418 | i1419) << 1) - (i1418 ^ i1419);
                            f52480u0 = i14110 % 128;
                            int i14111 = i14110 % 2;
                            admVar = Boolean.FALSE;
                        } else {
                            int i155 = ((i151 & 84) + (i151 | 84)) - 1;
                            f52480u0 = i155 % 128;
                            int i156 = i155 % 2;
                        }
                    }
                }
                break;
            case 10:
                admVar = new adm((byte[]) objArr[0]);
                System.currentTimeMillis();
                System.currentTimeMillis();
                break;
            case 11:
                return f(objArr);
            case 12:
                int i157 = v0 + 121;
                f52480u0 = i157 % 128;
                return Boolean.valueOf(i157 % 2 != 0);
            default:
                return k(objArr);
        }
        return admVar;
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public int b(boolean z10) {
        int i10 = v0 + 105;
        f52480u0 = i10 % 128;
        int i11 = i10 % 2;
        byte[] bArr = this.f52481t0;
        if (i11 == 0) {
            int length = bArr.length;
            return ((Integer) aeb.setX(new Object[]{Boolean.valueOf(z10), Integer.valueOf(length)}, 1150803379, -1150803367, length)).intValue();
        }
        int length2 = bArr.length;
        ((Integer) aeb.setX(new Object[]{Boolean.valueOf(z10), Integer.valueOf(length2)}, 1150803379, -1150803367, length2)).intValue();
        throw null;
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public void c(aeb aebVar, boolean z10) throws IOException {
        int i10 = (-2) - ((f52480u0 + 76) ^ (-1));
        v0 = i10 % 128;
        int i11 = i10 % 2;
        byte[] bArr = this.f52481t0;
        if (i11 == 0) {
            aeb.setX(new Object[]{aebVar, Boolean.valueOf(z10), 98, bArr}, 478760665, -478760661, 98);
        } else {
            aeb.setX(new Object[]{aebVar, Boolean.valueOf(z10), 24, bArr}, 478760665, -478760661, 24);
        }
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final boolean d(ady adyVar) {
        return ((Boolean) setDividerPadding(new Object[]{this, adyVar}, -1124112138, 1124112139, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public ady e() {
        afo afoVar = new afo(this.f52481t0);
        int i10 = v0;
        int i11 = (i10 & 91) + (i10 | 91);
        f52480u0 = i11 % 128;
        int i12 = i11 % 2;
        return afoVar;
    }

    @Override // com.mypinpad.tsdk.isolation.adw
    public int hashCode() {
        int iIntValue;
        int i10 = f52480u0;
        int i11 = (i10 ^ 5) + ((i10 & 5) << 1);
        v0 = i11 % 128;
        int i12 = i11 % 2;
        byte[] bArr = this.f52481t0;
        if (i12 == 0) {
            iIntValue = ((Integer) bek.setOnFocusChangeListener(new Object[]{bArr}, -642573231, 642573231, (int) System.currentTimeMillis())).intValue();
            int i13 = 44 / 0;
        } else {
            iIntValue = ((Integer) bek.setOnFocusChangeListener(new Object[]{bArr}, -642573231, 642573231, (int) System.currentTimeMillis())).intValue();
        }
        int i14 = f52480u0;
        int i15 = i14 & 39;
        int i16 = i15 + ((i14 ^ 39) | i15);
        v0 = i16 % 128;
        int i17 = i16 % 2;
        return iIntValue;
    }

    public final Date setCompoundDrawableTintBlendMode() throws ParseException {
        return (Date) setDividerPadding(new Object[]{this}, 1086411679, -1086411675, System.identityHashCode(this));
    }

    public final boolean setLayoutAnimation() {
        return ((Boolean) setDividerPadding(new Object[]{this}, -985108382, 985108390, System.identityHashCode(this))).booleanValue();
    }

    public final boolean setOnFocusChangeListener() {
        return ((Boolean) setDividerPadding(new Object[]{this}, 524985054, -524985043, System.identityHashCode(this))).booleanValue();
    }

    public final boolean setX() {
        return ((Boolean) setDividerPadding(new Object[]{this}, 245719524, -245719518, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final boolean setY() {
        return ((Boolean) setDividerPadding(new Object[]{this}, 1652326830, -1652326818, System.identityHashCode(this))).booleanValue();
    }

    public final String setDividerPadding() {
        return (String) setDividerPadding(new Object[]{this}, -742607419, 742607419, System.identityHashCode(this));
    }
}
