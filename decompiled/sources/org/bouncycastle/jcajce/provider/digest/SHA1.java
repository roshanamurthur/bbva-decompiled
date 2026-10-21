package org.bouncycastle.jcajce.provider.digest;

import androidx.camera.camera2.internal.h0;
import androidx.databinding.e;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.iana.IANAObjectIdentifiers;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.digests.SHA1Digest;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;

/* JADX INFO: loaded from: classes8.dex */
public class SHA1 {

    public static class Digest extends BCMessageDigest implements Cloneable {
        public Digest() {
            super(new SHA1Digest());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() throws CloneNotSupportedException {
            Digest digest = (Digest) super.clone();
            digest.digest = new SHA1Digest((SHA1Digest) this.digest);
            return digest;
        }
    }

    public static class HashMac extends BaseMac {
        public HashMac() {
            super(new HMac(new SHA1Digest()));
        }
    }

    public static class KeyGenerator extends BaseKeyGenerator {
        public KeyGenerator() {
            super("HMACSHA1", 160, new CipherKeyGenerator());
        }
    }

    public static class Mappings extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f90062a = SHA1.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            String str = f90062a;
            configurableProvider.addAlgorithm("MessageDigest.SHA-1", str.concat("$Digest"));
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.SHA1", McElieceCCA2KeyGenParameterSpec.SHA1);
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.SHA", McElieceCCA2KeyGenParameterSpec.SHA1);
            StringBuilder sb2 = new StringBuilder("Alg.Alias.MessageDigest.");
            ASN1ObjectIdentifier aSN1ObjectIdentifier = OIWObjectIdentifiers.idSHA1;
            h0.c(sb2, aSN1ObjectIdentifier, configurableProvider, McElieceCCA2KeyGenParameterSpec.SHA1);
            addHMACAlgorithm(configurableProvider, "SHA1", str.concat("$HashMac"), str.concat("$KeyGenerator"));
            addHMACAlias(configurableProvider, "SHA1", PKCSObjectIdentifiers.id_hmacWithSHA1);
            addHMACAlias(configurableProvider, "SHA1", IANAObjectIdentifiers.hmacSHA1);
            configurableProvider.addAlgorithm("Mac.PBEWITHHMACSHA1", e.d(str, "$SHA1Mac", configurableProvider, "Mac.PBEWITHHMACSHA", "$SHA1Mac"));
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHHMACSHA", "PBEWITHHMACSHA1");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory." + aSN1ObjectIdentifier, "PBEWITHHMACSHA1");
            h0.c(new StringBuilder("Alg.Alias.Mac."), aSN1ObjectIdentifier, configurableProvider, "PBEWITHHMACSHA");
            configurableProvider.addAlgorithm("SecretKeyFactory.PBEWITHHMACSHA1", str.concat("$PBEWithMacKeyFactory"));
        }
    }

    public static class PBEWithMacKeyFactory extends PBESecretKeyFactory {
        public PBEWithMacKeyFactory() {
            super("PBEwithHmacSHA", null, false, 2, 1, 160, 0);
        }
    }

    public static class SHA1Mac extends BaseMac {
        public SHA1Mac() {
            super(new HMac(new SHA1Digest()));
        }
    }
}
