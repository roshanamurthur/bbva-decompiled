package com.bbva.touchid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bbva.touchid.R;

/* JADX INFO: loaded from: classes.dex */
public final class FingerprintDialogBackupBinding implements ViewBinding {

    @NonNull
    public final RelativeLayout backupContainer;

    @NonNull
    public final FrameLayout description;

    @NonNull
    public final TextView newFingerprintEnrolledDescription;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f36935p0;

    @NonNull
    public final EditText password;

    @NonNull
    public final TextView passwordDescription;

    @NonNull
    public final CheckBox useFingerprintInFutureCheck;

    public FingerprintDialogBackupBinding(@NonNull RelativeLayout relativeLayout, @NonNull RelativeLayout relativeLayout2, @NonNull FrameLayout frameLayout, @NonNull TextView textView, @NonNull EditText editText, @NonNull TextView textView2, @NonNull CheckBox checkBox) {
        this.f36935p0 = relativeLayout;
        this.backupContainer = relativeLayout2;
        this.description = frameLayout;
        this.newFingerprintEnrolledDescription = textView;
        this.password = editText;
        this.passwordDescription = textView2;
        this.useFingerprintInFutureCheck = checkBox;
    }

    @NonNull
    public static FingerprintDialogBackupBinding bind(@NonNull View view) {
        RelativeLayout relativeLayout = (RelativeLayout) view;
        int i10 = R.id.description;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i10);
        if (frameLayout != null) {
            i10 = R.id.new_fingerprint_enrolled_description;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i10);
            if (textView != null) {
                i10 = R.id.password;
                EditText editText = (EditText) ViewBindings.findChildViewById(view, i10);
                if (editText != null) {
                    i10 = R.id.password_description;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i10);
                    if (textView2 != null) {
                        i10 = R.id.use_fingerprint_in_future_check;
                        CheckBox checkBox = (CheckBox) ViewBindings.findChildViewById(view, i10);
                        if (checkBox != null) {
                            return new FingerprintDialogBackupBinding(relativeLayout, relativeLayout, frameLayout, textView, editText, textView2, checkBox);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static FingerprintDialogBackupBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FingerprintDialogBackupBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.fingerprint_dialog_backup, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.f36935p0;
    }
}
