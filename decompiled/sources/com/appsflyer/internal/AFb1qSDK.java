package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AFb1qSDK<T> {
    public final String AFInAppEventParameterName;
    public final Context AFInAppEventType;
    public final AFc1zSDK AFKeystoreWrapper;
    private final String[] valueOf;
    public final FutureTask<T> values = new FutureTask<>(new Callable<T>() { // from class: com.appsflyer.internal.AFb1qSDK.2
        @Override // java.util.concurrent.Callable
        public final T call() {
            if (AFb1qSDK.this.AFKeystoreWrapper()) {
                return (T) AFb1qSDK.this.AFInAppEventType();
            }
            return null;
        }
    });

    public AFb1qSDK(Context context, AFc1zSDK aFc1zSDK, String str, String... strArr) {
        this.AFInAppEventType = context;
        this.AFInAppEventParameterName = str;
        this.valueOf = strArr;
        this.AFKeystoreWrapper = aFc1zSDK;
    }

    public abstract T AFInAppEventType();

    public final boolean AFKeystoreWrapper() {
        try {
            ProviderInfo providerInfoResolveContentProvider = this.AFInAppEventType.getPackageManager().resolveContentProvider(this.AFInAppEventParameterName, 128);
            return providerInfoResolveContentProvider != null && Arrays.asList(this.valueOf).contains(AFa1cSDK.AFInAppEventType(this.AFInAppEventType.getPackageManager(), ((PackageItemInfo) providerInfoResolveContentProvider).packageName));
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException | CertificateException e5) {
            AFLogger.afErrorLog(e5.getMessage(), e5);
            return false;
        }
    }

    @Nullable
    public T values() {
        try {
            return this.values.get(500L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e5) {
            AFLogger.afErrorLog(e5.getMessage(), e5);
            return null;
        }
    }
}
