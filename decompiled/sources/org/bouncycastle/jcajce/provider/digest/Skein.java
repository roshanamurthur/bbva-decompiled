package org.bouncycastle.jcajce.provider.digest;

import androidx.camera.camera2.internal.n1;
import androidx.databinding.e;
import com.bbva.notifications.constants.PushConstants;
import com.vierge.bluetoothlibrary.BluetoothState;
import mx.openpay.library.domain.util.Constant;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.digests.SkeinDigest;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.crypto.macs.SkeinMac;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;

/* JADX INFO: loaded from: classes8.dex */
public class Skein {

    public static class DigestSkein1024 extends BCMessageDigest implements Cloneable {
        public DigestSkein1024(int i10) {
            super(new SkeinDigest(1024, i10));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() throws CloneNotSupportedException {
            BCMessageDigest bCMessageDigest = (BCMessageDigest) super.clone();
            bCMessageDigest.digest = new SkeinDigest((SkeinDigest) this.digest);
            return bCMessageDigest;
        }
    }

    public static class DigestSkein256 extends BCMessageDigest implements Cloneable {
        public DigestSkein256(int i10) {
            super(new SkeinDigest(256, i10));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() throws CloneNotSupportedException {
            BCMessageDigest bCMessageDigest = (BCMessageDigest) super.clone();
            bCMessageDigest.digest = new SkeinDigest((SkeinDigest) this.digest);
            return bCMessageDigest;
        }
    }

    public static class DigestSkein512 extends BCMessageDigest implements Cloneable {
        public DigestSkein512(int i10) {
            super(new SkeinDigest(512, i10));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() throws CloneNotSupportedException {
            BCMessageDigest bCMessageDigest = (BCMessageDigest) super.clone();
            bCMessageDigest.digest = new SkeinDigest((SkeinDigest) this.digest);
            return bCMessageDigest;
        }
    }

    public static class Digest_1024_1024 extends DigestSkein1024 {
        public Digest_1024_1024() {
            super(1024);
        }
    }

    public static class Digest_1024_384 extends DigestSkein1024 {
        public Digest_1024_384() {
            super(BluetoothState.REQUEST_CONNECT_DEVICE);
        }
    }

    public static class Digest_1024_512 extends DigestSkein1024 {
        public Digest_1024_512() {
            super(512);
        }
    }

    public static class Digest_256_128 extends DigestSkein256 {
        public Digest_256_128() {
            super(128);
        }
    }

    public static class Digest_256_160 extends DigestSkein256 {
        public Digest_256_160() {
            super(160);
        }
    }

    public static class Digest_256_224 extends DigestSkein256 {
        public Digest_256_224() {
            super(224);
        }
    }

    public static class Digest_256_256 extends DigestSkein256 {
        public Digest_256_256() {
            super(256);
        }
    }

    public static class Digest_512_128 extends DigestSkein512 {
        public Digest_512_128() {
            super(128);
        }
    }

    public static class Digest_512_160 extends DigestSkein512 {
        public Digest_512_160() {
            super(160);
        }
    }

    public static class Digest_512_224 extends DigestSkein512 {
        public Digest_512_224() {
            super(224);
        }
    }

    public static class Digest_512_256 extends DigestSkein512 {
        public Digest_512_256() {
            super(256);
        }
    }

    public static class Digest_512_384 extends DigestSkein512 {
        public Digest_512_384() {
            super(BluetoothState.REQUEST_CONNECT_DEVICE);
        }
    }

    public static class Digest_512_512 extends DigestSkein512 {
        public Digest_512_512() {
            super(512);
        }
    }

    public static class HMacKeyGenerator_1024_1024 extends BaseKeyGenerator {
        public HMacKeyGenerator_1024_1024() {
            super("HMACSkein-1024-1024", 1024, new CipherKeyGenerator());
        }
    }

