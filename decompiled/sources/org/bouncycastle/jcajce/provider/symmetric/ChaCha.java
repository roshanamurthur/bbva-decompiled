package org.bouncycastle.jcajce.provider.symmetric;

import androidx.camera.camera2.internal.h0;
import androidx.databinding.e;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.engines.ChaCha7539Engine;
import org.bouncycastle.crypto.engines.ChaChaEngine;
import org.bouncycastle.crypto.modes.AEADCipher;
import org.bouncycastle.crypto.modes.ChaCha20Poly1305;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

/* JADX INFO: loaded from: classes8.dex */
public final class ChaCha {

    public static class AlgParams extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        public String engineToString() {
            return "ChaCha7539 IV";
        }
    }

    public static class AlgParamsCC1305 extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        public String engineToString() {
            return "ChaCha20-Poly1305 IV";
        }
    }

    public static class Base extends BaseStreamCipher {
        public Base() {
            super(new ChaChaEngine(), 8);
        }
    }

    public static class Base7539 extends BaseStreamCipher {
        public Base7539() {
            super(new ChaCha7539Engine(), 12);
        }
    }

    public static class BaseCC20P1305 extends BaseBlockCipher {
        public BaseCC20P1305() {
            super((AEADCipher) new ChaCha20Poly1305(), true, 12);
        }
    }

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super("ChaCha", 128, new CipherKeyGenerator());
        }
    }

    public static class KeyGen7539 extends BaseKeyGenerator {
        public KeyGen7539() {
            super("ChaCha7539", 256, new CipherKeyGenerator());
        }
    }

    public static class Mappings extends AlgorithmProvider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f90139a = ChaCha.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            String str = f90139a;
            configurableProvider.addAlgorithm("KeyGenerator.CHACHA", e.d(str, "$Base", configurableProvider, "Cipher.CHACHA", "$KeyGen"));
            configurableProvider.addAlgorithm("KeyGenerator.CHACHA7539", e.d(str, "$Base7539", configurableProvider, "Cipher.CHACHA7539", "$KeyGen7539"));
            configurableProvider.addAlgorithm("AlgorithmParameters.CHACHA7539", str.concat("$AlgParams"));
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.CHACHA20", "CHACHA7539");
            configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator.CHACHA20", "CHACHA7539");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.CHACHA20", "CHACHA7539");
            configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator.CHACHA20-POLY1305", "CHACHA7539");
            StringBuilder sb2 = new StringBuilder("Alg.Alias.KeyGenerator.");
            ASN1ObjectIdentifier aSN1ObjectIdentifier = PKCSObjectIdentifiers.id_alg_AEADChaCha20Poly1305;
            h0.c(sb2, aSN1ObjectIdentifier, configurableProvider, "CHACHA7539");
            configurableProvider.addAlgorithm("AlgorithmParameters.CHACHA20-POLY1305", e.d(str, "$BaseCC20P1305", configurableProvider, "Cipher.CHACHA20-POLY1305", "$AlgParamsCC1305"));
            configurableProvider.addAlgorithm("Alg.Alias.Cipher." + aSN1ObjectIdentifier, "CHACHA20-POLY1305");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters." + aSN1ObjectIdentifier, "CHACHA20-POLY1305");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.OID." + aSN1ObjectIdentifier, "CHACHA20-POLY1305");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.OID." + aSN1ObjectIdentifier, "CHACHA20-POLY1305");
        }
    }
}
