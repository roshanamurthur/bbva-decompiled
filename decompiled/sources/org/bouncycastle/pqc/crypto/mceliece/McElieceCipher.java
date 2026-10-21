package org.bouncycastle.pqc.crypto.mceliece;

import java.security.SecureRandom;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.pqc.crypto.MessageEncryptor;
import org.bouncycastle.pqc.math.linearalgebra.GF2Matrix;
import org.bouncycastle.pqc.math.linearalgebra.GF2Vector;
import org.bouncycastle.pqc.math.linearalgebra.GF2mField;
import org.bouncycastle.pqc.math.linearalgebra.GoppaCode;
import org.bouncycastle.pqc.math.linearalgebra.Permutation;
import org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM;

/* JADX INFO: loaded from: classes13.dex */
public class McElieceCipher implements MessageEncryptor {
    public static final String OID = "1.3.6.1.4.1.8301.3.1.3.4.1";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SecureRandom f91142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f91143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f91144c;
    public int cipherTextSize;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f91145d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public McElieceKeyParameters f91146e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f91147f;
    public int maxPlainTextSize;

    public final void a(McEliecePublicKeyParameters mcEliecePublicKeyParameters) {
        SecureRandom secureRandom = this.f91142a;
        if (secureRandom == null) {
            secureRandom = CryptoServicesRegistrar.getSecureRandom();
        }
        this.f91142a = secureRandom;
        this.f91143b = mcEliecePublicKeyParameters.getN();
        this.f91144c = mcEliecePublicKeyParameters.getK();
        this.f91145d = mcEliecePublicKeyParameters.getT();
        this.cipherTextSize = this.f91143b >> 3;
        this.maxPlainTextSize = this.f91144c >> 3;
    }

    public int getKeySize(McElieceKeyParameters mcElieceKeyParameters) {
        if (mcElieceKeyParameters instanceof McEliecePublicKeyParameters) {
            return ((McEliecePublicKeyParameters) mcElieceKeyParameters).getN();
        }
        if (mcElieceKeyParameters instanceof McEliecePrivateKeyParameters) {
            return ((McEliecePrivateKeyParameters) mcElieceKeyParameters).getN();
        }
        throw new IllegalArgumentException("unsupported type");
    }

    @Override // org.bouncycastle.pqc.crypto.MessageEncryptor
    public void init(boolean z10, CipherParameters cipherParameters) {
        this.f91147f = z10;
        if (!z10) {
            McEliecePrivateKeyParameters mcEliecePrivateKeyParameters = (McEliecePrivateKeyParameters) cipherParameters;
            this.f91146e = mcEliecePrivateKeyParameters;
            this.f91143b = mcEliecePrivateKeyParameters.getN();
            int k10 = mcEliecePrivateKeyParameters.getK();
            this.f91144c = k10;
            this.maxPlainTextSize = k10 >> 3;
            this.cipherTextSize = this.f91143b >> 3;
            return;
        }
        if (!(cipherParameters instanceof ParametersWithRandom)) {
            this.f91142a = CryptoServicesRegistrar.getSecureRandom();
            McEliecePublicKeyParameters mcEliecePublicKeyParameters = (McEliecePublicKeyParameters) cipherParameters;
            this.f91146e = mcEliecePublicKeyParameters;
            a(mcEliecePublicKeyParameters);
            return;
        }
        ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
        this.f91142a = parametersWithRandom.getRandom();
        McEliecePublicKeyParameters mcEliecePublicKeyParameters2 = (McEliecePublicKeyParameters) parametersWithRandom.getParameters();
        this.f91146e = mcEliecePublicKeyParameters2;
        a(mcEliecePublicKeyParameters2);
    }

    @Override // org.bouncycastle.pqc.crypto.MessageEncryptor
    public byte[] messageDecrypt(byte[] bArr) throws InvalidCipherTextException {
        if (this.f91147f) {
            throw new IllegalStateException("cipher initialised for decryption");
        }
        GF2Vector gF2VectorOS2VP = GF2Vector.OS2VP(this.f91143b, bArr);
        McEliecePrivateKeyParameters mcEliecePrivateKeyParameters = (McEliecePrivateKeyParameters) this.f91146e;
        GF2mField field = mcEliecePrivateKeyParameters.getField();
        PolynomialGF2mSmallM goppaPoly = mcEliecePrivateKeyParameters.getGoppaPoly();
        GF2Matrix sInv = mcEliecePrivateKeyParameters.getSInv();
        Permutation p4 = mcEliecePrivateKeyParameters.getP1();
        Permutation p10 = mcEliecePrivateKeyParameters.getP2();
        GF2Matrix h4 = mcEliecePrivateKeyParameters.getH();
        PolynomialGF2mSmallM[] qInv = mcEliecePrivateKeyParameters.getQInv();
        Permutation permutationRightMultiply = p4.rightMultiply(p10);
        GF2Vector gF2Vector = (GF2Vector) gF2VectorOS2VP.multiply(permutationRightMultiply.computeInverse());
        GF2Vector gF2VectorSyndromeDecode = GoppaCode.syndromeDecode((GF2Vector) h4.rightMultiply(gF2Vector), field, goppaPoly, qInv);
        GF2Vector gF2Vector2 = (GF2Vector) ((GF2Vector) gF2Vector.add(gF2VectorSyndromeDecode)).multiply(p4);
        byte[] encoded = ((GF2Vector) sInv.leftMultiply(gF2Vector2.extractRightVector(this.f91144c))).getEncoded();
        int length = encoded.length - 1;
        while (length >= 0 && encoded[length] == 0) {
            length--;
        }
        if (length < 0 || encoded[length] != 1) {
            throw new InvalidCipherTextException("Bad Padding: invalid ciphertext");
        }
        byte[] bArr2 = new byte[length];
        System.arraycopy(encoded, 0, bArr2, 0, length);
        return bArr2;
    }

    @Override // org.bouncycastle.pqc.crypto.MessageEncryptor
    public byte[] messageEncrypt(byte[] bArr) {
        if (!this.f91147f) {
            throw new IllegalStateException("cipher initialised for decryption");
        }
        byte[] bArr2 = new byte[this.maxPlainTextSize + ((this.f91144c & 7) != 0 ? 1 : 0)];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        bArr2[bArr.length] = 1;
        return ((GF2Vector) ((McEliecePublicKeyParameters) this.f91146e).getG().leftMultiply(GF2Vector.OS2VP(this.f91144c, bArr2)).add(new GF2Vector(this.f91143b, this.f91145d, this.f91142a))).getEncoded();
    }
}
