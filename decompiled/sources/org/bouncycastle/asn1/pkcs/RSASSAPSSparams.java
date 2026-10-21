package org.bouncycastle.asn1.pkcs;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* JADX INFO: loaded from: classes12.dex */
public class RSASSAPSSparams extends ASN1Object {
    public static final AlgorithmIdentifier DEFAULT_HASH_ALGORITHM;
    public static final AlgorithmIdentifier DEFAULT_MASK_GEN_FUNCTION;
    public static final ASN1Integer DEFAULT_SALT_LENGTH;
    public static final ASN1Integer DEFAULT_TRAILER_FIELD;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public AlgorithmIdentifier f87447p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public AlgorithmIdentifier f87448q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public ASN1Integer f87449r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public ASN1Integer f87450s0;

    static {
        AlgorithmIdentifier algorithmIdentifier = new AlgorithmIdentifier(OIWObjectIdentifiers.idSHA1, DERNull.INSTANCE);
        DEFAULT_HASH_ALGORITHM = algorithmIdentifier;
        DEFAULT_MASK_GEN_FUNCTION = new AlgorithmIdentifier(PKCSObjectIdentifiers.id_mgf1, algorithmIdentifier);
        DEFAULT_SALT_LENGTH = new ASN1Integer(20L);
        DEFAULT_TRAILER_FIELD = new ASN1Integer(1L);
    }

    public RSASSAPSSparams() {
        this.f87447p0 = DEFAULT_HASH_ALGORITHM;
        this.f87448q0 = DEFAULT_MASK_GEN_FUNCTION;
        this.f87449r0 = DEFAULT_SALT_LENGTH;
        this.f87450s0 = DEFAULT_TRAILER_FIELD;
    }

    public static RSASSAPSSparams getInstance(Object obj) {
        if (obj instanceof RSASSAPSSparams) {
            return (RSASSAPSSparams) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        RSASSAPSSparams rSASSAPSSparams = new RSASSAPSSparams();
        rSASSAPSSparams.f87447p0 = DEFAULT_HASH_ALGORITHM;
        rSASSAPSSparams.f87448q0 = DEFAULT_MASK_GEN_FUNCTION;
        rSASSAPSSparams.f87449r0 = DEFAULT_SALT_LENGTH;
        rSASSAPSSparams.f87450s0 = DEFAULT_TRAILER_FIELD;
        for (int i10 = 0; i10 != aSN1Sequence.size(); i10++) {
            ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) aSN1Sequence.getObjectAt(i10);
            int tagNo = aSN1TaggedObject.getTagNo();
            if (tagNo == 0) {
                rSASSAPSSparams.f87447p0 = AlgorithmIdentifier.getInstance(aSN1TaggedObject, true);
            } else if (tagNo == 1) {
                rSASSAPSSparams.f87448q0 = AlgorithmIdentifier.getInstance(aSN1TaggedObject, true);
            } else if (tagNo == 2) {
                rSASSAPSSparams.f87449r0 = ASN1Integer.getInstance(aSN1TaggedObject, true);
            } else {
                if (tagNo != 3) {
                    throw new IllegalArgumentException("unknown tag");
                }
                rSASSAPSSparams.f87450s0 = ASN1Integer.getInstance(aSN1TaggedObject, true);
            }
        }
        return rSASSAPSSparams;
    }

    public AlgorithmIdentifier getHashAlgorithm() {
        return this.f87447p0;
    }

    public AlgorithmIdentifier getMaskGenAlgorithm() {
        return this.f87448q0;
    }

    public BigInteger getSaltLength() {
        return this.f87449r0.getValue();
    }

    public BigInteger getTrailerField() {
        return this.f87450s0.getValue();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(4);
        AlgorithmIdentifier algorithmIdentifier = DEFAULT_HASH_ALGORITHM;
        AlgorithmIdentifier algorithmIdentifier2 = this.f87447p0;
        if (!algorithmIdentifier2.equals(algorithmIdentifier)) {
            aSN1EncodableVector.add(new DERTaggedObject(true, 0, algorithmIdentifier2));
        }
        AlgorithmIdentifier algorithmIdentifier3 = DEFAULT_MASK_GEN_FUNCTION;
        AlgorithmIdentifier algorithmIdentifier4 = this.f87448q0;
        if (!algorithmIdentifier4.equals(algorithmIdentifier3)) {
            aSN1EncodableVector.add(new DERTaggedObject(true, 1, algorithmIdentifier4));
        }
        ASN1Integer aSN1Integer = DEFAULT_SALT_LENGTH;
        ASN1Integer aSN1Integer2 = this.f87449r0;
        if (!aSN1Integer2.equals((ASN1Primitive) aSN1Integer)) {
            aSN1EncodableVector.add(new DERTaggedObject(true, 2, aSN1Integer2));
        }
        ASN1Integer aSN1Integer3 = DEFAULT_TRAILER_FIELD;
        ASN1Integer aSN1Integer4 = this.f87450s0;
        if (!aSN1Integer4.equals((ASN1Primitive) aSN1Integer3)) {
            aSN1EncodableVector.add(new DERTaggedObject(true, 3, aSN1Integer4));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public RSASSAPSSparams(AlgorithmIdentifier algorithmIdentifier, AlgorithmIdentifier algorithmIdentifier2, ASN1Integer aSN1Integer, ASN1Integer aSN1Integer2) {
        this.f87447p0 = algorithmIdentifier;
        this.f87448q0 = algorithmIdentifier2;
        this.f87449r0 = aSN1Integer;
        this.f87450s0 = aSN1Integer2;
    }
}
