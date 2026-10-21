package com.esotericsoftware.kryo.util;

import com.esotericsoftware.kryo.KryoException;
import com.esotericsoftware.reflectasm.ConstructorAccess;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import org.objenesis.instantiator.ObjectInstantiator;
import org.objenesis.strategy.InstantiatorStrategy;

/* JADX INFO: loaded from: classes9.dex */
public class DefaultInstantiatorStrategy implements InstantiatorStrategy {
    private InstantiatorStrategy fallbackStrategy;

    public class a implements ObjectInstantiator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ConstructorAccess f40052a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Class f40053b;

        public a(ConstructorAccess constructorAccess, Class cls) {
            this.f40052a = constructorAccess;
            this.f40053b = cls;
        }

        @Override // org.objenesis.instantiator.ObjectInstantiator
        public final Object newInstance() {
            try {
                return this.f40052a.newInstance();
            } catch (Exception e5) {
                throw new KryoException("Error constructing instance of class: " + Util.className(this.f40053b), e5);
            }
        }
    }

    public class b implements ObjectInstantiator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Constructor f40054a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Class f40055b;

        public b(Constructor constructor, Class cls) {
            this.f40054a = constructor;
            this.f40055b = cls;
        }

        @Override // org.objenesis.instantiator.ObjectInstantiator
        public final Object newInstance() {
            try {
                return this.f40054a.newInstance(new Object[0]);
            } catch (Exception e5) {
                throw new KryoException("Error constructing instance of class: " + Util.className(this.f40055b), e5);
            }
        }
    }

    public DefaultInstantiatorStrategy() {
    }

    public InstantiatorStrategy getFallbackInstantiatorStrategy() {
        return this.fallbackStrategy;
    }

    @Override // org.objenesis.strategy.InstantiatorStrategy
    public ObjectInstantiator newInstantiatorOf(Class cls) {
        Constructor declaredConstructor;
        if (!Util.isAndroid && (cls.getEnclosingClass() == null || !cls.isMemberClass() || Modifier.isStatic(cls.getModifiers()))) {
            try {
                return new a(ConstructorAccess.get(cls), cls);
            } catch (Exception unused) {
            }
        }
        try {
            try {
                declaredConstructor = cls.getConstructor(null);
            } catch (Exception unused2) {
                declaredConstructor = cls.getDeclaredConstructor(null);
                declaredConstructor.setAccessible(true);
            }
            return new b(declaredConstructor, cls);
        } catch (Exception unused3) {
            InstantiatorStrategy instantiatorStrategy = this.fallbackStrategy;
            if (instantiatorStrategy != null) {
                return instantiatorStrategy.newInstantiatorOf(cls);
            }
            if (cls.isMemberClass() && !Modifier.isStatic(cls.getModifiers())) {
                throw new KryoException("Class cannot be created (non-static member class): " + Util.className(cls));
            }
            StringBuilder sb2 = new StringBuilder("Class cannot be created (missing no-arg constructor): " + Util.className(cls));
            if (cls.getSimpleName().equals("")) {
                sb2.append("\nNote: This is an anonymous class, which is not serializable by default in Kryo. Possible solutions:\n1. Remove uses of anonymous classes, including double brace initialization, from the containing\nclass. This is the safest solution, as anonymous classes don't have predictable names for serialization.\n2. Register a FieldSerializer for the containing class and call FieldSerializer\nsetIgnoreSyntheticFields(false) on it. This is not safe but may be sufficient temporarily.");
            }
            throw new KryoException(sb2.toString());
        }
    }

    public void setFallbackInstantiatorStrategy(InstantiatorStrategy instantiatorStrategy) {
        this.fallbackStrategy = instantiatorStrategy;
    }

    public DefaultInstantiatorStrategy(InstantiatorStrategy instantiatorStrategy) {
        this.fallbackStrategy = instantiatorStrategy;
    }
}
