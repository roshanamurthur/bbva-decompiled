package com.mypinpad.tsdk.isolation;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bbva.glomohybrid.base.deeplink.extensions.DeepLinkExtensionsKt;
import com.bbva.sdkcatalog.openpay.plugin.data.error.ErrorCodes;
import com.bbva.sl.ar.android.sslpinning.result.ResultCode;
import java.io.EOFException;
import java.net.IDN;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.l;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class yu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f62207a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f62208b = 1;

    /* JADX WARN: Code duplicated, block: B:14:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:46:0x01dc A[Catch: IllegalArgumentException -> 0x0242, TRY_ENTER, TRY_LEAVE, TryCatch #0 {IllegalArgumentException -> 0x0242, blocks: (B:36:0x019a, B:46:0x01dc), top: B:65:0x019a }] */
    /* JADX WARN: Code duplicated, block: B:49:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:51:0x020c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:52:0x020d  */
    /* JADX WARN: Code duplicated, block: B:53:0x020e  */
    /* JADX WARN: Code duplicated, block: B:55:0x0220 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:56:0x0221  */
    /* JADX WARN: Code duplicated, block: B:57:0x0222  */
    /* JADX WARN: Code duplicated, block: B:59:0x0236  */
    /* JADX WARN: Code duplicated, block: B:61:0x023f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:62:0x0240  */
    /* JADX WARN: Code duplicated, block: B:63:0x0241  */
    public static /* synthetic */ String a(Object[] objArr) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        InetAddress inetAddress;
        String hostAddress;
        String str = (String) objArr[0];
        int i15 = f62207a;
        int i16 = ((i15 ^ 17) | (i15 & 17)) << 1;
        int i17 = -(((~i15) & 17) | (i15 & (-18)));
        int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
        f62208b = i18 % 128;
        int i19 = i18 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        if (!StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER, false, 2, (Object) null)) {
            try {
                String ascii = IDN.toASCII(str);
                Intrinsics.checkNotNullExpressionValue(ascii, "");
                Locale locale = Locale.US;
                Intrinsics.checkNotNullExpressionValue(locale, "");
                String lowerCase = ascii.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                if (lowerCase.length() == 0) {
                    int i20 = f62207a + 36;
                    int i21 = (i20 ^ (-1)) + (i20 << 1);
                    f62208b = i21 % 128;
                    if (i21 % 2 != 0) {
                        z10 = true;
                    }
                    if (!z10) {
                        int i22 = f62208b;
                        int i23 = i22 & 101;
                        i10 = (((i22 ^ 101) | i23) << 1) - ((i22 | 101) & (~i23));
                        i11 = i10 % 128;
                        f62207a = i11;
                        if (i10 % 2 == 0) {
                            throw null;
                        }
                        i12 = i11 + 77;
                        f62208b = i12 % 128;
                        if (i12 % 2 != 0) {
                            return null;
                        }
                        throw null;
                    }
                    if (!((Boolean) setCompoundDrawableTintBlendMode(new Object[]{lowerCase}, -1202822389, 1202822391, (int) System.currentTimeMillis())).booleanValue()) {
                        int i24 = f62207a;
                        int i25 = (i24 | 45) << 1;
                        int i26 = -(i24 ^ 45);
                        i14 = (i25 ^ i26) + ((i26 & i25) << 1);
                        f62208b = i14 % 128;
                        if (i14 % 2 != 0) {
                            return lowerCase;
                        }
                        throw null;
                    }
                    int i27 = f62207a;
                    int i28 = i27 & 27;
                    int i29 = (i27 ^ 27) | i28;
                    i13 = (i28 & i29) + (i29 | i28);
                    f62208b = i13 % 128;
                    if (i13 % 2 != 0) {
                        return null;
                    }
                    throw null;
                }
                int i30 = f62208b;
                int i31 = (((i30 & (-90)) | ((~i30) & 89)) - (~((i30 & 89) << 1))) - 1;
                f62207a = i31 % 128;
                int i32 = i31 % 2;
                z10 = false;
                if (!z10) {
                    int i210 = f62208b;
                    int i211 = i210 & 101;
                    i10 = (((i210 ^ 101) | i211) << 1) - ((i210 | 101) & (~i211));
                    i11 = i10 % 128;
                    f62207a = i11;
                    if (i10 % 2 == 0) {
                        throw null;
                    }
                    i12 = i11 + 77;
                    f62208b = i12 % 128;
                    if (i12 % 2 != 0) {
                        return null;
                    }
                    throw null;
                }
                if (!((Boolean) setCompoundDrawableTintBlendMode(new Object[]{lowerCase}, -1202822389, 1202822391, (int) System.currentTimeMillis())).booleanValue()) {
                    int i212 = f62207a;
                    int i213 = (i212 | 45) << 1;
                    int i214 = -(i212 ^ 45);
                    i14 = (i213 ^ i214) + ((i214 & i213) << 1);
                    f62208b = i14 % 128;
                    if (i14 % 2 != 0) {
                        return lowerCase;
                    }
                    throw null;
                }
                int i215 = f62207a;
                int i216 = i215 & 27;
                int i217 = (i215 ^ 27) | i216;
                i13 = (i216 & i217) + (i217 | i216);
                f62208b = i13 % 128;
                if (i13 % 2 != 0) {
                    return null;
                }
                throw null;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        int i33 = f62207a;
        int i34 = ((i33 ^ 69) | (i33 & 69)) << 1;
        int i35 = -(((~i33) & 69) | (i33 & (-70)));
        int i36 = ((i34 | i35) << 1) - (i35 ^ i34);
        f62208b = i36 % 128;
        int i37 = i36 % 2;
        if (l.startsWith$default(str, Constant.BRACKET_OPEN, false, 2, null)) {
            int i38 = f62207a;
            int i39 = (i38 & 103) + (i38 | 103);
            f62208b = i39 % 128;
            if (i39 % 2 != 0 ? !l.endsWith$default(str, Constant.BRACKET_CLOSE, false, 2, null) : !l.endsWith$default(str, Constant.BRACKET_CLOSE, false, 4, null)) {
                inetAddress = (InetAddress) setCompoundDrawableTintBlendMode(new Object[]{str, 0, Integer.valueOf(str.length())}, -1600183040, 1600183040, 0);
                int i40 = f62207a;
                int i41 = (i40 | 15) << 1;
                int i42 = -(((~i40) & 15) | (i40 & (-16)));
                int i43 = (i41 ^ i42) + ((i42 & i41) << 1);
                f62208b = i43 % 128;
                int i44 = i43 % 2;
            } else {
                int length = str.length();
                int i45 = -(-((length ^ (-1)) | length));
                inetAddress = (InetAddress) setCompoundDrawableTintBlendMode(new Object[]{str, 1, Integer.valueOf(((length | i45) << 1) - (length ^ i45))}, -1600183040, 1600183040, 1);
                int i46 = f62207a;
                int i47 = ((i46 & 56) + (i46 | 56)) - 1;
                f62208b = i47 % 128;
                int i48 = i47 % 2;
            }
        } else {
            inetAddress = (InetAddress) setCompoundDrawableTintBlendMode(new Object[]{str, 0, Integer.valueOf(str.length())}, -1600183040, 1600183040, 0);
            int i49 = f62207a;
            int i410 = (i49 | 15) << 1;
            int i411 = -(((~i49) & 15) | (i49 & (-16)));
            int i412 = (i410 ^ i411) + ((i411 & i410) << 1);
            f62208b = i412 % 128;
            int i413 = i412 % 2;
        }
        if (inetAddress == null) {
            int i50 = f62208b;
            int i51 = i50 & 67;
            int i52 = i51 + ((i50 ^ 67) | i51);
            int i53 = i52 % 128;
            f62207a = i53;
            int i54 = i52 % 2;
            int i55 = i53 & 55;
            int i56 = (i53 | 55) & (~i55);
            int i57 = -(-(i55 << 1));
            int i58 = (i56 ^ i57) + ((i56 & i57) << 1);
            f62208b = i58 % 128;
            int i59 = i58 % 2;
            return null;
        }
        byte[] address = inetAddress.getAddress();
        if (address.length == 16) {
            int i60 = f62208b;
            int i61 = ((i60 | 105) << 1) - (i60 ^ 105);
            f62207a = i61 % 128;
            if (i61 % 2 != 0) {
                Intrinsics.checkNotNullExpressionValue(address, "");
                throw null;
            }
            Intrinsics.checkNotNullExpressionValue(address, "");
            String str2 = (String) setCompoundDrawableTintBlendMode(new Object[]{address}, -96275928, 96275932, (int) System.currentTimeMillis());
            int i62 = f62207a + 59;
            f62208b = i62 % 128;
            int i63 = i62 % 2;
            return str2;
        }
        if (address.length != 4) {
            StringBuilder sb2 = new StringBuilder("Invalid IPv6 address: '");
            sb2.append(str);
            sb2.append('\'');
            throw new AssertionError(sb2.toString());
        }
        int i64 = f62207a;
        int i65 = i64 & 83;
        int i66 = ((((i64 ^ 83) | i65) << 1) - (~(-((i64 | 83) & (~i65))))) - 1;
        f62208b = i66 % 128;
        if (i66 % 2 == 0) {
            hostAddress = inetAddress.getHostAddress();
            int i67 = 24 / 0;
        } else {
            hostAddress = inetAddress.getHostAddress();
        }
        int i68 = f62208b;
        int i69 = i68 ^ 113;
        int i70 = ((i68 & 113) | i69) << 1;
        int i71 = -i69;
        int i72 = (i70 & i71) + (i70 | i71);
        f62207a = i72 % 128;
        int i73 = i72 % 2;
        return hostAddress;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0107 A[PHI: r8
      0x0107: PHI (r8v7 char) = (r8v6 char), (r8v39 char) binds: [B:36:0x0105, B:32:0x00f2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:39:0x010f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0122 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0124  */
    /* JADX WARN: Code duplicated, block: B:50:0x0166 A[LOOP:1: B:28:0x00c8->B:50:0x0166, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:73:0x022e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x0135 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x015a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00f5 A[EDGE_INSN: B:79:0x00f5->B:34:0x00f5 BREAK  A[LOOP:1: B:28:0x00c8->B:50:0x0166], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Boolean b(Object[] objArr) throws Throwable {
        char cCharAt;
        int i10;
        int i11;
        int i12;
        Boolean bool = Boolean.FALSE;
        String str = (String) objArr[0];
        int i13 = 1;
        int iIntValue = ((Number) objArr[1]).intValue();
        int i14 = 2;
        int iIntValue2 = ((Number) objArr[2]).intValue();
        byte[] bArr = (byte[]) objArr[3];
        int iIntValue3 = ((Number) objArr[4]).intValue();
        int i15 = f62207a;
        int i16 = (i15 & 96) + (i15 | 96);
        int i17 = (i16 ^ (-1)) + (i16 << 1);
        f62208b = i17 % 128;
        Throwable th2 = null;
        if (i17 % 2 == 0) {
            throw null;
        }
        int i18 = iIntValue;
        int i19 = iIntValue3;
        while (i18 < iIntValue2) {
            int i20 = f62208b;
            int i21 = (-2) - ((i20 + 52) ^ (-1));
            int i22 = i21 % 128;
            f62207a = i22;
            int i23 = i21 % i14;
            if (i19 == bArr.length) {
                int i24 = (i22 ^ 67) + ((i22 & 67) << i13);
                int i25 = i24 % 128;
                f62208b = i25;
                boolean z10 = (i24 % i14 == 0 ? 0 : i13) ^ 1;
                int i26 = ((i25 & (-42)) | ((~i25) & 41)) + ((i25 & 41) << i13);
                f62207a = i26 % 128;
                if (i26 % i14 == 0) {
                    return Boolean.valueOf(z10);
                }
                throw th2;
            }
            if (i19 != iIntValue3) {
                int i27 = i20 + 45;
                f62207a = i27 % 128;
                int i28 = i27 % i14;
                if (str.charAt(i18) != '.') {
                    int i29 = f62208b;
                    int i30 = i29 ^ 7;
                    int i31 = ((i29 & 7) | i30) << i13;
                    int i32 = -i30;
                    int i33 = ((i31 | i32) << i13) - (i31 ^ i32);
                    f62207a = i33 % 128;
                    return Boolean.valueOf(i33 % i14 != 0 ? i13 : 0);
                }
                i18++;
                int i34 = f62207a + 7;
                f62208b = i34 % 128;
                int i35 = i34 % i14;
            }
            int i36 = f62208b;
            int i37 = i36 & 23;
            int i38 = -(-((i36 ^ 23) | i37));
            int i39 = (i37 ^ i38) + ((i38 & i37) << i13);
            f62207a = i39 % 128;
            int i40 = i39 % i14;
            int i41 = i18;
            int i42 = 0;
            while (i41 < iIntValue2) {
                int i43 = f62207a;
                int i44 = (i43 | 13) << 1;
                int i45 = -((i43 & (-14)) | (13 & (~i43)));
                int i46 = (i44 ^ i45) + ((i44 & i45) << i13);
                f62208b = i46 % 128;
                if (i46 % i14 != 0) {
                    cCharAt = str.charAt(i41);
                    if (Intrinsics.compare((int) cCharAt, 48) < 0) {
                        break;
                    }
                    if (Intrinsics.compare((int) cCharAt, 57) <= 0) {
                        break;
                        break;
                    }
                    int i47 = f62207a;
                    i10 = (((i47 | 122) << 1) - (i47 ^ 122)) - 1;
                    i11 = i10 % 128;
                    f62208b = i11;
                    if (i10 % i14 != 0) {
                        throw null;
                    }
                    if (i42 == 0) {
                        int i48 = (-2) - (((i11 & 122) + (i11 | 122)) ^ (-1));
                        i12 = i48 % 128;
                        f62207a = i12;
                        int i49 = i48 % i14;
                        if (i18 != i41) {
                            int i50 = (i12 & 24) + (i12 | 24);
                            int i51 = (i50 ^ (-1)) + (i50 << i13);
                            f62208b = i51 % 128;
                            int i52 = i51 % i14;
                            return bool;
                        }
                    }
                    int i53 = i42 * 10;
                    int i54 = -(-cCharAt);
                    int i55 = (i53 & i54) + (i54 | i53);
                    int i56 = i55 ^ (-48);
                    i42 = ((((i55 & (-48)) | i56) << i13) - (~(-i56))) - i13;
                    if (i42 > 255) {
                        int i57 = ((i11 | 27) << i13) - (i11 ^ 27);
                        f62207a = i57 % 128;
                        int i58 = i57 % i14;
                        return bool;
                    }
                    int i59 = -(-(i41 * (-903)));
                    int i60 = 905 & i59;
                    int i61 = (((905 ^ i59) | i60) << i13) - ((~i60) & (i59 | 905));
                    int i62 = (-2) & iIntValue;
                    int i63 = (~i62) & ((-2) | iIntValue);
                    int i64 = ~iIntValue;
                    int i65 = ~((i63 ^ i62) | (i63 & i62));
                    int i66 = i64 ^ i41;
                    int i67 = i64 & i41;
                    int i68 = -(~((i65 | (~((i66 ^ i67) | (i66 & i67)))) * (-1808)));
                    int i69 = ((i61 | i68) << i13) - (i68 ^ i61);
                    int i70 = (i69 ^ (-1)) + (i69 << i13);
                    int i71 = ~i41;
                    int i72 = (-2) | i71;
                    int i73 = i72 & iIntValue;
                    int i74 = ~(((~i73) & (i72 | iIntValue)) | i73);
                    Boolean bool2 = bool;
                    int i75 = ((~i64) & 1) | (i64 & (-2)) | (i64 & 1);
                    String str2 = str;
                    int i76 = ((~i75) & i41) | (i75 & i71);
                    int i77 = i75 & i41;
                    int i78 = ~((i77 & i76) | (i76 ^ i77));
                    int i79 = i70 - (~(((i78 & i74) | (i74 ^ i78)) * 904));
                    int i80 = (i79 ^ (-1)) + (i79 << 1);
                    int i81 = ~(((-2) ^ i41) | ((-2) & i41));
                    int i82 = (i41 | i71) & i71;
                    int i83 = (i82 & i64) | ((~i82) & iIntValue);
                    int i84 = i82 & iIntValue;
                    int i85 = ~((i84 & i83) | (i83 ^ i84));
                    int i86 = ((~i85) & i81) | ((~i81) & i85);
                    int i87 = i85 & i81;
                    int i88 = (i87 & i86) | (i86 ^ i87);
                    int i89 = (i64 | iIntValue) & i64;
                    int i90 = i89 & 1;
                    int i91 = (i89 | 1) & (~i90);
                    int i92 = ~((i91 & i90) | (i91 ^ i90));
                    int i93 = ((i88 & i92) | ((~i92) & i88) | ((~i88) & i92)) * 904;
                    int i94 = i80 ^ i93;
                    int i95 = ((((i80 & i93) | i94) << 1) - (~(-i94))) - 1;
                    int i96 = i11 & 111;
                    int i97 = -(-(i11 | 111));
                    int i98 = (i96 & i97) + (i96 | i97);
                    f62207a = i98 % 128;
                    int i99 = i98 % 2;
                    i41 = i95;
                    bool = bool2;
                    str = str2;
                    i13 = 1;
                    i14 = 2;
                } else {
                    cCharAt = str.charAt(i41);
                    if (Intrinsics.compare((int) cCharAt, 40) < 0) {
                        break;
                    }
                    if (Intrinsics.compare((int) cCharAt, 57) <= 0) {
                        break;
                    }
                    int i410 = f62207a;
                    i10 = (((i410 | 122) << 1) - (i410 ^ 122)) - 1;
                    i11 = i10 % 128;
                    f62208b = i11;
                    if (i10 % i14 != 0) {
                        throw null;
                    }
                    if (i42 == 0) {
                        int i411 = (-2) - (((i11 & 122) + (i11 | 122)) ^ (-1));
                        i12 = i411 % 128;
                        f62207a = i12;
                        int i412 = i411 % i14;
                        if (i18 != i41) {
                            int i510 = (i12 & 24) + (i12 | 24);
                            int i511 = (i510 ^ (-1)) + (i510 << i13);
                            f62208b = i511 % 128;
                            int i512 = i511 % i14;
                            return bool;
                        }
                    }
                    int i513 = i42 * 10;
                    int i514 = -(-cCharAt);
                    int i515 = (i513 & i514) + (i514 | i513);
                    int i516 = i515 ^ (-48);
                    i42 = ((((i515 & (-48)) | i516) << i13) - (~(-i516))) - i13;
                    if (i42 > 255) {
                        int i517 = ((i11 | 27) << i13) - (i11 ^ 27);
                        f62207a = i517 % 128;
                        int i518 = i517 % i14;
                        return bool;
                    }
                    int i519 = -(-(i41 * (-903)));
                    int i610 = 905 & i519;
                    int i611 = (((905 ^ i519) | i610) << i13) - ((~i610) & (i519 | 905));
                    int i612 = (-2) & iIntValue;
                    int i613 = (~i612) & ((-2) | iIntValue);
                    int i614 = ~iIntValue;
                    int i615 = ~((i613 ^ i612) | (i613 & i612));
                    int i616 = i614 ^ i41;
                    int i617 = i614 & i41;
                    int i618 = -(~((i615 | (~((i616 ^ i617) | (i616 & i617)))) * (-1808)));
                    int i619 = ((i611 | i618) << i13) - (i618 ^ i611);
                    int i710 = (i619 ^ (-1)) + (i619 << i13);
                    int i711 = ~i41;
                    int i712 = (-2) | i711;
                    int i713 = i712 & iIntValue;
                    int i714 = ~(((~i713) & (i712 | iIntValue)) | i713);
                    Boolean bool3 = bool;
                    int i715 = ((~i614) & 1) | (i614 & (-2)) | (i614 & 1);
                    String str3 = str;
                    int i716 = ((~i715) & i41) | (i715 & i711);
                    int i717 = i715 & i41;
                    int i718 = ~((i717 & i716) | (i716 ^ i717));
                    int i719 = i710 - (~(((i718 & i714) | (i714 ^ i718)) * 904));
                    int i810 = (i719 ^ (-1)) + (i719 << 1);
                    int i811 = ~(((-2) ^ i41) | ((-2) & i41));
                    int i812 = (i41 | i711) & i711;
                    int i813 = (i812 & i614) | ((~i812) & iIntValue);
                    int i814 = i812 & iIntValue;
                    int i815 = ~((i814 & i813) | (i813 ^ i814));
                    int i816 = ((~i815) & i811) | ((~i811) & i815);
                    int i817 = i815 & i811;
                    int i818 = (i817 & i816) | (i816 ^ i817);
                    int i819 = (i614 | iIntValue) & i614;
                    int i910 = i819 & 1;
                    int i911 = (i819 | 1) & (~i910);
                    int i912 = ~((i911 & i910) | (i911 ^ i910));
                    int i913 = ((i818 & i912) | ((~i912) & i818) | ((~i818) & i912)) * 904;
                    int i914 = i810 ^ i913;
                    int i915 = ((((i810 & i913) | i914) << 1) - (~(-i914))) - 1;
                    int i916 = i11 & 111;
                    int i917 = -(-(i11 | 111));
                    int i918 = (i916 & i917) + (i916 | i917);
                    f62207a = i918 % 128;
                    int i919 = i918 % 2;
                    i41 = i915;
                    bool = bool3;
                    str = str3;
                    i13 = 1;
                    i14 = 2;
                }
            }
            Boolean bool4 = bool;
            String str4 = str;
            int i100 = -i18;
            int i101 = i100 * (-1939);
            int i102 = -(~(-(-(i41 * 971))));
            int i103 = ((i101 ^ i102) + ((i101 & i102) << 1)) - 1;
            int i104 = ~i41;
            int i105 = i104 & i100;
            int i106 = (~i105) & (i104 | i100);
            int i107 = ~i100;
            int i108 = ~((i105 & i106) | (i106 ^ i105));
            int i109 = ~iIntValue;
            int i110 = i109 & i41;
            int i111 = ~((i109 & i104) | ((~i109) & i41) | i110);
            int i112 = i108 ^ i111;
            int i113 = i108 & i111;
            int i114 = (((i113 & i112) | (i112 ^ i113)) * (-970)) + i103;
            int i115 = i107 & i104;
            int i116 = ((~i107) & i41) | i115;
            int i117 = i107 & i41;
            int i118 = (i116 & i117) | (i116 ^ i117);
            int i119 = ~i118;
            int i120 = ((i118 | i119) & i119) * 1940;
            int i121 = i114 ^ i120;
            int i122 = (i114 & i120) << 1;
            int i123 = (i121 & i122) + (i122 | i121);
            int i124 = (i107 | i104) & (~i115);
            int i125 = (i124 & i115) | (i124 ^ i115);
            int i126 = ~i125;
            int i127 = (i125 | i126) & i126;
            int i128 = (~i110) & (i109 | i41);
            int i129 = (i128 & i110) | (i128 ^ i110);
            int i130 = ~i129;
            int i131 = (i129 | i130) & i130;
            int i132 = i127 & i131;
            if ((i123 - (~(-(~(-(-((((i127 | i131) & (~i132)) | i132) * 970))))))) - 2 == 0) {
                int i133 = f62207a;
                int i134 = i133 & 119;
                int i135 = (i133 | 119) & (~i134);
                int i136 = i134 << 1;
                int i137 = (i135 & i136) + (i135 | i136);
                int i138 = i137 % 128;
                f62208b = i138;
                int i139 = i137 % 2;
                int i140 = i138 ^ 75;
                int i141 = -(-((i138 & 75) << 1));
                int i142 = ((i140 | i141) << 1) - (i141 ^ i140);
                f62207a = i142 % 128;
                int i143 = i142 % 2;
                return Boolean.FALSE;
            }
            i13 = 1;
            int i144 = (i19 & (-2)) | ((~i19) & 1);
            int i145 = -(-((i19 & 1) << 1));
            int i146 = ((i144 | i145) << 1) - (i144 ^ i145);
            bArr[i19] = (byte) i42;
            int i147 = f62207a;
            int i148 = ((i147 | 47) << 1) - (i147 ^ 47);
            f62208b = i148 % 128;
            int i149 = i148 % 2;
            i18 = i41;
            i19 = i146;
            bool = bool4;
            str = str4;
            i14 = 2;
            th2 = null;
        }
        int i150 = iIntValue3 & 4;
        int i151 = -(-((4 ^ iIntValue3) | i150));
        if (i19 != (i150 & i151) + (i150 | i151)) {
            int i152 = f62207a + 115;
            f62208b = i152 % 128;
            if (i152 % 2 != 0) {
                return Boolean.FALSE;
            }
            throw null;
        }
        int i153 = f62207a;
        int i154 = i153 + 29;
        f62208b = i154 % 128;
        int i155 = i154 % 2;
        int i156 = i153 + 107;
        f62208b = i156 % 128;
        int i157 = i156 % 2;
        return Boolean.TRUE;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0286  */
    /* JADX WARN: Code duplicated, block: B:50:0x0376  */
    /* JADX WARN: Code duplicated, block: B:52:0x0398 A[LOOP:1: B:47:0x0284->B:52:0x0398, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:59:0x04f5  */
    /* JADX WARN: Code duplicated, block: B:61:0x050a  */
    /* JADX WARN: Code duplicated, block: B:64:0x050f  */
    /* JADX WARN: Code duplicated, block: B:82:0x0671 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x046a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x0671 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x0671 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x0514 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x0514 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x0467 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x0487 A[SYNTHETIC] */
    public static /* synthetic */ InetAddress c(Object[] objArr) throws UnknownHostException {
        byte[] bArr;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        byte[] bArr2;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int iIntValue;
        int i31 = 0;
        String str = (String) objArr[0];
        int i32 = 1;
        int iIntValue2 = ((Number) objArr[1]).intValue();
        int i33 = 2;
        int iIntValue3 = ((Number) objArr[2]).intValue();
        int i34 = f62208b;
        int i35 = (i34 & 39) + (i34 | 39);
        f62207a = i35 % 128;
        if (i35 % 2 != 0) {
            bArr = new byte[50];
            i10 = 1;
        } else {
            bArr = new byte[16];
            i10 = 0;
        }
        int i36 = i34 & 115;
        int i37 = i34 | 115;
        int i38 = (i36 ^ i37) + ((i37 & i36) << 1);
        f62207a = i38 % 128;
        int i39 = i38 % 2;
        int i40 = -1;
        int i41 = i10;
        int i42 = iIntValue2;
        int i43 = -1;
        int i44 = -1;
        while (true) {
            if (i42 < iIntValue3) {
                int i45 = f62208b;
                int i46 = i45 & 103;
                int i47 = ((i45 ^ 103) | i46) << i32;
                int i48 = -((i45 | 103) & (~i46));
                int i49 = (i47 ^ i48) + ((i48 & i47) << i32);
                int i50 = i49 % 128;
                f62207a = i50;
                int i51 = i49 % i33;
                if (i41 == bArr.length) {
                    int i52 = i50 + 57;
                    f62208b = i52 % 128;
                    if (i52 % i33 == 0) {
                        int i53 = 21 / i31;
                    }
                    return null;
                }
                int i54 = i42 & 2;
                int i55 = ((i42 ^ 2) | i54) << i32;
                int i56 = -((~i54) & (i42 | 2));
                if ((i55 & i56) + (i55 | i56) <= iIntValue3) {
                    i11 = i44;
                    if (l.startsWith$default(str, "::", i42, false, 4, null)) {
                        int i57 = f62208b;
                        int i58 = (i57 ^ 29) + ((i57 & 29) << i32);
                        int i59 = i58 % 128;
                        f62207a = i59;
                        int i60 = i58 % i33;
                        if (i11 != i40) {
                            int i61 = i59 & 55;
                            int i62 = ((i59 ^ 55) | i61) << i32;
                            int i63 = -((~i61) & (i59 | 55));
                            int i64 = (i62 & i63) + (i62 | i63);
                            f62208b = i64 % 128;
                            int i65 = i64 % i33;
                            int i66 = i59 & 11;
                            int i67 = (~i66) & (i59 | 11);
                            int i68 = -(-(i66 << i32));
                            int i69 = ((i67 | i68) << i32) - (i68 ^ i67);
                            f62208b = i69 % 128;
                            int i70 = i69 % i33;
                            return null;
                        }
                        int i71 = (i42 ^ (-64)) + ((i42 & (-64)) << i32);
                        i14 = (i71 & 66) + (i71 | 66);
                        int i72 = i41 + 62;
                        i41 = ((i72 & (-60)) - (~(-(-(i72 | (-60)))))) - 1;
                        if (i14 == iIntValue3) {
                            int i73 = i57 + 101;
                            f62207a = i73 % 128;
                            int i74 = i73 % i33;
                            i44 = i41;
                            break;
                        }
                        i12 = i41;
                    }
                    i13 = i14;
                    int i75 = f62207a;
                    int i76 = ((i75 | 5) << i32) - (i75 ^ 5);
                    f62208b = i76 % 128;
                    int i77 = i76 % 2;
                    i15 = i13;
                    i16 = 0;
                    while (true) {
                        if (i15 < iIntValue3) {
                            i17 = i12;
                            i18 = iIntValue3;
                            bArr2 = bArr;
                            break;
                        }
                        int i78 = 1537734510 & iIntValue2;
                        int i79 = (1537734510 | iIntValue2) & (~i78);
                        i24 = ~iIntValue2;
                        int i80 = (i79 & i78) | (i79 ^ i78);
                        int i81 = ~i80;
                        int i82 = (i80 | i81) & i81;
                        int i83 = ((~i82) & 50630696) | (i82 & (-50630697));
                        int i84 = i82 & 50630696;
                        int i85 = 1140371099 - (~(-(-(((i83 ^ i84) | (i84 & i83)) * 449))));
                        int i86 = i85 & 519929224;
                        int i87 = (((519929224 | i85) & (~i86)) - (~(i86 << i32))) - i32;
                        i25 = ~i24;
                        int i88 = (329700456 & i25) | (i24 & (-329700457));
                        int i89 = 329700456 & i24;
                        int i90 = (i88 ^ i89) | (i89 & i88);
                        int i91 = ((-1258664751) & i90) | (1258664750 & (~i90));
                        int i92 = i90 & 1258664750;
                        int i93 = ~((i92 & i91) | (i91 ^ i92));
                        int i94 = 50630696 & i93;
                        int i95 = (i93 | 50630696) & (~i94);
                        int i96 = -(-(((i95 & i94) | (i95 ^ i94)) * 449));
                        i26 = ((i87 | i96) << 1) - (i87 ^ i96);
                        int i97 = (1375077373 & i25) | (i24 & (-1375077374));
                        int i98 = 1375077373 & i24;
                        int i99 = (i98 & i97) | (i97 ^ i98);
                        int i100 = ~i99;
                        int i101 = (i99 | i100) & i100;
                        int i102 = (i101 & 465344965) | (465344965 ^ i101);
                        int i103 = (-1375077374) ^ iIntValue2;
                        int i104 = (-1375077374) & iIntValue2;
                        int i105 = ~((i103 ^ i104) | (i104 & i103));
                        int i106 = i102 & i105;
                        int i107 = -(-((((i102 | i105) & (~i106)) | i106) * (-564)));
                        int i108 = ((~i107) & 466575068) | ((-466575069) & i107);
                        int i109 = -(-((i107 & 466575068) << 1));
                        int i110 = (i108 ^ i109) + ((i109 & i108) << 1);
                        int i111 = (-1078067769) ^ iIntValue2;
                        int i112 = (-1078067769) & iIntValue2;
                        int i113 = -(-((~((i112 & i111) | (i111 ^ i112))) * 1128));
                        i27 = ((((~i113) & i110) | ((~i110) & i113)) - (~((i113 & i110) << 1))) - 1;
                        int i114 = 465344965 & i24;
                        int i115 = (465344965 | i24) & (~i114);
                        int i116 = ~((i115 & i114) | (i115 ^ i114));
                        i28 = i116 & 297009605;
                        i17 = i12;
                        i29 = (i116 | 297009605) & (~i28);
                        if (i26 > (((i29 & i28) | (i29 ^ i28)) * 564) + i27) {
                            ((Integer) yt.setY(new Object[]{Character.valueOf(str.charAt(i15))}, -1275601009, 1275601040, (int) System.currentTimeMillis())).intValue();
                            throw null;
                        }
                        i30 = iIntValue3;
                        bArr2 = bArr;
                        iIntValue = ((Integer) yt.setY(new Object[]{Character.valueOf(str.charAt(i15))}, -1275601009, 1275601040, (int) System.currentTimeMillis())).intValue();
                        if (iIntValue != -1) {
                            i18 = i30;
                            break;
                        }
                        int i117 = f62208b;
                        int i118 = (i117 ^ 3) + ((i117 & 3) << 1);
                        f62207a = i118 % 128;
                        int i119 = i118 % 2;
                        int i120 = i16 << 4;
                        int i121 = ((i120 & iIntValue) << 1) + (i120 ^ iIntValue);
                        int i122 = -(-(i15 * (-317)));
                        int i123 = 319 & i122;
                        int i124 = (i122 | 319) & (~i123);
                        int i125 = -(-(i123 << 1));
                        int i126 = (i124 ^ i125) + ((i124 & i125) << 1);
                        int i127 = ~i15;
                        int i128 = (i127 | i15) & i127;
                        int i129 = (-2) ^ iIntValue2;
                        int i130 = (-2) & iIntValue2;
                        int i131 = ~((i129 ^ i130) | (i129 & i130));
                        int i132 = (~i131) & i128;
                        int i133 = ~i128;
                        int i134 = i132 | (i131 & i133);
                        int i135 = i131 & i128;
                        int i136 = -(-(((i134 ^ i135) | (i135 & i134)) * (-318)));
                        int i137 = i126 & i136;
                        int i138 = i137 + ((i126 ^ i136) | i137);
                        int i139 = i127 & iIntValue2;
                        int i140 = (~i139) & (i127 | iIntValue2);
                        int i141 = ~((i140 ^ i139) | (i139 & i140));
                        int i142 = i24 & 1;
                        int i143 = ((~i142) & (i24 | 1)) | i142;
                        int i144 = (i127 & i143) | ((~i143) & i15);
                        int i145 = i143 & i15;
                        int i146 = ~((i145 & i144) | (i144 ^ i145));
                        int i147 = ((i146 & i141) | (i141 ^ i146)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET;
                        int i148 = i138 | i147;
                        int i149 = (i148 << 1) - ((~(i147 & i138)) & i148);
                        int i150 = (i133 & i24) | (i128 & i25) | (i128 & i24);
                        int i151 = ~((i150 & 1) | (i150 ^ 1));
                        int i152 = i15 ^ 1;
                        int i153 = i15 & 1;
                        int i154 = (i152 & i153) | (i152 ^ i153);
                        int i155 = (i154 & i24) | ((~i154) & iIntValue2);
                        int i156 = i154 & iIntValue2;
                        int i157 = ~((i156 & i155) | (i155 ^ i156));
                        int i158 = i151 & i157;
                        int i159 = (i151 | i157) & (~i158);
                        i15 = (i149 - (~(-(~(-(-(((i159 & i158) | (i159 ^ i158)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET))))))) - 2;
                        int i160 = i117 & 111;
                        int i161 = (i117 ^ 111) | i160;
                        i32 = 1;
                        int i162 = ((i160 | i161) << 1) - (i160 ^ i161);
                        f62207a = i162 % 128;
                        int i163 = i162 % 2;
                        i12 = i17;
                        bArr = bArr2;
                        i16 = i121;
                        iIntValue3 = i30;
                    }
                    int i164 = -i13;
                    int i165 = ~i164;
                    int i166 = i15 & i165;
                    int i167 = (~i166) & (i15 | i165);
                    int i168 = (-2) - (((((i15 * (-159)) + (i164 * (-159))) - (~(-(~(((i167 & i166) | (i167 ^ i166)) * 160))))) - 1) ^ (-1));
                    i19 = ~iIntValue2;
                    i20 = ~i19;
                    int i169 = (i165 & i19) | (i164 & i20);
                    int i170 = i19 & i164;
                    int i171 = ~((i169 & i170) | (i169 ^ i170));
                    int i172 = ~i15;
                    int i173 = i166 | (i164 & i172);
                    int i174 = i164 & i15;
                    int i175 = ~((i173 & i174) | (i173 ^ i174));
                    int i176 = ((~i175) & i171) | ((~i171) & i175);
                    int i177 = i171 & i175;
                    int i178 = ((i177 & i176) | (i176 ^ i177)) * (-160);
                    int i179 = ((~i178) & i168) | ((~i168) & i178);
                    int i180 = -(-((i178 & i168) << 1));
                    int i181 = (i179 ^ i180) + ((i180 & i179) << 1);
                    int i182 = (i172 ^ i19) | (i172 & i19);
                    int i183 = ~i182;
                    int i184 = (i182 | i183) & i183;
                    int i185 = i164 ^ i184;
                    int i186 = i164 & i184;
                    i21 = (i181 - (~(-(-(((i186 & i185) | (i185 ^ i186)) * 160))))) - 1;
                    if (i21 != 0) {
                        i22 = f62208b;
                        int i187 = i22 & 99;
                        i23 = (((~i187) & (i22 | 99)) - (~(i187 << 1))) - 1;
                        f62207a = i23 % 128;
                        if (i23 % 2 != 0) {
                            if (i21 > 3) {
                                int i188 = -(-(i41 * (-219)));
                                int i189 = ((221 | i188) << 1) - ((i188 & (-222)) | (221 & (~i188)));
                                int i190 = ~i41;
                                int i191 = (i190 | i41) & i190;
                                int i192 = ((-2) & (~i191)) | (i191 & 1);
                                int i193 = (-2) & i191;
                                int i194 = ~((i193 & i192) | (i192 ^ i193));
                                int i195 = (i19 | iIntValue2) & i19;
                                int i196 = ~i195;
                                int i197 = (i195 & (-2)) | (i196 & 1);
                                int i198 = i195 & 1;
                                int i199 = (i197 ^ i198) | (i197 & i198);
                                int i200 = ~((i199 ^ i41) | (i199 & i41));
                                String str2 = str;
                                int i201 = i194 & i200;
                                int i202 = i13;
                                int i203 = (i194 | i200) & (~i201);
                                int i204 = -(-(((i201 & i203) | (i203 ^ i201)) * 220));
                                int i205 = (((~i204) & i189) | ((~i189) & i204)) + ((i204 & i189) << 1);
                                int i206 = (i195 & i190) | (i41 & i196);
                                int i207 = i195 & i41;
                                int i208 = (i206 & i207) | (i206 ^ i207);
                                int i209 = ~i208;
                                int i210 = (i208 | i209) & i209;
                                int i211 = ((i210 & 1) | (i210 ^ 1)) * (-440);
                                int i212 = (i205 ^ i211) + ((i211 & i205) << 1);
                                int i213 = i41 | 1;
                                int i214 = (i213 & i19) | ((~i213) & iIntValue2);
                                int i215 = i213 & iIntValue2;
                                int i216 = -(-(((i215 & i214) | (i214 ^ i215)) * 220));
                                int i217 = i212 & i216;
                                int i218 = i216 | i212;
                                int i219 = (i217 & i218) + (i218 | i217);
                                bArr2[i41] = (byte) (i16 >>> 8);
                                int i220 = i219 * (-183);
                                int i221 = (-183) | i220;
                                int i222 = i221 << 1;
                                int i223 = -((~(i220 & (-183))) & i221);
                                int i224 = (i222 & i223) + (i223 | i222);
                                int i225 = (-2) & i19;
                                int i226 = (~i225) & ((-2) | i19);
                                int i227 = (i226 & i225) | (i226 ^ i225);
                                int i228 = ~i219;
                                int i229 = (i227 & i228) | ((~i227) & i219);
                                int i230 = i227 & i219;
                                int i231 = (i230 & i229) | (i229 ^ i230);
                                int i232 = ~i231;
                                int i233 = (i231 | i232) & i232;
                                int i234 = i228 ^ i195;
                                int i235 = i228 & i195;
                                int i236 = (i234 ^ i235) | (i234 & i235);
                                int i237 = i236 & 1;
                                int i238 = (i236 | 1) & (~i237);
                                int i239 = ~((i238 & i237) | (i238 ^ i237));
                                int i240 = ((~i239) & i233) | ((~i233) & i239);
                                int i241 = i233 & i239;
                                int i242 = (i224 - (~(((i241 & i240) | (i240 ^ i241)) * (-184)))) - 1;
                                int i243 = (-2) ^ i228;
                                int i244 = (-2) & i228;
                                int i245 = (i243 & i244) | (i243 ^ i244);
                                int i246 = ~i245;
                                int i247 = (i245 | i246) & i246;
                                int i248 = (i19 & 1) | ((-2) & i20);
                                int i249 = ~((i225 & i248) | (i248 ^ i225));
                                int i250 = i247 ^ i249;
                                int i251 = i249 & i247;
                                int i252 = (i251 & i250) | (i250 ^ i251);
                                int i253 = (i228 | i219) & i228;
                                int i254 = (i253 & i196) | ((~i253) & i195);
                                int i255 = i253 & i195;
                                int i256 = ~((i255 & i254) | (i254 ^ i255));
                                int i257 = ((~i256) & i252) | ((~i252) & i256);
                                int i258 = i252 & i256;
                                int i259 = ((i258 & i257) | (i257 ^ i258)) * 184;
                                int i260 = i242 & i259;
                                int i261 = -(-(i259 | i242));
                                int i262 = ((i260 | i261) << 1) - (i261 ^ i260);
                                int i263 = -(~(-(-(((i228 & 1) | (i219 & (-2)) | (i219 & 1)) * 184))));
                                i41 = ((i262 ^ i263) + ((i263 & i262) << 1)) - 1;
                                bArr2[i219] = (byte) i16;
                                int i264 = ((i22 ^ 71) | (i22 & 71)) << 1;
                                int i265 = -((i22 & (-72)) | ((~i22) & 71));
                                int i266 = ((i264 | i265) << 1) - (i264 ^ i265);
                                f62207a = i266 % 128;
                                int i267 = i266 % 2;
                                i44 = i17;
                                bArr = bArr2;
                                i43 = i202;
                                str = str2;
                                i42 = i15;
                                iIntValue3 = i18;
                                i31 = 0;
                                i32 = 1;
                                i33 = 2;
                                i40 = -1;
                            }
                        } else if (i21 > 4) {
                            int i1810 = -(-(i41 * (-219)));
                            int i1811 = ((221 | i1810) << 1) - ((i1810 & (-222)) | (221 & (~i1810)));
                            int i1910 = ~i41;
                            int i1911 = (i1910 | i41) & i1910;
                            int i1912 = ((-2) & (~i1911)) | (i1911 & 1);
                            int i1913 = (-2) & i1911;
                            int i1914 = ~((i1913 & i1912) | (i1912 ^ i1913));
                            int i1915 = (i19 | iIntValue2) & i19;
                            int i1916 = ~i1915;
                            int i1917 = (i1915 & (-2)) | (i1916 & 1);
                            int i1918 = i1915 & 1;
                            int i1919 = (i1917 ^ i1918) | (i1917 & i1918);
                            int i2010 = ~((i1919 ^ i41) | (i1919 & i41));
                            String str3 = str;
                            int i2011 = i1914 & i2010;
                            int i2012 = i13;
                            int i2013 = (i1914 | i2010) & (~i2011);
                            int i2014 = -(-(((i2011 & i2013) | (i2013 ^ i2011)) * 220));
                            int i2015 = (((~i2014) & i1811) | ((~i1811) & i2014)) + ((i2014 & i1811) << 1);
                            int i2016 = (i1915 & i1910) | (i41 & i1916);
                            int i2017 = i1915 & i41;
                            int i2018 = (i2016 & i2017) | (i2016 ^ i2017);
                            int i2019 = ~i2018;
                            int i2110 = (i2018 | i2019) & i2019;
                            int i2111 = ((i2110 & 1) | (i2110 ^ 1)) * (-440);
                            int i2112 = (i2015 ^ i2111) + ((i2111 & i2015) << 1);
                            int i2113 = i41 | 1;
                            int i2114 = (i2113 & i19) | ((~i2113) & iIntValue2);
                            int i2115 = i2113 & iIntValue2;
                            int i2116 = -(-(((i2115 & i2114) | (i2114 ^ i2115)) * 220));
                            int i2117 = i2112 & i2116;
                            int i2118 = i2116 | i2112;
                            int i2119 = (i2117 & i2118) + (i2118 | i2117);
                            bArr2[i41] = (byte) (i16 >>> 8);
                            int i2210 = i2119 * (-183);
                            int i2211 = (-183) | i2210;
                            int i2212 = i2211 << 1;
                            int i2213 = -((~(i2210 & (-183))) & i2211);
                            int i2214 = (i2212 & i2213) + (i2213 | i2212);
                            int i2215 = (-2) & i19;
                            int i2216 = (~i2215) & ((-2) | i19);
                            int i2217 = (i2216 & i2215) | (i2216 ^ i2215);
                            int i2218 = ~i2119;
                            int i2219 = (i2217 & i2218) | ((~i2217) & i2119);
                            int i2310 = i2217 & i2119;
                            int i2311 = (i2310 & i2219) | (i2219 ^ i2310);
                            int i2312 = ~i2311;
                            int i2313 = (i2311 | i2312) & i2312;
                            int i2314 = i2218 ^ i1915;
                            int i2315 = i2218 & i1915;
                            int i2316 = (i2314 ^ i2315) | (i2314 & i2315);
                            int i2317 = i2316 & 1;
                            int i2318 = (i2316 | 1) & (~i2317);
                            int i2319 = ~((i2318 & i2317) | (i2318 ^ i2317));
                            int i2410 = ((~i2319) & i2313) | ((~i2313) & i2319);
                            int i2411 = i2313 & i2319;
                            int i2412 = (i2214 - (~(((i2411 & i2410) | (i2410 ^ i2411)) * (-184)))) - 1;
                            int i2413 = (-2) ^ i2218;
                            int i2414 = (-2) & i2218;
                            int i2415 = (i2413 & i2414) | (i2413 ^ i2414);
                            int i2416 = ~i2415;
                            int i2417 = (i2415 | i2416) & i2416;
                            int i2418 = (i19 & 1) | ((-2) & i20);
                            int i2419 = ~((i2215 & i2418) | (i2418 ^ i2215));
                            int i2510 = i2417 ^ i2419;
                            int i2511 = i2419 & i2417;
                            int i2512 = (i2511 & i2510) | (i2510 ^ i2511);
                            int i2513 = (i2218 | i2119) & i2218;
                            int i2514 = (i2513 & i1916) | ((~i2513) & i1915);
                            int i2515 = i2513 & i1915;
                            int i2516 = ~((i2515 & i2514) | (i2514 ^ i2515));
                            int i2517 = ((~i2516) & i2512) | ((~i2512) & i2516);
                            int i2518 = i2512 & i2516;
                            int i2519 = ((i2518 & i2517) | (i2517 ^ i2518)) * 184;
                            int i268 = i2412 & i2519;
                            int i269 = -(-(i2519 | i2412));
                            int i2610 = ((i268 | i269) << 1) - (i269 ^ i268);
                            int i2611 = -(~(-(-(((i2218 & 1) | (i2119 & (-2)) | (i2119 & 1)) * 184))));
                            i41 = ((i2610 ^ i2611) + ((i2611 & i2610) << 1)) - 1;
                            bArr2[i2119] = (byte) i16;
                            int i2612 = ((i22 ^ 71) | (i22 & 71)) << 1;
                            int i2613 = -((i22 & (-72)) | ((~i22) & 71));
                            int i2614 = ((i2612 | i2613) << 1) - (i2612 ^ i2613);
                            f62207a = i2614 % 128;
                            int i2615 = i2614 % 2;
                            i44 = i17;
                            bArr = bArr2;
                            i43 = i2012;
                            str = str3;
                            i42 = i15;
                            iIntValue3 = i18;
                            i31 = 0;
                            i32 = 1;
                            i33 = 2;
                            i40 = -1;
                        }
                    }
                    int i270 = f62208b;
                    int i271 = i270 & 119;
                    int i272 = (i270 | 119) & (~i271);
                    int i273 = i271 << 1;
                    int i274 = ((i272 | i273) << 1) - (i272 ^ i273);
                    f62207a = i274 % 128;
                    int i275 = i274 % 2;
                    return null;
                }
                i11 = i44;
                if (i41 != 0) {
                    int i276 = f62208b + 22;
                    int i277 = (i276 ^ (-1)) + (i276 << i32);
                    f62207a = i277 % 128;
                    int i278 = i277 % i33;
                    if (l.startsWith$default(str, DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER, i42, false, 4, null)) {
                        int i279 = f62207a;
                        int i280 = ((i279 & (-18)) | (17 & (~i279))) + ((i279 & 17) << i32);
                        int i281 = i280 % 128;
                        f62208b = i281;
                        int i282 = i280 % i33;
                        int i283 = i42 & 1;
                        i14 = ((~i283) & (i42 | 1)) + (i283 << i32);
                        int i284 = i281 & 75;
                        int i285 = (i281 ^ 75) | i284;
                        int i286 = (i284 & i285) + (i285 | i284);
                        f62207a = i286 % 128;
                        int i287 = i286 % i33;
                        i12 = i11;
                        i13 = i14;
                    } else {
                        if (!l.startsWith$default(str, Constant.DOT_STRING, i42, false, 4, null)) {
                            int i288 = f62208b + 13;
                            f62207a = i288 % 128;
                            int i289 = i288 % 2;
                            return null;
                        }
                        int i290 = f62207a;
                        int i291 = i290 & 81;
                        int i292 = i291 + ((i290 ^ 81) | i291);
                        f62208b = i292 % 128;
                        int i293 = i292 % i33;
                        int i294 = 1037 - (~(i41 * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY));
                        int i295 = ~i41;
                        int i296 = i32 | i295;
                        int i297 = ~iIntValue2;
                        int i298 = ((~i297) & i296) | ((~i296) & i297);
                        int i299 = i296 & i297;
                        int i300 = ~((i299 & i298) | (i298 ^ i299));
                        int i301 = (i41 & i297) | (iIntValue2 & i295);
                        int i302 = i41 & iIntValue2;
                        int i303 = (i301 & i302) | (i301 ^ i302);
                        int i304 = ~i303;
                        int i305 = (i303 | i304) & i304;
                        int i306 = ((~i305) & i300) | ((~i300) & i305);
                        int i307 = i300 & i305;
                        int i308 = (i294 - (~(-(-(((i307 & i306) | (i306 ^ i307)) * 520))))) - i32;
                        int i309 = (i295 | i41) & i295;
                        int i310 = (i297 | iIntValue2) & i297;
                        int i311 = i309 & i310;
                        int i312 = (i309 | i310) & (~i311);
                        int i313 = ~((i312 & i311) | (i312 ^ i311));
                        int i314 = ((-2) & i297) | (iIntValue2 & 1);
                        int i315 = (-2) & iIntValue2;
                        int i316 = ~((i314 ^ i315) | (i314 & i315));
                        int i317 = i313 & i316;
                        int i318 = (i313 | i316) & (~i317);
                        int i319 = ((i318 & i317) | (i318 ^ i317)) * (-1040);
                        int i320 = i308 & i319;
                        int i321 = ((i308 ^ i319) | i320) << i32;
                        int i322 = -((i308 | i319) & (~i320));
                        int i323 = (i321 & i322) + (i322 | i321);
                        int i324 = i32 ^ i297;
                        int i325 = i297 & i32;
                        int i326 = (i324 & i325) | (i324 ^ i325);
                        int i327 = ~i326;
                        int i328 = (i326 | i327) & i327;
                        int i329 = (i295 & (-2)) | (i295 & 1) | ((-2) & (~i295));
                        int i330 = ~i329;
                        int i331 = (i329 | i330) & i330;
                        int i332 = (i328 & i331) | (i328 ^ i331);
                        int i333 = i314 | i315;
                        int i334 = ~i333;
                        int i335 = (i333 | i334) & i334;
                        int i336 = i332 & i335;
                        int i337 = (i332 | i335) & (~i336);
                        int i338 = ((i337 & i336) | (i337 ^ i336)) * 520;
                        int i339 = i323 & i338;
                        int i340 = i339 + ((i338 ^ i323) | i339);
                        Object[] objArr2 = new Object[5];
                        objArr2[0] = str;
                        objArr2[i32] = Integer.valueOf(i43);
                        objArr2[2] = Integer.valueOf(iIntValue3);
                        objArr2[3] = bArr;
                        objArr2[4] = Integer.valueOf(i340);
                        if (!((Boolean) setCompoundDrawableTintBlendMode(objArr2, 1361118652, -1361118651, i43)).booleanValue()) {
                            int i341 = f62208b + 87;
                            int i342 = i341 % 128;
                            f62207a = i342;
                            int i343 = i341 % 2;
                            int i344 = ((((i342 ^ 125) | (i342 & 125)) << i32) - (~(-(((~i342) & 125) | (i342 & (-126)))))) - i32;
                            f62208b = i344 % 128;
                            if (i344 % 2 != 0) {
                                return null;
                            }
                            throw null;
                        }
                        int i345 = i41 & 2;
                        int i346 = i41 | 2;
                        i41 = (i345 ^ i346) + ((i345 & i346) << i32);
                        i44 = i11;
                    }
                } else {
                    i12 = i11;
                    i13 = i42;
                }
                int i710 = f62207a;
                int i711 = ((i710 | 5) << i32) - (i710 ^ 5);
                f62208b = i711 % 128;
                int i712 = i711 % 2;
                i15 = i13;
                i16 = 0;
                while (true) {
                    if (i15 < iIntValue3) {
                        i17 = i12;
                        i18 = iIntValue3;
                        bArr2 = bArr;
                        break;
                    }
                    int i713 = 1537734510 & iIntValue2;
                    int i714 = (1537734510 | iIntValue2) & (~i713);
                    i24 = ~iIntValue2;
                    int i810 = (i714 & i713) | (i714 ^ i713);
                    int i811 = ~i810;
                    int i812 = (i810 | i811) & i811;
                    int i813 = ((~i812) & 50630696) | (i812 & (-50630697));
                    int i814 = i812 & 50630696;
                    int i815 = 1140371099 - (~(-(-(((i813 ^ i814) | (i814 & i813)) * 449))));
                    int i816 = i815 & 519929224;
                    int i817 = (((519929224 | i815) & (~i816)) - (~(i816 << i32))) - i32;
                    i25 = ~i24;
                    int i818 = (329700456 & i25) | (i24 & (-329700457));
                    int i819 = 329700456 & i24;
                    int i910 = (i818 ^ i819) | (i819 & i818);
                    int i911 = ((-1258664751) & i910) | (1258664750 & (~i910));
                    int i912 = i910 & 1258664750;
                    int i913 = ~((i912 & i911) | (i911 ^ i912));
                    int i914 = 50630696 & i913;
                    int i915 = (i913 | 50630696) & (~i914);
                    int i916 = -(-(((i915 & i914) | (i915 ^ i914)) * 449));
                    i26 = ((i817 | i916) << 1) - (i817 ^ i916);
                    int i917 = (1375077373 & i25) | (i24 & (-1375077374));
                    int i918 = 1375077373 & i24;
                    int i919 = (i918 & i917) | (i917 ^ i918);
                    int i1010 = ~i919;
                    int i1011 = (i919 | i1010) & i1010;
                    int i1012 = (i1011 & 465344965) | (465344965 ^ i1011);
                    int i1013 = (-1375077374) ^ iIntValue2;
                    int i1014 = (-1375077374) & iIntValue2;
                    int i1015 = ~((i1013 ^ i1014) | (i1014 & i1013));
                    int i1016 = i1012 & i1015;
                    int i1017 = -(-((((i1012 | i1015) & (~i1016)) | i1016) * (-564)));
                    int i1018 = ((~i1017) & 466575068) | ((-466575069) & i1017);
                    int i1019 = -(-((i1017 & 466575068) << 1));
                    int i1110 = (i1018 ^ i1019) + ((i1019 & i1018) << 1);
                    int i1111 = (-1078067769) ^ iIntValue2;
                    int i1112 = (-1078067769) & iIntValue2;
                    int i1113 = -(-((~((i1112 & i1111) | (i1111 ^ i1112))) * 1128));
                    i27 = ((((~i1113) & i1110) | ((~i1110) & i1113)) - (~((i1113 & i1110) << 1))) - 1;
                    int i1114 = 465344965 & i24;
                    int i1115 = (465344965 | i24) & (~i1114);
                    int i1116 = ~((i1115 & i1114) | (i1115 ^ i1114));
                    i28 = i1116 & 297009605;
                    i17 = i12;
                    i29 = (i1116 | 297009605) & (~i28);
                    if (i26 > (((i29 & i28) | (i29 ^ i28)) * 564) + i27) {
                        ((Integer) yt.setY(new Object[]{Character.valueOf(str.charAt(i15))}, -1275601009, 1275601040, (int) System.currentTimeMillis())).intValue();
                        throw null;
                    }
                    i30 = iIntValue3;
                    bArr2 = bArr;
                    iIntValue = ((Integer) yt.setY(new Object[]{Character.valueOf(str.charAt(i15))}, -1275601009, 1275601040, (int) System.currentTimeMillis())).intValue();
                    if (iIntValue != -1) {
                        i18 = i30;
                        break;
                    }
                    int i1117 = f62208b;
                    int i1118 = (i1117 ^ 3) + ((i1117 & 3) << 1);
                    f62207a = i1118 % 128;
                    int i1119 = i1118 % 2;
                    int i1210 = i16 << 4;
                    int i1211 = ((i1210 & iIntValue) << 1) + (i1210 ^ iIntValue);
                    int i1212 = -(-(i15 * (-317)));
                    int i1213 = 319 & i1212;
                    int i1214 = (i1212 | 319) & (~i1213);
                    int i1215 = -(-(i1213 << 1));
                    int i1216 = (i1214 ^ i1215) + ((i1214 & i1215) << 1);
                    int i1217 = ~i15;
                    int i1218 = (i1217 | i15) & i1217;
                    int i1219 = (-2) ^ iIntValue2;
                    int i1310 = (-2) & iIntValue2;
                    int i1311 = ~((i1219 ^ i1310) | (i1219 & i1310));
                    int i1312 = (~i1311) & i1218;
                    int i1313 = ~i1218;
                    int i1314 = i1312 | (i1311 & i1313);
                    int i1315 = i1311 & i1218;
                    int i1316 = -(-(((i1314 ^ i1315) | (i1315 & i1314)) * (-318)));
                    int i1317 = i1216 & i1316;
                    int i1318 = i1317 + ((i1216 ^ i1316) | i1317);
                    int i1319 = i1217 & iIntValue2;
                    int i1410 = (~i1319) & (i1217 | iIntValue2);
                    int i1411 = ~((i1410 ^ i1319) | (i1319 & i1410));
                    int i1412 = i24 & 1;
                    int i1413 = ((~i1412) & (i24 | 1)) | i1412;
                    int i1414 = (i1217 & i1413) | ((~i1413) & i15);
                    int i1415 = i1413 & i15;
                    int i1416 = ~((i1415 & i1414) | (i1414 ^ i1415));
                    int i1417 = ((i1416 & i1411) | (i1411 ^ i1416)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET;
                    int i1418 = i1318 | i1417;
                    int i1419 = (i1418 << 1) - ((~(i1417 & i1318)) & i1418);
                    int i1510 = (i1313 & i24) | (i1218 & i25) | (i1218 & i24);
                    int i1511 = ~((i1510 & 1) | (i1510 ^ 1));
                    int i1512 = i15 ^ 1;
                    int i1513 = i15 & 1;
                    int i1514 = (i1512 & i1513) | (i1512 ^ i1513);
                    int i1515 = (i1514 & i24) | ((~i1514) & iIntValue2);
                    int i1516 = i1514 & iIntValue2;
                    int i1517 = ~((i1516 & i1515) | (i1515 ^ i1516));
                    int i1518 = i1511 & i1517;
                    int i1519 = (i1511 | i1517) & (~i1518);
                    i15 = (i1419 - (~(-(~(-(-(((i1519 & i1518) | (i1519 ^ i1518)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET))))))) - 2;
                    int i1610 = i1117 & 111;
                    int i1611 = (i1117 ^ 111) | i1610;
                    i32 = 1;
                    int i1612 = ((i1610 | i1611) << 1) - (i1610 ^ i1611);
                    f62207a = i1612 % 128;
                    int i1613 = i1612 % 2;
                    i12 = i17;
                    bArr = bArr2;
                    i16 = i1211;
                    iIntValue3 = i30;
                }
                int i1614 = -i13;
                int i1615 = ~i1614;
                int i1616 = i15 & i1615;
                int i1617 = (~i1616) & (i15 | i1615);
                int i1618 = (-2) - (((((i15 * (-159)) + (i1614 * (-159))) - (~(-(~(((i1617 & i1616) | (i1617 ^ i1616)) * 160))))) - 1) ^ (-1));
                i19 = ~iIntValue2;
                i20 = ~i19;
                int i1619 = (i1615 & i19) | (i1614 & i20);
                int i1710 = i19 & i1614;
                int i1711 = ~((i1619 & i1710) | (i1619 ^ i1710));
                int i1712 = ~i15;
                int i1713 = i1616 | (i1614 & i1712);
                int i1714 = i1614 & i15;
                int i1715 = ~((i1713 & i1714) | (i1713 ^ i1714));
                int i1716 = ((~i1715) & i1711) | ((~i1711) & i1715);
                int i1717 = i1711 & i1715;
                int i1718 = ((i1717 & i1716) | (i1716 ^ i1717)) * (-160);
                int i1719 = ((~i1718) & i1618) | ((~i1618) & i1718);
                int i1812 = -(-((i1718 & i1618) << 1));
                int i1813 = (i1719 ^ i1812) + ((i1812 & i1719) << 1);
                int i1814 = (i1712 ^ i19) | (i1712 & i19);
                int i1815 = ~i1814;
                int i1816 = (i1814 | i1815) & i1815;
                int i1817 = i1614 ^ i1816;
                int i1818 = i1614 & i1816;
                i21 = (i1813 - (~(-(-(((i1818 & i1817) | (i1817 ^ i1818)) * 160))))) - 1;
                if (i21 != 0) {
                    i22 = f62208b;
                    int i1819 = i22 & 99;
                    i23 = (((~i1819) & (i22 | 99)) - (~(i1819 << 1))) - 1;
                    f62207a = i23 % 128;
                    if (i23 % 2 != 0) {
                        if (i21 > 3) {
                            int i18110 = -(-(i41 * (-219)));
                            int i18111 = ((221 | i18110) << 1) - ((i18110 & (-222)) | (221 & (~i18110)));
                            int i19110 = ~i41;
                            int i19111 = (i19110 | i41) & i19110;
                            int i19112 = ((-2) & (~i19111)) | (i19111 & 1);
                            int i19113 = (-2) & i19111;
                            int i19114 = ~((i19113 & i19112) | (i19112 ^ i19113));
                            int i19115 = (i19 | iIntValue2) & i19;
                            int i19116 = ~i19115;
                            int i19117 = (i19115 & (-2)) | (i19116 & 1);
                            int i19118 = i19115 & 1;
                            int i19119 = (i19117 ^ i19118) | (i19117 & i19118);
                            int i20110 = ~((i19119 ^ i41) | (i19119 & i41));
                            String str4 = str;
                            int i20111 = i19114 & i20110;
                            int i20112 = i13;
                            int i20113 = (i19114 | i20110) & (~i20111);
                            int i20114 = -(-(((i20111 & i20113) | (i20113 ^ i20111)) * 220));
                            int i20115 = (((~i20114) & i18111) | ((~i18111) & i20114)) + ((i20114 & i18111) << 1);
                            int i20116 = (i19115 & i19110) | (i41 & i19116);
                            int i20117 = i19115 & i41;
                            int i20118 = (i20116 & i20117) | (i20116 ^ i20117);
                            int i20119 = ~i20118;
                            int i21110 = (i20118 | i20119) & i20119;
                            int i21111 = ((i21110 & 1) | (i21110 ^ 1)) * (-440);
                            int i21112 = (i20115 ^ i21111) + ((i21111 & i20115) << 1);
                            int i21113 = i41 | 1;
                            int i21114 = (i21113 & i19) | ((~i21113) & iIntValue2);
                            int i21115 = i21113 & iIntValue2;
                            int i21116 = -(-(((i21115 & i21114) | (i21114 ^ i21115)) * 220));
                            int i21117 = i21112 & i21116;
                            int i21118 = i21116 | i21112;
                            int i21119 = (i21117 & i21118) + (i21118 | i21117);
                            bArr2[i41] = (byte) (i16 >>> 8);
                            int i22110 = i21119 * (-183);
                            int i22111 = (-183) | i22110;
                            int i22112 = i22111 << 1;
                            int i22113 = -((~(i22110 & (-183))) & i22111);
                            int i22114 = (i22112 & i22113) + (i22113 | i22112);
                            int i22115 = (-2) & i19;
                            int i22116 = (~i22115) & ((-2) | i19);
                            int i22117 = (i22116 & i22115) | (i22116 ^ i22115);
                            int i22118 = ~i21119;
                            int i22119 = (i22117 & i22118) | ((~i22117) & i21119);
                            int i23110 = i22117 & i21119;
                            int i23111 = (i23110 & i22119) | (i22119 ^ i23110);
                            int i23112 = ~i23111;
                            int i23113 = (i23111 | i23112) & i23112;
                            int i23114 = i22118 ^ i19115;
                            int i23115 = i22118 & i19115;
                            int i23116 = (i23114 ^ i23115) | (i23114 & i23115);
                            int i23117 = i23116 & 1;
                            int i23118 = (i23116 | 1) & (~i23117);
                            int i23119 = ~((i23118 & i23117) | (i23118 ^ i23117));
                            int i24110 = ((~i23119) & i23113) | ((~i23113) & i23119);
                            int i24111 = i23113 & i23119;
                            int i24112 = (i22114 - (~(((i24111 & i24110) | (i24110 ^ i24111)) * (-184)))) - 1;
                            int i24113 = (-2) ^ i22118;
                            int i24114 = (-2) & i22118;
                            int i24115 = (i24113 & i24114) | (i24113 ^ i24114);
                            int i24116 = ~i24115;
                            int i24117 = (i24115 | i24116) & i24116;
                            int i24118 = (i19 & 1) | ((-2) & i20);
                            int i24119 = ~((i22115 & i24118) | (i24118 ^ i22115));
                            int i25110 = i24117 ^ i24119;
                            int i25111 = i24119 & i24117;
                            int i25112 = (i25111 & i25110) | (i25110 ^ i25111);
                            int i25113 = (i22118 | i21119) & i22118;
                            int i25114 = (i25113 & i19116) | ((~i25113) & i19115);
                            int i25115 = i25113 & i19115;
                            int i25116 = ~((i25115 & i25114) | (i25114 ^ i25115));
                            int i25117 = ((~i25116) & i25112) | ((~i25112) & i25116);
                            int i25118 = i25112 & i25116;
                            int i25119 = ((i25118 & i25117) | (i25117 ^ i25118)) * 184;
                            int i2616 = i24112 & i25119;
                            int i2617 = -(-(i25119 | i24112));
                            int i2618 = ((i2616 | i2617) << 1) - (i2617 ^ i2616);
                            int i2619 = -(~(-(-(((i22118 & 1) | (i21119 & (-2)) | (i21119 & 1)) * 184))));
                            i41 = ((i2618 ^ i2619) + ((i2619 & i2618) << 1)) - 1;
                            bArr2[i21119] = (byte) i16;
                            int i26110 = ((i22 ^ 71) | (i22 & 71)) << 1;
                            int i26111 = -((i22 & (-72)) | ((~i22) & 71));
                            int i26112 = ((i26110 | i26111) << 1) - (i26110 ^ i26111);
                            f62207a = i26112 % 128;
                            int i26113 = i26112 % 2;
                            i44 = i17;
                            bArr = bArr2;
                            i43 = i20112;
                            str = str4;
                            i42 = i15;
                            iIntValue3 = i18;
                            i31 = 0;
                            i32 = 1;
                            i33 = 2;
                            i40 = -1;
                        }
                    } else if (i21 > 4) {
                        int i18112 = -(-(i41 * (-219)));
                        int i18113 = ((221 | i18112) << 1) - ((i18112 & (-222)) | (221 & (~i18112)));
                        int i191110 = ~i41;
                        int i191111 = (i191110 | i41) & i191110;
                        int i191112 = ((-2) & (~i191111)) | (i191111 & 1);
                        int i191113 = (-2) & i191111;
                        int i191114 = ~((i191113 & i191112) | (i191112 ^ i191113));
                        int i191115 = (i19 | iIntValue2) & i19;
                        int i191116 = ~i191115;
                        int i191117 = (i191115 & (-2)) | (i191116 & 1);
                        int i191118 = i191115 & 1;
                        int i191119 = (i191117 ^ i191118) | (i191117 & i191118);
                        int i201110 = ~((i191119 ^ i41) | (i191119 & i41));
                        String str5 = str;
                        int i201111 = i191114 & i201110;
                        int i201112 = i13;
                        int i201113 = (i191114 | i201110) & (~i201111);
                        int i201114 = -(-(((i201111 & i201113) | (i201113 ^ i201111)) * 220));
                        int i201115 = (((~i201114) & i18113) | ((~i18113) & i201114)) + ((i201114 & i18113) << 1);
                        int i201116 = (i191115 & i191110) | (i41 & i191116);
                        int i201117 = i191115 & i41;
                        int i201118 = (i201116 & i201117) | (i201116 ^ i201117);
                        int i201119 = ~i201118;
                        int i211110 = (i201118 | i201119) & i201119;
                        int i211111 = ((i211110 & 1) | (i211110 ^ 1)) * (-440);
                        int i211112 = (i201115 ^ i211111) + ((i211111 & i201115) << 1);
                        int i211113 = i41 | 1;
                        int i211114 = (i211113 & i19) | ((~i211113) & iIntValue2);
                        int i211115 = i211113 & iIntValue2;
                        int i211116 = -(-(((i211115 & i211114) | (i211114 ^ i211115)) * 220));
                        int i211117 = i211112 & i211116;
                        int i211118 = i211116 | i211112;
                        int i211119 = (i211117 & i211118) + (i211118 | i211117);
                        bArr2[i41] = (byte) (i16 >>> 8);
                        int i221110 = i211119 * (-183);
                        int i221111 = (-183) | i221110;
                        int i221112 = i221111 << 1;
                        int i221113 = -((~(i221110 & (-183))) & i221111);
                        int i221114 = (i221112 & i221113) + (i221113 | i221112);
                        int i221115 = (-2) & i19;
                        int i221116 = (~i221115) & ((-2) | i19);
                        int i221117 = (i221116 & i221115) | (i221116 ^ i221115);
                        int i221118 = ~i211119;
                        int i221119 = (i221117 & i221118) | ((~i221117) & i211119);
                        int i231110 = i221117 & i211119;
                        int i231111 = (i231110 & i221119) | (i221119 ^ i231110);
                        int i231112 = ~i231111;
                        int i231113 = (i231111 | i231112) & i231112;
                        int i231114 = i221118 ^ i191115;
                        int i231115 = i221118 & i191115;
                        int i231116 = (i231114 ^ i231115) | (i231114 & i231115);
                        int i231117 = i231116 & 1;
                        int i231118 = (i231116 | 1) & (~i231117);
                        int i231119 = ~((i231118 & i231117) | (i231118 ^ i231117));
                        int i241110 = ((~i231119) & i231113) | ((~i231113) & i231119);
                        int i241111 = i231113 & i231119;
                        int i241112 = (i221114 - (~(((i241111 & i241110) | (i241110 ^ i241111)) * (-184)))) - 1;
                        int i241113 = (-2) ^ i221118;
                        int i241114 = (-2) & i221118;
                        int i241115 = (i241113 & i241114) | (i241113 ^ i241114);
                        int i241116 = ~i241115;
                        int i241117 = (i241115 | i241116) & i241116;
                        int i241118 = (i19 & 1) | ((-2) & i20);
                        int i241119 = ~((i221115 & i241118) | (i241118 ^ i221115));
                        int i251110 = i241117 ^ i241119;
                        int i251111 = i241119 & i241117;
                        int i251112 = (i251111 & i251110) | (i251110 ^ i251111);
                        int i251113 = (i221118 | i211119) & i221118;
                        int i251114 = (i251113 & i191116) | ((~i251113) & i191115);
                        int i251115 = i251113 & i191115;
                        int i251116 = ~((i251115 & i251114) | (i251114 ^ i251115));
                        int i251117 = ((~i251116) & i251112) | ((~i251112) & i251116);
                        int i251118 = i251112 & i251116;
                        int i251119 = ((i251118 & i251117) | (i251117 ^ i251118)) * 184;
                        int i26114 = i241112 & i251119;
                        int i26115 = -(-(i251119 | i241112));
                        int i26116 = ((i26114 | i26115) << 1) - (i26115 ^ i26114);
                        int i26117 = -(~(-(-(((i221118 & 1) | (i211119 & (-2)) | (i211119 & 1)) * 184))));
                        i41 = ((i26116 ^ i26117) + ((i26117 & i26116) << 1)) - 1;
                        bArr2[i211119] = (byte) i16;
                        int i26118 = ((i22 ^ 71) | (i22 & 71)) << 1;
                        int i26119 = -((i22 & (-72)) | ((~i22) & 71));
                        int i261110 = ((i26118 | i26119) << 1) - (i26118 ^ i26119);
                        f62207a = i261110 % 128;
                        int i261111 = i261110 % 2;
                        i44 = i17;
                        bArr = bArr2;
                        i43 = i201112;
                        str = str5;
                        i42 = i15;
                        iIntValue3 = i18;
                        i31 = 0;
                        i32 = 1;
                        i33 = 2;
                        i40 = -1;
                    }
                }
                int i2710 = f62208b;
                int i2711 = i2710 & 119;
                int i2712 = (i2710 | 119) & (~i2711);
                int i2713 = i2711 << 1;
                int i2714 = ((i2712 | i2713) << 1) - (i2712 ^ i2713);
                f62207a = i2714 % 128;
                int i2715 = i2714 % 2;
                return null;
            }
            break;
        }
        if (i41 != bArr.length) {
            int i347 = f62208b;
            int i348 = i347 & 25;
            int i349 = ((((i347 ^ 25) | i348) << 1) - (~(-((~i348) & (i347 | 25))))) - 1;
            f62207a = i349 % 128;
            int i350 = i349 % 2;
            if (i44 == -1) {
                int i351 = i347 ^ 13;
                int i352 = (i347 & 13) << 1;
                int i353 = (i351 & i352) + (i352 | i351);
                int i354 = i353 % 128;
                f62207a = i354;
                int i355 = i353 % 2;
                int i356 = (i354 & (-2)) | ((~i354) & 1);
                int i357 = -(-((i354 & 1) << 1));
                int i358 = (i356 ^ i357) + ((i357 & i356) << 1);
                f62208b = i358 % 128;
                int i359 = i358 % 2;
                return null;
            }
            int length = bArr.length;
            int i360 = -i44;
            int i361 = ((i360 * 592) - (~(i41 * (-590)))) - 1;
            int i362 = ~i360;
            int i363 = (i362 | i360) & i362;
            int i364 = i363 & i41;
            int i365 = (~i364) & (i363 | i41);
            int i366 = ~i41;
            int i367 = (~(i364 | i365)) * (-1182);
            int i368 = ((i361 | i367) << 1) - (i361 ^ i367);
            int i369 = i363 & i366;
            int i370 = (~i369) & (i363 | i366);
            int i371 = (i369 & i370) | (i370 ^ i369);
            int i372 = ~iIntValue2;
            int i373 = ~i372;
            int i374 = (i371 & i373) | ((~i371) & i372);
            int i375 = i371 & i372;
            int i376 = ~((i375 & i374) | (i374 ^ i375));
            int i377 = ~((i360 & i41) | (i360 & i366) | (i41 & i362));
            int i378 = -(-(((i377 & i376) | (i376 ^ i377)) * (-591)));
            int i379 = i368 & i378;
            int i380 = (i378 | i368) & (~i379);
            int i381 = i379 << 1;
            int i382 = (i380 & i381) + (i380 | i381);
            int i383 = (iIntValue2 ^ i363) | (iIntValue2 & i363);
            int i384 = -(-(((i383 & i366) | (i383 ^ i366)) * 591));
            int i385 = i382 & i384;
            int i386 = (i384 ^ i382) | i385;
            int i387 = -(~(-((i385 ^ i386) + ((i386 & i385) << 1))));
            int i388 = ((length | i387) << 1) - (length ^ i387);
            System.arraycopy(bArr, i44, bArr, (i388 ^ (-1)) + (i388 << 1), (i41 - i362) - 1);
            int length2 = bArr.length;
            int i389 = -i41;
            int i390 = ((length2 ^ i389) - (~((length2 & i389) << 1))) - 1;
            int i391 = i390 * (-183);
            int i392 = i44 * (-183);
            int i393 = (i391 ^ i392) + ((i391 & i392) << 1);
            int i394 = ~i390;
            int i395 = i394 | i372;
            int i396 = i395 & i44;
            int i397 = ((i395 | i44) & (~i396)) | i396;
            int i398 = ~i397;
            int i399 = (i397 | i398) & i398;
            int i400 = ~i44;
            int i401 = (i400 & i373) | ((~i400) & i372);
            int i402 = i400 & i372;
            int i403 = (i401 & i402) | (i401 ^ i402);
            int i404 = i403 & i390;
            int i405 = (i403 | i390) & (~i404);
            int i406 = ~((i405 & i404) | (i405 ^ i404));
            int i407 = i399 & i406;
            int i408 = (i399 | i406) & (~i407);
            int i409 = -(-(((i408 & i407) | (i408 ^ i407)) * (-184)));
            int i410 = i393 & i409;
            int i411 = ((((i393 ^ i409) | i410) << 1) - (~(-((i409 | i393) & (~i410))))) - 1;
            int i412 = (i394 | i390) & i394;
            int i413 = i412 ^ i400;
            int i414 = i412 & i400;
            int i415 = (i414 & i413) | (i413 ^ i414);
            int i416 = ~i415;
            int i417 = (i415 | i416) & i416;
            int i418 = i394 ^ i372;
            int i419 = i394 & i372;
            int i420 = (i419 & i418) | (i418 ^ i419);
            int i421 = ~i420;
            int i422 = (i420 | i421) & i421;
            int i423 = i417 & i422;
            int i424 = ((i422 | i417) & (~i423)) | i423;
            int i425 = (i400 | i44) & i400;
            int i426 = ~((i425 & i372) | (i425 & i373) | ((~i425) & i372));
            int i427 = -(~(((i424 & i426) | (i424 ^ i426)) * 184));
            int i428 = ((i411 & i427) + (i427 | i411)) - 1;
            int i429 = i390 & i44;
            int i430 = (~i429) & (i390 | i44);
            int i431 = -(-(((i429 & i430) | (i430 ^ i429)) * 184));
            Arrays.fill(bArr, i44, ((((~i431) & i428) | ((~i428) & i431)) - (~(-(-((i431 & i428) << 1))))) - 1, (byte) 0);
            int i432 = f62208b;
            int i433 = i432 & 117;
            int i434 = i432 | 117;
            int i435 = (i433 ^ i434) + ((i434 & i433) << 1);
            f62207a = i435 % 128;
            int i436 = i435 % 2;
        }
        InetAddress byAddress = InetAddress.getByAddress(bArr);
        int i437 = f62207a;
        int i438 = (i437 & 14) + (i437 | 14);
        int i439 = (i438 ^ (-1)) + (i438 << 1);
        f62208b = i439 % 128;
        if (i439 % 2 == 0) {
            int i440 = 17 / 0;
        }
        return byAddress;
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) throws NoSuchAlgorithmException, EOFException {
        int i13 = ~i12;
        int i14 = ~i10;
        int i15 = ~i11;
        int i16 = i13 | (~(i14 | i15));
        int i17 = ~(i10 | i11);
        int i18 = (((~(i10 | i15)) | (~(i11 | i14))) * ErrorCodes.STORAGE_PERMISSION) + (((~(i12 | i11)) | (~(i10 | i12)) | i17) * (-1444)) + ((i16 | i17) * 1444) + (i11 * (-721)) + (i10 * (-721));
        if (i18 == 1) {
            return b(objArr);
        }
        if (i18 == 2) {
            String str = (String) objArr[0];
            int i19 = f62207a + 114;
            int i20 = (i19 ^ (-1)) + (i19 << 1);
            f62208b = i20 % 128;
            int i21 = i20 % 2;
            int length = str.length();
            int i22 = f62207a;
            int i23 = ((i22 & 30) + (i22 | 30)) - 1;
            f62208b = i23 % 128;
            int i24 = i23 % 2;
            int i25 = 0;
            while (i25 < length) {
                int i26 = f62207a;
                int i27 = ((i26 ^ 111) - (~(-(-((i26 & 111) << 1))))) - 1;
                f62208b = i27 % 128;
                int i28 = i27 % 2;
                int i29 = i25 & 76;
                int i30 = ((i25 ^ 76) | i29) << 1;
                int i31 = -((~i29) & (i25 | 76));
                int i32 = ((i30 | i31) << 1) - (i30 ^ i31);
                int i33 = i32 & (-75);
                int i34 = (i33 << 1) + ((~i33) & (i32 | (-75)));
                char cCharAt = str.charAt(i25);
                if (Intrinsics.compare((int) cCharAt, 31) > 0) {
                    int i35 = f62207a + 125;
                    f62208b = i35 % 128;
                    int i36 = i35 % 2;
                    if (Intrinsics.compare((int) cCharAt, 127) < 0) {
                        if (StringsKt__StringsKt.indexOf$default((CharSequence) " #%/:?@[\\]", cCharAt, 0, false, 6, (Object) null) != -1) {
                            int i37 = f62208b - (-1);
                            f62207a = i37 % 128;
                            return Boolean.valueOf(!(i37 % 2 != 0));
                        }
                        i25 = i34;
                    }
                }
                int i38 = f62207a + 3;
                f62208b = i38 % 128;
                int i39 = i38 % 2;
                return Boolean.TRUE;
            }
            int i40 = f62208b + 107;
            f62207a = i40 % 128;
            int i41 = i40 % 2;
            return Boolean.FALSE;
        }
        if (i18 == 3) {
            return a(objArr);
        }
        if (i18 != 4) {
            return c(objArr);
        }
        byte[] bArr = (byte[]) objArr[0];
        int i42 = f62207a;
        int i43 = i42 + 69;
        f62208b = i43 % 128;
        int i44 = i43 % 2;
        int i45 = (i42 & (-36)) | ((~i42) & 35);
        int i46 = -(-((i42 & 35) << 1));
        int i47 = (i45 & i46) + (i46 | i45);
        f62208b = i47 % 128;
        int i48 = i47 % 2;
        int i49 = 0;
        int i50 = 0;
        int i51 = -1;
        while (true) {
            if (i49 >= bArr.length) {
                abx abxVar = new abx();
                int i52 = f62208b;
                int i53 = i52 & 83;
                int i54 = -(-(i52 | 83));
                int i55 = ((i53 | i54) << 1) - (i54 ^ i53);
                f62207a = i55 % 128;
                int i56 = i55 % 2;
                int i57 = 0;
                while (i57 < bArr.length) {
                    int i58 = f62208b;
                    int i59 = i58 & 121;
                    int i60 = (((~i59) & (i58 | 121)) - (~(-(-(i59 << 1))))) - 1;
                    f62207a = i60 % 128;
                    if (i60 % 2 != 0) {
                        throw null;
                    }
                    if (i57 == i51) {
                        int i61 = i58 & 25;
                        int i62 = (i58 | 25) & (~i61);
                        int i63 = i61 << 1;
                        int i64 = ((i62 | i63) << 1) - (i62 ^ i63);
                        f62207a = i64 % 128;
                        int i65 = i64 % 2;
                        int iCurrentTimeMillis = (int) System.currentTimeMillis();
                        int i66 = i50 * 303;
                        int i67 = -(-(i57 * (-301)));
                        int i68 = i66 & i67;
                        int i69 = (i66 | i67) & (~i68);
                        int i70 = -(-(i68 << 1));
                        int i71 = ((i69 | i70) << 1) - (i69 ^ i70);
                        int i72 = ~i50;
                        int i73 = ~iCurrentTimeMillis;
                        int i74 = (i73 | iCurrentTimeMillis) & i73;
                        int i75 = (i74 & i72) | (i72 ^ i74);
                        int i76 = i75 ^ i57;
                        int i77 = i75 & i57;
                        int i78 = ~((i76 ^ i77) | (i77 & i76));
                        int i79 = ~i57;
                        int i80 = i57 & i72;
                        int i81 = (i50 & i79) | i80;
                        int i82 = i50 & i57;
                        int i83 = (i81 ^ i82) | (i81 & i82);
                        int i84 = (i83 & iCurrentTimeMillis) | ((~i83) & iCurrentTimeMillis) | (i73 & i83);
                        int i85 = ~i84;
                        int i86 = (i84 | i85) & i85;
                        int i87 = i78 & i86;
                        int i88 = (((i86 | i78) & (~i87)) | i87) * (-302);
                        int i89 = i71 & i88;
                        int i90 = (i89 - (~(-(-((i88 ^ i71) | i89))))) - 1;
                        int i91 = i72 ^ i57;
                        int i92 = (i91 & i80) | (i91 ^ i80);
                        int i93 = (i92 & iCurrentTimeMillis) | (i92 ^ iCurrentTimeMillis);
                        int i94 = ~i93;
                        int i95 = -(-(((i93 | i94) & i94) * (-604)));
                        int i96 = i90 | i95;
                        int i97 = i96 << 1;
                        int i98 = -((~(i95 & i90)) & i96);
                        int i99 = ((i97 | i98) << 1) - (i98 ^ i97);
                        int i100 = (i79 | i57) & i79;
                        int i101 = i100 & i50;
                        int i102 = (i100 | i50) & (~i101);
                        int i103 = ~((i102 & i101) | (i102 ^ i101));
                        int i104 = i57 ^ iCurrentTimeMillis;
                        int i105 = i57 & iCurrentTimeMillis;
                        int i106 = ~((i105 & i104) | (i104 ^ i105));
                        i57 = (i99 - (~(((i106 & i103) | (i103 ^ i106)) * 302))) - 1;
                        if (i57 == 16) {
                            int i107 = f62207a + 125;
                            f62208b = i107 % 128;
                            int i108 = i107 % 2;
                            int i109 = f62207a;
                            int i110 = ((i109 & 30) + (i109 | 30)) - 1;
                            f62208b = i110 % 128;
                            int i111 = i110 % 2;
                        }
                    } else {
                        if (i57 > 0) {
                            int i112 = ((i58 & 48) + (i58 | 48)) - 1;
                            f62207a = i112 % 128;
                            if (i112 % 2 != 0) {
                            }
                            int i113 = f62207a;
                            int i114 = i113 & 67;
                            int i115 = (((i113 | 67) & (~i114)) - (~(i114 << 1))) - 1;
                            f62208b = i115 % 128;
                            int i116 = i115 % 2;
                        }
                        int iIntValue = ((Integer) yt.setY(new Object[]{Byte.valueOf(bArr[i57])}, 572946270, -572946224, (int) System.currentTimeMillis())).intValue() << 8;
                        int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
                        int i117 = i57 * ResultCode.ERROR_TRUST_CERT_DATE_BEFOREVALIDITY;
                        int i118 = (((-520) | i117) << 1) - (i117 ^ (-520));
                        int i119 = (-2) & i57;
                        int i120 = (~i119) & ((-2) | i57);
                        int i121 = ~i57;
                        int i122 = (i120 ^ i119) | (i120 & i119);
                        int i123 = i122 & iCurrentTimeMillis2;
                        int i124 = (~i123) & (i122 | iCurrentTimeMillis2);
                        int i125 = ~iCurrentTimeMillis2;
                        int i126 = (i118 - (~(-(~(-(-((~((i124 ^ i123) | (i124 & i123))) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY))))))) - 2;
                        int i127 = i121 ^ 1;
                        int i128 = i121 & 1;
                        int i129 = (~((i127 ^ i128) | (i127 & i128))) * (-1042);
                        int i130 = (i126 ^ i129) + ((i129 & i126) << 1);
                        int i131 = (i121 | i57) & i121;
                        int i132 = i131 & 1;
                        int i133 = (i131 | 1) & (~i132);
                        int i134 = (i133 & i132) | (i133 ^ i132);
                        int i135 = ~i134;
                        int i136 = (i134 | i135) & i135;
                        int i137 = (iCurrentTimeMillis2 | i125) & i125;
                        int i138 = (-2) ^ i137;
                        int i139 = i137 & (-2);
                        int i140 = (i139 & i138) | (i138 ^ i139);
                        int i141 = i140 & i57;
                        int i142 = (i140 | i57) & (~i141);
                        int i143 = ~((i142 & i141) | (i142 ^ i141));
                        int i144 = ((~i143) & i136) | ((~i136) & i143);
                        int i145 = i143 & i136;
                        int i146 = ((i145 & i144) | (i144 ^ i145)) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY;
                        int i147 = i130 & i146;
                        int i148 = (i146 | i130) & (~i147);
                        int i149 = -(-(i147 << 1));
                        abxVar.setAlwaysDrawnWithCacheEnabled(iIntValue | ((Integer) yt.setY(new Object[]{Byte.valueOf(bArr[(i148 ^ i149) + ((i148 & i149) << 1)])}, 572946270, -572946224, (int) System.currentTimeMillis())).intValue());
                        i57 = (-2) - ((i57 + 3) ^ (-1));
                        int i150 = f62207a;
                        int i151 = ((i150 ^ 47) | (i150 & 47)) << 1;
                        int i152 = -(((~i150) & 47) | (i150 & (-48)));
                        int i153 = ((i151 | i152) << 1) - (i152 ^ i151);
                        f62208b = i153 % 128;
                        int i154 = i153 % 2;
                    }
                }
                String textAlignment = abxVar.setTextAlignment();
                int i155 = f62208b;
                int i156 = ((i155 ^ 49) | (i155 & 49)) << 1;
                int i157 = -(((~i155) & 49) | (i155 & (-50)));
                int i158 = (i156 & i157) + (i156 | i157);
                f62207a = i158 % 128;
                int i159 = i158 % 2;
                return textAlignment;
            }
            int i160 = f62207a;
            int i161 = i160 & 81;
            int i162 = (~i161) & (i160 | 81);
            int i163 = -(-(i161 << 1));
            int i164 = (i162 & i163) + (i163 | i162);
            f62208b = i164 % 128;
            int i165 = i164 % 2;
            int i166 = i160 & 45;
            int i167 = -(-(i160 | 45));
            int i168 = (i166 ^ i167) + ((i167 & i166) << 1);
            f62208b = i168 % 128;
            int i169 = i168 % 2;
            int i170 = i49;
            for (int i171 = 16; i170 < i171; i171 = 16) {
                int i172 = f62208b;
                int i173 = i172 & 59;
                int i174 = i172 | 59;
                int i175 = ((i173 | i174) << 1) - (i173 ^ i174);
                f62207a = i175 % 128;
                int i176 = i175 % 2;
                if (bArr[i170] != 0) {
                    break;
                }
                int i177 = ((i172 ^ 69) - (~((i172 & 69) << 1))) - 1;
                f62207a = i177 % 128;
                int i178 = i177 % 2;
                int iCurrentTimeMillis3 = (int) System.currentTimeMillis();
                int i179 = i170 * (-396);
                int i180 = 398 & i179;
                int i181 = ((((398 ^ i179) | i180) << 1) - (~(-((~i180) & (i179 | 398))))) - 1;
                int i182 = ~iCurrentTimeMillis3;
                int i183 = (-2) ^ i182;
                int i184 = (-2) & i182;
                int i185 = ~((i183 ^ i184) | (i183 & i184));
                int i186 = ~i170;
                int i187 = ((-2) & i186) | (i170 & 1);
                int i188 = (-2) & i170;
                int i189 = ~((i187 ^ i188) | (i187 & i188));
                int i190 = i185 ^ i189;
                int i191 = i189 & i185;
                int i192 = (i190 & i191) | (i190 ^ i191);
                int i193 = i182 & (i182 | iCurrentTimeMillis3);
                int i194 = i193 & i170;
                int i195 = (~i194) & (i193 | i170);
                int i196 = ~((i195 & i194) | (i195 ^ i194));
                int i197 = -(-(((i192 & i196) | (i192 ^ i196)) * (-397)));
                int i198 = ((i181 ^ i197) | (i181 & i197)) << 1;
                int i199 = -((i197 & (~i181)) | ((~i197) & i181));
                int i200 = (i198 ^ i199) + ((i199 & i198) << 1);
                int i201 = (~i188) & ((-2) | i170);
                int i202 = (~((i201 & i188) | (i201 ^ i188))) * (-397);
                int i203 = i200 & i202;
                int i204 = (i202 ^ i200) | i203;
                int i205 = ((i203 | i204) << 1) - (i204 ^ i203);
                int i206 = (-2) ^ i170;
                int i207 = ~((i206 & i188) | (i206 ^ i188));
                int i208 = iCurrentTimeMillis3 ^ i207;
                int i209 = i207 & iCurrentTimeMillis3;
                int i210 = (i209 & i208) | (i208 ^ i209);
                int i211 = i186 & 1;
                int i212 = (i186 | 1) & (~i211);
                if (bArr[(i205 - (~(-(~(-(-((i210 | (~((i211 & i212) | (i212 ^ i211)))) * 397))))))) - 2] != 0) {
                    break;
                }
                int i213 = f62208b;
                int i214 = (i213 ^ 87) + ((i213 & 87) << 1);
                int i215 = i214 % 128;
                f62207a = i215;
                int i216 = i214 % 2;
                int i217 = i170 & 2;
                int i218 = (i170 ^ 2) | i217;
                i170 = (i217 & i218) + (i217 | i218);
                int i219 = (i215 & 91) + (i215 | 91);
                f62208b = i219 % 128;
                int i220 = i219 % 2;
            }
            int i221 = -i49;
            int iCurrentTimeMillis4 = (int) System.currentTimeMillis();
            int i222 = ((i221 * 860) - (~(-(-(i170 * (-858)))))) - 1;
            int i223 = ~iCurrentTimeMillis4;
            int i224 = ~i221;
            int i225 = (i221 & i223) | (iCurrentTimeMillis4 & i224);
            int i226 = i221 & iCurrentTimeMillis4;
            int i227 = ((i225 & i226) | (i225 ^ i226)) * (-859);
            int i228 = (i222 & i227) + (i222 | i227);
            int i229 = (i223 | iCurrentTimeMillis4) & i223;
            int i230 = i229 & i221;
            int i231 = ~(((i229 | i221) & (~i230)) | i230);
            int i232 = ~i170;
            int i233 = i224 & i232;
            int i234 = (~i233) & (i224 | i232);
            int i235 = ~(iCurrentTimeMillis4 | (i234 & i233) | (i234 ^ i233));
            int i236 = i231 & i235;
            int i237 = (i235 | i231) & (~i236);
            int i238 = -(-(((i237 & i236) | (i237 ^ i236)) * 859));
            int i239 = i228 & i238;
            int i240 = ((i228 ^ i238) | i239) << 1;
            int i241 = -((i238 | i228) & (~i239));
            int i242 = ((i240 | i241) << 1) - (i241 ^ i240);
            int i243 = i232 & i223;
            int i244 = i243 | ((~i243) & (i223 | i232));
            int i245 = ~i244;
            int i246 = (i244 | i245) & i245;
            int i247 = i232 ^ i221;
            int i248 = i221 & i232;
            int i249 = ~((i248 & i247) | (i247 ^ i248));
            int i250 = ((i249 & i246) | (i246 ^ i249)) * 859;
            int i251 = i242 & i250;
            int i252 = ((i242 ^ i250) | i251) << 1;
            int i253 = -((i250 | i242) & (~i251));
            int i254 = ((i252 | i253) << 1) - (i253 ^ i252);
            if (i254 > i50) {
                int i255 = f62207a;
                int i256 = i255 ^ 51;
                int i257 = -(-((i255 & 51) << 1));
                int i258 = (i256 ^ i257) + ((i256 & i257) << 1);
                f62208b = i258 % 128;
                int i259 = i258 % 2;
                if (i254 >= 4) {
                    int i260 = (-2) - ((i255 + 80) ^ (-1));
                    f62208b = i260 % 128;
                    if (i260 % 2 == 0) {
                        throw null;
                    }
                    i50 = i254;
                    i51 = i49;
                } else {
                    continue;
                }
            }
            int i261 = i170 | 2;
            int i262 = i261 << 1;
            int i263 = -(i261 & (~(i170 & 2)));
            i49 = (i262 & i263) + (i263 | i262);
            int i264 = f62207a;
            int i265 = ((i264 ^ 86) + ((i264 & 86) << 1)) - 1;
            f62208b = i265 % 128;
            int i266 = i265 % 2;
        }
    }

    @Nullable
    public static final String setOnFocusChangeListener(@NotNull String str) {
        return (String) setCompoundDrawableTintBlendMode(new Object[]{str}, 768394866, -768394863, (int) System.currentTimeMillis());
    }
}
