package com.google.crypto.tink.subtle;

import com.google.crypto.tink.internal.BigIntegerEncoding;
import com.google.crypto.tink.internal.Util;
import com.mastercard.sonic.androidsvg.SvgConstantsKt;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;

/* JADX INFO: loaded from: classes10.dex */
public final class SubtleUtil {

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f47501a;

        static {
            int[] iArr = new int[Enums.HashType.values().length];
            f47501a = iArr;
            try {
                iArr[Enums.HashType.SHA1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f47501a[Enums.HashType.SHA224.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f47501a[Enums.HashType.SHA256.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f47501a[Enums.HashType.SHA384.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f47501a[Enums.HashType.SHA512.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @Deprecated
    public static int androidApiLevel() {
        Integer androidApiLevel = Util.getAndroidApiLevel();
        if (androidApiLevel != null) {
            return androidApiLevel.intValue();
        }
        return -1;
    }

    public static BigInteger bytes2Integer(byte[] bArr) {
        return BigIntegerEncoding.fromUnsignedBigEndianBytes(bArr);
    }

    public static byte[] integer2Bytes(BigInteger bigInteger, int i10) throws GeneralSecurityException {
        return BigIntegerEncoding.toBigEndianBytesOfFixedLength(bigInteger, i10);
    }

    public static boolean isAndroid() {
        return "The Android Project".equals(System.getProperty("java.vendor"));
    }

    public static byte[] mgf1(byte[] bArr, int i10, Enums.HashType hashType) throws GeneralSecurityException {
        MessageDigest engineFactory = EngineFactory.MESSAGE_DIGEST.getInstance(toDigestAlgo(hashType));
        int digestLength = engineFactory.getDigestLength();
        byte[] bArr2 = new byte[i10];
        int length = 0;
        for (int i11 = 0; i11 <= (i10 - 1) / digestLength; i11++) {
            engineFactory.reset();
            engineFactory.update(bArr);
            engineFactory.update(integer2Bytes(BigInteger.valueOf(i11), 4));
            byte[] bArrDigest = engineFactory.digest();
            System.arraycopy(bArrDigest, 0, bArr2, length, Math.min(bArrDigest.length, i10 - length));
            length += bArrDigest.length;
        }
        return bArr2;
    }

    public static void putAsUnsigedInt(ByteBuffer byteBuffer, long j10) throws GeneralSecurityException {
        if (0 > j10 || j10 >= SvgConstantsKt.SPECIFIED_SOLID_OPACITY) {
            throw new GeneralSecurityException("Index out of range");
        }
        byteBuffer.putInt((int) j10);
    }

    public static String toDigestAlgo(Enums.HashType hashType) throws GeneralSecurityException {
        int i10 = a.f47501a[hashType.ordinal()];
        if (i10 == 1) {
            return McElieceCCA2KeyGenParameterSpec.SHA1;
        }
        if (i10 == 2) {
            return McElieceCCA2KeyGenParameterSpec.SHA224;
        }
        if (i10 == 3) {
            return "SHA-256";
        }
        if (i10 == 4) {
            return McElieceCCA2KeyGenParameterSpec.SHA384;
        }
        if (i10 == 5) {
            return "SHA-512";
        }
        throw new GeneralSecurityException("Unsupported hash " + hashType);
    }

    public static String toEcdsaAlgo(Enums.HashType hashType) throws GeneralSecurityException {
        Validators.validateSignatureHash(hashType);
        return hashType + "withECDSA";
    }

    public static String toRsaSsaPkcs1Algo(Enums.HashType hashType) throws GeneralSecurityException {
        Validators.validateSignatureHash(hashType);
        return hashType + "withRSA";
    }
}
