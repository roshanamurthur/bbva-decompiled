package io.reactivex.rxjava3.core;

import io.reactivex.rxjava3.annotations.NonNull;

/* JADX INFO: loaded from: classes12.dex */
@FunctionalInterface
public interface ObservableTransformer<Upstream, Downstream> {
    @NonNull
    ObservableSource<Downstream> apply(@NonNull Observable<Upstream> observable);
}
