package com.adobe.marketing.mobile;

/* JADX INFO: loaded from: classes2.dex */
class VariantException extends Exception {
    public VariantException() {
        super("A variant error occurred.");
    }

    public VariantException(String str) {
        super(str);
    }

    public VariantException(Exception exc) {
        super(exc);
    }
}