    public static class HMacKeyGenerator_1024_384 extends BaseKeyGenerator {
        public HMacKeyGenerator_1024_384() {
            super("HMACSkein-1024-384", BluetoothState.REQUEST_CONNECT_DEVICE, new CipherKeyGenerator());
        }
    }

    public static class HMacKeyGenerator_1024_512 extends BaseKeyGenerator {
        public HMacKeyGenerator_1024_512() {
            super("HMACSkein-1024-512", 512, new CipherKeyGenerator());
        }
    }

    public static class HMacKeyGenerator_256_128 extends BaseKeyGenerator {
        public HMacKeyGenerator_256_128() {
            super("HMACSkein-256-128", 128, new CipherKeyGenerator());
        }
    }

    public static class HMacKeyGenerator_256_160 extends BaseKeyGenerator {
        public HMacKeyGenerator_256_160() {
            super("HMACSkein-256-160", 160, new CipherKeyGenerator());
        }
    }

    public static class HMacKeyGenerator_256_224 extends BaseKeyGenerator {
        public HMacKeyGenerator_256_224() {
            super("HMACSkein-256-224", 224, new CipherKeyGenerator());
        }
    }

    public static class HMacKeyGenerator_256_256 extends BaseKeyGenerator {
        public HMacKeyGenerator_256_256() {
            super("HMACSkein-256-256", 256, new CipherKeyGenerator());
        }
    }

    public static class HMacKeyGenerator_512_128 extends BaseKeyGenerator {
        public HMacKeyGenerator_512_128() {
            super("HMACSkein-512-128", 128, new CipherKeyGenerator());
        }
    }

    public static class HMacKeyGenerator_512_160 extends BaseKeyGenerator {
        public HMacKeyGenerator_512_160() {
            super("HMACSkein-512-160", 160, new CipherKeyGenerator());
        }
    }

    public static class HMacKeyGenerator_512_224 extends BaseKeyGenerator {
        public HMacKeyGenerator_512_224() {
            super("HMACSkein-512-224", 224, new CipherKeyGenerator());
        }
    }

    public static class HMacKeyGenerator_512_256 extends BaseKeyGenerator {
        public HMacKeyGenerator_512_256() {
            super("HMACSkein-512-256", 256, new CipherKeyGenerator());
        }
    }

    public static class HMacKeyGenerator_512_384 extends BaseKeyGenerator {
        public HMacKeyGenerator_512_384() {
            super("HMACSkein-512-384", BluetoothState.REQUEST_CONNECT_DEVICE, new CipherKeyGenerator());
        }
    }

    public static class HMacKeyGenerator_512_512 extends BaseKeyGenerator {
        public HMacKeyGenerator_512_512() {
            super("HMACSkein-512-512", 512, new CipherKeyGenerator());
        }
    }

    public static class HashMac_1024_1024 extends BaseMac {
        public HashMac_1024_1024() {
            super(new HMac(new SkeinDigest(1024, 1024)));
        }
    }

    public static class HashMac_1024_384 extends BaseMac {
        public HashMac_1024_384() {
            super(new HMac(new SkeinDigest(1024, BluetoothState.REQUEST_CONNECT_DEVICE)));
        }
    }

    public static class HashMac_1024_512 extends BaseMac {
        public HashMac_1024_512() {
            super(new HMac(new SkeinDigest(1024, 512)));
        }
    }

    public static class HashMac_256_128 extends BaseMac {
        public HashMac_256_128() {
            super(new HMac(new SkeinDigest(256, 128)));
        }
    }

    public static class HashMac_256_160 extends BaseMac {
        public HashMac_256_160() {
            super(new HMac(new SkeinDigest(256, 160)));
        }
    }

    public static class HashMac_256_224 extends BaseMac {
        public HashMac_256_224() {
            super(new HMac(new SkeinDigest(256, 224)));
        }
    }

    public static class HashMac_256_256 extends BaseMac {
        public HashMac_256_256() {
            super(new HMac(new SkeinDigest(256, 256)));
        }
    }

