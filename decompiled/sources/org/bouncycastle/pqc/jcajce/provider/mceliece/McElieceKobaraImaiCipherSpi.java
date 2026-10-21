package org.bouncycastle.pqc.jcajce.provider.mceliece;

import java.io.ByteArrayOutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.BadPaddingException;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.x509.X509ObjectIdentifiers;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.util.DigestFactory;
import org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2KeyParameters;
import org.bouncycastle.pqc.crypto.mceliece.McElieceKobaraImaiCipher;
import org.bouncycastle.pqc.jcajce.provider.util.AsymmetricHybridCipher;

/* JADX INFO: loaded from: classes13.dex */
public class McElieceKobaraImaiCipherSpi extends AsymmetricHybridCipher implements PKCSObjectIdentifiers, X509ObjectIdentifiers {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Digest f91461p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final McElieceKobaraImaiCipher f91462q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final ByteArrayOutputStream f91463r0;

    public static class McElieceKobaraImai extends McElieceKobaraImaiCipherSpi {
        public McElieceKobaraImai() {
            super(DigestFactory.createSHA1(), new McElieceKobaraImaiCipher());
        }
    }

    public static class McElieceKobaraImai224 extends McElieceKobaraImaiCipherSpi {
        public McElieceKobaraImai224() {
            super(DigestFactory.createSHA224(), new McElieceKobaraImaiCipher());
        }
    }

    public static class McElieceKobaraImai256 extends McElieceKobaraImaiCipherSpi {
        public McElieceKobaraImai256() {
            super(DigestFactory.createSHA256(), new McElieceKobaraImaiCipher());
        }
    }

    public static class McElieceKobaraImai384 extends McElieceKobaraImaiCipherSpi {
        public McElieceKobaraImai384() {
            super(DigestFactory.createSHA384(), new McElieceKobaraImaiCipher());
        }
    }

    public static class McElieceKobaraImai512 extends McElieceKobaraImaiCipherSpi {
        public McElieceKobaraImai512() {
            super(DigestFactory.createSHA512(), new McElieceKobaraImaiCipher());
        }
    }

    public McElieceKobaraImaiCipherSpi() {
        this.f91463r0 = new ByteArrayOutputStream();
        this.f91463r0 = new ByteArrayOutputStream();
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.AsymmetricHybridCipher
    public int decryptOutputSize(int i10) {
        return 0;
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.AsymmetricHybridCipher, org.bouncycastle.pqc.jcajce.provider.util.CipherSpiExt
    public byte[] doFinal(byte[] bArr, int i10, int i11) throws BadPaddingException {
        update(bArr, i10, i11);
        int i12 = this.opMode;
        McElieceKobaraImaiCipher mcElieceKobaraImaiCipher = this.f91462q0;
        ByteArrayOutputStream byteArrayOutputStream = this.f91463r0;
        if (i12 == 1) {
            byteArrayOutputStream.write(1);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.reset();
            return mcElieceKobaraImaiCipher.messageEncrypt(byteArray);
        }
        if (i12 != 2) {
            throw new IllegalStateException("unknown mode in doFinal");
        }
        try {
            byte[] byteArray2 = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.reset();
            byte[] bArrMessageDecrypt = mcElieceKobaraImaiCipher.messageDecrypt(byteArray2);
            int length = bArrMessageDecrypt.length - 1;
            while (length >= 0 && bArrMessageDecrypt[length] == 0) {
                length--;
            }
            if (bArrMessageDecrypt[length] != 1) {
                throw new BadPaddingException("invalid ciphertext");
            }
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArrMessageDecrypt, 0, bArr2, 0, length);
            return bArr2;
        } catch (InvalidCipherTextException e5) {
            throw new BadPaddingException(e5.getMessage());
        }
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.AsymmetricHybridCipher
    public int encryptOutputSize(int i10) {
        return 0;
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.CipherSpiExt
    public int getKeySize(Key key) throws InvalidKeyException {
        AsymmetricKeyParameter asymmetricKeyParameterGeneratePrivateKeyParameter;
        boolean z10 = key instanceof PublicKey;
        McElieceKobaraImaiCipher mcElieceKobaraImaiCipher = this.f91462q0;
        if (z10) {
            asymmetricKeyParameterGeneratePrivateKeyParameter = McElieceCCA2KeysToParams.generatePublicKeyParameter((PublicKey) key);
        } else {
            if (!(key instanceof PrivateKey)) {
                throw new InvalidKeyException();
            }
            asymmetricKeyParameterGeneratePrivateKeyParameter = McElieceCCA2KeysToParams.generatePrivateKeyParameter((PrivateKey) key);
        }
        return mcElieceKobaraImaiCipher.getKeySize((McElieceCCA2KeyParameters) asymmetricKeyParameterGeneratePrivateKeyParameter);
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.CipherSpiExt
    public String getName() {
        return "McElieceKobaraImaiCipher";
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.AsymmetricHybridCipher
    public void initCipherDecrypt(Key key, AlgorithmParameterSpec algorithmParameterSpec) throws InvalidKeyException, InvalidAlgorithmParameterException {
        this.f91463r0.reset();
        AsymmetricKeyParameter asymmetricKeyParameterGeneratePrivateKeyParameter = McElieceCCA2KeysToParams.generatePrivateKeyParameter((PrivateKey) key);
        this.f91461p0.reset();
        this.f91462q0.init(false, asymmetricKeyParameterGeneratePrivateKeyParameter);
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.AsymmetricHybridCipher
    public void initCipherEncrypt(Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        this.f91463r0.reset();
        ParametersWithRandom parametersWithRandom = new ParametersWithRandom(McElieceCCA2KeysToParams.generatePublicKeyParameter((PublicKey) key), secureRandom);
        this.f91461p0.reset();
        this.f91462q0.init(true, parametersWithRandom);
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.AsymmetricHybridCipher, org.bouncycastle.pqc.jcajce.provider.util.CipherSpiExt
    public byte[] update(byte[] bArr, int i10, int i11) {
        this.f91463r0.write(bArr, i10, i11);
        return new byte[0];
    }

    public McElieceKobaraImaiCipherSpi(Digest digest, McElieceKobaraImaiCipher mcElieceKobaraImaiCipher) {
        this.f91463r0 = new ByteArrayOutputStream();
        this.f91461p0 = digest;
        this.f91462q0 = mcElieceKobaraImaiCipher;
        this.f91463r0 = new ByteArrayOutputStream();
    }
}
