package com.bumptech.glide.request;

import ad.d;
import android.graphics.drawable.Drawable;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bbva.tohu.android.product.valkyria.sdk.constants.NotifyProvisionResult;
import com.bbva.tohu.android.product.valkyria.sdk.constants.SdkDigitizeStatus;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.target.SizeReadyCallback;
import com.bumptech.glide.request.target.Target;
import com.bumptech.glide.request.transition.Transition;
import com.bumptech.glide.util.Util;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes9.dex */
public class RequestFutureTarget<R> implements FutureTarget<R>, RequestListener<R> {
    public static final a E0 = new a();

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final int f38771p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f38772q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final boolean f38773r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final a f38774s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @Nullable
    @GuardedBy("this")
    public R f38775t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @Nullable
    @GuardedBy("this")
    public Request f38776u0;

    @GuardedBy("this")
    public boolean v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    @GuardedBy("this")
    public boolean f38777w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    @GuardedBy("this")
    public boolean f38778x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    @Nullable
    @GuardedBy("this")
    public GlideException f38779y0;

    @VisibleForTesting
    public static class a {
    }

    public RequestFutureTarget(int i10, int i11) {
        a aVar = E0;
        this.f38771p0 = i10;
        this.f38772q0 = i11;
        this.f38773r0 = true;
        this.f38774s0 = aVar;
    }

    public final synchronized R a(Long l6) throws ExecutionException, InterruptedException, TimeoutException {
        try {
            if (this.f38773r0 && !isDone()) {
                Util.assertBackgroundThread();
            }
            if (this.v0) {
                throw new CancellationException();
            }
            if (this.f38778x0) {
                throw new ExecutionException(this.f38779y0);
            }
            if (this.f38777w0) {
                return this.f38775t0;
            }
            if (l6 == null) {
                this.f38774s0.getClass();
                wait(0L);
            } else if (l6.longValue() > 0) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                long jLongValue = l6.longValue() + jCurrentTimeMillis;
                while (!isDone() && jCurrentTimeMillis < jLongValue) {
                    this.f38774s0.getClass();
                    wait(jLongValue - jCurrentTimeMillis);
                    jCurrentTimeMillis = System.currentTimeMillis();
                }
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            if (this.f38778x0) {
                throw new ExecutionException(this.f38779y0);
            }
            if (this.v0) {
                throw new CancellationException();
            }
            if (!this.f38777w0) {
                throw new TimeoutException();
            }
            return this.f38775t0;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        synchronized (this) {
            try {
                if (isDone()) {
                    return false;
                }
                this.v0 = true;
                this.f38774s0.getClass();
                notifyAll();
                Request request = null;
                if (z10) {
                    Request request2 = this.f38776u0;
                    this.f38776u0 = null;
                    request = request2;
                }
                if (request != null) {
                    request.clear();
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.util.concurrent.Future
    public R get() throws ExecutionException, InterruptedException {
        try {
            return a(null);
        } catch (TimeoutException e5) {
            throw new AssertionError(e5);
        }
    }

    @Override // com.bumptech.glide.request.target.Target
    @Nullable
    public synchronized Request getRequest() {
        return this.f38776u0;
    }

    @Override // com.bumptech.glide.request.target.Target
    public void getSize(@NonNull SizeReadyCallback sizeReadyCallback) {
        sizeReadyCallback.onSizeReady(this.f38771p0, this.f38772q0);
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean isCancelled() {
        return this.v0;
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean isDone() {
        return this.v0 || this.f38777w0 || this.f38778x0;
    }

    @Override // com.bumptech.glide.request.target.Target
    public synchronized void onLoadFailed(@Nullable Drawable drawable) {
    }

    @Override // com.bumptech.glide.request.target.Target
    public synchronized void onResourceReady(@NonNull R r3, @Nullable Transition<? super R> transition) {
    }

    @Override // com.bumptech.glide.request.target.Target
    public synchronized void setRequest(@Nullable Request request) {
        this.f38776u0 = request;
    }

    public String toString() {
        Request request;
        String str;
        String strF = d.f(new StringBuilder(), super.toString(), "[status=");
        synchronized (this) {
            try {
                request = null;
                if (this.v0) {
                    str = "CANCELLED";
                } else if (this.f38778x0) {
                    str = "FAILURE";
                } else if (this.f38777w0) {
                    str = NotifyProvisionResult.SUCCESS_RESULT;
                } else {
                    str = SdkDigitizeStatus.PENDING;
                    request = this.f38776u0;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (request == null) {
            return androidx.camera.core.impl.utils.a.b(strF, str, Constant.BRACKET_CLOSE);
        }
        return strF + str + ", request=[" + request + "]]";
    }

    @Override // com.bumptech.glide.request.RequestListener
    public synchronized boolean onLoadFailed(@Nullable GlideException glideException, Object obj, @NonNull Target<R> target, boolean z10) {
        this.f38778x0 = true;
        this.f38779y0 = glideException;
        this.f38774s0.getClass();
        notifyAll();
        return false;
    }

    @Override // com.bumptech.glide.request.RequestListener
    public synchronized boolean onResourceReady(@NonNull R r3, @NonNull Object obj, Target<R> target, @NonNull DataSource dataSource, boolean z10) {
        this.f38777w0 = true;
        this.f38775t0 = r3;
        this.f38774s0.getClass();
        notifyAll();
        return false;
    }

    @Override // java.util.concurrent.Future
    public R get(long j10, @NonNull TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return a(Long.valueOf(timeUnit.toMillis(j10)));
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
    public void onLoadStarted(@Nullable Drawable drawable) {
    }

    @Override // com.bumptech.glide.request.target.Target
    public void removeCallback(@NonNull SizeReadyCallback sizeReadyCallback) {
    }
}
