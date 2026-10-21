package org.bouncycastle.jce.provider;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.cert.CRL;
import java.security.cert.CRLException;
import java.util.ArrayList;
import java.util.Collection;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.SignedData;
import org.bouncycastle.asn1.x509.CertificateList;
import org.bouncycastle.x509.X509StreamParserSpi;
import org.bouncycastle.x509.util.StreamParsingException;

/* JADX INFO: loaded from: classes8.dex */
public class X509CRLParser extends X509StreamParserSpi {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final PEMUtil f90453d = new PEMUtil("CRL");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ASN1Set f90454a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f90455b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InputStream f90456c = null;

    public final X509CRLObject a() throws CRLException {
        ASN1Set aSN1Set = this.f90454a;
        if (aSN1Set == null || this.f90455b >= aSN1Set.size()) {
            return null;
        }
        ASN1Set aSN1Set2 = this.f90454a;
        int i10 = this.f90455b;
        this.f90455b = i10 + 1;
        return new X509CRLObject(CertificateList.getInstance(aSN1Set2.getObjectAt(i10)));
    }

    public final X509CRLObject b(InputStream inputStream) throws IOException, CRLException {
        ASN1Sequence aSN1Sequence = (ASN1Sequence) new ASN1InputStream(inputStream).readObject();
        if (aSN1Sequence.size() <= 1 || !(aSN1Sequence.getObjectAt(0) instanceof ASN1ObjectIdentifier) || !aSN1Sequence.getObjectAt(0).equals(PKCSObjectIdentifiers.signedData)) {
            return new X509CRLObject(CertificateList.getInstance(aSN1Sequence));
        }
        this.f90454a = new SignedData(ASN1Sequence.getInstance((ASN1TaggedObject) aSN1Sequence.getObjectAt(1), true)).getCRLs();
        return a();
    }

    @Override // org.bouncycastle.x509.X509StreamParserSpi
    public void engineInit(InputStream inputStream) {
        this.f90456c = inputStream;
        this.f90454a = null;
        this.f90455b = 0;
        if (inputStream.markSupported()) {
            return;
        }
        this.f90456c = new BufferedInputStream(this.f90456c);
    }

    @Override // org.bouncycastle.x509.X509StreamParserSpi
    public Object engineRead() throws StreamParsingException {
        try {
            ASN1Set aSN1Set = this.f90454a;
            if (aSN1Set != null) {
                if (this.f90455b != aSN1Set.size()) {
                    return a();
                }
                this.f90454a = null;
                this.f90455b = 0;
                return null;
            }
            this.f90456c.mark(10);
            int i10 = this.f90456c.read();
            if (i10 == -1) {
                return null;
            }
            if (i10 == 48) {
                this.f90456c.reset();
                return b(this.f90456c);
            }
            this.f90456c.reset();
            ASN1Sequence aSN1SequenceB = f90453d.b(this.f90456c);
            if (aSN1SequenceB != null) {
                return new X509CRLObject(CertificateList.getInstance(aSN1SequenceB));
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
            CRL crl = (CRL) engineRead();
            if (crl == null) {
                return arrayList;
            }
            arrayList.add(crl);
        }
    }
}
