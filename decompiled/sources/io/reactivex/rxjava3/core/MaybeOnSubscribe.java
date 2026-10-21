package io.reactivex.rxjava3.core;

import io.reactivex.rxjava3.annotations.NonNull;

/* JADX INFO: loaded from: classes12.dex */
@FunctionalInterface
public interface MaybeOnSubscribe<T> {
    void subscribe(@NonNull MaybeEmitter<T> maybeEmitter) throws Throwable;
}
