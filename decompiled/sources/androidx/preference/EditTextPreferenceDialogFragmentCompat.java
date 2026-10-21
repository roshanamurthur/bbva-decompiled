package androidx.preference;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.bbva.nativesettings.common.Constants;

/* JADX INFO: loaded from: classes2.dex */
public class EditTextPreferenceDialogFragmentCompat extends PreferenceDialogFragmentCompat {
    public final a E0 = new a();
    public long F0 = -1;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public EditText f22270x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public CharSequence f22271y0;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            EditTextPreferenceDialogFragmentCompat.this.c();
        }
    }

    @NonNull
    public static EditTextPreferenceDialogFragmentCompat newInstance(String str) {
        EditTextPreferenceDialogFragmentCompat editTextPreferenceDialogFragmentCompat = new EditTextPreferenceDialogFragmentCompat();
        Bundle bundle = new Bundle(1);
        bundle.putString("key", str);
        editTextPreferenceDialogFragmentCompat.setArguments(bundle);
        return editTextPreferenceDialogFragmentCompat;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final void c() {
        long j10 = this.F0;
        if (j10 == -1 || j10 + 1000 <= SystemClock.currentThreadTimeMillis()) {
            return;
        }
        EditText editText = this.f22270x0;
        if (editText == null || !editText.isFocused()) {
            this.F0 = -1L;
            return;
        }
        if (((InputMethodManager) this.f22270x0.getContext().getSystemService(Constants.INPUT_METHOD)).showSoftInput(this.f22270x0, 0)) {
            this.F0 = -1L;
            return;
        }
        EditText editText2 = this.f22270x0;
        a aVar = this.E0;
        editText2.removeCallbacks(aVar);
        this.f22270x0.postDelayed(aVar, 50L);
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean needInputMethod() {
        return true;
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    public void onBindDialogView(@NonNull View view) {
        super.onBindDialogView(view);
        EditText editText = (EditText) view.findViewById(android.R.id.edit);
        this.f22270x0 = editText;
        if (editText == null) {
            throw new IllegalStateException("Dialog view must contain an EditText with id @android:id/edit");
        }
        editText.requestFocus();
        this.f22270x0.setText(this.f22271y0);
        EditText editText2 = this.f22270x0;
        editText2.setSelection(editText2.getText().length());
        if (((EditTextPreference) getPreference()).f22265s1 != null) {
            ((EditTextPreference) getPreference()).f22265s1.onBindEditText(this.f22270x0);
        }
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            this.f22271y0 = ((EditTextPreference) getPreference()).getText();
        } else {
            this.f22271y0 = bundle.getCharSequence("EditTextPreferenceDialogFragment.text");
        }
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    public void onDialogClosed(boolean z10) {
        if (z10) {
            String string = this.f22270x0.getText().toString();
            EditTextPreference editTextPreference = (EditTextPreference) getPreference();
            if (editTextPreference.callChangeListener(string)) {
                editTextPreference.setText(string);
            }
        }
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("EditTextPreferenceDialogFragment.text", this.f22271y0);
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void scheduleShowSoftInput() {
        this.F0 = SystemClock.currentThreadTimeMillis();
        c();
    }
}
