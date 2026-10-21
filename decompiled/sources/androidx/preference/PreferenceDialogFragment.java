package androidx.preference;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.TextView;
import androidx.annotation.DoNotInline;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public abstract class PreferenceDialogFragment extends DialogFragment implements DialogInterface.OnClickListener {

    @Deprecated
    protected static final String ARG_KEY = "key";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public DialogPreference f22316p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public CharSequence f22317q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public CharSequence f22318r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public CharSequence f22319s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public CharSequence f22320t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @LayoutRes
    public int f22321u0;
    public BitmapDrawable v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public int f22322w0;

    @RequiresApi(30)
    public static class a {
        @DoNotInline
        public static void a(@NonNull Window window) {
            window.getDecorView().getWindowInsetsController().show(WindowInsets.Type.ime());
        }
    }

    @Deprecated
    public PreferenceDialogFragment() {
    }

    @Deprecated
    public DialogPreference getPreference() {
        if (this.f22316p0 == null) {
            this.f22316p0 = (DialogPreference) ((DialogPreference.TargetFragment) getTargetFragment()).findPreference(getArguments().getString("key"));
        }
        return this.f22316p0;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean needInputMethod() {
        return false;
    }

    @Deprecated
    public void onBindDialogView(@NonNull View view) {
        int i10;
        View viewFindViewById = view.findViewById(android.R.id.message);
        if (viewFindViewById != null) {
            CharSequence charSequence = this.f22320t0;
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
    @Deprecated
    public void onClick(@NonNull DialogInterface dialogInterface, int i10) {
        this.f22322w0 = i10;
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        ComponentCallbacks2 targetFragment = getTargetFragment();
        if (!(targetFragment instanceof DialogPreference.TargetFragment)) {
            throw new IllegalStateException("Target fragment must implement TargetFragment interface");
        }
        DialogPreference.TargetFragment targetFragment2 = (DialogPreference.TargetFragment) targetFragment;
        String string = getArguments().getString("key");
        if (bundle != null) {
            this.f22317q0 = bundle.getCharSequence("PreferenceDialogFragment.title");
            this.f22318r0 = bundle.getCharSequence("PreferenceDialogFragment.positiveText");
            this.f22319s0 = bundle.getCharSequence("PreferenceDialogFragment.negativeText");
            this.f22320t0 = bundle.getCharSequence("PreferenceDialogFragment.message");
            this.f22321u0 = bundle.getInt("PreferenceDialogFragment.layout", 0);
            Bitmap bitmap = (Bitmap) bundle.getParcelable("PreferenceDialogFragment.icon");
            if (bitmap != null) {
                this.v0 = new BitmapDrawable(getResources(), bitmap);
                return;
            }
            return;
        }
        DialogPreference dialogPreference = (DialogPreference) targetFragment2.findPreference(string);
        this.f22316p0 = dialogPreference;
        this.f22317q0 = dialogPreference.getDialogTitle();
        this.f22318r0 = this.f22316p0.getPositiveButtonText();
        this.f22319s0 = this.f22316p0.getNegativeButtonText();
        this.f22320t0 = this.f22316p0.getDialogMessage();
        this.f22321u0 = this.f22316p0.getDialogLayoutResource();
        Drawable dialogIcon = this.f22316p0.getDialogIcon();
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

    @Override // android.app.DialogFragment
    @NonNull
    public Dialog onCreateDialog(@Nullable Bundle bundle) {
        Activity activity = getActivity();
        this.f22322w0 = -2;
        AlertDialog.Builder negativeButton = new AlertDialog.Builder(activity).setTitle(this.f22317q0).setIcon(this.v0).setPositiveButton(this.f22318r0, this).setNegativeButton(this.f22319s0, this);
        View viewOnCreateDialogView = onCreateDialogView(activity);
        if (viewOnCreateDialogView != null) {
            onBindDialogView(viewOnCreateDialogView);
            negativeButton.setView(viewOnCreateDialogView);
        } else {
            negativeButton.setMessage(this.f22320t0);
        }
        onPrepareDialogBuilder(negativeButton);
        AlertDialog alertDialogCreate = negativeButton.create();
        if (needInputMethod()) {
            Window window = alertDialogCreate.getWindow();
            if (Build.VERSION.SDK_INT >= 30) {
                a.a(window);
            } else {
                window.setSoftInputMode(5);
            }
        }
        return alertDialogCreate;
    }

    @Nullable
    @Deprecated
    public View onCreateDialogView(@NonNull Context context) {
        int i10 = this.f22321u0;
        if (i10 == 0) {
            return null;
        }
        return LayoutInflater.from(context).inflate(i10, (ViewGroup) null);
    }

    @Deprecated
    public abstract void onDialogClosed(boolean z10);

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NonNull DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        onDialogClosed(this.f22322w0 == -1);
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("PreferenceDialogFragment.title", this.f22317q0);
        bundle.putCharSequence("PreferenceDialogFragment.positiveText", this.f22318r0);
        bundle.putCharSequence("PreferenceDialogFragment.negativeText", this.f22319s0);
        bundle.putCharSequence("PreferenceDialogFragment.message", this.f22320t0);
        bundle.putInt("PreferenceDialogFragment.layout", this.f22321u0);
        BitmapDrawable bitmapDrawable = this.v0;
        if (bitmapDrawable != null) {
            bundle.putParcelable("PreferenceDialogFragment.icon", bitmapDrawable.getBitmap());
        }
    }

    @Deprecated
    public void onPrepareDialogBuilder(@NonNull AlertDialog.Builder builder) {
    }
}
