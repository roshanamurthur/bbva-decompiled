package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Resources;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.R;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.TextWatcherAdapter;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: compiled from: TimePickerTextInputPresenter.java */
/* JADX INFO: loaded from: classes10.dex */
public final class i implements TimePickerView.d, f {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final LinearLayout f45788p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final TimeModel f45789q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final a f45790r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final b f45791s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final ChipTextInputComboView f45792t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final ChipTextInputComboView f45793u0;
    public final EditText v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final EditText f45794w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final MaterialButtonToggleGroup f45795x0;

    /* JADX INFO: compiled from: TimePickerTextInputPresenter.java */
    public class a extends TextWatcherAdapter {
        public a() {
        }

        @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            try {
                boolean zIsEmpty = TextUtils.isEmpty(editable);
                i iVar = i.this;
                if (zIsEmpty) {
                    iVar.f45789q0.d(0);
                } else {
                    iVar.f45789q0.d(Integer.parseInt(editable.toString()));
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    /* JADX INFO: compiled from: TimePickerTextInputPresenter.java */
    public class b extends TextWatcherAdapter {
        public b() {
        }

        @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            try {
                boolean zIsEmpty = TextUtils.isEmpty(editable);
                i iVar = i.this;
                if (zIsEmpty) {
                    iVar.f45789q0.c(0);
                } else {
                    iVar.f45789q0.c(Integer.parseInt(editable.toString()));
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    /* JADX INFO: compiled from: TimePickerTextInputPresenter.java */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            i.this.a(((Integer) view.getTag(R.id.selection_type)).intValue());
        }
    }

    /* JADX INFO: compiled from: TimePickerTextInputPresenter.java */
    public class d extends com.google.android.material.timepicker.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ TimeModel f45799b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Context context, int i10, TimeModel timeModel) {
            super(context, i10);
            this.f45799b = timeModel;
        }

        @Override // com.google.android.material.timepicker.a, androidx.core.view.AccessibilityDelegateCompat
        public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            Resources resources = view.getResources();
            TimeModel timeModel = this.f45799b;
            accessibilityNodeInfoCompat.setContentDescription(resources.getString(timeModel.f45755r0 == 1 ? R.string.material_hour_24h_suffix : R.string.material_hour_suffix, String.valueOf(timeModel.b())));
        }
    }

    /* JADX INFO: compiled from: TimePickerTextInputPresenter.java */
    public class e extends com.google.android.material.timepicker.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ TimeModel f45800b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Context context, int i10, TimeModel timeModel) {
            super(context, i10);
            this.f45800b = timeModel;
        }

