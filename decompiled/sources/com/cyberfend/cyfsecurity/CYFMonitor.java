package com.cyberfend.cyfsecurity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.os.SystemClock;
import android.view.ViewGroup;
import androidx.datastore.preferences.protobuf.e;
import com.akamai.botman.ag;
import com.akamai.botman.ah;
import com.akamai.botman.ap;
import com.akamai.botman.b;
import com.akamai.botman.c;
import com.akamai.botman.k;
import com.cyberfend.cyfsecurity.SensorDataBuilder.a;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
@SuppressLint({"Registered"})
@Deprecated
public class CYFMonitor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static com.akamai.botman.CYFMonitor.CYFSDKInitCallback f39233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k f39234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f39235c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f39236d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f39237e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static String f39238f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static boolean f39239g;

    static {
        new Thread(SensorDataBuilder.a().new a()).start();
        f39234b = new k();
        f39235c = false;
        f39236d = false;
        f39237e = false;
        f39233a = null;
        f39238f = null;
        f39239g = false;
    }

    public static void a(boolean z10) {
        f39237e = z10;
    }

    public static void b(Application application, String str, Boolean bool) {
        if (f39236d) {
            return;
        }
        if (SensorDataBuilder.f39252a) {
            ap.a("CYFMonitor", "Load Library Failure", new Throwable[0]);
            com.akamai.botman.CYFMonitor.CYFSDKInitCallback cYFSDKInitCallback = f39233a;
            if (cYFSDKInitCallback != null) {
                cYFSDKInitCallback.onSDKInitFailure("Load Library Failure");
                return;
            }
            return;
        }
        k kVar = f39234b;
        kVar.a(0);
        long jUptimeMillis = SystemClock.uptimeMillis();
        ap.a("CYFMonitor", "Registering activity lifecycle callbacks", new Throwable[0]);
        ah.a().a(application);
        kVar.d(application);
        kVar.c(application);
        kVar.b(application);
        kVar.a(application);
        application.registerActivityLifecycleCallbacks(new c());
        f39236d = true;
        f39235c = true;
        f39238f = str;
        c(bool.booleanValue(), application);
        ap.a("CYFMonitor", e.f("Initialize-Time: ", SystemClock.uptimeMillis() - jUptimeMillis, "ms"), new Throwable[0]);
    }

    public static void c(boolean z10, Application application) {
        try {
            String str = f39238f;
            if (str == null || str.length() <= 0) {
                k kVar = f39234b;
                kVar.f26353f = false;
                kVar.i();
            } else {
                f39239g = true;
                int i10 = z10 ? 3 : 2;
                b.a();
                b.a(application, f39238f, i10, new a(z10, application));
            }
        } catch (Exception unused) {
            f39239g = false;
        }
    }

    public static HashMap<Integer, String> collectTestData() {
        try {
            k kVar = f39234b;
            HashMap<Integer, String> map = new HashMap<>();
            map.put(0, Long.toString(kVar.f26351d.f26263d));
            map.put(1, Integer.toString(kVar.f26351d.f26261b));
            map.put(2, Integer.toString(50));
            map.put(3, Integer.toString(kVar.f26351d.f26262c));
            map.put(4, Integer.toString(50));
            map.put(5, Long.toString(kVar.f26349b.b()));
            map.put(6, Integer.toString(0));
            map.put(7, Integer.toString(128));
            map.put(8, Long.toString(kVar.f26350c.b()));
            map.put(9, Integer.toString(0));
            map.put(10, Integer.toString(128));
            if (kVar.f26348a != null) {
                map.put(11, Long.toString(kVar.f26348a.f26387f));
                map.put(12, Integer.toString(kVar.f26348a.f26386e));
            } else {
                map.put(11, Integer.toString(0));
                map.put(12, Integer.toString(0));
            }
            map.put(13, Integer.toString(9));
            map.put(14, ag.f().f26277g);
            if (kVar.f26352e != null) {
                map.put(15, kVar.f26352e.f26338b.f26333c.booleanValue() ? "Enabled" : "Disabled");
                map.put(16, kVar.f26352e.b() != null ? "Dci" : "");
            }
            return map;
        } catch (Exception unused) {
            return null;
        }
    }

    public static synchronized void enableBackground() {
        k.b();
    }

    public static synchronized String getSensorData() {
        return f39234b.a();
    }

    public static synchronized void initialize(Application application) {
        b(application, "", Boolean.FALSE);
    }

    public static synchronized void initializeSDK(Application application, String str) {
        b(application, str, Boolean.FALSE);
    }

    public static synchronized void initializeSDKWithPow(Application application, String str) {
        b(application, str, Boolean.TRUE);
    }

    public static boolean isActivityVisible() {
        return f39237e;
    }

    public static void setLogLevel(int i10) {
        if ((i10 < 4 || i10 > 6) && i10 != 15) {
            ap.c("CYFMonitor", "Invalid log level specified in setLogLevel(), ignoring.", new Throwable[0]);
        } else {
            ap.f26309a.f26310b = i10;
        }
    }

    public static void setSDKInitCallBack(com.akamai.botman.CYFMonitor.CYFSDKInitCallback cYFSDKInitCallback) {
        f39233a = cYFSDKInitCallback;
    }

    @Deprecated
    public static synchronized void startCollectingSensorData(Activity activity) {
        if (f39235c) {
            return;
        }
        Application application = activity.getApplication();
        k kVar = f39234b;
        kVar.d(application);
        kVar.c(application);
        kVar.b(application);
        kVar.a(application);
        a(activity);
    }

    @Deprecated
    public static synchronized void stopCollectingSensorData() {
        if (f39235c) {
            return;
        }
        a();
    }

    public static void a(Activity activity) {
        try {
            ap.a("CYFMonitor", "Start collecting sensor data", new Throwable[0]);
            if (com.akamai.botman.e.f26326c == 0) {
                com.akamai.botman.e.f26326c = SystemClock.uptimeMillis();
            }
            if (com.akamai.botman.e.f26324a == 0) {
                com.akamai.botman.e.f26324a = System.currentTimeMillis();
            }
            k kVar = f39234b;
            kVar.e();
            kVar.c();
            if (k.a(activity.getWindow())) {
                return;
            }
            kVar.b(activity.getWindow());
            kVar.a((ViewGroup) activity.findViewById(android.R.id.content));
        } catch (Exception unused) {
        }
    }

    public static synchronized void initialize(Application application, String str) {
        b(application, str, Boolean.TRUE);
    }

    public static class a implements b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f39240a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Application f39241b;

        public a(boolean z10, Application application) {
            this.f39240a = z10;
            this.f39241b = application;
        }

        @Override // com.akamai.botman.b.a
        public final void a(JSONObject jSONObject) {
            String string;
            boolean z10 = this.f39240a;
            Application application = this.f39241b;
            if (z10) {
                ag.f().a(application, CYFMonitor.f39238f, jSONObject);
            }
            try {
                string = jSONObject.getString("serversidesignal");
            } catch (JSONException unused) {
                CYFMonitor.f39234b.a(3);
                string = null;
            }
            CYFMonitor.f39234b.a(application, CYFMonitor.f39238f, string);
            CYFMonitor.f39239g = false;
        }

        @Override // com.akamai.botman.b.a
        public final void a() {
            boolean z10 = this.f39240a;
            Application application = this.f39241b;
            if (z10) {
                ag.f().a(application, CYFMonitor.f39238f, null);
            }
            k kVar = CYFMonitor.f39234b;
            kVar.a(application, CYFMonitor.f39238f, null);
            kVar.a(2);
            CYFMonitor.f39239g = false;
        }
    }

    public static void a(Application application) {
        try {
            if (!f39234b.g().booleanValue() || f39239g) {
                return;
            }
            c(false, application);
        } catch (Exception unused) {
        }
    }

    public static void a() {
        try {
            ap.a("CYFMonitor", "Stop collecting sensor data", new Throwable[0]);
            k kVar = f39234b;
            kVar.f();
            kVar.d();
        } catch (Exception unused) {
        }
    }

    @Deprecated
    public static void setAccessSensorDataFromBackground(boolean z10) {
    }

    @Deprecated
    public static void setApiKey(String str) {
    }

    public static k b() {
        return f39234b;
    }
}
