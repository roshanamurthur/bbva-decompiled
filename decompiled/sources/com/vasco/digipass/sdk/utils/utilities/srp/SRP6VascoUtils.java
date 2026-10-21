package com.vasco.digipass.sdk.utils.utilities.srp;

import bc.org.bouncycastle.crypto.Digest;
import bc.org.bouncycastle.crypto.digests.MD5Digest;
import bc.org.bouncycastle.crypto.digests.SHA1Digest;
import bc.org.bouncycastle.crypto.digests.SHA256Digest;
import com.vasco.digipass.sdk.utils.utilities.UtilitiesSDK;
import com.vasco.digipass.sdk.utils.utilities.UtilitiesSDKCryptoResponse;
import com.vasco.digipass.sdk.utils.utilities.UtilitiesSDKException;
import com.vasco.digipass.sdk.utils.utilities.UtilitiesSDKReturnCodes;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.e5;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.f5;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.o0;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.o5;
import java.io.ByteArrayOutputStream;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes9.dex */
public final class SRP6VascoUtils extends e5 {
    private SRP6VascoUtils() {
    }

    public static byte a(Digest digest) throws UtilitiesSDKException {
        if (digest instanceof MD5Digest) {
            return (byte) 1;
        }
        if (digest instanceof SHA1Digest) {
            return (byte) 2;
        }
        if (digest instanceof SHA256Digest) {
            return (byte) 3;
        }
        throw new UtilitiesSDKException(UtilitiesSDKReturnCodes.CRYPTO_MECANISM_INVALID);
    }

    public static Digest b(byte b10) throws UtilitiesSDKException {
        a(b10);
        if (b10 != 1) {
            return b10 != 2 ? new SHA256Digest() : new SHA1Digest();
        }
        return new MD5Digest();
    }

    public static void c(BigInteger bigInteger) throws UtilitiesSDKException {
        if (bigInteger == null || BigInteger.ZERO.equals(bigInteger)) {
            throw new UtilitiesSDKException(UtilitiesSDKReturnCodes.MODULO_NULL_OR_EMPTY);
        }
    }

    public static UtilitiesSDKCryptoResponse calculateClientEvidenceMessage(byte b10, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        try {
            a(b10);
            c(bigInteger);
            b(bigInteger2);
            a(bigInteger3, bigInteger);
            b(bigInteger4, bigInteger);
            c(bArr);
            b(bArr2);
            e(bArr3);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(a(a(b10, bigInteger), a(b10, bigInteger2)));
            byteArrayOutputStream.write(a(b10, bArr2));
            byteArrayOutputStream.write(bArr3);
            byteArrayOutputStream.write(o0.a(bigInteger3));
            byteArrayOutputStream.write(o0.a(bigInteger4));
            byteArrayOutputStream.write(bArr);
            return new UtilitiesSDKCryptoResponse(0, a(b10, byteArrayOutputStream.toByteArray()));
        } catch (UtilitiesSDKException e5) {
            return new UtilitiesSDKCryptoResponse(e5.getReturnErrorCode());
        } catch (Exception unused) {
            return new UtilitiesSDKCryptoResponse(UtilitiesSDKReturnCodes.UNKNOWN_ERROR);
        }
    }

    public static UtilitiesSDKCryptoResponse calculateServerEvidenceMessage(byte b10, byte[] bArr, BigInteger bigInteger, byte[] bArr2) {
        try {
            a(b10);
            a(bArr);
            a(bigInteger);
            c(bArr2);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(o0.a(bigInteger));
            byteArrayOutputStream.write(bArr);
            byteArrayOutputStream.write(bArr2);
            return new UtilitiesSDKCryptoResponse(0, a(b10, byteArrayOutputStream.toByteArray()));
        } catch (UtilitiesSDKException e5) {
            return new UtilitiesSDKCryptoResponse(e5.getReturnErrorCode());
        } catch (Exception unused) {
            return new UtilitiesSDKCryptoResponse(UtilitiesSDKReturnCodes.UNKNOWN_ERROR);
        }
    }

    public static BigInteger calculateV(byte b10, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr, byte[] bArr2, byte[] bArr3) throws UtilitiesSDKException {
        try {
            a(b10);
            c(bigInteger);
            b(bigInteger2);
            e(bArr);
            b(bArr2);
            d(bArr3);
            f5 f5Var = new f5();
            f5Var.a(bigInteger, bigInteger2, b(b10));
            return f5Var.a(bArr, bArr2, bArr3);
        } catch (UtilitiesSDKException e5) {
            throw e5;
        } catch (Exception unused) {
            throw new UtilitiesSDKException(UtilitiesSDKReturnCodes.UNKNOWN_ERROR);
        }
    }

    public static void d(byte[] bArr) throws UtilitiesSDKException {
        if (o5.c(bArr)) {
            throw new UtilitiesSDKException(UtilitiesSDKReturnCodes.PASSWORD_NULL_OR_EMPTY);
        }
        if (bArr.length > 64 || bArr.length < 4) {
            throw new UtilitiesSDKException(UtilitiesSDKReturnCodes.PASSWORD_INCORRECT_LENGTH);
        }
    }

    public static UtilitiesSDKCryptoResponse deriveKey(byte[] bArr, byte b10) {
        try {
            c(bArr);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(new byte[]{1, 0});
            byteArrayOutputStream.write(b10);
            byteArrayOutputStream.write(0);
            byteArrayOutputStream.write(new byte[]{0, 1});
            return UtilitiesSDK.hmac((byte) 3, byteArrayOutputStream.toByteArray(), bArr);
        } catch (UtilitiesSDKException e5) {
            return new UtilitiesSDKCryptoResponse(e5.getReturnErrorCode());
        } catch (Exception unused) {
            return new UtilitiesSDKCryptoResponse(UtilitiesSDKReturnCodes.UNKNOWN_ERROR);
        }
    }

