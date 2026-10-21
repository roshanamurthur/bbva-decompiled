package com.veridas.camera.metrics;

/* JADX INFO: loaded from: classes9.dex */
public interface MeteringSession {
    void destroy();

    Metrics getMetrics();

    boolean isActive();

    boolean isDestroyed();

    void start();

    void stop();
}
