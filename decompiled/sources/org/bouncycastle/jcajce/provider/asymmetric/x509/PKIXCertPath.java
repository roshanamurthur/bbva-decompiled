package org.bouncycastle.jcajce.provider.asymmetric.x509;

import ad.e;
import androidx.appcompat.view.menu.b;
import com.bbva.ethermobilesdk.pinning.constant.ConstantKt;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.security.NoSuchProviderException;
import java.security.cert.CertPath;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERSet;
import org.bouncycastle.asn1.pkcs.ContentInfo;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.SignedData;
import org.bouncycastle.jcajce.util.BCJcaJceHelper;
import org.bouncycastle.util.io.pem.PemObject;
import org.bouncycastle.util.io.pem.PemWriter;

/* JADX INFO: loaded from: classes8.dex */
public class PKIXCertPath extends CertPath {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final List f90045q0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final List f90046p0;

    static {
        ArrayList arrayList = new ArrayList();
        arrayList.add("PkiPath");
        arrayList.add("PEM");
        arrayList.add("PKCS7");
        f90045q0 = Collections.unmodifiableList(arrayList);
    }

    public PKIXCertPath(InputStream inputStream, String str) throws CertificateException {
        super(ConstantKt.CERTIFICATE_TYPE_X509);
        BCJcaJceHelper bCJcaJceHelper = new BCJcaJceHelper();
        try {
            if (!str.equalsIgnoreCase("PkiPath")) {
                if (!str.equalsIgnoreCase("PKCS7") && !str.equalsIgnoreCase("PEM")) {
                    throw new CertificateException("unsupported encoding: ".concat(str));
                }
                BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
                this.f90046p0 = new ArrayList();
                java.security.cert.CertificateFactory certificateFactoryCreateCertificateFactory = bCJcaJceHelper.createCertificateFactory(ConstantKt.CERTIFICATE_TYPE_X509);
                while (true) {
                    Certificate certificateGenerateCertificate = certificateFactoryCreateCertificateFactory.generateCertificate(bufferedInputStream);
                    if (certificateGenerateCertificate == null) {
                        break;
                    } else {
                        this.f90046p0.add(certificateGenerateCertificate);
                    }
                }
            } else {
                ASN1Primitive object = new ASN1InputStream(inputStream).readObject();
                if (!(object instanceof ASN1Sequence)) {
                    throw new CertificateException("input stream does not contain a ASN1 SEQUENCE while reading PkiPath encoded data to load CertPath");
                }
                Enumeration objects = ((ASN1Sequence) object).getObjects();
                this.f90046p0 = new ArrayList();
                java.security.cert.CertificateFactory certificateFactoryCreateCertificateFactory2 = bCJcaJceHelper.createCertificateFactory(ConstantKt.CERTIFICATE_TYPE_X509);
                while (objects.hasMoreElements()) {
                    this.f90046p0.add(0, certificateFactoryCreateCertificateFactory2.generateCertificate(new ByteArrayInputStream(((ASN1Encodable) objects.nextElement()).toASN1Primitive().getEncoded(ASN1Encoding.DER))));
                }
            }
            this.f90046p0 = a(this.f90046p0);
        } catch (IOException e5) {
            throw new CertificateException("IOException throw while decoding CertPath:\n" + e5.toString());
        } catch (NoSuchProviderException e7) {
            throw new CertificateException("BouncyCastle provider not found while trying to get a CertificateFactory:\n" + e7.toString());
        }
    }

