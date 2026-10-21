package org.junit.runner.manipulation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import org.junit.runner.Description;

/* JADX INFO: loaded from: classes13.dex */
public abstract class Ordering {

    public static class Context {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Description f91996a;

        public Context(Description description) {
            this.f91996a = description;
        }

        public Description getTarget() {
            return this.f91996a;
        }
    }

    public interface Factory {
        Ordering create(Context context);
    }

    public static class a extends Ordering {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Random f91997p0;

        public a(Random random) {
            this.f91997p0 = random;
        }

        @Override // org.junit.runner.manipulation.Ordering
        public final List<Description> orderItems(Collection<Description> collection) {
            ArrayList arrayList = new ArrayList(collection);
            Collections.shuffle(arrayList, this.f91997p0);
            return arrayList;
        }
    }

    public static Ordering definedBy(Class<? extends Factory> cls, Description description) throws InvalidOrderingException {
        if (cls == null) {
            throw new NullPointerException("factoryClass cannot be null");
        }
        if (description == null) {
            throw new NullPointerException("annotatedTestClass cannot be null");
        }
        try {
            return definedBy(cls.getConstructor(new Class[0]).newInstance(new Object[0]), description);
        } catch (NoSuchMethodException unused) {
            Object[] objArr = new Object[2];
            String canonicalName = cls.getCanonicalName();
            if (canonicalName == null) {
                canonicalName = cls.getName();
            }
            objArr[0] = canonicalName;
            objArr[1] = cls.getSimpleName();
            throw new InvalidOrderingException(String.format("Ordering class %s should have a public constructor with signature %s(Ordering.Context context)", objArr));
        } catch (Exception e5) {
            throw new InvalidOrderingException("Could not create ordering for " + description, e5);
        }
    }

    public static Ordering shuffledBy(Random random) {
        return new a(random);
    }

    public boolean a() {
        return !(this instanceof a);
    }

    public void apply(Object obj) throws InvalidOrderingException {
        if (obj instanceof Orderable) {
            ((Orderable) obj).order(new Orderer(this));
        }
    }

    public abstract List<Description> orderItems(Collection<Description> collection);

    public static Ordering definedBy(Factory factory, Description description) throws InvalidOrderingException {
        if (factory == null) {
            throw new NullPointerException("factory cannot be null");
        }
        if (description != null) {
            return factory.create(new Context(description));
        }
        throw new NullPointerException("annotatedTestClass cannot be null");
    }
}
