package org.bouncycastle.asn1.x500;

import java.util.Vector;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.x500.style.BCStyle;

/* JADX INFO: loaded from: classes12.dex */
public class X500NameBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X500NameStyle f87544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Vector f87545b;

    public X500NameBuilder() {
        this(BCStyle.INSTANCE);
    }

    public X500NameBuilder addMultiValuedRDN(ASN1ObjectIdentifier[] aSN1ObjectIdentifierArr, String[] strArr) {
        int length = strArr.length;
        ASN1Encodable[] aSN1EncodableArr = new ASN1Encodable[length];
        for (int i10 = 0; i10 != length; i10++) {
            aSN1EncodableArr[i10] = this.f87544a.stringToValue(aSN1ObjectIdentifierArr[i10], strArr[i10]);
        }
        return addMultiValuedRDN(aSN1ObjectIdentifierArr, aSN1EncodableArr);
    }

    public X500NameBuilder addRDN(ASN1ObjectIdentifier aSN1ObjectIdentifier, String str) {
        addRDN(aSN1ObjectIdentifier, this.f87544a.stringToValue(aSN1ObjectIdentifier, str));
        return this;
    }

    public X500Name build() {
        Vector vector = this.f87545b;
        int size = vector.size();
        RDN[] rdnArr = new RDN[size];
        for (int i10 = 0; i10 != size; i10++) {
            rdnArr[i10] = (RDN) vector.elementAt(i10);
        }
        return new X500Name(this.f87544a, rdnArr);
    }

    public X500NameBuilder(X500NameStyle x500NameStyle) {
        this.f87545b = new Vector();
        this.f87544a = x500NameStyle;
    }

    public X500NameBuilder addMultiValuedRDN(ASN1ObjectIdentifier[] aSN1ObjectIdentifierArr, ASN1Encodable[] aSN1EncodableArr) {
        AttributeTypeAndValue[] attributeTypeAndValueArr = new AttributeTypeAndValue[aSN1ObjectIdentifierArr.length];
        for (int i10 = 0; i10 != aSN1ObjectIdentifierArr.length; i10++) {
            attributeTypeAndValueArr[i10] = new AttributeTypeAndValue(aSN1ObjectIdentifierArr[i10], aSN1EncodableArr[i10]);
        }
        return addMultiValuedRDN(attributeTypeAndValueArr);
    }

    public X500NameBuilder addRDN(ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1Encodable aSN1Encodable) {
        this.f87545b.addElement(new RDN(aSN1ObjectIdentifier, aSN1Encodable));
        return this;
    }

    public X500NameBuilder addMultiValuedRDN(AttributeTypeAndValue[] attributeTypeAndValueArr) {
        this.f87545b.addElement(new RDN(attributeTypeAndValueArr));
        return this;
    }

    public X500NameBuilder addRDN(AttributeTypeAndValue attributeTypeAndValue) {
        this.f87545b.addElement(new RDN(attributeTypeAndValue));
        return this;
    }
}
