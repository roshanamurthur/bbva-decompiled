package com.noknok.android.client.asm.akselector.fps;

import android.annotation.TargetApi;
import android.content.Context;
import android.hardware.biometrics.BiometricManager;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.b1;
import androidx.appcompat.widget.c1;
import androidx.core.app.ActivityCompat;
import com.noknok.android.client.asm.akselector.generic.GenericAKSelector;
import com.noknok.android.client.asm.authenticator.KSUtils;
import com.noknok.android.client.asm.descriptor.fps.FpAuthDescriptor;
import com.noknok.android.client.asm.sdk.IAuthenticatorDescriptor;
import com.noknok.android.client.asm.sdk.IMatcher;
import com.noknok.android.client.asm.sdk.ProtocolType;
import com.noknok.android.client.utils.Logger;

/* JADX INFO: loaded from: classes11.dex */
public class FpAkSelector extends GenericAKSelector implements ActivityCompat.OnRequestPermissionsResultCallback {
    @TargetApi(23)
    public FpAkSelector(Context context, ProtocolType protocolType, IAuthenticatorDescriptor iAuthenticatorDescriptor, IMatcher iMatcher, IAuthenticatorDescriptor.AAIDInfo aAIDInfo) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29 && FpAuthDescriptor.useBiometric(context)) {
            BiometricManager biometricManagerD = c1.d(context.getSystemService(b1.c()));
            if (biometricManagerD == null) {
                Logger.w("FpAkSelector", "BiometricManager not supported on the system, disabling the ASM");
                return;
            }
            int iCanAuthenticate = i10 >= 30 ? biometricManagerD.canAuthenticate(15) : biometricManagerD.canAuthenticate();
            if (iCanAuthenticate == 12) {
                Logger.w("FpAkSelector", "Biometric hardware not detected, disabling the ASM");
                return;
            } else if (iCanAuthenticate == 15) {
                Logger.w("FpAkSelector", "The sensor's strength can currently only meet BIOMETRIC_WEAK");
                return;
            }
        } else if (!context.getPackageManager().hasSystemFeature("android.hardware.fingerprint")) {
            Logger.w("FpAkSelector", "Fingerprint hardware not detected, disabling the ASM");
            return;
        }
        init(context, protocolType, iAuthenticatorDescriptor, iMatcher, KSUtils.AkMode.FP, aAIDInfo);
    }

    @Override // androidx.core.app.ActivityCompat.OnRequestPermissionsResultCallback
    public void onRequestPermissionsResult(int i10, @NonNull String[] strArr, @NonNull int[] iArr) {
        if (i10 == 0 && iArr[0] == 0) {
            Logger.d("FpAkSelector", "FPS permission granted, performing authentication");
        } else {
            Logger.d("FpAkSelector", "FPS permission not granted");
        }
    }
}
