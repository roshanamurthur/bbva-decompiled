package com.facetec.sdk;

import com.bbva.notifications.constants.PushConstants;
import com.noknok.android.client.utils.UIConfigTags;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes9.dex */
public final class ft {
    public static final el A;
    public static final el B;
    public static final el C;
    public static final eo<ec> D;
    private static eo<Class> E;
    private static eo<BitSet> F;
    private static eo<Number> G;
    public static final el H;
    private static eo<Boolean> I;
    private static eo<Number> J;
    private static eo<Number> K;
    private static eo<AtomicIntegerArray> L;
    private static eo<AtomicBoolean> M;
    private static eo<AtomicInteger> N;
    private static eo<Number> O;
    private static eo<Character> P;
    private static eo<StringBuilder> Q;
    private static eo<StringBuffer> R;
    private static eo<String> S;
    private static eo<URL> T;
    private static eo<InetAddress> U;
    private static eo<Currency> V;
    private static eo<UUID> W;
    private static eo<URI> X;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final el f41659a;

    /* JADX INFO: renamed from: aa, reason: collision with root package name */
    private static eo<Calendar> f41660aa;

    /* JADX INFO: renamed from: ac, reason: collision with root package name */
    private static eo<Locale> f41661ac;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final el f41662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final el f41663c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final eo<Boolean> f41664d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final el f41665e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final el f41666f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final el f41667g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final el f41668h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final el f41669i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final el f41670j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final el f41671k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final eo<Number> f41672l;
    public static final eo<Number> m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final eo<Number> f41673n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final el f41674o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final eo<BigInteger> f41675p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final el f41676q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final el f41677r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final el f41678s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final eo<BigDecimal> f41679t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final el f41680u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final el f41681v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final el f41682w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final el f41683x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final el f41684y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final el f41685z;

    /* JADX INFO: renamed from: com.facetec.sdk.ft$30, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass30 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f41700c;

        static {
            int[] iArr = new int[gb.values().length];
            f41700c = iArr;
            try {
                iArr[gb.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f41700c[gb.BOOLEAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f41700c[gb.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f41700c[gb.NULL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f41700c[gb.BEGIN_ARRAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f41700c[gb.BEGIN_OBJECT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f41700c[gb.END_DOCUMENT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f41700c[gb.NAME.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f41700c[gb.END_OBJECT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f41700c[gb.END_ARRAY.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public static final class a<T extends Enum<T>> extends eo<T> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Map<String, T> f41702e = new HashMap();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Map<T, String> f41701c = new HashMap();

        public a(Class<T> cls) {
            try {
                for (T t10 : cls.getEnumConstants()) {
                    String strName = t10.name();
                    ep epVar = (ep) cls.getField(strName).getAnnotation(ep.class);
                    if (epVar != null) {
                        strName = epVar.c();
                        for (String str : epVar.b()) {
                            this.f41702e.put(str, t10);
                        }
                    }
                    this.f41702e.put(strName, t10);
                    this.f41701c.put(t10, strName);
                }
            } catch (NoSuchFieldException e5) {
                throw new AssertionError(e5);
            }
        }

        @Override // com.facetec.sdk.eo
        public final /* synthetic */ Object a(fz fzVar) throws IOException {
            if (fzVar.j() != gb.NULL) {
                return this.f41702e.get(fzVar.f());
            }
            fzVar.m();
            return null;
        }

