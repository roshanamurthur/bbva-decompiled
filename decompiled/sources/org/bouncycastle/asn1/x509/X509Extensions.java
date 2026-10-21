package org.bouncycastle.asn1.x509;

import androidx.databinding.c;
import androidx.emoji2.text.flatbuffer.a;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import okhttp3.tls.internal.der.ObjectIdentifiers;
import org.bouncycastle.asn1.ASN1Boolean;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes12.dex */
public class X509Extensions extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Hashtable f87770p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Vector f87771q0;
    public static final ASN1ObjectIdentifier SubjectDirectoryAttributes = new ASN1ObjectIdentifier("2.5.29.9");
    public static final ASN1ObjectIdentifier SubjectKeyIdentifier = new ASN1ObjectIdentifier("2.5.29.14");
    public static final ASN1ObjectIdentifier KeyUsage = new ASN1ObjectIdentifier("2.5.29.15");
    public static final ASN1ObjectIdentifier PrivateKeyUsagePeriod = new ASN1ObjectIdentifier("2.5.29.16");
    public static final ASN1ObjectIdentifier SubjectAlternativeName = new ASN1ObjectIdentifier(ObjectIdentifiers.subjectAlternativeName);
    public static final ASN1ObjectIdentifier IssuerAlternativeName = new ASN1ObjectIdentifier("2.5.29.18");
    public static final ASN1ObjectIdentifier BasicConstraints = new ASN1ObjectIdentifier(ObjectIdentifiers.basicConstraints);
    public static final ASN1ObjectIdentifier CRLNumber = new ASN1ObjectIdentifier("2.5.29.20");
    public static final ASN1ObjectIdentifier ReasonCode = new ASN1ObjectIdentifier("2.5.29.21");
    public static final ASN1ObjectIdentifier InstructionCode = new ASN1ObjectIdentifier("2.5.29.23");
    public static final ASN1ObjectIdentifier InvalidityDate = new ASN1ObjectIdentifier("2.5.29.24");
    public static final ASN1ObjectIdentifier DeltaCRLIndicator = new ASN1ObjectIdentifier("2.5.29.27");
    public static final ASN1ObjectIdentifier IssuingDistributionPoint = new ASN1ObjectIdentifier("2.5.29.28");
    public static final ASN1ObjectIdentifier CertificateIssuer = new ASN1ObjectIdentifier("2.5.29.29");
    public static final ASN1ObjectIdentifier NameConstraints = new ASN1ObjectIdentifier("2.5.29.30");
    public static final ASN1ObjectIdentifier CRLDistributionPoints = new ASN1ObjectIdentifier("2.5.29.31");
    public static final ASN1ObjectIdentifier CertificatePolicies = new ASN1ObjectIdentifier("2.5.29.32");
    public static final ASN1ObjectIdentifier PolicyMappings = new ASN1ObjectIdentifier("2.5.29.33");
    public static final ASN1ObjectIdentifier AuthorityKeyIdentifier = new ASN1ObjectIdentifier("2.5.29.35");
    public static final ASN1ObjectIdentifier PolicyConstraints = new ASN1ObjectIdentifier("2.5.29.36");
    public static final ASN1ObjectIdentifier ExtendedKeyUsage = new ASN1ObjectIdentifier("2.5.29.37");
    public static final ASN1ObjectIdentifier FreshestCRL = new ASN1ObjectIdentifier("2.5.29.46");
    public static final ASN1ObjectIdentifier InhibitAnyPolicy = new ASN1ObjectIdentifier("2.5.29.54");
    public static final ASN1ObjectIdentifier AuthorityInfoAccess = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.1.1");
    public static final ASN1ObjectIdentifier SubjectInfoAccess = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.1.11");
    public static final ASN1ObjectIdentifier LogoType = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.1.12");
    public static final ASN1ObjectIdentifier BiometricInfo = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.1.2");
    public static final ASN1ObjectIdentifier QCStatements = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.1.3");
    public static final ASN1ObjectIdentifier AuditIdentity = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.1.4");
    public static final ASN1ObjectIdentifier NoRevAvail = new ASN1ObjectIdentifier("2.5.29.56");
    public static final ASN1ObjectIdentifier TargetInformation = new ASN1ObjectIdentifier("2.5.29.55");

    public X509Extensions(Hashtable hashtable) {
        this((Vector) null, hashtable);
    }

    public static X509Extensions getInstance(Object obj) {
        if (obj == null || (obj instanceof X509Extensions)) {
            return (X509Extensions) obj;
        }
        if (obj instanceof ASN1Sequence) {
            return new X509Extensions((ASN1Sequence) obj);
        }
        if (obj instanceof Extensions) {
            return new X509Extensions((ASN1Sequence) ((Extensions) obj).toASN1Primitive());
        }
        if (obj instanceof ASN1TaggedObject) {
            return getInstance(((ASN1TaggedObject) obj).getObject());
        }
        throw new IllegalArgumentException(a.c(obj, "illegal object in getInstance: "));
    }

    public final ASN1ObjectIdentifier[] a(boolean z10) {
        Vector vector = new Vector();
        int i10 = 0;
        while (true) {
            Vector vector2 = this.f87771q0;
            if (i10 == vector2.size()) {
                break;
            }
            Object objElementAt = vector2.elementAt(i10);
            if (((X509Extension) this.f87770p0.get(objElementAt)).isCritical() == z10) {
                vector.addElement(objElementAt);
            }
            i10++;
        }
        int size = vector.size();
        ASN1ObjectIdentifier[] aSN1ObjectIdentifierArr = new ASN1ObjectIdentifier[size];
        for (int i11 = 0; i11 != size; i11++) {
            aSN1ObjectIdentifierArr[i11] = (ASN1ObjectIdentifier) vector.elementAt(i11);
        }
        return aSN1ObjectIdentifierArr;
    }

    public boolean equivalent(X509Extensions x509Extensions) {
        Hashtable hashtable = this.f87770p0;
        if (hashtable.size() != x509Extensions.f87770p0.size()) {
            return false;
        }
        Enumeration enumerationKeys = hashtable.keys();
        while (enumerationKeys.hasMoreElements()) {
            Object objNextElement = enumerationKeys.nextElement();
            if (!hashtable.get(objNextElement).equals(x509Extensions.f87770p0.get(objNextElement))) {
                return false;
            }
        }
        return true;
    }

    public ASN1ObjectIdentifier[] getCriticalExtensionOIDs() {
        return a(true);
    }

    public X509Extension getExtension(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (X509Extension) this.f87770p0.get(aSN1ObjectIdentifier);
    }

    public ASN1ObjectIdentifier[] getExtensionOIDs() {
        Vector vector = this.f87771q0;
        int size = vector.size();
        ASN1ObjectIdentifier[] aSN1ObjectIdentifierArr = new ASN1ObjectIdentifier[size];
        for (int i10 = 0; i10 != size; i10++) {
            aSN1ObjectIdentifierArr[i10] = (ASN1ObjectIdentifier) vector.elementAt(i10);
        }
        return aSN1ObjectIdentifierArr;
    }

    public ASN1ObjectIdentifier[] getNonCriticalExtensionOIDs() {
        return a(false);
    }

    public Enumeration oids() {
        return this.f87771q0.elements();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        Vector vector = this.f87771q0;
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(vector.size());
        Enumeration enumerationElements = vector.elements();
        while (enumerationElements.hasMoreElements()) {
            ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector(3);
            ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) enumerationElements.nextElement();
            X509Extension x509Extension = (X509Extension) this.f87770p0.get(aSN1ObjectIdentifier);
            aSN1EncodableVector2.add(aSN1ObjectIdentifier);
            if (x509Extension.isCritical()) {
                aSN1EncodableVector2.add(ASN1Boolean.TRUE);
            }
            aSN1EncodableVector2.add(x509Extension.getValue());
            aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector2));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public X509Extensions(Vector vector, Hashtable hashtable) {
        this.f87770p0 = new Hashtable();
        this.f87771q0 = new Vector();
        Enumeration enumerationKeys = vector == null ? hashtable.keys() : vector.elements();
        while (enumerationKeys.hasMoreElements()) {
            this.f87771q0.addElement(ASN1ObjectIdentifier.getInstance(enumerationKeys.nextElement()));
        }
        Enumeration enumerationElements = this.f87771q0.elements();
        while (enumerationElements.hasMoreElements()) {
            ASN1ObjectIdentifier aSN1ObjectIdentifier = ASN1ObjectIdentifier.getInstance(enumerationElements.nextElement());
            this.f87770p0.put(aSN1ObjectIdentifier, (X509Extension) hashtable.get(aSN1ObjectIdentifier));
        }
    }

    public X509Extensions(Vector vector, Vector vector2) {
        this.f87770p0 = new Hashtable();
        this.f87771q0 = new Vector();
        Enumeration enumerationElements = vector.elements();
        while (enumerationElements.hasMoreElements()) {
            this.f87771q0.addElement(enumerationElements.nextElement());
        }
        Enumeration enumerationElements2 = this.f87771q0.elements();
        int i10 = 0;
        while (enumerationElements2.hasMoreElements()) {
            this.f87770p0.put((ASN1ObjectIdentifier) enumerationElements2.nextElement(), (X509Extension) vector2.elementAt(i10));
            i10++;
        }
    }

    public X509Extensions(ASN1Sequence aSN1Sequence) {
        this.f87770p0 = new Hashtable();
        this.f87771q0 = new Vector();
        Enumeration objects = aSN1Sequence.getObjects();
        while (objects.hasMoreElements()) {
            ASN1Sequence aSN1Sequence2 = ASN1Sequence.getInstance(objects.nextElement());
            if (aSN1Sequence2.size() == 3) {
                this.f87770p0.put(aSN1Sequence2.getObjectAt(0), new X509Extension(ASN1Boolean.getInstance(aSN1Sequence2.getObjectAt(1)), ASN1OctetString.getInstance(aSN1Sequence2.getObjectAt(2))));
            } else {
                if (aSN1Sequence2.size() != 2) {
                    throw new IllegalArgumentException(c.d(aSN1Sequence2, new StringBuilder("Bad sequence size: ")));
                }
                this.f87770p0.put(aSN1Sequence2.getObjectAt(0), new X509Extension(false, ASN1OctetString.getInstance(aSN1Sequence2.getObjectAt(1))));
            }
            this.f87771q0.addElement(aSN1Sequence2.getObjectAt(0));
        }
    }

    public static X509Extensions getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z10));
    }
}
