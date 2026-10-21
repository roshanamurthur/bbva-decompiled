package com.facetec.sdk;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* JADX INFO: loaded from: classes9.dex */
public final class ge {
    public static Type a(Type type, Object obj) {
        if (obj != null) {
            return (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class)) ? obj.getClass() : type;
        }
        return type;
    }

    public static boolean a(eo eoVar) {
        return ((eoVar instanceof gj) || (eoVar instanceof fp.c)) ? false : true;
    }
}
