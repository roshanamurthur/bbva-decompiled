package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.Indication;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.unit.Dp;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Card.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a¬\u0001\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0011\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u001aH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0088\u0001\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0011\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u001aH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001e\u001af\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u0011\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u001aH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 \u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006!"}, d2 = {"Card", "", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "shape", "Landroidx/compose/ui/graphics/Shape;", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", OutlinedTextFieldKt.BorderId, "Landroidx/compose/foundation/BorderStroke;", "elevation", "Landroidx/compose/ui/unit/Dp;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "indication", "Landroidx/compose/foundation/Indication;", "enabled", "", "onClickLabel", "", "role", "Landroidx/compose/ui/semantics/Role;", "content", "Landroidx/compose/runtime/Composable;", "Card-9VG74zQ", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/Indication;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "Card-LPr_se0", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJLandroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Card-F-jzlyU", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/foundation/BorderStroke;FLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Card.kt\nandroidx/compose/material/CardKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,212:1\n154#2:213\n154#2:214\n154#2:222\n25#3:215\n25#3:223\n1097#4,6:216\n1097#4,6:224\n76#5:230\n*S KotlinDebug\n*F\n+ 1 Card.kt\nandroidx/compose/material/CardKt\n*L\n65#1:213\n116#1:214\n187#1:222\n117#1:215\n188#1:223\n117#1:216,6\n188#1:224,6\n189#1:230\n*E\n"})
public final class CardKt {
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @Deprecated(level = DeprecationLevel.ERROR, message = "This API is deprecated with the introduction a newer Card function overload that accepts an onClick().", replaceWith = @ReplaceWith(expression = "Card(onClick, modifier, enabled, shape, backgroundColor, contentColor, border, elevation, interactionSource, content)", imports = {}))
    @Composable
    @ExperimentalMaterialApi
    /* JADX INFO: renamed from: Card-9VG74zQ, reason: not valid java name */
    public static final void m690Card9VG74zQ(@NotNull Function0<Unit> onClick, @Nullable Modifier modifier, @Nullable Shape shape, long j10, long j11, @Nullable BorderStroke borderStroke, float f6, @Nullable MutableInteractionSource mutableInteractionSource, @Nullable Indication indication, boolean z10, @Nullable String str, @Nullable Role role, @NotNull Function2<? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i10, int i11, int i12) {
        MutableInteractionSource mutableInteractionSource2;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        composer.startReplaceableGroup(1353606722);
        Modifier modifier2 = (i12 & 2) != 0 ? Modifier.INSTANCE : modifier;
        Shape medium = (i12 & 4) != 0 ? MaterialTheme.INSTANCE.getShapes(composer, 6).getMedium() : shape;
        long jM717getSurface0d7_KjU = (i12 & 8) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m717getSurface0d7_KjU() : j10;
        long jM731contentColorForek8zF_U = (i12 & 16) != 0 ? ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composer, (i10 >> 9) & 14) : j11;
        BorderStroke borderStroke2 = (i12 & 32) != 0 ? null : borderStroke;
        float fM4389constructorimpl = (i12 & 64) != 0 ? Dp.m4389constructorimpl(1) : f6;
        if ((i12 & 128) != 0) {
            composer.startReplaceableGroup(-492369756);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceableGroup();
            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
        } else {
            mutableInteractionSource2 = mutableInteractionSource;
        }
        Indication indication2 = (i12 & 256) != 0 ? (Indication) composer.consume(IndicationKt.getLocalIndication()) : indication;
        boolean z11 = (i12 & 512) != 0 ? true : z10;
        String str2 = (i12 & 1024) != 0 ? null : str;
        Role role2 = (i12 & 2048) != 0 ? null : role;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1353606722, i10, i11, "androidx.compose.material.Card (Card.kt:179)");
        }
        SurfaceKt.m833Surface9VG74zQ(onClick, modifier2, medium, jM717getSurface0d7_KjU, jM731contentColorForek8zF_U, borderStroke2, fM4389constructorimpl, mutableInteractionSource2, indication2, z11, str2, role2, content, composer, (i10 & 14) | (i10 & 112) | (i10 & 896) | (i10 & 7168) | (57344 & i10) | (458752 & i10) | (3670016 & i10) | (29360128 & i10) | (234881024 & i10) | (i10 & 1879048192), (i11 & 14) | (i11 & 112) | (i11 & 896), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: Card-F-jzlyU, reason: not valid java name */
    public static final void m691CardFjzlyU(@Nullable Modifier modifier, @Nullable Shape shape, long j10, long j11, @Nullable BorderStroke borderStroke, float f6, @NotNull Function2<? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(content, "content");
        composer.startReplaceableGroup(1956755640);
        Modifier modifier2 = (i11 & 1) != 0 ? Modifier.INSTANCE : modifier;
        Shape medium = (i11 & 2) != 0 ? MaterialTheme.INSTANCE.getShapes(composer, 6).getMedium() : shape;
        long jM717getSurface0d7_KjU = (i11 & 4) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m717getSurface0d7_KjU() : j10;
        long jM731contentColorForek8zF_U = (i11 & 8) != 0 ? ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composer, (i10 >> 6) & 14) : j11;
        BorderStroke borderStroke2 = (i11 & 16) != 0 ? null : borderStroke;
        float fM4389constructorimpl = (i11 & 32) != 0 ? Dp.m4389constructorimpl(1) : f6;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1956755640, i10, -1, "androidx.compose.material.Card (Card.kt:58)");
        }
        SurfaceKt.m834SurfaceFjzlyU(modifier2, medium, jM717getSurface0d7_KjU, jM731contentColorForek8zF_U, borderStroke2, fM4389constructorimpl, content, composer, (i10 & 14) | (i10 & 112) | (i10 & 896) | (i10 & 7168) | (57344 & i10) | (458752 & i10) | (i10 & 3670016), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    @Composable
    @ExperimentalMaterialApi
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: Card-LPr_se0, reason: not valid java name */
    public static final void m692CardLPr_se0(@NotNull Function0<Unit> onClick, @Nullable Modifier modifier, boolean z10, @Nullable Shape shape, long j10, long j11, @Nullable BorderStroke borderStroke, float f6, @Nullable MutableInteractionSource mutableInteractionSource, @NotNull Function2<? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i10, int i11) {
        MutableInteractionSource mutableInteractionSource2;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        composer.startReplaceableGroup(778538979);
        Modifier modifier2 = (i11 & 2) != 0 ? Modifier.INSTANCE : modifier;
        boolean z11 = (i11 & 4) != 0 ? true : z10;
        Shape medium = (i11 & 8) != 0 ? MaterialTheme.INSTANCE.getShapes(composer, 6).getMedium() : shape;
        long jM717getSurface0d7_KjU = (i11 & 16) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m717getSurface0d7_KjU() : j10;
        long jM731contentColorForek8zF_U = (i11 & 32) != 0 ? ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composer, (i10 >> 12) & 14) : j11;
        BorderStroke borderStroke2 = (i11 & 64) != 0 ? null : borderStroke;
        float fM4389constructorimpl = (i11 & 128) != 0 ? Dp.m4389constructorimpl(1) : f6;
        if ((i11 & 256) != 0) {
            composer.startReplaceableGroup(-492369756);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceableGroup();
            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
        } else {
            mutableInteractionSource2 = mutableInteractionSource;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(778538979, i10, -1, "androidx.compose.material.Card (Card.kt:107)");
        }
        SurfaceKt.m835SurfaceLPr_se0(onClick, modifier2, z11, medium, jM717getSurface0d7_KjU, jM731contentColorForek8zF_U, borderStroke2, fM4389constructorimpl, mutableInteractionSource2, content, composer, (i10 & 14) | (i10 & 112) | (i10 & 896) | (i10 & 7168) | (57344 & i10) | (458752 & i10) | (3670016 & i10) | (29360128 & i10) | (234881024 & i10) | (i10 & 1879048192), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }
}
