package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import androidx.annotation.CheckResult;
import androidx.annotation.DrawableRes;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RawRes;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.bumptech.glide.manager.ConnectivityMonitor;
import com.bumptech.glide.manager.ConnectivityMonitorFactory;
import com.bumptech.glide.manager.Lifecycle;
import com.bumptech.glide.manager.LifecycleListener;
import com.bumptech.glide.manager.RequestManagerTreeNode;
import com.bumptech.glide.manager.RequestTracker;
import com.bumptech.glide.manager.TargetTracker;
import com.bumptech.glide.request.BaseRequestOptions;
import com.bumptech.glide.request.Request;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.CustomViewTarget;
import com.bumptech.glide.request.target.Target;
import com.bumptech.glide.request.transition.Transition;
import com.bumptech.glide.util.Util;
import java.io.File;
import java.net.URL;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes9.dex */
public class RequestManager implements ComponentCallbacks2, LifecycleListener {
    public static final RequestOptions E0 = RequestOptions.decodeTypeOf(Bitmap.class).lock();
    public static final RequestOptions F0 = RequestOptions.decodeTypeOf(GifDrawable.class).lock();
    public static final RequestOptions G0 = RequestOptions.diskCacheStrategyOf(DiskCacheStrategy.DATA).priority(Priority.LOW).skipMemoryCache(true);
    protected final Context context;
    protected final Glide glide;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Lifecycle f38049p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @GuardedBy("this")
    public final RequestTracker f38050q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @GuardedBy("this")
    public final RequestManagerTreeNode f38051r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @GuardedBy("this")
    public final TargetTracker f38052s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final a f38053t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final ConnectivityMonitor f38054u0;
    public final CopyOnWriteArrayList<RequestListener<Object>> v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    @GuardedBy("this")
    public RequestOptions f38055w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public boolean f38056x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public boolean f38057y0;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            RequestManager requestManager = RequestManager.this;
            requestManager.f38049p0.addListener(requestManager);
        }
    }

    public class c implements ConnectivityMonitor.ConnectivityListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @GuardedBy("RequestManager.this")
        public final RequestTracker f38059a;

        public c(RequestTracker requestTracker) {
            this.f38059a = requestTracker;
        }

        @Override // com.bumptech.glide.manager.ConnectivityMonitor.ConnectivityListener
        public final void onConnectivityChanged(boolean z10) {
            if (z10) {
                synchronized (RequestManager.this) {
                    this.f38059a.restartRequests();
                }
            }
        }
    }

    public RequestManager(@NonNull Glide glide, @NonNull Lifecycle lifecycle, @NonNull RequestManagerTreeNode requestManagerTreeNode, @NonNull Context context) {
        RequestTracker requestTracker = new RequestTracker();
        ConnectivityMonitorFactory connectivityMonitorFactory = glide.v0;
        this.f38052s0 = new TargetTracker();
        a aVar = new a();
        this.f38053t0 = aVar;
        this.glide = glide;
        this.f38049p0 = lifecycle;
        this.f38051r0 = requestManagerTreeNode;
        this.f38050q0 = requestTracker;
        this.context = context;
        ConnectivityMonitor connectivityMonitorBuild = connectivityMonitorFactory.build(context.getApplicationContext(), new c(requestTracker));
        this.f38054u0 = connectivityMonitorBuild;
        synchronized (glide.f37982w0) {
            if (glide.f37982w0.contains(this)) {
                throw new IllegalStateException("Cannot register already registered manager");
            }
            glide.f37982w0.add(this);
        }
        if (Util.isOnBackgroundThread()) {
            Util.postOnUiThread(aVar);
        } else {
            lifecycle.addListener(this);
        }
        lifecycle.addListener(connectivityMonitorBuild);
        this.v0 = new CopyOnWriteArrayList<>(glide.f37979s0.getDefaultRequestListeners());
        setRequestOptions(glide.f37979s0.getDefaultRequestOptions());
    }

    public final synchronized void a() {
        try {
            Iterator<Target<?>> it = this.f38052s0.getAll().iterator();
            while (it.hasNext()) {
                clear(it.next());
            }
            this.f38052s0.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public RequestManager addDefaultRequestListener(RequestListener<Object> requestListener) {
        this.v0.add(requestListener);
        return this;
    }

    @NonNull
    public synchronized RequestManager applyDefaultRequestOptions(@NonNull RequestOptions requestOptions) {
        c(requestOptions);
        return this;
    }

    @NonNull
    @CheckResult
    public <ResourceType> RequestBuilder<ResourceType> as(@NonNull Class<ResourceType> cls) {
        return new RequestBuilder<>(this.glide, this, cls, this.context);
    }

    @NonNull
    @CheckResult
    public RequestBuilder<Bitmap> asBitmap() {
        return as(Bitmap.class).apply((BaseRequestOptions<?>) E0);
    }

    @NonNull
    @CheckResult
    public RequestBuilder<Drawable> asDrawable() {
        return as(Drawable.class);
    }

    @NonNull
    @CheckResult
    public RequestBuilder<File> asFile() {
        return as(File.class).apply((BaseRequestOptions<?>) RequestOptions.skipMemoryCacheOf(true));
    }

    @NonNull
    @CheckResult
    public RequestBuilder<GifDrawable> asGif() {
        return as(GifDrawable.class).apply((BaseRequestOptions<?>) F0);
    }

    public final synchronized boolean b(@NonNull Target<?> target) {
        Request request = target.getRequest();
        if (request == null) {
            return true;
        }
        if (!this.f38050q0.clearAndRemove(request)) {
            return false;
        }
        this.f38052s0.untrack(target);
        target.setRequest(null);
        return true;
    }

    public final synchronized void c(@NonNull RequestOptions requestOptions) {
        this.f38055w0 = this.f38055w0.apply(requestOptions);
    }

    public void clear(@NonNull View view) {
        clear(new b(view));
    }

    @NonNull
    public synchronized RequestManager clearOnStop() {
        this.f38057y0 = true;
        return this;
    }

    @NonNull
    @CheckResult
    public RequestBuilder<File> download(@Nullable Object obj) {
        return downloadOnly().mo4906load(obj);
    }

    @NonNull
    @CheckResult
    public RequestBuilder<File> downloadOnly() {
        return as(File.class).apply((BaseRequestOptions<?>) G0);
    }

    public synchronized boolean isPaused() {
        return this.f38050q0.isPaused();
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public synchronized void onDestroy() {
        this.f38052s0.onDestroy();
        a();
        this.f38050q0.clearRequests();
        this.f38049p0.removeListener(this);
        this.f38049p0.removeListener(this.f38054u0);
        Util.removeCallbacksOnUiThread(this.f38053t0);
        this.glide.c(this);
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public synchronized void onStart() {
        resumeRequests();
        this.f38052s0.onStart();
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public synchronized void onStop() {
        try {
            this.f38052s0.onStop();
            if (this.f38057y0) {
                a();
            } else {
                pauseRequests();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        if (i10 == 60 && this.f38056x0) {
            pauseAllRequestsRecursive();
        }
    }

    public synchronized void pauseAllRequests() {
        this.f38050q0.pauseAllRequests();
    }

    public synchronized void pauseAllRequestsRecursive() {
        pauseAllRequests();
        Iterator<RequestManager> it = this.f38051r0.getDescendants().iterator();
        while (it.hasNext()) {
            it.next().pauseAllRequests();
        }
    }

    public synchronized void pauseRequests() {
        this.f38050q0.pauseRequests();
    }

    public synchronized void pauseRequestsRecursive() {
        pauseRequests();
        Iterator<RequestManager> it = this.f38051r0.getDescendants().iterator();
        while (it.hasNext()) {
            it.next().pauseRequests();
        }
    }

    public synchronized void resumeRequests() {
        this.f38050q0.resumeRequests();
    }

    public synchronized void resumeRequestsRecursive() {
        Util.assertMainThread();
        resumeRequests();
        Iterator<RequestManager> it = this.f38051r0.getDescendants().iterator();
        while (it.hasNext()) {
            it.next().resumeRequests();
        }
    }

    @NonNull
    public synchronized RequestManager setDefaultRequestOptions(@NonNull RequestOptions requestOptions) {
        setRequestOptions(requestOptions);
        return this;
    }

    public void setPauseAllRequestsOnTrimMemoryModerate(boolean z10) {
        this.f38056x0 = z10;
    }

    public synchronized void setRequestOptions(@NonNull RequestOptions requestOptions) {
        this.f38055w0 = requestOptions.mo4900clone().autoClone();
    }

    public synchronized String toString() {
        return super.toString() + "{tracker=" + this.f38050q0 + ", treeNode=" + this.f38051r0 + "}";
    }

    public void clear(@Nullable Target<?> target) {
        if (target == null) {
            return;
        }
        boolean zB = b(target);
        Request request = target.getRequest();
        if (zB) {
            return;
        }
        Glide glide = this.glide;
        synchronized (glide.f37982w0) {
            try {
                Iterator it = glide.f37982w0.iterator();
                while (it.hasNext()) {
                    if (((RequestManager) it.next()).b(target)) {
                    }
                }
                if (request != null) {
                    target.setRequest(null);
                    request.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // 
    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: load, reason: merged with bridge method [inline-methods] */
    public RequestBuilder<Drawable> mo4910load(@Nullable Bitmap bitmap) {
        return asDrawable().mo4901load(bitmap);
    }

    @Override // 
    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: load, reason: merged with bridge method [inline-methods] */
    public RequestBuilder<Drawable> mo4911load(@Nullable Drawable drawable) {
        return asDrawable().mo4902load(drawable);
    }

    @Override // 
    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: load, reason: merged with bridge method [inline-methods] */
    public RequestBuilder<Drawable> mo4916load(@Nullable String str) {
        return asDrawable().mo4907load(str);
    }

    @Override // 
    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: load, reason: merged with bridge method [inline-methods] */
    public RequestBuilder<Drawable> mo4912load(@Nullable Uri uri) {
        return asDrawable().mo4903load(uri);
    }

    @Override // 
    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: load, reason: merged with bridge method [inline-methods] */
    public RequestBuilder<Drawable> mo4913load(@Nullable File file) {
        return asDrawable().mo4904load(file);
    }

    @Override // 
    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: load, reason: merged with bridge method [inline-methods] */
    public RequestBuilder<Drawable> mo4914load(@Nullable @DrawableRes @RawRes Integer num) {
        return asDrawable().mo4905load(num);
    }

    @Override // 
    @CheckResult
    @Deprecated
    /* JADX INFO: renamed from: load, reason: merged with bridge method [inline-methods] */
    public RequestBuilder<Drawable> mo4917load(@Nullable URL url) {
        return asDrawable().mo4908load(url);
    }

    @Override // 
    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: load, reason: merged with bridge method [inline-methods] */
    public RequestBuilder<Drawable> mo4918load(@Nullable byte[] bArr) {
        return asDrawable().mo4909load(bArr);
    }

    @Override // 
    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: load, reason: merged with bridge method [inline-methods] */
    public RequestBuilder<Drawable> mo4915load(@Nullable Object obj) {
        return asDrawable().mo4906load(obj);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    public static class b extends CustomViewTarget<View, Object> {
        @Override // com.bumptech.glide.request.target.Target
        public final void onLoadFailed(@Nullable Drawable drawable) {
        }

        @Override // com.bumptech.glide.request.target.CustomViewTarget
        public final void onResourceCleared(@Nullable Drawable drawable) {
        }

        @Override // com.bumptech.glide.request.target.Target
        public final void onResourceReady(@NonNull Object obj, @Nullable Transition<? super Object> transition) {
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }
}
