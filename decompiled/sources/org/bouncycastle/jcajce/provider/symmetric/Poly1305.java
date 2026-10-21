package org.bouncycastle.jcajce.provider.symmetric;

import androidx.databinding.e;
import org.bouncycastle.crypto.generators.Poly1305KeyGenerator;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

/* JADX INFO: loaded from: classes8.dex */
public class Poly1305 {

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super("Poly1305", 256, new Poly1305KeyGenerator());
        }
    }

    public static class Mac extends BaseMac {
        public Mac() {
            super(new org.bouncycastle.crypto.macs.Poly1305());
        }
    }

    public static class Mappings extends AlgorithmProvider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f90176a = Poly1305.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            configurableProvider.addAlgorithm("KeyGenerator.POLY1305", e.d(f90176a, "$Mac", configurableProvider, "Mac.POLY1305", "$KeyGen"));
        }
    }
}
