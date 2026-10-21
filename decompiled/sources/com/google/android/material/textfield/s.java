package com.google.android.material.textfield;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import com.google.android.material.R;

/* JADX INFO: compiled from: PasswordToggleEndIconDelegate.java */
/* JADX INFO: loaded from: classes10.dex */
public final class s extends n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f45694e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public EditText f45695f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p5.b f45696g;

    public s(@NonNull m mVar, @DrawableRes int i10) {
        super(mVar);
        this.f45694e = R.drawable.design_password_eye;
        this.f45696g = new p5.b(this, 2);
        if (i10 != 0) {
            this.f45694e = i10;
        }
    }

    @Override // com.google.android.material.textfield.n
    public final void b() {
        q();
    }

    @Override // com.google.android.material.textfield.n
    @StringRes
    public final int c() {
        return R.string.password_toggle_content_description;
    }

    @Override // com.google.android.material.textfield.n
    @DrawableRes
    public final int d() {
        return this.f45694e;
    }

    @Override // com.google.android.material.textfield.n
    public final View.OnClickListener f() {
        return this.f45696g;
    }

    @Override // com.google.android.material.textfield.n
    public final boolean k() {
        return true;
    }

    @Override // com.google.android.material.textfield.n
    public final boolean l() {
        EditText editText = this.f45695f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // com.google.android.material.textfield.n
    public final void m(@Nullable EditText editText) {
        this.f45695f = editText;
        q();
    }

    @Override // com.google.android.material.textfield.n
    public final void r() {
        EditText editText = this.f45695f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f45695f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // com.google.android.material.textfield.n
    public final void s() {
        EditText editText = this.f45695f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
