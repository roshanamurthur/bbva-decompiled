package com.adobe.marketing.mobile;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class TypedListVariantSerializer<T> implements VariantSerializer<List<T>> {
    private final VariantSerializer<T> elementSerializer;

    public TypedListVariantSerializer(VariantSerializer<T> variantSerializer) {
        if (variantSerializer == null) {
            throw new IllegalArgumentException();
        }
        this.elementSerializer = variantSerializer;
    }

    public List<T> deserializeList(List<Variant> list) {
        Object typedObject;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Variant variant : list) {
            if (variant != null) {
                if (variant.getKind() == VariantKind.NULL) {
                    typedObject = null;
                } else {
                    try {
                        typedObject = variant.getTypedObject(this.elementSerializer);
                    } catch (VariantException unused) {
                    }
                }
                arrayList.add(typedObject);
            }
        }
        return arrayList;
    }

    public Variant serializeList(List<? extends T> list) {
        Variant variantFromNull;
        if (list == null) {
            return Variant.fromNull();
        }
        ArrayList arrayList = new ArrayList();
        for (T t10 : list) {
            if (t10 == null) {
                variantFromNull = Variant.fromNull();
            } else {
                try {
                    variantFromNull = Variant.fromTypedObject(t10, this.elementSerializer);
                } catch (VariantException unused) {
                }
            }
            arrayList.add(variantFromNull);
        }
        return Variant.fromVariantList(arrayList);
    }

    @Override // com.adobe.marketing.mobile.VariantSerializer
    public List<T> deserialize(Variant variant) throws VariantException {
        if (variant == null) {
            throw new IllegalArgumentException();
        }
        if (variant.getKind() == VariantKind.NULL) {
            return null;
        }
        return deserializeList(variant.getVariantList());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.adobe.marketing.mobile.VariantSerializer
    public Variant serialize(List<T> list) {
        return serializeList(list);
    }
}