        @Override // com.google.android.material.timepicker.a, androidx.core.view.AccessibilityDelegateCompat
        public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.setContentDescription(view.getResources().getString(R.string.material_minute_suffix, String.valueOf(this.f45800b.f45757t0)));
        }
    }

    public i(LinearLayout linearLayout, TimeModel timeModel) {
        a aVar = new a();
        this.f45790r0 = aVar;
        b bVar = new b();
        this.f45791s0 = bVar;
        this.f45788p0 = linearLayout;
        this.f45789q0 = timeModel;
        Resources resources = linearLayout.getResources();
        ChipTextInputComboView chipTextInputComboView = (ChipTextInputComboView) linearLayout.findViewById(R.id.material_minute_text_input);
        this.f45792t0 = chipTextInputComboView;
        ChipTextInputComboView chipTextInputComboView2 = (ChipTextInputComboView) linearLayout.findViewById(R.id.material_hour_text_input);
        this.f45793u0 = chipTextInputComboView2;
        int i10 = R.id.material_label;
        TextView textView = (TextView) chipTextInputComboView.findViewById(i10);
        TextView textView2 = (TextView) chipTextInputComboView2.findViewById(i10);
        textView.setText(resources.getString(R.string.material_timepicker_minute));
        textView2.setText(resources.getString(R.string.material_timepicker_hour));
        int i11 = R.id.selection_type;
        chipTextInputComboView.setTag(i11, 12);
        chipTextInputComboView2.setTag(i11, 10);
        if (timeModel.f45755r0 == 0) {
            MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) linearLayout.findViewById(R.id.material_clock_period_toggle);
            this.f45795x0 = materialButtonToggleGroup;
            materialButtonToggleGroup.addOnButtonCheckedListener(new MaterialButtonToggleGroup.OnButtonCheckedListener() { // from class: com.google.android.material.timepicker.h
                @Override // com.google.android.material.button.MaterialButtonToggleGroup.OnButtonCheckedListener
                public final void onButtonChecked(MaterialButtonToggleGroup materialButtonToggleGroup2, int i12, boolean z10) {
                    i iVar = this.f45787a;
                    iVar.getClass();
                    if (z10) {
                        iVar.f45789q0.e(i12 == R.id.material_clock_period_pm_button ? 1 : 0);
                    }
                }
            });
            this.f45795x0.setVisibility(0);
            d();
        }
        c cVar = new c();
        chipTextInputComboView2.setOnClickListener(cVar);
        chipTextInputComboView.setOnClickListener(cVar);
        EditText editText = chipTextInputComboView2.f45711r0;
        InputFilter[] filters = editText.getFilters();
        InputFilter[] inputFilterArr = (InputFilter[]) Arrays.copyOf(filters, filters.length + 1);
        inputFilterArr[filters.length] = timeModel.f45754q0;
        editText.setFilters(inputFilterArr);
        EditText editText2 = chipTextInputComboView.f45711r0;
        InputFilter[] filters2 = editText2.getFilters();
        InputFilter[] inputFilterArr2 = (InputFilter[]) Arrays.copyOf(filters2, filters2.length + 1);
        inputFilterArr2[filters2.length] = timeModel.f45753p0;
        editText2.setFilters(inputFilterArr2);
        TextInputLayout textInputLayout = chipTextInputComboView2.f45710q0;
        EditText editText3 = textInputLayout.getEditText();
        this.v0 = editText3;
        TextInputLayout textInputLayout2 = chipTextInputComboView.f45710q0;
        EditText editText4 = textInputLayout2.getEditText();
        this.f45794w0 = editText4;
        g gVar = new g(chipTextInputComboView2, chipTextInputComboView, timeModel);
        chipTextInputComboView2.setChipDelegate(new d(linearLayout.getContext(), R.string.material_hour_selection, timeModel));
        chipTextInputComboView.setChipDelegate(new e(linearLayout.getContext(), R.string.material_minute_selection, timeModel));
        editText3.addTextChangedListener(bVar);
        editText4.addTextChangedListener(aVar);
        c(timeModel);
        EditText editText5 = textInputLayout.getEditText();
        EditText editText6 = textInputLayout2.getEditText();
        editText5.setImeOptions(268435461);
        editText6.setImeOptions(268435462);
        editText5.setOnEditorActionListener(gVar);
        editText5.setOnKeyListener(gVar);
        editText6.setOnKeyListener(gVar);
    }

    @Override // com.google.android.material.timepicker.TimePickerView.d
    public final void a(int i10) {
        this.f45789q0.f45758u0 = i10;
        this.f45792t0.setChecked(i10 == 12);
        this.f45793u0.setChecked(i10 == 10);
        d();
    }

    public final void b() {
        TimeModel timeModel = this.f45789q0;
        this.f45792t0.setChecked(timeModel.f45758u0 == 12);
        this.f45793u0.setChecked(timeModel.f45758u0 == 10);
    }

    public final void c(TimeModel timeModel) {
        EditText editText = this.v0;
        b bVar = this.f45791s0;
        editText.removeTextChangedListener(bVar);
        EditText editText2 = this.f45794w0;
        a aVar = this.f45790r0;
        editText2.removeTextChangedListener(aVar);
        Locale locale = this.f45788p0.getResources().getConfiguration().locale;
        String str = String.format(locale, "%02d", Integer.valueOf(timeModel.f45757t0));
        String str2 = String.format(locale, "%02d", Integer.valueOf(timeModel.b()));
        this.f45792t0.setText(str);
        this.f45793u0.setText(str2);
        editText.addTextChangedListener(bVar);
        editText2.addTextChangedListener(aVar);
        d();
    }

    public final void d() {
        MaterialButtonToggleGroup materialButtonToggleGroup = this.f45795x0;
        if (materialButtonToggleGroup == null) {
            return;
        }
        materialButtonToggleGroup.check(this.f45789q0.v0 == 0 ? R.id.material_clock_period_am_button : R.id.material_clock_period_pm_button);
    }

    @Override // com.google.android.material.timepicker.f
    public final void hide() {
        LinearLayout linearLayout = this.f45788p0;
        View focusedChild = linearLayout.getFocusedChild();
        if (focusedChild != null) {
            ViewUtils.hideKeyboard(focusedChild, false);
        }
        linearLayout.setVisibility(8);
    }

    @Override // com.google.android.material.timepicker.f
    public final void invalidate() {
        c(this.f45789q0);
    }

    @Override // com.google.android.material.timepicker.f
    public final void show() {
        this.f45788p0.setVisibility(0);
        a(this.f45789q0.f45758u0);
    }
}
