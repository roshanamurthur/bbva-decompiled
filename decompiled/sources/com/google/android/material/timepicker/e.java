package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import androidx.core.content.ContextCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobilesdk.tokencompat.model.StorageTokenBuilder;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.apdu.PaywaveHceLogic;
import com.google.android.material.R;
import com.google.android.material.chip.Chip;
import java.util.Locale;
import mx.openpay.library.data.util.EglobalUtils;

/* JADX INFO: compiled from: TimePickerClockPresenter.java */
/* JADX INFO: loaded from: classes10.dex */
public final class e implements ClockHandView.OnRotateListener, TimePickerView.d, TimePickerView.c, ClockHandView.OnActionUpListener, f {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final String[] f45774u0 = {"12", "1", "2", ExifInterface.GPS_MEASUREMENT_3D, "4", "5", StorageTokenBuilder.OTP_LENGTH, "7", "8", "9", "10", "11"};
    public static final String[] v0 = {"00", "1", "2", ExifInterface.GPS_MEASUREMENT_3D, "4", "5", StorageTokenBuilder.OTP_LENGTH, "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", PaywaveHceLogic.TRANSACTION_TYPE_CODE_REFUND, "21", "22", EglobalUtils.CARD_REMOVED};

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final String[] f45775w0 = {"00", "5", "10", "15", PaywaveHceLogic.TRANSACTION_TYPE_CODE_REFUND, "25", "30", "35", "40", "45", "50", "55"};

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final TimePickerView f45776p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final TimeModel f45777q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public float f45778r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public float f45779s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f45780t0 = false;

    /* JADX INFO: compiled from: TimePickerClockPresenter.java */
    public class a extends com.google.android.material.timepicker.a {
        public a(Context context, int i10) {
            super(context, i10);
        }

