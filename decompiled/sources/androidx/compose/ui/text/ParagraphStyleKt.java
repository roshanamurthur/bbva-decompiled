package androidx.compose.ui.text;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextIndentKt;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import com.adobe.marketing.mobile.EventDataKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ParagraphStyle.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a \u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0007\u001a\u0018\u0010\t\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0000\u001aq\u0010\u001e\u001a\u00020\u0000*\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001d\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"Landroidx/compose/ui/text/ParagraphStyle;", EventDataKeys.Lifecycle.LIFECYCLE_START, "stop", "", "fraction", "lerp", "style", "Landroidx/compose/ui/unit/LayoutDirection;", "direction", "resolveParagraphStyleDefaults", "Landroidx/compose/ui/text/style/TextAlign;", "textAlign", "Landroidx/compose/ui/text/style/TextDirection;", "textDirection", "Landroidx/compose/ui/unit/TextUnit;", "lineHeight", "Landroidx/compose/ui/text/style/TextIndent;", "textIndent", "Landroidx/compose/ui/text/PlatformParagraphStyle;", "platformStyle", "Landroidx/compose/ui/text/style/LineHeightStyle;", "lineHeightStyle", "Landroidx/compose/ui/text/style/LineBreak;", "lineBreak", "Landroidx/compose/ui/text/style/Hyphens;", "hyphens", "Landroidx/compose/ui/text/style/TextMotion;", "textMotion", "fastMerge-HtYhynw", "(Landroidx/compose/ui/text/ParagraphStyle;Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformParagraphStyle;Landroidx/compose/ui/text/style/LineHeightStyle;Landroidx/compose/ui/text/style/LineBreak;Landroidx/compose/ui/text/style/Hyphens;Landroidx/compose/ui/text/style/TextMotion;)Landroidx/compose/ui/text/ParagraphStyle;", "fastMerge", "ui-text_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nParagraphStyle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ParagraphStyle.kt\nandroidx/compose/ui/text/ParagraphStyleKt\n+ 2 TextUnit.kt\nandroidx/compose/ui/unit/TextUnitKt\n*L\n1#1,470:1\n250#2:471\n*S KotlinDebug\n*F\n+ 1 ParagraphStyle.kt\nandroidx/compose/ui/text/ParagraphStyleKt\n*L\n433#1:471\n*E\n"})
public final class ParagraphStyleKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f17650a = TextUnit.INSTANCE.m4581getUnspecifiedXSAIIZE();

    @NotNull
    /* JADX INFO: renamed from: fastMerge-HtYhynw, reason: not valid java name */
    public static final ParagraphStyle m3896fastMergeHtYhynw(@NotNull ParagraphStyle fastMerge, @Nullable TextAlign textAlign, @Nullable TextDirection textDirection, long j10, @Nullable TextIndent textIndent, @Nullable PlatformParagraphStyle platformParagraphStyle, @Nullable LineHeightStyle lineHeightStyle, @Nullable LineBreak lineBreak, @Nullable Hyphens hyphens, @Nullable TextMotion textMotion) {
        long j11;
        PlatformParagraphStyle platformStyle;
        TextAlign textAlign2 = textAlign;
        TextIndent textIndent2 = textIndent;
        Intrinsics.checkNotNullParameter(fastMerge, "$this$fastMerge");
        if (textAlign2 == null || Intrinsics.areEqual(textAlign2, fastMerge.getTextAlign())) {
            if (!TextUnitKt.m4588isUnspecifiedR2X_6o(j10)) {
                j11 = j10;
                if (TextUnit.m4567equalsimpl0(j11, fastMerge.getLineHeight())) {
                }
            } else {
                j11 = j10;
            }
            if ((textIndent2 == null || Intrinsics.areEqual(textIndent2, fastMerge.getTextIndent())) && ((textDirection == null || Intrinsics.areEqual(textDirection, fastMerge.getTextDirection())) && ((platformParagraphStyle == null || Intrinsics.areEqual(platformParagraphStyle, fastMerge.getPlatformStyle())) && ((lineHeightStyle == null || Intrinsics.areEqual(lineHeightStyle, fastMerge.getLineHeightStyle())) && ((lineBreak == null || Intrinsics.areEqual(lineBreak, fastMerge.getLineBreak())) && ((hyphens == null || Intrinsics.areEqual(hyphens, fastMerge.getHyphens())) && (textMotion == null || Intrinsics.areEqual(textMotion, fastMerge.getTextMotion())))))))) {
                return fastMerge;
            }
        } else {
            j11 = j10;
        }
        long lineHeight = TextUnitKt.m4588isUnspecifiedR2X_6o(j10) ? fastMerge.getLineHeight() : j11;
        if (textIndent2 == null) {
            textIndent2 = fastMerge.getTextIndent();
        }
        TextIndent textIndent3 = textIndent2;
        if (textAlign2 == null) {
            textAlign2 = fastMerge.getTextAlign();
        }
        TextAlign textAlign3 = textAlign2;
        TextDirection textDirection2 = textDirection == null ? fastMerge.getTextDirection() : textDirection;
        if (fastMerge.getPlatformStyle() == null) {
            platformStyle = platformParagraphStyle;
        } else {
            platformStyle = platformParagraphStyle == null ? fastMerge.getPlatformStyle() : fastMerge.getPlatformStyle().merge(platformParagraphStyle);
        }
        return new ParagraphStyle(textAlign3, textDirection2, lineHeight, textIndent3, platformStyle, lineHeightStyle == null ? fastMerge.getLineHeightStyle() : lineHeightStyle, lineBreak == null ? fastMerge.getLineBreak() : lineBreak, hyphens == null ? fastMerge.getHyphens() : hyphens, textMotion == null ? fastMerge.getTextMotion() : textMotion, (DefaultConstructorMarker) null);
    }

    @Stable
    @NotNull
    public static final ParagraphStyle lerp(@NotNull ParagraphStyle start, @NotNull ParagraphStyle stop, float f6) {
        PlatformParagraphStyle platformParagraphStyleLerp;
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(stop, "stop");
        TextAlign textAlign = (TextAlign) SpanStyleKt.lerpDiscrete(start.getTextAlign(), stop.getTextAlign(), f6);
        TextDirection textDirection = (TextDirection) SpanStyleKt.lerpDiscrete(start.getTextDirection(), stop.getTextDirection(), f6);
        long jM3933lerpTextUnitInheritableC3pnCVY = SpanStyleKt.m3933lerpTextUnitInheritableC3pnCVY(start.getLineHeight(), stop.getLineHeight(), f6);
        TextIndent textIndent = start.getTextIndent();
        if (textIndent == null) {
            textIndent = TextIndent.INSTANCE.getNone();
        }
        TextIndent textIndent2 = stop.getTextIndent();
        if (textIndent2 == null) {
            textIndent2 = TextIndent.INSTANCE.getNone();
        }
        TextIndent textIndentLerp = TextIndentKt.lerp(textIndent, textIndent2, f6);
        PlatformParagraphStyle platformStyle = start.getPlatformStyle();
        PlatformParagraphStyle platformStyle2 = stop.getPlatformStyle();
        if (platformStyle == null && platformStyle2 == null) {
            platformParagraphStyleLerp = null;
        } else {
            if (platformStyle == null) {
                platformStyle = PlatformParagraphStyle.INSTANCE.getDefault();
            }
            if (platformStyle2 == null) {
                platformStyle2 = PlatformParagraphStyle.INSTANCE.getDefault();
            }
            platformParagraphStyleLerp = AndroidTextStyle_androidKt.lerp(platformStyle, platformStyle2, f6);
        }
        return new ParagraphStyle(textAlign, textDirection, jM3933lerpTextUnitInheritableC3pnCVY, textIndentLerp, platformParagraphStyleLerp, (LineHeightStyle) SpanStyleKt.lerpDiscrete(start.getLineHeightStyle(), stop.getLineHeightStyle(), f6), (LineBreak) SpanStyleKt.lerpDiscrete(start.getLineBreak(), stop.getLineBreak(), f6), (Hyphens) SpanStyleKt.lerpDiscrete(start.getHyphens(), stop.getHyphens(), f6), (TextMotion) SpanStyleKt.lerpDiscrete(start.getTextMotion(), stop.getTextMotion(), f6), (DefaultConstructorMarker) null);
    }

    @NotNull
    public static final ParagraphStyle resolveParagraphStyleDefaults(@NotNull ParagraphStyle style, @NotNull LayoutDirection direction) {
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(direction, "direction");
        TextAlign textAlignM4289boximpl = TextAlign.m4289boximpl(style.getTextAlignOrDefault());
        TextDirection textDirectionM4302boximpl = TextDirection.m4302boximpl(TextStyleKt.m3999resolveTextDirectionYj3eThk(direction, style.getTextDirection()));
        long lineHeight = TextUnitKt.m4588isUnspecifiedR2X_6o(style.getLineHeight()) ? f17650a : style.getLineHeight();
        TextIndent textIndent = style.getTextIndent();
        if (textIndent == null) {
            textIndent = TextIndent.INSTANCE.getNone();
        }
        TextIndent textIndent2 = textIndent;
        PlatformParagraphStyle platformStyle = style.getPlatformStyle();
        LineHeightStyle lineHeightStyle = style.getLineHeightStyle();
        LineBreak lineBreakM4219boximpl = LineBreak.m4219boximpl(style.getLineBreakOrDefault());
        Hyphens hyphensM4211boximpl = Hyphens.m4211boximpl(style.getHyphensOrDefault());
        TextMotion textMotion = style.getTextMotion();
        if (textMotion == null) {
            textMotion = TextMotion.INSTANCE.getStatic();
        }
        return new ParagraphStyle(textAlignM4289boximpl, textDirectionM4302boximpl, lineHeight, textIndent2, platformStyle, lineHeightStyle, lineBreakM4219boximpl, hyphensM4211boximpl, textMotion, (DefaultConstructorMarker) null);
    }
}
