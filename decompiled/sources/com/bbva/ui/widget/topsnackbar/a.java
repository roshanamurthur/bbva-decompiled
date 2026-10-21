package com.bbva.ui.widget.topsnackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: SnackbarManager.java */
/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static a f37764e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f37765a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f37766b = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: mc.a
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            com.bbva.ui.widget.topsnackbar.a aVar = this.f83388a;
            aVar.getClass();
            if (message.what != 0) {
                return false;
            }
            com.bbva.ui.widget.topsnackbar.a.b bVar = (com.bbva.ui.widget.topsnackbar.a.b) message.obj;
            synchronized (aVar.f37765a) {
                try {
                    if (aVar.f37767c == bVar || aVar.f37768d == bVar) {
                        com.bbva.ui.widget.topsnackbar.a.a(bVar, 2);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return true;
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f37767c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b f37768d;

    /* JADX INFO: renamed from: com.bbva.ui.widget.topsnackbar.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: SnackbarManager.java */
    public interface InterfaceC0168a {
        void a(int i10);

        void show();
    }

    /* JADX INFO: compiled from: SnackbarManager.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WeakReference<InterfaceC0168a> f37769a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f37770b;

        public b(int i10, TSnackbar.a aVar) {
            this.f37769a = new WeakReference<>(aVar);
            this.f37770b = i10;
        }
    }

    public static boolean a(b bVar, int i10) {
        InterfaceC0168a interfaceC0168a = bVar.f37769a.get();
        if (interfaceC0168a == null) {
            return false;
        }
        interfaceC0168a.a(i10);
        return true;
    }

    public static a c() {
        if (f37764e == null) {
            f37764e = new a();
        }
        return f37764e;
    }

    public final void b(TSnackbar.a aVar) {
        synchronized (this.f37765a) {
            try {
                if (d(aVar)) {
                    this.f37766b.removeCallbacksAndMessages(this.f37767c);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean d(TSnackbar.a aVar) {
        b bVar = this.f37767c;
        return (bVar == null || aVar == null || bVar.f37769a.get() != aVar) ? false : true;
    }

    public final void e(b bVar) {
        int i10 = bVar.f37770b;
        if (i10 == -2) {
            return;
        }
        if (i10 <= 0) {
            i10 = i10 == -1 ? 1500 : 2750;
        }
        Handler handler = this.f37766b;
        handler.removeCallbacksAndMessages(bVar);
        handler.sendMessageDelayed(Message.obtain(handler, 0, bVar), i10);
    }
}
