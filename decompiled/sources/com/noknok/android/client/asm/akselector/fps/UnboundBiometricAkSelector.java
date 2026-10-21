package com.noknok.android.client.asm.akselector.fps;

import android.annotation.TargetApi;
import android.content.Context;
import android.hardware.biometrics.BiometricManager;
import android.os.Build;
import androidx.appcompat.widget.b1;
import androidx.appcompat.widget.c1;
import com.noknok.android.client.asm.akselector.generic.GenericAKSelector;
import com.noknok.android.client.asm.authenticator.KSUtils;
import com.noknok.android.client.asm.sdk.IAuthenticatorDescriptor;
import com.noknok.android.client.asm.sdk.IMatcher;
import com.noknok.android.client.asm.sdk.ProtocolType;
import com.noknok.android.client.utils.Logger;

/* JADX INFO: loaded from: classes11.dex */
public class UnboundBiometricAkSelector extends GenericAKSelector {
    @TargetApi(28)
    public UnboundBiometricAkSelector(Context context, ProtocolType protocolType, IAuthenticatorDescriptor iAuthenticatorDescriptor, IMatcher iMatcher, IAuthenticatorDescriptor.AAIDInfo aAIDInfo) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 28) {
            Logger.w("UnboundBiometricAkSelector", "Android version should be P or above, disabling the ASM");
            return;
        }
        if (i10 >= 29) {
            BiometricManager biometricManagerD = c1.d(context.getSystemService(b1.c()));
            if (biometricManagerD == null) {
                Logger.w("UnboundBiometricAkSelector", "BiometricManager not supported on the system, disabling the ASM");
                return;
            }
            int iCanAuthenticate = biometricManagerD.canAuthenticate();
            if (iCanAuthenticate == 1 || iCanAuthenticate == 12) {
                Logger.w("UnboundBiometricAkSelector", "Biometric hardware not detected, disabling the ASM");
                return;
            }
        } else if (!context.getPackageManager().hasSystemFeature("android.hardware.fingerprint")) {
            Logger.w("UnboundBiometricAkSelector", "Fingerprint hardware not detected, disabling the ASM");
            return;
        }
        init(context, protocolType, iAuthenticatorDescriptor, iMatcher, KSUtils.AkMode.KS, aAIDInfo);
    }
}
