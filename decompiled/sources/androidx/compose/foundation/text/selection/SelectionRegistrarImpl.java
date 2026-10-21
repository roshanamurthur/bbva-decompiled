package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import bk.q;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SelectionRegistrarImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bc\u0010dJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\u0006\u0010\n\u001a\u00020\tJ\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0007H\u0016J-\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0007H\u0016J=\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u001f\u001a\u00020\u0005H\u0016J\u0010\u0010 \u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0007H\u0016R\"\u0010'\u001a\u00020\u001a8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R0\u0010/\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0005\u0018\u00010(8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R?\u00107\u001a\u001c\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0005\u0018\u0001008\u0000@\u0000X\u0080\u000eø\u0001\u0001¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R0\u0010;\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0005\u0018\u00010(8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b8\u0010*\u001a\u0004\b9\u0010,\"\u0004\b:\u0010.RK\u0010C\u001a(\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u001a\u0018\u00010<8\u0000@\u0000X\u0080\u000eø\u0001\u0001¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR*\u0010K\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010D8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR0\u0010O\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0005\u0018\u00010(8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bL\u0010*\u001a\u0004\bM\u0010,\"\u0004\bN\u0010.R0\u0010S\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0005\u0018\u00010(8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bP\u0010*\u001a\u0004\bQ\u0010,\"\u0004\bR\u0010.RC\u0010]\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020U0T2\u0012\u0010V\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020U0T8V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\u001a\u0010`\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b^\u0010_R \u0010b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020T8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\ba\u0010Z\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006e"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;", "Landroidx/compose/foundation/text/selection/SelectionRegistrar;", "Landroidx/compose/foundation/text/selection/Selectable;", "selectable", "subscribe", "", "unsubscribe", "", "nextSelectableId", "Landroidx/compose/ui/layout/LayoutCoordinates;", "containerLayoutCoordinates", "", "sort", "selectableId", "notifyPositionChange", "layoutCoordinates", "Landroidx/compose/ui/geometry/Offset;", "startPosition", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "adjustment", "notifySelectionUpdateStart-d-4ec7I", "(Landroidx/compose/ui/layout/LayoutCoordinates;JLandroidx/compose/foundation/text/selection/SelectionAdjustment;)V", "notifySelectionUpdateStart", "notifySelectionUpdateSelectAll", "newPosition", "previousPosition", "", "isStartHandle", "notifySelectionUpdate-5iVPX68", "(Landroidx/compose/ui/layout/LayoutCoordinates;JJZLandroidx/compose/foundation/text/selection/SelectionAdjustment;)Z", "notifySelectionUpdate", "notifySelectionUpdateEnd", "notifySelectableChange", "a", "Z", "getSorted$foundation_release", "()Z", "setSorted$foundation_release", "(Z)V", "sorted", "Lkotlin/Function1;", "e", "Lkotlin/jvm/functions/Function1;", "getOnPositionChangeCallback$foundation_release", "()Lkotlin/jvm/functions/Function1;", "setOnPositionChangeCallback$foundation_release", "(Lkotlin/jvm/functions/Function1;)V", "onPositionChangeCallback", "Lkotlin/Function3;", "f", "Lkotlin/jvm/functions/Function3;", "getOnSelectionUpdateStartCallback$foundation_release", "()Lkotlin/jvm/functions/Function3;", "setOnSelectionUpdateStartCallback$foundation_release", "(Lkotlin/jvm/functions/Function3;)V", "onSelectionUpdateStartCallback", "g", "getOnSelectionUpdateSelectAll$foundation_release", "setOnSelectionUpdateSelectAll$foundation_release", "onSelectionUpdateSelectAll", "Lkotlin/Function5;", "h", "Lkotlin/jvm/functions/Function5;", "getOnSelectionUpdateCallback$foundation_release", "()Lkotlin/jvm/functions/Function5;", "setOnSelectionUpdateCallback$foundation_release", "(Lkotlin/jvm/functions/Function5;)V", "onSelectionUpdateCallback", "Lkotlin/Function0;", "i", "Lkotlin/jvm/functions/Function0;", "getOnSelectionUpdateEndCallback$foundation_release", "()Lkotlin/jvm/functions/Function0;", "setOnSelectionUpdateEndCallback$foundation_release", "(Lkotlin/jvm/functions/Function0;)V", "onSelectionUpdateEndCallback", "j", "getOnSelectableChangeCallback$foundation_release", "setOnSelectableChangeCallback$foundation_release", "onSelectableChangeCallback", "k", "getAfterSelectableUnsubscribe$foundation_release", "setAfterSelectableUnsubscribe$foundation_release", "afterSelectableUnsubscribe", "", "Landroidx/compose/foundation/text/selection/Selection;", "<set-?>", "l", "Landroidx/compose/runtime/MutableState;", "getSubselections", "()Ljava/util/Map;", "setSubselections", "(Ljava/util/Map;)V", "subselections", "getSelectables$foundation_release", "()Ljava/util/List;", "selectables", "getSelectableMap$foundation_release", "selectableMap", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSelectionRegistrarImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionRegistrarImpl.kt\nandroidx/compose/foundation/text/selection/SelectionRegistrarImpl\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,205:1\n81#2:206\n107#2,2:207\n*S KotlinDebug\n*F\n+ 1 SelectionRegistrarImpl.kt\nandroidx/compose/foundation/text/selection/SelectionRegistrarImpl\n*L\n99#1:206\n99#1:207,2\n*E\n"})
public final class SelectionRegistrarImpl implements SelectionRegistrar {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public boolean sorted;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function1<? super Long, Unit> onPositionChangeCallback;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function3<? super LayoutCoordinates, ? super Offset, ? super SelectionAdjustment, Unit> onSelectionUpdateStartCallback;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function1<? super Long, Unit> onSelectionUpdateSelectAll;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function5<? super LayoutCoordinates, ? super Offset, ? super Offset, ? super Boolean, ? super SelectionAdjustment, Boolean> onSelectionUpdateCallback;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function0<Unit> onSelectionUpdateEndCallback;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function1<? super Long, Unit> onSelectableChangeCallback;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function1<? super Long, Unit> afterSelectableUnsubscribe;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ArrayList f6387b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f6388c = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final AtomicLong f6389d = new AtomicLong(1);

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState subselections = SnapshotStateKt.mutableStateOf$default(q.emptyMap(), null, 2, null);

