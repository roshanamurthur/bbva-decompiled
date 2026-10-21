package com.facetec.sdk;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.media.AudioTrack;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import com.bbva.androidtoolkit.utils.PluginUtils;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes9.dex */
final class db {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final h<Float> f41144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final h<Float> f41145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final h<Resources> f41146c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final h<DisplayMetrics> f41147d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final h<Float> f41148e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f41149g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static char[] f41150h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static char f41151i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f41152j;

    /* JADX INFO: renamed from: com.facetec.sdk.db$3, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f41153a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f41154c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final /* synthetic */ int[] f41155d;

        static {
            int[] iArr = new int[ca.values().length];
            f41153a = iArr;
            try {
                iArr[ca.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f41153a[ca.STARTING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f41153a[ca.SCANNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f41153a[ca.WEAK_CONNECTION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f41153a[ca.FINISHED_WITH_SUCCESS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f41153a[ca.FINISHED_WITH_ERROR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f41153a[ca.SKIPPED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f41153a[ca.DISABLED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr2 = new int[cq.values().length];
            f41155d = iArr2;
            try {
                iArr2[cq.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f41155d[cq.IDSCAN_RETRY_FACE_DID_NOT_MATCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f41155d[cq.IDSCAN_RETRY_ID_NOT_FULLY_VISIBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f41155d[cq.IDSCAN_RETRY_OCR_RESULTS_NOT_GOOD_ENOUGH.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f41155d[cq.IDSCAN_RETRY_ID_TYPE_NOT_SUPPORTED.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f41155d[cq.IDSCAN_RETRY_BARCODE_NOT_READ.ordinal()] = 6;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f41155d[cq.IDSCAN_RETRY_USER_CONFIRMATION.ordinal()] = 7;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f41155d[cq.IDSCAN_SKIP_OR_ERROR_NFC.ordinal()] = 8;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f41155d[cq.IDSCAN_SUCCESS_FRONT_SIDE.ordinal()] = 9;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f41155d[cq.IDSCAN_SUCCESS_FRONT_SIDE_BACK_NEXT.ordinal()] = 10;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f41155d[cq.IDSCAN_SUCCESS_FRONT_SIDE_NFC_NEXT.ordinal()] = 11;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f41155d[cq.IDSCAN_SUCCESS_BACK_SIDE.ordinal()] = 12;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f41155d[cq.IDSCAN_SUCCESS_BACK_SIDE_NFC_NEXT.ordinal()] = 13;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f41155d[cq.IDSCAN_SUCCESS_PASSPORT.ordinal()] = 14;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f41155d[cq.IDSCAN_SUCCESS_PASSPORT_NFC_NEXT.ordinal()] = 15;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f41155d[cq.IDSCAN_SUCCESS_USER_CONFIRMATION.ordinal()] = 16;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f41155d[cq.IDSCAN_SUCCESS_NFC.ordinal()] = 17;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f41155d[cq.IDSCAN_SUCCESS_ADDITIONAL_REVIEW.ordinal()] = 18;
            } catch (NoSuchFieldError unused26) {
            }
            int[] iArr3 = new int[b.values().length];
            f41154c = iArr3;
            try {
                iArr3[b.RESOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f41154c[b.COLOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused28) {
            }
        }
    }

    public enum b {
        COLOR,
        RESOURCE
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f41149g = 0;
        f41152j = 1;
        bl();
        f41146c = new h<>();
        f41147d = new h<>();
        f41148e = new h<>();
        f41145b = new h<>();
        f41144a = new h<>();
        int i10 = f41152j + 49;
        f41149g = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    public static int A() {
        int i10 = f41152j + 31;
        f41149g = i10 % 128;
        int i11 = i10 % 2;
        int i12 = FaceTecSDK.f40106a.f40083f.reviewScreenTextBackgroundCornerRadius;
        if (i12 == -1) {
            int i13 = f41152j + 51;
            f41149g = i13 % 128;
            int i14 = i13 % 2;
            i12 = 6;
        } else {
            int i15 = f41149g + 97;
            f41152j = i15 % 128;
            int i16 = i15 % 2;
        }
        return Math.round(i12 * c());
    }

    public static int B() {
        int i10 = FaceTecSDK.f40106a.f40083f.captureScreenTextBackgroundCornerRadius;
        if (i10 == -1) {
            int i11 = f41152j + 107;
            f41149g = i11 % 128;
            int i12 = i11 % 2;
            i10 = 6;
        }
        int iRound = Math.round(i10 * c());
        int i13 = f41149g + 3;
        f41152j = i13 % 128;
        if (i13 % 2 == 0) {
            int i14 = 40 / 0;
        }
        return iRound;
    }

    public static int C() {
        int i10 = f41149g + 51;
        f41152j = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = FaceTecSDK.f40106a.f40083f.buttonCornerRadius;
            throw null;
        }
        int i12 = FaceTecSDK.f40106a.f40083f.buttonCornerRadius;
        if (i12 == -1) {
            int i13 = f41152j + 13;
            f41149g = i13 % 128;
            int i14 = i13 % 2;
            i12 = 8;
        }
        return Math.round(i12 * c());
    }

    private static /* synthetic */ Object D(Object[] objArr) {
        int i10 = f41149g + 87;
        f41152j = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = FaceTecSDK.f40106a.f40084g.buttonBorderWidth;
            throw null;
        }
        int i12 = FaceTecSDK.f40106a.f40084g.buttonBorderWidth;
        if (i12 == -1) {
            int i13 = f41152j + 61;
            f41149g = i13 % 128;
            int i14 = i13 % 2;
            i12 = 0;
        }
        return Integer.valueOf(Math.max(i12 != 0 ? 1 : 0, Math.round(i12 * c())));
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    public static int E() {
        int i10;
        int i11 = f41152j + 15;
        f41149g = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 39 / 0;
            if (FaceTecSDK.f40106a.f40084g.inputFieldCornerRadius == -1) {
                i10 = 3;
            } else {
                i10 = FaceTecSDK.f40106a.f40084g.inputFieldCornerRadius;
                int i13 = f41149g + 81;
                f41152j = i13 % 128;
                int i14 = i13 % 2;
            }
        } else if (FaceTecSDK.f40106a.f40084g.inputFieldCornerRadius == -1) {
            i10 = 3;
        } else {
            i10 = FaceTecSDK.f40106a.f40084g.inputFieldCornerRadius;
            int i15 = f41149g + 81;
            f41152j = i15 % 128;
            int i16 = i15 % 2;
        }
        return Math.round(i10 * c());
    }

    public static int F() {
        return ((Integer) c(new Object[0], -1292905333, 1292905373, (int) System.currentTimeMillis())).intValue();
    }

    public static int G() {
        return ((Integer) c(new Object[0], 1487513195, -1487513153, (int) System.currentTimeMillis())).intValue();
    }

    public static int J() {
        int i10 = f41149g + 73;
        f41152j = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = bo().f40087j.foregroundColor;
            throw null;
        }
        int i12 = bo().f40087j.foregroundColor;
        int i13 = f41152j + 111;
        f41149g = i13 % 128;
        int i14 = i13 % 2;
        return i12;
    }

    public static int K() {
        int i10 = f41149g + 37;
        f41152j = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = FaceTecSDK.f40106a.f40086i.backgroundColors;
            ((Integer) c(new Object[]{Integer.valueOf(i11)}, 1987282240, -1987282205, i11)).intValue();
            throw null;
        }
        int i12 = FaceTecSDK.f40106a.f40086i.backgroundColors;
        int iIntValue = ((Integer) c(new Object[]{Integer.valueOf(i12)}, 1987282240, -1987282205, i12)).intValue();
        int i13 = f41149g + 49;
        f41152j = i13 % 128;
        int i14 = i13 % 2;
        return iIntValue;
    }

    public static int L() {
        return ((Integer) c(new Object[0], 1284309801, -1284309795, (int) System.currentTimeMillis())).intValue();
    }

    public static int O() {
        int i10 = f41152j + 69;
        f41149g = i10 % 128;
        int i11 = i10 % 2;
        int i12 = bo().f40086i.readyScreenTextBackgroundColor;
        int i13 = f41149g + 41;
        f41152j = i13 % 128;
        int i14 = i13 % 2;
        return i12;
    }

    public static int P() {
        int i10 = f41152j + 125;
        f41149g = i10 % 128;
        int i11 = i10 % 2;
        int i12 = bo().f40086i.buttonTextHighlightColor;
        int i13 = f41152j + 89;
        f41149g = i13 % 128;
        if (i13 % 2 == 0) {
            return i12;
        }
        throw null;
    }

    public static int Q() {
        int i10 = f41152j + 53;
        f41149g = i10 % 128;
        if (i10 % 2 == 0) {
            return bo().f40086i.buttonTextNormalColor;
        }
        int i11 = 94 / 0;
        return bo().f40086i.buttonTextNormalColor;
    }

    public static int R() {
        int i10 = f41149g + 111;
        f41152j = i10 % 128;
        int i11 = i10 % 2;
        int i12 = bo().f40087j.activityIndicatorColor;
        int i13 = f41149g + 3;
        f41152j = i13 % 128;
        if (i13 % 2 != 0) {
            return i12;
        }
        throw null;
    }

    public static int S() {
        return ((Integer) c(new Object[0], -754104162, 754104165, (int) System.currentTimeMillis())).intValue();
    }

    public static int T() {
        int i10 = f41149g + 57;
        f41152j = i10 % 128;
        int i11 = i10 % 2;
        int i12 = bo().f40086i.buttonTextDisabledColor;
        int i13 = f41152j + 103;
        f41149g = i13 % 128;
        int i14 = i13 % 2;
        return i12;
    }

    public static int U() {
        int i10 = f41149g + 49;
        f41152j = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = bo().f40086i.buttonBackgroundDisabledColor;
            throw null;
        }
        int i12 = bo().f40086i.buttonBackgroundDisabledColor;
        int i13 = f41149g + 67;
        f41152j = i13 % 128;
        if (i13 % 2 == 0) {
            int i14 = 88 / 0;
        }
        return i12;
    }

    public static int V() {
        return ((Integer) c(new Object[0], 1586402759, -1586402755, (int) System.currentTimeMillis())).intValue();
    }

    public static int W() {
        int i10 = f41149g + 67;
        f41152j = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = bo().f40086i.buttonBorderColor;
            throw null;
        }
        int i12 = bo().f40086i.buttonBorderColor;
        int i13 = f41152j + 75;
        f41149g = i13 % 128;
        if (i13 % 2 == 0) {
            return i12;
        }
        throw null;
    }

    public static int X() {
        int i10 = f41149g + 33;
        f41152j = i10 % 128;
        int i11 = i10 % 2;
        int i12 = bo().f40086i.buttonBackgroundNormalColor;
        int i13 = f41149g + 15;
        f41152j = i13 % 128;
        int i14 = i13 % 2;
        return i12;
    }

    public static int Y() {
        int i10 = f41149g + 81;
        f41152j = i10 % 128;
        int i11 = i10 % 2;
        int i12 = bo().f40083f.buttonTextHighlightColor;
        int i13 = f41149g + 13;
        f41152j = i13 % 128;
        int i14 = i13 % 2;
        return i12;
    }

    public static int Z() {
        int i10 = f41152j + 85;
        f41149g = i10 % 128;
        int i11 = i10 % 2;
        int i12 = bo().f40083f.buttonTextDisabledColor;
        int i13 = f41149g + 57;
        f41152j = i13 % 128;
        int i14 = i13 % 2;
        return i12;
    }

    public static synchronized float a() {
        float fFloatValue;
        try {
            int i10 = f41149g + 49;
            f41152j = i10 % 128;
            if (i10 % 2 == 0) {
                fFloatValue = f41145b.c(new p7()).floatValue();
                int i11 = 20 / 0;
            } else {
                fFloatValue = f41145b.c(new p7()).floatValue();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return fFloatValue;
    }

    public static int aA() {
        int i10 = f41149g + 93;
        f41152j = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = bo().f40083f.captureScreenTextBackgroundBorderColor;
            throw null;
        }
        int i12 = bo().f40083f.captureScreenTextBackgroundBorderColor;
        int i13 = f41152j + 55;
        f41149g = i13 % 128;
        if (i13 % 2 == 0) {
            return i12;
        }
        throw null;
    }

    public static int aB() {
        int i10 = f41149g + 125;
        f41152j = i10 % 128;
        if (i10 % 2 != 0) {
            return bo().f40083f.captureScreenTextBackgroundColor;
        }
        int i11 = bo().f40083f.captureScreenTextBackgroundColor;
        throw null;
    }

    public static int aC() {
        int i10 = bo().f40085h.brandingImage;
        if (i10 != 0) {
            return i10;
        }
        int i11 = f41149g + 47;
        f41152j = i11 % 128;
        int i12 = i11 % 2;
        int i13 = FaceTecSDK.f40106a.f40085h.brandingImage;
        int i14 = f41152j + 115;
        f41149g = i14 % 128;
        int i15 = i14 % 2;
        return i13;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0025  */
    public static int aD() {
        int i10;
        int i11 = f41152j + 75;
        f41149g = i11 % 128;
        if (i11 % 2 != 0) {
            i10 = bo().f40083f.selectionScreenBrandingImage;
            int i12 = 28 / 0;
            if (i10 == 0) {
                i10 = FaceTecSDK.f40106a.f40083f.selectionScreenBrandingImage;
            }
        } else {
            i10 = bo().f40083f.selectionScreenBrandingImage;
            if (i10 == 0) {
                i10 = FaceTecSDK.f40106a.f40083f.selectionScreenBrandingImage;
            }
        }
        int i13 = f41152j + 1;
        f41149g = i13 % 128;
        if (i13 % 2 != 0) {
            int i14 = 10 / 0;
        }
        return i10;
    }

    public static int aE() {
        int i10 = f41152j + 63;
        f41149g = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = bo().f40083f.selectionScreenDocumentImage;
            throw null;
        }
        int i12 = bo().f40083f.selectionScreenDocumentImage;
        if (i12 != 0) {
            return i12;
        }
        int i13 = FaceTecSDK.f40106a.f40083f.selectionScreenDocumentImage;
        int i14 = f41149g + 37;
        f41152j = i14 % 128;
        int i15 = i14 % 2;
        return i13;
    }

    public static int aF() {
        int i10 = f41152j + 67;
        f41149g = i10 % 128;
        int i11 = i10 % 2;
        int i12 = bo().f40083f.inactiveTorchButtonImage;
        if (i12 == 0) {
            int i13 = f41152j + 7;
            f41149g = i13 % 128;
            if (i13 % 2 != 0) {
                i12 = FaceTecSDK.f40106a.f40083f.inactiveTorchButtonImage;
                int i14 = 68 / 0;
            } else {
                i12 = FaceTecSDK.f40106a.f40083f.inactiveTorchButtonImage;
            }
        }
        int i15 = f41149g + 43;
        f41152j = i15 % 128;
        int i16 = i15 % 2;
        return i12;
    }

    public static int aG() {
        int i10 = f41152j + 39;
        f41149g = i10 % 128;
        int i11 = i10 % 2;
        int i12 = bo().f40083f.activeTorchButtonImage;
        if (i12 == 0) {
            int i13 = f41152j + 51;
            f41149g = i13 % 128;
            int i14 = i13 % 2;
            i12 = FaceTecSDK.f40106a.f40083f.activeTorchButtonImage;
        }
        int i15 = f41152j + 31;
        f41149g = i15 % 128;
        int i16 = i15 % 2;
        return i12;
    }

    public static int aH() {
        int i10 = f41152j + 11;
        f41149g = i10 % 128;
        int i11 = i10 % 2;
        int i12 = bo().f40090n.customImage;
        if (i12 != 0) {
            return i12;
        }
        int i13 = f41149g + 109;
        f41152j = i13 % 128;
        if (i13 % 2 != 0) {
            return FaceTecSDK.f40106a.f40090n.customImage;
        }
        int i14 = FaceTecSDK.f40106a.f40090n.customImage;
        throw null;
    }

    public static int aI() {
        int i10 = f41149g + 61;
        f41152j = i10 % 128;
        int i11 = i10 % 2;
        int i12 = bo().f40084g.customStaticScrollIndicatorAnimation;
        if (i12 != 0) {
            return i12;
        }
        int i13 = f41149g + 89;
        f41152j = i13 % 128;
        int i14 = i13 % 2;
        int i15 = FaceTecSDK.f40106a.f40084g.customStaticScrollIndicatorAnimation;
        int i16 = f41149g + 33;
        f41152j = i16 % 128;
        int i17 = i16 % 2;
        return i15;
    }

    public static int aJ() {
        int i10 = f41152j + 111;
        f41149g = i10 % 128;
        int i11 = i10 % 2;
        int iB = b(bo().m.customAnimation, FaceTecSDK.f40106a.m.customAnimation);
        int i12 = f41152j + 57;
        f41149g = i12 % 128;
        if (i12 % 2 == 0) {
            return iB;
        }
        throw null;
    }

    public static int aK() {
        int i10 = bo().f40084g.customScrollIndicatorAnimation;
        if (i10 != 0) {
            return i10;
        }
        int i11 = f41149g + 73;
        f41152j = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = FaceTecSDK.f40106a.f40084g.customScrollIndicatorAnimation;
            throw null;
        }
        int i13 = FaceTecSDK.f40106a.f40084g.customScrollIndicatorAnimation;
        int i14 = f41152j + 103;
        f41149g = i14 % 128;
        int i15 = i14 % 2;
        return i13;
    }

    public static int aL() {
        int iB;
        int i10 = f41152j + 103;
        f41149g = i10 % 128;
        if (i10 % 2 != 0) {
            iB = b(bo().m.customAnimationImage, FaceTecSDK.f40106a.m.customAnimationImage);
            int i11 = 44 / 0;
        } else {
            iB = b(bo().m.customAnimationImage, FaceTecSDK.f40106a.m.customAnimationImage);
        }
        int i12 = f41149g + 67;
        f41152j = i12 % 128;
        if (i12 % 2 != 0) {
            return iB;
        }
        throw null;
    }

    public static int aM() {
        int i10 = f41152j + 23;
        f41149g = i10 % 128;
        int i11 = i10 % 2;
        int i12 = bo().f40086i.retryScreenIdealImage;
        if (i12 == 0) {
            int i13 = f41149g + 99;
            f41152j = i13 % 128;
            int i14 = i13 % 2;
            i12 = FaceTecSDK.f40106a.f40086i.retryScreenIdealImage;
        }
        if (i12 != 0) {
            return i12;
        }
        int i15 = R.drawable.facetec_ideal_pose_image;
        int i16 = f41149g + 125;
        f41152j = i16 % 128;
        int i17 = i16 % 2;
        return i15;
    }

    public static int aN() {
        return ((Integer) c(new Object[0], -887973215, 887973237, (int) System.currentTimeMillis())).intValue();
    }

    public static int aO() {
        int i10 = f41152j + 41;
        f41149g = i10 % 128;
        int i11 = i10 % 2;
        int i12 = bo().f40087j.customActivityIndicatorImage;
        if (i12 == 0) {
            int i13 = f41152j + 27;
            f41149g = i13 % 128;
            int i14 = i13 % 2;
            i12 = FaceTecSDK.f40106a.f40087j.customActivityIndicatorImage;
        }
        int i15 = f41149g + 91;
        f41152j = i15 % 128;
        int i16 = i15 % 2;
        return i12;
    }

    public static int aP() {
        int i10 = bo().f40087j.resultAnimationSuccessBackgroundImage;
        if (i10 == 0) {
            int i11 = f41149g + 1;
            f41152j = i11 % 128;
            int i12 = i11 % 2;
            i10 = FaceTecSDK.f40106a.f40087j.resultAnimationSuccessBackgroundImage;
        }
        int i13 = f41149g + 43;
        f41152j = i13 % 128;
        int i14 = i13 % 2;
        return i10;
    }

    public static int[] aQ() {
        int i10 = f41152j + 5;
        f41149g = i10 % 128;
        if (i10 % 2 != 0) {
            int length = bo().f40086i.retryScreenSlideshowImages.length;
            throw null;
        }
        int[] iArr = bo().f40086i.retryScreenSlideshowImages;
        if (iArr.length == 0) {
            iArr = FaceTecSDK.f40106a.f40086i.retryScreenSlideshowImages;
            int i11 = f41149g + 89;
            f41152j = i11 % 128;
            int i12 = i11 % 2;
        }
        int i13 = f41149g + 57;
        f41152j = i13 % 128;
        if (i13 % 2 != 0) {
            return iArr;
        }
        throw null;
    }

    public static int aR() {
        int i10 = f41152j + 75;
        f41149g = i10 % 128;
        if (i10 % 2 == 0) {
            return bo().f40083f.additionalReviewScreenAnimation;
        }
        int i11 = bo().f40083f.additionalReviewScreenAnimation;
        throw null;
    }

    public static int aS() {
        int i10 = f41149g + 75;
        int i11 = i10 % 128;
        f41152j = i11;
        int i12 = i10 % 2 == 0 ? 3749 : 255;
        int i13 = i11 + 109;
        f41149g = i13 % 128;
        if (i13 % 2 == 0) {
            return i12;
        }
        throw null;
    }

    public static int aT() {
        int i10 = f41152j + 33;
        f41149g = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = FaceTecSDK.f40106a.f40086i.cameraPermissionsScreenImage;
            throw null;
        }
        int i12 = FaceTecSDK.f40106a.f40086i.cameraPermissionsScreenImage;
        if (i12 != 0) {
            return i12;
        }
        int i13 = R.drawable.facetec_camera;
        int i14 = f41149g + 5;
        f41152j = i14 % 128;
        int i15 = i14 % 2;
        return i13;
    }

    public static int aU() {
        int i10 = f41149g + 27;
        f41152j = i10 % 128;
        int i11 = i10 % 2;
        int i12 = bo().f40083f.additionalReviewScreenStaticAnimation;
        int i13 = f41149g + 111;
        f41152j = i13 % 128;
        if (i13 % 2 != 0) {
            return i12;
        }
        throw null;
    }

    public static int aV() {
        int i10 = f41149g + 53;
        f41152j = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = bo().f40083f.additionalReviewScreenImage;
            throw null;
        }
        int i12 = bo().f40083f.additionalReviewScreenImage;
        if (i12 != 0) {
            return i12;
        }
        int i13 = R.drawable.facetec_review;
        int i14 = f41152j + 107;
        f41149g = i14 % 128;
        int i15 = i14 % 2;
        return i13;
    }

    public static int aW() {
        int i10 = f41152j + 57;
        f41149g = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = bo().f40083f.customNFCCardStartingAnimation;
            throw null;
        }
        int i12 = bo().f40083f.customNFCCardStartingAnimation;
        int i13 = f41149g + 27;
        f41152j = i13 % 128;
        int i14 = i13 % 2;
        return i12;
    }

    public static int aX() {
        int i10 = f41149g + 99;
        f41152j = i10 % 128;
        if (i10 % 2 != 0) {
            return bo().f40083f.customNFCSkipOrErrorAnimation;
        }
        int i11 = 61 / 0;
        return bo().f40083f.customNFCSkipOrErrorAnimation;
    }

    public static int aY() {
        return ((Integer) c(new Object[0], 530330153, -530330133, (int) System.currentTimeMillis())).intValue();
    }

    public static int aZ() {
        int i10 = f41149g + 47;
        f41152j = i10 % 128;
        if (i10 % 2 != 0) {
            return bo().f40083f.customNFCCardScanningAnimation;
        }
        int i11 = bo().f40083f.customNFCCardScanningAnimation;
        throw null;
    }

    public static int aa() {
        int i10 = f41152j + 7;
        f41149g = i10 % 128;
        int i11 = i10 % 2;
        int i12 = bo().f40083f.buttonBackgroundNormalColor;
        int i13 = f41152j + 91;
        f41149g = i13 % 128;
        int i14 = i13 % 2;
        return i12;
    }

    public static int ab() {
        return ((Integer) c(new Object[0], -75853599, 75853617, (int) System.currentTimeMillis())).intValue();
    }

    public static int ac() {
        int i10 = f41149g + 117;
        f41152j = i10 % 128;
        int i11 = i10 % 2;
        int i12 = bo().f40083f.buttonBackgroundHighlightColor;
        int i13 = f41152j + 67;
        f41149g = i13 % 128;
        if (i13 % 2 == 0) {
            return i12;
        }
        throw null;
    }

    public static int ad() {
        int i10 = f41152j + 59;
        f41149g = i10 % 128;
        int i11 = i10 % 2;
        int i12 = bo().f40083f.buttonBackgroundDisabledColor;
        int i13 = f41152j + 113;
        f41149g = i13 % 128;
        if (i13 % 2 == 0) {
            return i12;
        }
        throw null;
    }

    public static int ae() {
        return ((Integer) c(new Object[0], -312411180, 312411208, (int) System.currentTimeMillis())).intValue();
    }

    public static int af() {
        int i10 = f41152j + 109;
        f41149g = i10 % 128;
        if (i10 % 2 == 0) {
            return bo().f40084g.buttonTextHighlightColor;
        }
        int i11 = bo().f40084g.buttonTextHighlightColor;
        throw null;
    }

    public static int ag() {
        int i10 = f41152j + 55;
        f41149g = i10 % 128;
        if (i10 % 2 == 0) {
            return bo().f40084g.buttonTextDisabledColor;
        }
        int i11 = bo().f40084g.buttonTextDisabledColor;
        throw null;
    }

    public static int ah() {
        int i10 = f41152j + 45;
        f41149g = i10 % 128;
        int i11 = i10 % 2;
        int i12 = bo().f40084g.buttonTextNormalColor;
        int i13 = f41152j + 43;
        f41149g = i13 % 128;
        if (i13 % 2 == 0) {
            return i12;
        }
        throw null;
    }

    public static int ai() {
        int i10 = f41152j + 11;
        f41149g = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = bo().f40084g.buttonBorderColor;
            throw null;
        }
        int i12 = bo().f40084g.buttonBorderColor;
        int i13 = f41152j + 119;
        f41149g = i13 % 128;
        int i14 = i13 % 2;
        return i12;
    }

    public static int aj() {
        int i10 = f41149g + 93;
        f41152j = i10 % 128;
        int i11 = i10 % 2;
        int i12 = bo().f40084g.mainHeaderDividerLineColor;
        int i13 = f41152j + 89;
        f41149g = i13 % 128;
        int i14 = i13 % 2;
        return i12;
    }

    public static int ak() {
        int i10 = f41149g + 111;
        f41152j = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = bo().f40084g.buttonBackgroundNormalColor;
            throw null;
        }
        int i12 = bo().f40084g.buttonBackgroundNormalColor;
        int i13 = f41149g + 109;
        f41152j = i13 % 128;
        int i14 = i13 % 2;
        return i12;
    }

    public static int al() {
        int i10 = f41149g + 49;
        f41152j = i10 % 128;
        if (i10 % 2 != 0) {
            return bo().f40084g.buttonBackgroundDisabledColor;
        }
        int i11 = bo().f40084g.buttonBackgroundDisabledColor;
        throw null;
    }

    public static int am() {
        int i10 = f41152j + 49;
        f41149g = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = bo().f40084g.buttonBackgroundHighlightColor;
            throw null;
        }
        int i12 = bo().f40084g.buttonBackgroundHighlightColor;
        int i13 = f41149g + 75;
        f41152j = i13 % 128;
        int i14 = i13 % 2;
        return i12;
    }

    public static int an() {
        int i10 = f41152j + 1;
        f41149g = i10 % 128;
        if (i10 % 2 == 0) {
            return bo().f40084g.fieldLabelTextColor;
        }
        int i11 = bo().f40084g.fieldLabelTextColor;
        throw null;
    }

    public static int ao() {
        int i10 = f41149g + 73;
        f41152j = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = bo().f40084g.sectionHeaderTextColor;
            throw null;
        }
        int i12 = bo().f40084g.sectionHeaderTextColor;
        int i13 = f41152j + 119;
        f41149g = i13 % 128;
        int i14 = i13 % 2;
        return i12;
    }

    public static int ap() {
        int i10 = f41149g + 25;
        f41152j = i10 % 128;
        if (i10 % 2 != 0) {
            return bo().f40084g.mainHeaderTextColor;
        }
        int i11 = bo().f40084g.mainHeaderTextColor;
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0031  */
    /* JADX WARN: Code duplicated, block: B:12:0x0036  */
    /* JADX WARN: Code duplicated, block: B:9:0x0025  */
    public static int aq() {
        int iBT;
        int i10;
        int i11 = f41152j + 13;
        f41149g = i11 % 128;
        if (i11 % 2 != 0) {
            iBT = bo().f40084g.inputFieldTextColor;
            int i12 = 57 / 0;
            if (iBT == 0) {
                i10 = f41149g + 123;
                f41152j = i10 % 128;
                if (i10 % 2 != 0) {
                    bT();
                    throw null;
                }
                iBT = bT();
            }
        } else {
            iBT = bo().f40084g.inputFieldTextColor;
            if (iBT == 0) {
                i10 = f41149g + 123;
                f41152j = i10 % 128;
                if (i10 % 2 != 0) {
                    bT();
                    throw null;
                }
                iBT = bT();
            }
        }
        int i13 = f41152j + 9;
        f41149g = i13 % 128;
        int i14 = i13 % 2;
        return iBT;
    }

    public static int ar() {
        int i10 = f41149g + 13;
        f41152j = i10 % 128;
        int i11 = i10 % 2;
        int i12 = bo().f40084g.inputFieldBackgroundColor;
        int i13 = f41149g + 5;
        f41152j = i13 % 128;
        int i14 = i13 % 2;
        return i12;
    }

    public static int as() {
        int i10 = f41152j + 5;
        f41149g = i10 % 128;
        if (i10 % 2 == 0) {
            return bo().f40084g.inputFieldBorderColor;
        }
        int i11 = bo().f40084g.inputFieldBorderColor;
        throw null;
    }

    public static int at() {
        int i10 = f41149g + 51;
        f41152j = i10 % 128;
        if (i10 % 2 != 0) {
            return bo().f40084g.scrollIndicatorBorderColor;
        }
        int i11 = bo().f40084g.scrollIndicatorBorderColor;
        throw null;
    }

    public static int au() {
        return ((Integer) c(new Object[0], -408862161, 408862171, (int) System.currentTimeMillis())).intValue();
    }

    public static int av() {
        int i10 = f41149g + 109;
        f41152j = i10 % 128;
        int i11 = i10 % 2;
        int i12 = bo().f40084g.scrollIndicatorBackgroundHighlightColor;
        int i13 = f41152j + 57;
        f41149g = i13 % 128;
        if (i13 % 2 == 0) {
            return i12;
        }
        throw null;
    }

    public static int aw() {
        int i10 = f41152j + 103;
        f41149g = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = bo().f40084g.scrollIndicatorForegroundNormalColor;
            throw null;
        }
        int i12 = bo().f40084g.scrollIndicatorForegroundNormalColor;
        int i13 = f41149g + 7;
        f41152j = i13 % 128;
        if (i13 % 2 != 0) {
            return i12;
        }
        throw null;
    }

    public static int ax() {
        int i10 = f41149g + 89;
        f41152j = i10 % 128;
        int i11 = i10 % 2;
        int i12 = bo().f40083f.reviewScreenTextBackgroundColor;
        int i13 = f41149g + 99;
        f41152j = i13 % 128;
        int i14 = i13 % 2;
        return i12;
    }

    public static int ay() {
        int i10 = f41149g + 93;
        f41152j = i10 % 128;
        if (i10 % 2 != 0) {
            return bo().f40084g.scrollIndicatorForegroundHighlightColor;
        }
        int i11 = bo().f40084g.scrollIndicatorForegroundHighlightColor;
        throw null;
    }

    public static int az() {
        int i10 = f41149g + 121;
        f41152j = i10 % 128;
        if (i10 % 2 != 0) {
            return bo().f40083f.reviewScreenTextBackgroundBorderColor;
        }
        int i11 = 60 / 0;
        return bo().f40083f.reviewScreenTextBackgroundBorderColor;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        int i10 = f41149g + 17;
        f41152j = i10 % 128;
        if (i10 % 2 != 0) {
            return Resources.getSystem().getDisplayMetrics();
        }
        int i11 = 44 / 0;
        return Resources.getSystem().getDisplayMetrics();
    }

    private static int bA() {
        return ((Integer) c(new Object[0], 45844550, -45844549, (int) System.currentTimeMillis())).intValue();
    }

    public static Typeface bA_() {
        int i10 = f41152j + 65;
        f41149g = i10 % 128;
        int i11 = i10 % 2;
        FaceTecGuidanceCustomization faceTecGuidanceCustomization = FaceTecSDK.f40106a.f40086i;
        Typeface typeface = faceTecGuidanceCustomization.retryScreenHeaderFont;
        if (typeface == null) {
            int i12 = f41149g + 59;
            f41152j = i12 % 128;
            int i13 = i12 % 2;
            typeface = faceTecGuidanceCustomization.headerFont;
        }
        int i14 = f41149g + 93;
        f41152j = i14 % 128;
        int i15 = i14 % 2;
        return typeface;
    }

    private static int bB() {
        int i10 = f41149g + 93;
        f41152j = i10 % 128;
        int i11 = i10 % 2;
        int i12 = bo().f40086i.retryScreenSubtextTextColor;
        int i13 = f41149g + 53;
        f41152j = i13 % 128;
        int i14 = i13 % 2;
        return i12;
    }

    public static Typeface bB_() {
        int i10 = f41152j + 5;
        f41149g = i10 % 128;
        if (i10 % 2 != 0) {
            Typeface typeface = FaceTecSDK.f40106a.f40086i.retryScreenSubtextFont;
            throw null;
        }
        FaceTecGuidanceCustomization faceTecGuidanceCustomization = FaceTecSDK.f40106a.f40086i;
        Typeface typeface2 = faceTecGuidanceCustomization.retryScreenSubtextFont;
        if (typeface2 == null) {
            typeface2 = faceTecGuidanceCustomization.subtextFont;
            int i11 = f41152j + 47;
            f41149g = i11 % 128;
            int i12 = i11 % 2;
        }
        int i13 = f41152j + 9;
        f41149g = i13 % 128;
        int i14 = i13 % 2;
        return typeface2;
    }

    private static int bC() {
        int i10 = f41152j + 123;
        f41149g = i10 % 128;
        if (i10 % 2 == 0) {
            return bo().f40086i.readyScreenOvalFillColor;
        }
        int i11 = 20 / 0;
        return bo().f40086i.readyScreenOvalFillColor;
    }

    public static void bC_(@NonNull TextView textView) {
        c(new Object[]{textView}, 166285300, -166285292, (int) System.currentTimeMillis());
    }

    private static int bD() {
        return ((Integer) c(new Object[0], -1479778239, 1479778254, (int) System.currentTimeMillis())).intValue();
    }

    @NonNull
    public static Drawable bD_(@NonNull Context context) {
        int i10 = f41149g + 29;
        f41152j = i10 % 128;
        int i11 = i10 % 2;
        int iK = K();
        if (AnonymousClass3.f41154c[a(context, iK).ordinal()] == 1) {
            if (ContextCompat.getDrawable(context, iK) == null) {
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(a(ContextCompat.getColor(context, iK), 255));
                return gradientDrawable;
            }
            Drawable drawableMutate = ContextCompat.getDrawable(context, iK).mutate();
            if (drawableMutate instanceof ShapeDrawable) {
                ((ShapeDrawable) drawableMutate).getPaint().setAlpha(255);
                return drawableMutate;
            }
            if (drawableMutate instanceof GradientDrawable) {
                return bE_(context, (GradientDrawable) drawableMutate);
            }
            if (drawableMutate instanceof ColorDrawable) {
                int i12 = f41149g + 19;
                f41152j = i12 % 128;
                if (i12 % 2 == 0) {
                    drawableMutate.setAlpha(19641);
                } else {
                    drawableMutate.setAlpha(255);
                }
                int i13 = f41152j + 53;
                f41149g = i13 % 128;
                int i14 = i13 % 2;
                return drawableMutate;
            }
        }
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(a(iK, 255));
        return gradientDrawable2;
    }

    private static int bE() {
        return ((Integer) c(new Object[0], 1818958898, -1818958885, (int) System.currentTimeMillis())).intValue();
    }

    @NonNull
    private static GradientDrawable bE_(@NonNull Context context, @NonNull GradientDrawable gradientDrawable) {
        if (Build.VERSION.SDK_INT >= 24) {
            int i10 = f41152j + 93;
            f41149g = i10 % 128;
            int i11 = i10 % 2;
            int[] colors = gradientDrawable.getColors();
            if (colors != null) {
                int i12 = 0;
                while (i12 < colors.length) {
                    int i13 = AnonymousClass3.f41154c[a(context, colors[i12]).ordinal()];
                    if (i13 == 1) {
                        colors[i12] = a(ContextCompat.getColor(context, colors[i12]), 255);
                    } else if (i13 == 2) {
                        colors[i12] = a(colors[i12], 255);
                    }
                    i12++;
                    int i14 = f41149g + 61;
                    f41152j = i14 % 128;
                    int i15 = i14 % 2;
                }
            }
            gradientDrawable.setColors(colors);
        } else {
            gradientDrawable.setColor(a(k(context), 255));
        }
        return gradientDrawable;
    }

    private static int bF() {
        int i10 = f41149g + 97;
        f41152j = i10 % 128;
        int i11 = i10 % 2;
        int i12 = bo().f40087j.uploadProgressTrackColor;
        int i13 = f41149g + 113;
        f41152j = i13 % 128;
        int i14 = i13 % 2;
        return i12;
    }

    public static void bF_(Drawable drawable, int i10) {
        if (drawable instanceof GradientDrawable) {
            ((GradientDrawable) drawable).setColor(i10);
            int i11 = f41149g + 35;
            f41152j = i11 % 128;
            int i12 = i11 % 2;
            return;
        }
        if (!(drawable instanceof ColorDrawable)) {
            if (drawable instanceof ShapeDrawable) {
                ((ShapeDrawable) drawable).getPaint().setColor(i10);
            }
        } else {
            ((ColorDrawable) drawable).setColor(i10);
            int i13 = f41149g + 115;
            f41152j = i13 % 128;
            int i14 = i13 % 2;
        }
    }

    private static int bG() {
        int i10 = f41152j + 87;
        f41149g = i10 % 128;
        int i11 = i10 % 2;
        int i12 = bo().m.defaultAnimationForegroundColor;
        int i13 = f41149g + 77;
        f41152j = i13 % 128;
        if (i13 % 2 != 0) {
            return i12;
        }
        throw null;
    }

    public static void bG_(@NonNull TextView textView) {
        int i10 = f41149g + 1;
        f41152j = i10 % 128;
        if (i10 % 2 != 0) {
            bO_(textView, J());
        } else {
            bO_(textView, J());
            throw null;
        }
    }

    private static int bH() {
        return ((Integer) c(new Object[0], 16346167, -16346137, (int) System.currentTimeMillis())).intValue();
    }

    public static void bH_(@NonNull ProgressBar progressBar, @NonNull Drawable drawable) {
        int iBF = bF();
        int i10 = AnonymousClass3.f41154c[a(progressBar.getContext(), iBF).ordinal()];
        if (i10 == 1) {
            ((GradientDrawable) drawable).setColor(ContextCompat.getColor(progressBar.getContext(), iBF));
            return;
        }
        if (i10 == 2) {
            ((GradientDrawable) drawable).setColor(iBF);
            int i11 = f41152j + 85;
            f41149g = i11 % 128;
            int i12 = i11 % 2;
        }
        int i13 = f41152j + 79;
        f41149g = i13 % 128;
        if (i13 % 2 != 0) {
            int i14 = 11 / 0;
        }
    }

    private static int bI() {
        return ((Integer) c(new Object[0], 1345592339, -1345592301, (int) System.currentTimeMillis())).intValue();
    }

    public static void bI_(@NonNull ProgressBar progressBar, @NonNull Drawable drawable, @NonNull Drawable drawable2) {
        int i10 = f41149g + 5;
        f41152j = i10 % 128;
        int i11 = i10 % 2;
        int iBL = bL();
        int i12 = AnonymousClass3.f41154c[a(progressBar.getContext(), iBL).ordinal()];
        if (i12 == 1) {
            ((GradientDrawable) drawable).setColor(ContextCompat.getColor(progressBar.getContext(), iBL));
            ((GradientDrawable) drawable2).setColor(c(ContextCompat.getColor(progressBar.getContext(), iBL), 0.5f));
        } else {
            if (i12 != 2) {
                return;
            }
            ((GradientDrawable) drawable).setColor(iBL);
            ((GradientDrawable) drawable2).setColor(c(iBL, 0.5f));
            int i13 = f41149g + 71;
            f41152j = i13 % 128;
            int i14 = i13 % 2;
        }
    }

    private static int bJ() {
        return ((Integer) c(new Object[0], -1661511514, 1661511539, (int) System.currentTimeMillis())).intValue();
    }

    public static void bJ_(@NonNull TextView textView) {
        int i10 = f41152j + 119;
        f41149g = i10 % 128;
        if (i10 % 2 != 0) {
            bO_(textView, bN());
            throw null;
        }
        bO_(textView, bN());
        int i11 = f41152j + 85;
        f41149g = i11 % 128;
        int i12 = i11 % 2;
    }

    private static int bK() {
        int i10 = f41152j + 21;
        f41149g = i10 % 128;
        if (i10 % 2 == 0) {
            return bo().f40086i.retryScreenImageBorderColor;
        }
        int i11 = 11 / 0;
        return bo().f40086i.retryScreenImageBorderColor;
    }

    public static void bK_(@NonNull TextView textView) {
        int i10 = f41152j + 39;
        f41149g = i10 % 128;
        if (i10 % 2 == 0) {
            bO_(textView, ((Integer) c(new Object[0], -579591284, 579591284, (int) System.currentTimeMillis())).intValue());
        } else {
            bO_(textView, ((Integer) c(new Object[0], -579591284, 579591284, (int) System.currentTimeMillis())).intValue());
            int i11 = 44 / 0;
        }
    }

    private static int bL() {
        int i10 = f41152j + 61;
        f41149g = i10 % 128;
        int i11 = i10 % 2;
        int i12 = bo().f40087j.uploadProgressFillColor;
        int i13 = f41152j + 109;
        f41149g = i13 % 128;
        if (i13 % 2 == 0) {
            return i12;
        }
        throw null;
    }

    public static void bL_(@NonNull TextView textView) {
        int i10 = f41152j + 119;
        f41149g = i10 % 128;
        if (i10 % 2 == 0) {
            bO_(textView, bQ());
        } else {
            bO_(textView, bQ());
            throw null;
        }
    }

    private static int bM() {
        return ((Integer) c(new Object[0], -1303469013, 1303469052, (int) System.currentTimeMillis())).intValue();
    }

    public static void bM_(@NonNull TextView textView) {
        int i10 = f41149g + 19;
        f41152j = i10 % 128;
        if (i10 % 2 != 0) {
            bO_(textView, bY());
        } else {
            bO_(textView, bY());
            throw null;
        }
    }

    private static int bN() {
        int i10 = f41149g + 53;
        f41152j = i10 % 128;
        if (i10 % 2 != 0) {
            return bo().f40088k.textColor;
        }
        int i11 = bo().f40088k.textColor;
        throw null;
    }

    public static void bN_(@NonNull TextView textView) {
        int i10 = f41152j + 5;
        f41149g = i10 % 128;
        int i11 = i10 % 2;
        bO_(textView, ((Integer) c(new Object[0], -794201359, 794201395, (int) System.currentTimeMillis())).intValue());
        int i12 = f41149g + 63;
        f41152j = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
    }

    private static int bO() {
        return ((Integer) c(new Object[0], 918655258, -918655235, (int) System.currentTimeMillis())).intValue();
    }

    public static void bO_(@NonNull TextView textView, int i10) {
        int i11 = f41152j + 105;
        f41149g = i11 % 128;
        int i12 = i11 % 2;
        int i13 = AnonymousClass3.f41154c[a(textView.getContext(), i10).ordinal()];
        if (i13 != 1) {
            if (i13 != 2) {
                return;
            }
            textView.setTextColor(i10);
        } else {
            textView.setTextColor(ContextCompat.getColor(textView.getContext(), i10));
            int i14 = f41149g + 105;
            f41152j = i14 % 128;
            if (i14 % 2 == 0) {
                throw null;
            }
        }
    }

    private static int bP() {
        int i10 = f41152j + 101;
        f41149g = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = FaceTecSDK.f40106a.f40083f.selectionScreenBackgroundColors;
            ((Integer) c(new Object[]{Integer.valueOf(i11)}, 1987282240, -1987282205, i11)).intValue();
            throw null;
        }
        int i12 = FaceTecSDK.f40106a.f40083f.selectionScreenBackgroundColors;
        int iIntValue = ((Integer) c(new Object[]{Integer.valueOf(i12)}, 1987282240, -1987282205, i12)).intValue();
        int i13 = f41152j + 15;
        f41149g = i13 % 128;
        int i14 = i13 % 2;
        return iIntValue;
    }

    public static void bP_(Drawable drawable, int i10) {
        c(new Object[]{drawable, Integer.valueOf(i10)}, -113975920, 113975965, i10);
    }

    private static int bQ() {
        int i10 = f41149g + 115;
        f41152j = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = bo().f40083f.reviewScreenForegroundColor;
            throw null;
        }
        int i12 = bo().f40083f.reviewScreenForegroundColor;
        int i13 = f41149g + 77;
        f41152j = i13 % 128;
        if (i13 % 2 != 0) {
            return i12;
        }
        throw null;
    }

    public static void bQ_(Drawable drawable, int i10, int i11, double d2) {
        c(new Object[]{drawable, Integer.valueOf(i10), Integer.valueOf(i11), Double.valueOf(d2)}, -469893939, 469893965, i10);
    }

    private static int bR() {
        int i10 = f41149g + 49;
        f41152j = i10 % 128;
        int i11 = i10 % 2;
        int i12 = FaceTecSDK.f40106a.f40084g.backgroundColors;
        int iIntValue = ((Integer) c(new Object[]{Integer.valueOf(i12)}, 1987282240, -1987282205, i12)).intValue();
        int i13 = f41152j + 105;
        f41149g = i13 % 128;
        int i14 = i13 % 2;
        return iIntValue;
    }

    public static void bR_(@NonNull Context context, @NonNull TextView textView, Drawable drawable, int i10) {
        int i11 = AnonymousClass3.f41154c[a(textView.getContext(), i10).ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                return;
            }
            if (drawable instanceof ShapeDrawable) {
                ((ShapeDrawable) drawable).getPaint().setColor(i10);
                return;
            }
            if (drawable instanceof GradientDrawable) {
                ((GradientDrawable) drawable).setColor(i10);
                return;
            }
            if (drawable instanceof ColorDrawable) {
                int i12 = f41152j + 41;
                f41149g = i12 % 128;
                if (i12 % 2 == 0) {
                    ((ColorDrawable) drawable).setColor(i10);
                    return;
                } else {
                    ((ColorDrawable) drawable).setColor(i10);
                    throw null;
                }
            }
            return;
        }
        if (drawable instanceof ShapeDrawable) {
            ((ShapeDrawable) drawable).getPaint().setColor(ContextCompat.getColor(context, i10));
            int i13 = f41149g + 71;
            f41152j = i13 % 128;
            if (i13 % 2 == 0) {
                throw null;
            }
            return;
        }
        if (drawable instanceof GradientDrawable) {
            int i14 = f41149g + 37;
            f41152j = i14 % 128;
            int i15 = i14 % 2;
            ((GradientDrawable) drawable).setColor(ContextCompat.getColor(context, i10));
            return;
        }
        if (drawable instanceof ColorDrawable) {
            int i16 = f41149g + 15;
            f41152j = i16 % 128;
            int i17 = i16 % 2;
            ((ColorDrawable) drawable).setColor(ContextCompat.getColor(context, i10));
        }
    }

