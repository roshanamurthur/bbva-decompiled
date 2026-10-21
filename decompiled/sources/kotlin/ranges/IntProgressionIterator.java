package kotlin.ranges;

import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.IntIterator;

/* JADX INFO: compiled from: ProgressionIterators.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0003\u001a\u00020\u0002H\u0096\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000f"}, d2 = {"Lkotlin/ranges/IntProgressionIterator;", "Lkotlin/collections/IntIterator;", "", "hasNext", "", "nextInt", "p0", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getStep", "()I", "step", "first", "last", "<init>", "(III)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
public final class IntProgressionIterator extends IntIterator {

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    public final int step;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f79792q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f79793r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f79794s0;

    public IntProgressionIterator(int i10, int i11, int i12) {
        this.step = i12;
        this.f79792q0 = i11;
        boolean z10 = true;
        if (i12 <= 0 ? i10 < i11 : i10 > i11) {
            z10 = false;
        }
        this.f79793r0 = z10;
        this.f79794s0 = z10 ? i10 : i11;
    }

    public final int getStep() {
        return this.step;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f79793r0;
    }

    @Override // kotlin.collections.IntIterator
    public int nextInt() {
        int i10 = this.f79794s0;
        if (i10 != this.f79792q0) {
            this.f79794s0 = this.step + i10;
        } else {
            if (!this.f79793r0) {
                throw new NoSuchElementException();
            }
            this.f79793r0 = false;
        }
        return i10;
    }
}
