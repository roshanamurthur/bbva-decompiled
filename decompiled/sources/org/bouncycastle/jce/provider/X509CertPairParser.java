package org.bouncycastle.jce.provider;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.x509.CertificatePair;
import org.bouncycastle.x509.X509CertificatePair;
import org.bouncycastle.x509.X509StreamParserSpi;
import org.bouncycastle.x509.util.StreamParsingException;

/* JADX INFO: loaded from: classes8.dex */
public class X509CertPairParser extends X509StreamParserSpi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InputStream f90457a = null;

    @Override // org.bouncycastle.x509.X509StreamParserSpi
    public void engineInit(InputStream inputStream) {
        this.f90457a = inputStream;
        if (inputStream.markSupported()) {
            return;
        }
        this.f90457a = new BufferedInputStream(this.f90457a);
    }

    @Override // org.bouncycastle.x509.X509StreamParserSpi
    public Object engineRead() throws StreamParsingException {
        try {
            this.f90457a.mark(10);
            if (this.f90457a.read() == -1) {
                return null;
            }
            this.f90457a.reset();
            return new X509CertificatePair(CertificatePair.getInstance((ASN1Sequence) new ASN1InputStream(this.f90457a).readObject()));
        } catch (Exception e5) {
            throw new StreamParsingException(e5.toString(), e5);
        }
    }

    @Override // org.bouncycastle.x509.X509StreamParserSpi
    public Collection engineReadAll() throws StreamParsingException {
        ArrayList arrayList = new ArrayList();
        while (true) {
            X509CertificatePair x509CertificatePair = (X509CertificatePair) engineRead();
            if (x509CertificatePair == null) {
                return arrayList;
            }
            arrayList.add(x509CertificatePair);
        }
    }
}
