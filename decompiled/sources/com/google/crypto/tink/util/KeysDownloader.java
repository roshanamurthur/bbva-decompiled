package com.google.crypto.tink.util;

import androidx.webkit.ProxyConfig;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpHeaders;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.concurrent.GuardedBy;
import nf.a;
import org.joda.time.Instant;

/* JADX INFO: loaded from: classes10.dex */
public class KeysDownloader {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Charset f47525j = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final NetHttpTransport f47526k = new NetHttpTransport.Builder().build();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final ExecutorService f47527l = Executors.newCachedThreadPool();
    public static final Pattern m = Pattern.compile("\\s*max-age\\s*=\\s*(\\d+)\\s*");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f47528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HttpTransport f47529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f47530c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f47531d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f47532e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @GuardedBy("instanceStateLock")
    public Runnable f47533f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @GuardedBy("instanceStateLock")
    public String f47534g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @GuardedBy("instanceStateLock")
    public long f47535h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @GuardedBy("instanceStateLock")
    public long f47536i;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public HttpTransport f47537a = KeysDownloader.f47526k;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Executor f47538b = KeysDownloader.f47527l;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f47539c;

        public KeysDownloader build() {
            if (this.f47539c != null) {
                return new KeysDownloader(this.f47538b, this.f47537a, this.f47539c);
            }
            throw new IllegalArgumentException("must provide a url with {#setUrl}");
        }

        @CanIgnoreReturnValue
        public Builder setExecutor(Executor executor) {
            this.f47538b = executor;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setHttpTransport(HttpTransport httpTransport) {
            this.f47537a = httpTransport;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setUrl(String str) {
            this.f47539c = str;
            return this;
        }
    }

    public KeysDownloader(Executor executor, HttpTransport httpTransport, String str) {
        try {
            if (!new URL(str).getProtocol().toLowerCase(Locale.US).equals(ProxyConfig.MATCH_HTTPS)) {
                throw new IllegalArgumentException("url must point to a HTTPS server");
            }
            this.f47528a = executor;
            this.f47529b = httpTransport;
            this.f47531d = new Object();
            this.f47530c = new Object();
            this.f47532e = str;
            this.f47535h = Long.MIN_VALUE;
            this.f47536i = 0L;
        } catch (MalformedURLException e5) {
            throw new IllegalArgumentException(e5);
        }
    }

    public static long b() {
        return Instant.now().getMillis();
    }

    public static long c(HttpHeaders httpHeaders) {
        long jLongValue;
        if (httpHeaders.getCacheControl() == null) {
            jLongValue = 0;
            break;
        }
        String[] strArrSplit = httpHeaders.getCacheControl().split(",");
        int length = strArrSplit.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                jLongValue = 0;
                break;
            }
            Matcher matcher = m.matcher(strArrSplit[i10]);
            if (matcher.matches()) {
                jLongValue = Long.valueOf(matcher.group(1)).longValue();
                break;
            }
            i10++;
        }
        if (httpHeaders.getAge() != null) {
            jLongValue -= httpHeaders.getAge().longValue();
        }
        return Math.max(0L, jLongValue);
    }

    @CanIgnoreReturnValue
    @GuardedBy("fetchDataLock")
    public final String a() throws IOException {
        long jB = b();
        HttpResponse httpResponseExecute = this.f47529b.createRequestFactory().buildGetRequest(new GenericUrl(this.f47532e)).execute();
        if (httpResponseExecute.getStatusCode() != 200) {
            throw new IOException("Unexpected status code = " + httpResponseExecute.getStatusCode());
        }
        InputStream content = httpResponseExecute.getContent();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(content, f47525j));
            StringBuilder sb2 = new StringBuilder();
            while (true) {
                int i10 = bufferedReader.read();
                if (i10 == -1) {
                    String string = sb2.toString();
                    content.close();
                    synchronized (this.f47531d) {
                        this.f47535h = jB;
                        this.f47536i = c(httpResponseExecute.getHeaders()) * 1000;
                        this.f47534g = string;
                    }
                    return string;
                }
                sb2.append((char) i10);
            }
        } catch (Throwable th2) {
            content.close();
            throw th2;
        }
    }

    public String download() throws IOException {
        synchronized (this.f47531d) {
            try {
                long jB = b();
                long j10 = this.f47535h;
                boolean z10 = true;
                boolean z11 = j10 > jB;
                long j11 = this.f47536i;
                if (j10 + j11 > jB && !z11) {
                    if ((j11 / 2) + j10 <= b()) {
                        refreshInBackground();
                    }
                    return this.f47534g;
                }
                synchronized (this.f47530c) {
                    synchronized (this.f47531d) {
                        long jB2 = b();
                        long j12 = this.f47535h;
                        if (j12 <= jB2) {
                            z10 = false;
                        }
                        if (j12 + this.f47536i > jB2 && !z10) {
                            return this.f47534g;
                        }
                        return a();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public HttpTransport getHttpTransport() {
        return this.f47529b;
    }

    public String getUrl() {
        return this.f47532e;
    }

    public void refreshInBackground() {
        a aVar = new a(this);
        synchronized (this.f47531d) {
            try {
                if (this.f47533f != null) {
                    return;
                }
                this.f47533f = aVar;
                try {
                    this.f47528a.execute(aVar);
                } catch (Throwable th2) {
                    synchronized (this.f47531d) {
                        try {
                            if (this.f47533f == aVar) {
                                this.f47533f = null;
                            }
                            throw th2;
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }
}
