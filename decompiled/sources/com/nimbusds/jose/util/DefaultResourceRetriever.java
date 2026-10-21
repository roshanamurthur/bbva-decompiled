package com.nimbusds.jose.util;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import net.jcip.annotations.ThreadSafe;

/* JADX INFO: loaded from: classes10.dex */
@ThreadSafe
public class DefaultResourceRetriever extends AbstractRestrictedResourceRetriever {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f62826e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final SSLSocketFactory f62827f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Proxy f62828g;

    public DefaultResourceRetriever() {
        this(0, 0);
    }

    public boolean disconnectsAfterUse() {
        return this.f62826e;
    }

    public Proxy getProxy() {
        return this.f62828g;
    }

    public HttpURLConnection openConnection(URL url) throws IOException {
        Proxy proxy = this.f62828g;
        return proxy != null ? (HttpURLConnection) url.openConnection(proxy) : (HttpURLConnection) url.openConnection();
    }

    @Override // com.nimbusds.jose.util.ResourceRetriever
    public Resource retrieveResource(URL url) throws IOException {
        HttpURLConnection httpURLConnection = null;
        try {
            try {
                HttpURLConnection httpURLConnectionOpenConnection = openConnection(url);
                httpURLConnectionOpenConnection.setConnectTimeout(getConnectTimeout());
                httpURLConnectionOpenConnection.setReadTimeout(getReadTimeout());
                SSLSocketFactory sSLSocketFactory = this.f62827f;
                if (sSLSocketFactory != null && (httpURLConnectionOpenConnection instanceof HttpsURLConnection)) {
                    ((HttpsURLConnection) httpURLConnectionOpenConnection).setSSLSocketFactory(sSLSocketFactory);
                }
                if (getHeaders() != null && !getHeaders().isEmpty()) {
                    for (Map.Entry<String, List<String>> entry : getHeaders().entrySet()) {
                        Iterator<String> it = entry.getValue().iterator();
                        while (it.hasNext()) {
                            httpURLConnectionOpenConnection.addRequestProperty(entry.getKey(), it.next());
                        }
                    }
                }
                int sizeLimit = getSizeLimit();
                InputStream inputStream = httpURLConnectionOpenConnection.getInputStream();
                if (sizeLimit > 0) {
                    inputStream = new BoundedInputStream(inputStream, getSizeLimit());
                }
                try {
                    String inputStreamToString = IOUtils.readInputStreamToString(inputStream, StandardCharsets.UTF_8);
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    int responseCode = httpURLConnectionOpenConnection.getResponseCode();
                    String responseMessage = httpURLConnectionOpenConnection.getResponseMessage();
                    if (responseCode <= 299 && responseCode >= 200) {
                        Resource resource = new Resource(inputStreamToString, httpURLConnectionOpenConnection.getContentType());
                        if (this.f62826e) {
                            httpURLConnectionOpenConnection.disconnect();
                        }
                        return resource;
                    }
                    throw new IOException("HTTP " + responseCode + ": " + responseMessage);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable th4) {
                                th2.addSuppressed(th4);
                            }
                        }
                        throw th3;
                    }
                }
            } catch (ClassCastException e5) {
                throw new IOException("Couldn't open HTTP(S) connection: " + e5.getMessage(), e5);
            }
        } catch (Throwable th5) {
            if (this.f62826e && 0 != 0) {
                httpURLConnection.disconnect();
            }
            throw th5;
        }
    }

    public void setDisconnectsAfterUse(boolean z10) {
        this.f62826e = z10;
    }

    public void setProxy(Proxy proxy) {
        this.f62828g = proxy;
    }

    public DefaultResourceRetriever(int i10, int i11) {
        this(i10, i11, 0);
    }

    public DefaultResourceRetriever(int i10, int i11, int i12) {
        this(i10, i11, i12, true);
    }

    public DefaultResourceRetriever(int i10, int i11, int i12, boolean z10) {
        this(i10, i11, i12, z10, null);
    }

    public DefaultResourceRetriever(int i10, int i11, int i12, boolean z10, SSLSocketFactory sSLSocketFactory) {
        super(i10, i11, i12);
        this.f62826e = z10;
        this.f62827f = sSLSocketFactory;
    }
}
