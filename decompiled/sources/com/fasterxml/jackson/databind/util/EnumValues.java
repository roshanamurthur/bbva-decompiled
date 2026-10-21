package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumMap;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class EnumValues implements Serializable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Class<Enum<?>> f43510p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Enum<?>[] f43511q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final SerializableString[] f43512r0;

    public EnumValues(Class<Enum<?>> cls, SerializableString[] serializableStringArr) {
        this.f43510p0 = cls;
        this.f43511q0 = cls.getEnumConstants();
        this.f43512r0 = serializableStringArr;
    }

    public static EnumValues construct(SerializationConfig serializationConfig, Class<Enum<?>> cls) {
        return serializationConfig.isEnabled(SerializationFeature.WRITE_ENUMS_USING_TO_STRING) ? constructFromToString(serializationConfig, cls) : constructFromName(serializationConfig, cls);
    }

    public static EnumValues constructFromName(MapperConfig<?> mapperConfig, Class<Enum<?>> cls) {
        Class<? extends Enum<?>> clsFindEnumType = ClassUtil.findEnumType(cls);
        Enum<?>[] enumArr = (Enum[]) clsFindEnumType.getEnumConstants();
        if (enumArr == null) {
            throw new IllegalArgumentException("Cannot determine enum constants for Class ".concat(cls.getName()));
        }
        String[] strArrFindEnumValues = mapperConfig.getAnnotationIntrospector().findEnumValues(clsFindEnumType, enumArr, new String[enumArr.length]);
        SerializableString[] serializableStringArr = new SerializableString[enumArr.length];
        int length = enumArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            Enum<?> r10 = enumArr[i10];
            String strName = strArrFindEnumValues[i10];
            if (strName == null) {
                strName = r10.name();
            }
            serializableStringArr[r10.ordinal()] = mapperConfig.compileString(strName);
        }
        return new EnumValues(cls, serializableStringArr);
    }

    public static EnumValues constructFromToString(MapperConfig<?> mapperConfig, Class<Enum<?>> cls) {
        Enum[] enumArr = (Enum[]) ClassUtil.findEnumType(cls).getEnumConstants();
        if (enumArr == null) {
            throw new IllegalArgumentException("Cannot determine enum constants for Class ".concat(cls.getName()));
        }
        SerializableString[] serializableStringArr = new SerializableString[enumArr.length];
        for (Enum r4 : enumArr) {
            serializableStringArr[r4.ordinal()] = mapperConfig.compileString(r4.toString());
        }
        return new EnumValues(cls, serializableStringArr);
    }

    public List<Enum<?>> enums() {
        return Arrays.asList(this.f43511q0);
    }

    public Class<Enum<?>> getEnumClass() {
        return this.f43510p0;
    }

    public EnumMap<?, SerializableString> internalMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Enum<?> r4 : this.f43511q0) {
            linkedHashMap.put(r4, this.f43512r0[r4.ordinal()]);
        }
        return new EnumMap<>(linkedHashMap);
    }

    public SerializableString serializedValueFor(Enum<?> r3) {
        return this.f43512r0[r3.ordinal()];
    }

    public Collection<SerializableString> values() {
        return Arrays.asList(this.f43512r0);
    }
}
