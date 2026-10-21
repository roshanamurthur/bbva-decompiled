package kotlin.text;

import androidx.appcompat.widget.o1;
import com.mastercard.sonic.androidsvg.SvgConstantsKt;
import java.util.Locale;
import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: CharJVM.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0010\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\u0014\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0007\u001a\u0014\u0010\u0007\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0007\u001a\u0014\u0010\b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0007\u001a\u0018\u0010\f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0000\u001a\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0001\"\u0015\u0010\u0011\u001a\u00020\u000e*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\"\u0015\u0010\u0015\u001a\u00020\u0012*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"", "", "isWhitespace", "Ljava/util/Locale;", "locale", "", "uppercase", "lowercase", "titlecase", "char", "", "radix", "digitOf", "checkRadix", "Lkotlin/text/CharCategory;", "getCategory", "(C)Lkotlin/text/CharCategory;", "category", "Lkotlin/text/CharDirectionality;", "getDirectionality", "(C)Lkotlin/text/CharDirectionality;", "directionality", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xs = "kotlin/text/CharsKt")
public class CharsKt__CharJVMKt {
    @PublishedApi
    public static int checkRadix(int i10) {
        if (new IntRange(2, 36).contains(i10)) {
            return i10;
        }
        StringBuilder sbC = o1.c("radix ", i10, " was not in valid range ");
        sbC.append(new IntRange(2, 36));
        throw new IllegalArgumentException(sbC.toString());
    }

    public static final int digitOf(char c10, int i10) {
        return Character.digit((int) c10, i10);
    }

    @NotNull
    public static final CharCategory getCategory(char c10) {
        return CharCategory.INSTANCE.valueOf(Character.getType(c10));
    }

    @NotNull
    public static final CharDirectionality getDirectionality(char c10) {
        return CharDirectionality.INSTANCE.valueOf(Character.getDirectionality(c10));
    }

    public static boolean isWhitespace(char c10) {
        return Character.isWhitespace(c10) || Character.isSpaceChar(c10);
    }

    @SinceKotlin(version = SvgConstantsKt.VERSION)
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @NotNull
    public static String lowercase(char c10, @NotNull Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        String strValueOf = String.valueOf(c10);
        Intrinsics.checkNotNull(strValueOf, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = strValueOf.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    @SinceKotlin(version = SvgConstantsKt.VERSION)
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @NotNull
    public static String titlecase(char c10, @NotNull Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        String strUppercase = uppercase(c10, locale);
        if (strUppercase.length() <= 1) {
            String strValueOf = String.valueOf(c10);
            Intrinsics.checkNotNull(strValueOf, "null cannot be cast to non-null type java.lang.String");
            String upperCase = strValueOf.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            return !Intrinsics.areEqual(strUppercase, upperCase) ? strUppercase : String.valueOf(Character.toTitleCase(c10));
        }
        if (c10 == 329) {
            return strUppercase;
        }
        char cCharAt = strUppercase.charAt(0);
        Intrinsics.checkNotNull(strUppercase, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = strUppercase.substring(1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        Intrinsics.checkNotNull(strSubstring, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = strSubstring.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return cCharAt + lowerCase;
    }

    @SinceKotlin(version = SvgConstantsKt.VERSION)
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @NotNull
    public static final String uppercase(char c10, @NotNull Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        String strValueOf = String.valueOf(c10);
        Intrinsics.checkNotNull(strValueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = strValueOf.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return upperCase;
    }
}
