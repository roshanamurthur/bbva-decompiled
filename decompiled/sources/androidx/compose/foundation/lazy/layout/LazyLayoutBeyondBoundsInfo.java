package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.collection.MutableVector;
import com.adobe.marketing.mobile.EventDataKeys;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LazyLayoutBeyondBoundsInfo.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0005J\u0006\u0010\u000b\u001a\u00020\nR\u0011\u0010\u0003\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\r¨\u0006\u0012"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "", "", EventDataKeys.Lifecycle.LIFECYCLE_START, "end", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo$Interval;", "addInterval", "interval", "", "removeInterval", "", "hasIntervals", "getStart", "()I", "getEnd", "<init>", "()V", "Interval", "foundation_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLazyLayoutBeyondBoundsInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutBeyondBoundsInfo.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,126:1\n1182#2:127\n1161#2,2:128\n460#3,11:130\n460#3,11:141\n*S KotlinDebug\n*F\n+ 1 LazyLayoutBeyondBoundsInfo.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo\n*L\n51#1:127\n51#1:128,2\n87#1:130,11\n102#1:141,11\n*E\n"})
public final class LazyLayoutBeyondBoundsInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MutableVector<Interval> f4960a = new MutableVector<>(new Interval[16], 0);

    /* JADX INFO: compiled from: LazyLayoutBeyondBoundsInfo.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0016"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo$Interval;", "", "", "component1", "component2", EventDataKeys.Lifecycle.LIFECYCLE_START, "end", "copy", "", "toString", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getStart", "()I", "b", "getEnd", "<init>", "(II)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class Interval {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final int start;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public final int end;

        public Interval(int i10, int i11) {
            this.start = i10;
            this.end = i11;
            if (i10 < 0) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (i11 < i10) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        }

        public static /* synthetic */ Interval copy$default(Interval interval, int i10, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = interval.start;
            }
            if ((i12 & 2) != 0) {
                i11 = interval.end;
            }
            return interval.copy(i10, i11);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getStart() {
            return this.start;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getEnd() {
            return this.end;
        }

        @NotNull
        public final Interval copy(int start, int end) {
            return new Interval(start, end);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Interval)) {
                return false;
            }
            Interval interval = (Interval) other;
            return this.start == interval.start && this.end == interval.end;
        }

        public final int getEnd() {
            return this.end;
        }

        public final int getStart() {
            return this.start;
        }

        public int hashCode() {
            return (this.start * 31) + this.end;
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Interval(start=");
            sb2.append(this.start);
            sb2.append(", end=");
            return androidx.activity.a.d(sb2, this.end, RootService.CLOSE_BRACKET);
        }
    }

    @NotNull
    public final Interval addInterval(int start, int end) {
        Interval interval = new Interval(start, end);
        this.f4960a.add(interval);
        return interval;
    }

    public final int getEnd() {
        MutableVector<Interval> mutableVector = this.f4960a;
        int end = mutableVector.first().getEnd();
        int size = mutableVector.getSize();
        if (size > 0) {
            Interval[] content = mutableVector.getContent();
            int i10 = 0;
            do {
                Interval interval = content[i10];
                if (interval.getEnd() > end) {
                    end = interval.getEnd();
                }
                i10++;
            } while (i10 < size);
        }
        return end;
    }

    public final int getStart() {
        MutableVector<Interval> mutableVector = this.f4960a;
        int start = mutableVector.first().getStart();
        int size = mutableVector.getSize();
        if (size > 0) {
            Interval[] content = mutableVector.getContent();
            int i10 = 0;
            do {
                Interval interval = content[i10];
                if (interval.getStart() < start) {
                    start = interval.getStart();
                }
                i10++;
            } while (i10 < size);
        }
        if (start >= 0) {
            return start;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public final boolean hasIntervals() {
        return this.f4960a.isNotEmpty();
    }

    public final void removeInterval(@NotNull Interval interval) {
        Intrinsics.checkNotNullParameter(interval, "interval");
        this.f4960a.remove(interval);
    }
}
