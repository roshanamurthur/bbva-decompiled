package com.esotericsoftware.kryo.serializers;

import com.esotericsoftware.kryo.Serializer;

/* JADX INFO: loaded from: classes9.dex */
public abstract class ImmutableSerializer<T> extends Serializer<T> {
    public ImmutableSerializer() {
        setImmutable(true);
    }
}
