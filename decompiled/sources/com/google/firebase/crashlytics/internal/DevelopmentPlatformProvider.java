package com.google.firebase.crashlytics.internal;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes10.dex */
public class DevelopmentPlatformProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f47699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public a f47700b = null;

    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final String f47701a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final String f47702b;

        public a(DevelopmentPlatformProvider developmentPlatformProvider) {
            int resourcesIdentifier = CommonUtils.getResourcesIdentifier(developmentPlatformProvider.f47699a, "com.google.firebase.crashlytics.unity_version", "string");
            Context context = developmentPlatformProvider.f47699a;
            if (resourcesIdentifier != 0) {
                this.f47701a = "Unity";
                String string = context.getResources().getString(resourcesIdentifier);
                this.f47702b = string;
                Logger.getLogger().v("Unity Editor version is: " + string);
                return;
            }
            if (context.getAssets() != null) {
                try {
                    InputStream inputStreamOpen = context.getAssets().open("flutter_assets/NOTICES.Z");
                    if (inputStreamOpen != null) {
                        inputStreamOpen.close();
                    }
                    this.f47701a = "Flutter";
                    this.f47702b = null;
                    Logger.getLogger().v("Development platform is: Flutter");
                    return;
                } catch (IOException unused) {
                }
            }
            this.f47701a = null;
            this.f47702b = null;
        }
    }

    public DevelopmentPlatformProvider(Context context) {
        this.f47699a = context;
    }

    public static boolean isUnity(Context context) {
        return CommonUtils.getResourcesIdentifier(context, "com.google.firebase.crashlytics.unity_version", "string") != 0;
    }

    @Nullable
    public String getDevelopmentPlatform() {
        if (this.f47700b == null) {
            this.f47700b = new a(this);
        }
        return this.f47700b.f47701a;
    }

    @Nullable
    public String getDevelopmentPlatformVersion() {
        if (this.f47700b == null) {
            this.f47700b = new a(this);
        }
        return this.f47700b.f47702b;
    }
}