    public static class HashMac_512_128 extends BaseMac {
        public HashMac_512_128() {
            super(new HMac(new SkeinDigest(512, 128)));
        }
    }

    public static class HashMac_512_160 extends BaseMac {
        public HashMac_512_160() {
            super(new HMac(new SkeinDigest(512, 160)));
        }
    }

    public static class HashMac_512_224 extends BaseMac {
        public HashMac_512_224() {
            super(new HMac(new SkeinDigest(512, 224)));
        }
    }

    public static class HashMac_512_256 extends BaseMac {
        public HashMac_512_256() {
            super(new HMac(new SkeinDigest(512, 256)));
        }
    }

    public static class HashMac_512_384 extends BaseMac {
        public HashMac_512_384() {
            super(new HMac(new SkeinDigest(512, BluetoothState.REQUEST_CONNECT_DEVICE)));
        }
    }

    public static class HashMac_512_512 extends BaseMac {
        public HashMac_512_512() {
            super(new HMac(new SkeinDigest(512, 512)));
        }
    }

    public static class Mappings extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f90069a = Skein.class.getName();

        public static void a(ConfigurableProvider configurableProvider, int i10, int i11) {
            String strE = n1.e("Skein-MAC-", i10, Constant.DASH_STRING, i11);
            StringBuilder sb2 = new StringBuilder();
            String str = f90069a;
            sb2.append(str);
            sb2.append("$SkeinMac_");
            sb2.append(i10);
            sb2.append(PushConstants.GE_PARAMS_SEPARATOR);
            sb2.append(i11);
            String string = sb2.toString();
            String str2 = str + "$SkeinMacKeyGenerator_" + i10 + PushConstants.GE_PARAMS_SEPARATOR + i11;
            configurableProvider.addAlgorithm("Mac." + strE, string);
            configurableProvider.addAlgorithm("Alg.Alias.Mac.Skein-MAC" + i10 + "/" + i11, strE);
            StringBuilder sb3 = new StringBuilder("KeyGenerator.");
            sb3.append(strE);
            configurableProvider.addAlgorithm(sb3.toString(), str2);
            configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator.Skein-MAC" + i10 + "/" + i11, strE);
        }

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            String str = f90069a;
            configurableProvider.addAlgorithm("MessageDigest.Skein-256-160", e.d(str, "$Digest_256_128", configurableProvider, "MessageDigest.Skein-256-128", "$Digest_256_160"));
            configurableProvider.addAlgorithm("MessageDigest.Skein-256-256", e.d(str, "$Digest_256_224", configurableProvider, "MessageDigest.Skein-256-224", "$Digest_256_256"));
            configurableProvider.addAlgorithm("MessageDigest.Skein-512-160", e.d(str, "$Digest_512_128", configurableProvider, "MessageDigest.Skein-512-128", "$Digest_512_160"));
            configurableProvider.addAlgorithm("MessageDigest.Skein-512-256", e.d(str, "$Digest_512_224", configurableProvider, "MessageDigest.Skein-512-224", "$Digest_512_256"));
            configurableProvider.addAlgorithm("MessageDigest.Skein-512-512", e.d(str, "$Digest_512_384", configurableProvider, "MessageDigest.Skein-512-384", "$Digest_512_512"));
            configurableProvider.addAlgorithm("MessageDigest.Skein-1024-512", e.d(str, "$Digest_1024_384", configurableProvider, "MessageDigest.Skein-1024-384", "$Digest_1024_512"));
            addHMACAlgorithm(configurableProvider, "Skein-256-128", e.d(str, "$Digest_1024_1024", configurableProvider, "MessageDigest.Skein-1024-1024", "$HashMac_256_128"), str.concat("$HMacKeyGenerator_256_128"));
            addHMACAlgorithm(configurableProvider, "Skein-256-160", str.concat("$HashMac_256_160"), str.concat("$HMacKeyGenerator_256_160"));
            addHMACAlgorithm(configurableProvider, "Skein-256-224", str.concat("$HashMac_256_224"), str.concat("$HMacKeyGenerator_256_224"));
            addHMACAlgorithm(configurableProvider, "Skein-256-256", str.concat("$HashMac_256_256"), str.concat("$HMacKeyGenerator_256_256"));
            addHMACAlgorithm(configurableProvider, "Skein-512-128", str.concat("$HashMac_512_128"), str.concat("$HMacKeyGenerator_512_128"));
            addHMACAlgorithm(configurableProvider, "Skein-512-160", str.concat("$HashMac_512_160"), str.concat("$HMacKeyGenerator_512_160"));
            addHMACAlgorithm(configurableProvider, "Skein-512-224", str.concat("$HashMac_512_224"), str.concat("$HMacKeyGenerator_512_224"));
            addHMACAlgorithm(configurableProvider, "Skein-512-256", str.concat("$HashMac_512_256"), str.concat("$HMacKeyGenerator_512_256"));
            addHMACAlgorithm(configurableProvider, "Skein-512-384", str.concat("$HashMac_512_384"), str.concat("$HMacKeyGenerator_512_384"));
            addHMACAlgorithm(configurableProvider, "Skein-512-512", str.concat("$HashMac_512_512"), str.concat("$HMacKeyGenerator_512_512"));
            addHMACAlgorithm(configurableProvider, "Skein-1024-384", str.concat("$HashMac_1024_384"), str.concat("$HMacKeyGenerator_1024_384"));
            addHMACAlgorithm(configurableProvider, "Skein-1024-512", str.concat("$HashMac_1024_512"), str.concat("$HMacKeyGenerator_1024_512"));
            addHMACAlgorithm(configurableProvider, "Skein-1024-1024", str.concat("$HashMac_1024_1024"), str.concat("$HMacKeyGenerator_1024_1024"));
            a(configurableProvider, 256, 128);
            a(configurableProvider, 256, 160);
            a(configurableProvider, 256, 224);
            a(configurableProvider, 256, 256);
            a(configurableProvider, 512, 128);
            a(configurableProvider, 512, 160);
            a(configurableProvider, 512, 224);
            a(configurableProvider, 512, 256);
            a(configurableProvider, 512, BluetoothState.REQUEST_CONNECT_DEVICE);
            a(configurableProvider, 512, 512);
            a(configurableProvider, 1024, BluetoothState.REQUEST_CONNECT_DEVICE);
            a(configurableProvider, 1024, 512);
            a(configurableProvider, 1024, 1024);
        }
    }

