package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.annotation.ArrayRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.res.TypedArrayUtils;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class MultiSelectListPreference extends DialogPreference {
    public CharSequence[] r1;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public CharSequence[] f22285s1;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public final HashSet f22286t1;

    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public Set<String> f22287p0;

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
            int i10 = parcel.readInt();
            this.f22287p0 = new HashSet();
            String[] strArr = new String[i10];
            parcel.readStringArray(strArr);
            Collections.addAll(this.f22287p0, strArr);
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(@NonNull Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f22287p0.size());
            Set<String> set = this.f22287p0;
            parcel.writeStringArray((String[]) set.toArray(new String[set.size()]));
        }
    }

    public MultiSelectListPreference(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f22286t1 = new HashSet();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.MultiSelectListPreference, i10, i11);
        this.r1 = TypedArrayUtils.getTextArray(typedArrayObtainStyledAttributes, R.styleable.MultiSelectListPreference_entries, R.styleable.MultiSelectListPreference_android_entries);
        this.f22285s1 = TypedArrayUtils.getTextArray(typedArrayObtainStyledAttributes, R.styleable.MultiSelectListPreference_entryValues, R.styleable.MultiSelectListPreference_android_entryValues);
        typedArrayObtainStyledAttributes.recycle();
    }

    public int findIndexOfValue(String str) {
        CharSequence[] charSequenceArr;
        if (str == null || (charSequenceArr = this.f22285s1) == null) {
            return -1;
        }
        for (int length = charSequenceArr.length - 1; length >= 0; length--) {
            if (TextUtils.equals(this.f22285s1[length].toString(), str)) {
                return length;
            }
        }
        return -1;
    }

    public CharSequence[] getEntries() {
        return this.r1;
    }

    public CharSequence[] getEntryValues() {
        return this.f22285s1;
    }

    public boolean[] getSelectedItems() {
        CharSequence[] charSequenceArr = this.f22285s1;
        int length = charSequenceArr.length;
        HashSet hashSet = this.f22286t1;
        boolean[] zArr = new boolean[length];
        for (int i10 = 0; i10 < length; i10++) {
            zArr[i10] = hashSet.contains(charSequenceArr[i10].toString());
        }
        return zArr;
    }

    public Set<String> getValues() {
        return this.f22286t1;
    }

    @Override // androidx.preference.Preference
    @Nullable
    public Object onGetDefaultValue(@NonNull TypedArray typedArray, int i10) {
        CharSequence[] textArray = typedArray.getTextArray(i10);
        HashSet hashSet = new HashSet();
        for (CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
    }

    @Override // androidx.preference.Preference
    public void onRestoreInstanceState(@Nullable Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(SavedState.class)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setValues(savedState.f22287p0);
    }

    @Override // androidx.preference.Preference
    @Nullable
    public Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        if (isPersistent()) {
            return parcelableOnSaveInstanceState;
        }
        SavedState savedState = new SavedState(parcelableOnSaveInstanceState);
        savedState.f22287p0 = getValues();
        return savedState;
    }

    @Override // androidx.preference.Preference
    public void onSetInitialValue(Object obj) {
        setValues(getPersistedStringSet((Set) obj));
    }

    public void setEntries(CharSequence[] charSequenceArr) {
        this.r1 = charSequenceArr;
    }

    public void setEntryValues(CharSequence[] charSequenceArr) {
        this.f22285s1 = charSequenceArr;
    }

    public void setValues(Set<String> set) {
        HashSet hashSet = this.f22286t1;
        hashSet.clear();
        hashSet.addAll(set);
        persistStringSet(set);
        notifyChanged();
    }

    public void setEntries(@ArrayRes int i10) {
        setEntries(getContext().getResources().getTextArray(i10));
    }

    public void setEntryValues(@ArrayRes int i10) {
        setEntryValues(getContext().getResources().getTextArray(i10));
    }

    public MultiSelectListPreference(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public MultiSelectListPreference(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, TypedArrayUtils.getAttr(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle));
    }

    public MultiSelectListPreference(@NonNull Context context) {
        this(context, null);
    }
}
