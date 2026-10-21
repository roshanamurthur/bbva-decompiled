package androidx.lifecycle;

import androidx.annotation.CallSuper;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.arch.core.internal.SafeIterableMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class MediatorLiveData<T> extends MutableLiveData<T> {
    private SafeIterableMap<LiveData<?>, a<?>> mSources;

    public static class a<V> implements Observer<V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LiveData<V> f21934a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Observer<? super V> f21935b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f21936c = -1;

        public a(LiveData<V> liveData, Observer<? super V> observer) {
            this.f21934a = liveData;
            this.f21935b = observer;
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(@Nullable V v3) {
            int i10 = this.f21936c;
            LiveData<V> liveData = this.f21934a;
            if (i10 != liveData.getVersion()) {
                this.f21936c = liveData.getVersion();
                this.f21935b.onChanged(v3);
            }
        }
    }

    public MediatorLiveData() {
        this.mSources = new SafeIterableMap<>();
    }

    @MainThread
    public <S> void addSource(@NonNull LiveData<S> liveData, @NonNull Observer<? super S> observer) {
        if (liveData == null) {
            throw new NullPointerException("source cannot be null");
        }
        a<?> aVar = new a<>(liveData, observer);
        a<?> aVarPutIfAbsent = this.mSources.putIfAbsent(liveData, aVar);
        if (aVarPutIfAbsent != null && aVarPutIfAbsent.f21935b != observer) {
            throw new IllegalArgumentException("This source was already added with the different observer");
        }
        if (aVarPutIfAbsent == null && hasActiveObservers()) {
            liveData.observeForever(aVar);
        }
    }

    @Override // androidx.lifecycle.LiveData
    @CallSuper
    public void onActive() {
        Iterator<Map.Entry<LiveData<?>, a<?>>> it = this.mSources.iterator();
        while (it.hasNext()) {
            a<?> value = it.next().getValue();
            value.f21934a.observeForever(value);
        }
    }

    @Override // androidx.lifecycle.LiveData
    @CallSuper
    public void onInactive() {
        Iterator<Map.Entry<LiveData<?>, a<?>>> it = this.mSources.iterator();
        while (it.hasNext()) {
            a<?> value = it.next().getValue();
            value.f21934a.removeObserver(value);
        }
    }

    @MainThread
    public <S> void removeSource(@NonNull LiveData<S> liveData) {
        a<?> aVarRemove = this.mSources.remove(liveData);
        if (aVarRemove != null) {
            aVarRemove.f21934a.removeObserver(aVarRemove);
        }
    }

    public MediatorLiveData(T t10) {
        super(t10);
        this.mSources = new SafeIterableMap<>();
    }
}
