package io.reactivex.rxjava3.functions;

import io.reactivex.rxjava3.annotations.NonNull;

/* JADX INFO: loaded from: classes12.dex */
@FunctionalInterface
public interface BiPredicate<T1, T2> {
    boolean test(@NonNull T1 t10, @NonNull T2 t11) throws Throwable;
}
