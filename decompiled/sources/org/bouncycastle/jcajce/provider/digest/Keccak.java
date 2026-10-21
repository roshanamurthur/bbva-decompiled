package org.bouncycastle.jcajce.provider.digest;

import androidx.databinding.e;
import com.vierge.bluetoothlibrary.BluetoothState;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.digests.KeccakDigest;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;

/* JADX INFO: loaded from: classes8.dex */
public class Keccak {

    public static class Digest224 extends DigestKeccak {
        public Digest224() {
            super(224);
        }
    }

    public static class Digest256 extends DigestKeccak {
        public Digest256() {
            super(256);
        }
    }

    public static class Digest288 extends DigestKeccak {
        public Digest288() {
            super(288);
        }
    }

    public static class Digest384 extends DigestKeccak {
        public Digest384() {
            super(BluetoothState.REQUEST_CONNECT_DEVICE);
        }
    }

    public static class Digest512 extends DigestKeccak {
        public Digest512() {
            super(512);
        }
    }

    public static class DigestKeccak extends BCMessageDigest implements Cloneable {
        public DigestKeccak(int i10) {
            super(new KeccakDigest(i10));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() throws CloneNotSupportedException {
            BCMessageDigest bCMessageDigest = (BCMessageDigest) super.clone();
            bCMessageDigest.digest = new KeccakDigest((KeccakDigest) this.digest);
            return bCMessageDigest;
        }
    }

    public static class HashMac224 extends BaseMac {
        public HashMac224() {
            super(new HMac(new KeccakDigest(224)));
        }
    }

    public static class HashMac256 extends BaseMac {
        public HashMac256() {
            super(new HMac(new KeccakDigest(256)));
        }
    }

    public static class HashMac288 extends BaseMac {
        public HashMac288() {
            super(new HMac(new KeccakDigest(288)));
        }
    }

    public static class HashMac384 extends BaseMac {
        public HashMac384() {
            super(new HMac(new KeccakDigest(BluetoothState.REQUEST_CONNECT_DEVICE)));
        }
    }

    public static class HashMac512 extends BaseMac {
        public HashMac512() {
            super(new HMac(new KeccakDigest(512)));
        }
    }

    public static class KeyGenerator224 extends BaseKeyGenerator {
        public KeyGenerator224() {
            super("HMACKECCAK224", 224, new CipherKeyGenerator());
        }
    }

    public static class KeyGenerator256 extends BaseKeyGenerator {
        public KeyGenerator256() {
            super("HMACKECCAK256", 256, new CipherKeyGenerator());
        }
    }

    public static class KeyGenerator288 extends BaseKeyGenerator {
        public KeyGenerator288() {
            super("HMACKECCAK288", 288, new CipherKeyGenerator());
        }
    }

    public static class KeyGenerator384 extends BaseKeyGenerator {
        public KeyGenerator384() {
            super("HMACKECCAK384", BluetoothState.REQUEST_CONNECT_DEVICE, new CipherKeyGenerator());
        }
    }

    public static class KeyGenerator512 extends BaseKeyGenerator {
        public KeyGenerator512() {
            super("HMACKECCAK512", 512, new CipherKeyGenerator());
        }
    }

    public static class Mappings extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f90054a = Keccak.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            String str = f90054a;
            configurableProvider.addAlgorithm("MessageDigest.KECCAK-288", e.d(str, "$Digest224", configurableProvider, "MessageDigest.KECCAK-224", "$Digest288"));
            configurableProvider.addAlgorithm("MessageDigest.KECCAK-384", e.d(str, "$Digest256", configurableProvider, "MessageDigest.KECCAK-256", "$Digest384"));
            addHMACAlgorithm(configurableProvider, "KECCAK224", e.d(str, "$Digest512", configurableProvider, "MessageDigest.KECCAK-512", "$HashMac224"), str.concat("$KeyGenerator224"));
            addHMACAlgorithm(configurableProvider, "KECCAK256", str.concat("$HashMac256"), str.concat("$KeyGenerator256"));
            addHMACAlgorithm(configurableProvider, "KECCAK288", str.concat("$HashMac288"), str.concat("$KeyGenerator288"));
            addHMACAlgorithm(configurableProvider, "KECCAK384", str.concat("$HashMac384"), str.concat("$KeyGenerator384"));
            addHMACAlgorithm(configurableProvider, "KECCAK512", str.concat("$HashMac512"), str.concat("$KeyGenerator512"));
        }
    }
}
