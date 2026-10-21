package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes9.dex */
public class PlaceholderForType extends TypeBase {
    protected JavaType _actualType;
    protected final int _ordinal;

    public PlaceholderForType(int i10) {
        super(Object.class, TypeBindings.emptyBindings(), TypeFactory.unknownType(), null, 1, null, null, false);
        this._ordinal = i10;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType _narrow(Class<?> cls) {
        a();
        throw null;
    }

    public final void a() {
        throw new UnsupportedOperationException("Operation should not be attempted on ".concat(getClass().getName()));
    }

    public JavaType actualType() {
        return this._actualType;
    }

    @Override // com.fasterxml.jackson.databind.type.TypeBase
    public String buildCanonicalName() {
        return toString();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public boolean equals(Object obj) {
        return obj == this;
    }

    @Override // com.fasterxml.jackson.databind.type.TypeBase, com.fasterxml.jackson.databind.JavaType
    public StringBuilder getErasedSignature(StringBuilder sb2) {
        sb2.append(Typography.dollar);
        sb2.append(this._ordinal + 1);
        return sb2;
    }

    @Override // com.fasterxml.jackson.databind.type.TypeBase, com.fasterxml.jackson.databind.JavaType
    public StringBuilder getGenericSignature(StringBuilder sb2) {
        return getErasedSignature(sb2);
    }

    @Override // com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.core.type.ResolvedType
    public boolean isContainerType() {
        return false;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType refine(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        a();
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public String toString() {
        return getErasedSignature(new StringBuilder()).toString();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType withContentType(JavaType javaType) {
        a();
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType withContentTypeHandler(Object obj) {
        a();
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType withContentValueHandler(Object obj) {
        a();
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType withStaticTyping() {
        a();
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType withTypeHandler(Object obj) {
        a();
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType withValueHandler(Object obj) {
        a();
        throw null;
    }

    public void actualType(JavaType javaType) {
        this._actualType = javaType;
    }
}
