package com.esotericsoftware.kryo.serializers;

import com.esotericsoftware.kryo.KryoException;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import com.esotericsoftware.reflectasm.FieldAccess;

/* JADX INFO: compiled from: AsmField.java */
/* JADX INFO: loaded from: classes9.dex */
public final class a extends v {

    /* JADX INFO: renamed from: com.esotericsoftware.kryo.serializers.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AsmField.java */
    public static final class C0191a extends FieldSerializer.CachedField {
        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public final void copy(Object obj, Object obj2) {
            FieldAccess fieldAccess = this.access;
            int i10 = this.accessIndex;
            fieldAccess.setBoolean(obj2, i10, fieldAccess.getBoolean(obj, i10));
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public final void read(Input input, Object obj) {
            this.access.setBoolean(obj, this.accessIndex, input.readBoolean());
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public final void write(Output output, Object obj) {
            output.writeBoolean(this.access.getBoolean(obj, this.accessIndex));
        }
    }

    /* JADX INFO: compiled from: AsmField.java */
    public static final class b extends FieldSerializer.CachedField {
        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public final void copy(Object obj, Object obj2) {
            FieldAccess fieldAccess = this.access;
            int i10 = this.accessIndex;
            fieldAccess.setByte(obj2, i10, fieldAccess.getByte(obj, i10));
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public final void read(Input input, Object obj) {
            this.access.setByte(obj, this.accessIndex, input.readByte());
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public final void write(Output output, Object obj) {
            output.writeByte(this.access.getByte(obj, this.accessIndex));
        }
    }

    /* JADX INFO: compiled from: AsmField.java */
    public static final class c extends FieldSerializer.CachedField {
        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public final void copy(Object obj, Object obj2) {
            FieldAccess fieldAccess = this.access;
            int i10 = this.accessIndex;
            fieldAccess.setChar(obj2, i10, fieldAccess.getChar(obj, i10));
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public final void read(Input input, Object obj) {
            this.access.setChar(obj, this.accessIndex, input.readChar());
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public final void write(Output output, Object obj) {
            output.writeChar(this.access.getChar(obj, this.accessIndex));
        }
    }

    /* JADX INFO: compiled from: AsmField.java */
    public static final class d extends FieldSerializer.CachedField {
        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public final void copy(Object obj, Object obj2) {
            FieldAccess fieldAccess = this.access;
            int i10 = this.accessIndex;
            fieldAccess.setDouble(obj2, i10, fieldAccess.getDouble(obj, i10));
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public final void read(Input input, Object obj) {
            this.access.setDouble(obj, this.accessIndex, input.readDouble());
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public final void write(Output output, Object obj) {
            output.writeDouble(this.access.getDouble(obj, this.accessIndex));
        }
    }

    /* JADX INFO: compiled from: AsmField.java */
    public static final class e extends FieldSerializer.CachedField {
        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public final void copy(Object obj, Object obj2) {
            FieldAccess fieldAccess = this.access;
            int i10 = this.accessIndex;
            fieldAccess.setFloat(obj2, i10, fieldAccess.getFloat(obj, i10));
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public final void read(Input input, Object obj) {
            this.access.setFloat(obj, this.accessIndex, input.readFloat());
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public final void write(Output output, Object obj) {
            output.writeFloat(this.access.getFloat(obj, this.accessIndex));
        }
    }

    /* JADX INFO: compiled from: AsmField.java */
    public static final class f extends FieldSerializer.CachedField {
        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public final void copy(Object obj, Object obj2) {
            FieldAccess fieldAccess = this.access;
            int i10 = this.accessIndex;
            fieldAccess.setInt(obj2, i10, fieldAccess.getInt(obj, i10));
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public final void read(Input input, Object obj) {
            if (this.varEncoding) {
                this.access.setInt(obj, this.accessIndex, input.readVarInt(false));
            } else {
                this.access.setInt(obj, this.accessIndex, input.readInt());
            }
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public final void write(Output output, Object obj) {
            if (this.varEncoding) {
                output.writeVarInt(this.access.getInt(obj, this.accessIndex), false);
            } else {
                output.writeInt(this.access.getInt(obj, this.accessIndex));
            }
        }
    }

    /* JADX INFO: compiled from: AsmField.java */
    public static final class g extends FieldSerializer.CachedField {
        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public final void copy(Object obj, Object obj2) {
            FieldAccess fieldAccess = this.access;
            int i10 = this.accessIndex;
            fieldAccess.setLong(obj2, i10, fieldAccess.getLong(obj, i10));
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public final void read(Input input, Object obj) {
            if (this.varEncoding) {
                this.access.setLong(obj, this.accessIndex, input.readVarLong(false));
            } else {
                this.access.setLong(obj, this.accessIndex, input.readLong());
            }
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public final void write(Output output, Object obj) {
            if (this.varEncoding) {
                output.writeVarLong(this.access.getLong(obj, this.accessIndex), false);
            } else {
                output.writeLong(this.access.getLong(obj, this.accessIndex));
            }
        }
    }

    /* JADX INFO: compiled from: AsmField.java */
    public static final class h extends FieldSerializer.CachedField {
        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public final void copy(Object obj, Object obj2) {
            FieldAccess fieldAccess = this.access;
            int i10 = this.accessIndex;
            fieldAccess.setShort(obj2, i10, fieldAccess.getShort(obj, i10));
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public final void read(Input input, Object obj) {
            this.access.setShort(obj, this.accessIndex, input.readShort());
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public final void write(Output output, Object obj) {
            output.writeShort(this.access.getShort(obj, this.accessIndex));
        }
    }

    /* JADX INFO: compiled from: AsmField.java */
    public static final class i extends FieldSerializer.CachedField {
        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public final void copy(Object obj, Object obj2) {
            FieldAccess fieldAccess = this.access;
            int i10 = this.accessIndex;
            fieldAccess.set(obj2, i10, fieldAccess.getString(obj, i10));
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public final void read(Input input, Object obj) {
            this.access.set(obj, this.accessIndex, input.readString());
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public final void write(Output output, Object obj) {
            output.writeString(this.access.getString(obj, this.accessIndex));
        }
    }

    @Override // com.esotericsoftware.kryo.serializers.v
    public final Object a(Object obj) throws IllegalAccessException {
        return this.access.get(obj, this.accessIndex);
    }

    @Override // com.esotericsoftware.kryo.serializers.v
    public final void c(Object obj, Object obj2) throws IllegalAccessException {
        this.access.set(obj, this.accessIndex, obj2);
    }

    @Override // com.esotericsoftware.kryo.serializers.v, com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
    public final void copy(Object obj, Object obj2) {
        FieldSerializer fieldSerializer = this.f40050a;
        try {
            FieldAccess fieldAccess = this.access;
            int i10 = this.accessIndex;
            fieldAccess.set(obj2, i10, fieldSerializer.kryo.copy(fieldAccess.get(obj, i10)));
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
