package io.card.payment;

import android.text.Editable;
import android.text.Spanned;

/* JADX INFO: compiled from: AlwaysValid.java */
/* JADX INFO: loaded from: classes7.dex */
public final class a implements k {
    @Override // io.card.payment.k
    public final boolean a() {
        return true;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
        return null;
    }

    @Override // io.card.payment.k
    public final String getValue() {
        return null;
    }

    @Override // io.card.payment.k
    public final boolean isValid() {
        return true;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
