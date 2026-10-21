package com.facetec.sdk;

import android.graphics.Color;
import android.graphics.Typeface;
import androidx.annotation.DrawableRes;

/* JADX INFO: loaded from: classes9.dex */
public final class FaceTecInitialLoadingAnimationCustomization {
    public int foregroundColor = Color.parseColor("#417FB2");
    public int backgroundColors = -1;

    @DrawableRes
    public int customAnimationImage = 0;
    public int customAnimationImageRotationInterval = 1000;
    public int customAnimation = 0;
    public int defaultAnimationBackgroundColor = Color.parseColor("#E6E6E6");
    public int defaultAnimationForegroundColor = Color.parseColor("#417FB2");
    public Typeface messageFont = null;
    public float animationRelativeScale = 1.0f;
}
