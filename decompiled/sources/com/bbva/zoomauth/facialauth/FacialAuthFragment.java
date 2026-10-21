package com.bbva.zoomauth.facialauth;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.Fragment;
import com.bbva.zoomauth.R;
import com.bbva.zoomauth.facialauth.constant.AuthConstants;
import com.bbva.zoomauth.facialauth.encryption.EncryptUtil;
import com.bbva.zoomauth.facialauth.encryption.FacialAuthEncryptionManager;
import com.facetec.sdk.FaceTecAuditTrailType;
import com.facetec.sdk.FaceTecCancelButtonCustomization;
import com.facetec.sdk.FaceTecCustomization;
import com.facetec.sdk.FaceTecFaceScanProcessor;
import com.facetec.sdk.FaceTecFaceScanResultCallback;
import com.facetec.sdk.FaceTecFeedbackCustomization;
import com.facetec.sdk.FaceTecFrameCustomization;
import com.facetec.sdk.FaceTecGuidanceCustomization;
import com.facetec.sdk.FaceTecOvalCustomization;
import com.facetec.sdk.FaceTecOverlayCustomization;
import com.facetec.sdk.FaceTecResultScreenCustomization;
import com.facetec.sdk.FaceTecSDK;
import com.facetec.sdk.FaceTecSDKStatus;
import com.facetec.sdk.FaceTecSessionActivity;
import com.facetec.sdk.FaceTecSessionResult;
import com.facetec.sdk.FaceTecSessionStatus;
import com.facetec.sdk.FaceTecVocalGuidanceCustomization;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Timer;
import kotlin.Metadata;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: FacialAuthFragment.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u001a2\u00020\u00012\u00020\u0002:\u0001\u001aB\u0011\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J&\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\u0012\u0010\u000f\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\u0006\u0010\u0010\u001a\u00020\u0005J\u0018\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¨\u0006\u001b"}, d2 = {"Lcom/bbva/zoomauth/facialauth/FacialAuthFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/facetec/sdk/FaceTecFaceScanProcessor;", "Landroid/content/Context;", "context", "", "onAttach", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "onCreate", "launchFacialSDK", "Lcom/facetec/sdk/FaceTecSessionResult;", "faceTecSessionResult", "Lcom/facetec/sdk/FaceTecFaceScanResultCallback;", "faceTecFaceScanResultCallback", "processSessionWhileFaceTecSDKWaits", "", "userName", "<init>", "(Ljava/lang/String;)V", "Companion", "zoomauth_release"}, k = 1, mv = {1, 5, 1})
public final class FacialAuthFragment extends Fragment implements FaceTecFaceScanProcessor {

    @NotNull
    public static final String API_KEY = "apiKey";
    public static final long DELAY_FOR_SDK_CLOSE = 15;

    @NotNull
    public static final String ENCRYPTION_BIG_INT = "encryptionBigInt";

    @NotNull
    public static final String LICENSE_KEY = "licenseKey";

    @NotNull
    public static final String PUBLIC_KEY = "publicKey";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @Nullable
    public final String f37782p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @Nullable
    public FacialAuthCallback f37783q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f37784r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public String f37785s0 = "";

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NotNull
    public String f37786t0 = "";

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @NotNull
    public String f37787u0 = "";

    @NotNull
    public String v0 = "";

