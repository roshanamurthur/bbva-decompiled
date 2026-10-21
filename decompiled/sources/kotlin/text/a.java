package kotlin.text;

import androidx.camera.camera2.internal.n1;
import com.mastercard.sonic.androidsvg.SvgConstantsKt;
import kotlin.ExperimentalStdlibApi;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.CharRange;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Char.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nChar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Char.kt\nkotlin/text/CharsKt__CharKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,344:1\n1#2:345\n*E\n"})
public class a extends CharsKt__CharJVMKt {
    @SinceKotlin(version = SvgConstantsKt.VERSION)
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final char digitToChar(int i10) {
        if (new IntRange(0, 9).contains(i10)) {
            return (char) (i10 + 48);
        }
        throw new IllegalArgumentException(androidx.camera.core.impl.utils.b.a("Int ", i10, " is not a decimal digit"));
    }

    @SinceKotlin(version = SvgConstantsKt.VERSION)
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static int digitToInt(char c10) {
        int iDigitOf = CharsKt__CharJVMKt.digitOf(c10, 10);
        if (iDigitOf >= 0) {
            return iDigitOf;
        }
        throw new IllegalArgumentException("Char " + c10 + " is not a decimal digit");
    }

    @SinceKotlin(version = SvgConstantsKt.VERSION)
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Integer digitToIntOrNull(char c10) {
        Integer numValueOf = Integer.valueOf(CharsKt__CharJVMKt.digitOf(c10, 10));
        if (numValueOf.intValue() >= 0) {
            return numValueOf;
        }
        return null;
    }

    public static final boolean equals(char c10, char c11, boolean z10) {
        if (c10 == c11) {
            return true;
        }
        if (!z10) {
            return false;
        }
        char upperCase = Character.toUpperCase(c10);
        char upperCase2 = Character.toUpperCase(c11);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static /* synthetic */ boolean equals$default(char c10, char c11, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return equals(c10, c11, z10);
    }

    public static final boolean isSurrogate(char c10) {
        return new CharRange((char) 55296, (char) 57343).contains(c10);
    }

    @SinceKotlin(version = SvgConstantsKt.VERSION)
    @NotNull
    public static String titlecase(char c10) {
        return _OneToManyTitlecaseMappingsKt.titlecaseImpl(c10);
    }

    @SinceKotlin(version = SvgConstantsKt.VERSION)
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Integer digitToIntOrNull(char c10, int i10) {
        CharsKt__CharJVMKt.checkRadix(i10);
        Integer numValueOf = Integer.valueOf(CharsKt__CharJVMKt.digitOf(c10, i10));
        if (numValueOf.intValue() >= 0) {
            return numValueOf;
        }
        return null;
    }

    @SinceKotlin(version = SvgConstantsKt.VERSION)
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final int digitToInt(char c10, int i10) {
        Integer numDigitToIntOrNull = digitToIntOrNull(c10, i10);
        if (numDigitToIntOrNull != null) {
            return numDigitToIntOrNull.intValue();
        }
        throw new IllegalArgumentException("Char " + c10 + " is not a digit in the given radix=" + i10);
    }

    @SinceKotlin(version = SvgConstantsKt.VERSION)
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final char digitToChar(int i10, int i11) {
        if (!new IntRange(2, 36).contains(i11)) {
            throw new IllegalArgumentException(androidx.camera.core.impl.utils.b.a("Invalid radix: ", i11, ". Valid radix values are in range 2..36"));
        }
        if (i10 < 0 || i10 >= i11) {
            throw new IllegalArgumentException(n1.e("Digit ", i10, " does not represent a valid digit in radix ", i11));
        }
        return (char) (i10 < 10 ? i10 + 48 : ((char) (i10 + 65)) - '\n');
    }
}
