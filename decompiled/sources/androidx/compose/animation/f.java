package androidx.compose.animation;

import androidx.camera.camera2.internal.n1;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AnimatedContent.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nAnimatedContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentMeasurePolicy\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,862:1\n69#2,6:863\n69#2,6:869\n14166#3,14:875\n14166#3,14:889\n*S KotlinDebug\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentMeasurePolicy\n*L\n810#1:863,6\n819#1:869,6\n825#1:875,14\n826#1:889,14\n*E\n"})
public final class f implements MeasurePolicy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final AnimatedContentTransitionScopeImpl<?> f3221a;

    /* JADX INFO: compiled from: AnimatedContent.kt */
    public static final class a extends Lambda implements Function1<IntrinsicMeasurable, Integer> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ int f3222p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i10) {
            super(1);
            this.f3222p0 = i10;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable) {
            IntrinsicMeasurable it = intrinsicMeasurable;
            Intrinsics.checkNotNullParameter(it, "it");
            return Integer.valueOf(it.maxIntrinsicHeight(this.f3222p0));
        }
    }

    /* JADX INFO: compiled from: AnimatedContent.kt */
    public static final class b extends Lambda implements Function1<IntrinsicMeasurable, Integer> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ int f3223p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i10) {
            super(1);
            this.f3223p0 = i10;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable) {
            IntrinsicMeasurable it = intrinsicMeasurable;
            Intrinsics.checkNotNullParameter(it, "it");
            return Integer.valueOf(it.maxIntrinsicWidth(this.f3223p0));
        }
    }

    /* JADX INFO: compiled from: AnimatedContent.kt */
    @SourceDebugExtension({"SMAP\nAnimatedContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentMeasurePolicy$measure$3\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,862:1\n13579#2,2:863\n*S KotlinDebug\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentMeasurePolicy$measure$3\n*L\n830#1:863,2\n*E\n"})
    public static final class c extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Placeable[] f3224p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ f f3225q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ int f3226r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f3227s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Placeable[] placeableArr, f fVar, int i10, int i11) {
            super(1);
            this.f3224p0 = placeableArr;
            this.f3225q0 = fVar;
            this.f3226r0 = i10;
            this.f3227s0 = i11;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Placeable.PlacementScope placementScope) {
            Placeable.PlacementScope layout = placementScope;
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            for (Placeable placeable : this.f3224p0) {
                if (placeable != null) {
                    long jMo2184alignKFBX0sM = this.f3225q0.f3221a.getContentAlignment().mo2184alignKFBX0sM(IntSizeKt.IntSize(placeable.getWidth(), placeable.getHeight()), IntSizeKt.IntSize(this.f3226r0, this.f3227s0), LayoutDirection.Ltr);
                    Placeable.PlacementScope.place$default(layout, placeable, IntOffset.m4507getXimpl(jMo2184alignKFBX0sM), IntOffset.m4508getYimpl(jMo2184alignKFBX0sM), 0.0f, 4, null);
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: AnimatedContent.kt */
    public static final class d extends Lambda implements Function1<IntrinsicMeasurable, Integer> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ int f3228p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i10) {
            super(1);
            this.f3228p0 = i10;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable) {
            IntrinsicMeasurable it = intrinsicMeasurable;
            Intrinsics.checkNotNullParameter(it, "it");
            return Integer.valueOf(it.minIntrinsicHeight(this.f3228p0));
        }
    }

    /* JADX INFO: compiled from: AnimatedContent.kt */
    public static final class e extends Lambda implements Function1<IntrinsicMeasurable, Integer> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ int f3229p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(int i10) {
            super(1);
            this.f3229p0 = i10;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable) {
            IntrinsicMeasurable it = intrinsicMeasurable;
            Intrinsics.checkNotNullParameter(it, "it");
            return Integer.valueOf(it.minIntrinsicWidth(this.f3229p0));
        }
    }

    public f(@NotNull AnimatedContentTransitionScopeImpl<?> rootScope) {
        Intrinsics.checkNotNullParameter(rootScope, "rootScope");
        this.f3221a = rootScope;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i10) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        Integer num = (Integer) SequencesKt___SequencesKt.maxOrNull(SequencesKt___SequencesKt.map(CollectionsKt___CollectionsKt.asSequence(measurables), new a(i10)));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i10) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        Integer num = (Integer) SequencesKt___SequencesKt.maxOrNull(SequencesKt___SequencesKt.map(CollectionsKt___CollectionsKt.asSequence(measurables), new b(i10)));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    @NotNull
    /* JADX INFO: renamed from: measure-3p2s80s, reason: not valid java name */
    public final MeasureResult mo113measure3p2s80s(@NotNull MeasureScope measure, @NotNull List<? extends Measurable> measurables, long j10) {
        Placeable placeable;
        Placeable placeable2;
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        int size = measurables.size();
        Placeable[] placeableArr = new Placeable[size];
        int size2 = measurables.size();
        int i10 = 0;
        while (true) {
            placeable = null;
            if (i10 >= size2) {
                break;
            }
            Measurable measurable = measurables.get(i10);
            Object parentData = measurable.getParentData();
            AnimatedContentTransitionScopeImpl.ChildData childData = parentData instanceof AnimatedContentTransitionScopeImpl.ChildData ? (AnimatedContentTransitionScopeImpl.ChildData) parentData : null;
            if (childData != null && childData.isTarget()) {
                placeableArr[i10] = measurable.mo3575measureBRTryo0(j10);
            }
            i10++;
        }
        int size3 = measurables.size();
        for (int i11 = 0; i11 < size3; i11++) {
            Measurable measurable2 = measurables.get(i11);
            if (placeableArr[i11] == null) {
                placeableArr[i11] = measurable2.mo3575measureBRTryo0(j10);
            }
        }
        if (size == 0) {
            placeable2 = null;
        } else {
            placeable2 = placeableArr[0];
            int lastIndex = ArraysKt___ArraysKt.getLastIndex(placeableArr);
            if (lastIndex != 0) {
                int width = placeable2 != null ? placeable2.getWidth() : 0;
                IntIterator intIteratorG = n1.g(1, lastIndex);
                while (intIteratorG.hasNext()) {
                    Placeable placeable3 = placeableArr[intIteratorG.nextInt()];
                    int width2 = placeable3 != null ? placeable3.getWidth() : 0;
                    if (width < width2) {
                        placeable2 = placeable3;
                        width = width2;
                    }
                }
            }
        }
        int width3 = placeable2 != null ? placeable2.getWidth() : 0;
        if (size != 0) {
            placeable = placeableArr[0];
            int lastIndex2 = ArraysKt___ArraysKt.getLastIndex(placeableArr);
            if (lastIndex2 != 0) {
                int height = placeable != null ? placeable.getHeight() : 0;
                IntIterator intIteratorG2 = n1.g(1, lastIndex2);
                while (intIteratorG2.hasNext()) {
                    Placeable placeable4 = placeableArr[intIteratorG2.nextInt()];
                    int height2 = placeable4 != null ? placeable4.getHeight() : 0;
                    if (height < height2) {
                        placeable = placeable4;
                        height = height2;
                    }
                }
            }
        }
        int height3 = placeable != null ? placeable.getHeight() : 0;
        this.f3221a.m46setMeasuredSizeozmzZPI$animation_release(IntSizeKt.IntSize(width3, height3));
        return MeasureScope.CC.q(measure, width3, height3, null, new c(placeableArr, this, width3, height3), 4, null);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i10) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        Integer num = (Integer) SequencesKt___SequencesKt.maxOrNull(SequencesKt___SequencesKt.map(CollectionsKt___CollectionsKt.asSequence(measurables), new d(i10)));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i10) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        Integer num = (Integer) SequencesKt___SequencesKt.maxOrNull(SequencesKt___SequencesKt.map(CollectionsKt___CollectionsKt.asSequence(measurables), new e(i10)));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }
}
