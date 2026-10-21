package androidx.preference;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;

/* JADX INFO: loaded from: classes2.dex */
public class ListPreferenceDialogFragmentCompat extends PreferenceDialogFragmentCompat {
    public CharSequence[] E0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public int f22282x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public CharSequence[] f22283y0;

    public class a implements DialogInterface.OnClickListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            ListPreferenceDialogFragmentCompat listPreferenceDialogFragmentCompat = ListPreferenceDialogFragmentCompat.this;
            listPreferenceDialogFragmentCompat.f22282x0 = i10;
            listPreferenceDialogFragmentCompat.onClick(dialogInterface, -1);
            dialogInterface.dismiss();
        }
    }

    @NonNull
    public static ListPreferenceDialogFragmentCompat newInstance(String str) {
        ListPreferenceDialogFragmentCompat listPreferenceDialogFragmentCompat = new ListPreferenceDialogFragmentCompat();
        Bundle bundle = new Bundle(1);
        bundle.putString("key", str);
        listPreferenceDialogFragmentCompat.setArguments(bundle);
        return listPreferenceDialogFragmentCompat;
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f22282x0 = bundle.getInt("ListPreferenceDialogFragment.index", 0);
            this.f22283y0 = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entries");
            this.E0 = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entryValues");
            return;
        }
        ListPreference listPreference = (ListPreference) getPreference();
        if (listPreference.getEntries() == null || listPreference.getEntryValues() == null) {
            throw new IllegalStateException("ListPreference requires an entries array and an entryValues array.");
        }
        this.f22282x0 = listPreference.findIndexOfValue(listPreference.getValue());
        this.f22283y0 = listPreference.getEntries();
        this.E0 = listPreference.getEntryValues();
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    public void onDialogClosed(boolean z10) {
        int i10;
        if (!z10 || (i10 = this.f22282x0) < 0) {
            return;
        }
        String string = this.E0[i10].toString();
        ListPreference listPreference = (ListPreference) getPreference();
        if (listPreference.callChangeListener(string)) {
            listPreference.setValue(string);
        }
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    public void onPrepareDialogBuilder(@NonNull AlertDialog.Builder builder) {
        super.onPrepareDialogBuilder(builder);
        builder.setSingleChoiceItems(this.f22283y0, this.f22282x0, new a());
        builder.setPositiveButton((CharSequence) null, (DialogInterface.OnClickListener) null);
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("ListPreferenceDialogFragment.index", this.f22282x0);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entries", this.f22283y0);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entryValues", this.E0);
    }
}
