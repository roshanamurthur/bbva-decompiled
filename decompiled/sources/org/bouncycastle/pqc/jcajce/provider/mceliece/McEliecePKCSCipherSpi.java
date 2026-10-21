package org.bouncycastle.pqc.jcajce.provider.mceliece;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.x509.X509ObjectIdentifiers;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.pqc.crypto.mceliece.McElieceCipher;
import org.bouncycastle.pqc.crypto.mceliece.McElieceKeyParameters;
import org.bouncycastle.pqc.jcajce.provider.util.AsymmetricBlockCipher;

/* JADX INFO: loaded from: classes13.dex */
public class McEliecePKCSCipherSpi extends AsymmetricBlockCipher implements PKCSObjectIdentifiers, X509ObjectIdentifiers {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final McElieceCipher f91464p0;

    public static class McEliecePKCS extends McEliecePKCSCipherSpi {
        public McEliecePKCS() {
            super(new McElieceCipher());
        }
    }

    public McEliecePKCSCipherSpi(McElieceCipher mcElieceCipher) {
        this.f91464p0 = mcElieceCipher;
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.CipherSpiExt
    public int getKeySize(Key key) throws InvalidKeyException {
        return this.f91464p0.getKeySize((McElieceKeyParameters) (key instanceof PublicKey ? McElieceKeysToParams.generatePublicKeyParameter((PublicKey) key) : McElieceKeysToParams.generatePrivateKeyParameter((PrivateKey) key)));
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.CipherSpiExt
    public String getName() {
        return "McEliecePKCS";
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.AsymmetricBlockCipher
    public void initCipherDecrypt(Key key, AlgorithmParameterSpec algorithmParameterSpec) throws InvalidKeyException, InvalidAlgorithmParameterException {
        AsymmetricKeyParameter asymmetricKeyParameterGeneratePrivateKeyParameter = McElieceKeysToParams.generatePrivateKeyParameter((PrivateKey) key);
        McElieceCipher mcElieceCipher = this.f91464p0;
        mcElieceCipher.init(false, asymmetricKeyParameterGeneratePrivateKeyParameter);
        this.maxPlainTextSize = mcElieceCipher.maxPlainTextSize;
        this.cipherTextSize = mcElieceCipher.cipherTextSize;
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.AsymmetricBlockCipher
    public void initCipherEncrypt(Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        ParametersWithRandom parametersWithRandom = new ParametersWithRandom(McElieceKeysToParams.generatePublicKeyParameter((PublicKey) key), secureRandom);
        McElieceCipher mcElieceCipher = this.f91464p0;
        mcElieceCipher.init(true, parametersWithRandom);
        this.maxPlainTextSize = mcElieceCipher.maxPlainTextSize;
        this.cipherTextSize = mcElieceCipher.cipherTextSize;
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.AsymmetricBlockCipher
    public byte[] messageDecrypt(byte[] bArr) throws BadPaddingException, IllegalBlockSizeException {
        try {
            return this.f91464p0.messageDecrypt(bArr);
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.AsymmetricBlockCipher
    public byte[] messageEncrypt(byte[] bArr) throws BadPaddingException, IllegalBlockSizeException {
        try {
            return this.f91464p0.messageEncrypt(bArr);
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }
}
