package io.reactivex.rxjava3.internal.fuseable;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.CompletableSource;

/* JADX INFO: loaded from: classes12.dex */
public interface HasUpstreamCompletableSource {
    @NonNull
    CompletableSource source();
}
