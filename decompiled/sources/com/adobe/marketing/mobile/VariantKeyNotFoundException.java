package com.adobe.marketing.mobile;

/* JADX INFO: loaded from: classes2.dex */
class VariantKeyNotFoundException extends VariantException {
    public VariantKeyNotFoundException() {
        super("The specified key was not found.");
    }

    public VariantKeyNotFoundException(String str) {
        super(str);
    }

    public VariantKeyNotFoundException(Exception exc) {
        super(exc);
    }
}
