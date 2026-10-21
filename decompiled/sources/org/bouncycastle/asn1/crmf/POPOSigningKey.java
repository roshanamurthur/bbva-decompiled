package org.bouncycastle.asn1.crmf;

import androidx.camera.core.impl.utils.b;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* JADX INFO: loaded from: classes12.dex */
public class POPOSigningKey extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public POPOSigningKeyInput f87051p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public AlgorithmIdentifier f87052q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public DERBitString f87053r0;

    public POPOSigningKey(POPOSigningKeyInput pOPOSigningKeyInput, AlgorithmIdentifier algorithmIdentifier, DERBitString dERBitString) {
        this.f87051p0 = pOPOSigningKeyInput;
        this.f87052q0 = algorithmIdentifier;
        this.f87053r0 = dERBitString;
    }

    public static POPOSigningKey getInstance(Object obj) {
        if (obj instanceof POPOSigningKey) {
            return (POPOSigningKey) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        POPOSigningKey pOPOSigningKey = new POPOSigningKey();
        int i10 = 0;
        if (aSN1Sequence.getObjectAt(0) instanceof ASN1TaggedObject) {
            ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) aSN1Sequence.getObjectAt(0);
            if (aSN1TaggedObject.getTagNo() != 0) {
                throw new IllegalArgumentException(b.c(aSN1TaggedObject, new StringBuilder("Unknown POPOSigningKeyInput tag: ")));
            }
            pOPOSigningKey.f87051p0 = POPOSigningKeyInput.getInstance(aSN1TaggedObject.getObject());
            i10 = 1;
        }
        pOPOSigningKey.f87052q0 = AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(i10));
        pOPOSigningKey.f87053r0 = DERBitString.getInstance(aSN1Sequence.getObjectAt(i10 + 1));
        return pOPOSigningKey;
    }

    public AlgorithmIdentifier getAlgorithmIdentifier() {
        return this.f87052q0;
    }

    public POPOSigningKeyInput getPoposkInput() {
        return this.f87051p0;
    }

    public DERBitString getSignature() {
        return this.f87053r0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        POPOSigningKeyInput pOPOSigningKeyInput = this.f87051p0;
        if (pOPOSigningKeyInput != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 0, pOPOSigningKeyInput));
        }
        aSN1EncodableVector.add(this.f87052q0);
        aSN1EncodableVector.add(this.f87053r0);
        return new DERSequence(aSN1EncodableVector);
    }

    public static POPOSigningKey getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z10));
    }
}
