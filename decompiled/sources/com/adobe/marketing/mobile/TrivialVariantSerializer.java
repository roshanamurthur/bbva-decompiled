package com.adobe.marketing.mobile;

/* JADX INFO: loaded from: classes2.dex */
class TrivialVariantSerializer implements VariantSerializer<Variant> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.adobe.marketing.mobile.VariantSerializer
    public Variant deserialize(Variant variant) throws VariantException {
        return variant;
    }

    @Override // com.adobe.marketing.mobile.VariantSerializer
    public Variant serialize(Variant variant) throws VariantException {
        return variant;
    }
}