    /* JADX INFO: compiled from: SelectionRegistrarImpl.kt */
    public static final class a extends Lambda implements Function2<Selectable, Selectable, Integer> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ LayoutCoordinates f6398p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(LayoutCoordinates layoutCoordinates) {
            super(2);
            this.f6398p0 = layoutCoordinates;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Integer invoke(Selectable selectable, Selectable selectable2) {
            Selectable a10 = selectable;
            Selectable b10 = selectable2;
            Intrinsics.checkNotNullParameter(a10, "a");
            Intrinsics.checkNotNullParameter(b10, "b");
            LayoutCoordinates layoutCoordinates = a10.getLayoutCoordinates();
            LayoutCoordinates layoutCoordinates2 = b10.getLayoutCoordinates();
            LayoutCoordinates layoutCoordinates3 = this.f6398p0;
            long jMo3582localPositionOfR5De75A = layoutCoordinates != null ? layoutCoordinates3.mo3582localPositionOfR5De75A(layoutCoordinates, Offset.INSTANCE.m2291getZeroF1C5BW0()) : Offset.INSTANCE.m2291getZeroF1C5BW0();
            long jMo3582localPositionOfR5De75A2 = layoutCoordinates2 != null ? layoutCoordinates3.mo3582localPositionOfR5De75A(layoutCoordinates2, Offset.INSTANCE.m2291getZeroF1C5BW0()) : Offset.INSTANCE.m2291getZeroF1C5BW0();
            return Integer.valueOf(Offset.m2276getYimpl(jMo3582localPositionOfR5De75A) == Offset.m2276getYimpl(jMo3582localPositionOfR5De75A2) ? dk.e.compareValues(Float.valueOf(Offset.m2275getXimpl(jMo3582localPositionOfR5De75A)), Float.valueOf(Offset.m2275getXimpl(jMo3582localPositionOfR5De75A2))) : dk.e.compareValues(Float.valueOf(Offset.m2276getYimpl(jMo3582localPositionOfR5De75A)), Float.valueOf(Offset.m2276getYimpl(jMo3582localPositionOfR5De75A2))));
        }
    }

