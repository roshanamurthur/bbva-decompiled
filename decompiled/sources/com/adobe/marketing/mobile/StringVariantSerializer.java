package com.adobe.marketing.mobile;

/* JADX INFO: loaded from: classes2.dex */
final class StringVariantSerializer implements VariantSerializer<String> {
    @Override // com.adobe.marketing.mobile.VariantSerializer
    public String deserialize(Variant variant) throws VariantException {
        if (variant == null) {
            throw new IllegalArgumentException();
        }
        if (variant.getKind() == VariantKind.NULL) {
            return null;
        }
        return variant.convertToString();
    }

    @Override // com.adobe.marketing.mobile.VariantSerializer
    public Variant serialize(String str) {
        return str == null ? Variant.fromNull() : Variant.fromString(str);
    }
}
