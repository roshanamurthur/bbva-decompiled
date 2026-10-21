package androidx.biometric;

/* JADX INFO: compiled from: BiometricFragment.java */
/* JADX INFO: loaded from: classes.dex */
public final class f implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ BiometricPrompt.AuthenticationResult f1802p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ BiometricFragment f1803q0;

    public f(BiometricFragment biometricFragment, BiometricPrompt.AuthenticationResult authenticationResult) {
        this.f1803q0 = biometricFragment;
        this.f1802p0 = authenticationResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BiometricViewModel biometricViewModel = this.f1803q0.f1741q0;
        if (biometricViewModel.f1776q0 == null) {
            biometricViewModel.f1776q0 = new g();
        }
        biometricViewModel.f1776q0.onAuthenticationSucceeded(this.f1802p0);
    }
}
