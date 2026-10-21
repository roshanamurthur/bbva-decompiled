package org.bouncycastle.jcajce.provider.digest;

import androidx.appcompat.widget.g0;
import androidx.databinding.e;
import com.vierge.bluetoothlibrary.BluetoothState;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.Xof;
import org.bouncycastle.crypto.digests.SHA3Digest;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;

/* JADX INFO: loaded from: classes8.dex */
public class SHA3 {

    public static class Digest224 extends DigestSHA3 {
        public Digest224() {
            super(224);
        }
    }

    public static class Digest256 extends DigestSHA3 {
        public Digest256() {
            super(256);
        }
    }

    public static class Digest384 extends DigestSHA3 {
        public Digest384() {
            super(BluetoothState.REQUEST_CONNECT_DEVICE);
        }
    }

    public static class Digest512 extends DigestSHA3 {
        public Digest512() {
            super(512);
        }
    }

    public static class DigestSHA3 extends BCMessageDigest implements Cloneable {
        public DigestSHA3(int i10) {
            super(new SHA3Digest(i10));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() throws CloneNotSupportedException {
            BCMessageDigest bCMessageDigest = (BCMessageDigest) super.clone();
            bCMessageDigest.digest = new SHA3Digest((SHA3Digest) this.digest);
            return bCMessageDigest;
        }
    }

    public static class DigestSHAKE extends BCMessageDigest implements Cloneable {
        public DigestSHAKE(int i10, int i11) {
            super(new SHAKEDigest(i10), i11);
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() throws CloneNotSupportedException {
            BCMessageDigest bCMessageDigest = (BCMessageDigest) super.clone();
            bCMessageDigest.digest = new SHAKEDigest((SHAKEDigest) this.digest);
            return bCMessageDigest;
        }

        @Override // org.bouncycastle.jcajce.provider.digest.BCMessageDigest, java.security.MessageDigestSpi
        public byte[] engineDigest() {
            int i10 = this.digestSize;
            byte[] bArr = new byte[i10];
            ((Xof) this.digest).doFinal(bArr, 0, i10);
            return bArr;
        }
    }

    public static class DigestShake128_256 extends DigestSHAKE {
        public DigestShake128_256() {
            super(128, 256);
        }
    }

    public static class DigestShake256_512 extends DigestSHAKE {
        public DigestShake256_512() {
            super(256, 512);
        }
    }

    public static class HashMac224 extends HashMacSHA3 {
        public HashMac224() {
            super(224);
        }
    }

    public static class HashMac256 extends HashMacSHA3 {
        public HashMac256() {
            super(256);
        }
    }

    public static class HashMac384 extends HashMacSHA3 {
        public HashMac384() {
            super(BluetoothState.REQUEST_CONNECT_DEVICE);
        }
    }

    public static class HashMac512 extends HashMacSHA3 {
        public HashMac512() {
            super(512);
        }
    }

    public static class HashMacSHA3 extends BaseMac {
        public HashMacSHA3(int i10) {
            super(new HMac(new SHA3Digest(i10)));
        }
    }

    public static class KeyGenerator224 extends KeyGeneratorSHA3 {
        public KeyGenerator224() {
            super(224);
        }
    }

    public static class KeyGenerator256 extends KeyGeneratorSHA3 {
        public KeyGenerator256() {
            super(256);
        }
    }

    public static class KeyGenerator384 extends KeyGeneratorSHA3 {
        public KeyGenerator384() {
            super(BluetoothState.REQUEST_CONNECT_DEVICE);
        }
    }

    public static class KeyGenerator512 extends KeyGeneratorSHA3 {
        public KeyGenerator512() {
            super(512);
        }
    }

    public static class KeyGeneratorSHA3 extends BaseKeyGenerator {
        public KeyGeneratorSHA3(int i10) {
            super(g0.c("HMACSHA3-", i10), i10, new CipherKeyGenerator());
        }
    }

    public static class Mappings extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f90065a = SHA3.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            String str = f90065a;
            configurableProvider.addAlgorithm("MessageDigest.SHA3-256", e.d(str, "$Digest224", configurableProvider, "MessageDigest.SHA3-224", "$Digest256"));
            configurableProvider.addAlgorithm("MessageDigest.SHA3-512", e.d(str, "$Digest384", configurableProvider, "MessageDigest.SHA3-384", "$Digest512"));
            configurableProvider.addAlgorithm("MessageDigest", NISTObjectIdentifiers.id_sha3_224, str.concat("$Digest224"));
            configurableProvider.addAlgorithm("MessageDigest", NISTObjectIdentifiers.id_sha3_256, str.concat("$Digest256"));
            configurableProvider.addAlgorithm("MessageDigest", NISTObjectIdentifiers.id_sha3_384, str.concat("$Digest384"));
            configurableProvider.addAlgorithm("MessageDigest", NISTObjectIdentifiers.id_sha3_512, str.concat("$Digest512"));
            configurableProvider.addAlgorithm("MessageDigest.SHAKE128-256", e.d(str, "$DigestShake256_512", configurableProvider, "MessageDigest.SHAKE256-512", "$DigestShake128_256"));
            addHMACAlgorithm(configurableProvider, "SHA3-224", str.concat("$HashMac224"), str.concat("$KeyGenerator224"));
            addHMACAlias(configurableProvider, "SHA3-224", NISTObjectIdentifiers.id_hmacWithSHA3_224);
            addHMACAlgorithm(configurableProvider, "SHA3-256", str.concat("$HashMac256"), str.concat("$KeyGenerator256"));
            addHMACAlias(configurableProvider, "SHA3-256", NISTObjectIdentifiers.id_hmacWithSHA3_256);
            addHMACAlgorithm(configurableProvider, "SHA3-384", str.concat("$HashMac384"), str.concat("$KeyGenerator384"));
            addHMACAlias(configurableProvider, "SHA3-384", NISTObjectIdentifiers.id_hmacWithSHA3_384);
            addHMACAlgorithm(configurableProvider, "SHA3-512", str.concat("$HashMac512"), str.concat("$KeyGenerator512"));
            addHMACAlias(configurableProvider, "SHA3-512", NISTObjectIdentifiers.id_hmacWithSHA3_512);
        }
    }
}
