package wi;

import com.veridas.camera.AbstractCameraFactory;
import com.veridas.camera.one.CameraOneCamera;

/* JADX INFO: compiled from: CameraOneCameraFactory.java */
/* JADX INFO: loaded from: classes9.dex */
public final class b extends AbstractCameraFactory<CameraOneCamera, h> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f94263a;

    @Override // com.veridas.camera.CameraFactory
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final CameraOneCamera create() {
        return new CameraOneCamera(this.f94263a, this.pictureFactory, (h) this.parametersBuilderFactory);
    }
}
