package com.google.crypto.tink.subtle;

import com.google.crypto.tink.config.internal.TinkFipsUtil;
import com.mastercard.sonic.androidsvg.SvgConstantsKt;
import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes10.dex */
public final class Validators {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f47502a = Pattern.compile(String.format("^projects/%s/locations/%s/keyRings/%s/cryptoKeys/%s$", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+"), 2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f47503b = Pattern.compile(String.format("^projects/%s/locations/%s/keyRings/%s/cryptoKeys/%s/cryptoKeyVersions/%s$", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+"), 2);

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f47504a;

        static {
            int[] iArr = new int[Enums.HashType.values().length];
            f47504a = iArr;
            try {
                iArr[Enums.HashType.SHA256.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f47504a[Enums.HashType.SHA384.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f47504a[Enums.HashType.SHA512.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static void validateAesKeySize(int i10) throws InvalidAlgorithmParameterException {
        if (i10 != 16 && i10 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i10 * 8)));
        }
    }

    public static void validateCryptoKeyUri(String str) throws GeneralSecurityException {
        if (f47502a.matcher(str).matches()) {
            return;
        }
        if (!f47503b.matcher(str).matches()) {
            throw new GeneralSecurityException("Invalid Google Cloud KMS Key URI. The URI must point to a CryptoKey in the format projects/*/locations/*/keyRings/*/cryptoKeys/*. See https://cloud.google.com/kms/docs/reference/rest/v1/projects.locations.keyRings.cryptoKeys#CryptoKey");
        }
        throw new GeneralSecurityException("Invalid Google Cloud KMS Key URI. The URI must point to a CryptoKey, not a CryptoKeyVersion");
    }

    public static void validateExists(File file) throws IOException {
        if (!file.exists()) {
            throw new IOException(String.format("Error: %s doesn't exist, please choose another file\n", file));
        }
    }

    public static String validateKmsKeyUriAndRemovePrefix(String str, String str2) {
        if (str2.toLowerCase(Locale.US).startsWith(str)) {
            return str2.substring(str.length());
        }
        throw new IllegalArgumentException(String.format("key URI must start with %s", str));
    }

    public static void validateNotExists(File file) throws IOException {
        if (file.exists()) {
            throw new IOException(String.format("%s exists, please choose another file\n", file));
        }
    }

    public static void validateRsaModulusSize(int i10) throws GeneralSecurityException {
        if (i10 < 2048) {
            throw new GeneralSecurityException(String.format("Modulus size is %d; only modulus size >= 2048-bit is supported", Integer.valueOf(i10)));
        }
        if (TinkFipsUtil.useOnlyFips() && i10 != 2048 && i10 != 3072) {
            throw new GeneralSecurityException(String.format("Modulus size is %d; only modulus size of 2048- or 3072-bit is supported in FIPS mode.", Integer.valueOf(i10)));
        }
    }

    public static void validateRsaPublicExponent(BigInteger bigInteger) throws GeneralSecurityException {
        if (!bigInteger.testBit(0)) {
            throw new GeneralSecurityException("Public exponent must be odd.");
        }
        if (bigInteger.compareTo(BigInteger.valueOf(SvgConstantsKt.SPECIFIED_FONT_STYLE)) <= 0) {
            throw new GeneralSecurityException("Public exponent must be greater than 65536.");
        }
    }

    public static void validateSignatureHash(Enums.HashType hashType) throws GeneralSecurityException {
        int i10 = a.f47504a[hashType.ordinal()];
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            return;
        }
        throw new GeneralSecurityException("Unsupported hash: " + hashType.name());
    }

    public static void validateTypeUrl(String str) throws GeneralSecurityException {
        if (!str.startsWith("type.googleapis.com/")) {
            throw new GeneralSecurityException(String.format("Error: type URL %s is invalid; it must start with %s.\n", str, "type.googleapis.com/"));
        }
        if (str.length() == 20) {
            throw new GeneralSecurityException(String.format("Error: type URL %s is invalid; it has no message name.\n", str));
        }
    }

    public static void validateVersion(int i10, int i11) throws GeneralSecurityException {
        if (i10 < 0 || i10 > i11) {
            throw new GeneralSecurityException(String.format("key has version %d; only keys with version in range [0..%d] are supported", Integer.valueOf(i10), Integer.valueOf(i11)));
        }
    }
}
