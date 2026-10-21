package com.adobe.marketing.mobile;

/* JADX INFO: loaded from: classes2.dex */
interface VariantSerializer<T> {
    T deserialize(Variant variant) throws VariantException;

    Variant serialize(T t10) throws VariantException;
}
