package androidx.databinding;

import androidx.annotation.RestrictTo;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: compiled from: ObservableReference.java */
/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public interface d<T> {
    void addListener(T t10);

    void removeListener(T t10);

    void setLifecycleOwner(LifecycleOwner lifecycleOwner);
}
