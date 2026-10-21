package com.facetec.sdk;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Properties;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okhttp3.HttpUrl;

/* JADX INFO: loaded from: classes9.dex */
public final class ey {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final Type[] f41516e = new Type[0];

    public static final class a implements Serializable, GenericArrayType {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Type f41517b;

        public a(Type type) {
            this.f41517b = ey.a(type);
        }

        public final boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && ey.e(this, (GenericArrayType) obj);
        }

        @Override // java.lang.reflect.GenericArrayType
        public final Type getGenericComponentType() {
            return this.f41517b;
        }

        public final int hashCode() {
            return this.f41517b.hashCode();
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(ey.b(this.f41517b));
            sb2.append(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
            return sb2.toString();
        }
    }

    public static final class d implements Serializable, ParameterizedType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Type f41518a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Type[] f41519b;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Type f41520e;

        public d(Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                Class cls = (Class) type2;
                boolean z10 = true;
                boolean z11 = Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null;
                if (type == null && !z11) {
                    z10 = false;
                }
                er.b(z10);
            }
            this.f41518a = type == null ? null : ey.a(type);
            this.f41520e = ey.a(type2);
            Type[] typeArr2 = (Type[]) typeArr.clone();
            this.f41519b = typeArr2;
            int length = typeArr2.length;
            for (int i10 = 0; i10 < length; i10++) {
                er.b(this.f41519b[i10]);
                ey.c(this.f41519b[i10]);
                Type[] typeArr3 = this.f41519b;
                typeArr3[i10] = ey.a(typeArr3[i10]);
            }
        }

        public final boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && ey.e(this, (ParameterizedType) obj);
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type[] getActualTypeArguments() {
            return (Type[]) this.f41519b.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type getOwnerType() {
            return this.f41518a;
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type getRawType() {
            return this.f41520e;
        }

        public final int hashCode() {
            return (Arrays.hashCode(this.f41519b) ^ this.f41520e.hashCode()) ^ ey.a((Object) this.f41518a);
        }

        public final String toString() {
            int length = this.f41519b.length;
            if (length == 0) {
                return ey.b(this.f41520e);
            }
            StringBuilder sb2 = new StringBuilder((length + 1) * 30);
            sb2.append(ey.b(this.f41520e));
            sb2.append("<");
            sb2.append(ey.b(this.f41519b[0]));
            for (int i10 = 1; i10 < length; i10++) {
                sb2.append(", ");
                sb2.append(ey.b(this.f41519b[i10]));
            }
            sb2.append(">");
            return sb2.toString();
        }
    }

    public static final class e implements Serializable, WildcardType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Type f41521a;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Type f41522e;

        public e(Type[] typeArr, Type[] typeArr2) {
            er.b(typeArr2.length <= 1);
            er.b(typeArr.length == 1);
            if (typeArr2.length != 1) {
                er.b(typeArr[0]);
                ey.c(typeArr[0]);
                this.f41521a = null;
                this.f41522e = ey.a(typeArr[0]);
                return;
            }
            er.b(typeArr2[0]);
            ey.c(typeArr2[0]);
            er.b(typeArr[0] == Object.class);
            this.f41521a = ey.a(typeArr2[0]);
            this.f41522e = Object.class;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof WildcardType) && ey.e(this, (WildcardType) obj);
        }

        @Override // java.lang.reflect.WildcardType
        public final Type[] getLowerBounds() {
            Type type = this.f41521a;
            return type != null ? new Type[]{type} : ey.f41516e;
        }

        @Override // java.lang.reflect.WildcardType
        public final Type[] getUpperBounds() {
            return new Type[]{this.f41522e};
        }

        public final int hashCode() {
            Type type = this.f41521a;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f41522e.hashCode() + 31);
        }

        public final String toString() {
            if (this.f41521a != null) {
                StringBuilder sb2 = new StringBuilder("? super ");
                sb2.append(ey.b(this.f41521a));
                return sb2.toString();
            }
            if (this.f41522e == Object.class) {
                return "?";
            }
            StringBuilder sb3 = new StringBuilder("? extends ");
            sb3.append(ey.b(this.f41522e));
            return sb3.toString();
        }
    }

    public static Type a(Type type) {
        Type aVar;
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (cls.isArray()) {
                aVar = cls;
                aVar = new a(a((Type) cls.getComponentType()));
            }
            aVar = cls;
            return aVar;
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new d(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            return new a(((GenericArrayType) type).getGenericComponentType());
        }
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        return new e(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
    }

    public static String b(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    private static ParameterizedType c(Type type, Type type2, Type... typeArr) {
        return new d(type, type2, typeArr);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0037 A[LOOP:2: B:19:0x0037->B:28:0x0051, LOOP_START, PHI: r5
      0x0037: PHI (r5v2 java.lang.Class<?>) = (r5v1 java.lang.Class<?>), (r5v4 java.lang.Class<?>) binds: [B:18:0x0035, B:28:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:21:0x003b  */
    /* JADX WARN: Code duplicated, block: B:25:0x0046  */
    /* JADX WARN: Code duplicated, block: B:28:0x0051 A[LOOP:2: B:19:0x0037->B:28:0x0051, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:32:0x0053 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0041 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x004c A[SYNTHETIC] */
    private static Type d(Type type, Class<?> cls, Class<?> cls2) {
        Class<?> superclass;
        Type genericSuperclass;
        while (cls2 != cls) {
            if (!cls2.isInterface()) {
                if (!cls.isInterface()) {
                    while (cls != Object.class) {
                        superclass = cls.getSuperclass();
                        if (superclass == cls2) {
                            return cls.getGenericSuperclass();
                        }
                        if (cls2.isAssignableFrom(superclass)) {
                            genericSuperclass = cls.getGenericSuperclass();
                        } else {
                            cls = superclass;
                        }
                    }
                }
                return cls2;
            }
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    if (!cls.isInterface()) {
                        while (cls != Object.class) {
                            superclass = cls.getSuperclass();
                            if (superclass == cls2) {
                                return cls.getGenericSuperclass();
                            }
                            if (cls2.isAssignableFrom(superclass)) {
                                genericSuperclass = cls.getGenericSuperclass();
                            } else {
                                cls = superclass;
                            }
                        }
                    }
                    return cls2;
                }
                Class<?> cls3 = interfaces[i10];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i10];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    genericSuperclass = cls.getGenericInterfaces()[i10];
                    superclass = interfaces[i10];
                } else {
                    i10++;
                }
            }
            Type type2 = genericSuperclass;
            cls = superclass;
            type = type2;
        }
        return type;
    }

    public static Class<?> e(Type type) {
        while (!(type instanceof Class)) {
            if (type instanceof ParameterizedType) {
                Type rawType = ((ParameterizedType) type).getRawType();
                er.b(rawType instanceof Class);
                return (Class) rawType;
            }
            if (type instanceof GenericArrayType) {
                return Array.newInstance(e(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
            }
            if (type instanceof TypeVariable) {
                return Object.class;
            }
            if (!(type instanceof WildcardType)) {
                String name = type == null ? AbstractJsonLexerKt.NULL : type.getClass().getName();
                StringBuilder sb2 = new StringBuilder("Expected a Class, ParameterizedType, or GenericArrayType, but <");
                sb2.append(type);
                sb2.append("> is of type ");
                sb2.append(name);
                throw new IllegalArgumentException(sb2.toString());
            }
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        return (Class) type;
    }

    private static WildcardType f(Type type) {
        return new e(type instanceof WildcardType ? ((WildcardType) type).getUpperBounds() : new Type[]{type}, f41516e);
    }

    private static GenericArrayType i(Type type) {
        return new a(type);
    }

    private static WildcardType j(Type type) {
        return new e(new Type[]{Object.class}, type instanceof WildcardType ? ((WildcardType) type).getLowerBounds() : new Type[]{type});
    }

    public static Type b(Type type, Class<?> cls) {
        Type typeE = e(type, cls, Collection.class);
        if (typeE instanceof WildcardType) {
            typeE = ((WildcardType) typeE).getUpperBounds()[0];
        }
        return typeE instanceof ParameterizedType ? ((ParameterizedType) typeE).getActualTypeArguments()[0] : Object.class;
    }

    private static boolean c(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static Type c(Type type, Class<?> cls, Type type2) {
        return c(type, cls, type2, new HashSet());
    }

    private static Type c(Type type, Class<?> cls, Type type2, Collection<TypeVariable> collection) {
        Type type3;
        WildcardType wildcardType;
        while (type2 instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) type2;
            if (collection.contains(typeVariable)) {
                return type2;
            }
            collection.add(typeVariable);
            type2 = b(type, cls, typeVariable);
            if (type2 == typeVariable) {
                return type2;
            }
        }
        if (type2 instanceof Class) {
            Class cls2 = (Class) type2;
            if (cls2.isArray()) {
                Class<?> componentType = cls2.getComponentType();
                Type typeC = c(type, cls, componentType, collection);
                return componentType == typeC ? cls2 : i(typeC);
            }
        }
        if (type2 instanceof GenericArrayType) {
            GenericArrayType genericArrayType = (GenericArrayType) type2;
            Type genericComponentType = genericArrayType.getGenericComponentType();
            Type typeC2 = c(type, cls, genericComponentType, collection);
            return genericComponentType == typeC2 ? genericArrayType : i(typeC2);
        }
        if (type2 instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type2;
            Type ownerType = parameterizedType.getOwnerType();
            Type typeC3 = c(type, cls, ownerType, collection);
            boolean z10 = typeC3 != ownerType;
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            int length = actualTypeArguments.length;
            for (int i10 = 0; i10 < length; i10++) {
                Type typeC4 = c(type, cls, actualTypeArguments[i10], collection);
                if (typeC4 != actualTypeArguments[i10]) {
                    if (!z10) {
                        actualTypeArguments = (Type[]) actualTypeArguments.clone();
                        z10 = true;
                    }
                    actualTypeArguments[i10] = typeC4;
                }
            }
            return z10 ? c(typeC3, parameterizedType.getRawType(), actualTypeArguments) : parameterizedType;
        }
        if (type2 instanceof WildcardType) {
            wildcardType = (WildcardType) type2;
            Type[] lowerBounds = wildcardType.getLowerBounds();
            Type[] upperBounds = wildcardType.getUpperBounds();
            if (lowerBounds.length == 1) {
                Type typeC5 = c(type, cls, lowerBounds[0], collection);
                if (typeC5 != lowerBounds[0]) {
                    type3 = type2;
                    type3 = wildcardType;
                    return j(typeC5);
                }
            } else if (upperBounds.length == 1) {
                type3 = type2;
                type3 = wildcardType;
                Type typeC6 = c(type, cls, upperBounds[0], collection);
                type3 = wildcardType;
                if (typeC6 != upperBounds[0]) {
                    return f(typeC6);
                }
            }
        }
        type3 = type2;
        type3 = wildcardType;
        type3 = type2;
        type3 = wildcardType;
        type3 = type2;
        return type3;
    }

    private static Type b(Type type, Class<?> cls, TypeVariable<?> typeVariable) {
        Class<?> clsD = d(typeVariable);
        if (clsD == null) {
            return typeVariable;
        }
        Type typeD = d(type, cls, clsD);
        if (!(typeD instanceof ParameterizedType)) {
            return typeVariable;
        }
        return ((ParameterizedType) typeD).getActualTypeArguments()[d(clsD.getTypeParameters(), typeVariable)];
    }

    public static int a(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public static Type d(Type type) {
        if (type instanceof GenericArrayType) {
            return ((GenericArrayType) type).getGenericComponentType();
        }
        return ((Class) type).getComponentType();
    }

    private static int d(Object[] objArr, Object obj) {
        int length = objArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (obj.equals(objArr[i10])) {
                return i10;
            }
        }
        throw new NoSuchElementException();
    }

    public static boolean e(Type type, Type type2) {
        while (type != type2) {
            if (type instanceof Class) {
                return type.equals(type2);
            }
            if (type instanceof ParameterizedType) {
                if (!(type2 instanceof ParameterizedType)) {
                    return false;
                }
                ParameterizedType parameterizedType = (ParameterizedType) type;
                ParameterizedType parameterizedType2 = (ParameterizedType) type2;
                return c(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
            }
            if (type instanceof GenericArrayType) {
                if (!(type2 instanceof GenericArrayType)) {
                    return false;
                }
                type = ((GenericArrayType) type).getGenericComponentType();
                type2 = ((GenericArrayType) type2).getGenericComponentType();
            } else {
                if (type instanceof WildcardType) {
                    if (!(type2 instanceof WildcardType)) {
                        return false;
                    }
                    WildcardType wildcardType = (WildcardType) type;
                    WildcardType wildcardType2 = (WildcardType) type2;
                    return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
                }
                if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
                    return false;
                }
                TypeVariable typeVariable = (TypeVariable) type;
                TypeVariable typeVariable2 = (TypeVariable) type2;
                return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
            }
        }
        return true;
    }

    private static Class<?> d(TypeVariable<?> typeVariable) {
        GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (Class) genericDeclaration;
        }
        return null;
    }

    public static void c(Type type) {
        er.b(((type instanceof Class) && ((Class) type).isPrimitive()) ? false : true);
    }

    private static Type e(Type type, Class<?> cls, Class<?> cls2) {
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        er.b(cls2.isAssignableFrom(cls));
        return c(type, cls, d(type, cls, cls2));
    }

    public static Type[] e(Type type, Class<?> cls) {
        if (type == Properties.class) {
            return new Type[]{String.class, String.class};
        }
        Type typeE = e(type, cls, Map.class);
        return typeE instanceof ParameterizedType ? ((ParameterizedType) typeE).getActualTypeArguments() : new Type[]{Object.class, Object.class};
    }
}
