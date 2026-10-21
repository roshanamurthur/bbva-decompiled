package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: MultiInstanceInvalidationService.kt */
/* JADX INFO: loaded from: classes2.dex */
@ExperimentalRoomApi
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\"\u0010\r\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR&\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000f0\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Landroidx/room/MultiInstanceInvalidationService;", "Landroid/app/Service;", "Landroid/content/Intent;", "intent", "Landroid/os/IBinder;", "onBind", "", "p0", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getMaxClientId$room_runtime_release", "()I", "setMaxClientId$room_runtime_release", "(I)V", "maxClientId", "", "", "q0", "Ljava/util/Map;", "getClientNames$room_runtime_release", "()Ljava/util/Map;", "clientNames", "Landroid/os/RemoteCallbackList;", "Landroidx/room/IMultiInstanceInvalidationCallback;", "r0", "Landroid/os/RemoteCallbackList;", "getCallbackList$room_runtime_release", "()Landroid/os/RemoteCallbackList;", "callbackList", "<init>", "()V", "room-runtime_release"}, k = 1, mv = {1, 8, 0})
public final class MultiInstanceInvalidationService extends Service {

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    public int maxClientId;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f23247q0 = new LinkedHashMap();

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final MultiInstanceInvalidationService$callbackList$1 f23248r0 = new RemoteCallbackList<IMultiInstanceInvalidationCallback>() { // from class: androidx.room.MultiInstanceInvalidationService$callbackList$1
        @Override // android.os.RemoteCallbackList
        public void onCallbackDied(@NotNull IMultiInstanceInvalidationCallback callback, @NotNull Object cookie) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            Intrinsics.checkNotNullParameter(cookie, "cookie");
            this.f23251a.getClientNames$room_runtime_release().remove((Integer) cookie);
        }
    };

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public final MultiInstanceInvalidationService$binder$1 f23249s0 = new IMultiInstanceInvalidationService.Stub() { // from class: androidx.room.MultiInstanceInvalidationService$binder$1
        @Override // androidx.room.IMultiInstanceInvalidationService
        public void broadcastInvalidation(int clientId, @NotNull String[] tables) {
            Intrinsics.checkNotNullParameter(tables, "tables");
            RemoteCallbackList<IMultiInstanceInvalidationCallback> callbackList$room_runtime_release = this.f23250e.getCallbackList$room_runtime_release();
            MultiInstanceInvalidationService multiInstanceInvalidationService = this.f23250e;
            synchronized (callbackList$room_runtime_release) {
                String str = multiInstanceInvalidationService.getClientNames$room_runtime_release().get(Integer.valueOf(clientId));
                if (str == null) {
                    Log.w(Room.LOG_TAG, "Remote invalidation client ID not registered");
                    return;
                }
                int iBeginBroadcast = multiInstanceInvalidationService.getCallbackList$room_runtime_release().beginBroadcast();
                for (int i10 = 0; i10 < iBeginBroadcast; i10++) {
                    try {
                        Object broadcastCookie = multiInstanceInvalidationService.getCallbackList$room_runtime_release().getBroadcastCookie(i10);
                        Intrinsics.checkNotNull(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                        int iIntValue = ((Integer) broadcastCookie).intValue();
                        String str2 = multiInstanceInvalidationService.getClientNames$room_runtime_release().get(Integer.valueOf(iIntValue));
                        if (clientId != iIntValue && Intrinsics.areEqual(str, str2)) {
                            try {
                                ((IMultiInstanceInvalidationCallback) multiInstanceInvalidationService.getCallbackList$room_runtime_release().getBroadcastItem(i10)).onInvalidation(tables);
                            } catch (RemoteException e5) {
                                Log.w(Room.LOG_TAG, "Error invoking a remote callback", e5);
                            }
                        }
                    } catch (Throwable th2) {
                        multiInstanceInvalidationService.getCallbackList$room_runtime_release().finishBroadcast();
                        throw th2;
                    }
                }
                multiInstanceInvalidationService.getCallbackList$room_runtime_release().finishBroadcast();
                Unit unit = Unit.INSTANCE;
            }
        }

        @Override // androidx.room.IMultiInstanceInvalidationService
        public int registerCallback(@NotNull IMultiInstanceInvalidationCallback callback, @Nullable String name) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            int i10 = 0;
            if (name == null) {
                return 0;
            }
            RemoteCallbackList<IMultiInstanceInvalidationCallback> callbackList$room_runtime_release = this.f23250e.getCallbackList$room_runtime_release();
            MultiInstanceInvalidationService multiInstanceInvalidationService = this.f23250e;
            synchronized (callbackList$room_runtime_release) {
                try {
                    multiInstanceInvalidationService.setMaxClientId$room_runtime_release(multiInstanceInvalidationService.getMaxClientId() + 1);
                    int maxClientId = multiInstanceInvalidationService.getMaxClientId();
                    if (multiInstanceInvalidationService.getCallbackList$room_runtime_release().register(callback, Integer.valueOf(maxClientId))) {
                        multiInstanceInvalidationService.getClientNames$room_runtime_release().put(Integer.valueOf(maxClientId), name);
                        i10 = maxClientId;
                    } else {
                        multiInstanceInvalidationService.setMaxClientId$room_runtime_release(multiInstanceInvalidationService.getMaxClientId() - 1);
                        multiInstanceInvalidationService.getMaxClientId();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return i10;
        }

        @Override // androidx.room.IMultiInstanceInvalidationService
        public void unregisterCallback(@NotNull IMultiInstanceInvalidationCallback callback, int clientId) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            RemoteCallbackList<IMultiInstanceInvalidationCallback> callbackList$room_runtime_release = this.f23250e.getCallbackList$room_runtime_release();
            MultiInstanceInvalidationService multiInstanceInvalidationService = this.f23250e;
            synchronized (callbackList$room_runtime_release) {
                multiInstanceInvalidationService.getCallbackList$room_runtime_release().unregister(callback);
                multiInstanceInvalidationService.getClientNames$room_runtime_release().remove(Integer.valueOf(clientId));
            }
        }
    };

    @NotNull
    public final RemoteCallbackList<IMultiInstanceInvalidationCallback> getCallbackList$room_runtime_release() {
        return this.f23248r0;
    }

    @NotNull
    public final Map<Integer, String> getClientNames$room_runtime_release() {
        return this.f23247q0;
    }

    /* JADX INFO: renamed from: getMaxClientId$room_runtime_release, reason: from getter */
    public final int getMaxClientId() {
        return this.maxClientId;
    }

    @Override // android.app.Service
    @NotNull
    public IBinder onBind(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        return this.f23249s0;
    }

    public final void setMaxClientId$room_runtime_release(int i10) {
        this.maxClientId = i10;
    }
}
