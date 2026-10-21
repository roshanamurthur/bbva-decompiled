package com.huawei.hms.feature.dynamicinstall;

import android.app.Application;
import android.content.Context;

/* JADX INFO: loaded from: classes10.dex */
public class b extends Application {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f50238a = "b";

    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        FeatureCompat.install(context);
    }
}
