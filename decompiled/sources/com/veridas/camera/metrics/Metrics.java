package com.veridas.camera.metrics;

import java.util.Date;

/* JADX INFO: loaded from: classes9.dex */
public interface Metrics {
    Metrics between(Date date, Date date2);

    Metrics from(Date date);

    long getAfAvgTime();

    long getAfMaxTime();

    long getAfMinTime();

    Date getFrom();

    long getNumberOfAfAttempts();

    long getNumberOfPicturesTaken();

    long getNumberOfPreviewPictures();

    long getNumberOfSuccessfulAfAttempts();

    long getNumberOfUnsuccessfulAfAttempts();

    long getPreviewAvgFps();

    long getPreviewAvgInterval();

    long getPreviewMaxFps();

    long getPreviewMaxInterval();

    long getPreviewMinFps();

    long getPreviewMinInterval();

    Date getUntil();

    Metrics until(Date date);
}
