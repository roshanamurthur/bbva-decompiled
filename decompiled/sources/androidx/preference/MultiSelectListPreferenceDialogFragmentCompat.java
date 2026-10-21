package androidx.preference;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public class MultiSelectListPreferenceDialogFragmentCompat extends PreferenceDialogFragmentCompat {
    public CharSequence[] E0;
    public CharSequence[] F0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final HashSet f22291x0 = new HashSet();

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public boolean f22292y0;

    public class a implements DialogInterface.OnMultiChoiceClickListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnMultiChoiceClickListener
        public final void onClick(DialogInterface dialogInterface, int i10, boolean z10) {
            MultiSelectListPreferenceDialogFragmentCompat multiSelectListPreferenceDialogFragmentCompat = MultiSelectListPreferenceDialogFragmentCompat.this;
            if (z10) {
                multiSelectListPreferenceDialogFragmentCompat.f22292y0 = multiSelectListPreferenceDialogFragmentCompat.f22291x0.add(multiSelectListPreferenceDialogFragmentCompat.F0[i10].toString()) | multiSelectListPreferenceDialogFragmentCompat.f22292y0;
            } else {
                multiSelectListPreferenceDialogFragmentCompat.f22292y0 = multiSelectListPreferenceDialogFragmentCompat.f22291x0.remove(multiSelectListPreferenceDialogFragmentCompat.F0[i10].toString()) | multiSelectListPreferenceDialogFragmentCompat.f22292y0;
            }
        }
    }

    @NonNull
    public static MultiSelectListPreferenceDialogFragmentCompat newInstance(String str) {
        MultiSelectListPreferenceDialogFragmentCompat multiSelectListPreferenceDialogFragmentCompat = new MultiSelectListPreferenceDialogFragmentCompat();
        Bundle bundle = new Bundle(1);
        bundle.putString("key", str);
        multiSelectListPreferenceDialogFragmentCompat.setArguments(bundle);
        return multiSelectListPreferenceDialogFragmentCompat;
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        HashSet hashSet = this.f22291x0;
        if (bundle != null) {
            hashSet.clear();
            hashSet.addAll(bundle.getStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values"));
            this.f22292y0 = bundle.getBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", false);
            this.E0 = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries");
            this.F0 = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues");
            return;
        }
        MultiSelectListPreference multiSelectListPreference = (MultiSelectListPreference) getPreference();
        if (multiSelectListPreference.getEntries() == null || multiSelectListPreference.getEntryValues() == null) {
            throw new IllegalStateException("MultiSelectListPreference requires an entries array and an entryValues array.");
        }
        hashSet.clear();
        hashSet.addAll(multiSelectListPreference.getValues());
        this.f22292y0 = false;
        this.E0 = multiSelectListPreference.getEntries();
        this.F0 = multiSelectListPreference.getEntryValues();
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    public void onDialogClosed(boolean z10) {
        if (z10 && this.f22292y0) {
            MultiSelectListPreference multiSelectListPreference = (MultiSelectListPreference) getPreference();
            HashSet hashSet = this.f22291x0;
            if (multiSelectListPreference.callChangeListener(hashSet)) {
                multiSelectListPreference.setValues(hashSet);
            }
        }
        this.f22292y0 = false;
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    public void onPrepareDialogBuilder(@NonNull AlertDialog.Builder builder) {
        super.onPrepareDialogBuilder(builder);
        int length = this.F0.length;
        boolean[] zArr = new boolean[length];
        for (int i10 = 0; i10 < length; i10++) {
            zArr[i10] = this.f22291x0.contains(this.F0[i10].toString());
        }
        builder.setMultiChoiceItems(this.E0, zArr, new a());
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values", new ArrayList<>(this.f22291x0));
        bundle.putBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", this.f22292y0);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries", this.E0);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues", this.F0);
    }
}
