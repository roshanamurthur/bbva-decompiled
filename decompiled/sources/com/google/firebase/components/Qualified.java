package com.google.firebase.components;

import androidx.annotation.NonNull;
import java.lang.annotation.Annotation;

/* JADX INFO: loaded from: classes10.dex */
public final class Qualified<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class<? extends Annotation> f47680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class<T> f47681b;

    public @interface a {
    }

    public Qualified(Class<? extends Annotation> cls, Class<T> cls2) {
        this.f47680a = cls;
        this.f47681b = cls2;
    }

    @NonNull
    public static <T> Qualified<T> qualified(Class<? extends Annotation> cls, Class<T> cls2) {
        return new Qualified<>(cls, cls2);
    }

    @NonNull
    public static <T> Qualified<T> unqualified(Class<T> cls) {
        return new Qualified<>(a.class, cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Qualified.class != obj.getClass()) {
            return false;
        }
        Qualified qualified = (Qualified) obj;
        if (this.f47681b.equals(qualified.f47681b)) {
            return this.f47680a.equals(qualified.f47680a);
        }
        return false;
    }

    public int hashCode() {
        return this.f47680a.hashCode() + (this.f47681b.hashCode() * 31);
    }

    public String toString() {
        Class<T> cls = this.f47681b;
        Class<? extends Annotation> cls2 = this.f47680a;
        if (cls2 == a.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
