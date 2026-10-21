package org.bouncycastle.asn1.x509;

import java.util.Enumeration;
import java.util.Vector;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.DERUTF8String;

/* JADX INFO: loaded from: classes12.dex */
public class IetfAttrSyntax extends ASN1Object {
    public static final int VALUE_OCTETS = 1;
    public static final int VALUE_OID = 2;
    public static final int VALUE_UTF8 = 3;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public GeneralNames f87637p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public Vector f87638q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f87639r0;

    /* JADX WARN: Code duplicated, block: B:17:0x004f  */
    /* JADX WARN: Code duplicated, block: B:20:0x005f  */
    /* JADX WARN: Code duplicated, block: B:22:0x0069  */
    /* JADX WARN: Code duplicated, block: B:23:0x006b  */
    /* JADX WARN: Code duplicated, block: B:25:0x006f  */
    /* JADX WARN: Code duplicated, block: B:26:0x0071  */
    /* JADX WARN: Code duplicated, block: B:28:0x0075  */
    /* JADX WARN: Code duplicated, block: B:31:0x007a  */
    /* JADX WARN: Code duplicated, block: B:33:0x007e A[LOOP:0: B:18:0x0059->B:33:0x007e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:39:0x0095  */
    /* JADX WARN: Code duplicated, block: B:42:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x008c A[SYNTHETIC] */
    public static IetfAttrSyntax getInstance(Object obj) {
        GeneralNames generalNames;
        Enumeration objects;
        ASN1Primitive aSN1Primitive;
        int i10;
        int i11;
        if (obj instanceof IetfAttrSyntax) {
            return (IetfAttrSyntax) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        IetfAttrSyntax ietfAttrSyntax = new IetfAttrSyntax();
        ietfAttrSyntax.f87637p0 = null;
        ietfAttrSyntax.f87638q0 = new Vector();
        ietfAttrSyntax.f87639r0 = -1;
        int i12 = 0;
        if (!(aSN1Sequence.getObjectAt(0) instanceof ASN1TaggedObject)) {
            if (aSN1Sequence.size() == 2) {
                generalNames = GeneralNames.getInstance(aSN1Sequence.getObjectAt(0));
            }
            if (aSN1Sequence.getObjectAt(i12) instanceof ASN1Sequence) {
                throw new IllegalArgumentException("Non-IetfAttrSyntax encoding");
            }
            objects = ((ASN1Sequence) aSN1Sequence.getObjectAt(i12)).getObjects();
            while (objects.hasMoreElements()) {
                aSN1Primitive = (ASN1Primitive) objects.nextElement();
                if (aSN1Primitive instanceof ASN1ObjectIdentifier) {
                    i10 = 2;
                } else if (aSN1Primitive instanceof DERUTF8String) {
                    i10 = 3;
                } else {
                    if (aSN1Primitive instanceof DEROctetString) {
                        throw new IllegalArgumentException("Bad value type encoding IetfAttrSyntax");
                    }
                    i10 = 1;
                }
                i11 = ietfAttrSyntax.f87639r0;
                if (i11 < 0) {
                    ietfAttrSyntax.f87639r0 = i10;
                }
                if (i10 == i11) {
                    throw new IllegalArgumentException("Mix of value types in IetfAttrSyntax");
                }
                ietfAttrSyntax.f87638q0.addElement(aSN1Primitive);
            }
            return ietfAttrSyntax;
        }
        generalNames = GeneralNames.getInstance((ASN1TaggedObject) aSN1Sequence.getObjectAt(0), false);
        ietfAttrSyntax.f87637p0 = generalNames;
        i12 = 1;
        if (aSN1Sequence.getObjectAt(i12) instanceof ASN1Sequence) {
            throw new IllegalArgumentException("Non-IetfAttrSyntax encoding");
        }
        objects = ((ASN1Sequence) aSN1Sequence.getObjectAt(i12)).getObjects();
        while (objects.hasMoreElements()) {
            aSN1Primitive = (ASN1Primitive) objects.nextElement();
            if (aSN1Primitive instanceof ASN1ObjectIdentifier) {
                i10 = 2;
            } else if (aSN1Primitive instanceof DERUTF8String) {
                i10 = 3;
            } else {
                if (aSN1Primitive instanceof DEROctetString) {
                    throw new IllegalArgumentException("Bad value type encoding IetfAttrSyntax");
                }
                i10 = 1;
            }
            i11 = ietfAttrSyntax.f87639r0;
            if (i11 < 0) {
                ietfAttrSyntax.f87639r0 = i10;
            }
            if (i10 == i11) {
                throw new IllegalArgumentException("Mix of value types in IetfAttrSyntax");
            }
            ietfAttrSyntax.f87638q0.addElement(aSN1Primitive);
        }
        return ietfAttrSyntax;
    }

    public GeneralNames getPolicyAuthority() {
        return this.f87637p0;
    }

    public int getValueType() {
        return this.f87639r0;
    }

    public Object[] getValues() {
        int valueType = getValueType();
        int i10 = 0;
        Vector vector = this.f87638q0;
        if (valueType == 1) {
            int size = vector.size();
            ASN1OctetString[] aSN1OctetStringArr = new ASN1OctetString[size];
            while (i10 != size) {
                aSN1OctetStringArr[i10] = (ASN1OctetString) vector.elementAt(i10);
                i10++;
            }
            return aSN1OctetStringArr;
        }
        if (getValueType() == 2) {
            int size2 = vector.size();
            ASN1ObjectIdentifier[] aSN1ObjectIdentifierArr = new ASN1ObjectIdentifier[size2];
            while (i10 != size2) {
                aSN1ObjectIdentifierArr[i10] = (ASN1ObjectIdentifier) vector.elementAt(i10);
                i10++;
            }
            return aSN1ObjectIdentifierArr;
        }
        int size3 = vector.size();
        DERUTF8String[] dERUTF8StringArr = new DERUTF8String[size3];
        while (i10 != size3) {
            dERUTF8StringArr[i10] = (DERUTF8String) vector.elementAt(i10);
            i10++;
        }
        return dERUTF8StringArr;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        GeneralNames generalNames = this.f87637p0;
        if (generalNames != null) {
            aSN1EncodableVector.add(new DERTaggedObject(0, generalNames));
        }
        Vector vector = this.f87638q0;
        ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector(vector.size());
        Enumeration enumerationElements = vector.elements();
        while (enumerationElements.hasMoreElements()) {
            aSN1EncodableVector2.add((ASN1Encodable) enumerationElements.nextElement());
        }
        aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector2));
        return new DERSequence(aSN1EncodableVector);
    }
}
