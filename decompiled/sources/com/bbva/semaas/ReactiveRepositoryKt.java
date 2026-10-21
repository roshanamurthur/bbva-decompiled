package com.bbva.semaas;

import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import kotlin.Metadata;

/* JADX INFO: compiled from: ReactiveRepository.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¨\u0006\u0005"}, d2 = {"addTo", "", "Lio/reactivex/rxjava3/disposables/Disposable;", "composite", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "semaas_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ReactiveRepositoryKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean addTo(Disposable disposable, CompositeDisposable compositeDisposable) {
        return compositeDisposable.add(disposable);
    }
}
