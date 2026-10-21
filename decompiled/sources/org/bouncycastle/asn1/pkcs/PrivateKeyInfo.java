package org.bouncycastle.asn1.pkcs;

import java.io.IOException;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.util.BigIntegers;

/* JADX INFO: loaded from: classes12.dex */
public class PrivateKeyInfo extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1Integer f87417p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public AlgorithmIdentifier f87418q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public ASN1OctetString f87419r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public ASN1Set f87420s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public DERBitString f87421t0;

    public PrivateKeyInfo(AlgorithmIdentifier algorithmIdentifier, ASN1Encodable aSN1Encodable) throws IOException {
        this(algorithmIdentifier, aSN1Encodable, null, null);
    }

    public static PrivateKeyInfo getInstance(Object obj) {
        if (obj instanceof PrivateKeyInfo) {
            return (PrivateKeyInfo) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        PrivateKeyInfo privateKeyInfo = new PrivateKeyInfo();
        Enumeration objects = aSN1Sequence.getObjects();
        ASN1Integer aSN1Integer = ASN1Integer.getInstance(objects.nextElement());
        privateKeyInfo.f87417p0 = aSN1Integer;
        int iIntValueExact = aSN1Integer.intValueExact();
        if (iIntValueExact < 0 || iIntValueExact > 1) {
            throw new IllegalArgumentException("invalid version for private key info");
        }
        privateKeyInfo.f87418q0 = AlgorithmIdentifier.getInstance(objects.nextElement());
        privateKeyInfo.f87419r0 = ASN1OctetString.getInstance(objects.nextElement());
        int i10 = -1;
        while (objects.hasMoreElements()) {
            ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) objects.nextElement();
            int tagNo = aSN1TaggedObject.getTagNo();
            if (tagNo <= i10) {
                throw new IllegalArgumentException("invalid optional field in private key info");
            }
            if (tagNo == 0) {
                privateKeyInfo.f87420s0 = ASN1Set.getInstance(aSN1TaggedObject, false);
            } else {
                if (tagNo != 1) {
                    throw new IllegalArgumentException("unknown optional field in private key info");
                }
                if (iIntValueExact < 1) {
                    throw new IllegalArgumentException("'publicKey' requires version v2(1) or later");
                }
                privateKeyInfo.f87421t0 = DERBitString.getInstance(aSN1TaggedObject, false);
            }
            i10 = tagNo;
        }
        return privateKeyInfo;
    }

    public ASN1Set getAttributes() {
        return this.f87420s0;
    }

    public ASN1OctetString getPrivateKey() {
        return new DEROctetString(this.f87419r0.getOctets());
    }

    public AlgorithmIdentifier getPrivateKeyAlgorithm() {
        return this.f87418q0;
    }

    public ASN1BitString getPublicKeyData() {
        return this.f87421t0;
    }

    public boolean hasPublicKey() {
        return this.f87421t0 != null;
    }

    public ASN1Encodable parsePrivateKey() throws IOException {
        return ASN1Primitive.fromByteArray(this.f87419r0.getOctets());
    }

    public ASN1Encodable parsePublicKey() throws IOException {
        DERBitString dERBitString = this.f87421t0;
        if (dERBitString == null) {
            return null;
        }
        return ASN1Primitive.fromByteArray(dERBitString.getOctets());
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(5);
        aSN1EncodableVector.add(this.f87417p0);
        aSN1EncodableVector.add(this.f87418q0);
        aSN1EncodableVector.add(this.f87419r0);
        ASN1Set aSN1Set = this.f87420s0;
        if (aSN1Set != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 0, aSN1Set));
        }
        DERBitString dERBitString = this.f87421t0;
        if (dERBitString != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 1, dERBitString));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public PrivateKeyInfo(AlgorithmIdentifier algorithmIdentifier, ASN1Encodable aSN1Encodable, ASN1Set aSN1Set) throws IOException {
        this(algorithmIdentifier, aSN1Encodable, aSN1Set, null);
    }

    public PrivateKeyInfo(AlgorithmIdentifier algorithmIdentifier, ASN1Encodable aSN1Encodable, ASN1Set aSN1Set, byte[] bArr) throws IOException {
        this.f87417p0 = new ASN1Integer(bArr != null ? BigIntegers.ONE : BigIntegers.ZERO);
        this.f87418q0 = algorithmIdentifier;
        this.f87419r0 = new DEROctetString(aSN1Encodable);
        this.f87420s0 = aSN1Set;
        this.f87421t0 = bArr == null ? null : new DERBitString(bArr);
    }

    public static PrivateKeyInfo getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z10));
    }
}
