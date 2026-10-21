package org.bouncycastle.x509;

import java.io.IOException;
import java.security.Principal;
import java.security.cert.CertSelector;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.AttCertIssuer;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.asn1.x509.GeneralNames;
import org.bouncycastle.asn1.x509.V2Form;
import org.bouncycastle.jce.X509Principal;
import org.bouncycastle.util.Selector;

/* JADX INFO: loaded from: classes13.dex */
public class AttributeCertificateIssuer implements CertSelector, Selector {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ASN1Encodable f91685p0;

    public AttributeCertificateIssuer(X500Principal x500Principal) throws IOException {
        this(new X509Principal(x500Principal.getEncoded()));
    }

    public static boolean a(X500Principal x500Principal, GeneralNames generalNames) {
        GeneralName[] names = generalNames.getNames();
        for (int i10 = 0; i10 != names.length; i10++) {
            GeneralName generalName = names[i10];
            if (generalName.getTagNo() == 4) {
                try {
                    if (new X500Principal(generalName.getName().toASN1Primitive().getEncoded()).equals(x500Principal)) {
                        return true;
                    }
                } catch (IOException unused) {
                    continue;
                }
            }
        }
        return false;
    }

    @Override // java.security.cert.CertSelector, org.bouncycastle.util.Selector
    public Object clone() {
        return new AttributeCertificateIssuer(AttCertIssuer.getInstance(this.f91685p0));
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AttributeCertificateIssuer) {
            return this.f91685p0.equals(((AttributeCertificateIssuer) obj).f91685p0);
        }
        return false;
    }

    public Principal[] getPrincipals() {
        ASN1Encodable aSN1Encodable = this.f91685p0;
        GeneralName[] names = (aSN1Encodable instanceof V2Form ? ((V2Form) aSN1Encodable).getIssuerName() : (GeneralNames) aSN1Encodable).getNames();
        ArrayList arrayList = new ArrayList(names.length);
        for (int i10 = 0; i10 != names.length; i10++) {
            if (names[i10].getTagNo() == 4) {
                try {
                    arrayList.add(new X500Principal(names[i10].getName().toASN1Primitive().getEncoded()));
                } catch (IOException unused) {
                    throw new RuntimeException("badly formed Name object");
                }
            }
        }
        Object[] array = arrayList.toArray(new Object[arrayList.size()]);
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = 0; i11 != array.length; i11++) {
            Object obj = array[i11];
            if (obj instanceof Principal) {
                arrayList2.add(obj);
            }
        }
        return (Principal[]) arrayList2.toArray(new Principal[arrayList2.size()]);
    }

    public int hashCode() {
        return this.f91685p0.hashCode();
    }

    @Override // org.bouncycastle.util.Selector
    public boolean match(Object obj) {
        if (obj instanceof X509Certificate) {
            return match((Certificate) obj);
        }
        return false;
    }

    public AttributeCertificateIssuer(AttCertIssuer attCertIssuer) {
        this.f91685p0 = attCertIssuer.getIssuer();
    }

    @Override // java.security.cert.CertSelector
    public boolean match(Certificate certificate) {
        if (!(certificate instanceof X509Certificate)) {
            return false;
        }
        X509Certificate x509Certificate = (X509Certificate) certificate;
        ASN1Encodable aSN1Encodable = this.f91685p0;
        if (aSN1Encodable instanceof V2Form) {
            V2Form v2Form = (V2Form) aSN1Encodable;
            if (v2Form.getBaseCertificateID() != null) {
                return v2Form.getBaseCertificateID().getSerial().hasValue(x509Certificate.getSerialNumber()) && a(x509Certificate.getIssuerX500Principal(), v2Form.getBaseCertificateID().getIssuer());
            }
            if (a(x509Certificate.getSubjectX500Principal(), v2Form.getIssuerName())) {
                return true;
            }
        } else {
            if (a(x509Certificate.getSubjectX500Principal(), (GeneralNames) aSN1Encodable)) {
                return true;
            }
        }
        return false;
    }

    public AttributeCertificateIssuer(X509Principal x509Principal) {
        this.f91685p0 = new V2Form(GeneralNames.getInstance(new DERSequence(new GeneralName(x509Principal))));
    }
}
