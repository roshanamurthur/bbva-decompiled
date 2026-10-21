package com.noknok.android.client.asm.authenticator;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.security.keystore.KeyGenParameterSpec;
import android.security.keystore.KeyPermanentlyInvalidatedException;
import android.util.Base64;
import com.bbva.ethermobilesdk.pinning.constant.ConstantKt;
import com.bbva.glomohybrid.login.domain.constants.LoginHelperConstants;
import com.google.android.gms.stats.CodePackage;
import com.noknok.android.client.asm.api.AsmException;
import com.noknok.android.client.metrics.Tabulator;
import com.noknok.android.client.utils.AppSDKConfig;
import com.noknok.android.client.utils.Charsets;
import com.noknok.android.client.utils.CryptoProviderHelper;
import com.noknok.android.client.utils.Logger;
import com.noknok.android.client.utils.Outcome;
import com.noknok.android.client.utils.TypeConverter;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.UnrecoverableEntryException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.interfaces.ECPublicKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.RSAKeyGenParameterSpec;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.security.auth.x500.X500Principal;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes11.dex */
public class KSUtils {
    public static final int GCM_NONCE_LENGTH = 12;
    public static final int GCM_TAG_LENGTH = 16;
    public static final byte PLAIN_BUFFER = -127;
    public static final byte WRAPPED_BUFFER = -128;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Tabulator f63123a = Tabulator.getInstance();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static SecretKey f63124b = null;

