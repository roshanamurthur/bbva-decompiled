package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: FcmLifecycleCallbacks.java */
/* JADX INFO: loaded from: classes10.dex */
public final class g implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Set<Intent> f48630p0 = Collections.newSetFromMap(new WeakHashMap());

    public static void a(Intent intent) {
        Bundle bundle = null;
        try {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                bundle = extras.getBundle(Constants.MessageNotificationKeys.ANALYTICS_DATA);
            }
        } catch (RuntimeException e5) {
            Log.w(Constants.TAG, "Failed trying to get analytics data from Intent extras.", e5);
        }
        if (MessagingAnalytics.shouldUploadScionMetrics(bundle)) {
            MessagingAnalytics.logNotificationOpen(bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    @SuppressLint({"ThreadPoolCreation"})
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Intent intent = activity.getIntent();
        if (intent == null || !this.f48630p0.add(intent)) {
            return;
        }
        if (Build.VERSION.SDK_INT <= 25) {
            new Handler(Looper.getMainLooper()).post(new androidx.camera.core.b0(this, intent, 3));
        } else {
            a(intent);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (activity.isFinishing()) {
            this.f48630p0.remove(activity.getIntent());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
