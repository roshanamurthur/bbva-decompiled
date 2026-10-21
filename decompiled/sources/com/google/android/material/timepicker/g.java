package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/* JADX INFO: compiled from: TimePickerTextInputKeyController.java */
/* JADX INFO: loaded from: classes10.dex */
public final class g implements TextView.OnEditorActionListener, View.OnKeyListener {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ChipTextInputComboView f45783p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ChipTextInputComboView f45784q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final TimeModel f45785r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f45786s0 = false;

    public g(ChipTextInputComboView chipTextInputComboView, ChipTextInputComboView chipTextInputComboView2, TimeModel timeModel) {
        this.f45783p0 = chipTextInputComboView;
        this.f45784q0 = chipTextInputComboView2;
        this.f45785r0 = timeModel;
    }

    public final void a(int i10) {
        this.f45784q0.setChecked(i10 == 12);
        this.f45783p0.setChecked(i10 == 10);
        this.f45785r0.f45758u0 = i10;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        boolean z10 = i10 == 5;
        if (z10) {
            a(12);
        }
        return z10;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (this.f45786s0) {
            return false;
        }
        boolean z10 = true;
        this.f45786s0 = true;
        EditText editText = (EditText) view;
        if (this.f45785r0.f45758u0 != 12) {
            Editable text = editText.getText();
            if (text == null) {
                z10 = false;
            } else if (i10 >= 7 && i10 <= 16 && keyEvent.getAction() == 1 && editText.getSelectionStart() == 2 && text.length() == 2) {
                a(12);
            } else {
                if (editText.getSelectionStart() == 0 && editText.length() == 2) {
                    editText.getText().clear();
                }
                z10 = false;
            }
        } else if (i10 == 67 && keyEvent.getAction() == 0 && TextUtils.isEmpty(editText.getText())) {
            a(10);
        } else {
            if (editText.getSelectionStart() == 0 && editText.length() == 2) {
                editText.getText().clear();
            }
            z10 = false;
        }
        this.f45786s0 = false;
        return z10;
    }
}
