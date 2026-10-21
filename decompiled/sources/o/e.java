package o;

import androidx.biometric.BiometricFragment;
import androidx.biometric.BiometricPrompt;
import androidx.biometric.BiometricViewModel;
import androidx.biometric.R;
import androidx.lifecycle.Observer;

/* JADX INFO: compiled from: BiometricFragment.java */
/* JADX INFO: loaded from: classes.dex */
public final class e implements Observer<Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BiometricFragment f85231a;

    public e(BiometricFragment biometricFragment) {
        this.f85231a = biometricFragment;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Boolean bool) {
        if (bool.booleanValue()) {
            BiometricFragment biometricFragment = this.f85231a;
            if (biometricFragment.d()) {
                biometricFragment.f();
            } else {
                BiometricViewModel biometricViewModel = biometricFragment.f1741q0;
                CharSequence string = biometricViewModel.f1781w0;
                if (string == null) {
                    BiometricPrompt.PromptInfo promptInfo = biometricViewModel.f1777r0;
                    string = promptInfo != null ? promptInfo.getNegativeButtonText() : null;
                }
                if (string == null) {
                    string = biometricFragment.getString(R.string.default_error_msg);
                }
                biometricFragment.g(13, string);
                biometricFragment.a(2);
            }
            biometricFragment.f1741q0.e(false);
        }
    }
}
