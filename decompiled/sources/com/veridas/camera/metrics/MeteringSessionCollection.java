package com.veridas.camera.metrics;

import com.veridas.camera.metrics.MeteringSession;

/* JADX INFO: loaded from: classes9.dex */
public interface MeteringSessionCollection<M extends MeteringSession> {
    M create();

    void destroy();

    boolean isEmpty();

    void remove(M m);
}
