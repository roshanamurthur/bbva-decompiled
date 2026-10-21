package wj;

import io.reactivex.rxjava3.annotations.Nullable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.util.AppendOnlyLinkedArrayList;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import io.reactivex.rxjava3.subjects.Subject;

/* JADX INFO: compiled from: SerializedSubject.java */
/* JADX INFO: loaded from: classes12.dex */
public final class a<T> extends Subject<T> implements AppendOnlyLinkedArrayList.NonThrowingPredicate<Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Subject<T> f94280p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public boolean f94281q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public AppendOnlyLinkedArrayList<Object> f94282r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public volatile boolean f94283s0;

    public a(Subject<T> subject) {
        this.f94280p0 = subject;
    }

    public final void d() {
        AppendOnlyLinkedArrayList<Object> appendOnlyLinkedArrayList;
        while (true) {
            synchronized (this) {
                try {
                    appendOnlyLinkedArrayList = this.f94282r0;
                    if (appendOnlyLinkedArrayList == null) {
                        this.f94281q0 = false;
                        return;
                    }
                    this.f94282r0 = null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            appendOnlyLinkedArrayList.forEachWhile(this);
        }
    }

    @Override // io.reactivex.rxjava3.subjects.Subject
    @Nullable
    public final Throwable getThrowable() {
        return this.f94280p0.getThrowable();
    }

    @Override // io.reactivex.rxjava3.subjects.Subject
    public final boolean hasComplete() {
        return this.f94280p0.hasComplete();
    }

    @Override // io.reactivex.rxjava3.subjects.Subject
    public final boolean hasObservers() {
        return this.f94280p0.hasObservers();
    }

    @Override // io.reactivex.rxjava3.subjects.Subject
    public final boolean hasThrowable() {
        return this.f94280p0.hasThrowable();
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onComplete() {
        if (this.f94283s0) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f94283s0) {
                    return;
                }
                this.f94283s0 = true;
                if (!this.f94281q0) {
                    this.f94281q0 = true;
                    this.f94280p0.onComplete();
                    return;
                }
                AppendOnlyLinkedArrayList<Object> appendOnlyLinkedArrayList = this.f94282r0;
                if (appendOnlyLinkedArrayList == null) {
                    appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList<>(4);
                    this.f94282r0 = appendOnlyLinkedArrayList;
                }
                appendOnlyLinkedArrayList.add(NotificationLite.complete());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onError(Throwable th2) {
        if (this.f94283s0) {
            RxJavaPlugins.onError(th2);
            return;
        }
        synchronized (this) {
            try {
                boolean z10 = true;
                if (!this.f94283s0) {
                    this.f94283s0 = true;
                    if (this.f94281q0) {
                        AppendOnlyLinkedArrayList<Object> appendOnlyLinkedArrayList = this.f94282r0;
                        if (appendOnlyLinkedArrayList == null) {
                            appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList<>(4);
                            this.f94282r0 = appendOnlyLinkedArrayList;
                        }
                        appendOnlyLinkedArrayList.setFirst(NotificationLite.error(th2));
                        return;
                    }
                    this.f94281q0 = true;
                    z10 = false;
                }
                if (z10) {
                    RxJavaPlugins.onError(th2);
                } else {
                    this.f94280p0.onError(th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onNext(T t10) {
        if (this.f94283s0) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f94283s0) {
                    return;
                }
                if (!this.f94281q0) {
                    this.f94281q0 = true;
                    this.f94280p0.onNext(t10);
                    d();
                } else {
                    AppendOnlyLinkedArrayList<Object> appendOnlyLinkedArrayList = this.f94282r0;
                    if (appendOnlyLinkedArrayList == null) {
                        appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList<>(4);
                        this.f94282r0 = appendOnlyLinkedArrayList;
                    }
                    appendOnlyLinkedArrayList.add(NotificationLite.next(t10));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onSubscribe(Disposable disposable) {
        if (!this.f94283s0) {
            synchronized (this) {
                try {
                    boolean z10 = true;
                    if (!this.f94283s0) {
                        if (this.f94281q0) {
                            AppendOnlyLinkedArrayList<Object> appendOnlyLinkedArrayList = this.f94282r0;
                            if (appendOnlyLinkedArrayList == null) {
                                appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList<>(4);
                                this.f94282r0 = appendOnlyLinkedArrayList;
                            }
                            appendOnlyLinkedArrayList.add(NotificationLite.disposable(disposable));
                            return;
                        }
                        this.f94281q0 = true;
                        z10 = false;
                    }
                    if (!z10) {
                        this.f94280p0.onSubscribe(disposable);
                        d();
                        return;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        disposable.dispose();
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(Observer<? super T> observer) {
        this.f94280p0.subscribe(observer);
    }

    @Override // io.reactivex.rxjava3.internal.util.AppendOnlyLinkedArrayList.NonThrowingPredicate, io.reactivex.rxjava3.functions.Predicate
    public final boolean test(Object obj) {
        return NotificationLite.acceptFull(obj, this.f94280p0);
    }
}
