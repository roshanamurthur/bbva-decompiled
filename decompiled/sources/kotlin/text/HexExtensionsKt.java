package kotlin.text;

import androidx.appcompat.widget.o1;
import com.google.firebase.dynamiclinks.DynamicLink;
import java.util.Arrays;
import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.ULong;
import kotlin.collections.AbstractList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.ClosedRange;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: HexExtensions.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u001a\u0016\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0007\u001a*\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0007\u001a@\u0010\u000f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0005H\u0000\u001a\u0016\u0010\u0010\u001a\u00020\u0000*\u00020\u00032\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0007\u001a@\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0005H\u0000\u001a\u0016\u0010\u0004\u001a\u00020\u0003*\u00020\u00132\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\u0016\u0010\u0014\u001a\u00020\u0013*\u00020\u00032\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\u0016\u0010\u0004\u001a\u00020\u0003*\u00020\u00152\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\u0016\u0010\u0016\u001a\u00020\u0015*\u00020\u00032\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\u0016\u0010\u0004\u001a\u00020\u0003*\u00020\u00052\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\u0016\u0010\u0017\u001a\u00020\u0005*\u00020\u00032\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\u0016\u0010\u0004\u001a\u00020\u0003*\u00020\u00182\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\u0016\u0010\u0019\u001a\u00020\u0018*\u00020\u00032\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0007¨\u0006\u001a"}, d2 = {"", "Lkotlin/text/HexFormat;", "format", "", "toHexString", "", "startIndex", "endIndex", "totalBytes", "bytesPerLine", "bytesPerGroup", "groupSeparatorLength", "byteSeparatorLength", "bytePrefixLength", "byteSuffixLength", "formattedStringLength", "hexToByteArray", "stringLength", "parsedByteArrayMaxSize", "", "hexToByte", "", "hexToShort", "hexToInt", "", "hexToLong", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nHexExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HexExtensions.kt\nkotlin/text/HexExtensionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,591:1\n1#2:592\n1183#3,3:593\n1183#3,3:596\n*S KotlinDebug\n*F\n+ 1 HexExtensions.kt\nkotlin/text/HexExtensionsKt\n*L\n13#1:593,3\n14#1:596,3\n*E\n"})
public final class HexExtensionsKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final int[] f82289a;

    static {
        int[] iArr = new int[128];
        int i10 = 0;
        for (int i11 = 0; i11 < 128; i11++) {
            iArr[i11] = -1;
        }
        int i12 = 0;
        int i13 = 0;
        while (i12 < "0123456789abcdef".length()) {
            iArr["0123456789abcdef".charAt(i12)] = i13;
            i12++;
            i13++;
        }
        int i14 = 0;
        while (i10 < "0123456789ABCDEF".length()) {
            iArr["0123456789ABCDEF".charAt(i10)] = i14;
            i10++;
            i14++;
        }
        f82289a = iArr;
    }

    public static final long a(int i10, int i11, long j10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        long j11 = i10;
        return ((j11 - 1) * ((long) i11)) + (j10 * j11);
    }

    public static final int b(int i10, int i11, String str, String str2, String str3) {
        int length = str2.length() + i10;
        if (length <= i11 && l.regionMatches(str, i10, str2, 0, str2.length(), true)) {
            return length;
        }
        StringBuilder sbC = androidx.constraintlayout.core.parser.a.c("Expected ", str3, " \"", str2, "\" at index ");
        sbC.append(i10);
        sbC.append(", but was ");
        int iCoerceAtMost = kotlin.ranges.c.coerceAtMost(length, i11);
        Intrinsics.checkNotNull(str, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = str.substring(i10, iCoerceAtMost);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        sbC.append(strSubstring);
        throw new NumberFormatException(sbC.toString());
    }

    public static final void c(String str, int i10, int i11, int i12, boolean z10) {
        int i13 = i11 - i10;
        if (z10) {
            if (i13 == i12) {
                return;
            }
        } else if (i13 <= i12) {
            return;
        }
        String str2 = z10 ? "exactly" : "at most";
        Intrinsics.checkNotNull(str, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = str.substring(i10, i11);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        StringBuilder sb2 = new StringBuilder("Expected ");
        sb2.append(str2);
        sb2.append(' ');
        sb2.append(i12);
        sb2.append(" hexadecimal digits at index ");
        androidx.room.a.f(sb2, i10, ", but was ", strSubstring, " of length ");
        sb2.append(i13);
        throw new NumberFormatException(sb2.toString());
    }

    public static final int d(int i10, String str) {
        int i11;
        char cCharAt = str.charAt(i10);
        if (cCharAt <= 127 && (i11 = f82289a[cCharAt]) >= 0) {
            return i11;
        }
        StringBuilder sbC = o1.c("Expected a hexadecimal digit at index ", i10, ", but was ");
        sbC.append(str.charAt(i10));
        throw new NumberFormatException(sbC.toString());
    }

    @ExperimentalStdlibApi
    public static final long e(String str, int i10, HexFormat hexFormat, int i11) {
        AbstractList.INSTANCE.checkBoundsIndexes$kotlin_stdlib(0, i10, str.length());
        String prefix = hexFormat.getNumber().getPrefix();
        String str2 = hexFormat.getNumber().getCom.google.firebase.dynamiclinks.DynamicLink.Builder.KEY_SUFFIX java.lang.String();
        if (str2.length() + prefix.length() >= i10) {
            StringBuilder sbC = androidx.constraintlayout.core.parser.a.c("Expected a hexadecimal number with prefix \"", prefix, "\" and suffix \"", str2, "\", but was ");
            Intrinsics.checkNotNull(str, "null cannot be cast to non-null type java.lang.String");
            String strSubstring = str.substring(0, i10);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            sbC.append(strSubstring);
            throw new NumberFormatException(sbC.toString());
        }
        int iB = b(0, i10, str, prefix, "prefix");
        int length = i10 - str2.length();
        b(length, i10, str, str2, DynamicLink.Builder.KEY_SUFFIX);
        c(str, iB, length, i11, false);
        long jD = 0;
        while (iB < length) {
            jD = (jD << 4) | ((long) d(iB, str));
            iB++;
        }
        return jD;
    }

    @ExperimentalStdlibApi
    public static final String f(long j10, HexFormat hexFormat, int i10) {
        if ((i10 & 3) != 0) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        String str = hexFormat.getUpperCase() ? "0123456789ABCDEF" : "0123456789abcdef";
        String prefix = hexFormat.getNumber().getPrefix();
        String str2 = hexFormat.getNumber().getCom.google.firebase.dynamiclinks.DynamicLink.Builder.KEY_SUFFIX java.lang.String();
        int length = str2.length() + prefix.length() + (i10 >> 2);
        boolean removeLeadingZeros = hexFormat.getNumber().getRemoveLeadingZeros();
        StringBuilder sbA = androidx.fragment.app.a.a(length, prefix);
        while (i10 > 0) {
            i10 -= 4;
            int i11 = (int) ((j10 >> i10) & 15);
            removeLeadingZeros = removeLeadingZeros && i11 == 0 && i10 > 0;
            if (!removeLeadingZeros) {
                sbA.append(str.charAt(i11));
            }
        }
        sbA.append(str2);
        String string = sbA.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static final int formattedStringLength(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        int i17 = i10 - 1;
        int i18 = i17 / i11;
        int i19 = (i11 - 1) / i12;
        int i20 = i10 % i11;
        if (i20 != 0) {
            i11 = i20;
        }
        int i21 = (i19 * i18) + ((i11 - 1) / i12);
        long j10 = ((((long) i15) + 2 + ((long) i16)) * ((long) i10)) + (((long) ((i17 - i18) - i21)) * ((long) i14)) + (((long) i21) * ((long) i13)) + ((long) i18);
        if (kotlin.ranges.c.intRangeContains((ClosedRange<Integer>) new IntRange(0, Integer.MAX_VALUE), j10)) {
            return (int) j10;
        }
        throw new IllegalArgumentException("The resulting string length is too big: " + ((Object) ULong.m5599toStringimpl(ULong.m5595constructorimpl(j10))));
    }

    public static final long g(int i10, long j10, long j11) {
        if (j10 <= 0 || j11 <= 0) {
            return 0L;
        }
        long j12 = i10;
        return (j10 + j12) / (j11 + j12);
    }

    @SinceKotlin(version = "1.9")
    @ExperimentalStdlibApi
    public static final byte hexToByte(@NotNull String str, @NotNull HexFormat format) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return (byte) e(str, str.length(), format, 2);
    }

    public static /* synthetic */ byte hexToByte$default(String str, HexFormat hexFormat, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return hexToByte(str, hexFormat);
    }

    @SinceKotlin(version = "1.9")
    @ExperimentalStdlibApi
    @NotNull
    public static final byte[] hexToByteArray(@NotNull String str, @NotNull HexFormat format) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        int length = str.length();
        int i10 = 0;
        AbstractList.INSTANCE.checkBoundsIndexes$kotlin_stdlib(0, length, str.length());
        if (length == 0) {
            return new byte[0];
        }
        HexFormat.BytesHexFormat bytes = format.getBytes();
        int bytesPerLine = bytes.getBytesPerLine();
        int bytesPerGroup = bytes.getBytesPerGroup();
        String bytePrefix = bytes.getBytePrefix();
        String byteSuffix = bytes.getByteSuffix();
        String byteSeparator = bytes.getByteSeparator();
        String groupSeparator = bytes.getGroupSeparator();
        int i11 = parsedByteArrayMaxSize(length, bytesPerLine, bytesPerGroup, groupSeparator.length(), byteSeparator.length(), bytePrefix.length(), byteSuffix.length());
        byte[] bArr = new byte[i11];
        int iB = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (iB < length) {
            if (i13 == bytesPerLine) {
                if (str.charAt(iB) == '\r') {
                    int i15 = iB + 1;
                    iB = (i15 >= length || str.charAt(i15) != '\n') ? i15 : iB + 2;
                } else {
                    if (str.charAt(iB) != '\n') {
                        StringBuilder sbC = o1.c("Expected a new line at index ", iB, ", but was ");
                        sbC.append(str.charAt(iB));
                        throw new NumberFormatException(sbC.toString());
                    }
                    iB++;
                }
                i13 = i10;
                i14 = i13;
            } else if (i14 == bytesPerGroup) {
                iB = b(iB, length, str, groupSeparator, "group separator");
                i14 = i10;
            } else if (i14 != 0) {
                iB = b(iB, length, str, byteSeparator, "byte separator");
            }
            int iB2 = b(iB, length, str, bytePrefix, "byte prefix");
            int i16 = iB2 + 2;
            c(str, iB2, kotlin.ranges.c.coerceAtMost(i16, length), 2, true);
            bArr[i12] = (byte) ((d(iB2, str) << 4) | d(iB2 + 1, str));
            iB = b(i16, length, str, byteSuffix, "byte suffix");
            i12++;
            i14++;
            i10 = 0;
            i13++;
        }
        if (i12 == i11) {
            return bArr;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i12);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }

    public static /* synthetic */ byte[] hexToByteArray$default(String str, HexFormat hexFormat, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return hexToByteArray(str, hexFormat);
    }

    @SinceKotlin(version = "1.9")
    @ExperimentalStdlibApi
    public static final int hexToInt(@NotNull String str, @NotNull HexFormat format) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return (int) e(str, str.length(), format, 8);
    }

    public static /* synthetic */ int hexToInt$default(String str, HexFormat hexFormat, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return hexToInt(str, hexFormat);
    }

    @SinceKotlin(version = "1.9")
    @ExperimentalStdlibApi
    public static final long hexToLong(@NotNull String str, @NotNull HexFormat format) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return e(str, str.length(), format, 16);
    }

    public static /* synthetic */ long hexToLong$default(String str, HexFormat hexFormat, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return hexToLong(str, hexFormat);
    }

    @SinceKotlin(version = "1.9")
    @ExperimentalStdlibApi
    public static final short hexToShort(@NotNull String str, @NotNull HexFormat format) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return (short) e(str, str.length(), format, 4);
    }

    public static /* synthetic */ short hexToShort$default(String str, HexFormat hexFormat, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return hexToShort(str, hexFormat);
    }

    public static final int parsedByteArrayMaxSize(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        long jA;
        if (i10 <= 0) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        long j10 = ((long) i15) + 2 + ((long) i16);
        long jA2 = a(i12, i14, j10);
        if (i11 <= i12) {
            jA = a(i11, i14, j10);
        } else {
            jA = a(i11 / i12, i13, jA2);
            int i17 = i11 % i12;
            if (i17 != 0) {
                jA = a(i17, i14, j10) + jA + ((long) i13);
            }
        }
        long j11 = i10;
        long jG = g(1, j11, jA);
        long j12 = j11 - ((jA + 1) * jG);
        long jG2 = g(i13, j12, jA2);
        long j13 = j12 - ((jA2 + ((long) i13)) * jG2);
        long jG3 = g(i14, j13, j10);
        return (int) (androidx.emoji2.text.flatbuffer.a.a(jG2, i12, jG * ((long) i11), jG3) + ((long) (j13 - ((j10 + ((long) i14)) * jG3) <= 0 ? 0 : 1)));
    }

    @SinceKotlin(version = "1.9")
    @ExperimentalStdlibApi
    @NotNull
    public static final String toHexString(@NotNull byte[] bArr, @NotNull HexFormat format) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return toHexString(bArr, 0, bArr.length, format);
    }

    public static /* synthetic */ String toHexString$default(byte[] bArr, HexFormat hexFormat, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return toHexString(bArr, hexFormat);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0080  */
    /* JADX WARN: Code duplicated, block: B:29:0x0083 A[SYNTHETIC] */
    @SinceKotlin(version = "1.9")
    @ExperimentalStdlibApi
    @NotNull
    public static final String toHexString(@NotNull byte[] bArr, int i10, int i11, @NotNull HexFormat format) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        AbstractList.INSTANCE.checkBoundsIndexes$kotlin_stdlib(i10, i11, bArr.length);
        if (i10 == i11) {
            return "";
        }
        String str = format.getUpperCase() ? "0123456789ABCDEF" : "0123456789abcdef";
        HexFormat.BytesHexFormat bytes = format.getBytes();
        int bytesPerLine = bytes.getBytesPerLine();
        int bytesPerGroup = bytes.getBytesPerGroup();
        String bytePrefix = bytes.getBytePrefix();
        String byteSuffix = bytes.getByteSuffix();
        String byteSeparator = bytes.getByteSeparator();
        String groupSeparator = bytes.getGroupSeparator();
        int i12 = formattedStringLength(i11 - i10, bytesPerLine, bytesPerGroup, groupSeparator.length(), byteSeparator.length(), bytePrefix.length(), byteSuffix.length());
        StringBuilder sb2 = new StringBuilder(i12);
        int i13 = 0;
        int i14 = 0;
        for (int i15 = i10; i15 < i11; i15++) {
            byte b10 = bArr[i15];
            int i16 = b10 & 255;
            if (i13 == bytesPerLine) {
                sb2.append('\n');
                i13 = 0;
            } else {
                if (i14 == bytesPerGroup) {
                    sb2.append(groupSeparator);
                }
                if (i14 != 0) {
                    sb2.append(byteSeparator);
                }
                sb2.append(bytePrefix);
                sb2.append(str.charAt(i16 >> 4));
                sb2.append(str.charAt(b10 & 15));
                sb2.append(byteSuffix);
                i14++;
                i13++;
            }
            i14 = 0;
            if (i14 != 0) {
                sb2.append(byteSeparator);
            }
            sb2.append(bytePrefix);
            sb2.append(str.charAt(i16 >> 4));
            sb2.append(str.charAt(b10 & 15));
            sb2.append(byteSuffix);
            i14++;
            i13++;
        }
        if (i12 != sb2.length()) {
            throw new IllegalStateException("Check failed.".toString());
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ String toHexString$default(byte[] bArr, int i10, int i11, HexFormat hexFormat, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = bArr.length;
        }
        if ((i12 & 4) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return toHexString(bArr, i10, i11, hexFormat);
    }

    public static /* synthetic */ String toHexString$default(byte b10, HexFormat hexFormat, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return toHexString(b10, hexFormat);
    }

    public static /* synthetic */ String toHexString$default(short s4, HexFormat hexFormat, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return toHexString(s4, hexFormat);
    }

    public static /* synthetic */ String toHexString$default(int i10, HexFormat hexFormat, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return toHexString(i10, hexFormat);
    }

    public static /* synthetic */ String toHexString$default(long j10, HexFormat hexFormat, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return toHexString(j10, hexFormat);
    }

    @SinceKotlin(version = "1.9")
    @ExperimentalStdlibApi
    @NotNull
    public static final String toHexString(byte b10, @NotNull HexFormat format) {
        Intrinsics.checkNotNullParameter(format, "format");
        return f(b10, format, 8);
    }

    @SinceKotlin(version = "1.9")
    @ExperimentalStdlibApi
    @NotNull
    public static final String toHexString(short s4, @NotNull HexFormat format) {
        Intrinsics.checkNotNullParameter(format, "format");
        return f(s4, format, 16);
    }

    @SinceKotlin(version = "1.9")
    @ExperimentalStdlibApi
    @NotNull
    public static final String toHexString(int i10, @NotNull HexFormat format) {
        Intrinsics.checkNotNullParameter(format, "format");
        return f(i10, format, 32);
    }

    @SinceKotlin(version = "1.9")
    @ExperimentalStdlibApi
    @NotNull
    public static final String toHexString(long j10, @NotNull HexFormat format) {
        Intrinsics.checkNotNullParameter(format, "format");
        return f(j10, format, 64);
    }
}
