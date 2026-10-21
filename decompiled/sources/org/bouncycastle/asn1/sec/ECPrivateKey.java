package org.bouncycastle.asn1.sec;

import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.util.BigIntegers;

/* JADX INFO: loaded from: classes12.dex */
public class ECPrivateKey extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1Sequence f87466p0;

    public ECPrivateKey(int i10, BigInteger bigInteger) {
        byte[] bArrAsUnsignedByteArray = BigIntegers.asUnsignedByteArray((i10 + 7) / 8, bigInteger);
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(new ASN1Integer(1L));
        aSN1EncodableVector.add(new DEROctetString(bArrAsUnsignedByteArray));
        this.f87466p0 = new DERSequence(aSN1EncodableVector);
    }

    public static ECPrivateKey getInstance(Object obj) {
        if (obj instanceof ECPrivateKey) {
            return (ECPrivateKey) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        ECPrivateKey eCPrivateKey = new ECPrivateKey();
        eCPrivateKey.f87466p0 = aSN1Sequence;
        return eCPrivateKey;
    }

    public final ASN1Primitive a(int i10) {
        Enumeration objects = this.f87466p0.getObjects();
        while (objects.hasMoreElements()) {
            ASN1Encodable aSN1Encodable = (ASN1Encodable) objects.nextElement();
            if (aSN1Encodable instanceof ASN1TaggedObject) {
                ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) aSN1Encodable;
                if (aSN1TaggedObject.getTagNo() == i10) {
                    return aSN1TaggedObject.getObject().toASN1Primitive();
                }
            }
        }
        return null;
    }

    public BigInteger getKey() {
        return new BigInteger(1, ((ASN1OctetString) this.f87466p0.getObjectAt(1)).getOctets());
    }

    public ASN1Primitive getParameters() {
        return a(0);
    }

    public DERBitString getPublicKey() {
        return (DERBitString) a(1);
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.f87466p0;
    }

    public ECPrivateKey(int i10, BigInteger bigInteger, ASN1Encodable aSN1Encodable) {
        this(i10, bigInteger, null, aSN1Encodable);
    }

    public ECPrivateKey(int i10, BigInteger bigInteger, DERBitString dERBitString, ASN1Encodable aSN1Encodable) {
        byte[] bArrAsUnsignedByteArray = BigIntegers.asUnsignedByteArray((i10 + 7) / 8, bigInteger);
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(4);
        aSN1EncodableVector.add(new ASN1Integer(1L));
        aSN1EncodableVector.add(new DEROctetString(bArrAsUnsignedByteArray));
        if (aSN1Encodable != null) {
            aSN1EncodableVector.add(new DERTaggedObject(true, 0, aSN1Encodable));
        }
        if (dERBitString != null) {
            aSN1EncodableVector.add(new DERTaggedObject(true, 1, dERBitString));
        }
        this.f87466p0 = new DERSequence(aSN1EncodableVector);
    }

    public ECPrivateKey(BigInteger bigInteger) {
        this(bigInteger.bitLength(), bigInteger);
    }

    public ECPrivateKey(BigInteger bigInteger, ASN1Encodable aSN1Encodable) {
        this(bigInteger, (DERBitString) null, aSN1Encodable);
    }

    public ECPrivateKey(BigInteger bigInteger, DERBitString dERBitString, ASN1Encodable aSN1Encodable) {
        this(bigInteger.bitLength(), bigInteger, dERBitString, aSN1Encodable);
    }
}
