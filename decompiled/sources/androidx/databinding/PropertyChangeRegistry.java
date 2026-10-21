package androidx.databinding;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public class PropertyChangeRegistry extends CallbackRegistry<Observable.OnPropertyChangedCallback, Observable, Void> {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final a f20543u0 = new a();

    public class a extends CallbackRegistry.NotifierCallback<Observable.OnPropertyChangedCallback, Observable, Void> {
        @Override // androidx.databinding.CallbackRegistry.NotifierCallback
        public final void onNotifyCallback(Observable.OnPropertyChangedCallback onPropertyChangedCallback, Observable observable, int i10, Void r4) {
            onPropertyChangedCallback.onPropertyChanged(observable, i10);
        }
    }

    public PropertyChangeRegistry() {
        super(f20543u0);
    }

    public void notifyChange(@NonNull Observable observable, int i10) {
        notifyCallbacks(observable, i10, null);
    }
}
