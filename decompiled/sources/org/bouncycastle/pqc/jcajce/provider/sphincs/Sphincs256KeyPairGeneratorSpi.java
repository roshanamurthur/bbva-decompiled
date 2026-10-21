package org.bouncycastle.pqc.jcajce.provider.sphincs;

import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.digests.SHA3Digest;
import org.bouncycastle.crypto.digests.SHA512tDigest;
import org.bouncycastle.pqc.crypto.sphincs.SPHINCS256KeyGenerationParameters;
import org.bouncycastle.pqc.crypto.sphincs.SPHINCS256KeyPairGenerator;
import org.bouncycastle.pqc.crypto.sphincs.SPHINCSPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.sphincs.SPHINCSPublicKeyParameters;
import org.bouncycastle.pqc.jcajce.spec.SPHINCS256KeyGenParameterSpec;

/* JADX INFO: loaded from: classes13.dex */
public class Sphincs256KeyPairGeneratorSpi extends KeyPairGenerator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ASN1ObjectIdentifier f91511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SPHINCS256KeyGenerationParameters f91512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SPHINCS256KeyPairGenerator f91513c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SecureRandom f91514d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f91515e;

    public Sphincs256KeyPairGeneratorSpi() {
        super("SPHINCS256");
        this.f91511a = NISTObjectIdentifiers.id_sha512_256;
        this.f91513c = new SPHINCS256KeyPairGenerator();
        this.f91514d = CryptoServicesRegistrar.getSecureRandom();
        this.f91515e = false;
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() {
        boolean z10 = this.f91515e;
        SPHINCS256KeyPairGenerator sPHINCS256KeyPairGenerator = this.f91513c;
        if (!z10) {
            SPHINCS256KeyGenerationParameters sPHINCS256KeyGenerationParameters = new SPHINCS256KeyGenerationParameters(this.f91514d, new SHA512tDigest(256));
            this.f91512b = sPHINCS256KeyGenerationParameters;
            sPHINCS256KeyPairGenerator.init(sPHINCS256KeyGenerationParameters);
            this.f91515e = true;
        }
        AsymmetricCipherKeyPair asymmetricCipherKeyPairGenerateKeyPair = sPHINCS256KeyPairGenerator.generateKeyPair();
        return new KeyPair(new BCSphincs256PublicKey(this.f91511a, (SPHINCSPublicKeyParameters) asymmetricCipherKeyPairGenerateKeyPair.getPublic()), new BCSphincs256PrivateKey(this.f91511a, (SPHINCSPrivateKeyParameters) asymmetricCipherKeyPairGenerateKeyPair.getPrivate()));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i10, SecureRandom secureRandom) {
        throw new IllegalArgumentException("use AlgorithmParameterSpec");
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        SPHINCS256KeyGenerationParameters sPHINCS256KeyGenerationParameters;
        if (!(algorithmParameterSpec instanceof SPHINCS256KeyGenParameterSpec)) {
            throw new InvalidAlgorithmParameterException("parameter object not a SPHINCS256KeyGenParameterSpec");
        }
        SPHINCS256KeyGenParameterSpec sPHINCS256KeyGenParameterSpec = (SPHINCS256KeyGenParameterSpec) algorithmParameterSpec;
        if (!sPHINCS256KeyGenParameterSpec.getTreeDigest().equals(SPHINCS256KeyGenParameterSpec.SHA512_256)) {
            if (sPHINCS256KeyGenParameterSpec.getTreeDigest().equals("SHA3-256")) {
                this.f91511a = NISTObjectIdentifiers.id_sha3_256;
                sPHINCS256KeyGenerationParameters = new SPHINCS256KeyGenerationParameters(secureRandom, new SHA3Digest(256));
            }
            this.f91513c.init(this.f91512b);
            this.f91515e = true;
        }
        this.f91511a = NISTObjectIdentifiers.id_sha512_256;
        sPHINCS256KeyGenerationParameters = new SPHINCS256KeyGenerationParameters(secureRandom, new SHA512tDigest(256));
        this.f91512b = sPHINCS256KeyGenerationParameters;
        this.f91513c.init(this.f91512b);
        this.f91515e = true;
    }
}