    public static void e(byte[] bArr) throws UtilitiesSDKException {
        if (o5.c(bArr)) {
            throw new UtilitiesSDKException(UtilitiesSDKReturnCodes.SALT_NULL);
        }
        if (bArr.length != 16) {
            throw new UtilitiesSDKException(UtilitiesSDKReturnCodes.SALT_INCORRECT_LENGTH);
        }
    }

    public static void c(byte[] bArr) throws UtilitiesSDKException {
        if (!o5.c(bArr)) {
            if (bArr.length != 32) {
                throw new UtilitiesSDKException(UtilitiesSDKReturnCodes.KEY_INCORRECT_LENGTH);
            }
            return;
        }
        throw new UtilitiesSDKException(UtilitiesSDKReturnCodes.KEY_NULL);
    }

    public static void a(byte b10) throws UtilitiesSDKException {
        if (b10 != 1 && b10 != 2 && b10 != 3) {
            throw new UtilitiesSDKException(UtilitiesSDKReturnCodes.CRYPTO_MECANISM_INVALID);
        }
    }

    public static void b(BigInteger bigInteger) throws UtilitiesSDKException {
        if (bigInteger == null || BigInteger.ZERO.equals(bigInteger)) {
            throw new UtilitiesSDKException(UtilitiesSDKReturnCodes.GENERATOR_NULL_OR_EMPTY);
        }
    }

    public static void a(BigInteger bigInteger) throws UtilitiesSDKException {
        if (bigInteger != null) {
            if (!BigInteger.ZERO.equals(bigInteger)) {
                if (o0.a(bigInteger).length > 256) {
                    throw new UtilitiesSDKException(UtilitiesSDKReturnCodes.CLIENT_EPHEMERAL_KEY_INCORRECT_LENGTH);
                }
                return;
            }
            throw new UtilitiesSDKException(UtilitiesSDKReturnCodes.CLIENT_EPHEMERAL_KEY_INVALID);
        }
        throw new UtilitiesSDKException(UtilitiesSDKReturnCodes.CLIENT_EPHEMERAL_KEY_NULL_OR_EMPTY);
    }

    public static void b(byte[] bArr) throws UtilitiesSDKException {
        if (!o5.c(bArr)) {
            if (bArr.length > 64 || bArr.length < 4) {
                throw new UtilitiesSDKException(UtilitiesSDKReturnCodes.IDENTITY_INCORRECT_LENGTH);
            }
            return;
        }
        throw new UtilitiesSDKException(UtilitiesSDKReturnCodes.IDENTITY_NULL_OR_EMPTY);
    }

    public static void a(BigInteger bigInteger, BigInteger bigInteger2) throws UtilitiesSDKException {
        a(bigInteger);
        if (bigInteger.mod(bigInteger2).equals(BigInteger.ZERO)) {
            throw new UtilitiesSDKException(UtilitiesSDKReturnCodes.CLIENT_EPHEMERAL_KEY_INVALID);
        }
    }

    public static void b(BigInteger bigInteger, BigInteger bigInteger2) throws UtilitiesSDKException {
        if (bigInteger != null) {
            if (o0.a(bigInteger).length <= 256) {
                BigInteger bigInteger3 = BigInteger.ZERO;
                if (bigInteger3.equals(bigInteger) || bigInteger.mod(bigInteger2).equals(bigInteger3)) {
                    throw new UtilitiesSDKException(UtilitiesSDKReturnCodes.SERVER_EPHEMERAL_KEY_INVALID);
                }
                return;
            }
            throw new UtilitiesSDKException(UtilitiesSDKReturnCodes.SERVER_EPHEMERAL_KEY_INCORRECT_LENGTH);
        }
        throw new UtilitiesSDKException(UtilitiesSDKReturnCodes.SERVER_EPHEMERAL_KEY_NULL_OR_EMPTY);
    }

    public static void a(byte[] bArr) throws UtilitiesSDKException {
        if (bArr != null) {
            if (bArr.length != 32) {
                throw new UtilitiesSDKException(UtilitiesSDKReturnCodes.CLIENT_MESSAGE_INCORRECT_LENGTH);
            }
            return;
        }
        throw new UtilitiesSDKException(UtilitiesSDKReturnCodes.CLIENT_MESSAGE_NULL_OR_EMPTY);
    }

    private static byte[] a(byte b10, byte[] bArr) throws UtilitiesSDKException {
        UtilitiesSDKCryptoResponse utilitiesSDKCryptoResponseHash = UtilitiesSDK.hash(b10, bArr);
        int returnCode = utilitiesSDKCryptoResponseHash.getReturnCode();
        if (returnCode == 0) {
            return utilitiesSDKCryptoResponseHash.getOutputData();
        }
        throw new UtilitiesSDKException(returnCode);
    }

    private static byte[] a(Digest digest, byte[] bArr) throws UtilitiesSDKException {
        return a(a(digest), bArr);
    }

    private static byte[] a(byte b10, BigInteger bigInteger) throws UtilitiesSDKException {
        return a(b10, o0.a(bigInteger));
    }

    public static byte[] a(Digest digest, BigInteger bigInteger) throws UtilitiesSDKException {
        return a(digest, o0.a(bigInteger));
    }

    private static byte[] a(byte[] bArr, byte[] bArr2) {
        int iMin = Math.min(bArr.length, bArr2.length);
        byte[] bArr3 = new byte[iMin];
        for (int i10 = 0; i10 < iMin; i10++) {
            bArr3[i10] = (byte) (bArr[i10] ^ bArr2[i10]);
        }
        return bArr3;
    }
}
