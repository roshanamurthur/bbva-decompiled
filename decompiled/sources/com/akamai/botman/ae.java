package com.akamai.botman;

import android.app.Application;
import b4.p;
import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import com.bbva.notifications.model.constants.BanxicoConstants;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLEncoder;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ae extends ag {
    public static final ae G = new ae();
    public String C;
    public String D;
    public long E = System.currentTimeMillis();
    public String F = "";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f26270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f26271b;

    public class a implements Runnable {
        public a() {
        }

        /* JADX WARN: Code duplicated, block: B:59:0x014d A[PHI: r2 r7
          0x014d: PHI (r2v9 boolean) = (r2v6 boolean), (r2v7 boolean), (r2v8 boolean), (r2v11 boolean) binds: [B:58:0x014b, B:63:0x0164, B:66:0x0177, B:68:0x0188] A[DONT_GENERATE, DONT_INLINE]
          0x014d: PHI (r7v10 java.net.HttpURLConnection) = 
          (r7v7 java.net.HttpURLConnection)
          (r7v8 java.net.HttpURLConnection)
          (r7v9 java.net.HttpURLConnection)
          (r7v12 java.net.HttpURLConnection)
         binds: [B:58:0x014b, B:63:0x0164, B:66:0x0177, B:68:0x0188] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:63:0x0164  */
        /* JADX WARN: Code duplicated, block: B:66:0x0177  */
        /* JADX WARN: Code duplicated, block: B:72:0x018f A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:73:0x0191  */
        /* JADX WARN: Code duplicated, block: B:74:0x0197  */
        @Override // java.lang.Runnable
        public final void run() throws Throwable {
            boolean z10;
            boolean z11;
            ae aeVar = ae.this;
            String str = aeVar.f26294y;
            ae aeVar2 = ae.G;
            aeVar.d(3);
            HttpURLConnection httpURLConnection = null;
            try {
                try {
                    HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(ad.d.f(new StringBuilder(), aeVar.f26273c, "/_sec/cp_challenge/verify")).openConnection();
                    try {
                        try {
                            httpURLConnection2.setReadTimeout(10000);
                            httpURLConnection2.setConnectTimeout(15000);
                            httpURLConnection2.setRequestMethod("POST");
                            httpURLConnection2.setUseCaches(false);
                            httpURLConnection2.setRequestProperty(DigipassManagerConstants.KEY_CONTENT_TYPE, "application/json");
                            httpURLConnection2.setRequestProperty("User-Agent", p.c());
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("pow_response", str);
                            jSONObject.put("context", aeVar.f26271b);
                            DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection2.getOutputStream());
                            dataOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
                            dataOutputStream.flush();
                            dataOutputStream.close();
                            if (httpURLConnection2.getResponseCode() == 200) {
                                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection2.getInputStream()));
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
                                JSONObject jSONObject2 = new JSONObject(stringBuffer.toString());
                                z11 = jSONObject2.getBoolean("success");
                                try {
                                    if (aeVar.f26274d == 3) {
                                        if (z11) {
                                            aeVar.C = jSONObject2.getString("token");
                                            aeVar.E = (aeVar.f26279i * 1000) + System.currentTimeMillis();
                                        } else if (jSONObject2.has(BanxicoConstants.KEY_HISTORICAL_PAYLOAD)) {
                                            aeVar.F = jSONObject2.getString(BanxicoConstants.KEY_HISTORICAL_PAYLOAD);
                                            aeVar.f26270a.a(0.0f);
                                            aeVar.d(0);
                                            aeVar.a(100L, 1);
                                        }
                                        httpURLConnection2.disconnect();
                                        if (aeVar.f26274d == 3) {
                                            if (z11) {
                                                aeVar.f26270a.b();
                                            } else {
                                                aeVar.f26270a.a(aeVar.D);
                                            }
                                            aeVar.d(0);
                                        }
                                        aeVar.f26270a.a();
                                    }
                                    ap.b("ae", "Cancel Verify", new Throwable[0]);
                                    aeVar.f26270a.a();
                                    httpURLConnection2.disconnect();
                                    return;
                                } catch (MalformedURLException e5) {
                                    e = e5;
                                    z10 = z11;
                                    httpURLConnection = httpURLConnection2;
                                    ap.c("ae", e.toString(), new Throwable[0]);
                                    aeVar.D = "MalformedURLException";
                                    e.printStackTrace();
                                    if (httpURLConnection != null) {
                                        httpURLConnection.disconnect();
                                    }
                                    z11 = z10;
                                } catch (ProtocolException e7) {
                                    e = e7;
                                    z10 = z11;
                                    httpURLConnection = httpURLConnection2;
                                    ap.c("ae", e.toString(), new Throwable[0]);
                                    aeVar.D = "ProtocolException";
                                    e.printStackTrace();
                                    if (httpURLConnection != null) {
                                        httpURLConnection.disconnect();
                                    }
                                    z11 = z10;
                                } catch (IOException e10) {
                                    e = e10;
                                    z10 = z11;
                                    httpURLConnection = httpURLConnection2;
                                    ap.c("ae", e.toString(), new Throwable[0]);
                                    aeVar.D = "IOException";
                                    e.printStackTrace();
                                    if (httpURLConnection != null) {
                                        httpURLConnection.disconnect();
                                    }
                                    z11 = z10;
                                } catch (JSONException e11) {
                                    e = e11;
                                    z10 = z11;
                                    httpURLConnection = httpURLConnection2;
                                    ap.c("ae", e.toString(), new Throwable[0]);
                                    aeVar.D = "JSONException";
                                    e.printStackTrace();
                                    if (httpURLConnection != null) {
                                        httpURLConnection.disconnect();
                                    }
                                    z11 = z10;
                                }
                            } else {
                                aeVar.D = httpURLConnection2.getResponseMessage();
                            }
                            z11 = false;
                            httpURLConnection2.disconnect();
                        } catch (Throwable th2) {
                            th = th2;
                            httpURLConnection = httpURLConnection2;
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            throw th;
                        }
                    } catch (MalformedURLException e12) {
                        e = e12;
                        httpURLConnection = httpURLConnection2;
                        z10 = false;
                        ap.c("ae", e.toString(), new Throwable[0]);
                        aeVar.D = "MalformedURLException";
                        e.printStackTrace();
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        z11 = z10;
                        if (aeVar.f26274d == 3) {
                            if (z11) {
                                aeVar.f26270a.b();
                            } else {
                                aeVar.f26270a.a(aeVar.D);
                            }
                            aeVar.d(0);
                        }
                        aeVar.f26270a.a();
                    } catch (ProtocolException e13) {
                        e = e13;
                        httpURLConnection = httpURLConnection2;
                        z10 = false;
                        ap.c("ae", e.toString(), new Throwable[0]);
                        aeVar.D = "ProtocolException";
                        e.printStackTrace();
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        z11 = z10;
                        if (aeVar.f26274d == 3) {
                            if (z11) {
                                aeVar.f26270a.b();
                            } else {
                                aeVar.f26270a.a(aeVar.D);
                            }
                            aeVar.d(0);
                        }
                        aeVar.f26270a.a();
                    } catch (IOException e14) {
                        e = e14;
                        httpURLConnection = httpURLConnection2;
                        z10 = false;
                        ap.c("ae", e.toString(), new Throwable[0]);
                        aeVar.D = "IOException";
                        e.printStackTrace();
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        z11 = z10;
                        if (aeVar.f26274d == 3) {
                            if (z11) {
                                aeVar.f26270a.b();
                            } else {
                                aeVar.f26270a.a(aeVar.D);
                            }
                            aeVar.d(0);
                        }
                        aeVar.f26270a.a();
                    } catch (JSONException e15) {
                        e = e15;
                        httpURLConnection = httpURLConnection2;
                        z10 = false;
                        ap.c("ae", e.toString(), new Throwable[0]);
                        aeVar.D = "JSONException";
                        e.printStackTrace();
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        z11 = z10;
                        if (aeVar.f26274d == 3) {
                            if (z11) {
                                aeVar.f26270a.b();
                            } else {
                                aeVar.f26270a.a(aeVar.D);
                            }
                            aeVar.d(0);
                        }
                        aeVar.f26270a.a();
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (MalformedURLException e16) {
                e = e16;
            } catch (ProtocolException e17) {
                e = e17;
            } catch (IOException e18) {
                e = e18;
            } catch (JSONException e19) {
                e = e19;
            }
            if (aeVar.f26274d == 3) {
                if (z11) {
                    aeVar.f26270a.b();
                } else {
                    aeVar.f26270a.a(aeVar.D);
                }
                aeVar.d(0);
            }
            aeVar.f26270a.a();
        }
    }

    public interface b {
        void a();

        void a(float f6);

        void a(String str);

        void b();

        void c();
    }

    public static ae a() {
        return G;
    }

    @Override // com.akamai.botman.ag
    public final void d() {
        new Thread(new a()).start();
    }

    @Override // com.akamai.botman.ag
    public final void e() {
        super.e();
        this.f26270a.a();
        this.f26270a.c();
        d(0);
    }

    @Override // com.akamai.botman.ag
    public final String g() {
        StringBuilder sb2 = new StringBuilder(ad.d.f(new StringBuilder(), this.f26273c, "/_bm/get_params?type=sdk-cca"));
        try {
            String str = this.f26271b;
            if (str != null && !str.equals("")) {
                sb2.append("&context=");
                sb2.append(URLEncoder.encode(this.f26271b, "UTF-8"));
            }
            String str2 = this.F;
            if (str2 != null && !str2.equals("")) {
                sb2.append("&payload=");
                sb2.append(URLEncoder.encode(this.F, "UTF-8"));
            }
        } catch (UnsupportedEncodingException e5) {
            e5.printStackTrace();
        }
        this.F = "";
        return sb2.toString();
    }

    public final synchronized String i() {
        if (this.C != null && System.currentTimeMillis() <= this.E) {
            return this.C;
        }
        return "";
    }

    @Override // com.akamai.botman.ag
    public final void a(Application application, String str, JSONObject jSONObject) {
        a(application, str);
    }

    @Override // com.akamai.botman.ag
    public final void a(int i10) {
        this.f26270a.a(i10 / 10.0f);
    }

    @Override // com.akamai.botman.ag
    public final void a(String str) {
        ap.c("ae", "Error: ".concat(String.valueOf(str)), new Throwable[0]);
        this.f26270a.a();
        this.f26270a.a(str);
    }
}
