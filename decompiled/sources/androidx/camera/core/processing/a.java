package androidx.camera.core.processing;

import androidx.camera.core.SurfaceRequest;
import com.dasnano.vddocumentcapture.fragments.DocumentFragment;
import com.dasnano.vdphotoselfiecapture.fragments.SelfieFragment;
import com.mypinpad.tsdk.isolation.setAccessibilityDelegate;
import com.mypinpad.tsdk.isolation.setProgressBackgroundTintMode;
import com.veridas.camera.Camera;
import com.veridas.vdlibraryimageprocessing.VDConstantDefinition;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f2195p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f2196q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Object f2197r0;

    public /* synthetic */ a(Object obj, Object obj2, int i10) {
        this.f2195p0 = i10;
        this.f2196q0 = obj;
        this.f2197r0 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f2195p0;
        Object obj = this.f2197r0;
        Object obj2 = this.f2196q0;
        switch (i10) {
            case 0:
                ((DefaultSurfaceProcessor) obj2).lambda$onInputSurface$1((SurfaceRequest) obj);
                break;
            case 1:
                DocumentFragment.i((DocumentFragment) obj2, (VDConstantDefinition.AnalysisType) obj);
                break;
            case 2:
                SelfieFragment.k kVar = (SelfieFragment.k) obj2;
                kVar.getClass();
                ((Camera) obj).startMediaRecorder(new y0.h(kVar));
                break;
            default:
                setProgressBackgroundTintMode.a((setAccessibilityDelegate.setX) obj, (Function1) obj2);
                break;
        }
    }
}
