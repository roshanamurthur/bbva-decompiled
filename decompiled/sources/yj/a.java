package yj;

import io.reactivex.Observer;
import io.reactivex.annotations.Nullable;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.util.AppendOnlyLinkedArrayList;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.subjects.Subject;

/* JADX INFO: compiled from: SerializedSubject.java */
/* JADX INFO: loaded from: classes12.dex */
public final class a<T> extends Subject<T> implements AppendOnlyLinkedArrayList.NonThrowingPredicate<Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Subject<T> f94859p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public boolean f94860q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public AppendOnlyLinkedArrayList<Object> f94861r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public volatile boolean f94862s0;

    public a(Subject<T> subject) {
        this.f94859p0 = subject;
    }

    public final void d() {
        AppendOnlyLinkedArrayList<Object> appendOnlyLinkedArrayList;
        while (true) {
            synchronized (this) {
                try {
                    appendOnlyLinkedArrayList = this.f94861r0;
                    if (appendOnlyLinkedArrayList == null) {
                        this.f94860q0 = false;
                        return;
                    }
                    this.f94861r0 = null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            appendOnlyLinkedArrayList.forEachWhile(this);
        }
    }

    @Override // io.reactivex.subjects.Subject
    @Nullable
    public final Throwable getThrowable() {
        return this.f94859p0.getThrowable();
    }

    @Override // io.reactivex.subjects.Subject
    public final boolean hasComplete() {
        return this.f94859p0.hasComplete();
    }

    @Override // io.reactivex.subjects.Subject
    public final boolean hasObservers() {
        return this.f94859p0.hasObservers();
    }

    @Override // io.reactivex.subjects.Subject
    public final boolean hasThrowable() {
        return this.f94859p0.hasThrowable();
    }

    @Override // io.reactivex.Observer
    public final void onComplete() {
        if (this.f94862s0) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f94862s0) {
                    return;
                }
                this.f94862s0 = true;
                if (!this.f94860q0) {
                    this.f94860q0 = true;
                    this.f94859p0.onComplete();
                    return;
                }
                AppendOnlyLinkedArrayList<Object> appendOnlyLinkedArrayList = this.f94861r0;
                if (appendOnlyLinkedArrayList == null) {
                    appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList<>(4);
                    this.f94861r0 = appendOnlyLinkedArrayList;
                }
                appendOnlyLinkedArrayList.add(NotificationLite.complete());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.reactivex.Observer
    public final void onError(Throwable th2) {
        if (this.f94862s0) {
            RxJavaPlugins.onError(th2);
            return;
        }
        synchronized (this) {
            try {
                boolean z10 = true;
                if (!this.f94862s0) {
                    this.f94862s0 = true;
                    if (this.f94860q0) {
                        AppendOnlyLinkedArrayList<Object> appendOnlyLinkedArrayList = this.f94861r0;
                        if (appendOnlyLinkedArrayList == null) {
                            appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList<>(4);
                            this.f94861r0 = appendOnlyLinkedArrayList;
                        }
                        appendOnlyLinkedArrayList.setFirst(NotificationLite.error(th2));
                        return;
                    }
                    this.f94860q0 = true;
                    z10 = false;
                }
                if (z10) {
                    RxJavaPlugins.onError(th2);
                } else {
                    this.f94859p0.onError(th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // io.reactivex.Observer
    public final void onNext(T t10) {
        if (this.f94862s0) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f94862s0) {
                    return;
                }
                if (!this.f94860q0) {
                    this.f94860q0 = true;
                    this.f94859p0.onNext(t10);
                    d();
                } else {
                    AppendOnlyLinkedArrayList<Object> appendOnlyLinkedArrayList = this.f94861r0;
                    if (appendOnlyLinkedArrayList == null) {
                        appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList<>(4);
                        this.f94861r0 = appendOnlyLinkedArrayList;
                    }
                    appendOnlyLinkedArrayList.add(NotificationLite.next(t10));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable) {
        if (!this.f94862s0) {
            synchronized (this) {
                try {
                    boolean z10 = true;
                    if (!this.f94862s0) {
                        if (this.f94860q0) {
                            AppendOnlyLinkedArrayList<Object> appendOnlyLinkedArrayList = this.f94861r0;
                            if (appendOnlyLinkedArrayList == null) {
                                appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList<>(4);
                                this.f94861r0 = appendOnlyLinkedArrayList;
                            }
                            appendOnlyLinkedArrayList.add(NotificationLite.disposable(disposable));
                            return;
                        }
                        this.f94860q0 = true;
                        z10 = false;
                    }
                    if (!z10) {
                        this.f94859p0.onSubscribe(disposable);
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

    @Override // io.reactivex.Observable
    public final void subscribeActual(Observer<? super T> observer) {
        this.f94859p0.subscribe(observer);
    }

    @Override // io.reactivex.internal.util.AppendOnlyLinkedArrayList.NonThrowingPredicate, io.reactivex.functions.Predicate
    public final boolean test(Object obj) {
        return NotificationLite.acceptFull(obj, this.f94859p0);
    }
}
