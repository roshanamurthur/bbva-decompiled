package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.Switch;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.TypedArrayUtils;
import com.bbva.nativesettings.common.Constants;

/* JADX INFO: loaded from: classes2.dex */
public class SwitchPreference extends TwoStatePreference {

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public final a f22433p1;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public CharSequence f22434q1;
    public CharSequence r1;

    public class a implements CompoundButton.OnCheckedChangeListener {
        public a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            Boolean boolValueOf = Boolean.valueOf(z10);
            SwitchPreference switchPreference = SwitchPreference.this;
            if (switchPreference.callChangeListener(boolValueOf)) {
                switchPreference.setChecked(z10);
            } else {
                compoundButton.setChecked(!z10);
            }
        }
    }

    public SwitchPreference(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f22433p1 = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.SwitchPreference, i10, i11);
        setSummaryOn(TypedArrayUtils.getString(typedArrayObtainStyledAttributes, R.styleable.SwitchPreference_summaryOn, R.styleable.SwitchPreference_android_summaryOn));
        setSummaryOff(TypedArrayUtils.getString(typedArrayObtainStyledAttributes, R.styleable.SwitchPreference_summaryOff, R.styleable.SwitchPreference_android_summaryOff));
        setSwitchTextOn(TypedArrayUtils.getString(typedArrayObtainStyledAttributes, R.styleable.SwitchPreference_switchTextOn, R.styleable.SwitchPreference_android_switchTextOn));
        setSwitchTextOff(TypedArrayUtils.getString(typedArrayObtainStyledAttributes, R.styleable.SwitchPreference_switchTextOff, R.styleable.SwitchPreference_android_switchTextOff));
        setDisableDependentsState(TypedArrayUtils.getBoolean(typedArrayObtainStyledAttributes, R.styleable.SwitchPreference_disableDependentsState, R.styleable.SwitchPreference_android_disableDependentsState, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(View view) {
        boolean z10 = view instanceof Switch;
        if (z10) {
            ((Switch) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.mChecked);
        }
        if (z10) {
            Switch r4 = (Switch) view;
            r4.setTextOn(this.f22434q1);
            r4.setTextOff(this.r1);
            r4.setOnCheckedChangeListener(this.f22433p1);
        }
    }

    @Nullable
    public CharSequence getSwitchTextOff() {
        return this.r1;
    }

    @Nullable
    public CharSequence getSwitchTextOn() {
        return this.f22434q1;
    }

    @Override // androidx.preference.Preference
    public void onBindViewHolder(@NonNull PreferenceViewHolder preferenceViewHolder) {
        super.onBindViewHolder(preferenceViewHolder);
        f(preferenceViewHolder.findViewById(android.R.id.switch_widget));
        syncSummaryView(preferenceViewHolder);
    }

    @Override // androidx.preference.Preference
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void performClick(@NonNull View view) {
        super.performClick(view);
        if (((AccessibilityManager) getContext().getSystemService(Constants.ACCESSIBILITY)).isEnabled()) {
            f(view.findViewById(android.R.id.switch_widget));
            syncSummaryView(view.findViewById(android.R.id.summary));
        }
    }

    public void setSwitchTextOff(@Nullable CharSequence charSequence) {
        this.r1 = charSequence;
        notifyChanged();
    }

    public void setSwitchTextOn(@Nullable CharSequence charSequence) {
        this.f22434q1 = charSequence;
        notifyChanged();
    }

    public void setSwitchTextOff(int i10) {
        setSwitchTextOff(getContext().getString(i10));
    }

    public void setSwitchTextOn(int i10) {
        setSwitchTextOn(getContext().getString(i10));
    }

    public SwitchPreference(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public SwitchPreference(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, TypedArrayUtils.getAttr(context, R.attr.switchPreferenceStyle, android.R.attr.switchPreferenceStyle));
    }

    public SwitchPreference(@NonNull Context context) {
        this(context, null);
    }
}
