package androidx.biometric;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class BiometricViewModel extends ViewModel {
    public boolean E0;
    public boolean F0;
    public boolean G0;
    public boolean H0;

    @Nullable
    public MutableLiveData<BiometricPrompt.AuthenticationResult> I0;

    @Nullable
    public MutableLiveData<o.a> J0;

    @Nullable
    public MutableLiveData<CharSequence> K0;

    @Nullable
    public MutableLiveData<Boolean> L0;

    @Nullable
    public MutableLiveData<Boolean> M0;

    @Nullable
    public MutableLiveData<Boolean> O0;

    @Nullable
    public MutableLiveData<Integer> Q0;

    @Nullable
    public MutableLiveData<CharSequence> R0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @Nullable
    public Executor f1775p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @Nullable
    public BiometricPrompt.AuthenticationCallback f1776q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @Nullable
    public BiometricPrompt.PromptInfo f1777r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @Nullable
    public BiometricPrompt.CryptoObject f1778s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @Nullable
    public androidx.biometric.b f1779t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @Nullable
    public o.i f1780u0;

    @Nullable
    public c v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    @Nullable
    public CharSequence f1781w0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public boolean f1783y0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public int f1782x0 = 0;
    public boolean N0 = true;
    public int P0 = 0;

    public static final class a extends androidx.biometric.b.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public final WeakReference<BiometricViewModel> f1784a;

        public a(@Nullable BiometricViewModel biometricViewModel) {
            this.f1784a = new WeakReference<>(biometricViewModel);
        }

        @Override // androidx.biometric.b.c
        public final void a(int i10, @Nullable CharSequence charSequence) {
            WeakReference<BiometricViewModel> weakReference = this.f1784a;
            if (weakReference.get() == null || weakReference.get().F0 || !weakReference.get().E0) {
                return;
            }
            weakReference.get().b(new o.a(i10, charSequence));
        }

        @Override // androidx.biometric.b.c
        public final void b(@NonNull BiometricPrompt.AuthenticationResult authenticationResult) {
            WeakReference<BiometricViewModel> weakReference = this.f1784a;
            if (weakReference.get() == null || !weakReference.get().E0) {
                return;
            }
            int i10 = -1;
            if (authenticationResult.getAuthenticationType() == -1) {
                BiometricPrompt.CryptoObject cryptoObject = authenticationResult.getCryptoObject();
                int iA = weakReference.get().a();
                if ((iA & 32767) != 0 && !androidx.biometric.c.b(iA)) {
                    i10 = 2;
                }
                authenticationResult = new BiometricPrompt.AuthenticationResult(cryptoObject, i10);
            }
            BiometricViewModel biometricViewModel = weakReference.get();
            if (biometricViewModel.I0 == null) {
                biometricViewModel.I0 = new MutableLiveData<>();
            }
            BiometricViewModel.f(biometricViewModel.I0, authenticationResult);
        }
    }

    public static class b implements Executor {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Handler f1785p0 = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            this.f1785p0.post(runnable);
        }
    }

    public static class c implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        @NonNull
        public final WeakReference<BiometricViewModel> f1786p0;

        public c(@Nullable BiometricViewModel biometricViewModel) {
            this.f1786p0 = new WeakReference<>(biometricViewModel);
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            WeakReference<BiometricViewModel> weakReference = this.f1786p0;
            if (weakReference.get() != null) {
                weakReference.get().e(true);
            }
        }
    }

    public static <T> void f(MutableLiveData<T> mutableLiveData, T t10) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            mutableLiveData.setValue(t10);
        } else {
            mutableLiveData.postValue(t10);
        }
    }

    public final int a() {
        BiometricPrompt.PromptInfo promptInfo = this.f1777r0;
        if (promptInfo != null) {
            return androidx.biometric.c.a(promptInfo, this.f1778s0);
        }
        return 0;
    }

    public final void b(@Nullable o.a aVar) {
        if (this.J0 == null) {
            this.J0 = new MutableLiveData<>();
        }
        f(this.J0, aVar);
    }

    public final void c(@NonNull CharSequence charSequence) {
        if (this.R0 == null) {
            this.R0 = new MutableLiveData<>();
        }
        f(this.R0, charSequence);
    }

    public final void d(int i10) {
        if (this.Q0 == null) {
            this.Q0 = new MutableLiveData<>();
        }
        f(this.Q0, Integer.valueOf(i10));
    }

    public final void e(boolean z10) {
        if (this.M0 == null) {
            this.M0 = new MutableLiveData<>();
        }
        f(this.M0, Boolean.valueOf(z10));
    }
}
