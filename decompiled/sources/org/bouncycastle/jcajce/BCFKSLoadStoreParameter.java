package org.bouncycastle.jcajce;

import java.io.InputStream;
import java.io.OutputStream;
import java.security.Key;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.cert.X509Certificate;
import org.bouncycastle.crypto.util.PBKDF2Config;
import org.bouncycastle.crypto.util.PBKDFConfig;

/* JADX INFO: loaded from: classes6.dex */
public class BCFKSLoadStoreParameter extends BCLoadStoreParameter {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PBKDFConfig f89656d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final EncryptionAlgorithm f89657e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final MacAlgorithm f89658f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final SignatureAlgorithm f89659g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Key f89660h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final X509Certificate[] f89661i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final CertChainValidator f89662j;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final OutputStream f89663a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final InputStream f89664b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final KeyStore.ProtectionParameter f89665c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Key f89666d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public PBKDFConfig f89667e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public EncryptionAlgorithm f89668f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public MacAlgorithm f89669g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public SignatureAlgorithm f89670h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public X509Certificate[] f89671i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final CertChainValidator f89672j;

        public Builder() {
            this((OutputStream) null, (KeyStore.ProtectionParameter) null);
        }

        public BCFKSLoadStoreParameter build() {
            return new BCFKSLoadStoreParameter(this);
        }

        public Builder withCertificates(X509Certificate[] x509CertificateArr) {
            int length = x509CertificateArr.length;
            X509Certificate[] x509CertificateArr2 = new X509Certificate[length];
            System.arraycopy(x509CertificateArr, 0, x509CertificateArr2, 0, length);
            this.f89671i = x509CertificateArr2;
            return this;
        }

        public Builder withStoreEncryptionAlgorithm(EncryptionAlgorithm encryptionAlgorithm) {
            this.f89668f = encryptionAlgorithm;
            return this;
        }

        public Builder withStoreMacAlgorithm(MacAlgorithm macAlgorithm) {
            this.f89669g = macAlgorithm;
            return this;
        }

        public Builder withStorePBKDFConfig(PBKDFConfig pBKDFConfig) {
            this.f89667e = pBKDFConfig;
            return this;
        }

        public Builder withStoreSignatureAlgorithm(SignatureAlgorithm signatureAlgorithm) {
            this.f89670h = signatureAlgorithm;
            return this;
        }

        public Builder(InputStream inputStream, KeyStore.ProtectionParameter protectionParameter) {
            this.f89667e = new PBKDF2Config.Builder().withIterationCount(16384).withSaltLength(64).withPRF(PBKDF2Config.PRF_SHA512).build();
            this.f89668f = EncryptionAlgorithm.AES256_CCM;
            this.f89669g = MacAlgorithm.HmacSHA512;
            this.f89670h = SignatureAlgorithm.SHA512withECDSA;
            this.f89671i = null;
            this.f89664b = inputStream;
            this.f89663a = null;
            this.f89665c = protectionParameter;
            this.f89666d = null;
        }

        public Builder(InputStream inputStream, PublicKey publicKey) {
            this.f89667e = new PBKDF2Config.Builder().withIterationCount(16384).withSaltLength(64).withPRF(PBKDF2Config.PRF_SHA512).build();
            this.f89668f = EncryptionAlgorithm.AES256_CCM;
            this.f89669g = MacAlgorithm.HmacSHA512;
            this.f89670h = SignatureAlgorithm.SHA512withECDSA;
            this.f89671i = null;
            this.f89664b = inputStream;
            this.f89663a = null;
            this.f89665c = null;
            this.f89666d = publicKey;
        }

        public Builder(InputStream inputStream, CertChainValidator certChainValidator) {
            this.f89667e = new PBKDF2Config.Builder().withIterationCount(16384).withSaltLength(64).withPRF(PBKDF2Config.PRF_SHA512).build();
            this.f89668f = EncryptionAlgorithm.AES256_CCM;
            this.f89669g = MacAlgorithm.HmacSHA512;
            this.f89670h = SignatureAlgorithm.SHA512withECDSA;
            this.f89671i = null;
            this.f89664b = inputStream;
            this.f89663a = null;
            this.f89665c = null;
            this.f89672j = certChainValidator;
            this.f89666d = null;
        }

        public Builder(InputStream inputStream, char[] cArr) {
            this(inputStream, new KeyStore.PasswordProtection(cArr));
        }

        public Builder(OutputStream outputStream, KeyStore.ProtectionParameter protectionParameter) {
            this.f89667e = new PBKDF2Config.Builder().withIterationCount(16384).withSaltLength(64).withPRF(PBKDF2Config.PRF_SHA512).build();
            this.f89668f = EncryptionAlgorithm.AES256_CCM;
            this.f89669g = MacAlgorithm.HmacSHA512;
            this.f89670h = SignatureAlgorithm.SHA512withECDSA;
            this.f89671i = null;
            this.f89664b = null;
            this.f89663a = outputStream;
            this.f89665c = protectionParameter;
            this.f89666d = null;
        }

        public Builder(OutputStream outputStream, PrivateKey privateKey) {
            this.f89667e = new PBKDF2Config.Builder().withIterationCount(16384).withSaltLength(64).withPRF(PBKDF2Config.PRF_SHA512).build();
            this.f89668f = EncryptionAlgorithm.AES256_CCM;
            this.f89669g = MacAlgorithm.HmacSHA512;
            this.f89670h = SignatureAlgorithm.SHA512withECDSA;
            this.f89671i = null;
            this.f89664b = null;
            this.f89663a = outputStream;
            this.f89665c = null;
            this.f89666d = privateKey;
        }

