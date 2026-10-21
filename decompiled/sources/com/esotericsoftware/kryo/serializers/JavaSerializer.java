package com.esotericsoftware.kryo.serializers;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.KryoException;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import com.esotericsoftware.kryo.util.ObjectMap;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;

/* JADX INFO: loaded from: classes9.dex */
public class JavaSerializer extends Serializer {

    public static class a extends ObjectInputStream {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Kryo f40036p0;

        public a(InputStream inputStream, Kryo kryo) throws IOException {
            super(inputStream);
            this.f40036p0 = kryo;
        }

        @Override // java.io.ObjectInputStream
        public final Class resolveClass(ObjectStreamClass objectStreamClass) {
            try {
                return Class.forName(objectStreamClass.getName(), false, this.f40036p0.getClassLoader());
            } catch (ClassNotFoundException e5) {
                throw new KryoException("Class not found: " + objectStreamClass.getName(), e5);
            }
        }
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public Object read(Kryo kryo, Input input, Class cls) {
        try {
            ObjectMap graphContext = kryo.getGraphContext();
            ObjectInputStream aVar = (ObjectInputStream) graphContext.get(this);
            if (aVar == null) {
                aVar = new a(input, kryo);
                graphContext.put(this, aVar);
            }
            return aVar.readObject();
        } catch (Exception e5) {
            throw new KryoException("Error during Java deserialization.", e5);
        }
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public void write(Kryo kryo, Output output, Object obj) {
        try {
            ObjectMap graphContext = kryo.getGraphContext();
            ObjectOutputStream objectOutputStream = (ObjectOutputStream) graphContext.get(this);
            if (objectOutputStream == null) {
                objectOutputStream = new ObjectOutputStream(output);
                graphContext.put(this, objectOutputStream);
            }
            objectOutputStream.writeObject(obj);
            objectOutputStream.flush();
        } catch (Exception e5) {
            throw new KryoException("Error during Java serialization.", e5);
        }
    }
}
