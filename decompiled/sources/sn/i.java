package sn;

import androidx.appcompat.widget.o1;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import javax.annotation.Nullable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import mx.openpay.library.domain.util.Constant;
import okhttp3.HttpUrl;

/* JADX INFO: compiled from: Utils.java */
/* JADX INFO: loaded from: classes13.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Type[] f93339a = new Type[0];

    /* JADX INFO: compiled from: Utils.java */
    public static final class a implements GenericArrayType {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Type f93340p0;

        public a(Type type) {
            this.f93340p0 = type;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && i.b(this, (GenericArrayType) obj);
        }

        @Override // java.lang.reflect.GenericArrayType
        public final Type getGenericComponentType() {
            return this.f93340p0;
        }

        public final int hashCode() {
            return this.f93340p0.hashCode();
        }

        public final String toString() {
            return i.n(this.f93340p0) + HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
    }

    /* JADX INFO: compiled from: Utils.java */
    public static final class b implements ParameterizedType {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        @Nullable
        public final Type f93341p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Type f93342q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final Type[] f93343r0;

        public b(@Nullable Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                if ((type == null) != (((Class) type2).getEnclosingClass() == null)) {
                    throw new IllegalArgumentException();
                }
            }
            for (Type type3 : typeArr) {
                Objects.requireNonNull(type3, "typeArgument == null");
                i.a(type3);
            }
            this.f93341p0 = type;
            this.f93342q0 = type2;
            this.f93343r0 = (Type[]) typeArr.clone();
        }

        public final boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && i.b(this, (ParameterizedType) obj);
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type[] getActualTypeArguments() {
            return (Type[]) this.f93343r0.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        @Nullable
        public final Type getOwnerType() {
            return this.f93341p0;
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type getRawType() {
            return this.f93342q0;
        }

        public final int hashCode() {
            int iHashCode = Arrays.hashCode(this.f93343r0) ^ this.f93342q0.hashCode();
            Type type = this.f93341p0;
            return iHashCode ^ (type != null ? type.hashCode() : 0);
        }

        public final String toString() {
            Type[] typeArr = this.f93343r0;
            int length = typeArr.length;
            Type type = this.f93342q0;
            if (length == 0) {
                return i.n(type);
            }
            StringBuilder sb2 = new StringBuilder((typeArr.length + 1) * 30);
            sb2.append(i.n(type));
            sb2.append("<");
            sb2.append(i.n(typeArr[0]));
            for (int i10 = 1; i10 < typeArr.length; i10++) {
                sb2.append(", ");
                sb2.append(i.n(typeArr[i10]));
            }
            sb2.append(">");
            return sb2.toString();
        }
    }

    /* JADX INFO: compiled from: Utils.java */
    public static final class c implements WildcardType {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Type f93344p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        @Nullable
        public final Type f93345q0;

        public c(Type[] typeArr, Type[] typeArr2) {
            if (typeArr2.length > 1) {
                throw new IllegalArgumentException();
            }
            if (typeArr.length != 1) {
                throw new IllegalArgumentException();
            }
            if (typeArr2.length != 1) {
                typeArr[0].getClass();
                i.a(typeArr[0]);
                this.f93345q0 = null;
                this.f93344p0 = typeArr[0];
                return;
            }
            typeArr2[0].getClass();
            i.a(typeArr2[0]);
            if (typeArr[0] != Object.class) {
                throw new IllegalArgumentException();
            }
            this.f93345q0 = typeArr2[0];
            this.f93344p0 = Object.class;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof WildcardType) && i.b(this, (WildcardType) obj);
        }

        @Override // java.lang.reflect.WildcardType
        public final Type[] getLowerBounds() {
            Type type = this.f93345q0;
            return type != null ? new Type[]{type} : i.f93339a;
        }

        @Override // java.lang.reflect.WildcardType
        public final Type[] getUpperBounds() {
            return new Type[]{this.f93344p0};
        }

        public final int hashCode() {
            Type type = this.f93345q0;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f93344p0.hashCode() + 31);
        }

        public final String toString() {
            Type type = this.f93345q0;
            if (type != null) {
                return "? super " + i.n(type);
            }
            Type type2 = this.f93344p0;
            if (type2 == Object.class) {
                return "?";
            }
            return "? extends " + i.n(type2);
        }
    }

    public static void a(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException();
        }
    }

    public static boolean b(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            Type ownerType = parameterizedType.getOwnerType();
            Type ownerType2 = parameterizedType2.getOwnerType();
            return (ownerType == ownerType2 || (ownerType != null && ownerType.equals(ownerType2))) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return b(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        }
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

    public static Type c(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i10 = 0; i10 < length; i10++) {
                Class<?> cls3 = interfaces[i10];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i10];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return c(cls.getGenericInterfaces()[i10], interfaces[i10], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<? super Object> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return c(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static Type d(int i10, ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i10 >= 0 && i10 < actualTypeArguments.length) {
            Type type = actualTypeArguments[i10];
            return type instanceof WildcardType ? ((WildcardType) type).getUpperBounds()[0] : type;
        }
        StringBuilder sbC = o1.c("Index ", i10, " not in range [0,");
        sbC.append(actualTypeArguments.length);
        sbC.append(") for ");
        sbC.append(parameterizedType);
        throw new IllegalArgumentException(sbC.toString());
    }

    public static Class<?> e(Type type) {
        Objects.requireNonNull(type, "type == null");
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            if (rawType instanceof Class) {
                return (Class) rawType;
            }
            throw new IllegalArgumentException();
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance(e(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return e(((WildcardType) type).getUpperBounds()[0]);
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + type.getClass().getName());
    }

    public static Type f(Type type, Class cls) {
        if (Map.class.isAssignableFrom(cls)) {
            return l(type, cls, c(type, cls, Map.class));
        }
        throw new IllegalArgumentException();
    }

    public static boolean g(@Nullable Type type) {
        if (type instanceof Class) {
            return false;
        }
        if (type instanceof ParameterizedType) {
            for (Type type2 : ((ParameterizedType) type).getActualTypeArguments()) {
                if (g(type2)) {
                    return true;
                }
            }
            return false;
        }
        if (type instanceof GenericArrayType) {
            return g(((GenericArrayType) type).getGenericComponentType());
        }
        if ((type instanceof TypeVariable) || (type instanceof WildcardType)) {
            return true;
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? AbstractJsonLexerKt.NULL : type.getClass().getName()));
    }

    public static boolean h(Class cls, Annotation[] annotationArr) {
        for (Annotation annotation : annotationArr) {
            if (cls.isInstance(annotation)) {
                return true;
            }
        }
        return false;
    }

    public static IllegalArgumentException i(Method method, @Nullable Exception exc, String str, Object... objArr) {
        StringBuilder sbE = androidx.camera.core.processing.f.e(String.format(str, objArr), "\n    for method ");
        sbE.append(method.getDeclaringClass().getSimpleName());
        sbE.append(Constant.DOT_STRING);
        sbE.append(method.getName());
        return new IllegalArgumentException(sbE.toString(), exc);
    }

    public static IllegalArgumentException j(Method method, int i10, String str, Object... objArr) {
        StringBuilder sbE = androidx.camera.core.processing.f.e(str, " (parameter #");
        sbE.append(i10 + 1);
        sbE.append(")");
        return i(method, null, sbE.toString(), objArr);
    }

    public static IllegalArgumentException k(Method method, Exception exc, int i10, String str, Object... objArr) {
        StringBuilder sbE = androidx.camera.core.processing.f.e(str, " (parameter #");
        sbE.append(i10 + 1);
        sbE.append(")");
        return i(method, exc, sbE.toString(), objArr);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0015  */
    public static Type l(Type type, Class<?> cls, Type type2) {
        Type type3;
        WildcardType wildcardType;
        Type type4;
        Type type5 = type2;
        while (true) {
            int i10 = 0;
            if (!(type5 instanceof TypeVariable)) {
                if (type5 instanceof Class) {
                    Class cls2 = (Class) type5;
                    if (cls2.isArray()) {
                        Class<?> componentType = cls2.getComponentType();
                        Type typeL = l(type, cls, componentType);
                        return componentType == typeL ? cls2 : new a(typeL);
                    }
                }
                if (type5 instanceof GenericArrayType) {
                    GenericArrayType genericArrayType = (GenericArrayType) type5;
                    Type genericComponentType = genericArrayType.getGenericComponentType();
                    Type typeL2 = l(type, cls, genericComponentType);
                    return genericComponentType == typeL2 ? genericArrayType : new a(typeL2);
                }
                if (type5 instanceof ParameterizedType) {
                    ParameterizedType parameterizedType = (ParameterizedType) type5;
                    Type ownerType = parameterizedType.getOwnerType();
                    Type typeL3 = l(type, cls, ownerType);
                    boolean z10 = typeL3 != ownerType;
                    Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                    int length = actualTypeArguments.length;
                    while (i10 < length) {
                        Type typeL4 = l(type, cls, actualTypeArguments[i10]);
                        if (typeL4 != actualTypeArguments[i10]) {
                            if (!z10) {
                                actualTypeArguments = (Type[]) actualTypeArguments.clone();
                                z10 = true;
                            }
                            actualTypeArguments[i10] = typeL4;
                        }
                        i10++;
                    }
                    return z10 ? new b(typeL3, parameterizedType.getRawType(), actualTypeArguments) : parameterizedType;
                }
                if (type5 instanceof WildcardType) {
                    wildcardType = (WildcardType) type5;
                    Type[] lowerBounds = wildcardType.getLowerBounds();
                    Type[] upperBounds = wildcardType.getUpperBounds();
                    if (lowerBounds.length == 1) {
                        Type typeL5 = l(type, cls, lowerBounds[0]);
                        if (typeL5 != lowerBounds[0]) {
                            type3 = type5;
                            type3 = wildcardType;
                            return new c(new Type[]{Object.class}, new Type[]{typeL5});
                        }
                    } else if (upperBounds.length == 1) {
                        type3 = type5;
                        type3 = wildcardType;
                        Type typeL6 = l(type, cls, upperBounds[0]);
                        type3 = wildcardType;
                        if (typeL6 != upperBounds[0]) {
                            return new c(new Type[]{typeL6}, f93339a);
                        }
                    }
                }
                type3 = type5;
                type3 = wildcardType;
                type3 = type5;
                type3 = wildcardType;
                type3 = type5;
                return type3;
            }
            TypeVariable typeVariable = (TypeVariable) type5;
            GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
            Class cls3 = genericDeclaration instanceof Class ? (Class) genericDeclaration : null;
            if (cls3 == null) {
                type4 = typeVariable;
            } else {
                Type typeC = c(type, cls, cls3);
                if (typeC instanceof ParameterizedType) {
                    TypeVariable[] typeParameters = cls3.getTypeParameters();
                    while (true) {
                        if (i10 >= typeParameters.length) {
                            throw new NoSuchElementException();
                        }
                        if (typeVariable.equals(typeParameters[i10])) {
                            type4 = ((ParameterizedType) typeC).getActualTypeArguments()[i10];
                            break;
                        }
                        i10++;
                    }
                } else {
                    type4 = typeVariable;
                }
            }
            if (type4 == typeVariable) {
                return type4;
            }
            type5 = type4;
        }
    }

    public static void m(Throwable th2) {
        if (th2 instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th2);
        }
        if (th2 instanceof ThreadDeath) {
            throw ((ThreadDeath) th2);
        }
        if (th2 instanceof LinkageError) {
            throw ((LinkageError) th2);
        }
    }

    public static String n(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }
}
