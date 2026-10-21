package org.bouncycastle.asn1.x509;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes12.dex */
public class Extensions extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public Hashtable f87621p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public Vector f87622q0;

    public Extensions(Extension extension) {
        Hashtable hashtable = new Hashtable();
        this.f87621p0 = hashtable;
        Vector vector = new Vector();
        this.f87622q0 = vector;
        vector.addElement(extension.getExtnId());
        hashtable.put(extension.getExtnId(), extension);
    }

    public static Extensions getInstance(Object obj) {
        if (obj instanceof Extensions) {
            return (Extensions) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        Extensions extensions = new Extensions();
        extensions.f87621p0 = new Hashtable();
        extensions.f87622q0 = new Vector();
        Enumeration objects = aSN1Sequence.getObjects();
        while (objects.hasMoreElements()) {
            Extension extension = Extension.getInstance(objects.nextElement());
            Hashtable hashtable = extensions.f87621p0;
            if (hashtable.containsKey(extension.getExtnId())) {
                throw new IllegalArgumentException("repeated extension found: " + extension.getExtnId());
            }
            hashtable.put(extension.getExtnId(), extension);
            extensions.f87622q0.addElement(extension.getExtnId());
        }
        return extensions;
    }

    public final ASN1ObjectIdentifier[] a(boolean z10) {
        Vector vector = new Vector();
        int i10 = 0;
        while (true) {
            Vector vector2 = this.f87622q0;
            if (i10 == vector2.size()) {
                break;
            }
            Object objElementAt = vector2.elementAt(i10);
            if (((Extension) this.f87621p0.get(objElementAt)).isCritical() == z10) {
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

    public boolean equivalent(Extensions extensions) {
        Hashtable hashtable = this.f87621p0;
        if (hashtable.size() != extensions.f87621p0.size()) {
            return false;
        }
        Enumeration enumerationKeys = hashtable.keys();
        while (enumerationKeys.hasMoreElements()) {
            Object objNextElement = enumerationKeys.nextElement();
            if (!hashtable.get(objNextElement).equals(extensions.f87621p0.get(objNextElement))) {
                return false;
            }
        }
        return true;
    }

    public ASN1ObjectIdentifier[] getCriticalExtensionOIDs() {
        return a(true);
    }

    public Extension getExtension(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (Extension) this.f87621p0.get(aSN1ObjectIdentifier);
    }

    public ASN1ObjectIdentifier[] getExtensionOIDs() {
        Vector vector = this.f87622q0;
        int size = vector.size();
        ASN1ObjectIdentifier[] aSN1ObjectIdentifierArr = new ASN1ObjectIdentifier[size];
        for (int i10 = 0; i10 != size; i10++) {
            aSN1ObjectIdentifierArr[i10] = (ASN1ObjectIdentifier) vector.elementAt(i10);
        }
        return aSN1ObjectIdentifierArr;
    }

    public ASN1Encodable getExtensionParsedValue(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        Extension extension = getExtension(aSN1ObjectIdentifier);
        if (extension != null) {
            return extension.getParsedValue();
        }
        return null;
    }

    public ASN1ObjectIdentifier[] getNonCriticalExtensionOIDs() {
        return a(false);
    }

    public Enumeration oids() {
        return this.f87622q0.elements();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        Vector vector = this.f87622q0;
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(vector.size());
        Enumeration enumerationElements = vector.elements();
        while (enumerationElements.hasMoreElements()) {
            aSN1EncodableVector.add((Extension) this.f87621p0.get((ASN1ObjectIdentifier) enumerationElements.nextElement()));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public Extensions(Extension[] extensionArr) {
        this.f87621p0 = new Hashtable();
        this.f87622q0 = new Vector();
        for (int i10 = 0; i10 != extensionArr.length; i10++) {
            Extension extension = extensionArr[i10];
            this.f87622q0.addElement(extension.getExtnId());
            this.f87621p0.put(extension.getExtnId(), extension);
        }
    }

    public static Extension getExtension(Extensions extensions, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        if (extensions == null) {
            return null;
        }
        return extensions.getExtension(aSN1ObjectIdentifier);
    }

    public static ASN1Encodable getExtensionParsedValue(Extensions extensions, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        if (extensions == null) {
            return null;
        }
        return extensions.getExtensionParsedValue(aSN1ObjectIdentifier);
    }

    public static Extensions getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z10));
    }
}
