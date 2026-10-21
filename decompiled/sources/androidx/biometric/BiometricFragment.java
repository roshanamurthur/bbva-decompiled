package androidx.biometric;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.hardware.fingerprint.FingerprintManagerCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;
import java.lang.ref.WeakReference;
import java.security.Signature;
import java.util.concurrent.Executor;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import o.l;
import o.m;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class BiometricFragment extends Fragment {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @VisibleForTesting
    public final Handler f1740p0 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @VisibleForTesting
    public BiometricViewModel f1741q0;

    public class a implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ int f1742p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ CharSequence f1743q0;

        public a(int i10, CharSequence charSequence) {
            this.f1742p0 = i10;
            this.f1743q0 = charSequence;
        }

        @Override // java.lang.Runnable
        public final void run() {
            BiometricViewModel biometricViewModel = BiometricFragment.this.f1741q0;
            if (biometricViewModel.f1776q0 == null) {
                biometricViewModel.f1776q0 = new androidx.biometric.g();
            }
            biometricViewModel.f1776q0.onAuthenticationError(this.f1742p0, this.f1743q0);
        }
    }

    @RequiresApi(21)
    public static class b {
        @Nullable
        public static Intent a(@NonNull KeyguardManager keyguardManager, @Nullable CharSequence charSequence, @Nullable CharSequence charSequence2) {
            return keyguardManager.createConfirmDeviceCredentialIntent(charSequence, charSequence2);
        }
    }

    @RequiresApi(28)
    public static class c {
        public static void a(@NonNull android.hardware.biometrics.BiometricPrompt biometricPrompt, @NonNull android.hardware.biometrics.BiometricPrompt.CryptoObject cryptoObject, @NonNull CancellationSignal cancellationSignal, @NonNull Executor executor, @NonNull android.hardware.biometrics.BiometricPrompt$AuthenticationCallback biometricPrompt$AuthenticationCallback) {
            biometricPrompt.authenticate(cryptoObject, cancellationSignal, executor, biometricPrompt$AuthenticationCallback);
        }

        public static void b(@NonNull android.hardware.biometrics.BiometricPrompt biometricPrompt, @NonNull CancellationSignal cancellationSignal, @NonNull Executor executor, @NonNull android.hardware.biometrics.BiometricPrompt$AuthenticationCallback biometricPrompt$AuthenticationCallback) {
            biometricPrompt.authenticate(cancellationSignal, executor, biometricPrompt$AuthenticationCallback);
        }

        @NonNull
        public static android.hardware.biometrics.BiometricPrompt c(@NonNull android.hardware.biometrics.BiometricPrompt.Builder builder) {
            return builder.build();
        }

        @NonNull
        public static android.hardware.biometrics.BiometricPrompt.Builder d(@NonNull Context context) {
            return new android.hardware.biometrics.BiometricPrompt.Builder(context);
        }

        public static void e(@NonNull android.hardware.biometrics.BiometricPrompt.Builder builder, @NonNull CharSequence charSequence) {
            builder.setDescription(charSequence);
        }

        public static void f(@NonNull android.hardware.biometrics.BiometricPrompt.Builder builder, @NonNull CharSequence charSequence, @NonNull Executor executor, @NonNull DialogInterface.OnClickListener onClickListener) {
            builder.setNegativeButton(charSequence, executor, onClickListener);
        }

        public static void g(@NonNull android.hardware.biometrics.BiometricPrompt.Builder builder, @NonNull CharSequence charSequence) {
            builder.setSubtitle(charSequence);
        }

        public static void h(@NonNull android.hardware.biometrics.BiometricPrompt.Builder builder, @NonNull CharSequence charSequence) {
            builder.setTitle(charSequence);
        }
    }

    @RequiresApi(29)
    public static class d {
        public static void a(@NonNull android.hardware.biometrics.BiometricPrompt.Builder builder, boolean z10) {
            builder.setConfirmationRequired(z10);
        }

        public static void b(@NonNull android.hardware.biometrics.BiometricPrompt.Builder builder, boolean z10) {
            builder.setDeviceCredentialAllowed(z10);
        }
    }

    @RequiresApi(30)
    public static class e {
        public static void a(@NonNull android.hardware.biometrics.BiometricPrompt.Builder builder, int i10) {
            builder.setAllowedAuthenticators(i10);
        }
    }

    public static class f implements Executor {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Handler f1745p0 = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public final void execute(@NonNull Runnable runnable) {
            this.f1745p0.post(runnable);
        }
    }

    public static class g implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        @NonNull
        public final WeakReference<BiometricFragment> f1746p0;

        public g(@Nullable BiometricFragment biometricFragment) {
            this.f1746p0 = new WeakReference<>(biometricFragment);
        }

        @Override // java.lang.Runnable
        public final void run() {
            WeakReference<BiometricFragment> weakReference = this.f1746p0;
            if (weakReference.get() != null) {
                weakReference.get().k();
            }
        }
    }

    public static class h implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        @NonNull
        public final WeakReference<BiometricViewModel> f1747p0;

        public h(@Nullable BiometricViewModel biometricViewModel) {
            this.f1747p0 = new WeakReference<>(biometricViewModel);
        }

        @Override // java.lang.Runnable
        public final void run() {
            WeakReference<BiometricViewModel> weakReference = this.f1747p0;
            if (weakReference.get() != null) {
                weakReference.get().G0 = false;
            }
        }
    }

    public static class i implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        @NonNull
        public final WeakReference<BiometricViewModel> f1748p0;

        public i(@Nullable BiometricViewModel biometricViewModel) {
            this.f1748p0 = new WeakReference<>(biometricViewModel);
        }

        @Override // java.lang.Runnable
        public final void run() {
            WeakReference<BiometricViewModel> weakReference = this.f1748p0;
            if (weakReference.get() != null) {
                weakReference.get().H0 = false;
            }
        }
    }

    public final void a(int i10) {
        if (i10 == 3 || !this.f1741q0.H0) {
            if (e()) {
                this.f1741q0.f1782x0 = i10;
                if (i10 == 1) {
                    h(10, androidx.biometric.i.a(getContext(), 10));
                }
            }
            BiometricViewModel biometricViewModel = this.f1741q0;
            if (biometricViewModel.f1780u0 == null) {
                biometricViewModel.f1780u0 = new o.i();
            }
            o.i iVar = biometricViewModel.f1780u0;
            CancellationSignal cancellationSignal = iVar.f85238b;
            if (cancellationSignal != null) {
                try {
                    o.i.b.a(cancellationSignal);
                } catch (NullPointerException unused) {
                }
                iVar.f85238b = null;
            }
            androidx.core.os.CancellationSignal cancellationSignal2 = iVar.f85239c;
            if (cancellationSignal2 != null) {
                try {
                    cancellationSignal2.cancel();
                } catch (NullPointerException unused2) {
                }
                iVar.f85239c = null;
            }
        }
    }

    public final void c() {
        this.f1741q0.f1783y0 = false;
        if (isAdded()) {
            FragmentManager parentFragmentManager = getParentFragmentManager();
            FingerprintDialogFragment fingerprintDialogFragment = (FingerprintDialogFragment) parentFragmentManager.findFragmentByTag("androidx.biometric.FingerprintDialogFragment");
            if (fingerprintDialogFragment != null) {
                if (fingerprintDialogFragment.isAdded()) {
                    fingerprintDialogFragment.dismissAllowingStateLoss();
                } else {
                    parentFragmentManager.beginTransaction().remove(fingerprintDialogFragment).commitAllowingStateLoss();
                }
            }
        }
    }

    public final boolean d() {
        return Build.VERSION.SDK_INT <= 28 && androidx.biometric.c.b(this.f1741q0.a());
    }

    public final void dismiss() {
        this.f1741q0.f1783y0 = false;
        c();
        if (!this.f1741q0.F0 && isAdded()) {
            getParentFragmentManager().beginTransaction().remove(this).commitAllowingStateLoss();
        }
        Context context = getContext();
        if (context != null) {
            String str = Build.MODEL;
            if (Build.VERSION.SDK_INT != 29) {
                return;
            }
            int i10 = R.array.delay_showing_prompt_models;
            if (str == null) {
                return;
            }
            for (String str2 : context.getResources().getStringArray(i10)) {
                if (str.equals(str2)) {
                    BiometricViewModel biometricViewModel = this.f1741q0;
                    biometricViewModel.G0 = true;
                    this.f1740p0.postDelayed(new h(biometricViewModel), 600L);
                    return;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0048  */
    /* JADX WARN: Code duplicated, block: B:28:0x0051 A[LOOP:1: B:24:0x0046->B:28:0x0051, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    /* JADX WARN: Code duplicated, block: B:31:0x0058  */
    /* JADX WARN: Code duplicated, block: B:33:0x005e  */
    /* JADX WARN: Code duplicated, block: B:43:0x006f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:23:0x003c, please report this as an issue */
    public final boolean e() {
        Context context;
        int i10;
        int i11;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 28) {
            FragmentActivity activity = getActivity();
            if (activity == null || this.f1741q0.f1778s0 == null) {
                if (Build.VERSION.SDK_INT == 28) {
                    return false;
                }
                context = getContext();
                if (context == null && context.getPackageManager() != null && m.a(context.getPackageManager())) {
                    return false;
                }
            } else {
                String str = Build.MANUFACTURER;
                String str2 = Build.MODEL;
                if (i12 == 28) {
                    int i13 = R.array.crypto_fingerprint_fallback_vendors;
                    if (str == null) {
                        i10 = R.array.crypto_fingerprint_fallback_prefixes;
                        if (str2 == null) {
                            for (String str3 : activity.getResources().getStringArray(i10)) {
                                if (str2.startsWith(str3)) {
                                }
                            }
                            if (Build.VERSION.SDK_INT == 28) {
                                return false;
                            }
                            context = getContext();
                            if (context == null) {
                            }
                        } else {
                            if (Build.VERSION.SDK_INT == 28) {
                                return false;
                            }
                            context = getContext();
                            if (context == null) {
                            }
                        }
                    } else {
                        for (String str4 : activity.getResources().getStringArray(i13)) {
                            if (!str.equalsIgnoreCase(str4)) {
                            }
                        }
                        i10 = R.array.crypto_fingerprint_fallback_prefixes;
                        if (str2 == null) {
                            while (i11 < r2) {
                                if (str2.startsWith(str3)) {
                                }
                            }
                            if (Build.VERSION.SDK_INT == 28) {
                                return false;
                            }
                            context = getContext();
                            if (context == null) {
                            }
                        } else {
                            if (Build.VERSION.SDK_INT == 28) {
                                return false;
                            }
                            context = getContext();
                            if (context == null) {
                            }
                        }
                    }
                } else {
                    if (Build.VERSION.SDK_INT == 28) {
                        return false;
                    }
                    context = getContext();
                    if (context == null) {
                    }
                }
            }
        }
        return true;
    }

    @RequiresApi(21)
    public final void f() {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        KeyguardManager keyguardManagerA = l.a(activity);
        if (keyguardManagerA == null) {
            g(12, getString(R.string.generic_error_no_keyguard));
            return;
        }
        BiometricPrompt.PromptInfo promptInfo = this.f1741q0.f1777r0;
        CharSequence title = promptInfo != null ? promptInfo.getTitle() : null;
        BiometricPrompt.PromptInfo promptInfo2 = this.f1741q0.f1777r0;
        CharSequence subtitle = promptInfo2 != null ? promptInfo2.getSubtitle() : null;
        BiometricPrompt.PromptInfo promptInfo3 = this.f1741q0.f1777r0;
        CharSequence description = promptInfo3 != null ? promptInfo3.getDescription() : null;
        if (subtitle == null) {
            subtitle = description;
        }
        Intent intentA = b.a(keyguardManagerA, title, subtitle);
        if (intentA == null) {
            g(14, getString(R.string.generic_error_no_device_credential));
            return;
        }
        this.f1741q0.F0 = true;
        if (e()) {
            c();
        }
        intentA.setFlags(134742016);
        startActivityForResult(intentA, 1);
    }

    public final void g(int i10, @NonNull CharSequence charSequence) {
        h(i10, charSequence);
        dismiss();
    }

    public final void h(int i10, @NonNull CharSequence charSequence) {
        BiometricViewModel biometricViewModel = this.f1741q0;
        if (biometricViewModel.F0) {
            return;
        }
        if (!biometricViewModel.E0) {
            Log.w("BiometricFragment", "Error not sent to client. Client is not awaiting a result.");
            return;
        }
        biometricViewModel.E0 = false;
        Executor bVar = biometricViewModel.f1775p0;
        if (bVar == null) {
            bVar = new BiometricViewModel.b();
        }
        bVar.execute(new a(i10, charSequence));
    }

    public final void i(@NonNull BiometricPrompt.AuthenticationResult authenticationResult) {
        BiometricViewModel biometricViewModel = this.f1741q0;
        if (biometricViewModel.E0) {
            biometricViewModel.E0 = false;
            Executor bVar = biometricViewModel.f1775p0;
            if (bVar == null) {
                bVar = new BiometricViewModel.b();
            }
            bVar.execute(new androidx.biometric.f(this, authenticationResult));
        } else {
            Log.w("BiometricFragment", "Success not sent to client. Client is not awaiting a result.");
        }
        dismiss();
    }

    public final void j(@Nullable CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = getString(R.string.default_error_msg);
        }
        this.f1741q0.d(2);
        this.f1741q0.c(charSequence);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x007f  */
    public final void k() {
        int i10;
        if (this.f1741q0.f1783y0) {
            return;
        }
        if (getContext() == null) {
            Log.w("BiometricFragment", "Not showing biometric prompt. Context is null.");
            return;
        }
        BiometricViewModel biometricViewModel = this.f1741q0;
        biometricViewModel.f1783y0 = true;
        biometricViewModel.E0 = true;
        CharSequence negativeButtonText = null;
        cryptoObject = null;
        cryptoObject = null;
        FingerprintManagerCompat.CryptoObject cryptoObject = null;
        if (!e()) {
            android.hardware.biometrics.BiometricPrompt.Builder builderD = c.d(requireContext().getApplicationContext());
            BiometricPrompt.PromptInfo promptInfo = this.f1741q0.f1777r0;
            CharSequence title = promptInfo != null ? promptInfo.getTitle() : null;
            BiometricPrompt.PromptInfo promptInfo2 = this.f1741q0.f1777r0;
            CharSequence subtitle = promptInfo2 != null ? promptInfo2.getSubtitle() : null;
            BiometricPrompt.PromptInfo promptInfo3 = this.f1741q0.f1777r0;
            CharSequence description = promptInfo3 != null ? promptInfo3.getDescription() : null;
            if (title != null) {
                c.h(builderD, title);
            }
            if (subtitle != null) {
                c.g(builderD, subtitle);
            }
            if (description != null) {
                c.e(builderD, description);
            }
            BiometricViewModel biometricViewModel2 = this.f1741q0;
            CharSequence charSequence = biometricViewModel2.f1781w0;
            if (charSequence != null) {
                negativeButtonText = charSequence;
            } else {
                BiometricPrompt.PromptInfo promptInfo4 = biometricViewModel2.f1777r0;
                if (promptInfo4 != null) {
                    negativeButtonText = promptInfo4.getNegativeButtonText();
                }
            }
            if (!TextUtils.isEmpty(negativeButtonText)) {
                Executor bVar = this.f1741q0.f1775p0;
                if (bVar == null) {
                    bVar = new BiometricViewModel.b();
                }
                BiometricViewModel biometricViewModel3 = this.f1741q0;
                if (biometricViewModel3.v0 == null) {
                    biometricViewModel3.v0 = new BiometricViewModel.c(biometricViewModel3);
                }
                c.f(builderD, negativeButtonText, bVar, biometricViewModel3.v0);
            }
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 29) {
                BiometricPrompt.PromptInfo promptInfo5 = this.f1741q0.f1777r0;
                d.a(builderD, promptInfo5 == null || promptInfo5.isConfirmationRequired());
            }
            int iA = this.f1741q0.a();
            if (i11 >= 30) {
                e.a(builderD, iA);
            } else if (i11 >= 29) {
                d.b(builderD, androidx.biometric.c.b(iA));
            }
            android.hardware.biometrics.BiometricPrompt biometricPromptC = c.c(builderD);
            Context context = getContext();
            android.hardware.biometrics.BiometricPrompt.CryptoObject cryptoObjectB = androidx.biometric.h.b(this.f1741q0.f1778s0);
            BiometricViewModel biometricViewModel4 = this.f1741q0;
            if (biometricViewModel4.f1780u0 == null) {
                biometricViewModel4.f1780u0 = new o.i();
            }
            o.i iVar = biometricViewModel4.f1780u0;
            if (iVar.f85238b == null) {
                iVar.f85237a.getClass();
                iVar.f85238b = o.i.b.b();
            }
            CancellationSignal cancellationSignal = iVar.f85238b;
            f fVar = new f();
            BiometricViewModel biometricViewModel5 = this.f1741q0;
            if (biometricViewModel5.f1779t0 == null) {
                biometricViewModel5.f1779t0 = new androidx.biometric.b(new BiometricViewModel.a(biometricViewModel5));
            }
            androidx.biometric.b bVar2 = biometricViewModel5.f1779t0;
            if (bVar2.f1796a == null) {
                bVar2.f1796a = androidx.biometric.b.a.a(bVar2.f1798c);
            }
            android.hardware.biometrics.BiometricPrompt$AuthenticationCallback biometricPrompt$AuthenticationCallback = bVar2.f1796a;
            try {
                if (cryptoObjectB == null) {
                    c.b(biometricPromptC, cancellationSignal, fVar, biometricPrompt$AuthenticationCallback);
                } else {
                    c.a(biometricPromptC, cryptoObjectB, cancellationSignal, fVar, biometricPrompt$AuthenticationCallback);
                }
                return;
            } catch (NullPointerException unused) {
                g(1, context != null ? context.getString(R.string.default_error_msg) : "");
                return;
            }
        }
        Context applicationContext = requireContext().getApplicationContext();
        FingerprintManagerCompat fingerprintManagerCompatFrom = FingerprintManagerCompat.from(applicationContext);
        if (fingerprintManagerCompatFrom.isHardwareDetected()) {
            i10 = !fingerprintManagerCompatFrom.hasEnrolledFingerprints() ? 11 : 0;
        } else {
            i10 = 12;
        }
        if (i10 != 0) {
            g(i10, androidx.biometric.i.a(applicationContext, i10));
            return;
        }
        if (isAdded()) {
            this.f1741q0.N0 = true;
            String str = Build.MODEL;
            if (Build.VERSION.SDK_INT == 28) {
                int i12 = R.array.hide_fingerprint_instantly_prefixes;
                if (str != null) {
                    String[] stringArray = applicationContext.getResources().getStringArray(i12);
                    int length = stringArray.length;
                    int i13 = 0;
                    while (true) {
                        if (i13 >= length) {
                            this.f1740p0.postDelayed(new o.g(this), 500L);
                            new FingerprintDialogFragment().show(getParentFragmentManager(), "androidx.biometric.FingerprintDialogFragment");
                            break;
                        } else if (str.startsWith(stringArray[i13])) {
                            break;
                        } else {
                            i13++;
                        }
                    }
                } else {
                    this.f1740p0.postDelayed(new o.g(this), 500L);
                    new FingerprintDialogFragment().show(getParentFragmentManager(), "androidx.biometric.FingerprintDialogFragment");
                    break;
                }
            } else {
                this.f1740p0.postDelayed(new o.g(this), 500L);
                new FingerprintDialogFragment().show(getParentFragmentManager(), "androidx.biometric.FingerprintDialogFragment");
                break;
            }
            BiometricViewModel biometricViewModel6 = this.f1741q0;
            biometricViewModel6.f1782x0 = 0;
            BiometricPrompt.CryptoObject cryptoObject2 = biometricViewModel6.f1778s0;
            if (cryptoObject2 != null) {
                Cipher cipher = cryptoObject2.getCipher();
                if (cipher != null) {
                    cryptoObject = new FingerprintManagerCompat.CryptoObject(cipher);
                } else {
                    Signature signature = cryptoObject2.getSignature();
                    if (signature != null) {
                        cryptoObject = new FingerprintManagerCompat.CryptoObject(signature);
                    } else {
                        Mac mac = cryptoObject2.getMac();
                        if (mac != null) {
                            cryptoObject = new FingerprintManagerCompat.CryptoObject(mac);
                        } else if (Build.VERSION.SDK_INT >= 30) {
                            cryptoObject2.getIdentityCredential();
                        }
                    }
                }
            }
            FingerprintManagerCompat.CryptoObject cryptoObject3 = cryptoObject;
            BiometricViewModel biometricViewModel7 = this.f1741q0;
            if (biometricViewModel7.f1780u0 == null) {
                biometricViewModel7.f1780u0 = new o.i();
            }
            o.i iVar2 = biometricViewModel7.f1780u0;
            if (iVar2.f85239c == null) {
                iVar2.f85237a.getClass();
                iVar2.f85239c = new androidx.core.os.CancellationSignal();
            }
            androidx.core.os.CancellationSignal cancellationSignal2 = iVar2.f85239c;
            BiometricViewModel biometricViewModel8 = this.f1741q0;
            if (biometricViewModel8.f1779t0 == null) {
                biometricViewModel8.f1779t0 = new androidx.biometric.b(new BiometricViewModel.a(biometricViewModel8));
            }
            androidx.biometric.b bVar3 = biometricViewModel8.f1779t0;
            if (bVar3.f1797b == null) {
                bVar3.f1797b = new androidx.biometric.a(bVar3);
            }
            try {
                fingerprintManagerCompatFrom.authenticate(cryptoObject3, 0, cancellationSignal2, bVar3.f1797b, null);
            } catch (NullPointerException unused2) {
                g(1, androidx.biometric.i.a(applicationContext, 1));
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i10, int i11, @Nullable Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 1) {
            this.f1741q0.F0 = false;
            if (i11 == -1) {
                i(new BiometricPrompt.AuthenticationResult(null, 1));
            } else {
                g(10, getString(R.string.generic_error_user_canceled));
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (getActivity() == null) {
            return;
        }
        BiometricViewModel biometricViewModel = (BiometricViewModel) new ViewModelProvider(getActivity()).get(BiometricViewModel.class);
        this.f1741q0 = biometricViewModel;
        if (biometricViewModel.I0 == null) {
            biometricViewModel.I0 = new MutableLiveData<>();
        }
        biometricViewModel.I0.observe(this, new androidx.biometric.e(this));
        BiometricViewModel biometricViewModel2 = this.f1741q0;
        if (biometricViewModel2.J0 == null) {
            biometricViewModel2.J0 = new MutableLiveData<>();
        }
        biometricViewModel2.J0.observe(this, new o.b(this));
        BiometricViewModel biometricViewModel3 = this.f1741q0;
        if (biometricViewModel3.K0 == null) {
            biometricViewModel3.K0 = new MutableLiveData<>();
        }
        biometricViewModel3.K0.observe(this, new o.c(this));
        BiometricViewModel biometricViewModel4 = this.f1741q0;
        if (biometricViewModel4.L0 == null) {
            biometricViewModel4.L0 = new MutableLiveData<>();
        }
        biometricViewModel4.L0.observe(this, new o.d(this));
        BiometricViewModel biometricViewModel5 = this.f1741q0;
        if (biometricViewModel5.M0 == null) {
            biometricViewModel5.M0 = new MutableLiveData<>();
        }
        biometricViewModel5.M0.observe(this, new o.e(this));
        BiometricViewModel biometricViewModel6 = this.f1741q0;
        if (biometricViewModel6.O0 == null) {
            biometricViewModel6.O0 = new MutableLiveData<>();
        }
        biometricViewModel6.O0.observe(this, new o.f(this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        if (Build.VERSION.SDK_INT == 29 && androidx.biometric.c.b(this.f1741q0.a())) {
            BiometricViewModel biometricViewModel = this.f1741q0;
            biometricViewModel.H0 = true;
            this.f1740p0.postDelayed(new i(biometricViewModel), 250L);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        if (Build.VERSION.SDK_INT >= 29 || this.f1741q0.F0) {
            return;
        }
        FragmentActivity activity = getActivity();
        if (activity == null || !activity.isChangingConfigurations()) {
            a(0);
        }
    }
}