        @Override // com.facetec.sdk.eo
        public final /* synthetic */ void b(ga gaVar, Object obj) throws IOException {
            Enum r3 = (Enum) obj;
            gaVar.e(r3 == null ? null : this.f41701c.get(r3));
        }
    }

    static {
        eo<Class> eoVarB = new eo<Class>() { // from class: com.facetec.sdk.ft.1
            @Override // com.facetec.sdk.eo
            public final /* synthetic */ Class a(fz fzVar) throws IOException {
                throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
            }

            @Override // com.facetec.sdk.eo
            public final /* synthetic */ void b(ga gaVar, Class cls) throws IOException {
                StringBuilder sb2 = new StringBuilder("Attempted to serialize java.lang.Class: ");
                sb2.append(cls.getName());
                sb2.append(". Forgot to register a type adapter?");
                throw new UnsupportedOperationException(sb2.toString());
            }
        }.b();
        E = eoVarB;
        f41662b = a(Class.class, eoVarB);
        eo<BitSet> eoVarB2 = new eo<BitSet>() { // from class: com.facetec.sdk.ft.12
            /* JADX WARN: Code duplicated, block: B:24:0x005a  */
            private static BitSet c(fz fzVar) throws Throwable {
                BitSet bitSet = new BitSet();
                fzVar.a();
                gb gbVarJ = fzVar.j();
                int i10 = 0;
                while (gbVarJ != gb.END_ARRAY) {
                    int i11 = AnonymousClass30.f41700c[gbVarJ.ordinal()];
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                throw new en("Invalid bitset value type: ".concat(String.valueOf(gbVarJ)));
                            }
                            String strF = fzVar.f();
                            try {
                                if (Integer.parseInt(strF) != 0) {
                                    bitSet.set(i10);
                                }
                            } catch (NumberFormatException unused) {
                                throw new en("Error: Expecting: bitset number value (1, 0), Found: ".concat(String.valueOf(strF)));
                            }
                        } else if (fzVar.g()) {
                            bitSet.set(i10);
                        }
                    } else if (fzVar.n() != 0) {
                        bitSet.set(i10);
                    }
                    i10++;
                    gbVarJ = fzVar.j();
                }
                fzVar.b();
                return bitSet;
            }

            @Override // com.facetec.sdk.eo
            public final /* synthetic */ BitSet a(fz fzVar) throws IOException {
                return c(fzVar);
            }

            @Override // com.facetec.sdk.eo
            public final /* synthetic */ void b(ga gaVar, BitSet bitSet) throws IOException {
                BitSet bitSet2 = bitSet;
                gaVar.c();
                int length = bitSet2.length();
                for (int i10 = 0; i10 < length; i10++) {
                    gaVar.b(bitSet2.get(i10) ? 1L : 0L);
                }
                gaVar.d();
            }
        }.b();
        F = eoVarB2;
        f41665e = a(BitSet.class, eoVarB2);
        I = new eo<Boolean>() { // from class: com.facetec.sdk.ft.24
            @Override // com.facetec.sdk.eo
            public final /* synthetic */ Boolean a(fz fzVar) throws IOException {
                gb gbVarJ = fzVar.j();
                if (gbVarJ != gb.NULL) {
                    return gbVarJ == gb.STRING ? Boolean.valueOf(Boolean.parseBoolean(fzVar.f())) : Boolean.valueOf(fzVar.g());
                }
                fzVar.m();
                return null;
            }

            @Override // com.facetec.sdk.eo
            public final /* bridge */ /* synthetic */ void b(ga gaVar, Boolean bool) throws IOException {
                gaVar.b(bool);
            }
        };
        f41664d = new eo<Boolean>() { // from class: com.facetec.sdk.ft.26
            @Override // com.facetec.sdk.eo
            public final /* synthetic */ Boolean a(fz fzVar) throws IOException {
                if (fzVar.j() != gb.NULL) {
                    return Boolean.valueOf(fzVar.f());
                }
                fzVar.m();
                return null;
            }

            @Override // com.facetec.sdk.eo
            public final /* synthetic */ void b(ga gaVar, Boolean bool) throws IOException {
                Boolean bool2 = bool;
                gaVar.e(bool2 == null ? AbstractJsonLexerKt.NULL : bool2.toString());
            }
        };
        f41663c = a(Boolean.TYPE, Boolean.class, I);
        eo<Number> eoVar = new eo<Number>() { // from class: com.facetec.sdk.ft.32
            private static Number e(fz fzVar) throws IOException {
                if (fzVar.j() == gb.NULL) {
                    fzVar.m();
                    return null;
                }
                try {
                    return Byte.valueOf((byte) fzVar.n());
                } catch (NumberFormatException e5) {
                    throw new en(e5);
                }
            }

            @Override // com.facetec.sdk.eo
            public final /* synthetic */ Number a(fz fzVar) throws IOException {
                return e(fzVar);
            }

            @Override // com.facetec.sdk.eo
            public final /* synthetic */ void b(ga gaVar, Number number) throws IOException {
                gaVar.a(number);
            }
        };
        G = eoVar;
        f41659a = a(Byte.TYPE, Byte.class, eoVar);
        eo<Number> eoVar2 = new eo<Number>() { // from class: com.facetec.sdk.ft.33
            @Override // com.facetec.sdk.eo
            public final /* synthetic */ Number a(fz fzVar) throws IOException {
                return b(fzVar);
            }

            @Override // com.facetec.sdk.eo
            public final /* synthetic */ void b(ga gaVar, Number number) throws IOException {
                gaVar.a(number);
            }

            private static Number b(fz fzVar) throws IOException {
                if (fzVar.j() == gb.NULL) {
                    fzVar.m();
                    return null;
                }
                try {
                    return Short.valueOf((short) fzVar.n());
                } catch (NumberFormatException e5) {
                    throw new en(e5);
                }
            }
        };
        J = eoVar2;
        f41670j = a(Short.TYPE, Short.class, eoVar2);
        eo<Number> eoVar3 = new eo<Number>() { // from class: com.facetec.sdk.ft.35
            private static Number e(fz fzVar) throws IOException {
                if (fzVar.j() == gb.NULL) {
                    fzVar.m();
                    return null;
                }
                try {
                    return Integer.valueOf(fzVar.n());
                } catch (NumberFormatException e5) {
                    throw new en(e5);
                }
            }

            @Override // com.facetec.sdk.eo
            public final /* synthetic */ Number a(fz fzVar) throws IOException {
                return e(fzVar);
            }

            @Override // com.facetec.sdk.eo
            public final /* synthetic */ void b(ga gaVar, Number number) throws IOException {
                gaVar.a(number);
            }
        };
        K = eoVar3;
        f41669i = a(Integer.TYPE, Integer.class, eoVar3);
        eo<AtomicInteger> eoVarB3 = new eo<AtomicInteger>() { // from class: com.facetec.sdk.ft.34
            @Override // com.facetec.sdk.eo
            public final /* synthetic */ AtomicInteger a(fz fzVar) throws IOException {
                return b(fzVar);
            }

            @Override // com.facetec.sdk.eo
            public final /* synthetic */ void b(ga gaVar, AtomicInteger atomicInteger) throws IOException {
                gaVar.b(atomicInteger.get());
            }

            private static AtomicInteger b(fz fzVar) throws IOException {
                try {
                    return new AtomicInteger(fzVar.n());
                } catch (NumberFormatException e5) {
                    throw new en(e5);
                }
            }
        }.b();
        N = eoVarB3;
        f41668h = a(AtomicInteger.class, eoVarB3);
        eo<AtomicBoolean> eoVarB4 = new eo<AtomicBoolean>() { // from class: com.facetec.sdk.ft.31
            @Override // com.facetec.sdk.eo
            public final /* synthetic */ AtomicBoolean a(fz fzVar) throws IOException {
                return new AtomicBoolean(fzVar.g());
            }

            @Override // com.facetec.sdk.eo
            public final /* synthetic */ void b(ga gaVar, AtomicBoolean atomicBoolean) throws IOException {
                gaVar.a(atomicBoolean.get());
            }
        }.b();
        M = eoVarB4;
        f41667g = a(AtomicBoolean.class, eoVarB4);
        eo<AtomicIntegerArray> eoVarB5 = new eo<AtomicIntegerArray>() { // from class: com.facetec.sdk.ft.5
            private static AtomicIntegerArray c(fz fzVar) throws IOException {
                ArrayList arrayList = new ArrayList();
                fzVar.a();
                while (fzVar.c()) {
                    try {
                        arrayList.add(Integer.valueOf(fzVar.n()));
                    } catch (NumberFormatException e5) {
                        throw new en(e5);
                    }
                }
                fzVar.b();
                int size = arrayList.size();
                AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
                for (int i10 = 0; i10 < size; i10++) {
                    atomicIntegerArray.set(i10, ((Integer) arrayList.get(i10)).intValue());
                }
                return atomicIntegerArray;
            }

            @Override // com.facetec.sdk.eo
            public final /* synthetic */ AtomicIntegerArray a(fz fzVar) throws IOException {
                return c(fzVar);
            }

            @Override // com.facetec.sdk.eo
            public final /* synthetic */ void b(ga gaVar, AtomicIntegerArray atomicIntegerArray) throws IOException {
                AtomicIntegerArray atomicIntegerArray2 = atomicIntegerArray;
                gaVar.c();
                int length = atomicIntegerArray2.length();
                for (int i10 = 0; i10 < length; i10++) {
                    gaVar.b(atomicIntegerArray2.get(i10));
                }
                gaVar.d();
            }
        }.b();
        L = eoVarB5;
        f41666f = a(AtomicIntegerArray.class, eoVarB5);
        f41673n = new eo<Number>() { // from class: com.facetec.sdk.ft.4
            @Override // com.facetec.sdk.eo
            public final /* synthetic */ Number a(fz fzVar) throws IOException {
                return b(fzVar);
            }

            @Override // com.facetec.sdk.eo
            public final /* synthetic */ void b(ga gaVar, Number number) throws IOException {
                gaVar.a(number);
            }

            private static Number b(fz fzVar) throws IOException {
                if (fzVar.j() == gb.NULL) {
                    fzVar.m();
                    return null;
                }
                try {
                    return Long.valueOf(fzVar.k());
                } catch (NumberFormatException e5) {
                    throw new en(e5);
                }
            }
        };
        m = new eo<Number>() { // from class: com.facetec.sdk.ft.2
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
                gaVar.a(number);
            }
        };
        f41672l = new eo<Number>() { // from class: com.facetec.sdk.ft.3
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
                gaVar.a(number);
            }
        };
        eo<Number> eoVar4 = new eo<Number>() { // from class: com.facetec.sdk.ft.10
            @Override // com.facetec.sdk.eo
            public final /* synthetic */ Number a(fz fzVar) throws IOException {
                gb gbVarJ = fzVar.j();
                int i10 = AnonymousClass30.f41700c[gbVarJ.ordinal()];
                if (i10 == 1 || i10 == 3) {
                    return new fb(fzVar.f());
                }
                if (i10 != 4) {
                    throw new en("Expecting number, got: ".concat(String.valueOf(gbVarJ)));
                }
                fzVar.m();
                return null;
            }

            @Override // com.facetec.sdk.eo
            public final /* synthetic */ void b(ga gaVar, Number number) throws IOException {
                gaVar.a(number);
            }
        };
        O = eoVar4;
        f41674o = a(Number.class, eoVar4);
        eo<Character> eoVar5 = new eo<Character>() { // from class: com.facetec.sdk.ft.8
            @Override // com.facetec.sdk.eo
            public final /* synthetic */ Character a(fz fzVar) throws Throwable {
                if (fzVar.j() == gb.NULL) {
                    fzVar.m();
                    return null;
                }
                String strF = fzVar.f();
                if (strF.length() == 1) {
                    return Character.valueOf(strF.charAt(0));
                }
                throw new en("Expecting character, got: ".concat(strF));
            }

            @Override // com.facetec.sdk.eo
            public final /* synthetic */ void b(ga gaVar, Character ch2) throws IOException {
                Character ch3 = ch2;
                gaVar.e(ch3 == null ? null : String.valueOf(ch3));
            }
        };
        P = eoVar5;
        f41671k = a(Character.TYPE, Character.class, eoVar5);
        S = new eo<String>() { // from class: com.facetec.sdk.ft.7
            @Override // com.facetec.sdk.eo
            public final /* synthetic */ String a(fz fzVar) throws IOException {
                gb gbVarJ = fzVar.j();
                if (gbVarJ != gb.NULL) {
                    return gbVarJ == gb.BOOLEAN ? Boolean.toString(fzVar.g()) : fzVar.f();
                }
                fzVar.m();
                return null;
            }

            @Override // com.facetec.sdk.eo
            public final /* synthetic */ void b(ga gaVar, String str) throws IOException {
                gaVar.e(str);
            }
        };
        f41679t = new eo<BigDecimal>() { // from class: com.facetec.sdk.ft.6
            private static BigDecimal e(fz fzVar) throws IOException {
                if (fzVar.j() == gb.NULL) {
                    fzVar.m();
                    return null;
                }
                try {
                    return new BigDecimal(fzVar.f());
                } catch (NumberFormatException e5) {
                    throw new en(e5);
                }
            }

            @Override // com.facetec.sdk.eo
            public final /* synthetic */ BigDecimal a(fz fzVar) throws IOException {
                return e(fzVar);
            }

            @Override // com.facetec.sdk.eo
            public final /* synthetic */ void b(ga gaVar, BigDecimal bigDecimal) throws IOException {
                gaVar.a(bigDecimal);
            }
        };
        f41675p = new eo<BigInteger>() { // from class: com.facetec.sdk.ft.9
            @Override // com.facetec.sdk.eo
            public final /* synthetic */ BigInteger a(fz fzVar) throws IOException {
                return b(fzVar);
            }

            @Override // com.facetec.sdk.eo
            public final /* synthetic */ void b(ga gaVar, BigInteger bigInteger) throws IOException {
                gaVar.a(bigInteger);
            }

            private static BigInteger b(fz fzVar) throws IOException {
                if (fzVar.j() == gb.NULL) {
                    fzVar.m();
                    return null;
                }
                try {
                    return new BigInteger(fzVar.f());
                } catch (NumberFormatException e5) {
                    throw new en(e5);
                }
            }
        };
        f41678s = a(String.class, S);
        eo<StringBuilder> eoVar6 = new eo<StringBuilder>() { // from class: com.facetec.sdk.ft.15
            @Override // com.facetec.sdk.eo
            public final /* synthetic */ StringBuilder a(fz fzVar) throws IOException {
                if (fzVar.j() != gb.NULL) {
                    return new StringBuilder(fzVar.f());
                }
                fzVar.m();
                return null;
            }

            @Override // com.facetec.sdk.eo
            public final /* synthetic */ void b(ga gaVar, StringBuilder sb2) throws IOException {
                StringBuilder sb3 = sb2;
                gaVar.e(sb3 == null ? null : sb3.toString());
            }
        };
        Q = eoVar6;
        f41677r = a(StringBuilder.class, eoVar6);
        eo<StringBuffer> eoVar7 = new eo<StringBuffer>() { // from class: com.facetec.sdk.ft.11
            @Override // com.facetec.sdk.eo
            public final /* synthetic */ StringBuffer a(fz fzVar) throws IOException {
                if (fzVar.j() != gb.NULL) {
                    return new StringBuffer(fzVar.f());
                }
                fzVar.m();
                return null;
            }

            @Override // com.facetec.sdk.eo
            public final /* synthetic */ void b(ga gaVar, StringBuffer stringBuffer) throws IOException {
                StringBuffer stringBuffer2 = stringBuffer;
                gaVar.e(stringBuffer2 == null ? null : stringBuffer2.toString());
            }
        };
        R = eoVar7;
        f41676q = a(StringBuffer.class, eoVar7);
        eo<URL> eoVar8 = new eo<URL>() { // from class: com.facetec.sdk.ft.14
            @Override // com.facetec.sdk.eo
            public final /* synthetic */ URL a(fz fzVar) throws Throwable {
                if (fzVar.j() == gb.NULL) {
                    fzVar.m();
                    return null;
                }
                String strF = fzVar.f();
                if (AbstractJsonLexerKt.NULL.equals(strF)) {
                    return null;
                }
                return new URL(strF);
            }

            @Override // com.facetec.sdk.eo
            public final /* synthetic */ void b(ga gaVar, URL url) throws IOException {
                URL url2 = url;
                gaVar.e(url2 == null ? null : url2.toExternalForm());
            }
        };
        T = eoVar8;
        f41681v = a(URL.class, eoVar8);
        eo<URI> eoVar9 = new eo<URI>() { // from class: com.facetec.sdk.ft.13
            private static URI d(fz fzVar) throws Throwable {
                if (fzVar.j() == gb.NULL) {
                    fzVar.m();
                    return null;
                }
                try {
                    String strF = fzVar.f();
                    if (AbstractJsonLexerKt.NULL.equals(strF)) {
                        return null;
                    }
                    return new URI(strF);
                } catch (URISyntaxException e5) {
                    throw new ed(e5);
                }
            }

            @Override // com.facetec.sdk.eo
            public final /* synthetic */ URI a(fz fzVar) throws IOException {
                return d(fzVar);
            }

            @Override // com.facetec.sdk.eo
            public final /* synthetic */ void b(ga gaVar, URI uri) throws IOException {
                URI uri2 = uri;
                gaVar.e(uri2 == null ? null : uri2.toASCIIString());
            }
        };
        X = eoVar9;
        f41682w = a(URI.class, eoVar9);
        eo<InetAddress> eoVar10 = new eo<InetAddress>() { // from class: com.facetec.sdk.ft.16
            @Override // com.facetec.sdk.eo
            public final /* synthetic */ InetAddress a(fz fzVar) throws IOException {
                if (fzVar.j() != gb.NULL) {
                    return InetAddress.getByName(fzVar.f());
                }
                fzVar.m();
                return null;
            }

            @Override // com.facetec.sdk.eo
            public final /* synthetic */ void b(ga gaVar, InetAddress inetAddress) throws IOException {
                InetAddress inetAddress2 = inetAddress;
                gaVar.e(inetAddress2 == null ? null : inetAddress2.getHostAddress());
            }
        };
        U = eoVar10;
        f41683x = c(InetAddress.class, eoVar10);
        eo<UUID> eoVar11 = new eo<UUID>() { // from class: com.facetec.sdk.ft.20
            @Override // com.facetec.sdk.eo
            public final /* synthetic */ UUID a(fz fzVar) throws IOException {
                if (fzVar.j() != gb.NULL) {
                    return UUID.fromString(fzVar.f());
                }
                fzVar.m();
                return null;
            }

            @Override // com.facetec.sdk.eo
            public final /* synthetic */ void b(ga gaVar, UUID uuid) throws IOException {
                UUID uuid2 = uuid;
                gaVar.e(uuid2 == null ? null : uuid2.toString());
            }
        };
        W = eoVar11;
        f41684y = a(UUID.class, eoVar11);
        eo<Currency> eoVarB6 = new eo<Currency>() { // from class: com.facetec.sdk.ft.18
            @Override // com.facetec.sdk.eo
            public final /* synthetic */ Currency a(fz fzVar) throws IOException {
                return Currency.getInstance(fzVar.f());
            }

            @Override // com.facetec.sdk.eo
            public final /* synthetic */ void b(ga gaVar, Currency currency) throws IOException {
                gaVar.e(currency.getCurrencyCode());
            }
        }.b();
        V = eoVarB6;
        f41680u = a(Currency.class, eoVarB6);
        B = new el() { // from class: com.facetec.sdk.ft.19
            @Override // com.facetec.sdk.el
            public final <T> eo<T> c(dv dvVar, fy<T> fyVar) {
                if (fyVar.d() != Timestamp.class) {
                    return null;
                }
                final eo<T> eoVarE = dvVar.e((Class) Date.class);
                return (eo<T>) new eo<Timestamp>() { // from class: com.facetec.sdk.ft.19.2
                    @Override // com.facetec.sdk.eo
                    public final /* synthetic */ Timestamp a(fz fzVar) throws IOException {
                        Date date = (Date) eoVarE.a(fzVar);
                        if (date != null) {
                            return new Timestamp(date.getTime());
                        }
                        return null;
                    }

                    @Override // com.facetec.sdk.eo
                    public final /* bridge */ /* synthetic */ void b(ga gaVar, Timestamp timestamp) throws IOException {
                        eoVarE.b(gaVar, timestamp);
                    }
                };
            }
        };
        final eo<Calendar> eoVar12 = new eo<Calendar>() { // from class: com.facetec.sdk.ft.17
            @Override // com.facetec.sdk.eo
            public final /* synthetic */ Calendar a(fz fzVar) throws Throwable {
                if (fzVar.j() == gb.NULL) {
                    fzVar.m();
                    return null;
                }
                fzVar.d();
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                while (fzVar.j() != gb.END_OBJECT) {
                    String strI = fzVar.i();
                    int iN = fzVar.n();
                    if (UIConfigTags.TAG_YEAR.equals(strI)) {
                        i10 = iN;
                    } else if (UIConfigTags.TAG_MONTH.equals(strI)) {
                        i11 = iN;
                    } else if ("dayOfMonth".equals(strI)) {
                        i12 = iN;
                    } else if ("hourOfDay".equals(strI)) {
                        i13 = iN;
                    } else if (UIConfigTags.TAG_MINUTE.equals(strI)) {
                        i14 = iN;
                    } else if (UIConfigTags.TAG_SECOND.equals(strI)) {
                        i15 = iN;
                    }
                }
                fzVar.e();
                return new GregorianCalendar(i10, i11, i12, i13, i14, i15);
            }

            @Override // com.facetec.sdk.eo
            public final /* synthetic */ void b(ga gaVar, Calendar calendar) throws IOException {
                Calendar calendar2 = calendar;
                if (calendar2 == null) {
                    gaVar.g();
                    return;
                }
                gaVar.a();
                gaVar.c(UIConfigTags.TAG_YEAR);
                gaVar.b(calendar2.get(1));
                gaVar.c(UIConfigTags.TAG_MONTH);
                gaVar.b(calendar2.get(2));
                gaVar.c("dayOfMonth");
                gaVar.b(calendar2.get(5));
                gaVar.c("hourOfDay");
                gaVar.b(calendar2.get(11));
                gaVar.c(UIConfigTags.TAG_MINUTE);
                gaVar.b(calendar2.get(12));
                gaVar.c(UIConfigTags.TAG_SECOND);
                gaVar.b(calendar2.get(13));
                gaVar.b();
            }
        };
        f41660aa = eoVar12;
        final Class<Calendar> cls = Calendar.class;
        final Class<GregorianCalendar> cls2 = GregorianCalendar.class;
        A = new el() { // from class: com.facetec.sdk.ft.28
            @Override // com.facetec.sdk.el
            public final <T> eo<T> c(dv dvVar, fy<T> fyVar) {
                Class<? super T> clsD = fyVar.d();
                if (clsD == cls || clsD == cls2) {
                    return eoVar12;
                }
                return null;
            }

            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Factory[type=");
                androidx.core.graphics.b.f(cls, sb2, "+");
                androidx.core.graphics.b.f(cls2, sb2, ",adapter=");
                sb2.append(eoVar12);
                sb2.append(Constant.BRACKET_CLOSE);
                return sb2.toString();
            }
        };
        eo<Locale> eoVar13 = new eo<Locale>() { // from class: com.facetec.sdk.ft.21
            @Override // com.facetec.sdk.eo
            public final /* synthetic */ Locale a(fz fzVar) throws IOException {
                if (fzVar.j() == gb.NULL) {
                    fzVar.m();
                    return null;
                }
                StringTokenizer stringTokenizer = new StringTokenizer(fzVar.f(), PushConstants.GE_PARAMS_SEPARATOR);
                String strNextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String strNextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String strNextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                if (strNextToken2 == null && strNextToken3 == null) {
                    return new Locale(strNextToken);
                }
                return strNextToken3 == null ? new Locale(strNextToken, strNextToken2) : new Locale(strNextToken, strNextToken2, strNextToken3);
            }

            @Override // com.facetec.sdk.eo
            public final /* synthetic */ void b(ga gaVar, Locale locale) throws IOException {
                Locale locale2 = locale;
                gaVar.e(locale2 == null ? null : locale2.toString());
            }
        };
        f41661ac = eoVar13;
        f41685z = a(Locale.class, eoVar13);
        eo<ec> eoVar14 = new eo<ec>() { // from class: com.facetec.sdk.ft.22
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facetec.sdk.eo
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public ec a(fz fzVar) throws Throwable {
                switch (AnonymousClass30.f41700c[fzVar.j().ordinal()]) {
                    case 1:
                        return new ei(new fb(fzVar.f()));
                    case 2:
                        return new ei(Boolean.valueOf(fzVar.g()));
                    case 3:
                        return new ei(fzVar.f());
                    case 4:
                        fzVar.m();
                        return ef.f41465b;
                    case 5:
                        ee eeVar = new ee();
                        fzVar.a();
                        while (fzVar.c()) {
                            eeVar.a(a(fzVar));
                        }
                        fzVar.b();
                        return eeVar;
                    case 6:
                        eh ehVar = new eh();
                        fzVar.d();
                        while (fzVar.c()) {
                            ehVar.b(fzVar.i(), a(fzVar));
                        }
                        fzVar.e();
                        return ehVar;
                    default:
                        throw new IllegalArgumentException();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facetec.sdk.eo
            public void b(ga gaVar, ec ecVar) throws IOException {
                if (ecVar == null || ecVar.g()) {
                    gaVar.g();
                    return;
                }
                if (ecVar.i()) {
                    ei eiVarN = ecVar.n();
                    if (eiVarN.m()) {
                        gaVar.a(eiVarN.b());
                        return;
                    } else if (eiVarN.k()) {
                        gaVar.a(eiVarN.f());
                        return;
                    } else {
                        gaVar.e(eiVarN.d());
                        return;
                    }
                }
                if (ecVar.h()) {
                    gaVar.c();
                    if (!ecVar.h()) {
                        throw new IllegalStateException("Not a JSON Array: ".concat(String.valueOf(ecVar)));
                    }
                    Iterator<ec> it = ((ee) ecVar).iterator();
                    while (it.hasNext()) {
                        b(gaVar, it.next());
                    }
                    gaVar.d();
                    return;
                }
                if (!ecVar.j()) {
                    StringBuilder sb2 = new StringBuilder("Couldn't write ");
                    sb2.append(ecVar.getClass());
                    throw new IllegalArgumentException(sb2.toString());
                }
                gaVar.a();
                if (!ecVar.j()) {
                    throw new IllegalStateException("Not a JSON Object: ".concat(String.valueOf(ecVar)));
                }
                for (Map.Entry<String, ec> entry : ((eh) ecVar).o()) {
                    gaVar.c(entry.getKey());
                    b(gaVar, entry.getValue());
                }
                gaVar.b();
            }
        };
        D = eoVar14;
        C = c(ec.class, eoVar14);
        H = new el() { // from class: com.facetec.sdk.ft.23
            @Override // com.facetec.sdk.el
            public final <T> eo<T> c(dv dvVar, fy<T> fyVar) {
                Class<? super T> clsD = fyVar.d();
                if (!Enum.class.isAssignableFrom(clsD) || clsD == Enum.class) {
                    return null;
                }
                if (!clsD.isEnum()) {
                    clsD = clsD.getSuperclass();
                }
                return new a(clsD);
            }
        };
    }

    public static <TT> el a(final Class<TT> cls, final eo<TT> eoVar) {
        return new el() { // from class: com.facetec.sdk.ft.25
            @Override // com.facetec.sdk.el
            public final <T> eo<T> c(dv dvVar, fy<T> fyVar) {
                if (fyVar.d() == cls) {
                    return eoVar;
                }
                return null;
            }

            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Factory[type=");
                androidx.core.graphics.b.f(cls, sb2, ",adapter=");
                sb2.append(eoVar);
                sb2.append(Constant.BRACKET_CLOSE);
                return sb2.toString();
            }
        };
    }

    private static <T1> el c(final Class<T1> cls, final eo<T1> eoVar) {
        return new el() { // from class: com.facetec.sdk.ft.27
            @Override // com.facetec.sdk.el
            public final <T2> eo<T2> c(dv dvVar, fy<T2> fyVar) {
                final Class<? super T2> clsD = fyVar.d();
                if (cls.isAssignableFrom(clsD)) {
                    return (eo<T2>) new eo<T1>() { // from class: com.facetec.sdk.ft.27.3
                        @Override // com.facetec.sdk.eo
                        public final T1 a(fz fzVar) throws IOException {
                            T1 t10 = (T1) eoVar.a(fzVar);
                            if (t10 == null || clsD.isInstance(t10)) {
                                return t10;
                            }
                            StringBuilder sb2 = new StringBuilder("Expected a ");
                            sb2.append(clsD.getName());
                            sb2.append(" but was ");
                            sb2.append(t10.getClass().getName());
                            throw new en(sb2.toString());
                        }

                        @Override // com.facetec.sdk.eo
                        public final void b(ga gaVar, T1 t10) throws IOException {
                            eoVar.b(gaVar, t10);
                        }
                    };
                }
                return null;
            }

            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Factory[typeHierarchy=");
                androidx.core.graphics.b.f(cls, sb2, ",adapter=");
                sb2.append(eoVar);
                sb2.append(Constant.BRACKET_CLOSE);
                return sb2.toString();
            }
        };
    }

    public static <TT> el a(final Class<TT> cls, final Class<TT> cls2, final eo<? super TT> eoVar) {
        return new el() { // from class: com.facetec.sdk.ft.29
            @Override // com.facetec.sdk.el
            public final <T> eo<T> c(dv dvVar, fy<T> fyVar) {
                Class<? super T> clsD = fyVar.d();
                if (clsD == cls || clsD == cls2) {
                    return eoVar;
                }
                return null;
            }

            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Factory[type=");
                androidx.core.graphics.b.f(cls2, sb2, "+");
                androidx.core.graphics.b.f(cls, sb2, ",adapter=");
                sb2.append(eoVar);
                sb2.append(Constant.BRACKET_CLOSE);
                return sb2.toString();
            }
        };
    }
}
