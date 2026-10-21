package com.google.android.material.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.R;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;

/* JADX INFO: loaded from: classes10.dex */
class TimePickerView extends ConstraintLayout {

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final /* synthetic */ int f45759x0 = 0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Chip f45760p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Chip f45761q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final ClockHandView f45762r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final ClockFaceView f45763s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final MaterialButtonToggleGroup f45764t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public c f45765u0;
    public d v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public b f45766w0;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            d dVar = TimePickerView.this.v0;
            if (dVar != null) {
                dVar.a(((Integer) view.getTag(R.id.selection_type)).intValue());
            }
        }
    }

    public interface b {
        void onDoubleTap();
    }

    public interface c {
    }

    public interface d {
        void a(int i10);
    }

    public TimePickerView(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public final void onVisibilityChanged(@NonNull View view, int i10) {
        super.onVisibilityChanged(view, i10);
        if (view == this && i10 == 0) {
            this.f45761q0.sendAccessibilityEvent(8);
        }
    }

    public void setActiveSelection(int i10) {
        boolean z10 = i10 == 12;
        Chip chip = this.f45760p0;
        chip.setChecked(z10);
        ViewCompat.setAccessibilityLiveRegion(chip, z10 ? 2 : 0);
        boolean z11 = i10 == 10;
        Chip chip2 = this.f45761q0;
        chip2.setChecked(z11);
        ViewCompat.setAccessibilityLiveRegion(chip2, z11 ? 2 : 0);
    }

    public void setAnimateOnTouchUp(boolean z10) {
        this.f45762r0.setAnimateOnTouchUp(z10);
    }

    public void setHandRotation(float f6) {
        this.f45762r0.setHandRotation(f6);
    }

    public void setHourClickDelegate(AccessibilityDelegateCompat accessibilityDelegateCompat) {
        ViewCompat.setAccessibilityDelegate(this.f45760p0, accessibilityDelegateCompat);
    }

    public void setMinuteHourDelegate(AccessibilityDelegateCompat accessibilityDelegateCompat) {
        ViewCompat.setAccessibilityDelegate(this.f45761q0, accessibilityDelegateCompat);
    }

    public void setOnActionUpListener(ClockHandView.OnActionUpListener onActionUpListener) {
        this.f45762r0.setOnActionUpListener(onActionUpListener);
    }

    public void setValues(String[] strArr, @StringRes int i10) {
        this.f45763s0.setValues(strArr, i10);
    }

    public TimePickerView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void setHandRotation(float f6, boolean z10) {
        this.f45762r0.setHandRotation(f6, z10);
    }

    public TimePickerView(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        a aVar = new a();
        LayoutInflater.from(context).inflate(R.layout.material_timepicker, this);
        this.f45763s0 = (ClockFaceView) findViewById(R.id.material_clock_face);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(R.id.material_clock_period_toggle);
        this.f45764t0 = materialButtonToggleGroup;
        materialButtonToggleGroup.addOnButtonCheckedListener(new MaterialButtonToggleGroup.OnButtonCheckedListener() { // from class: com.google.android.material.timepicker.j
            @Override // com.google.android.material.button.MaterialButtonToggleGroup.OnButtonCheckedListener
            public final void onButtonChecked(MaterialButtonToggleGroup materialButtonToggleGroup2, int i11, boolean z10) {
                TimePickerView timePickerView = this.f45801a;
                if (!z10) {
                    int i12 = TimePickerView.f45759x0;
                    timePickerView.getClass();
                } else {
                    TimePickerView.c cVar = timePickerView.f45765u0;
                    if (cVar != null) {
                        ((e) cVar).f45777q0.e(i11 == R.id.material_clock_period_pm_button ? 1 : 0);
                    }
                }
            }
        });
        Chip chip = (Chip) findViewById(R.id.material_minute_tv);
        this.f45760p0 = chip;
        Chip chip2 = (Chip) findViewById(R.id.material_hour_tv);
        this.f45761q0 = chip2;
        this.f45762r0 = (ClockHandView) findViewById(R.id.material_clock_hand);
        l lVar = new l(new GestureDetector(getContext(), new k(this)));
        chip.setOnTouchListener(lVar);
        chip2.setOnTouchListener(lVar);
        int i11 = R.id.selection_type;
        chip.setTag(i11, 12);
        chip2.setTag(i11, 10);
        chip.setOnClickListener(aVar);
        chip2.setOnClickListener(aVar);
        chip.setAccessibilityClassName(AndroidComposeViewAccessibilityDelegateCompat.ClassName);
        chip2.setAccessibilityClassName(AndroidComposeViewAccessibilityDelegateCompat.ClassName);
    }
}
