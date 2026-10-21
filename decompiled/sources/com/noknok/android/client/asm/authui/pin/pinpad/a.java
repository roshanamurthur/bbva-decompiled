package com.noknok.android.client.asm.authui.pin.pinpad;

import android.app.Activity;
import android.media.ToneGenerator;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.widget.EditText;
import com.noknok.android.client.asm.authui.pin.R;
import com.noknok.android.client.asm.pinmanagement.PinInputLayoutBase;

/* JADX INFO: compiled from: PinInputLayout.java */
/* JADX INFO: loaded from: classes11.dex */
final class a extends PinInputLayoutBase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final EditText f63224a;

    public a(Activity activity) {
        this.f63224a = (EditText) activity.findViewById(R.id.pinText);
    }

    @Override // com.noknok.android.client.asm.pinmanagement.PinInputLayoutBase
    public final void draw(String str, String str2, String str3, boolean z10) {
        if (str2 == null) {
            str2 = "";
        }
        if (str2.equals(str)) {
            ToneGenerator toneGenerator = new ToneGenerator(3, 100);
            toneGenerator.startTone(24, 150);
            toneGenerator.release();
        }
        this.f63224a.setText(new StringBuilder(str2));
    }

    @Override // com.noknok.android.client.asm.pinmanagement.PinInputLayoutBase
    public final PinInputLayoutBase setRange(int i10, int i11) {
        super.setRange(i10, i11);
        this.f63224a.setFilters(new InputFilter[]{new InputFilter.LengthFilter(i11)});
        this.f63224a.addTextChangedListener(new TextWatcher() { // from class: com.noknok.android.client.asm.authui.pin.pinpad.PinInputLayout$1
            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i12, int i13, int i14) {
                if (((PinInputLayoutBase) this.f63216a).mPin.equals(charSequence.toString())) {
                    return;
                }
                this.f63216a.reset(false);
                this.f63216a.append(charSequence.toString());
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i12, int i13, int i14) {
            }
        });
        return this;
    }
}
