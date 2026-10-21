package com.google.crypto.tink.hybrid.internal;

import c2.b;
import com.google.crypto.tink.internal.Util;
import com.google.crypto.tink.proto.HpkeAead;
import com.google.crypto.tink.proto.HpkeKdf;
import com.google.crypto.tink.proto.HpkeKem;
import com.google.crypto.tink.proto.HpkeParams;
import com.google.crypto.tink.subtle.Bytes;
import com.google.crypto.tink.subtle.EllipticCurves;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes10.dex */
public final class HpkeUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f46585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f46586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f46587c;
    public static final byte[] BASE_MODE = intToByteArray(1, 0);
    public static final byte[] X25519_HKDF_SHA256_KEM_ID = intToByteArray(2, 32);
    public static final byte[] P256_HKDF_SHA256_KEM_ID = intToByteArray(2, 16);
    public static final byte[] P384_HKDF_SHA384_KEM_ID = intToByteArray(2, 17);
    public static final byte[] P521_HKDF_SHA512_KEM_ID = intToByteArray(2, 18);
    public static final byte[] HKDF_SHA256_KDF_ID = intToByteArray(2, 1);
    public static final byte[] HKDF_SHA384_KDF_ID = intToByteArray(2, 2);
    public static final byte[] HKDF_SHA512_KDF_ID = intToByteArray(2, 3);
    public static final byte[] AES_128_GCM_AEAD_ID = intToByteArray(2, 1);
    public static final byte[] AES_256_GCM_AEAD_ID = intToByteArray(2, 2);
    public static final byte[] CHACHA20_POLY1305_AEAD_ID = intToByteArray(2, 3);
    public static final byte[] EMPTY_SALT = new byte[0];

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f46588a;

        static {
            int[] iArr = new int[HpkeKem.values().length];
            f46588a = iArr;
            try {
                iArr[HpkeKem.DHKEM_P256_HKDF_SHA256.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f46588a[HpkeKem.DHKEM_P384_HKDF_SHA384.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f46588a[HpkeKem.DHKEM_P521_HKDF_SHA512.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        Charset charset = Util.UTF_8;
        f46585a = "KEM".getBytes(charset);
        f46586b = "HPKE".getBytes(charset);
        f46587c = "HPKE-v1".getBytes(charset);
    }

    public static byte[] a(String str, byte[] bArr, byte[] bArr2, int i10) throws GeneralSecurityException {
        return Bytes.concat(intToByteArray(2, i10), f46587c, bArr2, str.getBytes(Util.UTF_8), bArr);
    }

    public static EllipticCurves.CurveType b(HpkeKem hpkeKem) throws GeneralSecurityException {
        int i10 = a.f46588a[hpkeKem.ordinal()];
        if (i10 == 1) {
            return EllipticCurves.CurveType.NIST_P256;
        }
        if (i10 == 2) {
            return EllipticCurves.CurveType.NIST_P384;
        }
        if (i10 == 3) {
            return EllipticCurves.CurveType.NIST_P521;
        }
        throw new GeneralSecurityException("Unrecognized NIST HPKE KEM identifier");
    }

    public static void c(HpkeParams hpkeParams) throws GeneralSecurityException {
        if (hpkeParams.getKem() == HpkeKem.KEM_UNKNOWN || hpkeParams.getKem() == HpkeKem.UNRECOGNIZED) {
            throw new GeneralSecurityException("Invalid KEM param: " + hpkeParams.getKem().name());
        }
        if (hpkeParams.getKdf() == HpkeKdf.KDF_UNKNOWN || hpkeParams.getKdf() == HpkeKdf.UNRECOGNIZED) {
            throw new GeneralSecurityException("Invalid KDF param: " + hpkeParams.getKdf().name());
        }
        if (hpkeParams.getAead() == HpkeAead.AEAD_UNKNOWN || hpkeParams.getAead() == HpkeAead.UNRECOGNIZED) {
            throw new GeneralSecurityException("Invalid AEAD param: " + hpkeParams.getAead().name());
        }
    }

    public static byte[] intToByteArray(int i10, int i11) {
        byte[] bArr = new byte[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            bArr[i12] = (byte) ((i11 >> b.e(i10, i12, 1, 8)) & 255);
        }
        return bArr;
    }
}
