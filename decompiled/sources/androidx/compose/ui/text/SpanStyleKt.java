package androidx.compose.ui.text;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.ShadowKt;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.FontWeightKt;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.BaselineShiftKt;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDrawStyleKt;
import androidx.compose.ui.text.style.TextForegroundStyle;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextGeometricTransformKt;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.exifinterface.media.ExifInterface;
import com.adobe.marketing.mobile.EventDataKeys;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SpanStyle.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a-\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a-\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\u0006\u0010\u0001\u001a\u00028\u00002\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001e\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u0003\u001a\u0010\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\fH\u0000\u001aÃ\u0001\u00104\u001a\u00020\f*\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010\"\u001a\u00020\u00002\b\u0010$\u001a\u0004\u0018\u00010#2\b\u0010&\u001a\u0004\u0018\u00010%2\b\u0010(\u001a\u0004\u0018\u00010'2\u0006\u0010)\u001a\u00020\u00122\b\u0010+\u001a\u0004\u0018\u00010*2\b\u0010-\u001a\u0004\u0018\u00010,2\b\u0010/\u001a\u0004\u0018\u00010.2\b\u00101\u001a\u0004\u0018\u000100H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b2\u00103\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00065"}, d2 = {"Landroidx/compose/ui/unit/TextUnit;", "a", "b", "", "t", "lerpTextUnitInheritable-C3pnCVY", "(JJF)J", "lerpTextUnitInheritable", ExifInterface.GPS_DIRECTION_TRUE, "fraction", "lerpDiscrete", "(Ljava/lang/Object;Ljava/lang/Object;F)Ljava/lang/Object;", "Landroidx/compose/ui/text/SpanStyle;", EventDataKeys.Lifecycle.LIFECYCLE_START, "stop", "lerp", "style", "resolveSpanStyleDefaults", "Landroidx/compose/ui/graphics/Color;", "color", "Landroidx/compose/ui/graphics/Brush;", "brush", "alpha", "fontSize", "Landroidx/compose/ui/text/font/FontWeight;", "fontWeight", "Landroidx/compose/ui/text/font/FontStyle;", "fontStyle", "Landroidx/compose/ui/text/font/FontSynthesis;", "fontSynthesis", "Landroidx/compose/ui/text/font/FontFamily;", "fontFamily", "", "fontFeatureSettings", "letterSpacing", "Landroidx/compose/ui/text/style/BaselineShift;", "baselineShift", "Landroidx/compose/ui/text/style/TextGeometricTransform;", "textGeometricTransform", "Landroidx/compose/ui/text/intl/LocaleList;", "localeList", "background", "Landroidx/compose/ui/text/style/TextDecoration;", "textDecoration", "Landroidx/compose/ui/graphics/Shadow;", "shadow", "Landroidx/compose/ui/text/PlatformSpanStyle;", "platformStyle", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "drawStyle", "fastMerge-dSHsh3o", "(Landroidx/compose/ui/text/SpanStyle;JLandroidx/compose/ui/graphics/Brush;FJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/PlatformSpanStyle;Landroidx/compose/ui/graphics/drawscope/DrawStyle;)Landroidx/compose/ui/text/SpanStyle;", "fastMerge", "ui-text_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSpanStyle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpanStyle.kt\nandroidx/compose/ui/text/SpanStyleKt\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 3 TextUnit.kt\nandroidx/compose/ui/unit/TextUnitKt\n*L\n1#1,951:1\n658#2:952\n646#2:953\n646#2:955\n646#2:957\n658#2:958\n646#2:959\n250#3:954\n250#3:956\n*S KotlinDebug\n*F\n+ 1 SpanStyle.kt\nandroidx/compose/ui/text/SpanStyleKt\n*L\n849#1:952\n849#1:953\n892#1:955\n907#1:957\n939#1:958\n939#1:959\n891#1:954\n897#1:956\n*E\n"})
public final class SpanStyleKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f17739a = TextUnitKt.getSp(14);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f17740b = TextUnitKt.getSp(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f17741c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f17742d;

    /* JADX INFO: compiled from: SpanStyle.kt */
    public static final class a extends Lambda implements Function0<TextForegroundStyle> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f17743p0 = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final TextForegroundStyle invoke() {
            return TextForegroundStyle.INSTANCE.m4316from8_81llA(SpanStyleKt.f17742d);
        }
    }

    static {
        Color.Companion companion = Color.INSTANCE;
        f17741c = companion.m2543getTransparent0d7_KjU();
        f17742d = companion.m2534getBlack0d7_KjU();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0036  */
    @NotNull
    /* JADX INFO: renamed from: fastMerge-dSHsh3o, reason: not valid java name */
    public static final SpanStyle m3932fastMergedSHsh3o(@NotNull SpanStyle fastMerge, long j10, @Nullable Brush brush, float f6, long j11, @Nullable FontWeight fontWeight, @Nullable FontStyle fontStyle, @Nullable FontSynthesis fontSynthesis, @Nullable FontFamily fontFamily, @Nullable String str, long j12, @Nullable BaselineShift baselineShift, @Nullable TextGeometricTransform textGeometricTransform, @Nullable LocaleList localeList, long j13, @Nullable TextDecoration textDecoration, @Nullable Shadow shadow, @Nullable PlatformSpanStyle platformSpanStyle, @Nullable DrawStyle drawStyle) {
        TextGeometricTransform textGeometricTransform2;
        Shadow shadow2;
        PlatformSpanStyle platformStyle;
        DrawStyle drawStyle2;
        FontWeight fontWeight2 = fontWeight;
        FontStyle fontStyle2 = fontStyle;
        FontSynthesis fontSynthesis2 = fontSynthesis;
        String fontFeatureSettings = str;
        BaselineShift baselineShift2 = baselineShift;
        Intrinsics.checkNotNullParameter(fastMerge, "$this$fastMerge");
        if ((!TextUnitKt.m4588isUnspecifiedR2X_6o(j11)) && !TextUnit.m4567equalsimpl0(j11, fastMerge.getFontSize())) {
            textGeometricTransform2 = textGeometricTransform;
            shadow2 = shadow;
            platformStyle = platformSpanStyle;
            drawStyle2 = drawStyle;
        } else if ((brush != null || j10 == Color.INSTANCE.m2544getUnspecified0d7_KjU() || Color.m2509equalsimpl0(j10, fastMerge.getTextForegroundStyle().mo4315getColor0d7_KjU())) && ((fontStyle2 == null || Intrinsics.areEqual(fontStyle2, fastMerge.getFontStyle())) && ((fontWeight2 == null || Intrinsics.areEqual(fontWeight2, fastMerge.getFontWeight())) && ((fontFamily == null || fontFamily == fastMerge.getFontFamily()) && (!(!TextUnitKt.m4588isUnspecifiedR2X_6o(j12)) || TextUnit.m4567equalsimpl0(j12, fastMerge.getLetterSpacing())))))) {
            if ((textDecoration == null || Intrinsics.areEqual(textDecoration, fastMerge.getTextDecoration())) && Intrinsics.areEqual(brush, fastMerge.getTextForegroundStyle().getBrush()) && ((brush == null || f6 == fastMerge.getTextForegroundStyle().getAlpha()) && ((fontSynthesis2 == null || Intrinsics.areEqual(fontSynthesis2, fastMerge.getFontSynthesis())) && ((fontFeatureSettings == null || Intrinsics.areEqual(fontFeatureSettings, fastMerge.getFontFeatureSettings())) && (baselineShift2 == null || Intrinsics.areEqual(baselineShift2, fastMerge.getBaselineShift())))))) {
                textGeometricTransform2 = textGeometricTransform;
                if ((textGeometricTransform2 == null || Intrinsics.areEqual(textGeometricTransform2, fastMerge.getTextGeometricTransform())) && ((localeList == null || Intrinsics.areEqual(localeList, fastMerge.getLocaleList())) && (j13 == Color.INSTANCE.m2544getUnspecified0d7_KjU() || Color.m2509equalsimpl0(j13, fastMerge.getBackground())))) {
                    shadow2 = shadow;
                    if (shadow2 == null || Intrinsics.areEqual(shadow2, fastMerge.getShadow())) {
                        platformStyle = platformSpanStyle;
                        if (platformStyle == null || Intrinsics.areEqual(platformStyle, fastMerge.getPlatformStyle())) {
                            drawStyle2 = drawStyle;
                            if (drawStyle2 == null || Intrinsics.areEqual(drawStyle2, fastMerge.getDrawStyle())) {
                                return fastMerge;
                            }
                        }
                    }
                    drawStyle2 = drawStyle;
                }
                platformStyle = platformSpanStyle;
                drawStyle2 = drawStyle;
            } else {
                textGeometricTransform2 = textGeometricTransform;
            }
            shadow2 = shadow;
            platformStyle = platformSpanStyle;
            drawStyle2 = drawStyle;
        } else {
            textGeometricTransform2 = textGeometricTransform;
            shadow2 = shadow;
            platformStyle = platformSpanStyle;
            drawStyle2 = drawStyle;
        }
        TextForegroundStyle textForegroundStyleMerge = fastMerge.getTextForegroundStyle().merge(brush != null ? TextForegroundStyle.INSTANCE.from(brush, f6) : TextForegroundStyle.INSTANCE.m4316from8_81llA(j10));
        FontFamily fontFamily2 = fontFamily == null ? fastMerge.getFontFamily() : fontFamily;
        long fontSize = !TextUnitKt.m4588isUnspecifiedR2X_6o(j11) ? j11 : fastMerge.getFontSize();
        if (fontWeight2 == null) {
            fontWeight2 = fastMerge.getFontWeight();
        }
        if (fontStyle2 == null) {
            fontStyle2 = fastMerge.getFontStyle();
        }
        if (fontSynthesis2 == null) {
            fontSynthesis2 = fastMerge.getFontSynthesis();
        }
        if (fontFeatureSettings == null) {
            fontFeatureSettings = fastMerge.getFontFeatureSettings();
        }
        long letterSpacing = !TextUnitKt.m4588isUnspecifiedR2X_6o(j12) ? j12 : fastMerge.getLetterSpacing();
        if (baselineShift2 == null) {
            baselineShift2 = fastMerge.getBaselineShift();
        }
        if (textGeometricTransform2 == null) {
            textGeometricTransform2 = fastMerge.getTextGeometricTransform();
        }
        LocaleList localeList2 = localeList == null ? fastMerge.getLocaleList() : localeList;
        long background = j13 != Color.INSTANCE.m2544getUnspecified0d7_KjU() ? j13 : fastMerge.getBackground();
        TextDecoration textDecoration2 = textDecoration == null ? fastMerge.getTextDecoration() : textDecoration;
        if (shadow2 == null) {
            shadow2 = fastMerge.getShadow();
        }
        if (fastMerge.getPlatformStyle() != null) {
            platformStyle = platformStyle == null ? fastMerge.getPlatformStyle() : fastMerge.getPlatformStyle().merge(platformStyle);
        }
        if (drawStyle2 == null) {
            drawStyle2 = fastMerge.getDrawStyle();
        }
        return new SpanStyle(textForegroundStyleMerge, fontSize, fontWeight2, fontStyle2, fontSynthesis2, fontFamily2, fontFeatureSettings, letterSpacing, baselineShift2, textGeometricTransform2, localeList2, background, textDecoration2, shadow2, platformStyle, drawStyle2, (DefaultConstructorMarker) null);
    }

    @NotNull
    public static final SpanStyle lerp(@NotNull SpanStyle start, @NotNull SpanStyle stop, float f6) {
        PlatformSpanStyle platformSpanStyleLerp;
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(stop, "stop");
        TextForegroundStyle textForegroundStyleLerp = TextDrawStyleKt.lerp(start.getTextForegroundStyle(), stop.getTextForegroundStyle(), f6);
        FontFamily fontFamily = (FontFamily) lerpDiscrete(start.getFontFamily(), stop.getFontFamily(), f6);
        long jM3933lerpTextUnitInheritableC3pnCVY = m3933lerpTextUnitInheritableC3pnCVY(start.getFontSize(), stop.getFontSize(), f6);
        FontWeight fontWeight = start.getFontWeight();
        if (fontWeight == null) {
            fontWeight = FontWeight.INSTANCE.getNormal();
        }
        FontWeight fontWeight2 = stop.getFontWeight();
        if (fontWeight2 == null) {
            fontWeight2 = FontWeight.INSTANCE.getNormal();
        }
        FontWeight fontWeightLerp = FontWeightKt.lerp(fontWeight, fontWeight2, f6);
        FontStyle fontStyle = (FontStyle) lerpDiscrete(start.getFontStyle(), stop.getFontStyle(), f6);
        FontSynthesis fontSynthesis = (FontSynthesis) lerpDiscrete(start.getFontSynthesis(), stop.getFontSynthesis(), f6);
        String str = (String) lerpDiscrete(start.getFontFeatureSettings(), stop.getFontFeatureSettings(), f6);
        long jM3933lerpTextUnitInheritableC3pnCVY2 = m3933lerpTextUnitInheritableC3pnCVY(start.getLetterSpacing(), stop.getLetterSpacing(), f6);
        BaselineShift baselineShift = start.getBaselineShift();
        float fM4203unboximpl = baselineShift != null ? baselineShift.m4203unboximpl() : BaselineShift.m4198constructorimpl(0.0f);
        BaselineShift baselineShift2 = stop.getBaselineShift();
        float fM4210lerpjWV1Mfo = BaselineShiftKt.m4210lerpjWV1Mfo(fM4203unboximpl, baselineShift2 != null ? baselineShift2.m4203unboximpl() : BaselineShift.m4198constructorimpl(0.0f), f6);
        TextGeometricTransform textGeometricTransform = start.getTextGeometricTransform();
        if (textGeometricTransform == null) {
            textGeometricTransform = TextGeometricTransform.INSTANCE.getNone$ui_text_release();
        }
        TextGeometricTransform textGeometricTransform2 = stop.getTextGeometricTransform();
        if (textGeometricTransform2 == null) {
            textGeometricTransform2 = TextGeometricTransform.INSTANCE.getNone$ui_text_release();
        }
        TextGeometricTransform textGeometricTransformLerp = TextGeometricTransformKt.lerp(textGeometricTransform, textGeometricTransform2, f6);
        LocaleList localeList = (LocaleList) lerpDiscrete(start.getLocaleList(), stop.getLocaleList(), f6);
        long jM2558lerpjxsXWHM = ColorKt.m2558lerpjxsXWHM(start.getBackground(), stop.getBackground(), f6);
        TextDecoration textDecoration = (TextDecoration) lerpDiscrete(start.getTextDecoration(), stop.getTextDecoration(), f6);
        Shadow shadow = start.getShadow();
        if (shadow == null) {
            shadow = new Shadow(0L, 0L, 0.0f, 7, null);
        }
        Shadow shadow2 = stop.getShadow();
        if (shadow2 == null) {
            shadow2 = new Shadow(0L, 0L, 0.0f, 7, null);
        }
        Shadow shadowLerp = ShadowKt.lerp(shadow, shadow2, f6);
        PlatformSpanStyle platformStyle = start.getPlatformStyle();
        PlatformSpanStyle platformStyle2 = stop.getPlatformStyle();
        if (platformStyle == null && platformStyle2 == null) {
            platformSpanStyleLerp = null;
        } else {
            if (platformStyle == null) {
                platformStyle = PlatformSpanStyle.INSTANCE.getDefault();
            }
            if (platformStyle2 == null) {
                platformStyle2 = PlatformSpanStyle.INSTANCE.getDefault();
            }
            platformSpanStyleLerp = AndroidTextStyle_androidKt.lerp(platformStyle, platformStyle2, f6);
        }
        return new SpanStyle(textForegroundStyleLerp, jM3933lerpTextUnitInheritableC3pnCVY, fontWeightLerp, fontStyle, fontSynthesis, fontFamily, str, jM3933lerpTextUnitInheritableC3pnCVY2, BaselineShift.m4197boximpl(fM4210lerpjWV1Mfo), textGeometricTransformLerp, localeList, jM2558lerpjxsXWHM, textDecoration, shadowLerp, platformSpanStyleLerp, (DrawStyle) lerpDiscrete(start.getDrawStyle(), stop.getDrawStyle(), f6), (DefaultConstructorMarker) null);
    }

    public static final <T> T lerpDiscrete(T t10, T t11, float f6) {
        return ((double) f6) < 0.5d ? t10 : t11;
    }

    /* JADX INFO: renamed from: lerpTextUnitInheritable-C3pnCVY, reason: not valid java name */
    public static final long m3933lerpTextUnitInheritableC3pnCVY(long j10, long j11, float f6) {
        return (TextUnitKt.m4588isUnspecifiedR2X_6o(j10) || TextUnitKt.m4588isUnspecifiedR2X_6o(j11)) ? ((TextUnit) lerpDiscrete(TextUnit.m4560boximpl(j10), TextUnit.m4560boximpl(j11), f6)).getF18322a() : TextUnitKt.m4590lerpC3pnCVY(j10, j11, f6);
    }

    @NotNull
    public static final SpanStyle resolveSpanStyleDefaults(@NotNull SpanStyle style) {
        Intrinsics.checkNotNullParameter(style, "style");
        TextForegroundStyle textForegroundStyleTakeOrElse = style.getTextForegroundStyle().takeOrElse(a.f17743p0);
        long fontSize = TextUnitKt.m4588isUnspecifiedR2X_6o(style.getFontSize()) ? f17739a : style.getFontSize();
        FontWeight fontWeight = style.getFontWeight();
        if (fontWeight == null) {
            fontWeight = FontWeight.INSTANCE.getNormal();
        }
        FontWeight fontWeight2 = fontWeight;
        FontStyle fontStyle = style.getFontStyle();
        FontStyle fontStyleM4059boximpl = FontStyle.m4059boximpl(fontStyle != null ? fontStyle.m4065unboximpl() : FontStyle.INSTANCE.m4067getNormal_LCdwA());
        FontSynthesis fontSynthesis = style.getFontSynthesis();
        FontSynthesis fontSynthesisM4068boximpl = FontSynthesis.m4068boximpl(fontSynthesis != null ? fontSynthesis.getF17996a() : FontSynthesis.INSTANCE.m4077getAllGVVA2EU());
        FontFamily fontFamily = style.getFontFamily();
        if (fontFamily == null) {
            fontFamily = FontFamily.INSTANCE.getDefault();
        }
        FontFamily fontFamily2 = fontFamily;
        String fontFeatureSettings = style.getFontFeatureSettings();
        if (fontFeatureSettings == null) {
            fontFeatureSettings = "";
        }
        String str = fontFeatureSettings;
        long letterSpacing = TextUnitKt.m4588isUnspecifiedR2X_6o(style.getLetterSpacing()) ? f17740b : style.getLetterSpacing();
        BaselineShift baselineShift = style.getBaselineShift();
        BaselineShift baselineShiftM4197boximpl = BaselineShift.m4197boximpl(baselineShift != null ? baselineShift.m4203unboximpl() : BaselineShift.INSTANCE.m4207getNoney9eOQZs());
        TextGeometricTransform textGeometricTransform = style.getTextGeometricTransform();
        if (textGeometricTransform == null) {
            textGeometricTransform = TextGeometricTransform.INSTANCE.getNone$ui_text_release();
        }
        TextGeometricTransform textGeometricTransform2 = textGeometricTransform;
        LocaleList localeList = style.getLocaleList();
        if (localeList == null) {
            localeList = LocaleList.INSTANCE.getCurrent();
        }
        LocaleList localeList2 = localeList;
        long background = style.getBackground();
        if (background == Color.INSTANCE.m2544getUnspecified0d7_KjU()) {
            background = f17741c;
        }
        long j10 = background;
        TextDecoration textDecoration = style.getTextDecoration();
        if (textDecoration == null) {
            textDecoration = TextDecoration.INSTANCE.getNone();
        }
        TextDecoration textDecoration2 = textDecoration;
        Shadow shadow = style.getShadow();
        if (shadow == null) {
            shadow = Shadow.INSTANCE.getNone();
        }
        Shadow shadow2 = shadow;
        PlatformSpanStyle platformStyle = style.getPlatformStyle();
        DrawStyle drawStyle = style.getDrawStyle();
        if (drawStyle == null) {
            drawStyle = Fill.INSTANCE;
        }
        return new SpanStyle(textForegroundStyleTakeOrElse, fontSize, fontWeight2, fontStyleM4059boximpl, fontSynthesisM4068boximpl, fontFamily2, str, letterSpacing, baselineShiftM4197boximpl, textGeometricTransform2, localeList2, j10, textDecoration2, shadow2, platformStyle, drawStyle, (DefaultConstructorMarker) null);
    }
}
