package com.esotericsoftware.kryo.util;

import androidx.camera.core.impl.utils.c;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import kotlin.text.Typography;
import mx.openpay.library.domain.util.Constant;
import okhttp3.HttpUrl;

/* JADX INFO: loaded from: classes9.dex */
public interface Generics {

    public static class GenericType {
        GenericType[] arguments;
        Type type;

        public GenericType(Class cls, Class cls2, Type type) {
            initialize(cls, cls2, type);
        }

        private void initialize(Class cls, Class cls2, Type type) {
            if (type instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                this.type = (Class) parameterizedType.getRawType();
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                int length = actualTypeArguments.length;
                this.arguments = new GenericType[length];
                for (int i10 = 0; i10 < length; i10++) {
                    this.arguments[i10] = new GenericType(cls, cls2, actualTypeArguments[i10]);
                }
                return;
            }
            if (!(type instanceof GenericArrayType)) {
                this.type = GenericsUtil.resolveType(cls, cls2, type);
                return;
            }
            int i11 = 1;
            while (true) {
                type = ((GenericArrayType) type).getGenericComponentType();
                if (!(type instanceof GenericArrayType)) {
                    break;
                } else {
                    i11++;
                }
            }
            initialize(cls, cls2, type);
            Type typeResolveType = GenericsUtil.resolveType(cls, cls2, type);
            if (typeResolveType instanceof Class) {
                if (i11 == 1) {
                    this.type = Array.newInstance((Class<?>) typeResolveType, 0).getClass();
                } else {
                    this.type = Array.newInstance((Class<?>) typeResolveType, new int[i11]).getClass();
                }
            }
        }

        public Type getType() {
            return this.type;
        }

        public GenericType[] getTypeParameters() {
            return this.arguments;
        }

        public Class resolve(Generics generics) {
            Type type = this.type;
            return type instanceof Class ? (Class) type : generics.resolveTypeVariable((TypeVariable) type);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(32);
            Type type = this.type;
            if (type instanceof Class) {
                Class elementClass = (Class) type;
                boolean zIsArray = elementClass.isArray();
                if (zIsArray) {
                    elementClass = Util.getElementClass(elementClass);
                }
                sb2.append(elementClass.getSimpleName());
                if (this.arguments != null) {
                    sb2.append(Typography.less);
                    int length = this.arguments.length;
                    for (int i10 = 0; i10 < length; i10++) {
                        if (i10 > 0) {
                            sb2.append(", ");
                        }
                        sb2.append(this.arguments[i10].toString());
                    }
                    sb2.append(Typography.greater);
                }
                if (zIsArray) {
                    int dimensionCount = Util.getDimensionCount((Class) this.type);
                    for (int i11 = 0; i11 < dimensionCount; i11++) {
                        sb2.append(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
                    }
                }
            } else {
                sb2.append(type.toString());
            }
            return sb2.toString();
        }
    }

    public static class GenericsHierarchy {
        final int[] counts;
        final TypeVariable[] parameters;
        final int rootTotal;
        final int total;

        public GenericsHierarchy(Class cls) {
            IntArray intArray = new IntArray();
            ArrayList arrayList = new ArrayList();
            Class superclass = cls;
            int iPeek = 0;
            do {
                for (TypeVariable typeVariable : superclass.getTypeParameters()) {
                    arrayList.add(typeVariable);
                    intArray.add(1);
                    Class superclass2 = superclass;
                    while (true) {
                        Type genericSuperclass = superclass2.getGenericSuperclass();
                        superclass2 = superclass2.getSuperclass();
                        if (!(genericSuperclass instanceof ParameterizedType)) {
                            break;
                        }
                        TypeVariable[] typeParameters = superclass2.getTypeParameters();
                        Type[] actualTypeArguments = ((ParameterizedType) genericSuperclass).getActualTypeArguments();
                        int length = actualTypeArguments.length;
                        for (int i10 = 0; i10 < length; i10++) {
                            if (actualTypeArguments[i10] == typeVariable) {
                                typeVariable = typeParameters[i10];
                                arrayList.add(typeVariable);
                                intArray.incr(intArray.size - 1, 1);
                            }
                        }
                    }
                    iPeek += intArray.peek();
                }
                superclass = superclass.getSuperclass();
            } while (superclass != null);
            this.total = iPeek;
            this.rootTotal = cls.getTypeParameters().length;
            this.counts = intArray.toArray();
            this.parameters = (TypeVariable[]) arrayList.toArray(new TypeVariable[arrayList.size()]);
        }

        public String toString() {
            StringBuilder sbD = c.d(Constant.BRACKET_OPEN);
            int[] iArr = this.counts;
            TypeVariable[] typeVariableArr = this.parameters;
            int i10 = 0;
            for (int i11 : iArr) {
                int i12 = i11 + i10;
                while (i10 < i12) {
                    if (sbD.length() > 1) {
                        sbD.append(", ");
                    }
                    GenericDeclaration genericDeclaration = typeVariableArr[i10].getGenericDeclaration();
                    if (genericDeclaration instanceof Class) {
                        sbD.append(((Class) genericDeclaration).getSimpleName());
                    } else {
                        sbD.append(genericDeclaration);
                    }
                    sbD.append(Typography.less);
                    sbD.append(typeVariableArr[i10].getName());
                    sbD.append(Typography.greater);
                    i10++;
                }
            }
            sbD.append(Constant.BRACKET_CLOSE);
            return sbD.toString();
        }
    }

    int getGenericTypesSize();

    Class nextGenericClass();

    GenericType[] nextGenericTypes();

    void popGenericType();

    void popTypeVariables(int i10);

    void pushGenericType(GenericType genericType);

    int pushTypeVariables(GenericsHierarchy genericsHierarchy, GenericType[] genericTypeArr);

    Class resolveTypeVariable(TypeVariable typeVariable);
}
