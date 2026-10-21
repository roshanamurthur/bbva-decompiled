package com.bbva.sl.ar.android.libkeymanagement.payment;

/* JADX INFO: loaded from: classes8.dex */
public enum PaddingMethod {
    EIGHTY_AND_ZEROS(0),
    ZEROS(1),
    NO_PADDING(2);

    private int code;

    PaddingMethod(int i10) {
        this.code = i10;
    }

    public int code() {
        return this.code;
    }
}
