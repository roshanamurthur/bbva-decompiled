package androidx.camera.camera2.interop;

import android.graphics.Typeface;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.content.res.ResourcesCompat;
import androidx.window.layout.SidecarWindowBackend;
import androidx.window.layout.WindowLayoutInfo;
import com.google.firebase.storage.StorageTask;
import com.google.firebase.storage.ktx.TaskState;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.ChannelsKt;
import kotlinx.coroutines.channels.ProducerScope;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f2036p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f2037q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Object f2038r0;

    public /* synthetic */ g(Object obj, Object obj2, int i10) {
        this.f2036p0 = i10;
        this.f2037q0 = obj;
        this.f2038r0 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f2036p0;
        Object obj = this.f2038r0;
        Object obj2 = this.f2037q0;
        switch (i10) {
            case 0:
                ((Camera2CameraControl) obj2).lambda$clearCaptureRequestOptions$5((CallbackToFutureAdapter.Completer) obj);
                break;
            case 1:
                ((ResourcesCompat.FontCallback) obj2).lambda$callbackSuccessAsync$0((Typeface) obj);
                break;
            case 2:
                SidecarWindowBackend.WindowLayoutChangeCallbackWrapper this$0 = (SidecarWindowBackend.WindowLayoutChangeCallbackWrapper) obj2;
                WindowLayoutInfo newLayoutInfo = (WindowLayoutInfo) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(newLayoutInfo, "$newLayoutInfo");
                this$0.callback.accept(newLayoutInfo);
                break;
            default:
                ChannelsKt.trySendBlocking((ProducerScope) obj2, new TaskState.Paused((StorageTask.SnapshotBase) obj));
                break;
        }
    }
}
