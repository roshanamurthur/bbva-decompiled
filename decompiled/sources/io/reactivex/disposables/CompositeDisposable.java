package io.reactivex.disposables;

import io.reactivex.annotations.NonNull;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableContainer;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.OpenHashSet;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class CompositeDisposable implements Disposable, DisposableContainer {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public OpenHashSet<Disposable> f69883p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public volatile boolean f69884q0;

    public CompositeDisposable() {
    }

    public static void a(OpenHashSet openHashSet) {
        if (openHashSet == null) {
            return;
        }
        ArrayList arrayList = null;
        for (Object obj : openHashSet.keys()) {
            if (obj instanceof Disposable) {
                try {
                    ((Disposable) obj).dispose();
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th2);
                }
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
    public boolean add(@NonNull Disposable disposable) {
        ObjectHelper.requireNonNull(disposable, "disposable is null");
        if (!this.f69884q0) {
            synchronized (this) {
                try {
                    if (!this.f69884q0) {
                        OpenHashSet<Disposable> openHashSet = this.f69883p0;
                        if (openHashSet == null) {
                            openHashSet = new OpenHashSet<>();
                            this.f69883p0 = openHashSet;
                        }
                        openHashSet.add(disposable);
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

    public boolean addAll(@NonNull Disposable... disposableArr) {
        ObjectHelper.requireNonNull(disposableArr, "disposables is null");
        if (!this.f69884q0) {
            synchronized (this) {
                try {
                    if (!this.f69884q0) {
                        OpenHashSet<Disposable> openHashSet = this.f69883p0;
                        if (openHashSet == null) {
                            openHashSet = new OpenHashSet<>(disposableArr.length + 1);
                            this.f69883p0 = openHashSet;
                        }
                        for (Disposable disposable : disposableArr) {
                            ObjectHelper.requireNonNull(disposable, "A Disposable in the disposables array is null");
                            openHashSet.add(disposable);
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
        if (this.f69884q0) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f69884q0) {
                    return;
                }
                OpenHashSet<Disposable> openHashSet = this.f69883p0;
                this.f69883p0 = null;
                a(openHashSet);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.reactivex.internal.disposables.DisposableContainer
    public boolean delete(@NonNull Disposable disposable) {
        ObjectHelper.requireNonNull(disposable, "disposables is null");
        if (this.f69884q0) {
            return false;
        }
        synchronized (this) {
            try {
                if (this.f69884q0) {
                    return false;
                }
                OpenHashSet<Disposable> openHashSet = this.f69883p0;
                if (openHashSet != null && openHashSet.remove(disposable)) {
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
        if (this.f69884q0) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f69884q0) {
                    return;
                }
                this.f69884q0 = true;
                OpenHashSet<Disposable> openHashSet = this.f69883p0;
                this.f69883p0 = null;
                a(openHashSet);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return this.f69884q0;
    }

    @Override // io.reactivex.internal.disposables.DisposableContainer
    public boolean remove(@NonNull Disposable disposable) {
        if (!delete(disposable)) {
            return false;
        }
        disposable.dispose();
        return true;
    }

    public int size() {
        if (this.f69884q0) {
            return 0;
        }
        synchronized (this) {
            try {
                if (this.f69884q0) {
                    return 0;
                }
                OpenHashSet<Disposable> openHashSet = this.f69883p0;
                return openHashSet != null ? openHashSet.size() : 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public CompositeDisposable(@NonNull Disposable... disposableArr) {
        ObjectHelper.requireNonNull(disposableArr, "disposables is null");
        this.f69883p0 = new OpenHashSet<>(disposableArr.length + 1);
        for (Disposable disposable : disposableArr) {
            ObjectHelper.requireNonNull(disposable, "A Disposable in the disposables array is null");
            this.f69883p0.add(disposable);
        }
    }

    public CompositeDisposable(@NonNull Iterable<? extends Disposable> iterable) {
        ObjectHelper.requireNonNull(iterable, "disposables is null");
        this.f69883p0 = new OpenHashSet<>();
        for (Disposable disposable : iterable) {
            ObjectHelper.requireNonNull(disposable, "A Disposable item in the disposables sequence is null");
            this.f69883p0.add(disposable);
        }
    }
}
