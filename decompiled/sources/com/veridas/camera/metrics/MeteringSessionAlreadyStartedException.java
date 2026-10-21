package com.veridas.camera.metrics;

/* JADX INFO: loaded from: classes9.dex */
public class MeteringSessionAlreadyStartedException extends IllegalStateException {
    public MeteringSessionAlreadyStartedException() {
        super("This metering session has already been started.");
    }
}
