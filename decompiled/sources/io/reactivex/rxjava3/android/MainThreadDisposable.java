package io.reactivex.rxjava3.android;

import android.os.Looper;
import androidx.compose.ui.platform.j;
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes12.dex */
public abstract class MainThreadDisposable implements Disposable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final AtomicBoolean f73935p0 = new AtomicBoolean();

    public static void verifyMainThread() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        throw new IllegalStateException("Expected to be called on the main thread but was " + Thread.currentThread().getName());
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        if (this.f73935p0.compareAndSet(false, true)) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                onDispose();
            } else {
                AndroidSchedulers.mainThread().scheduleDirect(new j(this, 9));
            }
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return this.f73935p0.get();
    }

    public abstract void onDispose();
}
