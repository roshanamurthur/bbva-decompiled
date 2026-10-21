package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import androidx.annotation.ArrayRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.res.TypedArrayUtils;

/* JADX INFO: loaded from: classes2.dex */
public class ListPreference extends DialogPreference {
    public CharSequence[] r1;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public CharSequence[] f22273s1;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public String f22274t1;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public String f22275u1;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    public boolean f22276v1;

    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public String f22277p0;

        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f22277p0 = parcel.readString();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(@NonNull Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeString(this.f22277p0);
        }
    }

    public static final class SimpleSummaryProvider implements Preference.SummaryProvider<ListPreference> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static SimpleSummaryProvider f22278a;

        @NonNull
        public static SimpleSummaryProvider getInstance() {
            if (f22278a == null) {
                f22278a = new SimpleSummaryProvider();
            }
            return f22278a;
        }

        @Override // androidx.preference.Preference.SummaryProvider
        @Nullable
        public CharSequence provideSummary(@NonNull ListPreference listPreference) {
            return TextUtils.isEmpty(listPreference.getEntry()) ? listPreference.getContext().getString(R.string.not_set) : listPreference.getEntry();
        }
    }

    public ListPreference(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ListPreference, i10, i11);
        this.r1 = TypedArrayUtils.getTextArray(typedArrayObtainStyledAttributes, R.styleable.ListPreference_entries, R.styleable.ListPreference_android_entries);
        this.f22273s1 = TypedArrayUtils.getTextArray(typedArrayObtainStyledAttributes, R.styleable.ListPreference_entryValues, R.styleable.ListPreference_android_entryValues);
        int i12 = R.styleable.ListPreference_useSimpleSummaryProvider;
        if (TypedArrayUtils.getBoolean(typedArrayObtainStyledAttributes, i12, i12, false)) {
            setSummaryProvider(SimpleSummaryProvider.getInstance());
        }
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, R.styleable.Preference, i10, i11);
        this.f22275u1 = TypedArrayUtils.getString(typedArrayObtainStyledAttributes2, R.styleable.Preference_summary, R.styleable.Preference_android_summary);
        typedArrayObtainStyledAttributes2.recycle();
    }

    public int findIndexOfValue(String str) {
        CharSequence[] charSequenceArr;
        if (str == null || (charSequenceArr = this.f22273s1) == null) {
            return -1;
        }
        for (int length = charSequenceArr.length - 1; length >= 0; length--) {
            if (TextUtils.equals(this.f22273s1[length].toString(), str)) {
                return length;
            }
        }
        return -1;
    }

    public CharSequence[] getEntries() {
        return this.r1;
    }

    @Nullable
    public CharSequence getEntry() {
        CharSequence[] charSequenceArr;
        int iFindIndexOfValue = findIndexOfValue(this.f22274t1);
        if (iFindIndexOfValue < 0 || (charSequenceArr = this.r1) == null) {
            return null;
        }
        return charSequenceArr[iFindIndexOfValue];
    }

    public CharSequence[] getEntryValues() {
        return this.f22273s1;
    }

    @Override // androidx.preference.Preference
    @Nullable
    public CharSequence getSummary() {
        if (getSummaryProvider() != null) {
            return getSummaryProvider().provideSummary(this);
        }
        CharSequence entry = getEntry();
        CharSequence summary = super.getSummary();
        String str = this.f22275u1;
        if (str == null) {
            return summary;
        }
        Object[] objArr = new Object[1];
        if (entry == null) {
            entry = "";
        }
        objArr[0] = entry;
        String str2 = String.format(str, objArr);
        if (TextUtils.equals(str2, summary)) {
            return summary;
        }
        Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
        return str2;
    }

    public String getValue() {
        return this.f22274t1;
    }

    @Override // androidx.preference.Preference
    public Object onGetDefaultValue(@NonNull TypedArray typedArray, int i10) {
        return typedArray.getString(i10);
    }

    @Override // androidx.preference.Preference
    public void onRestoreInstanceState(@Nullable Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(SavedState.class)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setValue(savedState.f22277p0);
    }

    @Override // androidx.preference.Preference
    @Nullable
    public Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        if (isPersistent()) {
            return parcelableOnSaveInstanceState;
        }
        SavedState savedState = new SavedState(parcelableOnSaveInstanceState);
        savedState.f22277p0 = getValue();
        return savedState;
    }

    @Override // androidx.preference.Preference
    public void onSetInitialValue(Object obj) {
        setValue(getPersistedString((String) obj));
    }

    public void setEntries(CharSequence[] charSequenceArr) {
        this.r1 = charSequenceArr;
    }

    public void setEntryValues(CharSequence[] charSequenceArr) {
        this.f22273s1 = charSequenceArr;
    }

    @Override // androidx.preference.Preference
    public void setSummary(@Nullable CharSequence charSequence) {
        super.setSummary(charSequence);
        if (charSequence == null) {
            this.f22275u1 = null;
        } else {
            this.f22275u1 = charSequence.toString();
        }
    }

    public void setValue(String str) {
        boolean z10 = !TextUtils.equals(this.f22274t1, str);
        if (z10 || !this.f22276v1) {
            this.f22274t1 = str;
            this.f22276v1 = true;
            persistString(str);
            if (z10) {
                notifyChanged();
            }
        }
    }

    public void setValueIndex(int i10) {
        CharSequence[] charSequenceArr = this.f22273s1;
        if (charSequenceArr != null) {
            setValue(charSequenceArr[i10].toString());
        }
    }

    public void setEntries(@ArrayRes int i10) {
        setEntries(getContext().getResources().getTextArray(i10));
    }

    public void setEntryValues(@ArrayRes int i10) {
        setEntryValues(getContext().getResources().getTextArray(i10));
    }

    public ListPreference(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public ListPreference(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, TypedArrayUtils.getAttr(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle));
    }

    public ListPreference(@NonNull Context context) {
        this(context, null);
    }
}
