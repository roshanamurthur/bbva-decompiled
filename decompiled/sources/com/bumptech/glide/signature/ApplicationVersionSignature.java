package com.bumptech.glide.signature;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.Key;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes9.dex */
public final class ApplicationVersionSignature {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap f38886a = new ConcurrentHashMap();

    @NonNull
    public static Key obtain(@NonNull Context context) {
        PackageInfo packageInfo;
        String packageName = context.getPackageName();
        ConcurrentHashMap concurrentHashMap = f38886a;
        Key key = (Key) concurrentHashMap.get(packageName);
        if (key != null) {
            return key;
        }
        try {
            packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException unused) {
            context.getPackageName();
            packageInfo = null;
        }
        ObjectKey objectKey = new ObjectKey(packageInfo != null ? String.valueOf(packageInfo.versionCode) : UUID.randomUUID().toString());
        Key key2 = (Key) concurrentHashMap.putIfAbsent(packageName, objectKey);
        return key2 == null ? objectKey : key2;
    }
}
