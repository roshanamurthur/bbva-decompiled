package org.bouncycastle.asn1.cms;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.DERSet;

/* JADX INFO: loaded from: classes12.dex */
public class AttributeTable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Hashtable f86840a;

    public AttributeTable(Hashtable hashtable) {
        this.f86840a = new Hashtable();
        Hashtable hashtable2 = new Hashtable();
        Enumeration enumerationKeys = hashtable.keys();
        while (enumerationKeys.hasMoreElements()) {
            Object objNextElement = enumerationKeys.nextElement();
            hashtable2.put(objNextElement, hashtable.get(objNextElement));
        }
        this.f86840a = hashtable2;
    }

    public final void a(ASN1ObjectIdentifier aSN1ObjectIdentifier, Attribute attribute) {
        Vector vector;
        Hashtable hashtable = this.f86840a;
        Object obj = hashtable.get(aSN1ObjectIdentifier);
        if (obj == null) {
            hashtable.put(aSN1ObjectIdentifier, attribute);
            return;
        }
        if (obj instanceof Attribute) {
            vector = new Vector();
            vector.addElement(obj);
        } else {
            vector = (Vector) obj;
        }
        vector.addElement(attribute);
        hashtable.put(aSN1ObjectIdentifier, vector);
    }

    public AttributeTable add(ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1Encodable aSN1Encodable) {
        AttributeTable attributeTable = new AttributeTable(this.f86840a);
        attributeTable.a(aSN1ObjectIdentifier, new Attribute(aSN1ObjectIdentifier, new DERSet(aSN1Encodable)));
        return attributeTable;
    }

    public Attribute get(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        Object obj = this.f86840a.get(aSN1ObjectIdentifier);
        return obj instanceof Vector ? (Attribute) ((Vector) obj).elementAt(0) : (Attribute) obj;
    }

    public ASN1EncodableVector getAll(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        Object obj = this.f86840a.get(aSN1ObjectIdentifier);
        if (obj instanceof Vector) {
            Enumeration enumerationElements = ((Vector) obj).elements();
            while (enumerationElements.hasMoreElements()) {
                aSN1EncodableVector.add((Attribute) enumerationElements.nextElement());
            }
        } else if (obj != null) {
            aSN1EncodableVector.add((Attribute) obj);
        }
        return aSN1EncodableVector;
    }

    public AttributeTable remove(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        AttributeTable attributeTable = new AttributeTable(this.f86840a);
        attributeTable.f86840a.remove(aSN1ObjectIdentifier);
        return attributeTable;
    }

    public int size() {
        Enumeration enumerationElements = this.f86840a.elements();
        int size = 0;
        while (enumerationElements.hasMoreElements()) {
            Object objNextElement = enumerationElements.nextElement();
            size = objNextElement instanceof Vector ? ((Vector) objNextElement).size() + size : size + 1;
        }
        return size;
    }

    public ASN1EncodableVector toASN1EncodableVector() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        Enumeration enumerationElements = this.f86840a.elements();
        while (enumerationElements.hasMoreElements()) {
            Object objNextElement = enumerationElements.nextElement();
            if (objNextElement instanceof Vector) {
                Enumeration enumerationElements2 = ((Vector) objNextElement).elements();
                while (enumerationElements2.hasMoreElements()) {
                    aSN1EncodableVector.add(Attribute.getInstance(enumerationElements2.nextElement()));
                }
            } else {
                aSN1EncodableVector.add(Attribute.getInstance(objNextElement));
            }
        }
        return aSN1EncodableVector;
    }

    public Attributes toASN1Structure() {
        return new Attributes(toASN1EncodableVector());
    }

    public Hashtable toHashtable() {
        Hashtable hashtable = this.f86840a;
        Hashtable hashtable2 = new Hashtable();
        Enumeration enumerationKeys = hashtable.keys();
        while (enumerationKeys.hasMoreElements()) {
            Object objNextElement = enumerationKeys.nextElement();
            hashtable2.put(objNextElement, hashtable.get(objNextElement));
        }
        return hashtable2;
    }

    public AttributeTable(ASN1EncodableVector aSN1EncodableVector) {
        this.f86840a = new Hashtable();
        for (int i10 = 0; i10 != aSN1EncodableVector.size(); i10++) {
            Attribute attribute = Attribute.getInstance(aSN1EncodableVector.get(i10));
            a(attribute.getAttrType(), attribute);
        }
    }

    public AttributeTable(ASN1Set aSN1Set) {
        this.f86840a = new Hashtable();
        for (int i10 = 0; i10 != aSN1Set.size(); i10++) {
            Attribute attribute = Attribute.getInstance(aSN1Set.getObjectAt(i10));
            a(attribute.getAttrType(), attribute);
        }
    }

    public AttributeTable(Attribute attribute) {
        this.f86840a = new Hashtable();
        a(attribute.getAttrType(), attribute);
    }

    public AttributeTable(Attributes attributes) {
        this(ASN1Set.getInstance(attributes.toASN1Primitive()));
    }
}
