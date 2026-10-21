package o;

import androidx.biometric.BiometricFragment;

/* JADX INFO: compiled from: BiometricFragment.java */
/* JADX INFO: loaded from: classes.dex */
public final class h implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f85234p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ CharSequence f85235q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ BiometricFragment f85236r0;

    public h(BiometricFragment biometricFragment, int i10, CharSequence charSequence) {
        this.f85236r0 = biometricFragment;
        this.f85234p0 = i10;
        this.f85235q0 = charSequence;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f85236r0.g(this.f85234p0, this.f85235q0);
    }
}
