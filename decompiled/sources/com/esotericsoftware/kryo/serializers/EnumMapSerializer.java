package com.esotericsoftware.kryo.serializers;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.io.Input;
import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class EnumMapSerializer extends MapSerializer<EnumMap> {
    private final Class<? extends Enum> enumType;

    public EnumMapSerializer(Class<? extends Enum> cls) {
        this.enumType = cls;
    }

    @Override // com.esotericsoftware.kryo.serializers.MapSerializer
    public /* bridge */ /* synthetic */ Map create(Kryo kryo, Input input, Class cls, int i10) {
        return create(kryo, input, (Class<? extends EnumMap>) cls, i10);
    }

    @Override // com.esotericsoftware.kryo.serializers.MapSerializer
    public EnumMap create(Kryo kryo, Input input, Class<? extends EnumMap> cls, int i10) {
        return new EnumMap(this.enumType);
    }

    @Override // com.esotericsoftware.kryo.serializers.MapSerializer
    public EnumMap createCopy(Kryo kryo, EnumMap enumMap) {
        return new EnumMap(enumMap);
    }
}
