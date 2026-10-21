package com.huawei.hms.feature.utils;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import com.huawei.secure.android.common.util.SafeString;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f50580a = "a";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f50581b = "lib";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f50582c = "!";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f50583d = "arm64-v8a";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f50584e = "armeabi-v7a";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f50585f = "armeabi";

    public static String a(Context context, String str, int i10) {
        StringBuilder sbE;
        String str2;
        String str3;
        if (Build.VERSION.SDK_INT <= 23) {
            Iterator<String> it = a(context).iterator();
            while (it.hasNext()) {
                StringBuilder sb2 = new StringBuilder();
                String str4 = File.separator;
                sb2.append(SafeString.substring(str, 0, str.lastIndexOf(str4)));
                sb2.append(str4);
                sb2.append(it.next());
                String string = sb2.toString();
                if (new File(string).exists()) {
                    return string;
                }
            }
            return null;
        }
        if (b(context)) {
            sbE = androidx.camera.core.processing.f.e(str, "!");
            str2 = File.separator;
            str3 = f50583d;
        } else if (i10 == 1) {
            sbE = androidx.camera.core.processing.f.e(str, "!");
            str2 = File.separator;
            str3 = f50585f;
        } else {
            sbE = androidx.camera.core.processing.f.e(str, "!");
            str2 = File.separator;
            str3 = f50584e;
        }
        return androidx.camera.core.impl.utils.c.b(sbE, str2, f50581b, str2, str3);
    }

    public static boolean b(Context context) {
        if (context == null) {
            Logger.e(f50580a, "Null context, please check it.");
            return false;
        }
        if (context.getApplicationContext() != null) {
            context.getApplicationContext();
        }
        return Process.is64Bit();
    }

    public static ArrayList<String> a(Context context) {
        ArrayList<String> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, b(context) ? Build.SUPPORTED_64_BIT_ABIS : Build.SUPPORTED_32_BIT_ABIS);
        return arrayList;
    }
}
