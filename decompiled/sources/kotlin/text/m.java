package kotlin.text;

import androidx.camera.camera2.internal.n1;
import com.mastercard.sonic.androidsvg.SvgConstantsKt;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.OverloadResolutionByLambdaReturnType;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.collections.IntIterator;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: _StringsJvm.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\n_StringsJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _StringsJvm.kt\nkotlin/text/StringsKt___StringsJvmKt\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,108:1\n1239#2,14:109\n1521#2,14:123\n*S KotlinDebug\n*F\n+ 1 _StringsJvm.kt\nkotlin/text/StringsKt___StringsJvmKt\n*L\n45#1:109,14\n66#1:123,14\n*E\n"})
public class m extends StringsKt__StringsKt {
    @InlineOnly
    private static final char elementAt(CharSequence charSequence, int i10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return charSequence.charAt(i10);
    }

    @Deprecated(message = "Use maxOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = SvgConstantsKt.VERSION, hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Character max(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return StringsKt___StringsKt.maxOrNull(charSequence);
    }

    @Deprecated(message = "Use maxByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = SvgConstantsKt.VERSION, hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Character maxBy(CharSequence charSequence, Function1<? super Character, ? extends R> function1) {
        if (androidx.databinding.e.a(charSequence, "<this>", function1, "selector") == 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(0);
        int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        if (lastIndex == 0) {
            return Character.valueOf(cCharAt);
        }
        R rInvoke = function1.invoke(Character.valueOf(cCharAt));
        IntIterator intIteratorG = n1.g(1, lastIndex);
        while (intIteratorG.hasNext()) {
            char cCharAt2 = charSequence.charAt(intIteratorG.nextInt());
            R rInvoke2 = function1.invoke(Character.valueOf(cCharAt2));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                cCharAt = cCharAt2;
                rInvoke = rInvoke2;
            }
        }
        return Character.valueOf(cCharAt);
    }

    @Deprecated(message = "Use maxWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = SvgConstantsKt.VERSION, hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Character maxWith(CharSequence charSequence, Comparator comparator) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return StringsKt___StringsKt.maxWithOrNull(charSequence, comparator);
    }

    @Deprecated(message = "Use minOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = SvgConstantsKt.VERSION, hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Character min(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return StringsKt___StringsKt.minOrNull(charSequence);
    }

    @Deprecated(message = "Use minByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = SvgConstantsKt.VERSION, hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Character minBy(CharSequence charSequence, Function1<? super Character, ? extends R> function1) {
        if (androidx.databinding.e.a(charSequence, "<this>", function1, "selector") == 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(0);
        int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        if (lastIndex == 0) {
            return Character.valueOf(cCharAt);
        }
        R rInvoke = function1.invoke(Character.valueOf(cCharAt));
        IntIterator intIteratorG = n1.g(1, lastIndex);
        while (intIteratorG.hasNext()) {
            char cCharAt2 = charSequence.charAt(intIteratorG.nextInt());
            R rInvoke2 = function1.invoke(Character.valueOf(cCharAt2));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                cCharAt = cCharAt2;
                rInvoke = rInvoke2;
            }
        }
        return Character.valueOf(cCharAt);
    }

    @Deprecated(message = "Use minWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = SvgConstantsKt.VERSION, hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Character minWith(CharSequence charSequence, Comparator comparator) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return StringsKt___StringsKt.minWithOrNull(charSequence, comparator);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfBigDecimal")
    @OverloadResolutionByLambdaReturnType
    private static final BigDecimal sumOfBigDecimal(CharSequence charSequence, Function1<? super Character, ? extends BigDecimal> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            bigDecimalValueOf = bigDecimalValueOf.add((BigDecimal) androidx.databinding.f.f(charSequence, i10, selector));
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "add(...)");
        }
        return bigDecimalValueOf;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfBigInteger")
    @OverloadResolutionByLambdaReturnType
    private static final BigInteger sumOfBigInteger(CharSequence charSequence, Function1<? super Character, ? extends BigInteger> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "valueOf(...)");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            bigIntegerValueOf = bigIntegerValueOf.add((BigInteger) androidx.databinding.f.f(charSequence, i10, selector));
            Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "add(...)");
        }
        return bigIntegerValueOf;
    }

    @NotNull
    public static final SortedSet<Character> toSortedSet(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return (SortedSet) StringsKt___StringsKt.toCollection(charSequence, new TreeSet());
    }
}
