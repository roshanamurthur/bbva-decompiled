package com.esotericsoftware.kryo.serializers;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.KryoException;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;

/* JADX INFO: loaded from: classes9.dex */
public class EnumNameSerializer extends ImmutableSerializer<Enum> {
    private final Class<? extends Enum> enumType;

    public EnumNameSerializer(Class<? extends Enum> cls) {
        this.enumType = cls;
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public Enum read(Kryo kryo, Input input, Class cls) {
        String string = input.readString();
        try {
            return Enum.valueOf(this.enumType, string);
        } catch (IllegalArgumentException e5) {
            throw new KryoException(androidx.camera.core.processing.f.d("Enum value not found with name: ", string), e5);
        }
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public void write(Kryo kryo, Output output, Enum r3) {
        output.writeString(r3.name());
    }
}
