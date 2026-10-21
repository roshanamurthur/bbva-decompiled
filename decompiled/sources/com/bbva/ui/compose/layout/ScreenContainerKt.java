package com.bbva.ui.compose.layout;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import com.google.android.gms.measurement.internal.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ScreenContainer.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000Z\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001az\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\u001c\u0010\r\u001a\u0018\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u000e¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u0011H\u0087\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001az\u0010\u0014\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\u001c\u0010\r\u001a\u0018\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00010\u000e¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u0011H\u0087\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001b\u001az\u0010\u001c\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\u001c\u0010\r\u001a\u0018\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00010\u000e¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u0011H\u0087\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010#\u0082\u0002\u000e\n\u0005\b\u009920\u0001\n\u0005\b¡\u001e0\u0001¨\u0006$"}, d2 = {"ScreenBox", "", "modifier", "Landroidx/compose/ui/Modifier;", "contentAlignment", "Landroidx/compose/ui/Alignment;", "propagateMinConstraints", "", "paddingTop", "Landroidx/compose/ui/unit/Dp;", "paddingRight", "paddingBottom", "paddingLeft", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/BoxScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "ScreenBox-hX_2lFY", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;ZFFFFLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "ScreenColumn", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "horizontalAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "Landroidx/compose/foundation/layout/ColumnScope;", "ScreenColumn-hX_2lFY", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;FFFFLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "ScreenRow", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "verticalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "Landroidx/compose/foundation/layout/RowScope;", "ScreenRow-hX_2lFY", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;FFFFLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nScreenContainer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScreenContainer.kt\ncom/bbva/ui/compose/layout/ScreenContainerKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,97:1\n154#2:98\n154#2:99\n154#2:100\n154#2:101\n154#2:138\n154#2:139\n154#2:140\n154#2:141\n154#2:178\n154#2:179\n154#2:180\n154#2:181\n70#3,2:102\n72#3:132\n76#3:137\n78#4,11:104\n91#4:136\n78#4,11:144\n91#4:176\n78#4,11:184\n91#4:216\n456#5,8:115\n464#5,3:129\n467#5,3:133\n456#5,8:155\n464#5,3:169\n467#5,3:173\n456#5,8:195\n464#5,3:209\n467#5,3:213\n4144#6,6:123\n4144#6,6:163\n4144#6,6:203\n76#7,2:142\n78#7:172\n82#7:177\n77#8,2:182\n79#8:212\n83#8:217\n*S KotlinDebug\n*F\n+ 1 ScreenContainer.kt\ncom/bbva/ui/compose/layout/ScreenContainerKt\n*L\n31#1:98\n32#1:99\n33#1:100\n34#1:101\n55#1:138\n56#1:139\n57#1:140\n58#1:141\n79#1:178\n80#1:179\n81#1:180\n82#1:181\n37#1:102,2\n37#1:132\n37#1:137\n37#1:104,11\n37#1:136\n61#1:144,11\n61#1:176\n85#1:184,11\n85#1:216\n37#1:115,8\n37#1:129,3\n37#1:133,3\n61#1:155,8\n61#1:169,3\n61#1:173,3\n85#1:195,8\n85#1:209,3\n85#1:213,3\n37#1:123,6\n61#1:163,6\n85#1:203,6\n61#1:142,2\n61#1:172\n61#1:177\n85#1:182,2\n85#1:212\n85#1:217\n*E\n"})
public final class ScreenContainerKt {
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: ScreenBox-hX_2lFY, reason: not valid java name */
    public static final void m4987ScreenBoxhX_2lFY(@Nullable Modifier modifier, @Nullable Alignment alignment, boolean z10, float f6, float f10, float f11, float f12, @NotNull Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(content, "content");
        composer.startReplaceableGroup(-1439659073);
        if ((i11 & 1) != 0) {
            modifier = Modifier.INSTANCE;
        }
        if ((i11 & 2) != 0) {
            alignment = Alignment.INSTANCE.getTopStart();
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        if ((i11 & 8) != 0) {
            f6 = Dp.m4389constructorimpl(16);
        }
        if ((i11 & 16) != 0) {
            f10 = Dp.m4389constructorimpl(16);
        }
        if ((i11 & 32) != 0) {
            f11 = Dp.m4389constructorimpl(24);
        }
        if ((i11 & 64) != 0) {
            f12 = Dp.m4389constructorimpl(16);
        }
        Modifier modifierM294absolutePaddingqDBjuR0 = PaddingKt.m294absolutePaddingqDBjuR0(modifier, f12, f6, f10, f11);
        int i12 = (i10 & 112) | (i10 & 896) | ((i10 >> 12) & 7168);
        composer.startReplaceableGroup(733328855);
        int i13 = i12 >> 3;
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(alignment, z10, composer, (i13 & 112) | (i13 & 14));
        composer.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM294absolutePaddingqDBjuR0);
        int i14 = ((((i12 << 3) & 112) << 9) & 7168) | 6;
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        Composer composerM2074constructorimpl = Updater.m2074constructorimpl(composer);
        Function2 function2C = a.c(companion, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy, composerM2074constructorimpl, currentCompositionLocalMap);
        if (composerM2074constructorimpl.getInserting() || !Intrinsics.areEqual(composerM2074constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
        }
        ai.a.j((i14 >> 3) & 112, function3ModifierMaterializerOf, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composer)), composer, 2058660585);
        content.invoke(BoxScopeInstance.INSTANCE, composer, Integer.valueOf(((i12 >> 6) & 112) | 6));
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: ScreenColumn-hX_2lFY, reason: not valid java name */
    public static final void m4988ScreenColumnhX_2lFY(@Nullable Modifier modifier, @Nullable Arrangement.Vertical vertical, @Nullable Alignment.Horizontal horizontal, float f6, float f10, float f11, float f12, @NotNull Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(content, "content");
        composer.startReplaceableGroup(384376283);
        if ((i11 & 1) != 0) {
            modifier = Modifier.INSTANCE;
        }
        if ((i11 & 2) != 0) {
            vertical = Arrangement.INSTANCE.getTop();
        }
        if ((i11 & 4) != 0) {
            horizontal = Alignment.INSTANCE.getStart();
        }
        if ((i11 & 8) != 0) {
            f6 = Dp.m4389constructorimpl(16);
        }
        if ((i11 & 16) != 0) {
            f10 = Dp.m4389constructorimpl(16);
        }
        if ((i11 & 32) != 0) {
            f11 = Dp.m4389constructorimpl(24);
        }
        if ((i11 & 64) != 0) {
            f12 = Dp.m4389constructorimpl(16);
        }
        Modifier modifierM294absolutePaddingqDBjuR0 = PaddingKt.m294absolutePaddingqDBjuR0(modifier, f12, f6, f10, f11);
        int i12 = (i10 & 112) | (i10 & 896) | ((i10 >> 12) & 7168);
        composer.startReplaceableGroup(-483455358);
        int i13 = i12 >> 3;
        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(vertical, horizontal, composer, (i13 & 112) | (i13 & 14));
        composer.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM294absolutePaddingqDBjuR0);
        int i14 = ((((i12 << 3) & 112) << 9) & 7168) | 6;
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        Composer composerM2074constructorimpl = Updater.m2074constructorimpl(composer);
        Function2 function2C = a.c(companion, composerM2074constructorimpl, measurePolicyColumnMeasurePolicy, composerM2074constructorimpl, currentCompositionLocalMap);
        if (composerM2074constructorimpl.getInserting() || !Intrinsics.areEqual(composerM2074constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
        }
        ai.a.j((i14 >> 3) & 112, function3ModifierMaterializerOf, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composer)), composer, 2058660585);
        content.invoke(ColumnScopeInstance.INSTANCE, composer, Integer.valueOf(((i12 >> 6) & 112) | 6));
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: ScreenRow-hX_2lFY, reason: not valid java name */
    public static final void m4989ScreenRowhX_2lFY(@Nullable Modifier modifier, @Nullable Arrangement.Horizontal horizontal, @Nullable Alignment.Vertical vertical, float f6, float f10, float f11, float f12, @NotNull Function3<? super RowScope, ? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(content, "content");
        composer.startReplaceableGroup(-1646082961);
        if ((i11 & 1) != 0) {
            modifier = Modifier.INSTANCE;
        }
        if ((i11 & 2) != 0) {
            horizontal = Arrangement.INSTANCE.getStart();
        }
        if ((i11 & 4) != 0) {
            vertical = Alignment.INSTANCE.getTop();
        }
        if ((i11 & 8) != 0) {
            f6 = Dp.m4389constructorimpl(16);
        }
        if ((i11 & 16) != 0) {
            f10 = Dp.m4389constructorimpl(16);
        }
        if ((i11 & 32) != 0) {
            f11 = Dp.m4389constructorimpl(24);
        }
        if ((i11 & 64) != 0) {
            f12 = Dp.m4389constructorimpl(16);
        }
        Modifier modifierM294absolutePaddingqDBjuR0 = PaddingKt.m294absolutePaddingqDBjuR0(modifier, f12, f6, f10, f11);
        int i12 = (i10 & 112) | (i10 & 896) | ((i10 >> 12) & 7168);
        composer.startReplaceableGroup(693286680);
        int i13 = i12 >> 3;
        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontal, vertical, composer, (i13 & 112) | (i13 & 14));
        composer.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM294absolutePaddingqDBjuR0);
        int i14 = ((((i12 << 3) & 112) << 9) & 7168) | 6;
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        Composer composerM2074constructorimpl = Updater.m2074constructorimpl(composer);
        Function2 function2C = a.c(companion, composerM2074constructorimpl, measurePolicyRowMeasurePolicy, composerM2074constructorimpl, currentCompositionLocalMap);
        if (composerM2074constructorimpl.getInserting() || !Intrinsics.areEqual(composerM2074constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
        }
        ai.a.j((i14 >> 3) & 112, function3ModifierMaterializerOf, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composer)), composer, 2058660585);
        content.invoke(RowScopeInstance.INSTANCE, composer, Integer.valueOf(((i12 >> 6) & 112) | 6));
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
    }
}
