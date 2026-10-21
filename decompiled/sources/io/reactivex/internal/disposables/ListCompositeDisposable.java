package io.reactivex.internal.disposables;

import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class ListCompositeDisposable implements Disposable, DisposableContainer {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public LinkedList f69892p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public volatile boolean f69893q0;

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

    @Override // io.reactivex.internal.disposables.DisposableContainer
    public boolean add(Disposable disposable) {
        ObjectHelper.requireNonNull(disposable, "d is null");
        if (!this.f69893q0) {
            synchronized (this) {
                try {
                    if (!this.f69893q0) {
                        LinkedList linkedList = this.f69892p0;
                        if (linkedList == null) {
                            linkedList = new LinkedList();
                            this.f69892p0 = linkedList;
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
        ObjectHelper.requireNonNull(disposableArr, "ds is null");
        if (!this.f69893q0) {
            synchronized (this) {
                try {
                    if (!this.f69893q0) {
                        LinkedList linkedList = this.f69892p0;
                        if (linkedList == null) {
                            linkedList = new LinkedList();
                            this.f69892p0 = linkedList;
                        }
                        for (Disposable disposable : disposableArr) {
                            ObjectHelper.requireNonNull(disposable, "d is null");
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
        if (this.f69893q0) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f69893q0) {
                    return;
                }
                LinkedList linkedList = this.f69892p0;
                this.f69892p0 = null;
                a(linkedList);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.reactivex.internal.disposables.DisposableContainer
    public boolean delete(Disposable disposable) {
        ObjectHelper.requireNonNull(disposable, "Disposable item is null");
        if (this.f69893q0) {
            return false;
        }
        synchronized (this) {
            try {
                if (this.f69893q0) {
                    return false;
                }
                LinkedList linkedList = this.f69892p0;
                if (linkedList != null && linkedList.remove(disposable)) {
                    return true;
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
        if (this.f69893q0) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f69893q0) {
                    return;
                }
                this.f69893q0 = true;
                LinkedList linkedList = this.f69892p0;
                this.f69892p0 = null;
                a(linkedList);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return this.f69893q0;
    }

    @Override // io.reactivex.internal.disposables.DisposableContainer
    public boolean remove(Disposable disposable) {
        if (!delete(disposable)) {
            return false;
        }
        disposable.dispose();
        return true;
    }

    public ListCompositeDisposable(Disposable... disposableArr) {
        ObjectHelper.requireNonNull(disposableArr, "resources is null");
        this.f69892p0 = new LinkedList();
        for (Disposable disposable : disposableArr) {
            ObjectHelper.requireNonNull(disposable, "Disposable item is null");
            this.f69892p0.add(disposable);
        }
    }

    public ListCompositeDisposable(Iterable<? extends Disposable> iterable) {
        ObjectHelper.requireNonNull(iterable, "resources is null");
        this.f69892p0 = new LinkedList();
        for (Disposable disposable : iterable) {
            ObjectHelper.requireNonNull(disposable, "Disposable item is null");
            this.f69892p0.add(disposable);
        }
    }
}
