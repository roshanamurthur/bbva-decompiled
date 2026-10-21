package androidx.biometric;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.app.AlertDialog;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;
import o.j;
import o.k;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class FingerprintDialogFragment extends DialogFragment {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Handler f1787p0 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final a f1788q0 = new a();

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public BiometricViewModel f1789r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f1790s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f1791t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @Nullable
    public ImageView f1792u0;

    @Nullable
    public TextView v0;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            FingerprintDialogFragment fingerprintDialogFragment = FingerprintDialogFragment.this;
            Context context = fingerprintDialogFragment.getContext();
            if (context == null) {
                Log.w("FingerprintFragment", "Not resetting the dialog. Context is null.");
            } else {
                fingerprintDialogFragment.f1789r0.d(1);
                fingerprintDialogFragment.f1789r0.c(context.getString(R.string.fingerprint_dialog_touch_sensor));
            }
        }
    }

    public class b implements DialogInterface.OnClickListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            FingerprintDialogFragment.this.f1789r0.e(true);
        }
    }

    @RequiresApi(21)
    public static class c {
        public static void a(@NonNull Drawable drawable) {
            if (drawable instanceof AnimatedVectorDrawable) {
                ((AnimatedVectorDrawable) drawable).start();
            }
        }
    }

    @RequiresApi(26)
    public static class d {
        public static int a() {
            return R.attr.colorError;
        }
    }

    public final int a(int i10) {
        Context context = getContext();
        FragmentActivity activity = getActivity();
        if (context == null || activity == null) {
            Log.w("FingerprintFragment", "Unable to get themed color. Context or activity is null.");
            return 0;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i10, typedValue, true);
        TypedArray typedArrayObtainStyledAttributes = activity.obtainStyledAttributes(typedValue.data, new int[]{i10});
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return color;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(@NonNull DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        BiometricViewModel biometricViewModel = this.f1789r0;
        if (biometricViewModel.O0 == null) {
            biometricViewModel.O0 = new MutableLiveData<>();
        }
        BiometricViewModel.f(biometricViewModel.O0, Boolean.TRUE);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            BiometricViewModel biometricViewModel = (BiometricViewModel) new ViewModelProvider(activity).get(BiometricViewModel.class);
            this.f1789r0 = biometricViewModel;
            if (biometricViewModel.Q0 == null) {
                biometricViewModel.Q0 = new MutableLiveData<>();
            }
            biometricViewModel.Q0.observe(this, new j(this));
            BiometricViewModel biometricViewModel2 = this.f1789r0;
            if (biometricViewModel2.R0 == null) {
                biometricViewModel2.R0 = new MutableLiveData<>();
            }
            biometricViewModel2.R0.observe(this, new k(this));
        }
        if (Build.VERSION.SDK_INT >= 26) {
            this.f1790s0 = a(d.a());
        } else {
            Context context = getContext();
            this.f1790s0 = context != null ? ContextCompat.getColor(context, R.color.biometric_error_color) : 0;
        }
        this.f1791t0 = a(android.R.attr.textColorSecondary);
    }

    @Override // androidx.fragment.app.DialogFragment
    @NonNull
    public Dialog onCreateDialog(@Nullable Bundle bundle) {
        AlertDialog.Builder builder = new AlertDialog.Builder(requireContext());
        BiometricPrompt.PromptInfo promptInfo = this.f1789r0.f1777r0;
        CharSequence negativeButtonText = null;
        builder.setTitle(promptInfo != null ? promptInfo.getTitle() : null);
        View viewInflate = LayoutInflater.from(builder.getContext()).inflate(R.layout.fingerprint_dialog_layout, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(R.id.fingerprint_subtitle);
        if (textView != null) {
            BiometricPrompt.PromptInfo promptInfo2 = this.f1789r0.f1777r0;
            CharSequence subtitle = promptInfo2 != null ? promptInfo2.getSubtitle() : null;
            if (TextUtils.isEmpty(subtitle)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
                textView.setText(subtitle);
            }
        }
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.fingerprint_description);
        if (textView2 != null) {
            BiometricPrompt.PromptInfo promptInfo3 = this.f1789r0.f1777r0;
            CharSequence description = promptInfo3 != null ? promptInfo3.getDescription() : null;
            if (TextUtils.isEmpty(description)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
                textView2.setText(description);
            }
        }
        this.f1792u0 = (ImageView) viewInflate.findViewById(R.id.fingerprint_icon);
        this.v0 = (TextView) viewInflate.findViewById(R.id.fingerprint_error);
        if (androidx.biometric.c.b(this.f1789r0.a())) {
            negativeButtonText = getString(R.string.confirm_device_credential_password);
        } else {
            BiometricViewModel biometricViewModel = this.f1789r0;
            CharSequence charSequence = biometricViewModel.f1781w0;
            if (charSequence != null) {
                negativeButtonText = charSequence;
            } else {
                BiometricPrompt.PromptInfo promptInfo4 = biometricViewModel.f1777r0;
                if (promptInfo4 != null) {
                    negativeButtonText = promptInfo4.getNegativeButtonText();
                }
            }
        }
        builder.setNegativeButton(negativeButtonText, new b());
        builder.setView(viewInflate);
        AlertDialog alertDialogCreate = builder.create();
        alertDialogCreate.setCanceledOnTouchOutside(false);
        return alertDialogCreate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.f1787p0.removeCallbacksAndMessages(null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        BiometricViewModel biometricViewModel = this.f1789r0;
        biometricViewModel.P0 = 0;
        biometricViewModel.d(1);
        this.f1789r0.c(getString(R.string.fingerprint_dialog_touch_sensor));
    }
}
