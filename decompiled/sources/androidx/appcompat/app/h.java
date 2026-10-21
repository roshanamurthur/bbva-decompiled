package androidx.appcompat.app;

import android.hardware.SensorEvent;
import android.location.Location;
import android.view.Surface;
import androidx.camera.core.CameraX;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.imagecapture.TakePictureRequest;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Consumer;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.fragment.app.strictmode.Violation;
import com.appsflyer.internal.AFf1dSDK;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f737p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f738q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Object f739r0;

    public /* synthetic */ h(Object obj, Object obj2, int i10) {
        this.f737p0 = i10;
        this.f738q0 = obj;
        this.f739r0 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f737p0;
        Object obj = this.f739r0;
        Object obj2 = this.f738q0;
        switch (i10) {
            case 0:
                AppCompatDelegate.c cVar = (AppCompatDelegate.c) obj2;
                Runnable runnable = (Runnable) obj;
                cVar.getClass();
                try {
                    runnable.run();
                    return;
                } finally {
                    cVar.a();
                }
            case 1:
                ((CameraX) obj2).lambda$shutdownInternal$3((CallbackToFutureAdapter.Completer) obj);
                return;
            case 2:
                SurfaceRequest.lambda$provideSurface$4((Consumer) obj2, (Surface) obj);
                return;
            case 3:
                ((TakePictureRequest) obj2).lambda$onError$0((ImageCaptureException) obj);
                return;
            case 4:
                ((Consumer) obj2).accept((Location) obj);
                return;
            case 5:
                FragmentStrictMode.Policy policy = (FragmentStrictMode.Policy) obj2;
                Violation violation = (Violation) obj;
                FragmentStrictMode fragmentStrictMode = FragmentStrictMode.INSTANCE;
                Intrinsics.checkNotNullParameter(policy, "$policy");
                Intrinsics.checkNotNullParameter(violation, "$violation");
                policy.getListener$fragment_release().onViolation(violation);
                return;
            default:
                ((AFf1dSDK) obj2).AFKeystoreWrapper((SensorEvent) obj);
                return;
        }
    }
}
