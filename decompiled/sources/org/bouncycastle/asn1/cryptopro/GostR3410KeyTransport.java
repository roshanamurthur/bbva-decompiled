package org.bouncycastle.asn1.cryptopro;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;

/* JADX INFO: loaded from: classes12.dex */
public class GostR3410KeyTransport extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Gost2814789EncryptedKey f87086p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final GostR3410TransportParameters f87087q0;

    public GostR3410KeyTransport(ASN1Sequence aSN1Sequence) {
        this.f87086p0 = Gost2814789EncryptedKey.getInstance(aSN1Sequence.getObjectAt(0));
        this.f87087q0 = GostR3410TransportParameters.getInstance(ASN1TaggedObject.getInstance(aSN1Sequence.getObjectAt(1)), false);
    }

    public static GostR3410KeyTransport getInstance(Object obj) {
        if (obj instanceof GostR3410KeyTransport) {
            return (GostR3410KeyTransport) obj;
        }
        if (obj != null) {
            return new GostR3410KeyTransport(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public Gost2814789EncryptedKey getSessionEncryptedKey() {
        return this.f87086p0;
    }

    public GostR3410TransportParameters getTransportParameters() {
        return this.f87087q0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.f87086p0);
        GostR3410TransportParameters gostR3410TransportParameters = this.f87087q0;
        if (gostR3410TransportParameters != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 0, gostR3410TransportParameters));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public GostR3410KeyTransport(Gost2814789EncryptedKey gost2814789EncryptedKey, GostR3410TransportParameters gostR3410TransportParameters) {
        this.f87086p0 = gost2814789EncryptedKey;
        this.f87087q0 = gostR3410TransportParameters;
    }
}
