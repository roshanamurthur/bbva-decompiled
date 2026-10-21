package androidx.databinding;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public class MapChangeRegistry extends CallbackRegistry<ObservableMap.OnMapChangedCallback, ObservableMap, Object> {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final a f20528u0 = new a();

    public class a extends CallbackRegistry.NotifierCallback<ObservableMap.OnMapChangedCallback, ObservableMap, Object> {
        @Override // androidx.databinding.CallbackRegistry.NotifierCallback
        public final void onNotifyCallback(ObservableMap.OnMapChangedCallback onMapChangedCallback, ObservableMap observableMap, int i10, Object obj) {
            onMapChangedCallback.onMapChanged(observableMap, obj);
        }
    }

    public MapChangeRegistry() {
        super(f20528u0);
    }

    public void notifyChange(@NonNull ObservableMap observableMap, @Nullable Object obj) {
        notifyCallbacks(observableMap, 0, obj);
    }
}
