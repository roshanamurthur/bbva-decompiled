package com.facetec.sdk;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes9.dex */
public final class fm implements el {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final boolean f41614d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ev f41615e;

    public final class a<K, V> extends eo<Map<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final eo<K> f41616a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final eo<V> f41617b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final ez<? extends Map<K, V>> f41619d;

        public a(dv dvVar, Type type, eo<K> eoVar, Type type2, eo<V> eoVar2, ez<? extends Map<K, V>> ezVar) {
            this.f41616a = new fv(dvVar, eoVar, type);
            this.f41617b = new fv(dvVar, eoVar2, type2);
            this.f41619d = ezVar;
        }

        @Override // com.facetec.sdk.eo
        public final /* synthetic */ Object a(fz fzVar) throws Throwable {
            gb gbVarJ = fzVar.j();
            if (gbVarJ == gb.NULL) {
                fzVar.m();
                return null;
            }
            Map<K, V> mapC = this.f41619d.c();
            if (gbVarJ == gb.BEGIN_ARRAY) {
                fzVar.a();
                while (fzVar.c()) {
                    fzVar.a();
                    K kA = this.f41616a.a(fzVar);
                    if (mapC.put(kA, this.f41617b.a(fzVar)) != null) {
                        throw new en("duplicate key: ".concat(String.valueOf(kA)));
                    }
                    fzVar.b();
                }
                fzVar.b();
            } else {
                fzVar.d();
                while (fzVar.c()) {
                    eu.f41472c.b(fzVar);
                    K kA2 = this.f41616a.a(fzVar);
                    if (mapC.put(kA2, this.f41617b.a(fzVar)) != null) {
                        throw new en("duplicate key: ".concat(String.valueOf(kA2)));
                    }
                }
                fzVar.e();
            }
            return mapC;
        }

        @Override // com.facetec.sdk.eo
        public final /* synthetic */ void b(ga gaVar, Object obj) throws IOException {
            String strD;
            Map map = (Map) obj;
            if (map == null) {
                gaVar.g();
                return;
            }
            if (!fm.this.f41614d) {
                gaVar.a();
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    gaVar.c(String.valueOf(entry.getKey()));
                    this.f41617b.b(gaVar, entry.getValue());
                }
                gaVar.b();
                return;
            }
            ArrayList arrayList = new ArrayList(map.size());
            ArrayList arrayList2 = new ArrayList(map.size());
            int i10 = 0;
            boolean z10 = false;
            for (Map.Entry<K, V> entry2 : map.entrySet()) {
                ec ecVarD = this.f41616a.d(entry2.getKey());
                arrayList.add(ecVarD);
                arrayList2.add(entry2.getValue());
                z10 |= ecVarD.h() || ecVarD.j();
            }
            if (z10) {
                gaVar.c();
                int size = arrayList.size();
                while (i10 < size) {
                    gaVar.c();
                    fh.e((ec) arrayList.get(i10), gaVar);
                    this.f41617b.b(gaVar, (V) arrayList2.get(i10));
                    gaVar.d();
                    i10++;
                }
                gaVar.d();
                return;
            }
            gaVar.a();
            int size2 = arrayList.size();
            while (i10 < size2) {
                ec ecVar = (ec) arrayList.get(i10);
                if (ecVar.i()) {
                    ei eiVarN = ecVar.n();
                    if (eiVarN.m()) {
                        strD = String.valueOf(eiVarN.b());
                    } else if (eiVarN.k()) {
                        strD = Boolean.toString(eiVarN.f());
                    } else {
                        if (!eiVarN.l()) {
                            throw new AssertionError();
                        }
                        strD = eiVarN.d();
                    }
                } else {
                    if (!ecVar.g()) {
                        throw new AssertionError();
                    }
                    strD = AbstractJsonLexerKt.NULL;
                }
                gaVar.c(strD);
                this.f41617b.b(gaVar, (V) arrayList2.get(i10));
                i10++;
            }
            gaVar.b();
        }
    }

    public fm(ev evVar, boolean z10) {
        this.f41615e = evVar;
        this.f41614d = z10;
    }

    @Override // com.facetec.sdk.el
    public final <T> eo<T> c(dv dvVar, fy<T> fyVar) {
        Type typeB = fyVar.b();
        if (!Map.class.isAssignableFrom(fyVar.d())) {
            return null;
        }
        Type[] typeArrE = ey.e(typeB, ey.e(typeB));
        Type type = typeArrE[0];
        return new a(dvVar, typeArrE[0], (type == Boolean.TYPE || type == Boolean.class) ? ft.f41664d : dvVar.b(fy.e(type)), typeArrE[1], dvVar.b(fy.e(typeArrE[1])), this.f41615e.e(fyVar));
    }
}
