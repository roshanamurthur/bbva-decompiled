package com.bbva.zoomauth.facialauth;

import com.bbva.zoomauth.data.ZoomAuthResponseData;
import com.bbva.zoomauth.ui.ZoomActivity;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ResponseDataUtil.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0006\u0010\u0006\u001a\u00020\u0004¨\u0006\t"}, d2 = {"Lcom/bbva/zoomauth/facialauth/ResponseDataUtil;", "", "", "error", "Lcom/bbva/zoomauth/data/ZoomAuthResponseData;", "getErrorResponse", "getSuccessResponse", "<init>", "()V", "zoomauth_release"}, k = 1, mv = {1, 5, 1})
public final class ResponseDataUtil {

    @NotNull
    public static final ResponseDataUtil INSTANCE = new ResponseDataUtil();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:103:0x0173  */
    /* JADX WARN: Code duplicated, block: B:22:0x0051  */
    /* JADX WARN: Code duplicated, block: B:38:0x0087  */
    /* JADX WARN: Code duplicated, block: B:54:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:58:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:65:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:82:0x012c  */
    /* JADX WARN: Code duplicated, block: B:92:0x014a  */
    /* JADX WARN: Code duplicated, block: B:96:0x015a  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @NotNull
    public final ZoomAuthResponseData getErrorResponse(@Nullable String error) {
        ZoomAuthResponseData zoomAuthResponseData = new ZoomAuthResponseData(3, "Generic Error", null, null);
        if (error != null && error.length() > 0) {
            switch (error.hashCode()) {
                case -2122537275:
                    if (error.equals("Current version of SDK is deprecated.")) {
                        zoomAuthResponseData.setCode(1);
                        zoomAuthResponseData.setMessage(error);
                    }
                    break;
                case -2093170257:
                    if (error.equals("Session failed because of an unhandled internal error.")) {
                        zoomAuthResponseData.setCode(1);
                        zoomAuthResponseData.setMessage(error);
                    }
                    break;
                case -1814410959:
                    if (error.equals("Cancelled")) {
                        zoomAuthResponseData.setCode(3);
                        zoomAuthResponseData.setMessage("User cancelled before completing session.");
                    }
                    break;
                case -1763565824:
                    if (error.equals("Session cancelled because device is in reverse portrait mode.")) {
                        zoomAuthResponseData.setCode(1);
                        zoomAuthResponseData.setMessage("Session cancelled because device is in reverse portrait mode.");
                    }
                    break;
                case -1760965979:
                    if (error.equals("User cancelled before completing session.")) {
                        zoomAuthResponseData.setCode(3);
                        zoomAuthResponseData.setMessage("User cancelled before completing session.");
                    }
                    break;
                case -1246814627:
                    if (error.equals("Initialize was never attempted.")) {
                        zoomAuthResponseData.setCode(1);
                        zoomAuthResponseData.setMessage(error);
                    }
                    break;
                case -910969512:
                    if (error.equals(ZoomActivity.DEVICE_LOCKED_OUT)) {
                        zoomAuthResponseData.setCode(1);
                        zoomAuthResponseData.setMessage("FaceTec SDK is in a lockout state.");
                    }
                    break;
                case -762011103:
                    if (error.equals("Device is locked out due to too many failures")) {
                        zoomAuthResponseData.setCode(1);
                        zoomAuthResponseData.setMessage("FaceTec SDK is in a lockout state.");
                    }
                    break;
                case -449138864:
                    if (error.equals("The Device Key Identifier provided was invalid.")) {
                        zoomAuthResponseData.setCode(1);
                        zoomAuthResponseData.setMessage(error);
                    }
                    break;
                case -367998849:
                    if (error.equals("Camera is required but access prevented by user settings.")) {
                        zoomAuthResponseData.setCode(2);
                        zoomAuthResponseData.setMessage(error);
                    }
                    break;
                case -348444813:
                    if (error.equals("Device is in reverse portrait display orientation. FaceTec SDK can only be used in portrait display orientation.")) {
                        zoomAuthResponseData.setCode(1);
                        zoomAuthResponseData.setMessage("Session cancelled because device is in reverse portrait mode.");
                    }
                    break;
                case -206428047:
                    if (error.equals("The device is incompatible with the SDK.")) {
                        zoomAuthResponseData.setCode(3);
                        zoomAuthResponseData.setMessage(error);
                    }
                    break;
                case -68360423:
                    if (error.equals("Session cancelled because too many sessions have occurred since the key was last validated.")) {
                        zoomAuthResponseData.setCode(3);
                        zoomAuthResponseData.setMessage(error);
                    }
                    break;
                case -51655268:
                    if (error.equals("Initialize failed due to network issues.")) {
                        zoomAuthResponseData.setCode(1);
                        zoomAuthResponseData.setMessage("Initialize failed due to network issues.");
                    }
                    break;
                case 453138363:
                    if (error.equals("Validation of the key (supplied in FaceTecSDK.initialize) did not succeed.")) {
                        zoomAuthResponseData.setCode(1);
                        zoomAuthResponseData.setMessage("Key was expired, contained invalid text, or you are attempting to initialize in an App that is not specified in your key.");
                    }
                    break;
                case 526044118:
                    if (error.equals("Key was expired, contained invalid text, or you are attempting to initialize in an App that is not specified in your key.")) {
                        zoomAuthResponseData.setCode(1);
                        zoomAuthResponseData.setMessage("Key was expired, contained invalid text, or you are attempting to initialize in an App that is not specified in your key.");
                    }
                    break;
                case 773462392:
                    if (error.equals("Session cancelled because user pressed the Get Ready screen subtext message.")) {
                        zoomAuthResponseData.setCode(3);
                        zoomAuthResponseData.setMessage("User cancelled before completing session.");
                    }
                    break;
                case 994920210:
                    if (error.equals("Session cancelled because guidance images were not provided.")) {
                        zoomAuthResponseData.setCode(3);
                        zoomAuthResponseData.setMessage(error);
                    }
                    break;
                case 1000740655:
                    if (error.equals("Session failed because of an unexpected camera error.")) {
                        zoomAuthResponseData.setCode(3);
                        zoomAuthResponseData.setMessage(error);
                    }
                    break;
                case 1267304682:
                    if (error.equals("Session cancelled because device is in landscape mode.")) {
                        zoomAuthResponseData.setCode(1);
                        zoomAuthResponseData.setMessage("The device is in landscape mode.");
                    }
                    break;
                case 1465942917:
                    if (error.equals("The Session was not performed successfully and a FaceScan was not generated.")) {
                        zoomAuthResponseData.setCode(3);
                        zoomAuthResponseData.setMessage(error);
                    }
                    break;
                case 1666441766:
                    if (error.equals("The device is in landscape mode.")) {
                        zoomAuthResponseData.setCode(1);
                        zoomAuthResponseData.setMessage("The device is in landscape mode.");
                    }
                    break;
                case 1728702725:
                    if (error.equals("Session cancelled because a Context Switch occurred during session.")) {
                        zoomAuthResponseData.setCode(3);
                        zoomAuthResponseData.setMessage(error);
                    }
                    break;
                case 1739996911:
                    if (error.equals("FaceTec SDK is in a lockout state.")) {
                        zoomAuthResponseData.setCode(1);
                        zoomAuthResponseData.setMessage("FaceTec SDK is in a lockout state.");
                    }
                    break;
                case 1937784324:
                    if (error.equals("Encryption key is invalid or missing.")) {
                        zoomAuthResponseData.setCode(1);
                        zoomAuthResponseData.setMessage("Encryption key is invalid or missing.");
                    }
                    break;
                case 1987831783:
                    if (error.equals("Session cancelled because a network connection is required in non-production apps.")) {
                        zoomAuthResponseData.setCode(1);
                        zoomAuthResponseData.setMessage("Initialize failed due to network issues.");
                    }
                    break;
                case 1989101346:
                    if (error.equals("Session cancelled because encryption key invalid.")) {
                        zoomAuthResponseData.setCode(1);
                        zoomAuthResponseData.setMessage("Encryption key is invalid or missing.");
                    }
                    break;
                case 2142243021:
                    if (error.equals("Session cancelled due to timeout.")) {
                        zoomAuthResponseData.setCode(3);
                        zoomAuthResponseData.setMessage(error);
                    }
                    break;
            }
        }
        return zoomAuthResponseData;
    }

    @NotNull
    public final ZoomAuthResponseData getSuccessResponse() {
        return new ZoomAuthResponseData(0, "", null, null);
    }
}
