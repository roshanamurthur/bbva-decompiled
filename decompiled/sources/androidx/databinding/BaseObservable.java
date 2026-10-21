package androidx.databinding;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public class BaseObservable implements Observable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public transient PropertyChangeRegistry f20516p0;

    @Override // androidx.databinding.Observable
    public void addOnPropertyChangedCallback(@NonNull Observable.OnPropertyChangedCallback onPropertyChangedCallback) {
        synchronized (this) {
            try {
                if (this.f20516p0 == null) {
                    this.f20516p0 = new PropertyChangeRegistry();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f20516p0.add(onPropertyChangedCallback);
    }

    public void notifyChange() {
        synchronized (this) {
            try {
                PropertyChangeRegistry propertyChangeRegistry = this.f20516p0;
                if (propertyChangeRegistry == null) {
                    return;
                }
                propertyChangeRegistry.notifyCallbacks(this, 0, null);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void notifyPropertyChanged(int i10) {
        synchronized (this) {
            try {
                PropertyChangeRegistry propertyChangeRegistry = this.f20516p0;
                if (propertyChangeRegistry == null) {
                    return;
                }
                propertyChangeRegistry.notifyCallbacks(this, i10, null);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.Observable
    public void removeOnPropertyChangedCallback(@NonNull Observable.OnPropertyChangedCallback onPropertyChangedCallback) {
        synchronized (this) {
            try {
                PropertyChangeRegistry propertyChangeRegistry = this.f20516p0;
                if (propertyChangeRegistry == null) {
                    return;
                }
                propertyChangeRegistry.remove(onPropertyChangedCallback);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
