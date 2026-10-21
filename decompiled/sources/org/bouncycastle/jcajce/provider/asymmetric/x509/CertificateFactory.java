package org.bouncycastle.jcajce.provider.asymmetric.x509;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.security.cert.CRL;
import java.security.cert.CRLException;
import java.security.cert.CertPath;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactorySpi;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.SignedData;
import org.bouncycastle.asn1.x509.Certificate;
import org.bouncycastle.asn1.x509.CertificateList;
import org.bouncycastle.jcajce.util.BCJcaJceHelper;
import org.bouncycastle.util.io.Streams;
import pm.b;
import pm.f;
import pm.i;

/* JADX INFO: loaded from: classes8.dex */
public class CertificateFactory extends CertificateFactorySpi {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f90035h = new b("CERTIFICATE");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final b f90036i = new b("CRL");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BCJcaJceHelper f90037a = new BCJcaJceHelper();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ASN1Set f90038b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f90039c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InputStream f90040d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ASN1Set f90041e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f90042f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public InputStream f90043g = null;

    public class a extends CertificateException {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public Throwable f90044p0;

        @Override // java.lang.Throwable
        public final Throwable getCause() {
            return this.f90044p0;
        }
    }

    static {
        new b("PKCS7");
    }

    public final CRL a() throws CRLException {
        ASN1Set aSN1Set = this.f90041e;
        if (aSN1Set == null || this.f90042f >= aSN1Set.size()) {
            return null;
        }
        ASN1Set aSN1Set2 = this.f90041e;
        int i10 = this.f90042f;
        this.f90042f = i10 + 1;
        return createCRL(CertificateList.getInstance(aSN1Set2.getObjectAt(i10)));
    }

    public final CRL b(ASN1Sequence aSN1Sequence) throws CRLException {
        if (aSN1Sequence == null) {
            return null;
        }
        if (aSN1Sequence.size() <= 1 || !(aSN1Sequence.getObjectAt(0) instanceof ASN1ObjectIdentifier) || !aSN1Sequence.getObjectAt(0).equals(PKCSObjectIdentifiers.signedData)) {
            return createCRL(CertificateList.getInstance(aSN1Sequence));
        }
        this.f90041e = SignedData.getInstance(ASN1Sequence.getInstance((ASN1TaggedObject) aSN1Sequence.getObjectAt(1), true)).getCRLs();
        return a();
    }

    public final i c() throws CertificateParsingException {
        if (this.f90038b == null) {
            return null;
        }
        while (this.f90039c < this.f90038b.size()) {
            ASN1Set aSN1Set = this.f90038b;
            int i10 = this.f90039c;
            this.f90039c = i10 + 1;
            ASN1Encodable objectAt = aSN1Set.getObjectAt(i10);
            if (objectAt instanceof ASN1Sequence) {
                return new i(this.f90037a, Certificate.getInstance(objectAt));
            }
        }
        return null;
    }

    public CRL createCRL(CertificateList certificateList) throws CRLException {
        return new f(this.f90037a, certificateList);
    }

    public final i d(ASN1Sequence aSN1Sequence) throws CertificateParsingException {
        if (aSN1Sequence == null) {
            return null;
        }
        if (aSN1Sequence.size() <= 1 || !(aSN1Sequence.getObjectAt(0) instanceof ASN1ObjectIdentifier) || !aSN1Sequence.getObjectAt(0).equals(PKCSObjectIdentifiers.signedData)) {
            return new i(this.f90037a, Certificate.getInstance(aSN1Sequence));
        }
        this.f90038b = SignedData.getInstance(ASN1Sequence.getInstance((ASN1TaggedObject) aSN1Sequence.getObjectAt(1), true)).getCertificates();
        return c();
    }

