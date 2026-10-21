package kotlin.text;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: StringNumberConversionsJVM.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nStringNumberConversionsJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringNumberConversionsJVM.kt\nkotlin/text/StringsKt__StringNumberConversionsJVMKt\n*L\n1#1,274:1\n265#1,7:275\n265#1,7:282\n265#1,7:289\n265#1,7:296\n*S KotlinDebug\n*F\n+ 1 StringNumberConversionsJVM.kt\nkotlin/text/StringsKt__StringNumberConversionsJVMKt\n*L\n142#1:275,7\n149#1:282,7\n229#1:289,7\n240#1:296,7\n*E\n"})
public class j extends i {
    private static final <T> T screenFloatValue$StringsKt__StringNumberConversionsJVMKt(String str, Function1<? super String, ? extends T> function1) {
        try {
            if (c.f82365b.matches(str)) {
                return function1.invoke(str);
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigDecimal toBigDecimal(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return new BigDecimal(str);
    }

    @SinceKotlin(version = "1.2")
    @Nullable
    public static final BigDecimal toBigDecimalOrNull(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            if (c.f82365b.matches(str)) {
                return new BigDecimal(str);
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigInteger toBigInteger(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return new BigInteger(str);
    }

    @SinceKotlin(version = "1.2")
    @Nullable
    public static final BigInteger toBigIntegerOrNull(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return toBigIntegerOrNull(str, 10);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final boolean toBoolean(String str) {
        return Boolean.parseBoolean(str);
    }

    @InlineOnly
    private static final byte toByte(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return Byte.parseByte(str);
    }

    @InlineOnly
    private static final double toDouble(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return Double.parseDouble(str);
    }

    @SinceKotlin(version = "1.1")
    @Nullable
    public static Double toDoubleOrNull(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            if (c.f82365b.matches(str)) {
                return Double.valueOf(Double.parseDouble(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @InlineOnly
    private static final float toFloat(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return Float.parseFloat(str);
    }

    @SinceKotlin(version = "1.1")
    @Nullable
    public static Float toFloatOrNull(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            if (c.f82365b.matches(str)) {
                return Float.valueOf(Float.parseFloat(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @InlineOnly
    private static final int toInt(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return Integer.parseInt(str);
    }

    @InlineOnly
    private static final long toLong(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return Long.parseLong(str);
    }

    @InlineOnly
    private static final short toShort(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return Short.parseShort(str);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final String toString(byte b10, int i10) {
        String string = Integer.toString(b10, CharsKt__CharJVMKt.checkRadix(i10));
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigDecimal toBigDecimal(String str, MathContext mathContext) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(mathContext, "mathContext");
        return new BigDecimal(str, mathContext);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigInteger toBigInteger(String str, int i10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return new BigInteger(str, CharsKt__CharJVMKt.checkRadix(i10));
    }

    @SinceKotlin(version = "1.2")
    @Nullable
    public static final BigInteger toBigIntegerOrNull(@NotNull String str, int i10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        CharsKt__CharJVMKt.checkRadix(i10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        if (length != 1) {
            for (int i11 = str.charAt(0) == '-' ? 1 : 0; i11 < length; i11++) {
                if (CharsKt__CharJVMKt.digitOf(str.charAt(i11), i10) < 0) {
                    return null;
                }
            }
        } else if (CharsKt__CharJVMKt.digitOf(str.charAt(0), i10) < 0) {
            return null;
        }
        return new BigInteger(str, CharsKt__CharJVMKt.checkRadix(i10));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final byte toByte(String str, int i10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return Byte.parseByte(str, CharsKt__CharJVMKt.checkRadix(i10));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final int toInt(String str, int i10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return Integer.parseInt(str, CharsKt__CharJVMKt.checkRadix(i10));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final long toLong(String str, int i10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return Long.parseLong(str, CharsKt__CharJVMKt.checkRadix(i10));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final short toShort(String str, int i10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return Short.parseShort(str, CharsKt__CharJVMKt.checkRadix(i10));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final String toString(short s4, int i10) {
        String string = Integer.toString(s4, CharsKt__CharJVMKt.checkRadix(i10));
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final String toString(int i10, int i11) {
        String string = Integer.toString(i10, CharsKt__CharJVMKt.checkRadix(i11));
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @SinceKotlin(version = "1.2")
    @Nullable
    public static final BigDecimal toBigDecimalOrNull(@NotNull String str, @NotNull MathContext mathContext) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(mathContext, "mathContext");
        try {
            if (c.f82365b.matches(str)) {
                return new BigDecimal(str, mathContext);
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final String toString(long j10, int i10) {
        String string = Long.toString(j10, CharsKt__CharJVMKt.checkRadix(i10));
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
