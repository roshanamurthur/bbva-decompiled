package androidx.room;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.camera.core.r1;
import androidx.core.app.NotificationCompat;
import com.bbva.component.request.header.customerid.CustomerIdInterceptor;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: MultiInstanceInvalidationClient.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010I\u001a\u00020H\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010K\u001a\u00020J\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\bL\u0010MJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0015\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010\u001f\u001a\u00020\u001e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R$\u0010,\u001a\u0004\u0018\u00010%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0017\u00102\u001a\u00020-8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0017\u00108\u001a\u0002038\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0017\u0010>\u001a\u0002098\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0017\u0010D\u001a\u00020?8\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u0017\u0010G\u001a\u00020?8\u0006¢\u0006\f\n\u0004\bE\u0010A\u001a\u0004\bF\u0010C¨\u0006N"}, d2 = {"Landroidx/room/MultiInstanceInvalidationClient;", "", "", "stop", "", "a", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "Landroidx/room/InvalidationTracker;", "b", "Landroidx/room/InvalidationTracker;", "getInvalidationTracker", "()Landroidx/room/InvalidationTracker;", "invalidationTracker", "Ljava/util/concurrent/Executor;", "c", "Ljava/util/concurrent/Executor;", "getExecutor", "()Ljava/util/concurrent/Executor;", "executor", "", "e", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getClientId", "()I", "setClientId", "(I)V", CustomerIdInterceptor.CLIENT_ID, "Landroidx/room/InvalidationTracker$Observer;", "observer", "Landroidx/room/InvalidationTracker$Observer;", "getObserver", "()Landroidx/room/InvalidationTracker$Observer;", "setObserver", "(Landroidx/room/InvalidationTracker$Observer;)V", "Landroidx/room/IMultiInstanceInvalidationService;", "f", "Landroidx/room/IMultiInstanceInvalidationService;", "getService", "()Landroidx/room/IMultiInstanceInvalidationService;", "setService", "(Landroidx/room/IMultiInstanceInvalidationService;)V", NotificationCompat.CATEGORY_SERVICE, "Landroidx/room/IMultiInstanceInvalidationCallback;", "g", "Landroidx/room/IMultiInstanceInvalidationCallback;", "getCallback", "()Landroidx/room/IMultiInstanceInvalidationCallback;", "callback", "Ljava/util/concurrent/atomic/AtomicBoolean;", "h", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getStopped", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "stopped", "Landroid/content/ServiceConnection;", "i", "Landroid/content/ServiceConnection;", "getServiceConnection", "()Landroid/content/ServiceConnection;", "serviceConnection", "Ljava/lang/Runnable;", "j", "Ljava/lang/Runnable;", "getSetUpRunnable", "()Ljava/lang/Runnable;", "setUpRunnable", "k", "getRemoveObserverRunnable", "removeObserverRunnable", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "serviceIntent", "<init>", "(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;Landroidx/room/InvalidationTracker;Ljava/util/concurrent/Executor;)V", "room-runtime_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMultiInstanceInvalidationClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiInstanceInvalidationClient.kt\nandroidx/room/MultiInstanceInvalidationClient\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,130:1\n37#2,2:131\n*S KotlinDebug\n*F\n+ 1 MultiInstanceInvalidationClient.kt\nandroidx/room/MultiInstanceInvalidationClient\n*L\n95#1:131,2\n*E\n"})
public final class MultiInstanceInvalidationClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final InvalidationTracker invalidationTracker;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Executor executor;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f23234d;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public int clientId;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public IMultiInstanceInvalidationService service;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final MultiInstanceInvalidationClient$callback$1 f23237g;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final AtomicBoolean stopped;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final MultiInstanceInvalidationClient$serviceConnection$1 f23239i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final androidx.camera.camera2.internal.d f23240j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final r1 f23241k;
    public InvalidationTracker.Observer observer;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [android.content.ServiceConnection, androidx.room.MultiInstanceInvalidationClient$serviceConnection$1] */
    public MultiInstanceInvalidationClient(@NotNull Context context, @NotNull String name, @NotNull Intent serviceIntent, @NotNull InvalidationTracker invalidationTracker, @NotNull Executor executor) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(serviceIntent, "serviceIntent");
        Intrinsics.checkNotNullParameter(invalidationTracker, "invalidationTracker");
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.name = name;
        this.invalidationTracker = invalidationTracker;
        this.executor = executor;
        Context applicationContext = context.getApplicationContext();
        this.f23234d = applicationContext;
        this.f23237g = new MultiInstanceInvalidationClient$callback$1(this);
        this.stopped = new AtomicBoolean(false);
        ?? r4 = new ServiceConnection() { // from class: androidx.room.MultiInstanceInvalidationClient$serviceConnection$1
            @Override // android.content.ServiceConnection
            public void onServiceConnected(@NotNull ComponentName name2, @NotNull IBinder service) {
                Intrinsics.checkNotNullParameter(name2, "name");
                Intrinsics.checkNotNullParameter(service, "service");
                IMultiInstanceInvalidationService iMultiInstanceInvalidationServiceAsInterface = IMultiInstanceInvalidationService.Stub.asInterface(service);
                MultiInstanceInvalidationClient multiInstanceInvalidationClient = this.f23245a;
                multiInstanceInvalidationClient.setService(iMultiInstanceInvalidationServiceAsInterface);
                multiInstanceInvalidationClient.getExecutor().execute(multiInstanceInvalidationClient.getSetUpRunnable());
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(@NotNull ComponentName name2) {
                Intrinsics.checkNotNullParameter(name2, "name");
                MultiInstanceInvalidationClient multiInstanceInvalidationClient = this.f23245a;
                multiInstanceInvalidationClient.getExecutor().execute(multiInstanceInvalidationClient.getRemoveObserverRunnable());
                multiInstanceInvalidationClient.setService(null);
            }
        };
        this.f23239i = r4;
        this.f23240j = new androidx.camera.camera2.internal.d(this, 2);
        this.f23241k = new r1(this, 1);
        setObserver(new InvalidationTracker.Observer((String[]) invalidationTracker.getTableIdLookup$room_runtime_release().keySet().toArray(new String[0])) { // from class: androidx.room.MultiInstanceInvalidationClient.1
            @Override // androidx.room.InvalidationTracker.Observer
            public boolean isRemote$room_runtime_release() {
                return true;
            }

            @Override // androidx.room.InvalidationTracker.Observer
            public void onInvalidated(@NotNull Set<String> tables) {
                Intrinsics.checkNotNullParameter(tables, "tables");
                MultiInstanceInvalidationClient multiInstanceInvalidationClient = MultiInstanceInvalidationClient.this;
                if (multiInstanceInvalidationClient.getStopped().get()) {
                    return;
                }
                try {
                    IMultiInstanceInvalidationService service = multiInstanceInvalidationClient.getService();
                    if (service != null) {
                        service.broadcastInvalidation(multiInstanceInvalidationClient.getClientId(), (String[]) tables.toArray(new String[0]));
                    }
                } catch (RemoteException e5) {
                    Log.w(Room.LOG_TAG, "Cannot broadcast invalidation", e5);
                }
            }
        });
        applicationContext.bindService(serviceIntent, (ServiceConnection) r4, 1);
    }

    @NotNull
    public final IMultiInstanceInvalidationCallback getCallback() {
        return this.f23237g;
    }

    public final int getClientId() {
        return this.clientId;
    }

    @NotNull
    public final Executor getExecutor() {
        return this.executor;
    }

    @NotNull
    public final InvalidationTracker getInvalidationTracker() {
        return this.invalidationTracker;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final InvalidationTracker.Observer getObserver() {
        InvalidationTracker.Observer observer = this.observer;
        if (observer != null) {
            return observer;
        }
        Intrinsics.throwUninitializedPropertyAccessException("observer");
        return null;
    }

    @NotNull
    public final Runnable getRemoveObserverRunnable() {
        return this.f23241k;
    }

    @Nullable
    public final IMultiInstanceInvalidationService getService() {
        return this.service;
    }

    @NotNull
    public final ServiceConnection getServiceConnection() {
        return this.f23239i;
    }

    @NotNull
    public final Runnable getSetUpRunnable() {
        return this.f23240j;
    }

    @NotNull
    public final AtomicBoolean getStopped() {
        return this.stopped;
    }

    public final void setClientId(int i10) {
        this.clientId = i10;
    }

    public final void setObserver(@NotNull InvalidationTracker.Observer observer) {
        Intrinsics.checkNotNullParameter(observer, "<set-?>");
        this.observer = observer;
    }

    public final void setService(@Nullable IMultiInstanceInvalidationService iMultiInstanceInvalidationService) {
        this.service = iMultiInstanceInvalidationService;
    }

    public final void stop() {
        if (this.stopped.compareAndSet(false, true)) {
            this.invalidationTracker.removeObserver(getObserver());
            try {
                IMultiInstanceInvalidationService iMultiInstanceInvalidationService = this.service;
                if (iMultiInstanceInvalidationService != null) {
                    iMultiInstanceInvalidationService.unregisterCallback(this.f23237g, this.clientId);
                }
            } catch (RemoteException e5) {
                Log.w(Room.LOG_TAG, "Cannot unregister multi-instance invalidation callback", e5);
            }
            this.f23234d.unbindService(this.f23239i);
        }
    }
}
