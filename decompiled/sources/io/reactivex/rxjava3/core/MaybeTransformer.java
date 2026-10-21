package io.reactivex.rxjava3.core;

import io.reactivex.rxjava3.annotations.NonNull;

/* JADX INFO: loaded from: classes12.dex */
@FunctionalInterface
public interface MaybeTransformer<Upstream, Downstream> {
    @NonNull
    MaybeSource<Downstream> apply(@NonNull Maybe<Upstream> maybe);
}
