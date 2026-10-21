package io.card.payment;

import android.text.Editable;
import android.text.Spanned;

/* JADX INFO: compiled from: FixedLengthValidator.java */
/* JADX INFO: loaded from: classes7.dex */
public final class d implements k {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f69772p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public String f69773q0;

    @Override // io.card.payment.k
    public final boolean a() {
        return isValid();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f69773q0 = editable.toString();
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
        if (i11 <= 0 || ((spanned.length() + i13) - i12) + i11 <= this.f69772p0) {
            return null;
        }
        return "";
    }

    @Override // io.card.payment.k
    public final String getValue() {
        return this.f69773q0;
    }

    @Override // io.card.payment.k
    public final boolean isValid() {
        String str = this.f69773q0;
        return str != null && str.length() == this.f69772p0;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
