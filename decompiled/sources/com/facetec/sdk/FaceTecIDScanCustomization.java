package com.facetec.sdk;

import android.graphics.Color;
import android.graphics.Typeface;
import androidx.annotation.DrawableRes;

/* JADX INFO: loaded from: classes9.dex */
public final class FaceTecIDScanCustomization {
    public int captureScreenBackgroundColor = -1;
    public int captureFrameStrokeColor = Color.parseColor("#417FB2");
    public int selectionScreenBackgroundColors = -1;
    public int selectionScreenForegroundColor = Color.parseColor("#417FB2");
    public int reviewScreenBackgroundColors = -1;
    public int reviewScreenForegroundColor = -1;
    public int reviewScreenTextBackgroundColor = Color.parseColor("#417FB2");
    public int reviewScreenTextBackgroundBorderColor = 0;
    public int captureScreenForegroundColor = -1;
    public int captureScreenTextBackgroundColor = Color.parseColor("#417FB2");
    public int captureScreenTextBackgroundBorderColor = 0;
    public int captureScreenFocusMessageTextColor = Color.parseColor("#333333");
    public int buttonTextNormalColor = -1;
    public int buttonBackgroundNormalColor = Color.parseColor("#417FB2");
    public int buttonTextHighlightColor = -1;
    public int buttonBackgroundHighlightColor = Color.parseColor("#396E99");
    public int buttonTextDisabledColor = -1;
    public int buttonBackgroundDisabledColor = Color.parseColor("#66417FB2");
    public int buttonBorderColor = 0;

    @DrawableRes
    public int customNFCStartingAnimation = 0;

    @DrawableRes
    public int customNFCScanningAnimation = 0;

    @DrawableRes
    public int customNFCCardStartingAnimation = 0;

    @DrawableRes
    public int customNFCCardScanningAnimation = 0;

    @DrawableRes
    public int customNFCSkipOrErrorAnimation = 0;

    @DrawableRes
    public int customStaticNFCStartingAnimation = 0;

    @DrawableRes
    public int customStaticNFCScanningAnimation = 0;

    @DrawableRes
    public int customStaticNFCSkipOrErrorAnimation = 0;
    public int additionalReviewScreenBackgroundColors = -1;
    public int additionalReviewScreenForegroundColor = Color.parseColor("#417FB2");

    @DrawableRes
    public int additionalReviewScreenAnimation = 0;

    @DrawableRes
    public int additionalReviewScreenStaticAnimation = 0;
    public boolean showSelectionScreenBrandingImage = false;
    public boolean showSelectionScreenDocumentImage = true;
    public boolean showFaceMatchToIDBrandingImage = false;
    public boolean disableAdditionalReviewScreen = false;

    @DrawableRes
    public int selectionScreenDocumentImage = 0;

    @DrawableRes
    public int selectionScreenBrandingImage = 0;

    @DrawableRes
    public int activeTorchButtonImage = 0;

    @DrawableRes
    public int inactiveTorchButtonImage = 0;

    @DrawableRes
    public int additionalReviewScreenImage = 0;

    @DrawableRes
    public int standaloneIDScanWatermark = 0;

    @DrawableRes
    public int faceMatchToIDBrandingImage = 0;
    public int captureFrameCornerRadius = -1;
    public int captureFrameStrokeWidth = -1;
    public int captureScreenTextBackgroundCornerRadius = -1;
    public int captureScreenTextBackgroundBorderWidth = 0;
    public int reviewScreenTextBackgroundCornerRadius = -1;
    public int reviewScreenTextBackgroundBorderWidth = 0;
    public Typeface captureScreenFocusMessageFont = null;
    public Typeface headerFont = null;
    public Typeface subtextFont = null;
    public Typeface buttonFont = null;
    public int buttonCornerRadius = -1;
    public int buttonBorderWidth = -1;
}
