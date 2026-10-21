package com.facetec.sdk;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes9.dex */
public class fy<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Class<? super T> f41708a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Type f41709d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f41710e;

    public fy() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (genericSuperclass instanceof Class) {
            throw new RuntimeException("Missing type parameter.");
        }
        Type typeA = ey.a(((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
        this.f41709d = typeA;
        this.f41708a = (Class<? super T>) ey.e(typeA);
        this.f41710e = this.f41709d.hashCode();
    }

    public static <T> fy<T> c(Class<T> cls) {
        return new fy<>(cls);
    }

    public static fy<?> e(Type type) {
        return new fy<>(type);
    }

    public final Type b() {
        return this.f41709d;
    }

    public final Class<? super T> d() {
        return this.f41708a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof fy) && ey.e(this.f41709d, ((fy) obj).f41709d);
    }

    public final int hashCode() {
        return this.f41710e;
    }

    public final String toString() {
        return ey.b(this.f41709d);
    }

    private fy(Type type) {
        Type typeA = ey.a((Type) er.b(type));
        this.f41709d = typeA;
        this.f41708a = (Class<? super T>) ey.e(typeA);
        this.f41710e = this.f41709d.hashCode();
    }
}
