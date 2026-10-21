package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class AFb1lSDK implements AFb1iSDK {

    @NotNull
    private final AFb1uSDK AFInAppEventType;

    @NotNull
    private final AFf1tSDK AFKeystoreWrapper;

    @NotNull
    private final Executor valueOf;

    @Nullable
    private AFb1kSDK values;

    public AFb1lSDK(@NotNull Executor executor, @NotNull AFb1uSDK aFb1uSDK, @NotNull AFf1tSDK aFf1tSDK) {
        Intrinsics.checkNotNullParameter(executor, "");
        Intrinsics.checkNotNullParameter(aFb1uSDK, "");
        Intrinsics.checkNotNullParameter(aFf1tSDK, "");
        this.valueOf = executor;
        this.AFInAppEventType = aFb1uSDK;
        this.AFKeystoreWrapper = aFf1tSDK;
    }

    @Override // com.appsflyer.internal.AFb1iSDK
    public final void AFInAppEventParameterName(@NotNull Context context, @NotNull AFb1iSDK.AFa1wSDK aFa1wSDK) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(aFa1wSDK, "");
        Intrinsics.checkNotNullParameter(context, "");
        if (this.values != null) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.app.Application");
            }
            ((Application) applicationContext).unregisterActivityLifecycleCallbacks(this.values);
        }
        this.values = null;
        AFb1kSDK aFb1kSDK = new AFb1kSDK(this.valueOf, this.AFInAppEventType, this.AFKeystoreWrapper, aFa1wSDK);
        this.values = aFb1kSDK;
        if (context instanceof Activity) {
            aFb1kSDK.onActivityResumed((Activity) context);
        }
        Context applicationContext2 = context.getApplicationContext();
        if (applicationContext2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.app.Application");
        }
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(this.values);
    }

    @Override // com.appsflyer.internal.AFb1iSDK
    public final boolean AFKeystoreWrapper() {
        return this.values != null;
    }

    @Override // com.appsflyer.internal.AFb1iSDK
    public final void valueOf(@NotNull Context context) {
        AFb1iSDK.AFa1wSDK aFa1wSDK;
        Intrinsics.checkNotNullParameter(context, "");
        AFb1kSDK aFb1kSDK = this.values;
        if (aFb1kSDK == null || (aFa1wSDK = aFb1kSDK.values) == null) {
            return;
        }
        aFa1wSDK.AFKeystoreWrapper(context);
    }
}
