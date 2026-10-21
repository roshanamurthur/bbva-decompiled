package o;

import android.util.Log;
import androidx.biometric.BiometricFragment;
import androidx.biometric.BiometricViewModel;
import androidx.biometric.R;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: BiometricFragment.java */
/* JADX INFO: loaded from: classes.dex */
public final class d implements Observer<Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BiometricFragment f85230a;

    public d(BiometricFragment biometricFragment) {
        this.f85230a = biometricFragment;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Boolean bool) {
        if (bool.booleanValue()) {
            BiometricFragment biometricFragment = this.f85230a;
            if (biometricFragment.e()) {
                biometricFragment.j(biometricFragment.getString(R.string.fingerprint_not_recognized));
            }
            BiometricViewModel biometricViewModel = biometricFragment.f1741q0;
            if (biometricViewModel.E0) {
                Executor bVar = biometricViewModel.f1775p0;
                if (bVar == null) {
                    bVar = new BiometricViewModel.b();
                }
                bVar.execute(new androidx.biometric.d(biometricFragment));
            } else {
                Log.w("BiometricFragment", "Failure not sent to client. Client is not awaiting a result.");
            }
            BiometricViewModel biometricViewModel2 = biometricFragment.f1741q0;
            if (biometricViewModel2.L0 == null) {
                biometricViewModel2.L0 = new MutableLiveData<>();
            }
            BiometricViewModel.f(biometricViewModel2.L0, Boolean.FALSE);
        }
    }
}
