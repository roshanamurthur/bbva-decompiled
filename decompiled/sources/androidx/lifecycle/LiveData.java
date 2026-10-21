package androidx.lifecycle;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.arch.core.executor.ArchTaskExecutor;
import androidx.arch.core.internal.SafeIterableMap;
import androidx.camera.camera2.internal.h0;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class LiveData<T> {
    static final Object NOT_SET = new Object();
    static final int START_VERSION = -1;
    int mActiveCount;
    private boolean mChangingActiveState;
    private volatile Object mData;
    final Object mDataLock;
    private boolean mDispatchInvalidated;
    private boolean mDispatchingValue;
    private SafeIterableMap<Observer<? super T>, LiveData<T>.d> mObservers;
    volatile Object mPendingData;
    private final Runnable mPostValueRunnable;
    private int mVersion;

    public class a implements Runnable {
        public a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            Object obj;
            synchronized (LiveData.this.mDataLock) {
                obj = LiveData.this.mPendingData;
                LiveData.this.mPendingData = LiveData.NOT_SET;
            }
            LiveData.this.setValue(obj);
        }
    }

    public class b extends LiveData<T>.d {
        @Override // androidx.lifecycle.LiveData.d
        public final boolean d() {
            return true;
        }
    }

    public class c extends LiveData<T>.d implements LifecycleEventObserver {

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        @NonNull
        public final LifecycleOwner f21919t0;

        public c(LifecycleOwner lifecycleOwner, Observer<? super T> observer) {
            super(observer);
            this.f21919t0 = lifecycleOwner;
        }

        @Override // androidx.lifecycle.LiveData.d
        public final void b() {
            this.f21919t0.getLifecycle().removeObserver(this);
        }

        @Override // androidx.lifecycle.LiveData.d
        public final boolean c(LifecycleOwner lifecycleOwner) {
            return this.f21919t0 == lifecycleOwner;
        }

        @Override // androidx.lifecycle.LiveData.d
        public final boolean d() {
            return this.f21919t0.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED);
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(@NonNull LifecycleOwner lifecycleOwner, @NonNull Lifecycle.Event event) {
            LifecycleOwner lifecycleOwner2 = this.f21919t0;
            Lifecycle.State currentState = lifecycleOwner2.getLifecycle().getCurrentState();
            if (currentState == Lifecycle.State.DESTROYED) {
                LiveData.this.removeObserver(this.f21921p0);
                return;
            }
            Lifecycle.State state = null;
            while (state != currentState) {
                a(d());
                state = currentState;
                currentState = lifecycleOwner2.getLifecycle().getCurrentState();
            }
        }
    }

    public LiveData(T t10) {
        this.mDataLock = new Object();
        this.mObservers = new SafeIterableMap<>();
        this.mActiveCount = 0;
        this.mPendingData = NOT_SET;
        this.mPostValueRunnable = new a();
        this.mData = t10;
        this.mVersion = 0;
    }

    public static void assertMainThread(String str) {
        if (!ArchTaskExecutor.getInstance().isMainThread()) {
            throw new IllegalStateException(h0.b("Cannot invoke ", str, " on a background thread"));
        }
    }

    private void considerNotify(LiveData<T>.d dVar) {
        if (dVar.f21922q0) {
            if (!dVar.d()) {
                dVar.a(false);
                return;
            }
            int i10 = dVar.f21923r0;
            int i11 = this.mVersion;
            if (i10 >= i11) {
                return;
            }
            dVar.f21923r0 = i11;
            dVar.f21921p0.onChanged((Object) this.mData);
        }
    }

    @MainThread
    public void changeActiveCounter(int i10) {
        int i11 = this.mActiveCount;
        this.mActiveCount = i10 + i11;
        if (this.mChangingActiveState) {
            return;
        }
        this.mChangingActiveState = true;
        while (true) {
            try {
                int i12 = this.mActiveCount;
                if (i11 == i12) {
                    this.mChangingActiveState = false;
                    return;
                }
                boolean z10 = i11 == 0 && i12 > 0;
                boolean z11 = i11 > 0 && i12 == 0;
                if (z10) {
                    onActive();
                } else if (z11) {
                    onInactive();
                }
                i11 = i12;
            } catch (Throwable th2) {
                this.mChangingActiveState = false;
                throw th2;
            }
        }
    }

    public void dispatchingValue(@Nullable LiveData<T>.d dVar) {
        if (this.mDispatchingValue) {
            this.mDispatchInvalidated = true;
            return;
        }
        this.mDispatchingValue = true;
        do {
            this.mDispatchInvalidated = false;
            if (dVar != null) {
                considerNotify(dVar);
                dVar = null;
            } else {
                SafeIterableMap<Observer<? super T>, LiveData<T>.d>.IteratorWithAdditions iteratorWithAdditions = this.mObservers.iteratorWithAdditions();
                while (iteratorWithAdditions.hasNext()) {
                    considerNotify((d) iteratorWithAdditions.next().getValue());
                    if (this.mDispatchInvalidated) {
                        break;
                    }
                }
            }
        } while (this.mDispatchInvalidated);
        this.mDispatchingValue = false;
    }

    @Nullable
    public T getValue() {
        T t10 = (T) this.mData;
        if (t10 != NOT_SET) {
            return t10;
        }
        return null;
    }

    public int getVersion() {
        return this.mVersion;
    }

    public boolean hasActiveObservers() {
        return this.mActiveCount > 0;
    }

    public boolean hasObservers() {
        return this.mObservers.size() > 0;
    }

    public boolean isInitialized() {
        return this.mData != NOT_SET;
    }

    @MainThread
    public void observe(@NonNull LifecycleOwner lifecycleOwner, @NonNull Observer<? super T> observer) {
        assertMainThread("observe");
        if (lifecycleOwner.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
            return;
        }
        c cVar = new c(lifecycleOwner, observer);
        LiveData<T>.d dVarPutIfAbsent = this.mObservers.putIfAbsent(observer, cVar);
        if (dVarPutIfAbsent != null && !dVarPutIfAbsent.c(lifecycleOwner)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (dVarPutIfAbsent != null) {
            return;
        }
        lifecycleOwner.getLifecycle().addObserver(cVar);
    }

    @MainThread
    public void observeForever(@NonNull Observer<? super T> observer) {
        assertMainThread("observeForever");
        b bVar = new b(observer);
        LiveData<T>.d dVarPutIfAbsent = this.mObservers.putIfAbsent(observer, bVar);
        if (dVarPutIfAbsent instanceof c) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (dVarPutIfAbsent != null) {
            return;
        }
        bVar.a(true);
    }

    public void postValue(T t10) {
        boolean z10;
        synchronized (this.mDataLock) {
            z10 = this.mPendingData == NOT_SET;
            this.mPendingData = t10;
        }
        if (z10) {
            ArchTaskExecutor.getInstance().postToMainThread(this.mPostValueRunnable);
        }
    }

    @MainThread
    public void removeObserver(@NonNull Observer<? super T> observer) {
        assertMainThread("removeObserver");
        LiveData<T>.d dVarRemove = this.mObservers.remove(observer);
        if (dVarRemove == null) {
            return;
        }
        dVarRemove.b();
        dVarRemove.a(false);
    }

    @MainThread
    public void removeObservers(@NonNull LifecycleOwner lifecycleOwner) {
        assertMainThread("removeObservers");
        for (Map.Entry<Observer<? super T>, LiveData<T>.d> entry : this.mObservers) {
            if (entry.getValue().c(lifecycleOwner)) {
                removeObserver(entry.getKey());
            }
        }
    }

    @MainThread
    public void setValue(T t10) {
        assertMainThread("setValue");
        this.mVersion++;
        this.mData = t10;
        dispatchingValue(null);
    }

    public LiveData() {
        this.mDataLock = new Object();
        this.mObservers = new SafeIterableMap<>();
        this.mActiveCount = 0;
        Object obj = NOT_SET;
        this.mPendingData = obj;
        this.mPostValueRunnable = new a();
        this.mData = obj;
        this.mVersion = -1;
    }

    public abstract class d {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super T> f21921p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public boolean f21922q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f21923r0 = -1;

        public d(Observer<? super T> observer) {
            this.f21921p0 = observer;
        }

        public final void a(boolean z10) {
            if (z10 == this.f21922q0) {
                return;
            }
            this.f21922q0 = z10;
            int i10 = z10 ? 1 : -1;
            LiveData liveData = LiveData.this;
            liveData.changeActiveCounter(i10);
            if (this.f21922q0) {
                liveData.dispatchingValue(this);
            }
        }

        public boolean c(LifecycleOwner lifecycleOwner) {
            return false;
        }

        public abstract boolean d();

        public void b() {
        }
    }

    public void onActive() {
    }

    public void onInactive() {
    }
}
