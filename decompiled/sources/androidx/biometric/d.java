package androidx.biometric;

/* JADX INFO: compiled from: BiometricFragment.java */
/* JADX INFO: loaded from: classes.dex */
public final class d implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ BiometricFragment f1800p0;

    public d(BiometricFragment biometricFragment) {
        this.f1800p0 = biometricFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BiometricViewModel biometricViewModel = this.f1800p0.f1741q0;
        if (biometricViewModel.f1776q0 == null) {
            biometricViewModel.f1776q0 = new g();
        }
        biometricViewModel.f1776q0.onAuthenticationFailed();
    }
}
