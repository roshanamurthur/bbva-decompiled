package com.veridas.camera;

import com.veridas.camera.Camera;
import com.veridas.camera.parameter.ParametersBuilderFactory;
import com.veridas.camera.picture.PictureFactory;

/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractCameraFactory<C extends Camera, B extends ParametersBuilderFactory> implements CameraFactory<C> {
    protected B parametersBuilderFactory;
    protected PictureFactory pictureFactory;

    public void setParametersBuilderFactory(B b10) {
        this.parametersBuilderFactory = b10;
    }

    public void setPictureFactory(PictureFactory pictureFactory) {
        this.pictureFactory = pictureFactory;
    }
}
