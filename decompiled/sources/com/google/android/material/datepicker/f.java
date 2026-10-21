package com.google.android.material.datepicker;

import android.view.View;
import android.widget.EditText;
import androidx.annotation.NonNull;
import com.google.android.material.internal.ViewUtils;

/* JADX INFO: compiled from: DateSelector.java */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class f {
    public static void a(@NonNull final EditText... editTextArr) {
        if (editTextArr.length == 0) {
            return;
        }
        View.OnFocusChangeListener onFocusChangeListener = new View.OnFocusChangeListener() { // from class: com.google.android.material.datepicker.e
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                for (EditText editText : editTextArr) {
                    if (editText.hasFocus()) {
                        return;
                    }
                }
                ViewUtils.hideKeyboard(view, false);
            }
        };
        for (EditText editText : editTextArr) {
            editText.setOnFocusChangeListener(onFocusChangeListener);
        }
        EditText editText2 = editTextArr[0];
        editText2.postDelayed(new androidx.room.g(editText2, 3), 100L);
    }
}