    public static class SkeinMacKeyGenerator_1024_1024 extends BaseKeyGenerator {
        public SkeinMacKeyGenerator_1024_1024() {
            super("Skein-MAC-1024-1024", 1024, new CipherKeyGenerator());
        }
    }

    public static class SkeinMacKeyGenerator_1024_384 extends BaseKeyGenerator {
        public SkeinMacKeyGenerator_1024_384() {
            super("Skein-MAC-1024-384", BluetoothState.REQUEST_CONNECT_DEVICE, new CipherKeyGenerator());
        }
    }

    public static class SkeinMacKeyGenerator_1024_512 extends BaseKeyGenerator {
        public SkeinMacKeyGenerator_1024_512() {
            super("Skein-MAC-1024-512", 512, new CipherKeyGenerator());
        }
    }

    public static class SkeinMacKeyGenerator_256_128 extends BaseKeyGenerator {
        public SkeinMacKeyGenerator_256_128() {
            super("Skein-MAC-256-128", 128, new CipherKeyGenerator());
        }
    }

    public static class SkeinMacKeyGenerator_256_160 extends BaseKeyGenerator {
        public SkeinMacKeyGenerator_256_160() {
            super("Skein-MAC-256-160", 160, new CipherKeyGenerator());
        }
    }

    public static class SkeinMacKeyGenerator_256_224 extends BaseKeyGenerator {
        public SkeinMacKeyGenerator_256_224() {
            super("Skein-MAC-256-224", 224, new CipherKeyGenerator());
        }
    }

