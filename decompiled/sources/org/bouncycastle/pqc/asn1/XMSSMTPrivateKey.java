package org.bouncycastle.pqc.asn1;

import androidx.camera.core.impl.utils.a;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.BigIntegers;

/* JADX INFO: loaded from: classes13.dex */
public class XMSSMTPrivateKey extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final int f90939p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final long f90940q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final long f90941r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final byte[] f90942s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final byte[] f90943t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final byte[] f90944u0;
    public final byte[] v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final byte[] f90945w0;

    public XMSSMTPrivateKey(long j10, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.f90939p0 = 0;
        this.f90940q0 = j10;
        this.f90942s0 = Arrays.clone(bArr);
        this.f90943t0 = Arrays.clone(bArr2);
        this.f90944u0 = Arrays.clone(bArr3);
        this.v0 = Arrays.clone(bArr4);
        this.f90945w0 = Arrays.clone(bArr5);
        this.f90941r0 = -1L;
    }

    public static XMSSMTPrivateKey getInstance(Object obj) {
        if (obj instanceof XMSSMTPrivateKey) {
            return (XMSSMTPrivateKey) obj;
        }
        if (obj != null) {
            return new XMSSMTPrivateKey(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public byte[] getBdsState() {
        return Arrays.clone(this.f90945w0);
    }

    public long getIndex() {
        return this.f90940q0;
    }

    public long getMaxIndex() {
        return this.f90941r0;
    }

    public byte[] getPublicSeed() {
        return Arrays.clone(this.f90944u0);
    }

    public byte[] getRoot() {
        return Arrays.clone(this.v0);
    }

    public byte[] getSecretKeyPRF() {
        return Arrays.clone(this.f90943t0);
    }

    public byte[] getSecretKeySeed() {
        return Arrays.clone(this.f90942s0);
    }

    public int getVersion() {
        return this.f90939p0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        long j10 = this.f90941r0;
        aSN1EncodableVector.add(j10 >= 0 ? new ASN1Integer(1L) : new ASN1Integer(0L));
        ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
        aSN1EncodableVector2.add(new ASN1Integer(this.f90940q0));
        aSN1EncodableVector2.add(new DEROctetString(this.f90942s0));
        aSN1EncodableVector2.add(new DEROctetString(this.f90943t0));
        aSN1EncodableVector2.add(new DEROctetString(this.f90944u0));
        aSN1EncodableVector2.add(new DEROctetString(this.v0));
        if (j10 >= 0) {
            aSN1EncodableVector2.add(new DERTaggedObject(false, 0, new ASN1Integer(j10)));
        }
        aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector2));
        aSN1EncodableVector.add(new DERTaggedObject(true, 0, new DEROctetString(this.f90945w0)));
        return new DERSequence(aSN1EncodableVector);
    }

    public XMSSMTPrivateKey(long j10, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, long j11) {
        this.f90939p0 = 1;
        this.f90940q0 = j10;
        this.f90942s0 = Arrays.clone(bArr);
        this.f90943t0 = Arrays.clone(bArr2);
        this.f90944u0 = Arrays.clone(bArr3);
        this.v0 = Arrays.clone(bArr4);
        this.f90945w0 = Arrays.clone(bArr5);
        this.f90941r0 = j11;
    }

    public XMSSMTPrivateKey(ASN1Sequence aSN1Sequence) {
        long jLongValueExact;
        ASN1Integer aSN1Integer = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0));
        if (!aSN1Integer.hasValue(BigIntegers.ZERO) && !aSN1Integer.hasValue(BigIntegers.ONE)) {
            throw new IllegalArgumentException("unknown version of sequence");
        }
        this.f90939p0 = aSN1Integer.intValueExact();
        if (aSN1Sequence.size() != 2 && aSN1Sequence.size() != 3) {
            throw new IllegalArgumentException("key sequence wrong size");
        }
        ASN1Sequence aSN1Sequence2 = ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(1));
        this.f90940q0 = ASN1Integer.getInstance(aSN1Sequence2.getObjectAt(0)).longValueExact();
        this.f90942s0 = a.c(aSN1Sequence2, 1);
        this.f90943t0 = a.c(aSN1Sequence2, 2);
        this.f90944u0 = a.c(aSN1Sequence2, 3);
        this.v0 = a.c(aSN1Sequence2, 4);
        if (aSN1Sequence2.size() == 6) {
            ASN1TaggedObject aSN1TaggedObject = ASN1TaggedObject.getInstance(aSN1Sequence2.getObjectAt(5));
            if (aSN1TaggedObject.getTagNo() != 0) {
                throw new IllegalArgumentException("unknown tag in XMSSPrivateKey");
            }
            jLongValueExact = ASN1Integer.getInstance(aSN1TaggedObject, false).longValueExact();
        } else {
            if (aSN1Sequence2.size() != 5) {
                throw new IllegalArgumentException("keySeq should be 5 or 6 in length");
            }
            jLongValueExact = -1;
        }
        this.f90941r0 = jLongValueExact;
        if (aSN1Sequence.size() == 3) {
            this.f90945w0 = Arrays.clone(ASN1OctetString.getInstance(ASN1TaggedObject.getInstance(aSN1Sequence.getObjectAt(2)), true).getOctets());
        } else {
            this.f90945w0 = null;
        }
    }
}
