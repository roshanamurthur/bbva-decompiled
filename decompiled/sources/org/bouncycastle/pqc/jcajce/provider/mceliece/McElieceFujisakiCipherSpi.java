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
import org.bouncycastle.pqc.crypto.mceliece.McElieceFujisakiCipher;
import org.bouncycastle.pqc.jcajce.provider.util.AsymmetricHybridCipher;

/* JADX INFO: loaded from: classes13.dex */
public class McElieceFujisakiCipherSpi extends AsymmetricHybridCipher implements PKCSObjectIdentifiers, X509ObjectIdentifiers {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Digest f91457p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final McElieceFujisakiCipher f91458q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final ByteArrayOutputStream f91459r0 = new ByteArrayOutputStream();

    public static class McElieceFujisaki extends McElieceFujisakiCipherSpi {
        public McElieceFujisaki() {
            super(DigestFactory.createSHA1(), new McElieceFujisakiCipher());
        }
    }

    public McElieceFujisakiCipherSpi(Digest digest, McElieceFujisakiCipher mcElieceFujisakiCipher) {
        this.f91457p0 = digest;
        this.f91458q0 = mcElieceFujisakiCipher;
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.AsymmetricHybridCipher
    public int decryptOutputSize(int i10) {
        return 0;
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.AsymmetricHybridCipher, org.bouncycastle.pqc.jcajce.provider.util.CipherSpiExt
    public byte[] doFinal(byte[] bArr, int i10, int i11) throws BadPaddingException {
        update(bArr, i10, i11);
        ByteArrayOutputStream byteArrayOutputStream = this.f91459r0;
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.reset();
        int i12 = this.opMode;
        McElieceFujisakiCipher mcElieceFujisakiCipher = this.f91458q0;
        if (i12 == 1) {
            return mcElieceFujisakiCipher.messageEncrypt(byteArray);
        }
        if (i12 != 2) {
            throw new IllegalStateException("unknown mode in doFinal");
        }
        try {
            return mcElieceFujisakiCipher.messageDecrypt(byteArray);
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
        return this.f91458q0.getKeySize((McElieceCCA2KeyParameters) (key instanceof PublicKey ? McElieceCCA2KeysToParams.generatePublicKeyParameter((PublicKey) key) : McElieceCCA2KeysToParams.generatePrivateKeyParameter((PrivateKey) key)));
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.CipherSpiExt
    public String getName() {
        return "McElieceFujisakiCipher";
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.AsymmetricHybridCipher
    public void initCipherDecrypt(Key key, AlgorithmParameterSpec algorithmParameterSpec) throws InvalidKeyException, InvalidAlgorithmParameterException {
        AsymmetricKeyParameter asymmetricKeyParameterGeneratePrivateKeyParameter = McElieceCCA2KeysToParams.generatePrivateKeyParameter((PrivateKey) key);
        this.f91457p0.reset();
        this.f91458q0.init(false, asymmetricKeyParameterGeneratePrivateKeyParameter);
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.AsymmetricHybridCipher
    public void initCipherEncrypt(Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        ParametersWithRandom parametersWithRandom = new ParametersWithRandom(McElieceCCA2KeysToParams.generatePublicKeyParameter((PublicKey) key), secureRandom);
        this.f91457p0.reset();
        this.f91458q0.init(true, parametersWithRandom);
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.AsymmetricHybridCipher, org.bouncycastle.pqc.jcajce.provider.util.CipherSpiExt
    public byte[] update(byte[] bArr, int i10, int i11) {
        this.f91459r0.write(bArr, i10, i11);
        return new byte[0];
    }
}
