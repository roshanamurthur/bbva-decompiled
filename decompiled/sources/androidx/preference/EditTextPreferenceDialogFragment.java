package androidx.preference;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class EditTextPreferenceDialogFragment extends PreferenceDialogFragment {

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public EditText f22268x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public CharSequence f22269y0;

    @Deprecated
    public EditTextPreferenceDialogFragment() {
    }

    @NonNull
    @Deprecated
    public static EditTextPreferenceDialogFragment newInstance(String str) {
        EditTextPreferenceDialogFragment editTextPreferenceDialogFragment = new EditTextPreferenceDialogFragment();
        Bundle bundle = new Bundle(1);
        bundle.putString("key", str);
        editTextPreferenceDialogFragment.setArguments(bundle);
        return editTextPreferenceDialogFragment;
    }

    @Override // androidx.preference.PreferenceDialogFragment
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean needInputMethod() {
        return true;
    }

    @Override // androidx.preference.PreferenceDialogFragment
    public void onBindDialogView(@NonNull View view) {
        super.onBindDialogView(view);
        EditText editText = (EditText) view.findViewById(android.R.id.edit);
        this.f22268x0 = editText;
        editText.requestFocus();
        EditText editText2 = this.f22268x0;
        if (editText2 == null) {
            throw new IllegalStateException("Dialog view must contain an EditText with id @android:id/edit");
        }
        editText2.setText(this.f22269y0);
        EditText editText3 = this.f22268x0;
        editText3.setSelection(editText3.getText().length());
    }

    @Override // androidx.preference.PreferenceDialogFragment, android.app.DialogFragment, android.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            this.f22269y0 = ((EditTextPreference) getPreference()).getText();
        } else {
            this.f22269y0 = bundle.getCharSequence("EditTextPreferenceDialogFragment.text");
        }
    }

    @Override // androidx.preference.PreferenceDialogFragment
    @Deprecated
    public void onDialogClosed(boolean z10) {
        if (z10) {
            String string = this.f22268x0.getText().toString();
            if (((EditTextPreference) getPreference()).callChangeListener(string)) {
                ((EditTextPreference) getPreference()).setText(string);
            }
        }
    }

    @Override // androidx.preference.PreferenceDialogFragment, android.app.DialogFragment, android.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("EditTextPreferenceDialogFragment.text", this.f22269y0);
    }
}
