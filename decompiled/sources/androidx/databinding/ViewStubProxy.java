package androidx.databinding;

import android.view.View;
import android.view.ViewStub;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public class ViewStubProxy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ViewStub f20565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewDataBinding f20566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f20567c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ViewStub.OnInflateListener f20568d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ViewDataBinding f20569e;

    public class a implements ViewStub.OnInflateListener {
        public a() {
        }

        @Override // android.view.ViewStub.OnInflateListener
        public final void onInflate(ViewStub viewStub, View view) {
            ViewStubProxy viewStubProxy = ViewStubProxy.this;
            viewStubProxy.f20567c = view;
            viewStubProxy.f20566b = DataBindingUtil.f20522a.getDataBinder(viewStubProxy.f20569e.mBindingComponent, view, viewStub.getLayoutResource());
            viewStubProxy.f20565a = null;
            ViewStub.OnInflateListener onInflateListener = viewStubProxy.f20568d;
            if (onInflateListener != null) {
                onInflateListener.onInflate(viewStub, view);
                viewStubProxy.f20568d = null;
            }
            viewStubProxy.f20569e.invalidateAll();
            viewStubProxy.f20569e.executeBindings();
        }
    }

    public ViewStubProxy(@NonNull ViewStub viewStub) {
        a aVar = new a();
        this.f20565a = viewStub;
        viewStub.setOnInflateListener(aVar);
    }

    @Nullable
    public ViewDataBinding getBinding() {
        return this.f20566b;
    }

    public View getRoot() {
        return this.f20567c;
    }

    @Nullable
    public ViewStub getViewStub() {
        return this.f20565a;
    }

    public boolean isInflated() {
        return this.f20567c != null;
    }

    public void setContainingBinding(@NonNull ViewDataBinding viewDataBinding) {
        this.f20569e = viewDataBinding;
    }

    public void setOnInflateListener(@Nullable ViewStub.OnInflateListener onInflateListener) {
        if (this.f20565a != null) {
            this.f20568d = onInflateListener;
        }
    }
}
