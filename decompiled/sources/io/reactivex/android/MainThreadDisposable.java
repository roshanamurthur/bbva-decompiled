package io.reactivex.android;

import android.os.Looper;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes7.dex */
public abstract class MainThreadDisposable implements Disposable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final AtomicBoolean f69877p0 = new AtomicBoolean();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            MainThreadDisposable.this.onDispose();
        }
    }

    public static void verifyMainThread() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        throw new IllegalStateException("Expected to be called on the main thread but was " + Thread.currentThread().getName());
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        if (this.f69877p0.compareAndSet(false, true)) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                onDispose();
            } else {
                AndroidSchedulers.mainThread().scheduleDirect(new a());
            }
        }
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.f69877p0.get();
    }

    public abstract void onDispose();
}
