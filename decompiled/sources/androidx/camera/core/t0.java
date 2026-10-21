package androidx.camera.core;

import android.net.Uri;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t0 implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f2250p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f2251q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Object f2252r0;

    public /* synthetic */ t0(Object obj, Object obj2, int i10) {
        this.f2250p0 = i10;
        this.f2251q0 = obj;
        this.f2252r0 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f2250p0;
        Object obj = this.f2252r0;
        Object obj2 = this.f2251q0;
        switch (i10) {
            case 0:
                ((ImageSaver) obj2).lambda$postSuccess$1((Uri) obj);
                break;
            default:
                ((VideoCapture) obj2).lambda$startRecording$3((VideoCapture.OnVideoSavedCallback) obj);
                break;
        }
    }
}