    @Nullable
    public final Function1<Long, Unit> getAfterSelectableUnsubscribe$foundation_release() {
        return this.afterSelectableUnsubscribe;
    }

    @Nullable
    public final Function1<Long, Unit> getOnPositionChangeCallback$foundation_release() {
        return this.onPositionChangeCallback;
    }

    @Nullable
    public final Function1<Long, Unit> getOnSelectableChangeCallback$foundation_release() {
        return this.onSelectableChangeCallback;
    }

    @Nullable
    public final Function5<LayoutCoordinates, Offset, Offset, Boolean, SelectionAdjustment, Boolean> getOnSelectionUpdateCallback$foundation_release() {
        return this.onSelectionUpdateCallback;
    }

    @Nullable
    public final Function0<Unit> getOnSelectionUpdateEndCallback$foundation_release() {
        return this.onSelectionUpdateEndCallback;
    }

    @Nullable
    public final Function1<Long, Unit> getOnSelectionUpdateSelectAll$foundation_release() {
        return this.onSelectionUpdateSelectAll;
    }

    @Nullable
    public final Function3<LayoutCoordinates, Offset, SelectionAdjustment, Unit> getOnSelectionUpdateStartCallback$foundation_release() {
        return this.onSelectionUpdateStartCallback;
    }

    @NotNull
    public final Map<Long, Selectable> getSelectableMap$foundation_release() {
        return this.f6388c;
    }

    @NotNull
    public final List<Selectable> getSelectables$foundation_release() {
        return this.f6387b;
    }

