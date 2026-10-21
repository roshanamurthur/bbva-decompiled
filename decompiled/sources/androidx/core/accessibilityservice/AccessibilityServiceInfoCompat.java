package androidx.core.accessibilityservice;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.pm.PackageManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.impl.utils.c;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes.dex */
public final class AccessibilityServiceInfoCompat {
    public static final int CAPABILITY_CAN_FILTER_KEY_EVENTS = 8;
    public static final int CAPABILITY_CAN_REQUEST_ENHANCED_WEB_ACCESSIBILITY = 4;
    public static final int CAPABILITY_CAN_REQUEST_TOUCH_EXPLORATION = 2;
    public static final int CAPABILITY_CAN_RETRIEVE_WINDOW_CONTENT = 1;
    public static final int FEEDBACK_ALL_MASK = -1;
    public static final int FEEDBACK_BRAILLE = 32;
    public static final int FLAG_INCLUDE_NOT_IMPORTANT_VIEWS = 2;
    public static final int FLAG_REPORT_VIEW_IDS = 16;
    public static final int FLAG_REQUEST_ENHANCED_WEB_ACCESSIBILITY = 8;
    public static final int FLAG_REQUEST_FILTER_KEY_EVENTS = 32;
    public static final int FLAG_REQUEST_TOUCH_EXPLORATION_MODE = 4;

    @NonNull
    public static String capabilityToString(int i10) {
        if (i10 == 1) {
            return "CAPABILITY_CAN_RETRIEVE_WINDOW_CONTENT";
        }
        if (i10 == 2) {
            return "CAPABILITY_CAN_REQUEST_TOUCH_EXPLORATION";
        }
        if (i10 != 4) {
            return i10 != 8 ? "UNKNOWN" : "CAPABILITY_CAN_FILTER_KEY_EVENTS";
        }
        return "CAPABILITY_CAN_REQUEST_ENHANCED_WEB_ACCESSIBILITY";
    }

    @NonNull
    public static String feedbackTypeToString(int i10) {
        StringBuilder sbD = c.d(Constant.BRACKET_OPEN);
        while (i10 > 0) {
            int iNumberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(i10);
            i10 &= ~iNumberOfTrailingZeros;
            if (sbD.length() > 1) {
                sbD.append(", ");
            }
            if (iNumberOfTrailingZeros == 1) {
                sbD.append("FEEDBACK_SPOKEN");
            } else if (iNumberOfTrailingZeros == 2) {
                sbD.append("FEEDBACK_HAPTIC");
            } else if (iNumberOfTrailingZeros == 4) {
                sbD.append("FEEDBACK_AUDIBLE");
            } else if (iNumberOfTrailingZeros == 8) {
                sbD.append("FEEDBACK_VISUAL");
            } else if (iNumberOfTrailingZeros == 16) {
                sbD.append("FEEDBACK_GENERIC");
            }
        }
        sbD.append(Constant.BRACKET_CLOSE);
        return sbD.toString();
    }

    @Nullable
    public static String flagToString(int i10) {
        if (i10 == 1) {
            return "DEFAULT";
        }
        if (i10 == 2) {
            return "FLAG_INCLUDE_NOT_IMPORTANT_VIEWS";
        }
        if (i10 == 4) {
            return "FLAG_REQUEST_TOUCH_EXPLORATION_MODE";
        }
        if (i10 == 8) {
            return "FLAG_REQUEST_ENHANCED_WEB_ACCESSIBILITY";
        }
        if (i10 == 16) {
            return "FLAG_REPORT_VIEW_IDS";
        }
        if (i10 != 32) {
            return null;
        }
        return "FLAG_REQUEST_FILTER_KEY_EVENTS";
    }

    public static int getCapabilities(@NonNull AccessibilityServiceInfo accessibilityServiceInfo) {
        return accessibilityServiceInfo.getCapabilities();
    }

    @Nullable
    public static String loadDescription(@NonNull AccessibilityServiceInfo accessibilityServiceInfo, @NonNull PackageManager packageManager) {
        return accessibilityServiceInfo.loadDescription(packageManager);
    }
}
