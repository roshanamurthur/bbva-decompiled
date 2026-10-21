package kotlin.ranges;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.ULong;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: ULongRange.kt */
/* JADX INFO: loaded from: classes12.dex */
@SinceKotlin(version = "1.3")
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0002J\u0013\u0010\u0007\u001a\u00020\u0002H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b!¨\u0006\u000e"}, d2 = {"Lkotlin/ranges/e;", "", "Lkotlin/ULong;", "", "hasNext", "next-s-VKNKU", "()J", "next", "first", "last", "", "step", "<init>", "(JJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
final class e implements Iterator<ULong>, KMappedMarker {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final long f79820p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public boolean f79821q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final long f79822r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public long f79823s0;

    public e(long j10, long j11, long j12, DefaultConstructorMarker defaultConstructorMarker) {
        this.f79820p0 = j11;
        boolean z10 = true;
        long j13 = j10 ^ Long.MIN_VALUE;
        long j14 = Long.MIN_VALUE ^ j11;
        if (j12 <= 0 ? Long.compare(j13, j14) < 0 : Long.compare(j13, j14) > 0) {
            z10 = false;
        }
        this.f79821q0 = z10;
        this.f79822r0 = ULong.m5595constructorimpl(j12);
        this.f79823s0 = this.f79821q0 ? j10 : j11;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f79821q0;
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ ULong next() {
        return ULong.m5594boximpl(m5741nextsVKNKU());
    }

    /* JADX INFO: renamed from: next-s-VKNKU, reason: not valid java name */
    public long m5741nextsVKNKU() {
        long j10 = this.f79823s0;
        if (j10 != this.f79820p0) {
            this.f79823s0 = ULong.m5595constructorimpl(this.f79822r0 + j10);
        } else {
            if (!this.f79821q0) {
                throw new NoSuchElementException();
            }
            this.f79821q0 = false;
        }
        return j10;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
