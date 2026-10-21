package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: SnackbarManager.java */
/* JADX INFO: loaded from: classes10.dex */
public final class m {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static m f45472e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final Object f45473a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final Handler f45474b = new Handler(Looper.getMainLooper(), new a());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public c f45475c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public c f45476d;

    /* JADX INFO: compiled from: SnackbarManager.java */
    public class a implements Handler.Callback {
        public a() {
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(@NonNull Message message) {
            if (message.what != 0) {
                return false;
            }
            m mVar = m.this;
            c cVar = (c) message.obj;
            synchronized (mVar.f45473a) {
                try {
                    if (mVar.f45475c == cVar || mVar.f45476d == cVar) {
                        mVar.a(cVar, 2);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return true;
        }
    }

    /* JADX INFO: compiled from: SnackbarManager.java */
    public interface b {
        void a(int i10);

        void show();
    }

    /* JADX INFO: compiled from: SnackbarManager.java */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public final WeakReference<b> f45478a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f45479b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f45480c;

        public c(int i10, BaseTransientBottomBar.e eVar) {
            this.f45478a = new WeakReference<>(eVar);
            this.f45479b = i10;
        }
    }

    public static m b() {
        if (f45472e == null) {
            f45472e = new m();
        }
        return f45472e;
    }

    public final boolean a(@NonNull c cVar, int i10) {
        b bVar = cVar.f45478a.get();
        if (bVar == null) {
            return false;
        }
        this.f45474b.removeCallbacksAndMessages(cVar);
        bVar.a(i10);
        return true;
    }

    public final boolean c(BaseTransientBottomBar.e eVar) {
        c cVar = this.f45475c;
        return (cVar == null || eVar == null || cVar.f45478a.get() != eVar) ? false : true;
    }

    public final void d(BaseTransientBottomBar.e eVar) {
        synchronized (this.f45473a) {
            try {
                if (c(eVar)) {
                    c cVar = this.f45475c;
                    if (!cVar.f45480c) {
                        cVar.f45480c = true;
                        this.f45474b.removeCallbacksAndMessages(cVar);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void e(BaseTransientBottomBar.e eVar) {
        synchronized (this.f45473a) {
            try {
                if (c(eVar)) {
                    c cVar = this.f45475c;
                    if (cVar.f45480c) {
                        cVar.f45480c = false;
                        f(cVar);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void f(@NonNull c cVar) {
        int i10 = cVar.f45479b;
        if (i10 == -2) {
            return;
        }
        if (i10 <= 0) {
            i10 = i10 == -1 ? 1500 : 2750;
        }
        Handler handler = this.f45474b;
        handler.removeCallbacksAndMessages(cVar);
        handler.sendMessageDelayed(Message.obtain(handler, 0, cVar), i10);
    }
}
