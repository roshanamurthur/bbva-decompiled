package com.facetec.sdk;

import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class fg<E> extends eo<Object> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final el f41591e = new el() { // from class: com.facetec.sdk.fg.1
        @Override // com.facetec.sdk.el
        public final <T> eo<T> c(dv dvVar, fy<T> fyVar) {
            Type typeB = fyVar.b();
            if (!(typeB instanceof GenericArrayType) && (!(typeB instanceof Class) || !((Class) typeB).isArray())) {
                return null;
            }
            Type typeD = ey.d(typeB);
            return new fg(dvVar, dvVar.b(fy.e(typeD)), ey.e(typeD));
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class<E> f41592a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final eo<E> f41593c;

    public fg(dv dvVar, eo<E> eoVar, Class<E> cls) {
        this.f41593c = new fv(dvVar, eoVar, cls);
        this.f41592a = cls;
    }

    @Override // com.facetec.sdk.eo
    public final Object a(fz fzVar) throws IOException {
        if (fzVar.j() == gb.NULL) {
            fzVar.m();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        fzVar.a();
        while (fzVar.c()) {
            arrayList.add(this.f41593c.a(fzVar));
        }
        fzVar.b();
        int size = arrayList.size();
        Object objNewInstance = Array.newInstance((Class<?>) this.f41592a, size);
        for (int i10 = 0; i10 < size; i10++) {
            Array.set(objNewInstance, i10, arrayList.get(i10));
        }
        return objNewInstance;
    }

    @Override // com.facetec.sdk.eo
    public final void b(ga gaVar, Object obj) throws IOException {
        if (obj == null) {
            gaVar.g();
            return;
        }
        gaVar.c();
        int length = Array.getLength(obj);
        for (int i10 = 0; i10 < length; i10++) {
            this.f41593c.b(gaVar, (E) Array.get(obj, i10));
        }
        gaVar.d();
    }
}
