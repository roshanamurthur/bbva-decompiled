package org.bouncycastle.asn1.x9;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes12.dex */
public class KeySpecificInfo extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1ObjectIdentifier f87821p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ASN1OctetString f87822q0;

    public KeySpecificInfo(ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1OctetString aSN1OctetString) {
        this.f87821p0 = aSN1ObjectIdentifier;
        this.f87822q0 = aSN1OctetString;
    }

    public static KeySpecificInfo getInstance(Object obj) {
        if (obj instanceof KeySpecificInfo) {
            return (KeySpecificInfo) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        KeySpecificInfo keySpecificInfo = new KeySpecificInfo();
        Enumeration objects = aSN1Sequence.getObjects();
        keySpecificInfo.f87821p0 = (ASN1ObjectIdentifier) objects.nextElement();
        keySpecificInfo.f87822q0 = (ASN1OctetString) objects.nextElement();
        return keySpecificInfo;
    }

    public ASN1ObjectIdentifier getAlgorithm() {
        return this.f87821p0;
    }

    public ASN1OctetString getCounter() {
        return this.f87822q0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.f87821p0);
        aSN1EncodableVector.add(this.f87822q0);
        return new DERSequence(aSN1EncodableVector);
    }
}
