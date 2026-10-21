package com.noknok.android.client.appsdk;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.noknok.android.client.utils.Logger;

/* JADX INFO: loaded from: classes11.dex */
public class MFACInstaller {

    public enum ResultType {
        GENERAL_FAILURE,
        SAMSUNG_STORE_NOT_INSTALLED,
        ALREADY_INSTALLED,
        SETTINGS,
        STORE,
        SNUB
    }

    public ResultType installMFAC(Context context) {
        PackageManager packageManager = context.getPackageManager();
        try {
            if (!"1.0.0.0".equals(packageManager.getPackageInfo("com.noknok.android.framework.service", 1).versionName)) {
                return ResultType.ALREADY_INSTALLED;
            }
            if (packageManager.getApplicationEnabledSetting("com.noknok.android.framework.service") != 0) {
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(Uri.parse("package:com.noknok.android.framework.service"));
                intent.addFlags(335544352);
                context.startActivity(intent);
                return ResultType.SETTINGS;
            }
            Intent intent2 = new Intent();
            intent2.setClassName("com.noknok.android.framework.service", "com.fido.android.framework.ui.MainActivity");
            intent2.addFlags(335544352);
            try {
                context.startActivity(intent2);
                return ResultType.SNUB;
            } catch (ActivityNotFoundException unused) {
                return ResultType.GENERAL_FAILURE;
            }
        } catch (PackageManager.NameNotFoundException unused2) {
            Intent intent3 = new Intent();
            intent3.setData(Uri.parse("samsungapps://ProductDetail/com.noknok.android.framework.service"));
            intent3.addFlags(335544352);
            try {
                context.startActivity(intent3);
                return ResultType.STORE;
            } catch (ActivityNotFoundException unused3) {
                return ResultType.SAMSUNG_STORE_NOT_INSTALLED;
            }
        }
    }

    public boolean isInstalledMFAC(Context context) {
        try {
            return !"1.0.0.0".equals(context.getPackageManager().getPackageInfo("com.noknok.android.framework.service", 1).versionName);
        } catch (PackageManager.NameNotFoundException e5) {
            Logger.e("MFACInstaller", "failed getting package info", e5);
            return false;
        }
    }
}
