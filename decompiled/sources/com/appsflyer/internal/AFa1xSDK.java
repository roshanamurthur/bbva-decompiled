package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.appsflyer.AFLogger;
import com.bbva.cells.component.kit.ui.property.impl.image.ImageScaleTypeHandler;
import com.bbva.nativesettings.common.Constants;
import com.mastercard.sonic.androidsvg.SVGParser;

/* JADX INFO: loaded from: classes2.dex */
public final class AFa1xSDK implements AFb1jSDK {

    @VisibleForTesting
    private static IntentFilter AFKeystoreWrapper = new IntentFilter("android.intent.action.BATTERY_CHANGED");

    @Override // com.appsflyer.internal.AFb1jSDK
    @NonNull
    public final AFb1jSDK.AFa1xSDK AFInAppEventParameterName(@NonNull Context context) {
        String str = null;
        float f6 = 0.0f;
        try {
            Intent intentRegisterReceiver = context.registerReceiver(null, AFKeystoreWrapper);
            if (intentRegisterReceiver != null) {
                if (2 == intentRegisterReceiver.getIntExtra("status", -1)) {
                    int intExtra = intentRegisterReceiver.getIntExtra("plugged", -1);
                    if (intExtra == 1) {
                        str = "ac";
                    } else if (intExtra != 2) {
                        str = intExtra != 4 ? "other" : Constants.WIRELESS;
                    } else {
                        str = "usb";
                    }
                } else {
                    str = SVGParser.XML_STYLESHEET_ATTR_ALTERNATE_NO;
                }
                int intExtra2 = intentRegisterReceiver.getIntExtra("level", -1);
                int intExtra3 = intentRegisterReceiver.getIntExtra(ImageScaleTypeHandler.ID, -1);
                if (-1 != intExtra2 && -1 != intExtra3) {
                    f6 = (intExtra2 * 100.0f) / intExtra3;
                }
            }
        } catch (Throwable th2) {
            AFLogger.afErrorLogForExcManagerOnly("Device that failed to register receiver", th2);
        }
        return new AFb1jSDK.AFa1xSDK(f6, str);
    }
}