    /* JADX INFO: renamed from: com.noknok.android.client.asm.authenticator.KSUtils$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f63125a;

        static {
            int[] iArr = new int[Alg.values().length];
            f63125a = iArr;
            try {
                iArr[Alg.EC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f63125a[Alg.RSA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum AkMode {
        KS,
        FP,
        KG
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EC' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class Alg {
        public static final Alg EC;
        public static final Alg RSA;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ Alg[] f63127b;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Descriptor f63128a;

        public static class Descriptor {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            String f63129a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            String f63130b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            short f63131c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            short f63132d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            byte f63133e;

            private Descriptor() {
            }

            public /* synthetic */ Descriptor(int i10) {
                this();
            }
        }

        static {
            int i10 = 0;
            Descriptor descriptor = new Descriptor(i10);
            descriptor.f63129a = LoginHelperConstants.CLIENT_STATUS_PENDING_TO_ACTIVATE_EC;
            descriptor.f63130b = "SHA256withECDSA";
            descriptor.f63131c = (short) 32;
            descriptor.f63132d = (short) 64;
            descriptor.f63133e = (byte) 1;
            Alg alg = new Alg(LoginHelperConstants.CLIENT_STATUS_PENDING_TO_ACTIVATE_EC, 0, descriptor);
            EC = alg;
            Descriptor descriptor2 = new Descriptor(i10);
            descriptor2.f63129a = "RSA";
            descriptor2.f63130b = ConstantKt.ALGORITHM_VERIFY_SIGNATURE;
            descriptor2.f63131c = (short) 256;
            descriptor2.f63132d = (short) 256;
            descriptor2.f63133e = (byte) 2;
            Alg alg2 = new Alg("RSA", 1, descriptor2);
            RSA = alg2;
            f63127b = new Alg[]{alg, alg2};
        }

        private Alg(String str, int i10, Descriptor descriptor) {
            super(str, i10);
            this.f63128a = descriptor;
        }

        public static Alg valueOf(String str) {
            return (Alg) Enum.valueOf(Alg.class, str);
        }

        public static Alg[] values() {
            return (Alg[]) f63127b.clone();
        }

        public byte getCalId() {
            return this.f63128a.f63133e;
        }

        public String getKeyAlg() {
            return this.f63128a.f63129a;
        }

        public short getSignatureSize() {
            return this.f63128a.f63132d;
        }
    }

    public enum Storage {
        Software,
        Hardware,
        SecureElement
    }

    private static byte[] a(byte[] bArr) {
        Alg alg = Alg.EC;
        int i10 = alg.f63128a.f63131c;
        byte[] bArr2 = new byte[i10];
        Arrays.fill(bArr2, (byte) 0);
        if (bArr.length > alg.f63128a.f63131c) {
            System.arraycopy(bArr, 1, bArr2, 0, i10);
        } else {
            System.arraycopy(bArr, 0, bArr2, i10 - bArr.length, bArr.length);
        }
        return bArr2;
    }

    public static byte[] exportPublicKey(byte[] bArr) {
        if (bArr == null) {
            Logger.e("KSUtils", "KSCallback: Invalid parameters, keyHandle is null");
            return null;
        }
        try {
            KeyStore keyStoreInstance = CryptoProviderHelper.getKeyStoreInstance();
            keyStoreInstance.load(null);
            PublicKey publicKey = keyStoreInstance.getCertificate(new String(bArr, Charsets.utf8Charset)).getPublicKey();
            String algorithm = publicKey.getAlgorithm();
            Logger.i("KSUtils", "Exporting public key for " + algorithm);
            algorithm.getClass();
            if (!algorithm.equals(LoginHelperConstants.CLIENT_STATUS_PENDING_TO_ACTIVATE_EC)) {
                if (!algorithm.equals("RSA")) {
                    Logger.e("KSUtils", "Unsupported key algorithm: ".concat(algorithm));
                    return null;
                }
                RSAPublicKey rSAPublicKey = (RSAPublicKey) publicKey;
                byte[] byteArray = rSAPublicKey.getModulus().toByteArray();
                byte[] byteArray2 = rSAPublicKey.getPublicExponent().toByteArray();
                short s4 = Alg.RSA.f63128a.f63131c;
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteArray2.length + s4);
                byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
                byteBufferAllocate.put(byteArray, byteArray.length - s4, s4);
                byteBufferAllocate.put(byteArray2);
                return byteBufferAllocate.array();
            }
            ECPublicKey eCPublicKey = (ECPublicKey) publicKey;
            byte[] byteArray3 = eCPublicKey.getW().getAffineX().toByteArray();
            byte[] byteArray4 = eCPublicKey.getW().getAffineY().toByteArray();
            Alg alg = Alg.EC;
            ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate((alg.f63128a.f63131c * 2) + 1);
            byteBufferAllocate2.order(ByteOrder.LITTLE_ENDIAN);
            byteBufferAllocate2.put((byte) 4);
            if (byteArray3.length > alg.f63128a.f63131c + 1) {
                Logger.e("KSUtils", "Export EC public key failed: Incorrect length of x");
                return null;
            }
            byteBufferAllocate2.put(a(byteArray3));
            if (byteArray4.length > alg.f63128a.f63131c + 1) {
                Logger.e("KSUtils", "Export EC public key failed: Incorrect length of y");
                return null;
            }
            byteBufferAllocate2.put(a(byteArray4));
            return byteBufferAllocate2.array();
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException e5) {
            Logger.e("KSUtils", "Exporting the public key failed", e5);
            return null;
        }
    }

    @TargetApi(28)
    public static String generateKeyStoreKeyPair(Context context, KsLabel ksLabel, AkMode akMode, byte[] bArr) {
        return generateKeyStoreKeyPair(context, ksLabel, akMode, bArr, 0);
    }

    public static String getAttestationChain(String str) {
        if (Build.VERSION.SDK_INT < 24 && !"N".equals(Build.VERSION.CODENAME)) {
            return "p";
        }
        try {
            KeyStore keyStoreInstance = CryptoProviderHelper.getKeyStoreInstance();
            keyStoreInstance.load(null);
            Certificate[] certificateChain = keyStoreInstance.getCertificateChain(str);
            String[] strArr = new String[certificateChain.length];
            int i10 = 0;
            for (Certificate certificate : certificateChain) {
                strArr[i10] = new String(Base64.encode(certificate.getEncoded(), 2));
                i10++;
            }
            return new JSONArray(strArr).toString();
        } catch (IOException e5) {
            e = e5;
            Logger.e("KSUtils", "Could not export X509 certificate chain for attestation", e);
            return "a";
        } catch (KeyStoreException e7) {
            e = e7;
            Logger.e("KSUtils", "Could not export X509 certificate chain for attestation", e);
            return "a";
        } catch (NoSuchAlgorithmException e10) {
            e = e10;
            Logger.e("KSUtils", "Could not export X509 certificate chain for attestation", e);
            return "a";
        } catch (CertificateException e11) {
            e = e11;
            Logger.e("KSUtils", "Could not export X509 certificate chain for attestation", e);
            return "a";
        } catch (JSONException e12) {
            e = e12;
            Logger.e("KSUtils", "Could not export X509 certificate chain for attestation", e);
            return "a";
        }
    }

    public static Signature initSignature(KsLabel ksLabel, String str) throws InvalidKeyException, UnrecoverableEntryException {
        try {
            KeyStore keyStoreInstance = CryptoProviderHelper.getKeyStoreInstance();
            keyStoreInstance.load(null);
            Signature signatureInstance = CryptoProviderHelper.getSignatureInstance(ksLabel.getAlg().f63128a.f63130b);
            PrivateKey privateKey = (PrivateKey) keyStoreInstance.getKey(str, null);
            if (privateKey == null) {
                throw new UnrecoverableEntryException();
            }
            signatureInstance.initSign(privateKey);
            return signatureInstance;
        } catch (IOException e5) {
            e = e5;
            Logger.e("KSUtils", "Init Signature failed", e);
            throw new IllegalArgumentException(e);
        } catch (KeyStoreException e7) {
            e = e7;
            Logger.e("KSUtils", "Init Signature failed", e);
            throw new IllegalArgumentException(e);
        } catch (NoSuchAlgorithmException e10) {
            e = e10;
            Logger.e("KSUtils", "Init Signature failed", e);
            throw new IllegalArgumentException(e);
        } catch (NoSuchProviderException e11) {
            e = e11;
            Logger.e("KSUtils", "Init Signature failed", e);
            throw new IllegalArgumentException(e);
        } catch (CertificateException e12) {
            e = e12;
            Logger.e("KSUtils", "Init Signature failed", e);
            throw new IllegalArgumentException(e);
        }
    }

    public static void removeKey(String str) {
        Logger.i("KSUtils", "removeKey");
        try {
            KeyStore keyStoreInstance = CryptoProviderHelper.getKeyStoreInstance();
            keyStoreInstance.load(null);
            keyStoreInstance.deleteEntry(str);
            Logger.i("KSUtils", "Key successfully removed from the KeyStore");
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException e5) {
            Logger.e("KSUtils", "Failed to remove the key from the KeyStore", e5);
        }
    }

    public static byte[] signData(Signature signature, KsLabel ksLabel, byte[] bArr) throws InvalidKeyException {
        Logger.i("KSUtils", "signData with " + ksLabel.getAlg().f63128a.f63130b);
        if (signature == null) {
            Logger.e("KSUtils", "Signature object is missing");
            return null;
        }
        try {
            signature.update(bArr);
            byte[] bArrSign = signature.sign();
            Alg alg = ksLabel.getAlg();
            Alg alg2 = Alg.EC;
            if (alg == alg2 && !ksLabel.equals(KsLabel.NNL_KS_FIDO2)) {
                byte b10 = bArrSign[3];
                if (b10 > alg2.f63128a.f63131c + 1) {
                    Logger.e("KSUtils", "Invalid ECDSA signature: incorrect length of r");
                } else {
                    byte[] bArrA = a(Arrays.copyOfRange(bArrSign, 4, b10 + 4));
                    byte b11 = bArrSign[b10 + 5];
                    if (b10 > alg2.f63128a.f63131c + 1) {
                        Logger.e("KSUtils", "Invalid ECDSA signature: incorrect length of s");
                    } else {
                        int i10 = b10 + 6;
                        byte[] bArrA2 = a(Arrays.copyOfRange(bArrSign, i10, b11 + i10));
                        byte[] bArr2 = new byte[bArrA.length + bArrA2.length];
                        System.arraycopy(bArrA, 0, bArr2, 0, bArrA.length);
                        System.arraycopy(bArrA2, 0, bArr2, bArrA.length, bArrA2.length);
                        bArrSign = bArr2;
                    }
                }
                bArrSign = null;
            }
            StringBuilder sb2 = new StringBuilder("Data Signing completed: ");
            sb2.append(bArrSign != null ? TypeConverter.byteArrayToHexString(bArrSign) : null);
            Logger.i("KSUtils", sb2.toString());
            return bArrSign;
        } catch (SignatureException e5) {
            if (e5.getMessage().startsWith("android.security.KeyStoreException: Key user not authenticated")) {
                throw new KeyPermanentlyInvalidatedException(e5.getMessage());
            }
            Logger.e("KSUtils", "Problem during signing", e5);
            return null;
        }
    }

    @TargetApi(23)
    public static byte[] unwrapObject(byte[] bArr) {
        f63123a.startTimer("KSUtils:unwrapObject");
        try {
            try {
                Cipher cipherInstance = CryptoProviderHelper.getCipherInstance("AES/GCM/NoPadding");
                SecretKey secretKeyA = a();
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 1, 13);
                byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, 13, bArr.length);
                cipherInstance.init(2, secretKeyA, new GCMParameterSpec(128, bArrCopyOfRange));
                return cipherInstance.doFinal(bArrCopyOfRange2);
            } finally {
                f63123a.endTimer("KSUtils:unwrapObject");
            }
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchProviderException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e5) {
            Logger.e("KSUtils", "unwrapObject failed", e5);
            f63123a.endTimer("KSUtils:unwrapObject");
            return null;
        }
    }

    @TargetApi(23)
    public static byte[] wrapObject(byte[] bArr) {
        Tabulator tabulator = f63123a;
        tabulator.startTimer("KSUtils:wrapObject");
        try {
            try {
                Cipher cipherInstance = CryptoProviderHelper.getCipherInstance("AES/GCM/NoPadding");
                cipherInstance.init(1, a());
                byte[] iv = cipherInstance.getIV();
                if (iv == null) {
                    Logger.e("KSUtils", "Failed to get IV for encrypt operation");
                    tabulator.endTimer("KSUtils:wrapObject");
                    return null;
                }
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byteArrayOutputStream.write(-128);
                byteArrayOutputStream.write(iv);
                byteArrayOutputStream.write(cipherInstance.doFinal(bArr));
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                tabulator.endTimer("KSUtils:wrapObject");
                return byteArray;
            } catch (Throwable th2) {
                f63123a.endTimer("KSUtils:wrapObject");
                throw th2;
            }
        } catch (IOException | InvalidKeyException | NoSuchAlgorithmException | NoSuchProviderException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e5) {
            Logger.e("KSUtils", "wrapObject failed", e5);
            f63123a.endTimer("KSUtils:wrapObject");
            return null;
        }
    }

    @SuppressLint({"WrongConstant"})
    @TargetApi(28)
    public static String generateKeyStoreKeyPair(Context context, KsLabel ksLabel, AkMode akMode, byte[] bArr, int i10) {
        Logger.i("KSUtils", "generateKeyStoreKeyPair for " + ksLabel.getAlg().getKeyAlg() + " algorithm");
        String string = UUID.randomUUID().toString();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(0L));
        Calendar calendar2 = Calendar.getInstance();
        boolean z10 = true;
        if (AppSDKConfig.getInstance(context).get(AppSDKConfig.Key.expireKeysIn2038).getAsBoolean()) {
            calendar2.setTime(new Date(2147483647000L));
        } else {
            calendar2.add(1, 20);
        }
        try {
            String keyAlg = ksLabel.getAlg().getKeyAlg();
            int i11 = Build.VERSION.SDK_INT;
            KeyPairGenerator keyPairGeneratorInstance = CryptoProviderHelper.getKeyPairGeneratorInstance(keyAlg);
            X500Principal x500Principal = new X500Principal(String.format("CN=%s, OU=%s", string, context.getPackageName()));
            KeyGenParameterSpec.Builder builder = new KeyGenParameterSpec.Builder(string, 4);
            builder.setCertificateSubject(x500Principal).setCertificateSerialNumber(BigInteger.ONE).setKeyValidityStart(calendar.getTime()).setKeyValidityEnd(calendar2.getTime());
            int i12 = AnonymousClass1.f63125a[ksLabel.getAlg().ordinal()];
            if (i12 == 1) {
                builder.setAlgorithmParameterSpec(new ECGenParameterSpec("secp256r1"));
            } else if (i12 == 2) {
                builder.setSignaturePaddings("PKCS1");
                builder.setAlgorithmParameterSpec(new RSAKeyGenParameterSpec(ksLabel.getAlg().f63128a.f63131c * 8, RSAKeyGenParameterSpec.F4));
            }
            AkMode akMode2 = AkMode.FP;
            if (akMode == akMode2 || akMode == AkMode.KG) {
                Logger.i("KSUtils", "Key generated for bound authentication");
                builder.setUserAuthenticationRequired(true);
            }
            if (akMode == akMode2 && i10 > 0) {
                if (i11 >= 30) {
                    builder.setUserAuthenticationParameters(i10, 3);
                } else {
                    builder.setUserAuthenticationValidityDurationSeconds(i10);
                }
            }
            if (akMode == AkMode.KG) {
                int asInt = AppSDKConfig.getInstance(context).get(AppSDKConfig.Key.keyguardValidityDuration).getAsInt();
                if (i11 >= 30) {
                    builder.setUserAuthenticationParameters(asInt, 3);
                } else {
                    builder.setUserAuthenticationValidityDurationSeconds(asInt);
                }
            }
            builder.setDigests("SHA-256");
            if (i11 >= 24 || "N".equals(Build.VERSION.CODENAME)) {
                builder.setAttestationChallenge(bArr);
            }
            if (i11 >= 28 || "P".equals(Build.VERSION.CODENAME)) {
                if (ksLabel.getStorage() != Storage.SecureElement) {
                    z10 = false;
                }
                builder.setIsStrongBoxBacked(z10);
            }
            if (Looper.myLooper() == null) {
                Looper.prepare();
            }
            keyPairGeneratorInstance.initialize(builder.build());
            keyPairGeneratorInstance.generateKeyPair();
            Logger.i("KSUtils", "Key generation completed");
            return string;
        } catch (IllegalStateException e5) {
            e = e5;
            Logger.e("KSUtils", "Failed to generate KeyPair", e);
            return null;
        } catch (InvalidAlgorithmParameterException e7) {
            Logger.e("KSUtils", "Failed to initialize the KeyPair", e7);
            throw new AsmException(Outcome.USER_NOT_ENROLLED);
        } catch (NoSuchAlgorithmException e10) {
            e = e10;
            Logger.e("KSUtils", "Failed to generate KeyPair", e);
            return null;
        } catch (NoSuchProviderException e11) {
            e = e11;
            Logger.e("KSUtils", "Failed to generate KeyPair", e);
            return null;
        }
    }

    @TargetApi(23)
    private static SecretKey a() {
        Logger.i("KSUtils", "getCryptoKey");
        SecretKey secretKey = f63124b;
        if (secretKey != null) {
            return secretKey;
        }
        try {
            KeyStore keyStoreInstance = CryptoProviderHelper.getKeyStoreInstance();
            keyStoreInstance.load(null);
            KeyStore.SecretKeyEntry secretKeyEntry = (KeyStore.SecretKeyEntry) keyStoreInstance.getEntry("CalKsCryptoKey", null);
            if (secretKeyEntry != null) {
                f63124b = secretKeyEntry.getSecretKey();
            } else {
                KeyGenParameterSpec.Builder builder = new KeyGenParameterSpec.Builder("CalKsCryptoKey", 3);
                builder.setBlockModes(CodePackage.GCM);
                builder.setEncryptionPaddings("NoPadding");
                builder.setKeySize(256);
                KeyGenerator keyGeneratorInstance = CryptoProviderHelper.getKeyGeneratorInstance("AES");
                keyGeneratorInstance.init(builder.build());
                f63124b = keyGeneratorInstance.generateKey();
            }
            return f63124b;
        } catch (IOException e5) {
            e = e5;
            Logger.e("KSUtils", "Failed to get the crypto key", e);
            return null;
        } catch (InvalidAlgorithmParameterException e7) {
            e = e7;
            Logger.e("KSUtils", "Failed to get the crypto key", e);
            return null;
        } catch (KeyStoreException e10) {
            e = e10;
            Logger.e("KSUtils", "Failed to get the crypto key", e);
            return null;
        } catch (NoSuchAlgorithmException e11) {
            e = e11;
            Logger.e("KSUtils", "Failed to get the crypto key", e);
            return null;
        } catch (NoSuchProviderException e12) {
            e = e12;
            Logger.e("KSUtils", "Failed to get the crypto key", e);
            return null;
        } catch (UnrecoverableEntryException e13) {
            e = e13;
            Logger.e("KSUtils", "Failed to get the crypto key", e);
            return null;
        } catch (CertificateException e14) {
            e = e14;
            Logger.e("KSUtils", "Failed to get the crypto key", e);
            return null;
        }
    }
}
