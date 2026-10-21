package r;

import androidx.compose.animation.AnimatedVisibilityScopeImpl;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AnimatedVisibility.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nAnimatedVisibility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedVisibility.kt\nandroidx/compose/animation/AnimatedEnterExitMeasurePolicy\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,863:1\n1549#2:864\n1620#2,3:865\n171#3,13:868\n171#3,13:881\n*S KotlinDebug\n*F\n+ 1 AnimatedVisibility.kt\nandroidx/compose/animation/AnimatedEnterExitMeasurePolicy\n*L\n795#1:864\n795#1:865,3\n796#1:868,13\n797#1:881,13\n*E\n"})
public final class b implements MeasurePolicy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final AnimatedVisibilityScopeImpl f92883a;

    /* JADX INFO: compiled from: AnimatedVisibility.kt */
    public static final class a extends Lambda implements Function1<IntrinsicMeasurable, Integer> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ int f92884p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i10) {
            super(1);
            this.f92884p0 = i10;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable) {
            IntrinsicMeasurable it = intrinsicMeasurable;
            Intrinsics.checkNotNullParameter(it, "it");
            return Integer.valueOf(it.maxIntrinsicHeight(this.f92884p0));
        }
    }

    /* JADX INFO: renamed from: r.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AnimatedVisibility.kt */
    public static final class C0484b extends Lambda implements Function1<IntrinsicMeasurable, Integer> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ int f92885p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0484b(int i10) {
            super(1);
            this.f92885p0 = i10;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable) {
            IntrinsicMeasurable it = intrinsicMeasurable;
            Intrinsics.checkNotNullParameter(it, "it");
            return Integer.valueOf(it.maxIntrinsicWidth(this.f92885p0));
        }
    }

    /* JADX INFO: compiled from: AnimatedVisibility.kt */
    @SourceDebugExtension({"SMAP\nAnimatedVisibility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedVisibility.kt\nandroidx/compose/animation/AnimatedEnterExitMeasurePolicy$measure$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,863:1\n33#2,6:864\n*S KotlinDebug\n*F\n+ 1 AnimatedVisibility.kt\nandroidx/compose/animation/AnimatedEnterExitMeasurePolicy$measure$1\n*L\n801#1:864,6\n*E\n"})
    public static final class c extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ List<Placeable> f92886p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ArrayList arrayList) {
            super(1);
            this.f92886p0 = arrayList;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Placeable.PlacementScope placementScope) {
            Placeable.PlacementScope layout = placementScope;
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            List<Placeable> list = this.f92886p0;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                Placeable.PlacementScope.place$default(layout, list.get(i10), 0, 0, 0.0f, 4, null);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: AnimatedVisibility.kt */
    public static final class d extends Lambda implements Function1<IntrinsicMeasurable, Integer> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ int f92887p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i10) {
            super(1);
            this.f92887p0 = i10;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable) {
            IntrinsicMeasurable it = intrinsicMeasurable;
            Intrinsics.checkNotNullParameter(it, "it");
            return Integer.valueOf(it.minIntrinsicHeight(this.f92887p0));
        }
    }

    /* JADX INFO: compiled from: AnimatedVisibility.kt */
    public static final class e extends Lambda implements Function1<IntrinsicMeasurable, Integer> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ int f92888p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(int i10) {
            super(1);
            this.f92888p0 = i10;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable) {
            IntrinsicMeasurable it = intrinsicMeasurable;
            Intrinsics.checkNotNullParameter(it, "it");
            return Integer.valueOf(it.minIntrinsicWidth(this.f92888p0));
        }
    }

    public b(@NotNull AnimatedVisibilityScopeImpl scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f92883a = scope;
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
        Integer num = (Integer) SequencesKt___SequencesKt.maxOrNull(SequencesKt___SequencesKt.map(CollectionsKt___CollectionsKt.asSequence(measurables), new C0484b(i10)));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    @NotNull
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final MeasureResult mo113measure3p2s80s(@NotNull MeasureScope measure, @NotNull List<? extends Measurable> measurables, long j10) {
        Object obj;
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        List<? extends Measurable> list = measurables;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Measurable) it.next()).mo3575measureBRTryo0(j10));
        }
        int i10 = 1;
        Object obj2 = null;
        if (!arrayList.isEmpty()) {
            obj = arrayList.get(0);
            int width = ((Placeable) obj).getWidth();
            int lastIndex = CollectionsKt__CollectionsKt.getLastIndex(arrayList);
            if (1 <= lastIndex) {
                int i11 = 1;
                while (true) {
                    Object obj3 = arrayList.get(i11);
                    int width2 = ((Placeable) obj3).getWidth();
                    if (width < width2) {
                        obj = obj3;
                        width = width2;
                    }
                    if (i11 == lastIndex) {
                        break;
                    }
                    i11++;
                }
            }
        } else {
            obj = null;
        }
        Placeable placeable = (Placeable) obj;
        int width3 = placeable != null ? placeable.getWidth() : 0;
        if (!arrayList.isEmpty()) {
            Object obj4 = arrayList.get(0);
            int height = ((Placeable) obj4).getHeight();
            int lastIndex2 = CollectionsKt__CollectionsKt.getLastIndex(arrayList);
            if (1 <= lastIndex2) {
                while (true) {
                    Object obj5 = arrayList.get(i10);
                    int height2 = ((Placeable) obj5).getHeight();
                    if (height < height2) {
                        obj4 = obj5;
                        height = height2;
                    }
                    if (i10 == lastIndex2) {
                        break;
                    }
                    i10++;
                }
            }
            obj2 = obj4;
        }
        Placeable placeable2 = (Placeable) obj2;
        int height3 = placeable2 != null ? placeable2.getHeight() : 0;
        this.f92883a.getTargetSize$animation_release().setValue(IntSize.m4541boximpl(IntSizeKt.IntSize(width3, height3)));
        return MeasureScope.CC.q(measure, width3, height3, null, new c(arrayList), 4, null);
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
