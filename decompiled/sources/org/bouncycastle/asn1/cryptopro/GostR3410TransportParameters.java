package org.bouncycastle.asn1.cryptopro;

import androidx.databinding.c;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes12.dex */
public class GostR3410TransportParameters extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ASN1ObjectIdentifier f87088p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final SubjectPublicKeyInfo f87089q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final byte[] f87090r0;

    public GostR3410TransportParameters(ASN1ObjectIdentifier aSN1ObjectIdentifier, SubjectPublicKeyInfo subjectPublicKeyInfo, byte[] bArr) {
        this.f87088p0 = aSN1ObjectIdentifier;
        this.f87089q0 = subjectPublicKeyInfo;
        this.f87090r0 = Arrays.clone(bArr);
    }

    public static GostR3410TransportParameters getInstance(Object obj) {
        if (obj instanceof GostR3410TransportParameters) {
            return (GostR3410TransportParameters) obj;
        }
        if (obj != null) {
            return new GostR3410TransportParameters(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public ASN1ObjectIdentifier getEncryptionParamSet() {
        return this.f87088p0;
    }

    public SubjectPublicKeyInfo getEphemeralPublicKey() {
        return this.f87089q0;
    }

    public byte[] getUkm() {
        return Arrays.clone(this.f87090r0);
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.f87088p0);
        SubjectPublicKeyInfo subjectPublicKeyInfo = this.f87089q0;
        if (subjectPublicKeyInfo != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 0, subjectPublicKeyInfo));
        }
        aSN1EncodableVector.add(new DEROctetString(this.f87090r0));
        return new DERSequence(aSN1EncodableVector);
    }

    public GostR3410TransportParameters(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() == 2) {
            this.f87088p0 = ASN1ObjectIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
            this.f87090r0 = ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(1)).getOctets();
            this.f87089q0 = null;
        } else {
            if (aSN1Sequence.size() != 3) {
                throw new IllegalArgumentException(c.d(aSN1Sequence, new StringBuilder("unknown sequence length: ")));
            }
            this.f87088p0 = ASN1ObjectIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
            this.f87089q0 = SubjectPublicKeyInfo.getInstance(ASN1TaggedObject.getInstance(aSN1Sequence.getObjectAt(1)), false);
            this.f87090r0 = ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(2)).getOctets();
        }
    }

    public static GostR3410TransportParameters getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return new GostR3410TransportParameters(ASN1Sequence.getInstance(aSN1TaggedObject, z10));
    }
}
