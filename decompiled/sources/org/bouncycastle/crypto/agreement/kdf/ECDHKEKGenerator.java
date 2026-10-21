package org.bouncycastle.crypto.agreement.kdf;

import androidx.camera.core.impl.a;
import java.io.IOException;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.DerivationParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.DigestDerivationFunction;
import org.bouncycastle.crypto.generators.KDF2BytesGenerator;
import org.bouncycastle.crypto.params.KDFParameters;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes2.dex */
public class ECDHKEKGenerator implements DigestDerivationFunction {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KDF2BytesGenerator f87948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ASN1ObjectIdentifier f87949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f87950c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f87951d;

    public ECDHKEKGenerator(Digest digest) {
        this.f87948a = new KDF2BytesGenerator(digest);
    }

    @Override // org.bouncycastle.crypto.DerivationFunction
    public int generateBytes(byte[] bArr, int i10, int i11) throws DataLengthException, IllegalArgumentException {
        if (i10 + i11 > bArr.length) {
            throw new DataLengthException("output buffer too small");
        }
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(new AlgorithmIdentifier(this.f87949b, DERNull.INSTANCE));
        aSN1EncodableVector.add(new DERTaggedObject(true, 2, new DEROctetString(Pack.intToBigEndian(this.f87950c))));
        KDF2BytesGenerator kDF2BytesGenerator = this.f87948a;
        try {
            kDF2BytesGenerator.init(new KDFParameters(this.f87951d, new DERSequence(aSN1EncodableVector).getEncoded(ASN1Encoding.DER)));
            return kDF2BytesGenerator.generateBytes(bArr, i10, i11);
        } catch (IOException e5) {
            throw new IllegalArgumentException(a.d(e5, new StringBuilder("unable to initialise kdf: ")));
        }
    }

    @Override // org.bouncycastle.crypto.DigestDerivationFunction
    public Digest getDigest() {
        return this.f87948a.getDigest();
    }

    @Override // org.bouncycastle.crypto.DerivationFunction
    public void init(DerivationParameters derivationParameters) {
        DHKDFParameters dHKDFParameters = (DHKDFParameters) derivationParameters;
        this.f87949b = dHKDFParameters.getAlgorithm();
        this.f87950c = dHKDFParameters.getKeySize();
        this.f87951d = dHKDFParameters.getZ();
    }
}
