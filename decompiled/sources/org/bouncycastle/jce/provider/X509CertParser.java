package org.bouncycastle.jce.provider;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.cert.CertificateParsingException;
import java.util.ArrayList;
import java.util.Collection;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.SignedData;
import org.bouncycastle.asn1.x509.Certificate;
import org.bouncycastle.x509.X509StreamParserSpi;
import org.bouncycastle.x509.util.StreamParsingException;

/* JADX INFO: loaded from: classes8.dex */
public class X509CertParser extends X509StreamParserSpi {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final PEMUtil f90458d = new PEMUtil("CERTIFICATE");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ASN1Set f90459a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f90460b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InputStream f90461c = null;

    public final X509CertificateObject a() throws CertificateParsingException {
        if (this.f90459a == null) {
            return null;
        }
        while (this.f90460b < this.f90459a.size()) {
            ASN1Set aSN1Set = this.f90459a;
            int i10 = this.f90460b;
            this.f90460b = i10 + 1;
            ASN1Encodable objectAt = aSN1Set.getObjectAt(i10);
            if (objectAt instanceof ASN1Sequence) {
                return new X509CertificateObject(Certificate.getInstance(objectAt));
            }
        }
        return null;
    }

    public final X509CertificateObject b(InputStream inputStream) throws CertificateParsingException, IOException {
        ASN1Sequence aSN1Sequence = (ASN1Sequence) new ASN1InputStream(inputStream).readObject();
        if (aSN1Sequence.size() <= 1 || !(aSN1Sequence.getObjectAt(0) instanceof ASN1ObjectIdentifier) || !aSN1Sequence.getObjectAt(0).equals(PKCSObjectIdentifiers.signedData)) {
            return new X509CertificateObject(Certificate.getInstance(aSN1Sequence));
        }
        this.f90459a = new SignedData(ASN1Sequence.getInstance((ASN1TaggedObject) aSN1Sequence.getObjectAt(1), true)).getCertificates();
        return a();
    }

    @Override // org.bouncycastle.x509.X509StreamParserSpi
    public void engineInit(InputStream inputStream) {
        this.f90461c = inputStream;
        this.f90459a = null;
        this.f90460b = 0;
        if (inputStream.markSupported()) {
            return;
        }
        this.f90461c = new BufferedInputStream(this.f90461c);
    }

    @Override // org.bouncycastle.x509.X509StreamParserSpi
    public Object engineRead() throws StreamParsingException {
        try {
            ASN1Set aSN1Set = this.f90459a;
            if (aSN1Set != null) {
                if (this.f90460b != aSN1Set.size()) {
                    return a();
                }
                this.f90459a = null;
                this.f90460b = 0;
                return null;
            }
            this.f90461c.mark(10);
            int i10 = this.f90461c.read();
            if (i10 == -1) {
                return null;
            }
            if (i10 == 48) {
                this.f90461c.reset();
                return b(this.f90461c);
            }
            this.f90461c.reset();
            ASN1Sequence aSN1SequenceB = f90458d.b(this.f90461c);
            if (aSN1SequenceB != null) {
                return new X509CertificateObject(Certificate.getInstance(aSN1SequenceB));
            }
            return null;
        } catch (Exception e5) {
            throw new StreamParsingException(e5.toString(), e5);
        }
    }

    @Override // org.bouncycastle.x509.X509StreamParserSpi
    public Collection engineReadAll() throws StreamParsingException {
        ArrayList arrayList = new ArrayList();
        while (true) {
            java.security.cert.Certificate certificate = (java.security.cert.Certificate) engineRead();
            if (certificate == null) {
                return arrayList;
            }
            arrayList.add(certificate);
        }
    }
}
