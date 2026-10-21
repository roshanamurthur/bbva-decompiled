package kotlin.text;

import kotlin.SinceKotlin;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: StringNumberConversions.kt */
/* JADX INFO: loaded from: classes12.dex */
public class k extends j {
    @NotNull
    public static final Void numberFormatError(@NotNull String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        throw new NumberFormatException(androidx.camera.core.impl.utils.a.a("Invalid number format: '", input, '\''));
    }

    @SinceKotlin(version = "1.1")
    @Nullable
    public static final Byte toByteOrNull(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return toByteOrNull(str, 10);
    }

    @SinceKotlin(version = "1.1")
    @Nullable
    public static Integer toIntOrNull(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return toIntOrNull(str, 10);
    }

    @SinceKotlin(version = "1.1")
    @Nullable
    public static Long toLongOrNull(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return toLongOrNull(str, 10);
    }

    @SinceKotlin(version = "1.1")
    @Nullable
    public static final Short toShortOrNull(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return toShortOrNull(str, 10);
    }

    @SinceKotlin(version = "1.1")
    @Nullable
    public static final Byte toByteOrNull(@NotNull String str, int i10) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Integer intOrNull = toIntOrNull(str, i10);
        if (intOrNull == null || (iIntValue = intOrNull.intValue()) < -128 || iIntValue > 127) {
            return null;
        }
        return Byte.valueOf((byte) iIntValue);
    }

    @SinceKotlin(version = "1.1")
    @Nullable
    public static final Integer toIntOrNull(@NotNull String str, int i10) {
        boolean z10;
        int i11;
        int i12;
        Intrinsics.checkNotNullParameter(str, "<this>");
        CharsKt__CharJVMKt.checkRadix(i10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i13 = 0;
        char cCharAt = str.charAt(0);
        int i14 = -2147483647;
        if (Intrinsics.compare((int) cCharAt, 48) < 0) {
            i11 = 1;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '-') {
                i14 = Integer.MIN_VALUE;
                z10 = true;
            } else {
                if (cCharAt != '+') {
                    return null;
                }
                z10 = false;
            }
        } else {
            z10 = false;
            i11 = 0;
        }
        int i15 = -59652323;
        while (i11 < length) {
            int iDigitOf = CharsKt__CharJVMKt.digitOf(str.charAt(i11), i10);
            if (iDigitOf < 0) {
                return null;
            }
            if ((i13 < i15 && (i15 != -59652323 || i13 < (i15 = i14 / i10))) || (i12 = i13 * i10) < i14 + iDigitOf) {
                return null;
            }
            i13 = i12 - iDigitOf;
            i11++;
        }
        return z10 ? Integer.valueOf(i13) : Integer.valueOf(-i13);
    }

    @SinceKotlin(version = "1.1")
    @Nullable
    public static final Long toLongOrNull(@NotNull String str, int i10) {
        boolean z10;
        Intrinsics.checkNotNullParameter(str, "<this>");
        CharsKt__CharJVMKt.checkRadix(i10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i11 = 0;
        char cCharAt = str.charAt(0);
        long j10 = -9223372036854775807L;
        if (Intrinsics.compare((int) cCharAt, 48) < 0) {
            z10 = true;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '-') {
                j10 = Long.MIN_VALUE;
                i11 = 1;
            } else {
                if (cCharAt != '+') {
                    return null;
                }
                z10 = false;
                i11 = 1;
            }
        } else {
            z10 = false;
        }
        long j11 = -256204778801521550L;
        long j12 = 0;
        long j13 = -256204778801521550L;
        while (i11 < length) {
            int iDigitOf = CharsKt__CharJVMKt.digitOf(str.charAt(i11), i10);
            if (iDigitOf < 0) {
                return null;
            }
            if (j12 < j13) {
                if (j13 == j11) {
                    j13 = j10 / ((long) i10);
                    if (j12 < j13) {
                    }
                }
                return null;
            }
            long j14 = j12 * ((long) i10);
            long j15 = iDigitOf;
            if (j14 < j10 + j15) {
                return null;
            }
            j12 = j14 - j15;
            i11++;
            j11 = -256204778801521550L;
        }
        return z10 ? Long.valueOf(j12) : Long.valueOf(-j12);
    }

    @SinceKotlin(version = "1.1")
    @Nullable
    public static final Short toShortOrNull(@NotNull String str, int i10) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Integer intOrNull = toIntOrNull(str, i10);
        if (intOrNull == null || (iIntValue = intOrNull.intValue()) < -32768 || iIntValue > 32767) {
            return null;
        }
        return Short.valueOf((short) iIntValue);
    }
}
