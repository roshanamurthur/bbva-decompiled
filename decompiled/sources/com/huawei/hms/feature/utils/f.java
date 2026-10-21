package com.huawei.hms.feature.utils;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import java.io.File;

/* JADX INFO: loaded from: classes10.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f50589a = "f";

    public static String a(Context context) {
        Bundle bundleC = c(context);
        String string = bundleC != null ? bundleC.getString(com.huawei.hms.feature.model.a.f50425a) : "";
        com.huawei.hms.feature.model.a.f50430f = string;
        Logger.d(f50589a, "app from :" + string);
        return string;
    }

    public static PackageInfo b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 128);
        } catch (PackageManager.NameNotFoundException | RuntimeException e5) {
            Logger.w(f50589a, "get package info failed", e5);
            return null;
        }
    }

    public static Bundle c(Context context) {
        ApplicationInfo applicationInfo;
        PackageInfo packageInfoB = b(context);
        if (packageInfoB == null || (applicationInfo = packageInfoB.applicationInfo) == null) {
            return null;
        }
        return applicationInfo.metaData;
    }

    public static String a(File file) {
        int next;
        try {
            AssetManager assetManager = (AssetManager) AssetManager.class.getConstructor(new Class[0]).newInstance(new Object[0]);
            XmlResourceParser xmlResourceParserOpenXmlResourceParser = assetManager.openXmlResourceParser(((Integer) AssetManager.class.getMethod("addAssetPath", String.class).invoke(assetManager, file.getCanonicalPath())).intValue(), "AndroidManifest.xml");
            do {
                next = xmlResourceParserOpenXmlResourceParser.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next != 2) {
                throw new IllegalStateException("No start tag found");
            }
            if (xmlResourceParserOpenXmlResourceParser.getName().equals("manifest")) {
                return xmlResourceParserOpenXmlResourceParser.getAttributeValue(null, "split");
            }
            throw new IllegalStateException("No <manifest> tag");
        } catch (Exception e5) {
            Logger.e(f50589a, e5);
            return null;
        }
    }

    public static boolean a(Context context, boolean z10) {
        ApplicationInfo applicationInfo;
        PackageInfo packageInfoB = b(context);
        if (packageInfoB == null || (applicationInfo = packageInfoB.applicationInfo) == null) {
            return z10;
        }
        return (applicationInfo.flags & 1) != 0;
    }
}
