package androidx.compose.foundation.lazy.layout;

import androidx.appcompat.widget.g0;
import androidx.appcompat.widget.o1;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: IntervalList.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0007\u0010\bJ2\u0010\u000e\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0018\u0010\r\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\u0004\u0012\u00020\u00060\u000bH\u0016J\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\u000f\u001a\u00020\u0003H\u0096\u0002R$\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00038\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Landroidx/compose/foundation/lazy/layout/MutableIntervalList;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/foundation/lazy/layout/IntervalList;", "", "size", "value", "", "addInterval", "(ILjava/lang/Object;)V", "fromIndex", "toIndex", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/layout/IntervalList$Interval;", "block", "forEach", FirebaseAnalytics.Param.INDEX, "get", "<set-?>", "b", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getSize", "()I", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@ExperimentalFoundationApi
@SourceDebugExtension({"SMAP\nIntervalList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntervalList.kt\nandroidx/compose/foundation/lazy/layout/MutableIntervalList\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,216:1\n1182#2:217\n1161#2,2:218\n523#3:220\n523#3:221\n523#3:222\n*S KotlinDebug\n*F\n+ 1 IntervalList.kt\nandroidx/compose/foundation/lazy/layout/MutableIntervalList\n*L\n98#1:217\n98#1:218,2\n150#1:220\n152#1:221\n169#1:222\n*E\n"})
public final class MutableIntervalList<T> implements IntervalList<T> {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MutableVector<IntervalList.Interval<T>> f5071a = new MutableVector<>(new IntervalList.Interval[16], 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public int size;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public IntervalList.Interval<? extends T> f5073c;

    public final void a(int i10) {
        if (i10 < 0 || i10 >= getSize()) {
            StringBuilder sbC = o1.c("Index ", i10, ", size ");
            sbC.append(getSize());
            throw new IndexOutOfBoundsException(sbC.toString());
        }
    }

    public final void addInterval(int size, T value) {
        if (size < 0) {
            throw new IllegalArgumentException(g0.c("size should be >=0, but was ", size).toString());
        }
        if (size == 0) {
            return;
        }
        IntervalList.Interval<T> interval = new IntervalList.Interval<>(getSize(), size, value);
        this.size = getSize() + size;
        this.f5071a.add(interval);
    }

    @Override // androidx.compose.foundation.lazy.layout.IntervalList
    public void forEach(int fromIndex, int toIndex, @NotNull Function1<? super IntervalList.Interval<? extends T>, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        a(fromIndex);
        a(toIndex);
        if (toIndex < fromIndex) {
            throw new IllegalArgumentException(androidx.collection.g.b("toIndex (", toIndex, ") should be not smaller than fromIndex (", fromIndex, RootService.CLOSE_BRACKET).toString());
        }
        MutableVector<IntervalList.Interval<T>> mutableVector = this.f5071a;
        int iAccess$binarySearch = IntervalListKt.access$binarySearch(mutableVector, fromIndex);
        int startIndex = mutableVector.getContent()[iAccess$binarySearch].getStartIndex();
        while (startIndex <= toIndex) {
            IntervalList.Interval<T> interval = mutableVector.getContent()[iAccess$binarySearch];
            block.invoke(interval);
            startIndex += interval.getSize();
            iAccess$binarySearch++;
        }
    }

    @Override // androidx.compose.foundation.lazy.layout.IntervalList
    @NotNull
    public IntervalList.Interval<T> get(int index) {
        a(index);
        IntervalList.Interval<? extends T> interval = this.f5073c;
        if (interval != null) {
            int startIndex = interval.getStartIndex();
            if (index < interval.getSize() + interval.getStartIndex() && startIndex <= index) {
                return interval;
            }
        }
        MutableVector<IntervalList.Interval<T>> mutableVector = this.f5071a;
        IntervalList.Interval interval2 = (IntervalList.Interval<? extends T>) mutableVector.getContent()[IntervalListKt.access$binarySearch(mutableVector, index)];
        this.f5073c = interval2;
        return interval2;
    }

    @Override // androidx.compose.foundation.lazy.layout.IntervalList
    public int getSize() {
        return this.size;
    }
}