    @Override // java.security.cert.CertificateFactorySpi
    public CRL engineGenerateCRL(InputStream inputStream) throws CRLException {
        InputStream inputStream2 = this.f90043g;
        if (inputStream2 == null || inputStream2 != inputStream) {
            this.f90043g = inputStream;
            this.f90041e = null;
            this.f90042f = 0;
        }
        try {
            ASN1Set aSN1Set = this.f90041e;
            if (aSN1Set != null) {
                if (this.f90042f != aSN1Set.size()) {
                    return a();
                }
                this.f90041e = null;
                this.f90042f = 0;
                return null;
            }
            if (!inputStream.markSupported()) {
                inputStream = new ByteArrayInputStream(Streams.readAll(inputStream));
            }
            inputStream.mark(1);
            int i10 = inputStream.read();
            if (i10 == -1) {
                return null;
            }
            inputStream.reset();
            return i10 != 48 ? b(f90036i.c(inputStream)) : b(ASN1Sequence.getInstance(new ASN1InputStream(inputStream, true).readObject()));
        } catch (CRLException e5) {
            throw e5;
        } catch (Exception e7) {
            throw new CRLException(e7.toString());
        }
    }

    @Override // java.security.cert.CertificateFactorySpi
    public Collection engineGenerateCRLs(InputStream inputStream) throws CRLException {
        ArrayList arrayList = new ArrayList();
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        while (true) {
            CRL crlEngineGenerateCRL = engineGenerateCRL(bufferedInputStream);
            if (crlEngineGenerateCRL == null) {
                return arrayList;
            }
            arrayList.add(crlEngineGenerateCRL);
        }
    }

    @Override // java.security.cert.CertificateFactorySpi
    public CertPath engineGenerateCertPath(InputStream inputStream) throws CertificateException {
        return engineGenerateCertPath(inputStream, "PkiPath");
    }

    @Override // java.security.cert.CertificateFactorySpi
    public java.security.cert.Certificate engineGenerateCertificate(InputStream inputStream) throws CertificateException {
        InputStream inputStream2 = this.f90040d;
        if (inputStream2 == null || inputStream2 != inputStream) {
            this.f90040d = inputStream;
            this.f90038b = null;
            this.f90039c = 0;
        }
        try {
            ASN1Set aSN1Set = this.f90038b;
            if (aSN1Set != null) {
                if (this.f90039c != aSN1Set.size()) {
                    return c();
                }
                this.f90038b = null;
                this.f90039c = 0;
                return null;
            }
            if (!inputStream.markSupported()) {
                inputStream = new ByteArrayInputStream(Streams.readAll(inputStream));
            }
            inputStream.mark(1);
            int i10 = inputStream.read();
            if (i10 == -1) {
                return null;
            }
            inputStream.reset();
            return i10 != 48 ? d(f90035h.c(inputStream)) : d(ASN1Sequence.getInstance(new ASN1InputStream(inputStream).readObject()));
        } catch (Exception e5) {
            a aVar = new a(ci.a.b(e5, new StringBuilder("parsing issue: ")));
            aVar.f90044p0 = e5;
            throw aVar;
        }
    }

    @Override // java.security.cert.CertificateFactorySpi
    public Collection engineGenerateCertificates(InputStream inputStream) throws CertificateException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        ArrayList arrayList = new ArrayList();
        while (true) {
            java.security.cert.Certificate certificateEngineGenerateCertificate = engineGenerateCertificate(bufferedInputStream);
            if (certificateEngineGenerateCertificate == null) {
                return arrayList;
            }
            arrayList.add(certificateEngineGenerateCertificate);
        }
    }

    @Override // java.security.cert.CertificateFactorySpi
    public Iterator engineGetCertPathEncodings() {
        return PKIXCertPath.f90045q0.iterator();
    }

    @Override // java.security.cert.CertificateFactorySpi
    public CertPath engineGenerateCertPath(InputStream inputStream, String str) throws CertificateException {
        return new PKIXCertPath(inputStream, str);
    }

    @Override // java.security.cert.CertificateFactorySpi
    public CertPath engineGenerateCertPath(List list) throws CertificateException {
        for (Object obj : list) {
            if (obj != null && !(obj instanceof X509Certificate)) {
                throw new CertificateException("list contains non X509Certificate object while creating CertPath\n" + obj.toString());
            }
        }
        return new PKIXCertPath(list);
    }
}
