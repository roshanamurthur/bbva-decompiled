package com.veridas.detect.sequence.context;

import kotlin.Metadata;

/* JADX INFO: compiled from: SequentialAnalysisContext.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u001b\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0012\u0010\b\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005R\u0012\u0010\n\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005R\u0012\u0010\f\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0005R\u0018\u0010\u000e\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0005\"\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0012\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0005\"\u0004\b\u0014\u0010\u0011R\u0012\u0010\u0015\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0005R\u0012\u0010\u0017\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0005R\u0018\u0010\u0019\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u0005\"\u0004\b\u001b\u0010\u0011R\u0012\u0010\u001c\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0005¨\u0006\u001e"}, d2 = {"Lcom/veridas/detect/sequence/context/ImageFaceSequentialAnalysisContext;", "Lcom/veridas/detect/sequence/context/SequentialAnalysisContext;", "framesForPictureExtremelyFarMultiplier", "", "getFramesForPictureExtremelyFarMultiplier", "()D", "framesForPictureFarMultiplier", "getFramesForPictureFarMultiplier", "framesForPictureMiddleDistanceMultiplier", "getFramesForPictureMiddleDistanceMultiplier", "framesForPictureNotCenteredMultiplier", "getFramesForPictureNotCenteredMultiplier", "framesForPictureVeryCloseMultiplier", "getFramesForPictureVeryCloseMultiplier", "maximumFaceDistanceToCenter", "getMaximumFaceDistanceToCenter", "setMaximumFaceDistanceToCenter", "(D)V", "minimumFaceFraction", "getMinimumFaceFraction", "setMinimumFaceFraction", "minimumFaceFractionNormal", "getMinimumFaceFractionNormal", "minimumFaceFractionTight", "getMinimumFaceFractionTight", "relativeDistanceToCenter", "getRelativeDistanceToCenter", "setRelativeDistanceToCenter", "timeForPicture", "getTimeForPicture", "common-image-processing_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface ImageFaceSequentialAnalysisContext extends SequentialAnalysisContext {
    double getFramesForPictureExtremelyFarMultiplier();

    double getFramesForPictureFarMultiplier();

    double getFramesForPictureMiddleDistanceMultiplier();

    double getFramesForPictureNotCenteredMultiplier();

    double getFramesForPictureVeryCloseMultiplier();

    double getMaximumFaceDistanceToCenter();

    double getMinimumFaceFraction();

    double getMinimumFaceFractionNormal();

    double getMinimumFaceFractionTight();

    double getRelativeDistanceToCenter();

    double getTimeForPicture();

    void setMaximumFaceDistanceToCenter(double d2);

    void setMinimumFaceFraction(double d2);

    void setRelativeDistanceToCenter(double d2);
}
