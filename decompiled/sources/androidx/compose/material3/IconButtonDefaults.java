package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.material3.tokens.FilledIconButtonTokens;
import androidx.compose.material3.tokens.FilledTonalIconButtonTokens;
import androidx.compose.material3.tokens.IconButtonTokens;
import androidx.compose.material3.tokens.OutlinedIconButtonTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: IconButton.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J=\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\fH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011JQ\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0014\u001a\u00020\f2\b\b\u0002\u0010\u0015\u001a\u00020\fH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017J=\u0010\u0018\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\fH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u0011JQ\u0010\u001a\u001a\u00020\u00132\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0014\u001a\u00020\f2\b\b\u0002\u0010\u0015\u001a\u00020\fH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u0017J=\u0010\u001c\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\fH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u0011JQ\u0010\u001e\u001a\u00020\u00132\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0014\u001a\u00020\f2\b\b\u0002\u0010\u0015\u001a\u00020\fH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010\u0017J\u0015\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0007¢\u0006\u0002\u0010$J=\u0010%\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\fH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010\u0011J\u001f\u0010'\u001a\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010(\u001a\u00020#H\u0007¢\u0006\u0002\u0010)JQ\u0010*\u001a\u00020\u00132\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0014\u001a\u00020\f2\b\b\u0002\u0010\u0015\u001a\u00020\fH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b+\u0010\u0017R\u0011\u0010\u0003\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006,"}, d2 = {"Landroidx/compose/material3/IconButtonDefaults;", "", "()V", "filledShape", "Landroidx/compose/ui/graphics/Shape;", "getFilledShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "outlinedShape", "getOutlinedShape", "filledIconButtonColors", "Landroidx/compose/material3/IconButtonColors;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "disabledContainerColor", "disabledContentColor", "filledIconButtonColors-ro_MJ88", "(JJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/IconButtonColors;", "filledIconToggleButtonColors", "Landroidx/compose/material3/IconToggleButtonColors;", "checkedContainerColor", "checkedContentColor", "filledIconToggleButtonColors-5tl4gsc", "(JJJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/IconToggleButtonColors;", "filledTonalIconButtonColors", "filledTonalIconButtonColors-ro_MJ88", "filledTonalIconToggleButtonColors", "filledTonalIconToggleButtonColors-5tl4gsc", "iconButtonColors", "iconButtonColors-ro_MJ88", "iconToggleButtonColors", "iconToggleButtonColors-5tl4gsc", "outlinedIconButtonBorder", "Landroidx/compose/foundation/BorderStroke;", "enabled", "", "(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/BorderStroke;", "outlinedIconButtonColors", "outlinedIconButtonColors-ro_MJ88", "outlinedIconToggleButtonBorder", "checked", "(ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/BorderStroke;", "outlinedIconToggleButtonColors", "outlinedIconToggleButtonColors-5tl4gsc", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nIconButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IconButton.kt\nandroidx/compose/material3/IconButtonDefaults\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,935:1\n76#2:936\n76#2:937\n76#2:938\n76#2:939\n76#2:940\n76#2:941\n36#3:942\n1114#4,6:943\n*S KotlinDebug\n*F\n+ 1 IconButton.kt\nandroidx/compose/material3/IconButtonDefaults\n*L\n556#1:936\n582#1:937\n724#1:938\n750#1:939\n790#1:940\n792#1:941\n795#1:942\n795#1:943,6\n*E\n"})
public final class IconButtonDefaults {
    public static final int $stable = 0;

    @NotNull
    public static final IconButtonDefaults INSTANCE = new IconButtonDefaults();

