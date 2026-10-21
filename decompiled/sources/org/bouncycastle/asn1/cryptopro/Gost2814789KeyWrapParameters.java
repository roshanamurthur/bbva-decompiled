package org.bouncycastle.asn1.cryptopro;

import androidx.databinding.c;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes12.dex */
public class Gost2814789KeyWrapParameters extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ASN1ObjectIdentifier f87084p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final byte[] f87085q0;

    public Gost2814789KeyWrapParameters(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this(aSN1ObjectIdentifier, null);
    }

    public static Gost2814789KeyWrapParameters getInstance(Object obj) {
        if (obj instanceof Gost2814789KeyWrapParameters) {
            return (Gost2814789KeyWrapParameters) obj;
        }
        if (obj != null) {
            return new Gost2814789KeyWrapParameters(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public ASN1ObjectIdentifier getEncryptionParamSet() {
        return this.f87084p0;
    }

    public byte[] getUkm() {
        return Arrays.clone(this.f87085q0);
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.f87084p0);
        byte[] bArr = this.f87085q0;
        if (bArr != null) {
            aSN1EncodableVector.add(new DEROctetString(bArr));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public Gost2814789KeyWrapParameters(ASN1ObjectIdentifier aSN1ObjectIdentifier, byte[] bArr) {
        this.f87084p0 = aSN1ObjectIdentifier;
        this.f87085q0 = Arrays.clone(bArr);
    }

    public Gost2814789KeyWrapParameters(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() == 2) {
            this.f87084p0 = ASN1ObjectIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
            this.f87085q0 = ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(1)).getOctets();
        } else {
            if (aSN1Sequence.size() != 1) {
                throw new IllegalArgumentException(c.d(aSN1Sequence, new StringBuilder("unknown sequence length: ")));
            }
            this.f87084p0 = ASN1ObjectIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
            this.f87085q0 = null;
        }
    }
}
