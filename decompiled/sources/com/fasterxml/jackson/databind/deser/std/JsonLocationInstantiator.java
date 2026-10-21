package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.CreatorProperty;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;

/* JADX INFO: loaded from: classes9.dex */
public class JsonLocationInstantiator extends ValueInstantiator.Base {
    public JsonLocationInstantiator() {
        super((Class<?>) JsonLocation.class);
    }

    public static CreatorProperty a(String str, JavaType javaType, int i10) {
        return new CreatorProperty(PropertyName.construct(str), javaType, null, null, null, null, i10, null, PropertyMetadata.STD_REQUIRED);
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public boolean canCreateFromObjectWith() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public Object createFromObjectWith(DeserializationContext deserializationContext, Object[] objArr) {
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        long jLongValue = obj2 == null ? 0L : ((Number) obj2).longValue();
        Object obj3 = objArr[2];
        long jLongValue2 = obj3 == null ? 0L : ((Number) obj3).longValue();
        Object obj4 = objArr[3];
        int iIntValue = obj4 == null ? 0 : ((Number) obj4).intValue();
        Object obj5 = objArr[4];
        return new JsonLocation(obj, jLongValue, jLongValue2, iIntValue, obj5 == null ? 0 : ((Number) obj5).intValue());
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public SettableBeanProperty[] getFromObjectArguments(DeserializationConfig deserializationConfig) {
        JavaType javaTypeConstructType = deserializationConfig.constructType(Integer.TYPE);
        JavaType javaTypeConstructType2 = deserializationConfig.constructType(Long.TYPE);
        return new SettableBeanProperty[]{a("sourceRef", deserializationConfig.constructType(Object.class), 0), a("byteOffset", javaTypeConstructType2, 1), a("charOffset", javaTypeConstructType2, 2), a("lineNr", javaTypeConstructType, 3), a("columnNr", javaTypeConstructType, 4)};
    }
}
