package androidx.compose.ui.text.platform.extensions;

import android.graphics.Typeface;
import android.os.Build;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.Locale;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.platform.AndroidTextPaint;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import kotlin.Metadata;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TextPaintExtensions.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u001aS\u0010\u000e\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012&\u0010\t\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00032\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fH\u0000ø\u0001\u0000\u001a\u0016\u0010\u0012\u001a\u00020\u0011*\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0000\u001a\f\u0010\u0013\u001a\u00020\f*\u00020\u0001H\u0000\u001a\u0010\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/text/platform/AndroidTextPaint;", "Landroidx/compose/ui/text/SpanStyle;", "style", "Lkotlin/Function4;", "Landroidx/compose/ui/text/font/FontFamily;", "Landroidx/compose/ui/text/font/FontWeight;", "Landroidx/compose/ui/text/font/FontStyle;", "Landroidx/compose/ui/text/font/FontSynthesis;", "Landroid/graphics/Typeface;", "resolveTypeface", "Landroidx/compose/ui/unit/Density;", "density", "", "requiresLetterSpacing", "applySpanStyle", "Landroidx/compose/ui/text/style/TextMotion;", "textMotion", "", "setTextMotion", "hasFontAttributes", "", "blurRadius", "correctBlurRadius", "ui-text_release"}, k = 2, mv = {1, 8, 0})
public final class TextPaintExtensions_androidKt {
    @Nullable
    public static final SpanStyle applySpanStyle(@NotNull AndroidTextPaint androidTextPaint, @NotNull SpanStyle style, @NotNull Function4<? super FontFamily, ? super FontWeight, ? super FontStyle, ? super FontSynthesis, ? extends Typeface> resolveTypeface, @NotNull Density density, boolean z10) {
        Intrinsics.checkNotNullParameter(androidTextPaint, "<this>");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(resolveTypeface, "resolveTypeface");
        Intrinsics.checkNotNullParameter(density, "density");
        long jM4569getTypeUIouoOA = TextUnit.m4569getTypeUIouoOA(style.getFontSize());
        TextUnitType.Companion companion = TextUnitType.INSTANCE;
        if (TextUnitType.m4598equalsimpl0(jM4569getTypeUIouoOA, companion.m4603getSpUIouoOA())) {
            androidTextPaint.setTextSize(density.mo414toPxR2X_6o(style.getFontSize()));
        } else if (TextUnitType.m4598equalsimpl0(jM4569getTypeUIouoOA, companion.m4602getEmUIouoOA())) {
            androidTextPaint.setTextSize(TextUnit.m4570getValueimpl(style.getFontSize()) * androidTextPaint.getTextSize());
        }
        if (hasFontAttributes(style)) {
            FontFamily fontFamily = style.getFontFamily();
            FontWeight fontWeight = style.getFontWeight();
            if (fontWeight == null) {
                fontWeight = FontWeight.INSTANCE.getNormal();
            }
            FontStyle fontStyleM3929getFontStyle4Lr2A7w = style.getFontStyle();
            FontStyle fontStyleM4059boximpl = FontStyle.m4059boximpl(fontStyleM3929getFontStyle4Lr2A7w != null ? fontStyleM3929getFontStyle4Lr2A7w.m4065unboximpl() : FontStyle.INSTANCE.m4067getNormal_LCdwA());
            FontSynthesis fontSynthesisM3930getFontSynthesisZQGJjVo = style.getFontSynthesis();
            androidTextPaint.setTypeface(resolveTypeface.invoke(fontFamily, fontWeight, fontStyleM4059boximpl, FontSynthesis.m4068boximpl(fontSynthesisM3930getFontSynthesisZQGJjVo != null ? fontSynthesisM3930getFontSynthesisZQGJjVo.getF17996a() : FontSynthesis.INSTANCE.m4077getAllGVVA2EU())));
        }
        boolean z11 = false;
        if (style.getLocaleList() != null && !Intrinsics.areEqual(style.getLocaleList(), LocaleList.INSTANCE.getCurrent())) {
            if (Build.VERSION.SDK_INT >= 24) {
                LocaleListHelperMethods.INSTANCE.setTextLocales(androidTextPaint, style.getLocaleList());
            } else {
                androidTextPaint.setTextLocale(LocaleExtensions_androidKt.toJavaLocale(style.getLocaleList().isEmpty() ? Locale.INSTANCE.getCurrent() : style.getLocaleList().get(0)));
            }
        }
        if (style.getFontFeatureSettings() != null && !Intrinsics.areEqual(style.getFontFeatureSettings(), "")) {
            androidTextPaint.setFontFeatureSettings(style.getFontFeatureSettings());
        }
        if (style.getTextGeometricTransform() != null && !Intrinsics.areEqual(style.getTextGeometricTransform(), TextGeometricTransform.INSTANCE.getNone$ui_text_release())) {
            androidTextPaint.setTextScaleX(style.getTextGeometricTransform().getScaleX() * androidTextPaint.getTextScaleX());
            androidTextPaint.setTextSkewX(style.getTextGeometricTransform().getSkewX() + androidTextPaint.getTextSkewX());
        }
        androidTextPaint.m4188setColor8_81llA(style.m3927getColor0d7_KjU());
        androidTextPaint.m4187setBrush12SF9DM(style.getBrush(), Size.INSTANCE.m2352getUnspecifiedNHjbRc(), style.getAlpha());
        androidTextPaint.setShadow(style.getShadow());
        androidTextPaint.setTextDecoration(style.getTextDecoration());
        androidTextPaint.setDrawStyle(style.getDrawStyle());
        if (TextUnitType.m4598equalsimpl0(TextUnit.m4569getTypeUIouoOA(style.getLetterSpacing()), companion.m4603getSpUIouoOA()) && TextUnit.m4570getValueimpl(style.getLetterSpacing()) != 0.0f) {
            float textScaleX = androidTextPaint.getTextScaleX() * androidTextPaint.getTextSize();
            float fMo414toPxR2X_6o = density.mo414toPxR2X_6o(style.getLetterSpacing());
            if (textScaleX != 0.0f) {
                androidTextPaint.setLetterSpacing(fMo414toPxR2X_6o / textScaleX);
            }
        } else if (TextUnitType.m4598equalsimpl0(TextUnit.m4569getTypeUIouoOA(style.getLetterSpacing()), companion.m4602getEmUIouoOA())) {
            androidTextPaint.setLetterSpacing(TextUnit.m4570getValueimpl(style.getLetterSpacing()));
        }
        long jM3931getLetterSpacingXSAIIZE = style.getLetterSpacing();
        long jM3925getBackground0d7_KjU = style.getBackground();
        BaselineShift baselineShiftM3926getBaselineShift5SSeXJ0 = style.getBaselineShift();
        boolean z12 = z10 && TextUnitType.m4598equalsimpl0(TextUnit.m4569getTypeUIouoOA(jM3931getLetterSpacingXSAIIZE), companion.m4603getSpUIouoOA()) && TextUnit.m4570getValueimpl(jM3931getLetterSpacingXSAIIZE) != 0.0f;
        Color.Companion companion2 = Color.INSTANCE;
        boolean z13 = (Color.m2509equalsimpl0(jM3925getBackground0d7_KjU, companion2.m2544getUnspecified0d7_KjU()) || Color.m2509equalsimpl0(jM3925getBackground0d7_KjU, companion2.m2543getTransparent0d7_KjU())) ? false : true;
        if (baselineShiftM3926getBaselineShift5SSeXJ0 != null) {
            if (!BaselineShift.m4200equalsimpl0(baselineShiftM3926getBaselineShift5SSeXJ0.m4203unboximpl(), BaselineShift.INSTANCE.m4207getNoney9eOQZs())) {
                z11 = true;
            }
        }
        if (!z12 && !z13 && !z11) {
            return null;
        }
        if (!z12) {
            jM3931getLetterSpacingXSAIIZE = TextUnit.INSTANCE.m4581getUnspecifiedXSAIIZE();
        }
        long j10 = jM3931getLetterSpacingXSAIIZE;
        if (!z13) {
            jM3925getBackground0d7_KjU = companion2.m2544getUnspecified0d7_KjU();
        }
        return new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, j10, z11 ? baselineShiftM3926getBaselineShift5SSeXJ0 : null, (TextGeometricTransform) null, (LocaleList) null, jM3925getBackground0d7_KjU, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 63103, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ SpanStyle applySpanStyle$default(AndroidTextPaint androidTextPaint, SpanStyle spanStyle, Function4 function4, Density density, boolean z10, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        return applySpanStyle(androidTextPaint, spanStyle, function4, density, z10);
    }

    public static final float correctBlurRadius(float f6) {
        if (f6 == 0.0f) {
            return Float.MIN_VALUE;
        }
        return f6;
    }

    public static final boolean hasFontAttributes(@NotNull SpanStyle spanStyle) {
        Intrinsics.checkNotNullParameter(spanStyle, "<this>");
        return (spanStyle.getFontFamily() == null && spanStyle.getFontStyle() == null && spanStyle.getFontWeight() == null) ? false : true;
    }

    public static final void setTextMotion(@NotNull AndroidTextPaint androidTextPaint, @Nullable TextMotion textMotion) {
        Intrinsics.checkNotNullParameter(androidTextPaint, "<this>");
        if (textMotion == null) {
            textMotion = TextMotion.INSTANCE.getStatic();
        }
        androidTextPaint.setFlags(textMotion.getSubpixelTextPositioning() ? androidTextPaint.getFlags() | 128 : androidTextPaint.getFlags() & (-129));
        int iM4323getLinearity4e0Vf04$ui_text_release = textMotion.getLinearity();
        TextMotion.Linearity.Companion companion = TextMotion.Linearity.INSTANCE;
        if (TextMotion.Linearity.m4326equalsimpl0(iM4323getLinearity4e0Vf04$ui_text_release, companion.m4331getLinear4e0Vf04())) {
            androidTextPaint.setFlags(androidTextPaint.getFlags() | 64);
            androidTextPaint.setHinting(0);
        } else if (TextMotion.Linearity.m4326equalsimpl0(iM4323getLinearity4e0Vf04$ui_text_release, companion.m4330getFontHinting4e0Vf04())) {
            androidTextPaint.getFlags();
            androidTextPaint.setHinting(1);
        } else if (!TextMotion.Linearity.m4326equalsimpl0(iM4323getLinearity4e0Vf04$ui_text_release, companion.m4332getNone4e0Vf04())) {
            androidTextPaint.getFlags();
        } else {
            androidTextPaint.getFlags();
            androidTextPaint.setHinting(0);
        }
    }
}
