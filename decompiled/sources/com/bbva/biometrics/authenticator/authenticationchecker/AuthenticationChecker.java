package com.bbva.biometrics.authenticator.authenticationchecker;

import android.content.Context;
import com.bbva.biometrics.authenticator.data.AuthenticateResult;
import com.bbva.biometrics.authenticator.data.BiometricType;
import com.huawei.hms.feature.model.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AuthenticationChecker.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0014\u0010\b\u001a\u00020\t*\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH\u0002¨\u0006\f"}, d2 = {"Lcom/bbva/biometrics/authenticator/authenticationchecker/AuthenticationChecker;", "", "canAuthenticate", "Lcom/bbva/biometrics/authenticator/data/AuthenticateResult;", "context", "Landroid/content/Context;", "getBiometricSystemType", "Lcom/bbva/biometrics/authenticator/data/BiometricType;", "hasSystemFeature", "", c.f50460q, "", "biometrics_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface AuthenticationChecker {

    /* JADX INFO: compiled from: AuthenticationChecker.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class DefaultImpls {
        @NotNull
        public static BiometricType getBiometricSystemType(@NotNull AuthenticationChecker authenticationChecker, @NotNull Context context) {
            Intrinsics.checkNotNullParameter(authenticationChecker, "this");
            Intrinsics.checkNotNullParameter(context, "context");
            if (context.getPackageManager().hasSystemFeature("android.hardware.biometrics.face")) {
                return BiometricType.FACE;
            }
            return context.getPackageManager().hasSystemFeature("android.hardware.fingerprint") ? BiometricType.FINGERPRINT : BiometricType.NONE;
        }
    }

    @NotNull
    AuthenticateResult canAuthenticate(@NotNull Context context);

    @NotNull
    BiometricType getBiometricSystemType(@NotNull Context context);
}
