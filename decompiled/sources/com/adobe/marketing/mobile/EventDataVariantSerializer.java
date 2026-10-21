package com.adobe.marketing.mobile;

/* JADX INFO: loaded from: classes2.dex */
final class EventDataVariantSerializer implements VariantSerializer<EventData> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.adobe.marketing.mobile.VariantSerializer
    public EventData deserialize(Variant variant) throws VariantException {
        if (variant == null) {
            throw new IllegalArgumentException();
        }
        if (variant.getKind() == VariantKind.NULL) {
            return null;
        }
        return new EventData(variant.getVariantMap());
    }

    @Override // com.adobe.marketing.mobile.VariantSerializer
    public Variant serialize(EventData eventData) {
        return eventData == null ? Variant.fromNull() : Variant.fromVariantMap(eventData.asMapCopy());
    }
}
