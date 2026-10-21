package net.ipsoft.amelia.sdk.internal.b;

import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import com.bbva.ethermobilesdk.devicechecker.emulator.EmulatorApi;
import java.io.File;
import java.io.IOException;
import java.net.CookieManager;
import java.net.HttpCookie;
import java.net.URI;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import net.ipsoft.amelia.sdk.internal.common.ALog;
import okhttp3.Call;
import okhttp3.FormBody;
import okhttp3.JavaNetCookieJar;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/* JADX INFO: loaded from: classes12.dex */
public class n extends Handler {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f84745j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected OkHttpClient f84746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected OkHttpClient f84747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected CookieManager f84748c = new CookieManager();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ThreadPoolExecutor f84749d = (ThreadPoolExecutor) Executors.newFixedThreadPool(5);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f84750e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f84751f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f84752g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f84753h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f84754i;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final m f84755a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final o f84756b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Request f84757c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Response f84758d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Call f84759e;

        public a(m mVar, o oVar) {
            this.f84755a = mVar;
            this.f84756b = oVar;
        }

        public void a() {
            this.f84756b.c();
            Call call = this.f84759e;
            if (call != null) {
                call.cancel();
            }
        }
    }

    public class c implements HostnameVerifier {
        @Override // javax.net.ssl.HostnameVerifier
        public final boolean verify(String str, SSLSession sSLSession) {
            return true;
        }
    }

    public class d implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ a f84760p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Message f84761q0;

        public d(a aVar, Message message) {
            this.f84760p0 = aVar;
            this.f84761q0 = message;
        }

        @Override // java.lang.Runnable
        public final void run() {
            a aVar = this.f84760p0;
            Message message = this.f84761q0;
            int i10 = n.f84745j;
            n nVar = n.this;
            nVar.getClass();
            try {
                aVar.f84755a.b();
                try {
                    OkHttpClient okHttpClientB = nVar.f84751f ? nVar.b() : nVar.d();
                    Request.Builder builder = new Request.Builder();
                    builder.url(aVar.f84755a.a(nVar.f84750e));
                    if (aVar.f84755a.d() != null) {
                        nVar.b(builder, aVar);
                    } else if (aVar.f84755a.e() != null) {
                        nVar.c(builder, aVar);
                    } else if (aVar.f84755a.a() != null) {
                        nVar.d(builder, aVar);
                    } else {
                        builder.get();
                    }
                    nVar.a(builder, aVar);
                    Request requestBuild = builder.build();
                    aVar.f84757c = requestBuild;
                    ALog.d(EmulatorApi.SDK, requestBuild.url().getF85562i());
                    Call callNewCall = okHttpClientB.newCall(requestBuild);
                    aVar.f84759e = callNewCall;
                    Response responseExecute = callNewCall.execute();
                    aVar.f84758d = responseExecute;
                    if (!responseExecute.isSuccessful()) {
                        aVar.f84756b.f84764f = new l(l.a.backendError, responseExecute.code(), responseExecute.message(), null);
                        message.sendToTarget();
                        ALog.w("sdk error", aVar.f84756b.f84764f.toString());
                        return;
                    }
                    try {
                        MediaType f85678q0 = responseExecute.body().getF85678q0();
                        if (f85678q0 != null) {
                            aVar.f84756b.b(f85678q0.type() + "/" + f85678q0.subtype());
                        }
                        nVar.a(aVar, responseExecute);
                        message.sendToTarget();
                    } catch (IOException e5) {
                        aVar.f84756b.f84764f = new l(l.a.backendError, responseExecute.code(), responseExecute.message(), e5);
                        message.sendToTarget();
                        e5.printStackTrace();
                    }
                } catch (IOException e7) {
                    e = e7;
                    aVar.f84756b.f84764f = new l(l.a.networkError, -1, null, e);
                    message.sendToTarget();
                    e.printStackTrace();
                }
            } catch (IOException e10) {
                e = e10;
                aVar.f84756b.f84764f = new l(l.a.badRequestError, -1, e.getMessage(), e);
            }
        }
    }

    public n(net.ipsoft.amelia.sdk.internal.common.b bVar) {
        this.f84750e = bVar.f84826a;
        this.f84751f = bVar.f84831f;
        this.f84752g = bVar.f84836k;
        this.f84753h = bVar.f84837l;
        this.f84754i = bVar.m;
    }

    public List<HttpCookie> a() {
        return this.f84748c.getCookieStore().getCookies();
    }

    public OkHttpClient b() {
        if (this.f84747b == null) {
            try {
                TrustManager[] trustManagerArr = {new b()};
                SSLContext sSLContext = SSLContext.getInstance("SSL");
                sSLContext.init(null, trustManagerArr, new SecureRandom());
                SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
                OkHttpClient.Builder builder = new OkHttpClient.Builder();
                int i10 = this.f84752g;
                long j10 = i10 > 0 ? i10 : 40000L;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                OkHttpClient.Builder builderConnectTimeout = builder.connectTimeout(j10, timeUnit);
                int i11 = this.f84754i;
                OkHttpClient.Builder builderWriteTimeout = builderConnectTimeout.writeTimeout(i11 > 0 ? i11 : 40000L, timeUnit);
                int i12 = this.f84753h;
                OkHttpClient.Builder builderCookieJar = builderWriteTimeout.readTimeout(i12 > 0 ? i12 : 40000L, timeUnit).pingInterval(20L, TimeUnit.SECONDS).cookieJar(new JavaNetCookieJar(this.f84748c));
                builderCookieJar.sslSocketFactory(socketFactory, (X509TrustManager) trustManagerArr[0]);
                builderCookieJar.hostnameVerifier(new c());
                this.f84747b = builderCookieJar.build();
            } catch (Exception e5) {
                throw new RuntimeException(e5);
            }
        }
        return this.f84747b;
    }

    public void c() {
        this.f84748c.getCookieStore().removeAll();
    }

    public OkHttpClient d() {
        if (this.f84746a == null) {
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            int i10 = this.f84752g;
            long j10 = i10 > 0 ? i10 : 40000L;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            OkHttpClient.Builder builderConnectTimeout = builder.connectTimeout(j10, timeUnit);
            int i11 = this.f84754i;
            OkHttpClient.Builder builderWriteTimeout = builderConnectTimeout.writeTimeout(i11 > 0 ? i11 : 40000L, timeUnit);
            int i12 = this.f84753h;
            this.f84746a = builderWriteTimeout.readTimeout(i12 > 0 ? i12 : 40000L, timeUnit).pingInterval(20L, TimeUnit.SECONDS).cookieJar(new JavaNetCookieJar(this.f84748c)).followRedirects(false).build();
        }
        return this.f84746a;
    }

    public void e() {
        this.f84749d.shutdown();
    }

    public String f() {
        return this.f84750e;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        ((a) message.obj).f84756b.a();
    }

    public a a(m mVar, o oVar) {
        a aVar = new a(mVar, oVar);
        Message messageObtain = Message.obtain(this);
        messageObtain.obj = aVar;
        this.f84749d.execute(new d(aVar, messageObtain));
        return aVar;
    }

    public void c(Request.Builder builder, a aVar) {
        MediaType mediaType = MediaType.parse(aVar.f84755a.c());
        File fileE = aVar.f84755a.e();
        builder.post(new MultipartBody.Builder().setType(MultipartBody.FORM).addFormDataPart("conversationId", aVar.f84755a.g()).addFormDataPart("file", fileE.getName(), RequestBody.create(mediaType, fileE)).build());
    }

    public void d(Request.Builder builder, a aVar) {
        builder.post(RequestBody.create(MediaType.parse(aVar.f84755a.c()), aVar.f84755a.a().toString()));
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x004e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(net.ipsoft.amelia.sdk.internal.b.n.a r3, okhttp3.Response r4) throws java.io.IOException {
        /*
            r2 = this;
            net.ipsoft.amelia.sdk.internal.b.m r0 = r3.f84755a
            java.lang.String r0 = r0.f()
            r0.getClass()
            java.lang.String r1 = "text/plain; text/html;"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L56
            java.lang.String r1 = "application/json;charset=UTF-8"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L32
            okhttp3.ResponseBody r4 = r4.body()
            java.io.InputStream r4 = r4.byteStream()
            net.ipsoft.amelia.sdk.internal.b.o r3 = r3.f84756b     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L2c
            r3.a(r4)     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L2c
            r4.close()
            goto L63
        L2a:
            r3 = move-exception
            goto L2e
        L2c:
            r3 = move-exception
            throw r3     // Catch: java.lang.Throwable -> L2a
        L2e:
            r4.close()
            throw r3
        L32:
            okhttp3.ResponseBody r0 = r4.body()
            java.io.Reader r0 = r0.charStream()
            net.ipsoft.amelia.sdk.internal.b.o r1 = r3.f84756b     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L50
            r1.a(r0)     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L50
            net.ipsoft.amelia.sdk.internal.b.o r3 = r3.f84756b     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L50
            java.lang.String r1 = "Set-Cookie"
            java.lang.String r4 = r4.header(r1)     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L50
            r3.c(r4)     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L50
            r0.close()
            goto L63
        L4e:
            r3 = move-exception
            goto L52
        L50:
            r3 = move-exception
            throw r3     // Catch: java.lang.Throwable -> L4e
        L52:
            r0.close()
            throw r3
        L56:
            net.ipsoft.amelia.sdk.internal.b.o r3 = r3.f84756b
            okhttp3.ResponseBody r4 = r4.body()
            java.lang.String r4 = r4.string()
            r3.a(r4)
        L63:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.ipsoft.amelia.sdk.internal.b.n.a(net.ipsoft.amelia.sdk.internal.b.n$a, okhttp3.Response):void");
    }

    public void a(Request.Builder builder, a aVar) {
        builder.header("Accept", aVar.f84755a.f());
        aVar.f84755a.a(builder);
    }

    public boolean a(String str) {
        if (str == null) {
            return false;
        }
        for (HttpCookie httpCookie : HttpCookie.parse(str)) {
            if ("amelia_s".equals(httpCookie.getName())) {
                String str2 = this.f84750e;
                httpCookie.setDomain(Uri.parse(str2).getHost());
                httpCookie.setPath("/Amelia");
                try {
                    URI uri = new URI(str2);
                    Iterator<HttpCookie> it = this.f84748c.getCookieStore().get(uri).iterator();
                    while (it.hasNext()) {
                        this.f84748c.getCookieStore().remove(uri, it.next());
                    }
                    this.f84748c.getCookieStore().add(uri, httpCookie);
                    return true;
                } catch (Exception unused) {
                    continue;
                }
            }
        }
        return false;
    }

    public void b(Request.Builder builder, a aVar) {
        FormBody.Builder builder2 = new FormBody.Builder();
        for (Map.Entry<String, String> entry : aVar.f84755a.d().entrySet()) {
            builder2.add(entry.getKey(), entry.getValue());
        }
        builder.post(builder2.build());
    }

    public class b implements X509TrustManager {
        @Override // javax.net.ssl.X509TrustManager
        public final X509Certificate[] getAcceptedIssuers() {
            return new X509Certificate[0];
        }

        @Override // javax.net.ssl.X509TrustManager
        public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        }

        @Override // javax.net.ssl.X509TrustManager
        public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        }
    }
}
