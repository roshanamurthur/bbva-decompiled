package wi;

import com.veridas.camera.CameraQuery;
import com.veridas.camera.CameraQueryFactory;

/* JADX INFO: compiled from: CameraOneCameraQueryFactory.java */
/* JADX INFO: loaded from: classes9.dex */
public final class e implements CameraQueryFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f94269a;

    public e(b bVar) {
        this.f94269a = bVar;
    }

    @Override // com.veridas.camera.CameraQueryFactory
    public final CameraQuery create() {
        return new d(this.f94269a);
    }
}
