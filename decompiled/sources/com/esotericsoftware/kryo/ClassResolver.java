package com.esotericsoftware.kryo;

import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;

/* JADX INFO: loaded from: classes9.dex */
public interface ClassResolver {
    Registration getRegistration(int i10);

    Registration getRegistration(Class cls);

    Registration readClass(Input input);

    Registration register(Registration registration);

    Registration registerImplicit(Class cls);

    void reset();

    void setKryo(Kryo kryo);

    Registration unregister(int i10);

    Registration writeClass(Output output, Class cls);
}
