package org.bouncycastle.pqc.jcajce.provider;

import androidx.camera.camera2.internal.h0;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;

/* JADX INFO: loaded from: classes13.dex */
public class LMS {

    public static class Mappings extends AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            configurableProvider.addAlgorithm("KeyFactory.LMS", "org.bouncycastle.pqc.jcajce.provider.lms.LMSKeyFactorySpi");
            StringBuilder sb2 = new StringBuilder("Alg.Alias.KeyFactory.");
            ASN1ObjectIdentifier aSN1ObjectIdentifier = PKCSObjectIdentifiers.id_alg_hss_lms_hashsig;
            h0.c(sb2, aSN1ObjectIdentifier, configurableProvider, "LMS");
            configurableProvider.addAlgorithm("KeyPairGenerator.LMS", "org.bouncycastle.pqc.jcajce.provider.lms.LMSKeyPairGeneratorSpi");
            configurableProvider.addAlgorithm("Alg.Alias.KeyPairGenerator." + aSN1ObjectIdentifier, "LMS");
            configurableProvider.addAlgorithm("Signature.LMS", "org.bouncycastle.pqc.jcajce.provider.lms.LMSSignatureSpi$generic");
            configurableProvider.addAlgorithm("Alg.Alias.Signature." + aSN1ObjectIdentifier, "LMS");
        }
    }
}
