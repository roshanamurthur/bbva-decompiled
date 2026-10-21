package io.reactivex.observers;

import io.reactivex.Observer;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.AppendOnlyLinkedArrayList;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: classes12.dex */
public final class SerializedObserver<T> implements Observer<T>, Disposable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Observer<? super T> f73821p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final boolean f73822q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public Disposable f73823r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f73824s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public AppendOnlyLinkedArrayList<Object> f73825t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public volatile boolean f73826u0;

    public SerializedObserver(@NonNull Observer<? super T> observer) {
        this(observer, false);
    }

    public final void a() {
        AppendOnlyLinkedArrayList<Object> appendOnlyLinkedArrayList;
        do {
            synchronized (this) {
                try {
                    appendOnlyLinkedArrayList = this.f73825t0;
                    if (appendOnlyLinkedArrayList == null) {
                        this.f73824s0 = false;
                        return;
                    }
                    this.f73825t0 = null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } while (!appendOnlyLinkedArrayList.accept(this.f73821p0));
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
        this.f73823r0.dispose();
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return this.f73823r0.isDisposed();
    }

    @Override // io.reactivex.Observer
    public void onComplete() {
        if (this.f73826u0) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f73826u0) {
                    return;
                }
                if (!this.f73824s0) {
                    this.f73826u0 = true;
                    this.f73824s0 = true;
                    this.f73821p0.onComplete();
                } else {
                    AppendOnlyLinkedArrayList<Object> appendOnlyLinkedArrayList = this.f73825t0;
                    if (appendOnlyLinkedArrayList == null) {
                        appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList<>(4);
                        this.f73825t0 = appendOnlyLinkedArrayList;
                    }
                    appendOnlyLinkedArrayList.add(NotificationLite.complete());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.reactivex.Observer
    public void onError(@NonNull Throwable th2) {
        if (this.f73826u0) {
            RxJavaPlugins.onError(th2);
            return;
        }
        synchronized (this) {
            try {
                boolean z10 = true;
                if (!this.f73826u0) {
                    if (this.f73824s0) {
                        this.f73826u0 = true;
                        AppendOnlyLinkedArrayList<Object> appendOnlyLinkedArrayList = this.f73825t0;
                        if (appendOnlyLinkedArrayList == null) {
                            appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList<>(4);
                            this.f73825t0 = appendOnlyLinkedArrayList;
                        }
                        Object objError = NotificationLite.error(th2);
                        if (this.f73822q0) {
                            appendOnlyLinkedArrayList.add(objError);
                        } else {
                            appendOnlyLinkedArrayList.setFirst(objError);
                        }
                        return;
                    }
                    this.f73826u0 = true;
                    this.f73824s0 = true;
                    z10 = false;
                }
                if (z10) {
                    RxJavaPlugins.onError(th2);
                } else {
                    this.f73821p0.onError(th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // io.reactivex.Observer
    public void onNext(@NonNull T t10) {
        if (this.f73826u0) {
            return;
        }
        if (t10 == null) {
            this.f73823r0.dispose();
            onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return;
        }
        synchronized (this) {
            try {
                if (this.f73826u0) {
                    return;
                }
                if (!this.f73824s0) {
                    this.f73824s0 = true;
                    this.f73821p0.onNext(t10);
                    a();
                } else {
                    AppendOnlyLinkedArrayList<Object> appendOnlyLinkedArrayList = this.f73825t0;
                    if (appendOnlyLinkedArrayList == null) {
                        appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList<>(4);
                        this.f73825t0 = appendOnlyLinkedArrayList;
                    }
                    appendOnlyLinkedArrayList.add(NotificationLite.next(t10));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.reactivex.Observer
    public void onSubscribe(@NonNull Disposable disposable) {
        if (DisposableHelper.validate(this.f73823r0, disposable)) {
            this.f73823r0 = disposable;
            this.f73821p0.onSubscribe(this);
        }
    }

    public SerializedObserver(@NonNull Observer<? super T> observer, boolean z10) {
        this.f73821p0 = observer;
        this.f73822q0 = z10;
    }
}
