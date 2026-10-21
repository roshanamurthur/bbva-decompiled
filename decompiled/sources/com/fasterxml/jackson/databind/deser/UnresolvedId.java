package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.databind.util.ClassUtil;

/* JADX INFO: loaded from: classes9.dex */
public class UnresolvedId {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f43204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JsonLocation f43205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Class<?> f43206c;

    public UnresolvedId(Object obj, Class<?> cls, JsonLocation jsonLocation) {
        this.f43204a = obj;
        this.f43206c = cls;
        this.f43205b = jsonLocation;
    }

    public Object getId() {
        return this.f43204a;
    }

    public JsonLocation getLocation() {
        return this.f43205b;
    }

    public Class<?> getType() {
        return this.f43206c;
    }

    public String toString() {
        return String.format("Object id [%s] (for %s) at %s", this.f43204a, ClassUtil.nameOf(this.f43206c), this.f43205b);
    }
}