        @Override // com.google.android.material.timepicker.a, androidx.core.view.AccessibilityDelegateCompat
        public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            Resources resources = view.getResources();
            TimeModel timeModel = e.this.f45777q0;
            accessibilityNodeInfoCompat.setContentDescription(resources.getString(timeModel.f45755r0 == 1 ? R.string.material_hour_24h_suffix : R.string.material_hour_suffix, String.valueOf(timeModel.b())));
        }
    }

    /* JADX INFO: compiled from: TimePickerClockPresenter.java */
    public class b extends com.google.android.material.timepicker.a {
        public b(Context context, int i10) {
            super(context, i10);
        }

        @Override // com.google.android.material.timepicker.a, androidx.core.view.AccessibilityDelegateCompat
        public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.setContentDescription(view.getResources().getString(R.string.material_minute_suffix, String.valueOf(e.this.f45777q0.f45757t0)));
        }
    }

    public e(TimePickerView timePickerView, TimeModel timeModel) {
        this.f45776p0 = timePickerView;
        this.f45777q0 = timeModel;
        if (timeModel.f45755r0 == 0) {
            timePickerView.f45764t0.setVisibility(0);
        }
        timePickerView.f45762r0.f45731y0.add(this);
        timePickerView.v0 = this;
        timePickerView.f45765u0 = this;
        timePickerView.setOnActionUpListener(this);
        String[] strArr = f45774u0;
        for (int i10 = 0; i10 < 12; i10++) {
            strArr[i10] = TimeModel.a(this.f45776p0.getResources(), strArr[i10], "%d");
        }
        String[] strArr2 = f45775w0;
        for (int i11 = 0; i11 < 12; i11++) {
            strArr2[i11] = TimeModel.a(this.f45776p0.getResources(), strArr2[i11], "%02d");
        }
        invalidate();
    }

    @Override // com.google.android.material.timepicker.TimePickerView.d
    public final void a(int i10) {
        b(i10, true);
    }

    public final void b(int i10, boolean z10) {
        String[] strArr;
        int i11;
        int i12 = 1;
        boolean z11 = i10 == 12;
        TimePickerView timePickerView = this.f45776p0;
        timePickerView.setAnimateOnTouchUp(z11);
        TimeModel timeModel = this.f45777q0;
        timeModel.f45758u0 = i10;
        int i13 = timeModel.f45755r0;
        if (z11) {
            strArr = f45775w0;
        } else {
            strArr = i13 == 1 ? v0 : f45774u0;
        }
        if (z11) {
            i11 = R.string.material_minute_suffix;
        } else {
            i11 = i13 == 1 ? R.string.material_hour_24h_suffix : R.string.material_hour_suffix;
        }
        timePickerView.setValues(strArr, i11);
        if (timeModel.f45758u0 == 10 && i13 == 1 && timeModel.f45756s0 >= 12) {
            i12 = 2;
        }
        ClockHandView clockHandView = timePickerView.f45763s0.f45715s0;
        clockHandView.O0 = i12;
        clockHandView.invalidate();
        timePickerView.setHandRotation(z11 ? this.f45778r0 : this.f45779s0, z10);
        timePickerView.setActiveSelection(i10);
        timePickerView.setMinuteHourDelegate(new a(timePickerView.getContext(), R.string.material_hour_selection));
        timePickerView.setHourClickDelegate(new b(timePickerView.getContext(), R.string.material_minute_selection));
    }

    public final void c() {
        TimeModel timeModel = this.f45777q0;
        int i10 = timeModel.v0;
        int iB = timeModel.b();
        int i11 = timeModel.f45757t0;
        TimePickerView timePickerView = this.f45776p0;
        timePickerView.getClass();
        timePickerView.f45764t0.check(i10 == 1 ? R.id.material_clock_period_pm_button : R.id.material_clock_period_am_button);
        Locale locale = timePickerView.getResources().getConfiguration().locale;
        String str = String.format(locale, "%02d", Integer.valueOf(i11));
        String str2 = String.format(locale, "%02d", Integer.valueOf(iB));
        Chip chip = timePickerView.f45760p0;
        if (!TextUtils.equals(chip.getText(), str)) {
            chip.setText(str);
        }
        Chip chip2 = timePickerView.f45761q0;
        if (TextUtils.equals(chip2.getText(), str2)) {
            return;
        }
        chip2.setText(str2);
    }

    @Override // com.google.android.material.timepicker.f
    public final void hide() {
        this.f45776p0.setVisibility(8);
    }

    @Override // com.google.android.material.timepicker.f
    public final void invalidate() {
        TimeModel timeModel = this.f45777q0;
        this.f45779s0 = (timeModel.b() * 30) % 360;
        this.f45778r0 = timeModel.f45757t0 * 6;
        b(timeModel.f45758u0, false);
        c();
    }

    @Override // com.google.android.material.timepicker.ClockHandView.OnActionUpListener
    public final void onActionUp(float f6, boolean z10) {
        this.f45780t0 = true;
        TimeModel timeModel = this.f45777q0;
        int i10 = timeModel.f45757t0;
        int i11 = timeModel.f45756s0;
        int i12 = timeModel.f45758u0;
        TimePickerView timePickerView = this.f45776p0;
        if (i12 == 10) {
            timePickerView.setHandRotation(this.f45779s0, false);
            AccessibilityManager accessibilityManager = (AccessibilityManager) ContextCompat.getSystemService(timePickerView.getContext(), AccessibilityManager.class);
            if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
                b(12, true);
            }
        } else {
            int iRound = Math.round(f6);
            if (!z10) {
                timeModel.d(((iRound + 15) / 30) * 5);
                this.f45778r0 = timeModel.f45757t0 * 6;
            }
            timePickerView.setHandRotation(this.f45778r0, z10);
        }
        this.f45780t0 = false;
        c();
        if (timeModel.f45757t0 == i10 && timeModel.f45756s0 == i11) {
            return;
        }
        timePickerView.performHapticFeedback(4);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.OnRotateListener
    public final void onRotate(float f6, boolean z10) {
        if (this.f45780t0) {
            return;
        }
        TimeModel timeModel = this.f45777q0;
        int i10 = timeModel.f45756s0;
        int i11 = timeModel.f45757t0;
        int iRound = Math.round(f6);
        int i12 = timeModel.f45758u0;
        TimePickerView timePickerView = this.f45776p0;
        if (i12 == 12) {
            timeModel.d((iRound + 3) / 6);
            this.f45778r0 = (float) Math.floor(timeModel.f45757t0 * 6);
        } else {
            int i13 = (iRound + 15) / 30;
            if (timeModel.f45755r0 == 1) {
                i13 %= 12;
                if (timePickerView.f45763s0.f45715s0.O0 == 2) {
                    i13 += 12;
                }
            }
            timeModel.c(i13);
            this.f45779s0 = (timeModel.b() * 30) % 360;
        }
        if (z10) {
            return;
        }
        c();
        if (timeModel.f45757t0 == i11 && timeModel.f45756s0 == i10) {
            return;
        }
        timePickerView.performHapticFeedback(4);
    }

    @Override // com.google.android.material.timepicker.f
    public final void show() {
        this.f45776p0.setVisibility(0);
    }
}
