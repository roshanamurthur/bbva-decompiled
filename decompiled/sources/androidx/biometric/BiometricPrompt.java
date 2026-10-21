package androidx.biometric;

import android.annotation.SuppressLint;
import android.os.Build;
import android.security.identity.IdentityCredential;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.ViewModelProvider;
import java.lang.ref.WeakReference;
import java.security.Signature;
import java.util.concurrent.Executor;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes.dex */
public class BiometricPrompt {
    public static final int AUTHENTICATION_RESULT_TYPE_BIOMETRIC = 2;
    public static final int AUTHENTICATION_RESULT_TYPE_DEVICE_CREDENTIAL = 1;
    public static final int AUTHENTICATION_RESULT_TYPE_UNKNOWN = -1;
    public static final int ERROR_CANCELED = 5;
    public static final int ERROR_HW_NOT_PRESENT = 12;
    public static final int ERROR_HW_UNAVAILABLE = 1;
    public static final int ERROR_LOCKOUT = 7;
    public static final int ERROR_LOCKOUT_PERMANENT = 9;
    public static final int ERROR_NEGATIVE_BUTTON = 13;
    public static final int ERROR_NO_BIOMETRICS = 11;
    public static final int ERROR_NO_DEVICE_CREDENTIAL = 14;
    public static final int ERROR_NO_SPACE = 4;
    public static final int ERROR_SECURITY_UPDATE_REQUIRED = 15;
    public static final int ERROR_TIMEOUT = 3;
    public static final int ERROR_UNABLE_TO_PROCESS = 2;
    public static final int ERROR_USER_CANCELED = 10;
    public static final int ERROR_VENDOR = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final FragmentManager f1753a;

    public static class AuthenticationResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CryptoObject f1754a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f1755b;

        public AuthenticationResult(CryptoObject cryptoObject, int i10) {
            this.f1754a = cryptoObject;
            this.f1755b = i10;
        }

        public int getAuthenticationType() {
            return this.f1755b;
        }

