package androidx.core.hardware.fingerprint;

import android.hardware.fingerprint.FingerprintManager;

/* JADX INFO: compiled from: FingerprintManagerCompat.java */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends FingerprintManager.AuthenticationCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FingerprintManagerCompat.AuthenticationCallback f19936a;

    public a(FingerprintManagerCompat.AuthenticationCallback authenticationCallback) {
        this.f19936a = authenticationCallback;
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationError(int i10, CharSequence charSequence) {
        this.f19936a.onAuthenticationError(i10, charSequence);
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationFailed() {
        this.f19936a.onAuthenticationFailed();
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationHelp(int i10, CharSequence charSequence) {
        this.f19936a.onAuthenticationHelp(i10, charSequence);
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
        this.f19936a.onAuthenticationSucceeded(new FingerprintManagerCompat.AuthenticationResult(FingerprintManagerCompat.a.f(FingerprintManagerCompat.a.b(authenticationResult))));
    }
}
