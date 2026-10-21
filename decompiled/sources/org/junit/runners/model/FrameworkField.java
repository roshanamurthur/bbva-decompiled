package org.junit.runners.model;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes13.dex */
public class FrameworkField extends FrameworkMember<FrameworkField> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field f92041a;

    public FrameworkField(Field field) {
        if (field == null) {
            throw new NullPointerException("FrameworkField cannot be created without an underlying field.");
        }
        this.f92041a = field;
        if (isPublic()) {
            try {
                field.setAccessible(true);
            } catch (SecurityException unused) {
            }
        }
    }

    @Override // org.junit.runners.model.FrameworkMember
    public final boolean a() {
        return false;
    }

    public Object get(Object obj) throws IllegalAccessException, IllegalArgumentException {
        return this.f92041a.get(obj);
    }

    @Override // org.junit.runners.model.Annotatable
    public <T extends Annotation> T getAnnotation(Class<T> cls) {
        return (T) this.f92041a.getAnnotation(cls);
    }

    @Override // org.junit.runners.model.Annotatable
    public Annotation[] getAnnotations() {
        return this.f92041a.getAnnotations();
    }

    @Override // org.junit.runners.model.FrameworkMember
    public Class<?> getDeclaringClass() {
        return this.f92041a.getDeclaringClass();
    }

    public Field getField() {
        return this.f92041a;
    }

    @Override // org.junit.runners.model.FrameworkMember
    public int getModifiers() {
        return this.f92041a.getModifiers();
    }

    @Override // org.junit.runners.model.FrameworkMember
    public String getName() {
        return getField().getName();
    }

    @Override // org.junit.runners.model.FrameworkMember
    public Class<?> getType() {
        return this.f92041a.getType();
    }

    public String toString() {
        return this.f92041a.toString();
    }

    @Override // org.junit.runners.model.FrameworkMember
    public boolean isShadowedBy(FrameworkField frameworkField) {
        return frameworkField.getName().equals(getName());
    }
}
