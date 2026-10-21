package kotlin.ranges;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.LongIterator;

/* JADX INFO: compiled from: ProgressionIterators.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0003\u001a\u00020\u0002H\u0096\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000f"}, d2 = {"Lkotlin/ranges/LongProgressionIterator;", "Lkotlin/collections/LongIterator;", "", "hasNext", "", "nextLong", "p0", "J", "getStep", "()J", "step", "first", "last", "<init>", "(JJJ)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
public final class LongProgressionIterator extends LongIterator {

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    public final long step;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final long f79800q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f79801r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public long f79802s0;

    public LongProgressionIterator(long j10, long j11, long j12) {
        this.step = j12;
        this.f79800q0 = j11;
        boolean z10 = true;
        if (j12 <= 0 ? j10 < j11 : j10 > j11) {
            z10 = false;
        }
        this.f79801r0 = z10;
        this.f79802s0 = z10 ? j10 : j11;
    }

    public final long getStep() {
        return this.step;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f79801r0;
    }

    @Override // kotlin.collections.LongIterator
    public long nextLong() {
        long j10 = this.f79802s0;
        if (j10 != this.f79800q0) {
            this.f79802s0 = this.step + j10;
        } else {
            if (!this.f79801r0) {
                throw new NoSuchElementException();
            }
            this.f79801r0 = false;
        }
        return j10;
    }
}
