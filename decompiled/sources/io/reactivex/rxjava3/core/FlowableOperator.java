package io.reactivex.rxjava3.core;

import io.reactivex.rxjava3.annotations.NonNull;
import org.reactivestreams.Subscriber;

/* JADX INFO: loaded from: classes12.dex */
@FunctionalInterface
public interface FlowableOperator<Downstream, Upstream> {
    @NonNull
    Subscriber<? super Upstream> apply(@NonNull Subscriber<? super Downstream> subscriber) throws Throwable;
}
