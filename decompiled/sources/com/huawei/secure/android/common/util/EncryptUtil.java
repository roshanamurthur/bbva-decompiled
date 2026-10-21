package com.huawei.secure.android.common.util;

import android.os.Build;
import android.util.Base64;
import com.bbva.zoomauth.facialauth.constant.AuthConstants;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.SecureRandom;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

/* JADX INFO: loaded from: classes10.dex */
public class EncryptUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f50649a = "EncryptUtil";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f50650b = "RSA";

    @Deprecated
    public static byte[] generateSecureRandom(int i10) {
        SecureRandom instanceStrong;
        byte[] bArr = new byte[i10];
        try {
            instanceStrong = Build.VERSION.SDK_INT >= 26 ? SecureRandom.getInstanceStrong() : null;
        } catch (NoSuchAlgorithmException unused) {
            LogsUtil.e(f50649a, "getSecureRandomBytes: NoSuchAlgorithmException");
        }
        if (instanceStrong == null) {
            try {
                instanceStrong = SecureRandom.getInstance(AuthConstants.SHA1PRNG);
            } catch (NoSuchAlgorithmException unused2) {
                LogsUtil.e(f50649a, "getSecureRandomBytes getInstance: NoSuchAlgorithmException");
                return new byte[0];
            } catch (Exception e5) {
                LogsUtil.e(f50649a, "getSecureRandomBytes getInstance: exception : " + e5.getMessage());
                return new byte[0];
            }
        }
        instanceStrong.nextBytes(bArr);
        return bArr;
    }

    @Deprecated
    public static String generateSecureRandomStr(int i10) {
        return HexUtil.byteArray2HexStr(generateSecureRandom(i10));
    }

    @Deprecated
    public static PrivateKey getPrivateKey(String str) {
        try {
            try {
                return KeyFactory.getInstance("RSA").generatePrivate(new PKCS8EncodedKeySpec(Base64.decode(str, 0)));
            } catch (GeneralSecurityException e5) {
                LogsUtil.e(f50649a, "load Key Exception:" + e5.getMessage(), true);
                return null;
            }
        } catch (IllegalArgumentException unused) {
            LogsUtil.e(f50649a, "base64 decode IllegalArgumentException", true);
            return null;
        } catch (Exception unused2) {
            LogsUtil.e(f50649a, "base64 decode Exception", true);
            return null;
        }
    }

    @Deprecated
    public static RSAPublicKey getPublicKey(String str) {
        try {
            try {
                return (RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 0)));
            } catch (GeneralSecurityException e5) {
                LogsUtil.e(f50649a, "load Key Exception:" + e5.getMessage(), true);
                return null;
            }
        } catch (IllegalArgumentException unused) {
            LogsUtil.e(f50649a, "base64 decode IllegalArgumentException", true);
            return null;
        } catch (Exception unused2) {
            LogsUtil.e(f50649a, "base64 decode Exception", true);
            return null;
        }
    }
}
