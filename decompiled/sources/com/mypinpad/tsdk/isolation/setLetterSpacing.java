package com.mypinpad.tsdk.isolation;

import com.bbva.sl.ar.android.sslpinning.result.ResultCode;

/* JADX INFO: loaded from: classes10.dex */
public final class setLetterSpacing extends setCompoundDrawableTintMode {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f59982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f59983b;

    public setLetterSpacing(int i10, int i11) {
        super(null);
        this.f59982a = i10;
        this.f59983b = i11;
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (i11 * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY) + (i10 * (-519));
        int i14 = ~i10;
        int i15 = ~i11;
        int i16 = ~i12;
        int i17 = (((~(i11 | i12)) | (~(i14 | i15 | i16))) * 520) + i13;
        int i18 = ~(i15 | i16);
        int i19 = ~(i12 | i10);
        return ((((~(i10 | i15)) | (~(i14 | i16))) | i19) * 520) + (((i18 | i19) * (-1040)) + i17) != 1 ? Integer.valueOf(((setLetterSpacing) objArr[0]).f59983b) : Integer.valueOf(((setLetterSpacing) objArr[0]).f59982a);
    }

    public final int setCompoundDrawableTintBlendMode() {
        return ((Integer) setY(new Object[]{this}, 41011007, -41011007, System.identityHashCode(this))).intValue();
    }

    public final int setX() {
        return ((Integer) setY(new Object[]{this}, -1191182885, 1191182886, System.identityHashCode(this))).intValue();
    }
}
