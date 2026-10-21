package com.bumptech.glide.request.target;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.request.transition.Transition;

/* JADX INFO: loaded from: classes9.dex */
public abstract class ImageViewTarget<Z> extends ViewTarget<ImageView, Z> implements Transition.ViewAdapter {

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    @Nullable
    public Animatable f38841w0;

    public ImageViewTarget(ImageView imageView) {
        super(imageView);
    }

    @Override // com.bumptech.glide.request.transition.Transition.ViewAdapter
    @Nullable
    public Drawable getCurrentDrawable() {
        return ((ImageView) this.view).getDrawable();
    }

    @Override // com.bumptech.glide.request.target.ViewTarget, com.bumptech.glide.request.target.BaseTarget, com.bumptech.glide.request.target.Target
    public void onLoadCleared(@Nullable Drawable drawable) {
        super.onLoadCleared(drawable);
        Animatable animatable = this.f38841w0;
        if (animatable != null) {
            animatable.stop();
        }
        setResource(null);
        this.f38841w0 = null;
        setDrawable(drawable);
    }

    @Override // com.bumptech.glide.request.target.BaseTarget, com.bumptech.glide.request.target.Target
    public void onLoadFailed(@Nullable Drawable drawable) {
        super.onLoadFailed(drawable);
        setResource(null);
        this.f38841w0 = null;
        setDrawable(drawable);
    }

    @Override // com.bumptech.glide.request.target.ViewTarget, com.bumptech.glide.request.target.BaseTarget, com.bumptech.glide.request.target.Target
    public void onLoadStarted(@Nullable Drawable drawable) {
        super.onLoadStarted(drawable);
        setResource(null);
        this.f38841w0 = null;
        setDrawable(drawable);
    }

    @Override // com.bumptech.glide.request.target.Target
    public void onResourceReady(@NonNull Z z10, @Nullable Transition<? super Z> transition) {
        if (transition != null && transition.transition(z10, this)) {
            if (!(z10 instanceof Animatable)) {
                this.f38841w0 = null;
                return;
            }
            Animatable animatable = (Animatable) z10;
            this.f38841w0 = animatable;
            animatable.start();
            return;
        }
        setResource(z10);
        if (!(z10 instanceof Animatable)) {
            this.f38841w0 = null;
            return;
        }
        Animatable animatable2 = (Animatable) z10;
        this.f38841w0 = animatable2;
        animatable2.start();
    }

    @Override // com.bumptech.glide.request.target.BaseTarget, com.bumptech.glide.manager.LifecycleListener
    public void onStart() {
        Animatable animatable = this.f38841w0;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // com.bumptech.glide.request.target.BaseTarget, com.bumptech.glide.manager.LifecycleListener
    public void onStop() {
        Animatable animatable = this.f38841w0;
        if (animatable != null) {
            animatable.stop();
        }
    }

    @Override // com.bumptech.glide.request.transition.Transition.ViewAdapter
    public void setDrawable(Drawable drawable) {
        ((ImageView) this.view).setImageDrawable(drawable);
    }

    public abstract void setResource(@Nullable Z z10);

    @Deprecated
    public ImageViewTarget(ImageView imageView, boolean z10) {
        super(imageView, z10);
    }
}
