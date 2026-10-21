package androidx.camera.core;

import android.app.job.JobParameters;
import androidx.camera.core.processing.DefaultSurfaceProcessor;
import androidx.lifecycle.LifecycleOwner;
import com.bbva.discreetmode.camera.DiscreetModeCamera;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.mypinpad.tsdk.isolation.setAccessibilityDelegate;
import com.mypinpad.tsdk.isolation.setProgressBackgroundTintMode;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p1 implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f2192p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f2193q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Object f2194r0;

    public /* synthetic */ p1(Object obj, Object obj2, int i10) {
        this.f2192p0 = i10;
        this.f2193q0 = obj;
        this.f2194r0 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f2192p0;
        Object obj = this.f2194r0;
        Object obj2 = this.f2193q0;
        switch (i10) {
            case 0:
                ((SurfaceRequest.TransformationInfoListener) obj2).onTransformationInfoUpdate((SurfaceRequest.TransformationInfo) obj);
                break;
            case 1:
                ((DefaultSurfaceProcessor) obj2).lambda$onOutputSurface$3((SurfaceOutput) obj);
                break;
            case 2:
                DiscreetModeCamera this$0 = (DiscreetModeCamera) obj2;
                LifecycleOwner lifecycleOwner = (LifecycleOwner) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(lifecycleOwner, "$lifecycleOwner");
                this$0.a(lifecycleOwner);
                break;
            case 3:
                int i11 = JobInfoSchedulerService.f43826p0;
                ((JobInfoSchedulerService) obj2).jobFinished((JobParameters) obj, false);
                break;
            default:
                setProgressBackgroundTintMode.a((setAccessibilityDelegate.setX) obj, (Function1) obj2);
                break;
        }
    }
}
