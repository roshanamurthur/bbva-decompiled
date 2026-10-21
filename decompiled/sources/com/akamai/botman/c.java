package com.akamai.botman;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f26315p0 = 0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f26316q0 = 0;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        ap.a("LifecycleCallbacks", "Activity Created: " + activity.getLocalClassName(), new Throwable[0]);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        ap.a("LifecycleCallbacks", "Activity Destroyed: " + activity.getLocalClassName(), new Throwable[0]);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        ap.a("LifecycleCallbacks", "Activity Paused: " + activity.getLocalClassName(), new Throwable[0]);
        int i10 = this.f26315p0 + (-1);
        this.f26315p0 = i10;
        if (i10 == 0) {
            com.cyberfend.cyfsecurity.CYFMonitor.a();
            com.cyberfend.cyfsecurity.CYFMonitor.a(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        ap.a("LifecycleCallbacks", "Activity Resumed:" + activity.getLocalClassName(), new Throwable[0]);
        if (this.f26315p0 == 0) {
            com.cyberfend.cyfsecurity.CYFMonitor.a(activity);
            com.cyberfend.cyfsecurity.CYFMonitor.a(true);
        }
        this.f26315p0++;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.f26316q0 == 0) {
            com.cyberfend.cyfsecurity.CYFMonitor.a(activity.getApplication());
        }
        this.f26316q0++;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        this.f26316q0--;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
