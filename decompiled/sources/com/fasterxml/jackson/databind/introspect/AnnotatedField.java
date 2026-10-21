package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes9.dex */
public final class AnnotatedField extends AnnotatedMember {
    protected final transient Field _field;
    protected a _serialization;

    public static final class a implements Serializable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public Class<?> f43322p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public String f43323q0;
    }

    public AnnotatedField(TypeResolutionContext typeResolutionContext, Field field, AnnotationMap annotationMap) {
        super(typeResolutionContext, annotationMap);
        this._field = field;
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return ClassUtil.hasClass(obj, AnnotatedField.class) && ((AnnotatedField) obj)._field == this._field;
    }

    public int getAnnotationCount() {
        return this._annotations.size();
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public Class<?> getDeclaringClass() {
        return this._field.getDeclaringClass();
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    @Deprecated
    public Type getGenericType() {
        return this._field.getGenericType();
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public Member getMember() {
        return this._field;
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public int getModifiers() {
        return this._field.getModifiers();
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public String getName() {
        return this._field.getName();
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public Class<?> getRawType() {
        return this._field.getType();
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public JavaType getType() {
        return this._typeContext.resolveType(this._field.getGenericType());
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public Object getValue(Object obj) throws IllegalArgumentException {
        try {
            return this._field.get(obj);
        } catch (IllegalAccessException e5) {
            throw new IllegalArgumentException("Failed to getValue() for field " + getFullName() + ": " + e5.getMessage(), e5);
        }
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public int hashCode() {
        return this._field.getName().hashCode();
    }

    public boolean isTransient() {
        return Modifier.isTransient(getModifiers());
    }

    public Object readResolve() {
        a aVar = this._serialization;
        Class<?> cls = aVar.f43322p0;
        try {
            Field declaredField = cls.getDeclaredField(aVar.f43323q0);
            if (!declaredField.isAccessible()) {
                ClassUtil.checkAndFixAccess(declaredField, false);
            }
            return new AnnotatedField(null, declaredField, null);
        } catch (Exception unused) {
            throw new IllegalArgumentException("Could not find method '" + this._serialization.f43323q0 + "' from Class '" + cls.getName());
        }
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public void setValue(Object obj, Object obj2) throws IllegalArgumentException {
        try {
            this._field.set(obj, obj2);
        } catch (IllegalAccessException e5) {
            throw new IllegalArgumentException("Failed to setValue() for field " + getFullName() + ": " + e5.getMessage(), e5);
        }
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public String toString() {
        return "[field " + getFullName() + Constant.BRACKET_CLOSE;
    }

    public Object writeReplace() {
        Field field = this._field;
        a aVar = new a();
        aVar.f43322p0 = field.getDeclaringClass();
        aVar.f43323q0 = field.getName();
        return new AnnotatedField(aVar);
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public Field getAnnotated() {
        return this._field;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public AnnotatedField withAnnotations(AnnotationMap annotationMap) {
        return new AnnotatedField(this._typeContext, this._field, annotationMap);
    }

    public AnnotatedField(a aVar) {
        super(null, null);
        this._field = null;
        this._serialization = aVar;
    }
}
