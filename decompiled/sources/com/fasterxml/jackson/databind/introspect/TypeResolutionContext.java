package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes9.dex */
public interface TypeResolutionContext {

    public static class Basic implements TypeResolutionContext {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final TypeFactory f43367p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final TypeBindings f43368q0;

        public Basic(TypeFactory typeFactory, TypeBindings typeBindings) {
            this.f43367p0 = typeFactory;
            this.f43368q0 = typeBindings;
        }

        @Override // com.fasterxml.jackson.databind.introspect.TypeResolutionContext
        public JavaType resolveType(Type type) {
            return this.f43367p0.constructType(type, this.f43368q0);
        }
    }

    JavaType resolveType(Type type);
}