    @Composable
    @NotNull
    /* JADX INFO: renamed from: filledIconButtonColors-ro_MJ88, reason: not valid java name */
    public final IconButtonColors m1130filledIconButtonColorsro_MJ88(long j10, long j11, long j12, long j13, @Nullable Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(-669858473);
        long color = (i11 & 1) != 0 ? ColorSchemeKt.toColor(FilledIconButtonTokens.INSTANCE.getContainerColor(), composer, 6) : j10;
        long jM1014contentColorForek8zF_U = (i11 & 2) != 0 ? ColorSchemeKt.m1014contentColorForek8zF_U(color, composer, i10 & 14) : j11;
        long jM2507copywmQWz5c$default = (i11 & 4) != 0 ? Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(FilledIconButtonTokens.INSTANCE.getDisabledContainerColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j12;
        long jM2507copywmQWz5c$default2 = (i11 & 8) != 0 ? Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(FilledIconButtonTokens.INSTANCE.getDisabledColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j13;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-669858473, i10, -1, "androidx.compose.material3.IconButtonDefaults.filledIconButtonColors (IconButton.kt:606)");
        }
        IconButtonColors iconButtonColors = new IconButtonColors(color, jM1014contentColorForek8zF_U, jM2507copywmQWz5c$default, jM2507copywmQWz5c$default2, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return iconButtonColors;
    }

    @Composable
    @NotNull
    /* JADX INFO: renamed from: filledIconToggleButtonColors-5tl4gsc, reason: not valid java name */
    public final IconToggleButtonColors m1131filledIconToggleButtonColors5tl4gsc(long j10, long j11, long j12, long j13, long j14, long j15, @Nullable Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(1887173701);
        long color = (i11 & 1) != 0 ? ColorSchemeKt.toColor(FilledIconButtonTokens.INSTANCE.getUnselectedContainerColor(), composer, 6) : j10;
        long color2 = (i11 & 2) != 0 ? ColorSchemeKt.toColor(FilledIconButtonTokens.INSTANCE.getToggleUnselectedColor(), composer, 6) : j11;
        long jM2507copywmQWz5c$default = (i11 & 4) != 0 ? Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(FilledIconButtonTokens.INSTANCE.getDisabledContainerColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j12;
        long jM2507copywmQWz5c$default2 = (i11 & 8) != 0 ? Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(FilledIconButtonTokens.INSTANCE.getDisabledColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j13;
        long color3 = (i11 & 16) != 0 ? ColorSchemeKt.toColor(FilledIconButtonTokens.INSTANCE.getSelectedContainerColor(), composer, 6) : j14;
        long jM1014contentColorForek8zF_U = (i11 & 32) != 0 ? ColorSchemeKt.m1014contentColorForek8zF_U(color3, composer, (i10 >> 12) & 14) : j15;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1887173701, i10, -1, "androidx.compose.material3.IconButtonDefaults.filledIconToggleButtonColors (IconButton.kt:633)");
        }
        IconToggleButtonColors iconToggleButtonColors = new IconToggleButtonColors(color, color2, jM2507copywmQWz5c$default, jM2507copywmQWz5c$default2, color3, jM1014contentColorForek8zF_U, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return iconToggleButtonColors;
    }

    @Composable
    @NotNull
    /* JADX INFO: renamed from: filledTonalIconButtonColors-ro_MJ88, reason: not valid java name */
    public final IconButtonColors m1132filledTonalIconButtonColorsro_MJ88(long j10, long j11, long j12, long j13, @Nullable Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(-18532843);
        long color = (i11 & 1) != 0 ? ColorSchemeKt.toColor(FilledTonalIconButtonTokens.INSTANCE.getContainerColor(), composer, 6) : j10;
        long jM1014contentColorForek8zF_U = (i11 & 2) != 0 ? ColorSchemeKt.m1014contentColorForek8zF_U(color, composer, i10 & 14) : j11;
        long jM2507copywmQWz5c$default = (i11 & 4) != 0 ? Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(FilledTonalIconButtonTokens.INSTANCE.getDisabledContainerColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j12;
        long jM2507copywmQWz5c$default2 = (i11 & 8) != 0 ? Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(FilledTonalIconButtonTokens.INSTANCE.getDisabledColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j13;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-18532843, i10, -1, "androidx.compose.material3.IconButtonDefaults.filledTonalIconButtonColors (IconButton.kt:664)");
        }
        IconButtonColors iconButtonColors = new IconButtonColors(color, jM1014contentColorForek8zF_U, jM2507copywmQWz5c$default, jM2507copywmQWz5c$default2, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return iconButtonColors;
    }

    @Composable
    @NotNull
    /* JADX INFO: renamed from: filledTonalIconToggleButtonColors-5tl4gsc, reason: not valid java name */
    public final IconToggleButtonColors m1133filledTonalIconToggleButtonColors5tl4gsc(long j10, long j11, long j12, long j13, long j14, long j15, @Nullable Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(-19426557);
        long color = (i11 & 1) != 0 ? ColorSchemeKt.toColor(FilledTonalIconButtonTokens.INSTANCE.getUnselectedContainerColor(), composer, 6) : j10;
        long jM1014contentColorForek8zF_U = (i11 & 2) != 0 ? ColorSchemeKt.m1014contentColorForek8zF_U(color, composer, i10 & 14) : j11;
        long jM2507copywmQWz5c$default = (i11 & 4) != 0 ? Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(FilledTonalIconButtonTokens.INSTANCE.getDisabledContainerColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j12;
        long jM2507copywmQWz5c$default2 = (i11 & 8) != 0 ? Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(FilledTonalIconButtonTokens.INSTANCE.getDisabledColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j13;
        long color2 = (i11 & 16) != 0 ? ColorSchemeKt.toColor(FilledTonalIconButtonTokens.INSTANCE.getSelectedContainerColor(), composer, 6) : j14;
        long color3 = (i11 & 32) != 0 ? ColorSchemeKt.toColor(FilledTonalIconButtonTokens.INSTANCE.getToggleSelectedColor(), composer, 6) : j15;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-19426557, i10, -1, "androidx.compose.material3.IconButtonDefaults.filledTonalIconToggleButtonColors (IconButton.kt:691)");
        }
        IconToggleButtonColors iconToggleButtonColors = new IconToggleButtonColors(color, jM1014contentColorForek8zF_U, jM2507copywmQWz5c$default, jM2507copywmQWz5c$default2, color2, color3, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return iconToggleButtonColors;
    }

    @Composable
    @JvmName(name = "getFilledShape")
    @NotNull
    public final Shape getFilledShape(@Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(1265841879);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1265841879, i10, -1, "androidx.compose.material3.IconButtonDefaults.<get-filledShape> (IconButton.kt:537)");
        }
        Shape shape = ShapesKt.toShape(FilledIconButtonTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }

    @Composable
    @JvmName(name = "getOutlinedShape")
    @NotNull
    public final Shape getOutlinedShape(@Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(1327125527);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1327125527, i10, -1, "androidx.compose.material3.IconButtonDefaults.<get-outlinedShape> (IconButton.kt:541)");
        }
        Shape shape = ShapesKt.toShape(OutlinedIconButtonTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }

    @Composable
    @NotNull
    /* JADX INFO: renamed from: iconButtonColors-ro_MJ88, reason: not valid java name */
    public final IconButtonColors m1134iconButtonColorsro_MJ88(long j10, long j11, long j12, long j13, @Nullable Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(999008085);
        long jM2543getTransparent0d7_KjU = (i11 & 1) != 0 ? Color.INSTANCE.m2543getTransparent0d7_KjU() : j10;
        long jM2518unboximpl = (i11 & 2) != 0 ? ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl() : j11;
        long jM2543getTransparent0d7_KjU2 = (i11 & 4) != 0 ? Color.INSTANCE.m2543getTransparent0d7_KjU() : j12;
        long jM2507copywmQWz5c$default = (i11 & 8) != 0 ? Color.m2507copywmQWz5c$default(jM2518unboximpl, 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j13;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(999008085, i10, -1, "androidx.compose.material3.IconButtonDefaults.iconButtonColors (IconButton.kt:553)");
        }
        IconButtonColors iconButtonColors = new IconButtonColors(jM2543getTransparent0d7_KjU, jM2518unboximpl, jM2543getTransparent0d7_KjU2, jM2507copywmQWz5c$default, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return iconButtonColors;
    }

    @Composable
    @NotNull
    /* JADX INFO: renamed from: iconToggleButtonColors-5tl4gsc, reason: not valid java name */
    public final IconToggleButtonColors m1135iconToggleButtonColors5tl4gsc(long j10, long j11, long j12, long j13, long j14, long j15, @Nullable Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(-2020719549);
        long jM2543getTransparent0d7_KjU = (i11 & 1) != 0 ? Color.INSTANCE.m2543getTransparent0d7_KjU() : j10;
        long jM2518unboximpl = (i11 & 2) != 0 ? ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl() : j11;
        long jM2543getTransparent0d7_KjU2 = (i11 & 4) != 0 ? Color.INSTANCE.m2543getTransparent0d7_KjU() : j12;
        long jM2507copywmQWz5c$default = (i11 & 8) != 0 ? Color.m2507copywmQWz5c$default(jM2518unboximpl, 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j13;
        long jM2543getTransparent0d7_KjU3 = (i11 & 16) != 0 ? Color.INSTANCE.m2543getTransparent0d7_KjU() : j14;
        long color = (i11 & 32) != 0 ? ColorSchemeKt.toColor(IconButtonTokens.INSTANCE.getSelectedIconColor(), composer, 6) : j15;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2020719549, i10, -1, "androidx.compose.material3.IconButtonDefaults.iconToggleButtonColors (IconButton.kt:579)");
        }
        IconToggleButtonColors iconToggleButtonColors = new IconToggleButtonColors(jM2543getTransparent0d7_KjU, jM2518unboximpl, jM2543getTransparent0d7_KjU2, jM2507copywmQWz5c$default, jM2543getTransparent0d7_KjU3, color, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return iconToggleButtonColors;
    }

    @Composable
    @NotNull
    public final BorderStroke outlinedIconButtonBorder(boolean z10, @Nullable Composer composer, int i10) {
        long jM2507copywmQWz5c$default;
        composer.startReplaceableGroup(-511461558);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-511461558, i10, -1, "androidx.compose.material3.IconButtonDefaults.outlinedIconButtonBorder (IconButton.kt:787)");
        }
        if (z10) {
            composer.startReplaceableGroup(1252615214);
            jM2507copywmQWz5c$default = ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(1252615269);
            jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(((Color) composer.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
            composer.endReplaceableGroup();
        }
        Color colorM2498boximpl = Color.m2498boximpl(jM2507copywmQWz5c$default);
        composer.startReplaceableGroup(1157296644);
        boolean zChanged = composer.changed(colorM2498boximpl);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = BorderStrokeKt.m142BorderStrokecXLIe8U(OutlinedIconButtonTokens.INSTANCE.m1825getUnselectedOutlineWidthD9Ej5fM(), jM2507copywmQWz5c$default);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        BorderStroke borderStroke = (BorderStroke) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return borderStroke;
    }

    @Composable
    @NotNull
    /* JADX INFO: renamed from: outlinedIconButtonColors-ro_MJ88, reason: not valid java name */
    public final IconButtonColors m1136outlinedIconButtonColorsro_MJ88(long j10, long j11, long j12, long j13, @Nullable Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(-1030517545);
        long jM2543getTransparent0d7_KjU = (i11 & 1) != 0 ? Color.INSTANCE.m2543getTransparent0d7_KjU() : j10;
        long jM2518unboximpl = (i11 & 2) != 0 ? ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl() : j11;
        long jM2543getTransparent0d7_KjU2 = (i11 & 4) != 0 ? Color.INSTANCE.m2543getTransparent0d7_KjU() : j12;
        long jM2507copywmQWz5c$default = (i11 & 8) != 0 ? Color.m2507copywmQWz5c$default(jM2518unboximpl, 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j13;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1030517545, i10, -1, "androidx.compose.material3.IconButtonDefaults.outlinedIconButtonColors (IconButton.kt:721)");
        }
        IconButtonColors iconButtonColors = new IconButtonColors(jM2543getTransparent0d7_KjU, jM2518unboximpl, jM2543getTransparent0d7_KjU2, jM2507copywmQWz5c$default, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return iconButtonColors;
    }

    @Composable
    @Nullable
    public final BorderStroke outlinedIconToggleButtonBorder(boolean z10, boolean z11, @Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(1244729690);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1244729690, i10, -1, "androidx.compose.material3.IconButtonDefaults.outlinedIconToggleButtonBorder (IconButton.kt:774)");
        }
        if (z11) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return null;
        }
        BorderStroke borderStrokeOutlinedIconButtonBorder = outlinedIconButtonBorder(z10, composer, (i10 & 14) | ((i10 >> 3) & 112));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return borderStrokeOutlinedIconButtonBorder;
    }

