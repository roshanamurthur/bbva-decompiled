package com.bbva.proguarded.android.sslpinning;

import java.io.ByteArrayInputStream;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;

/* JADX INFO: loaded from: classes8.dex */
public final class q {
    public static X509Certificate a(String str) throws CertificateException {
        if (str != null) {
            try {
                if (str.trim().length() != 0) {
                    return (X509Certificate) CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream(f.c(str.replaceAll("\\s", ""))));
                }
            } catch (IllegalArgumentException e5) {
                throw new CertificateException(e5);
            }
        }
        throw new CertificateException("Empty certificate.");
    }
}
