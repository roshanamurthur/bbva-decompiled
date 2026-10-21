package org.bouncycastle.asn1.crmf;

import androidx.camera.core.impl.utils.b;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.Extensions;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;

/* JADX INFO: loaded from: classes12.dex */
public class CertTemplate extends ASN1Object {
    public Extensions E0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1Sequence f87010p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ASN1Integer f87011q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public ASN1Integer f87012r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public AlgorithmIdentifier f87013s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public X500Name f87014t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public OptionalValidity f87015u0;
    public X500Name v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public SubjectPublicKeyInfo f87016w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public DERBitString f87017x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public DERBitString f87018y0;

    public static CertTemplate getInstance(Object obj) {
        if (obj instanceof CertTemplate) {
            return (CertTemplate) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        CertTemplate certTemplate = new CertTemplate();
        certTemplate.f87010p0 = aSN1Sequence;
        Enumeration objects = aSN1Sequence.getObjects();
        while (objects.hasMoreElements()) {
            ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) objects.nextElement();
            switch (aSN1TaggedObject.getTagNo()) {
                case 0:
                    certTemplate.f87011q0 = ASN1Integer.getInstance(aSN1TaggedObject, false);
                    break;
                case 1:
                    certTemplate.f87012r0 = ASN1Integer.getInstance(aSN1TaggedObject, false);
                    break;
                case 2:
                    certTemplate.f87013s0 = AlgorithmIdentifier.getInstance(aSN1TaggedObject, false);
                    break;
                case 3:
                    certTemplate.f87014t0 = X500Name.getInstance(aSN1TaggedObject, true);
                    break;
                case 4:
                    certTemplate.f87015u0 = OptionalValidity.getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, false));
                    break;
                case 5:
                    certTemplate.v0 = X500Name.getInstance(aSN1TaggedObject, true);
                    break;
                case 6:
                    certTemplate.f87016w0 = SubjectPublicKeyInfo.getInstance(aSN1TaggedObject, false);
                    break;
                case 7:
                    certTemplate.f87017x0 = DERBitString.getInstance(aSN1TaggedObject, false);
                    break;
                case 8:
                    certTemplate.f87018y0 = DERBitString.getInstance(aSN1TaggedObject, false);
                    break;
                case 9:
                    certTemplate.E0 = Extensions.getInstance(aSN1TaggedObject, false);
                    break;
                default:
                    throw new IllegalArgumentException(b.c(aSN1TaggedObject, new StringBuilder("unknown tag: ")));
            }
        }
        return certTemplate;
    }

    public Extensions getExtensions() {
        return this.E0;
    }

    public X500Name getIssuer() {
        return this.f87014t0;
    }

    public DERBitString getIssuerUID() {
        return this.f87017x0;
    }

    public SubjectPublicKeyInfo getPublicKey() {
        return this.f87016w0;
    }

    public ASN1Integer getSerialNumber() {
        return this.f87012r0;
    }

    public AlgorithmIdentifier getSigningAlg() {
        return this.f87013s0;
    }

    public X500Name getSubject() {
        return this.v0;
    }

    public DERBitString getSubjectUID() {
        return this.f87018y0;
    }

    public OptionalValidity getValidity() {
        return this.f87015u0;
    }

    public int getVersion() {
        ASN1Integer aSN1Integer = this.f87011q0;
        if (aSN1Integer != null) {
            return aSN1Integer.intValueExact();
        }
        return -1;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.f87010p0;
    }
}
