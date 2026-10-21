package androidx.preference;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.TextView;
import androidx.activity.result.ActivityResultCaller;
import androidx.annotation.DoNotInline;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogFragment;

/* JADX INFO: loaded from: classes2.dex */
public abstract class PreferenceDialogFragmentCompat extends DialogFragment implements DialogInterface.OnClickListener {
    protected static final String ARG_KEY = "key";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public DialogPreference f22323p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public CharSequence f22324q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public CharSequence f22325r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public CharSequence f22326s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public CharSequence f22327t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @LayoutRes
    public int f22328u0;
    public BitmapDrawable v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public int f22329w0;

    @RequiresApi(30)
    public static class a {
        @DoNotInline
        public static void a(@NonNull Window window) {
            window.getDecorView().getWindowInsetsController().show(WindowInsets.Type.ime());
        }
    }

    public DialogPreference getPreference() {
        if (this.f22323p0 == null) {
            this.f22323p0 = (DialogPreference) ((DialogPreference.TargetFragment) getTargetFragment()).findPreference(requireArguments().getString("key"));
        }
        return this.f22323p0;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean needInputMethod() {
        return false;
    }

    public void onBindDialogView(@NonNull View view) {
        int i10;
        View viewFindViewById = view.findViewById(android.R.id.message);
        if (viewFindViewById != null) {
            CharSequence charSequence = this.f22327t0;
            if (TextUtils.isEmpty(charSequence)) {
                i10 = 8;
            } else {
                if (viewFindViewById instanceof TextView) {
                    ((TextView) viewFindViewById).setText(charSequence);
                }
                i10 = 0;
            }
            if (viewFindViewById.getVisibility() != i10) {
                viewFindViewById.setVisibility(i10);
            }
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(@NonNull DialogInterface dialogInterface, int i10) {
        this.f22329w0 = i10;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        ActivityResultCaller targetFragment = getTargetFragment();
        if (!(targetFragment instanceof DialogPreference.TargetFragment)) {
            throw new IllegalStateException("Target fragment must implement TargetFragment interface");
        }
        DialogPreference.TargetFragment targetFragment2 = (DialogPreference.TargetFragment) targetFragment;
        String string = requireArguments().getString("key");
        if (bundle != null) {
            this.f22324q0 = bundle.getCharSequence("PreferenceDialogFragment.title");
            this.f22325r0 = bundle.getCharSequence("PreferenceDialogFragment.positiveText");
            this.f22326s0 = bundle.getCharSequence("PreferenceDialogFragment.negativeText");
            this.f22327t0 = bundle.getCharSequence("PreferenceDialogFragment.message");
            this.f22328u0 = bundle.getInt("PreferenceDialogFragment.layout", 0);
            Bitmap bitmap = (Bitmap) bundle.getParcelable("PreferenceDialogFragment.icon");
            if (bitmap != null) {
                this.v0 = new BitmapDrawable(getResources(), bitmap);
                return;
            }
            return;
        }
        DialogPreference dialogPreference = (DialogPreference) targetFragment2.findPreference(string);
        this.f22323p0 = dialogPreference;
        this.f22324q0 = dialogPreference.getDialogTitle();
        this.f22325r0 = this.f22323p0.getPositiveButtonText();
        this.f22326s0 = this.f22323p0.getNegativeButtonText();
        this.f22327t0 = this.f22323p0.getDialogMessage();
        this.f22328u0 = this.f22323p0.getDialogLayoutResource();
        Drawable dialogIcon = this.f22323p0.getDialogIcon();
        if (dialogIcon == null || (dialogIcon instanceof BitmapDrawable)) {
            this.v0 = (BitmapDrawable) dialogIcon;
            return;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dialogIcon.getIntrinsicWidth(), dialogIcon.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        dialogIcon.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        dialogIcon.draw(canvas);
        this.v0 = new BitmapDrawable(getResources(), bitmapCreateBitmap);
    }

    @Override // androidx.fragment.app.DialogFragment
    @NonNull
    public Dialog onCreateDialog(@Nullable Bundle bundle) {
        this.f22329w0 = -2;
        AlertDialog.Builder negativeButton = new AlertDialog.Builder(requireContext()).setTitle(this.f22324q0).setIcon(this.v0).setPositiveButton(this.f22325r0, this).setNegativeButton(this.f22326s0, this);
        View viewOnCreateDialogView = onCreateDialogView(requireContext());
        if (viewOnCreateDialogView != null) {
            onBindDialogView(viewOnCreateDialogView);
            negativeButton.setView(viewOnCreateDialogView);
        } else {
            negativeButton.setMessage(this.f22327t0);
        }
        onPrepareDialogBuilder(negativeButton);
        AlertDialog alertDialogCreate = negativeButton.create();
        if (needInputMethod()) {
            Window window = alertDialogCreate.getWindow();
            if (Build.VERSION.SDK_INT >= 30) {
                a.a(window);
            } else {
                scheduleShowSoftInput();
            }
        }
        return alertDialogCreate;
    }

    @Nullable
    public View onCreateDialogView(@NonNull Context context) {
        int i10 = this.f22328u0;
        if (i10 == 0) {
            return null;
        }
        return getLayoutInflater().inflate(i10, (ViewGroup) null);
    }

    public abstract void onDialogClosed(boolean z10);

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NonNull DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        onDialogClosed(this.f22329w0 == -1);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("PreferenceDialogFragment.title", this.f22324q0);
        bundle.putCharSequence("PreferenceDialogFragment.positiveText", this.f22325r0);
        bundle.putCharSequence("PreferenceDialogFragment.negativeText", this.f22326s0);
        bundle.putCharSequence("PreferenceDialogFragment.message", this.f22327t0);
        bundle.putInt("PreferenceDialogFragment.layout", this.f22328u0);
        BitmapDrawable bitmapDrawable = this.v0;
        if (bitmapDrawable != null) {
            bundle.putParcelable("PreferenceDialogFragment.icon", bitmapDrawable.getBitmap());
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void scheduleShowSoftInput() {
    }

    public void onPrepareDialogBuilder(@NonNull AlertDialog.Builder builder) {
    }
}
