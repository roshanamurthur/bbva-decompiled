package androidx.databinding;

import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes2.dex */
public abstract class OnRebindCallback<T extends ViewDataBinding> {
    public boolean onPreBind(T t10) {
        return true;
    }

    public void onBound(T t10) {
    }

    public void onCanceled(T t10) {
    }
}
