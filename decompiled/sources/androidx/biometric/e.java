package androidx.biometric;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;

/* JADX INFO: compiled from: BiometricFragment.java */
/* JADX INFO: loaded from: classes.dex */
public final class e implements Observer<BiometricPrompt.AuthenticationResult> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BiometricFragment f1801a;

    public e(BiometricFragment biometricFragment) {
        this.f1801a = biometricFragment;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(BiometricPrompt.AuthenticationResult authenticationResult) {
        BiometricPrompt.AuthenticationResult authenticationResult2 = authenticationResult;
        if (authenticationResult2 != null) {
            BiometricFragment biometricFragment = this.f1801a;
            biometricFragment.i(authenticationResult2);
            BiometricViewModel biometricViewModel = biometricFragment.f1741q0;
            if (biometricViewModel.I0 == null) {
                biometricViewModel.I0 = new MutableLiveData<>();
            }
            BiometricViewModel.f(biometricViewModel.I0, null);
        }
    }
}
