package com.bumptech.glide.request.target;

import android.graphics.drawable.Drawable;
import androidx.annotation.Nullable;
import com.bumptech.glide.request.Request;

/* JADX INFO: loaded from: classes9.dex */
@Deprecated
public abstract class BaseTarget<Z> implements Target<Z> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public Request f38819p0;

    @Override // com.bumptech.glide.request.target.Target
    @Nullable
    public Request getRequest() {
        return this.f38819p0;
    }

    @Override // com.bumptech.glide.request.target.Target
    public void setRequest(@Nullable Request request) {
        this.f38819p0 = request;
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public void onDestroy() {
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public void onStart() {
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public void onStop() {
    }

    @Override // com.bumptech.glide.request.target.Target
    public void onLoadCleared(@Nullable Drawable drawable) {
    }

    @Override // com.bumptech.glide.request.target.Target
    public void onLoadFailed(@Nullable Drawable drawable) {
    }

    @Override // com.bumptech.glide.request.target.Target
    public void onLoadStarted(@Nullable Drawable drawable) {
    }
}
