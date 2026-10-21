package com.fasterxml.jackson.databind.type;

import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
public final class ClassKey implements Comparable<ClassKey>, Serializable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public String f43451p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public Class<?> f43452q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f43453r0;

    public ClassKey() {
        this.f43452q0 = null;
        this.f43451p0 = null;
        this.f43453r0 = 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj != null && obj.getClass() == ClassKey.class && ((ClassKey) obj).f43452q0 == this.f43452q0;
    }

    public int hashCode() {
        return this.f43453r0;
    }

    public void reset(Class<?> cls) {
        this.f43452q0 = cls;
        String name = cls.getName();
        this.f43451p0 = name;
        this.f43453r0 = name.hashCode();
    }

    public String toString() {
        return this.f43451p0;
    }

    @Override // java.lang.Comparable
    public int compareTo(ClassKey classKey) {
        return this.f43451p0.compareTo(classKey.f43451p0);
    }

    public ClassKey(Class<?> cls) {
        this.f43452q0 = cls;
        String name = cls.getName();
        this.f43451p0 = name;
        this.f43453r0 = name.hashCode();
    }
}
