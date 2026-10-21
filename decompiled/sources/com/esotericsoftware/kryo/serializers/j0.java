package com.esotericsoftware.kryo.serializers;

import com.esotericsoftware.kryo.KryoException;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import com.esotericsoftware.kryo.unsafe.UnsafeUtil;
import com.esotericsoftware.kryo.util.Generics;
import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: UnsafeField.java */
/* JADX INFO: loaded from: classes9.dex */
public final class j0 extends v {

    /* JADX INFO: compiled from: UnsafeField.java */
    public static final class a extends FieldSerializer.CachedField {
        public a(Field field) {
            super(field);
            this.offset = UnsafeUtil.unsafe.objectFieldOffset(field);
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public final void copy(Object obj, Object obj2) {
            Unsafe unsafe = UnsafeUtil.unsafe;
            long j10 = this.offset;
            unsafe.putBoolean(obj2, j10, unsafe.getBoolean(obj, j10));
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public final void read(Input input, Object obj) {
            UnsafeUtil.unsafe.putBoolean(obj, this.offset, input.readBoolean());
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public final void write(Output output, Object obj) {
            output.writeBoolean(UnsafeUtil.unsafe.getBoolean(obj, this.offset));
        }
    }

    /* JADX INFO: compiled from: UnsafeField.java */
    public static final class b extends FieldSerializer.CachedField {
        public b(Field field) {
            super(field);
            this.offset = UnsafeUtil.unsafe.objectFieldOffset(field);
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public final void copy(Object obj, Object obj2) {
            Unsafe unsafe = UnsafeUtil.unsafe;
            long j10 = this.offset;
            unsafe.putByte(obj2, j10, unsafe.getByte(obj, j10));
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public final void read(Input input, Object obj) {
            UnsafeUtil.unsafe.putByte(obj, this.offset, input.readByte());
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public final void write(Output output, Object obj) {
            output.writeByte(UnsafeUtil.unsafe.getByte(obj, this.offset));
        }
    }

    /* JADX INFO: compiled from: UnsafeField.java */
    public static final class c extends FieldSerializer.CachedField {
        public c(Field field) {
            super(field);
            this.offset = UnsafeUtil.unsafe.objectFieldOffset(field);
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public final void copy(Object obj, Object obj2) {
            Unsafe unsafe = UnsafeUtil.unsafe;
            long j10 = this.offset;
            unsafe.putChar(obj2, j10, unsafe.getChar(obj, j10));
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public final void read(Input input, Object obj) {
            UnsafeUtil.unsafe.putChar(obj, this.offset, input.readChar());
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public final void write(Output output, Object obj) {
            output.writeChar(UnsafeUtil.unsafe.getChar(obj, this.offset));
        }
    }

    /* JADX INFO: compiled from: UnsafeField.java */
    public static final class d extends FieldSerializer.CachedField {
        public d(Field field) {
            super(field);
            this.offset = UnsafeUtil.unsafe.objectFieldOffset(field);
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public final void copy(Object obj, Object obj2) {
            Unsafe unsafe = UnsafeUtil.unsafe;
            long j10 = this.offset;
            unsafe.putDouble(obj2, j10, unsafe.getDouble(obj, j10));
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public final void read(Input input, Object obj) {
            UnsafeUtil.unsafe.putDouble(obj, this.offset, input.readDouble());
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public final void write(Output output, Object obj) {
            output.writeDouble(UnsafeUtil.unsafe.getDouble(obj, this.offset));
        }
    }

    /* JADX INFO: compiled from: UnsafeField.java */
    public static final class e extends FieldSerializer.CachedField {
        public e(Field field) {
            super(field);
            this.offset = UnsafeUtil.unsafe.objectFieldOffset(field);
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public final void copy(Object obj, Object obj2) {
            Unsafe unsafe = UnsafeUtil.unsafe;
            long j10 = this.offset;
            unsafe.putFloat(obj2, j10, unsafe.getFloat(obj, j10));
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public final void read(Input input, Object obj) {
            UnsafeUtil.unsafe.putFloat(obj, this.offset, input.readFloat());
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public final void write(Output output, Object obj) {
            output.writeFloat(UnsafeUtil.unsafe.getFloat(obj, this.offset));
        }
    }

    /* JADX INFO: compiled from: UnsafeField.java */
    public static final class f extends FieldSerializer.CachedField {
        public f(Field field) {
            super(field);
            this.offset = UnsafeUtil.unsafe.objectFieldOffset(field);
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public final void copy(Object obj, Object obj2) {
            Unsafe unsafe = UnsafeUtil.unsafe;
            long j10 = this.offset;
            unsafe.putInt(obj2, j10, unsafe.getInt(obj, j10));
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public final void read(Input input, Object obj) {
            if (this.varEncoding) {
                UnsafeUtil.unsafe.putInt(obj, this.offset, input.readVarInt(false));
            } else {
                UnsafeUtil.unsafe.putInt(obj, this.offset, input.readInt());
            }
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public final void write(Output output, Object obj) {
            if (this.varEncoding) {
                output.writeVarInt(UnsafeUtil.unsafe.getInt(obj, this.offset), false);
            } else {
                output.writeInt(UnsafeUtil.unsafe.getInt(obj, this.offset));
            }
        }
    }

    /* JADX INFO: compiled from: UnsafeField.java */
    public static final class g extends FieldSerializer.CachedField {
        public g(Field field) {
            super(field);
            this.offset = UnsafeUtil.unsafe.objectFieldOffset(field);
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public final void copy(Object obj, Object obj2) {
            Unsafe unsafe = UnsafeUtil.unsafe;
            long j10 = this.offset;
            unsafe.putLong(obj2, j10, unsafe.getLong(obj, j10));
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public final void read(Input input, Object obj) {
            if (this.varEncoding) {
                UnsafeUtil.unsafe.putLong(obj, this.offset, input.readVarLong(false));
            } else {
                UnsafeUtil.unsafe.putLong(obj, this.offset, input.readLong());
            }
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public final void write(Output output, Object obj) {
            if (this.varEncoding) {
                output.writeVarLong(UnsafeUtil.unsafe.getLong(obj, this.offset), false);
            } else {
                output.writeLong(UnsafeUtil.unsafe.getLong(obj, this.offset));
            }
        }
    }

    /* JADX INFO: compiled from: UnsafeField.java */
    public static final class h extends FieldSerializer.CachedField {
        public h(Field field) {
            super(field);
            this.offset = UnsafeUtil.unsafe.objectFieldOffset(field);
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public final void copy(Object obj, Object obj2) {
            Unsafe unsafe = UnsafeUtil.unsafe;
            long j10 = this.offset;
            unsafe.putShort(obj2, j10, unsafe.getShort(obj, j10));
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public final void read(Input input, Object obj) {
            UnsafeUtil.unsafe.putShort(obj, this.offset, input.readShort());
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public final void write(Output output, Object obj) {
            output.writeShort(UnsafeUtil.unsafe.getShort(obj, this.offset));
        }
    }

    /* JADX INFO: compiled from: UnsafeField.java */
    public static final class i extends FieldSerializer.CachedField {
        public i(Field field) {
            super(field);
            this.offset = UnsafeUtil.unsafe.objectFieldOffset(field);
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public final void copy(Object obj, Object obj2) {
            Unsafe unsafe = UnsafeUtil.unsafe;
            long j10 = this.offset;
            unsafe.putObject(obj2, j10, unsafe.getObject(obj, j10));
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public final void read(Input input, Object obj) {
            UnsafeUtil.unsafe.putObject(obj, this.offset, input.readString());
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public final void write(Output output, Object obj) {
            output.writeString((String) UnsafeUtil.unsafe.getObject(obj, this.offset));
        }
    }

    public j0(Field field, FieldSerializer fieldSerializer, Generics.GenericType genericType) {
        super(field, fieldSerializer, genericType);
        this.offset = UnsafeUtil.unsafe.objectFieldOffset(field);
    }

    @Override // com.esotericsoftware.kryo.serializers.v
    public final Object a(Object obj) throws IllegalAccessException {
        return UnsafeUtil.unsafe.getObject(obj, this.offset);
    }

    @Override // com.esotericsoftware.kryo.serializers.v
    public final void c(Object obj, Object obj2) throws IllegalAccessException {
        UnsafeUtil.unsafe.putObject(obj, this.offset, obj2);
    }

    @Override // com.esotericsoftware.kryo.serializers.v, com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
    public final void copy(Object obj, Object obj2) {
        FieldSerializer fieldSerializer = this.f40050a;
        try {
            Unsafe unsafe = UnsafeUtil.unsafe;
            long j10 = this.offset;
            unsafe.putObject(obj2, j10, fieldSerializer.kryo.copy(unsafe.getObject(obj, j10)));
        } catch (KryoException e5) {
            e5.addTrace(this + " (" + fieldSerializer.type.getName() + ")");
            throw e5;
        } catch (Throwable th2) {
            KryoException kryoException = new KryoException(th2);
            kryoException.addTrace(this + " (" + fieldSerializer.type.getName() + ")");
            throw kryoException;
        }
    }
}
