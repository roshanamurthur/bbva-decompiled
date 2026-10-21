package okhttp3.internal;

import androidx.camera.core.impl.utils.a;
import com.bbva.glomohybrid.base.deeplink.extensions.DeepLinkExtensionsKt;
import java.net.IDN;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.l;
import mx.openpay.library.domain.util.Constant;
import okio.Buffer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: hostnames.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\f\u0010\u0001\u001a\u0004\u0018\u00010\u0000*\u00020\u0000¨\u0006\u0002"}, d2 = {"", "toCanonicalHost", "okhttp"}, k = 2, mv = {1, 8, 0})
public final class HostnamesKt {
    /* JADX WARN: Code duplicated, block: B:35:0x007b  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a6 A[LOOP:2: B:25:0x0065->B:50:0x00a6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c4 A[LOOP:1: B:56:0x00b8->B:59:0x00c4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:81:0x00ca A[EDGE_INSN: B:81:0x00ca->B:60:0x00ca BREAK  A[LOOP:1: B:56:0x00b8->B:59:0x00c4], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x00b5 A[SYNTHETIC] */
    public static final InetAddress a(int i10, int i11, String str) {
        int i12;
        int i13;
        char cCharAt;
        int i14;
        int i15;
        int hexDigit;
        byte[] bArr = new byte[16];
        int i16 = 0;
        int i17 = i10;
        int i18 = -1;
        int i19 = -1;
        while (i17 < i11) {
            if (i16 == 16) {
                return null;
            }
            int i20 = i17 + 2;
            if (i20 <= i11 && l.startsWith$default(str, "::", i17, false, 4, null)) {
                if (i18 != -1) {
                    return null;
                }
                i16 += 2;
                if (i20 == i11) {
                    i18 = i16;
                    break;
                }
                i19 = i20;
                i18 = i16;
                i17 = i19;
                i14 = 0;
                while (i17 < i11) {
                    hexDigit = Util.parseHexDigit(str.charAt(i17));
                    if (hexDigit != -1) {
                        break;
                        break;
                    }
                    i14 = (i14 << 4) + hexDigit;
                    i17++;
                }
                i15 = i17 - i19;
                if (i15 != 0) {
                }
                return null;
            }
            if (i16 != 0) {
                if (!l.startsWith$default(str, DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER, i17, false, 4, null)) {
                    if (l.startsWith$default(str, Constant.DOT_STRING, i17, false, 4, null)) {
                        int i21 = i16 - 2;
                        int i22 = i21;
                        while (i19 < i11) {
                            if (i22 != 16) {
                                if (i22 == i21) {
                                    i12 = i19;
                                    i13 = 0;
                                    while (i12 < i11) {
                                        cCharAt = str.charAt(i12);
                                        if (Intrinsics.compare((int) cCharAt, 48) < 0 || Intrinsics.compare((int) cCharAt, 57) > 0) {
                                            break;
                                        }
                                        if ((i13 != 0 || i19 == i12) && (i13 = ((i13 * 10) + cCharAt) - 48) <= 255) {
                                            i12++;
                                        }
                                    }
                                    if (i12 - i19 == 0) {
                                        bArr[i22] = (byte) i13;
                                        i19 = i12;
                                        i22++;
                                    }
                                } else if (str.charAt(i19) == '.') {
                                    i19++;
                                    i12 = i19;
                                    i13 = 0;
                                    while (i12 < i11) {
                                        cCharAt = str.charAt(i12);
                                        if (Intrinsics.compare((int) cCharAt, 48) < 0) {
                                            break;
                                        }
                                        break;
                                        break;
                                    }
                                    if (i12 - i19 == 0) {
                                        bArr[i22] = (byte) i13;
                                        i19 = i12;
                                        i22++;
                                    }
                                }
                            }
                        }
                        if (i22 == i16 + 2) {
                            i16 += 2;
                            break;
                        }
                    }
                    return null;
                }
                i17++;
            }
            i19 = i17;
            i17 = i19;
            i14 = 0;
            while (i17 < i11) {
                hexDigit = Util.parseHexDigit(str.charAt(i17));
                if (hexDigit != -1) {
                    break;
                }
                i14 = (i14 << 4) + hexDigit;
                i17++;
            }
            i15 = i17 - i19;
            if (i15 != 0 || i15 > 4) {
                return null;
            }
            int i23 = i16 + 1;
            bArr[i16] = (byte) ((i14 >>> 8) & 255);
            i16 += 2;
            bArr[i23] = (byte) (i14 & 255);
        }
        if (i16 != 16) {
            if (i18 == -1) {
                return null;
            }
            int i24 = i16 - i18;
            System.arraycopy(bArr, i18, bArr, 16 - i24, i24);
            Arrays.fill(bArr, i18, (16 - i16) + i18, (byte) 0);
        }
        return InetAddress.getByAddress(bArr);
    }

    @Nullable
    public static final String toCanonicalHost(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int i10 = 0;
        int i11 = -1;
        if (!StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER, false, 2, (Object) null)) {
            try {
                String ascii = IDN.toASCII(str);
                Intrinsics.checkNotNullExpressionValue(ascii, "toASCII(host)");
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                String lowerCase = ascii.toLowerCase(US);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (lowerCase.length() == 0) {
                    return null;
                }
                int length = lowerCase.length();
                while (i10 < length) {
                    char cCharAt = lowerCase.charAt(i10);
                    if (Intrinsics.compare((int) cCharAt, 31) <= 0 || Intrinsics.compare((int) cCharAt, 127) >= 0 || StringsKt__StringsKt.indexOf$default((CharSequence) " #%/:?@[\\]", cCharAt, 0, false, 6, (Object) null) != -1) {
                        return null;
                    }
                    i10++;
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        InetAddress inetAddressA = (l.startsWith$default(str, Constant.BRACKET_OPEN, false, 2, null) && l.endsWith$default(str, Constant.BRACKET_CLOSE, false, 2, null)) ? a(1, str.length() - 1, str) : a(0, str.length(), str);
        if (inetAddressA == null) {
            return null;
        }
        byte[] address = inetAddressA.getAddress();
        if (address.length != 16) {
            if (address.length == 4) {
                return inetAddressA.getHostAddress();
            }
            throw new AssertionError(a.a("Invalid IPv6 address: '", str, '\''));
        }
        Intrinsics.checkNotNullExpressionValue(address, "address");
        int i12 = 0;
        int i13 = 0;
        while (i12 < address.length) {
            int i14 = i12;
            while (i14 < 16 && address[i14] == 0 && address[i14 + 1] == 0) {
                i14 += 2;
            }
            int i15 = i14 - i12;
            if (i15 > i13 && i15 >= 4) {
                i11 = i12;
                i13 = i15;
            }
            i12 = i14 + 2;
        }
        Buffer buffer = new Buffer();
        while (i10 < address.length) {
            if (i10 == i11) {
                buffer.writeByte(58);
                i10 += i13;
                if (i10 == 16) {
                    buffer.writeByte(58);
                }
            } else {
                if (i10 > 0) {
                    buffer.writeByte(58);
                }
                buffer.writeHexadecimalUnsignedLong((Util.and(address[i10], 255) << 8) | Util.and(address[i10 + 1], 255));
                i10 += 2;
            }
        }
        return buffer.readUtf8();
    }
}
