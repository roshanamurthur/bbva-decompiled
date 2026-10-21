package org.bouncycastle.jcajce.provider.digest;

import androidx.camera.camera2.internal.h0;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.digests.MD2Digest;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;

/* JADX INFO: loaded from: classes8.dex */
public class MD2 {

    public static class Digest extends BCMessageDigest implements Cloneable {
        public Digest() {
            super(new MD2Digest());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() throws CloneNotSupportedException {
            Digest digest = (Digest) super.clone();
            digest.digest = new MD2Digest((MD2Digest) this.digest);
            return digest;
        }
    }

    public static class HashMac extends BaseMac {
        public HashMac() {
            super(new HMac(new MD2Digest()));
        }
    }

    public static class KeyGenerator extends BaseKeyGenerator {
        public KeyGenerator() {
            super("HMACMD2", 128, new CipherKeyGenerator());
        }
    }

    public static class Mappings extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f90055a = MD2.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            String str = f90055a;
            h0.c(androidx.collection.a.d(str, "$Digest", configurableProvider, "MessageDigest.MD2", "Alg.Alias.MessageDigest."), PKCSObjectIdentifiers.md2, configurableProvider, "MD2");
            addHMACAlgorithm(configurableProvider, "MD2", str.concat("$HashMac"), str.concat("$KeyGenerator"));
        }
    }
}
