package com.bbva.biometrics.authenticator.authenticationchecker;

import android.content.Context;
import androidx.core.hardware.fingerprint.FingerprintManagerCompat;
import com.bbva.biometrics.authenticator.data.AuthenticateResult;
import com.bbva.biometrics.authenticator.data.BiometricType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FingerprintAuthenticationChecker.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/bbva/biometrics/authenticator/authenticationchecker/FingerprintAuthenticationChecker;", "Lcom/bbva/biometrics/authenticator/authenticationchecker/AuthenticationChecker;", "()V", "canAuthenticate", "Lcom/bbva/biometrics/authenticator/data/AuthenticateResult;", "context", "Landroid/content/Context;", "biometrics_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class FingerprintAuthenticationChecker implements AuthenticationChecker {

    @NotNull
    public static final FingerprintAuthenticationChecker INSTANCE = new FingerprintAuthenticationChecker();

    @Override // com.bbva.biometrics.authenticator.authenticationchecker.AuthenticationChecker
    @NotNull
    public AuthenticateResult canAuthenticate(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String value = getBiometricSystemType(context).getValue();
        boolean zIsHardwareDetected = FingerprintManagerCompat.from(context).isHardwareDetected();
        boolean zHasEnrolledFingerprints = FingerprintManagerCompat.from(context).hasEnrolledFingerprints();
        if (!zIsHardwareDetected) {
            return new AuthenticateResult.NoHardware(12, null, 2, null);
        }
        if (zHasEnrolledFingerprints) {
            return zHasEnrolledFingerprints ? new AuthenticateResult.Success(0, null, value, 2, null) : new AuthenticateResult.Unknown(-1, null, value, 2, null);
        }
        return new AuthenticateResult.NoneEnrolled(11, null, value, 2, null);
    }

    @Override // com.bbva.biometrics.authenticator.authenticationchecker.AuthenticationChecker
    @NotNull
    public BiometricType getBiometricSystemType(@NotNull Context context) {
        return AuthenticationChecker.DefaultImpls.getBiometricSystemType(this, context);
    }
}
