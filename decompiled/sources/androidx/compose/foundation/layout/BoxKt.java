package androidx.compose.foundation.layout;

import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.vierge.bluetoothlibrary.BluetoothState;
import g1.f;
import java.util.List;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
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
import x.i;

/* JADX INFO: compiled from: Box.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\u001aO\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u001c\u0010\u000b\u001a\u0018\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t¢\u0006\u0002\b\nH\u0087\bø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0018\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000\u001a\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\f\u0010\u0013\"\u001a\u0010\u0018\u001a\u00020\u000f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u001a\u0010\u001b\u001a\u00020\u000f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001c"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/Alignment;", "contentAlignment", "", "propagateMinConstraints", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/BoxScope;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "content", "Box", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;ZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "alignment", "Landroidx/compose/ui/layout/MeasurePolicy;", "rememberBoxMeasurePolicy", "(Landroidx/compose/ui/Alignment;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;", "boxMeasurePolicy", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "a", "Landroidx/compose/ui/layout/MeasurePolicy;", "getDefaultBoxMeasurePolicy", "()Landroidx/compose/ui/layout/MeasurePolicy;", "DefaultBoxMeasurePolicy", "b", "getEmptyBoxMeasurePolicy", "EmptyBoxMeasurePolicy", "foundation-layout_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 2 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/Updater\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,301:1\n78#2,11:302\n91#2:333\n78#2,11:342\n91#2:373\n456#3,8:313\n464#3,6:327\n50#3:334\n49#3:335\n456#3,8:353\n464#3,6:367\n4144#4,6:321\n4144#4,6:361\n1097#5,6:336\n*S KotlinDebug\n*F\n+ 1 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n*L\n71#1:302,11\n71#1:333\n200#1:342,11\n200#1:373\n71#1:313,8\n71#1:327,6\n86#1:334\n86#1:335\n200#1:353,8\n200#1:367,6\n71#1:321,6\n200#1:361,6\n86#1:336,6\n*E\n"})
public final class BoxKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final MeasurePolicy f4199a = boxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final b f4200b = b.f4203a;

    /* JADX INFO: compiled from: Box.kt */
    public static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Modifier f4201p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ int f4202q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Modifier modifier, int i10) {
            super(2);
            this.f4201p0 = modifier;
            this.f4202q0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f4202q0 | 1);
            BoxKt.Box(this.f4201p0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Box.kt */
    public static final class b implements MeasurePolicy {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f4203a = new b();

        /* JADX INFO: compiled from: Box.kt */
        public static final class a extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public static final a f4204p0 = new a(1);

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope layout = placementScope;
                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                return Unit.INSTANCE;
            }
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public final /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
            return f.a(this, intrinsicMeasureScope, list, i10);
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public final /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
            return f.b(this, intrinsicMeasureScope, list, i10);
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        @NotNull
        /* JADX INFO: renamed from: measure-3p2s80s */
        public final MeasureResult mo113measure3p2s80s(@NotNull MeasureScope MeasurePolicy, @NotNull List<? extends Measurable> list, long j10) {
            Intrinsics.checkNotNullParameter(MeasurePolicy, "$this$MeasurePolicy");
            Intrinsics.checkNotNullParameter(list, "<anonymous parameter 0>");
            return MeasureScope.CC.q(MeasurePolicy, Constraints.m4359getMinWidthimpl(j10), Constraints.m4358getMinHeightimpl(j10), null, a.f4204p0, 4, null);
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public final /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
            return f.c(this, intrinsicMeasureScope, list, i10);
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public final /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
            return f.d(this, intrinsicMeasureScope, list, i10);
        }
    }

    /* JADX INFO: compiled from: Box.kt */
    @SourceDebugExtension({"SMAP\nBox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Box.kt\nandroidx/compose/foundation/layout/BoxKt$boxMeasurePolicy$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,301:1\n69#2,6:302\n69#2,6:308\n*S KotlinDebug\n*F\n+ 1 Box.kt\nandroidx/compose/foundation/layout/BoxKt$boxMeasurePolicy$1\n*L\n134#1:302,6\n154#1:308,6\n*E\n"})
    public static final class c implements MeasurePolicy {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f4205a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Alignment f4206b;

        /* JADX INFO: compiled from: Box.kt */
        public static final class a extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public static final a f4207p0 = new a(1);

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope layout = placementScope;
                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: compiled from: Box.kt */
        public static final class b extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ Placeable f4208p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ Measurable f4209q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public final /* synthetic */ MeasureScope f4210r0;

            /* JADX INFO: renamed from: s0, reason: collision with root package name */
            public final /* synthetic */ int f4211s0;

            /* JADX INFO: renamed from: t0, reason: collision with root package name */
            public final /* synthetic */ int f4212t0;

            /* JADX INFO: renamed from: u0, reason: collision with root package name */
            public final /* synthetic */ Alignment f4213u0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Placeable placeable, Measurable measurable, MeasureScope measureScope, int i10, int i11, Alignment alignment) {
                super(1);
                this.f4208p0 = placeable;
                this.f4209q0 = measurable;
                this.f4210r0 = measureScope;
                this.f4211s0 = i10;
                this.f4212t0 = i11;
                this.f4213u0 = alignment;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope layout = placementScope;
                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                BoxKt.access$placeInBox(layout, this.f4208p0, this.f4209q0, this.f4210r0.getLayoutDirection(), this.f4211s0, this.f4212t0, this.f4213u0);
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: androidx.compose.foundation.layout.BoxKt$c$c, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Box.kt */
        @SourceDebugExtension({"SMAP\nBox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Box.kt\nandroidx/compose/foundation/layout/BoxKt$boxMeasurePolicy$1$measure$5\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,301:1\n13644#2,3:302\n*S KotlinDebug\n*F\n+ 1 Box.kt\nandroidx/compose/foundation/layout/BoxKt$boxMeasurePolicy$1$measure$5\n*L\n163#1:302,3\n*E\n"})
        public static final class C0030c extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ Placeable[] f4214p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ List<Measurable> f4215q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public final /* synthetic */ MeasureScope f4216r0;

            /* JADX INFO: renamed from: s0, reason: collision with root package name */
            public final /* synthetic */ Ref.IntRef f4217s0;

            /* JADX INFO: renamed from: t0, reason: collision with root package name */
            public final /* synthetic */ Ref.IntRef f4218t0;

            /* JADX INFO: renamed from: u0, reason: collision with root package name */
            public final /* synthetic */ Alignment f4219u0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0030c(Placeable[] placeableArr, List<? extends Measurable> list, MeasureScope measureScope, Ref.IntRef intRef, Ref.IntRef intRef2, Alignment alignment) {
                super(1);
                this.f4214p0 = placeableArr;
                this.f4215q0 = list;
                this.f4216r0 = measureScope;
                this.f4217s0 = intRef;
                this.f4218t0 = intRef2;
                this.f4219u0 = alignment;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope layout = placementScope;
                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                Alignment alignment = this.f4219u0;
                Placeable[] placeableArr = this.f4214p0;
                int length = placeableArr.length;
                int i10 = 0;
                int i11 = 0;
                while (i11 < length) {
                    Placeable placeable = placeableArr[i11];
                    Intrinsics.checkNotNull(placeable, "null cannot be cast to non-null type androidx.compose.ui.layout.Placeable");
                    BoxKt.access$placeInBox(layout, placeable, this.f4215q0.get(i10), this.f4216r0.getLayoutDirection(), this.f4217s0.element, this.f4218t0.element, alignment);
                    i11++;
                    i10++;
                }
                return Unit.INSTANCE;
            }
        }

        public c(Alignment alignment, boolean z10) {
            this.f4205a = z10;
            this.f4206b = alignment;
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public final /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
            return f.a(this, intrinsicMeasureScope, list, i10);
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public final /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
            return f.b(this, intrinsicMeasureScope, list, i10);
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        @NotNull
        /* JADX INFO: renamed from: measure-3p2s80s */
        public final MeasureResult mo113measure3p2s80s(@NotNull MeasureScope MeasurePolicy, @NotNull List<? extends Measurable> measurables, long j10) {
            int iM4359getMinWidthimpl;
            Placeable placeableMo3575measureBRTryo0;
            int iMax;
            Intrinsics.checkNotNullParameter(MeasurePolicy, "$this$MeasurePolicy");
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            if (measurables.isEmpty()) {
                return MeasureScope.CC.q(MeasurePolicy, Constraints.m4359getMinWidthimpl(j10), Constraints.m4358getMinHeightimpl(j10), null, a.f4207p0, 4, null);
            }
            long jM4349copyZbe2FdA$default = this.f4205a ? j10 : Constraints.m4349copyZbe2FdA$default(j10, 0, 0, 0, 0, 10, null);
            if (measurables.size() == 1) {
                Measurable measurable = measurables.get(0);
                if (BoxKt.access$getMatchesParentSize(measurable)) {
                    iM4359getMinWidthimpl = Constraints.m4359getMinWidthimpl(j10);
                    int iM4358getMinHeightimpl = Constraints.m4358getMinHeightimpl(j10);
                    placeableMo3575measureBRTryo0 = measurable.mo3575measureBRTryo0(Constraints.INSTANCE.m4365fixedJhjzzOo(Constraints.m4359getMinWidthimpl(j10), Constraints.m4358getMinHeightimpl(j10)));
                    iMax = iM4358getMinHeightimpl;
                } else {
                    Placeable placeableMo3575measureBRTryo1 = measurable.mo3575measureBRTryo0(jM4349copyZbe2FdA$default);
                    int iMax2 = Math.max(Constraints.m4359getMinWidthimpl(j10), placeableMo3575measureBRTryo1.getWidth());
                    iMax = Math.max(Constraints.m4358getMinHeightimpl(j10), placeableMo3575measureBRTryo1.getHeight());
                    placeableMo3575measureBRTryo0 = placeableMo3575measureBRTryo1;
                    iM4359getMinWidthimpl = iMax2;
                }
                return MeasureScope.CC.q(MeasurePolicy, iM4359getMinWidthimpl, iMax, null, new b(placeableMo3575measureBRTryo0, measurable, MeasurePolicy, iM4359getMinWidthimpl, iMax, this.f4206b), 4, null);
            }
            Placeable[] placeableArr = new Placeable[measurables.size()];
            Ref.IntRef intRef = new Ref.IntRef();
            intRef.element = Constraints.m4359getMinWidthimpl(j10);
            Ref.IntRef intRef2 = new Ref.IntRef();
            intRef2.element = Constraints.m4358getMinHeightimpl(j10);
            int size = measurables.size();
            boolean z10 = false;
            for (int i10 = 0; i10 < size; i10++) {
                Measurable measurable2 = measurables.get(i10);
                if (BoxKt.access$getMatchesParentSize(measurable2)) {
                    z10 = true;
                } else {
                    Placeable placeableMo3575measureBRTryo2 = measurable2.mo3575measureBRTryo0(jM4349copyZbe2FdA$default);
                    placeableArr[i10] = placeableMo3575measureBRTryo2;
                    intRef.element = Math.max(intRef.element, placeableMo3575measureBRTryo2.getWidth());
                    intRef2.element = Math.max(intRef2.element, placeableMo3575measureBRTryo2.getHeight());
                }
            }
            if (z10) {
                int i11 = intRef.element;
                int i12 = i11 != Integer.MAX_VALUE ? i11 : 0;
                int i13 = intRef2.element;
                long jConstraints = ConstraintsKt.Constraints(i12, i11, i13 != Integer.MAX_VALUE ? i13 : 0, i13);
                int size2 = measurables.size();
                for (int i14 = 0; i14 < size2; i14++) {
                    Measurable measurable3 = measurables.get(i14);
                    if (BoxKt.access$getMatchesParentSize(measurable3)) {
                        placeableArr[i14] = measurable3.mo3575measureBRTryo0(jConstraints);
                    }
                }
            }
            return MeasureScope.CC.q(MeasurePolicy, intRef.element, intRef2.element, null, new C0030c(placeableArr, measurables, MeasurePolicy, intRef, intRef2, this.f4206b), 4, null);
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public final /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
            return f.c(this, intrinsicMeasureScope, list, i10);
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public final /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
            return f.d(this, intrinsicMeasureScope, list, i10);
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void Box(@Nullable Modifier modifier, @Nullable Alignment alignment, boolean z10, @NotNull Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(content, "content");
        composer.startReplaceableGroup(733328855);
        if ((i11 & 1) != 0) {
            modifier = Modifier.INSTANCE;
        }
        if ((i11 & 2) != 0) {
            alignment = Alignment.INSTANCE.getTopStart();
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        int i12 = i10 >> 3;
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = rememberBoxMeasurePolicy(alignment, z10, composer, (i12 & 112) | (i12 & 14));
        composer.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier);
        int i13 = ((((i10 << 3) & 112) << 9) & 7168) | 6;
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
        Function2 function2C = com.google.android.gms.measurement.internal.a.c(companion, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy, composerM2074constructorimpl, currentCompositionLocalMap);
        if (composerM2074constructorimpl.getInserting() || !Intrinsics.areEqual(composerM2074constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
        }
        ai.a.j((i13 >> 3) & 112, function3ModifierMaterializerOf, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composer)), composer, 2058660585);
        content.invoke(BoxScopeInstance.INSTANCE, composer, Integer.valueOf(((i10 >> 6) & 112) | 6));
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
    }

    public static final boolean access$getMatchesParentSize(Measurable measurable) {
        Object parentData = measurable.getParentData();
        i iVar = parentData instanceof i ? (i) parentData : null;
        if (iVar != null) {
            return iVar.I0;
        }
        return false;
    }

    public static final void access$placeInBox(Placeable.PlacementScope placementScope, Placeable placeable, Measurable measurable, LayoutDirection layoutDirection, int i10, int i11, Alignment alignment) {
        Alignment alignment2;
        Object parentData = measurable.getParentData();
        i iVar = parentData instanceof i ? (i) parentData : null;
        Placeable.PlacementScope.m3611place70tqf50$default(placementScope, placeable, ((iVar == null || (alignment2 = iVar.H0) == null) ? alignment : alignment2).mo2184alignKFBX0sM(IntSizeKt.IntSize(placeable.getWidth(), placeable.getHeight()), IntSizeKt.IntSize(i10, i11), layoutDirection), 0.0f, 2, null);
    }

    @NotNull
    public static final MeasurePolicy boxMeasurePolicy(@NotNull Alignment alignment, boolean z10) {
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        return new c(alignment, z10);
    }

    @NotNull
    public static final MeasurePolicy getDefaultBoxMeasurePolicy() {
        return f4199a;
    }

    @NotNull
    public static final MeasurePolicy getEmptyBoxMeasurePolicy() {
        return f4200b;
    }

    @Composable
    @PublishedApi
    @NotNull
    public static final MeasurePolicy rememberBoxMeasurePolicy(@NotNull Alignment alignment, boolean z10, @Nullable Composer composer, int i10) {
        MeasurePolicy measurePolicy;
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        composer.startReplaceableGroup(56522820);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(56522820, i10, -1, "androidx.compose.foundation.layout.rememberBoxMeasurePolicy (Box.kt:79)");
        }
        if (!Intrinsics.areEqual(alignment, Alignment.INSTANCE.getTopStart()) || z10) {
            Boolean boolValueOf = Boolean.valueOf(z10);
            composer.startReplaceableGroup(511388516);
            boolean zChanged = composer.changed(boolValueOf) | composer.changed(alignment);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = boxMeasurePolicy(alignment, z10);
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceableGroup();
            measurePolicy = (MeasurePolicy) objRememberedValue;
        } else {
            measurePolicy = f4199a;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return measurePolicy;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void Box(@NotNull Modifier modifier, @Nullable Composer composer, int i10) {
        int i11;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Composer composerStartRestartGroup = composer.startRestartGroup(-211209833);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-211209833, i11, -1, "androidx.compose.foundation.layout.Box (Box.kt:198)");
            }
            int i12 = ((i11 << 3) & 112) | BluetoothState.REQUEST_CONNECT_DEVICE;
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier);
            int i13 = ((i12 << 9) & 7168) | 6;
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
            Updater.m2081setimpl(composerM2074constructorimpl, f4200b, companion.getSetMeasurePolicy());
            Updater.m2081setimpl(composerM2074constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM2074constructorimpl.getInserting() || !Intrinsics.areEqual(composerM2074constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, setCompositeKeyHash);
            }
            function3ModifierMaterializerOf.invoke(SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf((i13 >> 3) & 112));
            composerStartRestartGroup.startReplaceableGroup(2058660585);
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
        scopeUpdateScopeEndRestartGroup.updateScope(new a(modifier, i10));
    }
}
