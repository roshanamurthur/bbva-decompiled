package io.reactivex.rxjava3.internal.disposables;

import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.disposables.DisposableContainer;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes12.dex */
public final class ListCompositeDisposable implements Disposable, DisposableContainer {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public LinkedList f73967p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public volatile boolean f73968q0;

    public ListCompositeDisposable() {
    }

    public final void a(List<Disposable> list) {
        if (list == null) {
            return;
        }
        Iterator<Disposable> it = list.iterator();
        ArrayList arrayList = null;
        while (it.hasNext()) {
            try {
                it.next().dispose();
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(th2);
            }
        }
        if (arrayList != null) {
            if (arrayList.size() != 1) {
                throw new CompositeException(arrayList);
            }
            throw ExceptionHelper.wrapOrThrow((Throwable) arrayList.get(0));
        }
    }

    @Override // io.reactivex.rxjava3.disposables.DisposableContainer
    public boolean add(Disposable disposable) {
        Objects.requireNonNull(disposable, "d is null");
        if (!this.f73968q0) {
            synchronized (this) {
                try {
                    if (!this.f73968q0) {
                        LinkedList linkedList = this.f73967p0;
                        if (linkedList == null) {
                            linkedList = new LinkedList();
                            this.f73967p0 = linkedList;
                        }
                        linkedList.add(disposable);
                        return true;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        disposable.dispose();
        return false;
    }

    public boolean addAll(Disposable... disposableArr) {
        Objects.requireNonNull(disposableArr, "ds is null");
        if (!this.f73968q0) {
            synchronized (this) {
                try {
                    if (!this.f73968q0) {
                        LinkedList linkedList = this.f73967p0;
                        if (linkedList == null) {
                            linkedList = new LinkedList();
                            this.f73967p0 = linkedList;
                        }
                        for (Disposable disposable : disposableArr) {
                            Objects.requireNonNull(disposable, "d is null");
                            linkedList.add(disposable);
                        }
                        return true;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        for (Disposable disposable2 : disposableArr) {
            disposable2.dispose();
        }
        return false;
    }

    public void clear() {
        if (this.f73968q0) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f73968q0) {
                    return;
                }
                LinkedList linkedList = this.f73967p0;
                this.f73967p0 = null;
                a(linkedList);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.reactivex.rxjava3.disposables.DisposableContainer
    public boolean delete(Disposable disposable) {
        Objects.requireNonNull(disposable, "Disposable item is null");
        if (this.f73968q0) {
            return false;
        }
        synchronized (this) {
            try {
                if (this.f73968q0) {
                    return false;
                }
                LinkedList linkedList = this.f73967p0;
                if (linkedList != null && linkedList.remove(disposable)) {
                    return true;
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public void dispose() {
        if (this.f73968q0) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f73968q0) {
                    return;
                }
                this.f73968q0 = true;
                LinkedList linkedList = this.f73967p0;
                this.f73967p0 = null;
                a(linkedList);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public boolean isDisposed() {
        return this.f73968q0;
    }

    @Override // io.reactivex.rxjava3.disposables.DisposableContainer
    public boolean remove(Disposable disposable) {
        if (!delete(disposable)) {
            return false;
        }
        disposable.dispose();
        return true;
    }

    public ListCompositeDisposable(Disposable... disposableArr) {
        Objects.requireNonNull(disposableArr, "resources is null");
        this.f73967p0 = new LinkedList();
        for (Disposable disposable : disposableArr) {
            Objects.requireNonNull(disposable, "Disposable item is null");
            this.f73967p0.add(disposable);
        }
    }

    public ListCompositeDisposable(Iterable<? extends Disposable> iterable) {
        Objects.requireNonNull(iterable, "resources is null");
        this.f73967p0 = new LinkedList();
        for (Disposable disposable : iterable) {
            Objects.requireNonNull(disposable, "Disposable item is null");
            this.f73967p0.add(disposable);
        }
    }
}
