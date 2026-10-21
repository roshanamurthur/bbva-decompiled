package androidx.compose.material;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.profileinstaller.ProfileVerifier;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SwipeToDismiss.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a/\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0083\u0001\u0010\u0016\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\t2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000e0\u00022\u001c\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u0002¢\u0006\u0002\b\u0012¢\u0006\u0002\b\u00132\u001c\u0010\u0015\u001a\u0018\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u0002¢\u0006\u0002\b\u0012¢\u0006\u0002\b\u0013H\u0007¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Landroidx/compose/material/DismissValue;", "initialValue", "Lkotlin/Function1;", "", "confirmStateChange", "Landroidx/compose/material/DismissState;", "rememberDismissState", "(Landroidx/compose/material/DismissValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/DismissState;", "state", "Landroidx/compose/ui/Modifier;", "modifier", "", "Landroidx/compose/material/DismissDirection;", "directions", "Landroidx/compose/material/ThresholdConfig;", "dismissThresholds", "Landroidx/compose/foundation/layout/RowScope;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "background", "dismissContent", "SwipeToDismiss", "(Landroidx/compose/material/DismissState;Landroidx/compose/ui/Modifier;Ljava/util/Set;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "material_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSwipeToDismiss.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwipeToDismiss.kt\nandroidx/compose/material/SwipeToDismissKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,243:1\n50#2:244\n49#2:245\n1097#3,6:246\n154#4:252\n*S KotlinDebug\n*F\n+ 1 SwipeToDismiss.kt\nandroidx/compose/material/SwipeToDismissKt\n*L\n153#1:244\n153#1:245\n153#1:246,6\n243#1:252\n*E\n"})
public final class SwipeToDismissKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f7860a = Dp.m4389constructorimpl(56);

    /* JADX INFO: compiled from: SwipeToDismiss.kt */
    public static final class a extends Lambda implements Function1<DismissDirection, FixedThreshold> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f7861p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final FixedThreshold invoke(DismissDirection dismissDirection) {
            DismissDirection it = dismissDirection;
            Intrinsics.checkNotNullParameter(it, "it");
            return new FixedThreshold(SwipeToDismissKt.f7860a, null);
        }
    }

    /* JADX INFO: compiled from: SwipeToDismiss.kt */
    @SourceDebugExtension({"SMAP\nSwipeToDismiss.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwipeToDismiss.kt\nandroidx/compose/material/SwipeToDismissKt$SwipeToDismiss$2\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,243:1\n76#2:244\n36#3:245\n456#3,8:269\n464#3,3:283\n456#3,8:304\n464#3,3:318\n467#3,3:322\n36#3:327\n456#3,8:351\n464#3,3:365\n467#3,3:369\n467#3,3:374\n1097#4,6:246\n1097#4,6:328\n66#5,6:252\n72#5:286\n76#5:378\n78#6,11:258\n78#6,11:293\n91#6:325\n78#6,11:340\n91#6:372\n91#6:377\n4144#7,6:277\n4144#7,6:312\n4144#7,6:359\n73#8,6:287\n79#8:321\n83#8:326\n73#8,6:334\n79#8:368\n83#8:373\n*S KotlinDebug\n*F\n+ 1 SwipeToDismiss.kt\nandroidx/compose/material/SwipeToDismissKt$SwipeToDismiss$2\n*L\n184#1:244\n190#1:245\n197#1:269,8\n197#1:283,3\n212#1:304,8\n212#1:318,3\n212#1:322,3\n218#1:327\n216#1:351,8\n216#1:365,3\n216#1:369,3\n197#1:374,3\n190#1:246,6\n218#1:328,6\n197#1:252,6\n197#1:286\n197#1:378\n197#1:258,11\n212#1:293,11\n212#1:325\n216#1:340,11\n216#1:372\n197#1:377\n197#1:277,6\n212#1:312,6\n216#1:359,6\n212#1:287,6\n212#1:321\n212#1:326\n216#1:334,6\n216#1:368\n216#1:373\n*E\n"})
    public static final class b extends Lambda implements Function3<BoxWithConstraintsScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Set<DismissDirection> f7862p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function1<DismissDirection, ThresholdConfig> f7863q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ int f7864r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ DismissState f7865s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> f7866t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> f7867u0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Set<? extends DismissDirection> set, Function1<? super DismissDirection, ? extends ThresholdConfig> function1, int i10, DismissState dismissState, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function4) {
            super(3);
            this.f7862p0 = set;
            this.f7863q0 = function1;
            this.f7864r0 = i10;
            this.f7865s0 = dismissState;
            this.f7866t0 = function3;
            this.f7867u0 = function4;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer, Integer num) {
            int i10;
            BoxWithConstraintsScope BoxWithConstraints = boxWithConstraintsScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
            if ((iIntValue & 14) == 0) {
                i10 = (composer2.changed(BoxWithConstraints) ? 4 : 2) | iIntValue;
            } else {
                i10 = iIntValue;
            }
            if ((i10 & 91) == 18 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(338007641, iIntValue, -1, "androidx.compose.material.SwipeToDismiss.<anonymous> (SwipeToDismiss.kt:181)");
                }
                float fM4357getMaxWidthimpl = Constraints.m4357getMaxWidthimpl(BoxWithConstraints.mo260getConstraintsmsEJaDk());
                boolean z10 = composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl;
                Float fValueOf = Float.valueOf(0.0f);
                DismissValue dismissValue = DismissValue.Default;
                Map mapMutableMapOf = bk.q.mutableMapOf(TuplesKt.to(fValueOf, dismissValue));
                DismissDirection dismissDirection = DismissDirection.StartToEnd;
                Set<DismissDirection> set = this.f7862p0;
                if (set.contains(dismissDirection)) {
                    Pair pair = TuplesKt.to(Float.valueOf(fM4357getMaxWidthimpl), DismissValue.DismissedToEnd);
                    mapMutableMapOf.put(pair.getFirst(), pair.getSecond());
                }
                DismissDirection dismissDirection2 = DismissDirection.EndToStart;
                if (set.contains(dismissDirection2)) {
                    Pair pair2 = TuplesKt.to(Float.valueOf(-fM4357getMaxWidthimpl), DismissValue.DismissedToStart);
                    mapMutableMapOf.put(pair2.getFirst(), pair2.getSecond());
                }
                composer2.startReplaceableGroup(1157296644);
                Function1<DismissDirection, ThresholdConfig> function1 = this.f7863q0;
                boolean zChanged = composer2.changed(function1);
                Object objRememberedValue = composer2.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new t2(function1);
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceableGroup();
                Function2 function2 = (Function2) objRememberedValue;
                float f6 = set.contains(dismissDirection2) ? 10.0f : 20.0f;
                float f10 = set.contains(dismissDirection) ? 10.0f : 20.0f;
                Modifier.Companion companion = Modifier.INSTANCE;
                Orientation orientation = Orientation.Horizontal;
                DismissState dismissState = this.f7865s0;
                Modifier modifierM841swipeablepPrIpRY = SwipeableKt.m841swipeablepPrIpRY(companion, this.f7865s0, mapMutableMapOf, orientation, (288 & 8) != 0 ? true : dismissState.getCurrentValue() == dismissValue, (288 & 16) != 0 ? false : z10, (288 & 32) != 0 ? null : null, (288 & 64) != 0 ? SwipeableKt.f.f7901p0 : function2, (288 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapMutableMapOf.keySet(), 0.0f, 0.0f, 6, null) : new ResistanceConfig(fM4357getMaxWidthimpl, f6, f10), (288 & 256) != 0 ? SwipeableDefaults.INSTANCE.m840getVelocityThresholdD9Ej5fM() : 0.0f);
                composer2.startReplaceableGroup(733328855);
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyC = androidx.databinding.f.c(companion2, false, composer2, 0, -1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM841swipeablepPrIpRY);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                Composer composerM2074constructorimpl = Updater.m2074constructorimpl(composer2);
                Function2 function2C = com.google.android.gms.measurement.internal.a.c(companion3, composerM2074constructorimpl, measurePolicyC, composerM2074constructorimpl, currentCompositionLocalMap);
                if (composerM2074constructorimpl.getInserting() || !Intrinsics.areEqual(composerM2074constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                }
                ai.a.j(0, function3ModifierMaterializerOf, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composer2)), composer2, 2058660585);
                Modifier modifierMatchParentSize = BoxScopeInstance.INSTANCE.matchParentSize(companion);
                int i11 = this.f7864r0;
                int i12 = (i11 >> 3) & 7168;
                composer2.startReplaceableGroup(693286680);
                Arrangement arrangement = Arrangement.INSTANCE;
                int i13 = i12 >> 3;
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), composer2, (i13 & 14) | (i13 & 112));
                composer2.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierMatchParentSize);
                int i14 = ((((i12 << 3) & 112) << 9) & 7168) | 6;
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor2);
                } else {
                    composer2.useNode();
                }
                Composer composerM2074constructorimpl2 = Updater.m2074constructorimpl(composer2);
                Function2 function2C2 = com.google.android.gms.measurement.internal.a.c(companion3, composerM2074constructorimpl2, measurePolicyRowMeasurePolicy, composerM2074constructorimpl2, currentCompositionLocalMap2);
                if (composerM2074constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM2074constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash2, composerM2074constructorimpl2, currentCompositeKeyHash2, function2C2);
                }
                ai.a.j((i14 >> 3) & 112, function3ModifierMaterializerOf2, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composer2)), composer2, 2058660585);
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                this.f7866t0.invoke(rowScopeInstance, composer2, Integer.valueOf(((i12 >> 6) & 112) | 6));
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                composer2.startReplaceableGroup(1157296644);
                boolean zChanged2 = composer2.changed(dismissState);
                Object objRememberedValue2 = composer2.rememberedValue();
                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new s2(dismissState);
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                composer2.endReplaceableGroup();
                Modifier modifierOffset = OffsetKt.offset(companion, (Function1) objRememberedValue2);
                int i15 = (i11 >> 6) & 7168;
                composer2.startReplaceableGroup(693286680);
                Arrangement.Horizontal start = arrangement.getStart();
                Alignment.Vertical top = companion2.getTop();
                int i16 = i15 >> 3;
                MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(start, top, composer2, (i16 & 112) | (i16 & 14));
                composer2.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierOffset);
                int i17 = ((((i15 << 3) & 112) << 9) & 7168) | 6;
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor3);
                } else {
                    composer2.useNode();
                }
                Composer composerM2074constructorimpl3 = Updater.m2074constructorimpl(composer2);
                Function2 function2C3 = com.google.android.gms.measurement.internal.a.c(companion3, composerM2074constructorimpl3, measurePolicyRowMeasurePolicy2, composerM2074constructorimpl3, currentCompositionLocalMap3);
                if (composerM2074constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM2074constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash3, composerM2074constructorimpl3, currentCompositeKeyHash3, function2C3);
                }
                ai.a.j((i17 >> 3) & 112, function3ModifierMaterializerOf3, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composer2)), composer2, 2058660585);
                this.f7867u0.invoke(rowScopeInstance, composer2, Integer.valueOf(((i15 >> 6) & 112) | 6));
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: SwipeToDismiss.kt */
    public static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ DismissState f7868p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Modifier f7869q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Set<DismissDirection> f7870r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function1<DismissDirection, ThresholdConfig> f7871s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> f7872t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> f7873u0;
        public final /* synthetic */ int v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ int f7874w0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(DismissState dismissState, Modifier modifier, Set<? extends DismissDirection> set, Function1<? super DismissDirection, ? extends ThresholdConfig> function1, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function4, int i10, int i11) {
            super(2);
            this.f7868p0 = dismissState;
            this.f7869q0 = modifier;
            this.f7870r0 = set;
            this.f7871s0 = function1;
            this.f7872t0 = function3;
            this.f7873u0 = function4;
            this.v0 = i10;
            this.f7874w0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            SwipeToDismissKt.SwipeToDismiss(this.f7868p0, this.f7869q0, this.f7870r0, this.f7871s0, this.f7872t0, this.f7873u0, composer, RecomposeScopeImplKt.updateChangedFlags(this.v0 | 1), this.f7874w0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: SwipeToDismiss.kt */
    public static final class d extends Lambda implements Function1<DismissValue, Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final d f7875p0 = new d(1);

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(DismissValue dismissValue) {
            DismissValue it = dismissValue;
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: compiled from: SwipeToDismiss.kt */
    public static final class e extends Lambda implements Function0<DismissState> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ DismissValue f7876p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function1<DismissValue, Boolean> f7877q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(DismissValue dismissValue, Function1<? super DismissValue, Boolean> function1) {
            super(0);
            this.f7876p0 = dismissValue;
            this.f7877q0 = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        public final DismissState invoke() {
            return new DismissState(this.f7876p0, this.f7877q0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0059  */
    /* JADX WARN: Code duplicated, block: B:29:0x005f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0064  */
    /* JADX WARN: Code duplicated, block: B:33:0x0068  */
    /* JADX WARN: Code duplicated, block: B:35:0x0070  */
    /* JADX WARN: Code duplicated, block: B:36:0x0073  */
    /* JADX WARN: Code duplicated, block: B:40:0x007a  */
    /* JADX WARN: Code duplicated, block: B:41:0x007d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0083  */
    /* JADX WARN: Code duplicated, block: B:45:0x0089  */
    /* JADX WARN: Code duplicated, block: B:46:0x008c  */
    /* JADX WARN: Code duplicated, block: B:50:0x0093  */
    /* JADX WARN: Code duplicated, block: B:53:0x0098  */
    /* JADX WARN: Code duplicated, block: B:55:0x009d  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:68:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:78:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:81:0x012d  */
    /* JADX WARN: Code duplicated, block: B:86:0x013d  */
    /* JADX WARN: Code duplicated, block: B:88:? A[RETURN, SYNTHETIC] */
    @Composable
    @ExperimentalMaterialApi
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void SwipeToDismiss(@NotNull DismissState state, @Nullable Modifier modifier, @Nullable Set<? extends DismissDirection> set, @Nullable Function1<? super DismissDirection, ? extends ThresholdConfig> function1, @NotNull Function3<? super RowScope, ? super Composer, ? super Integer, Unit> background, @NotNull Function3<? super RowScope, ? super Composer, ? super Integer, Unit> dismissContent, @Nullable Composer composer, int i10, int i11) {
        int i12;
        Modifier modifier2;
        int i13;
        int i14;
        Function1<? super DismissDirection, ? extends ThresholdConfig> function2;
        int i15;
        int i16;
        int i17;
        int i18;
        Modifier modifier3;
        Set<? extends DismissDirection> of2;
        Function1<? super DismissDirection, ? extends ThresholdConfig> function3;
        Modifier modifier4;
        Set<? extends DismissDirection> set2;
        Function1<? super DismissDirection, ? extends ThresholdConfig> function4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(background, "background");
        Intrinsics.checkNotNullParameter(dismissContent, "dismissContent");
        Composer composerStartRestartGroup = composer.startRestartGroup(634380143);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i19 = i11 & 2;
        if (i19 == 0) {
            if ((i10 & 112) == 0) {
                modifier2 = modifier;
                i12 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                i12 |= 128;
            }
            i14 = i11 & 8;
            if (i14 != 0) {
                if ((i10 & 7168) == 0) {
                    function2 = function1;
                    if (composerStartRestartGroup.changedInstance(function2)) {
                        i15 = 2048;
                    } else {
                        i15 = 1024;
                    }
                    i12 |= i15;
                }
                if ((i11 & 16) != 0) {
                    i12 |= 24576;
                } else if ((57344 & i10) == 0) {
                    if (composerStartRestartGroup.changedInstance(background)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                if ((i11 & 32) != 0) {
                    if ((458752 & i10) == 0) {
                        if (composerStartRestartGroup.changedInstance(dismissContent)) {
                            i17 = 131072;
                        } else {
                            i17 = 65536;
                        }
                    }
                    i18 = i12;
                    if (i13 != 4 && (374491 & i18) == 74898 && composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.skipToGroupEnd();
                        set2 = set;
                        modifier4 = modifier2;
                        function4 = function2;
                    } else {
                        if (i19 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            of2 = bk.w.setOf((Object[]) new DismissDirection[]{DismissDirection.EndToStart, DismissDirection.StartToEnd});
                        } else {
                            of2 = set;
                        }
                        if (i14 != 0) {
                            function3 = a.f7861p0;
                        } else {
                            function3 = function2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(634380143, i18, -1, "androidx.compose.material.SwipeToDismiss (SwipeToDismiss.kt:172)");
                        }
                        BoxWithConstraintsKt.BoxWithConstraints(modifier3, null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 338007641, true, new b(of2, function3, i18, state, background, dismissContent)), composerStartRestartGroup, ((i18 >> 3) & 14) | 3072, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        set2 = of2;
                        function4 = function3;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new c(state, modifier4, set2, function4, background, dismissContent, i10, i11));
                }
                i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                i12 |= i17;
                i18 = i12;
                if (i13 != 4) {
                    if (i19 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        of2 = bk.w.setOf((Object[]) new DismissDirection[]{DismissDirection.EndToStart, DismissDirection.StartToEnd});
                    } else {
                        of2 = set;
                    }
                    if (i14 != 0) {
                        function3 = a.f7861p0;
                    } else {
                        function3 = function2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(634380143, i18, -1, "androidx.compose.material.SwipeToDismiss (SwipeToDismiss.kt:172)");
                    }
                    BoxWithConstraintsKt.BoxWithConstraints(modifier3, null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 338007641, true, new b(of2, function3, i18, state, background, dismissContent)), composerStartRestartGroup, ((i18 >> 3) & 14) | 3072, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    set2 = of2;
                    function4 = function3;
                } else {
                    if (i19 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        of2 = bk.w.setOf((Object[]) new DismissDirection[]{DismissDirection.EndToStart, DismissDirection.StartToEnd});
                    } else {
                        of2 = set;
                    }
                    if (i14 != 0) {
                        function3 = a.f7861p0;
                    } else {
                        function3 = function2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(634380143, i18, -1, "androidx.compose.material.SwipeToDismiss (SwipeToDismiss.kt:172)");
                    }
                    BoxWithConstraintsKt.BoxWithConstraints(modifier3, null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 338007641, true, new b(of2, function3, i18, state, background, dismissContent)), composerStartRestartGroup, ((i18 >> 3) & 14) | 3072, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    set2 = of2;
                    function4 = function3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new c(state, modifier4, set2, function4, background, dismissContent, i10, i11));
            }
            i12 |= 3072;
            function2 = function1;
            if ((i11 & 16) != 0) {
                i12 |= 24576;
            } else if ((57344 & i10) == 0) {
                if (composerStartRestartGroup.changedInstance(background)) {
                    i16 = 16384;
                } else {
                    i16 = 8192;
                }
                i12 |= i16;
            }
            if ((i11 & 32) != 0) {
                if ((458752 & i10) == 0) {
                    if (composerStartRestartGroup.changedInstance(dismissContent)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                }
                i18 = i12;
                if (i13 != 4) {
                    if (i19 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        of2 = bk.w.setOf((Object[]) new DismissDirection[]{DismissDirection.EndToStart, DismissDirection.StartToEnd});
                    } else {
                        of2 = set;
                    }
                    if (i14 != 0) {
                        function3 = a.f7861p0;
                    } else {
                        function3 = function2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(634380143, i18, -1, "androidx.compose.material.SwipeToDismiss (SwipeToDismiss.kt:172)");
                    }
                    BoxWithConstraintsKt.BoxWithConstraints(modifier3, null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 338007641, true, new b(of2, function3, i18, state, background, dismissContent)), composerStartRestartGroup, ((i18 >> 3) & 14) | 3072, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    set2 = of2;
                    function4 = function3;
                } else {
                    if (i19 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        of2 = bk.w.setOf((Object[]) new DismissDirection[]{DismissDirection.EndToStart, DismissDirection.StartToEnd});
                    } else {
                        of2 = set;
                    }
                    if (i14 != 0) {
                        function3 = a.f7861p0;
                    } else {
                        function3 = function2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(634380143, i18, -1, "androidx.compose.material.SwipeToDismiss (SwipeToDismiss.kt:172)");
                    }
                    BoxWithConstraintsKt.BoxWithConstraints(modifier3, null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 338007641, true, new b(of2, function3, i18, state, background, dismissContent)), composerStartRestartGroup, ((i18 >> 3) & 14) | 3072, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    set2 = of2;
                    function4 = function3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new c(state, modifier4, set2, function4, background, dismissContent, i10, i11));
            }
            i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            i12 |= i17;
            i18 = i12;
            if (i13 != 4) {
                if (i19 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    of2 = bk.w.setOf((Object[]) new DismissDirection[]{DismissDirection.EndToStart, DismissDirection.StartToEnd});
                } else {
                    of2 = set;
                }
                if (i14 != 0) {
                    function3 = a.f7861p0;
                } else {
                    function3 = function2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(634380143, i18, -1, "androidx.compose.material.SwipeToDismiss (SwipeToDismiss.kt:172)");
                }
                BoxWithConstraintsKt.BoxWithConstraints(modifier3, null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 338007641, true, new b(of2, function3, i18, state, background, dismissContent)), composerStartRestartGroup, ((i18 >> 3) & 14) | 3072, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                set2 = of2;
                function4 = function3;
            } else {
                if (i19 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    of2 = bk.w.setOf((Object[]) new DismissDirection[]{DismissDirection.EndToStart, DismissDirection.StartToEnd});
                } else {
                    of2 = set;
                }
                if (i14 != 0) {
                    function3 = a.f7861p0;
                } else {
                    function3 = function2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(634380143, i18, -1, "androidx.compose.material.SwipeToDismiss (SwipeToDismiss.kt:172)");
                }
                BoxWithConstraintsKt.BoxWithConstraints(modifier3, null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 338007641, true, new b(of2, function3, i18, state, background, dismissContent)), composerStartRestartGroup, ((i18 >> 3) & 14) | 3072, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                set2 = of2;
                function4 = function3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new c(state, modifier4, set2, function4, background, dismissContent, i10, i11));
        }
        i12 |= 48;
        modifier2 = modifier;
        i13 = i11 & 4;
        if (i13 != 0) {
            i12 |= 128;
        }
        i14 = i11 & 8;
        if (i14 != 0) {
            if ((i10 & 7168) == 0) {
                function2 = function1;
                if (composerStartRestartGroup.changedInstance(function2)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i12 |= i15;
            }
            if ((i11 & 16) != 0) {
                i12 |= 24576;
            } else if ((57344 & i10) == 0) {
                if (composerStartRestartGroup.changedInstance(background)) {
                    i16 = 16384;
                } else {
                    i16 = 8192;
                }
                i12 |= i16;
            }
            if ((i11 & 32) != 0) {
                if ((458752 & i10) == 0) {
                    if (composerStartRestartGroup.changedInstance(dismissContent)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                }
                i18 = i12;
                if (i13 != 4) {
                    if (i19 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        of2 = bk.w.setOf((Object[]) new DismissDirection[]{DismissDirection.EndToStart, DismissDirection.StartToEnd});
                    } else {
                        of2 = set;
                    }
                    if (i14 != 0) {
                        function3 = a.f7861p0;
                    } else {
                        function3 = function2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(634380143, i18, -1, "androidx.compose.material.SwipeToDismiss (SwipeToDismiss.kt:172)");
                    }
                    BoxWithConstraintsKt.BoxWithConstraints(modifier3, null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 338007641, true, new b(of2, function3, i18, state, background, dismissContent)), composerStartRestartGroup, ((i18 >> 3) & 14) | 3072, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    set2 = of2;
                    function4 = function3;
                } else {
                    if (i19 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        of2 = bk.w.setOf((Object[]) new DismissDirection[]{DismissDirection.EndToStart, DismissDirection.StartToEnd});
                    } else {
                        of2 = set;
                    }
                    if (i14 != 0) {
                        function3 = a.f7861p0;
                    } else {
                        function3 = function2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(634380143, i18, -1, "androidx.compose.material.SwipeToDismiss (SwipeToDismiss.kt:172)");
                    }
                    BoxWithConstraintsKt.BoxWithConstraints(modifier3, null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 338007641, true, new b(of2, function3, i18, state, background, dismissContent)), composerStartRestartGroup, ((i18 >> 3) & 14) | 3072, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    set2 = of2;
                    function4 = function3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new c(state, modifier4, set2, function4, background, dismissContent, i10, i11));
            }
            i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            i12 |= i17;
            i18 = i12;
            if (i13 != 4) {
                if (i19 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    of2 = bk.w.setOf((Object[]) new DismissDirection[]{DismissDirection.EndToStart, DismissDirection.StartToEnd});
                } else {
                    of2 = set;
                }
                if (i14 != 0) {
                    function3 = a.f7861p0;
                } else {
                    function3 = function2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(634380143, i18, -1, "androidx.compose.material.SwipeToDismiss (SwipeToDismiss.kt:172)");
                }
                BoxWithConstraintsKt.BoxWithConstraints(modifier3, null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 338007641, true, new b(of2, function3, i18, state, background, dismissContent)), composerStartRestartGroup, ((i18 >> 3) & 14) | 3072, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                set2 = of2;
                function4 = function3;
            } else {
                if (i19 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    of2 = bk.w.setOf((Object[]) new DismissDirection[]{DismissDirection.EndToStart, DismissDirection.StartToEnd});
                } else {
                    of2 = set;
                }
                if (i14 != 0) {
                    function3 = a.f7861p0;
                } else {
                    function3 = function2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(634380143, i18, -1, "androidx.compose.material.SwipeToDismiss (SwipeToDismiss.kt:172)");
                }
                BoxWithConstraintsKt.BoxWithConstraints(modifier3, null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 338007641, true, new b(of2, function3, i18, state, background, dismissContent)), composerStartRestartGroup, ((i18 >> 3) & 14) | 3072, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                set2 = of2;
                function4 = function3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new c(state, modifier4, set2, function4, background, dismissContent, i10, i11));
        }
        i12 |= 3072;
        function2 = function1;
        if ((i11 & 16) != 0) {
            i12 |= 24576;
        } else if ((57344 & i10) == 0) {
            if (composerStartRestartGroup.changedInstance(background)) {
                i16 = 16384;
            } else {
                i16 = 8192;
            }
            i12 |= i16;
        }
        if ((i11 & 32) != 0) {
            if ((458752 & i10) == 0) {
                if (composerStartRestartGroup.changedInstance(dismissContent)) {
                    i17 = 131072;
                } else {
                    i17 = 65536;
                }
            }
            i18 = i12;
            if (i13 != 4) {
                if (i19 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    of2 = bk.w.setOf((Object[]) new DismissDirection[]{DismissDirection.EndToStart, DismissDirection.StartToEnd});
                } else {
                    of2 = set;
                }
                if (i14 != 0) {
                    function3 = a.f7861p0;
                } else {
                    function3 = function2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(634380143, i18, -1, "androidx.compose.material.SwipeToDismiss (SwipeToDismiss.kt:172)");
                }
                BoxWithConstraintsKt.BoxWithConstraints(modifier3, null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 338007641, true, new b(of2, function3, i18, state, background, dismissContent)), composerStartRestartGroup, ((i18 >> 3) & 14) | 3072, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                set2 = of2;
                function4 = function3;
            } else {
                if (i19 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    of2 = bk.w.setOf((Object[]) new DismissDirection[]{DismissDirection.EndToStart, DismissDirection.StartToEnd});
                } else {
                    of2 = set;
                }
                if (i14 != 0) {
                    function3 = a.f7861p0;
                } else {
                    function3 = function2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(634380143, i18, -1, "androidx.compose.material.SwipeToDismiss (SwipeToDismiss.kt:172)");
                }
                BoxWithConstraintsKt.BoxWithConstraints(modifier3, null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 338007641, true, new b(of2, function3, i18, state, background, dismissContent)), composerStartRestartGroup, ((i18 >> 3) & 14) | 3072, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                set2 = of2;
                function4 = function3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new c(state, modifier4, set2, function4, background, dismissContent, i10, i11));
        }
        i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        i12 |= i17;
        i18 = i12;
        if (i13 != 4) {
            if (i19 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i13 != 0) {
                of2 = bk.w.setOf((Object[]) new DismissDirection[]{DismissDirection.EndToStart, DismissDirection.StartToEnd});
            } else {
                of2 = set;
            }
            if (i14 != 0) {
                function3 = a.f7861p0;
            } else {
                function3 = function2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(634380143, i18, -1, "androidx.compose.material.SwipeToDismiss (SwipeToDismiss.kt:172)");
            }
            BoxWithConstraintsKt.BoxWithConstraints(modifier3, null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 338007641, true, new b(of2, function3, i18, state, background, dismissContent)), composerStartRestartGroup, ((i18 >> 3) & 14) | 3072, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
            set2 = of2;
            function4 = function3;
        } else {
            if (i19 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i13 != 0) {
                of2 = bk.w.setOf((Object[]) new DismissDirection[]{DismissDirection.EndToStart, DismissDirection.StartToEnd});
            } else {
                of2 = set;
            }
            if (i14 != 0) {
                function3 = a.f7861p0;
            } else {
                function3 = function2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(634380143, i18, -1, "androidx.compose.material.SwipeToDismiss (SwipeToDismiss.kt:172)");
            }
            BoxWithConstraintsKt.BoxWithConstraints(modifier3, null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 338007641, true, new b(of2, function3, i18, state, background, dismissContent)), composerStartRestartGroup, ((i18 >> 3) & 14) | 3072, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
            set2 = of2;
            function4 = function3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new c(state, modifier4, set2, function4, background, dismissContent, i10, i11));
    }

    public static final DismissDirection access$getDismissDirection(DismissValue dismissValue, DismissValue dismissValue2) {
        if (dismissValue == dismissValue2 && dismissValue == DismissValue.Default) {
            return null;
        }
        if (dismissValue == dismissValue2 && dismissValue == DismissValue.DismissedToEnd) {
            return DismissDirection.StartToEnd;
        }
        if (dismissValue == dismissValue2 && dismissValue == DismissValue.DismissedToStart) {
            return DismissDirection.EndToStart;
        }
        DismissValue dismissValue3 = DismissValue.Default;
        if (dismissValue == dismissValue3 && dismissValue2 == DismissValue.DismissedToEnd) {
            return DismissDirection.StartToEnd;
        }
        if (dismissValue == dismissValue3 && dismissValue2 == DismissValue.DismissedToStart) {
            return DismissDirection.EndToStart;
        }
        if (dismissValue == DismissValue.DismissedToEnd && dismissValue2 == dismissValue3) {
            return DismissDirection.StartToEnd;
        }
        if (dismissValue == DismissValue.DismissedToStart && dismissValue2 == dismissValue3) {
            return DismissDirection.EndToStart;
        }
        return null;
    }

    @Composable
    @ExperimentalMaterialApi
    @NotNull
    public static final DismissState rememberDismissState(@Nullable DismissValue dismissValue, @Nullable Function1<? super DismissValue, Boolean> function1, @Nullable Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(-1753522702);
        if ((i11 & 1) != 0) {
            dismissValue = DismissValue.Default;
        }
        if ((i11 & 2) != 0) {
            function1 = d.f7875p0;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1753522702, i10, -1, "androidx.compose.material.rememberDismissState (SwipeToDismiss.kt:148)");
        }
        Object[] objArr = new Object[0];
        Saver<DismissState, DismissValue> Saver = DismissState.INSTANCE.Saver(function1);
        composer.startReplaceableGroup(511388516);
        boolean zChanged = composer.changed(dismissValue) | composer.changed(function1);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new e(dismissValue, function1);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        DismissState dismissState = (DismissState) RememberSaveableKt.m2165rememberSaveable(objArr, (Saver) Saver, (String) null, (Function0) objRememberedValue, composer, 72, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return dismissState;
    }
}
