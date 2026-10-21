package com.facetec.sdk;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class ex implements el, Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ex f41503a = new ex();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f41505c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private double f41507e = -1.0d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f41504b = 136;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f41506d = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private List<ds> f41509i = Collections.emptyList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List<ds> f41508f = Collections.emptyList();

    private boolean a(Class<?> cls) {
        if (this.f41507e == -1.0d || b((et) cls.getAnnotation(et.class), (es) cls.getAnnotation(es.class))) {
            return (!this.f41506d && e(cls)) || c(cls);
        }
        return true;
    }

    private boolean b(boolean z10) {
        Iterator<ds> it = (z10 ? this.f41509i : this.f41508f).iterator();
        while (it.hasNext()) {
            if (it.next().d()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public ex clone() {
        try {
            return (ex) super.clone();
        } catch (CloneNotSupportedException e5) {
            throw new AssertionError(e5);
        }
    }

    private static boolean e(Class<?> cls) {
        return cls.isMemberClass() && !d(cls);
    }

    public final boolean d(Field field, boolean z10) {
        em emVar;
        if ((this.f41504b & field.getModifiers()) != 0) {
            return true;
        }
        if ((this.f41507e != -1.0d && !b((et) field.getAnnotation(et.class), (es) field.getAnnotation(es.class))) || field.isSynthetic()) {
            return true;
        }
        if (this.f41505c && ((emVar = (em) field.getAnnotation(em.class)) == null || (!z10 ? emVar.e() : emVar.a()))) {
            return true;
        }
        if ((!this.f41506d && e(field.getType())) || c(field.getType())) {
            return true;
        }
        List<ds> list = z10 ? this.f41509i : this.f41508f;
        if (list.isEmpty()) {
            return false;
        }
        new dx(field);
        Iterator<ds> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().c()) {
                return true;
            }
        }
        return false;
    }

    private boolean e(et etVar) {
        return etVar == null || etVar.a() <= this.f41507e;
    }

    @Override // com.facetec.sdk.el
    public final <T> eo<T> c(final dv dvVar, final fy<T> fyVar) {
        boolean zA = a(fyVar.d());
        final boolean z10 = zA || b(true);
        final boolean z11 = zA || b(false);
        if (z10 || z11) {
            return new eo<T>() { // from class: com.facetec.sdk.ex.3

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                private eo<T> f41514e;

                private eo<T> d() {
                    eo<T> eoVar = this.f41514e;
                    if (eoVar != null) {
                        return eoVar;
                    }
                    eo<T> eoVarC = dvVar.c(ex.this, fyVar);
                    this.f41514e = eoVarC;
                    return eoVarC;
                }

                @Override // com.facetec.sdk.eo
                public final T a(fz fzVar) throws Throwable {
                    if (!z11) {
                        return d().a(fzVar);
                    }
                    fzVar.o();
                    return null;
                }

                @Override // com.facetec.sdk.eo
                public final void b(ga gaVar, T t10) throws IOException {
                    if (z10) {
                        gaVar.g();
                    } else {
                        d().b(gaVar, t10);
                    }
                }
            };
        }
        return null;
    }

    private boolean b(et etVar, es esVar) {
        return e(etVar) && b(esVar);
    }

    private boolean b(es esVar) {
        return esVar == null || esVar.e() > this.f41507e;
    }

    public final boolean c(Class<?> cls, boolean z10) {
        return a(cls) || b(z10);
    }

    private static boolean c(Class<?> cls) {
        if (Enum.class.isAssignableFrom(cls)) {
            return false;
        }
        return cls.isAnonymousClass() || cls.isLocalClass();
    }

    private static boolean d(Class<?> cls) {
        return (cls.getModifiers() & 8) != 0;
    }
}
