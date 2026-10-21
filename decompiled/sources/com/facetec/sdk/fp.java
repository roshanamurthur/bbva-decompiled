package com.facetec.sdk;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class fp implements el {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ev f41624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final fn f41625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final dz f41626c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ex f41627d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final fw f41628e = fw.e();

    public static final class c<T> extends eo<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ez<T> f41636a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Map<String, e> f41637b;

        public c(ez<T> ezVar, Map<String, e> map) {
            this.f41636a = ezVar;
            this.f41637b = map;
        }

        @Override // com.facetec.sdk.eo
        public final T a(fz fzVar) throws Throwable {
            if (fzVar.j() == gb.NULL) {
                fzVar.m();
                return null;
            }
            T tC = this.f41636a.c();
            try {
                fzVar.d();
                while (fzVar.c()) {
                    e eVar = this.f41637b.get(fzVar.i());
                    if (eVar == null || !eVar.f41639b) {
                        fzVar.o();
                    } else {
                        eVar.d(fzVar, tC);
                    }
                }
                fzVar.e();
                return tC;
            } catch (IllegalAccessException e5) {
                throw new AssertionError(e5);
            } catch (IllegalStateException e7) {
                throw new en(e7);
            }
        }

        @Override // com.facetec.sdk.eo
        public final void b(ga gaVar, T t10) throws IOException {
            if (t10 == null) {
                gaVar.g();
                return;
            }
            gaVar.a();
            try {
                for (e eVar : this.f41637b.values()) {
                    if (eVar.a(t10)) {
                        gaVar.c(eVar.f41640c);
                        eVar.e(gaVar, t10);
                    }
                }
                gaVar.b();
            } catch (IllegalAccessException e5) {
                throw new AssertionError(e5);
            }
        }
    }

    public static abstract class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final boolean f41638a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final boolean f41639b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final String f41640c;

        public e(String str, boolean z10, boolean z11) {
            this.f41640c = str;
            this.f41638a = z10;
            this.f41639b = z11;
        }

        public abstract boolean a(Object obj) throws IllegalAccessException, IOException;

        public abstract void d(fz fzVar, Object obj) throws IllegalAccessException, IOException;

        public abstract void e(ga gaVar, Object obj) throws IllegalAccessException, IOException;
    }

    public fp(ev evVar, dz dzVar, ex exVar, fn fnVar) {
        this.f41624a = evVar;
        this.f41626c = dzVar;
        this.f41627d = exVar;
        this.f41625b = fnVar;
    }

    private boolean d(Field field, boolean z10) {
        return d(field, z10, this.f41627d);
    }

    @Override // com.facetec.sdk.el
    public final <T> eo<T> c(dv dvVar, fy<T> fyVar) {
        Class<? super T> clsD = fyVar.d();
        if (Object.class.isAssignableFrom(clsD)) {
            return new c(this.f41624a.e(fyVar), c(dvVar, fyVar, clsD));
        }
        return null;
    }

    private static boolean d(Field field, boolean z10, ex exVar) {
        return (exVar.c(field.getType(), z10) || exVar.d(field, z10)) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x009b  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:37:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:44:0x0119  */
    /* JADX WARN: Code duplicated, block: B:54:0x014f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x013f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x011a A[SYNTHETIC] */
    private Map<String, e> c(final dv dvVar, fy<?> fyVar, Class<?> cls) {
        List list;
        List listSingletonList;
        int size;
        e eVar;
        int i10;
        e eVar2;
        int i11;
        int i12;
        Field[] fieldArr;
        Class<?> cls2;
        boolean z10;
        boolean z11;
        final fy<?> fyVarE;
        eq eqVar;
        e eVar3;
        eo<?> eoVarB;
        boolean z12;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (cls.isInterface()) {
            return linkedHashMap;
        }
        Type typeB = fyVar.b();
        fy<?> fyVarE2 = fyVar;
        Class<?> clsD = cls;
        while (clsD != Object.class) {
            Field[] declaredFields = clsD.getDeclaredFields();
            int length = declaredFields.length;
            boolean z13 = false;
            int i13 = 0;
            while (i13 < length) {
                final Field field = declaredFields[i13];
                boolean zD = this.d(field, true);
                boolean zD2 = this.d(field, z13);
                if (zD || zD2) {
                    this.f41628e.e(field);
                    Type typeC = ey.c(fyVarE2.b(), clsD, field.getGenericType());
                    ep epVar = (ep) field.getAnnotation(ep.class);
                    if (epVar == null) {
                        listSingletonList = Collections.singletonList(this.f41626c.b(field));
                    } else {
                        String strC = epVar.c();
                        String[] strArrB = epVar.b();
                        if (strArrB.length == 0) {
                            listSingletonList = Collections.singletonList(strC);
                        } else {
                            ArrayList arrayList = new ArrayList(strArrB.length + 1);
                            arrayList.add(strC);
                            for (String str : strArrB) {
                                arrayList.add(str);
                            }
                            list = arrayList;
                        }
                        size = list.size();
                        eVar = null;
                        i10 = 0;
                        while (i10 < size) {
                            String str2 = (String) list.get(i10);
                            if (i10 != 0) {
                                z11 = false;
                            } else {
                                z11 = zD;
                            }
                            fyVarE = fy.e(typeC);
                            final boolean zB = fc.b(fyVarE.d());
                            eqVar = (eq) field.getAnnotation(eq.class);
                            eVar3 = eVar;
                            if (eqVar != null) {
                                eoVarB = fn.b(this.f41624a, dvVar, fyVarE, eqVar);
                            } else {
                                eoVarB = null;
                            }
                            if (eoVarB != null) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (eoVarB == null) {
                                eoVarB = dvVar.b(fyVarE);
                            }
                            final eo<?> eoVar = eoVarB;
                            int i14 = i10;
                            int i15 = size;
                            Field field2 = field;
                            int i16 = i13;
                            final boolean z14 = z12;
                            List list2 = list;
                            int i17 = length;
                            Field[] fieldArr2 = declaredFields;
                            Class<?> cls3 = clsD;
                            eVar = (e) linkedHashMap.put(str2, new e(str2, z11, zD2) { // from class: com.facetec.sdk.fp.3
                                @Override // com.facetec.sdk.fp.e
                                public final boolean a(Object obj) throws IllegalAccessException, IOException {
                                    return this.f41638a && field.get(obj) != obj;
                                }

                                @Override // com.facetec.sdk.fp.e
                                public final void d(fz fzVar, Object obj) throws IllegalAccessException, IOException {
                                    Object objA = eoVar.a(fzVar);
                                    if (objA == null && zB) {
                                        return;
                                    }
                                    field.set(obj, objA);
                                }

                                @Override // com.facetec.sdk.fp.e
                                public final void e(ga gaVar, Object obj) throws IllegalAccessException, IOException {
                                    (z14 ? eoVar : new fv(dvVar, eoVar, fyVarE.b())).b(gaVar, field.get(obj));
                                }
                            });
                            if (eVar3 == null) {
                                eVar = eVar3;
                            }
                            i10 = i14 + 1;
                            this = this;
                            dvVar = dvVar;
                            clsD = cls3;
                            zD = z11;
                            length = i17;
                            size = i15;
                            field = field2;
                            i13 = i16;
                            list = list2;
                            declaredFields = fieldArr2;
                        }
                        eVar2 = eVar;
                        i11 = i13;
                        i12 = length;
                        fieldArr = declaredFields;
                        cls2 = clsD;
                        z10 = false;
                        if (eVar2 == null) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(typeB);
                            sb2.append(" declares multiple JSON fields named ");
                            sb2.append(eVar2.f41640c);
                            throw new IllegalArgumentException(sb2.toString());
                        }
                    }
                    list = listSingletonList;
                    size = list.size();
                    eVar = null;
                    i10 = 0;
                    while (i10 < size) {
                        String str3 = (String) list.get(i10);
                        if (i10 != 0) {
                            z11 = false;
                        } else {
                            z11 = zD;
                        }
                        fyVarE = fy.e(typeC);
                        final boolean zB2 = fc.b(fyVarE.d());
                        eqVar = (eq) field.getAnnotation(eq.class);
                        eVar3 = eVar;
                        if (eqVar != null) {
                            eoVarB = fn.b(this.f41624a, dvVar, fyVarE, eqVar);
                        } else {
                            eoVarB = null;
                        }
                        if (eoVarB != null) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (eoVarB == null) {
                            eoVarB = dvVar.b(fyVarE);
                        }
                        final eo eoVar2 = eoVarB;
                        int i18 = i10;
                        int i19 = size;
                        Field field3 = field;
                        int i110 = i13;
                        final boolean z15 = z12;
                        List list3 = list;
                        int i111 = length;
                        Field[] fieldArr3 = declaredFields;
                        Class<?> cls4 = clsD;
                        eVar = (e) linkedHashMap.put(str3, new e(str3, z11, zD2) { // from class: com.facetec.sdk.fp.3
                            @Override // com.facetec.sdk.fp.e
                            public final boolean a(Object obj) throws IllegalAccessException, IOException {
                                return this.f41638a && field.get(obj) != obj;
                            }

                            @Override // com.facetec.sdk.fp.e
                            public final void d(fz fzVar, Object obj) throws IllegalAccessException, IOException {
                                Object objA = eoVar2.a(fzVar);
                                if (objA == null && zB2) {
                                    return;
                                }
                                field.set(obj, objA);
                            }

                            @Override // com.facetec.sdk.fp.e
                            public final void e(ga gaVar, Object obj) throws IllegalAccessException, IOException {
                                (z15 ? eoVar2 : new fv(dvVar, eoVar2, fyVarE.b())).b(gaVar, field.get(obj));
                            }
                        });
                        if (eVar3 == null) {
                            eVar = eVar3;
                        }
                        i10 = i18 + 1;
                        this = this;
                        dvVar = dvVar;
                        clsD = cls4;
                        zD = z11;
                        length = i111;
                        size = i19;
                        field = field3;
                        i13 = i110;
                        list = list3;
                        declaredFields = fieldArr3;
                    }
                    eVar2 = eVar;
                    i11 = i13;
                    i12 = length;
                    fieldArr = declaredFields;
                    cls2 = clsD;
                    z10 = false;
                    if (eVar2 == null) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(typeB);
                        sb3.append(" declares multiple JSON fields named ");
                        sb3.append(eVar2.f41640c);
                        throw new IllegalArgumentException(sb3.toString());
                    }
                } else {
                    i11 = i13;
                    z10 = z13;
                    i12 = length;
                    fieldArr = declaredFields;
                    cls2 = clsD;
                }
                i13 = i11 + 1;
                this = this;
                dvVar = dvVar;
                clsD = cls2;
                z13 = z10;
                length = i12;
                declaredFields = fieldArr;
            }
            Class<?> cls5 = clsD;
            fyVarE2 = fy.e(ey.c(fyVarE2.b(), cls5, cls5.getGenericSuperclass()));
            clsD = fyVarE2.d();
        }
        return linkedHashMap;
    }
}
