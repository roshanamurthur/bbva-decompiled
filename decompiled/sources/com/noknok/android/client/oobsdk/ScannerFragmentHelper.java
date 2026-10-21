package com.noknok.android.client.oobsdk;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.noknok.android.client.appsdk.AppSDKException;
import com.noknok.android.client.appsdk.ResultType;
import com.noknok.android.client.utils.MobileServicesAvailabilityChecker;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes11.dex */
public class ScannerFragmentHelper {
    public static Fragment getScannerFragment(Context context, IScannerStateChangeListener iScannerStateChangeListener) {
        String str;
        if (MobileServicesAvailabilityChecker.isGMSAvailable(context)) {
            str = "com.noknok.android.client.oobsdk.vision.ScanQRFragment";
        } else {
            if (!MobileServicesAvailabilityChecker.isHMSAvailable(context)) {
                throw new AppSDKException(ResultType.INVALID_STATE, "No mobile services available on device");
            }
            str = "com.noknok.android.client.appsdk.hmsscan.ScanQRFragment";
        }
        try {
            Class<?> cls = Class.forName(str);
            return (Fragment) cls.getMethod("createScannerFragment", IScannerStateChangeListener.class).invoke(cls, iScannerStateChangeListener);
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            throw new AppSDKException(ResultType.INVALID_STATE, "No appropriate QR scan library added");
        } catch (IllegalAccessException e5) {
            e = e5;
            throw new AppSDKException(ResultType.FAILURE, "Failed to instantiate Scanner fragment", e);
        } catch (InvocationTargetException e7) {
            e = e7;
            throw new AppSDKException(ResultType.FAILURE, "Failed to instantiate Scanner fragment", e);
        }
    }
}
