package org.bouncycastle.jcajce.provider.digest;

import androidx.databinding.e;
import com.vierge.bluetoothlibrary.BluetoothState;
import org.bouncycastle.asn1.ua.UAObjectIdentifiers;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.digests.DSTU7564Digest;
import org.bouncycastle.crypto.macs.DSTU7564Mac;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;

/* JADX INFO: loaded from: classes8.dex */
public class DSTU7564 {

    public static class Digest256 extends DigestDSTU7564 {
        public Digest256() {
            super(256);
        }
    }

    public static class Digest384 extends DigestDSTU7564 {
        public Digest384() {
            super(BluetoothState.REQUEST_CONNECT_DEVICE);
        }
    }

    public static class Digest512 extends DigestDSTU7564 {
        public Digest512() {
            super(512);
        }
    }

    public static class DigestDSTU7564 extends BCMessageDigest implements Cloneable {
        public DigestDSTU7564(int i10) {
            super(new DSTU7564Digest(i10));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() throws CloneNotSupportedException {
            BCMessageDigest bCMessageDigest = (BCMessageDigest) super.clone();
            bCMessageDigest.digest = new DSTU7564Digest((DSTU7564Digest) this.digest);
            return bCMessageDigest;
        }
    }

    public static class HashMac256 extends BaseMac {
        public HashMac256() {
            super(new DSTU7564Mac(256));
        }
    }

    public static class HashMac384 extends BaseMac {
        public HashMac384() {
            super(new DSTU7564Mac(BluetoothState.REQUEST_CONNECT_DEVICE));
        }
    }

    public static class HashMac512 extends BaseMac {
        public HashMac512() {
            super(new DSTU7564Mac(512));
        }
    }

    public static class KeyGenerator256 extends BaseKeyGenerator {
        public KeyGenerator256() {
            super("HMACDSTU7564-256", 256, new CipherKeyGenerator());
        }
    }

    public static class KeyGenerator384 extends BaseKeyGenerator {
        public KeyGenerator384() {
            super("HMACDSTU7564-384", BluetoothState.REQUEST_CONNECT_DEVICE, new CipherKeyGenerator());
        }
    }

    public static class KeyGenerator512 extends BaseKeyGenerator {
        public KeyGenerator512() {
            super("HMACDSTU7564-512", 512, new CipherKeyGenerator());
        }
    }

    public static class Mappings extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f90051a = DSTU7564.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            String str = f90051a;
            configurableProvider.addAlgorithm("MessageDigest.DSTU7564-384", e.d(str, "$Digest256", configurableProvider, "MessageDigest.DSTU7564-256", "$Digest384"));
            configurableProvider.addAlgorithm("MessageDigest.DSTU7564-512", str.concat("$Digest512"));
            configurableProvider.addAlgorithm("MessageDigest", UAObjectIdentifiers.dstu7564digest_256, str.concat("$Digest256"));
            configurableProvider.addAlgorithm("MessageDigest", UAObjectIdentifiers.dstu7564digest_384, str.concat("$Digest384"));
            configurableProvider.addAlgorithm("MessageDigest", UAObjectIdentifiers.dstu7564digest_512, str.concat("$Digest512"));
            addHMACAlgorithm(configurableProvider, "DSTU7564-256", str.concat("$HashMac256"), str.concat("$KeyGenerator256"));
            addHMACAlgorithm(configurableProvider, "DSTU7564-384", str.concat("$HashMac384"), str.concat("$KeyGenerator384"));
            addHMACAlgorithm(configurableProvider, "DSTU7564-512", str.concat("$HashMac512"), str.concat("$KeyGenerator512"));
            addHMACAlias(configurableProvider, "DSTU7564-256", UAObjectIdentifiers.dstu7564mac_256);
            addHMACAlias(configurableProvider, "DSTU7564-384", UAObjectIdentifiers.dstu7564mac_384);
            addHMACAlias(configurableProvider, "DSTU7564-512", UAObjectIdentifiers.dstu7564mac_512);
        }
    }
}
