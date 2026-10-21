package androidx.camera.core;

import android.content.Context;
import android.util.Log;
import androidx.constraintlayout.helper.widget.Carousel;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.profileinstaller.ProfileInstaller;
import com.dasnano.vddocumentcapture.fragments.DocumentFragment;
import com.google.firebase.messaging.Constants;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c0 implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f2054p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f2055q0;

    public /* synthetic */ c0(Object obj, int i10) {
        this.f2054p0 = i10;
        this.f2055q0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f2054p0;
        Object obj = this.f2055q0;
        switch (i10) {
            case 0:
                ImageCapture.lambda$sendImageCaptureRequest$6((ImageCapture.OnImageCapturedCallback) obj);
                break;
            case 1:
                Function0 tmp0 = (Function0) obj;
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke();
                break;
            case 2:
                Carousel carousel = (Carousel) obj;
                carousel.f19247x0.setTransitionDuration(carousel.P0);
                if (carousel.O0 >= carousel.f19246w0) {
                    carousel.f19247x0.transitionToState(carousel.I0, carousel.P0);
                } else {
                    carousel.f19247x0.transitionToState(carousel.H0, carousel.P0);
                }
                break;
            case 3:
                ContentLoadingProgressBar contentLoadingProgressBar = (ContentLoadingProgressBar) obj;
                contentLoadingProgressBar.f20436s0 = true;
                contentLoadingProgressBar.removeCallbacks(contentLoadingProgressBar.f20438u0);
                contentLoadingProgressBar.f20435r0 = false;
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j10 = contentLoadingProgressBar.f20433p0;
                long j11 = jCurrentTimeMillis - j10;
                if (j11 >= 500 || j10 == -1) {
                    contentLoadingProgressBar.setVisibility(8);
                } else if (!contentLoadingProgressBar.f20434q0) {
                    contentLoadingProgressBar.postDelayed(contentLoadingProgressBar.f20437t0, 500 - j11);
                    contentLoadingProgressBar.f20434q0 = true;
                }
                break;
            case 4:
                ProfileInstaller.writeProfile((Context) obj);
                break;
            case 5:
                ((DocumentFragment) obj).mShutterButtonTimeIsFinished.set(true);
                break;
            default:
                com.google.firebase.messaging.b0.a aVar = (com.google.firebase.messaging.b0.a) obj;
                Log.w(Constants.TAG, "Service took too long to process intent: " + aVar.f48620a.getAction() + " Releasing WakeLock.");
                aVar.f48621b.trySetResult(null);
                break;
        }
    }
}
