package org.bouncycastle.jcajce.provider.symmetric;

import androidx.databinding.e;
import c2.b;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.digests.SHA384Digest;
import org.bouncycastle.crypto.digests.SHA512Digest;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.util.DigestFactory;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import org.bouncycastle.jcajce.spec.TLSKeyMaterialSpec;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;

/* JADX INFO: loaded from: classes8.dex */
public class TLSKDF {

    public static class Mappings extends AlgorithmProvider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f90196a = TLSKDF.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            String str = f90196a;
            configurableProvider.addAlgorithm("SecretKeyFactory.TLS11KDF", e.d(str, "$TLS10", configurableProvider, "SecretKeyFactory.TLS10KDF", "$TLS11"));
            configurableProvider.addAlgorithm("SecretKeyFactory.TLS12WITHSHA384KDF", e.d(str, "$TLS12withSHA256", configurableProvider, "SecretKeyFactory.TLS12WITHSHA256KDF", "$TLS12withSHA384"));
            configurableProvider.addAlgorithm("SecretKeyFactory.TLS12WITHSHA512KDF", str.concat("$TLS12withSHA512"));
        }
    }

    public static final class TLS10 extends TLSKeyMaterialFactory {
        public TLS10() {
            super("TLS10KDF");
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory, javax.crypto.SecretKeyFactorySpi
        public SecretKey engineGenerateSecret(KeySpec keySpec) throws InvalidKeySpecException {
            if (keySpec instanceof TLSKeyMaterialSpec) {
                return new SecretKeySpec(TLSKDF.a((TLSKeyMaterialSpec) keySpec), this.algName);
            }
            throw new InvalidKeySpecException("Invalid KeySpec");
        }
    }

    public static final class TLS11 extends TLSKeyMaterialFactory {
        public TLS11() {
            super("TLS11KDF");
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory, javax.crypto.SecretKeyFactorySpi
        public SecretKey engineGenerateSecret(KeySpec keySpec) throws InvalidKeySpecException {
            if (keySpec instanceof TLSKeyMaterialSpec) {
                return new SecretKeySpec(TLSKDF.a((TLSKeyMaterialSpec) keySpec), this.algName);
            }
            throw new InvalidKeySpecException("Invalid KeySpec");
        }
    }

    public static class TLS12 extends TLSKeyMaterialFactory {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Mac f90197p0;

        public TLS12(String str, Mac mac) {
            super(str);
            this.f90197p0 = mac;
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory, javax.crypto.SecretKeyFactorySpi
        public SecretKey engineGenerateSecret(KeySpec keySpec) throws InvalidKeySpecException, CloneNotSupportedException {
            if (!(keySpec instanceof TLSKeyMaterialSpec)) {
                throw new InvalidKeySpecException("Invalid KeySpec");
            }
            TLSKeyMaterialSpec tLSKeyMaterialSpec = (TLSKeyMaterialSpec) keySpec;
            byte[] bArrConcatenate = Arrays.concatenate(Strings.toByteArray(tLSKeyMaterialSpec.getLabel()), tLSKeyMaterialSpec.getSeed());
            byte[] secret = tLSKeyMaterialSpec.getSecret();
            byte[] bArr = new byte[tLSKeyMaterialSpec.getLength()];
            TLSKDF.b(this.f90197p0, secret, bArrConcatenate, bArr);
            return new SecretKeySpec(bArr, this.algName);
        }
    }

    public static final class TLS12withSHA256 extends TLS12 {
        public TLS12withSHA256() {
            super("TLS12withSHA256KDF", new HMac(new SHA256Digest()));
        }
    }

    public static final class TLS12withSHA384 extends TLS12 {
        public TLS12withSHA384() {
            super("TLS12withSHA384KDF", new HMac(new SHA384Digest()));
        }
    }

    public static final class TLS12withSHA512 extends TLS12 {
        public TLS12withSHA512() {
            super("TLS12withSHA512KDF", new HMac(new SHA512Digest()));
        }
    }

    public static class TLSKeyMaterialFactory extends BaseSecretKeyFactory {
        public TLSKeyMaterialFactory(String str) {
            super(str, null);
        }
    }

    public static byte[] a(TLSKeyMaterialSpec tLSKeyMaterialSpec) throws CloneNotSupportedException {
        HMac hMac = new HMac(DigestFactory.createMD5());
        HMac hMac2 = new HMac(DigestFactory.createSHA1());
        byte[] bArrConcatenate = Arrays.concatenate(Strings.toByteArray(tLSKeyMaterialSpec.getLabel()), tLSKeyMaterialSpec.getSeed());
        byte[] secret = tLSKeyMaterialSpec.getSecret();
        int length = (secret.length + 1) / 2;
        byte[] bArr = new byte[length];
        byte[] bArr2 = new byte[length];
        System.arraycopy(secret, 0, bArr, 0, length);
        System.arraycopy(secret, secret.length - length, bArr2, 0, length);
        int length2 = tLSKeyMaterialSpec.getLength();
        byte[] bArr3 = new byte[length2];
        byte[] bArr4 = new byte[length2];
        b(hMac, bArr, bArrConcatenate, bArr3);
        b(hMac2, bArr2, bArrConcatenate, bArr4);
        for (int i10 = 0; i10 < length2; i10++) {
            bArr3[i10] = (byte) (bArr3[i10] ^ bArr4[i10]);
        }
        return bArr3;
    }

    public static void b(Mac mac, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        mac.init(new KeyParameter(bArr));
        int macSize = mac.getMacSize();
        int iA = b.a(bArr3.length, macSize, 1, macSize);
        int macSize2 = mac.getMacSize();
        byte[] bArr4 = new byte[macSize2];
        byte[] bArr5 = new byte[mac.getMacSize()];
        byte[] bArr6 = bArr2;
        int i10 = 0;
        while (i10 < iA) {
            mac.update(bArr6, 0, bArr6.length);
            mac.doFinal(bArr4, 0);
            mac.update(bArr4, 0, macSize2);
            mac.update(bArr2, 0, bArr2.length);
            mac.doFinal(bArr5, 0);
            int i11 = macSize * i10;
            System.arraycopy(bArr5, 0, bArr3, i11, Math.min(macSize, bArr3.length - i11));
            i10++;
            bArr6 = bArr4;
        }
    }
}
