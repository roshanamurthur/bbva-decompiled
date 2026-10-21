package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ProcessLifecycleOwner.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0002\u001b\u001aB\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\r\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\u000f\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u000e\u0010\u0004J\u0017\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001c"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleOwner;", "Landroidx/lifecycle/LifecycleOwner;", "", "activityStarted$lifecycle_process_release", "()V", "activityStarted", "activityResumed$lifecycle_process_release", "activityResumed", "activityPaused$lifecycle_process_release", "activityPaused", "activityStopped$lifecycle_process_release", "activityStopped", "dispatchPauseIfNeeded$lifecycle_process_release", "dispatchPauseIfNeeded", "dispatchStopIfNeeded$lifecycle_process_release", "dispatchStopIfNeeded", "Landroid/content/Context;", "context", "attach$lifecycle_process_release", "(Landroid/content/Context;)V", "attach", "Landroidx/lifecycle/Lifecycle;", "getLifecycle", "()Landroidx/lifecycle/Lifecycle;", "lifecycle", "<init>", "Companion", "Api29Impl", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0})
public final class ProcessLifecycleOwner implements LifecycleOwner {
    public static final long TIMEOUT_MS = 700;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f21944p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f21945q0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @Nullable
    public Handler f21948t0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    @NotNull
    public static final ProcessLifecycleOwner f21943x0 = new ProcessLifecycleOwner();

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f21946r0 = true;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f21947s0 = true;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @NotNull
    public final LifecycleRegistry f21949u0 = new LifecycleRegistry(this);

    @NotNull
    public final k v0 = new k(this, 0);

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    @NotNull
    public final ProcessLifecycleOwner$initializationListener$1 f21950w0 = new ReportFragment.ActivityInitializationListener() { // from class: androidx.lifecycle.ProcessLifecycleOwner$initializationListener$1
        @Override // androidx.lifecycle.ReportFragment.ActivityInitializationListener
        public void onResume() {
            this.f21951a.activityResumed$lifecycle_process_release();
        }

        @Override // androidx.lifecycle.ReportFragment.ActivityInitializationListener
        public void onStart() {
            this.f21951a.activityStarted$lifecycle_process_release();
        }

        @Override // androidx.lifecycle.ReportFragment.ActivityInitializationListener
        public void onCreate() {
        }
    };

    /* JADX INFO: compiled from: ProcessLifecycleOwner.kt */
    @RequiresApi(29)
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleOwner$Api29Impl;", "", "()V", "registerActivityLifecycleCallbacks", "", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "Landroid/app/Activity;", "callback", "Landroid/app/Application$ActivityLifecycleCallbacks;", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Api29Impl {

        @NotNull
        public static final Api29Impl INSTANCE = new Api29Impl();

        @JvmStatic
        @DoNotInline
        public static final void registerActivityLifecycleCallbacks(@NotNull Activity activity, @NotNull Application.ActivityLifecycleCallbacks callback) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(callback, "callback");
            activity.registerActivityLifecycleCallbacks(callback);
        }
    }

    @JvmStatic
    @NotNull
    public static final LifecycleOwner get() {
        return INSTANCE.get();
    }

    public final void activityPaused$lifecycle_process_release() {
        int i10 = this.f21945q0 - 1;
        this.f21945q0 = i10;
        if (i10 == 0) {
            Handler handler = this.f21948t0;
            Intrinsics.checkNotNull(handler);
            handler.postDelayed(this.v0, 700L);
        }
    }

    public final void activityResumed$lifecycle_process_release() {
        int i10 = this.f21945q0 + 1;
        this.f21945q0 = i10;
        if (i10 == 1) {
            if (this.f21946r0) {
                this.f21949u0.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
                this.f21946r0 = false;
            } else {
                Handler handler = this.f21948t0;
                Intrinsics.checkNotNull(handler);
                handler.removeCallbacks(this.v0);
            }
        }
    }

    public final void activityStarted$lifecycle_process_release() {
        int i10 = this.f21944p0 + 1;
        this.f21944p0 = i10;
        if (i10 == 1 && this.f21947s0) {
            this.f21949u0.handleLifecycleEvent(Lifecycle.Event.ON_START);
            this.f21947s0 = false;
        }
    }

    public final void activityStopped$lifecycle_process_release() {
        this.f21944p0--;
        dispatchStopIfNeeded$lifecycle_process_release();
    }

    public final void attach$lifecycle_process_release(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f21948t0 = new Handler();
        this.f21949u0.handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new EmptyActivityLifecycleCallbacks() { // from class: androidx.lifecycle.ProcessLifecycleOwner$attach$1
            @Override // androidx.lifecycle.EmptyActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle savedInstanceState) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                if (Build.VERSION.SDK_INT < 29) {
                    ReportFragment.INSTANCE.get(activity).setProcessListener(this.this$0.f21950w0);
                }
            }

            @Override // androidx.lifecycle.EmptyActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPaused(@NotNull Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                this.this$0.activityPaused$lifecycle_process_release();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            @RequiresApi(29)
            public void onActivityPreCreated(@NotNull Activity activity, @Nullable Bundle savedInstanceState) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                final ProcessLifecycleOwner processLifecycleOwner = this.this$0;
                ProcessLifecycleOwner.Api29Impl.registerActivityLifecycleCallbacks(activity, new EmptyActivityLifecycleCallbacks() { // from class: androidx.lifecycle.ProcessLifecycleOwner$attach$1$onActivityPreCreated$1
                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityPostResumed(@NotNull Activity activity2) {
                        Intrinsics.checkNotNullParameter(activity2, "activity");
                        processLifecycleOwner.activityResumed$lifecycle_process_release();
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityPostStarted(@NotNull Activity activity2) {
                        Intrinsics.checkNotNullParameter(activity2, "activity");
                        processLifecycleOwner.activityStarted$lifecycle_process_release();
                    }
                });
            }

            @Override // androidx.lifecycle.EmptyActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStopped(@NotNull Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                this.this$0.activityStopped$lifecycle_process_release();
            }
        });
    }

    public final void dispatchPauseIfNeeded$lifecycle_process_release() {
        if (this.f21945q0 == 0) {
            this.f21946r0 = true;
            this.f21949u0.handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
        }
    }

    public final void dispatchStopIfNeeded$lifecycle_process_release() {
        if (this.f21944p0 == 0 && this.f21946r0) {
            this.f21949u0.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
            this.f21947s0 = true;
        }
    }

    @Override // androidx.lifecycle.LifecycleOwner
    @NotNull
    public Lifecycle getLifecycle() {
        return this.f21949u0;
    }

    /* JADX INFO: compiled from: ProcessLifecycleOwner.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\b\u001a\u00020\tH\u0007J\u0015\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0001¢\u0006\u0002\b\u000eR\u0016\u0010\u0003\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleOwner$Companion;", "", "()V", "TIMEOUT_MS", "", "getTIMEOUT_MS$lifecycle_process_release$annotations", "newInstance", "Landroidx/lifecycle/ProcessLifecycleOwner;", "get", "Landroidx/lifecycle/LifecycleOwner;", "init", "", "context", "Landroid/content/Context;", "init$lifecycle_process_release", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final LifecycleOwner get() {
            return ProcessLifecycleOwner.f21943x0;
        }

        @JvmStatic
        public final void init$lifecycle_process_release(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            ProcessLifecycleOwner.f21943x0.attach$lifecycle_process_release(context);
        }

        @VisibleForTesting
        public static /* synthetic */ void getTIMEOUT_MS$lifecycle_process_release$annotations() {
        }
    }
}
