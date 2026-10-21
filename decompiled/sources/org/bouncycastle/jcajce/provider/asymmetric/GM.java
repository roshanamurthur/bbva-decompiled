package org.bouncycastle.jcajce.provider.asymmetric;

import androidx.camera.camera2.internal.h0;
import java.util.HashMap;
import org.bouncycastle.asn1.gm.GMObjectIdentifiers;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;

/* JADX INFO: loaded from: classes8.dex */
public class GM {

    public static class Mappings extends AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            configurableProvider.addAlgorithm("Signature.SHA256WITHSM2", "org.bouncycastle.jcajce.provider.asymmetric.ec.GMSignatureSpi$sha256WithSM2");
            h0.c(new StringBuilder("Alg.Alias.Signature."), GMObjectIdentifiers.sm2sign_with_sha256, configurableProvider, "SHA256WITHSM2");
            configurableProvider.addAlgorithm("Signature.SM3WITHSM2", "org.bouncycastle.jcajce.provider.asymmetric.ec.GMSignatureSpi$sm3WithSM2");
            h0.c(new StringBuilder("Alg.Alias.Signature."), GMObjectIdentifiers.sm2sign_with_sm3, configurableProvider, "SM3WITHSM2");
            configurableProvider.addAlgorithm("Cipher.SM2", "org.bouncycastle.jcajce.provider.asymmetric.ec.GMCipherSpi$SM2");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.SM2WITHSM3", "SM2");
            h0.c(new StringBuilder("Alg.Alias.Cipher."), GMObjectIdentifiers.sm2encrypt_with_sm3, configurableProvider, "SM2");
            configurableProvider.addAlgorithm("Cipher.SM2WITHBLAKE2B", "org.bouncycastle.jcajce.provider.asymmetric.ec.GMCipherSpi$SM2withBlake2b");
            h0.c(new StringBuilder("Alg.Alias.Cipher."), GMObjectIdentifiers.sm2encrypt_with_blake2b512, configurableProvider, "SM2WITHBLAKE2B");
            configurableProvider.addAlgorithm("Cipher.SM2WITHBLAKE2S", "org.bouncycastle.jcajce.provider.asymmetric.ec.GMCipherSpi$SM2withBlake2s");
            h0.c(new StringBuilder("Alg.Alias.Cipher."), GMObjectIdentifiers.sm2encrypt_with_blake2s256, configurableProvider, "SM2WITHBLAKE2S");
            configurableProvider.addAlgorithm("Cipher.SM2WITHWHIRLPOOL", "org.bouncycastle.jcajce.provider.asymmetric.ec.GMCipherSpi$SM2withWhirlpool");
            h0.c(new StringBuilder("Alg.Alias.Cipher."), GMObjectIdentifiers.sm2encrypt_with_whirlpool, configurableProvider, "SM2WITHWHIRLPOOL");
            configurableProvider.addAlgorithm("Cipher.SM2WITHMD5", "org.bouncycastle.jcajce.provider.asymmetric.ec.GMCipherSpi$SM2withMD5");
            h0.c(new StringBuilder("Alg.Alias.Cipher."), GMObjectIdentifiers.sm2encrypt_with_md5, configurableProvider, "SM2WITHMD5");
            configurableProvider.addAlgorithm("Cipher.SM2WITHRIPEMD160", "org.bouncycastle.jcajce.provider.asymmetric.ec.GMCipherSpi$SM2withRMD");
            h0.c(new StringBuilder("Alg.Alias.Cipher."), GMObjectIdentifiers.sm2encrypt_with_rmd160, configurableProvider, "SM2WITHRIPEMD160");
            configurableProvider.addAlgorithm("Cipher.SM2WITHSHA1", "org.bouncycastle.jcajce.provider.asymmetric.ec.GMCipherSpi$SM2withSha1");
            h0.c(new StringBuilder("Alg.Alias.Cipher."), GMObjectIdentifiers.sm2encrypt_with_sha1, configurableProvider, "SM2WITHSHA1");
            configurableProvider.addAlgorithm("Cipher.SM2WITHSHA224", "org.bouncycastle.jcajce.provider.asymmetric.ec.GMCipherSpi$SM2withSha224");
            h0.c(new StringBuilder("Alg.Alias.Cipher."), GMObjectIdentifiers.sm2encrypt_with_sha224, configurableProvider, "SM2WITHSHA224");
            configurableProvider.addAlgorithm("Cipher.SM2WITHSHA256", "org.bouncycastle.jcajce.provider.asymmetric.ec.GMCipherSpi$SM2withSha256");
            h0.c(new StringBuilder("Alg.Alias.Cipher."), GMObjectIdentifiers.sm2encrypt_with_sha256, configurableProvider, "SM2WITHSHA256");
            configurableProvider.addAlgorithm("Cipher.SM2WITHSHA384", "org.bouncycastle.jcajce.provider.asymmetric.ec.GMCipherSpi$SM2withSha384");
            h0.c(new StringBuilder("Alg.Alias.Cipher."), GMObjectIdentifiers.sm2encrypt_with_sha384, configurableProvider, "SM2WITHSHA384");
            configurableProvider.addAlgorithm("Cipher.SM2WITHSHA512", "org.bouncycastle.jcajce.provider.asymmetric.ec.GMCipherSpi$SM2withSha512");
            h0.c(new StringBuilder("Alg.Alias.Cipher."), GMObjectIdentifiers.sm2encrypt_with_sha512, configurableProvider, "SM2WITHSHA512");
        }
    }

    static {
        HashMap map = new HashMap();
        map.put("SupportedKeyClasses", "java.security.interfaces.ECPublicKey|java.security.interfaces.ECPrivateKey");
        map.put("SupportedKeyFormats", "PKCS#8|X.509");
    }
}
