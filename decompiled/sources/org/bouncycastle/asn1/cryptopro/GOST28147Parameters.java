package org.bouncycastle.asn1.cryptopro;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes12.dex */
public class GOST28147Parameters extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1OctetString f87070p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ASN1ObjectIdentifier f87071q0;

    public GOST28147Parameters(byte[] bArr, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.f87070p0 = new DEROctetString(bArr);
        this.f87071q0 = aSN1ObjectIdentifier;
    }

    public static GOST28147Parameters getInstance(Object obj) {
        if (obj instanceof GOST28147Parameters) {
            return (GOST28147Parameters) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        GOST28147Parameters gOST28147Parameters = new GOST28147Parameters();
        Enumeration objects = aSN1Sequence.getObjects();
        gOST28147Parameters.f87070p0 = (ASN1OctetString) objects.nextElement();
        gOST28147Parameters.f87071q0 = (ASN1ObjectIdentifier) objects.nextElement();
        return gOST28147Parameters;
    }

    public ASN1ObjectIdentifier getEncryptionParamSet() {
        return this.f87071q0;
    }

    public byte[] getIV() {
        return Arrays.clone(this.f87070p0.getOctets());
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.f87070p0);
        aSN1EncodableVector.add(this.f87071q0);
        return new DERSequence(aSN1EncodableVector);
    }

    public static GOST28147Parameters getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z10));
    }
}
