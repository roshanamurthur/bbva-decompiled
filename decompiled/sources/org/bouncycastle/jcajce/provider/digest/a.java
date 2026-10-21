package org.bouncycastle.jcajce.provider.digest;

import androidx.camera.camera2.internal.h0;
import androidx.camera.core.processing.f;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

/* JADX INFO: loaded from: classes8.dex */
public abstract class a extends AlgorithmProvider {
    public void addHMACAlgorithm(ConfigurableProvider configurableProvider, String str, String str2, String str3) {
        String strD = f.d("HMAC", str);
        configurableProvider.addAlgorithm("Mac." + strD, str2);
        configurableProvider.addAlgorithm("Alg.Alias.Mac.HMAC-" + str, strD);
        configurableProvider.addAlgorithm("Alg.Alias.Mac.HMAC/" + str, strD);
        configurableProvider.addAlgorithm("KeyGenerator." + strD, str3);
        configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator.HMAC-" + str, strD);
        configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator.HMAC/" + str, strD);
    }

    public void addHMACAlias(ConfigurableProvider configurableProvider, String str, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        String strD = f.d("HMAC", str);
        configurableProvider.addAlgorithm("Alg.Alias.Mac." + aSN1ObjectIdentifier, strD);
        h0.c(new StringBuilder("Alg.Alias.KeyGenerator."), aSN1ObjectIdentifier, configurableProvider, strD);
    }
}
