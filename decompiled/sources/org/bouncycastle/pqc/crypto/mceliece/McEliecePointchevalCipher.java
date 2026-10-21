package org.bouncycastle.pqc.crypto.mceliece;

import af.c;
import af.d;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.digests.SHA1Digest;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.prng.DigestRandomGenerator;
import org.bouncycastle.pqc.crypto.MessageEncryptor;
import org.bouncycastle.pqc.math.linearalgebra.ByteUtils;
import org.bouncycastle.pqc.math.linearalgebra.GF2Vector;
import vm.a;

/* JADX INFO: loaded from: classes13.dex */
public class McEliecePointchevalCipher implements MessageEncryptor {
    public static final String OID = "1.3.6.1.4.1.8301.3.1.3.4.2.2";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Digest f91176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SecureRandom f91177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f91178c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f91179d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f91180e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public McElieceCCA2KeyParameters f91181f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f91182g;

    public final void a(McElieceCCA2PublicKeyParameters mcElieceCCA2PublicKeyParameters) {
        SecureRandom secureRandom = this.f91177b;
        if (secureRandom == null) {
            secureRandom = CryptoServicesRegistrar.getSecureRandom();
        }
        this.f91177b = secureRandom;
        this.f91176a = d.a(mcElieceCCA2PublicKeyParameters.getDigest());
        this.f91178c = mcElieceCCA2PublicKeyParameters.getN();
        this.f91179d = mcElieceCCA2PublicKeyParameters.getK();
        this.f91180e = mcElieceCCA2PublicKeyParameters.getT();
    }

    public int decryptOutputSize(int i10) {
        return 0;
    }

    public int encryptOutputSize(int i10) {
        return 0;
    }

    public int getKeySize(McElieceCCA2KeyParameters mcElieceCCA2KeyParameters) throws IllegalArgumentException {
        if (mcElieceCCA2KeyParameters instanceof McElieceCCA2PublicKeyParameters) {
            return ((McElieceCCA2PublicKeyParameters) mcElieceCCA2KeyParameters).getN();
        }
        if (mcElieceCCA2KeyParameters instanceof McElieceCCA2PrivateKeyParameters) {
            return ((McElieceCCA2PrivateKeyParameters) mcElieceCCA2KeyParameters).getN();
        }
        throw new IllegalArgumentException("unsupported type");
    }

    @Override // org.bouncycastle.pqc.crypto.MessageEncryptor
    public void init(boolean z10, CipherParameters cipherParameters) {
        this.f91182g = z10;
        if (!z10) {
            McElieceCCA2PrivateKeyParameters mcElieceCCA2PrivateKeyParameters = (McElieceCCA2PrivateKeyParameters) cipherParameters;
            this.f91181f = mcElieceCCA2PrivateKeyParameters;
            this.f91176a = d.a(mcElieceCCA2PrivateKeyParameters.getDigest());
            this.f91178c = mcElieceCCA2PrivateKeyParameters.getN();
            this.f91179d = mcElieceCCA2PrivateKeyParameters.getK();
            this.f91180e = mcElieceCCA2PrivateKeyParameters.getT();
            return;
        }
        if (!(cipherParameters instanceof ParametersWithRandom)) {
            this.f91177b = CryptoServicesRegistrar.getSecureRandom();
            McElieceCCA2PublicKeyParameters mcElieceCCA2PublicKeyParameters = (McElieceCCA2PublicKeyParameters) cipherParameters;
            this.f91181f = mcElieceCCA2PublicKeyParameters;
            a(mcElieceCCA2PublicKeyParameters);
            return;
        }
        ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
        this.f91177b = parametersWithRandom.getRandom();
        McElieceCCA2PublicKeyParameters mcElieceCCA2PublicKeyParameters2 = (McElieceCCA2PublicKeyParameters) parametersWithRandom.getParameters();
        this.f91181f = mcElieceCCA2PublicKeyParameters2;
        a(mcElieceCCA2PublicKeyParameters2);
    }

    @Override // org.bouncycastle.pqc.crypto.MessageEncryptor
    public byte[] messageDecrypt(byte[] bArr) throws InvalidCipherTextException {
        if (this.f91182g) {
            throw new IllegalStateException("cipher initialised for decryption");
        }
        int i10 = (this.f91178c + 7) >> 3;
        int length = bArr.length - i10;
        byte[][] bArrSplit = ByteUtils.split(bArr, i10);
        byte[] bArr2 = bArrSplit[0];
        byte[] bArr3 = bArrSplit[1];
        GF2Vector[] gF2VectorArrA = c.a((McElieceCCA2PrivateKeyParameters) this.f91181f, GF2Vector.OS2VP(this.f91178c, bArr2));
        byte[] encoded = gF2VectorArrA[0].getEncoded();
        GF2Vector gF2Vector = gF2VectorArrA[1];
        DigestRandomGenerator digestRandomGenerator = new DigestRandomGenerator(new SHA1Digest());
        digestRandomGenerator.addSeedMaterial(encoded);
        byte[] bArr4 = new byte[length];
        digestRandomGenerator.nextBytes(bArr4);
        for (int i11 = 0; i11 < length; i11++) {
            bArr4[i11] = (byte) (bArr4[i11] ^ bArr3[i11]);
        }
        this.f91176a.update(bArr4, 0, length);
        byte[] bArr5 = new byte[this.f91176a.getDigestSize()];
        this.f91176a.doFinal(bArr5, 0);
        if (a.a(this.f91178c, this.f91180e, bArr5).equals(gF2Vector)) {
            return ByteUtils.split(bArr4, length - (this.f91179d >> 3))[0];
        }
        throw new InvalidCipherTextException("Bad Padding: Invalid ciphertext.");
    }

    @Override // org.bouncycastle.pqc.crypto.MessageEncryptor
    public byte[] messageEncrypt(byte[] bArr) {
        if (!this.f91182g) {
            throw new IllegalStateException("cipher initialised for decryption");
        }
        int i10 = this.f91179d >> 3;
        byte[] bArr2 = new byte[i10];
        this.f91177b.nextBytes(bArr2);
        GF2Vector gF2Vector = new GF2Vector(this.f91179d, this.f91177b);
        byte[] encoded = gF2Vector.getEncoded();
        byte[] bArrConcatenate = ByteUtils.concatenate(bArr, bArr2);
        this.f91176a.update(bArrConcatenate, 0, bArrConcatenate.length);
        byte[] bArr3 = new byte[this.f91176a.getDigestSize()];
        this.f91176a.doFinal(bArr3, 0);
        byte[] encoded2 = ((GF2Vector) ((McElieceCCA2PublicKeyParameters) this.f91181f).getG().leftMultiplyLeftCompactForm(gF2Vector).add(a.a(this.f91178c, this.f91180e, bArr3))).getEncoded();
        DigestRandomGenerator digestRandomGenerator = new DigestRandomGenerator(new SHA1Digest());
        digestRandomGenerator.addSeedMaterial(encoded);
        byte[] bArr4 = new byte[bArr.length + i10];
        digestRandomGenerator.nextBytes(bArr4);
        for (int i11 = 0; i11 < bArr.length; i11++) {
            bArr4[i11] = (byte) (bArr4[i11] ^ bArr[i11]);
        }
        for (int i12 = 0; i12 < i10; i12++) {
            int length = bArr.length + i12;
            bArr4[length] = (byte) (bArr4[length] ^ bArr2[i12]);
        }
        return ByteUtils.concatenate(encoded2, bArr4);
    }
}