    public static List a(List list) {
        if (list.size() < 2) {
            return list;
        }
        X500Principal issuerX500Principal = ((X509Certificate) list.get(0)).getIssuerX500Principal();
        for (int i10 = 1; i10 != list.size(); i10++) {
            if (!issuerX500Principal.equals(((X509Certificate) list.get(i10)).getSubjectX500Principal())) {
                ArrayList arrayList = new ArrayList(list.size());
                ArrayList arrayList2 = new ArrayList(list);
                for (int i11 = 0; i11 < list.size(); i11++) {
                    X509Certificate x509Certificate = (X509Certificate) list.get(i11);
                    X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
                    int i12 = 0;
                    while (true) {
                        if (i12 == list.size()) {
                            arrayList.add(x509Certificate);
                            list.remove(i11);
                            break;
                        }
                        if (((X509Certificate) list.get(i12)).getIssuerX500Principal().equals(subjectX500Principal)) {
                            break;
                        }
                        i12++;
                    }
                }
                if (arrayList.size() > 1) {
                    return arrayList2;
                }
                for (int i13 = 0; i13 != arrayList.size(); i13++) {
                    X500Principal issuerX500Principal2 = ((X509Certificate) arrayList.get(i13)).getIssuerX500Principal();
                    for (int i14 = 0; i14 < list.size(); i14++) {
                        X509Certificate x509Certificate2 = (X509Certificate) list.get(i14);
                        if (issuerX500Principal2.equals(x509Certificate2.getSubjectX500Principal())) {
                            arrayList.add(x509Certificate2);
                            list.remove(i14);
                            break;
                        }
                    }
                }
                return list.size() > 0 ? arrayList2 : arrayList;
            }
            issuerX500Principal = ((X509Certificate) list.get(i10)).getIssuerX500Principal();
        }
        return list;
    }

    public static ASN1Primitive b(X509Certificate x509Certificate) throws CertificateEncodingException {
        try {
            return new ASN1InputStream(x509Certificate.getEncoded()).readObject();
        } catch (Exception e5) {
            throw new CertificateEncodingException(b.c(e5, new StringBuilder("Exception while encoding certificate: ")));
        }
    }

    public static byte[] c(ASN1Object aSN1Object) throws CertificateEncodingException {
        try {
            return aSN1Object.toASN1Primitive().getEncoded(ASN1Encoding.DER);
        } catch (IOException e5) {
            throw new CertificateEncodingException(e.d("Exception thrown: ", e5));
        }
    }

    @Override // java.security.cert.CertPath
    public List getCertificates() {
        return Collections.unmodifiableList(new ArrayList(this.f90046p0));
    }

    @Override // java.security.cert.CertPath
    public byte[] getEncoded() throws CertificateEncodingException {
        Iterator encodings = getEncodings();
        if (!encodings.hasNext()) {
            return null;
        }
        Object next = encodings.next();
        if (next instanceof String) {
            return getEncoded((String) next);
        }
        return null;
    }

    @Override // java.security.cert.CertPath
    public Iterator getEncodings() {
        return f90045q0.iterator();
    }

    public PKIXCertPath(List list) {
        super(ConstantKt.CERTIFICATE_TYPE_X509);
        new BCJcaJceHelper();
        this.f90046p0 = a(new ArrayList(list));
    }

    @Override // java.security.cert.CertPath
    public byte[] getEncoded(String str) throws CertificateEncodingException {
        boolean zEqualsIgnoreCase = str.equalsIgnoreCase("PkiPath");
        List list = this.f90046p0;
        if (zEqualsIgnoreCase) {
            ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
            ListIterator listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                aSN1EncodableVector.add(b((X509Certificate) listIterator.previous()));
            }
            return c(new DERSequence(aSN1EncodableVector));
        }
        int i10 = 0;
        if (str.equalsIgnoreCase("PKCS7")) {
            ContentInfo contentInfo = new ContentInfo(PKCSObjectIdentifiers.data, null);
            ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
            while (i10 != list.size()) {
                aSN1EncodableVector2.add(b((X509Certificate) list.get(i10)));
                i10++;
            }
            return c(new ContentInfo(PKCSObjectIdentifiers.signedData, new SignedData(new ASN1Integer(1L), new DERSet(), contentInfo, new DERSet(aSN1EncodableVector2), null, new DERSet())));
        }
        if (!str.equalsIgnoreCase("PEM")) {
            throw new CertificateEncodingException("unsupported encoding: ".concat(str));
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PemWriter pemWriter = new PemWriter(new OutputStreamWriter(byteArrayOutputStream));
        while (i10 != list.size()) {
            try {
                pemWriter.writeObject(new PemObject("CERTIFICATE", ((X509Certificate) list.get(i10)).getEncoded()));
                i10++;
            } catch (Exception unused) {
                throw new CertificateEncodingException("can't encode certificate for PEM encoded path");
            }
        }
        pemWriter.close();
        return byteArrayOutputStream.toByteArray();
    }
}
