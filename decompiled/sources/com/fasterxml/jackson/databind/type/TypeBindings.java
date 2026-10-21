package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.Serializable;
import java.lang.reflect.TypeVariable;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.text.Typography;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes9.dex */
public class TypeBindings implements Serializable {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final String[] f43457t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final JavaType[] f43458u0;
    public static final TypeBindings v0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final String[] f43459p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final JavaType[] f43460q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final String[] f43461r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final int f43462s0;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class<?> f43463a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final JavaType[] f43464b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f43465c;

        public a(Class<?> cls, JavaType[] javaTypeArr, int i10) {
            this.f43463a = cls;
            this.f43464b = javaTypeArr;
            this.f43465c = i10;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || obj.getClass() != a.class) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f43465c == aVar.f43465c && this.f43463a == aVar.f43463a) {
                JavaType[] javaTypeArr = this.f43464b;
                int length = javaTypeArr.length;
                JavaType[] javaTypeArr2 = aVar.f43464b;
                if (length == javaTypeArr2.length) {
                    for (int i10 = 0; i10 < length; i10++) {
                        if (!javaTypeArr[i10].equals(javaTypeArr2[i10])) {
                            return false;
                        }
                    }
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return this.f43465c;
        }

        public final String toString() {
            return this.f43463a.getName().concat("<>");
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TypeVariable<?>[] f43466a = AbstractList.class.getTypeParameters();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final TypeVariable<?>[] f43467b = Collection.class.getTypeParameters();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final TypeVariable<?>[] f43468c = Iterable.class.getTypeParameters();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final TypeVariable<?>[] f43469d = List.class.getTypeParameters();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final TypeVariable<?>[] f43470e = ArrayList.class.getTypeParameters();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final TypeVariable<?>[] f43471f = Map.class.getTypeParameters();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final TypeVariable<?>[] f43472g = HashMap.class.getTypeParameters();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final TypeVariable<?>[] f43473h = LinkedHashMap.class.getTypeParameters();
    }

    static {
        String[] strArr = new String[0];
        f43457t0 = strArr;
        JavaType[] javaTypeArr = new JavaType[0];
        f43458u0 = javaTypeArr;
        v0 = new TypeBindings(strArr, javaTypeArr, null);
    }

    public TypeBindings(String[] strArr, JavaType[] javaTypeArr, String[] strArr2) {
        strArr = strArr == null ? f43457t0 : strArr;
        this.f43459p0 = strArr;
        javaTypeArr = javaTypeArr == null ? f43458u0 : javaTypeArr;
        this.f43460q0 = javaTypeArr;
        if (strArr.length != javaTypeArr.length) {
            StringBuilder sb2 = new StringBuilder("Mismatching names (");
            sb2.append(strArr.length);
            sb2.append("), types (");
            throw new IllegalArgumentException(androidx.appcompat.widget.a.c(sb2, javaTypeArr.length, ")"));
        }
        int length = javaTypeArr.length;
        int iHashCode = 1;
        for (int i10 = 0; i10 < length; i10++) {
            iHashCode += this.f43460q0[i10].hashCode();
        }
        this.f43461r0 = strArr2;
        this.f43462s0 = iHashCode;
    }

    public static TypeBindings create(Class<?> cls, List<JavaType> list) {
        return create(cls, (list == null || list.isEmpty()) ? f43458u0 : (JavaType[]) list.toArray(new JavaType[list.size()]));
    }

    public static TypeBindings createIfNeeded(Class<?> cls, JavaType javaType) {
        TypeVariable<Class<?>>[] typeParameters = cls.getTypeParameters();
        int length = typeParameters == null ? 0 : typeParameters.length;
        if (length == 0) {
            return v0;
        }
        if (length == 1) {
            return new TypeBindings(new String[]{typeParameters[0].getName()}, new JavaType[]{javaType}, null);
        }
        throw new IllegalArgumentException("Cannot create TypeBindings for class " + cls.getName() + " with 1 type parameter: class expects " + length);
    }

    public static TypeBindings emptyBindings() {
        return v0;
    }

    public Object asKey(Class<?> cls) {
        return new a(cls, this.f43460q0, this.f43462s0);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!ClassUtil.hasClass(obj, getClass())) {
            return false;
        }
        TypeBindings typeBindings = (TypeBindings) obj;
        JavaType[] javaTypeArr = this.f43460q0;
        int length = javaTypeArr.length;
        if (length != typeBindings.size()) {
            return false;
        }
        for (int i10 = 0; i10 < length; i10++) {
            if (!typeBindings.f43460q0[i10].equals(javaTypeArr[i10])) {
                return false;
            }
        }
        return true;
    }

    public JavaType findBoundType(String str) {
        JavaType selfReferencedType;
        String[] strArr = this.f43459p0;
        int length = strArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (str.equals(strArr[i10])) {
                JavaType javaType = this.f43460q0[i10];
                return (!(javaType instanceof ResolvedRecursiveType) || (selfReferencedType = ((ResolvedRecursiveType) javaType).getSelfReferencedType()) == null) ? javaType : selfReferencedType;
            }
        }
        return null;
    }

    public String getBoundName(int i10) {
        if (i10 < 0) {
            return null;
        }
        String[] strArr = this.f43459p0;
        if (i10 >= strArr.length) {
            return null;
        }
        return strArr[i10];
    }

    public JavaType getBoundType(int i10) {
        if (i10 < 0) {
            return null;
        }
        JavaType[] javaTypeArr = this.f43460q0;
        if (i10 >= javaTypeArr.length) {
            return null;
        }
        return javaTypeArr[i10];
    }

    public List<JavaType> getTypeParameters() {
        JavaType[] javaTypeArr = this.f43460q0;
        return javaTypeArr.length == 0 ? Collections.emptyList() : Arrays.asList(javaTypeArr);
    }

    public boolean hasUnbound(String str) {
        String[] strArr = this.f43461r0;
        if (strArr == null) {
            return false;
        }
        int length = strArr.length;
        do {
            length--;
            if (length < 0) {
                return false;
            }
        } while (!str.equals(strArr[length]));
        return true;
    }

    public int hashCode() {
        return this.f43462s0;
    }

    public boolean isEmpty() {
        return this.f43460q0.length == 0;
    }

    public Object readResolve() {
        String[] strArr = this.f43459p0;
        return (strArr == null || strArr.length == 0) ? v0 : this;
    }

    public int size() {
        return this.f43460q0.length;
    }

    public String toString() {
        JavaType[] javaTypeArr = this.f43460q0;
        if (javaTypeArr.length == 0) {
            return "<>";
        }
        StringBuilder sb2 = new StringBuilder("<");
        int length = javaTypeArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (i10 > 0) {
                sb2.append(AbstractJsonLexerKt.COMMA);
            }
            sb2.append(javaTypeArr[i10].getGenericSignature());
        }
        sb2.append(Typography.greater);
        return sb2.toString();
    }

    public JavaType[] typeParameterArray() {
        return this.f43460q0;
    }

    public TypeBindings withUnboundVariable(String str) {
        String[] strArr = this.f43461r0;
        int length = strArr == null ? 0 : strArr.length;
        String[] strArr2 = length == 0 ? new String[1] : (String[]) Arrays.copyOf(strArr, length + 1);
        strArr2[length] = str;
        return new TypeBindings(this.f43459p0, this.f43460q0, strArr2);
    }

    public static TypeBindings create(Class<?> cls, JavaType[] javaTypeArr) {
        String[] strArr;
        if (javaTypeArr == null) {
            javaTypeArr = f43458u0;
        } else {
            int length = javaTypeArr.length;
            if (length == 1) {
                return create(cls, javaTypeArr[0]);
            }
            if (length == 2) {
                return create(cls, javaTypeArr[0], javaTypeArr[1]);
            }
        }
        TypeVariable<Class<?>>[] typeParameters = cls.getTypeParameters();
        if (typeParameters != null && typeParameters.length != 0) {
            int length2 = typeParameters.length;
            strArr = new String[length2];
            for (int i10 = 0; i10 < length2; i10++) {
                strArr[i10] = typeParameters[i10].getName();
            }
        } else {
            strArr = f43457t0;
        }
        if (strArr.length != javaTypeArr.length) {
            StringBuilder sb2 = new StringBuilder("Cannot create TypeBindings for class ");
            androidx.core.graphics.b.f(cls, sb2, " with ");
            sb2.append(javaTypeArr.length);
            sb2.append(" type parameter");
            sb2.append(javaTypeArr.length == 1 ? "" : "s");
            sb2.append(": class expects ");
            sb2.append(strArr.length);
            throw new IllegalArgumentException(sb2.toString());
        }
        return new TypeBindings(strArr, javaTypeArr, null);
    }

    public static TypeBindings createIfNeeded(Class<?> cls, JavaType[] javaTypeArr) {
        TypeVariable<Class<?>>[] typeParameters = cls.getTypeParameters();
        if (typeParameters != null && typeParameters.length != 0) {
            if (javaTypeArr == null) {
                javaTypeArr = f43458u0;
            }
            int length = typeParameters.length;
            String[] strArr = new String[length];
            for (int i10 = 0; i10 < length; i10++) {
                strArr[i10] = typeParameters[i10].getName();
            }
            if (length != javaTypeArr.length) {
                StringBuilder sb2 = new StringBuilder("Cannot create TypeBindings for class ");
                androidx.core.graphics.b.f(cls, sb2, " with ");
                sb2.append(javaTypeArr.length);
                sb2.append(" type parameter");
                sb2.append(javaTypeArr.length == 1 ? "" : "s");
                sb2.append(": class expects ");
                sb2.append(length);
                throw new IllegalArgumentException(sb2.toString());
            }
            return new TypeBindings(strArr, javaTypeArr, null);
        }
        return v0;
    }

    public static TypeBindings create(Class<?> cls, JavaType javaType) {
        TypeVariable[] typeParameters;
        if (cls == Collection.class) {
            typeParameters = b.f43467b;
        } else if (cls == List.class) {
            typeParameters = b.f43469d;
        } else if (cls == ArrayList.class) {
            typeParameters = b.f43470e;
        } else if (cls == AbstractList.class) {
            typeParameters = b.f43466a;
        } else if (cls == Iterable.class) {
            typeParameters = b.f43468c;
        } else {
            TypeVariable<?>[] typeVariableArr = b.f43466a;
            typeParameters = cls.getTypeParameters();
        }
        int length = typeParameters == null ? 0 : typeParameters.length;
        if (length == 1) {
            return new TypeBindings(new String[]{typeParameters[0].getName()}, new JavaType[]{javaType}, null);
        }
        throw new IllegalArgumentException("Cannot create TypeBindings for class " + cls.getName() + " with 1 type parameter: class expects " + length);
    }

    public static TypeBindings create(Class<?> cls, JavaType javaType, JavaType javaType2) {
        TypeVariable[] typeParameters;
        if (cls == Map.class) {
            typeParameters = b.f43471f;
        } else if (cls == HashMap.class) {
            typeParameters = b.f43472g;
        } else if (cls == LinkedHashMap.class) {
            typeParameters = b.f43473h;
        } else {
            TypeVariable<?>[] typeVariableArr = b.f43466a;
            typeParameters = cls.getTypeParameters();
        }
        int length = typeParameters == null ? 0 : typeParameters.length;
        if (length == 2) {
            return new TypeBindings(new String[]{typeParameters[0].getName(), typeParameters[1].getName()}, new JavaType[]{javaType, javaType2}, null);
        }
        throw new IllegalArgumentException("Cannot create TypeBindings for class " + cls.getName() + " with 2 type parameters: class expects " + length);
    }
}
