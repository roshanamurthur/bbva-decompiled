package com.esotericsoftware.kryo.serializers;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.SerializerFactory;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import com.esotericsoftware.kryo.util.Generics;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class MapSerializer<T extends Map> extends Serializer<T> {
    private Class keyClass;
    private Serializer keySerializer;
    private Class valueClass;
    private Serializer valueSerializer;
    private boolean keysCanBeNull = true;
    private boolean valuesCanBeNull = true;

    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface BindMap {
        Class keyClass() default Object.class;

        Class<? extends Serializer> keySerializer() default Serializer.class;

        Class<? extends SerializerFactory> keySerializerFactory() default SerializerFactory.class;

        boolean keysCanBeNull() default true;

        Class valueClass() default Object.class;

        Class<? extends Serializer> valueSerializer() default Serializer.class;

        Class<? extends SerializerFactory> valueSerializerFactory() default SerializerFactory.class;

        boolean valuesCanBeNull() default true;
    }

    public MapSerializer() {
        setAcceptsNull(true);
    }

    public T create(Kryo kryo, Input input, Class<? extends T> cls, int i10) {
        if (cls != HashMap.class) {
            return (T) kryo.newInstance(cls);
        }
        if (i10 < 3) {
            i10++;
        } else if (i10 < 1073741824) {
            i10 = (int) ((i10 / 0.75f) + 1.0f);
        }
        return new HashMap(i10);
    }

    public T createCopy(Kryo kryo, T t10) {
        return (T) kryo.newInstance(t10.getClass());
    }

    public Class getKeyClass() {
        return this.keyClass;
    }

    public Serializer getKeySerializer() {
        return this.keySerializer;
    }

    public Class getValueClass() {
        return this.valueClass;
    }

    public Serializer getValueSerializer() {
        return this.valueSerializer;
    }

    public void setKeyClass(Class cls) {
        this.keyClass = cls;
    }

    public void setKeySerializer(Serializer serializer) {
        this.keySerializer = serializer;
    }

    public void setKeysCanBeNull(boolean z10) {
        this.keysCanBeNull = z10;
    }

    public void setValueClass(Class cls) {
        this.valueClass = cls;
    }

    public void setValueSerializer(Serializer serializer) {
        this.valueSerializer = serializer;
    }

    public void setValuesCanBeNull(boolean z10) {
        this.valuesCanBeNull = z10;
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public T copy(Kryo kryo, T t10) {
        T t11 = (T) createCopy(kryo, t10);
        for (Map.Entry entry : t10.entrySet()) {
            t11.put(kryo.copy(entry.getKey()), kryo.copy(entry.getValue()));
        }
        return t11;
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public T read(Kryo kryo, Input input, Class<? extends T> cls) {
        Class clsResolve;
        Class clsResolve2;
        int varInt = input.readVarInt(true);
        if (varInt == 0) {
            return null;
        }
        int i10 = varInt - 1;
        T t10 = (T) create(kryo, input, cls, i10);
        kryo.reference(t10);
        if (i10 == 0) {
            return t10;
        }
        Class cls2 = this.keyClass;
        Class cls3 = this.valueClass;
        Serializer serializer = this.keySerializer;
        Serializer serializer2 = this.valueSerializer;
        Generics.GenericType[] genericTypeArrNextGenericTypes = kryo.getGenerics().nextGenericTypes();
        if (genericTypeArrNextGenericTypes != null) {
            if (serializer == null && (clsResolve2 = genericTypeArrNextGenericTypes[0].resolve(kryo.getGenerics())) != null && kryo.isFinal(clsResolve2)) {
                serializer = kryo.getSerializer(clsResolve2);
                cls2 = clsResolve2;
            }
            if (serializer2 == null && (clsResolve = genericTypeArrNextGenericTypes[1].resolve(kryo.getGenerics())) != null && kryo.isFinal(clsResolve)) {
                serializer2 = kryo.getSerializer(clsResolve);
                cls3 = clsResolve;
            }
        }
        for (int i11 = 0; i11 < i10; i11++) {
            if (genericTypeArrNextGenericTypes != null) {
                kryo.getGenerics().pushGenericType(genericTypeArrNextGenericTypes[0]);
            }
            Object objectOrNull = serializer != null ? this.keysCanBeNull ? kryo.readObjectOrNull(input, cls2, serializer) : kryo.readObject(input, cls2, serializer) : kryo.readClassAndObject(input);
            if (genericTypeArrNextGenericTypes != null) {
                kryo.getGenerics().popGenericType();
            }
            t10.put(objectOrNull, serializer2 != null ? this.valuesCanBeNull ? kryo.readObjectOrNull(input, cls3, serializer2) : kryo.readObject(input, cls3, serializer2) : kryo.readClassAndObject(input));
        }
        kryo.getGenerics().popGenericType();
        return t10;
    }

    public void setKeyClass(Class cls, Serializer serializer) {
        this.keyClass = cls;
        this.keySerializer = serializer;
    }

    public void setValueClass(Class cls, Serializer serializer) {
        this.valueClass = cls;
        this.valueSerializer = serializer;
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public void write(Kryo kryo, Output output, T t10) {
        Class clsResolve;
        Class clsResolve2;
        if (t10 == null) {
            output.writeByte(0);
            return;
        }
        int size = t10.size();
        if (size == 0) {
            output.writeByte(1);
            writeHeader(kryo, output, t10);
            return;
        }
        output.writeVarInt(size + 1, true);
        writeHeader(kryo, output, t10);
        Serializer serializer = this.keySerializer;
        Serializer serializer2 = this.valueSerializer;
        Generics.GenericType[] genericTypeArrNextGenericTypes = kryo.getGenerics().nextGenericTypes();
        if (genericTypeArrNextGenericTypes != null) {
            if (serializer == null && (clsResolve2 = genericTypeArrNextGenericTypes[0].resolve(kryo.getGenerics())) != null && kryo.isFinal(clsResolve2)) {
                serializer = kryo.getSerializer(clsResolve2);
            }
            if (serializer2 == null && (clsResolve = genericTypeArrNextGenericTypes[1].resolve(kryo.getGenerics())) != null && kryo.isFinal(clsResolve)) {
                serializer2 = kryo.getSerializer(clsResolve);
            }
        }
        for (Map.Entry entry : t10.entrySet()) {
            if (genericTypeArrNextGenericTypes != null) {
                kryo.getGenerics().pushGenericType(genericTypeArrNextGenericTypes[0]);
            }
            if (serializer == null) {
                kryo.writeClassAndObject(output, entry.getKey());
            } else if (this.keysCanBeNull) {
                kryo.writeObjectOrNull(output, entry.getKey(), serializer);
            } else {
                kryo.writeObject(output, entry.getKey(), serializer);
            }
            if (genericTypeArrNextGenericTypes != null) {
                kryo.getGenerics().popGenericType();
            }
            if (serializer2 == null) {
                kryo.writeClassAndObject(output, entry.getValue());
            } else if (this.valuesCanBeNull) {
                kryo.writeObjectOrNull(output, entry.getValue(), serializer2);
            } else {
                kryo.writeObject(output, entry.getValue(), serializer2);
            }
        }
        kryo.getGenerics().popGenericType();
    }

    public void writeHeader(Kryo kryo, Output output, T t10) {
    }
}
