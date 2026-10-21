package com.esotericsoftware.kryo.serializers;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.Registration;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.SerializerFactory;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
public class CollectionSerializer<T extends Collection> extends Serializer<T> {
    private Class elementClass;
    private Serializer elementSerializer;
    private boolean elementsCanBeNull = true;

    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface BindCollection {
        Class elementClass() default Object.class;

        Class<? extends Serializer> elementSerializer() default Serializer.class;

        Class<? extends SerializerFactory> elementSerializerFactory() default SerializerFactory.class;

        boolean elementsCanBeNull() default true;
    }

    public CollectionSerializer() {
        setAcceptsNull(true);
    }

    public T create(Kryo kryo, Input input, Class<? extends T> cls, int i10) {
        if (cls == ArrayList.class) {
            return new ArrayList(i10);
        }
        if (cls == HashSet.class) {
            return new HashSet(Math.max(((int) (i10 / 0.75f)) + 1, 16));
        }
        T t10 = (T) kryo.newInstance(cls);
        if (t10 instanceof ArrayList) {
            ((ArrayList) t10).ensureCapacity(i10);
        }
        return t10;
    }

    public T createCopy(Kryo kryo, T t10) {
        return (T) kryo.newInstance(t10.getClass());
    }

    public Class getElementClass() {
        return this.elementClass;
    }

    public Serializer getElementSerializer() {
        return this.elementSerializer;
    }

    public void setElementClass(Class cls) {
        this.elementClass = cls;
    }

    public void setElementSerializer(Serializer serializer) {
        this.elementSerializer = serializer;
    }

