package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes9.dex */
public final class AnnotatedConstructor extends AnnotatedWithParams {
    protected final Constructor<?> _constructor;
    protected a _serialization;

    public static final class a implements Serializable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public Class<?> f43320p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Class<?>[] f43321q0;
    }

    public AnnotatedConstructor(TypeResolutionContext typeResolutionContext, Constructor<?> constructor, AnnotationMap annotationMap, AnnotationMap[] annotationMapArr) {
        super(typeResolutionContext, annotationMap, annotationMapArr);
        if (constructor == null) {
            throw new IllegalArgumentException("Null constructor not allowed");
        }
        this._constructor = constructor;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
    public final Object call() throws Exception {
        return this._constructor.newInstance(new Object[0]);
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
    public final Object call1(Object obj) throws Exception {
        return this._constructor.newInstance(obj);
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return ClassUtil.hasClass(obj, AnnotatedConstructor.class) && ((AnnotatedConstructor) obj)._constructor == this._constructor;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public Class<?> getDeclaringClass() {
        return this._constructor.getDeclaringClass();
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
    @Deprecated
    public Type getGenericParameterType(int i10) {
        Type[] genericParameterTypes = this._constructor.getGenericParameterTypes();
        if (i10 >= genericParameterTypes.length) {
            return null;
        }
        return genericParameterTypes[i10];
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public Member getMember() {
        return this._constructor;
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public int getModifiers() {
        return this._constructor.getModifiers();
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public String getName() {
        return this._constructor.getName();
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
    public int getParameterCount() {
        return this._constructor.getParameterTypes().length;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
    public JavaType getParameterType(int i10) {
        Type[] genericParameterTypes = this._constructor.getGenericParameterTypes();
        if (i10 >= genericParameterTypes.length) {
            return null;
        }
        return this._typeContext.resolveType(genericParameterTypes[i10]);
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
    public Class<?> getRawParameterType(int i10) {
        Class<?>[] parameterTypes = this._constructor.getParameterTypes();
        if (i10 >= parameterTypes.length) {
            return null;
        }
        return parameterTypes[i10];
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public Class<?> getRawType() {
        return this._constructor.getDeclaringClass();
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public JavaType getType() {
        return this._typeContext.resolveType(getRawType());
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public Object getValue(Object obj) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Cannot call getValue() on constructor of ".concat(getDeclaringClass().getName()));
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public int hashCode() {
        return this._constructor.getName().hashCode();
    }

    public Object readResolve() {
        a aVar = this._serialization;
        Class<?> cls = aVar.f43320p0;
        try {
            Constructor<?> declaredConstructor = cls.getDeclaredConstructor(aVar.f43321q0);
            if (!declaredConstructor.isAccessible()) {
                ClassUtil.checkAndFixAccess(declaredConstructor, false);
            }
            return new AnnotatedConstructor(null, declaredConstructor, null, null);
        } catch (Exception unused) {
            throw new IllegalArgumentException("Could not find constructor with " + this._serialization.f43321q0.length + " args from Class '" + cls.getName());
        }
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public void setValue(Object obj, Object obj2) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Cannot call setValue() on constructor of ".concat(getDeclaringClass().getName()));
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public String toString() {
        return "[constructor for " + getName() + ", annotations: " + this._annotations + Constant.BRACKET_CLOSE;
    }

    public Object writeReplace() {
        Constructor<?> constructor = this._constructor;
        a aVar = new a();
        aVar.f43320p0 = constructor.getDeclaringClass();
        aVar.f43321q0 = constructor.getParameterTypes();
        return new AnnotatedConstructor(aVar);
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
    public final Object call(Object[] objArr) throws Exception {
        return this._constructor.newInstance(objArr);
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public Constructor<?> getAnnotated() {
        return this._constructor;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public AnnotatedConstructor withAnnotations(AnnotationMap annotationMap) {
        return new AnnotatedConstructor(this._typeContext, this._constructor, annotationMap, this._paramAnnotations);
    }

    public AnnotatedConstructor(a aVar) {
        super(null, null, null);
        this._constructor = null;
        this._serialization = aVar;
    }
}
