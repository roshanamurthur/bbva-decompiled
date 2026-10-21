package com.adobe.marketing.mobile;

/* JADX INFO: loaded from: classes2.dex */
class VariantSerializationFailedException extends VariantException {
    public VariantSerializationFailedException() {
        super("An error occurred during variant serialization.");
    }

    public VariantSerializationFailedException(String str) {
        super(str);
    }

    public VariantSerializationFailedException(Exception exc) {
        super(exc);
    }
}
