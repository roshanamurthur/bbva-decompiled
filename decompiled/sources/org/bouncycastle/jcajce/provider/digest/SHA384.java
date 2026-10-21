package org.bouncycastle.jcajce.provider.digest;

import androidx.camera.camera2.internal.h0;
import androidx.databinding.e;
import com.vierge.bluetoothlibrary.BluetoothState;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.digests.SHA384Digest;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.crypto.macs.OldHMac;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;

/* JADX INFO: loaded from: classes8.dex */
public class SHA384 {

    public static class Digest extends BCMessageDigest implements Cloneable {
        public Digest() {
            super(new SHA384Digest());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() throws CloneNotSupportedException {
            Digest digest = (Digest) super.clone();
            digest.digest = new SHA384Digest((SHA384Digest) this.digest);
            return digest;
        }
    }

    public static class HashMac extends BaseMac {
        public HashMac() {
            super(new HMac(new SHA384Digest()));
        }
    }

    public static class KeyGenerator extends BaseKeyGenerator {
        public KeyGenerator() {
            super("HMACSHA384", BluetoothState.REQUEST_CONNECT_DEVICE, new CipherKeyGenerator());
        }
    }

    public static class Mappings extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f90066a = SHA384.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            String str = f90066a;
            configurableProvider.addAlgorithm("MessageDigest.SHA-384", str.concat("$Digest"));
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.SHA384", McElieceCCA2KeyGenParameterSpec.SHA384);
            h0.c(new StringBuilder("Alg.Alias.MessageDigest."), NISTObjectIdentifiers.id_sha384, configurableProvider, McElieceCCA2KeyGenParameterSpec.SHA384);
            configurableProvider.addAlgorithm("Mac.PBEWITHHMACSHA384", e.d(str, "$OldSHA384", configurableProvider, "Mac.OLDHMACSHA384", "$HashMac"));
            addHMACAlgorithm(configurableProvider, "SHA384", str.concat("$HashMac"), str.concat("$KeyGenerator"));
            addHMACAlias(configurableProvider, "SHA384", PKCSObjectIdentifiers.id_hmacWithSHA384);
        }
    }

    public static class OldSHA384 extends BaseMac {
        public OldSHA384() {
            super(new OldHMac(new SHA384Digest()));
        }
    }
}
