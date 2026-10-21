package com.esotericsoftware.kryo.serializers;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.KryoException;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import com.esotericsoftware.kryo.util.Util;
import com.fasterxml.jackson.core.JsonPointer;
import java.io.Serializable;
import java.lang.invoke.SerializedLambda;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes9.dex */
public class ClosureSerializer extends Serializer {
    private static Method readResolve;

    public static class Closure {
    }

    public ClosureSerializer() {
        if (readResolve == null) {
            try {
                Method declaredMethod = SerializedLambda.class.getDeclaredMethod("readResolve", new Class[0]);
                readResolve = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Exception e5) {
                throw new KryoException("Unable to obtain SerializedLambda#readResolve via reflection.", e5);
            }
        }
    }

    private SerializedLambda toSerializedLambda(Object obj) {
        try {
            Method declaredMethod = obj.getClass().getDeclaredMethod("writeReplace", new Class[0]);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(obj, new Object[0]);
            try {
                return (SerializedLambda) objInvoke;
            } catch (Exception e5) {
                StringBuilder sb2 = new StringBuilder("writeReplace must return a SerializedLambda: ");
                sb2.append(objInvoke == null ? null : Util.className(objInvoke.getClass()));
                throw new KryoException(sb2.toString(), e5);
            }
        } catch (Exception e7) {
            if (obj instanceof Serializable) {
                throw new KryoException("Error serializing closure.", e7);
            }
            throw new KryoException("Closure must implement java.io.Serializable.", e7);
        }
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public Object copy(Kryo kryo, Object obj) {
        try {
            return readResolve.invoke(toSerializedLambda(obj), new Object[0]);
        } catch (Exception e5) {
            throw new KryoException("Error copying closure.", e5);
        }
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public Object read(Kryo kryo, Input input, Class cls) {
        int varInt = input.readVarInt(true);
        Object[] objArr = new Object[varInt];
        for (int i10 = 0; i10 < varInt; i10++) {
            objArr[i10] = kryo.readClassAndObject(input);
        }
        try {
            return readResolve.invoke(new SerializedLambda(kryo.readClass(input).getType(), input.readString(), input.readString(), input.readString(), input.readVarInt(true), input.readString(), input.readString(), input.readString(), input.readString(), objArr), new Object[0]);
        } catch (Exception e5) {
            throw new KryoException("Error reading closure.", e5);
        }
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public void write(Kryo kryo, Output output, Object obj) {
        SerializedLambda serializedLambda = toSerializedLambda(obj);
        int capturedArgCount = serializedLambda.getCapturedArgCount();
        output.writeVarInt(capturedArgCount, true);
        for (int i10 = 0; i10 < capturedArgCount; i10++) {
            kryo.writeClassAndObject(output, serializedLambda.getCapturedArg(i10));
        }
        try {
            kryo.writeClass(output, Class.forName(serializedLambda.getCapturingClass().replace(JsonPointer.SEPARATOR, '.')));
            output.writeString(serializedLambda.getFunctionalInterfaceClass());
            output.writeString(serializedLambda.getFunctionalInterfaceMethodName());
            output.writeString(serializedLambda.getFunctionalInterfaceMethodSignature());
            output.writeVarInt(serializedLambda.getImplMethodKind(), true);
            output.writeString(serializedLambda.getImplClass());
            output.writeString(serializedLambda.getImplMethodName());
            output.writeString(serializedLambda.getImplMethodSignature());
            output.writeString(serializedLambda.getInstantiatedMethodType());
        } catch (ClassNotFoundException e5) {
            throw new KryoException("Error writing closure.", e5);
        }
    }
}
