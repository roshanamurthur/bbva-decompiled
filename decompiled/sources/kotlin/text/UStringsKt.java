package kotlin.text;

import com.mastercard.sonic.androidsvg.SvgConstantsKt;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.UShort;
import kotlin.UnsignedKt;
import kotlin.WasExperimental;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: UStrings.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\u001a\u001b\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001b\u0010\u0000\u001a\u00020\u0001*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u001b\u0010\u0000\u001a\u00020\u0001*\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u001b\u0010\u0000\u001a\u00020\u0001*\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0011\u0010\u0010\u001a\u00020\u0002*\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0011\u001a\u0019\u0010\u0010\u001a\u00020\u0002*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\u0012\u001a\u000e\u0010\u0013\u001a\u0004\u0018\u00010\u0002*\u00020\u0001H\u0007\u001a\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u0002*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007\u001a\u0011\u0010\u0014\u001a\u00020\u0007*\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0015\u001a\u0019\u0010\u0014\u001a\u00020\u0007*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\u0016\u001a\u000e\u0010\u0017\u001a\u0004\u0018\u00010\u0007*\u00020\u0001H\u0007\u001a\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u0007*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007\u001a\u0011\u0010\u0018\u001a\u00020\n*\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0019\u001a\u0019\u0010\u0018\u001a\u00020\n*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\u001a\u001a\u000e\u0010\u001b\u001a\u0004\u0018\u00010\n*\u00020\u0001H\u0007\u001a\u0016\u0010\u001b\u001a\u0004\u0018\u00010\n*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007\u001a\u0011\u0010\u001c\u001a\u00020\r*\u00020\u0001H\u0007¢\u0006\u0002\u0010\u001d\u001a\u0019\u0010\u001c\u001a\u00020\r*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\u001e\u001a\u000e\u0010\u001f\u001a\u0004\u0018\u00010\r*\u00020\u0001H\u0007\u001a\u0016\u0010\u001f\u001a\u0004\u0018\u00010\r*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006 "}, d2 = {"toString", "", "Lkotlin/UByte;", "radix", "", "toString-LxnNnR4", "(BI)Ljava/lang/String;", "Lkotlin/UInt;", "toString-V7xB4Y4", "(II)Ljava/lang/String;", "Lkotlin/ULong;", "toString-JSWoG40", "(JI)Ljava/lang/String;", "Lkotlin/UShort;", "toString-olVBNx4", "(SI)Ljava/lang/String;", "toUByte", "(Ljava/lang/String;)B", "(Ljava/lang/String;I)B", "toUByteOrNull", "toUInt", "(Ljava/lang/String;)I", "(Ljava/lang/String;I)I", "toUIntOrNull", "toULong", "(Ljava/lang/String;)J", "(Ljava/lang/String;I)J", "toULongOrNull", "toUShort", "(Ljava/lang/String;)S", "(Ljava/lang/String;I)S", "toUShortOrNull", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
@JvmName(name = "UStringsKt")
public final class UStringsKt {
    @SinceKotlin(version = SvgConstantsKt.VERSION)
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @NotNull
    /* JADX INFO: renamed from: toString-JSWoG40, reason: not valid java name */
    public static final String m5800toStringJSWoG40(long j10, int i10) {
        return UnsignedKt.ulongToString(j10, CharsKt__CharJVMKt.checkRadix(i10));
    }

