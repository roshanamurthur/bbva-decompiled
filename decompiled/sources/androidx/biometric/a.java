package androidx.biometric;

import androidx.core.hardware.fingerprint.FingerprintManagerCompat;
import androidx.lifecycle.MutableLiveData;
import java.lang.ref.WeakReference;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* JADX INFO: compiled from: AuthenticationCallbackProvider.java */
/* JADX INFO: loaded from: classes.dex */
public final class a extends FingerprintManagerCompat.AuthenticationCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f1795a;

    public a(b bVar) {
        this.f1795a = bVar;
    }

    @Override // androidx.core.hardware.fingerprint.FingerprintManagerCompat.AuthenticationCallback
    public final void onAuthenticationError(int i10, CharSequence charSequence) {
        this.f1795a.f1798c.a(i10, charSequence);
    }

    @Override // androidx.core.hardware.fingerprint.FingerprintManagerCompat.AuthenticationCallback
    public final void onAuthenticationFailed() {
        WeakReference<BiometricViewModel> weakReference = ((BiometricViewModel.a) this.f1795a.f1798c).f1784a;
        if (weakReference.get() == null || !weakReference.get().E0) {
            return;
        }
        BiometricViewModel biometricViewModel = weakReference.get();
        if (biometricViewModel.L0 == null) {
            biometricViewModel.L0 = new MutableLiveData<>();
        }
        BiometricViewModel.f(biometricViewModel.L0, Boolean.TRUE);
    }

    @Override // androidx.core.hardware.fingerprint.FingerprintManagerCompat.AuthenticationCallback
    public final void onAuthenticationHelp(int i10, CharSequence charSequence) {
        WeakReference<BiometricViewModel> weakReference = ((BiometricViewModel.a) this.f1795a.f1798c).f1784a;
        if (weakReference.get() != null) {
            BiometricViewModel biometricViewModel = weakReference.get();
            if (biometricViewModel.K0 == null) {
                biometricViewModel.K0 = new MutableLiveData<>();
            }
            BiometricViewModel.f(biometricViewModel.K0, charSequence);
        }
    }

    @Override // androidx.core.hardware.fingerprint.FingerprintManagerCompat.AuthenticationCallback
    public final void onAuthenticationSucceeded(FingerprintManagerCompat.AuthenticationResult authenticationResult) {
        FingerprintManagerCompat.CryptoObject cryptoObject;
        BiometricPrompt.CryptoObject cryptoObject2 = null;
        if (authenticationResult != null && (cryptoObject = authenticationResult.getCryptoObject()) != null) {
            Cipher cipher = cryptoObject.getCipher();
            if (cipher != null) {
                cryptoObject2 = new BiometricPrompt.CryptoObject(cipher);
            } else {
                Signature signature = cryptoObject.getSignature();
                if (signature != null) {
                    cryptoObject2 = new BiometricPrompt.CryptoObject(signature);
                } else {
                    Mac mac = cryptoObject.getMac();
                    if (mac != null) {
                        cryptoObject2 = new BiometricPrompt.CryptoObject(mac);
                    }
                }
            }
        }
        this.f1795a.f1798c.b(new BiometricPrompt.AuthenticationResult(cryptoObject2, 2));
    }
}
