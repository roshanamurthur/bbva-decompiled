package androidx.compose.ui.text.platform.extensions;

import android.graphics.Typeface;
import android.os.Build;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.LocaleSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.ScaleXSpan;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.ShaderBrush;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.AnnotatedStringKt;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.android.style.BaselineShiftSpan;
import androidx.compose.ui.text.android.style.FontFeatureSpan;
import androidx.compose.ui.text.android.style.LetterSpacingSpanEm;
import androidx.compose.ui.text.android.style.LetterSpacingSpanPx;
import androidx.compose.ui.text.android.style.LineHeightSpan;
import androidx.compose.ui.text.android.style.LineHeightStyleSpan;
import androidx.compose.ui.text.android.style.ShadowSpan;
import androidx.compose.ui.text.android.style.SkewXSpan;
import androidx.compose.ui.text.android.style.TextDecorationSpan;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.Locale;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.platform.style.DrawStyleSpan;
import androidx.compose.ui.text.platform.style.ShaderBrushSpan;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.unit.TextUnitType;
import com.adobe.marketing.mobile.EventDataKeys;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt___StringsKt;
import mk.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import t1.a;

/* JADX INFO: compiled from: SpannableExtensions.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a$\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000\u001a&\u0010\u000e\u001a\u00020\u0006*\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0000\u001a9\u0010\u0015\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001a1\u0010\u0015\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001a[\u0010%\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0012\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0\u001a2\u0006\u0010\r\u001a\u00020\f2&\u0010$\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#0\u001eH\u0000ø\u0001\u0001\u001aF\u0010)\u001a\u00020\u00062\b\u0010&\u001a\u0004\u0018\u00010\u001c2\u0012\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0\u001a2\u001e\u0010(\u001a\u001a\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060'H\u0000\u001a1\u0010.\u001a\u00020\u0006*\u00020\u00002\u0006\u0010+\u001a\u00020*2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b,\u0010-\u001a&\u00101\u001a\u00020\u0006*\u00020\u00002\b\u00100\u001a\u0004\u0018\u00010/2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000\u001a9\u00105\u001a\u00020\u0006*\u00020\u00002\u0006\u00102\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b3\u00104\u001a&\u00108\u001a\u00020\u0006*\u00020\u00002\b\u00107\u001a\u0004\u0018\u0001062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000\u001a1\u0010:\u001a\u00020\u0006*\u00020\u00002\u0006\u0010+\u001a\u00020*2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b9\u0010-\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006;"}, d2 = {"Landroid/text/Spannable;", "", "span", "", EventDataKeys.Lifecycle.LIFECYCLE_START, "end", "", "setSpan", "Landroidx/compose/ui/text/style/TextIndent;", "textIndent", "", "contextFontSize", "Landroidx/compose/ui/unit/Density;", "density", "setTextIndent", "Landroidx/compose/ui/unit/TextUnit;", "lineHeight", "Landroidx/compose/ui/text/style/LineHeightStyle;", "lineHeightStyle", "setLineHeight-KmRG4DE", "(Landroid/text/Spannable;JFLandroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/style/LineHeightStyle;)V", "setLineHeight", "setLineHeight-r9BaKPg", "(Landroid/text/Spannable;JFLandroidx/compose/ui/unit/Density;)V", "Landroidx/compose/ui/text/TextStyle;", "contextTextStyle", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/SpanStyle;", "spanStyles", "Lkotlin/Function4;", "Landroidx/compose/ui/text/font/FontFamily;", "Landroidx/compose/ui/text/font/FontWeight;", "Landroidx/compose/ui/text/font/FontStyle;", "Landroidx/compose/ui/text/font/FontSynthesis;", "Landroid/graphics/Typeface;", "resolveTypeface", "setSpanStyles", "contextFontSpanStyle", "Lkotlin/Function3;", "block", "flattenFontStylesAndApply", "Landroidx/compose/ui/graphics/Color;", "color", "setBackground-RPmYEkk", "(Landroid/text/Spannable;JII)V", "setBackground", "Landroidx/compose/ui/text/intl/LocaleList;", "localeList", "setLocaleList", "fontSize", "setFontSize-KmRG4DE", "(Landroid/text/Spannable;JLandroidx/compose/ui/unit/Density;II)V", "setFontSize", "Landroidx/compose/ui/text/style/TextDecoration;", "textDecoration", "setTextDecoration", "setColor-RPmYEkk", "setColor", "ui-text_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSpannableExtensions.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpannableExtensions.android.kt\nandroidx/compose/ui/text/platform/extensions/SpannableExtensions_androidKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 TempListUtils.kt\nandroidx/compose/ui/text/TempListUtilsKt\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 5 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,551:1\n1#2:552\n35#3,3:553\n38#3,2:560\n40#3:563\n33#4,4:556\n38#4:562\n69#4,6:564\n33#4,6:570\n646#5:576\n646#5:577\n*S KotlinDebug\n*F\n+ 1 SpannableExtensions.android.kt\nandroidx/compose/ui/text/platform/extensions/SpannableExtensions_androidKt\n*L\n281#1:553,3\n281#1:560,2\n281#1:563\n281#1:556,4\n281#1:562\n349#1:564,6\n369#1:570,6\n433#1:576\n506#1:577\n*E\n"})
public final class SpannableExtensions_androidKt {
    public static final float a(long j10, float f6, Density density) {
        long jM4569getTypeUIouoOA = TextUnit.m4569getTypeUIouoOA(j10);
        TextUnitType.Companion companion = TextUnitType.INSTANCE;
        if (TextUnitType.m4598equalsimpl0(jM4569getTypeUIouoOA, companion.m4603getSpUIouoOA())) {
            return density.mo414toPxR2X_6o(j10);
        }
        if (TextUnitType.m4598equalsimpl0(jM4569getTypeUIouoOA, companion.m4602getEmUIouoOA())) {
            return TextUnit.m4570getValueimpl(j10) * f6;
        }
        return Float.NaN;
    }

    public static final void flattenFontStylesAndApply(@Nullable SpanStyle spanStyle, @NotNull List<AnnotatedString.Range<SpanStyle>> spanStyles, @NotNull Function3<? super SpanStyle, ? super Integer, ? super Integer, Unit> block) {
        Intrinsics.checkNotNullParameter(spanStyles, "spanStyles");
        Intrinsics.checkNotNullParameter(block, "block");
        if (spanStyles.size() <= 1) {
            if (!spanStyles.isEmpty()) {
                SpanStyle item = spanStyles.get(0).getItem();
                if (spanStyle != null) {
                    item = spanStyle.merge(item);
                }
                block.invoke(item, Integer.valueOf(spanStyles.get(0).getStart()), Integer.valueOf(spanStyles.get(0).getEnd()));
                return;
            }
            return;
        }
        int size = spanStyles.size();
        int i10 = size * 2;
        Integer[] numArr = new Integer[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            numArr[i11] = 0;
        }
        int size2 = spanStyles.size();
        for (int i12 = 0; i12 < size2; i12++) {
            AnnotatedString.Range<SpanStyle> range = spanStyles.get(i12);
            numArr[i12] = Integer.valueOf(range.getStart());
            numArr[i12 + size] = Integer.valueOf(range.getEnd());
        }
        ArraysKt___ArraysJvmKt.sort(numArr);
        int iIntValue = ((Number) ArraysKt___ArraysKt.first(numArr)).intValue();
        for (int i13 = 0; i13 < i10; i13++) {
            int iIntValue2 = numArr[i13].intValue();
            if (iIntValue2 != iIntValue) {
                int size3 = spanStyles.size();
                SpanStyle spanStyleMerge = spanStyle;
                for (int i14 = 0; i14 < size3; i14++) {
                    AnnotatedString.Range<SpanStyle> range2 = spanStyles.get(i14);
                    if (range2.getStart() != range2.getEnd() && AnnotatedStringKt.intersect(iIntValue, iIntValue2, range2.getStart(), range2.getEnd())) {
                        SpanStyle item2 = range2.getItem();
                        spanStyleMerge = spanStyleMerge == null ? item2 : spanStyleMerge.merge(item2);
                    }
                }
                if (spanStyleMerge != null) {
                    block.invoke(spanStyleMerge, Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2));
                }
                iIntValue = iIntValue2;
            }
        }
    }

    /* JADX INFO: renamed from: setBackground-RPmYEkk, reason: not valid java name */
    public static final void m4190setBackgroundRPmYEkk(@NotNull Spannable setBackground, long j10, int i10, int i11) {
        Intrinsics.checkNotNullParameter(setBackground, "$this$setBackground");
        if (j10 != Color.INSTANCE.m2544getUnspecified0d7_KjU()) {
            setSpan(setBackground, new BackgroundColorSpan(ColorKt.m2561toArgb8_81llA(j10)), i10, i11);
        }
    }

    /* JADX INFO: renamed from: setColor-RPmYEkk, reason: not valid java name */
    public static final void m4191setColorRPmYEkk(@NotNull Spannable setColor, long j10, int i10, int i11) {
        Intrinsics.checkNotNullParameter(setColor, "$this$setColor");
        if (j10 != Color.INSTANCE.m2544getUnspecified0d7_KjU()) {
            setSpan(setColor, new ForegroundColorSpan(ColorKt.m2561toArgb8_81llA(j10)), i10, i11);
        }
    }

    /* JADX INFO: renamed from: setFontSize-KmRG4DE, reason: not valid java name */
    public static final void m4192setFontSizeKmRG4DE(@NotNull Spannable setFontSize, long j10, @NotNull Density density, int i10, int i11) {
        Intrinsics.checkNotNullParameter(setFontSize, "$this$setFontSize");
        Intrinsics.checkNotNullParameter(density, "density");
        long jM4569getTypeUIouoOA = TextUnit.m4569getTypeUIouoOA(j10);
        TextUnitType.Companion companion = TextUnitType.INSTANCE;
        if (TextUnitType.m4598equalsimpl0(jM4569getTypeUIouoOA, companion.m4603getSpUIouoOA())) {
            setSpan(setFontSize, new AbsoluteSizeSpan(c.roundToInt(density.mo414toPxR2X_6o(j10)), false), i10, i11);
        } else if (TextUnitType.m4598equalsimpl0(jM4569getTypeUIouoOA, companion.m4602getEmUIouoOA())) {
            setSpan(setFontSize, new RelativeSizeSpan(TextUnit.m4570getValueimpl(j10)), i10, i11);
        }
    }

    /* JADX INFO: renamed from: setLineHeight-KmRG4DE, reason: not valid java name */
    public static final void m4193setLineHeightKmRG4DE(@NotNull Spannable setLineHeight, long j10, float f6, @NotNull Density density, @NotNull LineHeightStyle lineHeightStyle) {
        Intrinsics.checkNotNullParameter(setLineHeight, "$this$setLineHeight");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(lineHeightStyle, "lineHeightStyle");
        float fA = a(j10, f6, density);
        if (Float.isNaN(fA)) {
            return;
        }
        setSpan(setLineHeight, new LineHeightStyleSpan(fA, 0, (setLineHeight.length() == 0 || StringsKt___StringsKt.last(setLineHeight) == '\n') ? setLineHeight.length() + 1 : setLineHeight.length(), LineHeightStyle.Trim.m4281isTrimFirstLineTopimpl$ui_text_release(lineHeightStyle.getTrim()), LineHeightStyle.Trim.m4282isTrimLastLineBottomimpl$ui_text_release(lineHeightStyle.getTrim()), lineHeightStyle.getAlignment()), 0, setLineHeight.length());
    }

    /* JADX INFO: renamed from: setLineHeight-r9BaKPg, reason: not valid java name */
    public static final void m4194setLineHeightr9BaKPg(@NotNull Spannable setLineHeight, long j10, float f6, @NotNull Density density) {
        Intrinsics.checkNotNullParameter(setLineHeight, "$this$setLineHeight");
        Intrinsics.checkNotNullParameter(density, "density");
        float fA = a(j10, f6, density);
        if (Float.isNaN(fA)) {
            return;
        }
        setSpan(setLineHeight, new LineHeightSpan(fA), 0, setLineHeight.length());
    }

    public static final void setLocaleList(@NotNull Spannable spannable, @Nullable LocaleList localeList, int i10, int i11) {
        Object localeSpan;
        Intrinsics.checkNotNullParameter(spannable, "<this>");
        if (localeList != null) {
            if (Build.VERSION.SDK_INT >= 24) {
                localeSpan = LocaleListHelperMethods.INSTANCE.localeSpan(localeList);
            } else {
                localeSpan = new LocaleSpan(LocaleExtensions_androidKt.toJavaLocale(localeList.isEmpty() ? Locale.INSTANCE.getCurrent() : localeList.get(0)));
            }
            setSpan(spannable, localeSpan, i10, i11);
        }
    }

    public static final void setSpan(@NotNull Spannable spannable, @NotNull Object span, int i10, int i11) {
        Intrinsics.checkNotNullParameter(spannable, "<this>");
        Intrinsics.checkNotNullParameter(span, "span");
        spannable.setSpan(span, i10, i11, 33);
    }

    public static final void setSpanStyles(@NotNull Spannable spannable, @NotNull TextStyle contextTextStyle, @NotNull List<AnnotatedString.Range<SpanStyle>> spanStyles, @NotNull Density density, @NotNull Function4<? super FontFamily, ? super FontWeight, ? super FontStyle, ? super FontSynthesis, ? extends Typeface> resolveTypeface) {
        int i10;
        Intrinsics.checkNotNullParameter(spannable, "<this>");
        Intrinsics.checkNotNullParameter(contextTextStyle, "contextTextStyle");
        Intrinsics.checkNotNullParameter(spanStyles, "spanStyles");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(resolveTypeface, "resolveTypeface");
        ArrayList arrayList = new ArrayList(spanStyles.size());
        int size = spanStyles.size();
        for (int i11 = 0; i11 < size; i11++) {
            AnnotatedString.Range<SpanStyle> range = spanStyles.get(i11);
            AnnotatedString.Range<SpanStyle> range2 = range;
            if (TextPaintExtensions_androidKt.hasFontAttributes(range2.getItem()) || range2.getItem().getFontSynthesis() != null) {
                arrayList.add(range);
            }
        }
        flattenFontStylesAndApply((TextPaintExtensions_androidKt.hasFontAttributes(contextTextStyle.toSpanStyle()) || contextTextStyle.m3991getFontSynthesisZQGJjVo() != null) ? new SpanStyle(0L, 0L, contextTextStyle.getFontWeight(), contextTextStyle.m3990getFontStyle4Lr2A7w(), contextTextStyle.m3991getFontSynthesisZQGJjVo(), contextTextStyle.getFontFamily(), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65475, (DefaultConstructorMarker) null) : null, arrayList, new a(spannable, resolveTypeface));
        int size2 = spanStyles.size();
        boolean z10 = false;
        for (int i12 = 0; i12 < size2; i12++) {
            AnnotatedString.Range<SpanStyle> range3 = spanStyles.get(i12);
            int start = range3.getStart();
            int end = range3.getEnd();
            if (start >= 0 && start < spannable.length() && end > start && end <= spannable.length()) {
                int start2 = range3.getStart();
                int end2 = range3.getEnd();
                SpanStyle item = range3.getItem();
                BaselineShift baselineShift = item.getBaselineShift();
                if (baselineShift != null) {
                    setSpan(spannable, new BaselineShiftSpan(baselineShift.m4203unboximpl()), start2, end2);
                }
                m4191setColorRPmYEkk(spannable, item.m3927getColor0d7_KjU(), start2, end2);
                Brush brush = item.getBrush();
                float alpha = item.getAlpha();
                if (brush != null) {
                    if (brush instanceof SolidColor) {
                        m4191setColorRPmYEkk(spannable, ((SolidColor) brush).getValue(), start2, end2);
                    } else if (brush instanceof ShaderBrush) {
                        setSpan(spannable, new ShaderBrushSpan((ShaderBrush) brush, alpha), start2, end2);
                    }
                }
                setTextDecoration(spannable, item.getTextDecoration(), start2, end2);
                m4192setFontSizeKmRG4DE(spannable, item.getFontSize(), density, start2, end2);
                String fontFeatureSettings = item.getFontFeatureSettings();
                if (fontFeatureSettings != null) {
                    FontFeatureSpan fontFeatureSpan = new FontFeatureSpan(fontFeatureSettings);
                    i10 = end2;
                    setSpan(spannable, fontFeatureSpan, start2, i10);
                } else {
                    i10 = end2;
                }
                TextGeometricTransform textGeometricTransform = item.getTextGeometricTransform();
                if (textGeometricTransform != null) {
                    setSpan(spannable, new ScaleXSpan(textGeometricTransform.getScaleX()), start2, i10);
                    setSpan(spannable, new SkewXSpan(textGeometricTransform.getSkewX()), start2, i10);
                }
                setLocaleList(spannable, item.getLocaleList(), start2, i10);
                m4190setBackgroundRPmYEkk(spannable, item.getBackground(), start2, i10);
                Shadow shadow = item.getShadow();
                if (shadow != null) {
                    setSpan(spannable, new ShadowSpan(ColorKt.m2561toArgb8_81llA(shadow.getColor()), Offset.m2275getXimpl(shadow.getAndroidx.constraintlayout.core.motion.utils.TypedValues.CycleType.S_WAVE_OFFSET java.lang.String()), Offset.m2276getYimpl(shadow.getAndroidx.constraintlayout.core.motion.utils.TypedValues.CycleType.S_WAVE_OFFSET java.lang.String()), TextPaintExtensions_androidKt.correctBlurRadius(shadow.getBlurRadius())), start2, i10);
                }
                DrawStyle drawStyle = item.getDrawStyle();
                if (drawStyle != null) {
                    setSpan(spannable, new DrawStyleSpan(drawStyle), start2, i10);
                }
                SpanStyle item2 = range3.getItem();
                long jM4569getTypeUIouoOA = TextUnit.m4569getTypeUIouoOA(item2.getLetterSpacing());
                TextUnitType.Companion companion = TextUnitType.INSTANCE;
                if (TextUnitType.m4598equalsimpl0(jM4569getTypeUIouoOA, companion.m4603getSpUIouoOA()) || TextUnitType.m4598equalsimpl0(TextUnit.m4569getTypeUIouoOA(item2.getLetterSpacing()), companion.m4602getEmUIouoOA())) {
                    z10 = true;
                }
            }
        }
        if (z10) {
            int size3 = spanStyles.size();
            for (int i13 = 0; i13 < size3; i13++) {
                AnnotatedString.Range<SpanStyle> range4 = spanStyles.get(i13);
                int start3 = range4.getStart();
                int end3 = range4.getEnd();
                SpanStyle item3 = range4.getItem();
                if (start3 >= 0 && start3 < spannable.length() && end3 > start3 && end3 <= spannable.length()) {
                    long letterSpacing = item3.getLetterSpacing();
                    long jM4569getTypeUIouoOA2 = TextUnit.m4569getTypeUIouoOA(letterSpacing);
                    TextUnitType.Companion companion2 = TextUnitType.INSTANCE;
                    Object letterSpacingSpanPx = TextUnitType.m4598equalsimpl0(jM4569getTypeUIouoOA2, companion2.m4603getSpUIouoOA()) ? new LetterSpacingSpanPx(density.mo414toPxR2X_6o(letterSpacing)) : TextUnitType.m4598equalsimpl0(jM4569getTypeUIouoOA2, companion2.m4602getEmUIouoOA()) ? new LetterSpacingSpanEm(TextUnit.m4570getValueimpl(letterSpacing)) : null;
                    if (letterSpacingSpanPx != null) {
                        setSpan(spannable, letterSpacingSpanPx, start3, end3);
                    }
                }
            }
        }
    }

    public static final void setTextDecoration(@NotNull Spannable spannable, @Nullable TextDecoration textDecoration, int i10, int i11) {
        Intrinsics.checkNotNullParameter(spannable, "<this>");
        if (textDecoration != null) {
            TextDecoration.Companion companion = TextDecoration.INSTANCE;
            setSpan(spannable, new TextDecorationSpan(textDecoration.contains(companion.getUnderline()), textDecoration.contains(companion.getLineThrough())), i10, i11);
        }
    }

    public static final void setTextIndent(@NotNull Spannable spannable, @Nullable TextIndent textIndent, float f6, @NotNull Density density) {
        float fM4570getValueimpl;
        Intrinsics.checkNotNullParameter(spannable, "<this>");
        Intrinsics.checkNotNullParameter(density, "density");
        if (textIndent != null) {
            if ((TextUnit.m4567equalsimpl0(textIndent.getFirstLine(), TextUnitKt.getSp(0)) && TextUnit.m4567equalsimpl0(textIndent.getRestLine(), TextUnitKt.getSp(0))) || TextUnitKt.m4588isUnspecifiedR2X_6o(textIndent.getFirstLine()) || TextUnitKt.m4588isUnspecifiedR2X_6o(textIndent.getRestLine())) {
                return;
            }
            long jM4569getTypeUIouoOA = TextUnit.m4569getTypeUIouoOA(textIndent.getFirstLine());
            TextUnitType.Companion companion = TextUnitType.INSTANCE;
            float fM4570getValueimpl2 = 0.0f;
            if (TextUnitType.m4598equalsimpl0(jM4569getTypeUIouoOA, companion.m4603getSpUIouoOA())) {
                fM4570getValueimpl = density.mo414toPxR2X_6o(textIndent.getFirstLine());
            } else {
                fM4570getValueimpl = TextUnitType.m4598equalsimpl0(jM4569getTypeUIouoOA, companion.m4602getEmUIouoOA()) ? TextUnit.m4570getValueimpl(textIndent.getFirstLine()) * f6 : 0.0f;
            }
            long jM4569getTypeUIouoOA2 = TextUnit.m4569getTypeUIouoOA(textIndent.getRestLine());
            if (TextUnitType.m4598equalsimpl0(jM4569getTypeUIouoOA2, companion.m4603getSpUIouoOA())) {
                fM4570getValueimpl2 = density.mo414toPxR2X_6o(textIndent.getRestLine());
            } else if (TextUnitType.m4598equalsimpl0(jM4569getTypeUIouoOA2, companion.m4602getEmUIouoOA())) {
                fM4570getValueimpl2 = TextUnit.m4570getValueimpl(textIndent.getRestLine()) * f6;
            }
            setSpan(spannable, new LeadingMarginSpan.Standard((int) Math.ceil(fM4570getValueimpl), (int) Math.ceil(fM4570getValueimpl2)), 0, spannable.length());
        }
    }
}
