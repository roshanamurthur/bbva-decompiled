package io.reactivex.rxjava3.internal.fuseable;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public interface SimpleQueue<T> {
    void clear();

    boolean isEmpty();

    boolean offer(@NonNull T t10);

    boolean offer(@NonNull T t10, @NonNull T t11);

    @Nullable
    T poll() throws Throwable;
}
