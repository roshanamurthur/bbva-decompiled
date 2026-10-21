package com.facetec.sdk;

import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class FaceTecCustomization {
    public static int activityThemeId;
    public static String overrideResultScreenSuccessMessage;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    static HashMap<cq, String> f40076q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    static HashMap<dj, String> f40077s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f40078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    boolean f40079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f40080c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    boolean f40081d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f40082e;
    public int exitAnimationSuccessResourceID;
    public int exitAnimationUnsuccessResourceID;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    FaceTecIDScanCustomization f40083f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    FaceTecOCRConfirmationCustomization f40084g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    FaceTecOverlayCustomization f40085h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    FaceTecGuidanceCustomization f40086i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    FaceTecResultScreenCustomization f40087j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    FaceTecFeedbackCustomization f40088k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    FaceTecFrameCustomization f40089l;

    @NonNull
    FaceTecInitialLoadingAnimationCustomization m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NonNull
    FaceTecCancelButtonCustomization f40090n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NonNull
    FaceTecOvalCustomization f40091o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NonNull
    FaceTecExitAnimationStyle f40092p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NonNull
    FaceTecExitAnimationStyle f40093r;
    public FaceTecSecurityWatermarkImage securityWatermarkImage;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Map<String, String> f40094t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NonNull
    @Deprecated
    private FaceTecSessionTimerCustomization f40095u;

    @NonNull
    public FaceTecVocalGuidanceCustomization vocalGuidanceCustomization;

    public FaceTecCustomization(Map<String, String> map) {
        this.f40082e = true;
        this.f40080c = false;
        this.f40078a = false;
        this.f40081d = false;
        this.f40079b = false;
        this.f40089l = new FaceTecFrameCustomization();
        this.f40088k = new FaceTecFeedbackCustomization();
        this.f40091o = new FaceTecOvalCustomization();
        this.f40090n = new FaceTecCancelButtonCustomization();
        this.f40086i = new FaceTecGuidanceCustomization();
        this.f40087j = new FaceTecResultScreenCustomization();
        this.f40085h = new FaceTecOverlayCustomization();
        this.f40083f = new FaceTecIDScanCustomization();
        this.f40084g = new FaceTecOCRConfirmationCustomization();
        this.f40095u = new FaceTecSessionTimerCustomization();
        this.m = new FaceTecInitialLoadingAnimationCustomization();
        this.f40092p = FaceTecExitAnimationStyle.RIPPLE_OUT;
        this.f40093r = FaceTecExitAnimationStyle.NONE;
        this.exitAnimationUnsuccessResourceID = -1;
        this.exitAnimationSuccessResourceID = -1;
        this.f40094t = map;
        this.securityWatermarkImage = FaceTecSecurityWatermarkImage.FACETEC_ZOOM;
        this.vocalGuidanceCustomization = new FaceTecVocalGuidanceCustomization();
    }

    public static void setIDScanResultScreenMessageOverrides(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4, @NonNull String str5, @NonNull String str6, @NonNull String str7, @NonNull String str8, @NonNull String str9, @NonNull String str10, @NonNull String str11, @NonNull String str12, @NonNull String str13, @NonNull String str14) {
        HashMap<cq, String> map = new HashMap<>();
        f40076q = map;
        map.put(cq.IDSCAN_RETRY_FACE_DID_NOT_MATCH, str10);
        f40076q.put(cq.IDSCAN_RETRY_ID_NOT_FULLY_VISIBLE, str11);
        f40076q.put(cq.IDSCAN_RETRY_OCR_RESULTS_NOT_GOOD_ENOUGH, str12);
        f40076q.put(cq.IDSCAN_RETRY_ID_TYPE_NOT_SUPPORTED, str13);
        f40076q.put(cq.IDSCAN_SKIP_OR_ERROR_NFC, str14);
        f40076q.put(cq.IDSCAN_SUCCESS_FRONT_SIDE, str);
        f40076q.put(cq.IDSCAN_SUCCESS_FRONT_SIDE_BACK_NEXT, str2);
        f40076q.put(cq.IDSCAN_SUCCESS_FRONT_SIDE_NFC_NEXT, str3);
        f40076q.put(cq.IDSCAN_SUCCESS_BACK_SIDE, str4);
        f40076q.put(cq.IDSCAN_SUCCESS_BACK_SIDE_NFC_NEXT, str5);
        f40076q.put(cq.IDSCAN_SUCCESS_PASSPORT, str6);
        f40076q.put(cq.IDSCAN_SUCCESS_PASSPORT_NFC_NEXT, str7);
        f40076q.put(cq.IDSCAN_SUCCESS_USER_CONFIRMATION, str8);
        f40076q.put(cq.IDSCAN_SUCCESS_NFC, str9);
    }

    public static void setIDScanUploadMessageOverrides(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20) {
        HashMap<dj, String> map = new HashMap<>();
        f40077s = map;
        map.put(dj.IDSCAN_FRONT_SIDE_UPLOAD_STARTED, str);
        f40077s.put(dj.IDSCAN_FRONT_SIDE_STILL_UPLOADING, str2);
        f40077s.put(dj.IDSCAN_FRONT_SIDE_UPLOAD_COMPLETE_AWAITING_RESPONSE, str3);
        f40077s.put(dj.IDSCAN_FRONT_SIDE_UPLOAD_COMPLETE_AWAITING_PROCESSING, str4);
        f40077s.put(dj.IDSCAN_BACK_SIDE_UPLOAD_STARTED, str5);
        f40077s.put(dj.IDSCAN_BACK_SIDE_STILL_UPLOADING, str6);
        f40077s.put(dj.IDSCAN_BACK_SIDE_UPLOAD_COMPLETE_AWAITING_RESPONSE, str7);
        f40077s.put(dj.IDSCAN_BACK_SIDE_UPLOAD_COMPLETE_AWAITING_PROCESSING, str8);
        f40077s.put(dj.IDSCAN_USER_CONFIRMED_INFO_UPLOAD_STARTED, str9);
        f40077s.put(dj.IDSCAN_USER_CONFIRMED_INFO_STILL_UPLOADING, str10);
        f40077s.put(dj.IDSCAN_USER_CONFIRMED_INFO_UPLOAD_COMPLETE_AWAITING_RESPONSE, str11);
        f40077s.put(dj.IDSCAN_USER_CONFIRMED_INFO_UPLOAD_COMPLETE_AWAITING_PROCESSING, str12);
        f40077s.put(dj.NFC_UPLOAD_STARTED, str13);
        f40077s.put(dj.NFC_STILL_UPLOADING, str14);
        f40077s.put(dj.NFC_UPLOAD_COMPLETE_AWAITING_RESPONSE, str15);
        f40077s.put(dj.NFC_UPLOAD_COMPLETE_AWAITING_PROCESSING, str16);
        f40077s.put(dj.SKIPPED_NFC_UPLOAD_STARTED, str17);
        f40077s.put(dj.SKIPPED_NFC_STILL_UPLOADING, str18);
        f40077s.put(dj.SKIPPED_NFC_UPLOAD_COMPLETE_AWAITING_RESPONSE, str19);
        f40077s.put(dj.SKIPPED_NFC_UPLOAD_COMPLETE_AWAITING_PROCESSING, str20);
    }

    @NonNull
    public final FaceTecCancelButtonCustomization getCancelButtonCustomization() {
        return this.f40090n;
    }

    @NonNull
    public final FaceTecExitAnimationStyle getExitAnimationSuccessCustom() {
        return this.f40092p;
    }

    @NonNull
    public final FaceTecExitAnimationStyle getExitAnimationUnsuccessCustom() {
        return this.f40093r;
    }

    @NonNull
    public final FaceTecFeedbackCustomization getFeedbackCustomization() {
        return this.f40088k;
    }

    @NonNull
    public final FaceTecFrameCustomization getFrameCustomization() {
        return this.f40089l;
    }

    @NonNull
    public final FaceTecGuidanceCustomization getGuidanceCustomization() {
        return this.f40086i;
    }

    @NonNull
    public final FaceTecIDScanCustomization getIdScanCustomization() {
        return this.f40083f;
    }

    @NonNull
    public final FaceTecInitialLoadingAnimationCustomization getInitialLoadingAnimationCustomization() {
        return this.m;
    }

    @NonNull
    public final FaceTecOCRConfirmationCustomization getOcrConfirmationCustomization() {
        return this.f40084g;
    }

    @NonNull
    public final FaceTecOvalCustomization getOvalCustomization() {
        return this.f40091o;
    }

    @NonNull
    public final FaceTecOverlayCustomization getOverlayCustomization() {
        return this.f40085h;
    }

    @NonNull
    public final FaceTecResultScreenCustomization getResultScreenCustomization() {
        return this.f40087j;
    }

    @NonNull
    public final FaceTecSessionTimerCustomization getSessionTimerCustomization() {
        return this.f40095u;
    }

    public final void setCancelButtonCustomization(FaceTecCancelButtonCustomization faceTecCancelButtonCustomization) {
        if (faceTecCancelButtonCustomization == null) {
            faceTecCancelButtonCustomization = new FaceTecCancelButtonCustomization();
        }
        this.f40090n = faceTecCancelButtonCustomization;
    }

    public final void setExitAnimationSuccessCustom(FaceTecExitAnimationStyle faceTecExitAnimationStyle) {
        if (faceTecExitAnimationStyle == null) {
            faceTecExitAnimationStyle = FaceTecExitAnimationStyle.CIRCLE_FADE;
        }
        this.f40092p = faceTecExitAnimationStyle;
        FaceTecExitAnimationStyle faceTecExitAnimationStyle2 = FaceTecExitAnimationStyle.CIRCLE_FADE;
    }

    public final void setExitAnimationUnsuccessCustom(FaceTecExitAnimationStyle faceTecExitAnimationStyle) {
        if (faceTecExitAnimationStyle == null) {
            faceTecExitAnimationStyle = FaceTecExitAnimationStyle.CIRCLE_FADE;
        }
        this.f40093r = faceTecExitAnimationStyle;
        FaceTecExitAnimationStyle faceTecExitAnimationStyle2 = FaceTecExitAnimationStyle.CIRCLE_FADE;
    }

    public final void setFeedbackCustomization(FaceTecFeedbackCustomization faceTecFeedbackCustomization) {
        if (faceTecFeedbackCustomization == null) {
            faceTecFeedbackCustomization = new FaceTecFeedbackCustomization();
        }
        this.f40088k = faceTecFeedbackCustomization;
    }

    public final void setFrameCustomization(FaceTecFrameCustomization faceTecFrameCustomization) {
        if (faceTecFrameCustomization == null) {
            faceTecFrameCustomization = new FaceTecFrameCustomization();
        }
        this.f40089l = faceTecFrameCustomization;
    }

    public final void setGuidanceCustomization(FaceTecGuidanceCustomization faceTecGuidanceCustomization) {
        if (faceTecGuidanceCustomization == null) {
            faceTecGuidanceCustomization = new FaceTecGuidanceCustomization();
        }
        this.f40086i = faceTecGuidanceCustomization;
    }

    public final void setIdScanCustomization(FaceTecIDScanCustomization faceTecIDScanCustomization) {
        if (faceTecIDScanCustomization == null) {
            faceTecIDScanCustomization = new FaceTecIDScanCustomization();
        }
        this.f40083f = faceTecIDScanCustomization;
    }

    public final void setInitialLoadingAnimationCustomization(FaceTecInitialLoadingAnimationCustomization faceTecInitialLoadingAnimationCustomization) {
        if (faceTecInitialLoadingAnimationCustomization == null) {
            faceTecInitialLoadingAnimationCustomization = new FaceTecInitialLoadingAnimationCustomization();
        }
        this.m = faceTecInitialLoadingAnimationCustomization;
    }

    public final void setOcrConfirmationCustomization(FaceTecOCRConfirmationCustomization faceTecOCRConfirmationCustomization) {
        if (faceTecOCRConfirmationCustomization == null) {
            faceTecOCRConfirmationCustomization = new FaceTecOCRConfirmationCustomization();
        }
        this.f40084g = faceTecOCRConfirmationCustomization;
    }

    public final void setOvalCustomization(FaceTecOvalCustomization faceTecOvalCustomization) {
        if (faceTecOvalCustomization == null) {
            faceTecOvalCustomization = new FaceTecOvalCustomization();
        }
        this.f40091o = faceTecOvalCustomization;
    }

    public final void setOverlayCustomization(FaceTecOverlayCustomization faceTecOverlayCustomization) {
        if (faceTecOverlayCustomization == null) {
            faceTecOverlayCustomization = new FaceTecOverlayCustomization();
        }
        this.f40085h = faceTecOverlayCustomization;
    }

    public final void setResultScreenCustomization(FaceTecResultScreenCustomization faceTecResultScreenCustomization) {
        if (faceTecResultScreenCustomization == null) {
            faceTecResultScreenCustomization = new FaceTecResultScreenCustomization();
        }
        this.f40087j = faceTecResultScreenCustomization;
    }

    public final void setSessionTimerCustomization(FaceTecSessionTimerCustomization faceTecSessionTimerCustomization) {
        if (faceTecSessionTimerCustomization == null) {
            faceTecSessionTimerCustomization = new FaceTecSessionTimerCustomization();
        }
        this.f40095u = faceTecSessionTimerCustomization;
    }

    public static void setIDScanResultScreenMessageOverrides(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4, @NonNull String str5, @NonNull String str6, @NonNull String str7, @NonNull String str8, @NonNull String str9, @NonNull String str10, @NonNull String str11, @NonNull String str12) {
        aw.b(String.format("FaceTec SDK Deprecated Method Warning:  The %s function with these arguments is deprecated, please use the updated overload in order to customize all available strings.", "setIDScanResultScreenMessageOverrides"));
        HashMap<cq, String> map = new HashMap<>();
        f40076q = map;
        map.put(cq.IDSCAN_RETRY_FACE_DID_NOT_MATCH, str8);
        f40076q.put(cq.IDSCAN_RETRY_ID_NOT_FULLY_VISIBLE, str9);
        f40076q.put(cq.IDSCAN_RETRY_OCR_RESULTS_NOT_GOOD_ENOUGH, str10);
        f40076q.put(cq.IDSCAN_RETRY_ID_TYPE_NOT_SUPPORTED, str11);
        f40076q.put(cq.IDSCAN_SKIP_OR_ERROR_NFC, str12);
        f40076q.put(cq.IDSCAN_SUCCESS_FRONT_SIDE, str);
        f40076q.put(cq.IDSCAN_SUCCESS_FRONT_SIDE_BACK_NEXT, str2);
        f40076q.put(cq.IDSCAN_SUCCESS_FRONT_SIDE_NFC_NEXT, str3);
        f40076q.put(cq.IDSCAN_SUCCESS_BACK_SIDE, str4);
        f40076q.put(cq.IDSCAN_SUCCESS_BACK_SIDE_NFC_NEXT, str5);
        f40076q.put(cq.IDSCAN_SUCCESS_USER_CONFIRMATION, str6);
        f40076q.put(cq.IDSCAN_SUCCESS_NFC, str7);
    }

    @Deprecated
    public static void setIDScanUploadMessageOverrides(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16) {
        aw.b(String.format("FaceTec SDK Deprecated Method Warning:  The %s function with these arguments is deprecated, please use the updated overload in order to customize all available strings.", "setIDScanUploadMessageOverrides"));
        HashMap<dj, String> map = new HashMap<>();
        f40077s = map;
        map.put(dj.IDSCAN_FRONT_SIDE_UPLOAD_STARTED, str);
        f40077s.put(dj.IDSCAN_FRONT_SIDE_STILL_UPLOADING, str2);
        f40077s.put(dj.IDSCAN_FRONT_SIDE_UPLOAD_COMPLETE_AWAITING_RESPONSE, str3);
        f40077s.put(dj.IDSCAN_FRONT_SIDE_UPLOAD_COMPLETE_AWAITING_PROCESSING, str4);
        f40077s.put(dj.IDSCAN_BACK_SIDE_UPLOAD_STARTED, str5);
        f40077s.put(dj.IDSCAN_BACK_SIDE_STILL_UPLOADING, str6);
        f40077s.put(dj.IDSCAN_BACK_SIDE_UPLOAD_COMPLETE_AWAITING_RESPONSE, str7);
        f40077s.put(dj.IDSCAN_BACK_SIDE_UPLOAD_COMPLETE_AWAITING_PROCESSING, str8);
        f40077s.put(dj.IDSCAN_USER_CONFIRMED_INFO_UPLOAD_STARTED, str9);
        f40077s.put(dj.IDSCAN_USER_CONFIRMED_INFO_STILL_UPLOADING, str10);
        f40077s.put(dj.IDSCAN_USER_CONFIRMED_INFO_UPLOAD_COMPLETE_AWAITING_RESPONSE, str11);
        f40077s.put(dj.IDSCAN_USER_CONFIRMED_INFO_UPLOAD_COMPLETE_AWAITING_PROCESSING, str12);
        f40077s.put(dj.NFC_UPLOAD_STARTED, str13);
        f40077s.put(dj.NFC_STILL_UPLOADING, str14);
        f40077s.put(dj.NFC_UPLOAD_COMPLETE_AWAITING_RESPONSE, str15);
        f40077s.put(dj.NFC_UPLOAD_COMPLETE_AWAITING_PROCESSING, str16);
    }

    public FaceTecCustomization() {
        this(new HashMap());
    }

    public static void setIDScanResultScreenMessageOverrides(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4, @NonNull String str5, @NonNull String str6, @NonNull String str7, @NonNull String str8, @NonNull String str9, @NonNull String str10) {
        aw.b(String.format("FaceTec SDK Deprecated Method Warning:  The %s function with these arguments is deprecated, please use the updated overload in order to customize all available strings.", "setIDScanResultScreenMessageOverrides"));
        HashMap<cq, String> map = new HashMap<>();
        f40076q = map;
        map.put(cq.IDSCAN_RETRY_FACE_DID_NOT_MATCH, str6);
        f40076q.put(cq.IDSCAN_RETRY_ID_NOT_FULLY_VISIBLE, str7);
        f40076q.put(cq.IDSCAN_RETRY_OCR_RESULTS_NOT_GOOD_ENOUGH, str8);
        f40076q.put(cq.IDSCAN_RETRY_ID_TYPE_NOT_SUPPORTED, str9);
        f40076q.put(cq.IDSCAN_SKIP_OR_ERROR_NFC, str10);
        f40076q.put(cq.IDSCAN_SUCCESS_FRONT_SIDE, str);
        f40076q.put(cq.IDSCAN_SUCCESS_FRONT_SIDE_BACK_NEXT, str2);
        f40076q.put(cq.IDSCAN_SUCCESS_BACK_SIDE, str3);
        f40076q.put(cq.IDSCAN_SUCCESS_USER_CONFIRMATION, str4);
        f40076q.put(cq.IDSCAN_SUCCESS_NFC, str5);
    }

    @Deprecated
    public static void setIDScanResultScreenMessageOverrides(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4, @NonNull String str5, @NonNull String str6, @NonNull String str7, @NonNull String str8, @NonNull String str9) {
        aw.b(String.format("FaceTec SDK Deprecated Method Warning:  The %s function with these arguments is deprecated, please use the updated overload in order to customize all available strings.", "setIDScanResultScreenMessageOverrides"));
        HashMap<cq, String> map = new HashMap<>();
        f40076q = map;
        map.put(cq.IDSCAN_RETRY_FACE_DID_NOT_MATCH, str6);
        f40076q.put(cq.IDSCAN_RETRY_ID_NOT_FULLY_VISIBLE, str7);
        f40076q.put(cq.IDSCAN_RETRY_OCR_RESULTS_NOT_GOOD_ENOUGH, str8);
        f40076q.put(cq.IDSCAN_SKIP_OR_ERROR_NFC, str9);
        f40076q.put(cq.IDSCAN_SUCCESS_FRONT_SIDE, str);
        f40076q.put(cq.IDSCAN_SUCCESS_FRONT_SIDE_BACK_NEXT, str2);
        f40076q.put(cq.IDSCAN_SUCCESS_BACK_SIDE, str3);
        f40076q.put(cq.IDSCAN_SUCCESS_USER_CONFIRMATION, str4);
        f40076q.put(cq.IDSCAN_SUCCESS_NFC, str5);
    }

    @Deprecated
    public static void setIDScanResultScreenMessageOverrides(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4, @NonNull String str5, @NonNull String str6, @NonNull String str7) {
        aw.b(String.format("FaceTec SDK Deprecated Method Warning:  The %s function with these arguments is deprecated, please use the updated overload in order to customize all available strings.", "setIDScanResultScreenMessageOverrides"));
        HashMap<cq, String> map = new HashMap<>();
        f40076q = map;
        map.put(cq.IDSCAN_RETRY_FACE_DID_NOT_MATCH, str5);
        f40076q.put(cq.IDSCAN_RETRY_ID_NOT_FULLY_VISIBLE, str6);
        f40076q.put(cq.IDSCAN_RETRY_OCR_RESULTS_NOT_GOOD_ENOUGH, str7);
        f40076q.put(cq.IDSCAN_SUCCESS_FRONT_SIDE, str);
        f40076q.put(cq.IDSCAN_SUCCESS_FRONT_SIDE_BACK_NEXT, str2);
        f40076q.put(cq.IDSCAN_SUCCESS_BACK_SIDE, str3);
        f40076q.put(cq.IDSCAN_SUCCESS_USER_CONFIRMATION, str4);
    }
}
