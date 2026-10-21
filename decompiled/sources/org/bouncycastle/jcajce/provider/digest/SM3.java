package org.bouncycastle.jcajce.provider.digest;

import androidx.camera.camera2.internal.h0;
import org.bouncycastle.asn1.gm.GMObjectIdentifiers;
import org.bouncycastle.crypto.digests.SM3Digest;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

/* JADX INFO: loaded from: classes8.dex */
public class SM3 {

    public static class Digest extends BCMessageDigest implements Cloneable {
        public Digest() {
            super(new SM3Digest());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() throws CloneNotSupportedException {
            Digest digest = (Digest) super.clone();
            digest.digest = new SM3Digest((SM3Digest) this.digest);
            return digest;
        }
    }

    public static class Mappings extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f90068a = SM3.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            configurableProvider.addAlgorithm("MessageDigest.SM3", f90068a.concat("$Digest"));
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.SM3", "SM3");
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.1.2.156.197.1.401", "SM3");
            h0.c(new StringBuilder("Alg.Alias.MessageDigest."), GMObjectIdentifiers.sm3, configurableProvider, "SM3");
        }
    }
}
