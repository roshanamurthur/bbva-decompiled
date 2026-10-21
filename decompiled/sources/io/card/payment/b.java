package io.card.payment;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import java.text.StringCharacterIterator;

/* JADX INFO: compiled from: CardNumberValidator.java */
/* JADX INFO: loaded from: classes7.dex */
public final class b implements k {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final int[] f69765r0 = {4, 11};

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final int[] f69766s0 = {4, 9, 14};

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public String f69767p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f69768q0;

    @Override // io.card.payment.k
    public final boolean a() {
        if (TextUtils.isEmpty(this.f69767p0)) {
            return false;
        }
        return this.f69767p0.length() == CardType.fromCardNumber(this.f69767p0).numberLength();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String strE = bn.a.e(editable.toString());
        this.f69767p0 = strE;
        CardType cardTypeFromCardNumber = CardType.fromCardNumber(strE);
        int i10 = this.f69768q0;
        int i11 = 0;
        if (i10 > 1) {
            int i12 = i10 - 1;
            this.f69768q0 = 0;
            if (i10 > i12) {
                editable.delete(i12, i10);
            }
        }
        while (i11 < editable.length()) {
            char cCharAt = editable.charAt(i11);
            if ((cardTypeFromCardNumber.numberLength() == 15 && (i11 == 4 || i11 == 11)) || ((cardTypeFromCardNumber.numberLength() == 16 || cardTypeFromCardNumber.numberLength() == 14) && (i11 == 4 || i11 == 9 || i11 == 14))) {
                if (cCharAt != ' ') {
                    editable.insert(i11, " ");
                }
            } else if (cCharAt == ' ') {
                editable.delete(i11, i11 + 1);
                i11--;
            }
            i11++;
        }
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
        int i14;
        String strE = bn.a.e(new SpannableStringBuilder(spanned).replace(i12, i13, charSequence, i10, i11).toString());
        int iNumberLength = CardType.fromCardNumber(strE).numberLength();
        if (strE.length() > iNumberLength) {
            return "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        int[] iArr = iNumberLength == 15 ? f69765r0 : f69766s0;
        int i15 = i13 - i12;
        for (int i16 = 0; i16 < iArr.length; i16++) {
            if (charSequence.length() == 0 && i12 == iArr[i16] && spanned.charAt(i12) == ' ') {
                this.f69768q0 = iArr[i16];
            }
            int i17 = i12 - i15;
            int i18 = iArr[i16];
            if (i17 <= i18 && (i12 + i11) - i15 >= i18 && ((i14 = i18 - i12) == i11 || (i14 >= 0 && i14 < i11 && spannableStringBuilder.charAt(i14) != ' '))) {
                spannableStringBuilder.insert(i14, (CharSequence) " ");
                i11++;
            }
        }
        return spannableStringBuilder;
    }

    @Override // io.card.payment.k
    public final String getValue() {
        return this.f69767p0;
    }

    @Override // io.card.payment.k
    public final boolean isValid() {
        if (!a()) {
            return false;
        }
        int[][] iArr = {new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, new int[]{0, 2, 4, 6, 8, 1, 3, 5, 7, 9}};
        StringCharacterIterator stringCharacterIterator = new StringCharacterIterator(this.f69767p0);
        char cLast = stringCharacterIterator.last();
        int i10 = 0;
        int i11 = 0;
        while (cLast != 65535) {
            if (Character.isDigit(cLast)) {
                i10 += iArr[i11 & 1][cLast - '0'];
                cLast = stringCharacterIterator.previous();
                i11++;
            }
        }
        return i10 % 10 == 0;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
