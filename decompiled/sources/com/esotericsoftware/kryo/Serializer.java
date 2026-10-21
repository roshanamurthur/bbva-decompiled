package com.esotericsoftware.kryo;

import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;

/* JADX INFO: loaded from: classes9.dex */
public abstract class Serializer<T> {
    private boolean acceptsNull;
    private boolean immutable;

    public Serializer() {
    }

    public T copy(Kryo kryo, T t10) {
        if (isImmutable()) {
            return t10;
        }
        throw new KryoException("Serializer does not support copy: ".concat(getClass().getName()));
    }

    public boolean getAcceptsNull() {
        return this.acceptsNull;
    }

    public boolean isImmutable() {
        return this.immutable;
    }

    public abstract T read(Kryo kryo, Input input, Class<? extends T> cls);

    public void setAcceptsNull(boolean z10) {
        this.acceptsNull = z10;
    }

    public void setImmutable(boolean z10) {
        this.immutable = z10;
    }

    public abstract void write(Kryo kryo, Output output, T t10);

    public Serializer(boolean z10) {
        this.acceptsNull = z10;
    }

    public Serializer(boolean z10, boolean z11) {
        this.acceptsNull = z10;
        this.immutable = z11;
    }
}
