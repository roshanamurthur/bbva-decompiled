package com.salesforce.marketingcloud.media;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.annotation.VisibleForTesting;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes11.dex */
@SuppressLint({"UnknownNullness"})
@VisibleForTesting(otherwise = 3)
public class g implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final WeakReference<ImageView> f64469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final t f64470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    f f64471c;

    public g(t tVar, ImageView imageView, f fVar) {
        this.f64470b = tVar;
        this.f64469a = new WeakReference<>(imageView);
        this.f64471c = fVar;
        imageView.addOnAttachStateChangeListener(this);
        if (imageView.getWindowToken() != null) {
            imageView.getViewTreeObserver().addOnPreDrawListener(this);
        }
    }

    public void a() {
        this.f64471c = null;
        ImageView imageView = this.f64469a.get();
        if (imageView == null) {
            return;
        }
        this.f64469a.clear();
        imageView.removeOnAttachStateChangeListener(this);
        ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this);
        }
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        ImageView imageView = this.f64469a.get();
        if (imageView == null) {
            return true;
        }
        ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            return true;
        }
        int width = imageView.getWidth();
        int height = imageView.getHeight();
        if (width > 0 && height > 0) {
            imageView.removeOnAttachStateChangeListener(this);
            viewTreeObserver.removeOnPreDrawListener(this);
            this.f64469a.clear();
            this.f64470b.a(width, height).a(imageView, this.f64471c);
        }
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        view.getViewTreeObserver().addOnPreDrawListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        view.getViewTreeObserver().removeOnPreDrawListener(this);
    }
}
