package androidx.camera.core;

import android.content.Intent;
import androidx.camera.core.imagecapture.TakePictureRequest;
import com.dasnano.vdphotoselfiecapture.fragments.SelfieFragment;
import com.mypinpad.tsdk.isolation.getDiscretionaryTagData;
import com.mypinpad.tsdk.isolation.setLastBaselineToBottomHeight;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b0 implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f2050p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f2051q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Object f2052r0;

    public /* synthetic */ b0(Object obj, Object obj2, int i10) {
        this.f2050p0 = i10;
        this.f2051q0 = obj;
        this.f2052r0 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i10 = this.f2050p0;
        Object obj = this.f2052r0;
        Object obj2 = this.f2051q0;
        switch (i10) {
            case 0:
                ((ImageCapture) obj2).lambda$sendImageCaptureRequest$5((ImageCapture.OnImageCapturedCallback) obj);
                break;
            case 1:
                ((TakePictureRequest) obj2).lambda$onResult$1((ImageCapture.OutputFileResults) obj);
                break;
            case 2:
                Runnable runnable = (Runnable) obj;
                String str = SelfieFragment.CHALLENGE_TO_BE_REPEATED;
                ((SelfieFragment) obj2).t(false);
                if (runnable != null) {
                    runnable.run();
                }
                break;
            case 3:
                ((com.google.firebase.messaging.g) obj2).getClass();
                com.google.firebase.messaging.g.a((Intent) obj);
                break;
            case 4:
                getDiscretionaryTagData.setY(new Object[]{(setLastBaselineToBottomHeight) obj2, (byte[]) obj}, -966667861, 966667869, (int) System.currentTimeMillis());
                break;
            default:
                setLastBaselineToBottomHeight.setOnFocusChangeListener.setDividerPadding(new Object[]{(setLastBaselineToBottomHeight) obj2, (String) obj}, 1042193525, -1042193525, (int) System.currentTimeMillis());
                break;
        }
    }
}
