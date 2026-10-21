package com.esotericsoftware.kryo.util;

import java.lang.reflect.TypeVariable;

/* JADX INFO: loaded from: classes9.dex */
public final class NoGenerics implements Generics {
    public static final Generics INSTANCE = new NoGenerics();

    private NoGenerics() {
    }

    @Override // com.esotericsoftware.kryo.util.Generics
    public int getGenericTypesSize() {
        return 0;
    }

    @Override // com.esotericsoftware.kryo.util.Generics
    public Class nextGenericClass() {
        return null;
    }

    @Override // com.esotericsoftware.kryo.util.Generics
    public Generics.GenericType[] nextGenericTypes() {
        return null;
    }

    @Override // com.esotericsoftware.kryo.util.Generics
    public int pushTypeVariables(Generics.GenericsHierarchy genericsHierarchy, Generics.GenericType[] genericTypeArr) {
        return 0;
    }

    @Override // com.esotericsoftware.kryo.util.Generics
    public Class resolveTypeVariable(TypeVariable typeVariable) {
        return null;
    }

    @Override // com.esotericsoftware.kryo.util.Generics
    public void popGenericType() {
    }

    @Override // com.esotericsoftware.kryo.util.Generics
    public void popTypeVariables(int i10) {
    }

    @Override // com.esotericsoftware.kryo.util.Generics
    public void pushGenericType(Generics.GenericType genericType) {
    }
}
