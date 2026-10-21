package androidx.biometric;

import android.os.Build;
import android.security.identity.IdentityCredential;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.lifecycle.MutableLiveData;
import java.lang.ref.WeakReference;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* JADX INFO: compiled from: AuthenticationCallbackProvider.java */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public android.hardware.biometrics.BiometricPrompt$AuthenticationCallback f1796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public androidx.biometric.a f1797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final c f1798c;

    /* JADX INFO: renamed from: androidx.biometric.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AuthenticationCallbackProvider.java */
    @RequiresApi(30)
    public static class C0003b {
        public static int a(@NonNull android.hardware.biometrics.BiometricPrompt.AuthenticationResult authenticationResult) {
            return authenticationResult.getAuthenticationType();
        }
    }

    /* JADX INFO: compiled from: AuthenticationCallbackProvider.java */
    public static class c {
        public void a(int i10, @Nullable CharSequence charSequence) {
            throw null;
        }

        public void b(@NonNull BiometricPrompt.AuthenticationResult authenticationResult) {
            throw null;
        }
    }

    public b(@NonNull BiometricViewModel.a aVar) {
        this.f1798c = aVar;
    }

    /* JADX INFO: compiled from: AuthenticationCallbackProvider.java */
    @RequiresApi(28)
    public static class a {
        @NonNull
        public static android.hardware.biometrics.BiometricPrompt$AuthenticationCallback a(@NonNull c cVar) {
            return new C0002a(cVar);
        }

        /* JADX INFO: renamed from: androidx.biometric.b$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: AuthenticationCallbackProvider.java */
        public class C0002a extends android.hardware.biometrics.BiometricPrompt$AuthenticationCallback {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ c f1799a;

            public C0002a(c cVar) {
                this.f1799a = cVar;
            }

            public void onAuthenticationError(int i10, CharSequence charSequence) {
                this.f1799a.a(i10, charSequence);
            }

            public void onAuthenticationFailed() {
                WeakReference<BiometricViewModel> weakReference = ((BiometricViewModel.a) this.f1799a).f1784a;
                if (weakReference.get() == null || !weakReference.get().E0) {
                    return;
                }
                BiometricViewModel biometricViewModel = weakReference.get();
                if (biometricViewModel.L0 == null) {
                    biometricViewModel.L0 = new MutableLiveData<>();
                }
                BiometricViewModel.f(biometricViewModel.L0, Boolean.TRUE);
            }

            public void onAuthenticationSucceeded(android.hardware.biometrics.BiometricPrompt.AuthenticationResult authenticationResult) {
                android.hardware.biometrics.BiometricPrompt.CryptoObject cryptoObject;
                IdentityCredential identityCredentialB;
                BiometricPrompt.CryptoObject cryptoObject2 = null;
                if (authenticationResult != null && (cryptoObject = authenticationResult.getCryptoObject()) != null) {
                    Cipher cipherD = h.b.d(cryptoObject);
                    if (cipherD != null) {
                        cryptoObject2 = new BiometricPrompt.CryptoObject(cipherD);
                    } else {
                        Signature signatureF = h.b.f(cryptoObject);
                        if (signatureF != null) {
                            cryptoObject2 = new BiometricPrompt.CryptoObject(signatureF);
                        } else {
                            Mac macE = h.b.e(cryptoObject);
                            if (macE != null) {
                                cryptoObject2 = new BiometricPrompt.CryptoObject(macE);
                            } else if (Build.VERSION.SDK_INT >= 30 && (identityCredentialB = h.c.b(cryptoObject)) != null) {
                                cryptoObject2 = new BiometricPrompt.CryptoObject(identityCredentialB);
                            }
                        }
                    }
                }
                int i10 = Build.VERSION.SDK_INT;
                int iA = -1;
                if (i10 >= 30) {
                    if (authenticationResult != null) {
                        iA = C0003b.a(authenticationResult);
                    }
                } else if (i10 != 29) {
                    iA = 2;
                }
                this.f1799a.b(new BiometricPrompt.AuthenticationResult(cryptoObject2, iA));
            }

            public void onAuthenticationHelp(int i10, CharSequence charSequence) {
            }
        }
    }
}
