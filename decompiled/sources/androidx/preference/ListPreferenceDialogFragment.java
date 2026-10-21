package androidx.preference;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class ListPreferenceDialogFragment extends PreferenceDialogFragment {
    public CharSequence[] E0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public int f22279x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public CharSequence[] f22280y0;

    public class a implements DialogInterface.OnClickListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            ListPreferenceDialogFragment listPreferenceDialogFragment = ListPreferenceDialogFragment.this;
            listPreferenceDialogFragment.f22279x0 = i10;
            listPreferenceDialogFragment.onClick(dialogInterface, -1);
            dialogInterface.dismiss();
        }
    }

    @Deprecated
    public ListPreferenceDialogFragment() {
    }

    @NonNull
    @Deprecated
    public static ListPreferenceDialogFragment newInstance(String str) {
        ListPreferenceDialogFragment listPreferenceDialogFragment = new ListPreferenceDialogFragment();
        Bundle bundle = new Bundle(1);
        bundle.putString("key", str);
        listPreferenceDialogFragment.setArguments(bundle);
        return listPreferenceDialogFragment;
    }

    @Override // androidx.preference.PreferenceDialogFragment, android.app.DialogFragment, android.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f22279x0 = bundle.getInt("ListPreferenceDialogFragment.index", 0);
            this.f22280y0 = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entries");
            this.E0 = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entryValues");
            return;
        }
        ListPreference listPreference = (ListPreference) getPreference();
        if (listPreference.getEntries() == null || listPreference.getEntryValues() == null) {
            throw new IllegalStateException("ListPreference requires an entries array and an entryValues array.");
        }
        this.f22279x0 = listPreference.findIndexOfValue(listPreference.getValue());
        this.f22280y0 = listPreference.getEntries();
        this.E0 = listPreference.getEntryValues();
    }

    @Override // androidx.preference.PreferenceDialogFragment
    @Deprecated
    public void onDialogClosed(boolean z10) {
        int i10;
        ListPreference listPreference = (ListPreference) getPreference();
        if (!z10 || (i10 = this.f22279x0) < 0) {
            return;
        }
        String string = this.E0[i10].toString();
        if (listPreference.callChangeListener(string)) {
            listPreference.setValue(string);
        }
    }

    @Override // androidx.preference.PreferenceDialogFragment
    public void onPrepareDialogBuilder(@NonNull AlertDialog.Builder builder) {
        super.onPrepareDialogBuilder(builder);
        builder.setSingleChoiceItems(this.f22280y0, this.f22279x0, new a());
        builder.setPositiveButton((CharSequence) null, (DialogInterface.OnClickListener) null);
    }

    @Override // androidx.preference.PreferenceDialogFragment, android.app.DialogFragment, android.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("ListPreferenceDialogFragment.index", this.f22279x0);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entries", this.f22280y0);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entryValues", this.E0);
    }
}
