package org.bouncycastle.jcajce.provider.asymmetric.edec;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import java.security.KeyPair;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.ECGenParameterSpec;
import org.bouncycastle.asn1.edec.EdECObjectIdentifiers;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.generators.Ed25519KeyPairGenerator;
import org.bouncycastle.crypto.generators.Ed448KeyPairGenerator;
import org.bouncycastle.crypto.generators.X25519KeyPairGenerator;
import org.bouncycastle.crypto.generators.X448KeyPairGenerator;
import org.bouncycastle.crypto.params.Ed25519KeyGenerationParameters;
import org.bouncycastle.crypto.params.Ed448KeyGenerationParameters;
import org.bouncycastle.crypto.params.X25519KeyGenerationParameters;
import org.bouncycastle.crypto.params.X448KeyGenerationParameters;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jcajce.spec.EdDSAParameterSpec;
import org.bouncycastle.jcajce.spec.XDHParameterSpec;
import org.bouncycastle.jce.spec.ECNamedCurveGenParameterSpec;

/* JADX INFO: loaded from: classes8.dex */
public class KeyPairGeneratorSpi extends java.security.KeyPairGeneratorSpi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f89939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AsymmetricCipherKeyPairGenerator f89940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f89941c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SecureRandom f89942d;

    public static final class Ed25519 extends KeyPairGeneratorSpi {
        public Ed25519() {
            super(1, new Ed25519KeyPairGenerator());
        }
    }

    public static final class Ed448 extends KeyPairGeneratorSpi {
        public Ed448() {
            super(0, new Ed448KeyPairGenerator());
        }
    }

    public static final class EdDSA extends KeyPairGeneratorSpi {
        public EdDSA() {
            super(-1, null);
        }
    }

    public static final class X25519 extends KeyPairGeneratorSpi {
        public X25519() {
            super(3, new X25519KeyPairGenerator());
        }
    }

    public static final class X448 extends KeyPairGeneratorSpi {
        public X448() {
            super(2, new X448KeyPairGenerator());
        }
    }

    public static final class XDH extends KeyPairGeneratorSpi {
        public XDH() {
            super(-2, null);
        }
    }

    public KeyPairGeneratorSpi(int i10, AsymmetricCipherKeyPairGenerator asymmetricCipherKeyPairGenerator) {
        this.f89939a = i10;
        this.f89940b = asymmetricCipherKeyPairGenerator;
    }

    public final void a(int i10) throws InvalidAlgorithmParameterException {
        int i11 = this.f89939a;
        if (i11 != i10) {
            if (i11 == 1 || i11 == 0) {
                throw new InvalidAlgorithmParameterException("parameterSpec for wrong curve type");
            }
            if (i11 == -1 && i10 != 1 && i10 != 0) {
                throw new InvalidAlgorithmParameterException("parameterSpec for wrong curve type");
            }
            if (i11 == 3 || i11 == 2) {
                throw new InvalidAlgorithmParameterException("parameterSpec for wrong curve type");
            }
            if (i11 == -2 && i10 != 3 && i10 != 2) {
                throw new InvalidAlgorithmParameterException("parameterSpec for wrong curve type");
            }
            this.f89939a = i10;
        }
    }

    public final void b(String str) throws InvalidAlgorithmParameterException {
        int i10;
        AsymmetricCipherKeyPairGenerator ed448KeyPairGenerator;
        if (str.equalsIgnoreCase(EdDSAParameterSpec.Ed448) || str.equals(EdECObjectIdentifiers.id_Ed448.getId())) {
            i10 = 0;
            a(0);
            ed448KeyPairGenerator = new Ed448KeyPairGenerator();
        } else if (str.equalsIgnoreCase(EdDSAParameterSpec.Ed25519) || str.equals(EdECObjectIdentifiers.id_Ed25519.getId())) {
            i10 = 1;
            a(1);
            ed448KeyPairGenerator = new Ed25519KeyPairGenerator();
        } else if (str.equalsIgnoreCase(XDHParameterSpec.X448) || str.equals(EdECObjectIdentifiers.id_X448.getId())) {
            i10 = 2;
            a(2);
            ed448KeyPairGenerator = new X448KeyPairGenerator();
        } else {
            if (!str.equalsIgnoreCase(XDHParameterSpec.X25519) && !str.equals(EdECObjectIdentifiers.id_X25519.getId())) {
                return;
            }
            i10 = 3;
            a(3);
            ed448KeyPairGenerator = new X25519KeyPairGenerator();
        }
        this.f89940b = ed448KeyPairGenerator;
        c(i10);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0035  */
    public final void c(int i10) {
        AsymmetricCipherKeyPairGenerator asymmetricCipherKeyPairGenerator;
        KeyGenerationParameters x25519KeyGenerationParameters;
        this.f89941c = true;
        if (this.f89942d == null) {
            this.f89942d = CryptoServicesRegistrar.getSecureRandom();
        }
        if (i10 == -2) {
            asymmetricCipherKeyPairGenerator = this.f89940b;
            x25519KeyGenerationParameters = new X25519KeyGenerationParameters(this.f89942d);
        } else if (i10 == -1) {
            asymmetricCipherKeyPairGenerator = this.f89940b;
            x25519KeyGenerationParameters = new Ed25519KeyGenerationParameters(this.f89942d);
        } else if (i10 == 0) {
            asymmetricCipherKeyPairGenerator = this.f89940b;
            x25519KeyGenerationParameters = new Ed448KeyGenerationParameters(this.f89942d);
        } else if (i10 == 1) {
            asymmetricCipherKeyPairGenerator = this.f89940b;
            x25519KeyGenerationParameters = new Ed25519KeyGenerationParameters(this.f89942d);
        } else if (i10 != 2) {
            if (i10 != 3) {
                return;
            }
            asymmetricCipherKeyPairGenerator = this.f89940b;
            x25519KeyGenerationParameters = new X25519KeyGenerationParameters(this.f89942d);
        } else {
            asymmetricCipherKeyPairGenerator = this.f89940b;
            x25519KeyGenerationParameters = new X448KeyGenerationParameters(this.f89942d);
        }
        asymmetricCipherKeyPairGenerator.init(x25519KeyGenerationParameters);
    }

    @Override // java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() {
        if (this.f89940b == null) {
            throw new IllegalStateException("generator not correctly initialized");
        }
        if (!this.f89941c) {
            c(this.f89939a);
        }
        AsymmetricCipherKeyPair asymmetricCipherKeyPairGenerateKeyPair = this.f89940b.generateKeyPair();
        int i10 = this.f89939a;
        if (i10 == 0) {
            return new KeyPair(new BCEdDSAPublicKey(asymmetricCipherKeyPairGenerateKeyPair.getPublic()), new BCEdDSAPrivateKey(asymmetricCipherKeyPairGenerateKeyPair.getPrivate()));
        }
        if (i10 == 1) {
            return new KeyPair(new BCEdDSAPublicKey(asymmetricCipherKeyPairGenerateKeyPair.getPublic()), new BCEdDSAPrivateKey(asymmetricCipherKeyPairGenerateKeyPair.getPrivate()));
        }
        if (i10 == 2) {
            return new KeyPair(new BCXDHPublicKey(asymmetricCipherKeyPairGenerateKeyPair.getPublic()), new BCXDHPrivateKey(asymmetricCipherKeyPairGenerateKeyPair.getPrivate()));
        }
        if (i10 == 3) {
            return new KeyPair(new BCXDHPublicKey(asymmetricCipherKeyPairGenerateKeyPair.getPublic()), new BCXDHPrivateKey(asymmetricCipherKeyPairGenerateKeyPair.getPrivate()));
        }
        throw new IllegalStateException("generator not correctly initialized");
    }

    @Override // java.security.KeyPairGeneratorSpi
    public void initialize(int i10, SecureRandom secureRandom) {
        int i11;
        this.f89942d = secureRandom;
        try {
            if (i10 == 255 || i10 == 256) {
                int i12 = this.f89939a;
                i11 = 3;
                if (i12 != -2) {
                    if (i12 == -1 || i12 == 1) {
                        a(1);
                        this.f89940b = new Ed25519KeyPairGenerator();
                        c(1);
                        return;
                    } else if (i12 != 3) {
                        throw new InvalidParameterException("key size not configurable");
                    }
                }
                a(3);
                this.f89940b = new X25519KeyPairGenerator();
            } else {
                if (i10 != 448) {
                    throw new InvalidParameterException("unknown key size");
                }
                int i13 = this.f89939a;
                i11 = 2;
                if (i13 != -2) {
                    if (i13 == -1 || i13 == 0) {
                        a(0);
                        this.f89940b = new Ed448KeyPairGenerator();
                        c(0);
                        return;
                    } else if (i13 != 2) {
                        throw new InvalidParameterException("key size not configurable");
                    }
                }
                a(2);
                this.f89940b = new X448KeyPairGenerator();
            }
            c(i11);
        } catch (InvalidAlgorithmParameterException e5) {
            throw new InvalidParameterException(e5.getMessage());
        }
    }

    @Override // java.security.KeyPairGeneratorSpi
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        String curveName;
        this.f89942d = secureRandom;
        if (algorithmParameterSpec instanceof ECGenParameterSpec) {
            curveName = ((ECGenParameterSpec) algorithmParameterSpec).getName();
        } else if (algorithmParameterSpec instanceof ECNamedCurveGenParameterSpec) {
            curveName = ((ECNamedCurveGenParameterSpec) algorithmParameterSpec).getName();
        } else if (algorithmParameterSpec instanceof EdDSAParameterSpec) {
            curveName = ((EdDSAParameterSpec) algorithmParameterSpec).getCurveName();
        } else {
            if (!(algorithmParameterSpec instanceof XDHParameterSpec)) {
                String nameFrom = ECUtil.getNameFrom(algorithmParameterSpec);
                if (nameFrom != null) {
                    b(nameFrom);
                    return;
                } else {
                    throw new InvalidAlgorithmParameterException("invalid parameterSpec: " + algorithmParameterSpec);
                }
            }
            curveName = ((XDHParameterSpec) algorithmParameterSpec).getCurveName();
        }
        b(curveName);
    }
}
