package com.facetec.sdk;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.dasnano.vdvideoselfiecapture.config.VDVideoSelfieConfiguration;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import mx.openpay.library.domain.util.Constant;
import okio.internal.Buffer;

/* JADX INFO: loaded from: classes9.dex */
public class fz implements Closeable {
    private static final byte[] $$a = null;
    private static final int $$b = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final char[] f41711d;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static long f41712s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static char[] f41713t;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Reader f41715b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f41720h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String[] f41723k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f41724l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f41725n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int[] f41726o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int[] f41727q;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f41716c = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final char[] f41717e = new char[1024];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f41721i = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f41719g = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f41722j = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f41718f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f41714a = 0;
    private int m = 1;

    static {
        init$0();
        r();
        f41711d = ")]}'\n".toCharArray();
        eu.f41472c = new eu() { // from class: com.facetec.sdk.fz.4
            @Override // com.facetec.sdk.eu
            public final void b(fz fzVar) throws Throwable {
                if (fzVar instanceof fj) {
                    fj fjVar = (fj) fzVar;
                    fjVar.b(gb.NAME);
                    Map.Entry entry = (Map.Entry) ((Iterator) fjVar.h()).next();
                    fjVar.c(entry.getValue());
                    fjVar.c(new ei((String) entry.getKey()));
                    return;
                }
                int iP = fzVar.f41714a;
                if (iP == 0) {
                    iP = fzVar.p();
                }
                if (iP == 13) {
                    fzVar.f41714a = 9;
                    return;
                }
                if (iP == 12) {
                    fzVar.f41714a = 8;
                } else {
                    if (iP == 14) {
                        fzVar.f41714a = 10;
                        return;
                    }
                    StringBuilder sb2 = new StringBuilder("Expected a name but was ");
                    sb2.append(fzVar.j());
                    sb2.append(fzVar.s());
                    throw new IllegalStateException(sb2.toString());
                }
            }
        };
    }

    public fz(Reader reader) {
        int[] iArr = new int[32];
        this.f41726o = iArr;
        iArr[0] = 6;
        this.f41723k = new String[32];
        this.f41727q = new int[32];
        if (reader == null) {
            throw new NullPointerException("in == null");
        }
        this.f41715b = reader;
    }

