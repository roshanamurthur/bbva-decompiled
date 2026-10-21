package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import bk.q;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LazyLayoutKeyIndexMap.kt */
/* JADX INFO: loaded from: classes.dex */
@ExperimentalFoundationApi
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¨\u0006\u000e"}, d2 = {"Landroidx/compose/foundation/lazy/layout/NearestRangeKeyIndexMap;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;", "", "key", "", "getIndex", FirebaseAnalytics.Param.INDEX, "getKey", "Lkotlin/ranges/IntRange;", "nearestRange", "Landroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent;", "intervalContent", "<init>", "(Lkotlin/ranges/IntRange;Landroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLazyLayoutKeyIndexMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutKeyIndexMap.kt\nandroidx/compose/foundation/lazy/layout/NearestRangeKeyIndexMap\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,99:1\n26#2:100\n1#3:101\n*S KotlinDebug\n*F\n+ 1 LazyLayoutKeyIndexMap.kt\nandroidx/compose/foundation/lazy/layout/NearestRangeKeyIndexMap\n*L\n70#1:100\n*E\n"})
public final class NearestRangeKeyIndexMap implements LazyLayoutKeyIndexMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Map<Object, Integer> f5074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Object[] f5075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5076c;

    /* JADX INFO: compiled from: LazyLayoutKeyIndexMap.kt */
    public static final class a extends Lambda implements Function1<IntervalList.Interval<? extends LazyLayoutIntervalContent.Interval>, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ int f5077p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ int f5078q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ HashMap<Object, Integer> f5079r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ NearestRangeKeyIndexMap f5080s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i10, int i11, HashMap<Object, Integer> map, NearestRangeKeyIndexMap nearestRangeKeyIndexMap) {
            super(1);
            this.f5077p0 = i10;
            this.f5078q0 = i11;
            this.f5079r0 = map;
            this.f5080s0 = nearestRangeKeyIndexMap;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0040  */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(IntervalList.Interval<? extends LazyLayoutIntervalContent.Interval> interval) {
            Object defaultLazyLayoutKey;
            IntervalList.Interval<? extends LazyLayoutIntervalContent.Interval> it = interval;
            Intrinsics.checkNotNullParameter(it, "it");
            Function1<Integer, Object> key = it.getValue().getKey();
            int iMax = Math.max(this.f5077p0, it.getStartIndex());
            int iMin = Math.min(this.f5078q0, (it.getSize() + it.getStartIndex()) - 1);
            if (iMax <= iMin) {
                while (true) {
                    if (key == null) {
                        defaultLazyLayoutKey = Lazy_androidKt.getDefaultLazyLayoutKey(iMax);
                    } else {
                        defaultLazyLayoutKey = key.invoke(Integer.valueOf(iMax - it.getStartIndex()));
                        if (defaultLazyLayoutKey == null) {
                            defaultLazyLayoutKey = Lazy_androidKt.getDefaultLazyLayoutKey(iMax);
                        }
                    }
                    this.f5079r0.put(defaultLazyLayoutKey, Integer.valueOf(iMax));
                    NearestRangeKeyIndexMap nearestRangeKeyIndexMap = this.f5080s0;
                    nearestRangeKeyIndexMap.f5075b[iMax - nearestRangeKeyIndexMap.f5076c] = defaultLazyLayoutKey;
                    if (iMax == iMin) {
                        break;
                    }
                    iMax++;
                }
            }
            return Unit.INSTANCE;
        }
    }

    public NearestRangeKeyIndexMap(@NotNull IntRange nearestRange, @NotNull LazyLayoutIntervalContent<?> intervalContent) {
        Intrinsics.checkNotNullParameter(nearestRange, "nearestRange");
        Intrinsics.checkNotNullParameter(intervalContent, "intervalContent");
        IntervalList<Interval> intervals = intervalContent.getIntervals();
        int first = nearestRange.getFirst();
        if (first < 0) {
            throw new IllegalStateException("Check failed.".toString());
        }
        int iMin = Math.min(nearestRange.getLast(), intervals.getSize() - 1);
        if (iMin < first) {
            this.f5074a = q.emptyMap();
            this.f5075b = new Object[0];
            this.f5076c = 0;
        } else {
            this.f5075b = new Object[(iMin - first) + 1];
            this.f5076c = first;
            HashMap map = new HashMap();
            intervals.forEach(first, iMin, new a(first, iMin, map, this));
            this.f5074a = map;
        }
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap
    public int getIndex(@NotNull Object key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Integer num = this.f5074a.get(key);
        if (num == null) {
            num = -1;
        }
        return num.intValue();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap
    @Nullable
    public Object getKey(int index) {
        int i10 = index - this.f5076c;
        if (i10 >= 0) {
            Object[] objArr = this.f5075b;
            if (i10 <= ArraysKt___ArraysKt.getLastIndex(objArr)) {
                return objArr[i10];
            }
        }
        return null;
    }
}
