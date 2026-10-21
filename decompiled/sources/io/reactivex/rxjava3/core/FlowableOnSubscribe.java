package io.reactivex.rxjava3.core;

import io.reactivex.rxjava3.annotations.NonNull;

/* JADX INFO: loaded from: classes12.dex */
@FunctionalInterface
public interface FlowableOnSubscribe<T> {
    void subscribe(@NonNull FlowableEmitter<T> flowableEmitter) throws Throwable;
}
