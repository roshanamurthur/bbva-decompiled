package com.akamai.botman;

import android.os.Handler;
import b4.p;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.akamai.botman.b.a f26317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ExecutorService f26318b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Handler f26319c;

    public class a implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ URL f26320p0;

        public a(URL url) {
            this.f26320p0 = url;
        }

        /* JADX WARN: Code duplicated, block: B:39:0x00c7  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
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
            d dVar = d.this;
            JSONObject jSONObject = null;
            Object[] objArr = 0;
            try {
                try {
                    httpURLConnection = (HttpURLConnection) this.f26320p0.openConnection();
                    try {
                        httpURLConnection.setReadTimeout(10000);
                        httpURLConnection.setConnectTimeout(15000);
                        httpURLConnection.setRequestMethod("GET");
                        httpURLConnection.setUseCaches(false);
                        httpURLConnection.setRequestProperty("User-Agent", p.c());
                        int responseCode = httpURLConnection.getResponseCode();
                        if (responseCode != 200) {
                            ap.c("CYFNetworkServiceTask", "Failed to get PoW Params, HTTP response code: ".concat(String.valueOf(responseCode)), new Throwable[0]);
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
                        }
                        httpURLConnection.disconnect();
                        dVar.a(jSONObject);
                    } catch (JSONException e5) {
                        e = e5;
                        ap.c("CYFNetworkServiceTask", "JSONException:" + e.toString(), new Throwable[0]);
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        dVar.a(null);
                    } catch (Exception e7) {
                        e = e7;
                        ap.c("CYFNetworkServiceTask", "Exception:" + e.toString(), new Throwable[0]);
                        e.printStackTrace();
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        dVar.a(null);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (0 != 0) {
                        (objArr == true ? 1 : 0).disconnect();
                    }
                    dVar.a(null);
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
                if (0 != 0) {
                    (objArr == true ? 1 : 0).disconnect();
                }
                dVar.a(null);
                throw th;
            }
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ JSONObject f26322p0;

        public b(JSONObject jSONObject) {
            this.f26322p0 = jSONObject;
        }

        @Override // java.lang.Runnable
        public final void run() {
            d dVar = d.this;
            JSONObject jSONObject = this.f26322p0;
            if (jSONObject != null) {
                dVar.f26317a.a(jSONObject);
            } else {
                dVar.f26317a.a();
            }
        }
    }

    public final void a(JSONObject jSONObject) {
        this.f26319c.post(new b(jSONObject));
    }
}
