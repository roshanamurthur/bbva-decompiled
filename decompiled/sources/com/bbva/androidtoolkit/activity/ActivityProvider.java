package com.bbva.androidtoolkit.activity;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ActivityProvider.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J-\u0010\f\u001a\u00020\u00042%\u0010\u000b\u001a!\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u00040\u0007j\u0002`\nJ\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001a\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u000fH\u0016R$\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lcom/bbva/androidtoolkit/activity/ActivityProvider;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "Landroid/app/Activity;", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "", "onActivityStarted", "onActivityDestroyed", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "Lcom/bbva/androidtoolkit/activity/OnNewActivity;", "callback", "onNewActivityStarted", "onActivityPaused", "onActivityResumed", "Landroid/os/Bundle;", "outState", "onActivitySaveInstanceState", "onActivityStopped", "savedInstanceState", "onActivityCreated", "p0", "Landroid/app/Activity;", "getCurrent", "()Landroid/app/Activity;", "setCurrent", "(Landroid/app/Activity;)V", "current", "<init>", "()V", "toolkit_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nActivityProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityProvider.kt\ncom/bbva/androidtoolkit/activity/ActivityProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,33:1\n1#2:34\n*E\n"})
public final class ActivityProvider implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Activity current;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @Nullable
    public Function1<? super Activity, Unit> f26473q0;

    @Nullable
    public final Activity getCurrent() {
        return this.current;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.current = null;
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
        this.current = activity;
        Function1<? super Activity, Unit> function1 = this.f26473q0;
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
        this.f26473q0 = callback;
    }

    public final void setCurrent(@Nullable Activity activity) {
        this.current = activity;
    }
}