    public void setElementsCanBeNull(boolean z10) {
        this.elementsCanBeNull = z10;
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public T copy(Kryo kryo, T t10) {
        T t11 = (T) createCopy(kryo, t10);
        kryo.reference(t11);
        Iterator it = t10.iterator();
        while (it.hasNext()) {
            t11.add(kryo.copy(it.next()));
        }
        return t11;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x008e A[DONT_INVERT, PHI: r0 r1 r2 r5 r10
      0x008e: PHI (r0v4 java.lang.Class) = (r0v1 java.lang.Class), (r0v3 java.lang.Class), (r0v3 java.lang.Class), (r0v1 java.lang.Class) binds: [B:30:0x0068, B:37:0x0088, B:38:0x008a, B:21:0x0047] A[DONT_GENERATE, DONT_INLINE]
      0x008e: PHI (r1v3 com.esotericsoftware.kryo.Serializer) = 
      (r1v1 com.esotericsoftware.kryo.Serializer)
      (r1v2 com.esotericsoftware.kryo.Serializer)
      (r1v2 com.esotericsoftware.kryo.Serializer)
      (r1v1 com.esotericsoftware.kryo.Serializer)
     binds: [B:30:0x0068, B:37:0x0088, B:38:0x008a, B:21:0x0047] A[DONT_GENERATE, DONT_INLINE]
      0x008e: PHI (r2v2 boolean) = (r2v0 boolean), (r2v0 boolean), (r2v1 boolean), (r2v5 boolean) binds: [B:30:0x0068, B:37:0x0088, B:38:0x008a, B:21:0x0047] A[DONT_GENERATE, DONT_INLINE]
      0x008e: PHI (r5v3 int) = (r5v2 int), (r5v2 int), (r5v2 int), (r5v6 int) binds: [B:30:0x0068, B:37:0x0088, B:38:0x008a, B:21:0x0047] A[DONT_GENERATE, DONT_INLINE]
      0x008e: PHI (r10v2 T extends java.util.Collection) = 
      (r10v1 T extends java.util.Collection)
      (r10v1 T extends java.util.Collection)
      (r10v1 T extends java.util.Collection)
      (r10v4 T extends java.util.Collection)
     binds: [B:30:0x0068, B:37:0x0088, B:38:0x008a, B:21:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:40:0x0090 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0092 A[ADDED_TO_REGION, LOOP:0: B:41:0x0092->B:42:0x0094, LOOP_START, PHI: r4
      0x0092: PHI (r4v7 int) = (r4v0 int), (r4v8 int) binds: [B:40:0x0090, B:42:0x0094] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x0094 A[Catch: all -> 0x002d, LOOP:0: B:41:0x0092->B:42:0x0094, LOOP_END, TryCatch #0 {all -> 0x002d, blocks: (B:9:0x001b, B:12:0x0024, B:20:0x0040, B:42:0x0094, B:44:0x00a0, B:46:0x00ac, B:15:0x0030, B:24:0x0051, B:27:0x005c, B:31:0x006a, B:34:0x0072, B:35:0x0078, B:36:0x0080, B:38:0x008a), top: B:50:0x001b }] */
    /* JADX WARN: Code duplicated, block: B:43:0x009e A[ADDED_TO_REGION, LOOP:1: B:43:0x009e->B:44:0x00a0, LOOP_START, PHI: r4
      0x009e: PHI (r4v5 int) = (r4v0 int), (r4v6 int) binds: [B:40:0x0090, B:44:0x00a0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x00a0 A[Catch: all -> 0x002d, LOOP:1: B:43:0x009e->B:44:0x00a0, LOOP_END, TryCatch #0 {all -> 0x002d, blocks: (B:9:0x001b, B:12:0x0024, B:20:0x0040, B:42:0x0094, B:44:0x00a0, B:46:0x00ac, B:15:0x0030, B:24:0x0051, B:27:0x005c, B:31:0x006a, B:34:0x0072, B:35:0x0078, B:36:0x0080, B:38:0x008a), top: B:50:0x001b }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00aa A[ADDED_TO_REGION, LOOP:2: B:45:0x00aa->B:47:0x00b3, LOOP_START, PHI: r4
      0x00aa: PHI (r4v3 int) = (r4v0 int), (r4v4 int) binds: [B:39:0x008e, B:47:0x00b3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:46:0x00ac A[Catch: all -> 0x002d, TRY_LEAVE, TryCatch #0 {all -> 0x002d, blocks: (B:9:0x001b, B:12:0x0024, B:20:0x0040, B:42:0x0094, B:44:0x00a0, B:46:0x00ac, B:15:0x0030, B:24:0x0051, B:27:0x005c, B:31:0x006a, B:34:0x0072, B:35:0x0078, B:36:0x0080, B:38:0x008a), top: B:50:0x001b }] */
    @Override // com.esotericsoftware.kryo.Serializer
    public T read(Kryo kryo, Input input, Class<? extends T> cls) {
        int i10;
        T t10;
        int varInt;
        Class clsNextGenericClass;
        Class type = this.elementClass;
        Serializer serializer = this.elementSerializer;
        if (serializer == null && (clsNextGenericClass = kryo.getGenerics().nextGenericClass()) != null && kryo.isFinal(clsNextGenericClass)) {
            serializer = kryo.getSerializer(clsNextGenericClass);
            type = clsNextGenericClass;
        }
        try {
            boolean varIntFlag = this.elementsCanBeNull;
            int i11 = 0;
            if (serializer != null) {
                if (varIntFlag) {
                    varIntFlag = input.readVarIntFlag();
                    varInt = input.readVarIntFlag(true);
                } else {
                    varInt = input.readVarInt(true);
                }
                if (varInt != 0) {
                    i10 = varInt - 1;
                    t10 = (T) create(kryo, input, cls, i10);
                    kryo.reference(t10);
                    if (i10 != 0) {
                        if (serializer == null) {
                            while (i11 < i10) {
                                t10.add(kryo.readClassAndObject(input));
                                i11++;
                            }
                        } else if (varIntFlag) {
                            while (i11 < i10) {
                                t10.add(kryo.readObjectOrNull(input, type, serializer));
                                i11++;
                            }
                        } else {
                            while (i11 < i10) {
                                t10.add(kryo.readObject(input, type, serializer));
                                i11++;
                            }
                        }
                    }
                }
                kryo.getGenerics().popGenericType();
                return null;
            }
            boolean varIntFlag2 = input.readVarIntFlag();
            int varIntFlag3 = input.readVarIntFlag(true);
            if (varIntFlag3 == 0) {
                kryo.getGenerics().popGenericType();
                return null;
            }
            i10 = varIntFlag3 - 1;
            t10 = (T) create(kryo, input, cls, i10);
            kryo.reference(t10);
            if (i10 != 0) {
                if (varIntFlag2) {
                    Registration registration = kryo.readClass(input);
                    if (registration == null) {
                        while (i11 < i10) {
                            t10.add(null);
                            i11++;
                        }
                        kryo.getGenerics().popGenericType();
                    } else {
                        type = registration.getType();
                        serializer = kryo.getSerializer(type);
                        if (varIntFlag) {
                            varIntFlag = input.readBoolean();
                        }
                        if (serializer == null) {
                            while (i11 < i10) {
                                t10.add(kryo.readClassAndObject(input));
                                i11++;
                            }
                        } else if (varIntFlag) {
                            while (i11 < i10) {
                                t10.add(kryo.readObjectOrNull(input, type, serializer));
                                i11++;
                            }
                        } else {
                            while (i11 < i10) {
                                t10.add(kryo.readObject(input, type, serializer));
                                i11++;
                            }
                        }
                    }
                } else if (serializer == null) {
                    while (i11 < i10) {
                        t10.add(kryo.readClassAndObject(input));
                        i11++;
                    }
                } else if (varIntFlag) {
                    while (i11 < i10) {
                        t10.add(kryo.readObjectOrNull(input, type, serializer));
                        i11++;
                    }
                } else {
                    while (i11 < i10) {
                        t10.add(kryo.readObject(input, type, serializer));
                        i11++;
                    }
                }
            }
            kryo.getGenerics().popGenericType();
            return t10;
        } catch (Throwable th2) {
            kryo.getGenerics().popGenericType();
            throw th2;
        }
    }

    public void setElementClass(Class cls, Serializer serializer) {
        this.elementClass = cls;
        this.elementSerializer = serializer;
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public void write(Kryo kryo, Output output, T t10) {
        Class clsNextGenericClass;
        boolean z10 = false;
        if (t10 == null) {
            output.writeByte((byte) 0);
            return;
        }
        int size = t10.size();
        if (size == 0) {
            output.writeByte(1);
            writeHeader(kryo, output, t10);
            return;
        }
        boolean z11 = this.elementsCanBeNull;
        Serializer serializer = this.elementSerializer;
        if (serializer == null && (clsNextGenericClass = kryo.getGenerics().nextGenericClass()) != null && kryo.isFinal(clsNextGenericClass)) {
            serializer = kryo.getSerializer(clsNextGenericClass);
        }
        try {
            if (serializer == null) {
                Iterator it = t10.iterator();
                Class<?> cls = null;
                boolean z12 = false;
                while (true) {
                    if (!it.hasNext()) {
                        output.writeVarIntFlag(true, size + 1, true);
                        writeHeader(kryo, output, t10);
                        if (cls != null) {
                            kryo.writeClass(output, cls);
                            serializer = kryo.getSerializer(cls);
                            if (!z11) {
                                break;
                            }
                            output.writeBoolean(z12);
                            z11 = z12;
                            break;
                        }
                        output.writeByte((byte) 0);
                        kryo.getGenerics().popGenericType();
                        return;
                    }
                    Object next = it.next();
                    if (next == null) {
                        z12 = true;
                    } else if (cls == null) {
                        cls = next.getClass();
                    } else if (next.getClass() != cls) {
                        output.writeVarIntFlag(false, size + 1, true);
                        writeHeader(kryo, output, t10);
                        break;
                    }
                }
            } else {
                if (z11) {
                    Iterator it2 = t10.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            output.writeVarIntFlag(false, size + 1, true);
                            break;
                        } else if (it2.next() == null) {
                            output.writeVarIntFlag(true, size + 1, true);
                        }
                    }
                    writeHeader(kryo, output, t10);
                    z11 = z10;
                } else {
                    output.writeVarInt(size + 1, true);
                }
                z10 = z11;
                writeHeader(kryo, output, t10);
                z11 = z10;
            }
            if (serializer == null) {
                Iterator it3 = t10.iterator();
                while (it3.hasNext()) {
                    kryo.writeClassAndObject(output, it3.next());
                }
            } else if (z11) {
                Iterator it4 = t10.iterator();
                while (it4.hasNext()) {
                    kryo.writeObjectOrNull(output, it4.next(), serializer);
                }
            } else {
                Iterator it5 = t10.iterator();
                while (it5.hasNext()) {
                    kryo.writeObject(output, it5.next(), serializer);
                }
            }
            kryo.getGenerics().popGenericType();
        } catch (Throwable th2) {
            kryo.getGenerics().popGenericType();
            throw th2;
        }
    }

    public void writeHeader(Kryo kryo, Output output, T t10) {
    }
}
