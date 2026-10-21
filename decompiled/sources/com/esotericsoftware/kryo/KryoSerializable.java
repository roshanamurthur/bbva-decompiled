package com.esotericsoftware.kryo;

import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;

/* JADX INFO: loaded from: classes9.dex */
public interface KryoSerializable {
    void read(Kryo kryo, Input input);

    void write(Kryo kryo, Output output);
}
