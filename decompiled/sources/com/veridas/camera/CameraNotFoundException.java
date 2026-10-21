package com.veridas.camera;

/* JADX INFO: loaded from: classes9.dex */
public class CameraNotFoundException extends CameraException {
    public static final String MESSAGE = "No available camera has been found for the requested parameters.";

    public CameraNotFoundException() {
        super(MESSAGE);
    }
}
