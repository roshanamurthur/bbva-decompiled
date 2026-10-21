package androidx.camera.camera2.internal;

import android.os.RemoteException;
import android.util.Log;
import androidx.camera.core.processing.DefaultSurfaceProcessor;
import androidx.room.IMultiInstanceInvalidationService;
import androidx.room.MultiInstanceInvalidationClient;
import androidx.room.Room;
import com.bbva.component.ui.shortcuts.ShortcutItemView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f1885p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f1886q0;

    public /* synthetic */ d(Object obj, int i10) {
        this.f1885p0 = i10;
        this.f1886q0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f1885p0;
        Object obj = this.f1886q0;
        switch (i10) {
            case 0:
                ((Camera2CameraControlImpl) obj).updateSessionConfigSynchronous();
                break;
            case 1:
                ((DefaultSurfaceProcessor) obj).checkReadyToRelease();
                break;
            case 2:
                MultiInstanceInvalidationClient this$0 = (MultiInstanceInvalidationClient) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                try {
                    IMultiInstanceInvalidationService iMultiInstanceInvalidationService = this$0.f23236f;
                    if (iMultiInstanceInvalidationService != null) {
                        this$0.f23235e = iMultiInstanceInvalidationService.registerCallback(this$0.f23237g, this$0.f23231a);
                        this$0.f23232b.addObserver(this$0.getObserver());
                    }
                } catch (RemoteException e5) {
                    Log.w(Room.LOG_TAG, "Cannot register multi-instance invalidation callback", e5);
                    return;
                }
                break;
            default:
                ShortcutItemView.setOnTapListener$lambda$2$lambda$1((ShortcutItemView) obj);
                break;
        }
    }
}
