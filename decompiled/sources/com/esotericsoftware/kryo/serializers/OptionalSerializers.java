package com.esotericsoftware.kryo.serializers;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import com.esotericsoftware.kryo.util.Util;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

/* JADX INFO: loaded from: classes9.dex */
public final class OptionalSerializers {

    public static class OptionalDoubleSerializer extends ImmutableSerializer<OptionalDouble> {
        @Override // com.esotericsoftware.kryo.Serializer
        public /* bridge */ /* synthetic */ void write(Kryo kryo, Output output, Object obj) {
            write(kryo, output, h.c(obj));
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public OptionalDouble read(Kryo kryo, Input input, Class cls) {
            return input.readBoolean() ? OptionalDouble.of(input.readDouble()) : OptionalDouble.empty();
        }

        public void write(Kryo kryo, Output output, OptionalDouble optionalDouble) {
            output.writeBoolean(optionalDouble.isPresent());
            if (optionalDouble.isPresent()) {
                output.writeDouble(optionalDouble.getAsDouble());
            }
        }
    }

    public static class OptionalIntSerializer extends ImmutableSerializer<OptionalInt> {
        @Override // com.esotericsoftware.kryo.Serializer
        public /* bridge */ /* synthetic */ void write(Kryo kryo, Output output, Object obj) {
            write(kryo, output, androidx.core.app.n.e(obj));
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public OptionalInt read(Kryo kryo, Input input, Class cls) {
            return input.readBoolean() ? OptionalInt.of(input.readInt()) : OptionalInt.empty();
        }

        public void write(Kryo kryo, Output output, OptionalInt optionalInt) {
            output.writeBoolean(optionalInt.isPresent());
            if (optionalInt.isPresent()) {
                output.writeInt(optionalInt.getAsInt());
            }
        }
    }

    public static class OptionalLongSerializer extends ImmutableSerializer<OptionalLong> {
        @Override // com.esotericsoftware.kryo.Serializer
        public /* bridge */ /* synthetic */ void write(Kryo kryo, Output output, Object obj) {
            write(kryo, output, androidx.compose.ui.platform.z.d(obj));
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public OptionalLong read(Kryo kryo, Input input, Class cls) {
            return input.readBoolean() ? OptionalLong.of(input.readLong()) : OptionalLong.empty();
        }

        public void write(Kryo kryo, Output output, OptionalLong optionalLong) {
            output.writeBoolean(optionalLong.isPresent());
            if (optionalLong.isPresent()) {
                output.writeLong(optionalLong.getAsLong());
            }
        }
    }

    public static class OptionalSerializer extends Serializer<Optional> {
        public OptionalSerializer() {
            setAcceptsNull(false);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public /* bridge */ /* synthetic */ Optional copy(Kryo kryo, Optional optional) {
            return copy2(kryo, cm.a.b(optional));
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public /* bridge */ /* synthetic */ void write(Kryo kryo, Output output, Optional optional) {
            write2(kryo, output, cm.a.b(optional));
        }

        /* JADX INFO: renamed from: copy, reason: avoid collision after fix types in other method */
        public Optional copy2(Kryo kryo, Optional optional) {
            return optional.isPresent() ? Optional.of(kryo.copy(optional.get())) : optional;
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public Optional read(Kryo kryo, Input input, Class<? extends Optional> cls) {
            return Optional.ofNullable(kryo.readClassAndObject(input));
        }

        /* JADX INFO: renamed from: write, reason: avoid collision after fix types in other method */
        public void write2(Kryo kryo, Output output, Optional optional) {
            kryo.writeClassAndObject(output, optional.isPresent() ? optional.get() : null);
        }
    }

    public static void addDefaultSerializers(Kryo kryo) {
        if (Util.isClassAvailable("java.util.Optional")) {
            kryo.addDefaultSerializer(c.a(), OptionalSerializer.class);
        }
        if (Util.isClassAvailable("java.util.OptionalInt")) {
            kryo.addDefaultSerializer(d.a(), OptionalIntSerializer.class);
        }
        if (Util.isClassAvailable("java.util.OptionalLong")) {
            kryo.addDefaultSerializer(e.a(), OptionalLongSerializer.class);
        }
        if (Util.isClassAvailable("java.util.OptionalDouble")) {
            kryo.addDefaultSerializer(f.a(), OptionalDoubleSerializer.class);
        }
    }
}
