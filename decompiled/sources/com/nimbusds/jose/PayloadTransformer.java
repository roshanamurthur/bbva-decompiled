package com.nimbusds.jose;

/* JADX INFO: loaded from: classes10.dex */
public interface PayloadTransformer<T> {
    T transform(Payload payload);
}
