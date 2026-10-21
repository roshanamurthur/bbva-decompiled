package retrofit2;

import androidx.appcompat.widget.o1;
import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import okhttp3.FormBody;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okio.Buffer;
import okio.BufferedSource;
import okio.ForwardingSource;
import okio.Okio;
import okio.Timeout;
import sn.i;

/* JADX INFO: compiled from: OkHttpCall.java */
/* JADX INFO: loaded from: classes13.dex */
public final class d<T> implements Call<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final sn.f f93060p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Object[] f93061q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final okhttp3.Call.Factory f93062r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final Converter<ResponseBody, T> f93063s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public volatile boolean f93064t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @GuardedBy("this")
    @Nullable
    public okhttp3.Call f93065u0;

    @GuardedBy("this")
    @Nullable
    public Throwable v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    @GuardedBy("this")
    public boolean f93066w0;

    /* JADX INFO: compiled from: OkHttpCall.java */
    public class a implements okhttp3.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Callback f93067a;

        public a(Callback callback) {
            this.f93067a = callback;
        }

        @Override // okhttp3.Callback
        public final void onFailure(okhttp3.Call call, IOException iOException) {
            try {
                this.f93067a.onFailure(d.this, iOException);
            } catch (Throwable th2) {
                i.m(th2);
                th2.printStackTrace();
            }
        }

        @Override // okhttp3.Callback
        public final void onResponse(okhttp3.Call call, okhttp3.Response response) {
            Callback callback = this.f93067a;
            d dVar = d.this;
            try {
                try {
                    callback.onResponse(dVar, dVar.c(response));
                } catch (Throwable th2) {
                    i.m(th2);
                    th2.printStackTrace();
                }
            } catch (Throwable th3) {
                i.m(th3);
                try {
                    callback.onFailure(dVar, th3);
                } catch (Throwable th4) {
                    i.m(th4);
                    th4.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: compiled from: OkHttpCall.java */
    public static final class b extends ResponseBody {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final ResponseBody f93069q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final BufferedSource f93070r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        @Nullable
        public IOException f93071s0;

        /* JADX INFO: compiled from: OkHttpCall.java */
        public class a extends ForwardingSource {
            public a(BufferedSource bufferedSource) {
                super(bufferedSource);
            }

            @Override // okio.ForwardingSource, okio.Source
            public final long read(Buffer buffer, long j10) throws IOException {
                try {
                    return super.read(buffer, j10);
                } catch (IOException e5) {
                    b.this.f93071s0 = e5;
                    throw e5;
                }
            }
        }

        public b(ResponseBody responseBody) {
            this.f93069q0 = responseBody;
            this.f93070r0 = Okio.buffer(new a(responseBody.getF85884s0()));
        }

        @Override // okhttp3.ResponseBody, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            this.f93069q0.close();
        }

        @Override // okhttp3.ResponseBody
        /* JADX INFO: renamed from: contentLength */
        public final long getF85883r0() {
            return this.f93069q0.getF85883r0();
        }

        @Override // okhttp3.ResponseBody
        /* JADX INFO: renamed from: contentType */
        public final MediaType getF85678q0() {
            return this.f93069q0.getF85678q0();
        }

        @Override // okhttp3.ResponseBody
        /* JADX INFO: renamed from: source */
        public final BufferedSource getF85884s0() {
            return this.f93070r0;
        }
    }

    /* JADX INFO: compiled from: OkHttpCall.java */
    public static final class c extends ResponseBody {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        @Nullable
        public final MediaType f93073q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final long f93074r0;

        public c(@Nullable MediaType mediaType, long j10) {
            this.f93073q0 = mediaType;
            this.f93074r0 = j10;
        }

        @Override // okhttp3.ResponseBody
        /* JADX INFO: renamed from: contentLength */
        public final long getF85883r0() {
            return this.f93074r0;
        }

        @Override // okhttp3.ResponseBody
        /* JADX INFO: renamed from: contentType */
        public final MediaType getF85678q0() {
            return this.f93073q0;
        }

        @Override // okhttp3.ResponseBody
        /* JADX INFO: renamed from: source */
        public final BufferedSource getF85884s0() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    public d(sn.f fVar, Object[] objArr, okhttp3.Call.Factory factory, Converter<ResponseBody, T> converter) {
        this.f93060p0 = fVar;
        this.f93061q0 = objArr;
        this.f93062r0 = factory;
        this.f93063s0 = converter;
    }

    public final okhttp3.Call a() throws IOException {
        HttpUrl httpUrlResolve;
        sn.f fVar = this.f93060p0;
        fVar.getClass();
        Object[] objArr = this.f93061q0;
        int length = objArr.length;
        sn.d<?>[] dVarArr = fVar.f93312j;
        if (length != dVarArr.length) {
            throw new IllegalArgumentException(androidx.appcompat.widget.a.c(o1.c("Argument count (", length, ") doesn't match expected count ("), dVarArr.length, ")"));
        }
        sn.e eVar = new sn.e(fVar.f93305c, fVar.f93304b, fVar.f93306d, fVar.f93307e, fVar.f93308f, fVar.f93309g, fVar.f93310h, fVar.f93311i);
        if (fVar.f93313k) {
            length--;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i10 = 0; i10 < length; i10++) {
            arrayList.add(objArr[i10]);
            dVarArr[i10].a(eVar, objArr[i10]);
        }
        HttpUrl.Builder builder = eVar.f93293d;
        if (builder != null) {
            httpUrlResolve = builder.build();
        } else {
            String str = eVar.f93292c;
            HttpUrl httpUrl = eVar.f93291b;
            httpUrlResolve = httpUrl.resolve(str);
            if (httpUrlResolve == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + httpUrl + ", Relative: " + eVar.f93292c);
            }
        }
        RequestBody aVar = eVar.f93300k;
        if (aVar == null) {
            FormBody.Builder builder2 = eVar.f93299j;
            if (builder2 != null) {
                aVar = builder2.build();
            } else {
                MultipartBody.Builder builder3 = eVar.f93298i;
                if (builder3 != null) {
                    aVar = builder3.build();
                } else if (eVar.f93297h) {
                    aVar = RequestBody.create((MediaType) null, new byte[0]);
                }
            }
        }
        MediaType mediaType = eVar.f93296g;
        Headers.Builder builder4 = eVar.f93295f;
        if (mediaType != null) {
            if (aVar != null) {
                aVar = new sn.e.a(aVar, mediaType);
            } else {
                builder4.add(DigipassManagerConstants.KEY_CONTENT_TYPE, mediaType.getF85577a());
            }
        }
        okhttp3.Call callNewCall = this.f93062r0.newCall(eVar.f93294e.url(httpUrlResolve).headers(builder4.build()).method(eVar.f93290a, aVar).tag(Invocation.class, new Invocation(fVar.f93303a, arrayList)).build());
        if (callNewCall != null) {
            return callNewCall;
        }
        throw new NullPointerException("Call.Factory returned null.");
    }

    @GuardedBy("this")
    public final okhttp3.Call b() throws IOException {
        okhttp3.Call call = this.f93065u0;
        if (call != null) {
            return call;
        }
        Throwable th2 = this.v0;
        if (th2 != null) {
            if (th2 instanceof IOException) {
                throw ((IOException) th2);
            }
            if (th2 instanceof RuntimeException) {
                throw ((RuntimeException) th2);
            }
            throw ((Error) th2);
        }
        try {
            okhttp3.Call callA = a();
            this.f93065u0 = callA;
            return callA;
        } catch (IOException | Error | RuntimeException e5) {
            i.m(e5);
            this.v0 = e5;
            throw e5;
        }
    }

    public final Response<T> c(okhttp3.Response response) throws IOException {
        ResponseBody responseBodyBody = response.body();
        okhttp3.Response responseBuild = response.newBuilder().body(new c(responseBodyBody.getF85678q0(), responseBodyBody.getF85883r0())).build();
        int iCode = responseBuild.code();
        if (iCode < 200 || iCode >= 300) {
            try {
                Buffer buffer = new Buffer();
                responseBodyBody.getF85884s0().readAll(buffer);
                return Response.error(ResponseBody.create(responseBodyBody.getF85678q0(), responseBodyBody.getF85883r0(), buffer), responseBuild);
            } finally {
                responseBodyBody.close();
            }
        }
        if (iCode == 204 || iCode == 205) {
            responseBodyBody.close();
            return Response.success((Object) null, responseBuild);
        }
        b bVar = new b(responseBodyBody);
        try {
            return Response.success(this.f93063s0.convert(bVar), responseBuild);
        } catch (RuntimeException e5) {
            IOException iOException = bVar.f93071s0;
            if (iOException == null) {
                throw e5;
            }
            throw iOException;
        }
    }

    @Override // retrofit2.Call
    public final void cancel() {
        okhttp3.Call call;
        this.f93064t0 = true;
        synchronized (this) {
            call = this.f93065u0;
        }
        if (call != null) {
            call.cancel();
        }
    }

    public final Object clone() throws CloneNotSupportedException {
        return new d(this.f93060p0, this.f93061q0, this.f93062r0, this.f93063s0);
    }

    @Override // retrofit2.Call
    public final void enqueue(Callback<T> callback) {
        okhttp3.Call call;
        Throwable th2;
        Objects.requireNonNull(callback, "callback == null");
        synchronized (this) {
            try {
                if (this.f93066w0) {
                    throw new IllegalStateException("Already executed.");
                }
                this.f93066w0 = true;
                call = this.f93065u0;
                th2 = this.v0;
                if (call == null && th2 == null) {
                    try {
                        okhttp3.Call callA = a();
                        this.f93065u0 = callA;
                        call = callA;
                    } catch (Throwable th3) {
                        th2 = th3;
                        i.m(th2);
                        this.v0 = th2;
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        if (th2 != null) {
            callback.onFailure(this, th2);
            return;
        }
        if (this.f93064t0) {
            call.cancel();
        }
        call.enqueue(new a(callback));
    }

    @Override // retrofit2.Call
    public final Response<T> execute() throws IOException {
        okhttp3.Call callB;
        synchronized (this) {
            if (this.f93066w0) {
                throw new IllegalStateException("Already executed.");
            }
            this.f93066w0 = true;
            callB = b();
        }
        if (this.f93064t0) {
            callB.cancel();
        }
        return c(callB.execute());
    }

    @Override // retrofit2.Call
    public final boolean isCanceled() {
        boolean z10 = true;
        if (this.f93064t0) {
            return true;
        }
        synchronized (this) {
            try {
                okhttp3.Call call = this.f93065u0;
                if (call == null || !call.getJ0()) {
                    z10 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    @Override // retrofit2.Call
    public final synchronized boolean isExecuted() {
        return this.f93066w0;
    }

    @Override // retrofit2.Call
    public final synchronized Request request() {
        try {
        } catch (IOException e5) {
            throw new RuntimeException("Unable to create request.", e5);
        }
        return b().request();
    }

    @Override // retrofit2.Call
    public final synchronized Timeout timeout() {
        try {
        } catch (IOException e5) {
            throw new RuntimeException("Unable to create call.", e5);
        }
        return b().timeout();
    }

    @Override // retrofit2.Call
    public final Call clone() {
        return new d(this.f93060p0, this.f93061q0, this.f93062r0, this.f93063s0);
    }
}
