package com.facetec.sdk;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
public final class fe implements el {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ev f41572b;

    public static final class d<E> extends eo<Collection<E>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ez<? extends Collection<E>> f41573b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final eo<E> f41574c;

        public d(dv dvVar, Type type, eo<E> eoVar, ez<? extends Collection<E>> ezVar) {
            this.f41574c = new fv(dvVar, eoVar, type);
            this.f41573b = ezVar;
        }

        @Override // com.facetec.sdk.eo
        public final /* synthetic */ Object a(fz fzVar) throws IOException {
            if (fzVar.j() == gb.NULL) {
                fzVar.m();
                return null;
            }
            Collection<E> collectionC = this.f41573b.c();
            fzVar.a();
            while (fzVar.c()) {
                collectionC.add(this.f41574c.a(fzVar));
            }
            fzVar.b();
            return collectionC;
        }

        @Override // com.facetec.sdk.eo
        public final /* synthetic */ void b(ga gaVar, Object obj) throws IOException {
            Collection collection = (Collection) obj;
            if (collection == null) {
                gaVar.g();
                return;
            }
            gaVar.c();
            Iterator<E> it = collection.iterator();
            while (it.hasNext()) {
                this.f41574c.b(gaVar, it.next());
            }
            gaVar.d();
        }
    }

    public fe(ev evVar) {
        this.f41572b = evVar;
    }

    @Override // com.facetec.sdk.el
    public final <T> eo<T> c(dv dvVar, fy<T> fyVar) {
        Type typeB = fyVar.b();
        Class<? super T> clsD = fyVar.d();
        if (!Collection.class.isAssignableFrom(clsD)) {
            return null;
        }
        Type typeB2 = ey.b(typeB, clsD);
        return new d(dvVar, typeB2, dvVar.b(fy.e(typeB2)), this.f41572b.e(fyVar));
    }
}
