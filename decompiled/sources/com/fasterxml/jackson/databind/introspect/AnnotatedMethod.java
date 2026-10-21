package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes9.dex */
public final class AnnotatedMethod extends AnnotatedWithParams {
    protected final transient Method _method;
    protected Class<?>[] _paramClasses;
    protected a _serialization;

    public static final class a implements Serializable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public Class<?> f43329p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public String f43330q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Class<?>[] f43331r0;
    }

    public AnnotatedMethod(TypeResolutionContext typeResolutionContext, Method method, AnnotationMap annotationMap, AnnotationMap[] annotationMapArr) {
        super(typeResolutionContext, annotationMap, annotationMapArr);
        if (method == null) {
            throw new IllegalArgumentException("Cannot construct AnnotatedMethod with null Method");
        }
        this._method = method;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
    public final Object call() throws Exception {
        return this._method.invoke(null, new Object[0]);
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
    public final Object call1(Object obj) throws Exception {
        return this._method.invoke(null, obj);
    }

    public final Object callOn(Object obj) throws Exception {
        return this._method.invoke(obj, null);
    }

    public final Object callOnWith(Object obj, Object... objArr) throws Exception {
        return this._method.invoke(obj, objArr);
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return ClassUtil.hasClass(obj, AnnotatedMethod.class) && ((AnnotatedMethod) obj)._method == this._method;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public Class<?> getDeclaringClass() {
        return this._method.getDeclaringClass();
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public String getFullName() {
        return String.format("%s(%d params)", super.getFullName(), Integer.valueOf(getParameterCount()));
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
    @Deprecated
    public Type getGenericParameterType(int i10) {
        Type[] genericParameterTypes = getGenericParameterTypes();
        if (i10 >= genericParameterTypes.length) {
            return null;
        }
        return genericParameterTypes[i10];
    }

    @Deprecated
    public Type[] getGenericParameterTypes() {
        return this._method.getGenericParameterTypes();
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    @Deprecated
    public Type getGenericType() {
        return this._method.getGenericReturnType();
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public int getModifiers() {
        return this._method.getModifiers();
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public String getName() {
        return this._method.getName();
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
    public int getParameterCount() {
        return getRawParameterTypes().length;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
    public JavaType getParameterType(int i10) {
        Type[] genericParameterTypes = this._method.getGenericParameterTypes();
        if (i10 >= genericParameterTypes.length) {
            return null;
        }
        return this._typeContext.resolveType(genericParameterTypes[i10]);
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
    public Class<?> getRawParameterType(int i10) {
        Class<?>[] rawParameterTypes = getRawParameterTypes();
        if (i10 >= rawParameterTypes.length) {
            return null;
        }
        return rawParameterTypes[i10];
    }

    public Class<?>[] getRawParameterTypes() {
        if (this._paramClasses == null) {
            this._paramClasses = this._method.getParameterTypes();
        }
        return this._paramClasses;
    }

    public Class<?> getRawReturnType() {
        return this._method.getReturnType();
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public Class<?> getRawType() {
        return this._method.getReturnType();
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public JavaType getType() {
        return this._typeContext.resolveType(this._method.getGenericReturnType());
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public Object getValue(Object obj) throws IllegalArgumentException {
        try {
            return this._method.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException e5) {
            throw new IllegalArgumentException("Failed to getValue() with method " + getFullName() + ": " + e5.getMessage(), e5);
        }
    }

    public boolean hasReturnType() {
        Class<?> rawReturnType = getRawReturnType();
        return (rawReturnType == Void.TYPE || rawReturnType == Void.class) ? false : true;
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public int hashCode() {
        return this._method.getName().hashCode();
    }

    public Object readResolve() {
        a aVar = this._serialization;
        Class<?> cls = aVar.f43329p0;
        try {
            Method declaredMethod = cls.getDeclaredMethod(aVar.f43330q0, aVar.f43331r0);
            if (!declaredMethod.isAccessible()) {
                ClassUtil.checkAndFixAccess(declaredMethod, false);
            }
            return new AnnotatedMethod(null, declaredMethod, null, null);
        } catch (Exception unused) {
            throw new IllegalArgumentException("Could not find method '" + this._serialization.f43330q0 + "' from Class '" + cls.getName());
        }
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public void setValue(Object obj, Object obj2) throws IllegalArgumentException {
        try {
            this._method.invoke(obj, obj2);
        } catch (IllegalAccessException | InvocationTargetException e5) {
            throw new IllegalArgumentException("Failed to setValue() with method " + getFullName() + ": " + e5.getMessage(), e5);
        }
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public String toString() {
        return "[method " + getFullName() + Constant.BRACKET_CLOSE;
    }

    public Object writeReplace() {
        Method method = this._method;
        a aVar = new a();
        aVar.f43329p0 = method.getDeclaringClass();
        aVar.f43330q0 = method.getName();
        aVar.f43331r0 = method.getParameterTypes();
        return new AnnotatedMethod(aVar);
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
    public final Object call(Object[] objArr) throws Exception {
        return this._method.invoke(null, objArr);
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public Method getAnnotated() {
        return this._method;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public Method getMember() {
        return this._method;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public AnnotatedMethod withAnnotations(AnnotationMap annotationMap) {
        return new AnnotatedMethod(this._typeContext, this._method, annotationMap, this._paramAnnotations);
    }

    public AnnotatedMethod(a aVar) {
        super(null, null, null);
        this._method = null;
        this._serialization = aVar;
    }
}
