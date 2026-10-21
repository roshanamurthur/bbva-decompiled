package androidx.lifecycle;

import android.os.Handler;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ServiceLifecycleDispatcher.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016R\u0014\u0010\n\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0010"}, d2 = {"Landroidx/lifecycle/ServiceLifecycleDispatcher;", "", "", "onServicePreSuperOnCreate", "onServicePreSuperOnBind", "onServicePreSuperOnStart", "onServicePreSuperOnDestroy", "Landroidx/lifecycle/Lifecycle;", "getLifecycle", "()Landroidx/lifecycle/Lifecycle;", "lifecycle", "Landroidx/lifecycle/LifecycleOwner;", "provider", "<init>", "(Landroidx/lifecycle/LifecycleOwner;)V", "DispatchRunnable", "lifecycle-service_release"}, k = 1, mv = {1, 8, 0})
public class ServiceLifecycleDispatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final LifecycleRegistry f22005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Handler f22006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public DispatchRunnable f22007c;

    /* JADX INFO: compiled from: ServiceLifecycleDispatcher.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000e"}, d2 = {"Landroidx/lifecycle/ServiceLifecycleDispatcher$DispatchRunnable;", "Ljava/lang/Runnable;", "", "run", "Landroidx/lifecycle/Lifecycle$Event;", "q0", "Landroidx/lifecycle/Lifecycle$Event;", "getEvent", "()Landroidx/lifecycle/Lifecycle$Event;", "event", "Landroidx/lifecycle/LifecycleRegistry;", "registry", "<init>", "(Landroidx/lifecycle/LifecycleRegistry;Landroidx/lifecycle/Lifecycle$Event;)V", "lifecycle-service_release"}, k = 1, mv = {1, 8, 0})
    public static final class DispatchRunnable implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        @NotNull
        public final LifecycleRegistry f22008p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Lifecycle.Event event;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public boolean f22010r0;

        public DispatchRunnable(@NotNull LifecycleRegistry registry, @NotNull Lifecycle.Event event) {
            Intrinsics.checkNotNullParameter(registry, "registry");
            Intrinsics.checkNotNullParameter(event, "event");
            this.f22008p0 = registry;
            this.event = event;
        }

        @NotNull
        public final Lifecycle.Event getEvent() {
            return this.event;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f22010r0) {
                return;
            }
            this.f22008p0.handleLifecycleEvent(this.event);
            this.f22010r0 = true;
        }
    }

    public ServiceLifecycleDispatcher(@NotNull LifecycleOwner provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f22005a = new LifecycleRegistry(provider);
        this.f22006b = new Handler();
    }

    public final void a(Lifecycle.Event event) {
        DispatchRunnable dispatchRunnable = this.f22007c;
        if (dispatchRunnable != null) {
            dispatchRunnable.run();
        }
        DispatchRunnable dispatchRunnable2 = new DispatchRunnable(this.f22005a, event);
        this.f22007c = dispatchRunnable2;
        Handler handler = this.f22006b;
        Intrinsics.checkNotNull(dispatchRunnable2);
        handler.postAtFrontOfQueue(dispatchRunnable2);
    }

    @NotNull
    public Lifecycle getLifecycle() {
        return this.f22005a;
    }

    public void onServicePreSuperOnBind() {
        a(Lifecycle.Event.ON_START);
    }

    public void onServicePreSuperOnCreate() {
        a(Lifecycle.Event.ON_CREATE);
    }

    public void onServicePreSuperOnDestroy() {
        a(Lifecycle.Event.ON_STOP);
        a(Lifecycle.Event.ON_DESTROY);
    }

    public void onServicePreSuperOnStart() {
        a(Lifecycle.Event.ON_START);
    }
}
