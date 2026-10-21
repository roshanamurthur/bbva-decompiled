package com.google.firebase.components;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import tf.a;

/* JADX INFO: loaded from: classes10.dex */
public final class Component<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set<Qualified<? super T>> f47644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set<Dependency> f47645c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f47646d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f47647e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ComponentFactory<T> f47648f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Set<Class<?>> f47649g;

    public Component(@Nullable String str, Set<Qualified<? super T>> set, Set<Dependency> set2, int i10, int i11, ComponentFactory<T> componentFactory, Set<Class<?>> set3) {
        this.f47643a = str;
        this.f47644b = Collections.unmodifiableSet(set);
        this.f47645c = Collections.unmodifiableSet(set2);
        this.f47646d = i10;
        this.f47647e = i11;
        this.f47648f = componentFactory;
        this.f47649g = Collections.unmodifiableSet(set3);
    }

    public static <T> Builder<T> builder(Class<T> cls) {
        return new Builder<>(cls, new Class[0]);
    }

    public static <T> Component<T> intoSet(T t10, Class<T> cls) {
        return intoSetBuilder(cls).factory(new a(t10)).build();
    }

    public static <T> Builder<T> intoSetBuilder(Class<T> cls) {
        Builder<T> builder = builder(cls);
        builder.f47654e = 1;
        return builder;
    }

    @Deprecated
    public static <T> Component<T> of(Class<T> cls, T t10) {
        return builder(cls).factory(new a(t10)).build();
    }

    public Set<Dependency> getDependencies() {
        return this.f47645c;
    }

    public ComponentFactory<T> getFactory() {
        return this.f47648f;
    }

    @Nullable
    public String getName() {
        return this.f47643a;
    }

    public Set<Qualified<? super T>> getProvidedInterfaces() {
        return this.f47644b;
    }

    public Set<Class<?>> getPublishedEvents() {
        return this.f47649g;
    }

    public boolean isAlwaysEager() {
        return this.f47646d == 1;
    }

    public boolean isEagerInDefaultApp() {
        return this.f47646d == 2;
    }

    public boolean isLazy() {
        return this.f47646d == 0;
    }

    public boolean isValue() {
        return this.f47647e == 0;
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.f47644b.toArray()) + ">{" + this.f47646d + ", type=" + this.f47647e + ", deps=" + Arrays.toString(this.f47645c.toArray()) + "}";
    }

    public Component<T> withFactory(ComponentFactory<T> componentFactory) {
        return new Component<>(this.f47643a, this.f47644b, this.f47645c, this.f47646d, this.f47647e, componentFactory, this.f47649g);
    }

    @SafeVarargs
    public static <T> Builder<T> builder(Class<T> cls, Class<? super T>... clsArr) {
        return new Builder<>(cls, clsArr);
    }

    public static <T> Component<T> intoSet(T t10, Qualified<T> qualified) {
        return intoSetBuilder(qualified).factory(new a(t10)).build();
    }

    @SafeVarargs
    public static <T> Component<T> of(T t10, Class<T> cls, Class<? super T>... clsArr) {
        return builder(cls, clsArr).factory(new a(t10)).build();
    }

    public static <T> Builder<T> builder(Qualified<T> qualified) {
        return new Builder<>(qualified, new Qualified[0]);
    }

    public static <T> Builder<T> intoSetBuilder(Qualified<T> qualified) {
        Builder<T> builder = builder(qualified);
        builder.f47654e = 1;
        return builder;
    }

    @SafeVarargs
    public static <T> Component<T> of(T t10, Qualified<T> qualified, Qualified<? super T>... qualifiedArr) {
        return builder(qualified, qualifiedArr).factory(new a(t10)).build();
    }

    @SafeVarargs
    public static <T> Builder<T> builder(Qualified<T> qualified, Qualified<? super T>... qualifiedArr) {
        return new Builder<>(qualified, qualifiedArr);
    }

    public static class Builder<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f47650a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final HashSet f47651b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final HashSet f47652c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f47653d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f47654e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public ComponentFactory<T> f47655f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final HashSet f47656g;

        @SafeVarargs
        public Builder() {
            throw null;
        }

        public Builder(Class cls, Class[] clsArr) {
            this.f47650a = null;
            HashSet hashSet = new HashSet();
            this.f47651b = hashSet;
            this.f47652c = new HashSet();
            this.f47653d = 0;
            this.f47654e = 0;
            this.f47656g = new HashSet();
            Preconditions.checkNotNull(cls, "Null interface");
            hashSet.add(Qualified.unqualified(cls));
            for (Class cls2 : clsArr) {
                Preconditions.checkNotNull(cls2, "Null interface");
                this.f47651b.add(Qualified.unqualified(cls2));
            }
        }

        @CanIgnoreReturnValue
        public Builder<T> add(Dependency dependency) {
            Preconditions.checkNotNull(dependency, "Null dependency");
            Preconditions.checkArgument(!this.f47651b.contains(dependency.getInterface()), "Components are not allowed to depend on interfaces they themselves provide.");
            this.f47652c.add(dependency);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder<T> alwaysEager() {
            Preconditions.checkState(this.f47653d == 0, "Instantiation type has already been set.");
            this.f47653d = 1;
            return this;
        }

        public Component<T> build() {
            Preconditions.checkState(this.f47655f != null, "Missing required property: factory.");
            return new Component<>(this.f47650a, new HashSet(this.f47651b), new HashSet(this.f47652c), this.f47653d, this.f47654e, this.f47655f, this.f47656g);
        }

        @CanIgnoreReturnValue
        public Builder<T> eagerInDefaultApp() {
            Preconditions.checkState(this.f47653d == 0, "Instantiation type has already been set.");
            this.f47653d = 2;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder<T> factory(ComponentFactory<T> componentFactory) {
            this.f47655f = (ComponentFactory) Preconditions.checkNotNull(componentFactory, "Null factory");
            return this;
        }

        public Builder<T> name(@NonNull String str) {
            this.f47650a = str;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder<T> publishes(Class<?> cls) {
            this.f47656g.add(cls);
            return this;
        }

        public Builder(Qualified qualified, Qualified[] qualifiedArr) {
            this.f47650a = null;
            HashSet hashSet = new HashSet();
            this.f47651b = hashSet;
            this.f47652c = new HashSet();
            this.f47653d = 0;
            this.f47654e = 0;
            this.f47656g = new HashSet();
            Preconditions.checkNotNull(qualified, "Null interface");
            hashSet.add(qualified);
            for (Qualified qualified2 : qualifiedArr) {
                Preconditions.checkNotNull(qualified2, "Null interface");
            }
            Collections.addAll(this.f47651b, qualifiedArr);
        }
    }
}
