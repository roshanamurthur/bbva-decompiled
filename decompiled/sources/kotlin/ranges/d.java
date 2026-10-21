package kotlin.ranges;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.UInt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: UIntRange.kt */
/* JADX INFO: loaded from: classes12.dex */
@SinceKotlin(version = "1.3")
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0002J\u0013\u0010\u0007\u001a\u00020\u0002H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b!¨\u0006\u000e"}, d2 = {"Lkotlin/ranges/d;", "", "Lkotlin/UInt;", "", "hasNext", "next-pVg5ArA", "()I", "next", "first", "last", "", "step", "<init>", "(IIILkotlin/jvm/internal/DefaultConstructorMarker;)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
final class d implements Iterator<UInt>, KMappedMarker {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final int f79816p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public boolean f79817q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final int f79818r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f79819s0;

    public d(int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this.f79816p0 = i11;
        boolean z10 = true;
        int iCompare = Integer.compare(i10 ^ Integer.MIN_VALUE, Integer.MIN_VALUE ^ i11);
        if (i12 <= 0 ? iCompare < 0 : iCompare > 0) {
            z10 = false;
        }
        this.f79817q0 = z10;
        this.f79818r0 = UInt.m5570constructorimpl(i12);
        this.f79819s0 = this.f79817q0 ? i10 : i11;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f79817q0;
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ UInt next() {
        return UInt.m5569boximpl(m5740nextpVg5ArA());
    }

    /* JADX INFO: renamed from: next-pVg5ArA, reason: not valid java name */
    public int m5740nextpVg5ArA() {
        int i10 = this.f79819s0;
        if (i10 != this.f79816p0) {
            this.f79819s0 = UInt.m5570constructorimpl(this.f79818r0 + i10);
        } else {
            if (!this.f79817q0) {
                throw new NoSuchElementException();
            }
            this.f79817q0 = false;
        }
        return i10;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
