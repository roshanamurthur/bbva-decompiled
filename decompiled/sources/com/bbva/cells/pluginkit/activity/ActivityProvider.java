package com.bbva.cells.pluginkit.activity;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ActivityProvider.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J-\u0010\f\u001a\u00020\u00042%\u0010\u000b\u001a!\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u00040\u0007j\u0002`\nJ\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001a\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u000fH\u0016R$\u0010\u001c\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Lcom/bbva/cells/pluginkit/activity/ActivityProvider;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "Landroid/app/Activity;", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "", "onActivityStarted", "onActivityDestroyed", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "Lcom/bbva/cells/pluginkit/activity/OnNewActivity;", "callback", "onNewActivityStarted", "onActivityPaused", "onActivityResumed", "Landroid/os/Bundle;", "outState", "onActivitySaveInstanceState", "onActivityStopped", "savedInstanceState", "onActivityCreated", "Lcom/bbva/cells/pluginkit/activity/ActivityWeakReference;", "p0", "Lcom/bbva/cells/pluginkit/activity/ActivityWeakReference;", "getCurrent", "()Lcom/bbva/cells/pluginkit/activity/ActivityWeakReference;", "setCurrent", "(Lcom/bbva/cells/pluginkit/activity/ActivityWeakReference;)V", "current", "<init>", "()V", "pluginkit_release"}, k = 1, mv = {1, 4, 1})
public final class ActivityProvider implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public ActivityWeakReference current;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public Function1<? super Activity, Unit> f26803q0;

    @Nullable
    public final ActivityWeakReference getCurrent() {
        return this.current;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@NotNull Activity activity) {
        ActivityWeakReference activityWeakReference;
        Intrinsics.checkNotNullParameter(activity, "activity");
        ActivityWeakReference activityWeakReference2 = this.current;
        if ((activityWeakReference2 != null ? activityWeakReference2.get() : null) != activity || (activityWeakReference = this.current) == null) {
            return;
        }
        activityWeakReference.clear();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.current = new ActivityWeakReference(activity);
        Function1<? super Activity, Unit> function1 = this.f26803q0;
        if (function1 != null) {
            function1.invoke(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    public final void onNewActivityStarted(@NotNull Function1<? super Activity, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f26803q0 = callback;
    }

    public final void setCurrent(@Nullable ActivityWeakReference activityWeakReference) {
        this.current = activityWeakReference;
    }
}
