package org.bouncycastle.asn1.x9;

import androidx.databinding.c;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes12.dex */
public class DHValidationParms extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public DERBitString f87814p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ASN1Integer f87815q0;

    public DHValidationParms(DERBitString dERBitString, ASN1Integer aSN1Integer) {
        if (dERBitString == null) {
            throw new IllegalArgumentException("'seed' cannot be null");
        }
        if (aSN1Integer == null) {
            throw new IllegalArgumentException("'pgenCounter' cannot be null");
        }
        this.f87814p0 = dERBitString;
        this.f87815q0 = aSN1Integer;
    }

    public static DHValidationParms getInstance(Object obj) {
        if (obj instanceof DHValidationParms) {
            return (DHValidationParms) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        DHValidationParms dHValidationParms = new DHValidationParms();
        if (aSN1Sequence.size() != 2) {
            throw new IllegalArgumentException(c.d(aSN1Sequence, new StringBuilder("Bad sequence size: ")));
        }
        dHValidationParms.f87814p0 = DERBitString.getInstance(aSN1Sequence.getObjectAt(0));
        dHValidationParms.f87815q0 = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(1));
        return dHValidationParms;
    }

    public ASN1Integer getPgenCounter() {
        return this.f87815q0;
    }

    public DERBitString getSeed() {
        return this.f87814p0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.f87814p0);
        aSN1EncodableVector.add(this.f87815q0);
        return new DERSequence(aSN1EncodableVector);
    }

    public static DHValidationParms getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z10));
    }
}
