package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.deser.KeyDeserializers;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.EnumResolver;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes9.dex */
public class StdKeyDeserializers implements KeyDeserializers, Serializable {
    public static KeyDeserializer constructDelegatingKeyDeserializer(DeserializationConfig deserializationConfig, JavaType javaType, JsonDeserializer<?> jsonDeserializer) {
        return new StdKeyDeserializer.a(javaType.getRawClass(), jsonDeserializer);
    }

    public static KeyDeserializer constructEnumKeyDeserializer(EnumResolver enumResolver) {
        return new StdKeyDeserializer.b(enumResolver, null);
    }

    public static KeyDeserializer findStringBasedKeyDeserializer(DeserializationConfig deserializationConfig, JavaType javaType) {
        BeanDescription beanDescriptionIntrospect = deserializationConfig.introspect(javaType);
        Constructor<?> constructorFindSingleArgConstructor = beanDescriptionIntrospect.findSingleArgConstructor(String.class);
        if (constructorFindSingleArgConstructor != null) {
            if (deserializationConfig.canOverrideAccessModifiers()) {
                ClassUtil.checkAndFixAccess(constructorFindSingleArgConstructor, deserializationConfig.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
            }
            return new StdKeyDeserializer.c(constructorFindSingleArgConstructor);
        }
        Method methodFindFactoryMethod = beanDescriptionIntrospect.findFactoryMethod(String.class);
        if (methodFindFactoryMethod == null) {
            return null;
        }
        if (deserializationConfig.canOverrideAccessModifiers()) {
            ClassUtil.checkAndFixAccess(methodFindFactoryMethod, deserializationConfig.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        return new StdKeyDeserializer.d(methodFindFactoryMethod);
    }

    @Override // com.fasterxml.jackson.databind.deser.KeyDeserializers
    public KeyDeserializer findKeyDeserializer(JavaType javaType, DeserializationConfig deserializationConfig, BeanDescription beanDescription) throws JsonMappingException {
        Class<?> rawClass = javaType.getRawClass();
        if (rawClass.isPrimitive()) {
            rawClass = ClassUtil.wrapperType(rawClass);
        }
        return StdKeyDeserializer.forType(rawClass);
    }

    public static KeyDeserializer constructEnumKeyDeserializer(EnumResolver enumResolver, AnnotatedMethod annotatedMethod) {
        return new StdKeyDeserializer.b(enumResolver, annotatedMethod);
    }
}
