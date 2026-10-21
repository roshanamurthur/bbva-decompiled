package androidx.compose.material;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
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
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import com.vierge.bluetoothlibrary.BluetoothState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AlertDialog.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a~\u0010\u000f\u001a\u00020\u00012\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0015\b\u0002\u0010\u0006\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00022\u0015\b\u0002\u0010\u0007\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\nH\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a=\u0010\u0011\u001a\u00020\u0001*\u00020\u00102\u0013\u0010\u0006\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00022\u0013\u0010\u0007\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u0002H\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001a8\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0011\u0010\u0016\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0002H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "buttons", "Landroidx/compose/ui/Modifier;", "modifier", "title", "text", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/ui/graphics/Color;", "backgroundColor", "contentColor", "AlertDialogContent-WMdw5o4", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/runtime/Composer;II)V", "AlertDialogContent", "Landroidx/compose/foundation/layout/ColumnScope;", "AlertDialogBaselineLayout", "(Landroidx/compose/foundation/layout/ColumnScope;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/unit/Dp;", "mainAxisSpacing", "crossAxisSpacing", "content", "AlertDialogFlowRow-ixp7dh8", "(FFLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "AlertDialogFlowRow", "material_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAlertDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlertDialog.kt\nandroidx/compose/material/AlertDialogKt\n+ 2 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/Updater\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,292:1\n78#2,11:293\n78#2,11:327\n91#2:359\n78#2,11:367\n91#2:399\n91#2:404\n75#2,14:405\n91#2:439\n456#3,8:304\n464#3,3:318\n456#3,8:338\n464#3,3:352\n467#3,3:356\n456#3,8:378\n464#3,3:392\n467#3,3:396\n467#3,3:401\n456#3,8:419\n464#3,6:433\n4144#4,6:312\n4144#4,6:346\n4144#4,6:386\n4144#4,6:427\n66#5,6:321\n72#5:355\n76#5:360\n66#5,6:361\n72#5:395\n76#5:400\n154#6:440\n154#6:441\n*S KotlinDebug\n*F\n+ 1 AlertDialog.kt\nandroidx/compose/material/AlertDialogKt\n*L\n97#1:293,11\n100#1:327,11\n100#1:359\n105#1:367,11\n105#1:399\n97#1:404\n193#1:405,14\n193#1:439\n97#1:304,8\n97#1:318,3\n100#1:338,8\n100#1:352,3\n100#1:356,3\n105#1:378,8\n105#1:392,3\n105#1:396,3\n97#1:401,3\n193#1:419,8\n193#1:433,6\n97#1:312,6\n100#1:346,6\n105#1:386,6\n193#1:427,6\n100#1:321,6\n100#1:355\n100#1:360\n105#1:361,6\n105#1:395\n105#1:400\n283#1:440\n284#1:441\n*E\n"})
public final class AlertDialogKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Modifier f6497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final Modifier f6498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f6499c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f6500d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f6501e;

    /* JADX INFO: compiled from: AlertDialog.kt */
    @SourceDebugExtension({"SMAP\nAlertDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlertDialog.kt\nandroidx/compose/material/AlertDialogKt$AlertDialogBaselineLayout$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,292:1\n288#2,2:293\n288#2,2:295\n1#3:297\n*S KotlinDebug\n*F\n+ 1 AlertDialog.kt\nandroidx/compose/material/AlertDialogKt$AlertDialogBaselineLayout$2\n*L\n114#1:293,2\n117#1:295,2\n*E\n"})
    public static final class a implements MeasurePolicy {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f6502a = new a();

        /* JADX INFO: renamed from: androidx.compose.material.AlertDialogKt$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: AlertDialog.kt */
        public static final class C0043a extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ Placeable f6503p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ int f6504q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public final /* synthetic */ Placeable f6505r0;

            /* JADX INFO: renamed from: s0, reason: collision with root package name */
            public final /* synthetic */ int f6506s0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0043a(Placeable placeable, int i10, Placeable placeable2, int i11) {
                super(1);
                this.f6503p0 = placeable;
                this.f6504q0 = i10;
                this.f6505r0 = placeable2;
                this.f6506s0 = i11;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope layout = placementScope;
                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                Placeable placeable = this.f6503p0;
                if (placeable != null) {
                    Placeable.PlacementScope.place$default(layout, placeable, 0, this.f6504q0, 0.0f, 4, null);
                }
                Placeable placeable2 = this.f6505r0;
                if (placeable2 != null) {
                    Placeable.PlacementScope.place$default(layout, placeable2, 0, this.f6506s0, 0.0f, 4, null);
                }
                return Unit.INSTANCE;
            }
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public final /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
            return g1.f.a(this, intrinsicMeasureScope, list, i10);
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public final /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
            return g1.f.b(this, intrinsicMeasureScope, list, i10);
        }

        /* JADX WARN: Code duplicated, block: B:39:0x00b1  */
        /* JADX WARN: Code duplicated, block: B:47:0x00cb  */
        /* JADX WARN: Code duplicated, block: B:56:0x00ed  */
        @Override // androidx.compose.ui.layout.MeasurePolicy
        @NotNull
        /* JADX INFO: renamed from: measure-3p2s80s */
        public final MeasureResult mo113measure3p2s80s(@NotNull MeasureScope Layout, @NotNull List<? extends Measurable> measurables, long j10) {
            Object next;
            Object next2;
            int iIntValue;
            int iIntValue2;
            int iIntValue3;
            int i10;
            Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            List<? extends Measurable> list = measurables;
            Iterator<T> it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.areEqual(LayoutIdKt.getLayoutId((Measurable) next), "title"));
            Measurable measurable = (Measurable) next;
            Placeable placeableMo3575measureBRTryo0 = measurable != null ? measurable.mo3575measureBRTryo0(Constraints.m4349copyZbe2FdA$default(j10, 0, 0, 0, 0, 11, null)) : null;
            Iterator<T> it2 = list.iterator();
            do {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
            } while (!Intrinsics.areEqual(LayoutIdKt.getLayoutId((Measurable) next2), "text"));
            Measurable measurable2 = (Measurable) next2;
            Placeable placeableMo3575measureBRTryo1 = measurable2 != null ? measurable2.mo3575measureBRTryo0(Constraints.m4349copyZbe2FdA$default(j10, 0, 0, 0, 0, 11, null)) : null;
            int height = 0;
            int iMax = Math.max(placeableMo3575measureBRTryo0 != null ? placeableMo3575measureBRTryo0.getWidth() : 0, placeableMo3575measureBRTryo1 != null ? placeableMo3575measureBRTryo1.getWidth() : 0);
            if (placeableMo3575measureBRTryo0 == null) {
                iIntValue = 0;
            } else {
                int iIntValue4 = Integer.valueOf(placeableMo3575measureBRTryo0.get(AlignmentLineKt.getFirstBaseline())).intValue();
                Integer numValueOf = iIntValue4 == Integer.MIN_VALUE ? null : Integer.valueOf(iIntValue4);
                if (numValueOf != null) {
                    iIntValue = numValueOf.intValue();
                } else {
                    iIntValue = 0;
                }
            }
            if (placeableMo3575measureBRTryo0 == null) {
                iIntValue2 = 0;
            } else {
                int i11 = placeableMo3575measureBRTryo0.get(AlignmentLineKt.getLastBaseline());
                Integer numValueOf2 = i11 == Integer.MIN_VALUE ? null : Integer.valueOf(i11);
                if (numValueOf2 != null) {
                    iIntValue2 = numValueOf2.intValue();
                } else {
                    iIntValue2 = 0;
                }
            }
            int iMo412roundToPxR2X_6o = Layout.mo412roundToPxR2X_6o(AlertDialogKt.f6499c) - iIntValue;
            if (placeableMo3575measureBRTryo1 == null) {
                iIntValue3 = 0;
            } else {
                int i12 = placeableMo3575measureBRTryo1.get(AlignmentLineKt.getFirstBaseline());
                Integer numValueOf3 = i12 != Integer.MIN_VALUE ? Integer.valueOf(i12) : null;
                if (numValueOf3 != null) {
                    iIntValue3 = numValueOf3.intValue();
                } else {
                    iIntValue3 = 0;
                }
            }
            int iMo412roundToPxR2X_6o2 = placeableMo3575measureBRTryo0 == null ? Layout.mo412roundToPxR2X_6o(AlertDialogKt.f6501e) : Layout.mo412roundToPxR2X_6o(AlertDialogKt.f6500d);
            int height2 = placeableMo3575measureBRTryo0 != null ? placeableMo3575measureBRTryo0.getHeight() + iMo412roundToPxR2X_6o : 0;
            if (placeableMo3575measureBRTryo0 == null) {
                i10 = iMo412roundToPxR2X_6o2 - iIntValue3;
            } else {
                i10 = (iIntValue2 == 0 ? height2 - iIntValue3 : (iMo412roundToPxR2X_6o + iIntValue2) - iIntValue3) + iMo412roundToPxR2X_6o2;
            }
            if (placeableMo3575measureBRTryo1 != null) {
                if (iIntValue2 == 0) {
                    height = (placeableMo3575measureBRTryo1.getHeight() + iMo412roundToPxR2X_6o2) - iIntValue3;
                } else {
                    height = ((placeableMo3575measureBRTryo1.getHeight() + iMo412roundToPxR2X_6o2) - iIntValue3) - ((placeableMo3575measureBRTryo0 != null ? placeableMo3575measureBRTryo0.getHeight() : 0) - iIntValue2);
                }
            }
            return MeasureScope.CC.q(Layout, iMax, height + height2, null, new C0043a(placeableMo3575measureBRTryo0, iMo412roundToPxR2X_6o, placeableMo3575measureBRTryo1, i10), 4, null);
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public final /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
            return g1.f.c(this, intrinsicMeasureScope, list, i10);
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public final /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
            return g1.f.d(this, intrinsicMeasureScope, list, i10);
        }
    }

    /* JADX INFO: compiled from: AlertDialog.kt */
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ ColumnScope f6507p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f6508q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f6509r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f6510s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(ColumnScope columnScope, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function3, int i10) {
            super(2);
            this.f6507p0 = columnScope;
            this.f6508q0 = function2;
            this.f6509r0 = function3;
            this.f6510s0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f6510s0 | 1);
            Function2<Composer, Integer, Unit> function2 = this.f6508q0;
            Function2<Composer, Integer, Unit> function3 = this.f6509r0;
            AlertDialogKt.AlertDialogBaselineLayout(this.f6507p0, function2, function3, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: AlertDialog.kt */
    @SourceDebugExtension({"SMAP\nAlertDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlertDialog.kt\nandroidx/compose/material/AlertDialogKt$AlertDialogContent$1\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,292:1\n71#2,7:293\n78#2:328\n82#2:333\n78#3,11:300\n91#3:332\n456#4,8:311\n464#4,3:325\n467#4,3:329\n4144#5,6:319\n*S KotlinDebug\n*F\n+ 1 AlertDialog.kt\nandroidx/compose/material/AlertDialogKt$AlertDialogContent$1\n*L\n59#1:293,7\n59#1:328\n59#1:333\n59#1:300,11\n59#1:332\n59#1:311,8\n59#1:325,3\n59#1:329,3\n59#1:319,6\n*E\n"})
    public static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f6511p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f6512q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f6513r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f6514s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i10, Function2 function2, Function2 function3, Function2 function4) {
            super(2);
            this.f6511p0 = function2;
            this.f6512q0 = function3;
            this.f6513r0 = function4;
            this.f6514s0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(629950291, iIntValue, -1, "androidx.compose.material.AlertDialogContent.<anonymous> (AlertDialog.kt:57)");
                }
                composer2.startReplaceableGroup(-483455358);
                Modifier.Companion companion = Modifier.INSTANCE;
                MeasurePolicy measurePolicyA = androidx.camera.core.impl.v.a(Alignment.INSTANCE, Arrangement.INSTANCE.getTop(), composer2, 0, -1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
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
                Function2 function2C = com.google.android.gms.measurement.internal.a.c(companion2, composerM2074constructorimpl, measurePolicyA, composerM2074constructorimpl, currentCompositionLocalMap);
                if (composerM2074constructorimpl.getInserting() || !Intrinsics.areEqual(composerM2074constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                }
                ai.a.j(0, function3ModifierMaterializerOf, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composer2)), composer2, 2058660585);
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                Function2<Composer, Integer, Unit> function2 = this.f6511p0;
                int i10 = this.f6514s0;
                ComposableLambda composableLambda = function2 != null ? ComposableLambdaKt.composableLambda(composer2, 620104160, true, new androidx.compose.material.b(i10, function2)) : null;
                Function2<Composer, Integer, Unit> function3 = this.f6512q0;
                AlertDialogKt.AlertDialogBaselineLayout(columnScopeInstance, composableLambda, function3 != null ? ComposableLambdaKt.composableLambda(composer2, 1965858367, true, new androidx.compose.material.d(i10, function3)) : null, composer2, 6);
                if (androidx.appcompat.widget.g0.d(this.f6513r0, composer2, Integer.valueOf(i10 & 14))) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: AlertDialog.kt */
    public static final class d extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f6515p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Modifier f6516q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f6517r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f6518s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Shape f6519t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ long f6520u0;
        public final /* synthetic */ long v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ int f6521w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ int f6522x0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function4, Shape shape, long j10, long j11, int i10, int i11) {
            super(2);
            this.f6515p0 = function2;
            this.f6516q0 = modifier;
            this.f6517r0 = function3;
            this.f6518s0 = function4;
            this.f6519t0 = shape;
            this.f6520u0 = j10;
            this.v0 = j11;
            this.f6521w0 = i10;
            this.f6522x0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            AlertDialogKt.m651AlertDialogContentWMdw5o4(this.f6515p0, this.f6516q0, this.f6517r0, this.f6518s0, this.f6519t0, this.f6520u0, this.v0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f6521w0 | 1), this.f6522x0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: AlertDialog.kt */
    public static final class e implements MeasurePolicy {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ float f6523a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ float f6524b;

        /* JADX INFO: compiled from: AlertDialog.kt */
        @SourceDebugExtension({"SMAP\nAlertDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlertDialog.kt\nandroidx/compose/material/AlertDialogKt$AlertDialogFlowRow$1$measure$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,292:1\n69#2,4:293\n69#2,6:297\n74#2:303\n*S KotlinDebug\n*F\n+ 1 AlertDialog.kt\nandroidx/compose/material/AlertDialogKt$AlertDialogFlowRow$1$measure$1\n*L\n260#1:293,4\n272#1:297,6\n260#1:303\n*E\n"})
        public static final class a extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ List<List<Placeable>> f6525p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ MeasureScope f6526q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public final /* synthetic */ float f6527r0;

            /* JADX INFO: renamed from: s0, reason: collision with root package name */
            public final /* synthetic */ int f6528s0;

            /* JADX INFO: renamed from: t0, reason: collision with root package name */
            public final /* synthetic */ List<Integer> f6529t0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ArrayList arrayList, MeasureScope measureScope, float f6, int i10, ArrayList arrayList2) {
                super(1);
                this.f6525p0 = arrayList;
                this.f6526q0 = measureScope;
                this.f6527r0 = f6;
                this.f6528s0 = i10;
                this.f6529t0 = arrayList2;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(Placeable.PlacementScope placementScope) {
                MeasureScope measureScope;
                Placeable.PlacementScope layout = placementScope;
                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                List<List<Placeable>> list = this.f6525p0;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    List<Placeable> list2 = list.get(i10);
                    int size2 = list2.size();
                    int[] iArr = new int[size2];
                    int i11 = 0;
                    while (true) {
                        measureScope = this.f6526q0;
                        if (i11 >= size2) {
                            break;
                        }
                        iArr[i11] = list2.get(i11).getWidth() + (i11 < CollectionsKt__CollectionsKt.getLastIndex(list2) ? measureScope.mo413roundToPx0680j_4(this.f6527r0) : 0);
                        i11++;
                    }
                    Arrangement.Vertical bottom = Arrangement.INSTANCE.getBottom();
                    int[] iArr2 = new int[size2];
                    for (int i12 = 0; i12 < size2; i12++) {
                        iArr2[i12] = 0;
                    }
                    bottom.arrange(measureScope, this.f6528s0, iArr, iArr2);
                    int size3 = list2.size();
                    for (int i13 = 0; i13 < size3; i13++) {
                        Placeable.PlacementScope.place$default(layout, list2.get(i13), iArr2[i13], this.f6529t0.get(i10).intValue(), 0.0f, 4, null);
                    }
                }
                return Unit.INSTANCE;
            }
        }

        public e(float f6, float f10) {
            this.f6523a = f6;
            this.f6524b = f10;
        }

        public static final void a(ArrayList arrayList, Ref.IntRef intRef, MeasureScope measureScope, float f6, ArrayList arrayList2, ArrayList arrayList3, Ref.IntRef intRef2, ArrayList arrayList4, Ref.IntRef intRef3, Ref.IntRef intRef4) {
            if (!arrayList.isEmpty()) {
                intRef.element = measureScope.mo413roundToPx0680j_4(f6) + intRef.element;
            }
            arrayList.add(0, CollectionsKt___CollectionsKt.toList(arrayList2));
            arrayList3.add(Integer.valueOf(intRef2.element));
            arrayList4.add(Integer.valueOf(intRef.element));
            intRef.element += intRef2.element;
            intRef3.element = Math.max(intRef3.element, intRef4.element);
            arrayList2.clear();
            intRef4.element = 0;
            intRef2.element = 0;
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public final /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
            return g1.f.a(this, intrinsicMeasureScope, list, i10);
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public final /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
            return g1.f.b(this, intrinsicMeasureScope, list, i10);
        }

        /* JADX WARN: Code duplicated, block: B:9:0x0078  */
        @Override // androidx.compose.ui.layout.MeasurePolicy
        @NotNull
        /* JADX INFO: renamed from: measure-3p2s80s */
        public final MeasureResult mo113measure3p2s80s(@NotNull MeasureScope Layout, @NotNull List<? extends Measurable> measurables, long j10) {
            e eVar;
            Ref.IntRef intRef;
            Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            Ref.IntRef intRef2 = new Ref.IntRef();
            Ref.IntRef intRef3 = new Ref.IntRef();
            ArrayList arrayList4 = new ArrayList();
            Ref.IntRef intRef4 = new Ref.IntRef();
            Ref.IntRef intRef5 = new Ref.IntRef();
            long jConstraints$default = ConstraintsKt.Constraints$default(0, Constraints.m4357getMaxWidthimpl(j10), 0, 0, 13, null);
            Iterator<? extends Measurable> it = measurables.iterator();
            while (it.hasNext()) {
                Placeable placeableMo3575measureBRTryo0 = it.next().mo3575measureBRTryo0(jConstraints$default);
                boolean zIsEmpty = arrayList4.isEmpty();
                float f6 = this.f6523a;
                if (zIsEmpty) {
                    intRef = intRef4;
                } else {
                    if (placeableMo3575measureBRTryo0.getWidth() + Layout.mo413roundToPx0680j_4(f6) + intRef4.element <= Constraints.m4357getMaxWidthimpl(j10)) {
                        intRef = intRef4;
                    } else {
                        intRef = intRef4;
                        a(arrayList, intRef3, Layout, this.f6524b, arrayList4, arrayList2, intRef5, arrayList3, intRef2, intRef);
                    }
                }
                Ref.IntRef intRef6 = intRef;
                if (!arrayList4.isEmpty()) {
                    intRef6.element = Layout.mo413roundToPx0680j_4(f6) + intRef6.element;
                }
                ArrayList arrayList5 = arrayList4;
                arrayList5.add(placeableMo3575measureBRTryo0);
                intRef6.element = placeableMo3575measureBRTryo0.getWidth() + intRef6.element;
                intRef5 = intRef5;
                intRef5.element = Math.max(intRef5.element, placeableMo3575measureBRTryo0.getHeight());
                arrayList4 = arrayList5;
                intRef4 = intRef6;
                arrayList = arrayList;
                jConstraints$default = jConstraints$default;
                intRef3 = intRef3;
            }
            ArrayList arrayList6 = arrayList4;
            Ref.IntRef intRef7 = intRef3;
            ArrayList arrayList7 = arrayList;
            Ref.IntRef intRef8 = intRef4;
            if (!arrayList6.isEmpty()) {
                eVar = this;
                a(arrayList7, intRef7, Layout, eVar.f6524b, arrayList6, arrayList2, intRef5, arrayList3, intRef2, intRef8);
            } else {
                eVar = this;
            }
            int iM4357getMaxWidthimpl = Constraints.m4357getMaxWidthimpl(j10) != Integer.MAX_VALUE ? Constraints.m4357getMaxWidthimpl(j10) : Math.max(intRef2.element, Constraints.m4359getMinWidthimpl(j10));
            return MeasureScope.CC.q(Layout, iM4357getMaxWidthimpl, Math.max(intRef7.element, Constraints.m4358getMinHeightimpl(j10)), null, new a(arrayList7, Layout, eVar.f6523a, iM4357getMaxWidthimpl, arrayList3), 4, null);
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public final /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
            return g1.f.c(this, intrinsicMeasureScope, list, i10);
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public final /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
            return g1.f.d(this, intrinsicMeasureScope, list, i10);
        }
    }

    /* JADX INFO: compiled from: AlertDialog.kt */
    public static final class f extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ float f6530p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ float f6531q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f6532r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f6533s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(float f6, float f10, Function2<? super Composer, ? super Integer, Unit> function2, int i10) {
            super(2);
            this.f6530p0 = f6;
            this.f6531q0 = f10;
            this.f6532r0 = function2;
            this.f6533s0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f6533s0 | 1);
            float f6 = this.f6531q0;
            Function2<Composer, Integer, Unit> function2 = this.f6532r0;
            AlertDialogKt.m652AlertDialogFlowRowixp7dh8(this.f6530p0, f6, function2, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    static {
        Modifier.Companion companion = Modifier.INSTANCE;
        float f6 = 24;
        f6497a = PaddingKt.m300paddingqDBjuR0$default(companion, Dp.m4389constructorimpl(f6), 0.0f, Dp.m4389constructorimpl(f6), 0.0f, 10, null);
        f6498b = PaddingKt.m300paddingqDBjuR0$default(companion, Dp.m4389constructorimpl(f6), 0.0f, Dp.m4389constructorimpl(f6), Dp.m4389constructorimpl(28), 2, null);
        f6499c = TextUnitKt.getSp(40);
        f6500d = TextUnitKt.getSp(36);
        f6501e = TextUnitKt.getSp(38);
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void AlertDialogBaselineLayout(@NotNull ColumnScope columnScope, @Nullable Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Function2<? super Composer, ? super Integer, Unit> function3, @Nullable Composer composer, int i10) {
        int i11;
        Intrinsics.checkNotNullParameter(columnScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(-555573207);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.changed(columnScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function3) ? 256 : 128;
        }
        if ((i11 & 731) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-555573207, i10, -1, "androidx.compose.material.AlertDialogBaselineLayout (AlertDialog.kt:92)");
            }
            Modifier modifierWeight = columnScope.weight(Modifier.INSTANCE, 1.0f, false);
            a aVar = a.f6502a;
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierWeight);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
            Updater.m2081setimpl(composerM2074constructorimpl, aVar, companion.getSetMeasurePolicy());
            Updater.m2081setimpl(composerM2074constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM2074constructorimpl.getInserting() || !Intrinsics.areEqual(composerM2074constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, setCompositeKeyHash);
            }
            ai.a.j(0, function3ModifierMaterializerOf, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            composerStartRestartGroup.startReplaceableGroup(-1160646206);
            if (function2 != null) {
                Modifier modifierLayoutId = LayoutIdKt.layoutId(f6497a, "title");
                Alignment.Companion companion2 = Alignment.INSTANCE;
                Modifier modifierAlign = columnScope.align(modifierLayoutId, companion2.getStart());
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyC = androidx.databinding.f.c(companion2, false, composerStartRestartGroup, 0, -1323940314);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor2 = companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierAlign);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM2074constructorimpl2 = Updater.m2074constructorimpl(composerStartRestartGroup);
                Function2 function2C = com.google.android.gms.measurement.internal.a.c(companion, composerM2074constructorimpl2, measurePolicyC, composerM2074constructorimpl2, currentCompositionLocalMap2);
                if (composerM2074constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM2074constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash2, composerM2074constructorimpl2, currentCompositeKeyHash2, function2C);
                }
                ai.a.j(0, function3ModifierMaterializerOf2, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                androidx.datastore.preferences.protobuf.q.e(0, function2, composerStartRestartGroup);
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(-1735756597);
            if (function3 != null) {
                Modifier modifierLayoutId2 = LayoutIdKt.layoutId(f6498b, "text");
                Alignment.Companion companion3 = Alignment.INSTANCE;
                Modifier modifierAlign2 = columnScope.align(modifierLayoutId2, companion3.getStart());
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyC2 = androidx.databinding.f.c(companion3, false, composerStartRestartGroup, 0, -1323940314);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor3 = companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierAlign2);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor3);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM2074constructorimpl3 = Updater.m2074constructorimpl(composerStartRestartGroup);
                Function2 function2C2 = com.google.android.gms.measurement.internal.a.c(companion, composerM2074constructorimpl3, measurePolicyC2, composerM2074constructorimpl3, currentCompositionLocalMap3);
                if (composerM2074constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM2074constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash3, composerM2074constructorimpl3, currentCompositeKeyHash3, function2C2);
                }
                ai.a.j(0, function3ModifierMaterializerOf3, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                androidx.datastore.preferences.protobuf.q.e(0, function3, composerStartRestartGroup);
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new b(columnScope, function2, function3, i10));
    }

    /* JADX WARN: Code duplicated, block: B:100:0x011d A[PHI: r0 r3 r4 r6 r7 r8
      0x011d: PHI (r0v8 androidx.compose.ui.Modifier) = (r0v5 androidx.compose.ui.Modifier), (r0v13 androidx.compose.ui.Modifier) binds: [B:119:0x0156, B:99:0x0118] A[DONT_GENERATE, DONT_INLINE]
      0x011d: PHI (r3v28 int) = (r3v19 int), (r3v31 int) binds: [B:119:0x0156, B:99:0x0118] A[DONT_GENERATE, DONT_INLINE]
      0x011d: PHI (r4v5 kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) = 
      (r4v2 kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>)
      (r4v6 kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>)
     binds: [B:119:0x0156, B:99:0x0118] A[DONT_GENERATE, DONT_INLINE]
      0x011d: PHI (r6v12 androidx.compose.ui.graphics.Shape) = (r6v7 androidx.compose.ui.graphics.Shape), (r6v13 androidx.compose.ui.graphics.Shape) binds: [B:119:0x0156, B:99:0x0118] A[DONT_GENERATE, DONT_INLINE]
      0x011d: PHI (r7v6 kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) = 
      (r7v3 kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>)
      (r7v2 kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>)
     binds: [B:119:0x0156, B:99:0x0118] A[DONT_GENERATE, DONT_INLINE]
      0x011d: PHI (r8v11 long) = (r8v7 long), (r8v12 long) binds: [B:119:0x0156, B:99:0x0118] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:101:0x0120 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:102:0x0122  */
    /* JADX WARN: Code duplicated, block: B:103:0x0125  */
    /* JADX WARN: Code duplicated, block: B:106:0x012a  */
    /* JADX WARN: Code duplicated, block: B:109:0x012e  */
    /* JADX WARN: Code duplicated, block: B:112:0x0134  */
    /* JADX WARN: Code duplicated, block: B:113:0x0141  */
    /* JADX WARN: Code duplicated, block: B:116:0x0146  */
    /* JADX WARN: Code duplicated, block: B:117:0x0153  */
    /* JADX WARN: Code duplicated, block: B:120:0x0158  */
    /* JADX WARN: Code duplicated, block: B:123:0x016c  */
    /* JADX WARN: Code duplicated, block: B:126:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:131:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX WARN: Code duplicated, block: B:28:0x004d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:32:0x0059  */
    /* JADX WARN: Code duplicated, block: B:33:0x005c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:39:0x0068  */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0074  */
    /* JADX WARN: Code duplicated, block: B:44:0x0077  */
    /* JADX WARN: Code duplicated, block: B:48:0x0080  */
    /* JADX WARN: Code duplicated, block: B:50:0x0084  */
    /* JADX WARN: Code duplicated, block: B:52:0x008c  */
    /* JADX WARN: Code duplicated, block: B:53:0x008f  */
    /* JADX WARN: Code duplicated, block: B:56:0x0095  */
    /* JADX WARN: Code duplicated, block: B:59:0x009c  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:72:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:81:0x00da  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:87:0x00fd  */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: AlertDialogContent-WMdw5o4, reason: not valid java name */
    public static final void m651AlertDialogContentWMdw5o4(@NotNull Function2<? super Composer, ? super Integer, Unit> buttons, @Nullable Modifier modifier, @Nullable Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Function2<? super Composer, ? super Integer, Unit> function3, @Nullable Shape shape, long j10, long j11, @Nullable Composer composer, int i10, int i11) {
        int i12;
        int i13;
        Function2<? super Composer, ? super Integer, Unit> function4;
        int i14;
        int i15;
        Function2<? super Composer, ? super Integer, Unit> function5;
        int i16;
        Shape shape2;
        long j12;
        long j13;
        Modifier modifier2;
        Function2<? super Composer, ? super Integer, Unit> function6;
        Shape medium;
        long jM717getSurface0d7_KjU;
        long j14;
        Modifier modifier3;
        Shape shape3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        Composer composerStartRestartGroup = composer.startRestartGroup(-453679601);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changedInstance(buttons) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i17 = i11 & 2;
        if (i17 == 0) {
            if ((i10 & 112) == 0) {
                i12 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & 896) == 0) {
                    function4 = function2;
                    if (composerStartRestartGroup.changedInstance(function4)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 8;
                if (i15 != 0) {
                    if ((i10 & 7168) == 0) {
                        function5 = function3;
                        if (composerStartRestartGroup.changedInstance(function5)) {
                            i16 = 2048;
                        } else {
                            i16 = 1024;
                        }
                        i12 |= i16;
                    }
                    if ((57344 & i10) == 0) {
                        if ((i11 & 16) == 0) {
                            shape2 = shape;
                            int i18 = composerStartRestartGroup.changed(shape2) ? 16384 : 8192;
                            i12 |= i18;
                        } else {
                            shape2 = shape;
                        }
                        i12 |= i18;
                    } else {
                        shape2 = shape;
                    }
                    if ((458752 & i10) == 0) {
                        if ((i11 & 32) == 0) {
                            j12 = j10;
                            int i19 = composerStartRestartGroup.changed(j12) ? 131072 : 65536;
                            i12 |= i19;
                        } else {
                            j12 = j10;
                        }
                        i12 |= i19;
                    } else {
                        j12 = j10;
                    }
                    if ((3670016 & i10) == 0) {
                        if ((i11 & 64) == 0) {
                            j13 = j11;
                            int i20 = composerStartRestartGroup.changed(j13) ? 1048576 : 524288;
                            i12 |= i20;
                        } else {
                            j13 = j11;
                        }
                        i12 |= i20;
                    } else {
                        j13 = j11;
                    }
                    if ((i12 & 2995931) == 599186 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            if (i17 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                function4 = null;
                            }
                            function6 = i15 == 0 ? function5 : null;
                            if ((i11 & 16) != 0) {
                                medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                                i12 &= -57345;
                            } else {
                                medium = shape2;
                            }
                            if ((i11 & 32) != 0) {
                                jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                                i12 &= -458753;
                            } else {
                                jM717getSurface0d7_KjU = j12;
                            }
                            if ((i11 & 64) != 0) {
                                long jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 15) & 14);
                                i12 &= -3670017;
                                j14 = jM731contentColorForek8zF_U;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-453679601, i12, -1, "androidx.compose.material.AlertDialogContent (AlertDialog.kt:43)");
                            }
                            ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 629950291, true, new c(i12, function4, function6, buttons));
                            int i21 = ((i12 >> 3) & 14) | 1572864;
                            int i22 = i12 >> 9;
                            SurfaceKt.m834SurfaceFjzlyU(modifier2, medium, jM717getSurface0d7_KjU, j14, null, 0.0f, composableLambda, composerStartRestartGroup, i21 | (i22 & 112) | (i22 & 896) | (i22 & 7168), 48);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier2;
                            shape3 = medium;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i11 & 16) != 0) {
                                i12 &= -57345;
                            }
                            if ((i11 & 32) != 0) {
                                i12 &= -458753;
                            }
                            if ((i11 & 64) != 0) {
                                i12 &= -3670017;
                            }
                            modifier2 = modifier;
                            function6 = function5;
                            medium = shape2;
                            jM717getSurface0d7_KjU = j12;
                        }
                        j14 = j13;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-453679601, i12, -1, "androidx.compose.material.AlertDialogContent (AlertDialog.kt:43)");
                        }
                        ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 629950291, true, new c(i12, function4, function6, buttons));
                        int i23 = ((i12 >> 3) & 14) | 1572864;
                        int i24 = i12 >> 9;
                        SurfaceKt.m834SurfaceFjzlyU(modifier2, medium, jM717getSurface0d7_KjU, j14, null, 0.0f, composableLambda2, composerStartRestartGroup, i23 | (i24 & 112) | (i24 & 896) | (i24 & 7168), 48);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier2;
                        shape3 = medium;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier;
                        function6 = function5;
                        shape3 = shape2;
                        jM717getSurface0d7_KjU = j12;
                        j14 = j13;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new d(buttons, modifier3, function4, function6, shape3, jM717getSurface0d7_KjU, j14, i10, i11));
                }
                i12 |= 3072;
                function5 = function3;
                if ((57344 & i10) == 0) {
                    if ((i11 & 16) == 0) {
                        shape2 = shape;
                        if (composerStartRestartGroup.changed(shape2)) {
                        }
                        i12 |= i18;
                    } else {
                        shape2 = shape;
                    }
                    i12 |= i18;
                } else {
                    shape2 = shape;
                }
                if ((458752 & i10) == 0) {
                    if ((i11 & 32) == 0) {
                        j12 = j10;
                        if (composerStartRestartGroup.changed(j12)) {
                        }
                        i12 |= i19;
                    } else {
                        j12 = j10;
                    }
                    i12 |= i19;
                } else {
                    j12 = j10;
                }
                if ((3670016 & i10) == 0) {
                    if ((i11 & 64) == 0) {
                        j13 = j11;
                        if (composerStartRestartGroup.changed(j13)) {
                        }
                        i12 |= i20;
                    } else {
                        j13 = j11;
                    }
                    i12 |= i20;
                } else {
                    j13 = j11;
                }
                if ((i12 & 2995931) == 599186) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            function4 = null;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 16) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                            i12 &= -57345;
                        } else {
                            medium = shape2;
                        }
                        if ((i11 & 32) != 0) {
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                            i12 &= -458753;
                        } else {
                            jM717getSurface0d7_KjU = j12;
                        }
                        if ((i11 & 64) != 0) {
                            long jM731contentColorForek8zF_U2 = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 15) & 14);
                            i12 &= -3670017;
                            j14 = jM731contentColorForek8zF_U2;
                        } else {
                            j14 = j13;
                        }
                    } else {
                        if (i17 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            function4 = null;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 16) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                            i12 &= -57345;
                        } else {
                            medium = shape2;
                        }
                        if ((i11 & 32) != 0) {
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                            i12 &= -458753;
                        } else {
                            jM717getSurface0d7_KjU = j12;
                        }
                        if ((i11 & 64) != 0) {
                            long jM731contentColorForek8zF_U3 = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 15) & 14);
                            i12 &= -3670017;
                            j14 = jM731contentColorForek8zF_U3;
                        } else {
                            j14 = j13;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-453679601, i12, -1, "androidx.compose.material.AlertDialogContent (AlertDialog.kt:43)");
                    }
                    ComposableLambda composableLambda3 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 629950291, true, new c(i12, function4, function6, buttons));
                    int i25 = ((i12 >> 3) & 14) | 1572864;
                    int i26 = i12 >> 9;
                    SurfaceKt.m834SurfaceFjzlyU(modifier2, medium, jM717getSurface0d7_KjU, j14, null, 0.0f, composableLambda3, composerStartRestartGroup, i25 | (i26 & 112) | (i26 & 896) | (i26 & 7168), 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    shape3 = medium;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            function4 = null;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 16) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                            i12 &= -57345;
                        } else {
                            medium = shape2;
                        }
                        if ((i11 & 32) != 0) {
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                            i12 &= -458753;
                        } else {
                            jM717getSurface0d7_KjU = j12;
                        }
                        if ((i11 & 64) != 0) {
                            long jM731contentColorForek8zF_U4 = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 15) & 14);
                            i12 &= -3670017;
                            j14 = jM731contentColorForek8zF_U4;
                        } else {
                            j14 = j13;
                        }
                    } else {
                        if (i17 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            function4 = null;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 16) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                            i12 &= -57345;
                        } else {
                            medium = shape2;
                        }
                        if ((i11 & 32) != 0) {
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                            i12 &= -458753;
                        } else {
                            jM717getSurface0d7_KjU = j12;
                        }
                        if ((i11 & 64) != 0) {
                            long jM731contentColorForek8zF_U5 = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 15) & 14);
                            i12 &= -3670017;
                            j14 = jM731contentColorForek8zF_U5;
                        } else {
                            j14 = j13;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-453679601, i12, -1, "androidx.compose.material.AlertDialogContent (AlertDialog.kt:43)");
                    }
                    ComposableLambda composableLambda4 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 629950291, true, new c(i12, function4, function6, buttons));
                    int i27 = ((i12 >> 3) & 14) | 1572864;
                    int i28 = i12 >> 9;
                    SurfaceKt.m834SurfaceFjzlyU(modifier2, medium, jM717getSurface0d7_KjU, j14, null, 0.0f, composableLambda4, composerStartRestartGroup, i27 | (i28 & 112) | (i28 & 896) | (i28 & 7168), 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    shape3 = medium;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new d(buttons, modifier3, function4, function6, shape3, jM717getSurface0d7_KjU, j14, i10, i11));
            }
            i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
            function4 = function2;
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 7168) == 0) {
                    function5 = function3;
                    if (composerStartRestartGroup.changedInstance(function5)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                if ((57344 & i10) == 0) {
                    if ((i11 & 16) == 0) {
                        shape2 = shape;
                        if (composerStartRestartGroup.changed(shape2)) {
                        }
                        i12 |= i18;
                    } else {
                        shape2 = shape;
                    }
                    i12 |= i18;
                } else {
                    shape2 = shape;
                }
                if ((458752 & i10) == 0) {
                    if ((i11 & 32) == 0) {
                        j12 = j10;
                        if (composerStartRestartGroup.changed(j12)) {
                        }
                        i12 |= i19;
                    } else {
                        j12 = j10;
                    }
                    i12 |= i19;
                } else {
                    j12 = j10;
                }
                if ((3670016 & i10) == 0) {
                    if ((i11 & 64) == 0) {
                        j13 = j11;
                        if (composerStartRestartGroup.changed(j13)) {
                        }
                        i12 |= i20;
                    } else {
                        j13 = j11;
                    }
                    i12 |= i20;
                } else {
                    j13 = j11;
                }
                if ((i12 & 2995931) == 599186) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            function4 = null;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 16) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                            i12 &= -57345;
                        } else {
                            medium = shape2;
                        }
                        if ((i11 & 32) != 0) {
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                            i12 &= -458753;
                        } else {
                            jM717getSurface0d7_KjU = j12;
                        }
                        if ((i11 & 64) != 0) {
                            long jM731contentColorForek8zF_U6 = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 15) & 14);
                            i12 &= -3670017;
                            j14 = jM731contentColorForek8zF_U6;
                        } else {
                            j14 = j13;
                        }
                    } else {
                        if (i17 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            function4 = null;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 16) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                            i12 &= -57345;
                        } else {
                            medium = shape2;
                        }
                        if ((i11 & 32) != 0) {
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                            i12 &= -458753;
                        } else {
                            jM717getSurface0d7_KjU = j12;
                        }
                        if ((i11 & 64) != 0) {
                            long jM731contentColorForek8zF_U7 = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 15) & 14);
                            i12 &= -3670017;
                            j14 = jM731contentColorForek8zF_U7;
                        } else {
                            j14 = j13;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-453679601, i12, -1, "androidx.compose.material.AlertDialogContent (AlertDialog.kt:43)");
                    }
                    ComposableLambda composableLambda5 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 629950291, true, new c(i12, function4, function6, buttons));
                    int i29 = ((i12 >> 3) & 14) | 1572864;
                    int i210 = i12 >> 9;
                    SurfaceKt.m834SurfaceFjzlyU(modifier2, medium, jM717getSurface0d7_KjU, j14, null, 0.0f, composableLambda5, composerStartRestartGroup, i29 | (i210 & 112) | (i210 & 896) | (i210 & 7168), 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    shape3 = medium;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            function4 = null;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 16) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                            i12 &= -57345;
                        } else {
                            medium = shape2;
                        }
                        if ((i11 & 32) != 0) {
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                            i12 &= -458753;
                        } else {
                            jM717getSurface0d7_KjU = j12;
                        }
                        if ((i11 & 64) != 0) {
                            long jM731contentColorForek8zF_U8 = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 15) & 14);
                            i12 &= -3670017;
                            j14 = jM731contentColorForek8zF_U8;
                        } else {
                            j14 = j13;
                        }
                    } else {
                        if (i17 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            function4 = null;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 16) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                            i12 &= -57345;
                        } else {
                            medium = shape2;
                        }
                        if ((i11 & 32) != 0) {
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                            i12 &= -458753;
                        } else {
                            jM717getSurface0d7_KjU = j12;
                        }
                        if ((i11 & 64) != 0) {
                            long jM731contentColorForek8zF_U9 = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 15) & 14);
                            i12 &= -3670017;
                            j14 = jM731contentColorForek8zF_U9;
                        } else {
                            j14 = j13;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-453679601, i12, -1, "androidx.compose.material.AlertDialogContent (AlertDialog.kt:43)");
                    }
                    ComposableLambda composableLambda6 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 629950291, true, new c(i12, function4, function6, buttons));
                    int i211 = ((i12 >> 3) & 14) | 1572864;
                    int i212 = i12 >> 9;
                    SurfaceKt.m834SurfaceFjzlyU(modifier2, medium, jM717getSurface0d7_KjU, j14, null, 0.0f, composableLambda6, composerStartRestartGroup, i211 | (i212 & 112) | (i212 & 896) | (i212 & 7168), 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    shape3 = medium;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new d(buttons, modifier3, function4, function6, shape3, jM717getSurface0d7_KjU, j14, i10, i11));
            }
            i12 |= 3072;
            function5 = function3;
            if ((57344 & i10) == 0) {
                if ((i11 & 16) == 0) {
                    shape2 = shape;
                    if (composerStartRestartGroup.changed(shape2)) {
                    }
                    i12 |= i18;
                } else {
                    shape2 = shape;
                }
                i12 |= i18;
            } else {
                shape2 = shape;
            }
            if ((458752 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    j12 = j10;
                    if (composerStartRestartGroup.changed(j12)) {
                    }
                    i12 |= i19;
                } else {
                    j12 = j10;
                }
                i12 |= i19;
            } else {
                j12 = j10;
            }
            if ((3670016 & i10) == 0) {
                if ((i11 & 64) == 0) {
                    j13 = j11;
                    if (composerStartRestartGroup.changed(j13)) {
                    }
                    i12 |= i20;
                } else {
                    j13 = j11;
                }
                i12 |= i20;
            } else {
                j13 = j11;
            }
            if ((i12 & 2995931) == 599186) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        function4 = null;
                    }
                    if (i15 == 0) {
                    }
                    if ((i11 & 16) != 0) {
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                        i12 &= -57345;
                    } else {
                        medium = shape2;
                    }
                    if ((i11 & 32) != 0) {
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        i12 &= -458753;
                    } else {
                        jM717getSurface0d7_KjU = j12;
                    }
                    if ((i11 & 64) != 0) {
                        long jM731contentColorForek8zF_U10 = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 15) & 14);
                        i12 &= -3670017;
                        j14 = jM731contentColorForek8zF_U10;
                    } else {
                        j14 = j13;
                    }
                } else {
                    if (i17 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        function4 = null;
                    }
                    if (i15 == 0) {
                    }
                    if ((i11 & 16) != 0) {
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                        i12 &= -57345;
                    } else {
                        medium = shape2;
                    }
                    if ((i11 & 32) != 0) {
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        i12 &= -458753;
                    } else {
                        jM717getSurface0d7_KjU = j12;
                    }
                    if ((i11 & 64) != 0) {
                        long jM731contentColorForek8zF_U11 = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 15) & 14);
                        i12 &= -3670017;
                        j14 = jM731contentColorForek8zF_U11;
                    } else {
                        j14 = j13;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-453679601, i12, -1, "androidx.compose.material.AlertDialogContent (AlertDialog.kt:43)");
                }
                ComposableLambda composableLambda7 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 629950291, true, new c(i12, function4, function6, buttons));
                int i213 = ((i12 >> 3) & 14) | 1572864;
                int i214 = i12 >> 9;
                SurfaceKt.m834SurfaceFjzlyU(modifier2, medium, jM717getSurface0d7_KjU, j14, null, 0.0f, composableLambda7, composerStartRestartGroup, i213 | (i214 & 112) | (i214 & 896) | (i214 & 7168), 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                shape3 = medium;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        function4 = null;
                    }
                    if (i15 == 0) {
                    }
                    if ((i11 & 16) != 0) {
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                        i12 &= -57345;
                    } else {
                        medium = shape2;
                    }
                    if ((i11 & 32) != 0) {
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        i12 &= -458753;
                    } else {
                        jM717getSurface0d7_KjU = j12;
                    }
                    if ((i11 & 64) != 0) {
                        long jM731contentColorForek8zF_U12 = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 15) & 14);
                        i12 &= -3670017;
                        j14 = jM731contentColorForek8zF_U12;
                    } else {
                        j14 = j13;
                    }
                } else {
                    if (i17 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        function4 = null;
                    }
                    if (i15 == 0) {
                    }
                    if ((i11 & 16) != 0) {
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                        i12 &= -57345;
                    } else {
                        medium = shape2;
                    }
                    if ((i11 & 32) != 0) {
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        i12 &= -458753;
                    } else {
                        jM717getSurface0d7_KjU = j12;
                    }
                    if ((i11 & 64) != 0) {
                        long jM731contentColorForek8zF_U13 = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 15) & 14);
                        i12 &= -3670017;
                        j14 = jM731contentColorForek8zF_U13;
                    } else {
                        j14 = j13;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-453679601, i12, -1, "androidx.compose.material.AlertDialogContent (AlertDialog.kt:43)");
                }
                ComposableLambda composableLambda8 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 629950291, true, new c(i12, function4, function6, buttons));
                int i215 = ((i12 >> 3) & 14) | 1572864;
                int i216 = i12 >> 9;
                SurfaceKt.m834SurfaceFjzlyU(modifier2, medium, jM717getSurface0d7_KjU, j14, null, 0.0f, composableLambda8, composerStartRestartGroup, i215 | (i216 & 112) | (i216 & 896) | (i216 & 7168), 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                shape3 = medium;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new d(buttons, modifier3, function4, function6, shape3, jM717getSurface0d7_KjU, j14, i10, i11));
        }
        i12 |= 48;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & 896) == 0) {
                function4 = function2;
                if (composerStartRestartGroup.changedInstance(function4)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 7168) == 0) {
                    function5 = function3;
                    if (composerStartRestartGroup.changedInstance(function5)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                if ((57344 & i10) == 0) {
                    if ((i11 & 16) == 0) {
                        shape2 = shape;
                        if (composerStartRestartGroup.changed(shape2)) {
                        }
                        i12 |= i18;
                    } else {
                        shape2 = shape;
                    }
                    i12 |= i18;
                } else {
                    shape2 = shape;
                }
                if ((458752 & i10) == 0) {
                    if ((i11 & 32) == 0) {
                        j12 = j10;
                        if (composerStartRestartGroup.changed(j12)) {
                        }
                        i12 |= i19;
                    } else {
                        j12 = j10;
                    }
                    i12 |= i19;
                } else {
                    j12 = j10;
                }
                if ((3670016 & i10) == 0) {
                    if ((i11 & 64) == 0) {
                        j13 = j11;
                        if (composerStartRestartGroup.changed(j13)) {
                        }
                        i12 |= i20;
                    } else {
                        j13 = j11;
                    }
                    i12 |= i20;
                } else {
                    j13 = j11;
                }
                if ((i12 & 2995931) == 599186) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            function4 = null;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 16) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                            i12 &= -57345;
                        } else {
                            medium = shape2;
                        }
                        if ((i11 & 32) != 0) {
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                            i12 &= -458753;
                        } else {
                            jM717getSurface0d7_KjU = j12;
                        }
                        if ((i11 & 64) != 0) {
                            long jM731contentColorForek8zF_U14 = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 15) & 14);
                            i12 &= -3670017;
                            j14 = jM731contentColorForek8zF_U14;
                        } else {
                            j14 = j13;
                        }
                    } else {
                        if (i17 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            function4 = null;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 16) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                            i12 &= -57345;
                        } else {
                            medium = shape2;
                        }
                        if ((i11 & 32) != 0) {
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                            i12 &= -458753;
                        } else {
                            jM717getSurface0d7_KjU = j12;
                        }
                        if ((i11 & 64) != 0) {
                            long jM731contentColorForek8zF_U15 = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 15) & 14);
                            i12 &= -3670017;
                            j14 = jM731contentColorForek8zF_U15;
                        } else {
                            j14 = j13;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-453679601, i12, -1, "androidx.compose.material.AlertDialogContent (AlertDialog.kt:43)");
                    }
                    ComposableLambda composableLambda9 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 629950291, true, new c(i12, function4, function6, buttons));
                    int i217 = ((i12 >> 3) & 14) | 1572864;
                    int i218 = i12 >> 9;
                    SurfaceKt.m834SurfaceFjzlyU(modifier2, medium, jM717getSurface0d7_KjU, j14, null, 0.0f, composableLambda9, composerStartRestartGroup, i217 | (i218 & 112) | (i218 & 896) | (i218 & 7168), 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    shape3 = medium;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            function4 = null;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 16) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                            i12 &= -57345;
                        } else {
                            medium = shape2;
                        }
                        if ((i11 & 32) != 0) {
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                            i12 &= -458753;
                        } else {
                            jM717getSurface0d7_KjU = j12;
                        }
                        if ((i11 & 64) != 0) {
                            long jM731contentColorForek8zF_U16 = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 15) & 14);
                            i12 &= -3670017;
                            j14 = jM731contentColorForek8zF_U16;
                        } else {
                            j14 = j13;
                        }
                    } else {
                        if (i17 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            function4 = null;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 16) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                            i12 &= -57345;
                        } else {
                            medium = shape2;
                        }
                        if ((i11 & 32) != 0) {
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                            i12 &= -458753;
                        } else {
                            jM717getSurface0d7_KjU = j12;
                        }
                        if ((i11 & 64) != 0) {
                            long jM731contentColorForek8zF_U17 = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 15) & 14);
                            i12 &= -3670017;
                            j14 = jM731contentColorForek8zF_U17;
                        } else {
                            j14 = j13;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-453679601, i12, -1, "androidx.compose.material.AlertDialogContent (AlertDialog.kt:43)");
                    }
                    ComposableLambda composableLambda10 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 629950291, true, new c(i12, function4, function6, buttons));
                    int i219 = ((i12 >> 3) & 14) | 1572864;
                    int i2110 = i12 >> 9;
                    SurfaceKt.m834SurfaceFjzlyU(modifier2, medium, jM717getSurface0d7_KjU, j14, null, 0.0f, composableLambda10, composerStartRestartGroup, i219 | (i2110 & 112) | (i2110 & 896) | (i2110 & 7168), 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    shape3 = medium;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new d(buttons, modifier3, function4, function6, shape3, jM717getSurface0d7_KjU, j14, i10, i11));
            }
            i12 |= 3072;
            function5 = function3;
            if ((57344 & i10) == 0) {
                if ((i11 & 16) == 0) {
                    shape2 = shape;
                    if (composerStartRestartGroup.changed(shape2)) {
                    }
                    i12 |= i18;
                } else {
                    shape2 = shape;
                }
                i12 |= i18;
            } else {
                shape2 = shape;
            }
            if ((458752 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    j12 = j10;
                    if (composerStartRestartGroup.changed(j12)) {
                    }
                    i12 |= i19;
                } else {
                    j12 = j10;
                }
                i12 |= i19;
            } else {
                j12 = j10;
            }
            if ((3670016 & i10) == 0) {
                if ((i11 & 64) == 0) {
                    j13 = j11;
                    if (composerStartRestartGroup.changed(j13)) {
                    }
                    i12 |= i20;
                } else {
                    j13 = j11;
                }
                i12 |= i20;
            } else {
                j13 = j11;
            }
            if ((i12 & 2995931) == 599186) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        function4 = null;
                    }
                    if (i15 == 0) {
                    }
                    if ((i11 & 16) != 0) {
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                        i12 &= -57345;
                    } else {
                        medium = shape2;
                    }
                    if ((i11 & 32) != 0) {
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        i12 &= -458753;
                    } else {
                        jM717getSurface0d7_KjU = j12;
                    }
                    if ((i11 & 64) != 0) {
                        long jM731contentColorForek8zF_U18 = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 15) & 14);
                        i12 &= -3670017;
                        j14 = jM731contentColorForek8zF_U18;
                    } else {
                        j14 = j13;
                    }
                } else {
                    if (i17 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        function4 = null;
                    }
                    if (i15 == 0) {
                    }
                    if ((i11 & 16) != 0) {
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                        i12 &= -57345;
                    } else {
                        medium = shape2;
                    }
                    if ((i11 & 32) != 0) {
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        i12 &= -458753;
                    } else {
                        jM717getSurface0d7_KjU = j12;
                    }
                    if ((i11 & 64) != 0) {
                        long jM731contentColorForek8zF_U19 = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 15) & 14);
                        i12 &= -3670017;
                        j14 = jM731contentColorForek8zF_U19;
                    } else {
                        j14 = j13;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-453679601, i12, -1, "androidx.compose.material.AlertDialogContent (AlertDialog.kt:43)");
                }
                ComposableLambda composableLambda11 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 629950291, true, new c(i12, function4, function6, buttons));
                int i2111 = ((i12 >> 3) & 14) | 1572864;
                int i2112 = i12 >> 9;
                SurfaceKt.m834SurfaceFjzlyU(modifier2, medium, jM717getSurface0d7_KjU, j14, null, 0.0f, composableLambda11, composerStartRestartGroup, i2111 | (i2112 & 112) | (i2112 & 896) | (i2112 & 7168), 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                shape3 = medium;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        function4 = null;
                    }
                    if (i15 == 0) {
                    }
                    if ((i11 & 16) != 0) {
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                        i12 &= -57345;
                    } else {
                        medium = shape2;
                    }
                    if ((i11 & 32) != 0) {
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        i12 &= -458753;
                    } else {
                        jM717getSurface0d7_KjU = j12;
                    }
                    if ((i11 & 64) != 0) {
                        long jM731contentColorForek8zF_U110 = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 15) & 14);
                        i12 &= -3670017;
                        j14 = jM731contentColorForek8zF_U110;
                    } else {
                        j14 = j13;
                    }
                } else {
                    if (i17 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        function4 = null;
                    }
                    if (i15 == 0) {
                    }
                    if ((i11 & 16) != 0) {
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                        i12 &= -57345;
                    } else {
                        medium = shape2;
                    }
                    if ((i11 & 32) != 0) {
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        i12 &= -458753;
                    } else {
                        jM717getSurface0d7_KjU = j12;
                    }
                    if ((i11 & 64) != 0) {
                        long jM731contentColorForek8zF_U111 = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 15) & 14);
                        i12 &= -3670017;
                        j14 = jM731contentColorForek8zF_U111;
                    } else {
                        j14 = j13;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-453679601, i12, -1, "androidx.compose.material.AlertDialogContent (AlertDialog.kt:43)");
                }
                ComposableLambda composableLambda12 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 629950291, true, new c(i12, function4, function6, buttons));
                int i2113 = ((i12 >> 3) & 14) | 1572864;
                int i2114 = i12 >> 9;
                SurfaceKt.m834SurfaceFjzlyU(modifier2, medium, jM717getSurface0d7_KjU, j14, null, 0.0f, composableLambda12, composerStartRestartGroup, i2113 | (i2114 & 112) | (i2114 & 896) | (i2114 & 7168), 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                shape3 = medium;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new d(buttons, modifier3, function4, function6, shape3, jM717getSurface0d7_KjU, j14, i10, i11));
        }
        i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        function4 = function2;
        i15 = i11 & 8;
        if (i15 != 0) {
            if ((i10 & 7168) == 0) {
                function5 = function3;
                if (composerStartRestartGroup.changedInstance(function5)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i12 |= i16;
            }
            if ((57344 & i10) == 0) {
                if ((i11 & 16) == 0) {
                    shape2 = shape;
                    if (composerStartRestartGroup.changed(shape2)) {
                    }
                    i12 |= i18;
                } else {
                    shape2 = shape;
                }
                i12 |= i18;
            } else {
                shape2 = shape;
            }
            if ((458752 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    j12 = j10;
                    if (composerStartRestartGroup.changed(j12)) {
                    }
                    i12 |= i19;
                } else {
                    j12 = j10;
                }
                i12 |= i19;
            } else {
                j12 = j10;
            }
            if ((3670016 & i10) == 0) {
                if ((i11 & 64) == 0) {
                    j13 = j11;
                    if (composerStartRestartGroup.changed(j13)) {
                    }
                    i12 |= i20;
                } else {
                    j13 = j11;
                }
                i12 |= i20;
            } else {
                j13 = j11;
            }
            if ((i12 & 2995931) == 599186) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        function4 = null;
                    }
                    if (i15 == 0) {
                    }
                    if ((i11 & 16) != 0) {
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                        i12 &= -57345;
                    } else {
                        medium = shape2;
                    }
                    if ((i11 & 32) != 0) {
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        i12 &= -458753;
                    } else {
                        jM717getSurface0d7_KjU = j12;
                    }
                    if ((i11 & 64) != 0) {
                        long jM731contentColorForek8zF_U112 = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 15) & 14);
                        i12 &= -3670017;
                        j14 = jM731contentColorForek8zF_U112;
                    } else {
                        j14 = j13;
                    }
                } else {
                    if (i17 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        function4 = null;
                    }
                    if (i15 == 0) {
                    }
                    if ((i11 & 16) != 0) {
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                        i12 &= -57345;
                    } else {
                        medium = shape2;
                    }
                    if ((i11 & 32) != 0) {
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        i12 &= -458753;
                    } else {
                        jM717getSurface0d7_KjU = j12;
                    }
                    if ((i11 & 64) != 0) {
                        long jM731contentColorForek8zF_U113 = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 15) & 14);
                        i12 &= -3670017;
                        j14 = jM731contentColorForek8zF_U113;
                    } else {
                        j14 = j13;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-453679601, i12, -1, "androidx.compose.material.AlertDialogContent (AlertDialog.kt:43)");
                }
                ComposableLambda composableLambda13 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 629950291, true, new c(i12, function4, function6, buttons));
                int i2115 = ((i12 >> 3) & 14) | 1572864;
                int i2116 = i12 >> 9;
                SurfaceKt.m834SurfaceFjzlyU(modifier2, medium, jM717getSurface0d7_KjU, j14, null, 0.0f, composableLambda13, composerStartRestartGroup, i2115 | (i2116 & 112) | (i2116 & 896) | (i2116 & 7168), 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                shape3 = medium;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        function4 = null;
                    }
                    if (i15 == 0) {
                    }
                    if ((i11 & 16) != 0) {
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                        i12 &= -57345;
                    } else {
                        medium = shape2;
                    }
                    if ((i11 & 32) != 0) {
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        i12 &= -458753;
                    } else {
                        jM717getSurface0d7_KjU = j12;
                    }
                    if ((i11 & 64) != 0) {
                        long jM731contentColorForek8zF_U114 = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 15) & 14);
                        i12 &= -3670017;
                        j14 = jM731contentColorForek8zF_U114;
                    } else {
                        j14 = j13;
                    }
                } else {
                    if (i17 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        function4 = null;
                    }
                    if (i15 == 0) {
                    }
                    if ((i11 & 16) != 0) {
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                        i12 &= -57345;
                    } else {
                        medium = shape2;
                    }
                    if ((i11 & 32) != 0) {
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        i12 &= -458753;
                    } else {
                        jM717getSurface0d7_KjU = j12;
                    }
                    if ((i11 & 64) != 0) {
                        long jM731contentColorForek8zF_U115 = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 15) & 14);
                        i12 &= -3670017;
                        j14 = jM731contentColorForek8zF_U115;
                    } else {
                        j14 = j13;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-453679601, i12, -1, "androidx.compose.material.AlertDialogContent (AlertDialog.kt:43)");
                }
                ComposableLambda composableLambda14 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 629950291, true, new c(i12, function4, function6, buttons));
                int i2117 = ((i12 >> 3) & 14) | 1572864;
                int i2118 = i12 >> 9;
                SurfaceKt.m834SurfaceFjzlyU(modifier2, medium, jM717getSurface0d7_KjU, j14, null, 0.0f, composableLambda14, composerStartRestartGroup, i2117 | (i2118 & 112) | (i2118 & 896) | (i2118 & 7168), 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                shape3 = medium;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new d(buttons, modifier3, function4, function6, shape3, jM717getSurface0d7_KjU, j14, i10, i11));
        }
        i12 |= 3072;
        function5 = function3;
        if ((57344 & i10) == 0) {
            if ((i11 & 16) == 0) {
                shape2 = shape;
                if (composerStartRestartGroup.changed(shape2)) {
                }
                i12 |= i18;
            } else {
                shape2 = shape;
            }
            i12 |= i18;
        } else {
            shape2 = shape;
        }
        if ((458752 & i10) == 0) {
            if ((i11 & 32) == 0) {
                j12 = j10;
                if (composerStartRestartGroup.changed(j12)) {
                }
                i12 |= i19;
            } else {
                j12 = j10;
            }
            i12 |= i19;
        } else {
            j12 = j10;
        }
        if ((3670016 & i10) == 0) {
            if ((i11 & 64) == 0) {
                j13 = j11;
                if (composerStartRestartGroup.changed(j13)) {
                }
                i12 |= i20;
            } else {
                j13 = j11;
            }
            i12 |= i20;
        } else {
            j13 = j11;
        }
        if ((i12 & 2995931) == 599186) {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i17 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i13 != 0) {
                    function4 = null;
                }
                if (i15 == 0) {
                }
                if ((i11 & 16) != 0) {
                    medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                    i12 &= -57345;
                } else {
                    medium = shape2;
                }
                if ((i11 & 32) != 0) {
                    jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                    i12 &= -458753;
                } else {
                    jM717getSurface0d7_KjU = j12;
                }
                if ((i11 & 64) != 0) {
                    long jM731contentColorForek8zF_U116 = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 15) & 14);
                    i12 &= -3670017;
                    j14 = jM731contentColorForek8zF_U116;
                } else {
                    j14 = j13;
                }
            } else {
                if (i17 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i13 != 0) {
                    function4 = null;
                }
                if (i15 == 0) {
                }
                if ((i11 & 16) != 0) {
                    medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                    i12 &= -57345;
                } else {
                    medium = shape2;
                }
                if ((i11 & 32) != 0) {
                    jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                    i12 &= -458753;
                } else {
                    jM717getSurface0d7_KjU = j12;
                }
                if ((i11 & 64) != 0) {
                    long jM731contentColorForek8zF_U117 = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 15) & 14);
                    i12 &= -3670017;
                    j14 = jM731contentColorForek8zF_U117;
                } else {
                    j14 = j13;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-453679601, i12, -1, "androidx.compose.material.AlertDialogContent (AlertDialog.kt:43)");
            }
            ComposableLambda composableLambda15 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 629950291, true, new c(i12, function4, function6, buttons));
            int i2119 = ((i12 >> 3) & 14) | 1572864;
            int i21110 = i12 >> 9;
            SurfaceKt.m834SurfaceFjzlyU(modifier2, medium, jM717getSurface0d7_KjU, j14, null, 0.0f, composableLambda15, composerStartRestartGroup, i2119 | (i21110 & 112) | (i21110 & 896) | (i21110 & 7168), 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier2;
            shape3 = medium;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i17 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i13 != 0) {
                    function4 = null;
                }
                if (i15 == 0) {
                }
                if ((i11 & 16) != 0) {
                    medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                    i12 &= -57345;
                } else {
                    medium = shape2;
                }
                if ((i11 & 32) != 0) {
                    jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                    i12 &= -458753;
                } else {
                    jM717getSurface0d7_KjU = j12;
                }
                if ((i11 & 64) != 0) {
                    long jM731contentColorForek8zF_U118 = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 15) & 14);
                    i12 &= -3670017;
                    j14 = jM731contentColorForek8zF_U118;
                } else {
                    j14 = j13;
                }
            } else {
                if (i17 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i13 != 0) {
                    function4 = null;
                }
                if (i15 == 0) {
                }
                if ((i11 & 16) != 0) {
                    medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                    i12 &= -57345;
                } else {
                    medium = shape2;
                }
                if ((i11 & 32) != 0) {
                    jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                    i12 &= -458753;
                } else {
                    jM717getSurface0d7_KjU = j12;
                }
                if ((i11 & 64) != 0) {
                    long jM731contentColorForek8zF_U119 = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 15) & 14);
                    i12 &= -3670017;
                    j14 = jM731contentColorForek8zF_U119;
                } else {
                    j14 = j13;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-453679601, i12, -1, "androidx.compose.material.AlertDialogContent (AlertDialog.kt:43)");
            }
            ComposableLambda composableLambda16 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 629950291, true, new c(i12, function4, function6, buttons));
            int i21111 = ((i12 >> 3) & 14) | 1572864;
            int i21112 = i12 >> 9;
            SurfaceKt.m834SurfaceFjzlyU(modifier2, medium, jM717getSurface0d7_KjU, j14, null, 0.0f, composableLambda16, composerStartRestartGroup, i21111 | (i21112 & 112) | (i21112 & 896) | (i21112 & 7168), 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier2;
            shape3 = medium;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new d(buttons, modifier3, function4, function6, shape3, jM717getSurface0d7_KjU, j14, i10, i11));
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: AlertDialogFlowRow-ixp7dh8, reason: not valid java name */
    public static final void m652AlertDialogFlowRowixp7dh8(float f6, float f10, @NotNull Function2<? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i10) {
        int i11;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(73434452);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.changed(f6) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= composerStartRestartGroup.changed(f10) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(content) ? 256 : 128;
        }
        if ((i11 & 731) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(73434452, i11, -1, "androidx.compose.material.AlertDialogFlowRow (AlertDialog.kt:187)");
            }
            e eVar = new e(f6, f10);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Modifier.Companion companion = Modifier.INSTANCE;
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
            int i12 = ((((i11 >> 6) & 14) << 9) & 7168) | 6;
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
            Updater.m2081setimpl(composerM2074constructorimpl, eVar, companion2.getSetMeasurePolicy());
            Updater.m2081setimpl(composerM2074constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM2074constructorimpl.getInserting() || !Intrinsics.areEqual(composerM2074constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, setCompositeKeyHash);
            }
            ai.a.j((i12 >> 3) & 112, function3ModifierMaterializerOf, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            content.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 9) & 14));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new f(f6, f10, content, i10));
    }
}
