package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public class SeekBarPreference extends Preference {

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public int f22417l1;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public int f22418m1;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public int f22419n1;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public int f22420o1;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public boolean f22421p1;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public SeekBar f22422q1;
    public TextView r1;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public boolean f22423s1;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public boolean f22424t1;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public boolean f22425u1;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    public final a f22426v1;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    public final b f22427w1;

    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f22428p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public int f22429q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f22430r0;

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
            this.f22428p0 = parcel.readInt();
            this.f22429q0 = parcel.readInt();
            this.f22430r0 = parcel.readInt();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f22428p0);
            parcel.writeInt(this.f22429q0);
            parcel.writeInt(this.f22430r0);
        }
    }

    public class a implements SeekBar.OnSeekBarChangeListener {
        public a() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            if (z10 && (seekBarPreference.f22425u1 || !seekBarPreference.f22421p1)) {
                seekBarPreference.g(seekBar);
                return;
            }
            int i11 = i10 + seekBarPreference.f22418m1;
            TextView textView = seekBarPreference.r1;
            if (textView != null) {
                textView.setText(String.valueOf(i11));
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStartTrackingTouch(SeekBar seekBar) {
            SeekBarPreference.this.f22421p1 = true;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStopTrackingTouch(SeekBar seekBar) {
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            seekBarPreference.f22421p1 = false;
            if (seekBar.getProgress() + seekBarPreference.f22418m1 != seekBarPreference.f22417l1) {
                seekBarPreference.g(seekBar);
            }
        }
    }

    public class b implements View.OnKeyListener {
        public b() {
        }

        @Override // android.view.View.OnKeyListener
        public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
            SeekBar seekBar;
            if (keyEvent.getAction() != 0) {
                return false;
            }
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            if ((!seekBarPreference.f22423s1 && (i10 == 21 || i10 == 22)) || i10 == 23 || i10 == 66 || (seekBar = seekBarPreference.f22422q1) == null) {
                return false;
            }
            return seekBar.onKeyDown(i10, keyEvent);
        }
    }

    public SeekBarPreference(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f22426v1 = new a();
        this.f22427w1 = new b();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.SeekBarPreference, i10, i11);
        this.f22418m1 = typedArrayObtainStyledAttributes.getInt(R.styleable.SeekBarPreference_min, 0);
        setMax(typedArrayObtainStyledAttributes.getInt(R.styleable.SeekBarPreference_android_max, 100));
        setSeekBarIncrement(typedArrayObtainStyledAttributes.getInt(R.styleable.SeekBarPreference_seekBarIncrement, 0));
        this.f22423s1 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SeekBarPreference_adjustable, true);
        this.f22424t1 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SeekBarPreference_showSeekBarValue, false);
        this.f22425u1 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SeekBarPreference_updatesContinuously, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void f(int i10, boolean z10) {
        int i11 = this.f22418m1;
        if (i10 < i11) {
            i10 = i11;
        }
        int i12 = this.f22419n1;
        if (i10 > i12) {
            i10 = i12;
        }
        if (i10 != this.f22417l1) {
            this.f22417l1 = i10;
            TextView textView = this.r1;
            if (textView != null) {
                textView.setText(String.valueOf(i10));
            }
            persistInt(i10);
            if (z10) {
                notifyChanged();
            }
        }
    }

    public final void g(@NonNull SeekBar seekBar) {
        int progress = seekBar.getProgress() + this.f22418m1;
        if (progress != this.f22417l1) {
            if (callChangeListener(Integer.valueOf(progress))) {
                f(progress, false);
                return;
            }
            seekBar.setProgress(this.f22417l1 - this.f22418m1);
            int i10 = this.f22417l1;
            TextView textView = this.r1;
            if (textView != null) {
                textView.setText(String.valueOf(i10));
            }
        }
    }

    public int getMax() {
        return this.f22419n1;
    }

    public int getMin() {
        return this.f22418m1;
    }

    public final int getSeekBarIncrement() {
        return this.f22420o1;
    }

    public boolean getShowSeekBarValue() {
        return this.f22424t1;
    }

    public boolean getUpdatesContinuously() {
        return this.f22425u1;
    }

    public int getValue() {
        return this.f22417l1;
    }

    public boolean isAdjustable() {
        return this.f22423s1;
    }

    @Override // androidx.preference.Preference
    public void onBindViewHolder(@NonNull PreferenceViewHolder preferenceViewHolder) {
        super.onBindViewHolder(preferenceViewHolder);
        preferenceViewHolder.itemView.setOnKeyListener(this.f22427w1);
        this.f22422q1 = (SeekBar) preferenceViewHolder.findViewById(R.id.seekbar);
        TextView textView = (TextView) preferenceViewHolder.findViewById(R.id.seekbar_value);
        this.r1 = textView;
        if (this.f22424t1) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
            this.r1 = null;
        }
        SeekBar seekBar = this.f22422q1;
        if (seekBar == null) {
            return;
        }
        seekBar.setOnSeekBarChangeListener(this.f22426v1);
        this.f22422q1.setMax(this.f22419n1 - this.f22418m1);
        int i10 = this.f22420o1;
        if (i10 != 0) {
            this.f22422q1.setKeyProgressIncrement(i10);
        } else {
            this.f22420o1 = this.f22422q1.getKeyProgressIncrement();
        }
        this.f22422q1.setProgress(this.f22417l1 - this.f22418m1);
        int i11 = this.f22417l1;
        TextView textView2 = this.r1;
        if (textView2 != null) {
            textView2.setText(String.valueOf(i11));
        }
        this.f22422q1.setEnabled(isEnabled());
    }

    @Override // androidx.preference.Preference
    @Nullable
    public Object onGetDefaultValue(@NonNull TypedArray typedArray, int i10) {
        return Integer.valueOf(typedArray.getInt(i10, 0));
    }

    @Override // androidx.preference.Preference
    public void onRestoreInstanceState(@Nullable Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(SavedState.class)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f22417l1 = savedState.f22428p0;
        this.f22418m1 = savedState.f22429q0;
        this.f22419n1 = savedState.f22430r0;
        notifyChanged();
    }

    @Override // androidx.preference.Preference
    @Nullable
    public Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        if (isPersistent()) {
            return parcelableOnSaveInstanceState;
        }
        SavedState savedState = new SavedState(parcelableOnSaveInstanceState);
        savedState.f22428p0 = this.f22417l1;
        savedState.f22429q0 = this.f22418m1;
        savedState.f22430r0 = this.f22419n1;
        return savedState;
    }

    @Override // androidx.preference.Preference
    public void onSetInitialValue(Object obj) {
        if (obj == null) {
            obj = 0;
        }
        setValue(getPersistedInt(((Integer) obj).intValue()));
    }

    public void setAdjustable(boolean z10) {
        this.f22423s1 = z10;
    }

    public final void setMax(int i10) {
        int i11 = this.f22418m1;
        if (i10 < i11) {
            i10 = i11;
        }
        if (i10 != this.f22419n1) {
            this.f22419n1 = i10;
            notifyChanged();
        }
    }

    public void setMin(int i10) {
        int i11 = this.f22419n1;
        if (i10 > i11) {
            i10 = i11;
        }
        if (i10 != this.f22418m1) {
            this.f22418m1 = i10;
            notifyChanged();
        }
    }

    public final void setSeekBarIncrement(int i10) {
        if (i10 != this.f22420o1) {
            this.f22420o1 = Math.min(this.f22419n1 - this.f22418m1, Math.abs(i10));
            notifyChanged();
        }
    }

    public void setShowSeekBarValue(boolean z10) {
        this.f22424t1 = z10;
        notifyChanged();
    }

    public void setUpdatesContinuously(boolean z10) {
        this.f22425u1 = z10;
    }

    public void setValue(int i10) {
        f(i10, true);
    }

    public SeekBarPreference(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public SeekBarPreference(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.seekBarPreferenceStyle);
    }

    public SeekBarPreference(@NonNull Context context) {
        this(context, null);
    }
}
