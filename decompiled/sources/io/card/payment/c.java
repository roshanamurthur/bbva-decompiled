package io.card.payment;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import com.bbva.sl.ar.android.libkeymanagement.exception.ReturnCode;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: compiled from: ExpiryValidator.java */
/* JADX INFO: loaded from: classes7.dex */
public final class c implements k {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f69769p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f69770q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f69771r0;

    @Override // io.card.payment.k
    public final boolean a() {
        return this.f69771r0;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        SimpleDateFormat simpleDateFormat;
        this.f69771r0 = editable.length() >= 5;
        String string = editable.toString();
        if (string == null) {
            return;
        }
        String strE = bn.a.e(string);
        int length = strE.length();
        Date date = null;
        if (length == 4) {
            simpleDateFormat = new SimpleDateFormat("MMyy");
        } else {
            simpleDateFormat = length == 6 ? new SimpleDateFormat("MMyyyy") : null;
        }
        if (simpleDateFormat != null) {
            try {
                simpleDateFormat.setLenient(false);
                date = simpleDateFormat.parse(strE);
            } catch (ParseException unused) {
            }
        }
        if (date == null) {
            return;
        }
        this.f69769p0 = date.getMonth() + 1;
        int year = date.getYear();
        this.f69770q0 = year;
        if (year < 1900) {
            this.f69770q0 = year + ReturnCode.ERR_REPOSITORY;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        this.f69769p0 = 0;
        this.f69770q0 = 0;
        this.f69771r0 = false;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
        int i14;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        if (i12 == 0 && spannableStringBuilder.length() > 0 && '1' < spannableStringBuilder.charAt(0) && spannableStringBuilder.charAt(0) <= '9') {
            spannableStringBuilder.insert(0, (CharSequence) "0");
            i11++;
        }
        int i15 = i13 - i12;
        if (i12 - i15 <= 2 && (i12 + i11) - i15 >= 2 && ((i14 = 2 - i12) == i11 || (i14 >= 0 && i14 < i11 && spannableStringBuilder.charAt(i14) != '/'))) {
            spannableStringBuilder.insert(i14, (CharSequence) "/");
            i11++;
        }
        String string = new SpannableStringBuilder(spanned).replace(i12, i13, (CharSequence) spannableStringBuilder, i10, i11).toString();
        if (string.length() >= 1 && (string.charAt(0) < '0' || '1' < string.charAt(0))) {
            return "";
        }
        if (string.length() >= 2) {
            if (string.charAt(0) != '0' && string.charAt(1) > '2') {
                return "";
            }
            if (string.charAt(0) == '0' && string.charAt(1) == '0') {
                return "";
            }
        }
        return string.length() > 5 ? "" : spannableStringBuilder;
    }

    @Override // io.card.payment.k
    public final String getValue() {
        return String.format("%02d/%02d", Integer.valueOf(this.f69769p0), Integer.valueOf(this.f69770q0 % 100));
    }

    @Override // io.card.payment.k
    public final boolean isValid() {
        int i10 = this.f69769p0;
        if (i10 < 1 || 12 < i10) {
            return false;
        }
        Date date = new Date();
        if (this.f69770q0 > date.getYear() + 1915) {
            return false;
        }
        return this.f69770q0 > date.getYear() + ReturnCode.ERR_REPOSITORY || (this.f69770q0 == date.getYear() + ReturnCode.ERR_REPOSITORY && this.f69769p0 >= date.getMonth() + 1);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
