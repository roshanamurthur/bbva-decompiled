package org.bouncycastle.jcajce.provider.util;

import androidx.camera.camera2.internal.h0;
import androidx.camera.core.impl.utils.a;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

/* JADX INFO: loaded from: classes8.dex */
public abstract class AsymmetricAlgorithmProvider extends AlgorithmProvider {
    public void addSignatureAlgorithm(ConfigurableProvider configurableProvider, String str, String str2, String str3, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        String strB = a.b(str, "WITH", str2);
        String strB2 = a.b(str, JsonPOJOBuilder.DEFAULT_WITH_PREFIX, str2);
        String strB3 = a.b(str, "With", str2);
        String strB4 = a.b(str, "/", str2);
        configurableProvider.addAlgorithm("Signature." + strB, str3);
        configurableProvider.addAlgorithm("Alg.Alias.Signature." + strB2, strB);
        configurableProvider.addAlgorithm("Alg.Alias.Signature." + strB3, strB);
        configurableProvider.addAlgorithm("Alg.Alias.Signature." + strB4, strB);
        h0.c(androidx.fragment.app.a.b(new StringBuilder("Alg.Alias.Signature."), aSN1ObjectIdentifier, configurableProvider, strB, "Alg.Alias.Signature.OID."), aSN1ObjectIdentifier, configurableProvider, strB);
    }

    public void registerOid(ConfigurableProvider configurableProvider, ASN1ObjectIdentifier aSN1ObjectIdentifier, String str, AsymmetricKeyInfoConverter asymmetricKeyInfoConverter) {
        configurableProvider.addAlgorithm("Alg.Alias.KeyFactory." + aSN1ObjectIdentifier, str);
        h0.c(new StringBuilder("Alg.Alias.KeyPairGenerator."), aSN1ObjectIdentifier, configurableProvider, str);
        configurableProvider.addKeyInfoConverter(aSN1ObjectIdentifier, asymmetricKeyInfoConverter);
    }

    public void registerOidAlgorithmParameterGenerator(ConfigurableProvider configurableProvider, ASN1ObjectIdentifier aSN1ObjectIdentifier, String str) {
        configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator." + aSN1ObjectIdentifier, str);
        h0.c(new StringBuilder("Alg.Alias.AlgorithmParameters."), aSN1ObjectIdentifier, configurableProvider, str);
    }

    public void registerOidAlgorithmParameters(ConfigurableProvider configurableProvider, ASN1ObjectIdentifier aSN1ObjectIdentifier, String str) {
        configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters." + aSN1ObjectIdentifier, str);
    }

    public void addSignatureAlgorithm(ConfigurableProvider configurableProvider, String str, String str2, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        configurableProvider.addAlgorithm("Signature." + str, str2);
        h0.c(androidx.fragment.app.a.b(new StringBuilder("Alg.Alias.Signature."), aSN1ObjectIdentifier, configurableProvider, str, "Alg.Alias.Signature.OID."), aSN1ObjectIdentifier, configurableProvider, str);
    }
}
