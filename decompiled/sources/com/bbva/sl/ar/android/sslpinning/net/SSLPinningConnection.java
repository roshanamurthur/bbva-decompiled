package com.bbva.sl.ar.android.sslpinning.net;

import com.bbva.sl.ar.android.sslpinning.exception.SSLPinningCertRetrievalException;
import java.net.URL;
import java.security.cert.Certificate;

/* JADX INFO: loaded from: classes8.dex */
public interface SSLPinningConnection {
    String getCipherSuite();

    Certificate[] getServerCertificates() throws SSLPinningCertRetrievalException;

    URL getURL();
}
