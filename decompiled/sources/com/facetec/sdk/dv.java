package com.facetec.sdk;

import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: loaded from: classes9.dex */
public final class dv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static fy<?> f41370a = fy.c(Object.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private fn f41371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<fy<?>, eo<?>> f41372c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ThreadLocal<Map<fy<?>, c<?>>> f41373d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ev f41374e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List<el> f41375f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f41376g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ex f41377h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private dz f41378i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Map<Type, eb<?>> f41379j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f41380k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f41381l;
    private boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f41382n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f41383o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f41384p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f41385q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private ek f41386r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f41387s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f41388t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private List<el> f41389v;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private List<el> f41390y;

    public static class c<T> extends eo<T> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        eo<T> f41395e;

        @Override // com.facetec.sdk.eo
        public final T a(fz fzVar) throws IOException {
            eo<T> eoVar = this.f41395e;
            if (eoVar != null) {
                return eoVar.a(fzVar);
            }
            throw new IllegalStateException();
        }

        @Override // com.facetec.sdk.eo
        public final void b(ga gaVar, T t10) throws IOException {
            eo<T> eoVar = this.f41395e;
            if (eoVar == null) {
                throw new IllegalStateException();
            }
            eoVar.b(gaVar, t10);
        }
    }

    public dv() {
        this(ex.f41503a, dw.IDENTITY, Collections.emptyMap(), false, false, false, true, false, false, false, ek.DEFAULT, null, 2, 2, Collections.emptyList(), Collections.emptyList(), Collections.emptyList());
    }

    private ec a(Object obj, Type type) {
        fk fkVar = new fk();
        d(obj, type, fkVar);
        return fkVar.e();
    }

    public static void d(double d2) {
        if (Double.isNaN(d2) || Double.isInfinite(d2)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(d2);
            sb2.append(" is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    public final <T> eo<T> b(fy<T> fyVar) {
        boolean z10;
        eo<T> eoVar = (eo) this.f41372c.get(fyVar == null ? f41370a : fyVar);
        if (eoVar != null) {
            return eoVar;
        }
        Map<fy<?>, c<?>> map = this.f41373d.get();
        if (map == null) {
            map = new HashMap<>();
            this.f41373d.set(map);
            z10 = true;
        } else {
            z10 = false;
        }
        c<?> cVar = map.get(fyVar);
        if (cVar != null) {
            return cVar;
        }
        try {
            c<?> cVar2 = new c<>();
            map.put(fyVar, cVar2);
            Iterator<el> it = this.f41375f.iterator();
            while (it.hasNext()) {
                eo<T> eoVarC = it.next().c(this, fyVar);
                if (eoVarC != null) {
                    if (cVar2.f41395e != null) {
                        throw new AssertionError();
                    }
                    cVar2.f41395e = eoVarC;
                    this.f41372c.put(fyVar, eoVarC);
                    map.remove(fyVar);
                    if (z10) {
                        this.f41373d.remove();
                    }
                    return eoVarC;
                }
            }
            throw new IllegalArgumentException("GSON (2.8.6) cannot handle ".concat(String.valueOf(fyVar)));
        } catch (Throwable th2) {
            map.remove(fyVar);
            if (z10) {
                this.f41373d.remove();
            }
            throw th2;
        }
    }

    public final <T> eo<T> c(el elVar, fy<T> fyVar) {
        if (!this.f41375f.contains(elVar)) {
            elVar = this.f41371b;
        }
        boolean z10 = false;
        for (el elVar2 : this.f41375f) {
            if (z10) {
                eo<T> eoVarC = elVar2.c(this, fyVar);
                if (eoVarC != null) {
                    return eoVarC;
                }
            } else if (elVar2 == elVar) {
                z10 = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize ".concat(String.valueOf(fyVar)));
    }

    public final <T> eo<T> e(Class<T> cls) {
        return b(fy.c(cls));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("{serializeNulls:");
        sb2.append(this.f41376g);
        sb2.append(",factories:");
        sb2.append(this.f41375f);
        sb2.append(",instanceCreators:");
        sb2.append(this.f41374e);
        sb2.append("}");
        return sb2.toString();
    }

    public final String e(Object obj) {
        return obj == null ? e((ec) ef.f41465b) : c(obj, obj.getClass());
    }

    private void d(Object obj, Type type, ga gaVar) throws ed {
        eo eoVarB = b(fy.e(type));
        boolean zH = gaVar.h();
        gaVar.c(true);
        boolean zF = gaVar.f();
        gaVar.e(this.f41382n);
        boolean zJ = gaVar.j();
        gaVar.d(this.f41376g);
        try {
            try {
                eoVarB.b(gaVar, obj);
                gaVar.c(zH);
                gaVar.e(zF);
                gaVar.d(zJ);
            } catch (IOException e5) {
                throw new ed(e5);
            } catch (AssertionError e7) {
                StringBuilder sb2 = new StringBuilder("AssertionError (GSON 2.8.6): ");
                sb2.append(e7.getMessage());
                AssertionError assertionError = new AssertionError(sb2.toString());
                assertionError.initCause(e7);
                throw assertionError;
            }
        } catch (Throwable th2) {
            gaVar.c(zH);
            gaVar.e(zF);
            gaVar.d(zJ);
            throw th2;
        }
    }

    private void a(ec ecVar, Appendable appendable) throws ed {
        try {
            c(ecVar, d(fh.c(appendable)));
        } catch (IOException e5) {
            throw new ed(e5);
        }
    }

    private String e(ec ecVar) {
        StringWriter stringWriter = new StringWriter();
        a(ecVar, stringWriter);
        return stringWriter.toString();
    }

    public dv(ex exVar, dz dzVar, Map<Type, eb<?>> map, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, ek ekVar, String str, int i10, int i11, List<el> list, List<el> list2, List<el> list3) {
        final eo<Number> eoVar;
        eo<Number> eoVar2;
        eo<Number> eoVar3;
        ArrayList arrayList = new ArrayList(list3);
        arrayList.add(new gl());
        this.f41373d = new ThreadLocal<>();
        this.f41372c = new ConcurrentHashMap();
        this.f41377h = exVar;
        this.f41378i = dzVar;
        this.f41379j = map;
        this.f41374e = new ev(map);
        this.f41376g = z10;
        this.f41381l = z11;
        this.m = z12;
        this.f41382n = z13;
        this.f41380k = z14;
        this.f41383o = z15;
        this.f41387s = z16;
        this.f41386r = ekVar;
        this.f41388t = str;
        this.f41384p = i10;
        this.f41385q = i11;
        this.f41389v = list;
        this.f41390y = list2;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(ft.C);
        arrayList2.add(fo.f41621c);
        arrayList2.add(exVar);
        arrayList2.addAll(arrayList);
        arrayList2.add(ft.f41678s);
        arrayList2.add(ft.f41669i);
        arrayList2.add(ft.f41663c);
        arrayList2.add(ft.f41659a);
        arrayList2.add(ft.f41670j);
        if (ekVar == ek.DEFAULT) {
            eoVar = ft.f41673n;
        } else {
            eoVar = new eo<Number>() { // from class: com.facetec.sdk.dv.3
                @Override // com.facetec.sdk.eo
                public final /* synthetic */ Number a(fz fzVar) throws IOException {
                    if (fzVar.j() != gb.NULL) {
                        return Long.valueOf(fzVar.k());
                    }
                    fzVar.m();
                    return null;
                }

                @Override // com.facetec.sdk.eo
                public final /* synthetic */ void b(ga gaVar, Number number) throws IOException {
                    Number number2 = number;
                    if (number2 == null) {
                        gaVar.g();
                    } else {
                        gaVar.e(number2.toString());
                    }
                }
            };
        }
        arrayList2.add(ft.a(Long.TYPE, Long.class, eoVar));
        Class cls = Double.TYPE;
        if (z16) {
            eoVar2 = ft.f41672l;
        } else {
            eoVar2 = new eo<Number>() { // from class: com.facetec.sdk.dv.1
                @Override // com.facetec.sdk.eo
                public final /* synthetic */ Number a(fz fzVar) throws IOException {
                    if (fzVar.j() != gb.NULL) {
                        return Double.valueOf(fzVar.l());
                    }
                    fzVar.m();
                    return null;
                }

                @Override // com.facetec.sdk.eo
                public final /* synthetic */ void b(ga gaVar, Number number) throws IOException {
                    Number number2 = number;
                    if (number2 == null) {
                        gaVar.g();
                    } else {
                        dv.d(number2.doubleValue());
                        gaVar.a(number2);
                    }
                }
            };
        }
        arrayList2.add(ft.a(cls, Double.class, eoVar2));
        Class cls2 = Float.TYPE;
        if (z16) {
            eoVar3 = ft.m;
        } else {
            eoVar3 = new eo<Number>() { // from class: com.facetec.sdk.dv.2
                @Override // com.facetec.sdk.eo
                public final /* synthetic */ Number a(fz fzVar) throws IOException {
                    if (fzVar.j() != gb.NULL) {
                        return Float.valueOf((float) fzVar.l());
                    }
                    fzVar.m();
                    return null;
                }

                @Override // com.facetec.sdk.eo
                public final /* synthetic */ void b(ga gaVar, Number number) throws IOException {
                    Number number2 = number;
                    if (number2 == null) {
                        gaVar.g();
                    } else {
                        dv.d(number2.floatValue());
                        gaVar.a(number2);
                    }
                }
            };
        }
        arrayList2.add(ft.a(cls2, Float.class, eoVar3));
        arrayList2.add(ft.f41674o);
        arrayList2.add(ft.f41668h);
        arrayList2.add(ft.f41667g);
        arrayList2.add(ft.a(AtomicLong.class, new eo<AtomicLong>() { // from class: com.facetec.sdk.dv.4
            @Override // com.facetec.sdk.eo
            public final /* synthetic */ AtomicLong a(fz fzVar) throws IOException {
                return new AtomicLong(((Number) eoVar.a(fzVar)).longValue());
            }

            @Override // com.facetec.sdk.eo
            public final /* synthetic */ void b(ga gaVar, AtomicLong atomicLong) throws IOException {
                eoVar.b(gaVar, Long.valueOf(atomicLong.get()));
            }
        }.b()));
        arrayList2.add(ft.a(AtomicLongArray.class, new eo<AtomicLongArray>() { // from class: com.facetec.sdk.dv.5
            @Override // com.facetec.sdk.eo
            public final /* synthetic */ AtomicLongArray a(fz fzVar) throws IOException {
                ArrayList arrayList3 = new ArrayList();
                fzVar.a();
                while (fzVar.c()) {
                    arrayList3.add(Long.valueOf(((Number) eoVar.a(fzVar)).longValue()));
                }
                fzVar.b();
                int size = arrayList3.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i12 = 0; i12 < size; i12++) {
                    atomicLongArray.set(i12, ((Long) arrayList3.get(i12)).longValue());
                }
                return atomicLongArray;
            }

            @Override // com.facetec.sdk.eo
            public final /* synthetic */ void b(ga gaVar, AtomicLongArray atomicLongArray) throws IOException {
                AtomicLongArray atomicLongArray2 = atomicLongArray;
                gaVar.c();
                int length = atomicLongArray2.length();
                for (int i12 = 0; i12 < length; i12++) {
                    eoVar.b(gaVar, Long.valueOf(atomicLongArray2.get(i12)));
                }
                gaVar.d();
            }
        }.b()));
        arrayList2.add(ft.f41666f);
        arrayList2.add(ft.f41671k);
        arrayList2.add(ft.f41677r);
        arrayList2.add(ft.f41676q);
        arrayList2.add(ft.a(BigDecimal.class, ft.f41679t));
        arrayList2.add(ft.a(BigInteger.class, ft.f41675p));
        arrayList2.add(ft.f41681v);
        arrayList2.add(ft.f41682w);
        arrayList2.add(ft.f41684y);
        arrayList2.add(ft.f41680u);
        arrayList2.add(ft.f41685z);
        arrayList2.add(ft.f41683x);
        arrayList2.add(ft.f41665e);
        arrayList2.add(fl.f41612d);
        arrayList2.add(ft.A);
        arrayList2.add(fr.f41655d);
        arrayList2.add(fs.f41657d);
        arrayList2.add(ft.B);
        arrayList2.add(fg.f41591e);
        arrayList2.add(ft.f41662b);
        arrayList2.add(new fe(this.f41374e));
        arrayList2.add(new fm(this.f41374e, z11));
        fn fnVar = new fn(this.f41374e);
        this.f41371b = fnVar;
        arrayList2.add(fnVar);
        arrayList2.add(ft.H);
        arrayList2.add(new fp(this.f41374e, dzVar, exVar, this.f41371b));
        this.f41375f = Collections.unmodifiableList(arrayList2);
    }

    public final ec c(Object obj) {
        if (obj == null) {
            return ef.f41465b;
        }
        return a(obj, obj.getClass());
    }

    public final <T> T e(String str, Class<T> cls) throws en {
        return (T) fc.e(cls).cast(e(str, (Type) cls));
    }

    private String c(Object obj, Type type) {
        StringWriter stringWriter = new StringWriter();
        b(obj, type, stringWriter);
        return stringWriter.toString();
    }

    private <T> T e(String str, Type type) throws en {
        if (str == null) {
            return null;
        }
        return (T) c((Reader) new StringReader(str), type);
    }

    private fz c(Reader reader) {
        fz fzVar = new fz(reader);
        fzVar.c(this.f41383o);
        return fzVar;
    }

    private void c(ec ecVar, ga gaVar) throws ed {
        boolean zH = gaVar.h();
        gaVar.c(true);
        boolean zF = gaVar.f();
        gaVar.e(this.f41382n);
        boolean zJ = gaVar.j();
        gaVar.d(this.f41376g);
        try {
            try {
                fh.e(ecVar, gaVar);
                gaVar.c(zH);
                gaVar.e(zF);
                gaVar.d(zJ);
            } catch (IOException e5) {
                throw new ed(e5);
            } catch (AssertionError e7) {
                StringBuilder sb2 = new StringBuilder("AssertionError (GSON 2.8.6): ");
                sb2.append(e7.getMessage());
                AssertionError assertionError = new AssertionError(sb2.toString());
                assertionError.initCause(e7);
                throw assertionError;
            }
        } catch (Throwable th2) {
            gaVar.c(zH);
            gaVar.e(zF);
            gaVar.d(zJ);
            throw th2;
        }
    }

    private void b(Object obj, Type type, Appendable appendable) throws ed {
        try {
            d(obj, type, d(fh.c(appendable)));
        } catch (IOException e5) {
            throw new ed(e5);
        }
    }

    private ga d(Writer writer) throws IOException {
        if (this.m) {
            writer.write(")]}'\n");
        }
        ga gaVar = new ga(writer);
        if (this.f41380k) {
            gaVar.b("  ");
        }
        gaVar.d(this.f41376g);
        return gaVar;
    }

    private static void d(Object obj, fz fzVar) {
        if (obj != null) {
            try {
                if (fzVar.j() == gb.END_DOCUMENT) {
                } else {
                    throw new ed("JSON document was not fully consumed.");
                }
            } catch (gh e5) {
                throw new en(e5);
            } catch (IOException e7) {
                throw new ed(e7);
            }
        }
    }

    private <T> T c(Reader reader, Type type) throws en, ed {
        fz fzVarC = c(reader);
        T t10 = (T) c(fzVarC, type);
        d(t10, fzVarC);
        return t10;
    }

    private <T> T c(fz fzVar, Type type) throws en, ed {
        boolean zT = fzVar.t();
        boolean z10 = true;
        fzVar.c(true);
        try {
            try {
                try {
                    fzVar.j();
                    z10 = false;
                    T tA = b(fy.e(type)).a(fzVar);
                    fzVar.c(zT);
                    return tA;
                } catch (EOFException e5) {
                    if (z10) {
                        fzVar.c(zT);
                        return null;
                    }
                    throw new en(e5);
                } catch (IllegalStateException e7) {
                    throw new en(e7);
                }
            } catch (IOException e10) {
                throw new en(e10);
            } catch (AssertionError e11) {
                StringBuilder sb2 = new StringBuilder("AssertionError (GSON 2.8.6): ");
                sb2.append(e11.getMessage());
                AssertionError assertionError = new AssertionError(sb2.toString());
                assertionError.initCause(e11);
                throw assertionError;
            }
        } catch (Throwable th2) {
            fzVar.c(zT);
            throw th2;
        }
    }
}
