package org.bouncycastle.asn1.pkcs;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x509.X509Name;

/* JADX INFO: loaded from: classes12.dex */
public class CertificationRequestInfo extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ASN1Integer f87383p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final X500Name f87384q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final SubjectPublicKeyInfo f87385r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final ASN1Set f87386s0;

    public CertificationRequestInfo(ASN1Sequence aSN1Sequence) {
        this.f87383p0 = new ASN1Integer(0L);
        this.f87386s0 = null;
        ASN1Integer aSN1Integer = (ASN1Integer) aSN1Sequence.getObjectAt(0);
        this.f87383p0 = aSN1Integer;
        X500Name x500Name = X500Name.getInstance(aSN1Sequence.getObjectAt(1));
        this.f87384q0 = x500Name;
        SubjectPublicKeyInfo subjectPublicKeyInfo = SubjectPublicKeyInfo.getInstance(aSN1Sequence.getObjectAt(2));
        this.f87385r0 = subjectPublicKeyInfo;
        if (aSN1Sequence.size() > 3) {
            this.f87386s0 = ASN1Set.getInstance((ASN1TaggedObject) aSN1Sequence.getObjectAt(3), false);
        }
        a(this.f87386s0);
        if (x500Name == null || aSN1Integer == null || subjectPublicKeyInfo == null) {
            throw new IllegalArgumentException("Not all mandatory fields set in CertificationRequestInfo generator.");
        }
    }

    public static void a(ASN1Set aSN1Set) {
        if (aSN1Set == null) {
            return;
        }
        Enumeration objects = aSN1Set.getObjects();
        while (objects.hasMoreElements()) {
            Attribute attribute = Attribute.getInstance(objects.nextElement());
            if (attribute.getAttrType().equals((ASN1Primitive) PKCSObjectIdentifiers.pkcs_9_at_challengePassword) && attribute.getAttrValues().size() != 1) {
                throw new IllegalArgumentException("challengePassword attribute must have one value");
            }
        }
    }

    public static CertificationRequestInfo getInstance(Object obj) {
        if (obj instanceof CertificationRequestInfo) {
            return (CertificationRequestInfo) obj;
        }
        if (obj != null) {
            return new CertificationRequestInfo(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public ASN1Set getAttributes() {
        return this.f87386s0;
    }

    public X500Name getSubject() {
        return this.f87384q0;
    }

    public SubjectPublicKeyInfo getSubjectPublicKeyInfo() {
        return this.f87385r0;
    }

    public ASN1Integer getVersion() {
        return this.f87383p0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(4);
        aSN1EncodableVector.add(this.f87383p0);
        aSN1EncodableVector.add(this.f87384q0);
        aSN1EncodableVector.add(this.f87385r0);
        ASN1Set aSN1Set = this.f87386s0;
        if (aSN1Set != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 0, aSN1Set));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public CertificationRequestInfo(X500Name x500Name, SubjectPublicKeyInfo subjectPublicKeyInfo, ASN1Set aSN1Set) {
        this.f87383p0 = new ASN1Integer(0L);
        this.f87386s0 = null;
        if (x500Name == null || subjectPublicKeyInfo == null) {
            throw new IllegalArgumentException("Not all mandatory fields set in CertificationRequestInfo generator.");
        }
        a(aSN1Set);
        this.f87384q0 = x500Name;
        this.f87385r0 = subjectPublicKeyInfo;
        this.f87386s0 = aSN1Set;
    }

    public CertificationRequestInfo(X509Name x509Name, SubjectPublicKeyInfo subjectPublicKeyInfo, ASN1Set aSN1Set) {
        this(X500Name.getInstance(x509Name.toASN1Primitive()), subjectPublicKeyInfo, aSN1Set);
    }
}
