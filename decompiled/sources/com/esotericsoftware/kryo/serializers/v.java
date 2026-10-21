package com.esotericsoftware.kryo.serializers;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.KryoException;
import com.esotericsoftware.kryo.Registration;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import com.esotericsoftware.kryo.util.Generics;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: ReflectField.java */
/* JADX INFO: loaded from: classes9.dex */
public class v extends FieldSerializer.CachedField {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FieldSerializer f40050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Generics.GenericType f40051b;

    /* JADX INFO: compiled from: ReflectField.java */
    public static final class a extends FieldSerializer.CachedField {
        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public final void copy(Object obj, Object obj2) {
            try {
                Field field = this.field;
                field.setBoolean(obj2, field.getBoolean(obj));
            } catch (Throwable th2) {
                KryoException kryoException = new KryoException(th2);
                androidx.collection.d.b(new StringBuilder(), this.name, " (boolean)", kryoException);
                throw kryoException;
            }
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public final void read(Input input, Object obj) {
            try {
                this.field.setBoolean(obj, input.readBoolean());
            } catch (Throwable th2) {
                KryoException kryoException = new KryoException(th2);
                androidx.collection.d.b(new StringBuilder(), this.name, " (boolean)", kryoException);
                throw kryoException;
            }
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public final void write(Output output, Object obj) {
            try {
                output.writeBoolean(this.field.getBoolean(obj));
            } catch (Throwable th2) {
                KryoException kryoException = new KryoException(th2);
                androidx.collection.d.b(new StringBuilder(), this.name, " (boolean)", kryoException);
                throw kryoException;
            }
        }
    }

    /* JADX INFO: compiled from: ReflectField.java */
    public static final class b extends FieldSerializer.CachedField {
        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public final void copy(Object obj, Object obj2) {
            try {
                Field field = this.field;
                field.setByte(obj2, field.getByte(obj));
            } catch (Throwable th2) {
                KryoException kryoException = new KryoException(th2);
                androidx.collection.d.b(new StringBuilder(), this.name, " (byte)", kryoException);
                throw kryoException;
            }
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public final void read(Input input, Object obj) {
            try {
                this.field.setByte(obj, input.readByte());
            } catch (Throwable th2) {
                KryoException kryoException = new KryoException(th2);
                androidx.collection.d.b(new StringBuilder(), this.name, " (byte)", kryoException);
                throw kryoException;
            }
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public final void write(Output output, Object obj) {
            try {
                output.writeByte(this.field.getByte(obj));
            } catch (Throwable th2) {
                KryoException kryoException = new KryoException(th2);
                androidx.collection.d.b(new StringBuilder(), this.name, " (byte)", kryoException);
                throw kryoException;
            }
        }
    }

    /* JADX INFO: compiled from: ReflectField.java */
    public static final class c extends FieldSerializer.CachedField {
        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public final void copy(Object obj, Object obj2) {
            try {
                Field field = this.field;
                field.setChar(obj2, field.getChar(obj));
            } catch (Throwable th2) {
                KryoException kryoException = new KryoException(th2);
                androidx.collection.d.b(new StringBuilder(), this.name, " (char)", kryoException);
                throw kryoException;
            }
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public final void read(Input input, Object obj) {
            try {
                this.field.setChar(obj, input.readChar());
            } catch (Throwable th2) {
                KryoException kryoException = new KryoException(th2);
                androidx.collection.d.b(new StringBuilder(), this.name, " (char)", kryoException);
                throw kryoException;
            }
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public final void write(Output output, Object obj) {
            try {
                output.writeChar(this.field.getChar(obj));
            } catch (Throwable th2) {
                KryoException kryoException = new KryoException(th2);
                androidx.collection.d.b(new StringBuilder(), this.name, " (char)", kryoException);
                throw kryoException;
            }
        }
    }

    /* JADX INFO: compiled from: ReflectField.java */
    public static final class d extends FieldSerializer.CachedField {
        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public final void copy(Object obj, Object obj2) {
            try {
                Field field = this.field;
                field.setDouble(obj2, field.getDouble(obj));
            } catch (Throwable th2) {
                KryoException kryoException = new KryoException(th2);
                androidx.collection.d.b(new StringBuilder(), this.name, " (double)", kryoException);
                throw kryoException;
            }
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public final void read(Input input, Object obj) {
            try {
                this.field.setDouble(obj, input.readDouble());
            } catch (Throwable th2) {
                KryoException kryoException = new KryoException(th2);
                androidx.collection.d.b(new StringBuilder(), this.name, " (double)", kryoException);
                throw kryoException;
            }
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public final void write(Output output, Object obj) {
            try {
                output.writeDouble(this.field.getDouble(obj));
            } catch (Throwable th2) {
                KryoException kryoException = new KryoException(th2);
                androidx.collection.d.b(new StringBuilder(), this.name, " (double)", kryoException);
                throw kryoException;
            }
        }
    }

    /* JADX INFO: compiled from: ReflectField.java */
    public static final class e extends FieldSerializer.CachedField {
        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public final void copy(Object obj, Object obj2) {
            try {
                Field field = this.field;
                field.setFloat(obj2, field.getFloat(obj));
            } catch (Throwable th2) {
                KryoException kryoException = new KryoException(th2);
                androidx.collection.d.b(new StringBuilder(), this.name, " (float)", kryoException);
                throw kryoException;
            }
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public final void read(Input input, Object obj) {
            try {
                this.field.setFloat(obj, input.readFloat());
            } catch (Throwable th2) {
                KryoException kryoException = new KryoException(th2);
                androidx.collection.d.b(new StringBuilder(), this.name, " (float)", kryoException);
                throw kryoException;
            }
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public final void write(Output output, Object obj) {
            try {
                output.writeFloat(this.field.getFloat(obj));
            } catch (Throwable th2) {
                KryoException kryoException = new KryoException(th2);
                androidx.collection.d.b(new StringBuilder(), this.name, " (float)", kryoException);
                throw kryoException;
            }
        }
    }

    /* JADX INFO: compiled from: ReflectField.java */
    public static final class f extends FieldSerializer.CachedField {
        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public final void copy(Object obj, Object obj2) {
            try {
                Field field = this.field;
                field.setInt(obj2, field.getInt(obj));
            } catch (Throwable th2) {
                KryoException kryoException = new KryoException(th2);
                androidx.collection.d.b(new StringBuilder(), this.name, " (int)", kryoException);
                throw kryoException;
            }
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public final void read(Input input, Object obj) {
            try {
                if (this.varEncoding) {
                    this.field.setInt(obj, input.readVarInt(false));
                } else {
                    this.field.setInt(obj, input.readInt());
                }
            } catch (Throwable th2) {
                KryoException kryoException = new KryoException(th2);
                androidx.collection.d.b(new StringBuilder(), this.name, " (int)", kryoException);
                throw kryoException;
            }
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public final void write(Output output, Object obj) {
            try {
                if (this.varEncoding) {
                    output.writeVarInt(this.field.getInt(obj), false);
                } else {
                    output.writeInt(this.field.getInt(obj));
                }
            } catch (Throwable th2) {
                KryoException kryoException = new KryoException(th2);
                androidx.collection.d.b(new StringBuilder(), this.name, " (int)", kryoException);
                throw kryoException;
            }
        }
    }

    /* JADX INFO: compiled from: ReflectField.java */
    public static final class g extends FieldSerializer.CachedField {
        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public final void copy(Object obj, Object obj2) {
            try {
                Field field = this.field;
                field.setLong(obj2, field.getLong(obj));
            } catch (Throwable th2) {
                KryoException kryoException = new KryoException(th2);
                androidx.collection.d.b(new StringBuilder(), this.name, " (long)", kryoException);
                throw kryoException;
            }
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public final void read(Input input, Object obj) {
            try {
                if (this.varEncoding) {
                    this.field.setLong(obj, input.readVarLong(false));
                } else {
                    this.field.setLong(obj, input.readLong());
                }
            } catch (Throwable th2) {
                KryoException kryoException = new KryoException(th2);
                androidx.collection.d.b(new StringBuilder(), this.name, " (long)", kryoException);
                throw kryoException;
            }
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public final void write(Output output, Object obj) {
            try {
                if (this.varEncoding) {
                    output.writeVarLong(this.field.getLong(obj), false);
                } else {
                    output.writeLong(this.field.getLong(obj));
                }
            } catch (Throwable th2) {
                KryoException kryoException = new KryoException(th2);
                androidx.collection.d.b(new StringBuilder(), this.name, " (long)", kryoException);
                throw kryoException;
            }
        }
    }

    /* JADX INFO: compiled from: ReflectField.java */
    public static final class h extends FieldSerializer.CachedField {
        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public final void copy(Object obj, Object obj2) {
            try {
                Field field = this.field;
                field.setShort(obj2, field.getShort(obj));
            } catch (Throwable th2) {
                KryoException kryoException = new KryoException(th2);
                androidx.collection.d.b(new StringBuilder(), this.name, " (short)", kryoException);
                throw kryoException;
            }
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public final void read(Input input, Object obj) {
            try {
                this.field.setShort(obj, input.readShort());
            } catch (Throwable th2) {
                KryoException kryoException = new KryoException(th2);
                androidx.collection.d.b(new StringBuilder(), this.name, " (short)", kryoException);
                throw kryoException;
            }
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public final void write(Output output, Object obj) {
            try {
                output.writeShort(this.field.getShort(obj));
            } catch (Throwable th2) {
                KryoException kryoException = new KryoException(th2);
                androidx.collection.d.b(new StringBuilder(), this.name, " (short)", kryoException);
                throw kryoException;
            }
        }
    }

    public v(Field field, FieldSerializer fieldSerializer, Generics.GenericType genericType) {
        super(field);
        this.f40050a = fieldSerializer;
        this.f40051b = genericType;
    }

    public Object a(Object obj) throws IllegalAccessException {
        return this.field.get(obj);
    }

    public final Class b() {
        if (this.valueClass == null) {
            FieldSerializer fieldSerializer = this.f40050a;
            Class clsResolve = this.f40051b.resolve(fieldSerializer.kryo.getGenerics());
            if (clsResolve != null && fieldSerializer.kryo.isFinal(clsResolve)) {
                return clsResolve;
            }
        }
        return this.valueClass;
    }

    public void c(Object obj, Object obj2) throws IllegalAccessException {
        this.field.set(obj, obj2);
    }

    @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
    public void copy(Object obj, Object obj2) {
        FieldSerializer fieldSerializer = this.f40050a;
        try {
            c(obj2, fieldSerializer.kryo.copy(a(obj)));
        } catch (KryoException e5) {
            e5.addTrace(this.name + " (" + fieldSerializer.type.getName() + ")");
            throw e5;
        } catch (IllegalAccessException e7) {
            StringBuilder sb2 = new StringBuilder("Error accessing field: ");
            sb2.append(this.name);
            sb2.append(" (");
            throw new KryoException(androidx.datastore.preferences.protobuf.e.e(fieldSerializer.type, sb2, ")"), e7);
        } catch (Throwable th2) {
            KryoException kryoException = new KryoException(th2);
            kryoException.addTrace(this.name + " (" + fieldSerializer.type.getName() + ")");
            throw kryoException;
        }
    }

    @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
    public final void read(Input input, Object obj) {
        Object objectOrNull;
        FieldSerializer fieldSerializer = this.f40050a;
        Kryo kryo = fieldSerializer.kryo;
        try {
            Serializer serializer = this.serializer;
            Class clsB = b();
            Generics.GenericType genericType = this.f40051b;
            if (clsB == null) {
                Registration registration = kryo.readClass(input);
                if (registration == null) {
                    c(obj, null);
                    return;
                }
                if (serializer == null) {
                    serializer = registration.getSerializer();
                }
                kryo.getGenerics().pushGenericType(genericType);
                objectOrNull = kryo.readObject(input, registration.getType(), serializer);
            } else {
                if (serializer == null) {
                    serializer = kryo.getSerializer(clsB);
                    if (this.valueClass != null && this.reuseSerializer) {
                        this.serializer = serializer;
                    }
                }
                kryo.getGenerics().pushGenericType(genericType);
                objectOrNull = this.canBeNull ? kryo.readObjectOrNull(input, clsB, serializer) : kryo.readObject(input, clsB, serializer);
            }
            kryo.getGenerics().popGenericType();
            c(obj, objectOrNull);
        } catch (KryoException e5) {
            e5.addTrace(this.name + " (" + fieldSerializer.type.getName() + ")");
            throw e5;
        } catch (IllegalAccessException e7) {
            StringBuilder sb2 = new StringBuilder("Error accessing field: ");
            sb2.append(this.name);
            sb2.append(" (");
            throw new KryoException(androidx.datastore.preferences.protobuf.e.e(fieldSerializer.type, sb2, ")"), e7);
        } catch (Throwable th2) {
            KryoException kryoException = new KryoException(th2);
            kryoException.addTrace(this.name + " (" + fieldSerializer.type.getName() + ")");
            throw kryoException;
        }
    }

    @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
    public final void write(Output output, Object obj) {
        Kryo kryo = this.f40050a.kryo;
        try {
            Object objA = a(obj);
            Serializer serializer = this.serializer;
            Class clsB = b();
            Generics.GenericType genericType = this.f40051b;
            if (clsB != null) {
                if (serializer == null) {
                    serializer = kryo.getSerializer(clsB);
                    if (this.valueClass != null && this.reuseSerializer) {
                        this.serializer = serializer;
                    }
                }
                kryo.getGenerics().pushGenericType(genericType);
                if (this.canBeNull) {
                    kryo.writeObjectOrNull(output, objA, serializer);
                } else {
                    if (objA == null) {
                        throw new KryoException("Field value cannot be null when canBeNull is false: " + this.name + " (" + obj.getClass().getName() + ")");
                    }
                    kryo.writeObject(output, objA, serializer);
                }
            } else {
                if (objA == null) {
                    kryo.writeClass(output, null);
                    return;
                }
                Registration registrationWriteClass = kryo.writeClass(output, objA.getClass());
                if (serializer == null) {
                    serializer = registrationWriteClass.getSerializer();
                }
                kryo.getGenerics().pushGenericType(genericType);
                kryo.writeObject(output, objA, serializer);
            }
            kryo.getGenerics().popGenericType();
        } catch (KryoException e5) {
            e5.addTrace(this.name + " (" + obj.getClass().getName() + ")");
            throw e5;
        } catch (IllegalAccessException e7) {
            throw new KryoException("Error accessing field: " + this.name + " (" + obj.getClass().getName() + ")", e7);
        } catch (StackOverflowError e10) {
            throw new KryoException("A StackOverflow occurred. The most likely cause is that your data has a circular reference resulting in infinite recursion. Try enabling references with Kryo.setReferences(true). If your data structure is really more than " + kryo.getDepth() + " levels deep then try increasing your Java stack size.", e10);
        } catch (Throwable th2) {
            KryoException kryoException = new KryoException(th2);
            kryoException.addTrace(this.name + " (" + obj.getClass().getName() + ")");
            throw kryoException;
        }
    }
}
