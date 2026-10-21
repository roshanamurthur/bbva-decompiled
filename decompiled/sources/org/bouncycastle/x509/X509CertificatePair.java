package org.bouncycastle.x509;

import java.io.IOException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.x509.Certificate;
import org.bouncycastle.asn1.x509.CertificatePair;
import org.bouncycastle.jcajce.util.BCJcaJceHelper;
import org.bouncycastle.jce.provider.X509CertificateObject;

/* JADX INFO: loaded from: classes13.dex */
public class X509CertificatePair {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X509Certificate f91718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final X509Certificate f91719b;

    public X509CertificatePair(X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        new BCJcaJceHelper();
        this.f91718a = x509Certificate;
        this.f91719b = x509Certificate2;
    }

    public boolean equals(Object obj) {
        boolean zEquals;
        boolean zEquals2;
        if (obj == null || !(obj instanceof X509CertificatePair)) {
            return false;
        }
        X509CertificatePair x509CertificatePair = (X509CertificatePair) obj;
        X509Certificate x509Certificate = x509CertificatePair.f91718a;
        X509Certificate x509Certificate2 = this.f91718a;
        if (x509Certificate2 != null) {
            zEquals = x509Certificate2.equals(x509Certificate);
        } else {
            zEquals = x509Certificate == null;
        }
        X509Certificate x509Certificate3 = x509CertificatePair.f91719b;
        X509Certificate x509Certificate4 = this.f91719b;
        if (x509Certificate4 != null) {
            zEquals2 = x509Certificate4.equals(x509Certificate3);
        } else {
            zEquals2 = x509Certificate3 == null;
        }
        return zEquals && zEquals2;
    }

    public byte[] getEncoded() throws CertificateEncodingException {
        Certificate certificate;
        X509Certificate x509Certificate = this.f91718a;
        Certificate certificate2 = null;
        if (x509Certificate != null) {
            try {
                certificate = Certificate.getInstance(new ASN1InputStream(x509Certificate.getEncoded()).readObject());
                if (certificate == null) {
                    throw new CertificateEncodingException("unable to get encoding for forward");
                }
            } catch (IOException e5) {
                throw new c(e5.toString(), e5);
            } catch (IllegalArgumentException e7) {
                throw new c(e7.toString(), e7);
            }
        } else {
            certificate = null;
        }
        X509Certificate x509Certificate2 = this.f91719b;
        if (x509Certificate2 != null && (certificate2 = Certificate.getInstance(new ASN1InputStream(x509Certificate2.getEncoded()).readObject())) == null) {
            throw new CertificateEncodingException("unable to get encoding for reverse");
        }
        return new CertificatePair(certificate, certificate2).getEncoded(ASN1Encoding.DER);
    }

    public X509Certificate getForward() {
        return this.f91718a;
    }

    public X509Certificate getReverse() {
        return this.f91719b;
    }

    public int hashCode() {
        X509Certificate x509Certificate = this.f91718a;
        int iHashCode = x509Certificate != null ? (-1) ^ x509Certificate.hashCode() : -1;
        X509Certificate x509Certificate2 = this.f91719b;
        return x509Certificate2 != null ? (iHashCode * 17) ^ x509Certificate2.hashCode() : iHashCode;
    }

    public X509CertificatePair(CertificatePair certificatePair) throws CertificateParsingException {
        new BCJcaJceHelper();
        if (certificatePair.getForward() != null) {
            this.f91718a = new X509CertificateObject(certificatePair.getForward());
        }
        if (certificatePair.getReverse() != null) {
            this.f91719b = new X509CertificateObject(certificatePair.getReverse());
        }
    }
}
