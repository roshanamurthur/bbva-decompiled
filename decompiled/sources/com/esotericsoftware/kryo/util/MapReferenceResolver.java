package com.esotericsoftware.kryo.util;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.ReferenceResolver;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public class MapReferenceResolver implements ReferenceResolver {
    private static final int DEFAULT_CAPACITY = 2048;
    protected Kryo kryo;
    private final int maximumCapacity;
    protected final ArrayList<Object> readObjects;
    protected final IdentityObjectIntMap<Object> writtenObjects;

    public MapReferenceResolver() {
        this(2048);
    }

    @Override // com.esotericsoftware.kryo.ReferenceResolver
    public int addWrittenObject(Object obj) {
        IdentityObjectIntMap<Object> identityObjectIntMap = this.writtenObjects;
        int i10 = identityObjectIntMap.size;
        identityObjectIntMap.put(obj, i10);
        return i10;
    }

    @Override // com.esotericsoftware.kryo.ReferenceResolver
    public Object getReadObject(Class cls, int i10) {
        return this.readObjects.get(i10);
    }

    @Override // com.esotericsoftware.kryo.ReferenceResolver
    public int getWrittenId(Object obj) {
        return this.writtenObjects.get(obj, -1);
    }

    @Override // com.esotericsoftware.kryo.ReferenceResolver
    public int nextReadId(Class cls) {
        int size = this.readObjects.size();
        this.readObjects.add(null);
        return size;
    }

    @Override // com.esotericsoftware.kryo.ReferenceResolver
    public void reset() {
        int size = this.readObjects.size();
        this.readObjects.clear();
        if (size > this.maximumCapacity) {
            this.readObjects.trimToSize();
            this.readObjects.ensureCapacity(this.maximumCapacity);
        }
        this.writtenObjects.clear(this.maximumCapacity);
    }

    @Override // com.esotericsoftware.kryo.ReferenceResolver
    public void setKryo(Kryo kryo) {
        this.kryo = kryo;
    }

    @Override // com.esotericsoftware.kryo.ReferenceResolver
    public void setReadObject(int i10, Object obj) {
        this.readObjects.set(i10, obj);
    }

    @Override // com.esotericsoftware.kryo.ReferenceResolver
    public boolean useReferences(Class cls) {
        return (Util.isWrapperClass(cls) || Util.isEnum(cls)) ? false : true;
    }

    public MapReferenceResolver(int i10) {
        this.writtenObjects = new IdentityObjectIntMap<>();
        this.readObjects = new ArrayList<>();
        this.maximumCapacity = i10;
    }
}
