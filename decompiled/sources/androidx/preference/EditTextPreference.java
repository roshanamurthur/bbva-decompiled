package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.res.TypedArrayUtils;

/* JADX INFO: loaded from: classes2.dex */
public class EditTextPreference extends DialogPreference {
    public String r1;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    @Nullable
    public OnBindEditTextListener f22265s1;

    public interface OnBindEditTextListener {
        void onBindEditText(@NonNull EditText editText);
    }

    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public String f22266p0;

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
            this.f22266p0 = parcel.readString();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeString(this.f22266p0);
        }
    }

    public static final class SimpleSummaryProvider implements Preference.SummaryProvider<EditTextPreference> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static SimpleSummaryProvider f22267a;

        @NonNull
        public static SimpleSummaryProvider getInstance() {
            if (f22267a == null) {
                f22267a = new SimpleSummaryProvider();
            }
            return f22267a;
        }

        @Override // androidx.preference.Preference.SummaryProvider
        @Nullable
        public CharSequence provideSummary(@NonNull EditTextPreference editTextPreference) {
            return TextUtils.isEmpty(editTextPreference.getText()) ? editTextPreference.getContext().getString(R.string.not_set) : editTextPreference.getText();
        }
    }

    public EditTextPreference(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.EditTextPreference, i10, i11);
        int i12 = R.styleable.EditTextPreference_useSimpleSummaryProvider;
        if (TypedArrayUtils.getBoolean(typedArrayObtainStyledAttributes, i12, i12, false)) {
            setSummaryProvider(SimpleSummaryProvider.getInstance());
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Nullable
    public String getText() {
        return this.r1;
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
        setText(savedState.f22266p0);
    }

    @Override // androidx.preference.Preference
    @Nullable
    public Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        if (isPersistent()) {
            return parcelableOnSaveInstanceState;
        }
        SavedState savedState = new SavedState(parcelableOnSaveInstanceState);
        savedState.f22266p0 = getText();
        return savedState;
    }

    @Override // androidx.preference.Preference
    public void onSetInitialValue(Object obj) {
        setText(getPersistedString((String) obj));
    }

    public void setOnBindEditTextListener(@Nullable OnBindEditTextListener onBindEditTextListener) {
        this.f22265s1 = onBindEditTextListener;
    }

    public void setText(@Nullable String str) {
        boolean zShouldDisableDependents = shouldDisableDependents();
        this.r1 = str;
        persistString(str);
        boolean zShouldDisableDependents2 = shouldDisableDependents();
        if (zShouldDisableDependents2 != zShouldDisableDependents) {
            notifyDependencyChange(zShouldDisableDependents2);
        }
        notifyChanged();
    }

    @Override // androidx.preference.Preference
    public boolean shouldDisableDependents() {
        return TextUtils.isEmpty(this.r1) || super.shouldDisableDependents();
    }

    public EditTextPreference(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public EditTextPreference(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, TypedArrayUtils.getAttr(context, R.attr.editTextPreferenceStyle, android.R.attr.editTextPreferenceStyle));
    }

    public EditTextPreference(@NonNull Context context) {
        this(context, null);
    }
}