    /* JADX INFO: compiled from: FacialAuthFragment.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[FaceTecSDKStatus.values().length];
            iArr[FaceTecSDKStatus.INITIALIZED.ordinal()] = 1;
            iArr[FaceTecSDKStatus.DEVICE_LOCKED_OUT.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[FaceTecSessionStatus.values().length];
            iArr2[FaceTecSessionStatus.SESSION_COMPLETED_SUCCESSFULLY.ordinal()] = 1;
            iArr2[FaceTecSessionStatus.CONTEXT_SWITCH.ordinal()] = 2;
            iArr2[FaceTecSessionStatus.USER_CANCELLED.ordinal()] = 3;
            iArr2[FaceTecSessionStatus.USER_CANCELLED_VIA_HARDWARE_BUTTON.ordinal()] = 4;
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public FacialAuthFragment(@Nullable String str) {
        this.f37782p0 = str;
    }

    public final String a(int i10) {
        return Intrinsics.stringPlus("#", Integer.toHexString(ContextCompat.getColor(requireContext(), i10)));
    }

    public final void c() throws Throwable {
        Typeface font;
        FaceTecCustomization faceTecCustomization = new FaceTecCustomization();
        try {
            font = ResourcesCompat.getFont(requireContext(), R.font.benton_sans_book);
        } catch (Exception unused) {
            font = null;
        }
        FaceTecFeedbackCustomization faceTecFeedbackCustomization = new FaceTecFeedbackCustomization();
        int i10 = R.color.white;
        faceTecFeedbackCustomization.backgroundColors = Color.parseColor(a(i10));
        faceTecFeedbackCustomization.textColor = Color.parseColor(a(android.R.color.black));
        faceTecFeedbackCustomization.elevation = 0;
        faceTecCustomization.setFeedbackCustomization(faceTecFeedbackCustomization);
        FaceTecFrameCustomization faceTecFrameCustomization = new FaceTecFrameCustomization();
        faceTecFrameCustomization.backgroundColor = Color.parseColor(a(i10));
        faceTecFrameCustomization.elevation = 0;
        faceTecFrameCustomization.borderColor = Color.parseColor(a(i10));
        faceTecCustomization.setFrameCustomization(faceTecFrameCustomization);
        FaceTecOvalCustomization faceTecOvalCustomization = new FaceTecOvalCustomization();
        faceTecOvalCustomization.strokeColor = Color.parseColor(a(R.color.bbva_200));
        int i11 = R.color.bbva_navy;
        faceTecOvalCustomization.progressColor1 = Color.parseColor(a(i11));
        faceTecOvalCustomization.progressColor2 = Color.parseColor(a(i11));
        faceTecCustomization.setOvalCustomization(faceTecOvalCustomization);
        FaceTecCancelButtonCustomization faceTecCancelButtonCustomization = new FaceTecCancelButtonCustomization();
        faceTecCancelButtonCustomization.customImage = R.drawable.ico_cross;
        faceTecCancelButtonCustomization.setLocation(FaceTecCancelButtonCustomization.ButtonLocation.CUSTOM);
        faceTecCancelButtonCustomization.setCustomLocation(new Rect(15, 15, 35, 25));
        faceTecCustomization.setCancelButtonCustomization(faceTecCancelButtonCustomization);
        FaceTecOverlayCustomization faceTecOverlayCustomization = new FaceTecOverlayCustomization();
        faceTecOverlayCustomization.showBrandingImage = false;
        faceTecCustomization.setOverlayCustomization(faceTecOverlayCustomization);
        FaceTecResultScreenCustomization faceTecResultScreenCustomization = new FaceTecResultScreenCustomization();
        faceTecResultScreenCustomization.showUploadProgressBar = false;
        if (font != null) {
            faceTecResultScreenCustomization.messageFont = font;
        }
        faceTecCustomization.setResultScreenCustomization(faceTecResultScreenCustomization);
        FaceTecGuidanceCustomization faceTecGuidanceCustomization = new FaceTecGuidanceCustomization();
        faceTecGuidanceCustomization.buttonCornerRadius = 0;
        faceTecGuidanceCustomization.buttonBackgroundNormalColor = Color.parseColor(a(R.color.bbva_medium_blue));
        if (font != null) {
            faceTecGuidanceCustomization.headerFont = font;
            faceTecGuidanceCustomization.buttonFont = font;
            faceTecGuidanceCustomization.readyScreenHeaderFont = font;
            faceTecGuidanceCustomization.readyScreenSubtextFont = font;
            faceTecGuidanceCustomization.subtextFont = font;
        }
        faceTecCustomization.setGuidanceCustomization(faceTecGuidanceCustomization);
        faceTecCustomization.vocalGuidanceCustomization.mode = FaceTecVocalGuidanceCustomization.VocalGuidanceMode.NO_VOCAL_GUIDANCE;
        FaceTecSDK.setCustomization(faceTecCustomization);
        faceTecCustomization.getFeedbackCustomization().elevation = 0;
        faceTecCustomization.getFrameCustomization().elevation = 50;
        FaceTecSDK.setAuditTrailType(FaceTecAuditTrailType.FULL_RESOLUTION);
        FaceTecSDK.initializeInProductionMode(requireContext(), this.f37786t0, this.f37785s0, this.f37787u0, new FaceTecSDK.InitializeCallback() { // from class: com.bbva.zoomauth.facialauth.FacialAuthFragment$initFaceTec$1
            @Override // com.facetec.sdk.FaceTecSDK.InitializeCallback
            public void onCompletion(boolean successful) {
                FacialAuthCallback facialAuthCallback = this.f37788a.f37783q0;
                Intrinsics.checkNotNull(facialAuthCallback);
                facialAuthCallback.onSDKFinishedLoading();
            }
        });
    }

    public final void d() throws JSONException {
        String text;
        try {
            InputStream inputStreamOpen = requireContext().getAssets().open("keys.json");
            Intrinsics.checkNotNullExpressionValue(inputStreamOpen, "requireContext().assets.open(\"keys.json\")");
            Reader inputStreamReader = new InputStreamReader(inputStreamOpen, Charsets.UTF_8);
            BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
            try {
                text = TextStreamsKt.readText(bufferedReader);
                CloseableKt.closeFinally(bufferedReader, null);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    CloseableKt.closeFinally(bufferedReader, th2);
                    throw th3;
                }
            }
        } catch (IOException unused) {
            text = "";
        }
        JSONObject jSONObject = text.length() > 0 ? new JSONObject(text) : null;
        if (jSONObject == null) {
            return;
        }
        if (jSONObject.has("apiKey")) {
            EncryptUtil encryptUtil = EncryptUtil.INSTANCE;
            String string = jSONObject.getString("apiKey");
            Intrinsics.checkNotNullExpressionValue(string, "jsonObject.getString(API_KEY)");
            this.f37785s0 = encryptUtil.decrypt(string);
        }
        if (jSONObject.has(LICENSE_KEY)) {
            EncryptUtil encryptUtil2 = EncryptUtil.INSTANCE;
            String string2 = jSONObject.getString(LICENSE_KEY);
            Intrinsics.checkNotNullExpressionValue(string2, "jsonObject.getString(LICENSE_KEY)");
            this.f37786t0 = encryptUtil2.decrypt(string2);
        }
        if (jSONObject.has(PUBLIC_KEY)) {
            EncryptUtil encryptUtil3 = EncryptUtil.INSTANCE;
            String string3 = jSONObject.getString(PUBLIC_KEY);
            Intrinsics.checkNotNullExpressionValue(string3, "jsonObject.getString(PUBLIC_KEY)");
            this.f37787u0 = encryptUtil3.decrypt(string3);
        }
        if (jSONObject.has(ENCRYPTION_BIG_INT)) {
            String string4 = jSONObject.getString(ENCRYPTION_BIG_INT);
            Intrinsics.checkNotNullExpressionValue(string4, "jsonObject.getString(ENCRYPTION_BIG_INT)");
            this.v0 = string4;
        }
    }

    public final void launchFacialSDK() {
        FaceTecSDKStatus status = FaceTecSDK.getStatus(getContext());
        int i10 = status == null ? -1 : WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
        if (i10 == 1) {
            FaceTecSessionActivity.createAndLaunchSession(getContext(), this);
            return;
        }
        if (i10 != 2) {
            FacialAuthCallback facialAuthCallback = this.f37783q0;
            Intrinsics.checkNotNull(facialAuthCallback);
            facialAuthCallback.onFaceTecStatusError(status);
        } else {
            FacialAuthCallback facialAuthCallback2 = this.f37783q0;
            Intrinsics.checkNotNull(facialAuthCallback2);
            facialAuthCallback2.onDeviceLockedOut();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        try {
            this.f37783q0 = (FacialAuthCallback) context;
        } catch (ClassCastException unused) {
            requireActivity().finish();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) throws Throwable {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Bundle arguments = getArguments();
        try {
            Intrinsics.checkNotNull(arguments);
            this.f37784r0 = arguments.getBoolean(AuthConstants.EXTRA_KEY_FACIAL_AUTH_DATA);
            d();
            c();
            return null;
        } catch (Exception unused) {
            FacialAuthCallback facialAuthCallback = this.f37783q0;
            Intrinsics.checkNotNull(facialAuthCallback);
            facialAuthCallback.onFacialBiometricGenericError();
            return null;
        }
    }

    @Override // com.facetec.sdk.FaceTecFaceScanProcessor
    public void processSessionWhileFaceTecSDKWaits(@NotNull FaceTecSessionResult faceTecSessionResult, @NotNull FaceTecFaceScanResultCallback faceTecFaceScanResultCallback) {
        Intrinsics.checkNotNullParameter(faceTecSessionResult, "faceTecSessionResult");
        Intrinsics.checkNotNullParameter(faceTecFaceScanResultCallback, "faceTecFaceScanResultCallback");
        FaceTecSessionStatus status = faceTecSessionResult.getStatus();
        Intrinsics.checkNotNullExpressionValue(status, "faceTecSessionResult.status");
        int i10 = WhenMappings.$EnumSwitchMapping$1[status.ordinal()];
        if (i10 != 1) {
            if (i10 == 2 || i10 == 3 || i10 == 4) {
                new Timer().schedule(new FacialAuthFragment$onUserCancelled$1(this), 15L);
                return;
            }
            FacialAuthCallback facialAuthCallback = this.f37783q0;
            Intrinsics.checkNotNull(facialAuthCallback);
            facialAuthCallback.onFaceTecSessionStatusError(status);
            return;
        }
        byte[] faceScan = faceTecSessionResult.getFaceScan();
        String sessionId = faceTecSessionResult.getSessionId();
        if (faceScan != null) {
            if (!(faceScan.length == 0)) {
                String[] auditTrailCompressedBase64 = faceTecSessionResult.getAuditTrailCompressedBase64();
                Intrinsics.checkNotNullExpressionValue(auditTrailCompressedBase64, "faceTecSessionResult.auditTrailCompressedBase64");
                if (!(auditTrailCompressedBase64.length == 0)) {
                    FacialAuthEncryptionManager facialAuthEncryptionManager = new FacialAuthEncryptionManager();
                    Boolean boolValueOf = Boolean.valueOf(this.f37784r0);
                    String str = this.v0;
                    String str2 = this.f37782p0;
                    byte[] bArrDecode = Base64.decode(auditTrailCompressedBase64[0], 2);
                    Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(base64, Base64.NO_WRAP)");
                    String strCreateJSONForUpdateOrEnroll = facialAuthEncryptionManager.createJSONForUpdateOrEnroll(boolValueOf, str, str2, faceScan, sessionId, bArrDecode);
                    if (strCreateJSONForUpdateOrEnroll != null) {
                        faceTecFaceScanResultCallback.succeed();
                        FacialAuthCallback facialAuthCallback2 = this.f37783q0;
                        Intrinsics.checkNotNull(facialAuthCallback2);
                        byte[] bArrDecode2 = Base64.decode(auditTrailCompressedBase64[0], 2);
                        Intrinsics.checkNotNullExpressionValue(bArrDecode2, "decode(base64, Base64.NO_WRAP)");
                        facialAuthCallback2.onFacialBiometricSuccess(strCreateJSONForUpdateOrEnroll, BitmapFactory.decodeByteArray(bArrDecode2, 0, bArrDecode2.length));
                    }
                }
            }
        }
        faceTecFaceScanResultCallback.cancel();
        FacialAuthCallback facialAuthCallback3 = this.f37783q0;
        Intrinsics.checkNotNull(facialAuthCallback3);
        facialAuthCallback3.onFacialBiometricGenericError();
    }
}