    @Composable
    @NotNull
    /* JADX INFO: renamed from: outlinedIconToggleButtonColors-5tl4gsc, reason: not valid java name */
    public final IconToggleButtonColors m1137outlinedIconToggleButtonColors5tl4gsc(long j10, long j11, long j12, long j13, long j14, long j15, @Nullable Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(2130592709);
        long jM2543getTransparent0d7_KjU = (i11 & 1) != 0 ? Color.INSTANCE.m2543getTransparent0d7_KjU() : j10;
        long jM2518unboximpl = (i11 & 2) != 0 ? ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl() : j11;
        long jM2543getTransparent0d7_KjU2 = (i11 & 4) != 0 ? Color.INSTANCE.m2543getTransparent0d7_KjU() : j12;
        long jM2507copywmQWz5c$default = (i11 & 8) != 0 ? Color.m2507copywmQWz5c$default(jM2518unboximpl, 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j13;
        long color = (i11 & 16) != 0 ? ColorSchemeKt.toColor(OutlinedIconButtonTokens.INSTANCE.getSelectedContainerColor(), composer, 6) : j14;
        long jM1014contentColorForek8zF_U = (i11 & 32) != 0 ? ColorSchemeKt.m1014contentColorForek8zF_U(color, composer, (i10 >> 12) & 14) : j15;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2130592709, i10, -1, "androidx.compose.material3.IconButtonDefaults.outlinedIconToggleButtonColors (IconButton.kt:747)");
        }
        IconToggleButtonColors iconToggleButtonColors = new IconToggleButtonColors(jM2543getTransparent0d7_KjU, jM2518unboximpl, jM2543getTransparent0d7_KjU2, jM2507copywmQWz5c$default, color, jM1014contentColorForek8zF_U, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return iconToggleButtonColors;
    }
}
