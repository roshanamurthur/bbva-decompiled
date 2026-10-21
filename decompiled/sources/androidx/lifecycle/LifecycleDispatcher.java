package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.VisibleForTesting;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LifecycleDispatcher.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\t"}, d2 = {"Landroidx/lifecycle/LifecycleDispatcher;", "", "Landroid/content/Context;", "context", "", "init", "<init>", "()V", "DispatcherActivityCallback", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0})
public final class LifecycleDispatcher {

    @NotNull
    public static final LifecycleDispatcher INSTANCE = new LifecycleDispatcher();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final AtomicBoolean f21898a = new AtomicBoolean(false);

    /* JADX INFO: compiled from: LifecycleDispatcher.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\t"}, d2 = {"Landroidx/lifecycle/LifecycleDispatcher$DispatcherActivityCallback;", "Landroidx/lifecycle/EmptyActivityLifecycleCallbacks;", "()V", "onActivityCreated", "", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "Landroid/app/Activity;", "savedInstanceState", "Landroid/os/Bundle;", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @VisibleForTesting
    public static final class DispatcherActivityCallback extends EmptyActivityLifecycleCallbacks {
        @Override // androidx.lifecycle.EmptyActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle savedInstanceState) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            ReportFragment.INSTANCE.injectIfNeededIn(activity);
        }
    }

    @JvmStatic
    public static final void init(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (f21898a.getAndSet(true)) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new DispatcherActivityCallback());
    }
}
