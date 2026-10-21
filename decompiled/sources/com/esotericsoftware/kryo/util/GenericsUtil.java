package com.esotericsoftware.kryo.util;

import com.esotericsoftware.kryo.KryoException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;

/* JADX INFO: loaded from: classes9.dex */
public class GenericsUtil {
    public static Type resolveType(Class cls, Class cls2, Type type) {
        if (type instanceof Class) {
            return type;
        }
        if (type instanceof TypeVariable) {
            return resolveTypeVariable(cls, cls2, type, true);
        }
        if (type instanceof ParameterizedType) {
            return ((ParameterizedType) type).getRawType();
        }
        if (type instanceof GenericArrayType) {
            int i10 = 1;
            while (true) {
                type = ((GenericArrayType) type).getGenericComponentType();
                if (!(type instanceof GenericArrayType)) {
                    break;
                }
                i10++;
            }
            Type typeResolveType = resolveType(cls, cls2, type);
            if (typeResolveType instanceof Class) {
                return i10 == 1 ? Array.newInstance((Class<?>) typeResolveType, 0).getClass() : Array.newInstance((Class<?>) typeResolveType, new int[i10]).getClass();
            }
            return type;
        }
        if (!(type instanceof WildcardType)) {
            throw new KryoException("Unable to resolve type: " + type);
        }
        WildcardType wildcardType = (WildcardType) type;
        Type type2 = wildcardType.getUpperBounds()[0];
        if (type2 != Object.class) {
            return resolveType(cls, cls2, type2);
        }
        Type[] lowerBounds = wildcardType.getLowerBounds();
        return lowerBounds.length != 0 ? resolveType(cls, cls2, lowerBounds[0]) : Object.class;
    }

    public static Type[] resolveTypeParameters(Class cls, Class cls2, Type type) {
        if (!(type instanceof ParameterizedType)) {
            if (!(type instanceof GenericArrayType)) {
                return null;
            }
            do {
                type = ((GenericArrayType) type).getGenericComponentType();
            } while (type instanceof GenericArrayType);
            return resolveTypeParameters(cls, cls2, type);
        }
        Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
        int length = actualTypeArguments.length;
        Type[] typeArr = new Type[length];
        for (int i10 = 0; i10 < length; i10++) {
            typeArr[i10] = resolveType(cls, cls2, actualTypeArguments[i10]);
        }
        return typeArr;
    }

    private static Type resolveTypeVariable(Class cls, Class cls2, Type type, boolean z10) {
        Type genericSuperclass = cls2.getGenericSuperclass();
        if (!(genericSuperclass instanceof ParameterizedType)) {
            return type;
        }
        Class superclass = cls2.getSuperclass();
        if (superclass != cls) {
            type = resolveTypeVariable(cls, superclass, type, false);
            if (type instanceof Class) {
                return type;
            }
        }
        String string = type.toString();
        TypeVariable[] typeParameters = superclass.getTypeParameters();
        int length = typeParameters.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (typeParameters[i10].getName().equals(string)) {
                Type type2 = ((ParameterizedType) genericSuperclass).getActualTypeArguments()[i10];
                if (type2 instanceof Class) {
                    return type2;
                }
                if (type2 instanceof ParameterizedType) {
                    return resolveType(cls, cls2, type2);
                }
                if (type2 instanceof GenericArrayType) {
                    return resolveType(cls, cls2, type2);
                }
                if (type2 instanceof TypeVariable) {
                    return z10 ? type : type2;
                }
            }
        }
        return type;
    }
}
