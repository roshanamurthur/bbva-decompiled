package androidx.work.impl.utils.futures;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class SettableFuture<V> extends AbstractFuture<V> {
    public static <V> SettableFuture<V> create() {
        return new SettableFuture<>();
    }

    @Override // androidx.work.impl.utils.futures.AbstractFuture
    public boolean set(@Nullable V v3) {
        return super.set(v3);
    }

    @Override // androidx.work.impl.utils.futures.AbstractFuture
    public boolean setException(Throwable th2) {
        return super.setException(th2);
    }

    @Override // androidx.work.impl.utils.futures.AbstractFuture
    public boolean setFuture(ListenableFuture<? extends V> listenableFuture) {
        return super.setFuture(listenableFuture);
    }
}
