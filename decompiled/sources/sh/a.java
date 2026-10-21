package sh;

import com.bbva.zoomauth.facialauth.constant.AuthConstants;
import com.mastercard.mpsdk.mcbp.mcmlite.crypto.McmLiteCrypto;
import com.mastercard.mpsdk.mcbp.mcmlite.utils.McmLiteUtils;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.interfaces.RSAPrivateKey;
import java.security.spec.RSAPrivateCrtKeySpec;
import java.util.Arrays;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: McmLiteCryptoDefaultImpl.java */
/* JADX INFO: loaded from: classes10.dex */
public final class a implements McmLiteCrypto {
    private static final /* synthetic */ a[] $VALUES;
    private static final int DEFAULT_BLOCK_SIZE = 16;
    public static final a INSTANCE;
    private Cipher mRsaCipher;

    /* JADX INFO: Fake field, exist only in values array */
    a EF6;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: sh.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: McmLiteCryptoDefaultImpl.java */
    public static final class EnumC0491a {
        private static final /* synthetic */ EnumC0491a[] $VALUES;
        public static final EnumC0491a DECRYPT;
        public static final EnumC0491a ENCRYPT;

        static {
            EnumC0491a enumC0491a = new EnumC0491a("ENCRYPT", 0);
            ENCRYPT = enumC0491a;
            EnumC0491a enumC0491a2 = new EnumC0491a("DECRYPT", 1);
            DECRYPT = enumC0491a2;
            $VALUES = new EnumC0491a[]{enumC0491a, enumC0491a2};
        }

        public EnumC0491a() {
            throw null;
        }

        public static EnumC0491a valueOf(String str) {
            return (EnumC0491a) Enum.valueOf(EnumC0491a.class, str);
        }

        public static EnumC0491a[] values() {
            return (EnumC0491a[]) $VALUES.clone();
        }
    }

    static {
        a aVar = new a("INSTANCE", 0);
        aVar.mRsaCipher = null;
        INSTANCE = aVar;
        $VALUES = new a[]{aVar};
        byte[] bArrC = c(80);
        byte[] bArrC2 = c(16);
        try {
            byte[] bArrB = b(aVar.e(bArrC, bArrC2), bArrC2, EnumC0491a.ENCRYPT);
            try {
                try {
                    byte[] bArrDoFinal = aVar.mRsaCipher.doFinal(new byte[aVar.d(new BigInteger("CDCF9FDA4FC8BDBE4F641A39CD858BF0C64C80CC2055C041FF32B53E6BD8DC51B3AFB13BF0D5E5DAB7537C63A84D3C19", 16), new BigInteger("C89EB6CFA22566083268CE3F975850E0F3695FF199791A27394EB8E9137619C6DA65056F4D9BA4D733ACED9108F48443", 16), new BigInteger("8935153C35307E7EDF98117BDE5907F5D98855DD6AE3D58154CC78D447E5E83677CA7627F5E3EE91CF8CFD97C588D2BB", 16), new BigInteger("85BF248A6C18EEB0219B342A64E58B40A2463FF66650BC1A26347B460CF966849198AE4A33BD188F77C89E60B0A302D7", 16), new BigInteger("BDFF1436301672F1B29C3EC7A4C6C4A5F54058A5925393BEAFB1EAA83050BBF27EC745ACBF2BA0B10FBE89E99B057725", 16))]);
                    byte[] bArr = new byte[bArrDoFinal.length + bArrB.length];
                    System.arraycopy(bArrB, 0, bArr, 0, bArrB.length);
                    System.arraycopy(bArrDoFinal, 0, bArr, bArrB.length, bArrDoFinal.length);
                    try {
                        System.out.println("Crypto library warmed up: " + ((int) McmLiteUtils.sha1(bArr)[0]));
                    } catch (NoSuchAlgorithmException e5) {
                        e5.printStackTrace();
                    }
                } catch (GeneralSecurityException e7) {
                    e7.printStackTrace();
                }
            } catch (GeneralSecurityException e10) {
                e10.printStackTrace();
            }
        } catch (GeneralSecurityException e11) {
            e11.printStackTrace();
        }
    }

    public a() {
        throw null;
    }

