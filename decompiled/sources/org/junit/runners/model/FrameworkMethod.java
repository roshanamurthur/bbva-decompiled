package org.junit.runners.model;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.List;
import org.junit.internal.runners.model.ReflectiveCallable;

/* JADX INFO: loaded from: classes13.dex */
public class FrameworkMethod extends FrameworkMember<FrameworkMethod> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Method f92042a;

    public class a extends ReflectiveCallable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f92043a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object[] f92044b;

        public a(Object obj, Object[] objArr) {
            this.f92043a = obj;
            this.f92044b = objArr;
        }

        @Override // org.junit.internal.runners.model.ReflectiveCallable
        public final Object runReflectiveCall() throws Throwable {
            return FrameworkMethod.this.f92042a.invoke(this.f92043a, this.f92044b);
        }
    }

    public FrameworkMethod(Method method) {
        if (method == null) {
            throw new NullPointerException("FrameworkMethod cannot be created without an underlying method.");
        }
        this.f92042a = method;
        if (isPublic()) {
            try {
                method.setAccessible(true);
            } catch (SecurityException unused) {
            }
        }
    }

    @Override // org.junit.runners.model.FrameworkMember
    public final boolean a() {
        return this.f92042a.isBridge();
    }

    public boolean equals(Object obj) {
        if (FrameworkMethod.class.isInstance(obj)) {
            return ((FrameworkMethod) obj).f92042a.equals(this.f92042a);
        }
        return false;
    }

    @Override // org.junit.runners.model.Annotatable
    public <T extends Annotation> T getAnnotation(Class<T> cls) {
        return (T) this.f92042a.getAnnotation(cls);
    }

    @Override // org.junit.runners.model.Annotatable
    public Annotation[] getAnnotations() {
        return this.f92042a.getAnnotations();
    }

    @Override // org.junit.runners.model.FrameworkMember
    public Class<?> getDeclaringClass() {
        return this.f92042a.getDeclaringClass();
    }

    public Method getMethod() {
        return this.f92042a;
    }

    @Override // org.junit.runners.model.FrameworkMember
    public int getModifiers() {
        return this.f92042a.getModifiers();
    }

    @Override // org.junit.runners.model.FrameworkMember
    public String getName() {
        return this.f92042a.getName();
    }

    public Class<?> getReturnType() {
        return this.f92042a.getReturnType();
    }

    @Override // org.junit.runners.model.FrameworkMember
    public Class<?> getType() {
        return getReturnType();
    }

    public int hashCode() {
        return this.f92042a.hashCode();
    }

    public Object invokeExplosively(Object obj, Object... objArr) throws Throwable {
        return new a(obj, objArr).run();
    }

    @Deprecated
    public boolean producesType(Type type) {
        Method method = this.f92042a;
        return method.getParameterTypes().length == 0 && (type instanceof Class) && ((Class) type).isAssignableFrom(method.getReturnType());
    }

    public String toString() {
        return this.f92042a.toString();
    }

    public void validateNoTypeParametersOnArgs(List<Throwable> list) {
        Method method = this.f92042a;
        nn.a aVar = new nn.a(method);
        for (Type type : method.getGenericParameterTypes()) {
            aVar.a(type, list);
        }
    }

    public void validatePublicVoid(boolean z10, List<Throwable> list) {
        boolean zIsStatic = isStatic();
        Method method = this.f92042a;
        if (zIsStatic != z10) {
            list.add(new Exception("Method " + method.getName() + "() " + (z10 ? "should" : "should not") + " be static"));
        }
        if (!isPublic()) {
            list.add(new Exception("Method " + method.getName() + "() should be public"));
        }
        if (method.getReturnType() != Void.TYPE) {
            list.add(new Exception("Method " + method.getName() + "() should be void"));
        }
    }

    public void validatePublicVoidNoArg(boolean z10, List<Throwable> list) {
        validatePublicVoid(z10, list);
        Method method = this.f92042a;
        if (method.getParameterTypes().length != 0) {
            list.add(new Exception("Method " + method.getName() + " should have no parameters"));
        }
    }

    @Override // org.junit.runners.model.FrameworkMember
    public boolean isShadowedBy(FrameworkMethod frameworkMethod) {
        if (!frameworkMethod.getName().equals(getName())) {
            return false;
        }
        Method method = frameworkMethod.f92042a;
        int length = method.getParameterTypes().length;
        Method method2 = this.f92042a;
        if (length != method2.getParameterTypes().length) {
            return false;
        }
        for (int i10 = 0; i10 < method.getParameterTypes().length; i10++) {
            if (!method.getParameterTypes()[i10].equals(method2.getParameterTypes()[i10])) {
                return false;
            }
        }
        return true;
    }
}
