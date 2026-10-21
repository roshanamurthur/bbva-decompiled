package com.facetec.sdk;

import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes9.dex */
public final class fj extends fz {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Object f41602d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object[] f41603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f41604c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String[] f41605e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int[] f41606f;

    static {
        new Reader() { // from class: com.facetec.sdk.fj.5
            @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
            public final void close() throws IOException {
                throw new AssertionError();
            }

            @Override // java.io.Reader
            public final int read(char[] cArr, int i10, int i11) throws IOException {
                throw new AssertionError();
            }
        };
        f41602d = new Object();
    }

    private Object u() {
        Object[] objArr = this.f41603b;
        int i10 = this.f41604c - 1;
        this.f41604c = i10;
        Object obj = objArr[i10];
        objArr[i10] = null;
        return obj;
    }

    private String v() {
        StringBuilder sb2 = new StringBuilder(" at path ");
        sb2.append(q());
        return sb2.toString();
    }

    @Override // com.facetec.sdk.fz
    public final void a() throws IOException {
        b(gb.BEGIN_ARRAY);
        c(((ee) h()).iterator());
        this.f41606f[this.f41604c - 1] = 0;
    }

    @Override // com.facetec.sdk.fz
    public final void b() throws IOException {
        b(gb.END_ARRAY);
        u();
        u();
        int i10 = this.f41604c;
        if (i10 > 0) {
            int[] iArr = this.f41606f;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    @Override // com.facetec.sdk.fz
    public final boolean c() throws IOException {
        gb gbVarJ = j();
        return (gbVarJ == gb.END_OBJECT || gbVarJ == gb.END_ARRAY) ? false : true;
    }

    @Override // com.facetec.sdk.fz, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f41603b = new Object[]{f41602d};
        this.f41604c = 1;
    }

    @Override // com.facetec.sdk.fz
    public final void d() throws IOException {
        b(gb.BEGIN_OBJECT);
        c(((eh) h()).o().iterator());
    }

    @Override // com.facetec.sdk.fz
    public final void e() throws IOException {
        b(gb.END_OBJECT);
        u();
        u();
        int i10 = this.f41604c;
        if (i10 > 0) {
            int[] iArr = this.f41606f;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    @Override // com.facetec.sdk.fz
    public final String f() throws IOException {
        gb gbVarJ = j();
        gb gbVar = gb.STRING;
        if (gbVarJ != gbVar && gbVarJ != gb.NUMBER) {
            StringBuilder sb2 = new StringBuilder("Expected ");
            sb2.append(gbVar);
            sb2.append(" but was ");
            sb2.append(gbVarJ);
            sb2.append(v());
            throw new IllegalStateException(sb2.toString());
        }
        String strD = ((ei) u()).d();
        int i10 = this.f41604c;
        if (i10 > 0) {
            int[] iArr = this.f41606f;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return strD;
    }

    @Override // com.facetec.sdk.fz
    public final boolean g() throws IOException {
        b(gb.BOOLEAN);
        boolean zF = ((ei) u()).f();
        int i10 = this.f41604c;
        if (i10 > 0) {
            int[] iArr = this.f41606f;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return zF;
    }

    public final Object h() {
        return this.f41603b[this.f41604c - 1];
    }

    @Override // com.facetec.sdk.fz
    public final String i() throws IOException {
        b(gb.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) h()).next();
        String str = (String) entry.getKey();
        this.f41605e[this.f41604c - 1] = str;
        c(entry.getValue());
        return str;
    }

    @Override // com.facetec.sdk.fz
    public final gb j() throws IOException {
        while (this.f41604c != 0) {
            Object objH = h();
            if (!(objH instanceof Iterator)) {
                if (objH instanceof eh) {
                    return gb.BEGIN_OBJECT;
                }
                if (objH instanceof ee) {
                    return gb.BEGIN_ARRAY;
                }
                if (!(objH instanceof ei)) {
                    if (objH instanceof ef) {
                        return gb.NULL;
                    }
                    if (objH == f41602d) {
                        throw new IllegalStateException("JsonReader is closed");
                    }
                    throw new AssertionError();
                }
                ei eiVar = (ei) objH;
                if (eiVar.l()) {
                    return gb.STRING;
                }
                if (eiVar.k()) {
                    return gb.BOOLEAN;
                }
                if (eiVar.m()) {
                    return gb.NUMBER;
                }
                throw new AssertionError();
            }
            boolean z10 = this.f41603b[this.f41604c - 2] instanceof eh;
            Iterator it = (Iterator) objH;
            if (!it.hasNext()) {
                return z10 ? gb.END_OBJECT : gb.END_ARRAY;
            }
            if (z10) {
                return gb.NAME;
            }
            c(it.next());
        }
        return gb.END_DOCUMENT;
    }

    @Override // com.facetec.sdk.fz
    public final long k() throws IOException {
        gb gbVarJ = j();
        gb gbVar = gb.NUMBER;
        if (gbVarJ != gbVar && gbVarJ != gb.STRING) {
            StringBuilder sb2 = new StringBuilder("Expected ");
            sb2.append(gbVar);
            sb2.append(" but was ");
            sb2.append(gbVarJ);
            sb2.append(v());
            throw new IllegalStateException(sb2.toString());
        }
        long jC = ((ei) h()).c();
        u();
        int i10 = this.f41604c;
        if (i10 > 0) {
            int[] iArr = this.f41606f;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return jC;
    }

    @Override // com.facetec.sdk.fz
    public final double l() throws IOException {
        gb gbVarJ = j();
        gb gbVar = gb.NUMBER;
        if (gbVarJ != gbVar && gbVarJ != gb.STRING) {
            StringBuilder sb2 = new StringBuilder("Expected ");
            sb2.append(gbVar);
            sb2.append(" but was ");
            sb2.append(gbVarJ);
            sb2.append(v());
            throw new IllegalStateException(sb2.toString());
        }
        double dA = ((ei) h()).a();
        if (!t() && (Double.isNaN(dA) || Double.isInfinite(dA))) {
            throw new NumberFormatException("JSON forbids NaN and infinities: ".concat(String.valueOf(dA)));
        }
        u();
        int i10 = this.f41604c;
        if (i10 > 0) {
            int[] iArr = this.f41606f;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return dA;
    }

    @Override // com.facetec.sdk.fz
    public final void m() throws IOException {
        b(gb.NULL);
        u();
        int i10 = this.f41604c;
        if (i10 > 0) {
            int[] iArr = this.f41606f;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    @Override // com.facetec.sdk.fz
    public final int n() throws IOException {
        gb gbVarJ = j();
        gb gbVar = gb.NUMBER;
        if (gbVarJ != gbVar && gbVarJ != gb.STRING) {
            StringBuilder sb2 = new StringBuilder("Expected ");
            sb2.append(gbVar);
            sb2.append(" but was ");
            sb2.append(gbVarJ);
            sb2.append(v());
            throw new IllegalStateException(sb2.toString());
        }
        int iE = ((ei) h()).e();
        u();
        int i10 = this.f41604c;
        if (i10 > 0) {
            int[] iArr = this.f41606f;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return iE;
    }

    @Override // com.facetec.sdk.fz
    public final void o() throws IOException {
        if (j() == gb.NAME) {
            i();
            this.f41605e[this.f41604c - 2] = AbstractJsonLexerKt.NULL;
        } else {
            u();
            int i10 = this.f41604c;
            if (i10 > 0) {
                this.f41605e[i10 - 1] = AbstractJsonLexerKt.NULL;
            }
        }
        int i11 = this.f41604c;
        if (i11 > 0) {
            int[] iArr = this.f41606f;
            int i12 = i11 - 1;
            iArr[i12] = iArr[i12] + 1;
        }
    }

    @Override // com.facetec.sdk.fz
    public final String q() {
        StringBuilder sb2 = new StringBuilder(Constant.MXN_SYMBOL);
        int i10 = 0;
        while (i10 < this.f41604c) {
            Object[] objArr = this.f41603b;
            Object obj = objArr[i10];
            if (obj instanceof ee) {
                i10++;
                if (objArr[i10] instanceof Iterator) {
                    sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
                    sb2.append(this.f41606f[i10]);
                    sb2.append(AbstractJsonLexerKt.END_LIST);
                }
            } else if (obj instanceof eh) {
                i10++;
                if (objArr[i10] instanceof Iterator) {
                    sb2.append('.');
                    String str = this.f41605e[i10];
                    if (str != null) {
                        sb2.append(str);
                    }
                }
            }
            i10++;
        }
        return sb2.toString();
    }

    @Override // com.facetec.sdk.fz
    public final String toString() {
        return "fj";
    }

    public final void c(Object obj) {
        int i10 = this.f41604c;
        Object[] objArr = this.f41603b;
        if (i10 == objArr.length) {
            int i11 = i10 << 1;
            this.f41603b = Arrays.copyOf(objArr, i11);
            this.f41606f = Arrays.copyOf(this.f41606f, i11);
            this.f41605e = (String[]) Arrays.copyOf(this.f41605e, i11);
        }
        Object[] objArr2 = this.f41603b;
        int i12 = this.f41604c;
        this.f41604c = i12 + 1;
        objArr2[i12] = obj;
    }

    public final void b(gb gbVar) throws IOException {
        if (j() == gbVar) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("Expected ");
        sb2.append(gbVar);
        sb2.append(" but was ");
        sb2.append(j());
        sb2.append(v());
        throw new IllegalStateException(sb2.toString());
    }
}
