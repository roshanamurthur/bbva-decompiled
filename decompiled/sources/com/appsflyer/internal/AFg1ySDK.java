package com.appsflyer.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class AFg1ySDK {
    public final WeakReference<Context> AFInAppEventParameterName;
    public String valueOf;

    public AFg1ySDK(@NonNull Context context) {
        this.AFInAppEventParameterName = new WeakReference<>(context);
    }
}
