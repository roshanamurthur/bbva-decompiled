package com.huawei.hms.feature.f;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.hms.feature.f.b.d;
import com.huawei.hms.feature.g.b;
import com.huawei.hms.feature.utils.Logger;
import com.huawei.hms.feature.utils.c;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.security.cert.X509Certificate;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f50263a = "CAVerifyManager";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f50264b = "com.huawei.appgallery.fingerprint_signature";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f50265c = "com.huawei.appgallery.sign_certchain";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f50266d = "AppGallery Verification";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f50267e = "Huawei CBG Cloud Security Signer";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f50268f = "CBG_CA.cer";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f50269g = "UTF-8";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static String f50270h = "com.huawei.appmarket";

    public static String a() {
        return f50270h;
    }

    public static String b(Context context) {
        StringBuilder sb2;
        String str;
        List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(new Intent(b.f50284b), 128);
        if (listQueryIntentServices.size() == 0) {
            Logger.w(f50263a, "queryIntentServices failed, return default hw market pkg name.");
            return f50270h;
        }
        Iterator<ResolveInfo> it = listQueryIntentServices.iterator();
        while (it.hasNext()) {
            ApplicationInfo applicationInfo = it.next().serviceInfo.applicationInfo;
            String str2 = applicationInfo.packageName;
            Bundle bundle = applicationInfo.metaData;
            if (bundle == null) {
                sb2 = new StringBuilder("skip package ");
                sb2.append(str2);
                str = " for metadata is null";
            } else if (!bundle.containsKey(f50264b)) {
                sb2 = new StringBuilder("skip package ");
                sb2.append(str2);
                str = " for no signer";
            } else if (bundle.containsKey(f50265c)) {
                if (a(context, bundle.getString(f50264b), bundle.getString(f50265c), androidx.camera.core.impl.utils.a.b(str2, "&", a(context, str2)))) {
                    Logger.i(f50263a, "Successfully get the hw market package name:" + str2);
                    f50270h = str2;
                    return str2;
                }
                Logger.e(f50263a, "checkSinger failed for " + str2);
            } else {
                sb2 = new StringBuilder("skip package ");
                sb2.append(str2);
                str = " for no cert chain";
            }
            sb2.append(str);
            Logger.w(f50263a, sb2.toString());
        }
        Logger.w(f50263a, "Cannot find hw market, return default pkg name.");
        return f50270h;
    }

    private static byte[] c(Context context) {
        if (context != null) {
            InputStream inputStreamOpen = null;
            try {
                inputStreamOpen = context.getAssets().open(f50268f);
                int iAvailable = inputStreamOpen.available();
                byte[] bArr = new byte[iAvailable];
                if (inputStreamOpen.read(bArr) == iAvailable) {
                    return bArr;
                }
                Logger.w(f50263a, "read bytes abnormal");
                return new byte[0];
            } catch (IOException e5) {
                Logger.e(f50263a, String.format(Locale.ROOT, "Failed to open %s", f50268f), e5);
                return new byte[0];
            } finally {
                c.a(inputStreamOpen);
            }
            c.a(inputStreamOpen);
        }
        Logger.e(f50263a, "readAssetFile args error");
        return new byte[0];
    }

    private static String a(Context context, String str) {
        byte[] bArrB = b(context, str);
        if (bArrB == null || bArrB.length == 0) {
            return null;
        }
        return com.huawei.hms.feature.f.b.b.b(com.huawei.hms.feature.f.b.c.a(bArrB), true);
    }

    private static X509Certificate a(Context context) {
        byte[] bArrC = c(context);
        if (bArrC.length != 0) {
            return d.a(bArrC);
        }
        Logger.e(f50263a, "root cert is invalid.");
        return null;
    }

    private static boolean a(Context context, String str, String str2, String str3) {
        String str4;
        byte[] bytes;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            str4 = "Args is invalid.";
        } else {
            List<X509Certificate> listB = d.b(str2);
            if (listB.size() == 0) {
                str4 = "CertChain is empty.";
            } else if (d.a(a(context), listB)) {
                X509Certificate x509Certificate = listB.get(0);
                if (!d.a(x509Certificate, f50266d)) {
                    str4 = "CN is invalid";
                } else if (d.b(x509Certificate, f50267e)) {
                    try {
                        bytes = str3.getBytes("UTF-8");
                    } catch (UnsupportedEncodingException e5) {
                        Logger.e(f50263a, "checkCertChain UnsupportedEncodingException:", e5);
                        bytes = null;
                    }
                    if (d.a(x509Certificate, bytes, com.huawei.hms.feature.f.b.a.a(str))) {
                        Logger.i(f50263a, "Verify CA fingerprint success.");
                        return true;
                    }
                    str4 = "signature is invalid: ";
                } else {
                    str4 = "OU is invalid";
                }
            } else {
                str4 = "failed to verify cert chain";
            }
        }
        Logger.e(f50263a, str4);
        return false;
    }

    private static byte[] b(Context context, String str) {
        Signature[] signatureArr;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 64);
            if (packageInfo != null && (signatureArr = packageInfo.signatures) != null && signatureArr.length != 0) {
                return signatureArr[0].toByteArray();
            }
            Logger.e(f50263a, "Failed to get signature certificate fingerprint.");
            return new byte[0];
        } catch (PackageManager.NameNotFoundException e5) {
            e = e5;
            Logger.e(f50263a, "package name not found.", e);
            return new byte[0];
        } catch (RuntimeException e7) {
            e = e7;
            Logger.e(f50263a, "package name not found.", e);
            return new byte[0];
        }
    }
}
