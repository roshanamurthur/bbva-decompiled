package com.esotericsoftware.kryo;

/* JADX INFO: loaded from: classes9.dex */
public interface ReferenceResolver {
    int addWrittenObject(Object obj);

    Object getReadObject(Class cls, int i10);

    int getWrittenId(Object obj);

    int nextReadId(Class cls);

    void reset();

    void setKryo(Kryo kryo);

    void setReadObject(int i10, Object obj);

    boolean useReferences(Class cls);
}
