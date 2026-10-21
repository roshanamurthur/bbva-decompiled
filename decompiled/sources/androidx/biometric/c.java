package androidx.biometric;

import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: AuthenticatorUtils.java */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    public static int a(@NonNull BiometricPrompt.PromptInfo promptInfo, @Nullable BiometricPrompt.CryptoObject cryptoObject) {
        if (promptInfo.getAllowedAuthenticators() != 0) {
            return promptInfo.getAllowedAuthenticators();
        }
        int i10 = cryptoObject != null ? 15 : 255;
        return promptInfo.isDeviceCredentialAllowed() ? 32768 | i10 : i10;
    }

    public static boolean b(int i10) {
        return (i10 & 32768) != 0;
    }

    public static boolean c(int i10) {
        if (i10 == 15 || i10 == 255) {
            return true;
        }
        if (i10 == 32768) {
            return Build.VERSION.SDK_INT >= 30;
        }
        if (i10 != 32783) {
            return i10 == 33023 || i10 == 0;
        }
        int i11 = Build.VERSION.SDK_INT;
        return i11 < 28 || i11 > 29;
    }
}
