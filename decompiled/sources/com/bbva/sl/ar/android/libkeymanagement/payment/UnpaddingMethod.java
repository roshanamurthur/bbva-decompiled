package com.bbva.sl.ar.android.libkeymanagement.payment;

/* JADX INFO: loaded from: classes8.dex */
public enum UnpaddingMethod {
    EIGHTY_AND_ZEROS(0),
    REMOVE_FIRST_BYTE(1),
    NO_UNPADDING(2);

    private int code;

    UnpaddingMethod(int i10) {
        this.code = i10;
    }

    public int code() {
        return this.code;
    }
}
