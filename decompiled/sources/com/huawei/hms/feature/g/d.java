package com.huawei.hms.feature.g;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.text.TextUtils;
import com.huawei.hms.feature.model.CommonInstallException;
import com.huawei.hms.feature.tasks.FeatureTaskHolder;
import com.huawei.hms.feature.utils.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class d<T extends IInterface> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f50314a = "LocalApk-d";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f50315b = "com.huawei.hwouc.cloudrom.CloudRomExtService";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f50316c = "com.huawei.appgallery.dynamiccore.service.DynamicCoreService";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Map<String, Handler> f50317d = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Context f50318e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f50319f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Intent f50322i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private com.huawei.hms.feature.g.c<T> f50323j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ServiceConnection f50325l;
    private T m;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List<e> f50320g = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private IBinder.DeathRecipient f50324k = new a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f50321h = false;

    public class a implements IBinder.DeathRecipient {
        public a() {
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            d.this.m = null;
            d.this.f50325l = null;
        }
    }

    public class b extends e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ e f50327b;

        public b(e eVar) {
            this.f50327b = eVar;
        }

        @Override // com.huawei.hms.feature.g.e
        public void a() {
            d.this.c(this.f50327b);
        }
    }

    public class c extends e {
        public c() {
        }

        @Override // com.huawei.hms.feature.g.e
        public void a() {
            if (d.this.m != null) {
                Logger.i(d.f50314a, "forget");
                d.this.f50318e.unbindService(d.this.f50325l);
                d.this.f50321h = false;
                d.this.m = null;
                d.this.f50325l = null;
            }
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.feature.g.d$d, reason: collision with other inner class name */
    public class ServiceConnectionC0224d implements ServiceConnection {

        /* JADX INFO: renamed from: com.huawei.hms.feature.g.d$d$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ IBinder f50331a;

            public a(IBinder iBinder) {
                this.f50331a = iBinder;
            }

            @Override // java.lang.Runnable
            public void run() {
                d dVar = d.this;
                dVar.m = (IInterface) dVar.f50323j.a(this.f50331a);
                d.this.e();
                d.this.f50321h = false;
                Iterator it = d.this.f50320g.iterator();
                while (it.hasNext()) {
                    ((e) it.next()).run();
                }
                d.this.f50320g.clear();
            }
        }

        public ServiceConnectionC0224d() {
        }

        @Override // android.content.ServiceConnection
        public void onBindingDied(ComponentName componentName) {
            Logger.w(d.f50314a, "onBindingDied");
            try {
                d.this.f50318e.unbindService(this);
                d.this.f50321h = false;
                d.this.m = null;
            } catch (Exception unused) {
                Logger.w(d.f50314a, "onBindingDied exception");
            }
        }

        @Override // android.content.ServiceConnection
        public void onNullBinding(ComponentName componentName) {
            Logger.w(d.f50314a, "onNullBinding");
            try {
                d.this.f50318e.unbindService(this);
                d.this.f50321h = false;
                d.this.m = null;
            } catch (Exception unused) {
                Logger.w(d.f50314a, "onNullBinding exception");
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            Logger.i(d.f50314a, "onServiceConnected");
            if (d.this.a(componentName)) {
                Logger.i(d.f50314a, "onServiceConnected successed , check permission successed");
                d.this.d().post(new a(iBinder));
            } else {
                Logger.w(d.f50314a, "onServiceConnected successed,but check permission failed ,componentName : " + componentName);
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            Logger.w(d.f50314a, "onServiceDisconnected");
            d.this.g();
            d.this.m = null;
            d.this.f50321h = false;
        }
    }

    public d(Context context, String str, Intent intent, com.huawei.hms.feature.g.c<T> cVar) {
        this.f50318e = context;
        this.f50319f = str;
        this.f50322i = intent;
        this.f50323j = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Handler d() {
        Handler handler;
        Map<String, Handler> map = f50317d;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f50319f)) {
                    HandlerThread handlerThread = new HandlerThread(this.f50319f, 10);
                    handlerThread.start();
                    map.put(this.f50319f, new Handler(handlerThread.getLooper()));
                }
                handler = map.get(this.f50319f);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        String str;
        String str2;
        Logger.i(f50314a, "begin unlinking to death");
        try {
            this.m.asBinder().unlinkToDeath(this.f50324k, 0);
        } catch (NullPointerException unused) {
            str = f50314a;
            str2 = "unlink to death NullPointer Exception ";
            Logger.w(str, str2);
        } catch (Exception unused2) {
            str = f50314a;
            str2 = "unlink to death exception";
            Logger.w(str, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        Logger.i(f50314a, "begin linking to death...");
        try {
            this.m.asBinder().linkToDeath(this.f50324k, 0);
        } catch (RemoteException unused) {
            Logger.w(f50314a, "Linking to death failed");
        }
    }

    private void f() {
        this.f50321h = false;
        Logger.w(f50314a, "Failed binding to the service.begin notify fail");
        Iterator<e> it = this.f50320g.iterator();
        while (it.hasNext()) {
            FeatureTaskHolder<?> featureTaskHolderB = it.next().b();
            if (featureTaskHolderB != null) {
                featureTaskHolderB.notifyFailure(new CommonInstallException());
            }
        }
        this.f50320g.clear();
    }

    public final void b() {
        a((Runnable) new c());
    }

    public final T c() {
        return this.m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(e eVar) {
        if (this.f50321h) {
            Logger.i(f50314a, "Waiting to bind to the service.");
            this.f50320g.add(eVar);
        } else if (this.m != null) {
            eVar.run();
        } else {
            a(eVar);
        }
    }

    public final void b(e eVar) {
        Logger.i(f50314a, "fire");
        a((Runnable) new b(eVar));
    }

    private void a(e eVar) {
        String str = f50314a;
        Logger.i(str, "Begin binding to the service.");
        this.f50321h = true;
        this.f50320g.add(eVar);
        ServiceConnectionC0224d serviceConnectionC0224d = new ServiceConnectionC0224d();
        this.f50325l = serviceConnectionC0224d;
        if (this.f50318e.bindService(this.f50322i, serviceConnectionC0224d, 1)) {
            Logger.i(str, "Binding to the service  success");
        } else {
            f();
        }
    }

    private void a(Runnable runnable) {
        d().post(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(ComponentName componentName) {
        return (TextUtils.equals(componentName.getPackageName(), com.huawei.hms.feature.g.b.d()) && TextUtils.equals(componentName.getClassName(), f50316c)) || (TextUtils.equals(componentName.getPackageName(), com.huawei.hms.feature.model.a.f50429e) && TextUtils.equals(componentName.getClassName(), f50315b));
    }
}
