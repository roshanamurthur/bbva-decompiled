package com.google.android.material.datepicker;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.R;

/* JADX INFO: compiled from: MaterialCalendar.java */
/* JADX INFO: loaded from: classes10.dex */
public final class m extends AccessibilityDelegateCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MaterialCalendar f44586a;

    public m(MaterialCalendar materialCalendar) {
        this.f44586a = materialCalendar;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityNodeInfo(View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        MaterialCalendar materialCalendar = this.f44586a;
        accessibilityNodeInfoCompat.setHintText(materialCalendar.G0.getVisibility() == 0 ? materialCalendar.getString(R.string.mtrl_picker_toggle_to_year_selection) : materialCalendar.getString(R.string.mtrl_picker_toggle_to_day_selection));
    }
}
