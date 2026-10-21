package org.bouncycastle.asn1.x9;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.math.ec.ECAlgorithms;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes12.dex */
public class X9Curve extends ASN1Object implements X9ObjectIdentifiers {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ECCurve f87832p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final byte[] f87833q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final ASN1ObjectIdentifier f87834r0;

    public X9Curve(X9FieldID x9FieldID, BigInteger bigInteger, BigInteger bigInteger2, ASN1Sequence aSN1Sequence) {
        int iIntValueExact;
        int iIntValueExact2;
        int i10;
        ECCurve f2m;
        this.f87834r0 = null;
        ASN1ObjectIdentifier identifier = x9FieldID.getIdentifier();
        this.f87834r0 = identifier;
        if (identifier.equals((ASN1Primitive) X9ObjectIdentifiers.prime_field)) {
            f2m = new ECCurve.Fp(((ASN1Integer) x9FieldID.getParameters()).getValue(), new BigInteger(1, ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(0)).getOctets()), new BigInteger(1, ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(1)).getOctets()), bigInteger, bigInteger2);
        } else {
            if (!this.f87834r0.equals((ASN1Primitive) X9ObjectIdentifiers.characteristic_two_field)) {
                throw new IllegalArgumentException("This type of ECCurve is not implemented");
            }
            ASN1Sequence aSN1Sequence2 = ASN1Sequence.getInstance(x9FieldID.getParameters());
            int iIntValueExact3 = ((ASN1Integer) aSN1Sequence2.getObjectAt(0)).intValueExact();
            ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) aSN1Sequence2.getObjectAt(1);
            if (aSN1ObjectIdentifier.equals((ASN1Primitive) X9ObjectIdentifiers.tpBasis)) {
                iIntValueExact2 = ASN1Integer.getInstance(aSN1Sequence2.getObjectAt(2)).intValueExact();
                i10 = 0;
                iIntValueExact = 0;
            } else {
                if (!aSN1ObjectIdentifier.equals((ASN1Primitive) X9ObjectIdentifiers.ppBasis)) {
                    throw new IllegalArgumentException("This type of EC basis is not implemented");
                }
                ASN1Sequence aSN1Sequence3 = ASN1Sequence.getInstance(aSN1Sequence2.getObjectAt(2));
                int iIntValueExact4 = ASN1Integer.getInstance(aSN1Sequence3.getObjectAt(0)).intValueExact();
                int iIntValueExact5 = ASN1Integer.getInstance(aSN1Sequence3.getObjectAt(1)).intValueExact();
                iIntValueExact = ASN1Integer.getInstance(aSN1Sequence3.getObjectAt(2)).intValueExact();
                iIntValueExact2 = iIntValueExact4;
                i10 = iIntValueExact5;
            }
            f2m = new ECCurve.F2m(iIntValueExact3, iIntValueExact2, i10, iIntValueExact, new BigInteger(1, ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(0)).getOctets()), new BigInteger(1, ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(1)).getOctets()), bigInteger, bigInteger2);
        }
        this.f87832p0 = f2m;
        if (aSN1Sequence.size() == 3) {
            this.f87833q0 = ((DERBitString) aSN1Sequence.getObjectAt(2)).getBytes();
        }
    }

    public ECCurve getCurve() {
        return this.f87832p0;
    }

    public byte[] getSeed() {
        return Arrays.clone(this.f87833q0);
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        boolean zEquals = this.f87834r0.equals((ASN1Primitive) X9ObjectIdentifiers.prime_field);
        ECCurve eCCurve = this.f87832p0;
        if (zEquals || this.f87834r0.equals((ASN1Primitive) X9ObjectIdentifiers.characteristic_two_field)) {
            aSN1EncodableVector.add(new X9FieldElement(eCCurve.getA()).toASN1Primitive());
            X9FieldElement x9FieldElement = new X9FieldElement(eCCurve.getB());
            aSN1EncodableVector.add(x9FieldElement.toASN1Primitive());
        }
        byte[] bArr = this.f87833q0;
        if (bArr != null) {
            aSN1EncodableVector.add(new DERBitString(bArr));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public X9Curve(ECCurve eCCurve) {
        this(eCCurve, null);
    }

    public X9Curve(ECCurve eCCurve, byte[] bArr) {
        ASN1ObjectIdentifier aSN1ObjectIdentifier;
        this.f87834r0 = null;
        this.f87832p0 = eCCurve;
        this.f87833q0 = Arrays.clone(bArr);
        if (ECAlgorithms.isFpCurve(eCCurve)) {
            aSN1ObjectIdentifier = X9ObjectIdentifiers.prime_field;
        } else {
            if (!ECAlgorithms.isF2mCurve(eCCurve)) {
                throw new IllegalArgumentException("This type of ECCurve is not implemented");
            }
            aSN1ObjectIdentifier = X9ObjectIdentifiers.characteristic_two_field;
        }
        this.f87834r0 = aSN1ObjectIdentifier;
    }
}
