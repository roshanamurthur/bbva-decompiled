package com.akamai.botman;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class ah {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ah f26299c = new ah();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakReference<Context> f26300a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f26301b = null;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ah ahVar = ah.this;
            ah ahVar2 = ah.f26299c;
            ap.a("SensorDataCache", "Initializing cache", new Throwable[0]);
            synchronized (ahVar) {
                Context context = ahVar.f26300a.get();
                if (context == null) {
                    ap.b("SensorDataCache", "loadData: Context is null", new Throwable[0]);
                } else {
                    ahVar.f26301b = context.getSharedPreferences("com.akamai.botman.preferences", 0).getString("sensor_data", null);
                }
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ah ahVar = ah.this;
            ah ahVar2 = ah.f26299c;
            synchronized (ahVar) {
                Context context = ahVar.f26300a.get();
                if (context == null) {
                    ap.b("SensorDataCache", "saveData: Context is null", new Throwable[0]);
                    return;
                }
                SharedPreferences.Editor editorEdit = context.getSharedPreferences("com.akamai.botman.preferences", 0).edit();
                editorEdit.putString("sensor_data", ahVar.f26301b);
                editorEdit.commit();
            }
        }
    }

    public static ah a() {
        return f26299c;
    }

    public final synchronized void b(String str) {
        Context context = this.f26300a.get();
        if (context == null) {
            ap.b("SensorDataCache", "saveServerSignal: Context is null", new Throwable[0]);
            return;
        }
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("com.akamai.botman.preferences", 0).edit();
        editorEdit.putString("ss_signal", str);
        editorEdit.commit();
    }

    public final void a(Context context) {
        this.f26300a = new WeakReference<>(context);
        new Thread(new a()).start();
    }

    public final synchronized void a(String str) {
        Context context = this.f26300a.get();
        if (context == null) {
            ap.b("SensorDataCache", "savePoWResponse: Context is null", new Throwable[0]);
            return;
        }
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("com.akamai.botman.preferences", 0).edit();
        editorEdit.putString("pow_response", str);
        editorEdit.commit();
    }
}
