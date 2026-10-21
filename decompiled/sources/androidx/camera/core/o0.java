package androidx.camera.core;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0 implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f2182p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f2183q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Object f2184r0;

    public /* synthetic */ o0(Object obj, Object obj2, int i10) {
        this.f2182p0 = i10;
        this.f2183q0 = obj;
        this.f2184r0 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f2182p0;
        Object obj = this.f2184r0;
        Object obj2 = this.f2183q0;
        switch (i10) {
            case 0:
                ((ImageCapture.ImageCaptureRequest) obj2).lambda$dispatchImage$0((ImageProxy) obj);
                break;
            default:
                ((SurfaceRequest.TransformationInfoListener) obj2).onTransformationInfoUpdate((SurfaceRequest.TransformationInfo) obj);
                break;
        }
    }
}
