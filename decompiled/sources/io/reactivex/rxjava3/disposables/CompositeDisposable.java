package io.reactivex.rxjava3.disposables;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.annotations.Nullable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.internal.util.OpenHashSet;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes12.dex */
public final class CompositeDisposable implements Disposable, DisposableContainer {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public OpenHashSet<Disposable> f73958p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public volatile boolean f73959q0;

    public CompositeDisposable() {
    }

    public static void a(@Nullable OpenHashSet openHashSet) {
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

    @Override // io.reactivex.rxjava3.disposables.DisposableContainer
    public boolean add(@NonNull Disposable disposable) {
        Objects.requireNonNull(disposable, "disposable is null");
        if (!this.f73959q0) {
            synchronized (this) {
                try {
                    if (!this.f73959q0) {
                        OpenHashSet<Disposable> openHashSet = this.f73958p0;
                        if (openHashSet == null) {
                            openHashSet = new OpenHashSet<>();
                            this.f73958p0 = openHashSet;
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
        Objects.requireNonNull(disposableArr, "disposables is null");
        if (!this.f73959q0) {
            synchronized (this) {
                try {
                    if (!this.f73959q0) {
                        OpenHashSet<Disposable> openHashSet = this.f73958p0;
                        if (openHashSet == null) {
                            openHashSet = new OpenHashSet<>(disposableArr.length + 1);
                            this.f73958p0 = openHashSet;
                        }
                        for (Disposable disposable : disposableArr) {
                            Objects.requireNonNull(disposable, "A Disposable in the disposables array is null");
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
        if (this.f73959q0) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f73959q0) {
                    return;
                }
                OpenHashSet<Disposable> openHashSet = this.f73958p0;
                this.f73958p0 = null;
                a(openHashSet);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.reactivex.rxjava3.disposables.DisposableContainer
    public boolean delete(@NonNull Disposable disposable) {
        Objects.requireNonNull(disposable, "disposable is null");
        if (this.f73959q0) {
            return false;
        }
        synchronized (this) {
            try {
                if (this.f73959q0) {
                    return false;
                }
                OpenHashSet<Disposable> openHashSet = this.f73958p0;
                if (openHashSet != null && openHashSet.remove(disposable)) {
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
        if (this.f73959q0) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f73959q0) {
                    return;
                }
                this.f73959q0 = true;
                OpenHashSet<Disposable> openHashSet = this.f73958p0;
                this.f73958p0 = null;
                a(openHashSet);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public boolean isDisposed() {
        return this.f73959q0;
    }

    @Override // io.reactivex.rxjava3.disposables.DisposableContainer
    public boolean remove(@NonNull Disposable disposable) {
        if (!delete(disposable)) {
            return false;
        }
        disposable.dispose();
        return true;
    }

    public int size() {
        if (this.f73959q0) {
            return 0;
        }
        synchronized (this) {
            try {
                if (this.f73959q0) {
                    return 0;
                }
                OpenHashSet<Disposable> openHashSet = this.f73958p0;
                return openHashSet != null ? openHashSet.size() : 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public CompositeDisposable(@NonNull Disposable... disposableArr) {
        Objects.requireNonNull(disposableArr, "disposables is null");
        this.f73958p0 = new OpenHashSet<>(disposableArr.length + 1);
        for (Disposable disposable : disposableArr) {
            Objects.requireNonNull(disposable, "A Disposable in the disposables array is null");
            this.f73958p0.add(disposable);
        }
    }

    public CompositeDisposable(@NonNull Iterable<? extends Disposable> iterable) {
        Objects.requireNonNull(iterable, "disposables is null");
        this.f73958p0 = new OpenHashSet<>();
        for (Disposable disposable : iterable) {
            Objects.requireNonNull(disposable, "A Disposable item in the disposables sequence is null");
            this.f73958p0.add(disposable);
        }
    }
}