    public static class SkeinMacKeyGenerator_256_256 extends BaseKeyGenerator {
        public SkeinMacKeyGenerator_256_256() {
            super("Skein-MAC-256-256", 256, new CipherKeyGenerator());
        }
    }

    public static class SkeinMacKeyGenerator_512_128 extends BaseKeyGenerator {
        public SkeinMacKeyGenerator_512_128() {
            super("Skein-MAC-512-128", 128, new CipherKeyGenerator());
        }
    }

    public static class SkeinMacKeyGenerator_512_160 extends BaseKeyGenerator {
        public SkeinMacKeyGenerator_512_160() {
            super("Skein-MAC-512-160", 160, new CipherKeyGenerator());
        }
    }

    public static class SkeinMacKeyGenerator_512_224 extends BaseKeyGenerator {
        public SkeinMacKeyGenerator_512_224() {
            super("Skein-MAC-512-224", 224, new CipherKeyGenerator());
        }
    }

    public static class SkeinMacKeyGenerator_512_256 extends BaseKeyGenerator {
        public SkeinMacKeyGenerator_512_256() {
            super("Skein-MAC-512-256", 256, new CipherKeyGenerator());
        }
    }

    public static class SkeinMacKeyGenerator_512_384 extends BaseKeyGenerator {
        public SkeinMacKeyGenerator_512_384() {
            super("Skein-MAC-512-384", BluetoothState.REQUEST_CONNECT_DEVICE, new CipherKeyGenerator());
        }
    }

    public static class SkeinMacKeyGenerator_512_512 extends BaseKeyGenerator {
        public SkeinMacKeyGenerator_512_512() {
            super("Skein-MAC-512-512", 512, new CipherKeyGenerator());
        }
    }

    public static class SkeinMac_1024_1024 extends BaseMac {
        public SkeinMac_1024_1024() {
            super(new SkeinMac(1024, 1024));
        }
    }

    public static class SkeinMac_1024_384 extends BaseMac {
        public SkeinMac_1024_384() {
            super(new SkeinMac(1024, BluetoothState.REQUEST_CONNECT_DEVICE));
        }
    }

    public static class SkeinMac_1024_512 extends BaseMac {
        public SkeinMac_1024_512() {
            super(new SkeinMac(1024, 512));
        }
    }

    public static class SkeinMac_256_128 extends BaseMac {
        public SkeinMac_256_128() {
            super(new SkeinMac(256, 128));
        }
    }

    public static class SkeinMac_256_160 extends BaseMac {
        public SkeinMac_256_160() {
            super(new SkeinMac(256, 160));
        }
    }

    public static class SkeinMac_256_224 extends BaseMac {
        public SkeinMac_256_224() {
            super(new SkeinMac(256, 224));
        }
    }

    public static class SkeinMac_256_256 extends BaseMac {
        public SkeinMac_256_256() {
            super(new SkeinMac(256, 256));
        }
    }

    public static class SkeinMac_512_128 extends BaseMac {
        public SkeinMac_512_128() {
            super(new SkeinMac(512, 128));
        }
    }

    public static class SkeinMac_512_160 extends BaseMac {
        public SkeinMac_512_160() {
            super(new SkeinMac(512, 160));
        }
    }

    public static class SkeinMac_512_224 extends BaseMac {
        public SkeinMac_512_224() {
            super(new SkeinMac(512, 224));
        }
    }

    public static class SkeinMac_512_256 extends BaseMac {
        public SkeinMac_512_256() {
            super(new SkeinMac(512, 256));
        }
    }

    public static class SkeinMac_512_384 extends BaseMac {
        public SkeinMac_512_384() {
            super(new SkeinMac(512, BluetoothState.REQUEST_CONNECT_DEVICE));
        }
    }

    public static class SkeinMac_512_512 extends BaseMac {
        public SkeinMac_512_512() {
            super(new SkeinMac(512, 512));
        }
    }
}
