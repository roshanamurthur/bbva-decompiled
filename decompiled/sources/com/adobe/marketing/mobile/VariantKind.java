package com.adobe.marketing.mobile;

/* JADX INFO: loaded from: classes2.dex */
enum VariantKind {
    NULL,
    STRING,
    INTEGER,
    LONG,
    DOUBLE,
    BOOLEAN,
    VECTOR,
    MAP,
    OBJECT;

    public boolean isNumeric() {
        return equals(INTEGER) || equals(LONG) || equals(DOUBLE);
    }
}
