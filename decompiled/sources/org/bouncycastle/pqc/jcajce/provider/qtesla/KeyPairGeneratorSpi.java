package org.bouncycastle.pqc.jcajce.provider.qtesla;

import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.util.HashMap;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.pqc.crypto.qtesla.QTESLAKeyGenerationParameters;
import org.bouncycastle.pqc.crypto.qtesla.QTESLAKeyPairGenerator;
import org.bouncycastle.pqc.crypto.qtesla.QTESLAPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.qtesla.QTESLAPublicKeyParameters;
import org.bouncycastle.pqc.crypto.qtesla.QTESLASecurityCategory;
import org.bouncycastle.pqc.jcajce.spec.QTESLAParameterSpec;
import org.bouncycastle.util.Integers;

/* JADX INFO: loaded from: classes13.dex */
public class KeyPairGeneratorSpi extends KeyPairGenerator {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final HashMap f91480d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final QTESLAKeyPairGenerator f91481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SecureRandom f91482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f91483c;

    static {
        HashMap map = new HashMap();
        f91480d = map;
        map.put(QTESLASecurityCategory.getName(5), Integers.valueOf(5));
        map.put(QTESLASecurityCategory.getName(6), Integers.valueOf(6));
    }

    public KeyPairGeneratorSpi() {
        super("qTESLA");
        this.f91481a = new QTESLAKeyPairGenerator();
        this.f91482b = CryptoServicesRegistrar.getSecureRandom();
        this.f91483c = false;
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() {
        boolean z10 = this.f91483c;
        QTESLAKeyPairGenerator qTESLAKeyPairGenerator = this.f91481a;
        if (!z10) {
            qTESLAKeyPairGenerator.init(new QTESLAKeyGenerationParameters(6, this.f91482b));
            this.f91483c = true;
        }
        AsymmetricCipherKeyPair asymmetricCipherKeyPairGenerateKeyPair = qTESLAKeyPairGenerator.generateKeyPair();
        return new KeyPair(new BCqTESLAPublicKey((QTESLAPublicKeyParameters) asymmetricCipherKeyPairGenerateKeyPair.getPublic()), new BCqTESLAPrivateKey((QTESLAPrivateKeyParameters) asymmetricCipherKeyPairGenerateKeyPair.getPrivate()));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i10, SecureRandom secureRandom) {
        throw new IllegalArgumentException("use AlgorithmParameterSpec");
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        if (!(algorithmParameterSpec instanceof QTESLAParameterSpec)) {
            throw new InvalidAlgorithmParameterException("parameter object not a QTESLAParameterSpec");
        }
        this.f91481a.init(new QTESLAKeyGenerationParameters(((Integer) f91480d.get(((QTESLAParameterSpec) algorithmParameterSpec).getSecurityCategory())).intValue(), secureRandom));
        this.f91483c = true;
    }
}
