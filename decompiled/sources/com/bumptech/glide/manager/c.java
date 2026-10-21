package com.bumptech.glide.manager;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Build;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.util.GlideSuppliers;
import com.bumptech.glide.util.Util;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: SingletonConnectivityReceiver.java */
/* JADX INFO: loaded from: classes9.dex */
public final class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile c f38712d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0178c f38713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @GuardedBy("this")
    public final HashSet f38714b = new HashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @GuardedBy("this")
    public boolean f38715c;

    /* JADX INFO: compiled from: SingletonConnectivityReceiver.java */
    public class a implements GlideSuppliers.GlideSupplier<ConnectivityManager> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f38716a;

        public a(Context context) {
            this.f38716a = context;
        }

        @Override // com.bumptech.glide.util.GlideSuppliers.GlideSupplier
        public final ConnectivityManager get() {
            return (ConnectivityManager) this.f38716a.getSystemService("connectivity");
        }
    }

    /* JADX INFO: compiled from: SingletonConnectivityReceiver.java */
    public class b implements ConnectivityMonitor.ConnectivityListener {
        public b() {
        }

        @Override // com.bumptech.glide.manager.ConnectivityMonitor.ConnectivityListener
        public final void onConnectivityChanged(boolean z10) {
            ArrayList arrayList;
            Util.assertMainThread();
            synchronized (c.this) {
                arrayList = new ArrayList(c.this.f38714b);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((ConnectivityMonitor.ConnectivityListener) it.next()).onConnectivityChanged(z10);
            }
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.manager.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: SingletonConnectivityReceiver.java */
    public interface InterfaceC0178c {
        boolean a();

        void unregister();
    }

    /* JADX INFO: compiled from: SingletonConnectivityReceiver.java */
    @RequiresApi(24)
    public static final class d implements InterfaceC0178c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f38718a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ConnectivityMonitor.ConnectivityListener f38719b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final GlideSuppliers.GlideSupplier<ConnectivityManager> f38720c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final a f38721d = new a();

        /* JADX INFO: compiled from: SingletonConnectivityReceiver.java */
        public class a extends ConnectivityManager.NetworkCallback {
            public a() {
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onAvailable(@NonNull Network network) {
                Util.postOnUiThread(new com.bumptech.glide.manager.d(this, true));
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onLost(@NonNull Network network) {
                Util.postOnUiThread(new com.bumptech.glide.manager.d(this, false));
            }
        }

        public d(GlideSuppliers.GlideSupplier glideSupplier, b bVar) {
            this.f38720c = glideSupplier;
            this.f38719b = bVar;
        }

        @Override // com.bumptech.glide.manager.c.InterfaceC0178c
        @SuppressLint({"MissingPermission"})
        public final boolean a() {
            GlideSuppliers.GlideSupplier<ConnectivityManager> glideSupplier = this.f38720c;
            this.f38718a = glideSupplier.get().getActiveNetwork() != null;
            try {
                glideSupplier.get().registerDefaultNetworkCallback(this.f38721d);
                return true;
            } catch (RuntimeException e5) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to register callback", e5);
                }
                return false;
            }
        }

        @Override // com.bumptech.glide.manager.c.InterfaceC0178c
        public final void unregister() {
            this.f38720c.get().unregisterNetworkCallback(this.f38721d);
        }
    }

    /* JADX INFO: compiled from: SingletonConnectivityReceiver.java */
    public static final class e implements InterfaceC0178c {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final Executor f38723g = AsyncTask.SERIAL_EXECUTOR;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f38724a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ConnectivityMonitor.ConnectivityListener f38725b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final GlideSuppliers.GlideSupplier<ConnectivityManager> f38726c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public volatile boolean f38727d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public volatile boolean f38728e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final a f38729f = new a();

        /* JADX INFO: compiled from: SingletonConnectivityReceiver.java */
        public class a extends BroadcastReceiver {
            public a() {
            }

            @Override // android.content.BroadcastReceiver
            public final void onReceive(@NonNull Context context, Intent intent) {
                e eVar = e.this;
                eVar.getClass();
                e.f38723g.execute(new com.bumptech.glide.manager.e(eVar));
            }
        }

        /* JADX INFO: compiled from: SingletonConnectivityReceiver.java */
        public class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                e eVar = e.this;
                eVar.f38727d = eVar.b();
                try {
                    e eVar2 = e.this;
                    eVar2.f38724a.registerReceiver(eVar2.f38729f, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                    e.this.f38728e = true;
                } catch (SecurityException e5) {
                    if (Log.isLoggable("ConnectivityMonitor", 5)) {
                        Log.w("ConnectivityMonitor", "Failed to register", e5);
                    }
                    e.this.f38728e = false;
                }
            }
        }

        /* JADX INFO: renamed from: com.bumptech.glide.manager.c$e$c, reason: collision with other inner class name */
        /* JADX INFO: compiled from: SingletonConnectivityReceiver.java */
        public class RunnableC0179c implements Runnable {
            public RunnableC0179c() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (e.this.f38728e) {
                    e.this.f38728e = false;
                    e eVar = e.this;
                    eVar.f38724a.unregisterReceiver(eVar.f38729f);
                }
            }
        }

        public e(Context context, GlideSuppliers.GlideSupplier glideSupplier, b bVar) {
            this.f38724a = context.getApplicationContext();
            this.f38726c = glideSupplier;
            this.f38725b = bVar;
        }

        @Override // com.bumptech.glide.manager.c.InterfaceC0178c
        public final boolean a() {
            f38723g.execute(new b());
            return true;
        }

        @SuppressLint({"MissingPermission"})
        public final boolean b() {
            try {
                NetworkInfo activeNetworkInfo = this.f38726c.get().getActiveNetworkInfo();
                return activeNetworkInfo != null && activeNetworkInfo.isConnected();
            } catch (RuntimeException e5) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to determine connectivity status when connectivity changed", e5);
                }
                return true;
            }
        }

        @Override // com.bumptech.glide.manager.c.InterfaceC0178c
        public final void unregister() {
            f38723g.execute(new RunnableC0179c());
        }
    }

    public c(@NonNull Context context) {
        GlideSuppliers.GlideSupplier glideSupplierMemorize = GlideSuppliers.memorize(new a(context));
        b bVar = new b();
        this.f38713a = Build.VERSION.SDK_INT >= 24 ? new d(glideSupplierMemorize, bVar) : new e(context, glideSupplierMemorize, bVar);
    }

    public static c a(@NonNull Context context) {
        if (f38712d == null) {
            synchronized (c.class) {
                try {
                    if (f38712d == null) {
                        f38712d = new c(context.getApplicationContext());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f38712d;
    }
}
