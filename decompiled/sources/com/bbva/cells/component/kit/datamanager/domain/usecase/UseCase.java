package com.bbva.cells.component.kit.datamanager.domain.usecase;

import com.airbnb.lottie.m;
import e4.a;
import io.reactivex.Flowable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/* JADX INFO: loaded from: classes2.dex */
public abstract class UseCase<T, Params> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CompositeDisposable f26681a = new CompositeDisposable();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public UseCaseSuccessCallback<T> f26682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public UseCaseErrorCallback f26683c;

    public interface UseCaseErrorCallback {
        void onUseCaseError(Throwable th2);
    }

    public interface UseCaseSuccessCallback<T> {
        void onUseCaseComplete(T t10);
    }

    public T call(Params params) throws Exception {
        return null;
    }

    public Flowable<T> create(Params params) {
        return Flowable.fromCallable(new m(this, params, 1));
    }

    public void dispose() {
        this.f26682b = null;
        this.f26683c = null;
        this.f26681a.dispose();
    }

    public void execute(Params params, UseCaseSuccessCallback<T> useCaseSuccessCallback, UseCaseErrorCallback useCaseErrorCallback) {
        this.f26682b = useCaseSuccessCallback;
        this.f26683c = useCaseErrorCallback;
        Flowable<T> flowableObserveOn = create(params).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
        UseCaseSuccessCallback<T> useCaseSuccessCallback2 = this.f26682b;
        useCaseSuccessCallback2.getClass();
        a aVar = new a(useCaseSuccessCallback2, 0);
        final UseCaseErrorCallback useCaseErrorCallback2 = this.f26683c;
        useCaseErrorCallback2.getClass();
        this.f26681a.add(flowableObserveOn.subscribe(aVar, new Consumer() { // from class: e4.b
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                useCaseErrorCallback2.onUseCaseError((Throwable) obj);
            }
        }));
    }
}
