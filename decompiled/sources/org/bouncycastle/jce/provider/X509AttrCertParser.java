package org.bouncycastle.jce.provider;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
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
import org.bouncycastle.x509.X509AttributeCertificate;
import org.bouncycastle.x509.X509StreamParserSpi;
import org.bouncycastle.x509.X509V2AttributeCertificate;
import org.bouncycastle.x509.util.StreamParsingException;

/* JADX INFO: loaded from: classes8.dex */
public class X509AttrCertParser extends X509StreamParserSpi {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final PEMUtil f90439d = new PEMUtil("ATTRIBUTE CERTIFICATE");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ASN1Set f90440a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f90441b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InputStream f90442c = null;

    public final X509V2AttributeCertificate a() throws IOException {
        if (this.f90440a == null) {
            return null;
        }
        while (this.f90441b < this.f90440a.size()) {
            ASN1Set aSN1Set = this.f90440a;
            int i10 = this.f90441b;
            this.f90441b = i10 + 1;
            ASN1Encodable objectAt = aSN1Set.getObjectAt(i10);
            if (objectAt instanceof ASN1TaggedObject) {
                ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) objectAt;
                if (aSN1TaggedObject.getTagNo() == 2) {
                    return new X509V2AttributeCertificate(ASN1Sequence.getInstance(aSN1TaggedObject, false).getEncoded());
                }
            }
        }
        return null;
    }

    public final X509V2AttributeCertificate b(InputStream inputStream) throws IOException {
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(new ASN1InputStream(inputStream).readObject());
        if (aSN1Sequence.size() <= 1 || !(aSN1Sequence.getObjectAt(0) instanceof ASN1ObjectIdentifier) || !aSN1Sequence.getObjectAt(0).equals(PKCSObjectIdentifiers.signedData)) {
            return new X509V2AttributeCertificate(aSN1Sequence.getEncoded());
        }
        this.f90440a = new SignedData(ASN1Sequence.getInstance((ASN1TaggedObject) aSN1Sequence.getObjectAt(1), true)).getCertificates();
        return a();
    }

    @Override // org.bouncycastle.x509.X509StreamParserSpi
    public void engineInit(InputStream inputStream) {
        this.f90442c = inputStream;
        this.f90440a = null;
        this.f90441b = 0;
        if (inputStream.markSupported()) {
            return;
        }
        this.f90442c = new BufferedInputStream(this.f90442c);
    }

    @Override // org.bouncycastle.x509.X509StreamParserSpi
    public Object engineRead() throws StreamParsingException {
        try {
            ASN1Set aSN1Set = this.f90440a;
            if (aSN1Set != null) {
                if (this.f90441b != aSN1Set.size()) {
                    return a();
                }
                this.f90440a = null;
                this.f90441b = 0;
                return null;
            }
            this.f90442c.mark(10);
            int i10 = this.f90442c.read();
            if (i10 == -1) {
                return null;
            }
            if (i10 == 48) {
                this.f90442c.reset();
                return b(this.f90442c);
            }
            this.f90442c.reset();
            ASN1Sequence aSN1SequenceB = f90439d.b(this.f90442c);
            if (aSN1SequenceB != null) {
                return new X509V2AttributeCertificate(aSN1SequenceB.getEncoded());
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
            X509AttributeCertificate x509AttributeCertificate = (X509AttributeCertificate) engineRead();
            if (x509AttributeCertificate == null) {
                return arrayList;
            }
            arrayList.add(x509AttributeCertificate);
        }
    }
}
