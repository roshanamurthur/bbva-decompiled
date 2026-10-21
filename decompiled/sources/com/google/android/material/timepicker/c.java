package com.google.android.material.timepicker;

import android.text.InputFilter;
import android.text.Spanned;

/* JADX INFO: compiled from: MaxInputValidator.java */
/* JADX INFO: loaded from: classes10.dex */
public final class c implements InputFilter {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final int f45770p0;

    public c(int i10) {
        this.f45770p0 = i10;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
        try {
            StringBuilder sb2 = new StringBuilder(spanned);
            sb2.replace(i12, i13, charSequence.subSequence(i10, i11).toString());
            if (Integer.parseInt(sb2.toString()) <= this.f45770p0) {
                return null;
            }
            return "";
        } catch (NumberFormatException unused) {
            return "";
        }
    }
}
