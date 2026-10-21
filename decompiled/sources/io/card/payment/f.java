package io.card.payment;

import android.text.Editable;
import android.text.Spanned;

/* JADX INFO: compiled from: MaxLengthValidator.java */
/* JADX INFO: loaded from: classes7.dex */
public final class f implements k {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public String f69778p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f69779q0;

    public f(int i10) {
        this.f69779q0 = i10;
    }

    @Override // io.card.payment.k
    public final boolean a() {
        return isValid();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f69778p0 = editable.toString().trim();
    }

    @Override // android.text.InputFilter
    public final /* bridge */ /* synthetic */ CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
        return null;
    }

    @Override // io.card.payment.k
    public final String getValue() {
        return this.f69778p0;
    }

    @Override // io.card.payment.k
    public final boolean isValid() {
        String str = this.f69778p0;
        return str != null && str.length() > 0 && this.f69778p0.length() <= this.f69779q0;
    }

    @Override // android.text.TextWatcher
    public final /* bridge */ /* synthetic */ void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final /* bridge */ /* synthetic */ void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
