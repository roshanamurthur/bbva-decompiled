package androidx.compose.ui.text.platform;

import android.graphics.Typeface;
import android.os.Build;
import android.text.SpannableString;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.RestrictTo;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.InternalTextApi;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TtsAnnotation;
import androidx.compose.ui.text.UrlAnnotation;
import androidx.compose.ui.text.font.AndroidFontUtils_androidKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.GenericFontFamily;
import androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt;
import androidx.compose.ui.text.platform.extensions.TtsAnnotationExtensions_androidKt;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Density;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p1.c;
import s1.b;

/* JADX INFO: compiled from: AndroidAccessibilitySpannableString.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a$\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¨\u0006\t"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString;", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "Landroidx/compose/ui/text/platform/URLSpanCache;", "urlSpanCache", "Landroid/text/SpannableString;", "toAccessibilitySpannableString", "ui-text_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAndroidAccessibilitySpannableString.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidAccessibilitySpannableString.android.kt\nandroidx/compose/ui/text/platform/AndroidAccessibilitySpannableString_androidKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,181:1\n33#2,6:182\n33#2,6:188\n33#2,6:194\n*S KotlinDebug\n*F\n+ 1 AndroidAccessibilitySpannableString.android.kt\nandroidx/compose/ui/text/platform/AndroidAccessibilitySpannableString_androidKt\n*L\n59#1:182,6\n66#1:188,6\n75#1:194,6\n*E\n"})
public final class AndroidAccessibilitySpannableString_androidKt {
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @InternalTextApi
    @NotNull
    public static final SpannableString toAccessibilitySpannableString(@NotNull AnnotatedString annotatedString, @NotNull Density density, @NotNull FontFamily.Resolver fontFamilyResolver, @NotNull URLSpanCache urlSpanCache) {
        int i10;
        int i11;
        int i12;
        Intrinsics.checkNotNullParameter(annotatedString, "<this>");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(fontFamilyResolver, "fontFamilyResolver");
        Intrinsics.checkNotNullParameter(urlSpanCache, "urlSpanCache");
        SpannableString spannableString = new SpannableString(annotatedString.getText());
        List<AnnotatedString.Range<SpanStyle>> spanStylesOrNull$ui_text_release = annotatedString.getSpanStylesOrNull$ui_text_release();
        int i13 = 33;
        int i14 = 0;
        if (spanStylesOrNull$ui_text_release != null) {
            int i15 = 0;
            for (int size = spanStylesOrNull$ui_text_release.size(); i15 < size; size = size) {
                AnnotatedString.Range<SpanStyle> range = spanStylesOrNull$ui_text_release.get(i15);
                SpanStyle spanStyleComponent1 = range.component1();
                int start = range.getStart();
                int end = range.getEnd();
                SpanStyle spanStyleM3922copyGSF8kmg = spanStyleComponent1.m3922copyGSF8kmg((65503 & 1) != 0 ? spanStyleComponent1.m3927getColor0d7_KjU() : 0L, (65503 & 2) != 0 ? spanStyleComponent1.fontSize : 0L, (65503 & 4) != 0 ? spanStyleComponent1.fontWeight : null, (65503 & 8) != 0 ? spanStyleComponent1.fontStyle : null, (65503 & 16) != 0 ? spanStyleComponent1.fontSynthesis : null, (65503 & 32) != 0 ? spanStyleComponent1.fontFamily : null, (65503 & 64) != 0 ? spanStyleComponent1.fontFeatureSettings : null, (65503 & 128) != 0 ? spanStyleComponent1.letterSpacing : 0L, (65503 & 256) != 0 ? spanStyleComponent1.baselineShift : null, (65503 & 512) != 0 ? spanStyleComponent1.textGeometricTransform : null, (65503 & 1024) != 0 ? spanStyleComponent1.localeList : null, (65503 & 2048) != 0 ? spanStyleComponent1.background : 0L, (65503 & 4096) != 0 ? spanStyleComponent1.textDecoration : null, (65503 & 8192) != 0 ? spanStyleComponent1.shadow : null, (65503 & 16384) != 0 ? spanStyleComponent1.platformStyle : null, (65503 & 32768) != 0 ? spanStyleComponent1.drawStyle : null);
                SpannableExtensions_androidKt.m4191setColorRPmYEkk(spannableString, spanStyleM3922copyGSF8kmg.m3927getColor0d7_KjU(), start, end);
                SpannableExtensions_androidKt.m4192setFontSizeKmRG4DE(spannableString, spanStyleM3922copyGSF8kmg.getFontSize(), density, start, end);
                if (spanStyleM3922copyGSF8kmg.getFontWeight() == null && spanStyleM3922copyGSF8kmg.getFontStyle() == null) {
                    i10 = end;
                } else {
                    FontWeight fontWeight = spanStyleM3922copyGSF8kmg.getFontWeight();
                    if (fontWeight == null) {
                        fontWeight = FontWeight.INSTANCE.getNormal();
                    }
                    FontStyle fontStyle = spanStyleM3922copyGSF8kmg.getFontStyle();
                    StyleSpan styleSpan = new StyleSpan(AndroidFontUtils_androidKt.m4018getAndroidTypefaceStyleFO1MlWM(fontWeight, fontStyle != null ? fontStyle.m4065unboximpl() : FontStyle.INSTANCE.m4067getNormal_LCdwA()));
                    i10 = end;
                    spannableString.setSpan(styleSpan, start, i10, i13);
                }
                if (spanStyleM3922copyGSF8kmg.getFontFamily() == null) {
                    i11 = i13;
                    i12 = start;
                } else {
                    if (spanStyleM3922copyGSF8kmg.getFontFamily() instanceof GenericFontFamily) {
                        spannableString.setSpan(new TypefaceSpan(((GenericFontFamily) spanStyleM3922copyGSF8kmg.getFontFamily()).getName()), start, i10, i13);
                    } else if (Build.VERSION.SDK_INT >= 28) {
                        FontFamily fontFamily = spanStyleM3922copyGSF8kmg.getFontFamily();
                        FontSynthesis fontSynthesis = spanStyleM3922copyGSF8kmg.getFontSynthesis();
                        i11 = i13;
                        int f17996a = fontSynthesis != null ? fontSynthesis.getF17996a() : FontSynthesis.INSTANCE.m4077getAllGVVA2EU();
                        i12 = start;
                        Object value = c.a(fontFamilyResolver, fontFamily, null, 0, f17996a, 6, null).getValue();
                        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type android.graphics.Typeface");
                        spannableString.setSpan(b.f93136a.a((Typeface) value), i12, i10, i11);
                    }
                    i11 = i13;
                    i12 = start;
                }
                if (spanStyleM3922copyGSF8kmg.getTextDecoration() != null) {
                    TextDecoration textDecoration = spanStyleM3922copyGSF8kmg.getTextDecoration();
                    TextDecoration.Companion companion = TextDecoration.INSTANCE;
                    if (textDecoration.contains(companion.getUnderline())) {
                        spannableString.setSpan(new UnderlineSpan(), i12, i10, i11);
                    }
                    if (spanStyleM3922copyGSF8kmg.getTextDecoration().contains(companion.getLineThrough())) {
                        spannableString.setSpan(new StrikethroughSpan(), i12, i10, i11);
                    }
                }
                if (spanStyleM3922copyGSF8kmg.getTextGeometricTransform() != null) {
                    spannableString.setSpan(new ScaleXSpan(spanStyleM3922copyGSF8kmg.getTextGeometricTransform().getScaleX()), i12, i10, i11);
                }
                SpannableExtensions_androidKt.setLocaleList(spannableString, spanStyleM3922copyGSF8kmg.getLocaleList(), i12, i10);
                SpannableExtensions_androidKt.m4190setBackgroundRPmYEkk(spannableString, spanStyleM3922copyGSF8kmg.getBackground(), i12, i10);
                i15++;
                i14 = i14;
                i13 = i11;
                spanStylesOrNull$ui_text_release = spanStylesOrNull$ui_text_release;
            }
        }
        int i16 = i14;
        int i17 = i13;
        List<AnnotatedString.Range<TtsAnnotation>> ttsAnnotations = annotatedString.getTtsAnnotations(i16, annotatedString.length());
        int size2 = ttsAnnotations.size();
        for (int i18 = i16; i18 < size2; i18++) {
            AnnotatedString.Range<TtsAnnotation> range2 = ttsAnnotations.get(i18);
            spannableString.setSpan(TtsAnnotationExtensions_androidKt.toSpan(range2.component1()), range2.getStart(), range2.getEnd(), i17);
        }
        List<AnnotatedString.Range<UrlAnnotation>> urlAnnotations = annotatedString.getUrlAnnotations(i16, annotatedString.length());
        int size3 = urlAnnotations.size();
        for (int i19 = i16; i19 < size3; i19++) {
            AnnotatedString.Range<UrlAnnotation> range3 = urlAnnotations.get(i19);
            spannableString.setSpan(urlSpanCache.toURLSpan(range3.component1()), range3.getStart(), range3.getEnd(), i17);
        }
        return spannableString;
    }
}