    private static int bS() {
        return ((Integer) c(new Object[0], -579591284, 579591284, (int) System.currentTimeMillis())).intValue();
    }

    public static void bS_(@NonNull Context context, @NonNull TextView textView, Drawable drawable, int i10, int i11, double d2) {
        int i12 = f41152j + 79;
        f41149g = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = AnonymousClass3.f41154c[a(textView.getContext(), i10).ordinal()];
            throw null;
        }
        int i14 = AnonymousClass3.f41154c[a(textView.getContext(), i10).ordinal()];
        if (i14 != 1) {
            if (i14 == 2 && (drawable instanceof GradientDrawable)) {
                int i15 = f41152j + 51;
                f41149g = i15 % 128;
                int i16 = i15 % 2;
                GradientDrawable gradientDrawable = (GradientDrawable) drawable;
                gradientDrawable.setStroke(i11, i10);
                gradientDrawable.setCornerRadius((float) d2);
            }
        } else if (drawable instanceof GradientDrawable) {
            GradientDrawable gradientDrawable2 = (GradientDrawable) drawable;
            gradientDrawable2.setStroke(i11, ContextCompat.getColor(context, i10));
            gradientDrawable2.setCornerRadius((float) d2);
            return;
        }
        int i17 = f41149g + 41;
        f41152j = i17 % 128;
        if (i17 % 2 == 0) {
            throw null;
        }
    }

    private static int bT() {
        int i10 = f41152j + 11;
        f41149g = i10 % 128;
        int i11 = i10 % 2;
        int i12 = bo().f40084g.fieldValueTextColor;
        int i13 = f41149g + 113;
        f41152j = i13 % 128;
        if (i13 % 2 == 0) {
            int i14 = 92 / 0;
        }
        return i12;
    }

    public static void bT_(@NonNull Button button, int i10) {
        c(new Object[]{button, Integer.valueOf(i10)}, -357145220, 357145231, i10);
    }

    private static int bU() {
        return ((Integer) c(new Object[0], -794201359, 794201395, (int) System.currentTimeMillis())).intValue();
    }

    public static void bU_(@NonNull Context context, Drawable drawable, int i10) {
        int i11 = AnonymousClass3.f41154c[a(context, i10).ordinal()];
        if (i11 != 1) {
            if (i11 == 2 && !(!(drawable instanceof GradientDrawable))) {
                int i12 = f41152j + 93;
                f41149g = i12 % 128;
                int i13 = i12 % 2;
                ((GradientDrawable) drawable).setColor(i10);
                return;
            }
            return;
        }
        if (!(drawable instanceof GradientDrawable)) {
            return;
        }
        ((GradientDrawable) drawable).setColor(ContextCompat.getColor(context, i10));
        int i14 = f41149g + 39;
        f41152j = i14 % 128;
        if (i14 % 2 == 0) {
            throw null;
        }
    }

    private static int bV() {
        int i10 = f41149g + 109;
        f41152j = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = FaceTecSDK.f40106a.f40083f.captureScreenBackgroundColor;
            ((Integer) c(new Object[]{Integer.valueOf(i11)}, 1987282240, -1987282205, i11)).intValue();
            throw null;
        }
        int i12 = FaceTecSDK.f40106a.f40083f.captureScreenBackgroundColor;
        int iIntValue = ((Integer) c(new Object[]{Integer.valueOf(i12)}, 1987282240, -1987282205, i12)).intValue();
        int i13 = f41152j + 109;
        f41149g = i13 % 128;
        int i14 = i13 % 2;
        return iIntValue;
    }

    @Nullable
    public static GradientDrawable bV_(@NonNull Context context) {
        return (GradientDrawable) c(new Object[]{context}, 1215991464, -1215991421, (int) System.currentTimeMillis());
    }

    private static int bW() {
        int i10 = f41152j + 97;
        f41149g = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = bo().f40083f.captureFrameStrokeColor;
            throw null;
        }
        int i12 = bo().f40083f.captureFrameStrokeColor;
        int i13 = f41152j + 73;
        f41149g = i13 % 128;
        int i14 = i13 % 2;
        return i12;
    }

    public static void bW_(TextView textView, String str) {
        c(new Object[]{textView, str}, 338356619, -338356598, (int) System.currentTimeMillis());
    }

    private static void bX() {
        c(new Object[0], 21735685, -21735678, (int) System.currentTimeMillis());
    }

    private static int bY() {
        int i10 = f41149g + 71;
        f41152j = i10 % 128;
        int i11 = i10 % 2;
        int i12 = bo().f40083f.captureScreenForegroundColor;
        int i13 = f41152j + 117;
        f41149g = i13 % 128;
        if (i13 % 2 != 0) {
            int i14 = 1 / 0;
        }
        return i12;
    }

    public static int ba() {
        int i10 = f41152j + 109;
        f41149g = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = bo().f40083f.customNFCScanningAnimation;
            throw null;
        }
        int i12 = bo().f40083f.customNFCScanningAnimation;
        int i13 = f41149g + 27;
        f41152j = i13 % 128;
        if (i13 % 2 != 0) {
            return i12;
        }
        throw null;
    }

    public static int bb() {
        int i10 = f41152j + 61;
        f41149g = i10 % 128;
        int i11 = i10 % 2;
        int i12 = bo().f40087j.customActivityIndicatorAnimation;
        int i13 = f41152j + 117;
        f41149g = i13 % 128;
        if (i13 % 2 == 0) {
            return i12;
        }
        throw null;
    }

    public static int bc() {
        return ((Integer) c(new Object[0], -1543971378, 1543971387, (int) System.currentTimeMillis())).intValue();
    }

    public static int bd() {
        int i10 = f41152j + 113;
        f41149g = i10 % 128;
        int i11 = i10 % 2;
        int i12 = bo().f40083f.customStaticNFCSkipOrErrorAnimation;
        int i13 = f41152j + 85;
        f41149g = i13 % 128;
        if (i13 % 2 == 0) {
            return i12;
        }
        throw null;
    }

    public static int be() {
        int i10 = f41152j + 59;
        f41149g = i10 % 128;
        if (i10 % 2 == 0) {
            return bo().f40083f.customStaticNFCStartingAnimation;
        }
        int i11 = 32 / 0;
        return bo().f40083f.customStaticNFCStartingAnimation;
    }

    public static int bf() {
        return ((Integer) c(new Object[0], 866669272, -866669258, (int) System.currentTimeMillis())).intValue();
    }

    public static float bg() {
        return ((Float) c(new Object[0], -473030507, 473030524, (int) System.currentTimeMillis())).floatValue();
    }

    public static int bh() {
        return ((Integer) c(new Object[0], -523817231, 523817258, (int) System.currentTimeMillis())).intValue();
    }

    public static int bi() {
        int i10 = f41149g + 113;
        f41152j = i10 % 128;
        int i11 = i10 % 2;
        int i12 = bo().f40087j.customStaticResultAnimationUnsuccess;
        int i13 = f41152j + 65;
        f41149g = i13 % 128;
        if (i13 % 2 == 0) {
            return i12;
        }
        throw null;
    }

    public static boolean bj() {
        int i10 = f41149g + 43;
        f41152j = i10 % 128;
        int i11 = i10 % 2;
        if (FaceTecSDK.f40106a.f40090n.f40073e == FaceTecCancelButtonCustomization.ButtonLocation.DISABLED) {
            return false;
        }
        int i12 = f41149g + 21;
        f41152j = i12 % 128;
        int i13 = i12 % 2;
        if (FaceTecSDK.f40106a.f40090n.f40073e == FaceTecCancelButtonCustomization.ButtonLocation.CUSTOM) {
            return false;
        }
        int i14 = f41152j + 101;
        f41149g = i14 % 128;
        int i15 = i14 % 2;
        return true;
    }

    public static int bk() {
        int i10 = f41149g + 11;
        f41152j = i10 % 128;
        int i11 = i10 % 2;
        int i12 = bo().f40087j.customStaticResultAnimationSuccess;
        int i13 = f41149g + 35;
        f41152j = i13 % 128;
        int i14 = i13 % 2;
        return i12;
    }

    public static void bl() {
        f41150h = new char[]{22457, 25167, 25160, 25157, 25152, 22456, 25171, 25166, 22458};
        f41151i = (char) 22456;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static float bm() {
        an anVarG = ag.g();
        if (anVarG == null) {
            int i10 = f41149g + 21;
            f41152j = i10 % 128;
            if (i10 % 2 != 0) {
                return 1.7777778f;
            }
            throw null;
        }
        float f6 = anVarG.f40333a / anVarG.f40334c;
        int i11 = f41149g + 55;
        f41152j = i11 % 128;
        if (i11 % 2 != 0) {
            return f6;
        }
        throw null;
    }

    private static FaceTecCustomization bo() {
        if (FaceTecSDK.c()) {
            int i10 = f41152j + 65;
            f41149g = i10 % 128;
            int i11 = i10 % 2;
            return FaceTecSDK.f40109d;
        }
        if (!(!FaceTecSDK.e())) {
            int i12 = f41149g + 77;
            f41152j = i12 % 128;
            int i13 = i12 % 2;
            return FaceTecSDK.f40107b;
        }
        FaceTecCustomization faceTecCustomization = FaceTecSDK.f40106a;
        int i14 = f41152j + 65;
        f41149g = i14 % 128;
        int i15 = i14 % 2;
        return faceTecCustomization;
    }

    public static void bp() {
        int i10 = f41149g + 113;
        f41152j = i10 % 128;
        int i11 = i10 % 2;
        c(new Object[]{Boolean.FALSE}, -1782390247, 1782390279, (int) System.currentTimeMillis());
        f(false);
        i(false);
        g(false);
        c(new Object[0], 21735685, -21735678, (int) System.currentTimeMillis());
        ca();
        int i12 = f41152j + 111;
        f41149g = i12 % 128;
        int i13 = i12 % 2;
    }

    private static int bq() {
        int i10 = f41152j + 47;
        f41149g = i10 % 128;
        if (i10 % 2 != 0) {
            return ((Integer) c(new Object[0], 1077540053, -1077540037, (int) System.currentTimeMillis())).intValue() * w();
        }
        return ((Integer) c(new Object[0], 1077540053, -1077540037, (int) System.currentTimeMillis())).intValue() + w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static float br() {
        int i10 = f41149g + 55;
        f41152j = i10 % 128;
        if (i10 % 2 == 0) {
            return (bx_().widthPixels * ay.e(4312)) + (a() - 1.7777778f);
        }
        return (bx_().widthPixels / ay.e(340)) * (a() / 1.7777778f);
    }

    private static int bs() {
        return ((Integer) c(new Object[0], 135146601, -135146560, (int) System.currentTimeMillis())).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static float bt() throws Throwable {
        float f6;
        int i10 = f41149g + 105;
        f41152j = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = bx_().widthPixels;
            a();
            throw null;
        }
        DisplayMetrics displayMetricsBx_ = bx_();
        float f10 = displayMetricsBx_.widthPixels;
        float f11 = displayMetricsBx_.heightPixels;
        if (a() < 1.4d) {
            int i12 = f41152j + 43;
            f41149g = i12 % 128;
            int i13 = i12 % 2;
            f6 = 0.94f;
        } else {
            f6 = 0.88f;
        }
        float f12 = f10 * f6;
        float f13 = displayMetricsBx_.density * 340.0f;
        if (f12 > f13) {
            f6 = f13 / f10;
            f12 = f13;
        }
        Resources system = Resources.getSystem();
        Object[] objArr = new Object[1];
        I(7 - Color.alpha(0), "\u0007\u0004\u0006\u0000\b\u0001㘣", (byte) (37 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), objArr);
        int identifier = system.getIdentifier("status_bar_height", PluginUtils.IDENTIFIER_DIMENSION, ((String) objArr[0]).intern());
        int dimensionPixelSize = identifier > 0 ? Resources.getSystem().getDimensionPixelSize(identifier) : 0;
        Resources system2 = Resources.getSystem();
        Object[] objArr2 = new Object[1];
        I(View.MeasureSpec.makeMeasureSpec(0, 0) + 7, "\u0007\u0004\u0006\u0000\b\u0001㘣", (byte) (37 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), objArr2);
        int identifier2 = system2.getIdentifier("navigation_bar_height", PluginUtils.IDENTIFIER_DIMENSION, ((String) objArr2[0]).intern());
        int dimensionPixelSize2 = identifier2 > 0 ? Resources.getSystem().getDimensionPixelSize(identifier2) : 0;
        float fA = a() * f12;
        float f14 = (((f11 - ((displayMetricsBx_.density * 10.0f) * 3.0f)) - 10.0f) - dimensionPixelSize2) - dimensionPixelSize;
        if (fA <= f14) {
            return f6;
        }
        int i14 = f41149g + 5;
        f41152j = i14 % 128;
        int i15 = i14 % 2;
        float fA2 = f14 / (a() * f10);
        int i16 = f41149g + 111;
        f41152j = i16 % 128;
        int i17 = i16 % 2;
        return fA2;
    }

    private static int bu() {
        int i10 = f41152j + 57;
        f41149g = i10 % 128;
        int i11 = i10 % 2;
        int i12 = FaceTecSDK.f40106a.f40083f.additionalReviewScreenBackgroundColors;
        int iIntValue = ((Integer) c(new Object[]{Integer.valueOf(i12)}, 1987282240, -1987282205, i12)).intValue();
        int i13 = f41152j + 9;
        f41149g = i13 % 128;
        int i14 = i13 % 2;
        return iIntValue;
    }

    private static int bv() {
        int i10 = f41152j + 7;
        f41149g = i10 % 128;
        if (i10 % 2 == 0) {
            return bo().f40086i.readyScreenSubtextTextColor;
        }
        int i11 = bo().f40086i.readyScreenSubtextTextColor;
        throw null;
    }

    private static int bw() {
        int i10 = f41149g + 83;
        f41152j = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = FaceTecSDK.f40106a.f40087j.backgroundColors;
            return ((Integer) c(new Object[]{Integer.valueOf(i11)}, 1987282240, -1987282205, i11)).intValue();
        }
        int i12 = FaceTecSDK.f40106a.f40087j.backgroundColors;
        ((Integer) c(new Object[]{Integer.valueOf(i12)}, 1987282240, -1987282205, i12)).intValue();
        throw null;
    }

    private static Resources bw_(final Context context) {
        Resources resourcesC;
        int i10 = f41152j + 81;
        f41149g = i10 % 128;
        if (i10 % 2 != 0) {
            h<Resources> hVar = f41146c;
            Objects.requireNonNull(context);
            resourcesC = hVar.c(new h.a() { // from class: com.facetec.sdk.r7
                @Override // com.facetec.sdk.h.a
                public final Object create() {
                    return context.getResources();
                }
            });
            int i11 = 63 / 0;
        } else {
            h<Resources> hVar2 = f41146c;
            Objects.requireNonNull(context);
            resourcesC = hVar2.c(new h.a() { // from class: com.facetec.sdk.r7
                @Override // com.facetec.sdk.h.a
                public final Object create() {
                    return context.getResources();
                }
            });
        }
        int i12 = f41152j + 3;
        f41149g = i12 % 128;
        int i13 = i12 % 2;
        return resourcesC;
    }

    private static int bx() {
        int i10;
        int i11 = f41149g + 33;
        f41152j = i11 % 128;
        if (i11 % 2 == 0) {
            i10 = bo().f40086i.readyScreenHeaderTextColor;
            int i12 = 21 / 0;
        } else {
            i10 = bo().f40086i.readyScreenHeaderTextColor;
        }
        int i13 = f41152j + 55;
        f41149g = i13 % 128;
        if (i13 % 2 == 0) {
            return i10;
        }
        throw null;
    }

    private static DisplayMetrics bx_() {
        int i10 = f41152j + 75;
        f41149g = i10 % 128;
        if (i10 % 2 == 0) {
            return f41147d.c(new n7());
        }
        f41147d.c(new n7());
        throw null;
    }

    private static int by() {
        return ((Integer) c(new Object[0], 410242885, -410242851, (int) System.currentTimeMillis())).intValue();
    }

    public static Typeface by_() {
        int i10 = f41152j + 33;
        f41149g = i10 % 128;
        int i11 = i10 % 2;
        FaceTecGuidanceCustomization faceTecGuidanceCustomization = FaceTecSDK.f40106a.f40086i;
        Typeface typeface = faceTecGuidanceCustomization.readyScreenHeaderFont;
        if (typeface != null) {
            return typeface;
        }
        int i12 = f41149g + 95;
        f41152j = i12 % 128;
        int i13 = i12 % 2;
        return faceTecGuidanceCustomization.headerFont;
    }

    private static int bz() {
        int i10 = f41149g + 61;
        f41152j = i10 % 128;
        if (i10 % 2 != 0) {
            return bo().f40086i.foregroundColor;
        }
        int i11 = bo().f40086i.foregroundColor;
        throw null;
    }

    public static Typeface bz_() {
        int i10 = f41149g + 111;
        f41152j = i10 % 128;
        if (i10 % 2 == 0) {
            Typeface typeface = FaceTecSDK.f40106a.f40086i.readyScreenSubtextFont;
            throw null;
        }
        FaceTecGuidanceCustomization faceTecGuidanceCustomization = FaceTecSDK.f40106a.f40086i;
        Typeface typeface2 = faceTecGuidanceCustomization.readyScreenSubtextFont;
        if (typeface2 == null) {
            typeface2 = faceTecGuidanceCustomization.subtextFont;
        }
        int i11 = f41152j + 109;
        f41149g = i11 % 128;
        int i12 = i11 % 2;
        return typeface2;
    }

    public static synchronized float c() {
        float fFloatValue;
        int i10 = f41149g + 7;
        f41152j = i10 % 128;
        int i11 = i10 % 2;
        fFloatValue = f41144a.c(new q7()).floatValue();
        int i12 = f41149g + 7;
        f41152j = i12 % 128;
        int i13 = i12 % 2;
        return fFloatValue;
    }

    private static void ca() {
        int i10 = f41149g + 49;
        f41152j = i10 % 128;
        int i11 = i10 % 2;
        String str = (String) c(new Object[]{Boolean.FALSE}, -1974881617, 1974881650, (int) System.currentTimeMillis());
        String strD = d(false);
        if (str != null) {
            int i12 = f41152j + 95;
            f41149g = i12 % 128;
            int i13 = i12 % 2;
            if (str.length() > 20) {
                d("Retry Screen Your Image Label");
            }
        }
        if (strD == null || strD.length() <= 20) {
            return;
        }
        int i14 = f41149g + 61;
        f41152j = i14 % 128;
        if (i14 % 2 != 0) {
            d("Retry Screen Ideal Image Label");
        } else {
            d("Retry Screen Ideal Image Label");
            int i15 = 89 / 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object cd() {
        return c(new Object[0], 515334965, -515334960, (int) System.currentTimeMillis());
    }

    public static synchronized float d() {
        int i10 = f41149g + 87;
        f41152j = i10 % 128;
        int i11 = i10 % 2;
        float fFloatValue = f41148e.c(new o7()).floatValue();
        int i12 = f41152j + 111;
        f41149g = i12 % 128;
        if (i12 % 2 == 0) {
            return fFloatValue;
        }
        int i13 = 12 / 0;
        return fFloatValue;
    }

    public static int e() {
        int i10 = f41152j + 119;
        f41149g = i10 % 128;
        int i11 = i10 % 2;
        int iRound = Math.round(ay.e(15) * c() * d());
        int i12 = f41152j + 121;
        f41149g = i12 % 128;
        if (i12 % 2 == 0) {
            return iRound;
        }
        throw null;
    }

    @NonNull
    public static FaceTecSize f() {
        FaceTecSize faceTecSize = new FaceTecSize(Math.round(ay.b(bx_().widthPixels) - (c() * 20.0f)), Math.round(c() * 60.0f));
        int i10 = f41149g + 5;
        f41152j = i10 % 128;
        if (i10 % 2 != 0) {
            return faceTecSize;
        }
        throw null;
    }

    public static int g() {
        int i10;
        int i11 = FaceTecSDK.f40106a.f40089l.borderWidth;
        if (i11 == -1) {
            int i12 = f41149g + 59;
            f41152j = i12 % 128;
            i11 = i12 % 2 == 0 ? 3 : 2;
        }
        if (i11 == 0) {
            int i13 = f41152j + 89;
            f41149g = i13 % 128;
            int i14 = i13 % 2;
            i10 = 0;
        } else {
            i10 = 1;
        }
        return Math.max(i10, Math.round(i11 * c()));
    }

    public static int h() {
        int i10 = f41149g + 35;
        f41152j = i10 % 128;
        return i10 % 2 == 0 ? 35 : 10;
    }

    @ColorInt
    public static int i(@NonNull Context context) {
        int i10 = f41149g + 77;
        f41152j = i10 % 128;
        int i11 = i10 % 2;
        int iE = e(context, bx());
        if (iE != 0) {
            return iE;
        }
        int i12 = f41149g + 17;
        f41152j = i12 % 128;
        int i13 = i12 % 2;
        int iIntValue = ((Integer) c(new Object[]{context}, 425782924, -425782900, (int) System.currentTimeMillis())).intValue();
        int i14 = f41152j + 73;
        f41149g = i14 % 128;
        int i15 = i14 % 2;
        return iIntValue;
    }

    public static void init$0() {
        $$a = new byte[]{19, -91, Constants.CVR_B1b85_0101_MOBILE_APP, -73};
        $$b = 173;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x003c A[PHI: r0
      0x003c: PHI (r0v5 float) = (r0v4 float), (r0v9 float) binds: [B:8:0x003a, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    public static int j() {
        float fC;
        int i10 = f41149g + 55;
        f41152j = i10 % 128;
        int i11 = 0;
        if (i10 % 2 == 0) {
            fC = c() / d();
            if (dd.c(R.string.FaceTec_idscan_type_selection_header).length() > 12) {
                int i12 = f41149g + 125;
                f41152j = i12 % 128;
                int i13 = i12 % 2;
                i11 = -4;
            }
        } else {
            fC = c() * d();
            if (dd.c(R.string.FaceTec_idscan_type_selection_header).length() > 36) {
                int i14 = f41149g + 125;
                f41152j = i14 % 128;
                int i15 = i14 % 2;
                i11 = -4;
            }
        }
        return Math.round((i11 + 28) * fC);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    public static int k() {
        int i10;
        int i11 = f41152j + 41;
        f41149g = i11 % 128;
        int i12 = 1;
        if (i11 % 2 != 0) {
            int i13 = 2 / 0;
            if (FaceTecSDK.f40106a.f40086i.retryScreenImageBorderWidth == -1) {
                i10 = 1;
            } else {
                i10 = FaceTecSDK.f40106a.f40086i.retryScreenImageBorderWidth;
            }
        } else if (FaceTecSDK.f40106a.f40086i.retryScreenImageBorderWidth == -1) {
            i10 = 1;
        } else {
            i10 = FaceTecSDK.f40106a.f40086i.retryScreenImageBorderWidth;
        }
        if (i10 == 0) {
            int i14 = f41152j + 35;
            f41149g = i14 % 128;
            int i15 = i14 % 2;
            i12 = 0;
        }
        return Math.max(i12, Math.round(i10 * c()));
    }

    private static /* synthetic */ Object l(Object[] objArr) {
        int i10;
        int i11 = f41152j + 81;
        f41149g = i11 % 128;
        if (i11 % 2 != 0) {
            i10 = bo().f40083f.buttonTextNormalColor;
            int i12 = 52 / 0;
        } else {
            i10 = bo().f40083f.buttonTextNormalColor;
        }
        int i13 = f41152j + 19;
        f41149g = i13 % 128;
        int i14 = i13 % 2;
        return Integer.valueOf(i10);
    }

    public static int m() {
        int i10 = f41152j + 87;
        f41149g = i10 % 128;
        int i11 = i10 % 2;
        int i12 = FaceTecSDK.f40106a.f40086i.buttonBorderWidth;
        if (i12 == -1) {
            int i13 = f41149g + 37;
            int i14 = i13 % 128;
            f41152j = i14;
            int i15 = i13 % 2;
            int i16 = i14 + 87;
            f41149g = i16 % 128;
            int i17 = i16 % 2;
            i12 = 0;
        }
        int iMax = Math.max(i12 != 0 ? 1 : 0, Math.round(i12 * c()));
        int i18 = f41149g + 15;
        f41152j = i18 % 128;
        if (i18 % 2 != 0) {
            return iMax;
        }
        throw null;
    }

    public static int n() {
        int i10;
        int i11 = FaceTecSDK.f40106a.f40084g.mainHeaderDividerLineWidth;
        if (i11 == -1) {
            i11 = 2;
        } else {
            int i12 = f41152j + 31;
            f41149g = i12 % 128;
            int i13 = i12 % 2;
        }
        if (i11 == 0) {
            int i14 = f41152j + 121;
            f41149g = i14 % 128;
            int i15 = i14 % 2;
            i10 = 0;
        } else {
            i10 = 1;
        }
        return Math.max(i10, Math.round(i11 * c()));
    }

    public static int o() {
        int i10 = FaceTecSDK.f40106a.f40083f.buttonBorderWidth;
        int i11 = 0;
        if (i10 == -1) {
            i10 = 0;
        } else {
            int i12 = f41149g + 61;
            f41152j = i12 % 128;
            int i13 = i12 % 2;
        }
        if (i10 == 0) {
            int i14 = f41149g + 15;
            int i15 = i14 % 128;
            f41152j = i15;
            int i16 = i14 % 2;
            int i17 = i15 + 61;
            f41149g = i17 % 128;
            int i18 = i17 % 2;
        } else {
            i11 = 1;
        }
        return Math.max(i11, Math.round(i10 * c()));
    }

    public static int p() {
        int i10 = FaceTecSDK.f40106a.f40084g.inputFieldBorderWidth;
        if (i10 == -1) {
            int i11 = f41152j + 81;
            f41149g = i11 % 128;
            int i12 = i11 % 2;
            i10 = 1;
        }
        int iMax = Math.max(i10 == 0 ? 0 : 1, Math.round(i10 * c()));
        int i13 = f41152j + 49;
        f41149g = i13 % 128;
        if (i13 % 2 == 0) {
            return iMax;
        }
        throw null;
    }

    public static int q() {
        int i10 = f41149g + 97;
        f41152j = i10 % 128;
        int i11 = i10 % 2;
        int i12 = FaceTecSDK.f40106a.f40084g.scrollIndicatorBorderWidth;
        if (i12 == -1) {
            int i13 = f41152j + 49;
            f41149g = i13 % 128;
            int i14 = i13 % 2;
            i12 = 0;
        } else {
            int i15 = f41152j + 37;
            f41149g = i15 % 128;
            int i16 = i15 % 2;
        }
        return Math.max(i12 != 0 ? 1 : 0, Math.round(i12 * c()));
    }

    public static int r() {
        int i10;
        int i11 = f41152j + 17;
        f41149g = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = FaceTecSDK.f40106a.f40083f.captureFrameStrokeWidth;
            throw null;
        }
        int i13 = FaceTecSDK.f40106a.f40083f.captureFrameStrokeWidth;
        if (i13 == -1) {
            i13 = 2;
        }
        if (i13 == 0) {
            int i14 = f41152j + 7;
            f41149g = i14 % 128;
            int i15 = i14 % 2;
            i10 = 0;
        } else {
            i10 = 1;
        }
        return Math.max(i10, Math.round(i13 * c()));
    }

    public static int s() {
        int i10 = f41149g + 125;
        f41152j = i10 % 128;
        int i11 = i10 % 2;
        int i12 = FaceTecSDK.f40106a.f40083f.reviewScreenTextBackgroundBorderWidth;
        int i13 = 0;
        if (i12 == -1) {
            i12 = 0;
        }
        if (i12 == 0) {
            int i14 = f41149g + 125;
            int i15 = i14 % 128;
            f41152j = i15;
            int i16 = i14 % 2;
            int i17 = i15 + 45;
            f41149g = i17 % 128;
            int i18 = i17 % 2;
        } else {
            i13 = 1;
        }
        return Math.max(i13, Math.round(i12 * c()));
    }

    public static int t() {
        int i10 = FaceTecSDK.f40106a.f40083f.captureScreenTextBackgroundBorderWidth;
        int i11 = 0;
        if (i10 == -1) {
            int i12 = f41149g + 17;
            f41152j = i12 % 128;
            int i13 = i12 % 2;
            i10 = 0;
        }
        if (i10 == 0) {
            int i14 = f41149g + 31;
            f41152j = i14 % 128;
            int i15 = i14 % 2;
        } else {
            i11 = 1;
        }
        return Math.max(i11, Math.round(i10 * c()));
    }

    private static /* synthetic */ Object u(Object[] objArr) {
        int i10 = f41149g + 89;
        f41152j = i10 % 128;
        int i11 = i10 % 2;
        int i12 = bo().f40087j.resultAnimationBackgroundColor;
        int i13 = f41152j + 93;
        f41149g = i13 % 128;
        if (i13 % 2 == 0) {
            return Integer.valueOf(i12);
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002e  */
    /* JADX WARN: Code duplicated, block: B:12:0x0030  */
    /* JADX WARN: Code duplicated, block: B:14:0x0032  */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    public static int v() {
        int i10;
        int i11;
        int i12 = f41152j + 83;
        f41149g = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 18 / 0;
            if (FaceTecSDK.f40106a.f40084g.scrollIndicatorCornerRadius == -1) {
                i10 = f41152j + 47;
                f41149g = i10 % 128;
                if (i10 % 2 == 0) {
                    throw null;
                }
                i11 = -1;
            } else {
                i11 = FaceTecSDK.f40106a.f40084g.scrollIndicatorCornerRadius;
                int i14 = f41149g + 71;
                f41152j = i14 % 128;
                int i15 = i14 % 2;
            }
        } else if (FaceTecSDK.f40106a.f40084g.scrollIndicatorCornerRadius == -1) {
            i10 = f41152j + 47;
            f41149g = i10 % 128;
            if (i10 % 2 == 0) {
                throw null;
            }
            i11 = -1;
        } else {
            i11 = FaceTecSDK.f40106a.f40084g.scrollIndicatorCornerRadius;
            int i16 = f41149g + 71;
            f41152j = i16 % 128;
            int i17 = i16 % 2;
        }
        return i11 == -1 ? i11 : Math.round(i11 * c());
    }

    public static int w() {
        int i10 = f41152j + 3;
        f41149g = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = FaceTecSDK.f40106a.f40091o.strokeWidth;
            throw null;
        }
        int i12 = FaceTecSDK.f40106a.f40091o.strokeWidth;
        if (i12 == -1) {
            i12 = 6;
        } else {
            int i13 = f41149g + 59;
            f41152j = i13 % 128;
            int i14 = i13 % 2;
        }
        int i15 = 1;
        if (i12 == 0) {
            int i16 = f41149g;
            int i17 = i16 + 21;
            f41152j = i17 % 128;
            i15 = i17 % 2 != 0 ? 0 : 1;
            int i18 = i16 + 19;
            f41152j = i18 % 128;
            int i19 = i18 % 2;
        }
        return Math.max(i15, Math.round(i12 * c()));
    }

    public static int x() {
        int i10 = f41149g + 103;
        f41152j = i10 % 128;
        int i11 = i10 % 2;
        int i12 = FaceTecSDK.f40106a.f40089l.cornerRadius;
        if (i12 == -1) {
            int i13 = f41149g + 51;
            int i14 = i13 % 128;
            f41152j = i14;
            i12 = i13 % 2 == 0 ? 55 : 20;
            int i15 = i14 + 9;
            f41149g = i15 % 128;
            int i16 = i15 % 2;
        }
        return Math.round(i12 * c());
    }

    public static int y() {
        int i10 = FaceTecSDK.f40106a.f40086i.readyScreenTextBackgroundCornerRadius;
        if (i10 == -1) {
            int i11 = f41152j + 121;
            int i12 = i11 % 128;
            f41149g = i12;
            int i13 = i11 % 2;
            int i14 = i12 + 15;
            f41152j = i14 % 128;
            int i15 = i14 % 2;
            i10 = 6;
        }
        return Math.round(i10 * c());
    }

    public static int z() {
        int i10 = f41149g + 19;
        f41152j = i10 % 128;
        if (i10 % 2 == 0 && Build.VERSION.SDK_INT < 39) {
            return 0;
        }
        int i11 = FaceTecSDK.f40106a.f40086i.retryScreenImageCornerRadius;
        if (i11 == -1) {
            int i12 = f41149g + 5;
            f41152j = i12 % 128;
            int i13 = i12 % 2;
            i11 = 10;
        }
        return Math.round(i11 * c());
    }

    private static /* synthetic */ Object H(Object[] objArr) {
        Drawable drawable = (Drawable) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i10 = f41152j + 83;
        int i11 = i10 % 128;
        f41149g = i11;
        int i12 = i10 % 2;
        if (drawable instanceof ShapeDrawable) {
            ((ShapeDrawable) drawable).getPaint().setColor(iIntValue);
            return null;
        }
        if (drawable instanceof GradientDrawable) {
            int i13 = i11 + 111;
            f41152j = i13 % 128;
            if (i13 % 2 != 0) {
                ((GradientDrawable) drawable).setColor(iIntValue);
                return null;
            }
            ((GradientDrawable) drawable).setColor(iIntValue);
            throw null;
        }
        if (drawable instanceof ColorDrawable) {
            ((ColorDrawable) drawable).setColor(iIntValue);
        }
        int i14 = f41149g + 117;
        f41152j = i14 % 128;
        if (i14 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static void I(int i10, String str, byte b10, Object[] objArr) throws Throwable {
        char[] charArray;
        int i11;
        int i12 = $10;
        int i13 = i12 + 45;
        $11 = i13 % 128;
        int i14 = i13 % 2;
        int i15 = 0;
        if (str != null) {
            int i16 = i12 + 117;
            $11 = i16 % 128;
            if (i16 % 2 == 0) {
                charArray = str.toCharArray();
                int i17 = 53 / 0;
            } else {
                charArray = str.toCharArray();
            }
        } else {
            charArray = str;
        }
        char[] cArr = charArray;
        gv gvVar = new gv();
        char[] cArr2 = f41150h;
        int i18 = -324767611;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i19 = 0;
            while (i19 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i15] = Integer.valueOf(cArr2[i19]);
                    Map map = bp.f40694x;
                    Object method = map.get(Integer.valueOf(i18));
                    if (method == null) {
                        Class cls = (Class) bp.a(24 - TextUtils.indexOf("", "", i15, i15), Color.argb(i15, i15, i15, i15) + 1411, (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1));
                        byte b11 = (byte) i15;
                        byte b12 = b11;
                        Object[] objArr3 = new Object[1];
                        M(b11, b12, b12, objArr3);
                        method = cls.getMethod((String) objArr3[0], Integer.TYPE);
                        map.put(-324767611, method);
                    }
                    cArr3[i19] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    i19++;
                    i15 = 0;
                    i18 = -324767611;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr4 = {Integer.valueOf(f41151i)};
        Map map2 = bp.f40694x;
        Object method2 = map2.get(-324767611);
        if (method2 == null) {
            Class cls2 = (Class) bp.a(24 - View.combineMeasuredStates(0, 0), TextUtils.indexOf("", "", 0, 0) + 1411, (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))));
            byte b13 = (byte) 0;
            byte b14 = b13;
            Object[] objArr5 = new Object[1];
            M(b13, b14, b14, objArr5);
            method2 = cls2.getMethod((String) objArr5[0], Integer.TYPE);
            map2.put(-324767611, method2);
        }
        char cCharValue = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
        char[] cArr4 = new char[i10];
        if (i10 % 2 != 0) {
            i11 = i10 - 1;
            cArr4[i11] = (char) (cArr[i11] - b10);
        } else {
            i11 = i10;
        }
        if (i11 > 1) {
            int i20 = $10 + 45;
            $11 = i20 % 128;
            int i21 = i20 % 2;
            gvVar.f41832e = 0;
            while (true) {
                int i22 = gvVar.f41832e;
                if (i22 >= i11) {
                    break;
                }
                char c10 = cArr[i22];
                gvVar.f41829b = c10;
                char c11 = cArr[i22 + 1];
                gvVar.f41831d = c11;
                if (c10 == c11) {
                    cArr4[i22] = (char) (c10 - b10);
                    cArr4[i22 + 1] = (char) (c11 - b10);
                } else {
                    Object[] objArr6 = {gvVar, gvVar, Integer.valueOf(cCharValue), gvVar, gvVar, Integer.valueOf(cCharValue), gvVar, gvVar, Integer.valueOf(cCharValue), gvVar, gvVar, Integer.valueOf(cCharValue), gvVar};
                    Map map3 = bp.f40694x;
                    Object method3 = map3.get(-779085347);
                    if (method3 == null) {
                        Class cls3 = (Class) bp.a((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 23, 719 - KeyEvent.keyCodeFromString(""), (char) TextUtils.getOffsetBefore("", 0));
                        byte b15 = (byte) ($$b & 3);
                        byte b16 = (byte) (b15 - 1);
                        Object[] objArr7 = new Object[1];
                        M(b15, b16, b16, objArr7);
                        String str2 = (String) objArr7[0];
                        Class<?> cls4 = Integer.TYPE;
                        method3 = cls3.getMethod(str2, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class);
                        map3.put(-779085347, method3);
                    }
                    int iIntValue = ((Integer) ((Method) method3).invoke(null, objArr6)).intValue();
                    int i23 = gvVar.f41833g;
                    if (iIntValue == i23) {
                        Object[] objArr8 = {gvVar, gvVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), gvVar, gvVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), gvVar, Integer.valueOf(cCharValue), gvVar};
                        Object method4 = map3.get(531504056);
                        if (method4 == null) {
                            Class cls5 = (Class) bp.a(25 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 222 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) Gravity.getAbsoluteGravity(0, 0));
                            Class<?> cls6 = Integer.TYPE;
                            method4 = cls5.getMethod("l", Object.class, Object.class, cls6, cls6, Object.class, Object.class, cls6, cls6, Object.class, cls6, Object.class);
                            map3.put(531504056, method4);
                        }
                        int iIntValue2 = ((Integer) ((Method) method4).invoke(null, objArr8)).intValue();
                        int i24 = (gvVar.f41828a * cCharValue) + gvVar.f41833g;
                        int i25 = gvVar.f41832e;
                        cArr4[i25] = cArr2[iIntValue2];
                        cArr4[i25 + 1] = cArr2[i24];
                    } else {
                        int i26 = gvVar.f41830c;
                        int i27 = gvVar.f41828a;
                        if (i26 == i27) {
                            int iA = androidx.activity.a.a(gvVar.f41834j, cCharValue, 1, cCharValue);
                            gvVar.f41834j = iA;
                            int iA2 = androidx.activity.a.a(i23, cCharValue, 1, cCharValue);
                            gvVar.f41833g = iA2;
                            int i28 = (i27 * cCharValue) + iA2;
                            int i29 = gvVar.f41832e;
                            cArr4[i29] = cArr2[(i26 * cCharValue) + iA];
                            cArr4[i29 + 1] = cArr2[i28];
                        } else {
                            int i30 = (i26 * cCharValue) + i23;
                            int i31 = (i27 * cCharValue) + gvVar.f41834j;
                            int i32 = gvVar.f41832e;
                            cArr4[i32] = cArr2[i30];
                            cArr4[i32 + 1] = cArr2[i31];
                        }
                    }
                }
                gvVar.f41832e += 2;
            }
        }
        int i33 = 0;
        while (i33 < i10) {
            int i34 = $10 + 67;
            $11 = i34 % 128;
            if (i34 % 2 == 0) {
                cArr4[i33] = (char) (cArr4[i33] ^ 3276);
                i33 += 108;
            } else {
                cArr4[i33] = (char) (cArr4[i33] ^ 13722);
                i33++;
            }
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002c  */
    /* JADX WARN: Code duplicated, block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002c -> B:11:0x0036). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002c
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void M(int r7, byte r8, short r9, java.lang.Object[] r10) {
        /*
            int r8 = r8 * 3
            int r8 = 1 - r8
            byte[] r0 = com.facetec.sdk.db.$$a
            int r9 = r9 * 3
            int r9 = 3 - r9
            int r7 = r7 * 6
            int r7 = r7 + 105
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L1a
            r7 = r8
            r3 = r1
            r4 = r2
            r1 = r0
            r0 = r10
            r10 = r9
            goto L36
        L1a:
            r3 = r2
        L1b:
            int r9 = r9 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r8) goto L2c
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L2c:
            r3 = r0[r9]
            r6 = r9
            r9 = r7
            r7 = r8
            r8 = r3
            r3 = r1
            r1 = r0
            r0 = r10
            r10 = r6
        L36:
            int r8 = r8 + r9
            r9 = r10
            r10 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            r6 = r8
            r8 = r7
            r7 = r6
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.db.M(int, byte, short, java.lang.Object[]):void");
    }

    public static void b() {
        int i10 = f41152j + 63;
        f41149g = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = FaceTecSDK.f40106a.f40091o.progressRadialOffset;
            throw null;
        }
        FaceTecCustomization faceTecCustomization = FaceTecSDK.f40106a;
        FaceTecOvalCustomization faceTecOvalCustomization = faceTecCustomization.f40091o;
        if (faceTecOvalCustomization.progressRadialOffset == -1) {
            faceTecOvalCustomization.progressRadialOffset = bq();
            int i12 = f41149g + 81;
            f41152j = i12 % 128;
            int i13 = i12 % 2;
        }
        FaceTecSDK.f40106a = faceTecCustomization;
    }

    private static /* synthetic */ Object h(Object[] objArr) {
        int i10 = f41149g + 61;
        f41152j = i10 % 128;
        if (i10 % 2 != 0) {
            return Integer.valueOf(bo().f40089l.borderColor);
        }
        int i11 = bo().f40089l.borderColor;
        throw null;
    }

    public static int l(@NonNull Context context) {
        return ((Integer) c(new Object[]{context}, 1338845285, -1338845254, (int) System.currentTimeMillis())).intValue();
    }

    public static int u() {
        return ((Integer) c(new Object[0], 1077540053, -1077540037, (int) System.currentTimeMillis())).intValue();
    }

    private static /* synthetic */ Object B(Object[] objArr) {
        int i10 = f41149g + 15;
        f41152j = i10 % 128;
        if (i10 % 2 != 0) {
            return Integer.valueOf(bo().f40083f.captureScreenFocusMessageTextColor);
        }
        int i11 = bo().f40083f.captureScreenFocusMessageTextColor;
        throw null;
    }

    private static /* synthetic */ Object g(Object[] objArr) {
        int i10 = f41149g + 95;
        f41152j = i10 % 128;
        if (i10 % 2 != 0) {
            return Integer.valueOf(bo().f40091o.strokeColor);
        }
        int i11 = bo().f40091o.strokeColor;
        throw null;
    }

    @ColorInt
    public static int h(@NonNull Context context) {
        int iIntValue;
        int iE = e(context, bB());
        if (iE == 0) {
            int i10 = f41152j + 97;
            f41149g = i10 % 128;
            if (i10 % 2 != 0) {
                iIntValue = ((Integer) c(new Object[]{context}, 425782924, -425782900, (int) System.currentTimeMillis())).intValue();
                int i11 = 46 / 0;
            } else {
                iIntValue = ((Integer) c(new Object[]{context}, 425782924, -425782900, (int) System.currentTimeMillis())).intValue();
            }
            iE = iIntValue;
            int i12 = f41149g + 41;
            f41152j = i12 % 128;
            int i13 = i12 % 2;
        }
        return iE;
    }

    public static int l() {
        return ((Integer) c(new Object[0], -356874651, 356874688, (int) System.currentTimeMillis())).intValue();
    }

    public static int n(@NonNull Context context) {
        int iE;
        int i10;
        int i11 = f41152j + 59;
        f41149g = i11 % 128;
        if (i11 % 2 != 0) {
            iE = e(context, ((Integer) c(new Object[0], 1818958898, -1818958885, (int) System.currentTimeMillis())).intValue());
            i10 = 23088;
        } else {
            iE = e(context, ((Integer) c(new Object[0], 1818958898, -1818958885, (int) System.currentTimeMillis())).intValue());
            i10 = 255;
        }
        int iA = a(iE, i10);
        int i12 = f41152j + 91;
        f41149g = i12 % 128;
        int i13 = i12 % 2;
        return iA;
    }

    public static int o(@NonNull Context context) {
        int i10 = f41152j + 31;
        f41149g = i10 % 128;
        if (i10 % 2 == 0) {
            return e(context, bC());
        }
        int i11 = 3 / 0;
        return e(context, bC());
    }

    private static /* synthetic */ Object p(Object[] objArr) {
        int i10;
        int i11 = f41149g + 29;
        f41152j = i11 % 128;
        if (i11 % 2 == 0) {
            i10 = bo().f40083f.buttonBorderColor;
            int i12 = 25 / 0;
        } else {
            i10 = bo().f40083f.buttonBorderColor;
        }
        return Integer.valueOf(i10);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0041  */
    /* JADX WARN: Code duplicated, block: B:12:0x004b  */
    /* JADX WARN: Code duplicated, block: B:9:0x0038  */
    private static /* synthetic */ Object t(Object[] objArr) {
        int i10;
        Drawable drawable = (Drawable) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int iIntValue2 = ((Number) objArr[2]).intValue();
        double dDoubleValue = ((Number) objArr[3]).doubleValue();
        int i11 = f41149g;
        int i12 = i11 + 57;
        f41152j = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 58 / 0;
            if (drawable instanceof GradientDrawable) {
                i10 = i11 + 97;
                f41152j = i10 % 128;
                if (i10 % 2 != 0) {
                    GradientDrawable gradientDrawable = (GradientDrawable) drawable;
                    gradientDrawable.setStroke(iIntValue2, iIntValue);
                    gradientDrawable.setCornerRadius((float) dDoubleValue);
                } else {
                    GradientDrawable gradientDrawable2 = (GradientDrawable) drawable;
                    gradientDrawable2.setStroke(iIntValue2, iIntValue);
                    gradientDrawable2.setCornerRadius((float) dDoubleValue);
                    throw null;
                }
            }
        } else if (drawable instanceof GradientDrawable) {
            i10 = i11 + 97;
            f41152j = i10 % 128;
            if (i10 % 2 != 0) {
                GradientDrawable gradientDrawable3 = (GradientDrawable) drawable;
                gradientDrawable3.setStroke(iIntValue2, iIntValue);
                gradientDrawable3.setCornerRadius((float) dDoubleValue);
            } else {
                GradientDrawable gradientDrawable4 = (GradientDrawable) drawable;
                gradientDrawable4.setStroke(iIntValue2, iIntValue);
                gradientDrawable4.setCornerRadius((float) dDoubleValue);
                throw null;
            }
        }
        return null;
    }

    private static /* synthetic */ Object y(Object[] objArr) {
        Context context = (Context) objArr[0];
        int i10 = f41149g + 31;
        f41152j = i10 % 128;
        int i11 = i10 % 2;
        int iE = e(context, ((Integer) c(new Object[0], 16346167, -16346137, (int) System.currentTimeMillis())).intValue());
        int i12 = f41149g + 19;
        f41152j = i12 % 128;
        if (i12 % 2 != 0) {
            return Integer.valueOf(iE);
        }
        int i13 = 41 / 0;
        return Integer.valueOf(iE);
    }

    private static /* synthetic */ Object A(Object[] objArr) {
        int i10 = f41149g + 53;
        f41152j = i10 % 128;
        int i11 = i10 % 2;
        int i12 = bo().f40087j.resultAnimationForegroundColor;
        int i13 = f41152j + 111;
        f41149g = i13 % 128;
        if (i13 % 2 == 0) {
            return Integer.valueOf(i12);
        }
        throw null;
    }

    private static /* synthetic */ Object E(Object[] objArr) {
        Context context = (Context) objArr[0];
        int i10 = f41152j + 63;
        f41149g = i10 % 128;
        int i11 = i10 % 2;
        int iE = e(context, bK());
        int i12 = f41152j + 29;
        f41149g = i12 % 128;
        if (i12 % 2 == 0) {
            return Integer.valueOf(iE);
        }
        throw null;
    }

    private static /* synthetic */ Object c(Object[] objArr) {
        TextView textView = (TextView) objArr[0];
        int i10 = f41149g + 125;
        f41152j = i10 % 128;
        if (i10 % 2 == 0) {
            textView.getContext();
            bO_(textView, bz());
            int i11 = 55 / 0;
            return null;
        }
        textView.getContext();
        bO_(textView, bz());
        return null;
    }

    private static /* synthetic */ Object d(Object[] objArr) {
        int i10 = f41149g + 51;
        f41152j = i10 % 128;
        int i11 = i10 % 2;
        int i12 = bo().f40084g.scrollIndicatorBackgroundNormalColor;
        int i13 = f41152j + 107;
        f41149g = i13 % 128;
        if (i13 % 2 == 0) {
            return Integer.valueOf(i12);
        }
        throw null;
    }

    public static int f(@NonNull Context context) {
        int i10 = f41152j + 29;
        f41149g = i10 % 128;
        if (i10 % 2 == 0) {
            return e(context, ((Integer) c(new Object[0], -1479778239, 1479778254, (int) System.currentTimeMillis())).intValue());
        }
        e(context, ((Integer) c(new Object[0], -1479778239, 1479778254, (int) System.currentTimeMillis())).intValue());
        throw null;
    }

    @ColorInt
    public static int g(@NonNull Context context) {
        int i10 = f41152j + 13;
        f41149g = i10 % 128;
        int i11 = i10 % 2;
        int iE = e(context, bv());
        if (iE != 0) {
            return iE;
        }
        int i12 = f41152j + 25;
        f41149g = i12 % 128;
        int i13 = i12 % 2;
        return ((Integer) c(new Object[]{context}, 425782924, -425782900, (int) System.currentTimeMillis())).intValue();
    }

    private static /* synthetic */ Object k(Object[] objArr) {
        int i10;
        int i11 = f41152j + 115;
        f41149g = i11 % 128;
        int i12 = i11 % 2;
        int i13 = FaceTecSDK.f40106a.f40091o.progressStrokeWidth;
        if (i13 == -1) {
            i13 = 6;
        }
        if (i13 == 0) {
            int i14 = f41149g + 27;
            f41152j = i14 % 128;
            int i15 = i14 % 2;
            i10 = 0;
        } else {
            i10 = 1;
        }
        int iMax = Math.max(i10, Math.round(i13 * c()));
        int i16 = f41152j + 63;
        f41149g = i16 % 128;
        if (i16 % 2 == 0) {
            return Integer.valueOf(iMax);
        }
        throw null;
    }

    public static int m(@NonNull Context context) {
        int iE;
        int i10 = f41149g + 123;
        f41152j = i10 % 128;
        if (i10 % 2 == 0) {
            iE = e(context, ((Integer) c(new Object[0], 1345592339, -1345592301, (int) System.currentTimeMillis())).intValue());
            int i11 = 80 / 0;
        } else {
            iE = e(context, ((Integer) c(new Object[0], 1345592339, -1345592301, (int) System.currentTimeMillis())).intValue());
        }
        int i12 = f41149g + 13;
        f41152j = i12 % 128;
        if (i12 % 2 != 0) {
            return iE;
        }
        throw null;
    }

    private static /* synthetic */ Object o(Object[] objArr) {
        int i10 = f41149g + 85;
        f41152j = i10 % 128;
        int i11 = i10 % 2;
        float fMin = Math.min(Math.max(FaceTecSDK.f40106a.f40087j.animationRelativeScale, 0.5f), 2.0f);
        int i12 = f41149g + 101;
        f41152j = i12 % 128;
        if (i12 % 2 != 0) {
            return Float.valueOf(fMin);
        }
        throw null;
    }

    public static int p(@NonNull Context context) {
        int i10 = f41152j + 75;
        f41149g = i10 % 128;
        if (i10 % 2 != 0) {
            e(context, ((Integer) c(new Object[0], -1661511514, 1661511539, (int) System.currentTimeMillis())).intValue());
            throw null;
        }
        int iE = e(context, ((Integer) c(new Object[0], -1661511514, 1661511539, (int) System.currentTimeMillis())).intValue());
        int i11 = f41152j + 55;
        f41149g = i11 % 128;
        int i12 = i11 % 2;
        return iE;
    }

    public static int q(@NonNull Context context) {
        int i10 = f41149g + 93;
        f41152j = i10 % 128;
        if (i10 % 2 != 0) {
            return e(context, ((Integer) c(new Object[0], 918655258, -918655235, (int) System.currentTimeMillis())).intValue());
        }
        e(context, ((Integer) c(new Object[0], 918655258, -918655235, (int) System.currentTimeMillis())).intValue());
        throw null;
    }

    private static /* synthetic */ Object s(Object[] objArr) {
        int i10 = f41152j + 23;
        f41149g = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = bo().f40086i.retryScreenOvalStrokeColor;
            throw null;
        }
        int i12 = bo().f40086i.retryScreenOvalStrokeColor;
        int i13 = f41149g + 79;
        f41152j = i13 % 128;
        int i14 = i13 % 2;
        return Integer.valueOf(i12);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0048  */
    private static /* synthetic */ Object x(Object[] objArr) {
        int i10;
        int iIntValue = ((Number) objArr[0]).intValue();
        if (FaceTecSDK.f40108c != FaceTecSDK.c.LOW_LIGHT) {
            int i11 = f41149g + 27;
            f41152j = i11 % 128;
            int i12 = i11 % 2;
            if (FaceTecSDK.f40108c != FaceTecSDK.c.LOW_LIGHT_FROM_SENSOR) {
                if (FaceTecSDK.f40108c == FaceTecSDK.c.BRIGHT_LIGHT) {
                    int i13 = f41152j;
                    int i14 = i13 + 77;
                    f41149g = i14 % 128;
                    if (i14 % 2 != 0) {
                        throw null;
                    }
                    int i15 = i13 + 125;
                    f41149g = i15 % 128;
                    int i16 = i15 % 2;
                    i10 = ViewCompat.MEASURED_STATE_MASK;
                } else {
                    return Integer.valueOf(iIntValue);
                }
            } else {
                int i17 = f41149g + 91;
                f41152j = i17 % 128;
                int i18 = i17 % 2;
                i10 = -1;
            }
        } else {
            int i19 = f41149g + 91;
            f41152j = i19 % 128;
            int i110 = i19 % 2;
            i10 = -1;
        }
        return Integer.valueOf(i10);
    }

    private static /* synthetic */ Object C(Object[] objArr) {
        int i10 = f41152j + 119;
        f41149g = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = FaceTecSDK.f40106a.f40084g.buttonCornerRadius;
            if (i11 == -1) {
                int i12 = f41149g + 99;
                f41152j = i12 % 128;
                int i13 = i12 % 2;
                i11 = 8;
            }
            return Integer.valueOf(Math.round(i11 * c()));
        }
        int i14 = FaceTecSDK.f40106a.f40084g.buttonCornerRadius;
        throw null;
    }

    public static int D() {
        int i10 = f41149g + 69;
        f41152j = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = FaceTecSDK.f40106a.f40086i.buttonCornerRadius;
            if (i11 == -1) {
                i11 = 8;
            } else {
                int i12 = f41152j + 119;
                f41149g = i12 % 128;
                int i13 = i12 % 2;
            }
            return Math.round(i11 * c());
        }
        int i14 = FaceTecSDK.f40106a.f40086i.buttonCornerRadius;
        throw null;
    }

    public static int d(Context context) {
        int i10 = f41152j + 31;
        f41149g = i10 % 128;
        if (i10 % 2 != 0) {
            e(context, bW());
            throw null;
        }
        int iE = e(context, bW());
        int i11 = f41149g + 111;
        f41152j = i11 % 128;
        int i12 = i11 % 2;
        return iE;
    }

    public static int e(@NonNull Context context, int i10) {
        int i11 = f41149g + 53;
        f41152j = i11 % 128;
        if (i11 % 2 != 0) {
            if (AnonymousClass3.f41154c[a(context, i10).ordinal()] != 1) {
                int i12 = f41149g + 13;
                f41152j = i12 % 128;
                int i13 = i12 % 2;
                return i10;
            }
            try {
                return ContextCompat.getColor(context, i10);
            } catch (Throwable unused) {
                return i10;
            }
        }
        int i14 = AnonymousClass3.f41154c[a(context, i10).ordinal()];
        throw null;
    }

    private static /* synthetic */ Object f(Object[] objArr) {
        int i10 = f41152j + 53;
        f41149g = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = bo().f40087j.customResultAnimationSuccess;
            throw null;
        }
        int i12 = bo().f40087j.customResultAnimationSuccess;
        int i13 = f41149g + 33;
        f41152j = i13 % 128;
        int i14 = i13 % 2;
        return Integer.valueOf(i12);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0037, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
    
        r0.setText(android.text.Html.fromHtml(r5));
        r5 = com.facetec.sdk.db.f41149g + 81;
        com.facetec.sdk.db.f41152j = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0049, code lost:
    
        if ((r5 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0023, code lost:
    
        if (android.os.Build.VERSION.SDK_INT >= 127) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002e, code lost:
    
        if (android.os.Build.VERSION.SDK_INT >= 24) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0030, code lost:
    
        r0.setText(android.text.Html.fromHtml(r5, 63));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object m(java.lang.Object[] r5) {
        /*
            r0 = 0
            r0 = r5[r0]
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 1
            r5 = r5[r1]
            java.lang.String r5 = (java.lang.String) r5
            int r1 = com.facetec.sdk.db.f41149g
            int r1 = r1 + 55
            int r2 = r1 % 128
            com.facetec.sdk.db.f41152j = r2
            int r1 = r1 % 2
            java.lang.String r2 = "<br/>"
            java.lang.String r3 = "\n"
            r4 = 0
            if (r1 != 0) goto L26
            java.lang.String r5 = r5.replace(r3, r2)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 127(0x7f, float:1.78E-43)
            if (r1 < r2) goto L38
            goto L30
        L26:
            java.lang.String r5 = r5.replace(r3, r2)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 24
            if (r1 < r2) goto L38
        L30:
            android.text.Spanned r5 = com.esotericsoftware.kryo.serializers.i.c(r5)
            r0.setText(r5)
            return r4
        L38:
            android.text.Spanned r5 = android.text.Html.fromHtml(r5)
            r0.setText(r5)
            int r5 = com.facetec.sdk.db.f41149g
            int r5 = r5 + 81
            int r0 = r5 % 128
            com.facetec.sdk.db.f41152j = r0
            int r5 = r5 % 2
            if (r5 == 0) goto L4c
            return r4
        L4c:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.db.m(java.lang.Object[]):java.lang.Object");
    }

    private static /* synthetic */ Object q(Object[] objArr) {
        int i10 = f41149g + 23;
        f41152j = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = bo().f40087j.customResultAnimationUnsuccess;
            throw null;
        }
        int i12 = bo().f40087j.customResultAnimationUnsuccess;
        int i13 = f41149g + 119;
        f41152j = i13 % 128;
        if (i13 % 2 != 0) {
            return Integer.valueOf(i12);
        }
        int i14 = 33 / 0;
        return Integer.valueOf(i12);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0025  */
    private static /* synthetic */ Object r(Object[] objArr) {
        int i10;
        int i11 = f41149g + 83;
        f41152j = i11 % 128;
        if (i11 % 2 == 0) {
            i10 = bo().f40087j.resultAnimationUnsuccessBackgroundImage;
            int i12 = 10 / 0;
            if (i10 == 0) {
                i10 = FaceTecSDK.f40106a.f40087j.resultAnimationUnsuccessBackgroundImage;
            }
        } else {
            i10 = bo().f40087j.resultAnimationUnsuccessBackgroundImage;
            if (i10 == 0) {
                i10 = FaceTecSDK.f40106a.f40087j.resultAnimationUnsuccessBackgroundImage;
            }
        }
        int i13 = f41152j + 83;
        f41149g = i13 % 128;
        int i14 = i13 % 2;
        return Integer.valueOf(i10);
    }

    public static int s(@NonNull Context context) {
        int i10 = f41152j + 113;
        f41149g = i10 % 128;
        if (i10 % 2 == 0) {
            return e(context, bG());
        }
        e(context, bG());
        throw null;
    }

    private static /* synthetic */ Object w(Object[] objArr) {
        boolean zBooleanValue = ((Boolean) objArr[0]).booleanValue();
        int i10 = f41149g + 103;
        f41152j = i10 % 128;
        if (i10 % 2 != 0) {
            String strC = dd.c(R.string.FaceTec_retry_your_image_label);
            if (!(zBooleanValue && (FaceTecSDK.f40106a.f40078a ^ true) && strC.length() > 20)) {
                return strC;
            }
            int i11 = f41149g + 125;
            f41152j = i11 % 128;
            return i11 % 2 == 0 ? strC.substring(1, 11) : strC.substring(0, 20);
        }
        dd.c(R.string.FaceTec_retry_your_image_label);
        throw null;
    }

    private static /* synthetic */ Object z(Object[] objArr) {
        Context context = (Context) objArr[0];
        GradientDrawable gradientDrawable = new GradientDrawable();
        int iIntValue = ((Integer) c(new Object[0], -1303469013, 1303469052, (int) System.currentTimeMillis())).intValue();
        int i10 = AnonymousClass3.f41154c[a(context, iIntValue).ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                gradientDrawable.setColor(iIntValue);
            }
        } else if (ContextCompat.getDrawable(context, iIntValue) instanceof GradientDrawable) {
            gradientDrawable = (GradientDrawable) ContextCompat.getDrawable(context, iIntValue);
        } else {
            gradientDrawable.setColor(ContextCompat.getColor(context, iIntValue));
        }
        if (gradientDrawable != null) {
            int i11 = f41149g + 81;
            f41152j = i11 % 128;
            int i12 = i11 % 2;
            gradientDrawable.setCornerRadius(ay.e((int) (((Integer) c(new Object[0], 135146601, -135146560, (int) System.currentTimeMillis())).intValue() * d())));
        }
        int i13 = f41152j + 37;
        f41149g = i13 % 128;
        if (i13 % 2 == 0) {
            return gradientDrawable;
        }
        throw null;
    }

    public static FaceTecCustomization a(FaceTecCustomization faceTecCustomization) {
        Typeface typeface = Typeface.DEFAULT_BOLD;
        Typeface typeface2 = Typeface.DEFAULT;
        FaceTecFeedbackCustomization faceTecFeedbackCustomization = faceTecCustomization.f40088k;
        if (faceTecFeedbackCustomization.textFont == null) {
            faceTecFeedbackCustomization.textFont = typeface2;
        }
        FaceTecGuidanceCustomization faceTecGuidanceCustomization = faceTecCustomization.f40086i;
        if (faceTecGuidanceCustomization.headerFont == null) {
            faceTecGuidanceCustomization.headerFont = typeface;
        }
        if (faceTecGuidanceCustomization.subtextFont == null) {
            faceTecGuidanceCustomization.subtextFont = typeface2;
            int i10 = f41149g + 89;
            f41152j = i10 % 128;
            int i11 = i10 % 2;
        }
        if (faceTecGuidanceCustomization.buttonFont == null) {
            faceTecGuidanceCustomization.buttonFont = typeface2;
        }
        FaceTecResultScreenCustomization faceTecResultScreenCustomization = faceTecCustomization.f40087j;
        if (faceTecResultScreenCustomization.messageFont == null) {
            int i12 = f41152j + 91;
            f41149g = i12 % 128;
            if (i12 % 2 != 0) {
                faceTecResultScreenCustomization.messageFont = typeface2;
                int i13 = 58 / 0;
            } else {
                faceTecResultScreenCustomization.messageFont = typeface2;
            }
        }
        FaceTecIDScanCustomization faceTecIDScanCustomization = faceTecCustomization.f40083f;
        if (faceTecIDScanCustomization.headerFont == null) {
            faceTecIDScanCustomization.headerFont = typeface;
        }
        if (faceTecIDScanCustomization.subtextFont == null) {
            int i14 = f41149g + 1;
            f41152j = i14 % 128;
            int i15 = i14 % 2;
            faceTecIDScanCustomization.subtextFont = typeface2;
        }
        if (faceTecIDScanCustomization.buttonFont == null) {
            faceTecIDScanCustomization.buttonFont = typeface2;
        }
        if (faceTecIDScanCustomization.captureScreenFocusMessageFont == null) {
            int i16 = f41152j + 43;
            f41149g = i16 % 128;
            if (i16 % 2 == 0) {
                faceTecIDScanCustomization.captureScreenFocusMessageFont = typeface2;
            } else {
                faceTecIDScanCustomization.captureScreenFocusMessageFont = typeface2;
                throw null;
            }
        }
        FaceTecOCRConfirmationCustomization faceTecOCRConfirmationCustomization = faceTecCustomization.f40084g;
        if (faceTecOCRConfirmationCustomization.buttonFont == null) {
            faceTecOCRConfirmationCustomization.buttonFont = typeface2;
        }
        if (faceTecOCRConfirmationCustomization.mainHeaderFont == null) {
            int i17 = f41152j + 1;
            f41149g = i17 % 128;
            if (i17 % 2 == 0) {
                faceTecOCRConfirmationCustomization.mainHeaderFont = typeface;
            } else {
                faceTecOCRConfirmationCustomization.mainHeaderFont = typeface;
                throw null;
            }
        }
        if (faceTecOCRConfirmationCustomization.sectionHeaderFont == null) {
            int i18 = f41149g + 63;
            f41152j = i18 % 128;
            if (i18 % 2 == 0) {
                faceTecOCRConfirmationCustomization.sectionHeaderFont = typeface;
                int i19 = 39 / 0;
            } else {
                faceTecOCRConfirmationCustomization.sectionHeaderFont = typeface;
            }
        }
        if (faceTecOCRConfirmationCustomization.fieldLabelFont == null) {
            int i20 = f41152j + 53;
            f41149g = i20 % 128;
            if (i20 % 2 == 0) {
                faceTecOCRConfirmationCustomization.fieldLabelFont = typeface2;
            } else {
                faceTecOCRConfirmationCustomization.fieldLabelFont = typeface2;
                throw null;
            }
        }
        if (faceTecOCRConfirmationCustomization.fieldValueFont == null) {
            faceTecOCRConfirmationCustomization.fieldValueFont = typeface2;
        }
        if (faceTecOCRConfirmationCustomization.inputFieldFont == null) {
            int i21 = f41152j + 91;
            f41149g = i21 % 128;
            int i22 = i21 % 2;
            faceTecOCRConfirmationCustomization.inputFieldFont = faceTecOCRConfirmationCustomization.fieldValueFont;
        }
        if (faceTecOCRConfirmationCustomization.inputFieldPlaceholderFont == null) {
            faceTecOCRConfirmationCustomization.inputFieldPlaceholderFont = faceTecOCRConfirmationCustomization.inputFieldFont;
        }
        if (faceTecOCRConfirmationCustomization.scrollIndicatorFont == null) {
            faceTecOCRConfirmationCustomization.scrollIndicatorFont = typeface2;
        }
        return faceTecCustomization;
    }

    public static void d(@NonNull View view) {
        int i10 = f41152j + 117;
        f41149g = i10 % 128;
        if (i10 % 2 == 0) {
            int iIntValue = ((Integer) c(new Object[0], 45844550, -45844549, (int) System.currentTimeMillis())).intValue();
            int i11 = AnonymousClass3.f41154c[a(view.getContext(), iIntValue).ordinal()];
            if (i11 != 1) {
                if (i11 == 2) {
                    view.setBackgroundColor(iIntValue);
                }
                int i12 = f41152j + 91;
                f41149g = i12 % 128;
                int i13 = i12 % 2;
                return;
            }
            view.setBackgroundResource(iIntValue);
            int i14 = f41152j + 59;
            f41149g = i14 % 128;
            if (i14 % 2 != 0) {
                throw null;
            }
            return;
        }
        int i15 = AnonymousClass3.f41154c[a(view.getContext(), ((Integer) c(new Object[0], 45844550, -45844549, (int) System.currentTimeMillis())).intValue()).ordinal()];
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x005b A[PHI: r9
      0x005b: PHI (r9v2 java.lang.String) = (r9v1 java.lang.String), (r9v9 java.lang.String) binds: [B:8:0x0059, B:5:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
    public static void f(boolean z10) {
        String strC;
        int i10 = f41152j + 23;
        f41149g = i10 % 128;
        if (i10 % 2 != 0) {
            String str = (String) c(new Object[]{Boolean.TRUE, Boolean.valueOf(z10)}, 1908944937, -1908944918, (int) System.currentTimeMillis());
            strC = c(true, z10);
            if (str.length() > 103) {
                d("Ready Screen Subtext Line 1");
            }
        } else {
            String str2 = (String) c(new Object[]{Boolean.FALSE, Boolean.valueOf(z10)}, 1908944937, -1908944918, (int) System.currentTimeMillis());
            strC = c(false, z10);
            if (str2.length() > 50) {
                d("Ready Screen Subtext Line 1");
            }
        }
        if (strC.length() > 50) {
            int i11 = f41152j + 105;
            f41149g = i11 % 128;
            int i12 = i11 % 2;
            d("Ready Screen Subtext Line 2");
        }
    }

    private static /* synthetic */ Object i(Object[] objArr) {
        Button button = (Button) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i10 = f41149g + 107;
        f41152j = i10 % 128;
        int i11 = i10 % 2;
        button.setTextColor(iIntValue);
        int i12 = f41149g + 71;
        f41152j = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 50 / 0;
        }
        return null;
    }

    private static /* synthetic */ Object v(Object[] objArr) {
        int i10;
        int i11 = f41152j + 119;
        f41149g = i11 % 128;
        if (i11 % 2 != 0) {
            i10 = bo().f40086i.retryScreenHeaderTextColor;
            int i12 = 33 / 0;
        } else {
            i10 = bo().f40086i.retryScreenHeaderTextColor;
        }
        int i13 = f41152j + 61;
        f41149g = i13 % 128;
        int i14 = i13 % 2;
        return Integer.valueOf(i10);
    }

    public static int k(@NonNull Context context) {
        int i10 = f41152j + 51;
        f41149g = i10 % 128;
        int i11 = i10 % 2;
        int iA = a(e(context, ((Integer) c(new Object[0], 45844550, -45844549, (int) System.currentTimeMillis())).intValue()), 255);
        int i12 = f41149g + 89;
        f41152j = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 47 / 0;
        }
        return iA;
    }

    public static void g(boolean z10) {
        int i10 = f41149g + 107;
        f41152j = i10 % 128;
        int i11 = i10 % 2;
        if (((String) c(new Object[]{Boolean.FALSE, Boolean.valueOf(z10)}, 583844572, -583844543, (int) System.currentTimeMillis())).length() > 40) {
            int i12 = f41152j + 113;
            f41149g = i12 % 128;
            int i13 = i12 % 2;
            d("Retry Screen Sub-Header Message");
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x005d A[PHI: r2
      0x005d: PHI (r2v9 java.lang.String) = (r2v8 java.lang.String), (r2v11 java.lang.String) binds: [B:16:0x005b, B:13:0x004e] A[DONT_GENERATE, DONT_INLINE]] */
    private static /* synthetic */ Object n(Object[] objArr) {
        boolean zBooleanValue = ((Boolean) objArr[0]).booleanValue();
        boolean zBooleanValue2 = ((Boolean) objArr[1]).booleanValue();
        String strC = FaceTecSDK.f40106a.f40086i.readyScreenSubtextAttributedString;
        if (!strC.isEmpty() && strC.contains(RootService.LINE_BREAK)) {
            strC = strC.substring(0, strC.indexOf(RootService.LINE_BREAK));
        }
        if (!zBooleanValue2 && strC.isEmpty()) {
            int i10 = f41149g + 123;
            f41152j = i10 % 128;
            if (i10 % 2 == 0) {
                strC = dd.c(R.string.FaceTec_instructions_message_ready_1);
                int i11 = 7 / 0;
                if (strC.contains(RootService.LINE_BREAK)) {
                    strC = strC.substring(0, strC.indexOf(RootService.LINE_BREAK));
                }
            } else {
                strC = dd.c(R.string.FaceTec_instructions_message_ready_1);
                if (strC.contains(RootService.LINE_BREAK)) {
                    strC = strC.substring(0, strC.indexOf(RootService.LINE_BREAK));
                }
            }
        }
        if (!zBooleanValue) {
            return strC;
        }
        int i12 = f41152j + 115;
        f41149g = i12 % 128;
        int i13 = i12 % 2;
        if (FaceTecSDK.f40106a.f40078a) {
            return strC;
        }
        int i14 = f41152j + 111;
        f41149g = i14 % 128;
        int i15 = i14 % 2;
        if (strC.length() <= 50) {
            return strC;
        }
        int i16 = f41149g + 23;
        f41152j = i16 % 128;
        int i17 = i16 % 2;
        return strC.substring(0, 50);
    }

    public static void h(@NonNull View view) {
        int i10 = f41152j + 61;
        f41149g = i10 % 128;
        if (i10 % 2 == 0) {
            d(view, bw());
        } else {
            d(view, bw());
            throw null;
        }
    }

    public static void i(boolean z10) {
        int i10 = f41149g + 47;
        f41152j = i10 % 128;
        int i11 = i10 % 2;
        String strE = e(false, z10);
        if (strE.length() > 30) {
            d("Retry Screen Header");
            return;
        }
        if (strE.length() > 20) {
            int i12 = f41152j + 5;
            f41149g = i12 % 128;
            if (i12 % 2 == 0) {
                e("Retry Screen Header");
            } else {
                e("Retry Screen Header");
                throw null;
            }
        }
    }

    private static /* synthetic */ Object j(Object[] objArr) {
        int i10 = f41149g;
        int i11 = i10 + 83;
        f41152j = i11 % 128;
        int i12 = i11 % 2;
        int i13 = i10 + 69;
        f41152j = i13 % 128;
        if (i13 % 2 != 0) {
            return -1;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        r4 = 18 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0010, code lost:
    
        if (r3 != 0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0013, code lost:
    
        if (r3 != 0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0015, code lost:
    
        r0 = r0 + 75;
        com.facetec.sdk.db.f41152j = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        if ((r0 % 2) != 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int b(int r3, int r4) {
        /*
            int r0 = com.facetec.sdk.db.f41149g
            int r1 = r0 + 7
            int r2 = r1 % 128
            com.facetec.sdk.db.f41152j = r2
            int r1 = r1 % 2
            if (r1 != 0) goto L13
            r1 = 90
            int r1 = r1 / 0
            if (r3 == 0) goto L24
            goto L15
        L13:
            if (r3 == 0) goto L24
        L15:
            int r0 = r0 + 75
            int r4 = r0 % 128
            com.facetec.sdk.db.f41152j = r4
            int r0 = r0 % 2
            if (r0 != 0) goto L23
            r4 = 18
            int r4 = r4 / 0
        L23:
            return r3
        L24:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.db.b(int, int):int");
    }

    private static /* synthetic */ Object e(Object[] objArr) {
        int i10 = f41149g + 107;
        f41152j = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = FaceTecSDK.f40106a.f40085h.backgroundColor;
            ((Integer) c(new Object[]{Integer.valueOf(i11)}, 1987282240, -1987282205, i11)).intValue();
            throw null;
        }
        int i12 = FaceTecSDK.f40106a.f40085h.backgroundColor;
        int iIntValue = ((Integer) c(new Object[]{Integer.valueOf(i12)}, 1987282240, -1987282205, i12)).intValue();
        int i13 = f41149g + 83;
        f41152j = i13 % 128;
        int i14 = i13 % 2;
        return Integer.valueOf(iIntValue);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0045  */
    @ColorInt
    public static int j(@NonNull Context context) {
        int iE;
        int i10 = f41152j + 35;
        f41149g = i10 % 128;
        if (i10 % 2 != 0) {
            iE = e(context, ((Integer) c(new Object[0], 410242885, -410242851, (int) System.currentTimeMillis())).intValue());
            int i11 = 10 / 0;
            if (iE == 0) {
                int i12 = f41149g + 63;
                f41152j = i12 % 128;
                int i13 = i12 % 2;
                iE = ((Integer) c(new Object[]{context}, 425782924, -425782900, (int) System.currentTimeMillis())).intValue();
            }
        } else {
            iE = e(context, ((Integer) c(new Object[0], 410242885, -410242851, (int) System.currentTimeMillis())).intValue());
            if (iE == 0) {
                int i14 = f41149g + 63;
                f41152j = i14 % 128;
                int i15 = i14 % 2;
                iE = ((Integer) c(new Object[]{context}, 425782924, -425782900, (int) System.currentTimeMillis())).intValue();
            }
        }
        int i16 = f41149g + 35;
        f41152j = i16 % 128;
        int i17 = i16 % 2;
        return iE;
    }

    public static int e(Context context) {
        int identifier;
        int i10 = f41149g + 99;
        f41152j = i10 % 128;
        int i11 = i10 % 2;
        if (FaceTecSDK.f40106a.f40081d) {
            identifier = bo().f40083f.standaloneIDScanWatermark;
            if (identifier == 0) {
                int i12 = f41149g + 115;
                f41152j = i12 % 128;
                if (i12 % 2 == 0) {
                    identifier = FaceTecSDK.f40106a.f40083f.standaloneIDScanWatermark;
                    int i13 = 47 / 0;
                } else {
                    identifier = FaceTecSDK.f40106a.f40083f.standaloneIDScanWatermark;
                }
            }
            if (identifier == 0) {
                int i14 = f41152j + 121;
                f41149g = i14 % 128;
                if (i14 % 2 == 0) {
                    identifier = context.getResources().getIdentifier("facetec_standalone_id_scan_watermark", PluginUtils.IDENTIFIER_DRAWABLE, context.getPackageName());
                } else {
                    context.getResources().getIdentifier("facetec_standalone_id_scan_watermark", PluginUtils.IDENTIFIER_DRAWABLE, context.getPackageName());
                    throw null;
                }
            }
        } else {
            identifier = 0;
        }
        if (identifier != 0) {
            return identifier;
        }
        int i15 = f41149g + 67;
        f41152j = i15 % 128;
        if (i15 % 2 == 0) {
            int i16 = 4 / 0;
            return R.drawable.facetec_internal_id_scan_watermark;
        }
        return R.drawable.facetec_internal_id_scan_watermark;
    }

    public static int r(@NonNull Context context) {
        return ((Integer) c(new Object[]{context}, -188757680, 188757724, (int) System.currentTimeMillis())).intValue();
    }

    public static void c(@NonNull View view) {
        int i10 = f41149g + 89;
        f41152j = i10 % 128;
        int i11 = i10 % 2;
        int iBu = bu();
        int i12 = AnonymousClass3.f41154c[a(view.getContext(), iBu).ordinal()];
        if (i12 == 1) {
            view.setBackgroundResource(iBu);
            return;
        }
        if (i12 != 2) {
            view.setBackgroundColor(0);
            return;
        }
        view.setBackgroundColor(iBu);
        int i13 = f41152j + 21;
        f41149g = i13 % 128;
        if (i13 % 2 != 0) {
            throw null;
        }
    }

    @ColorInt
    private static int x(@NonNull Context context) {
        return ((Integer) c(new Object[]{context}, 425782924, -425782900, (int) System.currentTimeMillis())).intValue();
    }

    public static int b(Context context) {
        int i10 = f41149g + 83;
        f41152j = i10 % 128;
        int i11 = i10 % 2;
        int iE = e(context, bV());
        int i12 = f41152j + 39;
        f41149g = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 64 / 0;
        }
        return iE;
    }

    public static void b(@NonNull View view) {
        int i10 = f41152j + 37;
        f41149g = i10 % 128;
        if (i10 % 2 == 0) {
            int iK = K();
            int i11 = AnonymousClass3.f41154c[a(view.getContext(), iK).ordinal()];
            if (i11 == 1) {
                view.setBackgroundResource(iK);
                return;
            }
            if (i11 != 2) {
                view.setBackgroundColor(0);
                int i12 = f41152j + 91;
                f41149g = i12 % 128;
                int i13 = i12 % 2;
                return;
            }
            view.setBackgroundColor(iK);
            return;
        }
        int i14 = AnonymousClass3.f41154c[a(view.getContext(), K()).ordinal()];
        throw null;
    }

    private static void d(@NonNull View view, int i10) {
        int i11 = AnonymousClass3.f41154c[a(view.getContext(), i10).ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                view.setBackgroundColor(a(i10, 255));
            }
            int i12 = f41149g + 99;
            f41152j = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = 18 / 0;
                return;
            }
            return;
        }
        if (ContextCompat.getDrawable(view.getContext(), i10) != null) {
            Drawable drawableMutate = ContextCompat.getDrawable(view.getContext(), i10).mutate();
            if (drawableMutate instanceof ShapeDrawable) {
                int i14 = f41149g + 47;
                f41152j = i14 % 128;
                if (i14 % 2 == 0) {
                    ((ShapeDrawable) drawableMutate).getPaint().setAlpha(15016);
                } else {
                    ((ShapeDrawable) drawableMutate).getPaint().setAlpha(255);
                }
            } else if (drawableMutate instanceof GradientDrawable) {
                int i15 = f41152j + 97;
                f41149g = i15 % 128;
                if (i15 % 2 != 0) {
                    drawableMutate = bE_(view.getContext(), (GradientDrawable) drawableMutate);
                    int i16 = 47 / 0;
                } else {
                    drawableMutate = bE_(view.getContext(), (GradientDrawable) drawableMutate);
                }
            } else if (drawableMutate instanceof ColorDrawable) {
                drawableMutate.setAlpha(255);
            }
            view.setBackground(drawableMutate);
            return;
        }
        view.setBackgroundColor(a(ContextCompat.getColor(view.getContext(), i10), 255));
    }

    public static int i() {
        return ((Integer) c(new Object[0], -920817160, 920817172, (int) System.currentTimeMillis())).intValue();
    }

    public static void j(@NonNull View view) {
        int i10 = f41149g + 47;
        f41152j = i10 % 128;
        if (i10 % 2 != 0) {
            d(view, bP());
            int i11 = f41149g + 97;
            f41152j = i11 % 128;
            int i12 = i11 % 2;
            return;
        }
        d(view, bP());
        throw null;
    }

    @ColorInt
    public static int c(@ColorInt int i10, float f6) {
        float fAlpha;
        int i11 = f41149g + 93;
        f41152j = i11 % 128;
        if (i11 % 2 == 0) {
            fAlpha = Color.alpha(i10) % f6;
        } else {
            fAlpha = Color.alpha(i10) * f6;
        }
        int iArgb = Color.argb(Math.round(fAlpha), Color.red(i10), Color.green(i10), Color.blue(i10));
        int i12 = f41152j + 45;
        f41149g = i12 % 128;
        if (i12 % 2 == 0) {
            return iArgb;
        }
        throw null;
    }

    public static void j(boolean z10) {
        c(new Object[]{Boolean.valueOf(z10)}, -1782390247, 1782390279, (int) System.currentTimeMillis());
    }

    public static String j(boolean z10, boolean z11) {
        return (String) c(new Object[]{Boolean.valueOf(z10), Boolean.valueOf(z11)}, 583844572, -583844543, (int) System.currentTimeMillis());
    }

    public static int b(@NonNull Context context, int i10) {
        int i11 = AnonymousClass3.f41154c[a(context, i10).ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                return 255;
            }
            return (i10 >> 24) & 255;
        }
        Drawable drawable = ContextCompat.getDrawable(context, i10);
        if (drawable != null) {
            if (drawable instanceof ShapeDrawable) {
                int i12 = f41152j + 105;
                f41149g = i12 % 128;
                if (i12 % 2 == 0) {
                    return ((ShapeDrawable) drawable).getPaint().getAlpha();
                }
                int i13 = 14 / 0;
                return ((ShapeDrawable) drawable).getPaint().getAlpha();
            }
            if (drawable instanceof GradientDrawable) {
                if (Build.VERSION.SDK_INT >= 24) {
                    int i14 = f41152j + 61;
                    f41149g = i14 % 128;
                    int i15 = i14 % 2;
                    return a(context, ((GradientDrawable) drawable).getColors());
                }
                int iK = 255 & (k(context) >> 24);
                int i16 = f41149g + 11;
                f41152j = i16 % 128;
                int i17 = i16 % 2;
                return iK;
            }
            if (drawable instanceof ColorDrawable) {
                return drawable.getAlpha();
            }
            return 255;
        }
        return 255 & (ContextCompat.getColor(context, i10) >> 24);
    }

    public static void e(@NonNull View view) {
        int i10 = f41149g + 123;
        f41152j = i10 % 128;
        int i11 = i10 % 2;
        int iIntValue = ((Integer) c(new Object[0], -754104162, 754104165, (int) System.currentTimeMillis())).intValue();
        int i12 = AnonymousClass3.f41154c[a(view.getContext(), iIntValue).ordinal()];
        if (i12 != 1) {
            if (i12 != 2) {
                view.setBackgroundColor(0);
                return;
            } else {
                view.setBackgroundColor(iIntValue);
                return;
            }
        }
        view.setBackgroundColor(ContextCompat.getColor(view.getContext(), iIntValue));
        int i13 = f41152j + 79;
        f41149g = i13 % 128;
        int i14 = i13 % 2;
    }

    public static String c(boolean z10, boolean z11) {
        String strSubstring = FaceTecSDK.f40106a.f40086i.readyScreenSubtextAttributedString;
        if (!strSubstring.isEmpty() && strSubstring.contains(RootService.LINE_BREAK)) {
            strSubstring = strSubstring.substring(strSubstring.indexOf(RootService.LINE_BREAK) + 1);
        }
        if ((!z11) && strSubstring.isEmpty()) {
            strSubstring = dd.c(R.string.FaceTec_instructions_message_ready_2);
            if (strSubstring.contains(RootService.LINE_BREAK)) {
                int i10 = f41149g + 85;
                f41152j = i10 % 128;
                int i11 = i10 % 2;
                strSubstring = strSubstring.substring(strSubstring.indexOf(RootService.LINE_BREAK) + 1);
            }
        }
        if (z10) {
            int i12 = f41149g + 101;
            f41152j = i12 % 128;
            int i13 = i12 % 2;
            if (!FaceTecSDK.f40106a.f40078a) {
                int i14 = f41149g + 53;
                f41152j = i14 % 128;
                if (i14 % 2 != 0 ? strSubstring.length() > 50 : strSubstring.length() > 51) {
                    int i15 = f41152j;
                    int i16 = i15 + 49;
                    f41149g = i16 % 128;
                    int i17 = i16 % 2;
                    int i18 = i15 + 51;
                    f41149g = i18 % 128;
                    int i19 = i18 % 2;
                    strSubstring = strSubstring.substring(0, 50);
                }
            }
        }
        int i20 = f41152j + 27;
        f41149g = i20 % 128;
        int i21 = i20 % 2;
        return strSubstring;
    }

    public static String d(boolean z10) {
        String strC = dd.c(R.string.FaceTec_retry_ideal_image_label);
        if (!z10 || !(!FaceTecSDK.f40106a.f40078a)) {
            return strC;
        }
        int i10 = f41149g + 7;
        f41152j = i10 % 128;
        int i11 = i10 % 2;
        if (strC.length() <= 20) {
            return strC;
        }
        int i12 = f41152j + 57;
        f41149g = i12 % 128;
        int i13 = i12 % 2;
        return strC.substring(0, 20);
    }

    public static String e(boolean z10, boolean z11) {
        String strC = FaceTecSDK.f40106a.f40086i.retryScreenHeaderAttributedString;
        if (!z11) {
            int i10 = f41149g + 93;
            f41152j = i10 % 128;
            int i11 = i10 % 2;
            if (!(!strC.isEmpty())) {
                strC = dd.c(R.string.FaceTec_retry_header);
            }
        }
        if (!z10) {
            return strC;
        }
        int i12 = f41152j + 15;
        f41149g = i12 % 128;
        if (i12 % 2 == 0) {
            return (FaceTecSDK.f40106a.f40078a || strC.length() <= 30) ? strC : strC.substring(0, 30);
        }
        boolean z12 = FaceTecSDK.f40106a.f40078a;
        throw null;
    }

    public static String d(dj djVar) {
        int i10 = f41149g + 73;
        f41152j = i10 % 128;
        int i11 = i10 % 2;
        HashMap<dj, String> map = FaceTecCustomization.f40077s;
        if (map == null) {
            return null;
        }
        int i12 = f41149g + 77;
        f41152j = i12 % 128;
        if (i12 % 2 != 0) {
            return map.get(djVar);
        }
        map.get(djVar);
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0083  */
    public static String b(boolean z10, boolean z11) {
        String strC = FaceTecSDK.f40106a.f40086i.readyScreenHeaderAttributedString;
        boolean z12 = true;
        if (!strC.isEmpty() && strC.contains(RootService.LINE_BREAK)) {
            int i10 = f41152j + 115;
            f41149g = i10 % 128;
            int i11 = i10 % 2;
            strC = strC.substring(strC.indexOf(RootService.LINE_BREAK) + 1);
        }
        if (!z11) {
            int i12 = f41149g + 5;
            f41152j = i12 % 128;
            int i13 = i12 % 2;
            if (!(!strC.isEmpty())) {
                strC = dd.c(R.string.FaceTec_instructions_header_ready_2);
                if (strC.contains(RootService.LINE_BREAK)) {
                    strC = strC.substring(strC.indexOf(RootService.LINE_BREAK) + 1);
                }
            }
        }
        if (z10) {
            int i14 = f41149g + 17;
            f41152j = i14 % 128;
            int i15 = i14 % 2;
            if (!FaceTecSDK.f40106a.f40078a) {
                int i16 = f41149g + 121;
                f41152j = i16 % 128;
                if (i16 % 2 != 0 ? strC.length() <= 30 : strC.length() <= 23) {
                    z12 = false;
                }
            } else {
                z12 = false;
            }
        } else {
            z12 = false;
        }
        return z12 ? strC.substring(0, 30) : strC;
    }

    public static String e(boolean z10) {
        String strC = dd.c(R.string.FaceTec_retry_instruction_message_3);
        if (z10 && !FaceTecSDK.f40106a.f40078a && strC.length() > 40) {
            int i10 = f41149g + 57;
            f41152j = i10 % 128;
            int i11 = i10 % 2;
            return strC.substring(0, 40);
        }
        int i12 = f41149g + 87;
        f41152j = i12 % 128;
        int i13 = i12 % 2;
        return strC;
    }

    private static void d(String str) {
        int i10 = f41149g + 99;
        f41152j = i10 % 128;
        aw.b(i10 % 2 == 0 ? String.format(Locale.getDefault(), "FaceTec SDK Text Customization Alert: Your text is too long for the %s text element to render correctly on a significant portion of supported devices. Please update this text string to short, concise text, based on our default text element for optimal User Experience and Success Rates. If you continue with too many characters, the FaceTec SDK will not show the excess characters, and this will likely impact User Experience and Success Rates. These character limitations must be in place to ensure compatibility with the 1,000,000+ Device/Model/Platform/Version/Screen Size/Camera Res combinations that FaceTec supports.", str) : String.format(Locale.getDefault(), "FaceTec SDK Text Customization Alert: Your text is too long for the %s text element to render correctly on a significant portion of supported devices. Please update this text string to short, concise text, based on our default text element for optimal User Experience and Success Rates. If you continue with too many characters, the FaceTec SDK will not show the excess characters, and this will likely impact User Experience and Success Rates. These character limitations must be in place to ensure compatibility with the 1,000,000+ Device/Model/Platform/Version/Screen Size/Camera Res combinations that FaceTec supports.", str));
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003e  */
    /* JADX WARN: Code duplicated, block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0023 A[PHI: r0
      0x0023: PHI (r0v5 java.lang.String) = (r0v4 java.lang.String), (r0v10 java.lang.String) binds: [B:8:0x0021, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    public static String c(boolean z10) {
        String strC;
        boolean z11;
        int i10 = f41152j + 73;
        f41149g = i10 % 128;
        if (i10 % 2 != 0) {
            strC = dd.c(R.string.FaceTec_retry_instruction_message_2);
            int i11 = 87 / 0;
            if (z10) {
                if (FaceTecSDK.f40106a.f40078a && strC.length() > 40) {
                    int i12 = f41152j + 11;
                    f41149g = i12 % 128;
                    int i13 = i12 % 2;
                    z11 = true;
                }
            }
            if (z11) {
                return strC.substring(0, 40);
            }
            return strC;
        }
        strC = dd.c(R.string.FaceTec_retry_instruction_message_2);
        if (z10) {
            if (FaceTecSDK.f40106a.f40078a) {
            }
        }
        if (z11) {
            return strC.substring(0, 40);
        }
        return strC;
        z11 = false;
        if (z11) {
            return strC.substring(0, 40);
        }
        return strC;
    }

    public static String d(boolean z10, boolean z11) {
        return (String) c(new Object[]{Boolean.valueOf(z10), Boolean.valueOf(z11)}, 1908944937, -1908944918, (int) System.currentTimeMillis());
    }

    private static void e(String str) {
        String str2;
        int i10 = f41149g + 19;
        f41152j = i10 % 128;
        if (i10 % 2 == 0) {
            Locale locale = Locale.getDefault();
            Object[] objArr = new Object[5];
            objArr[0] = str;
            objArr[0] = 119;
            objArr[5] = 71;
            str2 = String.format(locale, "Your %s text has been configured to use more than %d characters.  %d or less characters is recommended for this text in order to render well on all devices and OS versions.", objArr);
        } else {
            str2 = String.format(Locale.getDefault(), "Your %s text has been configured to use more than %d characters.  %d or less characters is recommended for this text in order to render well on all devices and OS versions.", str, 20, 20);
        }
        aw.b(str2);
    }

    private static int e(int i10) {
        return ((Integer) c(new Object[]{Integer.valueOf(i10)}, 1987282240, -1987282205, i10)).intValue();
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0139 A[PHI: r4
      0x0139: PHI (r4v99 java.lang.String) = (r4v98 java.lang.String), (r4v110 java.lang.String) binds: [B:30:0x0137, B:27:0x0128] A[DONT_GENERATE, DONT_INLINE]] */
    public static /* synthetic */ Object c(Object[] objArr, int i10, int i11, int i12) {
        int iE;
        int i13;
        String strB;
        int i14 = (i11 * 591) + (i10 * (-589));
        int i15 = ~i11;
        int i16 = ~i12;
        int i17 = (~(i15 | i10)) | (~(i15 | i16)) | (~(i16 | i10));
        int i18 = ~i10;
        switch ((((~(i18 | i16)) | (~(i11 | i16))) * 590) + (i17 * (-1180)) + (((~(i12 | i18 | i11)) | i17) * 590) + i14) {
            case 1:
                int i19 = f41149g + 69;
                f41152j = i19 % 128;
                int i20 = i19 % 2;
                int i21 = FaceTecSDK.f40106a.f40089l.backgroundColor;
                int iIntValue = ((Integer) c(new Object[]{Integer.valueOf(i21)}, 1987282240, -1987282205, i21)).intValue();
                int i22 = f41149g + 121;
                f41152j = i22 % 128;
                int i23 = i22 % 2;
                return Integer.valueOf(iIntValue);
            case 2:
                Context context = (Context) objArr[0];
                int i24 = f41152j + 29;
                f41149g = i24 % 128;
                int i25 = i24 % 2;
                int iA = bo().f40084g.inputFieldPlaceholderTextColor;
                if (iA == 0) {
                    int i26 = f41152j + 95;
                    f41149g = i26 % 128;
                    if (i26 % 2 != 0) {
                        iE = e(context, aq());
                        i13 = 4;
                    } else {
                        iE = e(context, aq());
                        i13 = 102;
                    }
                    iA = a(iE, i13);
                }
                return Integer.valueOf(iA);
            case 3:
                return e(objArr);
            case 4:
                int i27 = f41149g + 51;
                f41152j = i27 % 128;
                int i28 = i27 % 2;
                int i29 = bo().f40086i.buttonBackgroundHighlightColor;
                int i30 = f41152j + 15;
                f41149g = i30 % 128;
                int i31 = i30 % 2;
                return Integer.valueOf(i29);
            case 5:
                return b(objArr);
            case 6:
                int i32 = f41149g + 77;
                f41152j = i32 % 128;
                int i33 = i32 % 2;
                int i34 = bo().f40083f.additionalReviewScreenForegroundColor;
                int i35 = f41152j + 73;
                f41149g = i35 % 128;
                int i36 = i35 % 2;
                return Integer.valueOf(i34);
            case 7:
                return a(objArr);
            case 8:
                return c(objArr);
            case 9:
                int i37 = f41152j + 17;
                f41149g = i37 % 128;
                int i38 = i37 % 2;
                int i39 = bo().f40083f.customStaticNFCScanningAnimation;
                int i40 = f41149g + 13;
                f41152j = i40 % 128;
                int i41 = i40 % 2;
                return Integer.valueOf(i39);
            case 10:
                return d(objArr);
            case 11:
                return i(objArr);
            case 12:
                return j(objArr);
            case 13:
                return g(objArr);
            case 14:
                return f(objArr);
            case 15:
                return h(objArr);
            case 16:
                return k(objArr);
            case 17:
                return o(objArr);
            case 18:
                return l(objArr);
            case 19:
                return n(objArr);
            case 20:
                int i42 = f41152j + 103;
                f41149g = i42 % 128;
                int i43 = i42 % 2;
                int i44 = bo().f40083f.customNFCStartingAnimation;
                int i45 = f41152j + 107;
                f41149g = i45 % 128;
                int i46 = i45 % 2;
                return Integer.valueOf(i44);
            case 21:
                return m(objArr);
            case 22:
                return r(objArr);
            case 23:
                return s(objArr);
            case 24:
                Context context2 = (Context) objArr[0];
                int i47 = f41152j + 33;
                f41149g = i47 % 128;
                int i48 = i47 % 2;
                int iE2 = e(context2, bz());
                int i49 = f41149g + 111;
                f41152j = i49 % 128;
                int i50 = i49 % 2;
                return Integer.valueOf(iE2);
            case 25:
                int i51 = f41149g + 81;
                f41152j = i51 % 128;
                int i52 = i51 % 2;
                int i53 = bo().m.defaultAnimationBackgroundColor;
                int i54 = f41152j + 59;
                f41149g = i54 % 128;
                int i55 = i54 % 2;
                return Integer.valueOf(i53);
            case 26:
                return t(objArr);
            case 27:
                return q(objArr);
            case 28:
                return p(objArr);
            case 29:
                boolean zBooleanValue = ((Boolean) objArr[0]).booleanValue();
                boolean zBooleanValue2 = ((Boolean) objArr[1]).booleanValue();
                String strC = FaceTecSDK.f40106a.f40086i.retryScreenSubtextAttributedString;
                if (!zBooleanValue2) {
                    int i56 = f41149g + 91;
                    f41152j = i56 % 128;
                    int i57 = i56 % 2;
                    if (strC.isEmpty()) {
                        strC = dd.c(R.string.FaceTec_retry_subheader_message);
                    }
                }
                if (!zBooleanValue || FaceTecSDK.f40106a.f40078a || strC.length() <= 40) {
                    return strC;
                }
                int i58 = f41152j + 109;
                f41149g = i58 % 128;
                int i59 = i58 % 2;
                return strC.substring(0, 40);
            case 30:
                return u(objArr);
            case 31:
                return y(objArr);
            case 32:
                boolean zBooleanValue3 = ((Boolean) objArr[0]).booleanValue();
                int i60 = f41149g + 123;
                f41152j = i60 % 128;
                if (i60 % 2 == 0) {
                    String strA = a(false, zBooleanValue3);
                    strB = b(true, zBooleanValue3);
                    if (strA.length() > 15) {
                        d("Ready Screen Header Line 1");
                    }
                } else {
                    String strA2 = a(false, zBooleanValue3);
                    strB = b(false, zBooleanValue3);
                    if (strA2.length() > 30) {
                        d("Ready Screen Header Line 1");
                    }
                }
                if (strB.length() > 30) {
                    int i61 = f41152j + 5;
                    f41149g = i61 % 128;
                    int i62 = i61 % 2;
                    d("Ready Screen Header Line 2");
                    int i63 = f41149g + 115;
                    f41152j = i63 % 128;
                    int i64 = i63 % 2;
                }
                return null;
            case 33:
                return w(objArr);
            case 34:
                return v(objArr);
            case 35:
                return x(objArr);
            case 36:
                return B(objArr);
            case 37:
                return D(objArr);
            case 38:
                return A(objArr);
            case 39:
                int i65 = f41152j + 113;
                f41149g = i65 % 128;
                int i66 = i65 % 2;
                int i67 = bo().f40088k.backgroundColors;
                int i68 = f41152j + 51;
                f41149g = i68 % 128;
                int i69 = i68 % 2;
                return Integer.valueOf(i67);
            case 40:
                return C(objArr);
            case 41:
                int i70 = FaceTecSDK.f40106a.f40088k.cornerRadius;
                if (i70 == -1) {
                    int i71 = f41152j + 91;
                    int i72 = i71 % 128;
                    f41149g = i72;
                    int i73 = i71 % 2;
                    int i74 = i72 + 117;
                    f41152j = i74 % 128;
                    int i75 = i74 % 2;
                    i70 = 3;
                }
                return Integer.valueOf(Math.round(i70 * c()));
            case 42:
                int i76 = f41152j + 33;
                f41149g = i76 % 128;
                int i77 = i76 % 2;
                int i78 = FaceTecSDK.f40106a.f40083f.captureFrameCornerRadius;
                if (i78 == -1) {
                    int i79 = f41152j + 115;
                    f41149g = i79 % 128;
                    int i80 = i79 % 2;
                    i78 = 12;
                }
                return Integer.valueOf(Math.round(i78 * c()));
            case 43:
                return z(objArr);
            case 44:
                return E(objArr);
            case 45:
                return H(objArr);
            default:
                int i81 = f41149g + 105;
                f41152j = i81 % 128;
                int i82 = i81 % 2;
                int i83 = bo().f40083f.selectionScreenForegroundColor;
                int i84 = f41152j + 79;
                f41149g = i84 % 128;
                int i85 = i84 % 2;
                return Integer.valueOf(i83);
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0028  */
    /* JADX WARN: Code duplicated, block: B:15:0x0030  */
    public static String b(boolean z10) {
        String strC = dd.c(R.string.FaceTec_retry_instruction_message_1);
        if (z10) {
            int i10 = f41152j + 125;
            f41149g = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 73 / 0;
                if (!FaceTecSDK.f40106a.f40078a) {
                    if (strC.length() > 40) {
                        int i12 = f41149g + 37;
                        f41152j = i12 % 128;
                        int i13 = i12 % 2;
                        strC = strC.substring(0, 40);
                    }
                }
            } else if (!FaceTecSDK.f40106a.f40078a) {
                if (strC.length() > 40) {
                    int i14 = f41149g + 37;
                    f41152j = i14 % 128;
                    int i15 = i14 % 2;
                    strC = strC.substring(0, 40);
                }
            }
        }
        int i16 = f41152j + 123;
        f41149g = i16 % 128;
        int i17 = i16 % 2;
        return strC;
    }

    @NonNull
    private static b a(@NonNull Context context, int i10) {
        long j10 = ((long) i10) & 4294967295L;
        if (j10 != 0) {
            int i11 = f41149g + 83;
            f41152j = i11 % 128;
            if (i11 % 2 == 0) {
                throw null;
            }
            if (j10 <= 16777215) {
                try {
                    bw_(context).getValue(i10, new TypedValue(), true);
                    b bVar = b.RESOURCE;
                    int i12 = f41152j + 43;
                    f41149g = i12 % 128;
                    int i13 = i12 % 2;
                    return bVar;
                } catch (Exception unused) {
                    return b.COLOR;
                }
            }
        }
        return b.COLOR;
    }

    public static int a(Context context) {
        int identifier = bo().f40083f.faceMatchToIDBrandingImage;
        if (identifier == 0) {
            identifier = FaceTecSDK.f40106a.f40083f.faceMatchToIDBrandingImage;
        }
        if (identifier == 0) {
            int i10 = f41149g + 107;
            f41152j = i10 % 128;
            int i11 = i10 % 2;
            identifier = context.getResources().getIdentifier("facetec_face_match_to_id_branding_logo", PluginUtils.IDENTIFIER_DRAWABLE, context.getPackageName());
            int i12 = f41152j + 107;
            f41149g = i12 % 128;
            int i13 = i12 % 2;
        }
        if (identifier == 0) {
            identifier = R.drawable.facetec_internal_id_scan_watermark;
        }
        int i14 = f41152j + 115;
        f41149g = i14 % 128;
        if (i14 % 2 != 0) {
            int i15 = 53 / 0;
        }
        return identifier;
    }

    public static void a(@NonNull View view) {
        int i10 = f41149g + 17;
        f41152j = i10 % 128;
        if (i10 % 2 != 0) {
            int iBR = bR();
            int i11 = AnonymousClass3.f41154c[a(view.getContext(), iBR).ordinal()];
            if (i11 == 1) {
                view.setBackgroundResource(iBR);
                return;
            }
            if (i11 != 2) {
                view.setBackgroundColor(0);
                return;
            }
            view.setBackgroundColor(iBR);
            int i12 = f41149g + 15;
            f41152j = i12 % 128;
            if (i12 % 2 == 0) {
                throw null;
            }
            return;
        }
        int i13 = AnonymousClass3.f41154c[a(view.getContext(), bR()).ordinal()];
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001a  */
    /* JADX WARN: Code duplicated, block: B:12:0x002a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:14:0x002d  */
    /* JADX WARN: Code duplicated, block: B:15:0x0032  */
    /* JADX WARN: Code duplicated, block: B:21:0x0052 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x0053  */
    /* JADX WARN: Code duplicated, block: B:27:0x0043 A[SYNTHETIC] */
    private static int a(@NonNull Context context, @Nullable int[] iArr) {
        int color;
        int i10;
        int i11;
        int i12 = f41149g + 45;
        int i13 = i12 % 128;
        f41152j = i13;
        if (i12 % 2 == 0) {
            if (iArr != null) {
                color = 1;
                for (int i14 : iArr) {
                    i11 = AnonymousClass3.f41154c[a(context, i14).ordinal()];
                    if (i11 != 1) {
                        color += (ContextCompat.getColor(context, i14) >> 24) & 255;
                        int i15 = f41152j + 91;
                        f41149g = i15 % 128;
                        int i16 = i15 % 2;
                    } else if (i11 != 2) {
                        color += (i14 >> 24) & 255;
                    }
                }
                return color / iArr.length;
            }
            i10 = i13 + 123;
            f41149g = i10 % 128;
            if (i10 % 2 == 0) {
                return 255;
            }
            throw null;
        }
        if (iArr != null) {
            color = 0;
            while (i < r1) {
                i11 = AnonymousClass3.f41154c[a(context, i14).ordinal()];
                if (i11 != 1) {
                    color += (ContextCompat.getColor(context, i14) >> 24) & 255;
                    int i17 = f41152j + 91;
                    f41149g = i17 % 128;
                    int i18 = i17 % 2;
                } else if (i11 != 2) {
                    color += (i14 >> 24) & 255;
                }
            }
            return color / iArr.length;
        }
        i10 = i13 + 123;
        f41149g = i10 % 128;
        if (i10 % 2 == 0) {
            return 255;
        }
        throw null;
    }

    @ColorInt
    public static int a(@ColorInt int i10, int i11) {
        int i12 = f41152j + 107;
        f41149g = i12 % 128;
        if (i12 % 2 != 0) {
            int iArgb = Color.argb(i11, Color.red(i10), Color.green(i10), Color.blue(i10));
            int i13 = 22 / 0;
            return iArgb;
        }
        return Color.argb(i11, Color.red(i10), Color.green(i10), Color.blue(i10));
    }

    public static String a(boolean z10, boolean z11) {
        String strC = FaceTecSDK.f40106a.f40086i.readyScreenHeaderAttributedString;
        if ((!strC.isEmpty()) && strC.contains(RootService.LINE_BREAK)) {
            int i10 = f41152j + 75;
            f41149g = i10 % 128;
            strC = i10 % 2 != 0 ? strC.substring(1, strC.indexOf(RootService.LINE_BREAK)) : strC.substring(0, strC.indexOf(RootService.LINE_BREAK));
        }
        if (!z11 && strC.isEmpty()) {
            strC = dd.c(R.string.FaceTec_instructions_header_ready_1);
            if (strC.contains(RootService.LINE_BREAK)) {
                strC = strC.substring(0, strC.indexOf(RootService.LINE_BREAK));
            }
        }
        if (!z10 || FaceTecSDK.f40106a.f40078a || strC.length() <= 30) {
            return strC;
        }
        int i11 = f41149g + 83;
        f41152j = i11 % 128;
        return i11 % 2 == 0 ? strC.substring(1, 72) : strC.substring(0, 30);
    }

    public static int c(Context context) {
        return ((Integer) c(new Object[]{context}, 123760937, -123760935, (int) System.currentTimeMillis())).intValue();
    }

    public static String a(cq cqVar) {
        String str;
        HashMap<cq, String> map = FaceTecCustomization.f40076q;
        if (map != null) {
            str = map.get(cqVar);
            int i10 = f41152j + 57;
            f41149g = i10 % 128;
            int i11 = i10 % 2;
        } else {
            str = null;
        }
        if (str != null) {
            return str;
        }
        int i12 = f41149g + 83;
        f41152j = i12 % 128;
        int i13 = i12 % 2;
        switch (AnonymousClass3.f41155d[cqVar.ordinal()]) {
            case 1:
                return dd.c(R.string.FaceTec_result_idscan_unsuccess_message);
            case 2:
                return dd.c(R.string.FaceTec_result_idscan_retry_face_did_not_match_message);
            case 3:
                return dd.c(R.string.FaceTec_result_idscan_retry_id_not_fully_visible_message);
            case 4:
                String strC = dd.c(R.string.FaceTec_result_idscan_retry_ocr_results_not_good_enough_message);
                int i14 = f41152j + 101;
                f41149g = i14 % 128;
                int i15 = i14 % 2;
                return strC;
            case 5:
                return dd.c(R.string.FaceTec_result_idscan_retry_id_type_not_supported_message);
            case 6:
                return dd.c(R.string.FaceTec_result_idscan_retry_barcode_not_read_message);
            case 7:
            default:
                return str;
            case 8:
                return dd.c(R.string.FaceTec_result_idscan_skip_or_error_nfc_message);
            case 9:
                return dd.c(R.string.FaceTec_result_idscan_success_front_side_message);
            case 10:
                return dd.c(R.string.FaceTec_result_idscan_success_front_side_back_next_message);
            case 11:
                return dd.c(R.string.FaceTec_result_idscan_success_front_side_nfc_next_message);
            case 12:
                return dd.c(R.string.FaceTec_result_idscan_success_back_side_message);
            case 13:
                return dd.c(R.string.FaceTec_result_idscan_success_back_side_nfc_next_message);
            case 14:
                return dd.c(R.string.FaceTec_result_idscan_success_passport_message);
            case 15:
                return dd.c(R.string.FaceTec_result_idscan_success_passport_nfc_next_message);
            case 16:
                return dd.c(R.string.FaceTec_result_idscan_success_user_confirmation_message);
            case 17:
                return dd.c(R.string.FaceTec_result_idscan_success_nfc_message);
            case 18:
                return dd.c(R.string.FaceTec_result_idscan_success_additional_review_message);
        }
    }

    public static String a(ca caVar, boolean z10) {
        int i10 = f41152j + 15;
        f41149g = i10 % 128;
        if (i10 % 2 == 0) {
            switch (AnonymousClass3.f41153a[caVar.ordinal()]) {
                case 1:
                    int i11 = f41152j + 51;
                    f41149g = i11 % 128;
                    int i12 = i11 % 2;
                    return "";
                case 2:
                    if (!z10) {
                        return dd.c(R.string.FaceTec_idscan_nfc_status_starting_message);
                    }
                    int i13 = f41152j + 121;
                    f41149g = i13 % 128;
                    int i14 = i13 % 2;
                    return dd.c(R.string.FaceTec_idscan_nfc_card_status_starting_message);
                case 3:
                    return dd.c(R.string.FaceTec_idscan_nfc_status_scanning_message);
                case 4:
                    return dd.c(R.string.FaceTec_idscan_nfc_status_weak_connection_message);
                case 5:
                    return dd.c(R.string.FaceTec_idscan_nfc_status_finished_with_success_message);
                case 6:
                    if (z10) {
                        return dd.c(R.string.FaceTec_idscan_nfc_card_status_finished_with_error_message);
                    }
                    return dd.c(R.string.FaceTec_idscan_nfc_status_finished_with_error_message);
                case 7:
                    return dd.c(R.string.FaceTec_idscan_nfc_status_skipped_message);
                case 8:
                    return dd.c(R.string.FaceTec_idscan_nfc_status_disabled_message);
                default:
                    return null;
            }
        }
        int i15 = AnonymousClass3.f41153a[caVar.ordinal()];
        throw null;
    }

    private static /* synthetic */ Object a(Object[] objArr) {
        String strB = b(false);
        String strC = c(false);
        String strE = e(false);
        if (strB != null && strB.length() > 40) {
            int i10 = f41152j + 43;
            f41149g = i10 % 128;
            if (i10 % 2 != 0) {
                d("Retry Screen Instruction Message 1");
                int i11 = 22 / 0;
            } else {
                d("Retry Screen Instruction Message 1");
            }
        }
        if (strC != null && strC.length() > 40) {
            int i12 = f41152j + 13;
            f41149g = i12 % 128;
            if (i12 % 2 != 0) {
                d("Retry Screen Instruction Message 2");
                int i13 = 13 / 0;
            } else {
                d("Retry Screen Instruction Message 2");
            }
        }
        if (strE == null || strE.length() <= 40) {
            return null;
        }
        int i14 = f41149g + 99;
        f41152j = i14 % 128;
        int i15 = i14 % 2;
        d("Retry Screen Instruction Message 3");
        return null;
    }

    public static String a(boolean z10) {
        return (String) c(new Object[]{Boolean.valueOf(z10)}, -1974881617, 1974881650, (int) System.currentTimeMillis());
    }
}
