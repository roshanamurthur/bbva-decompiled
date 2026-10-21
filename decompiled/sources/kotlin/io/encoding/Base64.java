package kotlin.io.encoding;

import androidx.appcompat.widget.g0;
import androidx.camera.camera2.internal.n1;
import androidx.collection.h;
import androidx.exifinterface.media.ExifInterface;
import java.io.IOException;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.collections.AbstractList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Base64.kt */
/* JADX INFO: loaded from: classes12.dex */
@ExperimentalEncodingApi
@SinceKotlin(version = "1.8")
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0017\u0018\u0000 /2\u00020\u0001:\u0001/J\"\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004J4\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004J\"\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004J?\u0010\u0010\u001a\u00028\u0000\"\f\b\u0000\u0010\u000f*\u00060\rj\u0002`\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00028\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\"\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004J4\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004J\"\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00142\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004J4\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004J'\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J7\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010 \u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010%\u001a\u00020\"2\u0006\u0010!\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b#\u0010$R\u001a\u0010+\u001a\u00020&8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010.\u001a\u00020&8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b,\u0010(\u001a\u0004\b-\u0010*¨\u00060"}, d2 = {"Lkotlin/io/encoding/Base64;", "", "", "source", "", "startIndex", "endIndex", "encodeToByteArray", "destination", "destinationOffset", "encodeIntoByteArray", "", "encode", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "encodeToAppendable", "([BLjava/lang/Appendable;II)Ljava/lang/Appendable;", "decode", "decodeIntoByteArray", "", "encodeToByteArrayImpl$kotlin_stdlib", "([BII)[B", "encodeToByteArrayImpl", "encodeIntoByteArrayImpl$kotlin_stdlib", "([B[BIII)I", "encodeIntoByteArrayImpl", "charsToBytesImpl$kotlin_stdlib", "(Ljava/lang/CharSequence;II)[B", "charsToBytesImpl", "bytesToStringImpl$kotlin_stdlib", "([B)Ljava/lang/String;", "bytesToStringImpl", "sourceSize", "", "checkSourceBounds$kotlin_stdlib", "(III)V", "checkSourceBounds", "", "a", "Z", "isUrlSafe$kotlin_stdlib", "()Z", "isUrlSafe", "b", "isMimeScheme$kotlin_stdlib", "isMimeScheme", "Default", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
public class Base64 {
    public static final int bytesPerGroup = 3;
    public static final int mimeLineLength = 76;
    public static final byte padSymbol = 61;
    public static final int symbolsPerGroup = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final boolean isUrlSafe;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final boolean isMimeScheme;

    /* JADX INFO: renamed from: Default, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final byte[] f79659c = {13, 10};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final Base64 f79660d = new Base64(true, false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final Base64 f79661e = new Base64(false, true);

    /* JADX INFO: renamed from: kotlin.io.encoding.Base64$Default, reason: from kotlin metadata */
    /* JADX INFO: compiled from: Base64.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0005R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0080T¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\tX\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lkotlin/io/encoding/Base64$Default;", "Lkotlin/io/encoding/Base64;", "()V", "Mime", "getMime", "()Lkotlin/io/encoding/Base64;", "UrlSafe", "getUrlSafe", "bitsPerByte", "", "bitsPerSymbol", "bytesPerGroup", "mimeGroupsPerLine", "mimeLineLength", "mimeLineSeparatorSymbols", "", "getMimeLineSeparatorSymbols$kotlin_stdlib", "()[B", "padSymbol", "", "symbolsPerGroup", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion extends Base64 {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Base64 getMime() {
            return Base64.f79661e;
        }

        @NotNull
        public final byte[] getMimeLineSeparatorSymbols$kotlin_stdlib() {
            return Base64.f79659c;
        }

        @NotNull
        public final Base64 getUrlSafe() {
            return Base64.f79660d;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Companion() {
            boolean z10 = false;
            super(z10, z10, null);
        }
    }

    public /* synthetic */ Base64(boolean z10, boolean z11, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, z11);
    }

    public static void a(int i10, int i11, int i12) {
        if (i11 < 0 || i11 > i10) {
            throw new IndexOutOfBoundsException(n1.e("destination offset: ", i11, ", destination size: ", i10));
        }
        int i13 = i11 + i12;
        if (i13 < 0 || i13 > i10) {
            StringBuilder sbE = h.e("The destination array does not have enough capacity, destination offset: ", i11, ", destination size: ", i10, ", capacity needed: ");
            sbE.append(i12);
            throw new IndexOutOfBoundsException(sbE.toString());
        }
    }

    public static /* synthetic */ byte[] decode$default(Base64 base64, byte[] bArr, int i10, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decode");
        }
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = bArr.length;
        }
        return base64.decode(bArr, i10, i11);
    }

    public static /* synthetic */ int decodeIntoByteArray$default(Base64 base64, byte[] bArr, byte[] bArr2, int i10, int i11, int i12, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeIntoByteArray");
        }
        int i14 = (i13 & 4) != 0 ? 0 : i10;
        int i15 = (i13 & 8) != 0 ? 0 : i11;
        if ((i13 & 16) != 0) {
            i12 = bArr.length;
        }
        return base64.decodeIntoByteArray(bArr, bArr2, i14, i15, i12);
    }

    public static /* synthetic */ String encode$default(Base64 base64, byte[] bArr, int i10, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encode");
        }
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = bArr.length;
        }
        return base64.encode(bArr, i10, i11);
    }

    public static /* synthetic */ int encodeIntoByteArray$default(Base64 base64, byte[] bArr, byte[] bArr2, int i10, int i11, int i12, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encodeIntoByteArray");
        }
        int i14 = (i13 & 4) != 0 ? 0 : i10;
        int i15 = (i13 & 8) != 0 ? 0 : i11;
        if ((i13 & 16) != 0) {
            i12 = bArr.length;
        }
        return base64.encodeIntoByteArray(bArr, bArr2, i14, i15, i12);
    }

    public static /* synthetic */ Appendable encodeToAppendable$default(Base64 base64, byte[] bArr, Appendable appendable, int i10, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encodeToAppendable");
        }
        if ((i12 & 4) != 0) {
            i10 = 0;
        }
        if ((i12 & 8) != 0) {
            i11 = bArr.length;
        }
        return base64.encodeToAppendable(bArr, appendable, i10, i11);
    }

    public static /* synthetic */ byte[] encodeToByteArray$default(Base64 base64, byte[] bArr, int i10, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encodeToByteArray");
        }
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = bArr.length;
        }
        return base64.encodeToByteArray(bArr, i10, i11);
    }

    public final int b(int i10, int i11, byte[] bArr, int i12, byte[] bArr2) {
        boolean z10;
        int i13;
        int i14;
        int[] iArr = this.isUrlSafe ? Base64Kt.f79667d : Base64Kt.f79665b;
        int i15 = -8;
        int i16 = i10;
        int i17 = -8;
        int i18 = 0;
        int i19 = i11;
        while (true) {
            z10 = this.isMimeScheme;
            if (i19 >= i12) {
                break;
            }
            if (i17 == i15 && (i14 = i19 + 3) < i12) {
                int i20 = i19 + 4;
                int i21 = (iArr[bArr[i19 + 2] & 255] << 6) | (iArr[bArr[i19 + 1] & 255] << 12) | (iArr[bArr[i19] & 255] << 18) | iArr[bArr[i14] & 255];
                if (i21 >= 0) {
                    bArr2[i16] = (byte) (i21 >> 16);
                    int i22 = i16 + 2;
                    bArr2[i16 + 1] = (byte) (i21 >> 8);
                    i16 += 3;
                    bArr2[i22] = (byte) i21;
                    i19 = i20;
                    i15 = -8;
                }
            }
            int i23 = bArr[i19] & 255;
            int i24 = iArr[i23];
            if (i24 >= 0) {
                i13 = -8;
                i19++;
                i18 = (i18 << 6) | i24;
                int i25 = i17 + 6;
                if (i25 >= 0) {
                    bArr2[i16] = (byte) (i18 >>> i25);
                    i18 &= (1 << i25) - 1;
                    i17 -= 2;
                    i16++;
                } else {
                    i17 = i25;
                }
            } else {
                if (i24 == -2) {
                    if (i17 == -8) {
                        throw new IllegalArgumentException(g0.c("Redundant pad character at index ", i19));
                    }
                    if (i17 != -6) {
                        if (i17 == -4) {
                            int i26 = i19 + 1;
                            if (z10) {
                                while (i26 < i12) {
                                    if (Base64Kt.f79665b[bArr[i26] & 255] != -1) {
                                        break;
                                    }
                                    i26++;
                                }
                            }
                            if (i26 != i12 && bArr[i26] == 61) {
                                i19 = i26 + 1;
                                break;
                            }
                            throw new IllegalArgumentException(g0.c("Missing one pad character at index ", i26));
                        }
                        if (i17 != -2) {
                            throw new IllegalStateException("Unreachable".toString());
                        }
                        i19++;
                        break;
                    }
                    i19++;
                    break;
                }
                i13 = -8;
                if (!z10) {
                    StringBuilder sb2 = new StringBuilder("Invalid symbol '");
                    sb2.append((char) i23);
                    sb2.append("'(");
                    String string = Integer.toString(i23, CharsKt.checkRadix(8));
                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                    sb2.append(string);
                    sb2.append(") at index ");
                    sb2.append(i19);
                    throw new IllegalArgumentException(sb2.toString());
                }
                i19++;
            }
            i15 = i13;
        }
        if (i17 == -2) {
            throw new IllegalArgumentException("The last unit of input does not have enough bits");
        }
        if (z10) {
            while (i19 < i12) {
                if (Base64Kt.f79665b[bArr[i19] & 255] != -1) {
                    break;
                }
                i19++;
            }
        }
        if (i19 >= i12) {
            return i16 - i10;
        }
        int i27 = bArr[i19] & 255;
        StringBuilder sb3 = new StringBuilder("Symbol '");
        sb3.append((char) i27);
        sb3.append("'(");
        String string2 = Integer.toString(i27, CharsKt.checkRadix(8));
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        sb3.append(string2);
        sb3.append(") at index ");
        throw new IllegalArgumentException(androidx.appcompat.widget.a.c(sb3, i19 - 1, " is prohibited after the pad character"));
    }

    @NotNull
    public final String bytesToStringImpl$kotlin_stdlib(@NotNull byte[] source) {
        Intrinsics.checkNotNullParameter(source, "source");
        StringBuilder sb2 = new StringBuilder(source.length);
        for (byte b10 : source) {
            sb2.append((char) b10);
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public final int c(int i10, int i11, byte[] bArr) {
        int i12 = i11 - i10;
        if (i12 == 0) {
            return 0;
        }
        if (i12 == 1) {
            throw new IllegalArgumentException(n1.e("Input should have at list 2 symbols for Base64 decoding, startIndex: ", i10, ", endIndex: ", i11));
        }
        if (this.isMimeScheme) {
            while (i10 < i11) {
                int i13 = Base64Kt.f79665b[bArr[i10] & 255];
                if (i13 < 0) {
                    if (i13 == -2) {
                        i12 -= i11 - i10;
                        break;
                    }
                    i12--;
                }
                i10++;
            }
        } else if (bArr[i11 - 1] == 61) {
            i12 = bArr[i11 + (-2)] == 61 ? i12 - 2 : i12 - 1;
        }
        return (int) ((((long) i12) * ((long) 6)) / ((long) 8));
    }

    @NotNull
    public final byte[] charsToBytesImpl$kotlin_stdlib(@NotNull CharSequence source, int startIndex, int endIndex) {
        Intrinsics.checkNotNullParameter(source, "source");
        checkSourceBounds$kotlin_stdlib(source.length(), startIndex, endIndex);
        byte[] bArr = new byte[endIndex - startIndex];
        int i10 = 0;
        while (startIndex < endIndex) {
            char cCharAt = source.charAt(startIndex);
            if (cCharAt <= 255) {
                bArr[i10] = (byte) cCharAt;
                i10++;
            } else {
                bArr[i10] = 63;
                i10++;
            }
            startIndex++;
        }
        return bArr;
    }

    public final void checkSourceBounds$kotlin_stdlib(int sourceSize, int startIndex, int endIndex) {
        AbstractList.INSTANCE.checkBoundsIndexes$kotlin_stdlib(startIndex, endIndex, sourceSize);
    }

    public final int d(int i10) {
        int i11 = (i10 + 2) / 3;
        int i12 = ((this.isMimeScheme ? (i11 - 1) / 19 : 0) * 2) + (i11 * 4);
        if (i12 >= 0) {
            return i12;
        }
        throw new IllegalArgumentException("Input is too big");
    }

    @NotNull
    public final byte[] decode(@NotNull byte[] source, int startIndex, int endIndex) {
        Intrinsics.checkNotNullParameter(source, "source");
        checkSourceBounds$kotlin_stdlib(source.length, startIndex, endIndex);
        int iC = c(startIndex, endIndex, source);
        byte[] bArr = new byte[iC];
        if (b(0, startIndex, source, endIndex, bArr) == iC) {
            return bArr;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final int decodeIntoByteArray(@NotNull byte[] source, @NotNull byte[] destination, int destinationOffset, int startIndex, int endIndex) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(destination, "destination");
        checkSourceBounds$kotlin_stdlib(source.length, startIndex, endIndex);
        a(destination.length, destinationOffset, c(startIndex, endIndex, source));
        return b(destinationOffset, startIndex, source, endIndex, destination);
    }

    @NotNull
    public final String encode(@NotNull byte[] source, int startIndex, int endIndex) {
        Intrinsics.checkNotNullParameter(source, "source");
        return new String(encodeToByteArrayImpl$kotlin_stdlib(source, startIndex, endIndex), Charsets.ISO_8859_1);
    }

    public final int encodeIntoByteArray(@NotNull byte[] source, @NotNull byte[] destination, int destinationOffset, int startIndex, int endIndex) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(destination, "destination");
        return encodeIntoByteArrayImpl$kotlin_stdlib(source, destination, destinationOffset, startIndex, endIndex);
    }

    public final int encodeIntoByteArrayImpl$kotlin_stdlib(@NotNull byte[] source, @NotNull byte[] destination, int destinationOffset, int startIndex, int endIndex) {
        int i10;
        int i11 = startIndex;
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(destination, "destination");
        checkSourceBounds$kotlin_stdlib(source.length, i11, endIndex);
        a(destination.length, destinationOffset, d(endIndex - i11));
        byte[] bArr = this.isUrlSafe ? Base64Kt.f79666c : Base64Kt.f79664a;
        int i12 = this.isMimeScheme ? 19 : Integer.MAX_VALUE;
        int i13 = destinationOffset;
        while (true) {
            i10 = i11 + 2;
            if (i10 >= endIndex) {
                break;
            }
            int iMin = Math.min((endIndex - i11) / 3, i12);
            for (int i14 = 0; i14 < iMin; i14++) {
                int i15 = source[i11] & 255;
                int i16 = i11 + 2;
                int i17 = source[i11 + 1] & 255;
                i11 += 3;
                int i18 = (i17 << 8) | (i15 << 16) | (source[i16] & 255);
                destination[i13] = bArr[i18 >>> 18];
                destination[i13 + 1] = bArr[(i18 >>> 12) & 63];
                int i19 = i13 + 3;
                destination[i13 + 2] = bArr[(i18 >>> 6) & 63];
                i13 += 4;
                destination[i19] = bArr[i18 & 63];
            }
            if (iMin == i12 && i11 != endIndex) {
                int i20 = i13 + 1;
                byte[] bArr2 = f79659c;
                destination[i13] = bArr2[0];
                i13 += 2;
                destination[i20] = bArr2[1];
            }
        }
        int i21 = endIndex - i11;
        if (i21 == 1) {
            int i22 = (source[i11] & 255) << 4;
            destination[i13] = bArr[i22 >>> 6];
            destination[i13 + 1] = bArr[i22 & 63];
            int i23 = i13 + 3;
            destination[i13 + 2] = padSymbol;
            i13 += 4;
            destination[i23] = padSymbol;
            i11++;
        } else if (i21 == 2) {
            int i24 = ((source[i11 + 1] & 255) << 2) | ((source[i11] & 255) << 10);
            destination[i13] = bArr[i24 >>> 12];
            destination[i13 + 1] = bArr[(i24 >>> 6) & 63];
            int i25 = i13 + 3;
            destination[i13 + 2] = bArr[i24 & 63];
            i13 += 4;
            destination[i25] = padSymbol;
            i11 = i10;
        }
        if (i11 == endIndex) {
            return i13 - destinationOffset;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @NotNull
    public final <A extends Appendable> A encodeToAppendable(@NotNull byte[] source, @NotNull A destination, int startIndex, int endIndex) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(destination, "destination");
        destination.append(new String(encodeToByteArrayImpl$kotlin_stdlib(source, startIndex, endIndex), Charsets.ISO_8859_1));
        return destination;
    }

    @NotNull
    public final byte[] encodeToByteArray(@NotNull byte[] source, int startIndex, int endIndex) {
        Intrinsics.checkNotNullParameter(source, "source");
        return encodeToByteArrayImpl$kotlin_stdlib(source, startIndex, endIndex);
    }

    @NotNull
    public final byte[] encodeToByteArrayImpl$kotlin_stdlib(@NotNull byte[] source, int startIndex, int endIndex) {
        Intrinsics.checkNotNullParameter(source, "source");
        checkSourceBounds$kotlin_stdlib(source.length, startIndex, endIndex);
        byte[] bArr = new byte[d(endIndex - startIndex)];
        encodeIntoByteArrayImpl$kotlin_stdlib(source, bArr, 0, startIndex, endIndex);
        return bArr;
    }

    /* JADX INFO: renamed from: isMimeScheme$kotlin_stdlib, reason: from getter */
    public final boolean getIsMimeScheme() {
        return this.isMimeScheme;
    }

    /* JADX INFO: renamed from: isUrlSafe$kotlin_stdlib, reason: from getter */
    public final boolean getIsUrlSafe() {
        return this.isUrlSafe;
    }

    public Base64(boolean z10, boolean z11) {
        this.isUrlSafe = z10;
        this.isMimeScheme = z11;
        if (z10 && z11) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    public static /* synthetic */ byte[] decode$default(Base64 base64, CharSequence charSequence, int i10, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decode");
        }
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = charSequence.length();
        }
        return base64.decode(charSequence, i10, i11);
    }

    public static /* synthetic */ int decodeIntoByteArray$default(Base64 base64, CharSequence charSequence, byte[] bArr, int i10, int i11, int i12, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeIntoByteArray");
        }
        int i14 = (i13 & 4) != 0 ? 0 : i10;
        int i15 = (i13 & 8) != 0 ? 0 : i11;
        if ((i13 & 16) != 0) {
            i12 = charSequence.length();
        }
        return base64.decodeIntoByteArray(charSequence, bArr, i14, i15, i12);
    }

    public final int decodeIntoByteArray(@NotNull CharSequence source, @NotNull byte[] destination, int destinationOffset, int startIndex, int endIndex) {
        byte[] bArrCharsToBytesImpl$kotlin_stdlib;
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (source instanceof String) {
            checkSourceBounds$kotlin_stdlib(source.length(), startIndex, endIndex);
            String strSubstring = ((String) source).substring(startIndex, endIndex);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            Charset charset = Charsets.ISO_8859_1;
            Intrinsics.checkNotNull(strSubstring, "null cannot be cast to non-null type java.lang.String");
            bArrCharsToBytesImpl$kotlin_stdlib = strSubstring.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bArrCharsToBytesImpl$kotlin_stdlib, "getBytes(...)");
        } else {
            bArrCharsToBytesImpl$kotlin_stdlib = charsToBytesImpl$kotlin_stdlib(source, startIndex, endIndex);
        }
        return decodeIntoByteArray$default(this, bArrCharsToBytesImpl$kotlin_stdlib, destination, destinationOffset, 0, 0, 24, (Object) null);
    }

    @NotNull
    public final byte[] decode(@NotNull CharSequence source, int startIndex, int endIndex) {
        byte[] bArrCharsToBytesImpl$kotlin_stdlib;
        Intrinsics.checkNotNullParameter(source, "source");
        if (source instanceof String) {
            checkSourceBounds$kotlin_stdlib(source.length(), startIndex, endIndex);
            String strSubstring = ((String) source).substring(startIndex, endIndex);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            Charset charset = Charsets.ISO_8859_1;
            Intrinsics.checkNotNull(strSubstring, "null cannot be cast to non-null type java.lang.String");
            bArrCharsToBytesImpl$kotlin_stdlib = strSubstring.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bArrCharsToBytesImpl$kotlin_stdlib, "getBytes(...)");
        } else {
            bArrCharsToBytesImpl$kotlin_stdlib = charsToBytesImpl$kotlin_stdlib(source, startIndex, endIndex);
        }
        return decode$default(this, bArrCharsToBytesImpl$kotlin_stdlib, 0, 0, 6, (Object) null);
    }
}
