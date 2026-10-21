package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Button.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b<\u0010=J3\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJG\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ=\u0010\u0016\u001a\u00020\u00132\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u000eH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015J3\u0010\u0019\u001a\u00020\u00132\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u000eH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018J3\u0010\u001b\u001a\u00020\u00132\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u000eH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u0018R\u0017\u0010!\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R \u0010&\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R \u0010)\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b(\u0010%R \u0010,\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b*\u0010#\u001a\u0004\b+\u0010%R \u0010/\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b-\u0010#\u001a\u0004\b.\u0010%R\u0014\u00101\u001a\u0002008\u0006X\u0086T¢\u0006\u0006\n\u0004\b1\u0010#R \u00104\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b2\u0010#\u001a\u0004\b3\u0010%R\u0017\u00107\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b5\u0010\u001e\u001a\u0004\b6\u0010 R\u0011\u0010;\u001a\u0002088G¢\u0006\u0006\u001a\u0004\b9\u0010:\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006>"}, d2 = {"Landroidx/compose/material/ButtonDefaults;", "", "Landroidx/compose/ui/unit/Dp;", "defaultElevation", "pressedElevation", "disabledElevation", "Landroidx/compose/material/ButtonElevation;", "elevation-yajeYGU", "(FFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/ButtonElevation;", "elevation", "hoveredElevation", "focusedElevation", "elevation-R_JCAzs", "(FFFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/ButtonElevation;", "Landroidx/compose/ui/graphics/Color;", "backgroundColor", "contentColor", "disabledBackgroundColor", "disabledContentColor", "Landroidx/compose/material/ButtonColors;", "buttonColors-ro_MJ88", "(JJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/ButtonColors;", "buttonColors", "outlinedButtonColors-RGew2ao", "(JJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/ButtonColors;", "outlinedButtonColors", "textButtonColors-RGew2ao", "textButtonColors", "Landroidx/compose/foundation/layout/PaddingValues;", "a", "Landroidx/compose/foundation/layout/PaddingValues;", "getContentPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "ContentPadding", "b", "F", "getMinWidth-D9Ej5fM", "()F", "MinWidth", "c", "getMinHeight-D9Ej5fM", "MinHeight", "d", "getIconSize-D9Ej5fM", "IconSize", "e", "getIconSpacing-D9Ej5fM", "IconSpacing", "", "OutlinedBorderOpacity", "f", "getOutlinedBorderSize-D9Ej5fM", "OutlinedBorderSize", "g", "getTextButtonContentPadding", "TextButtonContentPadding", "Landroidx/compose/foundation/BorderStroke;", "getOutlinedBorder", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/BorderStroke;", "outlinedBorder", "<init>", "()V", "material_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Button.kt\nandroidx/compose/material/ButtonDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,618:1\n154#2:619\n154#2:620\n154#2:621\n154#2:622\n154#2:623\n154#2:624\n154#2:625\n154#2:626\n154#2:627\n154#2:628\n154#2:638\n154#2:639\n154#2:640\n154#2:641\n154#2:642\n154#2:643\n154#2:644\n154#2:645\n83#3,3:629\n1097#4,6:632\n*S KotlinDebug\n*F\n+ 1 Button.kt\nandroidx/compose/material/ButtonDefaults\n*L\n347#1:619\n348#1:620\n349#1:621\n354#1:622\n355#1:623\n373#1:624\n374#1:625\n375#1:626\n376#1:627\n377#1:628\n295#1:638\n296#1:639\n312#1:640\n318#1:641\n325#1:642\n332#1:643\n470#1:644\n481#1:645\n379#1:629,3\n379#1:632,6\n*E\n"})
public final class ButtonDefaults {
    public static final int $stable = 0;

    @NotNull
    public static final ButtonDefaults INSTANCE = new ButtonDefaults();
    public static final float OutlinedBorderOpacity = 0.12f;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final PaddingValues ContentPadding;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final float MinWidth;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final float MinHeight;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final float IconSize;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final float IconSpacing;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final float OutlinedBorderSize;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final PaddingValues TextButtonContentPadding;

    static {
        float fM4389constructorimpl = Dp.m4389constructorimpl(16);
        float f6 = 8;
        float fM4389constructorimpl2 = Dp.m4389constructorimpl(f6);
        PaddingValues paddingValuesM292PaddingValuesa9UjIt4 = PaddingKt.m292PaddingValuesa9UjIt4(fM4389constructorimpl, fM4389constructorimpl2, fM4389constructorimpl, fM4389constructorimpl2);
        ContentPadding = paddingValuesM292PaddingValuesa9UjIt4;
        MinWidth = Dp.m4389constructorimpl(64);
        MinHeight = Dp.m4389constructorimpl(36);
        IconSize = Dp.m4389constructorimpl(18);
        IconSpacing = Dp.m4389constructorimpl(f6);
        OutlinedBorderSize = Dp.m4389constructorimpl(1);
        float fM4389constructorimpl3 = Dp.m4389constructorimpl(f6);
        TextButtonContentPadding = PaddingKt.m292PaddingValuesa9UjIt4(fM4389constructorimpl3, paddingValuesM292PaddingValuesa9UjIt4.getTop(), fM4389constructorimpl3, paddingValuesM292PaddingValuesa9UjIt4.getBottom());
    }

    @Composable
    @NotNull
    /* JADX INFO: renamed from: buttonColors-ro_MJ88, reason: not valid java name */
    public final ButtonColors m680buttonColorsro_MJ88(long j10, long j11, long j12, long j13, @Nullable Composer composer, int i10, int i11) {
        long jM2553compositeOverOWjLjI;
        composer.startReplaceableGroup(1870371134);
        long jM713getPrimary0d7_KjU = (i11 & 1) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m713getPrimary0d7_KjU() : j10;
        long jM731contentColorForek8zF_U = (i11 & 2) != 0 ? ColorsKt.m731contentColorForek8zF_U(jM713getPrimary0d7_KjU, composer, i10 & 14) : j11;
        if ((i11 & 4) != 0) {
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            jM2553compositeOverOWjLjI = ColorKt.m2553compositeOverOWjLjI(Color.m2507copywmQWz5c$default(materialTheme.getColors(composer, 6).m712getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), materialTheme.getColors(composer, 6).m717getSurface0d7_KjU());
        } else {
            jM2553compositeOverOWjLjI = j12;
        }
        long jM2507copywmQWz5c$default = (i11 & 8) != 0 ? Color.m2507copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m712getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j13;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1870371134, i10, -1, "androidx.compose.material.ButtonDefaults.buttonColors (Button.kt:405)");
        }
        h0.e0 e0Var = new h0.e0(jM713getPrimary0d7_KjU, jM731contentColorForek8zF_U, jM2553compositeOverOWjLjI, jM2507copywmQWz5c$default);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return e0Var;
    }

    @Composable
    @NotNull
    /* JADX INFO: renamed from: elevation-R_JCAzs, reason: not valid java name */
    public final ButtonElevation m681elevationR_JCAzs(float f6, float f10, float f11, float f12, float f13, @Nullable Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(-737170518);
        float fM4389constructorimpl = (i11 & 1) != 0 ? Dp.m4389constructorimpl(2) : f6;
        float fM4389constructorimpl2 = (i11 & 2) != 0 ? Dp.m4389constructorimpl(8) : f10;
        float fM4389constructorimpl3 = (i11 & 4) != 0 ? Dp.m4389constructorimpl(0) : f11;
        float fM4389constructorimpl4 = (i11 & 8) != 0 ? Dp.m4389constructorimpl(4) : f12;
        float fM4389constructorimpl5 = (i11 & 16) != 0 ? Dp.m4389constructorimpl(4) : f13;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-737170518, i10, -1, "androidx.compose.material.ButtonDefaults.elevation (Button.kt:371)");
        }
        Object[] objArr = {Dp.m4387boximpl(fM4389constructorimpl), Dp.m4387boximpl(fM4389constructorimpl2), Dp.m4387boximpl(fM4389constructorimpl3), Dp.m4387boximpl(fM4389constructorimpl4), Dp.m4387boximpl(fM4389constructorimpl5)};
        composer.startReplaceableGroup(-568225417);
        boolean zChanged = false;
        for (int i12 = 0; i12 < 5; i12++) {
            zChanged |= composer.changed(objArr[i12]);
        }
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new h0.f0(fM4389constructorimpl, fM4389constructorimpl2, fM4389constructorimpl3, fM4389constructorimpl4, fM4389constructorimpl5);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        h0.f0 f0Var = (h0.f0) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return f0Var;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use another overload of elevation")
    @Composable
    /* JADX INFO: renamed from: elevation-yajeYGU, reason: not valid java name */
    public final /* synthetic */ ButtonElevation m682elevationyajeYGU(float f6, float f10, float f11, Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(1428576874);
        float fM4389constructorimpl = (i11 & 1) != 0 ? Dp.m4389constructorimpl(2) : f6;
        float fM4389constructorimpl2 = (i11 & 2) != 0 ? Dp.m4389constructorimpl(8) : f10;
        float fM4389constructorimpl3 = (i11 & 4) != 0 ? Dp.m4389constructorimpl(0) : f11;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1428576874, i10, -1, "androidx.compose.material.ButtonDefaults.elevation (Button.kt:345)");
        }
        float f12 = 4;
        ButtonElevation buttonElevationM681elevationR_JCAzs = m681elevationR_JCAzs(fM4389constructorimpl, fM4389constructorimpl2, fM4389constructorimpl3, Dp.m4389constructorimpl(f12), Dp.m4389constructorimpl(f12), composer, (i10 & 14) | 27648 | (i10 & 112) | (i10 & 896) | ((i10 << 6) & 458752), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return buttonElevationM681elevationR_JCAzs;
    }

    @NotNull
    public final PaddingValues getContentPadding() {
        return ContentPadding;
    }

    /* JADX INFO: renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m683getIconSizeD9Ej5fM() {
        return IconSize;
    }

    /* JADX INFO: renamed from: getIconSpacing-D9Ej5fM, reason: not valid java name */
    public final float m684getIconSpacingD9Ej5fM() {
        return IconSpacing;
    }

    /* JADX INFO: renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m685getMinHeightD9Ej5fM() {
        return MinHeight;
    }

    /* JADX INFO: renamed from: getMinWidth-D9Ej5fM, reason: not valid java name */
    public final float m686getMinWidthD9Ej5fM() {
        return MinWidth;
    }

    @Composable
    @JvmName(name = "getOutlinedBorder")
    @NotNull
    public final BorderStroke getOutlinedBorder(@Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(-2091313033);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2091313033, i10, -1, "androidx.compose.material.ButtonDefaults.<get-outlinedBorder> (Button.kt:476)");
        }
        BorderStroke borderStrokeM142BorderStrokecXLIe8U = BorderStrokeKt.m142BorderStrokecXLIe8U(OutlinedBorderSize, Color.m2507copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m712getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return borderStrokeM142BorderStrokecXLIe8U;
    }

    /* JADX INFO: renamed from: getOutlinedBorderSize-D9Ej5fM, reason: not valid java name */
    public final float m687getOutlinedBorderSizeD9Ej5fM() {
        return OutlinedBorderSize;
    }

    @NotNull
    public final PaddingValues getTextButtonContentPadding() {
        return TextButtonContentPadding;
    }

    @Composable
    @NotNull
    /* JADX INFO: renamed from: outlinedButtonColors-RGew2ao, reason: not valid java name */
    public final ButtonColors m688outlinedButtonColorsRGew2ao(long j10, long j11, long j12, @Nullable Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(-2124406093);
        long jM717getSurface0d7_KjU = (i11 & 1) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m717getSurface0d7_KjU() : j10;
        long jM713getPrimary0d7_KjU = (i11 & 2) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m713getPrimary0d7_KjU() : j11;
        long jM2507copywmQWz5c$default = (i11 & 4) != 0 ? Color.m2507copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m712getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j12;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2124406093, i10, -1, "androidx.compose.material.ButtonDefaults.outlinedButtonColors (Button.kt:428)");
        }
        h0.e0 e0Var = new h0.e0(jM717getSurface0d7_KjU, jM713getPrimary0d7_KjU, jM717getSurface0d7_KjU, jM2507copywmQWz5c$default);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return e0Var;
    }

    @Composable
    @NotNull
    /* JADX INFO: renamed from: textButtonColors-RGew2ao, reason: not valid java name */
    public final ButtonColors m689textButtonColorsRGew2ao(long j10, long j11, long j12, @Nullable Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(182742216);
        long jM2543getTransparent0d7_KjU = (i11 & 1) != 0 ? Color.INSTANCE.m2543getTransparent0d7_KjU() : j10;
        long jM713getPrimary0d7_KjU = (i11 & 2) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m713getPrimary0d7_KjU() : j11;
        long jM2507copywmQWz5c$default = (i11 & 4) != 0 ? Color.m2507copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m712getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j12;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(182742216, i10, -1, "androidx.compose.material.ButtonDefaults.textButtonColors (Button.kt:449)");
        }
        h0.e0 e0Var = new h0.e0(jM2543getTransparent0d7_KjU, jM713getPrimary0d7_KjU, jM2543getTransparent0d7_KjU, jM2507copywmQWz5c$default);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return e0Var;
    }
}
