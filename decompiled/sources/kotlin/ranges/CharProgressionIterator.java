package kotlin.ranges;

import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.CharIterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ProgressionIterators.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0003\u001a\u00020\u0002H\u0096\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u0010"}, d2 = {"Lkotlin/ranges/CharProgressionIterator;", "Lkotlin/collections/CharIterator;", "", "hasNext", "", "nextChar", "", "p0", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getStep", "()I", "step", "first", "last", "<init>", "(CCI)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
public final class CharProgressionIterator extends CharIterator {

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    public final int step;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f79784q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f79785r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f79786s0;

    public CharProgressionIterator(char c10, char c11, int i10) {
        this.step = i10;
        this.f79784q0 = c11;
        boolean z10 = true;
        if (i10 <= 0 ? Intrinsics.compare((int) c10, (int) c11) < 0 : Intrinsics.compare((int) c10, (int) c11) > 0) {
            z10 = false;
        }
        this.f79785r0 = z10;
        this.f79786s0 = z10 ? c10 : c11;
    }

    public final int getStep() {
        return this.step;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f79785r0;
    }

    @Override // kotlin.collections.CharIterator
    public char nextChar() {
        int i10 = this.f79786s0;
        if (i10 != this.f79784q0) {
            this.f79786s0 = this.step + i10;
        } else {
            if (!this.f79785r0) {
                throw new NoSuchElementException();
            }
            this.f79785r0 = false;
        }
        return (char) i10;
    }
}
