package androidx.preference;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class MultiSelectListPreferenceDialogFragment extends PreferenceDialogFragment {
    public CharSequence[] E0;
    public CharSequence[] F0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final HashSet f22288x0 = new HashSet();

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public boolean f22289y0;

    public class a implements DialogInterface.OnMultiChoiceClickListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnMultiChoiceClickListener
        public final void onClick(DialogInterface dialogInterface, int i10, boolean z10) {
            MultiSelectListPreferenceDialogFragment multiSelectListPreferenceDialogFragment = MultiSelectListPreferenceDialogFragment.this;
            if (z10) {
                multiSelectListPreferenceDialogFragment.f22289y0 = multiSelectListPreferenceDialogFragment.f22288x0.add(multiSelectListPreferenceDialogFragment.F0[i10].toString()) | multiSelectListPreferenceDialogFragment.f22289y0;
            } else {
                multiSelectListPreferenceDialogFragment.f22289y0 = multiSelectListPreferenceDialogFragment.f22288x0.remove(multiSelectListPreferenceDialogFragment.F0[i10].toString()) | multiSelectListPreferenceDialogFragment.f22289y0;
            }
        }
    }

    @Deprecated
    public MultiSelectListPreferenceDialogFragment() {
    }

    @NonNull
    @Deprecated
    public static MultiSelectListPreferenceDialogFragment newInstance(String str) {
        MultiSelectListPreferenceDialogFragment multiSelectListPreferenceDialogFragment = new MultiSelectListPreferenceDialogFragment();
        Bundle bundle = new Bundle(1);
        bundle.putString("key", str);
        multiSelectListPreferenceDialogFragment.setArguments(bundle);
        return multiSelectListPreferenceDialogFragment;
    }

    @Override // androidx.preference.PreferenceDialogFragment, android.app.DialogFragment, android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        HashSet hashSet = this.f22288x0;
        if (bundle != null) {
            hashSet.clear();
            hashSet.addAll(bundle.getStringArrayList("MultiSelectListPreferenceDialogFragment.values"));
            this.f22289y0 = bundle.getBoolean("MultiSelectListPreferenceDialogFragment.changed", false);
            this.E0 = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragment.entries");
            this.F0 = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragment.entryValues");
            return;
        }
        MultiSelectListPreference multiSelectListPreference = (MultiSelectListPreference) getPreference();
        if (multiSelectListPreference.getEntries() == null || multiSelectListPreference.getEntryValues() == null) {
            throw new IllegalStateException("MultiSelectListPreference requires an entries array and an entryValues array.");
        }
        hashSet.clear();
        hashSet.addAll(multiSelectListPreference.getValues());
        this.f22289y0 = false;
        this.E0 = multiSelectListPreference.getEntries();
        this.F0 = multiSelectListPreference.getEntryValues();
    }

    @Override // androidx.preference.PreferenceDialogFragment
    @Deprecated
    public void onDialogClosed(boolean z10) {
        MultiSelectListPreference multiSelectListPreference = (MultiSelectListPreference) getPreference();
        if (z10 && this.f22289y0) {
            HashSet hashSet = this.f22288x0;
            if (multiSelectListPreference.callChangeListener(hashSet)) {
                multiSelectListPreference.setValues(hashSet);
            }
        }
        this.f22289y0 = false;
    }

    @Override // androidx.preference.PreferenceDialogFragment
    public void onPrepareDialogBuilder(@NonNull AlertDialog.Builder builder) {
        super.onPrepareDialogBuilder(builder);
        int length = this.F0.length;
        boolean[] zArr = new boolean[length];
        for (int i10 = 0; i10 < length; i10++) {
            zArr[i10] = this.f22288x0.contains(this.F0[i10].toString());
        }
        builder.setMultiChoiceItems(this.E0, zArr, new a());
    }

    @Override // androidx.preference.PreferenceDialogFragment, android.app.DialogFragment, android.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putStringArrayList("MultiSelectListPreferenceDialogFragment.values", new ArrayList<>(this.f22288x0));
        bundle.putBoolean("MultiSelectListPreferenceDialogFragment.changed", this.f22289y0);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragment.entries", this.E0);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragment.entryValues", this.F0);
    }
}
