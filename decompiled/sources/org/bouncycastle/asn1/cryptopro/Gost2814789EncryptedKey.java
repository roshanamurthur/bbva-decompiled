package org.bouncycastle.asn1.cryptopro;

import androidx.camera.core.impl.utils.a;
import androidx.databinding.c;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes12.dex */
public class Gost2814789EncryptedKey extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final byte[] f87081p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final byte[] f87082q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final byte[] f87083r0;

    public Gost2814789EncryptedKey(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() == 2) {
            this.f87081p0 = a.c(aSN1Sequence, 0);
            this.f87083r0 = a.c(aSN1Sequence, 1);
            this.f87082q0 = null;
        } else {
            if (aSN1Sequence.size() != 3) {
                throw new IllegalArgumentException(c.d(aSN1Sequence, new StringBuilder("unknown sequence length: ")));
            }
            this.f87081p0 = a.c(aSN1Sequence, 0);
            this.f87082q0 = Arrays.clone(ASN1OctetString.getInstance(ASN1TaggedObject.getInstance(aSN1Sequence.getObjectAt(1)), false).getOctets());
            this.f87083r0 = a.c(aSN1Sequence, 2);
        }
    }

    public static Gost2814789EncryptedKey getInstance(Object obj) {
        if (obj instanceof Gost2814789EncryptedKey) {
            return (Gost2814789EncryptedKey) obj;
        }
        if (obj != null) {
            return new Gost2814789EncryptedKey(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public byte[] getEncryptedKey() {
        return Arrays.clone(this.f87081p0);
    }

    public byte[] getMacKey() {
        return Arrays.clone(this.f87083r0);
    }

    public byte[] getMaskKey() {
        return Arrays.clone(this.f87082q0);
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        byte[] bArr = this.f87081p0;
        aSN1EncodableVector.add(new DEROctetString(bArr));
        if (this.f87082q0 != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 0, new DEROctetString(bArr)));
        }
        aSN1EncodableVector.add(new DEROctetString(this.f87083r0));
        return new DERSequence(aSN1EncodableVector);
    }

    public Gost2814789EncryptedKey(byte[] bArr, byte[] bArr2) {
        this(bArr, null, bArr2);
    }

    public Gost2814789EncryptedKey(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f87081p0 = Arrays.clone(bArr);
        this.f87082q0 = Arrays.clone(bArr2);
        this.f87083r0 = Arrays.clone(bArr3);
    }
}
