package androidx.databinding;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: WeakListener.java */
/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class h<T> extends WeakReference<ViewDataBinding> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d<T> f20626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public T f20628c;

    public h(ViewDataBinding viewDataBinding, int i10, d<T> dVar, ReferenceQueue<ViewDataBinding> referenceQueue) {
        super(viewDataBinding, referenceQueue);
        this.f20627b = i10;
        this.f20626a = dVar;
    }

    @Nullable
    public final ViewDataBinding a() {
        ViewDataBinding viewDataBinding = (ViewDataBinding) get();
        if (viewDataBinding == null) {
            b();
        }
        return viewDataBinding;
    }

    public final boolean b() {
        boolean z10;
        T t10 = this.f20628c;
        if (t10 != null) {
            this.f20626a.removeListener(t10);
            z10 = true;
        } else {
            z10 = false;
        }
        this.f20628c = null;
        return z10;
    }
}
