package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes2.dex */
public abstract class TwoStatePreference extends Preference {

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public CharSequence f22439l1;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public CharSequence f22440m1;
    protected boolean mChecked;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public boolean f22441n1;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public boolean f22442o1;

    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public boolean f22443p0;

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
            this.f22443p0 = parcel.readInt() == 1;
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f22443p0 ? 1 : 0);
        }
    }

    public TwoStatePreference(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
    }

    public boolean getDisableDependentsState() {
        return this.f22442o1;
    }

    @Nullable
    public CharSequence getSummaryOff() {
        return this.f22440m1;
    }

    @Nullable
    public CharSequence getSummaryOn() {
        return this.f22439l1;
    }

    public boolean isChecked() {
        return this.mChecked;
    }

    @Override // androidx.preference.Preference
    public void onClick() {
        super.onClick();
        boolean z10 = !isChecked();
        if (callChangeListener(Boolean.valueOf(z10))) {
            setChecked(z10);
        }
    }

    @Override // androidx.preference.Preference
    @Nullable
    public Object onGetDefaultValue(@NonNull TypedArray typedArray, int i10) {
        return Boolean.valueOf(typedArray.getBoolean(i10, false));
    }

    @Override // androidx.preference.Preference
    public void onRestoreInstanceState(@Nullable Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(SavedState.class)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setChecked(savedState.f22443p0);
    }

    @Override // androidx.preference.Preference
    @Nullable
    public Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        if (isPersistent()) {
            return parcelableOnSaveInstanceState;
        }
        SavedState savedState = new SavedState(parcelableOnSaveInstanceState);
        savedState.f22443p0 = isChecked();
        return savedState;
    }

    @Override // androidx.preference.Preference
    public void onSetInitialValue(Object obj) {
        if (obj == null) {
            obj = Boolean.FALSE;
        }
        setChecked(getPersistedBoolean(((Boolean) obj).booleanValue()));
    }

    public void setChecked(boolean z10) {
        boolean z11 = this.mChecked != z10;
        if (z11 || !this.f22441n1) {
            this.mChecked = z10;
            this.f22441n1 = true;
            persistBoolean(z10);
            if (z11) {
                notifyDependencyChange(shouldDisableDependents());
                notifyChanged();
            }
        }
    }

    public void setDisableDependentsState(boolean z10) {
        this.f22442o1 = z10;
    }

    public void setSummaryOff(@Nullable CharSequence charSequence) {
        this.f22440m1 = charSequence;
        if (isChecked()) {
            return;
        }
        notifyChanged();
    }

    public void setSummaryOn(@Nullable CharSequence charSequence) {
        this.f22439l1 = charSequence;
        if (isChecked()) {
            notifyChanged();
        }
    }

    @Override // androidx.preference.Preference
    public boolean shouldDisableDependents() {
        if (!this.f22442o1 ? this.mChecked : !this.mChecked) {
            if (!super.shouldDisableDependents()) {
                return false;
            }
        }
        return true;
    }

    public void syncSummaryView(@NonNull PreferenceViewHolder preferenceViewHolder) {
        syncSummaryView(preferenceViewHolder.findViewById(android.R.id.summary));
    }

    public TwoStatePreference(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public TwoStatePreference(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0030  */
    /* JADX WARN: Code duplicated, block: B:20:0x003a  */
    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:28:? A[RETURN, SYNTHETIC] */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void syncSummaryView(View view) {
        boolean z10;
        int i10;
        CharSequence summary;
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            if (this.mChecked && !TextUtils.isEmpty(this.f22439l1)) {
                textView.setText(this.f22439l1);
            } else {
                if (this.mChecked || TextUtils.isEmpty(this.f22440m1)) {
                    z10 = true;
                } else {
                    textView.setText(this.f22440m1);
                }
                if (z10) {
                    summary = getSummary();
                    if (!TextUtils.isEmpty(summary)) {
                        textView.setText(summary);
                        z10 = false;
                    }
                }
                i10 = z10 ? 8 : 0;
                if (i10 != textView.getVisibility()) {
                    textView.setVisibility(i10);
                }
            }
            z10 = false;
            if (z10) {
                summary = getSummary();
                if (!TextUtils.isEmpty(summary)) {
                    textView.setText(summary);
                    z10 = false;
                }
            }
            if (z10) {
            }
            if (i10 != textView.getVisibility()) {
                textView.setVisibility(i10);
            }
        }
    }

    public TwoStatePreference(@NonNull Context context) {
        this(context, null);
    }

    public void setSummaryOff(int i10) {
        setSummaryOff(getContext().getString(i10));
    }

    public void setSummaryOn(int i10) {
        setSummaryOn(getContext().getString(i10));
    }
}
