package o;

import androidx.biometric.BiometricFragment;
import androidx.lifecycle.Observer;

/* JADX INFO: compiled from: BiometricFragment.java */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Observer<CharSequence> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BiometricFragment f85229a;

    public c(BiometricFragment biometricFragment) {
        this.f85229a = biometricFragment;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(CharSequence charSequence) {
        CharSequence charSequence2 = charSequence;
        if (charSequence2 != null) {
            BiometricFragment biometricFragment = this.f85229a;
            if (biometricFragment.e()) {
                biometricFragment.j(charSequence2);
            }
            biometricFragment.f1741q0.b(null);
        }
    }
}
