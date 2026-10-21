package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.tokens.ElevatedButtonTokens;
import androidx.compose.material3.tokens.FilledButtonTokens;
import androidx.compose.material3.tokens.FilledTonalButtonTokens;
import androidx.compose.material3.tokens.OutlinedButtonTokens;
import androidx.compose.material3.tokens.TextButtonTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Button.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bN\u0010OJ=\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ=\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\tJ=\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\tJ=\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\tJ=\u0010\u0012\u001a\u00020\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\tJG\u0010\u001c\u001a\u00020\u00192\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00132\b\b\u0002\u0010\u0017\u001a\u00020\u00132\b\b\u0002\u0010\u0018\u001a\u00020\u0013H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001bJG\u0010\u001e\u001a\u00020\u00192\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00132\b\b\u0002\u0010\u0017\u001a\u00020\u00132\b\b\u0002\u0010\u0018\u001a\u00020\u0013H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001bJG\u0010 \u001a\u00020\u00192\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00132\b\b\u0002\u0010\u0017\u001a\u00020\u00132\b\b\u0002\u0010\u0018\u001a\u00020\u0013H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010\u001bR\u0017\u0010&\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010)\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b(\u0010%R\u0017\u0010,\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b*\u0010#\u001a\u0004\b+\u0010%R\u0017\u0010/\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b-\u0010#\u001a\u0004\b.\u0010%R \u00104\u001a\u00020\u00138\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R \u00107\u001a\u00020\u00138\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b5\u00101\u001a\u0004\b6\u00103R \u0010:\u001a\u00020\u00138\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b8\u00101\u001a\u0004\b9\u00103R \u0010=\u001a\u00020\u00138\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b;\u00101\u001a\u0004\b<\u00103R\u0011\u0010A\u001a\u00020>8G¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0011\u0010C\u001a\u00020>8G¢\u0006\u0006\u001a\u0004\bB\u0010@R\u0011\u0010E\u001a\u00020>8G¢\u0006\u0006\u001a\u0004\bD\u0010@R\u0011\u0010G\u001a\u00020>8G¢\u0006\u0006\u001a\u0004\bF\u0010@R\u0011\u0010I\u001a\u00020>8G¢\u0006\u0006\u001a\u0004\bH\u0010@R\u0011\u0010M\u001a\u00020J8G¢\u0006\u0006\u001a\u0004\bK\u0010L\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006P"}, d2 = {"Landroidx/compose/material3/ButtonDefaults;", "", "Landroidx/compose/ui/graphics/Color;", "containerColor", "contentColor", "disabledContainerColor", "disabledContentColor", "Landroidx/compose/material3/ButtonColors;", "buttonColors-ro_MJ88", "(JJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ButtonColors;", "buttonColors", "elevatedButtonColors-ro_MJ88", "elevatedButtonColors", "filledTonalButtonColors-ro_MJ88", "filledTonalButtonColors", "outlinedButtonColors-ro_MJ88", "outlinedButtonColors", "textButtonColors-ro_MJ88", "textButtonColors", "Landroidx/compose/ui/unit/Dp;", "defaultElevation", "pressedElevation", "focusedElevation", "hoveredElevation", "disabledElevation", "Landroidx/compose/material3/ButtonElevation;", "buttonElevation-R_JCAzs", "(FFFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ButtonElevation;", "buttonElevation", "elevatedButtonElevation-R_JCAzs", "elevatedButtonElevation", "filledTonalButtonElevation-R_JCAzs", "filledTonalButtonElevation", "Landroidx/compose/foundation/layout/PaddingValues;", "a", "Landroidx/compose/foundation/layout/PaddingValues;", "getContentPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "ContentPadding", "b", "getButtonWithIconContentPadding", "ButtonWithIconContentPadding", "c", "getTextButtonContentPadding", "TextButtonContentPadding", "d", "getTextButtonWithIconContentPadding", "TextButtonWithIconContentPadding", "e", "F", "getMinWidth-D9Ej5fM", "()F", "MinWidth", "f", "getMinHeight-D9Ej5fM", "MinHeight", "g", "getIconSize-D9Ej5fM", "IconSize", "h", "getIconSpacing-D9Ej5fM", "IconSpacing", "Landroidx/compose/ui/graphics/Shape;", "getShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "shape", "getElevatedShape", "elevatedShape", "getFilledTonalShape", "filledTonalShape", "getOutlinedShape", "outlinedShape", "getTextShape", "textShape", "Landroidx/compose/foundation/BorderStroke;", "getOutlinedButtonBorder", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/BorderStroke;", "outlinedButtonBorder", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Button.kt\nandroidx/compose/material3/ButtonDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,956:1\n154#2:957\n154#2:958\n154#2:959\n154#2:960\n154#2:961\n154#2:962\n154#2:963\n154#2:964\n154#2:965\n*S KotlinDebug\n*F\n+ 1 Button.kt\nandroidx/compose/material3/ButtonDefaults\n*L\n738#1:957\n451#1:958\n452#1:959\n471#1:960\n482#1:961\n497#1:962\n512#1:963\n518#1:964\n526#1:965\n*E\n"})
public final class ButtonDefaults {
    public static final int $stable = 0;

    @NotNull
    public static final ButtonDefaults INSTANCE = new ButtonDefaults();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final PaddingValues ContentPadding;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final PaddingValues ButtonWithIconContentPadding;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final PaddingValues TextButtonContentPadding;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final PaddingValues TextButtonWithIconContentPadding;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final float MinWidth;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final float MinHeight;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final float IconSize;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public static final float IconSpacing;

    static {
        float fM4389constructorimpl = Dp.m4389constructorimpl(24);
        float f6 = 8;
        float fM4389constructorimpl2 = Dp.m4389constructorimpl(f6);
        PaddingValues paddingValuesM292PaddingValuesa9UjIt4 = PaddingKt.m292PaddingValuesa9UjIt4(fM4389constructorimpl, fM4389constructorimpl2, fM4389constructorimpl, fM4389constructorimpl2);
        ContentPadding = paddingValuesM292PaddingValuesa9UjIt4;
        float f10 = 16;
        ButtonWithIconContentPadding = PaddingKt.m292PaddingValuesa9UjIt4(Dp.m4389constructorimpl(f10), fM4389constructorimpl2, fM4389constructorimpl, fM4389constructorimpl2);
        float fM4389constructorimpl3 = Dp.m4389constructorimpl(12);
        TextButtonContentPadding = PaddingKt.m292PaddingValuesa9UjIt4(fM4389constructorimpl3, paddingValuesM292PaddingValuesa9UjIt4.getTop(), fM4389constructorimpl3, paddingValuesM292PaddingValuesa9UjIt4.getBottom());
        TextButtonWithIconContentPadding = PaddingKt.m292PaddingValuesa9UjIt4(fM4389constructorimpl3, paddingValuesM292PaddingValuesa9UjIt4.getTop(), Dp.m4389constructorimpl(f10), paddingValuesM292PaddingValuesa9UjIt4.getBottom());
        MinWidth = Dp.m4389constructorimpl(58);
        MinHeight = Dp.m4389constructorimpl(40);
        IconSize = FilledButtonTokens.INSTANCE.m1711getIconSizeD9Ej5fM();
        IconSpacing = Dp.m4389constructorimpl(f6);
    }

    @Composable
    @NotNull
    /* JADX INFO: renamed from: buttonColors-ro_MJ88, reason: not valid java name */
    public final ButtonColors m928buttonColorsro_MJ88(long j10, long j11, long j12, long j13, @Nullable Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(-339300779);
        long color = (i11 & 1) != 0 ? ColorSchemeKt.toColor(FilledButtonTokens.INSTANCE.getContainerColor(), composer, 6) : j10;
        long color2 = (i11 & 2) != 0 ? ColorSchemeKt.toColor(FilledButtonTokens.INSTANCE.getLabelTextColor(), composer, 6) : j11;
        long jM2507copywmQWz5c$default = (i11 & 4) != 0 ? Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(FilledButtonTokens.INSTANCE.getDisabledContainerColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j12;
        long jM2507copywmQWz5c$default2 = (i11 & 8) != 0 ? Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(FilledButtonTokens.INSTANCE.getDisabledLabelTextColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j13;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-339300779, i10, -1, "androidx.compose.material3.ButtonDefaults.buttonColors (Button.kt:552)");
        }
        ButtonColors buttonColors = new ButtonColors(color, color2, jM2507copywmQWz5c$default, jM2507copywmQWz5c$default2, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return buttonColors;
    }

    @Composable
    @NotNull
    /* JADX INFO: renamed from: buttonElevation-R_JCAzs, reason: not valid java name */
    public final ButtonElevation m929buttonElevationR_JCAzs(float f6, float f10, float f11, float f12, float f13, @Nullable Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(1827791191);
        float fM1706getContainerElevationD9Ej5fM = (i11 & 1) != 0 ? FilledButtonTokens.INSTANCE.m1706getContainerElevationD9Ej5fM() : f6;
        float fM1712getPressedContainerElevationD9Ej5fM = (i11 & 2) != 0 ? FilledButtonTokens.INSTANCE.m1712getPressedContainerElevationD9Ej5fM() : f10;
        float fM1709getFocusContainerElevationD9Ej5fM = (i11 & 4) != 0 ? FilledButtonTokens.INSTANCE.m1709getFocusContainerElevationD9Ej5fM() : f11;
        float fM1710getHoverContainerElevationD9Ej5fM = (i11 & 8) != 0 ? FilledButtonTokens.INSTANCE.m1710getHoverContainerElevationD9Ej5fM() : f12;
        float fM1708getDisabledContainerElevationD9Ej5fM = (i11 & 16) != 0 ? FilledButtonTokens.INSTANCE.m1708getDisabledContainerElevationD9Ej5fM() : f13;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1827791191, i10, -1, "androidx.compose.material3.ButtonDefaults.buttonElevation (Button.kt:679)");
        }
        ButtonElevation buttonElevation = new ButtonElevation(fM1706getContainerElevationD9Ej5fM, fM1712getPressedContainerElevationD9Ej5fM, fM1709getFocusContainerElevationD9Ej5fM, fM1710getHoverContainerElevationD9Ej5fM, fM1708getDisabledContainerElevationD9Ej5fM, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return buttonElevation;
    }

    @Composable
    @NotNull
    /* JADX INFO: renamed from: elevatedButtonColors-ro_MJ88, reason: not valid java name */
    public final ButtonColors m930elevatedButtonColorsro_MJ88(long j10, long j11, long j12, long j13, @Nullable Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(1507908383);
        long color = (i11 & 1) != 0 ? ColorSchemeKt.toColor(ElevatedButtonTokens.INSTANCE.getContainerColor(), composer, 6) : j10;
        long color2 = (i11 & 2) != 0 ? ColorSchemeKt.toColor(ElevatedButtonTokens.INSTANCE.getLabelTextColor(), composer, 6) : j11;
        long jM2507copywmQWz5c$default = (i11 & 4) != 0 ? Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(ElevatedButtonTokens.INSTANCE.getDisabledContainerColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j12;
        long jM2507copywmQWz5c$default2 = (i11 & 8) != 0 ? Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(ElevatedButtonTokens.INSTANCE.getDisabledLabelTextColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j13;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1507908383, i10, -1, "androidx.compose.material3.ButtonDefaults.elevatedButtonColors (Button.kt:577)");
        }
        ButtonColors buttonColors = new ButtonColors(color, color2, jM2507copywmQWz5c$default, jM2507copywmQWz5c$default2, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return buttonColors;
    }

    @Composable
    @NotNull
    /* JADX INFO: renamed from: elevatedButtonElevation-R_JCAzs, reason: not valid java name */
    public final ButtonElevation m931elevatedButtonElevationR_JCAzs(float f6, float f10, float f11, float f12, float f13, @Nullable Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(1065482445);
        float fM1622getContainerElevationD9Ej5fM = (i11 & 1) != 0 ? ElevatedButtonTokens.INSTANCE.m1622getContainerElevationD9Ej5fM() : f6;
        float fM1628getPressedContainerElevationD9Ej5fM = (i11 & 2) != 0 ? ElevatedButtonTokens.INSTANCE.m1628getPressedContainerElevationD9Ej5fM() : f10;
        float fM1625getFocusContainerElevationD9Ej5fM = (i11 & 4) != 0 ? ElevatedButtonTokens.INSTANCE.m1625getFocusContainerElevationD9Ej5fM() : f11;
        float fM1626getHoverContainerElevationD9Ej5fM = (i11 & 8) != 0 ? ElevatedButtonTokens.INSTANCE.m1626getHoverContainerElevationD9Ej5fM() : f12;
        float fM1624getDisabledContainerElevationD9Ej5fM = (i11 & 16) != 0 ? ElevatedButtonTokens.INSTANCE.m1624getDisabledContainerElevationD9Ej5fM() : f13;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1065482445, i10, -1, "androidx.compose.material3.ButtonDefaults.elevatedButtonElevation (Button.kt:705)");
        }
        ButtonElevation buttonElevation = new ButtonElevation(fM1622getContainerElevationD9Ej5fM, fM1628getPressedContainerElevationD9Ej5fM, fM1625getFocusContainerElevationD9Ej5fM, fM1626getHoverContainerElevationD9Ej5fM, fM1624getDisabledContainerElevationD9Ej5fM, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return buttonElevation;
    }

    @Composable
    @NotNull
    /* JADX INFO: renamed from: filledTonalButtonColors-ro_MJ88, reason: not valid java name */
    public final ButtonColors m932filledTonalButtonColorsro_MJ88(long j10, long j11, long j12, long j13, @Nullable Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(1670757653);
        long color = (i11 & 1) != 0 ? ColorSchemeKt.toColor(FilledTonalButtonTokens.INSTANCE.getContainerColor(), composer, 6) : j10;
        long color2 = (i11 & 2) != 0 ? ColorSchemeKt.toColor(FilledTonalButtonTokens.INSTANCE.getLabelTextColor(), composer, 6) : j11;
        long jM2507copywmQWz5c$default = (i11 & 4) != 0 ? Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(FilledTonalButtonTokens.INSTANCE.getDisabledContainerColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j12;
        long jM2507copywmQWz5c$default2 = (i11 & 8) != 0 ? Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(FilledTonalButtonTokens.INSTANCE.getDisabledLabelTextColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j13;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1670757653, i10, -1, "androidx.compose.material3.ButtonDefaults.filledTonalButtonColors (Button.kt:603)");
        }
        ButtonColors buttonColors = new ButtonColors(color, color2, jM2507copywmQWz5c$default, jM2507copywmQWz5c$default2, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return buttonColors;
    }

    @Composable
    @NotNull
    /* JADX INFO: renamed from: filledTonalButtonElevation-R_JCAzs, reason: not valid java name */
    public final ButtonElevation m933filledTonalButtonElevationR_JCAzs(float f6, float f10, float f11, float f12, float f13, @Nullable Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(5982871);
        float fM1729getContainerElevationD9Ej5fM = (i11 & 1) != 0 ? FilledTonalButtonTokens.INSTANCE.m1729getContainerElevationD9Ej5fM() : f6;
        float fM1735getPressedContainerElevationD9Ej5fM = (i11 & 2) != 0 ? FilledTonalButtonTokens.INSTANCE.m1735getPressedContainerElevationD9Ej5fM() : f10;
        float fM1732getFocusContainerElevationD9Ej5fM = (i11 & 4) != 0 ? FilledTonalButtonTokens.INSTANCE.m1732getFocusContainerElevationD9Ej5fM() : f11;
        float fM1733getHoverContainerElevationD9Ej5fM = (i11 & 8) != 0 ? FilledTonalButtonTokens.INSTANCE.m1733getHoverContainerElevationD9Ej5fM() : f12;
        float fM4389constructorimpl = (i11 & 16) != 0 ? Dp.m4389constructorimpl(0) : f13;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(5982871, i10, -1, "androidx.compose.material3.ButtonDefaults.filledTonalButtonElevation (Button.kt:732)");
        }
        ButtonElevation buttonElevation = new ButtonElevation(fM1729getContainerElevationD9Ej5fM, fM1735getPressedContainerElevationD9Ej5fM, fM1732getFocusContainerElevationD9Ej5fM, fM1733getHoverContainerElevationD9Ej5fM, fM4389constructorimpl, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return buttonElevation;
    }

    @NotNull
    public final PaddingValues getButtonWithIconContentPadding() {
        return ButtonWithIconContentPadding;
    }

    @NotNull
    public final PaddingValues getContentPadding() {
        return ContentPadding;
    }

    @Composable
    @JvmName(name = "getElevatedShape")
    @NotNull
    public final Shape getElevatedShape(@Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(2143958791);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2143958791, i10, -1, "androidx.compose.material3.ButtonDefaults.<get-elevatedShape> (Button.kt:531)");
        }
        Shape shape = ShapesKt.toShape(ElevatedButtonTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }

    @Composable
    @JvmName(name = "getFilledTonalShape")
    @NotNull
    public final Shape getFilledTonalShape(@Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(-886584987);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-886584987, i10, -1, "androidx.compose.material3.ButtonDefaults.<get-filledTonalShape> (Button.kt:534)");
        }
        Shape shape = ShapesKt.toShape(FilledTonalButtonTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }

    /* JADX INFO: renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m934getIconSizeD9Ej5fM() {
        return IconSize;
    }

    /* JADX INFO: renamed from: getIconSpacing-D9Ej5fM, reason: not valid java name */
    public final float m935getIconSpacingD9Ej5fM() {
        return IconSpacing;
    }

    /* JADX INFO: renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m936getMinHeightD9Ej5fM() {
        return MinHeight;
    }

    /* JADX INFO: renamed from: getMinWidth-D9Ej5fM, reason: not valid java name */
    public final float m937getMinWidthD9Ej5fM() {
        return MinWidth;
    }

    @Composable
    @JvmName(name = "getOutlinedButtonBorder")
    @NotNull
    public final BorderStroke getOutlinedButtonBorder(@Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(-563957672);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-563957672, i10, -1, "androidx.compose.material3.ButtonDefaults.<get-outlinedButtonBorder> (Button.kt:749)");
        }
        OutlinedButtonTokens outlinedButtonTokens = OutlinedButtonTokens.INSTANCE;
        BorderStroke borderStrokeM142BorderStrokecXLIe8U = BorderStrokeKt.m142BorderStrokecXLIe8U(outlinedButtonTokens.m1814getOutlineWidthD9Ej5fM(), ColorSchemeKt.toColor(outlinedButtonTokens.getOutlineColor(), composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return borderStrokeM142BorderStrokecXLIe8U;
    }

    @Composable
    @JvmName(name = "getOutlinedShape")
    @NotNull
    public final Shape getOutlinedShape(@Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(-2045213065);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2045213065, i10, -1, "androidx.compose.material3.ButtonDefaults.<get-outlinedShape> (Button.kt:537)");
        }
        Shape shape = ShapesKt.toShape(OutlinedButtonTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }

    @Composable
    @JvmName(name = "getShape")
    @NotNull
    public final Shape getShape(@Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(-1234923021);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1234923021, i10, -1, "androidx.compose.material3.ButtonDefaults.<get-shape> (Button.kt:528)");
        }
        Shape shape = ShapesKt.toShape(FilledButtonTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }

    @NotNull
    public final PaddingValues getTextButtonContentPadding() {
        return TextButtonContentPadding;
    }

    @NotNull
    public final PaddingValues getTextButtonWithIconContentPadding() {
        return TextButtonWithIconContentPadding;
    }

    @Composable
    @JvmName(name = "getTextShape")
    @NotNull
    public final Shape getTextShape(@Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(-349121587);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-349121587, i10, -1, "androidx.compose.material3.ButtonDefaults.<get-textShape> (Button.kt:540)");
        }
        Shape shape = ShapesKt.toShape(TextButtonTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }

    @Composable
    @NotNull
    /* JADX INFO: renamed from: outlinedButtonColors-ro_MJ88, reason: not valid java name */
    public final ButtonColors m938outlinedButtonColorsro_MJ88(long j10, long j11, long j12, long j13, @Nullable Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(-1778526249);
        long jM2543getTransparent0d7_KjU = (i11 & 1) != 0 ? Color.INSTANCE.m2543getTransparent0d7_KjU() : j10;
        long color = (i11 & 2) != 0 ? ColorSchemeKt.toColor(OutlinedButtonTokens.INSTANCE.getLabelTextColor(), composer, 6) : j11;
        long jM2543getTransparent0d7_KjU2 = (i11 & 4) != 0 ? Color.INSTANCE.m2543getTransparent0d7_KjU() : j12;
        long jM2507copywmQWz5c$default = (i11 & 8) != 0 ? Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedButtonTokens.INSTANCE.getDisabledLabelTextColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j13;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1778526249, i10, -1, "androidx.compose.material3.ButtonDefaults.outlinedButtonColors (Button.kt:629)");
        }
        ButtonColors buttonColors = new ButtonColors(jM2543getTransparent0d7_KjU, color, jM2543getTransparent0d7_KjU2, jM2507copywmQWz5c$default, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return buttonColors;
    }

    @Composable
    @NotNull
    /* JADX INFO: renamed from: textButtonColors-ro_MJ88, reason: not valid java name */
    public final ButtonColors m939textButtonColorsro_MJ88(long j10, long j11, long j12, long j13, @Nullable Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(-1402274782);
        long jM2543getTransparent0d7_KjU = (i11 & 1) != 0 ? Color.INSTANCE.m2543getTransparent0d7_KjU() : j10;
        long color = (i11 & 2) != 0 ? ColorSchemeKt.toColor(TextButtonTokens.INSTANCE.getLabelTextColor(), composer, 6) : j11;
        long jM2543getTransparent0d7_KjU2 = (i11 & 4) != 0 ? Color.INSTANCE.m2543getTransparent0d7_KjU() : j12;
        long jM2507copywmQWz5c$default = (i11 & 8) != 0 ? Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(TextButtonTokens.INSTANCE.getDisabledLabelTextColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j13;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1402274782, i10, -1, "androidx.compose.material3.ButtonDefaults.textButtonColors (Button.kt:653)");
        }
        ButtonColors buttonColors = new ButtonColors(jM2543getTransparent0d7_KjU, color, jM2543getTransparent0d7_KjU2, jM2507copywmQWz5c$default, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return buttonColors;
    }
}
