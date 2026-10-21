package androidx.compose.foundation.layout;

import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
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
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x.a0;
import x.b0;
import x.c0;
import x.t;
import x.u;
import x.v;
import x.w;
import x.x;
import x.y;
import x.z;

/* JADX INFO: compiled from: FlowLayout.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001aY\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u001c\u0010\r\u001a\u0018\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000b¢\u0006\u0002\b\fH\u0087\bø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001aY\u0010\u0012\u001a\u00020\n2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00062\u001c\u0010\r\u001a\u0018\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000b¢\u0006\u0002\b\fH\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a'\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001a'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001a9\u0010$\u001a\u00020!*\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u0014\u001a\u00020\u0006H\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\"\u0010#\u001a\u001c\u0010'\u001a\u00020\u0006*\u00020%2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010&\u001a\u00020\u0006H\u0000\u001a\u001c\u0010)\u001a\u00020\u0006*\u00020%2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010(\u001a\u00020\u0006H\u0000\u001a\u0014\u0010(\u001a\u00020\u0006*\u00020*2\u0006\u0010\u001e\u001a\u00020\u001dH\u0000\u001a\u0014\u0010&\u001a\u00020\u0006*\u00020*2\u0006\u0010\u001e\u001a\u00020\u001dH\u0000\u0082\u0002\u0012\n\u0005\b\u009920\u0001\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006+"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "verticalArrangement", "", "maxItemsInEachRow", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/FlowRowScope;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "content", "FlowRow", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;ILkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "maxItemsInEachColumn", "Landroidx/compose/foundation/layout/FlowColumnScope;", "FlowColumn", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ILkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "maxItemsInMainAxis", "Landroidx/compose/ui/layout/MeasurePolicy;", "rowMeasurementHelper", "(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;", "columnMeasurementHelper", "(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;", "measureHelper", "Landroidx/compose/foundation/layout/LayoutOrientation;", "orientation", "Landroidx/compose/foundation/layout/OrientationIndependentConstraints;", "constraints", "Landroidx/compose/foundation/layout/FlowResult;", "breakDownItems-w1Onq5I", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;Landroidx/compose/foundation/layout/LayoutOrientation;JI)Landroidx/compose/foundation/layout/FlowResult;", "breakDownItems", "Landroidx/compose/ui/layout/Measurable;", "crossAxisSize", "mainAxisMin", "mainAxisSize", "crossAxisMin", "Landroidx/compose/ui/layout/Placeable;", "foundation-layout_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFlowLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowLayout.kt\nandroidx/compose/foundation/layout/FlowLayoutKt\n+ 2 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/Updater\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 8 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 9 RowColumnImpl.kt\nandroidx/compose/foundation/layout/OrientationIndependentConstraints\n*L\n1#1,755:1\n78#2,11:756\n91#2:787\n78#2,11:788\n91#2:819\n456#3,8:767\n464#3,6:781\n456#3,8:799\n464#3,6:813\n67#3,3:820\n66#3:823\n67#3,3:830\n66#3:833\n4144#4,6:775\n4144#4,6:807\n1097#5,6:824\n1097#5,6:834\n69#6,6:840\n69#6,6:847\n1#7:846\n1182#8:853\n1161#8,2:854\n321#9:856\n320#9:857\n323#9:858\n322#9:859\n320#9:860\n*S KotlinDebug\n*F\n+ 1 FlowLayout.kt\nandroidx/compose/foundation/layout/FlowLayoutKt\n*L\n67#1:756,11\n67#1:787\n117#1:788,11\n117#1:819\n67#1:767,8\n67#1:781,6\n117#1:799,8\n117#1:813,6\n169#1:820,3\n169#1:823\n190#1:830,3\n190#1:833\n67#1:775,6\n117#1:807,6\n169#1:824,6\n190#1:834,6\n446#1:840,6\n567#1:847,6\n607#1:853\n607#1:854,2\n608#1:856\n609#1:857\n610#1:858\n687#1:859\n688#1:860\n*E\n"})
public final class FlowLayoutKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final CrossAxisAlignment f4247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final CrossAxisAlignment f4248b;

    /* JADX INFO: compiled from: FlowLayout.kt */
    public static final class a extends Lambda implements Function1<Placeable, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Placeable[] f4249p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ int f4250q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Placeable[] placeableArr, int i10) {
            super(1);
            this.f4249p0 = placeableArr;
            this.f4250q0 = i10;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Placeable placeable) {
            int i10 = this.f4250q0 + 1;
            this.f4249p0[i10] = placeable;
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: FlowLayout.kt */
    public static final class b extends Lambda implements Function1<Placeable, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Placeable[] f4251p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Placeable[] placeableArr) {
            super(1);
            this.f4251p0 = placeableArr;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Placeable placeable) {
            this.f4251p0[0] = placeable;
            return Unit.INSTANCE;
        }
    }

    static {
        CrossAxisAlignment.Companion companion = CrossAxisAlignment.INSTANCE;
        Alignment.Companion companion2 = Alignment.INSTANCE;
        f4247a = companion.vertical$foundation_layout_release(companion2.getTop());
        f4248b = companion.horizontal$foundation_layout_release(companion2.getStart());
    }

    @Composable
    @ExperimentalLayoutApi
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void FlowColumn(@Nullable Modifier modifier, @Nullable Arrangement.Vertical vertical, @Nullable Arrangement.Horizontal horizontal, int i10, @NotNull Function3<? super FlowColumnScope, ? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i11, int i12) {
        Intrinsics.checkNotNullParameter(content, "content");
        composer.startReplaceableGroup(-310290901);
        if ((i12 & 1) != 0) {
            modifier = Modifier.INSTANCE;
        }
        if ((i12 & 2) != 0) {
            vertical = Arrangement.INSTANCE.getTop();
        }
        if ((i12 & 4) != 0) {
            horizontal = Arrangement.INSTANCE.getStart();
        }
        if ((i12 & 8) != 0) {
            i10 = Integer.MAX_VALUE;
        }
        int i13 = i11 >> 3;
        MeasurePolicy measurePolicyColumnMeasurementHelper = columnMeasurementHelper(vertical, horizontal, i10, composer, (i13 & 896) | (i13 & 14) | (i13 & 112));
        composer.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier);
        int i14 = ((((i11 << 3) & 112) << 9) & 7168) | 6;
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
        Function2 function2C = com.google.android.gms.measurement.internal.a.c(companion, composerM2074constructorimpl, measurePolicyColumnMeasurementHelper, composerM2074constructorimpl, currentCompositionLocalMap);
        if (composerM2074constructorimpl.getInserting() || !Intrinsics.areEqual(composerM2074constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
        }
        ai.a.j((i14 >> 3) & 112, function3ModifierMaterializerOf, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composer)), composer, 2058660585);
        content.invoke(FlowColumnScopeInstance.INSTANCE, composer, Integer.valueOf(((i11 >> 9) & 112) | 6));
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
    }

    @Composable
    @ExperimentalLayoutApi
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void FlowRow(@Nullable Modifier modifier, @Nullable Arrangement.Horizontal horizontal, @Nullable Arrangement.Vertical vertical, int i10, @NotNull Function3<? super FlowRowScope, ? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i11, int i12) {
        Intrinsics.checkNotNullParameter(content, "content");
        composer.startReplaceableGroup(1098475987);
        if ((i12 & 1) != 0) {
            modifier = Modifier.INSTANCE;
        }
        if ((i12 & 2) != 0) {
            horizontal = Arrangement.INSTANCE.getStart();
        }
        if ((i12 & 4) != 0) {
            vertical = Arrangement.INSTANCE.getTop();
        }
        if ((i12 & 8) != 0) {
            i10 = Integer.MAX_VALUE;
        }
        int i13 = i11 >> 3;
        MeasurePolicy measurePolicyRowMeasurementHelper = rowMeasurementHelper(horizontal, vertical, i10, composer, (i13 & 896) | (i13 & 14) | (i13 & 112));
        composer.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier);
        int i14 = ((((i11 << 3) & 112) << 9) & 7168) | 6;
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
        Function2 function2C = com.google.android.gms.measurement.internal.a.c(companion, composerM2074constructorimpl, measurePolicyRowMeasurementHelper, composerM2074constructorimpl, currentCompositionLocalMap);
        if (composerM2074constructorimpl.getInserting() || !Intrinsics.areEqual(composerM2074constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
        }
        ai.a.j((i14 >> 3) & 112, function3ModifierMaterializerOf, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composer)), composer, 2058660585);
        content.invoke(FlowRowScopeInstance.INSTANCE, composer, Integer.valueOf(((i11 >> 9) & 112) | 6));
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
    }

    public static final int a(List<? extends IntrinsicMeasurable> list, Function3<? super IntrinsicMeasurable, ? super Integer, ? super Integer, Integer> function3, Function3<? super IntrinsicMeasurable, ? super Integer, ? super Integer, Integer> function4, int i10, int i11, int i12, int i13) {
        if (list.isEmpty()) {
            return 0;
        }
        Object orNull = CollectionsKt___CollectionsKt.getOrNull(list, 0);
        IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) orNull;
        int iIntValue = intrinsicMeasurable != null ? function4.invoke(intrinsicMeasurable, 0, Integer.valueOf(i10)).intValue() : 0;
        int iIntValue2 = intrinsicMeasurable != null ? function3.invoke(intrinsicMeasurable, 0, Integer.valueOf(iIntValue)).intValue() : 0;
        int size = list.size();
        int i14 = i10;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        while (i15 < size) {
            list.get(i15);
            Intrinsics.checkNotNull(orNull);
            i14 -= iIntValue2;
            int iMax = Math.max(i17, iIntValue);
            i15++;
            Object orNull2 = CollectionsKt___CollectionsKt.getOrNull(list, i15);
            IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) orNull2;
            int iIntValue3 = intrinsicMeasurable2 != null ? function4.invoke(intrinsicMeasurable2, Integer.valueOf(i15), Integer.valueOf(i10)).intValue() : 0;
            int iIntValue4 = intrinsicMeasurable2 != null ? function3.invoke(intrinsicMeasurable2, Integer.valueOf(i15), Integer.valueOf(iIntValue3)).intValue() + i11 : 0;
            if (i14 >= 0 && i15 != list.size()) {
                if (i15 - i18 == i13 || i14 - iIntValue4 < 0) {
                }
                int i19 = iIntValue3;
                i17 = iMax;
                orNull = orNull2;
                iIntValue2 = iIntValue4;
                iIntValue = i19;
            }
            i16 += iMax + i12;
            iIntValue4 -= i11;
            i14 = i10;
            iMax = 0;
            i18 = i15;
            int i110 = iIntValue3;
            i17 = iMax;
            orNull = orNull2;
            iIntValue2 = iIntValue4;
            iIntValue = i110;
        }
        return i16 - i12;
    }

    /* JADX INFO: renamed from: access$flowMeasurePolicy-bs7tm-s, reason: not valid java name */
    public static final MeasurePolicy m265access$flowMeasurePolicybs7tms(final LayoutOrientation layoutOrientation, final Function5 function5, final float f6, final SizeMode sizeMode, final CrossAxisAlignment crossAxisAlignment, final Function5 function6, final float f10, final int i10) {
        return new MeasurePolicy(function5, f6, sizeMode, crossAxisAlignment, function6, f10, i10) { // from class: androidx.compose.foundation.layout.FlowLayoutKt$flowMeasurePolicy$1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final Lambda f4252a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public final Lambda f4253b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @NotNull
            public final Lambda f4254c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            @NotNull
            public final Lambda f4255d;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ Function5<Integer, int[], LayoutDirection, Density, int[], Unit> f4257f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final /* synthetic */ float f4258g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public final /* synthetic */ SizeMode f4259h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public final /* synthetic */ CrossAxisAlignment f4260i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public final /* synthetic */ int f4261j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public final /* synthetic */ float f4262k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public final /* synthetic */ Function5<Integer, int[], LayoutDirection, Density, int[], Unit> f4263l;

            /* JADX INFO: compiled from: FlowLayout.kt */
            public static final class a extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

                /* JADX INFO: renamed from: p0, reason: collision with root package name */
                public static final a f4264p0 = new a(1);

                @Override // kotlin.jvm.functions.Function1
                public final Unit invoke(Placeable.PlacementScope placementScope) {
                    Placeable.PlacementScope layout = placementScope;
                    Intrinsics.checkNotNullParameter(layout, "$this$layout");
                    return Unit.INSTANCE;
                }
            }

            /* JADX INFO: compiled from: FlowLayout.kt */
            @SourceDebugExtension({"SMAP\nFlowLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowLayout.kt\nandroidx/compose/foundation/layout/FlowLayoutKt$flowMeasurePolicy$1$measure$2\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,755:1\n476#2,11:756\n*S KotlinDebug\n*F\n+ 1 FlowLayout.kt\nandroidx/compose/foundation/layout/FlowLayoutKt$flowMeasurePolicy$1$measure$2\n*L\n274#1:756,11\n*E\n"})
            public static final class b extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

                /* JADX INFO: renamed from: p0, reason: collision with root package name */
                public final /* synthetic */ FlowResult f4265p0;

                /* JADX INFO: renamed from: q0, reason: collision with root package name */
                public final /* synthetic */ RowColumnMeasurementHelper f4266q0;

                /* JADX INFO: renamed from: r0, reason: collision with root package name */
                public final /* synthetic */ int[] f4267r0;

                /* JADX INFO: renamed from: s0, reason: collision with root package name */
                public final /* synthetic */ MeasureScope f4268s0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(FlowResult flowResult, RowColumnMeasurementHelper rowColumnMeasurementHelper, int[] iArr, MeasureScope measureScope) {
                    super(1);
                    this.f4265p0 = flowResult;
                    this.f4266q0 = rowColumnMeasurementHelper;
                    this.f4267r0 = iArr;
                    this.f4268s0 = measureScope;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Unit invoke(Placeable.PlacementScope placementScope) {
                    Placeable.PlacementScope layout = placementScope;
                    Intrinsics.checkNotNullParameter(layout, "$this$layout");
                    MutableVector<RowColumnMeasureHelperResult> items = this.f4265p0.getItems();
                    int size = items.getSize();
                    if (size > 0) {
                        RowColumnMeasureHelperResult[] content = items.getContent();
                        int i10 = 0;
                        do {
                            this.f4266q0.placeHelper(layout, content[i10], this.f4267r0[i10], this.f4268s0.getLayoutDirection());
                            i10++;
                        } while (i10 < size);
                    }
                    return Unit.INSTANCE;
                }
            }

            {
                this.f4257f = function5;
                this.f4258g = f6;
                this.f4259h = sizeMode;
                this.f4260i = crossAxisAlignment;
                this.f4261j = i10;
                this.f4262k = f10;
                this.f4263l = function6;
                LayoutOrientation layoutOrientation2 = LayoutOrientation.Horizontal;
                this.f4252a = this.f4256e == layoutOrientation2 ? v.f94461p0 : w.f94464p0;
                this.f4253b = this.f4256e == layoutOrientation2 ? t.f94403p0 : u.f94405p0;
                this.f4254c = this.f4256e == layoutOrientation2 ? x.f94471p0 : y.f94473p0;
                this.f4255d = this.f4256e == layoutOrientation2 ? z.f94474p0 : a0.f94303p0;
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function3<androidx.compose.ui.layout.IntrinsicMeasurable, java.lang.Integer, java.lang.Integer, java.lang.Integer>, kotlin.jvm.internal.Lambda] */
            @NotNull
            public final Function3<IntrinsicMeasurable, Integer, Integer, Integer> getMaxCrossAxisIntrinsicItemSize() {
                return this.f4253b;
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function3<androidx.compose.ui.layout.IntrinsicMeasurable, java.lang.Integer, java.lang.Integer, java.lang.Integer>, kotlin.jvm.internal.Lambda] */
            @NotNull
            public final Function3<IntrinsicMeasurable, Integer, Integer, Integer> getMaxMainAxisIntrinsicItemSize() {
                return this.f4252a;
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function3<androidx.compose.ui.layout.IntrinsicMeasurable, java.lang.Integer, java.lang.Integer, java.lang.Integer>, kotlin.jvm.internal.Lambda] */
            @NotNull
            public final Function3<IntrinsicMeasurable, Integer, Integer, Integer> getMinCrossAxisIntrinsicItemSize() {
                return this.f4254c;
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function3<androidx.compose.ui.layout.IntrinsicMeasurable, java.lang.Integer, java.lang.Integer, java.lang.Integer>, kotlin.jvm.internal.Lambda] */
            @NotNull
            public final Function3<IntrinsicMeasurable, Integer, Integer, Integer> getMinMainAxisIntrinsicItemSize() {
                return this.f4255d;
            }

            /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.jvm.functions.Function3, kotlin.jvm.internal.Lambda] */
            /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.jvm.functions.Function3, kotlin.jvm.internal.Lambda] */
            public final int intrinsicCrossAxisSize(@NotNull List<? extends IntrinsicMeasurable> measurables, int mainAxisAvailable, int mainAxisSpacing, int crossAxisSpacing) {
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                return FlowLayoutKt.a(measurables, this.f4255d, this.f4254c, mainAxisAvailable, mainAxisSpacing, crossAxisSpacing, this.f4261j);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i11) {
                Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                LayoutOrientation layoutOrientation2 = this.f4256e;
                LayoutOrientation layoutOrientation3 = LayoutOrientation.Horizontal;
                float f11 = this.f4258g;
                return layoutOrientation2 == layoutOrientation3 ? intrinsicCrossAxisSize(measurables, i11, intrinsicMeasureScope.mo413roundToPx0680j_4(f11), intrinsicMeasureScope.mo413roundToPx0680j_4(this.f4262k)) : maxIntrinsicMainAxisSize(measurables, i11, intrinsicMeasureScope.mo413roundToPx0680j_4(f11));
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.functions.Function3, kotlin.jvm.internal.Lambda] */
            public final int maxIntrinsicMainAxisSize(@NotNull List<? extends IntrinsicMeasurable> measurables, int height, int arrangementSpacing) {
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                return FlowLayoutKt.access$maxIntrinsicMainAxisSize(measurables, this.f4252a, height, arrangementSpacing, this.f4261j);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i11) {
                Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                LayoutOrientation layoutOrientation2 = this.f4256e;
                LayoutOrientation layoutOrientation3 = LayoutOrientation.Horizontal;
                float f11 = this.f4258g;
                return layoutOrientation2 == layoutOrientation3 ? maxIntrinsicMainAxisSize(measurables, i11, intrinsicMeasureScope.mo413roundToPx0680j_4(f11)) : intrinsicCrossAxisSize(measurables, i11, intrinsicMeasureScope.mo413roundToPx0680j_4(f11), intrinsicMeasureScope.mo413roundToPx0680j_4(this.f4262k));
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            @NotNull
            /* JADX INFO: renamed from: measure-3p2s80s */
            public MeasureResult mo113measure3p2s80s(@NotNull MeasureScope measure, @NotNull List<? extends Measurable> measurables, long j10) {
                int mainAxisTotalSize;
                Intrinsics.checkNotNullParameter(measure, "$this$measure");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                if (measurables.isEmpty()) {
                    return MeasureScope.CC.q(measure, 0, 0, null, a.f4264p0, 4, null);
                }
                RowColumnMeasurementHelper rowColumnMeasurementHelper = new RowColumnMeasurementHelper(this.f4256e, this.f4257f, this.f4258g, this.f4259h, this.f4260i, measurables, new Placeable[measurables.size()], null);
                LayoutOrientation layoutOrientation2 = this.f4256e;
                FlowResult flowResultM266breakDownItemsw1Onq5I = FlowLayoutKt.m266breakDownItemsw1Onq5I(measure, rowColumnMeasurementHelper, this.f4256e, OrientationIndependentConstraints.m273constructorimpl(j10, layoutOrientation2), this.f4261j);
                MutableVector<RowColumnMeasureHelperResult> items = flowResultM266breakDownItemsw1Onq5I.getItems();
                int size = items.getSize();
                int[] iArr = new int[size];
                for (int i11 = 0; i11 < size; i11++) {
                    iArr[i11] = items.getContent()[i11].getCrossAxisSize();
                }
                int[] iArr2 = new int[size];
                int size2 = ((items.getSize() - 1) * measure.mo413roundToPx0680j_4(this.f4262k)) + flowResultM266breakDownItemsw1Onq5I.getCrossAxisTotalSize();
                this.f4263l.invoke(Integer.valueOf(size2), iArr, measure.getLayoutDirection(), measure, iArr2);
                if (layoutOrientation2 == LayoutOrientation.Horizontal) {
                    size2 = flowResultM266breakDownItemsw1Onq5I.getMainAxisTotalSize();
                    mainAxisTotalSize = size2;
                } else {
                    mainAxisTotalSize = flowResultM266breakDownItemsw1Onq5I.getMainAxisTotalSize();
                }
                return MeasureScope.CC.q(measure, ConstraintsKt.m4371constrainWidthK40F9xA(j10, size2), ConstraintsKt.m4370constrainHeightK40F9xA(j10, mainAxisTotalSize), null, new b(flowResultM266breakDownItemsw1Onq5I, rowColumnMeasurementHelper, iArr2, measure), 4, null);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i11) {
                Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                LayoutOrientation layoutOrientation2 = this.f4256e;
                LayoutOrientation layoutOrientation3 = LayoutOrientation.Horizontal;
                float f11 = this.f4262k;
                float f12 = this.f4258g;
                return layoutOrientation2 == layoutOrientation3 ? intrinsicCrossAxisSize(measurables, i11, intrinsicMeasureScope.mo413roundToPx0680j_4(f12), intrinsicMeasureScope.mo413roundToPx0680j_4(f11)) : minIntrinsicMainAxisSize(measurables, i11, intrinsicMeasureScope.mo413roundToPx0680j_4(f12), intrinsicMeasureScope.mo413roundToPx0680j_4(f11));
            }

            /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.jvm.functions.Function3, kotlin.jvm.internal.Lambda] */
            /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.jvm.functions.Function3, kotlin.jvm.internal.Lambda] */
            public final int minIntrinsicMainAxisSize(@NotNull List<? extends IntrinsicMeasurable> measurables, int crossAxisAvailable, int mainAxisSpacing, int crossAxisSpacing) {
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                return FlowLayoutKt.access$minIntrinsicMainAxisSize(measurables, this.f4255d, this.f4254c, crossAxisAvailable, mainAxisSpacing, crossAxisSpacing, this.f4261j);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i11) {
                Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                LayoutOrientation layoutOrientation2 = this.f4256e;
                LayoutOrientation layoutOrientation3 = LayoutOrientation.Horizontal;
                float f11 = this.f4262k;
                float f12 = this.f4258g;
                return layoutOrientation2 == layoutOrientation3 ? minIntrinsicMainAxisSize(measurables, i11, intrinsicMeasureScope.mo413roundToPx0680j_4(f12), intrinsicMeasureScope.mo413roundToPx0680j_4(f11)) : intrinsicCrossAxisSize(measurables, i11, intrinsicMeasureScope.mo413roundToPx0680j_4(f12), intrinsicMeasureScope.mo413roundToPx0680j_4(f11));
            }
        };
    }

    public static final Function5 access$getHorizontalArrangement(Arrangement.Horizontal horizontal) {
        return new androidx.compose.foundation.layout.b(horizontal);
    }

    public static final Function5 access$getVerticalArrangement(Arrangement.Vertical vertical) {
        return new c(vertical);
    }

    public static final int access$maxIntrinsicMainAxisSize(List list, Function3 function3, int i10, int i11, int i12) {
        int size = list.size();
        int i13 = 0;
        int iMax = 0;
        int i14 = 0;
        int i15 = 0;
        while (i13 < size) {
            int iIntValue = ((Number) function3.invoke((IntrinsicMeasurable) list.get(i13), Integer.valueOf(i13), Integer.valueOf(i10))).intValue() + i11;
            int i16 = i13 + 1;
            if (i16 - i14 == i12 || i16 == list.size()) {
                iMax = Math.max(iMax, (i15 + iIntValue) - i11);
                i15 = 0;
                i14 = i13;
            } else {
                i15 += iIntValue;
            }
            i13 = i16;
        }
        return iMax;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    public static final int access$minIntrinsicMainAxisSize(List list, Function3 function3, Function3 function4, int i10, int i11, int i12, int i13) {
        int size = list.size();
        int[] iArr = new int[size];
        for (int i14 = 0; i14 < size; i14++) {
            iArr[i14] = 0;
        }
        int size2 = list.size();
        int[] iArr2 = new int[size2];
        for (int i15 = 0; i15 < size2; i15++) {
            iArr2[i15] = 0;
        }
        int size3 = list.size();
        for (int i16 = 0; i16 < size3; i16++) {
            IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) list.get(i16);
            int iIntValue = ((Number) function3.invoke(intrinsicMeasurable, Integer.valueOf(i16), Integer.valueOf(i10))).intValue();
            iArr[i16] = iIntValue;
            iArr2[i16] = ((Number) function4.invoke(intrinsicMeasurable, Integer.valueOf(i16), Integer.valueOf(iIntValue))).intValue();
        }
        int iSum = ArraysKt___ArraysKt.sum(iArr);
        if (size2 == 0) {
            throw new NoSuchElementException();
        }
        int iA = iArr2[0];
        ?? it = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(iArr2)).iterator();
        while (it.hasNext()) {
            int i17 = iArr2[it.nextInt()];
            if (iA < i17) {
                iA = i17;
            }
        }
        if (size == 0) {
            throw new NoSuchElementException();
        }
        int i18 = iArr[0];
        ?? it2 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(iArr)).iterator();
        while (it2.hasNext()) {
            int i19 = iArr[it2.nextInt()];
            if (i18 < i19) {
                i18 = i19;
            }
        }
        int i20 = iSum;
        while (i18 < iSum && iA != i10) {
            i20 = (i18 + iSum) / 2;
            iA = a(list, new b0(iArr), new c0(iArr2), i20, i11, i12, i13);
            if (iA == i10) {
                break;
            }
            if (iA > i10) {
                i18 = i20 + 1;
            } else {
                iSum = i20 - 1;
            }
        }
        return i20;
    }

    public static final int b(Measurable measurable, long j10, LayoutOrientation layoutOrientation, Function1<? super Placeable, Unit> function1) {
        if (RowColumnImplKt.getWeight(RowColumnImplKt.getRowColumnParentData(measurable)) != 0.0f) {
            return mainAxisMin(measurable, layoutOrientation, Integer.MAX_VALUE);
        }
        Placeable placeableMo3575measureBRTryo0 = measurable.mo3575measureBRTryo0(OrientationIndependentConstraints.m286toBoxConstraintsOenEA2s(OrientationIndependentConstraints.m275copyyUG9Ft0$default(j10, 0, 0, 0, 0, 14, null), layoutOrientation));
        function1.invoke(placeableMo3575measureBRTryo0);
        return mainAxisSize(placeableMo3575measureBRTryo0, layoutOrientation);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:26:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:27:0x00d3  */
    @NotNull
    /* JADX INFO: renamed from: breakDownItems-w1Onq5I, reason: not valid java name */
    public static final FlowResult m266breakDownItemsw1Onq5I(@NotNull MeasureScope breakDownItems, @NotNull RowColumnMeasurementHelper measureHelper, @NotNull LayoutOrientation orientation, long j10, int i10) {
        Integer numValueOf;
        Intrinsics.checkNotNullParameter(breakDownItems, "$this$breakDownItems");
        Intrinsics.checkNotNullParameter(measureHelper, "measureHelper");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        MutableVector mutableVector = new MutableVector(new RowColumnMeasureHelperResult[16], 0);
        int iM4357getMaxWidthimpl = Constraints.m4357getMaxWidthimpl(j10);
        int iM4359getMinWidthimpl = Constraints.m4359getMinWidthimpl(j10);
        int iM4356getMaxHeightimpl = Constraints.m4356getMaxHeightimpl(j10);
        List<Measurable> measurables = measureHelper.getMeasurables();
        Placeable[] placeables = measureHelper.getPlaceables();
        int iCeil = (int) Math.ceil(breakDownItems.mo415toPx0680j_4(measureHelper.getArrangementSpacing()));
        long jM272constructorimpl = OrientationIndependentConstraints.m272constructorimpl(iM4359getMinWidthimpl, iM4357getMaxWidthimpl, 0, iM4356getMaxHeightimpl);
        Measurable measurable = (Measurable) CollectionsKt___CollectionsKt.getOrNull(measurables, 0);
        Integer numValueOf2 = measurable != null ? Integer.valueOf(b(measurable, jM272constructorimpl, orientation, new b(placeables))) : null;
        Integer[] numArr = new Integer[measurables.size()];
        int size = measurables.size();
        int i11 = iM4357getMaxWidthimpl;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (i12 < size) {
            Intrinsics.checkNotNull(numValueOf2);
            int iIntValue = numValueOf2.intValue();
            int i16 = i13 + iIntValue;
            i11 -= iIntValue;
            int i17 = i12 + 1;
            Measurable measurable2 = (Measurable) CollectionsKt___CollectionsKt.getOrNull(measurables, i17);
            Integer numValueOf3 = measurable2 != null ? Integer.valueOf(b(measurable2, jM272constructorimpl, orientation, new a(placeables, i12)) + iCeil) : null;
            if (i17 >= measurables.size() || i17 - i14 >= i10) {
                int iMin = Math.min(Math.max(iM4359getMinWidthimpl, i16), iM4357getMaxWidthimpl);
                numArr[i15] = Integer.valueOf(i17);
                i15++;
                if (numValueOf3 != null) {
                    numValueOf = Integer.valueOf(numValueOf3.intValue() - iCeil);
                } else {
                    numValueOf = null;
                }
                i11 = iM4357getMaxWidthimpl;
                numValueOf3 = numValueOf;
                i14 = i17;
                i13 = 0;
                iM4359getMinWidthimpl = iMin;
            } else {
                if (i11 - (numValueOf3 != null ? numValueOf3.intValue() : 0) < 0) {
                    int iMin2 = Math.min(Math.max(iM4359getMinWidthimpl, i16), iM4357getMaxWidthimpl);
                    numArr[i15] = Integer.valueOf(i17);
                    i15++;
                    if (numValueOf3 != null) {
                        numValueOf = Integer.valueOf(numValueOf3.intValue() - iCeil);
                    } else {
                        numValueOf = null;
                    }
                    i11 = iM4357getMaxWidthimpl;
                    numValueOf3 = numValueOf;
                    i14 = i17;
                    i13 = 0;
                    iM4359getMinWidthimpl = iMin2;
                } else {
                    i13 = i16;
                }
            }
            i12 = i17;
            numValueOf2 = numValueOf3;
        }
        int iMax = iM4359getMinWidthimpl;
        long jM286toBoxConstraintsOenEA2s = OrientationIndependentConstraints.m286toBoxConstraintsOenEA2s(OrientationIndependentConstraints.m275copyyUG9Ft0$default(jM272constructorimpl, iMax, 0, 0, 0, 14, null), orientation);
        int iIntValue2 = 0;
        int crossAxisSize = 0;
        int i18 = 0;
        Integer num = (Integer) ArraysKt___ArraysKt.getOrNull(numArr, 0);
        while (num != null) {
            RowColumnMeasureHelperResult rowColumnMeasureHelperResultM315measureWithoutPlacing_EkL_Y = measureHelper.m315measureWithoutPlacing_EkL_Y(breakDownItems, jM286toBoxConstraintsOenEA2s, iIntValue2, num.intValue());
            crossAxisSize += rowColumnMeasureHelperResultM315measureWithoutPlacing_EkL_Y.getCrossAxisSize();
            iMax = Math.max(iMax, rowColumnMeasureHelperResultM315measureWithoutPlacing_EkL_Y.getMainAxisSize());
            mutableVector.add(rowColumnMeasureHelperResultM315measureWithoutPlacing_EkL_Y);
            iIntValue2 = num.intValue();
            i18++;
            num = (Integer) ArraysKt___ArraysKt.getOrNull(numArr, i18);
        }
        return new FlowResult(Math.max(iMax, Constraints.m4359getMinWidthimpl(j10)), Math.max(crossAxisSize, Constraints.m4358getMinHeightimpl(j10)), mutableVector);
    }

    @Composable
    @PublishedApi
    @NotNull
    public static final MeasurePolicy columnMeasurementHelper(@NotNull Arrangement.Vertical verticalArrangement, @NotNull Arrangement.Horizontal horizontalArrangement, int i10, @Nullable Composer composer, int i11) {
        Intrinsics.checkNotNullParameter(verticalArrangement, "verticalArrangement");
        Intrinsics.checkNotNullParameter(horizontalArrangement, "horizontalArrangement");
        composer.startReplaceableGroup(-2013098357);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2013098357, i11, -1, "androidx.compose.foundation.layout.columnMeasurementHelper (FlowLayout.kt:184)");
        }
        Integer numValueOf = Integer.valueOf(i10);
        composer.startReplaceableGroup(1618982084);
        boolean zChanged = composer.changed(numValueOf) | composer.changed(verticalArrangement) | composer.changed(horizontalArrangement);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = m265access$flowMeasurePolicybs7tms(LayoutOrientation.Vertical, access$getVerticalArrangement(verticalArrangement), verticalArrangement.getSpacing(), SizeMode.Wrap, f4248b, access$getHorizontalArrangement(horizontalArrangement), horizontalArrangement.getSpacing(), i10);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return measurePolicy;
    }

    public static final int crossAxisMin(@NotNull Measurable measurable, @NotNull LayoutOrientation orientation, int i10) {
        Intrinsics.checkNotNullParameter(measurable, "<this>");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        return orientation == LayoutOrientation.Horizontal ? measurable.minIntrinsicHeight(i10) : measurable.minIntrinsicWidth(i10);
    }

    public static final int crossAxisSize(@NotNull Placeable placeable, @NotNull LayoutOrientation orientation) {
        Intrinsics.checkNotNullParameter(placeable, "<this>");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        return orientation == LayoutOrientation.Horizontal ? placeable.getHeight() : placeable.getWidth();
    }

    public static final int mainAxisMin(@NotNull Measurable measurable, @NotNull LayoutOrientation orientation, int i10) {
        Intrinsics.checkNotNullParameter(measurable, "<this>");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        return orientation == LayoutOrientation.Horizontal ? measurable.minIntrinsicWidth(i10) : measurable.minIntrinsicHeight(i10);
    }

    public static final int mainAxisSize(@NotNull Placeable placeable, @NotNull LayoutOrientation orientation) {
        Intrinsics.checkNotNullParameter(placeable, "<this>");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        return orientation == LayoutOrientation.Horizontal ? placeable.getWidth() : placeable.getHeight();
    }

    @Composable
    @PublishedApi
    @NotNull
    public static final MeasurePolicy rowMeasurementHelper(@NotNull Arrangement.Horizontal horizontalArrangement, @NotNull Arrangement.Vertical verticalArrangement, int i10, @Nullable Composer composer, int i11) {
        Intrinsics.checkNotNullParameter(horizontalArrangement, "horizontalArrangement");
        Intrinsics.checkNotNullParameter(verticalArrangement, "verticalArrangement");
        composer.startReplaceableGroup(1479255111);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1479255111, i11, -1, "androidx.compose.foundation.layout.rowMeasurementHelper (FlowLayout.kt:163)");
        }
        Integer numValueOf = Integer.valueOf(i10);
        composer.startReplaceableGroup(1618982084);
        boolean zChanged = composer.changed(numValueOf) | composer.changed(horizontalArrangement) | composer.changed(verticalArrangement);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = m265access$flowMeasurePolicybs7tms(LayoutOrientation.Horizontal, access$getHorizontalArrangement(horizontalArrangement), horizontalArrangement.getSpacing(), SizeMode.Wrap, f4247a, access$getVerticalArrangement(verticalArrangement), verticalArrangement.getSpacing(), i10);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return measurePolicy;
    }
}
