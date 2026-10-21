package com.akamai.botman;

import android.app.Application;
import android.content.Context;
import android.os.SystemClock;
import b4.p;
import com.bbva.tohu.android.product.valkyria.sdk.logic.ReplenishLogic;
import com.noknok.android.client.appsdk_plus.IAppSDKPlus;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ag {
    public static final Locale A = Locale.US;
    public static final ag B = new ag();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f26273c;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f26278h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f26279i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f26280j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f26281k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f26282l;
    public long m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f26283n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f26284o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f26285p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f26286q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f26287r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f26288s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f26289t;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f26276f = -1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ArrayList<String> f26290u = new ArrayList<>();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ArrayList<Long> f26291v = new ArrayList<>();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ArrayList<Integer> f26292w = new ArrayList<>();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f26293x = "";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f26294y = "";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f26295z = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f26277g = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f26274d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f26275e = 0;

    public class a extends TimerTask {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ int f26296p0;

        /* JADX INFO: renamed from: com.akamai.botman.ag$a$a, reason: collision with other inner class name */
        public class RunnableC0119a implements Runnable {
            public RunnableC0119a() {
            }

            /* JADX WARN: Code duplicated, block: B:42:0x00cc A[PHI: r4
              0x00cc: PHI (r4v4 java.net.HttpURLConnection) = (r4v3 java.net.HttpURLConnection), (r4v5 java.net.HttpURLConnection) binds: [B:41:0x00ca, B:44:0x00e9] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:59:0x0118  */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                HttpURLConnection httpURLConnection;
                boolean zBooleanValue;
                a aVar = a.this;
                ag agVar = ag.this;
                int i10 = aVar.f26296p0;
                Locale locale = ag.A;
                synchronized (agVar) {
                    try {
                        int i11 = agVar.f26274d;
                        if (i11 != 0) {
                            if (i11 == 2) {
                                agVar.e();
                            }
                            return;
                        }
                        agVar.f26274d = 1;
                        ap.a("PoW", "Getting PoW Parameters from Akamai...\"", new Throwable[0]);
                        HttpsURLConnection httpsURLConnection = 0;
                        jSONObject = null;
                        JSONObject jSONObject = null;
                        try {
                            try {
                                httpURLConnection = (HttpURLConnection) new URL(agVar.g()).openConnection();
                                try {
                                    httpURLConnection.setReadTimeout(10000);
                                    httpURLConnection.setConnectTimeout(15000);
                                    httpURLConnection.setRequestMethod("GET");
                                    httpURLConnection.setUseCaches(false);
                                    httpURLConnection.setRequestProperty("User-Agent", p.c());
                                    int responseCode = httpURLConnection.getResponseCode();
                                    if (responseCode != 200) {
                                        ap.c("PoW", "Failed to get PoW Params, HTTP response code: ".concat(String.valueOf(responseCode)), new Throwable[0]);
                                        zBooleanValue = false;
                                    } else {
                                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                                        StringBuffer stringBuffer = new StringBuffer();
                                        while (true) {
                                            String line = bufferedReader.readLine();
                                            if (line == null) {
                                                break;
                                            } else {
                                                stringBuffer.append(line);
                                            }
                                        }
                                        bufferedReader.close();
                                        jSONObject = new JSONObject(stringBuffer.toString());
                                        zBooleanValue = true;
                                    }
                                    httpURLConnection.disconnect();
                                } catch (JSONException e5) {
                                    e = e5;
                                    ap.c("PoW", "JSONException:" + e.toString(), new Throwable[0]);
                                    if (httpURLConnection != null) {
                                        httpURLConnection.disconnect();
                                    }
                                    zBooleanValue = false;
                                } catch (Exception e7) {
                                    e = e7;
                                    ap.c("PoW", "Exception:" + e.toString(), new Throwable[0]);
                                    e.printStackTrace();
                                    if (httpURLConnection != null) {
                                        httpURLConnection.disconnect();
                                    }
                                    zBooleanValue = false;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                httpsURLConnection = "Getting PoW Parameters from Akamai...\"";
                                if (httpsURLConnection != 0) {
                                    httpsURLConnection.disconnect();
                                }
                                throw th;
                            }
                        } catch (JSONException e10) {
                            e = e10;
                            httpURLConnection = null;
                        } catch (Exception e11) {
                            e = e11;
                            httpURLConnection = null;
                        } catch (Throwable th3) {
                            th = th3;
                            if (httpsURLConnection != 0) {
                                httpsURLConnection.disconnect();
                            }
                            throw th;
                        }
                        if (jSONObject != null) {
                            zBooleanValue = agVar.a(jSONObject, i10).booleanValue();
                        }
                        if (zBooleanValue) {
                            return;
                        }
                        agVar.a("Get Params error");
                        if (i10 == 1) {
                            agVar.d(0);
                            return;
                        }
                        int i12 = agVar.f26275e;
                        if (i12 < 10) {
                            agVar.f26275e = i12 + 1;
                            agVar.a(5000L, i10);
                        }
                        agVar.d(0);
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
            }
        }

        public a(int i10) {
            this.f26296p0 = i10;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            new Thread(new RunnableC0119a()).start();
        }
    }

    public static ag f() {
        return B;
    }

    public void a(int i10) {
    }

    public final void b() {
        this.f26287r = 0;
        this.f26288s = 0;
        this.f26290u = new ArrayList<>();
        this.f26291v = new ArrayList<>();
        this.f26292w = new ArrayList<>();
        e();
    }

    public final void c() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f26293x);
        sb2.append(ReplenishLogic.ID_SEPARATOR);
        Iterator<String> it = this.f26290u.iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            sb2.append(",");
        }
        sb2.deleteCharAt(sb2.length() - 1);
        sb2.append(ReplenishLogic.ID_SEPARATOR);
        Iterator<Long> it2 = this.f26291v.iterator();
        while (it2.hasNext()) {
            sb2.append(it2.next());
            sb2.append(",");
        }
        sb2.deleteCharAt(sb2.length() - 1);
        sb2.append(ReplenishLogic.ID_SEPARATOR);
        Iterator<Integer> it3 = this.f26292w.iterator();
        while (it3.hasNext()) {
            sb2.append(it3.next());
            sb2.append(",");
        }
        sb2.deleteCharAt(sb2.length() - 1);
        synchronized (this) {
            this.f26294y = sb2.toString();
            this.f26295z = 0;
        }
        ap.a("PoW", "PoW Data: " + this.f26294y, new Throwable[0]);
        long jUptimeMillis = SystemClock.uptimeMillis() - this.f26285p;
        ap.a("PoW", androidx.datastore.preferences.protobuf.e.f("Time taken to solve PoW challenge: ", jUptimeMillis, "ms"), new Throwable[0]);
        this.f26277g = androidx.datastore.preferences.protobuf.e.f("Solved in ", jUptimeMillis, "ms");
    }

    public final void d(int i10) {
        synchronized (this) {
            this.f26274d = i10;
        }
    }

    public String g() {
        return ad.d.f(new StringBuilder(), this.f26273c, "/_bm/get_params?type=sdk-pow");
    }

    public final synchronized String h() {
        if (this.f26276f == 0) {
            return "";
        }
        if (this.f26294y.length() != 0) {
            int i10 = this.f26295z + 1;
            this.f26295z = i10;
            if (i10 >= this.f26282l * 0.9d) {
                a(100L, 0);
            }
            return this.f26294y;
        }
        if (this.f26293x.length() != 0) {
            return this.f26293x;
        }
        Context context = ah.a().f26300a.get();
        if (context == null) {
            ap.b("SensorDataCache", "getPoWResponse: Context is null", new Throwable[0]);
        } else {
            String string = context.getSharedPreferences("com.akamai.botman.preferences", 0).getString("pow_response", null);
            if (string != null) {
                return string;
            }
        }
        return "";
    }

    public void a(Application application, String str, JSONObject jSONObject) {
        a(application, str);
        if (jSONObject == null) {
            a(1000L, 0);
        } else {
            a(jSONObject, 0);
        }
    }

    public void d() {
        ah.a().a(this.f26294y);
    }

    public final void a(long j10, int i10) {
        new Timer().schedule(new a(i10), j10);
    }

    public final void a(Application application, String str) {
        this.f26273c = str;
        this.f26284o = p.d(application);
    }

    public final Boolean a(JSONObject jSONObject, int i10) {
        try {
            this.f26276f = jSONObject.getInt("mode");
            this.f26278h = jSONObject.getString(IAppSDKPlus.EXTRA_KEY_NONCE);
            this.f26279i = jSONObject.getLong("ttl");
            this.f26280j = jSONObject.getLong("difficulty");
            this.f26281k = jSONObject.getLong("timeout");
            if (i10 == 0) {
                this.f26282l = jSONObject.getLong("n");
            }
            this.m = jSONObject.getLong("s_timeout");
            this.f26283n = jSONObject.getString("checksum");
            if (this.f26276f != 0) {
                this.f26277g = "Enabled";
                this.f26275e = 0;
                this.f26285p = SystemClock.uptimeMillis();
                this.f26286q = this.f26284o + this.f26285p + this.f26278h;
                this.f26293x = this.f26284o + ReplenishLogic.ID_SEPARATOR + this.f26285p + ReplenishLogic.ID_SEPARATOR + this.f26278h + ReplenishLogic.ID_SEPARATOR + this.f26280j + ReplenishLogic.ID_SEPARATOR + this.f26283n;
                this.f26289t = SystemClock.uptimeMillis();
                this.f26287r = 0;
                if (this.f26274d == 2) {
                    ap.b("PoW", "Cancel Get Params", new Throwable[0]);
                    e();
                    return Boolean.TRUE;
                }
                new Timer().schedule(new b4.c(this, i10), 100L);
            } else {
                d(0);
                this.f26277g = "Disabled";
            }
            if (i10 == 0) {
                a(this.f26279i * 1000, i10);
            }
            return Boolean.TRUE;
        } catch (Exception e5) {
            ap.c("PoW", "Exception:".concat(String.valueOf(e5)), new Throwable[0]);
            e5.printStackTrace();
            return Boolean.FALSE;
        }
    }

    public void e() {
    }

    public void a(String str) {
        ap.c("PoW", "Error: ".concat(String.valueOf(str)), new Throwable[0]);
    }
}
