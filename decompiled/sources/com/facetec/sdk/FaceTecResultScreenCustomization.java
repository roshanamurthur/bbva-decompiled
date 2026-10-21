package com.facetec.sdk;

import android.graphics.Color;
import android.graphics.Typeface;
import androidx.annotation.DrawableRes;

/* JADX INFO: loaded from: classes9.dex */
public final class FaceTecResultScreenCustomization {
    public int foregroundColor = Color.parseColor("#417FB2");
    public int backgroundColors = -1;
    public int activityIndicatorColor = Color.parseColor("#417FB2");

    @DrawableRes
    public int customActivityIndicatorImage = 0;
    public int customActivityIndicatorRotationInterval = 1000;

    @DrawableRes
    public int customActivityIndicatorAnimation = 0;
    public boolean showUploadProgressBar = true;
    public int uploadProgressFillColor = Color.parseColor("#417FB2");
    public int uploadProgressTrackColor = Color.parseColor("#66000000");
    public int resultAnimationBackgroundColor = Color.parseColor("#417FB2");
    public int resultAnimationForegroundColor = -1;

    @DrawableRes
    public int resultAnimationSuccessBackgroundImage = 0;

    @DrawableRes
    public int resultAnimationUnsuccessBackgroundImage = 0;

    @DrawableRes
    public int customResultAnimationSuccess = 0;

    @DrawableRes
    public int customResultAnimationUnsuccess = 0;

    @DrawableRes
    public int customStaticResultAnimationSuccess = 0;

    @DrawableRes
    public int customStaticResultAnimationUnsuccess = 0;
    public Typeface messageFont = null;
    public float animationRelativeScale = 1.0f;
}
