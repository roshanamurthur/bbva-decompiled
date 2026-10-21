package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.appsflyer.AFLogger;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
final class AFb1kSDK implements Application.ActivityLifecycleCallbacks {

    @NotNull
    private final AFf1tSDK AFInAppEventParameterName;

    @NotNull
    private final AFb1uSDK AFInAppEventType;

    @NotNull
    private final Executor AFKeystoreWrapper;
    private boolean afDebugLog;
    boolean valueOf;

    @NotNull
    final AFb1iSDK.AFa1wSDK values;

    public static final class AFa1zSDK extends TimerTask {
        private /* synthetic */ Context AFKeystoreWrapper;

        public AFa1zSDK(Context context) {
            this.AFKeystoreWrapper = context;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            if (AFb1kSDK.this.valueOf && AFb1kSDK.this.afDebugLog) {
                AFb1kSDK aFb1kSDK = AFb1kSDK.this;
                aFb1kSDK.valueOf = false;
                try {
                    AFb1iSDK.AFa1wSDK aFa1wSDK = aFb1kSDK.values;
                    Context context = this.AFKeystoreWrapper;
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    aFa1wSDK.AFKeystoreWrapper(context);
                } catch (Exception e5) {
                    AFLogger.afErrorLog("Listener threw exception! ", e5);
                }
            }
        }
    }

    public AFb1kSDK(@NotNull Executor executor, @NotNull AFb1uSDK aFb1uSDK, @NotNull AFf1tSDK aFf1tSDK, @NotNull AFb1iSDK.AFa1wSDK aFa1wSDK) {
        Intrinsics.checkNotNullParameter(executor, "");
        Intrinsics.checkNotNullParameter(aFb1uSDK, "");
        Intrinsics.checkNotNullParameter(aFf1tSDK, "");
        Intrinsics.checkNotNullParameter(aFa1wSDK, "");
        this.AFKeystoreWrapper = executor;
        this.AFInAppEventType = aFb1uSDK;
        this.AFInAppEventParameterName = aFf1tSDK;
        this.values = aFa1wSDK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AFInAppEventParameterName(AFb1kSDK aFb1kSDK, Activity activity) {
        Intrinsics.checkNotNullParameter(aFb1kSDK, "");
        Intrinsics.checkNotNullParameter(activity, "");
        if (!aFb1kSDK.valueOf) {
            try {
                aFb1kSDK.values.values(activity);
            } catch (Exception e5) {
                AFLogger.afErrorLog("Listener thrown an exception: ", e5, true);
            }
        }
        aFb1kSDK.afDebugLog = false;
        aFb1kSDK.valueOf = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void values(AFb1kSDK aFb1kSDK, Activity activity) {
        Intrinsics.checkNotNullParameter(aFb1kSDK, "");
        Intrinsics.checkNotNullParameter(activity, "");
        AFb1uSDK aFb1uSDK = aFb1kSDK.AFInAppEventType;
        Intent intent = activity.getIntent();
        if (((intent == null || !"android.intent.action.VIEW".equals(intent.getAction())) ? null : intent.getData()) != null && intent != AFb1uSDK.AFInAppEventType) {
            AFb1uSDK.AFInAppEventType = intent;
        }
        aFb1kSDK.AFInAppEventParameterName.values(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(@NotNull final Activity activity, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "");
        this.AFKeystoreWrapper.execute(new Runnable() { // from class: com.appsflyer.internal.c
            @Override // java.lang.Runnable
            public final void run() {
                AFb1kSDK.values(this.f26398p0, activity);
            }
        });
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(@NotNull final Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        this.AFKeystoreWrapper.execute(new Runnable() { // from class: com.appsflyer.internal.d
            @Override // java.lang.Runnable
            public final void run() {
                AFb1kSDK.AFKeystoreWrapper(this.f26400p0, activity);
            }
        });
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(@NotNull final Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        this.AFKeystoreWrapper.execute(new Runnable() { // from class: com.appsflyer.internal.e
            @Override // java.lang.Runnable
            public final void run() {
                AFb1kSDK.AFInAppEventParameterName(this.f26402p0, activity);
            }
        });
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(bundle, "");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AFKeystoreWrapper(AFb1kSDK aFb1kSDK, Activity activity) {
        Intrinsics.checkNotNullParameter(aFb1kSDK, "");
        Intrinsics.checkNotNullParameter(activity, "");
        aFb1kSDK.afDebugLog = true;
        Context applicationContext = activity.getApplicationContext();
        try {
            Timer timer = new Timer();
            AFa1zSDK aFa1zSDK = aFb1kSDK.new AFa1zSDK(applicationContext);
            AFb1iSDK.Companion companion = AFb1iSDK.INSTANCE;
            timer.schedule(aFa1zSDK, AFb1iSDK.Companion.valueOf());
        } catch (Throwable th2) {
            AFLogger.afErrorLog("Background task failed with a throwable: ", th2);
        }
    }
}
