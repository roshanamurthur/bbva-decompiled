package androidx.databinding;

import androidx.annotation.NonNull;
import androidx.core.util.Pools;

/* JADX INFO: loaded from: classes2.dex */
public class ListChangeRegistry extends CallbackRegistry<ObservableList.OnListChangedCallback, ObservableList, b> {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final Pools.SynchronizedPool<b> f20524u0 = new Pools.SynchronizedPool<>(10);
    public static final a v0 = new a();

    public class a extends CallbackRegistry.NotifierCallback<ObservableList.OnListChangedCallback, ObservableList, b> {
        @Override // androidx.databinding.CallbackRegistry.NotifierCallback
        public final void onNotifyCallback(ObservableList.OnListChangedCallback onListChangedCallback, ObservableList observableList, int i10, b bVar) {
            ObservableList.OnListChangedCallback onListChangedCallback2 = onListChangedCallback;
            ObservableList observableList2 = observableList;
            b bVar2 = bVar;
            if (i10 == 1) {
                onListChangedCallback2.onItemRangeChanged(observableList2, bVar2.f20525a, bVar2.f20526b);
                return;
            }
            if (i10 == 2) {
                onListChangedCallback2.onItemRangeInserted(observableList2, bVar2.f20525a, bVar2.f20526b);
                return;
            }
            if (i10 == 3) {
                onListChangedCallback2.onItemRangeMoved(observableList2, bVar2.f20525a, bVar2.f20527c, bVar2.f20526b);
            } else if (i10 != 4) {
                onListChangedCallback2.onChanged(observableList2);
            } else {
                onListChangedCallback2.onItemRangeRemoved(observableList2, bVar2.f20525a, bVar2.f20526b);
            }
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f20525a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f20526b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f20527c;
    }

    public ListChangeRegistry() {
        super(v0);
    }

    public static b f(int i10, int i11, int i12) {
        b bVarAcquire = f20524u0.acquire();
        if (bVarAcquire == null) {
            bVarAcquire = new b();
        }
        bVarAcquire.f20525a = i10;
        bVarAcquire.f20527c = i11;
        bVarAcquire.f20526b = i12;
        return bVarAcquire;
    }

    public void notifyChanged(@NonNull ObservableList observableList) {
        notifyCallbacks(observableList, 0, (b) null);
    }

    public void notifyInserted(@NonNull ObservableList observableList, int i10, int i11) {
        notifyCallbacks(observableList, 2, f(i10, 0, i11));
    }

    public void notifyMoved(@NonNull ObservableList observableList, int i10, int i11, int i12) {
        notifyCallbacks(observableList, 3, f(i10, i11, i12));
    }

    public void notifyRemoved(@NonNull ObservableList observableList, int i10, int i11) {
        notifyCallbacks(observableList, 4, f(i10, 0, i11));
    }

    @Override // androidx.databinding.CallbackRegistry
    public synchronized void notifyCallbacks(@NonNull ObservableList observableList, int i10, b bVar) {
        super.notifyCallbacks(observableList, i10, bVar);
        if (bVar != null) {
            f20524u0.release(bVar);
        }
    }

    public void notifyChanged(@NonNull ObservableList observableList, int i10, int i11) {
        notifyCallbacks(observableList, 1, f(i10, 0, i11));
    }
}
