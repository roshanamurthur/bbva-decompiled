package androidx.camera.core;

import android.os.Process;
import android.os.StrictMode;
import android.view.Surface;
import android.view.View;
import androidx.camera.core.imagecapture.TakePictureRequest;
import androidx.constraintlayout.motion.widget.ViewTransition;
import androidx.core.util.Consumer;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.fragment.app.strictmode.Violation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o1 implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f2185p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f2186q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Object f2187r0;

    public /* synthetic */ o1(Object obj, Object obj2, int i10) {
        this.f2185p0 = i10;
        this.f2186q0 = obj;
        this.f2187r0 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f2185p0;
        Object obj = this.f2187r0;
        Object obj2 = this.f2186q0;
        switch (i10) {
            case 0:
                SurfaceRequest.lambda$provideSurface$5((Consumer) obj2, (Surface) obj);
                return;
            case 1:
                ((TakePictureRequest) obj2).lambda$onResult$2((ImageProxy) obj);
                return;
            case 2:
                ViewTransition viewTransition = (ViewTransition) obj2;
                View[] viewArr = (View[]) obj;
                if (viewTransition.f19557p != -1) {
                    for (View view : viewArr) {
                        view.setTag(viewTransition.f19557p, Long.valueOf(System.nanoTime()));
                    }
                }
                if (viewTransition.f19558q != -1) {
                    for (View view2 : viewArr) {
                        view2.setTag(viewTransition.f19558q, null);
                    }
                    return;
                }
                return;
            case 3:
                Violation violation = (Violation) obj;
                FragmentStrictMode fragmentStrictMode = FragmentStrictMode.INSTANCE;
                Intrinsics.checkNotNullParameter(violation, "$violation");
                Intrinsics.stringPlus("Policy violation with PENALTY_DEATH in ", (String) obj2);
                throw violation;
            default:
                uf.a aVar = (uf.a) obj2;
                Runnable runnable = (Runnable) obj;
                Process.setThreadPriority(aVar.f93798r0);
                StrictMode.ThreadPolicy threadPolicy = aVar.f93799s0;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable.run();
                return;
        }
    }
}
