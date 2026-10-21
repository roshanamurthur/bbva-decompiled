package com.salesforce.marketingcloud.sfmcsdk.components.behaviors;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.c;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.salesforce.marketingcloud.sfmcsdk.components.logging.SFMCSdkLogger;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LifecycleListener.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u001d2\u00020\u00012\u00020\u0002:\u0001\u001dB\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u001a\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0013\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0014\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0015\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0011H\u0016J\u0010\u0010\u0017\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0018\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u001bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u001e"}, d2 = {"Lcom/salesforce/marketingcloud/sfmcsdk/components/behaviors/LifecycleListener;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "inForeground", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getInForeground", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "setInForeground", "(Ljava/util/concurrent/atomic/AtomicBoolean;)V", "onActivityCreated", "", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "Landroid/app/Activity;", "savedInstanceState", "Landroid/os/Bundle;", "onActivityDestroyed", "onActivityPaused", "onActivityResumed", "onActivitySaveInstanceState", "outState", "onActivityStarted", "onActivityStopped", "onStart", "owner", "Landroidx/lifecycle/LifecycleOwner;", "onStop", "Companion", "sfmcsdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class LifecycleListener implements DefaultLifecycleObserver, Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String TAG = "~$LifecycleListener";

    @SuppressLint({"StaticFieldLeak"})
    @Nullable
    private static LifecycleListener instance;

    @NotNull
    private Context context;

    @NotNull
    private AtomicBoolean inForeground;

    /* JADX INFO: compiled from: LifecycleListener.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R \u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0000@\u0000X\u0081\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/salesforce/marketingcloud/sfmcsdk/components/behaviors/LifecycleListener$Companion;", "", "()V", "TAG", "", "instance", "Lcom/salesforce/marketingcloud/sfmcsdk/components/behaviors/LifecycleListener;", "getInstance$sfmcsdk_release", "()Lcom/salesforce/marketingcloud/sfmcsdk/components/behaviors/LifecycleListener;", "setInstance$sfmcsdk_release", "(Lcom/salesforce/marketingcloud/sfmcsdk/components/behaviors/LifecycleListener;)V", "getInstance", "context", "Landroid/content/Context;", "sfmcsdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final LifecycleListener getInstance(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (getInstance$sfmcsdk_release() == null) {
                setInstance$sfmcsdk_release(new LifecycleListener(context, null));
            }
            LifecycleListener instance$sfmcsdk_release = getInstance$sfmcsdk_release();
            if (instance$sfmcsdk_release != null) {
                return instance$sfmcsdk_release;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.salesforce.marketingcloud.sfmcsdk.components.behaviors.LifecycleListener");
        }

        @Nullable
        public final LifecycleListener getInstance$sfmcsdk_release() {
            return LifecycleListener.instance;
        }

        public final void setInstance$sfmcsdk_release(@Nullable LifecycleListener lifecycleListener) {
            LifecycleListener.instance = lifecycleListener;
        }
    }

    public /* synthetic */ LifecycleListener(Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this(context);
    }

    @NotNull
    public final AtomicBoolean getInForeground() {
        return this.inForeground;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
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
        BehaviorManagerImpl.Companion companion = BehaviorManagerImpl.INSTANCE;
        Context context = this.context;
        BehaviorType behaviorType = BehaviorType.SCREEN_ENTRY;
        Bundle bundle = new Bundle();
        bundle.putString("screen_name", Reflection.getOrCreateKotlinClass(activity.getClass()).getSimpleName());
        Unit unit = Unit.INSTANCE;
        companion.notifyBehavior$sfmcsdk_release(context, behaviorType, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        c.a(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
        c.b(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        c.c(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
        c.d(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        c.e(this, owner);
        if (this.inForeground.getAndSet(true)) {
            return;
        }
        SFMCSdkLogger.INSTANCE.d(TAG, new Function0<String>() { // from class: com.salesforce.marketingcloud.sfmcsdk.components.behaviors.LifecycleListener.onStart.1
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                return "Application came into the foreground.";
            }
        });
        BehaviorManagerImpl.INSTANCE.notifyBehavior$sfmcsdk_release(this.context, BehaviorType.APPLICATION_FOREGROUNDED, new Bundle());
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        if (this.inForeground.getAndSet(false)) {
            SFMCSdkLogger.INSTANCE.d(TAG, new Function0<String>() { // from class: com.salesforce.marketingcloud.sfmcsdk.components.behaviors.LifecycleListener.onStop.1
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() {
                    return "Application went into the background.";
                }
            });
            BehaviorManagerImpl.INSTANCE.notifyBehavior$sfmcsdk_release(this.context, BehaviorType.APPLICATION_BACKGROUNDED, new Bundle());
        }
        c.f(this, owner);
    }

    public final void setInForeground(@NotNull AtomicBoolean atomicBoolean) {
        Intrinsics.checkNotNullParameter(atomicBoolean, "<set-?>");
        this.inForeground = atomicBoolean;
    }

    private LifecycleListener(Context context) {
        this.context = context;
        this.inForeground = new AtomicBoolean(false);
    }
}
