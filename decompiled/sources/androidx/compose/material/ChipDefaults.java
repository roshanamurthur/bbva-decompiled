package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Chip.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b1\u00102JQ\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bJQ\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000bJo\u0010\u0017\u001a\u00020\u00142\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016Jo\u0010\u0019\u001a\u00020\u00142\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0016R \u0010\u001f\u001a\u00020\u001a8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020 8\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\u001cR\u0014\u0010\"\u001a\u00020 8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u001cR\u0014\u0010#\u001a\u00020 8\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010\u001cR \u0010&\u001a\u00020\u001a8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b$\u0010\u001c\u001a\u0004\b%\u0010\u001eR \u0010)\u001a\u00020\u001a8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b'\u0010\u001c\u001a\u0004\b(\u0010\u001eR \u0010,\u001a\u00020\u001a8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b*\u0010\u001c\u001a\u0004\b+\u0010\u001eR\u0011\u00100\u001a\u00020-8G¢\u0006\u0006\u001a\u0004\b.\u0010/\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u00063"}, d2 = {"Landroidx/compose/material/ChipDefaults;", "", "Landroidx/compose/ui/graphics/Color;", "backgroundColor", "contentColor", "leadingIconContentColor", "disabledBackgroundColor", "disabledContentColor", "disabledLeadingIconContentColor", "Landroidx/compose/material/ChipColors;", "chipColors-5tl4gsc", "(JJJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/ChipColors;", "chipColors", "outlinedChipColors-5tl4gsc", "outlinedChipColors", "leadingIconColor", "disabledLeadingIconColor", "selectedBackgroundColor", "selectedContentColor", "selectedLeadingIconColor", "Landroidx/compose/material/SelectableChipColors;", "filterChipColors-J08w3-E", "(JJJJJJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/SelectableChipColors;", "filterChipColors", "outlinedFilterChipColors-J08w3-E", "outlinedFilterChipColors", "Landroidx/compose/ui/unit/Dp;", "a", "F", "getMinHeight-D9Ej5fM", "()F", "MinHeight", "", "LeadingIconOpacity", "ContentOpacity", "OutlinedBorderOpacity", "b", "getOutlinedBorderSize-D9Ej5fM", "OutlinedBorderSize", "c", "getLeadingIconSize-D9Ej5fM", "LeadingIconSize", "d", "getSelectedIconSize-D9Ej5fM", "SelectedIconSize", "Landroidx/compose/foundation/BorderStroke;", "getOutlinedBorder", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/BorderStroke;", "outlinedBorder", "<init>", "()V", "material_release"}, k = 1, mv = {1, 8, 0})
@ExperimentalMaterialApi
@SourceDebugExtension({"SMAP\nChip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Chip.kt\nandroidx/compose/material/ChipDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,753:1\n154#2:754\n154#2:755\n154#2:756\n154#2:757\n*S KotlinDebug\n*F\n+ 1 Chip.kt\nandroidx/compose/material/ChipDefaults\n*L\n370#1:754\n565#1:755\n570#1:756\n575#1:757\n*E\n"})
public final class ChipDefaults {
    public static final int $stable = 0;
    public static final float ContentOpacity = 0.87f;
    public static final float LeadingIconOpacity = 0.54f;
    public static final float OutlinedBorderOpacity = 0.12f;

    @NotNull
    public static final ChipDefaults INSTANCE = new ChipDefaults();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final float MinHeight = Dp.m4389constructorimpl(32);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final float OutlinedBorderSize = Dp.m4389constructorimpl(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final float LeadingIconSize = Dp.m4389constructorimpl(20);

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final float SelectedIconSize = Dp.m4389constructorimpl(18);

    @Composable
    @NotNull
    /* JADX INFO: renamed from: chipColors-5tl4gsc, reason: not valid java name */
    public final ChipColors m696chipColors5tl4gsc(long j10, long j11, long j12, long j13, long j14, long j15, @Nullable Composer composer, int i10, int i11) {
        long jM2553compositeOverOWjLjI;
        long jM2553compositeOverOWjLjI2;
        long jM2507copywmQWz5c$default;
        long jM2507copywmQWz5c$default2;
        composer.startReplaceableGroup(1838505436);
        if ((i11 & 1) != 0) {
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            jM2553compositeOverOWjLjI = ColorKt.m2553compositeOverOWjLjI(Color.m2507copywmQWz5c$default(materialTheme.getColors(composer, 6).m712getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), materialTheme.getColors(composer, 6).m717getSurface0d7_KjU());
        } else {
            jM2553compositeOverOWjLjI = j10;
        }
        long jM2507copywmQWz5c$default3 = (i11 & 2) != 0 ? Color.m2507copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m712getOnSurface0d7_KjU(), 0.87f, 0.0f, 0.0f, 0.0f, 14, null) : j11;
        long jM2507copywmQWz5c$default4 = (i11 & 4) != 0 ? Color.m2507copywmQWz5c$default(jM2507copywmQWz5c$default3, 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j12;
        if ((i11 & 8) != 0) {
            MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
            jM2553compositeOverOWjLjI2 = ColorKt.m2553compositeOverOWjLjI(Color.m2507copywmQWz5c$default(materialTheme2.getColors(composer, 6).m712getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.12f, 0.0f, 0.0f, 0.0f, 14, null), materialTheme2.getColors(composer, 6).m717getSurface0d7_KjU());
        } else {
            jM2553compositeOverOWjLjI2 = j13;
        }
        if ((i11 & 16) != 0) {
            jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2507copywmQWz5c$default3, ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.87f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM2507copywmQWz5c$default = j14;
        }
        if ((i11 & 32) != 0) {
            jM2507copywmQWz5c$default2 = Color.m2507copywmQWz5c$default(jM2507copywmQWz5c$default4, ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.54f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM2507copywmQWz5c$default2 = j15;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1838505436, i10, -1, "androidx.compose.material.ChipDefaults.chipColors (Chip.kt:384)");
        }
        h0.g0 g0Var = new h0.g0(jM2553compositeOverOWjLjI, jM2507copywmQWz5c$default3, jM2507copywmQWz5c$default4, jM2553compositeOverOWjLjI2, jM2507copywmQWz5c$default, jM2507copywmQWz5c$default2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return g0Var;
    }

    @Composable
    @NotNull
    /* JADX INFO: renamed from: filterChipColors-J08w3-E, reason: not valid java name */
    public final SelectableChipColors m697filterChipColorsJ08w3E(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, @Nullable Composer composer, int i10, int i11) {
        long jM2553compositeOverOWjLjI;
        long jM2553compositeOverOWjLjI2;
        long jM2507copywmQWz5c$default;
        long jM2507copywmQWz5c$default2;
        composer.startReplaceableGroup(830140629);
        if ((i11 & 1) != 0) {
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            jM2553compositeOverOWjLjI = ColorKt.m2553compositeOverOWjLjI(Color.m2507copywmQWz5c$default(materialTheme.getColors(composer, 6).m712getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), materialTheme.getColors(composer, 6).m717getSurface0d7_KjU());
        } else {
            jM2553compositeOverOWjLjI = j10;
        }
        long jM2507copywmQWz5c$default3 = (i11 & 2) != 0 ? Color.m2507copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m712getOnSurface0d7_KjU(), 0.87f, 0.0f, 0.0f, 0.0f, 14, null) : j11;
        long jM2507copywmQWz5c$default4 = (i11 & 4) != 0 ? Color.m2507copywmQWz5c$default(jM2507copywmQWz5c$default3, 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j12;
        if ((i11 & 8) != 0) {
            MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
            jM2553compositeOverOWjLjI2 = ColorKt.m2553compositeOverOWjLjI(Color.m2507copywmQWz5c$default(materialTheme2.getColors(composer, 6).m712getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.12f, 0.0f, 0.0f, 0.0f, 14, null), materialTheme2.getColors(composer, 6).m717getSurface0d7_KjU());
        } else {
            jM2553compositeOverOWjLjI2 = j13;
        }
        if ((i11 & 16) != 0) {
            jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2507copywmQWz5c$default3, ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.87f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM2507copywmQWz5c$default = j14;
        }
        if ((i11 & 32) != 0) {
            jM2507copywmQWz5c$default2 = Color.m2507copywmQWz5c$default(jM2507copywmQWz5c$default4, ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.54f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM2507copywmQWz5c$default2 = j15;
        }
        long jM2553compositeOverOWjLjI3 = (i11 & 64) != 0 ? ColorKt.m2553compositeOverOWjLjI(Color.m2507copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m712getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), jM2553compositeOverOWjLjI) : j16;
        long jM2553compositeOverOWjLjI4 = (i11 & 128) != 0 ? ColorKt.m2553compositeOverOWjLjI(Color.m2507copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m712getOnSurface0d7_KjU(), 0.16f, 0.0f, 0.0f, 0.0f, 14, null), jM2507copywmQWz5c$default3) : j17;
        long jM2553compositeOverOWjLjI5 = (i11 & 256) != 0 ? ColorKt.m2553compositeOverOWjLjI(Color.m2507copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m712getOnSurface0d7_KjU(), 0.16f, 0.0f, 0.0f, 0.0f, 14, null), jM2507copywmQWz5c$default4) : j18;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(830140629, i10, -1, "androidx.compose.material.ChipDefaults.filterChipColors (Chip.kt:454)");
        }
        h0.k0 k0Var = new h0.k0(jM2553compositeOverOWjLjI, jM2507copywmQWz5c$default3, jM2507copywmQWz5c$default4, jM2553compositeOverOWjLjI2, jM2507copywmQWz5c$default, jM2507copywmQWz5c$default2, jM2553compositeOverOWjLjI3, jM2553compositeOverOWjLjI4, jM2553compositeOverOWjLjI5);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return k0Var;
    }

    /* JADX INFO: renamed from: getLeadingIconSize-D9Ej5fM, reason: not valid java name */
    public final float m698getLeadingIconSizeD9Ej5fM() {
        return LeadingIconSize;
    }

    /* JADX INFO: renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m699getMinHeightD9Ej5fM() {
        return MinHeight;
    }

    @Composable
    @JvmName(name = "getOutlinedBorder")
    @NotNull
    public final BorderStroke getOutlinedBorder(@Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(-1650225597);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1650225597, i10, -1, "androidx.compose.material.ChipDefaults.<get-outlinedBorder> (Chip.kt:542)");
        }
        BorderStroke borderStrokeM142BorderStrokecXLIe8U = BorderStrokeKt.m142BorderStrokecXLIe8U(OutlinedBorderSize, Color.m2507copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m712getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return borderStrokeM142BorderStrokecXLIe8U;
    }

    /* JADX INFO: renamed from: getOutlinedBorderSize-D9Ej5fM, reason: not valid java name */
    public final float m700getOutlinedBorderSizeD9Ej5fM() {
        return OutlinedBorderSize;
    }

    /* JADX INFO: renamed from: getSelectedIconSize-D9Ej5fM, reason: not valid java name */
    public final float m701getSelectedIconSizeD9Ej5fM() {
        return SelectedIconSize;
    }

    @Composable
    @NotNull
    /* JADX INFO: renamed from: outlinedChipColors-5tl4gsc, reason: not valid java name */
    public final ChipColors m702outlinedChipColors5tl4gsc(long j10, long j11, long j12, long j13, long j14, long j15, @Nullable Composer composer, int i10, int i11) {
        long jM2507copywmQWz5c$default;
        long jM2507copywmQWz5c$default2;
        composer.startReplaceableGroup(-1763922662);
        long jM717getSurface0d7_KjU = (i11 & 1) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m717getSurface0d7_KjU() : j10;
        long jM2507copywmQWz5c$default3 = (i11 & 2) != 0 ? Color.m2507copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m712getOnSurface0d7_KjU(), 0.87f, 0.0f, 0.0f, 0.0f, 14, null) : j11;
        long jM2507copywmQWz5c$default4 = (i11 & 4) != 0 ? Color.m2507copywmQWz5c$default(jM2507copywmQWz5c$default3, 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j12;
        long j16 = (i11 & 8) != 0 ? jM717getSurface0d7_KjU : j13;
        if ((i11 & 16) != 0) {
            jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2507copywmQWz5c$default3, ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.87f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM2507copywmQWz5c$default = j14;
        }
        if ((i11 & 32) != 0) {
            jM2507copywmQWz5c$default2 = Color.m2507copywmQWz5c$default(jM2507copywmQWz5c$default4, ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.54f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM2507copywmQWz5c$default2 = j15;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1763922662, i10, -1, "androidx.compose.material.ChipDefaults.outlinedChipColors (Chip.kt:420)");
        }
        ChipColors chipColorsM696chipColors5tl4gsc = m696chipColors5tl4gsc(jM717getSurface0d7_KjU, jM2507copywmQWz5c$default3, jM2507copywmQWz5c$default4, j16, jM2507copywmQWz5c$default, jM2507copywmQWz5c$default2, composer, (i10 & 14) | (i10 & 112) | (i10 & 896) | (i10 & 7168) | (57344 & i10) | (458752 & i10) | (i10 & 3670016), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return chipColorsM696chipColors5tl4gsc;
    }

    @Composable
    @NotNull
    /* JADX INFO: renamed from: outlinedFilterChipColors-J08w3-E, reason: not valid java name */
    public final SelectableChipColors m703outlinedFilterChipColorsJ08w3E(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, @Nullable Composer composer, int i10, int i11) {
        long jM2507copywmQWz5c$default;
        long jM2507copywmQWz5c$default2;
        composer.startReplaceableGroup(346878099);
        long jM717getSurface0d7_KjU = (i11 & 1) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m717getSurface0d7_KjU() : j10;
        long jM2507copywmQWz5c$default3 = (i11 & 2) != 0 ? Color.m2507copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m712getOnSurface0d7_KjU(), 0.87f, 0.0f, 0.0f, 0.0f, 14, null) : j11;
        long jM2507copywmQWz5c$default4 = (i11 & 4) != 0 ? Color.m2507copywmQWz5c$default(jM2507copywmQWz5c$default3, 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j12;
        long j19 = (i11 & 8) != 0 ? jM717getSurface0d7_KjU : j13;
        if ((i11 & 16) != 0) {
            jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2507copywmQWz5c$default3, ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.87f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM2507copywmQWz5c$default = j14;
        }
        if ((i11 & 32) != 0) {
            jM2507copywmQWz5c$default2 = Color.m2507copywmQWz5c$default(jM2507copywmQWz5c$default4, ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.54f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM2507copywmQWz5c$default2 = j15;
        }
        long jM2553compositeOverOWjLjI = (i11 & 64) != 0 ? ColorKt.m2553compositeOverOWjLjI(Color.m2507copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m712getOnSurface0d7_KjU(), 0.16f, 0.0f, 0.0f, 0.0f, 14, null), jM717getSurface0d7_KjU) : j16;
        long jM2553compositeOverOWjLjI2 = (i11 & 128) != 0 ? ColorKt.m2553compositeOverOWjLjI(Color.m2507copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m712getOnSurface0d7_KjU(), 0.16f, 0.0f, 0.0f, 0.0f, 14, null), jM2507copywmQWz5c$default3) : j17;
        long jM2553compositeOverOWjLjI3 = (i11 & 256) != 0 ? ColorKt.m2553compositeOverOWjLjI(Color.m2507copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m712getOnSurface0d7_KjU(), 0.16f, 0.0f, 0.0f, 0.0f, 14, null), jM2507copywmQWz5c$default4) : j18;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(346878099, i10, -1, "androidx.compose.material.ChipDefaults.outlinedFilterChipColors (Chip.kt:505)");
        }
        h0.k0 k0Var = new h0.k0(jM717getSurface0d7_KjU, jM2507copywmQWz5c$default3, jM2507copywmQWz5c$default4, j19, jM2507copywmQWz5c$default, jM2507copywmQWz5c$default2, jM2553compositeOverOWjLjI, jM2553compositeOverOWjLjI2, jM2553compositeOverOWjLjI3);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return k0Var;
    }
}
