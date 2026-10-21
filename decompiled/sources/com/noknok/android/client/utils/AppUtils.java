package com.noknok.android.client.utils;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;

/* JADX INFO: loaded from: classes11.dex */
public final class AppUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Signature f63425a;

    public enum Algorithm {
        SHA1,
        SHA256
    }

    public static String computeFacetID(Context context, String str, Algorithm algorithm) {
        Signature signature = getSignature(context, str);
        if (signature == null) {
            Logger.e("AppUtils", "Null Signature. Failed to get callerId for " + str);
            return null;
        }
        int i10 = algorithm.equals(Algorithm.SHA1) ? 3 : 11;
        try {
            MessageDigest messageDigestInstance = CryptoProviderHelper.getMessageDigestInstance(algorithm.name());
            messageDigestInstance.update(signature.toByteArray());
            return "android:apk-key-hash:" + Base64.encodeToString(messageDigestInstance.digest(), i10);
        } catch (NoSuchAlgorithmException | NoSuchProviderException e5) {
            Logger.e("AppUtils", "Failed to generate FacetID for " + context.getPackageName(), e5);
            return null;
        }
    }

    public static byte[] getCallerID(Context context, String str) {
        Signature signature = getSignature(context, str);
        if (signature == null) {
            Logger.e("AppUtils", "Null Signature. Failed to get callerId for " + str);
            return null;
        }
        try {
            MessageDigest messageDigestInstance = CryptoProviderHelper.getMessageDigestInstance("SHA-256");
            messageDigestInstance.update(signature.toByteArray());
            return messageDigestInstance.digest();
        } catch (NoSuchAlgorithmException | NoSuchProviderException e5) {
            Logger.e("AppUtils", "Failed to get callerId for " + str, e5);
            return null;
        }
    }

    public static Signature getSignature(Context context, String str) {
        Signature signature;
        if (str == null) {
            str = context.getPackageName();
        }
        if (str.equals(context.getPackageName()) && (signature = f63425a) != null) {
            return signature;
        }
        try {
            Signature[] signatureArr = context.getPackageManager().getPackageInfo(str, 64).signatures;
            if (signatureArr.length != 0) {
                return signatureArr[0];
            }
            return null;
        } catch (PackageManager.NameNotFoundException e5) {
            Logger.e("AppUtils", "Failed to get signature for " + context.getPackageName(), e5);
            return null;
        }
    }

    public static void setSignature(String str) {
        if (str == null) {
            f63425a = null;
        } else {
            f63425a = new Signature(str);
        }
        Logger.i("AppUtils", "setSignature " + str);
    }

    public static void setSignature(Signature signature) {
        f63425a = signature;
        Logger.i("AppUtils", "setSignature " + signature);
    }
}
