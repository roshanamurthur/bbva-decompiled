package org.bouncycastle.crypto.agreement.kdf;

import androidx.camera.core.impl.a;
import java.io.IOException;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.DerivationFunction;
import org.bouncycastle.crypto.DerivationParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes2.dex */
public class DHKEKGenerator implements DerivationFunction {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Digest f87943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ASN1ObjectIdentifier f87944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f87945c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f87946d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f87947e;

    public DHKEKGenerator(Digest digest) {
        this.f87943a = digest;
    }

    @Override // org.bouncycastle.crypto.DerivationFunction
    public int generateBytes(byte[] bArr, int i10, int i11) throws DataLengthException, IllegalArgumentException {
        boolean z10;
        int i12 = i11;
        int i13 = i10;
        if (bArr.length - i12 < i13) {
            throw new OutputLengthException("output buffer too small");
        }
        long j10 = i12;
        Digest digest = this.f87943a;
        int digestSize = digest.getDigestSize();
        if (j10 > 8589934591L) {
            throw new IllegalArgumentException("Output length too large");
        }
        long j11 = digestSize;
        byte[] bArr2 = new byte[digest.getDigestSize()];
        int i14 = 0;
        int i15 = 0;
        int i16 = 1;
        for (int i17 = (int) (((j10 + j11) - 1) / j11); i15 < i17; i17 = i17) {
            byte[] bArr3 = this.f87946d;
            digest.update(bArr3, i14, bArr3.length);
            ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
            ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
            aSN1EncodableVector2.add(this.f87944b);
            aSN1EncodableVector2.add(new DEROctetString(Pack.intToBigEndian(i16)));
            aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector2));
            byte[] bArr4 = this.f87947e;
            if (bArr4 != null) {
                DEROctetString dEROctetString = new DEROctetString(bArr4);
                z10 = true;
                aSN1EncodableVector.add(new DERTaggedObject(true, 0, dEROctetString));
            } else {
                z10 = true;
            }
            aSN1EncodableVector.add(new DERTaggedObject(z10, 2, new DEROctetString(Pack.intToBigEndian(this.f87945c))));
            try {
                byte[] encoded = new DERSequence(aSN1EncodableVector).getEncoded(ASN1Encoding.DER);
                digest.update(encoded, 0, encoded.length);
                digest.doFinal(bArr2, 0);
                if (i12 > digestSize) {
                    System.arraycopy(bArr2, 0, bArr, i13, digestSize);
                    i13 += digestSize;
                    i12 -= digestSize;
                } else {
                    System.arraycopy(bArr2, 0, bArr, i13, i12);
                }
                i16++;
                i15++;
                i14 = 0;
            } catch (IOException e5) {
                throw new IllegalArgumentException(a.d(e5, new StringBuilder("unable to encode parameter info: ")));
            }
        }
        digest.reset();
        return (int) j10;
    }

    public Digest getDigest() {
        return this.f87943a;
    }

    @Override // org.bouncycastle.crypto.DerivationFunction
    public void init(DerivationParameters derivationParameters) {
        DHKDFParameters dHKDFParameters = (DHKDFParameters) derivationParameters;
        this.f87944b = dHKDFParameters.getAlgorithm();
        this.f87945c = dHKDFParameters.getKeySize();
        this.f87946d = dHKDFParameters.getZ();
        this.f87947e = dHKDFParameters.getExtraInfo();
    }
}
