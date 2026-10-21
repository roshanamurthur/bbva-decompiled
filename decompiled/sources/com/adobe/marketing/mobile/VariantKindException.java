package com.adobe.marketing.mobile;

/* JADX INFO: loaded from: classes2.dex */
class VariantKindException extends VariantException {
    public VariantKindException() {
        super("The variant was not the expected kind.");
    }

    public VariantKindException(String str) {
        super(str);
    }

    public VariantKindException(Exception exc) {
        super(exc);
    }
}