    @SinceKotlin(version = SvgConstantsKt.VERSION)
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @NotNull
    /* JADX INFO: renamed from: toString-LxnNnR4, reason: not valid java name */
    public static final String m5801toStringLxnNnR4(byte b10, int i10) {
        String string = Integer.toString(b10 & 255, CharsKt__CharJVMKt.checkRadix(i10));
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @SinceKotlin(version = SvgConstantsKt.VERSION)
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @NotNull
    /* JADX INFO: renamed from: toString-V7xB4Y4, reason: not valid java name */
    public static final String m5802toStringV7xB4Y4(int i10, int i11) {
        String string = Long.toString(((long) i10) & 4294967295L, CharsKt__CharJVMKt.checkRadix(i11));
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @SinceKotlin(version = SvgConstantsKt.VERSION)
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @NotNull
    /* JADX INFO: renamed from: toString-olVBNx4, reason: not valid java name */
    public static final String m5803toStringolVBNx4(short s4, int i10) {
        String string = Integer.toString(s4 & UShort.MAX_VALUE, CharsKt__CharJVMKt.checkRadix(i10));
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @SinceKotlin(version = SvgConstantsKt.VERSION)
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final byte toUByte(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        UByte uByteOrNull = toUByteOrNull(str);
        if (uByteOrNull != null) {
            return uByteOrNull.getF79395p0();
        }
        k.numberFormatError(str);
        throw new KotlinNothingValueException();
    }

    @SinceKotlin(version = SvgConstantsKt.VERSION)
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @Nullable
    public static final UByte toUByteOrNull(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return toUByteOrNull(str, 10);
    }

    @SinceKotlin(version = SvgConstantsKt.VERSION)
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final int toUInt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        UInt uIntOrNull = toUIntOrNull(str);
        if (uIntOrNull != null) {
            return uIntOrNull.getF79399p0();
        }
        k.numberFormatError(str);
        throw new KotlinNothingValueException();
    }

    @SinceKotlin(version = SvgConstantsKt.VERSION)
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @Nullable
    public static final UInt toUIntOrNull(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return toUIntOrNull(str, 10);
    }

    @SinceKotlin(version = SvgConstantsKt.VERSION)
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final long toULong(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        ULong uLongOrNull = toULongOrNull(str);
        if (uLongOrNull != null) {
            return uLongOrNull.getF79403p0();
        }
        k.numberFormatError(str);
        throw new KotlinNothingValueException();
    }

    @SinceKotlin(version = SvgConstantsKt.VERSION)
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @Nullable
    public static final ULong toULongOrNull(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return toULongOrNull(str, 10);
    }

    @SinceKotlin(version = SvgConstantsKt.VERSION)
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final short toUShort(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        UShort uShortOrNull = toUShortOrNull(str);
        if (uShortOrNull != null) {
            return uShortOrNull.getF79407p0();
        }
        k.numberFormatError(str);
        throw new KotlinNothingValueException();
    }

    @SinceKotlin(version = SvgConstantsKt.VERSION)
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @Nullable
    public static final UShort toUShortOrNull(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return toUShortOrNull(str, 10);
    }

    @SinceKotlin(version = SvgConstantsKt.VERSION)
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final byte toUByte(@NotNull String str, int i10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        UByte uByteOrNull = toUByteOrNull(str, i10);
        if (uByteOrNull != null) {
            return uByteOrNull.getF79395p0();
        }
        k.numberFormatError(str);
        throw new KotlinNothingValueException();
    }

    @SinceKotlin(version = SvgConstantsKt.VERSION)
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @Nullable
    public static final UByte toUByteOrNull(@NotNull String str, int i10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        UInt uIntOrNull = toUIntOrNull(str, i10);
        if (uIntOrNull == null) {
            return null;
        }
        int f79399p0 = uIntOrNull.getF79399p0();
        if (Integer.compare(f79399p0 ^ Integer.MIN_VALUE, UInt.m5570constructorimpl(255) ^ Integer.MIN_VALUE) > 0) {
            return null;
        }
        return UByte.m5544boximpl(UByte.m5545constructorimpl((byte) f79399p0));
    }

    @SinceKotlin(version = SvgConstantsKt.VERSION)
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final int toUInt(@NotNull String str, int i10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        UInt uIntOrNull = toUIntOrNull(str, i10);
        if (uIntOrNull != null) {
            return uIntOrNull.getF79399p0();
        }
        k.numberFormatError(str);
        throw new KotlinNothingValueException();
    }

    @SinceKotlin(version = SvgConstantsKt.VERSION)
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @Nullable
    public static final UInt toUIntOrNull(@NotNull String str, int i10) {
        int i11;
        Intrinsics.checkNotNullParameter(str, "<this>");
        CharsKt__CharJVMKt.checkRadix(i10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i12 = 0;
        char cCharAt = str.charAt(0);
        if (Intrinsics.compare((int) cCharAt, 48) < 0) {
            i11 = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        } else {
            i11 = 0;
        }
        int iM5570constructorimpl = UInt.m5570constructorimpl(i10);
        int i13 = 119304647;
        int i14 = 119304647;
        while (i11 < length) {
            int iDigitOf = CharsKt__CharJVMKt.digitOf(str.charAt(i11), i10);
            if (iDigitOf < 0) {
                return null;
            }
            int i15 = i12 ^ Integer.MIN_VALUE;
            if (Integer.compare(i15, i14 ^ Integer.MIN_VALUE) > 0) {
                if (i14 == i13) {
                    i14 = (int) ((((long) (-1)) & 4294967295L) / (((long) iM5570constructorimpl) & 4294967295L));
                    if (Integer.compare(i15, i14 ^ Integer.MIN_VALUE) > 0) {
                    }
                }
                return null;
            }
            int iM5570constructorimpl2 = UInt.m5570constructorimpl(i12 * iM5570constructorimpl);
            int iM5570constructorimpl3 = UInt.m5570constructorimpl(UInt.m5570constructorimpl(iDigitOf) + iM5570constructorimpl2);
            if (Integer.compare(iM5570constructorimpl3 ^ Integer.MIN_VALUE, iM5570constructorimpl2 ^ Integer.MIN_VALUE) < 0) {
                return null;
            }
            i11++;
            i12 = iM5570constructorimpl3;
            i13 = 119304647;
        }
        return UInt.m5569boximpl(i12);
    }

    @SinceKotlin(version = SvgConstantsKt.VERSION)
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final long toULong(@NotNull String str, int i10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        ULong uLongOrNull = toULongOrNull(str, i10);
        if (uLongOrNull != null) {
            return uLongOrNull.getF79403p0();
        }
        k.numberFormatError(str);
        throw new KotlinNothingValueException();
    }

    @SinceKotlin(version = SvgConstantsKt.VERSION)
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @Nullable
    public static final ULong toULongOrNull(@NotNull String str, int i10) {
        int i11;
        Intrinsics.checkNotNullParameter(str, "<this>");
        CharsKt__CharJVMKt.checkRadix(i10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        char cCharAt = str.charAt(0);
        if (Intrinsics.compare((int) cCharAt, 48) >= 0) {
            i11 = 0;
        } else {
            if (length == 1 || cCharAt != '+') {
                return null;
            }
            i11 = 1;
        }
        long jM5595constructorimpl = ULong.m5595constructorimpl(i10);
        long j10 = 0;
        long jM5595constructorimpl2 = 0;
        long j11 = 512409557603043100L;
        while (i11 < length) {
            int iDigitOf = CharsKt__CharJVMKt.digitOf(str.charAt(i11), i10);
            if (iDigitOf < 0) {
                return null;
            }
            int i12 = i11;
            long j12 = jM5595constructorimpl2 ^ Long.MIN_VALUE;
            long j13 = jM5595constructorimpl;
            if (Long.compare(j12, j11 ^ Long.MIN_VALUE) > 0) {
                if (j11 == 512409557603043100L) {
                    if (j13 < j10) {
                        j11 = Long.MAX_VALUE < (j13 ^ Long.MIN_VALUE) ? j10 : 1L;
                    } else {
                        long j14 = (Long.MAX_VALUE / j13) << 1;
                        j11 = j14 + ((long) ((((-1) - (j14 * j13)) ^ Long.MIN_VALUE) < (j13 ^ Long.MIN_VALUE) ? 0 : 1));
                    }
                    if (Long.compare(j12, j11 ^ Long.MIN_VALUE) > 0) {
                    }
                }
                return null;
            }
            long jM5595constructorimpl3 = ULong.m5595constructorimpl(jM5595constructorimpl2 * j13);
            jM5595constructorimpl2 = ULong.m5595constructorimpl(ULong.m5595constructorimpl(((long) UInt.m5570constructorimpl(iDigitOf)) & 4294967295L) + jM5595constructorimpl3);
            if (Long.compare(jM5595constructorimpl2 ^ Long.MIN_VALUE, jM5595constructorimpl3 ^ Long.MIN_VALUE) < 0) {
                return null;
            }
            i11 = i12 + 1;
            jM5595constructorimpl = j13;
            j10 = 0;
        }
        return ULong.m5594boximpl(jM5595constructorimpl2);
    }

    @SinceKotlin(version = SvgConstantsKt.VERSION)
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final short toUShort(@NotNull String str, int i10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        UShort uShortOrNull = toUShortOrNull(str, i10);
        if (uShortOrNull != null) {
            return uShortOrNull.getF79407p0();
        }
        k.numberFormatError(str);
        throw new KotlinNothingValueException();
    }

    @SinceKotlin(version = SvgConstantsKt.VERSION)
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @Nullable
    public static final UShort toUShortOrNull(@NotNull String str, int i10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        UInt uIntOrNull = toUIntOrNull(str, i10);
        if (uIntOrNull == null) {
            return null;
        }
        int f79399p0 = uIntOrNull.getF79399p0();
        if (Integer.compare(f79399p0 ^ Integer.MIN_VALUE, UInt.m5570constructorimpl(65535) ^ Integer.MIN_VALUE) > 0) {
            return null;
        }
        return UShort.m5619boximpl(UShort.m5620constructorimpl((short) f79399p0));
    }
}