        public Builder(OutputStream outputStream, char[] cArr) {
            this(outputStream, new KeyStore.PasswordProtection(cArr));
        }
    }

    public interface CertChainValidator {
        boolean isValid(X509Certificate[] x509CertificateArr);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class EncryptionAlgorithm {
        private static final /* synthetic */ EncryptionAlgorithm[] $VALUES;
        public static final EncryptionAlgorithm AES256_CCM;
        public static final EncryptionAlgorithm AES256_KWP;

        static {
            EncryptionAlgorithm encryptionAlgorithm = new EncryptionAlgorithm("AES256_CCM", 0);
            AES256_CCM = encryptionAlgorithm;
            EncryptionAlgorithm encryptionAlgorithm2 = new EncryptionAlgorithm("AES256_KWP", 1);
            AES256_KWP = encryptionAlgorithm2;
            $VALUES = new EncryptionAlgorithm[]{encryptionAlgorithm, encryptionAlgorithm2};
        }

        public EncryptionAlgorithm() {
            throw null;
        }

        public static EncryptionAlgorithm valueOf(String str) {
            return (EncryptionAlgorithm) Enum.valueOf(EncryptionAlgorithm.class, str);
        }

        public static EncryptionAlgorithm[] values() {
            return (EncryptionAlgorithm[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class MacAlgorithm {
        private static final /* synthetic */ MacAlgorithm[] $VALUES;
        public static final MacAlgorithm HmacSHA3_512;
        public static final MacAlgorithm HmacSHA512;

        static {
            MacAlgorithm macAlgorithm = new MacAlgorithm("HmacSHA512", 0);
            HmacSHA512 = macAlgorithm;
            MacAlgorithm macAlgorithm2 = new MacAlgorithm("HmacSHA3_512", 1);
            HmacSHA3_512 = macAlgorithm2;
            $VALUES = new MacAlgorithm[]{macAlgorithm, macAlgorithm2};
        }

        public MacAlgorithm() {
            throw null;
        }

        public static MacAlgorithm valueOf(String str) {
            return (MacAlgorithm) Enum.valueOf(MacAlgorithm.class, str);
        }

        public static MacAlgorithm[] values() {
            return (MacAlgorithm[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class SignatureAlgorithm {
        private static final /* synthetic */ SignatureAlgorithm[] $VALUES;
        public static final SignatureAlgorithm SHA3_512withDSA;
        public static final SignatureAlgorithm SHA3_512withECDSA;
        public static final SignatureAlgorithm SHA3_512withRSA;
        public static final SignatureAlgorithm SHA512withDSA;
        public static final SignatureAlgorithm SHA512withECDSA;
        public static final SignatureAlgorithm SHA512withRSA;

        static {
            SignatureAlgorithm signatureAlgorithm = new SignatureAlgorithm("SHA512withDSA", 0);
            SHA512withDSA = signatureAlgorithm;
            SignatureAlgorithm signatureAlgorithm2 = new SignatureAlgorithm("SHA3_512withDSA", 1);
            SHA3_512withDSA = signatureAlgorithm2;
            SignatureAlgorithm signatureAlgorithm3 = new SignatureAlgorithm("SHA512withECDSA", 2);
            SHA512withECDSA = signatureAlgorithm3;
            SignatureAlgorithm signatureAlgorithm4 = new SignatureAlgorithm("SHA3_512withECDSA", 3);
            SHA3_512withECDSA = signatureAlgorithm4;
            SignatureAlgorithm signatureAlgorithm5 = new SignatureAlgorithm("SHA512withRSA", 4);
            SHA512withRSA = signatureAlgorithm5;
            SignatureAlgorithm signatureAlgorithm6 = new SignatureAlgorithm("SHA3_512withRSA", 5);
            SHA3_512withRSA = signatureAlgorithm6;
            $VALUES = new SignatureAlgorithm[]{signatureAlgorithm, signatureAlgorithm2, signatureAlgorithm3, signatureAlgorithm4, signatureAlgorithm5, signatureAlgorithm6};
        }

        public SignatureAlgorithm() {
            throw null;
        }

        public static SignatureAlgorithm valueOf(String str) {
            return (SignatureAlgorithm) Enum.valueOf(SignatureAlgorithm.class, str);
        }

        public static SignatureAlgorithm[] values() {
            return (SignatureAlgorithm[]) $VALUES.clone();
        }
    }

    public BCFKSLoadStoreParameter(Builder builder) {
        super(builder.f89664b, builder.f89663a, builder.f89665c);
        this.f89656d = builder.f89667e;
        this.f89657e = builder.f89668f;
        this.f89658f = builder.f89669g;
        this.f89659g = builder.f89670h;
        this.f89660h = builder.f89666d;
        this.f89661i = builder.f89671i;
        this.f89662j = builder.f89672j;
    }

    public CertChainValidator getCertChainValidator() {
        return this.f89662j;
    }

    public X509Certificate[] getStoreCertificates() {
        return this.f89661i;
    }

    public EncryptionAlgorithm getStoreEncryptionAlgorithm() {
        return this.f89657e;
    }

    public MacAlgorithm getStoreMacAlgorithm() {
        return this.f89658f;
    }

    public PBKDFConfig getStorePBKDFConfig() {
        return this.f89656d;
    }

    public SignatureAlgorithm getStoreSignatureAlgorithm() {
        return this.f89659g;
    }

    public Key getStoreSignatureKey() {
        return this.f89660h;
    }
}
