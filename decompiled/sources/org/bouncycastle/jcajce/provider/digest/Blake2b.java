package org.bouncycastle.jcajce.provider.digest;

import androidx.camera.camera2.internal.h0;
import com.vierge.bluetoothlibrary.BluetoothState;
import org.bouncycastle.asn1.misc.MiscObjectIdentifiers;
import org.bouncycastle.crypto.digests.Blake2bDigest;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

/* JADX INFO: loaded from: classes8.dex */
public class Blake2b {

    public static class Blake2b160 extends BCMessageDigest implements Cloneable {
        public Blake2b160() {
            super(new Blake2bDigest(160));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() throws CloneNotSupportedException {
            Blake2b160 blake2b160 = (Blake2b160) super.clone();
            blake2b160.digest = new Blake2bDigest((Blake2bDigest) this.digest);
            return blake2b160;
        }
    }

    public static class Blake2b256 extends BCMessageDigest implements Cloneable {
        public Blake2b256() {
            super(new Blake2bDigest(256));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() throws CloneNotSupportedException {
            Blake2b256 blake2b256 = (Blake2b256) super.clone();
            blake2b256.digest = new Blake2bDigest((Blake2bDigest) this.digest);
            return blake2b256;
        }
    }

    public static class Blake2b384 extends BCMessageDigest implements Cloneable {
        public Blake2b384() {
            super(new Blake2bDigest(BluetoothState.REQUEST_CONNECT_DEVICE));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() throws CloneNotSupportedException {
            Blake2b384 blake2b384 = (Blake2b384) super.clone();
            blake2b384.digest = new Blake2bDigest((Blake2bDigest) this.digest);
            return blake2b384;
        }
    }

    public static class Blake2b512 extends BCMessageDigest implements Cloneable {
        public Blake2b512() {
            super(new Blake2bDigest(512));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() throws CloneNotSupportedException {
            Blake2b512 blake2b512 = (Blake2b512) super.clone();
            blake2b512.digest = new Blake2bDigest((Blake2bDigest) this.digest);
            return blake2b512;
        }
    }

    public static class Mappings extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f90049a = Blake2b.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            String str = f90049a;
            h0.c(androidx.collection.a.d(str, "$Blake2b512", configurableProvider, "MessageDigest.BLAKE2B-512", "Alg.Alias.MessageDigest."), MiscObjectIdentifiers.id_blake2b512, configurableProvider, "BLAKE2B-512");
            h0.c(androidx.collection.a.d(str, "$Blake2b384", configurableProvider, "MessageDigest.BLAKE2B-384", "Alg.Alias.MessageDigest."), MiscObjectIdentifiers.id_blake2b384, configurableProvider, "BLAKE2B-384");
            h0.c(androidx.collection.a.d(str, "$Blake2b256", configurableProvider, "MessageDigest.BLAKE2B-256", "Alg.Alias.MessageDigest."), MiscObjectIdentifiers.id_blake2b256, configurableProvider, "BLAKE2B-256");
            h0.c(androidx.collection.a.d(str, "$Blake2b160", configurableProvider, "MessageDigest.BLAKE2B-160", "Alg.Alias.MessageDigest."), MiscObjectIdentifiers.id_blake2b160, configurableProvider, "BLAKE2B-160");
        }
    }
}
