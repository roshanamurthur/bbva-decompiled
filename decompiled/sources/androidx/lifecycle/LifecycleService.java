package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.CallSuper;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LifecycleService.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0004\u001a\u00020\u0003H\u0017J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0017J\u001a\u0010\u000b\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\n\u001a\u00020\tH\u0017J\"\u0010\r\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0017J\b\u0010\u000e\u001a\u00020\u0003H\u0017R\u0014\u0010\u0012\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Landroidx/lifecycle/LifecycleService;", "Landroid/app/Service;", "Landroidx/lifecycle/LifecycleOwner;", "", "onCreate", "Landroid/content/Intent;", "intent", "Landroid/os/IBinder;", "onBind", "", "startId", "onStart", "flags", "onStartCommand", "onDestroy", "Landroidx/lifecycle/Lifecycle;", "getLifecycle", "()Landroidx/lifecycle/Lifecycle;", "lifecycle", "<init>", "()V", "lifecycle-service_release"}, k = 1, mv = {1, 8, 0})
public class LifecycleService extends Service implements LifecycleOwner {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final ServiceLifecycleDispatcher f21915p0 = new ServiceLifecycleDispatcher(this);

    @Override // androidx.lifecycle.LifecycleOwner
    @NotNull
    public Lifecycle getLifecycle() {
        return this.f21915p0.getLifecycle();
    }

    @Override // android.app.Service
    @CallSuper
    @Nullable
    public IBinder onBind(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        this.f21915p0.onServicePreSuperOnBind();
        return null;
    }

    @Override // android.app.Service
    @CallSuper
    public void onCreate() {
        this.f21915p0.onServicePreSuperOnCreate();
        super.onCreate();
    }

    @Override // android.app.Service
    @CallSuper
    public void onDestroy() {
        this.f21915p0.onServicePreSuperOnDestroy();
        super.onDestroy();
    }

    @Override // android.app.Service
    @Deprecated(message = "Deprecated in Java")
    @CallSuper
    public void onStart(@Nullable Intent intent, int startId) {
        this.f21915p0.onServicePreSuperOnStart();
        super.onStart(intent, startId);
    }

    @Override // android.app.Service
    @CallSuper
    public int onStartCommand(@Nullable Intent intent, int flags, int startId) {
        return super.onStartCommand(intent, flags, startId);
    }
}