    /* JADX INFO: renamed from: getSorted$foundation_release, reason: from getter */
    public final boolean getSorted() {
        return this.sorted;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    @NotNull
    public Map<Long, Selection> getSubselections() {
        return (Map) this.subselections.getValue();
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public long nextSelectableId() {
        AtomicLong atomicLong = this.f6389d;
        long andIncrement = atomicLong.getAndIncrement();
        while (andIncrement == 0) {
            andIncrement = atomicLong.getAndIncrement();
        }
        return andIncrement;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public void notifyPositionChange(long selectableId) {
        this.sorted = false;
        Function1<? super Long, Unit> function1 = this.onPositionChangeCallback;
        if (function1 != null) {
            function1.invoke(Long.valueOf(selectableId));
        }
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public void notifySelectableChange(long selectableId) {
        Function1<? super Long, Unit> function1 = this.onSelectableChangeCallback;
        if (function1 != null) {
            function1.invoke(Long.valueOf(selectableId));
        }
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    /* JADX INFO: renamed from: notifySelectionUpdate-5iVPX68 */
    public boolean mo637notifySelectionUpdate5iVPX68(@NotNull LayoutCoordinates layoutCoordinates, long newPosition, long previousPosition, boolean isStartHandle, @NotNull SelectionAdjustment adjustment) {
        Intrinsics.checkNotNullParameter(layoutCoordinates, "layoutCoordinates");
        Intrinsics.checkNotNullParameter(adjustment, "adjustment");
        Function5<? super LayoutCoordinates, ? super Offset, ? super Offset, ? super Boolean, ? super SelectionAdjustment, Boolean> function5 = this.onSelectionUpdateCallback;
        if (function5 != null) {
            return function5.invoke(layoutCoordinates, Offset.m2264boximpl(newPosition), Offset.m2264boximpl(previousPosition), Boolean.valueOf(isStartHandle), adjustment).booleanValue();
        }
        return true;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public void notifySelectionUpdateEnd() {
        Function0<Unit> function0 = this.onSelectionUpdateEndCallback;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public void notifySelectionUpdateSelectAll(long selectableId) {
        Function1<? super Long, Unit> function1 = this.onSelectionUpdateSelectAll;
        if (function1 != null) {
            function1.invoke(Long.valueOf(selectableId));
        }
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    /* JADX INFO: renamed from: notifySelectionUpdateStart-d-4ec7I */
    public void mo638notifySelectionUpdateStartd4ec7I(@NotNull LayoutCoordinates layoutCoordinates, long startPosition, @NotNull SelectionAdjustment adjustment) {
        Intrinsics.checkNotNullParameter(layoutCoordinates, "layoutCoordinates");
        Intrinsics.checkNotNullParameter(adjustment, "adjustment");
        Function3<? super LayoutCoordinates, ? super Offset, ? super SelectionAdjustment, Unit> function3 = this.onSelectionUpdateStartCallback;
        if (function3 != null) {
            function3.invoke(layoutCoordinates, Offset.m2264boximpl(startPosition), adjustment);
        }
    }

    public final void setAfterSelectableUnsubscribe$foundation_release(@Nullable Function1<? super Long, Unit> function1) {
        this.afterSelectableUnsubscribe = function1;
    }

    public final void setOnPositionChangeCallback$foundation_release(@Nullable Function1<? super Long, Unit> function1) {
        this.onPositionChangeCallback = function1;
    }

    public final void setOnSelectableChangeCallback$foundation_release(@Nullable Function1<? super Long, Unit> function1) {
        this.onSelectableChangeCallback = function1;
    }

    public final void setOnSelectionUpdateCallback$foundation_release(@Nullable Function5<? super LayoutCoordinates, ? super Offset, ? super Offset, ? super Boolean, ? super SelectionAdjustment, Boolean> function5) {
        this.onSelectionUpdateCallback = function5;
    }

    public final void setOnSelectionUpdateEndCallback$foundation_release(@Nullable Function0<Unit> function0) {
        this.onSelectionUpdateEndCallback = function0;
    }

    public final void setOnSelectionUpdateSelectAll$foundation_release(@Nullable Function1<? super Long, Unit> function1) {
        this.onSelectionUpdateSelectAll = function1;
    }

    public final void setOnSelectionUpdateStartCallback$foundation_release(@Nullable Function3<? super LayoutCoordinates, ? super Offset, ? super SelectionAdjustment, Unit> function3) {
        this.onSelectionUpdateStartCallback = function3;
    }

    public final void setSorted$foundation_release(boolean z10) {
        this.sorted = z10;
    }

    public void setSubselections(@NotNull Map<Long, Selection> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.subselections.setValue(map);
    }

    @NotNull
    public final List<Selectable> sort(@NotNull LayoutCoordinates containerLayoutCoordinates) {
        Intrinsics.checkNotNullParameter(containerLayoutCoordinates, "containerLayoutCoordinates");
        if (!this.sorted) {
            ArrayList arrayList = this.f6387b;
            final a aVar = new a(containerLayoutCoordinates);
            bk.f.sortWith(arrayList, new Comparator() { // from class: g0.h
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    Function2 tmp0 = aVar;
                    Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                    return ((Number) tmp0.invoke(obj, obj2)).intValue();
                }
            });
            this.sorted = true;
        }
        return getSelectables$foundation_release();
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    @NotNull
    public Selectable subscribe(@NotNull Selectable selectable) {
        Intrinsics.checkNotNullParameter(selectable, "selectable");
        if (selectable.getSelectableId() == 0) {
            throw new IllegalArgumentException(("The selectable contains an invalid id: " + selectable.getSelectableId()).toString());
        }
        LinkedHashMap linkedHashMap = this.f6388c;
        if (!linkedHashMap.containsKey(Long.valueOf(selectable.getSelectableId()))) {
            linkedHashMap.put(Long.valueOf(selectable.getSelectableId()), selectable);
            this.f6387b.add(selectable);
            this.sorted = false;
            return selectable;
        }
        throw new IllegalArgumentException(("Another selectable with the id: " + selectable + ".selectableId has already subscribed.").toString());
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public void unsubscribe(@NotNull Selectable selectable) {
        Intrinsics.checkNotNullParameter(selectable, "selectable");
        LinkedHashMap linkedHashMap = this.f6388c;
        if (linkedHashMap.containsKey(Long.valueOf(selectable.getSelectableId()))) {
            this.f6387b.remove(selectable);
            linkedHashMap.remove(Long.valueOf(selectable.getSelectableId()));
            Function1<? super Long, Unit> function1 = this.afterSelectableUnsubscribe;
            if (function1 != null) {
                function1.invoke(Long.valueOf(selectable.getSelectableId()));
            }
        }
    }
}