    private static void A(short s4, int i10, byte b10, Object[] objArr) {
        int i11 = (i10 * 3) + 4;
        int i12 = (b10 * 3) + 99;
        int i13 = s4 * 2;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i13 + 1];
        int i14 = -1;
        if (bArr == null) {
            i12 = i13 + i11;
            i13 = i13;
            i11++;
        }
        while (true) {
            i14++;
            bArr2[i14] = (byte) i12;
            if (i14 == i13) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            byte b11 = bArr[i11];
            i12 += b11;
            i13 = i13;
            i11++;
        }
    }

    private void C() throws Throwable {
        b(true);
        int i10 = this.f41721i - 1;
        this.f41721i = i10;
        char[] cArr = f41711d;
        if (i10 + cArr.length > this.f41719g && !e(cArr.length)) {
            return;
        }
        int i11 = 0;
        while (true) {
            char[] cArr2 = f41711d;
            if (i11 >= cArr2.length) {
                this.f41721i += cArr2.length;
                return;
            } else if (this.f41717e[this.f41721i + i11] != cArr2[i11]) {
                return;
            } else {
                i11++;
            }
        }
    }

    private int h() throws IOException {
        String str;
        String str2;
        int i10;
        char c10 = this.f41717e[this.f41721i];
        if (c10 == 't' || c10 == 'T') {
            str = "true";
            str2 = "TRUE";
            i10 = 5;
        } else if (c10 == 'f' || c10 == 'F') {
            str = "false";
            str2 = "FALSE";
            i10 = 6;
        } else {
            if (c10 != 'n' && c10 != 'N') {
                return 0;
            }
            str = AbstractJsonLexerKt.NULL;
            str2 = VDVideoSelfieConfiguration.NULL;
            i10 = 7;
        }
        int length = str.length();
        for (int i11 = 1; i11 < length; i11++) {
            if (this.f41721i + i11 >= this.f41719g && !e(i11 + 1)) {
                return 0;
            }
            char c11 = this.f41717e[this.f41721i + i11];
            if (c11 != str.charAt(i11) && c11 != str2.charAt(i11)) {
                return 0;
            }
        }
        if ((this.f41721i + length < this.f41719g || e(length + 1)) && d(this.f41717e[this.f41721i + length])) {
            return 0;
        }
        this.f41721i += length;
        this.f41714a = i10;
        return i10;
    }

    public static void init$0() {
        $$a = new byte[]{104, -63, -106, 6};
        $$b = 184;
    }

    public static void r() {
        f41713t = new char[]{50213, 43159, 7499, 33285, 30341, 56254, 18552, 15662, 41440, 5856, 64294, 28613, 56464, 16734, 13876, 39669, 32908, 60454, 23021, 50855, 12912, 40723, 3284, 31122, 58716};
        f41712s = 761989247588363348L;
    }

    private void u() throws IOException {
        if (!this.f41716c) {
            throw d("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    /* JADX WARN: Code duplicated, block: B:109:0x00f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:13:0x002e  */
    /* JADX WARN: Code duplicated, block: B:89:0x00de  */
    /* JADX WARN: Code duplicated, block: B:91:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:96:0x00ea  */
    private int v() throws IOException {
        char c10;
        char c11;
        char[] cArr = this.f41717e;
        int i10 = this.f41721i;
        int i11 = this.f41719g;
        int i12 = 0;
        int i13 = 0;
        char c12 = 0;
        boolean z10 = false;
        boolean z11 = true;
        long j10 = 0;
        while (true) {
            if (i10 + i13 == i11) {
                if (i13 != cArr.length) {
                    if (!e(i13 + 1)) {
                        break;
                    }
                    i10 = this.f41721i;
                    i11 = this.f41719g;
                    c10 = cArr[i10 + i13];
                    if (c10 != '+') {
                        if (c10 != 'E') {
                            i12 = 0;
                            if (c12 == 2) {
                            }
                            c12 = 5;
                        } else {
                            i12 = 0;
                            if (c12 == 2) {
                            }
                            c12 = 5;
                        }
                        i13++;
                    } else {
                        c11 = 6;
                        i12 = 0;
                        if (c12 != 5) {
                            return 0;
                        }
                    }
                    c12 = c11;
                    i13++;
                } else {
                    return i12;
                }
            } else {
                c10 = cArr[i10 + i13];
                if (c10 != '+') {
                    if (c10 != 'E' || c10 == 'e') {
                        i12 = 0;
                        if (c12 == 2 && c12 != 4) {
                            return 0;
                        }
                        c12 = 5;
                    } else if (c10 != '-') {
                        c11 = 3;
                        if (c10 == '.') {
                            i12 = 0;
                            if (c12 != 2) {
                                return 0;
                            }
                        } else {
                            if (c10 < '0' || c10 > '9') {
                                if (!d(c10)) {
                                    break;
                                }
                                return 0;
                            }
                            if (c12 == 1 || c12 == 0) {
                                j10 = -(c10 - '0');
                                c12 = 2;
                            } else if (c12 == 2) {
                                if (j10 == 0) {
                                    return 0;
                                }
                                long j11 = (10 * j10) - ((long) (c10 - '0'));
                                z11 &= j10 > Buffer.OVERFLOW_ZONE || (j10 == Buffer.OVERFLOW_ZONE && j11 < j10);
                                j10 = j11;
                            } else if (c12 == 3) {
                                i12 = 0;
                                c12 = 4;
                            } else if (c12 == 5 || c12 == 6) {
                                i12 = 0;
                                c12 = 7;
                            }
                            i12 = 0;
                        }
                    } else {
                        c11 = 6;
                        i12 = 0;
                        if (c12 == 0) {
                            c12 = 1;
                            z10 = true;
                        } else if (c12 != 5) {
                            return 0;
                        }
                    }
                    i13++;
                } else {
                    c11 = 6;
                    i12 = 0;
                    if (c12 != 5) {
                        return 0;
                    }
                }
                c12 = c11;
                i13++;
            }
        }
        if (c12 == 2 && z11 && ((j10 != Long.MIN_VALUE || z10) && (j10 != 0 || !z10))) {
            if (!z10) {
                j10 = -j10;
            }
            this.f41720h = j10;
            this.f41721i += i13;
            this.f41714a = 15;
            return 15;
        }
        if (c12 != 2 && c12 != 4 && c12 != 7) {
            return 0;
        }
        this.f41724l = i13;
        this.f41714a = 16;
        return 16;
    }

    private char w() throws IOException {
        int i10;
        if (this.f41721i == this.f41719g && !e(1)) {
            throw d("Unterminated escape sequence");
        }
        char[] cArr = this.f41717e;
        int i11 = this.f41721i;
        int i12 = i11 + 1;
        this.f41721i = i12;
        char c10 = cArr[i11];
        if (c10 == '\n') {
            this.f41722j++;
            this.f41718f = i12;
        } else if (c10 != '\"' && c10 != '\'' && c10 != '/' && c10 != '\\') {
            if (c10 == 'b') {
                return '\b';
            }
            if (c10 == 'f') {
                return '\f';
            }
            if (c10 == 'n') {
                return '\n';
            }
            if (c10 == 'r') {
                return '\r';
            }
            if (c10 == 't') {
                return '\t';
            }
            if (c10 != 'u') {
                throw d("Invalid escape sequence");
            }
            if (i11 + 5 > this.f41719g && !e(4)) {
                throw d("Unterminated escape sequence");
            }
            int i13 = this.f41721i;
            int i14 = i13 + 4;
            char c11 = 0;
            while (i13 < i14) {
                char c12 = this.f41717e[i13];
                char c13 = (char) (c11 << 4);
                if (c12 >= '0' && c12 <= '9') {
                    i10 = c12 - '0';
                } else if (c12 >= 'a' && c12 <= 'f') {
                    i10 = c12 - 'W';
                } else {
                    if (c12 < 'A' || c12 > 'F') {
                        throw new NumberFormatException("\\u".concat(new String(this.f41717e, this.f41721i, 4)));
                    }
                    i10 = c12 - '7';
                }
                c11 = (char) (i10 + c13);
                i13++;
            }
            this.f41721i += 4;
            return c11;
        }
        return c10;
    }

    private void x() throws IOException {
        char c10;
        do {
            if (this.f41721i >= this.f41719g && !e(1)) {
                return;
            }
            char[] cArr = this.f41717e;
            int i10 = this.f41721i;
            int i11 = i10 + 1;
            this.f41721i = i11;
            c10 = cArr[i10];
            if (c10 == '\n') {
                this.f41722j++;
                this.f41718f = i11;
                return;
            }
        } while (c10 != '\r');
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0044. Please report as an issue. */
    private String y() throws IOException {
        String string;
        StringBuilder sb2 = null;
        int i10 = 0;
        while (true) {
            int i11 = 0;
            while (true) {
                int i12 = this.f41721i;
                if (i12 + i11 < this.f41719g) {
                    char c10 = this.f41717e[i12 + i11];
                    if (c10 != '\t' && c10 != '\n' && c10 != '\f' && c10 != '\r' && c10 != ' ') {
                        if (c10 != '#') {
                            if (c10 != ',') {
                                if (c10 != '/' && c10 != '=') {
                                    if (c10 != '{' && c10 != '}' && c10 != ':') {
                                        if (c10 != ';') {
                                            switch (c10) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i11++;
                                                    break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        u();
                    }
                    i10 = i11;
                } else if (i11 >= this.f41717e.length) {
                    if (sb2 == null) {
                        sb2 = new StringBuilder(Math.max(i11, 16));
                    }
                    sb2.append(this.f41717e, this.f41721i, i11);
                    this.f41721i += i11;
                    if (!e(1)) {
                    }
                } else if (!e(i11 + 1)) {
                    i10 = i11;
                }
                if (sb2 == null) {
                    string = new String(this.f41717e, this.f41721i, i10);
                } else {
                    sb2.append(this.f41717e, this.f41721i, i10);
                    string = sb2.toString();
                }
                this.f41721i += i10;
                return string;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:39:0x01c1  */
    private static void z(int i10, int i11, char c10, Object[] objArr) throws Throwable {
        Throwable cause;
        gt gtVar = new gt();
        long[] jArr = new long[i10];
        gtVar.f41826d = 0;
        while (true) {
            int i12 = gtVar.f41826d;
            if (i12 >= i10) {
                break;
            }
            try {
                Object[] objArr2 = {Integer.valueOf(f41713t[i11 + i12])};
                Map map = bp.f40694x;
                Object method = map.get(-167668390);
                if (method == null) {
                    method = ((Class) bp.a(TextUtils.getTrimmedLength("") + 24, 245 - TextUtils.getOffsetAfter("", 0), (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24))).getMethod("d", Integer.TYPE);
                    map.put(-167668390, method);
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) method).invoke(null, objArr2)).longValue()), Long.valueOf(gtVar.f41826d), Long.valueOf(f41712s), Integer.valueOf(c10)};
                Object method2 = map.get(-1565725271);
                if (method2 == null) {
                    Class cls = (Class) bp.a((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 25, 1672 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) (KeyEvent.getDeadChar(0, 0) + 58390));
                    byte b10 = (byte) 0;
                    byte b11 = b10;
                    Object[] objArr4 = new Object[1];
                    A(b10, b11, b11, objArr4);
                    String str = (String) objArr4[0];
                    Class<?> cls2 = Long.TYPE;
                    method2 = cls.getMethod(str, cls2, cls2, cls2, Integer.TYPE);
                    map.put(-1565725271, method2);
                }
                jArr[i12] = ((Long) ((Method) method2).invoke(null, objArr3)).longValue();
                Object[] objArr5 = {gtVar, gtVar};
                Object method3 = map.get(453950717);
                if (method3 == null) {
                    method3 = ((Class) bp.a(24 - TextUtils.indexOf("", ""), Color.red(0) + 269, (char) (25687 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))))).getMethod("b", Object.class, Object.class);
                    map.put(453950717, method3);
                }
                ((Method) method3).invoke(null, objArr5);
            } catch (Throwable th2) {
                cause = th2.getCause();
                if (cause != null) {
                    throw th2;
                }
                throw cause;
            }
            cause = th2.getCause();
            if (cause != null) {
                throw th2;
            }
            throw cause;
        }
        char[] cArr = new char[i10];
        gtVar.f41826d = 0;
        while (true) {
            int i13 = gtVar.f41826d;
            if (i13 >= i10) {
                objArr[0] = new String(cArr);
                return;
            }
            cArr[i13] = (char) jArr[i13];
            Object[] objArr6 = {gtVar, gtVar};
            Map map2 = bp.f40694x;
            Object method4 = map2.get(453950717);
            if (method4 == null) {
                method4 = ((Class) bp.a(25 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 268 - TextUtils.indexOf((CharSequence) "", '0'), (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 25686))).getMethod("b", Object.class, Object.class);
                map2.put(453950717, method4);
            }
            ((Method) method4).invoke(null, objArr6);
        }
    }

    public void a() throws IOException {
        int iP = this.f41714a;
        if (iP == 0) {
            iP = p();
        }
        if (iP == 3) {
            b(1);
            this.f41727q[this.m - 1] = 0;
            this.f41714a = 0;
        } else {
            StringBuilder sb2 = new StringBuilder("Expected BEGIN_ARRAY but was ");
            sb2.append(j());
            sb2.append(s());
            throw new IllegalStateException(sb2.toString());
        }
    }

    public void b() throws IOException {
        int iP = this.f41714a;
        if (iP == 0) {
            iP = p();
        }
        if (iP != 4) {
            StringBuilder sb2 = new StringBuilder("Expected END_ARRAY but was ");
            sb2.append(j());
            sb2.append(s());
            throw new IllegalStateException(sb2.toString());
        }
        int i10 = this.m;
        this.m = i10 - 1;
        int[] iArr = this.f41727q;
        int i11 = i10 - 2;
        iArr[i11] = iArr[i11] + 1;
        this.f41714a = 0;
    }

    public final void c(boolean z10) {
        this.f41716c = z10;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f41714a = 0;
        this.f41726o[0] = 8;
        this.m = 1;
        this.f41715b.close();
    }

    public void d() throws Throwable {
        int iP = this.f41714a;
        if (iP == 0) {
            iP = p();
        }
        if (iP == 1) {
            b(3);
            this.f41714a = 0;
        } else {
            StringBuilder sb2 = new StringBuilder("Expected BEGIN_OBJECT but was ");
            sb2.append(j());
            sb2.append(s());
            throw new IllegalStateException(sb2.toString());
        }
    }

    public void e() throws Throwable {
        int iP = this.f41714a;
        if (iP == 0) {
            iP = p();
        }
        if (iP != 2) {
            StringBuilder sb2 = new StringBuilder("Expected END_OBJECT but was ");
            sb2.append(j());
            sb2.append(s());
            throw new IllegalStateException(sb2.toString());
        }
        int i10 = this.m;
        int i11 = i10 - 1;
        this.m = i11;
        this.f41723k[i11] = null;
        int[] iArr = this.f41727q;
        int i12 = i10 - 2;
        iArr[i12] = iArr[i12] + 1;
        this.f41714a = 0;
    }

    public String f() throws Throwable {
        String str;
        int iP = this.f41714a;
        if (iP == 0) {
            iP = p();
        }
        if (iP == 10) {
            str = y();
        } else if (iP == 8) {
            str = b('\'');
        } else if (iP == 9) {
            str = b('\"');
        } else if (iP == 11) {
            str = this.f41725n;
            this.f41725n = null;
        } else if (iP == 15) {
            str = Long.toString(this.f41720h);
        } else {
            if (iP != 16) {
                StringBuilder sb2 = new StringBuilder("Expected a string but was ");
                sb2.append(j());
                sb2.append(s());
                throw new IllegalStateException(sb2.toString());
            }
            str = new String(this.f41717e, this.f41721i, this.f41724l);
            this.f41721i += this.f41724l;
        }
        this.f41714a = 0;
        int[] iArr = this.f41727q;
        int i10 = this.m - 1;
        iArr[i10] = iArr[i10] + 1;
        return str;
    }

    public boolean g() throws Throwable {
        int iP = this.f41714a;
        if (iP == 0) {
            iP = p();
        }
        if (iP == 5) {
            this.f41714a = 0;
            int[] iArr = this.f41727q;
            int i10 = this.m - 1;
            iArr[i10] = iArr[i10] + 1;
            return true;
        }
        if (iP != 6) {
            StringBuilder sb2 = new StringBuilder("Expected a boolean but was ");
            sb2.append(j());
            sb2.append(s());
            throw new IllegalStateException(sb2.toString());
        }
        this.f41714a = 0;
        int[] iArr2 = this.f41727q;
        int i11 = this.m - 1;
        iArr2[i11] = iArr2[i11] + 1;
        return false;
    }

    public String i() throws Throwable {
        String strB;
        int iP = this.f41714a;
        if (iP == 0) {
            iP = p();
        }
        if (iP == 14) {
            strB = y();
        } else if (iP == 12) {
            strB = b('\'');
        } else {
            if (iP != 13) {
                StringBuilder sb2 = new StringBuilder("Expected a name but was ");
                sb2.append(j());
                sb2.append(s());
                throw new IllegalStateException(sb2.toString());
            }
            strB = b('\"');
        }
        this.f41714a = 0;
        this.f41723k[this.m - 1] = strB;
        return strB;
    }

    public gb j() throws IOException {
        int iP = this.f41714a;
        if (iP == 0) {
            iP = p();
        }
        switch (iP) {
            case 1:
                return gb.BEGIN_OBJECT;
            case 2:
                return gb.END_OBJECT;
            case 3:
                return gb.BEGIN_ARRAY;
            case 4:
                return gb.END_ARRAY;
            case 5:
            case 6:
                return gb.BOOLEAN;
            case 7:
                return gb.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return gb.STRING;
            case 12:
            case 13:
            case 14:
                return gb.NAME;
            case 15:
            case 16:
                return gb.NUMBER;
            case 17:
                return gb.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public long k() throws Throwable {
        int iP = this.f41714a;
        if (iP == 0) {
            iP = p();
        }
        if (iP == 15) {
            this.f41714a = 0;
            int[] iArr = this.f41727q;
            int i10 = this.m - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.f41720h;
        }
        if (iP == 16) {
            this.f41725n = new String(this.f41717e, this.f41721i, this.f41724l);
            this.f41721i += this.f41724l;
        } else {
            if (iP != 8 && iP != 9 && iP != 10) {
                StringBuilder sb2 = new StringBuilder("Expected a long but was ");
                sb2.append(j());
                sb2.append(s());
                throw new IllegalStateException(sb2.toString());
            }
            if (iP == 10) {
                this.f41725n = y();
            } else {
                this.f41725n = b(iP == 8 ? '\'' : '\"');
            }
            try {
                long j10 = Long.parseLong(this.f41725n);
                this.f41714a = 0;
                int[] iArr2 = this.f41727q;
                int i11 = this.m - 1;
                iArr2[i11] = iArr2[i11] + 1;
                return j10;
            } catch (NumberFormatException unused) {
            }
        }
        this.f41714a = 11;
        double d2 = Double.parseDouble(this.f41725n);
        long j11 = (long) d2;
        if (j11 != d2) {
            StringBuilder sb3 = new StringBuilder("Expected a long but was ");
            sb3.append(this.f41725n);
            sb3.append(s());
            throw new NumberFormatException(sb3.toString());
        }
        this.f41725n = null;
        this.f41714a = 0;
        int[] iArr3 = this.f41727q;
        int i12 = this.m - 1;
        iArr3[i12] = iArr3[i12] + 1;
        return j11;
    }

    public double l() throws Throwable {
        int iP = this.f41714a;
        if (iP == 0) {
            iP = p();
        }
        if (iP == 15) {
            this.f41714a = 0;
            int[] iArr = this.f41727q;
            int i10 = this.m - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.f41720h;
        }
        if (iP == 16) {
            this.f41725n = new String(this.f41717e, this.f41721i, this.f41724l);
            this.f41721i += this.f41724l;
        } else if (iP == 8 || iP == 9) {
            this.f41725n = b(iP == 8 ? '\'' : '\"');
        } else if (iP == 10) {
            this.f41725n = y();
        } else if (iP != 11) {
            StringBuilder sb2 = new StringBuilder("Expected a double but was ");
            sb2.append(j());
            sb2.append(s());
            throw new IllegalStateException(sb2.toString());
        }
        this.f41714a = 11;
        double d2 = Double.parseDouble(this.f41725n);
        if (!this.f41716c && (Double.isNaN(d2) || Double.isInfinite(d2))) {
            StringBuilder sb3 = new StringBuilder("JSON forbids NaN and infinities: ");
            sb3.append(d2);
            sb3.append(s());
            throw new gh(sb3.toString());
        }
        this.f41725n = null;
        this.f41714a = 0;
        int[] iArr2 = this.f41727q;
        int i11 = this.m - 1;
        iArr2[i11] = iArr2[i11] + 1;
        return d2;
    }

    public void m() throws IOException {
        int iP = this.f41714a;
        if (iP == 0) {
            iP = p();
        }
        if (iP != 7) {
            StringBuilder sb2 = new StringBuilder("Expected null but was ");
            sb2.append(j());
            sb2.append(s());
            throw new IllegalStateException(sb2.toString());
        }
        this.f41714a = 0;
        int[] iArr = this.f41727q;
        int i10 = this.m - 1;
        iArr[i10] = iArr[i10] + 1;
    }

    public int n() throws Throwable {
        int iP = this.f41714a;
        if (iP == 0) {
            iP = p();
        }
        if (iP == 15) {
            long j10 = this.f41720h;
            int i10 = (int) j10;
            if (j10 != i10) {
                StringBuilder sb2 = new StringBuilder("Expected an int but was ");
                sb2.append(this.f41720h);
                sb2.append(s());
                throw new NumberFormatException(sb2.toString());
            }
            this.f41714a = 0;
            int[] iArr = this.f41727q;
            int i11 = this.m - 1;
            iArr[i11] = iArr[i11] + 1;
            return i10;
        }
        if (iP == 16) {
            this.f41725n = new String(this.f41717e, this.f41721i, this.f41724l);
            this.f41721i += this.f41724l;
        } else {
            if (iP != 8 && iP != 9 && iP != 10) {
                StringBuilder sb3 = new StringBuilder("Expected an int but was ");
                sb3.append(j());
                sb3.append(s());
                throw new IllegalStateException(sb3.toString());
            }
            if (iP == 10) {
                this.f41725n = y();
            } else {
                this.f41725n = b(iP == 8 ? '\'' : '\"');
            }
            try {
                int i12 = Integer.parseInt(this.f41725n);
                this.f41714a = 0;
                int[] iArr2 = this.f41727q;
                int i13 = this.m - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return i12;
            } catch (NumberFormatException unused) {
            }
        }
        this.f41714a = 11;
        double d2 = Double.parseDouble(this.f41725n);
        int i14 = (int) d2;
        if (i14 != d2) {
            StringBuilder sb4 = new StringBuilder("Expected an int but was ");
            sb4.append(this.f41725n);
            sb4.append(s());
            throw new NumberFormatException(sb4.toString());
        }
        this.f41725n = null;
        this.f41714a = 0;
        int[] iArr3 = this.f41727q;
        int i15 = this.m - 1;
        iArr3[i15] = iArr3[i15] + 1;
        return i14;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:61:0x009d. Please report as an issue. */
    public void o() throws Throwable {
        int i10 = 0;
        do {
            int iP = this.f41714a;
            if (iP == 0) {
                iP = p();
            }
            if (iP == 3) {
                b(1);
            } else {
                if (iP == 1) {
                    b(3);
                } else if (iP == 4 || iP == 2) {
                    this.m--;
                    i10--;
                } else if (iP == 14 || iP == 10) {
                    while (true) {
                        int i11 = 0;
                        while (true) {
                            int i12 = this.f41721i;
                            if (i12 + i11 < this.f41719g) {
                                char c10 = this.f41717e[i12 + i11];
                                if (c10 != '\t' && c10 != '\n' && c10 != '\f' && c10 != '\r' && c10 != ' ') {
                                    if (c10 != '#') {
                                        if (c10 != ',') {
                                            if (c10 != '/' && c10 != '=') {
                                                if (c10 != '{' && c10 != '}' && c10 != ':') {
                                                    if (c10 != ';') {
                                                        switch (c10) {
                                                            case '[':
                                                            case ']':
                                                                break;
                                                            case '\\':
                                                                break;
                                                            default:
                                                                i11++;
                                                                break;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    u();
                                }
                                this.f41721i += i11;
                            } else {
                                this.f41721i = i12 + i11;
                                if (!e(1)) {
                                }
                            }
                        }
                    }
                } else if (iP == 8 || iP == 12) {
                    a('\'');
                } else if (iP == 9 || iP == 13) {
                    a('\"');
                } else if (iP == 16) {
                    this.f41721i += this.f41724l;
                }
                this.f41714a = 0;
            }
            i10++;
            this.f41714a = 0;
        } while (i10 != 0);
        int[] iArr = this.f41727q;
        int i13 = this.m;
        int i14 = i13 - 1;
        iArr[i14] = iArr[i14] + 1;
        this.f41723k[i13 - 1] = AbstractJsonLexerKt.NULL;
    }

    public final int p() throws Throwable {
        int iB;
        int[] iArr = this.f41726o;
        int i10 = this.m;
        int i11 = iArr[i10 - 1];
        if (i11 == 1) {
            iArr[i10 - 1] = 2;
        } else if (i11 == 2) {
            int iB2 = b(true);
            if (iB2 != 44) {
                if (iB2 != 59) {
                    if (iB2 != 93) {
                        throw d("Unterminated array");
                    }
                    this.f41714a = 4;
                    return 4;
                }
                u();
            }
        } else {
            if (i11 == 3 || i11 == 5) {
                iArr[i10 - 1] = 4;
                if (i11 == 5 && (iB = b(true)) != 44) {
                    if (iB != 59) {
                        if (iB != 125) {
                            throw d("Unterminated object");
                        }
                        this.f41714a = 2;
                        return 2;
                    }
                    u();
                }
                int iB3 = b(true);
                if (iB3 == 34) {
                    this.f41714a = 13;
                    return 13;
                }
                if (iB3 == 39) {
                    u();
                    this.f41714a = 12;
                    return 12;
                }
                if (iB3 == 125) {
                    if (i11 == 5) {
                        throw d("Expected name");
                    }
                    this.f41714a = 2;
                    return 2;
                }
                u();
                this.f41721i--;
                if (!d((char) iB3)) {
                    throw d("Expected name");
                }
                this.f41714a = 14;
                return 14;
            }
            if (i11 == 4) {
                iArr[i10 - 1] = 5;
                int iB4 = b(true);
                if (iB4 != 58) {
                    if (iB4 != 61) {
                        throw d("Expected ':'");
                    }
                    u();
                    if (this.f41721i < this.f41719g || e(1)) {
                        char[] cArr = this.f41717e;
                        int i12 = this.f41721i;
                        if (cArr[i12] == '>') {
                            this.f41721i = i12 + 1;
                        }
                    }
                }
            } else if (i11 == 6) {
                if (this.f41716c) {
                    C();
                }
                this.f41726o[this.m - 1] = 7;
            } else if (i11 == 7) {
                if (b(false) == -1) {
                    this.f41714a = 17;
                    return 17;
                }
                u();
                this.f41721i--;
            } else if (i11 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        }
        int iB5 = b(true);
        if (iB5 == 34) {
            this.f41714a = 9;
            return 9;
        }
        if (iB5 == 39) {
            u();
            this.f41714a = 8;
            return 8;
        }
        if (iB5 != 44 && iB5 != 59) {
            if (iB5 == 91) {
                this.f41714a = 3;
                return 3;
            }
            if (iB5 != 93) {
                if (iB5 == 123) {
                    this.f41714a = 1;
                    return 1;
                }
                this.f41721i--;
                int iH = h();
                if (iH != 0) {
                    return iH;
                }
                int iV = v();
                if (iV != 0) {
                    return iV;
                }
                if (!d(this.f41717e[this.f41721i])) {
                    throw d("Expected value");
                }
                u();
                this.f41714a = 10;
                return 10;
            }
            if (i11 == 1) {
                this.f41714a = 4;
                return 4;
            }
        }
        if (i11 != 1 && i11 != 2) {
            throw d("Unexpected value");
        }
        u();
        this.f41721i--;
        this.f41714a = 7;
        return 7;
    }

    public String q() {
        StringBuilder sb2 = new StringBuilder(Constant.MXN_SYMBOL);
        int i10 = this.m;
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = this.f41726o[i11];
            if (i12 == 1 || i12 == 2) {
                sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
                sb2.append(this.f41727q[i11]);
                sb2.append(AbstractJsonLexerKt.END_LIST);
            } else if (i12 == 3 || i12 == 4 || i12 == 5) {
                sb2.append('.');
                String str = this.f41723k[i11];
                if (str != null) {
                    sb2.append(str);
                }
            }
        }
        return sb2.toString();
    }

    public final String s() {
        StringBuilder sbE = androidx.collection.h.e(" at line ", this.f41722j + 1, " column ", (this.f41721i - this.f41718f) + 1, " path ");
        sbE.append(q());
        return sbE.toString();
    }

    public final boolean t() {
        return this.f41716c;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append(s());
        return sb2.toString();
    }

    public boolean c() throws Throwable {
        int iP = this.f41714a;
        if (iP == 0) {
            iP = p();
        }
        return (iP == 2 || iP == 4) ? false : true;
    }

    private boolean d(char c10) throws IOException {
        if (c10 == '\t' || c10 == '\n' || c10 == '\f' || c10 == '\r' || c10 == ' ') {
            return false;
        }
        if (c10 != '#') {
            if (c10 == ',') {
                return false;
            }
            if (c10 != '/' && c10 != '=') {
                if (c10 == '{' || c10 == '}' || c10 == ':') {
                    return false;
                }
                if (c10 != ';') {
                    switch (c10) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        u();
        return false;
    }

    private void a(char c10) throws IOException {
        char[] cArr = this.f41717e;
        while (true) {
            int i10 = this.f41721i;
            int i11 = this.f41719g;
            while (true) {
                if (i10 < i11) {
                    int i12 = i10 + 1;
                    char c11 = cArr[i10];
                    if (c11 == c10) {
                        this.f41721i = i12;
                        return;
                    }
                    if (c11 == '\\') {
                        this.f41721i = i12;
                        w();
                        break;
                    } else {
                        if (c11 == '\n') {
                            this.f41722j++;
                            this.f41718f = i12;
                        }
                        i10 = i12;
                    }
                } else {
                    this.f41721i = i10;
                    if (!e(1)) {
                        throw d("Unterminated string");
                    }
                    break;
                }
            }
        }
    }

    private String b(char c10) throws IOException {
        char[] cArr = this.f41717e;
        StringBuilder sb2 = null;
        while (true) {
            int i10 = this.f41721i;
            int i11 = this.f41719g;
            int i12 = i10;
            while (true) {
                if (i12 < i11) {
                    int i13 = i12 + 1;
                    char c11 = cArr[i12];
                    if (c11 == c10) {
                        this.f41721i = i13;
                        int i14 = (i13 - i10) - 1;
                        if (sb2 == null) {
                            return new String(cArr, i10, i14);
                        }
                        sb2.append(cArr, i10, i14);
                        return sb2.toString();
                    }
                    if (c11 == '\\') {
                        this.f41721i = i13;
                        int i15 = i13 - i10;
                        int i16 = i15 - 1;
                        if (sb2 == null) {
                            sb2 = new StringBuilder(Math.max(i15 << 1, 16));
                        }
                        sb2.append(cArr, i10, i16);
                        sb2.append(w());
                        break;
                    }
                    if (c11 == '\n') {
                        this.f41722j++;
                        this.f41718f = i13;
                    }
                    i12 = i13;
                } else {
                    if (sb2 == null) {
                        sb2 = new StringBuilder(Math.max((i12 - i10) << 1, 16));
                    }
                    sb2.append(cArr, i10, i12 - i10);
                    this.f41721i = i12;
                    if (e(1)) {
                        break;
                    }
                    throw d("Unterminated string");
                }
            }
        }
    }

    private IOException d(String str) throws IOException {
        StringBuilder sbD = androidx.camera.core.impl.utils.c.d(str);
        sbD.append(s());
        throw new gh(sbD.toString());
    }

    private boolean e(int i10) throws Throwable {
        int i11;
        int i12;
        char[] cArr = this.f41717e;
        int i13 = this.f41718f;
        int i14 = this.f41721i;
        this.f41718f = i13 - i14;
        int i15 = this.f41719g;
        if (i15 != i14) {
            int i16 = i15 - i14;
            this.f41719g = i16;
            try {
                Object[] objArr = {cArr, Integer.valueOf(i14), cArr, 0, Integer.valueOf(i16)};
                Object[] objArr2 = new Object[1];
                z(15 - TextUtils.lastIndexOf("", '0'), View.resolveSize(0, 0), (char) (17571 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), objArr2);
                Class<?> cls = Class.forName((String) objArr2[0]);
                Object[] objArr3 = new Object[1];
                z(Color.green(0) + 9, TextUtils.indexOf("", "", 0) + 16, (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr3);
                String str = (String) objArr3[0];
                Class<?> cls2 = Integer.TYPE;
                cls.getMethod(str, Object.class, cls2, Object.class, cls2, cls2).invoke(null, objArr);
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th2;
            }
        } else {
            this.f41719g = 0;
        }
        this.f41721i = 0;
        int i17 = i10;
        do {
            Reader reader = this.f41715b;
            int i18 = this.f41719g;
            int i19 = reader.read(cArr, i18, cArr.length - i18);
            if (i19 == -1) {
                return false;
            }
            i11 = this.f41719g + i19;
            this.f41719g = i11;
            if (this.f41722j == 0 && (i12 = this.f41718f) == 0 && i11 > 0 && cArr[0] == 65279) {
                this.f41721i++;
                this.f41718f = i12 + 1;
                i17++;
            }
        } while (i11 < i17);
        return true;
    }

    private boolean e(String str) throws IOException {
        int length = str.length();
        while (true) {
            if (this.f41721i + length > this.f41719g && !e(length)) {
                return false;
            }
            char[] cArr = this.f41717e;
            int i10 = this.f41721i;
            if (cArr[i10] != '\n') {
                for (int i11 = 0; i11 < length; i11++) {
                    if (this.f41717e[this.f41721i + i11] == str.charAt(i11)) {
                    }
                }
                return true;
            }
            this.f41722j++;
            this.f41718f = i10 + 1;
            this.f41721i++;
        }
    }

    private void b(int i10) {
        int i11 = this.m;
        int[] iArr = this.f41726o;
        if (i11 == iArr.length) {
            int i12 = i11 << 1;
            this.f41726o = Arrays.copyOf(iArr, i12);
            this.f41727q = Arrays.copyOf(this.f41727q, i12);
            this.f41723k = (String[]) Arrays.copyOf(this.f41723k, i12);
        }
        int[] iArr2 = this.f41726o;
        int i13 = this.m;
        this.m = i13 + 1;
        iArr2[i13] = i10;
    }

    private int b(boolean z10) throws Throwable {
        char[] cArr = this.f41717e;
        int i10 = this.f41721i;
        int i11 = this.f41719g;
        while (true) {
            if (i10 == i11) {
                this.f41721i = i10;
                if (!e(1)) {
                    if (!z10) {
                        return -1;
                    }
                    StringBuilder sb2 = new StringBuilder("End of input");
                    sb2.append(s());
                    throw new EOFException(sb2.toString());
                }
                i10 = this.f41721i;
                i11 = this.f41719g;
            }
            int i12 = i10 + 1;
            char c10 = cArr[i10];
            if (c10 == '\n') {
                this.f41722j++;
                this.f41718f = i12;
            } else if (c10 != ' ' && c10 != '\r' && c10 != '\t') {
                if (c10 == '/') {
                    this.f41721i = i12;
                    if (i12 == i11) {
                        this.f41721i = i10;
                        boolean zE = e(2);
                        this.f41721i++;
                        if (!zE) {
                            return c10;
                        }
                    }
                    u();
                    int i13 = this.f41721i;
                    char c11 = cArr[i13];
                    if (c11 == '*') {
                        this.f41721i = i13 + 1;
                        if (e("*/")) {
                            i10 = this.f41721i + 2;
                            i11 = this.f41719g;
                        } else {
                            throw d("Unterminated comment");
                        }
                    } else {
                        if (c11 != '/') {
                            return c10;
                        }
                        this.f41721i = i13 + 1;
                        x();
                        i10 = this.f41721i;
                        i11 = this.f41719g;
                    }
                } else if (c10 == '#') {
                    this.f41721i = i12;
                    u();
                    x();
                    i10 = this.f41721i;
                    i11 = this.f41719g;
                } else {
                    this.f41721i = i12;
                    return c10;
                }
            }
            i10 = i12;
        }
    }
}
