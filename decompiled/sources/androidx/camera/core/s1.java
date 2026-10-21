package androidx.camera.core;

import android.util.Size;
import android.widget.ImageView;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.dasnano.vdphotoselfiecapture.api.model.Action;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s1 implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f2244p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f2245q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Object f2246r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ Object f2247s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ Object f2248t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final /* synthetic */ Object f2249u0;
    public final /* synthetic */ Object v0;

    public /* synthetic */ s1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f2244p0 = i10;
        this.f2245q0 = obj;
        this.f2246r0 = obj2;
        this.f2247s0 = obj3;
        this.f2248t0 = obj4;
        this.f2249u0 = obj5;
        this.v0 = obj6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f2244p0;
        Object obj = this.v0;
        Object obj2 = this.f2249u0;
        Object obj3 = this.f2248t0;
        Object obj4 = this.f2247s0;
        Object obj5 = this.f2246r0;
        Object obj6 = this.f2245q0;
        switch (i10) {
            case 0:
                ((VideoCapture) obj6).lambda$startRecording$4((VideoCapture.OnVideoSavedCallback) obj5, (String) obj4, (Size) obj3, (VideoCapture.OutputFileOptions) obj2, (CallbackToFutureAdapter.Completer) obj);
                break;
            default:
                Action.checkFaceAction$lambda$0((ImageView) obj6, (ImageView) obj5, (Action) obj4, (ImageView) obj3, (ImageView) obj2, (ImageView) obj);
                break;
        }
    }
}
