package androidx.preference;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public class DropDownPreference extends ListPreference {

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    public final Context f22260w1;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public final ArrayAdapter f22261x1;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public Spinner f22262y1;

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    public final a f22263z1;

    public DropDownPreference(@NonNull Context context) {
        this(context, null);
    }

    @NonNull
    public ArrayAdapter createAdapter() {
        return new ArrayAdapter(this.f22260w1, android.R.layout.simple_spinner_dropdown_item);
    }

    public final void f() {
        ArrayAdapter arrayAdapter = this.f22261x1;
        arrayAdapter.clear();
        if (getEntries() != null) {
            for (CharSequence charSequence : getEntries()) {
                arrayAdapter.add(charSequence.toString());
            }
        }
    }

    @Override // androidx.preference.Preference
    public void notifyChanged() {
        super.notifyChanged();
        ArrayAdapter arrayAdapter = this.f22261x1;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }

    @Override // androidx.preference.Preference
    public void onBindViewHolder(@NonNull PreferenceViewHolder preferenceViewHolder) {
        int length;
        Spinner spinner = (Spinner) preferenceViewHolder.itemView.findViewById(R.id.spinner);
        this.f22262y1 = spinner;
        spinner.setAdapter((SpinnerAdapter) this.f22261x1);
        this.f22262y1.setOnItemSelectedListener(this.f22263z1);
        Spinner spinner2 = this.f22262y1;
        String value = getValue();
        CharSequence[] entryValues = getEntryValues();
        if (value == null || entryValues == null) {
            length = -1;
        } else {
            length = entryValues.length - 1;
            while (length >= 0) {
                if (!TextUtils.equals(entryValues[length].toString(), value)) {
                    length--;
                }
            }
            length = -1;
        }
        spinner2.setSelection(length);
        super.onBindViewHolder(preferenceViewHolder);
    }

    @Override // androidx.preference.DialogPreference, androidx.preference.Preference
    public void onClick() {
        this.f22262y1.performClick();
    }

    @Override // androidx.preference.ListPreference
    public void setEntries(@NonNull CharSequence[] charSequenceArr) {
        super.setEntries(charSequenceArr);
        f();
    }

    @Override // androidx.preference.ListPreference
    public void setValueIndex(int i10) {
        setValue(getEntryValues()[i10].toString());
    }

    public DropDownPreference(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.dropdownPreferenceStyle);
    }

    public DropDownPreference(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public DropDownPreference(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f22263z1 = new a();
        this.f22260w1 = context;
        this.f22261x1 = createAdapter();
        f();
    }

    public class a implements AdapterView.OnItemSelectedListener {
        public a() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
            if (i10 >= 0) {
                DropDownPreference dropDownPreference = DropDownPreference.this;
                String string = dropDownPreference.getEntryValues()[i10].toString();
                if (string.equals(dropDownPreference.getValue()) || !dropDownPreference.callChangeListener(string)) {
                    return;
                }
                dropDownPreference.setValue(string);
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onNothingSelected(AdapterView<?> adapterView) {
        }
    }
}
