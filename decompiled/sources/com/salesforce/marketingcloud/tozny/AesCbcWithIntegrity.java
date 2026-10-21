package com.salesforce.marketingcloud.tozny;

import android.os.Build;
import android.os.Process;
import android.util.Base64;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.glomohybrid.base.deeplink.extensions.DeepLinkExtensionsKt;
import com.vierge.bluetoothlibrary.BluetoothState;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.SecureRandomSpi;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public class AesCbcWithIntegrity {
    private static final int AES_KEY_LENGTH_BITS = 128;
    private static final boolean ALLOW_BROKEN_PRNG = false;
    public static final int BASE64_FLAGS = 2;
    private static final String CIPHER = "AES";
    private static final String CIPHER_TRANSFORMATION = "AES/CBC/PKCS5Padding";
    private static final String HMAC_ALGORITHM = "HmacSHA256";
    private static final int HMAC_KEY_LENGTH_BITS = 256;
    private static final int IV_LENGTH_BYTES = 16;
    private static final String PBE_ALGORITHM = "PBKDF2WithHmacSHA1";
    private static final int PBE_SALT_LENGTH_BITS = 128;
    static final AtomicBoolean prngFixed = new AtomicBoolean(false);

    @Keep
    public static class CipherTextIvMac {
        private final byte[] cipherText;
        private final byte[] iv;
        private final byte[] mac;

        public CipherTextIvMac(String str) {
            String[] strArrSplit = str.split(DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER);
            if (strArrSplit.length != 3) {
                throw new IllegalArgumentException("Cannot parse iv:ciphertext:mac");
            }
            this.iv = Base64.decode(strArrSplit[0], 2);
            this.mac = Base64.decode(strArrSplit[1], 2);
            this.cipherText = Base64.decode(strArrSplit[2], 2);
        }

        public static byte[] ivCipherConcat(byte[] bArr, byte[] bArr2) {
            byte[] bArr3 = new byte[bArr.length + bArr2.length];
            System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
            System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
            return bArr3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            CipherTextIvMac cipherTextIvMac = (CipherTextIvMac) obj;
            return Arrays.equals(this.cipherText, cipherTextIvMac.cipherText) && Arrays.equals(this.iv, cipherTextIvMac.iv) && Arrays.equals(this.mac, cipherTextIvMac.mac);
        }

        public byte[] getCipherText() {
            return this.cipherText;
        }

        public byte[] getIv() {
            return this.iv;
        }

        public byte[] getMac() {
            return this.mac;
        }

        public int hashCode() {
            return Arrays.hashCode(this.mac) + ((Arrays.hashCode(this.iv) + ((Arrays.hashCode(this.cipherText) + 31) * 31)) * 31);
        }

        public String toString() {
            String strEncodeToString = Base64.encodeToString(this.iv, 2);
            String strEncodeToString2 = Base64.encodeToString(this.cipherText, 2);
            return String.format(strEncodeToString + DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER + Base64.encodeToString(this.mac, 2) + DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER + strEncodeToString2, new Object[0]);
        }

        public CipherTextIvMac(byte[] bArr, byte[] bArr2, byte[] bArr3) {
            byte[] bArr4 = new byte[bArr.length];
            this.cipherText = bArr4;
            System.arraycopy(bArr, 0, bArr4, 0, bArr.length);
            byte[] bArr5 = new byte[bArr2.length];
            this.iv = bArr5;
            System.arraycopy(bArr2, 0, bArr5, 0, bArr2.length);
            byte[] bArr6 = new byte[bArr3.length];
            this.mac = bArr6;
            System.arraycopy(bArr3, 0, bArr6, 0, bArr3.length);
        }
    }

    @Keep
    public static class SecretKeys {
        private SecretKey confidentialityKey;
        private SecretKey integrityKey;

        public SecretKeys(SecretKey secretKey, SecretKey secretKey2) {
            setConfidentialityKey(secretKey);
            setIntegrityKey(secretKey2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            SecretKeys secretKeys = (SecretKeys) obj;
            return this.integrityKey.equals(secretKeys.integrityKey) && this.confidentialityKey.equals(secretKeys.confidentialityKey);
        }

        public SecretKey getConfidentialityKey() {
            return this.confidentialityKey;
        }

        public SecretKey getIntegrityKey() {
            return this.integrityKey;
        }

        public int hashCode() {
            return this.integrityKey.hashCode() + ((this.confidentialityKey.hashCode() + 31) * 31);
        }

        public void setConfidentialityKey(SecretKey secretKey) {
            this.confidentialityKey = secretKey;
        }

        public void setIntegrityKey(SecretKey secretKey) {
            this.integrityKey = secretKey;
        }

        public String toString() {
            return Base64.encodeToString(getConfidentialityKey().getEncoded(), 2) + DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER + Base64.encodeToString(getIntegrityKey().getEncoded(), 2);
        }
    }

    public static boolean constantTimeEq(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return false;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < bArr.length; i11++) {
            i10 |= bArr[i11] ^ bArr2[i11];
        }
        return i10 == 0;
    }

    private static byte[] copyOfRange(byte[] bArr, int i10, int i11) {
        int i12 = i11 - i10;
        byte[] bArr2 = new byte[i12];
        System.arraycopy(bArr, i10, bArr2, 0, i12);
        return bArr2;
    }

    public static byte[] decrypt(CipherTextIvMac cipherTextIvMac, SecretKeys secretKeys) throws GeneralSecurityException {
        if (!constantTimeEq(generateMac(CipherTextIvMac.ivCipherConcat(cipherTextIvMac.getIv(), cipherTextIvMac.getCipherText()), secretKeys.getIntegrityKey()), cipherTextIvMac.getMac())) {
            throw new GeneralSecurityException("MAC stored in civ does not match computed MAC.");
        }
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(2, secretKeys.getConfidentialityKey(), new IvParameterSpec(cipherTextIvMac.getIv()));
        return cipher.doFinal(cipherTextIvMac.getCipherText());
    }

    public static String decryptString(CipherTextIvMac cipherTextIvMac, SecretKeys secretKeys) throws GeneralSecurityException, UnsupportedEncodingException {
        return decryptString(cipherTextIvMac, secretKeys, "UTF-8");
    }

    public static CipherTextIvMac encrypt(String str, SecretKeys secretKeys) throws GeneralSecurityException, UnsupportedEncodingException {
        return encrypt(str, secretKeys, "UTF-8");
    }

    private static void fixPrng() {
        AtomicBoolean atomicBoolean = prngFixed;
        if (atomicBoolean.get()) {
            return;
        }
        synchronized (PrngFixes.class) {
            try {
                if (!atomicBoolean.get()) {
                    PrngFixes.b();
                    atomicBoolean.set(true);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static byte[] generateIv() throws GeneralSecurityException {
        return randomBytes(16);
    }

    public static SecretKeys generateKey() throws GeneralSecurityException {
        fixPrng();
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(128);
        return new SecretKeys(keyGenerator.generateKey(), new SecretKeySpec(randomBytes(32), HMAC_ALGORITHM));
    }

    public static SecretKeys generateKeyFromPassword(String str, String str2, int i10) throws GeneralSecurityException {
        return generateKeyFromPassword(str, Base64.decode(str2, 2), i10);
    }

    public static byte[] generateMac(byte[] bArr, SecretKey secretKey) throws NoSuchAlgorithmException, InvalidKeyException {
        Mac mac = Mac.getInstance(HMAC_ALGORITHM);
        mac.init(secretKey);
        return mac.doFinal(bArr);
    }

    public static byte[] generateSalt() throws GeneralSecurityException {
        return randomBytes(128);
    }

    public static String keyString(SecretKeys secretKeys) {
        return secretKeys.toString();
    }

    public static SecretKeys keys(String str) throws InvalidKeyException {
        String[] strArrSplit = str.split(DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER);
        if (strArrSplit.length != 2) {
            throw new IllegalArgumentException("Cannot parse aesKey:hmacKey");
        }
        byte[] bArrDecode = Base64.decode(strArrSplit[0], 2);
        if (bArrDecode.length != 16) {
            throw new InvalidKeyException("Base64 decoded key is not 128 bytes");
        }
        byte[] bArrDecode2 = Base64.decode(strArrSplit[1], 2);
        if (bArrDecode2.length == 32) {
            return new SecretKeys(new SecretKeySpec(bArrDecode, 0, bArrDecode.length, "AES"), new SecretKeySpec(bArrDecode2, HMAC_ALGORITHM));
        }
        throw new InvalidKeyException("Base64 decoded key is not 256 bytes");
    }

    private static byte[] randomBytes(int i10) throws GeneralSecurityException {
        fixPrng();
        byte[] bArr = new byte[i10];
        new SecureRandom().nextBytes(bArr);
        return bArr;
    }

    public static String saltString(byte[] bArr) {
        return Base64.encodeToString(bArr, 2);
    }

    public static String decryptString(CipherTextIvMac cipherTextIvMac, SecretKeys secretKeys, String str) throws GeneralSecurityException, UnsupportedEncodingException {
        return new String(decrypt(cipherTextIvMac, secretKeys), str);
    }

    public static CipherTextIvMac encrypt(String str, SecretKeys secretKeys, String str2) throws GeneralSecurityException, UnsupportedEncodingException {
        return encrypt(str.getBytes(str2), secretKeys);
    }

    public static SecretKeys generateKeyFromPassword(String str, byte[] bArr, int i10) throws GeneralSecurityException {
        fixPrng();
        byte[] encoded = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1").generateSecret(new PBEKeySpec(str.toCharArray(), bArr, i10, BluetoothState.REQUEST_CONNECT_DEVICE)).getEncoded();
        return new SecretKeys(new SecretKeySpec(copyOfRange(encoded, 0, 16), "AES"), new SecretKeySpec(copyOfRange(encoded, 16, 48), HMAC_ALGORITHM));
    }

    public static CipherTextIvMac encrypt(byte[] bArr, SecretKeys secretKeys) throws GeneralSecurityException {
        byte[] bArrGenerateIv = generateIv();
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(1, secretKeys.getConfidentialityKey(), new IvParameterSpec(bArrGenerateIv));
        byte[] iv = cipher.getIV();
        byte[] bArrDoFinal = cipher.doFinal(bArr);
        return new CipherTextIvMac(bArrDoFinal, iv, generateMac(CipherTextIvMac.ivCipherConcat(iv, bArrDoFinal), secretKeys.getIntegrityKey()));
    }

    public static final class PrngFixes {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final int f65124a = 16;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final int f65125b = 18;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final byte[] f65126c = e();

        @Keep
        public static class LinuxPRNGSecureRandom extends SecureRandomSpi {
            private static final File URANDOM_FILE = new File("/dev/urandom");
            private static final Object sLock = new Object();
            private static DataInputStream sUrandomIn;
            private static OutputStream sUrandomOut;
            private boolean mSeeded;

            private DataInputStream getUrandomInputStream() {
                DataInputStream dataInputStream;
                synchronized (sLock) {
                    if (sUrandomIn == null) {
                        try {
                            sUrandomIn = new DataInputStream(new FileInputStream(URANDOM_FILE));
                        } catch (IOException e5) {
                            throw new SecurityException("Failed to open " + URANDOM_FILE + " for reading", e5);
                        }
                    }
                    dataInputStream = sUrandomIn;
                }
                return dataInputStream;
            }

            private OutputStream getUrandomOutputStream() throws IOException {
                OutputStream outputStream;
                synchronized (sLock) {
                    try {
                        if (sUrandomOut == null) {
                            sUrandomOut = new FileOutputStream(URANDOM_FILE);
                        }
                        outputStream = sUrandomOut;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return outputStream;
            }

            @Override // java.security.SecureRandomSpi
            public byte[] engineGenerateSeed(int i10) {
                byte[] bArr = new byte[i10];
                engineNextBytes(bArr);
                return bArr;
            }

            @Override // java.security.SecureRandomSpi
            public void engineNextBytes(byte[] bArr) {
                DataInputStream urandomInputStream;
                if (!this.mSeeded) {
                    engineSetSeed(PrngFixes.d());
                }
                try {
                    synchronized (sLock) {
                        urandomInputStream = getUrandomInputStream();
                    }
                    synchronized (urandomInputStream) {
                        urandomInputStream.readFully(bArr);
                    }
                } catch (IOException e5) {
                    throw new SecurityException("Failed to read from " + URANDOM_FILE, e5);
                }
            }

            @Override // java.security.SecureRandomSpi
            public void engineSetSeed(byte[] bArr) {
                OutputStream urandomOutputStream;
                try {
                    try {
                        synchronized (sLock) {
                            urandomOutputStream = getUrandomOutputStream();
                        }
                        urandomOutputStream.write(bArr);
                        urandomOutputStream.flush();
                    } catch (IOException unused) {
                        Log.w(PrngFixes.class.getSimpleName(), "Failed to mix seed into " + URANDOM_FILE);
                    }
                    this.mSeeded = true;
                } catch (Throwable th2) {
                    this.mSeeded = true;
                    throw th2;
                }
            }
        }

        @Keep
        public static class LinuxPRNGSecureRandomProvider extends Provider {
            public LinuxPRNGSecureRandomProvider() {
                super("LinuxPRNG", 1.0d, "A Linux-specific random number provider that uses /dev/urandom");
                put("SecureRandom.SHA1PRNG", LinuxPRNGSecureRandom.class.getName());
                put("SecureRandom.SHA1PRNG ImplementedIn", ExifInterface.TAG_SOFTWARE);
            }
        }

        private PrngFixes() {
        }

        public static void b() {
            c();
            g();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static byte[] d() {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                dataOutputStream.writeLong(System.currentTimeMillis());
                dataOutputStream.writeLong(System.nanoTime());
                dataOutputStream.writeInt(Process.myPid());
                dataOutputStream.writeInt(Process.myUid());
                dataOutputStream.write(f65126c);
                dataOutputStream.close();
                return byteArrayOutputStream.toByteArray();
            } catch (IOException e5) {
                throw new SecurityException("Failed to generate seed", e5);
            }
        }

        private static byte[] e() {
            StringBuilder sb2 = new StringBuilder();
            String str = Build.FINGERPRINT;
            if (str != null) {
                sb2.append(str);
            }
            String strF = f();
            if (strF != null) {
                sb2.append(strF);
            }
            try {
                return sb2.toString().getBytes("UTF-8");
            } catch (UnsupportedEncodingException unused) {
                throw new RuntimeException("UTF-8 encoding not supported");
            }
        }

        private static String f() {
            try {
                return (String) Build.class.getField("SERIAL").get(null);
            } catch (Exception unused) {
                return null;
            }
        }

        private static void c() throws SecurityException {
        }

        private static void g() throws SecurityException {
        }
    }
}
