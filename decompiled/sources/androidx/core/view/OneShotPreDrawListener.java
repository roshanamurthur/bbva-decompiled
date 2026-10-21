package androidx.core.view;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class OneShotPreDrawListener implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private final View f20222p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ViewTreeObserver f20223q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private final Runnable f20224r0;

    public OneShotPreDrawListener(View view, Runnable runnable) {
        this.f20222p0 = view;
        this.f20223q0 = view.getViewTreeObserver();
        this.f20224r0 = runnable;
    }

    @NonNull
    public static OneShotPreDrawListener add(@NonNull View view, @NonNull Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        if (runnable == null) {
            throw new NullPointerException("runnable == null");
        }
        OneShotPreDrawListener oneShotPreDrawListener = new OneShotPreDrawListener(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(oneShotPreDrawListener);
        view.addOnAttachStateChangeListener(oneShotPreDrawListener);
        return oneShotPreDrawListener;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        removeListener();
        this.f20224r0.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(@NonNull View view) {
        this.f20223q0 = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(@NonNull View view) {
        removeListener();
    }

    public void removeListener() {
        if (this.f20223q0.isAlive()) {
            this.f20223q0.removeOnPreDrawListener(this);
        } else {
            this.f20222p0.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f20222p0.removeOnAttachStateChangeListener(this);
    }
}
