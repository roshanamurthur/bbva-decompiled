package com.bbva.sl.ar.android.sslpinning.net;

import com.bbva.sl.ar.android.sslpinning.exception.SSLPinningCertRetrievalException;
import java.net.URL;
import java.security.cert.Certificate;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLPeerUnverifiedException;

/* JADX INFO: loaded from: classes8.dex */
public class HttpsSSLPinningConnection implements SSLPinningConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HttpsURLConnection f36597a;

    public HttpsSSLPinningConnection(HttpsURLConnection httpsURLConnection) {
        this.f36597a = httpsURLConnection;
    }

    @Override // com.bbva.sl.ar.android.sslpinning.net.SSLPinningConnection
    public String getCipherSuite() {
        return this.f36597a.getCipherSuite();
    }

    @Override // com.bbva.sl.ar.android.sslpinning.net.SSLPinningConnection
    public Certificate[] getServerCertificates() throws SSLPinningCertRetrievalException {
        try {
            return this.f36597a.getServerCertificates();
        } catch (SSLPeerUnverifiedException e5) {
            throw new SSLPinningCertRetrievalException(e5);
        }
    }

    @Override // com.bbva.sl.ar.android.sslpinning.net.SSLPinningConnection
    public URL getURL() {
        return this.f36597a.getURL();
    }
}
