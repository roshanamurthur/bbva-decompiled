package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/* JADX INFO: loaded from: classes9.dex */
public class TypeParser implements Serializable {
    protected final TypeFactory _factory;

    public static final class a extends StringTokenizer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f43482a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f43483b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f43484c;

        public a(String str) {
            super(str, "<,>", true);
            this.f43482a = str;
        }

        @Override // java.util.StringTokenizer
        public final boolean hasMoreTokens() {
            return this.f43484c != null || super.hasMoreTokens();
        }

        @Override // java.util.StringTokenizer
        public final String nextToken() {
            String str = this.f43484c;
            if (str != null) {
                this.f43484c = null;
                return str;
            }
            String strNextToken = super.nextToken();
            this.f43483b = strNextToken.length() + this.f43483b;
            return strNextToken.trim();
        }
    }

    public TypeParser(TypeFactory typeFactory) {
        this._factory = typeFactory;
    }

    public IllegalArgumentException _problem(a aVar, String str) {
        String str2 = aVar.f43482a;
        return new IllegalArgumentException(String.format("Failed to parse type '%s' (remaining: '%s'): %s", str2, str2.substring(aVar.f43483b), str));
    }

    public Class<?> findClass(String str, a aVar) {
        try {
            return this._factory.findClass(str);
        } catch (Exception e5) {
            ClassUtil.throwIfRTE(e5);
            throw _problem(aVar, "Cannot locate class '" + str + "', problem: " + e5.getMessage());
        }
    }

    public JavaType parse(String str) throws IllegalArgumentException {
        a aVar = new a(str.trim());
        JavaType type = parseType(aVar);
        if (aVar.hasMoreTokens()) {
            throw _problem(aVar, "Unexpected tokens after complete type");
        }
        return type;
    }

    public JavaType parseType(a aVar) throws IllegalArgumentException {
        if (!aVar.hasMoreTokens()) {
            throw _problem(aVar, "Unexpected end-of-string");
        }
        Class<?> clsFindClass = findClass(aVar.nextToken(), aVar);
        if (aVar.hasMoreTokens()) {
            String strNextToken = aVar.nextToken();
            if ("<".equals(strNextToken)) {
                return this._factory._fromClass(null, clsFindClass, TypeBindings.create(clsFindClass, parseTypes(aVar)));
            }
            aVar.f43484c = strNextToken;
        }
        return this._factory._fromClass(null, clsFindClass, TypeBindings.emptyBindings());
    }

    public List<JavaType> parseTypes(a aVar) throws IllegalArgumentException {
        ArrayList arrayList = new ArrayList();
        while (aVar.hasMoreTokens()) {
            arrayList.add(parseType(aVar));
            if (!aVar.hasMoreTokens()) {
                break;
            }
            String strNextToken = aVar.nextToken();
            if (">".equals(strNextToken)) {
                return arrayList;
            }
            if (!",".equals(strNextToken)) {
                throw _problem(aVar, "Unexpected token '" + strNextToken + "', expected ',' or '>')");
            }
        }
        throw _problem(aVar, "Unexpected end-of-string");
    }

    public TypeParser withFactory(TypeFactory typeFactory) {
        return typeFactory == this._factory ? this : new TypeParser(typeFactory);
    }
}
