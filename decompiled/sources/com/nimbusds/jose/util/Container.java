package com.nimbusds.jose.util;

import net.jcip.annotations.NotThreadSafe;

/* JADX INFO: loaded from: classes10.dex */
@NotThreadSafe
public class Container<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public T f62825a;

    public Container() {
    }

    public T get() {
        return this.f62825a;
    }

    public void set(T t10) {
        this.f62825a = t10;
    }

    public Container(T t10) {
        this.f62825a = t10;
    }
}
