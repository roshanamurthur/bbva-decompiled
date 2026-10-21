package com.facetec.sdk;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class FaceTecSDK {
    public static final String EXTRA_ID_SCAN_RESULTS = "facetecsdk.signup.idScanResult";
    public static final String EXTRA_SESSION_RESULTS = "facetecsdk.signup.sessionResult";
    public static final int REQUEST_CODE_SESSION = 1002;
    private static final boolean isMinimalLibrary = bg.c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    static FaceTecCustomization f40106a = new FaceTecCustomization();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    static FaceTecCustomization f40109d = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    static FaceTecCustomization f40107b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static c f40108c = c.NORMAL;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected static int f40110e = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected static int f40111h = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected static int f40112j = 0;

    /* JADX INFO: renamed from: com.facetec.sdk.FaceTecSDK$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final /* synthetic */ int[] f40113d;

        static {
            int[] iArr = new int[df.values().length];
            f40113d = iArr;
            try {
                iArr[df.CLICKABLE_READY_SCREEN_SUBTEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f40113d[df.DEV_MODE_TAG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f40113d[df.UNCONSTRAINED_GUIDANCE_STRING_LENGTHS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f40113d[df.STANDALONE_IDSCAN_WATERMARK_CUSTOMIZATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f40113d[df.ENABLE_SCREEN_CAPTURING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public enum CameraPermissionStatus {
        GRANTED("Authorized"),
        NOT_YET_REQUESTED("Not Yet Requested"),
        DENIED("Denied");


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f40115b;

        CameraPermissionStatus(String str) {
            this.f40115b = str;
        }

        @Override // java.lang.Enum
        @NonNull
        public final String toString() {
            return this.f40115b;
        }
    }

    public static abstract class InitializeCallback {
        public abstract void onCompletion(boolean z10);
    }

    public enum c {
        NORMAL,
        LOW_LIGHT,
        LOW_LIGHT_FROM_SENSOR,
        BRIGHT_LIGHT
    }

    private FaceTecSDK() {
    }

    private static boolean a(int i10) {
        boolean z10 = (i10 >= 0 && i10 <= 40) || i10 == -1;
        if (!z10) {
            aw.b("An error occurred while setting FaceTecCustomization due to a corner radius value set outside allowed range. Reverting corner radius value to default.");
        }
        return z10;
    }

    private static boolean b(int i10) {
        boolean z10 = (i10 >= 2 && i10 <= 20) || i10 == -1;
        if (!z10) {
            aw.b("An error occurred while setting FaceTecCustomization due to a stroke width value set outside allowed range. Reverting stroke width value to default.");
        }
        return z10;
    }

    public static boolean c() {
        return (f40108c == c.LOW_LIGHT || f40108c == c.LOW_LIGHT_FROM_SENSOR) && f40109d != null;
    }

    public static void configureOCRLocalization(JSONObject jSONObject) {
        bg.a(jSONObject);
    }

    @NonNull
    public static String createFaceTecAPIUserAgentString(String str) {
        return bg.a(str);
    }

    private static boolean d(int i10) {
        boolean z10 = (i10 >= 2 && i10 <= 20) || i10 == -1;
        if (!z10) {
            aw.b("An error occurred while setting FaceTecCustomization due to a radial offset value set outside allowed range. Reverting radial offset value to default.");
        }
        return z10;
    }

    public static void deinitialize() {
        bg.a(new Object[0], 1040995132, -1040995131, (int) System.currentTimeMillis());
    }

    public static boolean e() {
        return f40108c == c.BRIGHT_LIGHT && f40107b != null;
    }

    public static CameraPermissionStatus getCameraPermissionStatus(Context context) {
        return bg.c(context);
    }

    @Nullable
    public static Long getLockoutEndTime(Context context) {
        return bg.a(context);
    }

    public static FaceTecSDKStatus getStatus(Context context) {
        return (FaceTecSDKStatus) bg.a(new Object[]{context}, 643267213, -643267207, (int) System.currentTimeMillis());
    }

    public static void initializeInDevelopmentMode(@NonNull Context context, @NonNull String str, @NonNull String str2, @Nullable InitializeCallback initializeCallback) throws Throwable {
        bg.d(context, str, str2, initializeCallback);
    }

    public static void initializeInProductionMode(@NonNull Context context, @NonNull String str, @NonNull String str2, @NonNull String str3, @Nullable InitializeCallback initializeCallback) throws Throwable {
        bg.b(context, str, str2, str3, initializeCallback);
    }

    public static boolean isLockedOut(Context context) {
        return bg.e(context);
    }

    public static void preload(Context context) {
        bg.d(context, false);
    }

    public static void setAuditTrailType(FaceTecAuditTrailType faceTecAuditTrailType) {
        bg.c(faceTecAuditTrailType);
    }

    public static void setCustomization(FaceTecCustomization faceTecCustomization) {
        if (faceTecCustomization != null) {
            for (int i10 = 0; i10 < dc.f41159c.length(); i10++) {
                try {
                    JSONObject jSONObject = dc.f41159c.getJSONObject(i10);
                    String string = jSONObject.getString("overrideKey");
                    df dfVar = (df) jSONObject.get("type");
                    if (faceTecCustomization.f40094t.get(string) != null && faceTecCustomization.f40094t.get(string).equals(jSONObject.getString("overrideValue"))) {
                        int i11 = AnonymousClass2.f40113d[dfVar.ordinal()];
                        if (i11 == 1) {
                            faceTecCustomization.f40080c = true;
                        } else if (i11 == 2) {
                            faceTecCustomization.f40082e = false;
                        } else if (i11 == 3) {
                            faceTecCustomization.f40078a = true;
                        } else if (i11 == 4) {
                            faceTecCustomization.f40081d = true;
                        } else if (i11 == 5) {
                            faceTecCustomization.f40079b = true;
                            dc.c(dfVar);
                        }
                    }
                } catch (Exception unused) {
                }
            }
            if (!c(faceTecCustomization.f40086i.buttonBorderWidth)) {
                faceTecCustomization.f40086i.buttonBorderWidth = -1;
            }
            if (!c(faceTecCustomization.f40083f.buttonBorderWidth)) {
                faceTecCustomization.f40083f.buttonBorderWidth = -1;
            }
            if (!c(faceTecCustomization.f40089l.borderWidth)) {
                faceTecCustomization.f40089l.borderWidth = -1;
            }
            if (!c(faceTecCustomization.f40083f.captureScreenTextBackgroundBorderWidth)) {
                faceTecCustomization.f40083f.captureScreenTextBackgroundBorderWidth = -1;
            }
            if (!c(faceTecCustomization.f40083f.reviewScreenTextBackgroundBorderWidth)) {
                faceTecCustomization.f40083f.reviewScreenTextBackgroundBorderWidth = -1;
            }
            if (!c(faceTecCustomization.f40086i.retryScreenImageBorderWidth)) {
                faceTecCustomization.f40086i.retryScreenImageBorderWidth = -1;
            }
            if (!c(faceTecCustomization.f40084g.mainHeaderDividerLineWidth)) {
                faceTecCustomization.f40084g.mainHeaderDividerLineWidth = -1;
            }
            if (!c(faceTecCustomization.f40084g.inputFieldBorderWidth)) {
                faceTecCustomization.f40084g.inputFieldBorderWidth = -1;
            }
            if (!e(faceTecCustomization.f40089l.cornerRadius)) {
                faceTecCustomization.f40089l.cornerRadius = -1;
            }
            if (!a(faceTecCustomization.f40088k.cornerRadius)) {
                faceTecCustomization.f40088k.cornerRadius = -1;
            }
            if (!a(faceTecCustomization.f40086i.buttonCornerRadius)) {
                faceTecCustomization.f40086i.buttonCornerRadius = -1;
            }
            if (!a(faceTecCustomization.f40083f.buttonCornerRadius)) {
                faceTecCustomization.f40083f.buttonCornerRadius = -1;
            }
            if (!a(faceTecCustomization.f40083f.captureScreenTextBackgroundCornerRadius)) {
                faceTecCustomization.f40083f.captureScreenTextBackgroundCornerRadius = -1;
            }
            if (!a(faceTecCustomization.f40083f.reviewScreenTextBackgroundCornerRadius)) {
                faceTecCustomization.f40083f.reviewScreenTextBackgroundCornerRadius = -1;
            }
            if (!a(faceTecCustomization.f40086i.readyScreenTextBackgroundCornerRadius)) {
                faceTecCustomization.f40086i.readyScreenTextBackgroundCornerRadius = -1;
            }
            if (!a(faceTecCustomization.f40086i.retryScreenImageCornerRadius)) {
                faceTecCustomization.f40086i.retryScreenImageCornerRadius = -1;
            }
            if (!a(faceTecCustomization.f40084g.inputFieldCornerRadius)) {
                faceTecCustomization.f40084g.inputFieldCornerRadius = -1;
            }
            if (!b(faceTecCustomization.f40091o.strokeWidth)) {
                faceTecCustomization.f40091o.strokeWidth = -1;
            }
            if (!b(faceTecCustomization.f40091o.progressStrokeWidth)) {
                faceTecCustomization.f40091o.progressStrokeWidth = -1;
            }
            if (!d(faceTecCustomization.f40091o.progressRadialOffset)) {
                faceTecCustomization.f40091o.progressRadialOffset = -1;
            }
            String str = faceTecCustomization.f40086i.retryScreenHeaderAttributedString;
            if (str != null && !str.isEmpty()) {
                db.i(true);
            }
            String str2 = faceTecCustomization.f40086i.retryScreenSubtextAttributedString;
            if (str2 != null && !str2.isEmpty()) {
                db.g(true);
            }
            String str3 = faceTecCustomization.f40086i.readyScreenHeaderAttributedString;
            if (str3 != null && !str3.isEmpty()) {
                db.c(new Object[]{Boolean.TRUE}, -1782390247, 1782390279, (int) System.currentTimeMillis());
            }
            String str4 = faceTecCustomization.f40086i.readyScreenSubtextAttributedString;
            if (str4 != null && !str4.isEmpty()) {
                db.f(true);
            }
            bd.c();
            f40106a = faceTecCustomization;
        }
    }

    public static void setDynamicDimmingCustomization(FaceTecCustomization faceTecCustomization) {
        f40107b = faceTecCustomization;
    }

    public static void setDynamicStrings(Map<Integer, String> map) {
        dd.c(map);
    }

    public static void setLowLightCustomization(FaceTecCustomization faceTecCustomization) {
        f40109d = faceTecCustomization;
    }

    public static void setMaxAuditTrailImages(FaceTecAuditTrailImagesToReturn faceTecAuditTrailImagesToReturn) {
        bg.f40541e = faceTecAuditTrailImagesToReturn;
    }

    @Deprecated
    public static void unload() {
        bg.a(new Object[0], 1040995132, -1040995131, (int) System.currentTimeMillis());
    }

    public static String version() {
        return "9.6.101";
    }

    private static boolean c(int i10) {
        boolean z10 = (i10 >= 0 && i10 <= 20) || i10 == -1;
        if (!z10) {
            aw.b("An error occurred while setting FaceTecCustomization due to a border width value set outside allowed range. Reverting border width value to default.");
        }
        return z10;
    }

    private static boolean e(int i10) {
        boolean z10 = (i10 >= 0 && i10 <= 30) || i10 == -1;
        if (!z10) {
            aw.b("An error occurred while setting FaceTecCustomization due to a corner radius value set outside allowed range. Reverting corner radius value to default.");
        }
        return z10;
    }
}
