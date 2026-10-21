package com.bbva.glomoutils;

import android.webkit.URLUtil;
import java.net.URL;
import java.text.Normalizer;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: StringExtensions.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0019\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\u001a\n\u0010\u0001\u001a\u00020\u0000*\u00020\u0000\u001a\n\u0010\u0002\u001a\u00020\u0000*\u00020\u0000\u001a\u001a\u0010\u0005\u001a\u00020\u0000*\u0004\u0018\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00000\u0003\u001a\n\u0010\u0006\u001a\u00020\u0000*\u00020\u0000\u001a\n\u0010\u0007\u001a\u00020\u0000*\u00020\u0000\u001a \u0010\r\u001a\u00020\u0000*\u00020\u00002\n\u0010\n\u001a\u00020\b\"\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b\u001a\n\u0010\u000e\u001a\u00020\u000b*\u00020\u0000\u001a\f\u0010\u000f\u001a\u0004\u0018\u00010\u0000*\u00020\u0000\u001a\u0012\u0010\u0011\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0000\"\u0017\u0010\u0017\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0017\u0010\u001a\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016\"\u0017\u0010\u001d\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0014\u001a\u0004\b\u001c\u0010\u0016¨\u0006\u001e"}, d2 = {"", "removeSpecialCharacters", "normalize", "Lkotlin/Function0;", "default", "orElse", "removeExtraBlankChars", "capitalizeWord", "", "", "ignore", "", "upperCase", "toLowerCamelCase", "isURL", "getUrlHost", "matcher", "applyRegex", "Lkotlin/text/Regex;", "a", "Lkotlin/text/Regex;", "getSpecialCharRegex", "()Lkotlin/text/Regex;", "specialCharRegex", "b", "getNonSpacingMarkRegex", "nonSpacingMarkRegex", "c", "getSingleSpaceRegex", "singleSpaceRegex", "gl-utils_release"}, k = 2, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nStringExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringExtensions.kt\ncom/bbva/glomoutils/StringExtensionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,98:1\n1#2:99\n1174#3,2:100\n*S KotlinDebug\n*F\n+ 1 StringExtensions.kt\ncom/bbva/glomoutils/StringExtensionsKt\n*L\n54#1:100,2\n*E\n"})
public final class StringExtensionsKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Regex f34849a = new Regex("[^A-Za-z0-9 ]");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final Regex f34850b = new Regex("\\p{Mn}+");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final Regex f34851c = new Regex("\\s+");

    public static final boolean applyRegex(@NotNull String str, @NotNull String matcher) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(matcher, "matcher");
        return new Regex(matcher).containsMatchIn(str);
    }

    @NotNull
    public static final String capitalizeWord(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String str2 = str.length() == 0 ? str : null;
        if (str2 != null) {
            return str2;
        }
        String strSubstring = str.substring(0, 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        Locale locale = Locale.ROOT;
        String upperCase = strSubstring.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        String strSubstring2 = str.substring(1);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
        String lowerCase = strSubstring2.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return upperCase + lowerCase;
    }

    @NotNull
    public static final Regex getNonSpacingMarkRegex() {
        return f34850b;
    }

    @NotNull
    public static final Regex getSingleSpaceRegex() {
        return f34851c;
    }

    @NotNull
    public static final Regex getSpecialCharRegex() {
        return f34849a;
    }

    @Nullable
    public static final String getUrlHost(@NotNull String str) {
        Object objM5535constructorimpl;
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            Result.Companion companion = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(new URL(str).getHost());
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m5540isFailureimpl(objM5535constructorimpl)) {
            objM5535constructorimpl = null;
        }
        return (String) objM5535constructorimpl;
    }

    public static final boolean isURL(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return URLUtil.isValidUrl(str);
    }

    @NotNull
    public static final String normalize(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String strNormalize = Normalizer.normalize(str, Normalizer.Form.NFD);
        Intrinsics.checkNotNullExpressionValue(strNormalize, "normalize(...)");
        return f34850b.replace(strNormalize, "");
    }

    @NotNull
    public static final String orElse(@Nullable String str, @NotNull Function0<String> function0) {
        Intrinsics.checkNotNullParameter(function0, "default");
        if (!(true ^ (str == null || l.isBlank(str)))) {
            str = null;
        }
        return str == null ? function0.invoke() : str;
    }

    @NotNull
    public static final String removeExtraBlankChars(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return f34851c.replace(str, " ");
    }

    @NotNull
    public static final String removeSpecialCharacters(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return f34849a.replace(str, "");
    }

    @NotNull
    public static final String toLowerCamelCase(@NotNull String str, @NotNull char[] ignore, boolean z10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(ignore, "ignore");
        if (str.length() == 0) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(str.length());
        boolean z11 = !z10;
        boolean z12 = z10;
        boolean z13 = z11;
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (ArraysKt___ArraysKt.contains(ignore, cCharAt)) {
                sb2.append(cCharAt);
                z12 = z10;
                z13 = z11;
            } else {
                if ('0' <= cCharAt && cCharAt < ':') {
                    sb2.append(cCharAt);
                } else if ('a' <= cCharAt && cCharAt < '{') {
                    if (z12) {
                        cCharAt = Character.toUpperCase(cCharAt);
                    }
                    sb2.append(cCharAt);
                } else if ('A' <= cCharAt && cCharAt < '[') {
                    if (z13) {
                        cCharAt = Character.toLowerCase(cCharAt);
                    }
                    sb2.append(cCharAt);
                    z12 = false;
                    z13 = true;
                } else if (sb2.length() > 0) {
                    z13 = false;
                    z12 = true;
                }
                z12 = false;
                z13 = false;
            }
        }
        String string = sb2.toString();
        Intrinsics.checkNotNull(string);
        return string;
    }

    public static /* synthetic */ String toLowerCamelCase$default(String str, char[] cArr, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return toLowerCamelCase(str, cArr, z10);
    }
}
