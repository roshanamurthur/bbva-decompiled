package o;

import androidx.biometric.BiometricFragment;
import androidx.biometric.BiometricViewModel;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;

/* JADX INFO: compiled from: BiometricFragment.java */
/* JADX INFO: loaded from: classes.dex */
public final class f implements Observer<Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BiometricFragment f85232a;

    public f(BiometricFragment biometricFragment) {
        this.f85232a = biometricFragment;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Boolean bool) {
        if (bool.booleanValue()) {
            BiometricFragment biometricFragment = this.f85232a;
            biometricFragment.a(1);
            biometricFragment.dismiss();
            BiometricViewModel biometricViewModel = biometricFragment.f1741q0;
            if (biometricViewModel.O0 == null) {
                biometricViewModel.O0 = new MutableLiveData<>();
            }
            BiometricViewModel.f(biometricViewModel.O0, Boolean.FALSE);
        }
    }
}
