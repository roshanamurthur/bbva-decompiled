package androidx.camera.camera2.internal;

import androidx.camera.core.ImageProcessor;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.processing.InternalImageProcessor;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.location.GnssStatusCompat;
import androidx.core.location.LocationManagerCompat;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.crashlytics.internal.common.Utils;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f1911p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f1912q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Object f1913r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ Object f1914s0;

    public /* synthetic */ g(Object obj, Object obj2, int i10, Object obj3) {
        this.f1911p0 = i10;
        this.f1912q0 = obj;
        this.f1913r0 = obj2;
        this.f1914s0 = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1911p0) {
            case 0:
                ((Camera2CameraControlImpl) this.f1912q0).lambda$addSessionCameraCaptureCallback$8((Executor) this.f1913r0, (CameraCaptureCallback) this.f1914s0);
                break;
            case 1:
                ((InternalImageProcessor) this.f1912q0).lambda$safeProcess$0((CallbackToFutureAdapter.Completer) this.f1913r0, (ImageProcessor.Request) this.f1914s0);
                break;
            case 2:
                LocationManagerCompat.j jVar = (LocationManagerCompat.j) this.f1912q0;
                Executor executor = (Executor) this.f1913r0;
                GnssStatusCompat gnssStatusCompat = (GnssStatusCompat) this.f1914s0;
                if (jVar.f19963c == executor) {
                    jVar.f19962b.onSatelliteStatusChanged(gnssStatusCompat);
                    break;
                }
                break;
            case 3:
                uf.i iVar = (uf.i) this.f1912q0;
                Runnable runnable = (Runnable) this.f1913r0;
                uf.j.b bVar = (uf.j.b) this.f1914s0;
                iVar.getClass();
                iVar.f93828p0.execute(new k(runnable, bVar, 3));
                break;
            default:
                Callable callable = (Callable) this.f1912q0;
                Executor executor2 = (Executor) this.f1913r0;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f1914s0;
                ExecutorService executorService = Utils.f47779a;
                try {
                    ((Task) callable.call()).continueWith(executor2, new k4.b(taskCompletionSource));
                } catch (Exception e5) {
                    taskCompletionSource.setException(e5);
                }
                break;
        }
    }
}
