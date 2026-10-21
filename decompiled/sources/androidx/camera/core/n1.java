package androidx.camera.core;

import android.location.Location;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.core.location.LocationManagerCompat;
import androidx.core.widget.ContentLoadingProgressBar;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.CompositionLayer;
import com.appsflyer.internal.AFf1bSDK;
import com.dasnano.vddocumentcapture.managers.UserVisualHelpManager;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.firebase.storage.StorageTask;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.Semaphore;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n1 implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f2179p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f2180q0;

    public /* synthetic */ n1(Object obj, int i10) {
        this.f2179p0 = i10;
        this.f2180q0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f2179p0;
        Object obj = this.f2180q0;
        switch (i10) {
            case 0:
                ((SurfaceRequest) obj).lambda$new$3();
                return;
            case 1:
                LocationManagerCompat.f fVar = (LocationManagerCompat.f) obj;
                fVar.f19955u0 = null;
                fVar.onLocationChanged((Location) null);
                return;
            case 2:
                ContentLoadingProgressBar contentLoadingProgressBar = (ContentLoadingProgressBar) obj;
                contentLoadingProgressBar.f20433p0 = -1L;
                contentLoadingProgressBar.f20436s0 = false;
                contentLoadingProgressBar.removeCallbacks(contentLoadingProgressBar.f20437t0);
                contentLoadingProgressBar.f20434q0 = false;
                if (contentLoadingProgressBar.f20435r0) {
                    return;
                }
                contentLoadingProgressBar.postDelayed(contentLoadingProgressBar.f20438u0, 500L);
                contentLoadingProgressBar.f20435r0 = true;
                return;
            case 3:
                LottieDrawable lottieDrawable = (LottieDrawable) obj;
                Semaphore semaphore = lottieDrawable.f25636j1;
                CompositionLayer compositionLayer = lottieDrawable.M0;
                if (compositionLayer == null) {
                    return;
                }
                try {
                    semaphore.acquire();
                    compositionLayer.setProgress(lottieDrawable.f25642q0.getAnimatedValueAbsolute());
                    if (LottieDrawable.f25624o1 && lottieDrawable.f25633g1) {
                        if (lottieDrawable.f25637k1 == null) {
                            lottieDrawable.f25637k1 = new Handler(Looper.getMainLooper());
                            lottieDrawable.f25638l1 = new androidx.core.view.b0(lottieDrawable, 3);
                        }
                        lottieDrawable.f25637k1.post(lottieDrawable.f25638l1);
                    }
                    break;
                } catch (InterruptedException unused) {
                } finally {
                    semaphore.release();
                }
                return;
            case 4:
                ((AFf1bSDK) obj).afErrorLog();
                return;
            case 5:
                ((UserVisualHelpManager) obj).f39410a.setVisibility(8);
                return;
            case 6:
                int i11 = BottomAppBar.M1;
                ((View) obj).requestLayout();
                return;
            default:
                StorageTask storageTask = (StorageTask) obj;
                HashMap<Integer, HashSet<Integer>> map = StorageTask.f49037i;
                storageTask.getClass();
                try {
                    storageTask.f();
                    return;
                } finally {
                    storageTask.a();
                }
        }
    }
}
