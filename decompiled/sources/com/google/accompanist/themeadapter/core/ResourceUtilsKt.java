package com.google.accompanist.themeadapter.core;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import androidx.annotation.RequiresApi;
import androidx.annotation.StyleRes;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.CornerSize;
import androidx.compose.foundation.shape.CornerSizeKt;
import androidx.compose.foundation.shape.CutCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontFamilyKt;
import androidx.compose.ui.text.font.FontKt;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.core.content.res.FontResourcesParserCompat;
import androidx.core.content.res.TypedArrayKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ResourceUtils.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a)\u0010\u0007\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a2\u0010\u0012\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u001a\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u0013*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u000f*\u00020\u00152\u0006\u0010\n\u001a\u00020\u0001H\u0007\u001a1\u0010\u001b\u001a\u00020\u0017*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u0018\u001a\u00020\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001a\u001a(\u0010 \u001a\u00020\u001e2\u0006\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e\u001a\u0014\u0010\"\u001a\u0004\u0018\u00010!*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006#"}, d2 = {"Landroid/content/res/TypedArray;", "", FirebaseAnalytics.Param.INDEX, "Landroidx/compose/ui/graphics/Color;", "fallbackColor", "parseColor-mxwnekA", "(Landroid/content/res/TypedArray;IJ)J", "parseColor", "Landroid/content/Context;", "context", "id", "Landroidx/compose/ui/unit/Density;", "density", "", "setTextColors", "Landroidx/compose/ui/text/font/FontFamily;", "defaultFontFamily", "Landroidx/compose/ui/text/TextStyle;", "parseTextAppearance", "Lcom/google/accompanist/themeadapter/core/FontFamilyWithWeight;", "parseFontFamily", "Landroid/content/res/Resources;", "parseXmlFontFamily", "Landroidx/compose/ui/unit/TextUnit;", "fallbackTextUnit", "parseTextUnit-lGoEivg", "(Landroid/content/res/TypedArray;ILandroidx/compose/ui/unit/Density;J)J", "parseTextUnit", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/foundation/shape/CornerBasedShape;", "fallbackShape", "parseShapeAppearance", "Landroidx/compose/foundation/shape/CornerSize;", "parseCornerSize", "themeadapter-core_release"}, k = 2, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nResourceUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResourceUtils.kt\ncom/google/accompanist/themeadapter/core/ResourceUtilsKt\n+ 2 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,383:1\n377#1,4:392\n377#1,4:399\n233#2,3:384\n233#2,3:396\n1#3:387\n11065#4:388\n11400#4,3:389\n174#5:403\n*S KotlinDebug\n*F\n+ 1 ResourceUtils.kt\ncom/google/accompanist/themeadapter/core/ResourceUtilsKt\n*L\n270#1:392,4\n358#1:399,4\n81#1:384,3\n299#1:396,3\n225#1:388\n225#1:389,3\n360#1:403\n*E\n"})
public final class ResourceUtilsKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final ThreadLocal<TypedValue> f43551a = new ThreadLocal<>();

    public static final FontWeight a(int i10) {
        if (i10 >= 0 && i10 < 150) {
            return FontWeight.INSTANCE.getW100();
        }
        if (150 <= i10 && i10 < 250) {
            return FontWeight.INSTANCE.getW200();
        }
        if (250 <= i10 && i10 < 350) {
            return FontWeight.INSTANCE.getW300();
        }
        if (350 <= i10 && i10 < 450) {
            return FontWeight.INSTANCE.getW400();
        }
        if (450 <= i10 && i10 < 550) {
            return FontWeight.INSTANCE.getW500();
        }
        if (550 <= i10 && i10 < 650) {
            return FontWeight.INSTANCE.getW600();
        }
        if (650 <= i10 && i10 < 750) {
            return FontWeight.INSTANCE.getW700();
        }
        if (750 > i10 || i10 >= 850) {
            return (850 > i10 || i10 >= 1000) ? FontWeight.INSTANCE.getW400() : FontWeight.INSTANCE.getW900();
        }
        return FontWeight.INSTANCE.getW800();
    }

    /* JADX INFO: renamed from: parseColor-mxwnekA, reason: not valid java name */
    public static final long m5278parseColormxwnekA(@NotNull TypedArray parseColor, int i10, long j10) {
        Intrinsics.checkNotNullParameter(parseColor, "$this$parseColor");
        return parseColor.hasValue(i10) ? ColorKt.Color(TypedArrayKt.getColorOrThrow(parseColor, i10)) : j10;
    }

    /* JADX INFO: renamed from: parseColor-mxwnekA$default, reason: not valid java name */
    public static /* synthetic */ long m5279parseColormxwnekA$default(TypedArray typedArray, int i10, long j10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            j10 = Color.INSTANCE.m2544getUnspecified0d7_KjU();
        }
        return m5278parseColormxwnekA(typedArray, i10, j10);
    }

    @Nullable
    public static final CornerSize parseCornerSize(@NotNull TypedArray typedArray, int i10) {
        Intrinsics.checkNotNullParameter(typedArray, "<this>");
        ThreadLocal<TypedValue> threadLocal = f43551a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        TypedValue typedValue2 = typedValue;
        if (!typedArray.getValue(i10, typedValue2)) {
            return null;
        }
        int i11 = typedValue2.type;
        if (i11 != 5) {
            if (i11 != 6) {
                return null;
            }
            return CornerSizeKt.CornerSize(typedValue2.getFraction(1.0f, 1.0f));
        }
        int complexUnit = typedValue2.getComplexUnit();
        if (complexUnit != 0) {
            return complexUnit != 1 ? CornerSizeKt.CornerSize(typedArray.getDimensionPixelSize(i10, 0)) : CornerSizeKt.m478CornerSize0680j_4(Dp.m4389constructorimpl(TypedValue.complexToFloat(typedValue2.data)));
        }
        return CornerSizeKt.CornerSize(TypedValue.complexToFloat(typedValue2.data));
    }

    @Nullable
    public static final FontFamilyWithWeight parseFontFamily(@NotNull TypedArray typedArray, int i10) {
        FontFamilyWithWeight fontFamilyWithWeight;
        Intrinsics.checkNotNullParameter(typedArray, "<this>");
        ThreadLocal<TypedValue> threadLocal = f43551a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        TypedValue typedValue2 = typedValue;
        if (!typedArray.getValue(i10, typedValue2) || typedValue2.type != 3) {
            return null;
        }
        CharSequence charSequence = typedValue2.string;
        if (Intrinsics.areEqual(charSequence, "sans-serif")) {
            fontFamilyWithWeight = new FontFamilyWithWeight(FontFamily.INSTANCE.getSansSerif(), null, 2, null);
        } else {
            if (Intrinsics.areEqual(charSequence, "sans-serif-thin")) {
                return new FontFamilyWithWeight(FontFamily.INSTANCE.getSansSerif(), FontWeight.INSTANCE.getThin());
            }
            if (Intrinsics.areEqual(charSequence, "sans-serif-light")) {
                return new FontFamilyWithWeight(FontFamily.INSTANCE.getSansSerif(), FontWeight.INSTANCE.getLight());
            }
            if (Intrinsics.areEqual(charSequence, "sans-serif-medium")) {
                return new FontFamilyWithWeight(FontFamily.INSTANCE.getSansSerif(), FontWeight.INSTANCE.getMedium());
            }
            if (Intrinsics.areEqual(charSequence, "sans-serif-black")) {
                return new FontFamilyWithWeight(FontFamily.INSTANCE.getSansSerif(), FontWeight.INSTANCE.getBlack());
            }
            if (Intrinsics.areEqual(charSequence, "serif")) {
                fontFamilyWithWeight = new FontFamilyWithWeight(FontFamily.INSTANCE.getSerif(), null, 2, null);
            } else if (Intrinsics.areEqual(charSequence, "cursive")) {
                fontFamilyWithWeight = new FontFamilyWithWeight(FontFamily.INSTANCE.getCursive(), null, 2, null);
            } else if (Intrinsics.areEqual(charSequence, "monospace")) {
                fontFamilyWithWeight = new FontFamilyWithWeight(FontFamily.INSTANCE.getMonospace(), null, 2, null);
            } else {
                if (typedValue2.resourceId == 0) {
                    return null;
                }
                CharSequence string = typedValue2.string;
                Intrinsics.checkNotNullExpressionValue(string, "string");
                if (!StringsKt__StringsKt.startsWith$default(string, (CharSequence) "res/", false, 2, (Object) null)) {
                    return null;
                }
                CharSequence string2 = typedValue2.string;
                Intrinsics.checkNotNullExpressionValue(string2, "string");
                if (StringsKt__StringsKt.endsWith$default(string2, (CharSequence) ".xml", false, 2, (Object) null)) {
                    Resources resources = typedArray.getResources();
                    Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                    FontFamily xmlFontFamily = parseXmlFontFamily(resources, typedValue2.resourceId);
                    if (xmlFontFamily != null) {
                        return new FontFamilyWithWeight(xmlFontFamily, null, 2, null);
                    }
                    return null;
                }
                fontFamilyWithWeight = new FontFamilyWithWeight(FontKt.toFontFamily(FontKt.m4046FontYpTlLL0$default(typedValue2.resourceId, null, 0, 0, 14, null)), null, 2, null);
            }
        }
        return fontFamilyWithWeight;
    }

    @NotNull
    public static final CornerBasedShape parseShapeAppearance(@NotNull Context context, @StyleRes int i10, @NotNull LayoutDirection layoutDirection, @NotNull CornerBasedShape fallbackShape) {
        CornerBasedShape roundedCornerShape;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(fallbackShape, "fallbackShape");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i10, R.styleable.ThemeAdapterShapeAppearance);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        CornerSize cornerSize = parseCornerSize(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterShapeAppearance_cornerSize);
        CornerSize cornerSize2 = parseCornerSize(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterShapeAppearance_cornerSizeTopLeft);
        CornerSize cornerSize3 = parseCornerSize(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterShapeAppearance_cornerSizeTopRight);
        CornerSize cornerSize4 = parseCornerSize(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterShapeAppearance_cornerSizeBottomLeft);
        CornerSize cornerSize5 = parseCornerSize(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterShapeAppearance_cornerSizeBottomRight);
        boolean z10 = layoutDirection == LayoutDirection.Rtl;
        CornerSize topStart = z10 ? cornerSize3 : cornerSize2;
        if (!z10) {
            cornerSize2 = cornerSize3;
        }
        CornerSize cornerSize6 = z10 ? cornerSize5 : cornerSize4;
        if (!z10) {
            cornerSize4 = cornerSize5;
        }
        int i11 = typedArrayObtainStyledAttributes.getInt(R.styleable.ThemeAdapterShapeAppearance_cornerFamily, 0);
        if (i11 == 0) {
            if (topStart == null) {
                topStart = cornerSize == null ? fallbackShape.getTopStart() : cornerSize;
            }
            if (cornerSize2 == null) {
                cornerSize2 = cornerSize == null ? fallbackShape.getTopEnd() : cornerSize;
            }
            if (cornerSize4 == null) {
                cornerSize4 = cornerSize == null ? fallbackShape.getBottomEnd() : cornerSize;
            }
            if (cornerSize6 != null) {
                cornerSize = cornerSize6;
            } else if (cornerSize == null) {
                cornerSize = fallbackShape.getBottomStart();
            }
            roundedCornerShape = new RoundedCornerShape(topStart, cornerSize2, cornerSize4, cornerSize);
        } else {
            if (i11 != 1) {
                throw new IllegalArgumentException("Unknown cornerFamily set in ShapeAppearance");
            }
            if (topStart == null) {
                topStart = cornerSize == null ? fallbackShape.getTopStart() : cornerSize;
            }
            if (cornerSize2 == null) {
                cornerSize2 = cornerSize == null ? fallbackShape.getTopEnd() : cornerSize;
            }
            if (cornerSize4 == null) {
                cornerSize4 = cornerSize == null ? fallbackShape.getBottomEnd() : cornerSize;
            }
            if (cornerSize6 != null) {
                cornerSize = cornerSize6;
            } else if (cornerSize == null) {
                cornerSize = fallbackShape.getBottomStart();
            }
            roundedCornerShape = new CutCornerShape(topStart, cornerSize2, cornerSize4, cornerSize);
        }
        typedArrayObtainStyledAttributes.recycle();
        return roundedCornerShape;
    }

    /* JADX WARN: Code duplicated, block: B:75:0x015f  */
    /* JADX WARN: Code duplicated, block: B:76:0x0183  */
    /* JADX WARN: Code duplicated, block: B:79:0x018d  */
    /* JADX WARN: Code duplicated, block: B:81:0x0198  */
    @NotNull
    public static final TextStyle parseTextAppearance(@NotNull Context context, @StyleRes int i10, @NotNull Density density, boolean z10, @Nullable FontFamily fontFamily) {
        FontFamily fontFamily2;
        FontWeight fontWeight;
        FontWeight weight;
        long jM5279parseColormxwnekA$default;
        Shadow shadow;
        int i11;
        long em2;
        FontFamily monospace;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(density, "density");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i10, R.styleable.ThemeAdapterTextAppearance);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        int i12 = typedArrayObtainStyledAttributes.getInt(R.styleable.ThemeAdapterTextAppearance_android_textStyle, -1);
        int i13 = typedArrayObtainStyledAttributes.getInt(R.styleable.ThemeAdapterTextAppearance_android_textFontWeight, -1);
        int i14 = typedArrayObtainStyledAttributes.getInt(R.styleable.ThemeAdapterTextAppearance_android_typeface, -1);
        FontFamilyWithWeight fontFamily3 = parseFontFamily(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterTextAppearance_fontFamily);
        if (fontFamily3 == null) {
            fontFamily3 = parseFontFamily(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterTextAppearance_android_fontFamily);
        }
        FontFamilyWithWeight fontFamilyWithWeight = fontFamily3;
        long jM5279parseColormxwnekA$default2 = z10 ? m5279parseColormxwnekA$default(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterTextAppearance_android_textColor, 0L, 2, null) : Color.INSTANCE.m2544getUnspecified0d7_KjU();
        long jM5281parseTextUnitlGoEivg$default = m5281parseTextUnitlGoEivg$default(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterTextAppearance_android_textSize, density, 0L, 4, null);
        long jM5280parseTextUnitlGoEivg = m5280parseTextUnitlGoEivg(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterTextAppearance_lineHeight, density, m5281parseTextUnitlGoEivg$default(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterTextAppearance_android_lineHeight, density, 0L, 4, null));
        if (fontFamily == null) {
            if (fontFamilyWithWeight != null) {
                monospace = fontFamilyWithWeight.getFontFamily();
            } else if (i14 == 1) {
                monospace = FontFamily.INSTANCE.getSansSerif();
            } else if (i14 == 2) {
                monospace = FontFamily.INSTANCE.getSerif();
            } else if (i14 == 3) {
                monospace = FontFamily.INSTANCE.getMonospace();
            } else {
                fontFamily2 = null;
            }
            fontFamily2 = monospace;
        } else {
            fontFamily2 = fontFamily;
        }
        int iM4066getItalic_LCdwA = (i12 & 2) != 0 ? FontStyle.INSTANCE.m4066getItalic_LCdwA() : FontStyle.INSTANCE.m4067getNormal_LCdwA();
        if (i13 >= 0 && i13 < 150) {
            weight = FontWeight.INSTANCE.getW100();
        } else if (150 <= i13 && i13 < 250) {
            weight = FontWeight.INSTANCE.getW200();
        } else if (250 <= i13 && i13 < 350) {
            weight = FontWeight.INSTANCE.getW300();
        } else if (350 <= i13 && i13 < 450) {
            weight = FontWeight.INSTANCE.getW400();
        } else if (450 <= i13 && i13 < 550) {
            weight = FontWeight.INSTANCE.getW500();
        } else if (550 <= i13 && i13 < 650) {
            weight = FontWeight.INSTANCE.getW600();
        } else if (650 <= i13 && i13 < 750) {
            weight = FontWeight.INSTANCE.getW700();
        } else if (750 <= i13 && i13 < 850) {
            weight = FontWeight.INSTANCE.getW800();
        } else if (850 <= i13 && i13 < 1000) {
            weight = FontWeight.INSTANCE.getW900();
        } else {
            if ((1 & i12) == 0) {
                if (fontFamilyWithWeight != null) {
                    weight = fontFamilyWithWeight.getWeight();
                } else {
                    fontWeight = null;
                }
                String string = typedArrayObtainStyledAttributes.getString(R.styleable.ThemeAdapterTextAppearance_android_fontFeatureSettings);
                jM5279parseColormxwnekA$default = m5279parseColormxwnekA$default(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterTextAppearance_android_shadowColor, 0L, 2, null);
                if (Color.m2509equalsimpl0(jM5279parseColormxwnekA$default, Color.INSTANCE.m2544getUnspecified0d7_KjU())) {
                    shadow = null;
                } else {
                    shadow = new Shadow(jM5279parseColormxwnekA$default, OffsetKt.Offset(typedArrayObtainStyledAttributes.getFloat(R.styleable.ThemeAdapterTextAppearance_android_shadowDx, 0.0f), typedArrayObtainStyledAttributes.getFloat(R.styleable.ThemeAdapterTextAppearance_android_shadowDy, 0.0f)), typedArrayObtainStyledAttributes.getFloat(R.styleable.ThemeAdapterTextAppearance_android_shadowRadius, 0.0f), null);
                }
                i11 = R.styleable.ThemeAdapterTextAppearance_android_letterSpacing;
                if (typedArrayObtainStyledAttributes.hasValue(i11)) {
                    em2 = TextUnitKt.getEm(typedArrayObtainStyledAttributes.getFloat(i11, 0.0f));
                } else {
                    em2 = TextUnitKt.getEm(0);
                }
                TextStyle textStyle = new TextStyle(jM5279parseColormxwnekA$default2, jM5281parseTextUnitlGoEivg$default, fontWeight, FontStyle.m4059boximpl(iM4066getItalic_LCdwA), (FontSynthesis) null, fontFamily2, string, em2, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, shadow, (DrawStyle) null, (TextAlign) null, (TextDirection) null, jM5280parseTextUnitlGoEivg, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16637712, (DefaultConstructorMarker) null);
                typedArrayObtainStyledAttributes.recycle();
                return textStyle;
            }
            weight = FontWeight.INSTANCE.getBold();
        }
        fontWeight = weight;
        String string2 = typedArrayObtainStyledAttributes.getString(R.styleable.ThemeAdapterTextAppearance_android_fontFeatureSettings);
        jM5279parseColormxwnekA$default = m5279parseColormxwnekA$default(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterTextAppearance_android_shadowColor, 0L, 2, null);
        if (Color.m2509equalsimpl0(jM5279parseColormxwnekA$default, Color.INSTANCE.m2544getUnspecified0d7_KjU())) {
            shadow = new Shadow(jM5279parseColormxwnekA$default, OffsetKt.Offset(typedArrayObtainStyledAttributes.getFloat(R.styleable.ThemeAdapterTextAppearance_android_shadowDx, 0.0f), typedArrayObtainStyledAttributes.getFloat(R.styleable.ThemeAdapterTextAppearance_android_shadowDy, 0.0f)), typedArrayObtainStyledAttributes.getFloat(R.styleable.ThemeAdapterTextAppearance_android_shadowRadius, 0.0f), null);
        } else {
            shadow = null;
        }
        i11 = R.styleable.ThemeAdapterTextAppearance_android_letterSpacing;
        if (typedArrayObtainStyledAttributes.hasValue(i11)) {
            em2 = TextUnitKt.getEm(typedArrayObtainStyledAttributes.getFloat(i11, 0.0f));
        } else {
            em2 = TextUnitKt.getEm(0);
        }
        TextStyle textStyle2 = new TextStyle(jM5279parseColormxwnekA$default2, jM5281parseTextUnitlGoEivg$default, fontWeight, FontStyle.m4059boximpl(iM4066getItalic_LCdwA), (FontSynthesis) null, fontFamily2, string2, em2, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, shadow, (DrawStyle) null, (TextAlign) null, (TextDirection) null, jM5280parseTextUnitlGoEivg, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16637712, (DefaultConstructorMarker) null);
        typedArrayObtainStyledAttributes.recycle();
        return textStyle2;
    }

    /* JADX INFO: renamed from: parseTextUnit-lGoEivg, reason: not valid java name */
    public static final long m5280parseTextUnitlGoEivg(@NotNull TypedArray parseTextUnit, int i10, @NotNull Density density, long j10) {
        Intrinsics.checkNotNullParameter(parseTextUnit, "$this$parseTextUnit");
        Intrinsics.checkNotNullParameter(density, "density");
        ThreadLocal<TypedValue> threadLocal = f43551a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        TypedValue typedValue2 = typedValue;
        if (!parseTextUnit.getValue(i10, typedValue2) || typedValue2.type != 5) {
            return j10;
        }
        int complexUnit = typedValue2.getComplexUnit();
        if (complexUnit != 1) {
            return complexUnit != 2 ? density.mo410toSpkPz2Gy4(parseTextUnit.getDimension(i10, 0.0f)) : TextUnitKt.getSp(TypedValue.complexToFloat(typedValue2.data));
        }
        return TextUnitKt.getEm(TypedValue.complexToFloat(typedValue2.data));
    }

    /* JADX INFO: renamed from: parseTextUnit-lGoEivg$default, reason: not valid java name */
    public static /* synthetic */ long m5281parseTextUnitlGoEivg$default(TypedArray typedArray, int i10, Density density, long j10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            j10 = TextUnit.INSTANCE.m4581getUnspecifiedXSAIIZE();
        }
        return m5280parseTextUnitlGoEivg(typedArray, i10, density, j10);
    }

    @RequiresApi(23)
    @SuppressLint({"RestrictedApi"})
    @Nullable
    public static final FontFamily parseXmlFontFamily(@NotNull Resources resources, int i10) {
        Intrinsics.checkNotNullParameter(resources, "<this>");
        XmlResourceParser xml = resources.getXml(i10);
        Intrinsics.checkNotNullExpressionValue(xml, "getXml(...)");
        try {
            FontResourcesParserCompat.FamilyResourceEntry familyResourceEntry = FontResourcesParserCompat.parse(xml, resources);
            if (!(familyResourceEntry instanceof FontResourcesParserCompat.FontFamilyFilesResourceEntry)) {
                return null;
            }
            FontResourcesParserCompat.FontFileResourceEntry[] entries = ((FontResourcesParserCompat.FontFamilyFilesResourceEntry) familyResourceEntry).getEntries();
            Intrinsics.checkNotNullExpressionValue(entries, "getEntries(...)");
            ArrayList arrayList = new ArrayList(entries.length);
            for (FontResourcesParserCompat.FontFileResourceEntry fontFileResourceEntry : entries) {
                arrayList.add(FontKt.m4046FontYpTlLL0$default(fontFileResourceEntry.getResourceId(), a(fontFileResourceEntry.getWeight()), fontFileResourceEntry.isItalic() ? FontStyle.INSTANCE.m4066getItalic_LCdwA() : FontStyle.INSTANCE.m4067getNormal_LCdwA(), 0, 8, null));
            }
            return FontFamilyKt.FontFamily(arrayList);
        } finally {
            xml.close();
        }
    }
}
