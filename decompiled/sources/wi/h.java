package wi;

import com.veridas.camera.one.CameraOneCamera;
import com.veridas.camera.parameter.ParametersBuilder;
import com.veridas.camera.parameter.ParametersBuilderFactory;

/* JADX INFO: compiled from: CameraOneParametersBuilderFactory.java */
/* JADX INFO: loaded from: classes9.dex */
public final class h implements ParametersBuilderFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CameraOneCamera f94279a;

    @Override // com.veridas.camera.parameter.ParametersBuilderFactory
    public final ParametersBuilder create() {
        return new g(this.f94279a);
    }
}
