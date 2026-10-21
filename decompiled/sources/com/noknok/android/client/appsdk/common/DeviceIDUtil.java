package com.noknok.android.client.appsdk.common;

import android.content.Context;
import android.provider.Settings;
import android.util.Base64;
import androidx.camera.core.impl.utils.c;
import com.noknok.android.client.utils.AppUtils;
import com.noknok.android.client.utils.Charsets;
import com.noknok.android.client.utils.CryptoProviderHelper;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;

/* JADX INFO: loaded from: classes11.dex */
public class DeviceIDUtil {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f62896b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f62897a;

    public DeviceIDUtil(Context context) {
        this.f62897a = context;
    }

    public static void setCustomDeviceID(String str) {
        f62896b = str;
    }

    public String getDeviceId() {
        String str = f62896b;
        if (str != null) {
            return str;
        }
        String string = this.f62897a.getSharedPreferences("AppSDKPreferences", 0).getString("DEVICE_ID", "");
        if (!string.isEmpty()) {
            return string;
        }
        StringBuilder sbD = c.d(Settings.Secure.getString(this.f62897a.getContentResolver(), "android_id"));
        sbD.append(AppUtils.computeFacetID(this.f62897a, null, AppUtils.Algorithm.SHA256));
        String string2 = sbD.toString();
        try {
            MessageDigest messageDigestInstance = CryptoProviderHelper.getMessageDigestInstance("SHA-256");
            messageDigestInstance.update(string2.getBytes(Charsets.utf8Charset));
            String strEncodeToString = Base64.encodeToString(messageDigestInstance.digest(), 11);
            this.f62897a.getSharedPreferences("AppSDKPreferences", 0).edit().putString("DEVICE_ID", strEncodeToString).apply();
            return strEncodeToString;
        } catch (NoSuchAlgorithmException | NoSuchProviderException e5) {
            throw new IllegalStateException("Failed to calculate the Device ID", e5);
        }
    }
}