    public static byte[] a(byte[] bArr, byte[] bArr2, EnumC0491a enumC0491a) throws GeneralSecurityException {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "DES");
        Cipher cipher = Cipher.getInstance("DES/ECB/noPadding");
        if (enumC0491a == EnumC0491a.ENCRYPT) {
            cipher.init(1, secretKeySpec);
        } else {
            cipher.init(2, secretKeySpec);
        }
        return cipher.doFinal(bArr);
    }

    public static byte[] b(byte[] bArr, byte[] bArr2, EnumC0491a enumC0491a) throws GeneralSecurityException {
        if (bArr2.length != 24 && bArr2.length != 16) {
            throw new InvalidKeyException("Invalid 3DES key length: " + bArr2.length);
        }
        byte[] bArr3 = new byte[24];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        if (bArr2.length == 16) {
            System.arraycopy(bArr2, 0, bArr3, 16, 8);
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr3, "DESede");
        Cipher cipher = Cipher.getInstance("DESede/CBC/noPadding");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        if (enumC0491a == EnumC0491a.ENCRYPT) {
            cipher.init(1, secretKeySpec, ivParameterSpec);
        } else {
            cipher.init(2, secretKeySpec, ivParameterSpec);
        }
        byte[] bArrDoFinal = cipher.doFinal(bArr);
        McmLiteUtils.clearByteArray(bArr3);
        return bArrDoFinal;
    }

    public static byte[] c(int i10) {
        byte[] bArr = new byte[i10];
        try {
            SecureRandom secureRandom = SecureRandom.getInstance(AuthConstants.SHA1PRNG);
            secureRandom.nextBytes(new byte[1]);
            secureRandom.nextBytes(bArr);
        } catch (NoSuchAlgorithmException unused) {
            new Random().nextBytes(bArr);
        }
        return bArr;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.crypto.McmLiteCrypto
    public final McmLiteCrypto.TransactionCryptograms buildComputeCcCryptograms(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        EnumC0491a enumC0491a = EnumC0491a.ENCRYPT;
        return new McmLiteCrypto.TransactionCryptograms(b(bArr, bArr2, enumC0491a), b(bArr, bArr3, enumC0491a));
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.crypto.McmLiteCrypto
    public final McmLiteCrypto.TransactionCryptograms buildGenerateAcCryptograms(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        return new McmLiteCrypto.TransactionCryptograms(e(bArr, bArr2), e(bArr, bArr3));
    }

    public final int d(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5) throws GeneralSecurityException {
        BigInteger bigIntegerMultiply = bigInteger.multiply(bigInteger2);
        BigInteger bigInteger6 = BigInteger.ONE;
        BigInteger bigIntegerModInverse = bigInteger3.modInverse(bigInteger.subtract(bigInteger6));
        RSAPrivateKey rSAPrivateKey = (RSAPrivateKey) KeyFactory.getInstance("RSA").generatePrivate(new RSAPrivateCrtKeySpec(bigIntegerMultiply, bigIntegerModInverse, bigIntegerModInverse.modInverse(bigInteger.subtract(bigInteger6).multiply(bigInteger2.subtract(bigInteger6)).divide(bigInteger.subtract(bigInteger6).gcd(bigInteger2.subtract(bigInteger6)))), bigInteger, bigInteger2, bigInteger3, bigInteger4, bigInteger5));
        Cipher cipher = Cipher.getInstance("RSA/ECB/NOPADDING");
        this.mRsaCipher = cipher;
        cipher.init(1, rSAPrivateKey);
        return bigIntegerMultiply.bitLength() / 8;
    }

    public final byte[] e(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int iCeil = ((int) Math.ceil((((double) bArr.length) + 1.0d) / 8.0d)) * 8;
        byte[] bArr3 = new byte[iCeil];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        bArr3[bArr.length] = -128;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr2, 0, bArr2.length / 2);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr2, bArr2.length / 2, bArr2.length);
        byte[] bArr4 = new byte[8];
        EnumC0491a enumC0491a = EnumC0491a.ENCRYPT;
        SecretKey secretKeyGenerateSecret = SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(bArrCopyOfRange));
        Cipher cipher = Cipher.getInstance("DES/CBC/noPadding");
        cipher.init(1, secretKeyGenerateSecret, new IvParameterSpec(new byte[8]));
        System.arraycopy(cipher.doFinal(bArr3), iCeil - 8, bArr4, 0, 8);
        byte[] bArrA = a(bArr4, bArrCopyOfRange2, EnumC0491a.DECRYPT);
        byte[] bArrA2 = a(bArrA, bArrCopyOfRange, enumC0491a);
        McmLiteUtils.clearByteArray(bArrA);
        McmLiteUtils.clearByteArray(bArr3);
        McmLiteUtils.clearByteArray(bArrCopyOfRange);
        McmLiteUtils.clearByteArray(bArrCopyOfRange2);
        McmLiteUtils.clearByteArray(bArr4);
        return bArrA2;
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.crypto.McmLiteCrypto
    public final int initRsaPrivateKey(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) throws GeneralSecurityException {
        return d(new BigInteger(McmLiteUtils.byteArrayToHexString(bArr), 16), new BigInteger(McmLiteUtils.byteArrayToHexString(bArr2), 16), new BigInteger(McmLiteUtils.byteArrayToHexString(bArr3), 16), new BigInteger(McmLiteUtils.byteArrayToHexString(bArr4), 16), new BigInteger(McmLiteUtils.byteArrayToHexString(bArr5), 16));
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.crypto.McmLiteCrypto
    public final byte[] rsa(byte[] bArr) throws GeneralSecurityException {
        return this.mRsaCipher.doFinal(bArr);
    }
}