        @Nullable
        public CryptoObject getCryptoObject() {
            return this.f1754a;
        }
    }

    public static class PromptInfo {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public final CharSequence f1760a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final CharSequence f1761b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final CharSequence f1762c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public final CharSequence f1763d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f1764e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f1765f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f1766g;

        public static class Builder {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @Nullable
            public CharSequence f1767a = null;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @Nullable
            public CharSequence f1768b = null;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @Nullable
            public CharSequence f1769c = null;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            @Nullable
            public CharSequence f1770d = null;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public boolean f1771e = true;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public boolean f1772f = false;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public int f1773g = 0;

            @NonNull
            public PromptInfo build() {
                String strValueOf;
                if (TextUtils.isEmpty(this.f1767a)) {
                    throw new IllegalArgumentException("Title must be set and non-empty.");
                }
                if (c.c(this.f1773g)) {
                    int i10 = this.f1773g;
                    boolean zB = i10 != 0 ? c.b(i10) : this.f1772f;
                    if (TextUtils.isEmpty(this.f1770d) && !zB) {
                        throw new IllegalArgumentException("Negative text must be set and non-empty.");
                    }
                    if (TextUtils.isEmpty(this.f1770d) || !zB) {
                        return new PromptInfo(this.f1767a, this.f1768b, this.f1769c, this.f1770d, this.f1771e, this.f1772f, this.f1773g);
                    }
                    throw new IllegalArgumentException("Negative text must not be set if device credential authentication is allowed.");
                }
                StringBuilder sb2 = new StringBuilder("Authenticator combination is unsupported on API ");
                sb2.append(Build.VERSION.SDK_INT);
                sb2.append(": ");
                int i11 = this.f1773g;
                if (i11 == 15) {
                    strValueOf = "BIOMETRIC_STRONG";
                } else if (i11 == 255) {
                    strValueOf = "BIOMETRIC_WEAK";
                } else if (i11 == 32768) {
                    strValueOf = "DEVICE_CREDENTIAL";
                } else if (i11 != 32783) {
                    strValueOf = i11 != 33023 ? String.valueOf(i11) : "BIOMETRIC_WEAK | DEVICE_CREDENTIAL";
                } else {
                    strValueOf = "BIOMETRIC_STRONG | DEVICE_CREDENTIAL";
                }
                sb2.append(strValueOf);
                throw new IllegalArgumentException(sb2.toString());
            }

            @NonNull
            public Builder setAllowedAuthenticators(int i10) {
                this.f1773g = i10;
                return this;
            }

            @NonNull
            public Builder setConfirmationRequired(boolean z10) {
                this.f1771e = z10;
                return this;
            }

            @NonNull
            public Builder setDescription(@Nullable CharSequence charSequence) {
                this.f1769c = charSequence;
                return this;
            }

            @NonNull
            @Deprecated
            public Builder setDeviceCredentialAllowed(boolean z10) {
                this.f1772f = z10;
                return this;
            }

            @NonNull
            public Builder setNegativeButtonText(@NonNull CharSequence charSequence) {
                this.f1770d = charSequence;
                return this;
            }

            @NonNull
            public Builder setSubtitle(@Nullable CharSequence charSequence) {
                this.f1768b = charSequence;
                return this;
            }

            @NonNull
            public Builder setTitle(@NonNull CharSequence charSequence) {
                this.f1767a = charSequence;
                return this;
            }
        }

        public PromptInfo(@NonNull CharSequence charSequence, @Nullable CharSequence charSequence2, @Nullable CharSequence charSequence3, @Nullable CharSequence charSequence4, boolean z10, boolean z11, int i10) {
            this.f1760a = charSequence;
            this.f1761b = charSequence2;
            this.f1762c = charSequence3;
            this.f1763d = charSequence4;
            this.f1764e = z10;
            this.f1765f = z11;
            this.f1766g = i10;
        }

        public int getAllowedAuthenticators() {
            return this.f1766g;
        }

        @Nullable
        public CharSequence getDescription() {
            return this.f1762c;
        }

        @NonNull
        public CharSequence getNegativeButtonText() {
            CharSequence charSequence = this.f1763d;
            return charSequence != null ? charSequence : "";
        }

        @Nullable
        public CharSequence getSubtitle() {
            return this.f1761b;
        }

        @NonNull
        public CharSequence getTitle() {
            return this.f1760a;
        }

        public boolean isConfirmationRequired() {
            return this.f1764e;
        }

        @Deprecated
        public boolean isDeviceCredentialAllowed() {
            return this.f1765f;
        }
    }

    public static class a implements LifecycleObserver {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        @NonNull
        public final WeakReference<BiometricViewModel> f1774p0;

        public a(@NonNull BiometricViewModel biometricViewModel) {
            this.f1774p0 = new WeakReference<>(biometricViewModel);
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
        public void resetCallback() {
            WeakReference<BiometricViewModel> weakReference = this.f1774p0;
            if (weakReference.get() != null) {
                weakReference.get().f1776q0 = null;
            }
        }
    }

    public BiometricPrompt(@NonNull FragmentActivity fragmentActivity, @NonNull AuthenticationCallback authenticationCallback) {
        if (fragmentActivity == null) {
            throw new IllegalArgumentException("FragmentActivity must not be null.");
        }
        if (authenticationCallback == null) {
            throw new IllegalArgumentException("AuthenticationCallback must not be null.");
        }
        FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        BiometricViewModel biometricViewModelB = b(fragmentActivity);
        this.f1753a = supportFragmentManager;
        if (biometricViewModelB != null) {
            biometricViewModelB.f1776q0 = authenticationCallback;
        }
    }

    @Nullable
    public static BiometricViewModel b(@Nullable FragmentActivity fragmentActivity) {
        if (fragmentActivity != null) {
            return (BiometricViewModel) new ViewModelProvider(fragmentActivity).get(BiometricViewModel.class);
        }
        return null;
    }

    public final void a(@NonNull PromptInfo promptInfo, @Nullable CryptoObject cryptoObject) {
        FragmentManager fragmentManager = this.f1753a;
        if (fragmentManager == null || fragmentManager.isStateSaved()) {
            return;
        }
        FragmentManager fragmentManager2 = this.f1753a;
        BiometricFragment biometricFragment = (BiometricFragment) fragmentManager2.findFragmentByTag("androidx.biometric.BiometricFragment");
        if (biometricFragment == null) {
            biometricFragment = new BiometricFragment();
            fragmentManager2.beginTransaction().add(biometricFragment, "androidx.biometric.BiometricFragment").commitAllowingStateLoss();
            fragmentManager2.executePendingTransactions();
        }
        FragmentActivity activity = biometricFragment.getActivity();
        if (activity == null) {
            return;
        }
        biometricFragment.f1741q0.f1777r0 = promptInfo;
        int iA = c.a(promptInfo, cryptoObject);
        if (Build.VERSION.SDK_INT < 30 && iA == 15 && cryptoObject == null) {
            biometricFragment.f1741q0.f1778s0 = h.a();
        } else {
            biometricFragment.f1741q0.f1778s0 = cryptoObject;
        }
        if (biometricFragment.d()) {
            biometricFragment.f1741q0.f1781w0 = biometricFragment.getString(R.string.confirm_device_credential_password);
        } else {
            biometricFragment.f1741q0.f1781w0 = null;
        }
        if (biometricFragment.d() && BiometricManager.from(activity).canAuthenticate(255) != 0) {
            biometricFragment.f1741q0.E0 = true;
            biometricFragment.f();
        } else if (biometricFragment.f1741q0.G0) {
            biometricFragment.f1740p0.postDelayed(new BiometricFragment.g(biometricFragment), 600L);
        } else {
            biometricFragment.k();
        }
    }

    public void authenticate(@NonNull PromptInfo promptInfo, @NonNull CryptoObject cryptoObject) {
        if (promptInfo == null) {
            throw new IllegalArgumentException("PromptInfo cannot be null.");
        }
        if (cryptoObject == null) {
            throw new IllegalArgumentException("CryptoObject cannot be null.");
        }
        int iA = c.a(promptInfo, cryptoObject);
        if ((iA & 255) == 255) {
            throw new IllegalArgumentException("Crypto-based authentication is not supported for Class 2 (Weak) biometrics.");
        }
        if (Build.VERSION.SDK_INT < 30 && c.b(iA)) {
            throw new IllegalArgumentException("Crypto-based authentication is not supported for device credential prior to API 30.");
        }
        a(promptInfo, cryptoObject);
    }

    public void cancelAuthentication() {
        BiometricFragment biometricFragment;
        FragmentManager fragmentManager = this.f1753a;
        if (fragmentManager == null || (biometricFragment = (BiometricFragment) fragmentManager.findFragmentByTag("androidx.biometric.BiometricFragment")) == null) {
            return;
        }
        biometricFragment.a(3);
    }

    public static class CryptoObject {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final Signature f1756a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final Cipher f1757b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final Mac f1758c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public final IdentityCredential f1759d;

        public CryptoObject(@NonNull Signature signature) {
            this.f1756a = signature;
            this.f1757b = null;
            this.f1758c = null;
            this.f1759d = null;
        }

        @Nullable
        public Cipher getCipher() {
            return this.f1757b;
        }

        @Nullable
        @RequiresApi(30)
        public IdentityCredential getIdentityCredential() {
            return this.f1759d;
        }

        @Nullable
        public Mac getMac() {
            return this.f1758c;
        }

        @Nullable
        public Signature getSignature() {
            return this.f1756a;
        }

        public CryptoObject(@NonNull Cipher cipher) {
            this.f1756a = null;
            this.f1757b = cipher;
            this.f1758c = null;
            this.f1759d = null;
        }

        public CryptoObject(@NonNull Mac mac) {
            this.f1756a = null;
            this.f1757b = null;
            this.f1758c = mac;
            this.f1759d = null;
        }

        @RequiresApi(30)
        public CryptoObject(@NonNull IdentityCredential identityCredential) {
            this.f1756a = null;
            this.f1757b = null;
            this.f1758c = null;
            this.f1759d = identityCredential;
        }
    }

    public BiometricPrompt(@NonNull Fragment fragment, @NonNull AuthenticationCallback authenticationCallback) {
        if (fragment == null) {
            throw new IllegalArgumentException("Fragment must not be null.");
        }
        if (authenticationCallback != null) {
            FragmentActivity activity = fragment.getActivity();
            FragmentManager childFragmentManager = fragment.getChildFragmentManager();
            BiometricViewModel biometricViewModelB = b(activity);
            if (biometricViewModelB != null) {
                fragment.getLifecycle().addObserver(new a(biometricViewModelB));
            }
            this.f1753a = childFragmentManager;
            if (biometricViewModelB != null) {
                biometricViewModelB.f1776q0 = authenticationCallback;
                return;
            }
            return;
        }
        throw new IllegalArgumentException("AuthenticationCallback must not be null.");
    }

    public void authenticate(@NonNull PromptInfo promptInfo) {
        if (promptInfo != null) {
            a(promptInfo, null);
            return;
        }
        throw new IllegalArgumentException("PromptInfo cannot be null.");
    }

    public static abstract class AuthenticationCallback {
        public void onAuthenticationFailed() {
        }

        public void onAuthenticationSucceeded(@NonNull AuthenticationResult authenticationResult) {
        }

        public void onAuthenticationError(int i10, @NonNull CharSequence charSequence) {
        }
    }

    @SuppressLint({"LambdaLast"})
    public BiometricPrompt(@NonNull FragmentActivity fragmentActivity, @NonNull Executor executor, @NonNull AuthenticationCallback authenticationCallback) {
        if (fragmentActivity == null) {
            throw new IllegalArgumentException("FragmentActivity must not be null.");
        }
        if (executor == null) {
            throw new IllegalArgumentException("Executor must not be null.");
        }
        if (authenticationCallback != null) {
            FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
            BiometricViewModel biometricViewModelB = b(fragmentActivity);
            this.f1753a = supportFragmentManager;
            if (biometricViewModelB != null) {
                biometricViewModelB.f1775p0 = executor;
                biometricViewModelB.f1776q0 = authenticationCallback;
                return;
            }
            return;
        }
        throw new IllegalArgumentException("AuthenticationCallback must not be null.");
    }

    @SuppressLint({"LambdaLast"})
    public BiometricPrompt(@NonNull Fragment fragment, @NonNull Executor executor, @NonNull AuthenticationCallback authenticationCallback) {
        if (fragment == null) {
            throw new IllegalArgumentException("Fragment must not be null.");
        }
        if (executor == null) {
            throw new IllegalArgumentException("Executor must not be null.");
        }
        if (authenticationCallback != null) {
            FragmentActivity activity = fragment.getActivity();
            FragmentManager childFragmentManager = fragment.getChildFragmentManager();
            BiometricViewModel biometricViewModelB = b(activity);
            if (biometricViewModelB != null) {
                fragment.getLifecycle().addObserver(new a(biometricViewModelB));
            }
            this.f1753a = childFragmentManager;
            if (biometricViewModelB != null) {
                biometricViewModelB.f1775p0 = executor;
                biometricViewModelB.f1776q0 = authenticationCallback;
                return;
            }
            return;
        }
        throw new IllegalArgumentException("AuthenticationCallback must not be null.");
    }
}
