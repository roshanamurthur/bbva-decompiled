package com.veridas.camera.one;

import com.veridas.camera.CameraQueryFactory;
import com.veridas.camera.CameraSystemFactory;
import com.veridas.camera.picture.SimplePictureFactory;
import wi.h;

/* JADX INFO: loaded from: classes9.dex */
public class CameraOneCameraSystemFactory implements CameraSystemFactory {
    @Override // com.veridas.camera.CameraSystemFactory
    public CameraQueryFactory createCameraQueryFactory() {
        h hVar = new h();
        SimplePictureFactory simplePictureFactory = new SimplePictureFactory();
        wi.b bVar = new wi.b();
        bVar.setParametersBuilderFactory(hVar);
        bVar.setPictureFactory(simplePictureFactory);
        return new wi.e(bVar);
    }
}
