package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.TypedArrayUtils;
import com.bbva.nativesettings.common.Constants;

/* JADX INFO: loaded from: classes2.dex */
public class CheckBoxPreference extends TwoStatePreference {

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public final a f22252p1;

    public class a implements CompoundButton.OnCheckedChangeListener {
        public a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            Boolean boolValueOf = Boolean.valueOf(z10);
            CheckBoxPreference checkBoxPreference = CheckBoxPreference.this;
            if (checkBoxPreference.callChangeListener(boolValueOf)) {
                checkBoxPreference.setChecked(z10);
            } else {
                compoundButton.setChecked(!z10);
            }
        }
    }

    public CheckBoxPreference(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(View view) {
        boolean z10 = view instanceof CompoundButton;
        if (z10) {
            ((CompoundButton) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.mChecked);
        }
        if (z10) {
            ((CompoundButton) view).setOnCheckedChangeListener(this.f22252p1);
        }
    }

    @Override // androidx.preference.Preference
    public void onBindViewHolder(@NonNull PreferenceViewHolder preferenceViewHolder) {
        super.onBindViewHolder(preferenceViewHolder);
        f(preferenceViewHolder.findViewById(android.R.id.checkbox));
        syncSummaryView(preferenceViewHolder);
    }

    @Override // androidx.preference.Preference
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void performClick(@NonNull View view) {
        super.performClick(view);
        if (((AccessibilityManager) getContext().getSystemService(Constants.ACCESSIBILITY)).isEnabled()) {
            f(view.findViewById(android.R.id.checkbox));
            syncSummaryView(view.findViewById(android.R.id.summary));
        }
    }

    public CheckBoxPreference(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f22252p1 = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CheckBoxPreference, i10, i11);
        setSummaryOn(TypedArrayUtils.getString(typedArrayObtainStyledAttributes, R.styleable.CheckBoxPreference_summaryOn, R.styleable.CheckBoxPreference_android_summaryOn));
        setSummaryOff(TypedArrayUtils.getString(typedArrayObtainStyledAttributes, R.styleable.CheckBoxPreference_summaryOff, R.styleable.CheckBoxPreference_android_summaryOff));
        setDisableDependentsState(TypedArrayUtils.getBoolean(typedArrayObtainStyledAttributes, R.styleable.CheckBoxPreference_disableDependentsState, R.styleable.CheckBoxPreference_android_disableDependentsState, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    public CheckBoxPreference(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, TypedArrayUtils.getAttr(context, R.attr.checkBoxPreferenceStyle, android.R.attr.checkBoxPreferenceStyle));
    }

    public CheckBoxPreference(@NonNull Context context) {
        this(context, null);
    }
}
