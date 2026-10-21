package net.minidev.json.parser;

import com.fasterxml.jackson.core.JsonPointer;
import com.google.android.material.internal.ViewUtils;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okio.internal.Buffer;

/* JADX INFO: loaded from: classes12.dex */
public abstract class JSONParserBase {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final boolean[] f85186r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final boolean[] f85187s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final boolean[] f85188t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final boolean[] f85189u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final boolean[] f85190v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public char f85191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ContainerFactory f85192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ContentHandler f85193c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MSB f85194d = new MSB(15);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f85195e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f85196f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f85197g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f85198h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f85199i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f85200j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f85201k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f85202l;
    public final boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f85203n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f85204o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f85205p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f85206q;

    static {
        boolean[] zArr = new boolean[126];
        f85186r = zArr;
        boolean[] zArr2 = new boolean[126];
        f85187s = zArr2;
        boolean[] zArr3 = new boolean[126];
        f85188t = zArr3;
        boolean[] zArr4 = new boolean[126];
        f85189u = zArr4;
        boolean[] zArr5 = new boolean[126];
        f85190v = zArr5;
        zArr3[26] = true;
        zArr3[58] = true;
        zArr4[26] = true;
        zArr4[125] = true;
        zArr4[44] = true;
        zArr2[26] = true;
        zArr2[93] = true;
        zArr2[44] = true;
        zArr5[26] = true;
        zArr[58] = true;
        zArr[44] = true;
        zArr[26] = true;
        zArr[125] = true;
        zArr[93] = true;
    }

    public JSONParserBase(int i10) {
        this.f85199i = (i10 & 4) > 0;
        this.f85200j = (i10 & 2) > 0;
        this.f85201k = (i10 & 1) > 0;
        this.f85204o = (i10 & 8) > 0;
        this.f85206q = (i10 & 16) > 0;
        this.f85198h = (i10 & 32) > 0;
        this.f85202l = (i10 & 64) > 0;
        this.f85205p = (i10 & 128) > 0;
        this.m = (i10 & ViewUtils.EDGE_TO_EDGE_FLAGS) == 0;
        this.f85203n = (i10 & 512) == 0;
    }

    public final void a() throws ParseException {
        int length = this.f85196f.length();
        if (length == 1) {
            return;
        }
        if (length == 2) {
            if (this.f85196f.equals("00")) {
                throw new ParseException(this.f85197g, 6, this.f85196f);
            }
            return;
        }
        char cCharAt = this.f85196f.charAt(0);
        char cCharAt2 = this.f85196f.charAt(1);
        if (cCharAt != '-') {
            if (cCharAt == '0' && cCharAt2 >= '0' && cCharAt2 <= '9') {
                throw new ParseException(this.f85197g, 6, this.f85196f);
            }
            return;
        }
        char cCharAt3 = this.f85196f.charAt(2);
        if (cCharAt2 == '0' && cCharAt3 >= '0' && cCharAt3 <= '9') {
            throw new ParseException(this.f85197g, 6, this.f85196f);
        }
    }

    public final Number b() throws ParseException {
        if (!this.f85198h) {
            a();
        }
        if (this.f85205p) {
            return this.f85196f.length() > 18 ? new BigDecimal(this.f85196f) : Double.valueOf(Double.parseDouble(this.f85196f));
        }
        return Float.valueOf(Float.parseFloat(this.f85196f));
    }

    public final Object c(ContainerFactory containerFactory, ContentHandler contentHandler) throws ParseException {
        this.f85192b = containerFactory;
        this.f85193c = contentHandler;
        try {
            e();
            contentHandler.startJSON();
            Object objF = f(f85190v);
            contentHandler.endJSON();
            if (this.m) {
                if (!this.f85203n) {
                    p();
                }
                if (this.f85191a != 26) {
                    throw new ParseException(this.f85197g - 1, 1, Character.valueOf(this.f85191a));
                }
            }
            this.f85196f = null;
            this.f85195e = null;
            return objF;
        } catch (IOException e5) {
            throw new ParseException(this.f85197g, e5);
        }
    }

    public final Number d(String str) throws ParseException {
        int i10;
        int i11;
        int length = str.length();
        boolean z10 = false;
        char cCharAt = str.charAt(0);
        boolean z11 = this.f85198h;
        if (cCharAt == '-') {
            if (!z11 && length >= 3 && str.charAt(1) == '0') {
                throw new ParseException(this.f85197g, 6, str);
            }
            i10 = 20;
            i11 = 1;
        } else {
            if (!z11 && length >= 2 && str.charAt(0) == '0') {
                throw new ParseException(this.f85197g, 6, str);
            }
            i10 = 19;
            i11 = 0;
        }
        int i12 = i11;
        if (length >= i10) {
            if (length > i10) {
                return new BigInteger(str, 10);
            }
            length--;
            z10 = true;
        }
        long jCharAt = 0;
        while (i11 < length) {
            jCharAt = (jCharAt * 10) + ((long) ('0' - str.charAt(i11)));
            i11++;
        }
        if (z10) {
            if (jCharAt <= Buffer.OVERFLOW_ZONE) {
                if (jCharAt >= Buffer.OVERFLOW_ZONE) {
                    if (i12 != 0) {
                    }
                }
                return new BigInteger(str, 10);
            }
            jCharAt = (jCharAt * 10) + ((long) ('0' - str.charAt(i11)));
        }
        boolean z12 = this.f85206q;
        if (i12 != 0) {
            return (!z12 || jCharAt < -2147483648L) ? Long.valueOf(jCharAt) : Integer.valueOf((int) jCharAt);
        }
        long j10 = -jCharAt;
        return (!z12 || j10 > 2147483647L) ? Long.valueOf(j10) : Integer.valueOf((int) j10);
    }

    public abstract void e() throws IOException;

    public final Object f(boolean[] zArr) throws ParseException, IOException {
        char c10;
        while (true) {
            char c11 = this.f85191a;
            if (c11 != '\t' && c11 != '\n') {
                boolean z10 = this.f85202l;
                boolean z11 = this.f85200j;
                switch (c11) {
                    case '\r':
                    case ' ':
                        break;
                    case '\"':
                    case '\'':
                        k();
                        this.f85193c.primitive(this.f85196f);
                        return this.f85196f;
                    case '-':
                        Object objI = i(zArr);
                        this.f85195e = objI;
                        this.f85193c.primitive(objI);
                        return this.f85195e;
                    case 'N':
                        g(zArr);
                        if (!this.f85199i) {
                            throw new ParseException(this.f85197g, 1, this.f85196f);
                        }
                        if ("NaN".equals(this.f85196f)) {
                            this.f85193c.primitive(Float.valueOf(Float.NaN));
                            return Float.valueOf(Float.NaN);
                        }
                        if (!z11) {
                            throw new ParseException(this.f85197g, 1, this.f85196f);
                        }
                        this.f85193c.primitive(this.f85196f);
                        return this.f85196f;
                    case '[':
                        List<Object> listCreateArrayContainer = this.f85192b.createArrayContainer();
                        if (this.f85191a != '[') {
                            throw new RuntimeException("Internal Error");
                        }
                        e();
                        this.f85193c.startArray();
                        while (true) {
                            boolean z12 = false;
                            while (true) {
                                c10 = this.f85191a;
                                if (c10 == '\t' || c10 == '\n' || c10 == '\r') {
                                    e();
                                } else {
                                    if (c10 == 26) {
                                        throw new ParseException(this.f85197g - 1, 3, "EOF");
                                    }
                                    if (c10 == ' ') {
                                        e();
                                    } else if (c10 == ',') {
                                        if (z12 && !z10) {
                                            throw new ParseException(this.f85197g, 0, Character.valueOf(this.f85191a));
                                        }
                                        e();
                                        z12 = true;
                                    }
                                }
                            }
                            if (c10 != ':') {
                                if (c10 == ']') {
                                    if (z12 && !z10) {
                                        throw new ParseException(this.f85197g, 0, Character.valueOf(this.f85191a));
                                    }
                                    e();
                                    this.f85193c.endArray();
                                    return listCreateArrayContainer;
                                }
                                if (c10 != '}') {
                                    listCreateArrayContainer.add(f(f85187s));
                                }
                            }
                            throw new ParseException(this.f85197g, 0, Character.valueOf(this.f85191a));
                        }
                    case ']':
                    case '}':
                        break;
                    case 'f':
                        g(zArr);
                        if ("false".equals(this.f85196f)) {
                            ContentHandler contentHandler = this.f85193c;
                            Boolean bool = Boolean.FALSE;
                            contentHandler.primitive(bool);
                            return bool;
                        }
                        if (!z11) {
                            throw new ParseException(this.f85197g, 1, this.f85196f);
                        }
                        this.f85193c.primitive(this.f85196f);
                        return this.f85196f;
                    case 'n':
                        g(zArr);
                        if (AbstractJsonLexerKt.NULL.equals(this.f85196f)) {
                            this.f85193c.primitive(null);
                            return null;
                        }
                        if (!z11) {
                            throw new ParseException(this.f85197g, 1, this.f85196f);
                        }
                        this.f85193c.primitive(this.f85196f);
                        return this.f85196f;
                    case 't':
                        g(zArr);
                        if ("true".equals(this.f85196f)) {
                            ContentHandler contentHandler2 = this.f85193c;
                            Boolean bool2 = Boolean.TRUE;
                            contentHandler2.primitive(bool2);
                            return bool2;
                        }
                        if (!z11) {
                            throw new ParseException(this.f85197g, 1, this.f85196f);
                        }
                        this.f85193c.primitive(this.f85196f);
                        return this.f85196f;
                    case '{':
                        Map<String, Object> mapCreateObjectContainer = this.f85192b.createObjectContainer();
                        char c12 = this.f85191a;
                        char c13 = AbstractJsonLexerKt.BEGIN_OBJ;
                        if (c12 != '{') {
                            throw new RuntimeException("Internal Error");
                        }
                        this.f85193c.startObject();
                        boolean z13 = false;
                        boolean z14 = true;
                        while (true) {
                            e();
                            char c14 = this.f85191a;
                            if (c14 != '\t' && c14 != '\n' && c14 != '\r' && c14 != ' ') {
                                if (c14 != ',') {
                                    if (c14 == ':' || c14 == '[' || c14 == ']' || c14 == c13) {
                                        throw new ParseException(this.f85197g, 0, Character.valueOf(this.f85191a));
                                    }
                                    if (c14 != '}') {
                                        int i10 = this.f85197g;
                                        if (c14 == '\"' || c14 == '\'') {
                                            k();
                                        } else {
                                            g(f85188t);
                                            if (!z11) {
                                                throw new ParseException(this.f85197g, 1, this.f85196f);
                                            }
                                        }
                                        String str = this.f85196f;
                                        if (!z14) {
                                            throw new ParseException(this.f85197g, 1, str);
                                        }
                                        this.f85193c.startObjectEntry(str);
                                        p();
                                        char c15 = this.f85191a;
                                        if (c15 != ':') {
                                            if (c15 == 26) {
                                                throw new ParseException(this.f85197g - 1, 3, null);
                                            }
                                            throw new ParseException(this.f85197g - 1, 0, Character.valueOf(this.f85191a));
                                        }
                                        h();
                                        if (mapCreateObjectContainer.put(str, f(f85189u)) != null) {
                                            throw new ParseException(i10, 5, str);
                                        }
                                        this.f85193c.endObjectEntry();
                                        char c16 = this.f85191a;
                                        if (c16 == '}') {
                                            e();
                                            this.f85193c.endObject();
                                        } else {
                                            if (c16 == 26) {
                                                throw new ParseException(this.f85197g - 1, 3, null);
                                            }
                                            if (c16 != ',') {
                                                z13 = false;
                                                z14 = false;
                                            }
                                        }
                                    } else {
                                        if (z13 && !z10) {
                                            throw new ParseException(this.f85197g, 0, Character.valueOf(this.f85191a));
                                        }
                                        e();
                                        this.f85193c.endObject();
                                    }
                                    return mapCreateObjectContainer;
                                }
                                if (z13 && !z10) {
                                    throw new ParseException(this.f85197g, 0, Character.valueOf(this.f85191a));
                                }
                                z13 = true;
                                z14 = true;
                            }
                            c13 = AbstractJsonLexerKt.BEGIN_OBJ;
                        }
                        break;
                    default:
                        switch (c11) {
                            case '0':
                            case '1':
                            case '2':
                            case '3':
                            case '4':
                            case '5':
                            case '6':
                            case '7':
                            case '8':
                            case '9':
                                Object objI2 = i(zArr);
                                this.f85195e = objI2;
                                this.f85193c.primitive(objI2);
                                return this.f85195e;
                            case ':':
                                break;
                            default:
                                g(zArr);
                                if (!z11) {
                                    throw new ParseException(this.f85197g, 1, this.f85196f);
                                }
                                this.f85193c.primitive(this.f85196f);
                                return this.f85196f;
                        }
                        break;
                }
            }
            e();
        }
        throw new ParseException(this.f85197g, 0, Character.valueOf(this.f85191a));
    }

    public abstract void g(boolean[] zArr) throws IOException;

    public abstract void h() throws ParseException, IOException;

    public abstract Object i(boolean[] zArr) throws ParseException, IOException;

    public abstract void j() throws IOException;

    public abstract void k() throws ParseException, IOException;

    public final void l() throws ParseException, IOException {
        char c10 = this.f85191a;
        while (true) {
            e();
            char c11 = this.f85191a;
            MSB msb = this.f85194d;
            if (c11 == '\"' || c11 == '\'') {
                if (c10 == c11) {
                    e();
                    this.f85196f = msb.toString();
                    return;
                }
                msb.append(c11);
            } else if (c11 != '\\') {
                if (c11 != 127) {
                    switch (c11) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case '\b':
                        case '\t':
                        case '\n':
                        case 11:
                        case '\f':
                        case '\r':
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                            break;
                        case 26:
                            throw new ParseException(this.f85197g - 1, 3, null);
                        default:
                            msb.append(c11);
                            continue;
                    }
                }
                if (!this.f85204o) {
                    throw new ParseException(this.f85197g, 0, Character.valueOf(this.f85191a));
                }
            } else {
                e();
                char c12 = this.f85191a;
                if (c12 == '\"') {
                    msb.append('\"');
                } else if (c12 == '\'') {
                    msb.append('\'');
                } else if (c12 == '/') {
                    msb.append(JsonPointer.SEPARATOR);
                } else if (c12 == '\\') {
                    msb.append(AbstractJsonLexerKt.STRING_ESC);
                } else if (c12 == 'b') {
                    msb.append('\b');
                } else if (c12 == 'f') {
                    msb.append('\f');
                } else if (c12 == 'n') {
                    msb.append('\n');
                } else if (c12 == 'r') {
                    msb.append('\r');
                } else if (c12 == 'x') {
                    msb.append(m(2));
                } else if (c12 == 't') {
                    msb.append('\t');
                } else if (c12 == 'u') {
                    msb.append(m(4));
                }
            }
        }
    }

    public final char m(int i10) throws ParseException, IOException {
        int i11;
        int i12 = 0;
        for (int i13 = 0; i13 < i10; i13++) {
            int i14 = i12 * 16;
            e();
            char c10 = this.f85191a;
            if (c10 <= '9' && c10 >= '0') {
                i11 = c10 - '0';
            } else if (c10 <= 'F' && c10 >= 'A') {
                i11 = c10 - '7';
            } else {
                if (c10 < 'a' || c10 > 'f') {
                    if (c10 == 26) {
                        throw new ParseException(this.f85197g, 3, "EOF");
                    }
                    throw new ParseException(this.f85197g, 4, Character.valueOf(this.f85191a));
                }
                i11 = c10 - 'W';
            }
            i12 = i11 + i14;
        }
        return (char) i12;
    }

    public final void n() throws IOException {
        while (true) {
            char c10 = this.f85191a;
            if (c10 < '0' || c10 > '9') {
                return;
            } else {
                j();
            }
        }
    }

    public final void o(boolean[] zArr) throws IOException {
        while (true) {
            char c10 = this.f85191a;
            if (c10 == 26) {
                return;
            }
            if (c10 >= 0 && c10 < '~' && zArr[c10]) {
                return;
            } else {
                j();
            }
        }
    }

    public final void p() throws IOException {
        while (true) {
            char c10 = this.f85191a;
            if (c10 > ' ' || c10 == 26) {
                return;
            } else {
                j();
            }
        }
    }

    public static class MSB {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public char[] f85207a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f85208b = -1;

        public MSB(int i10) {
            this.f85207a = new char[i10];
        }

        public void append(char c10) {
            int i10 = this.f85208b + 1;
            this.f85208b = i10;
            char[] cArr = this.f85207a;
            if (cArr.length <= i10) {
                char[] cArr2 = new char[(cArr.length * 2) + 1];
                System.arraycopy(cArr, 0, cArr2, 0, cArr.length);
                this.f85207a = cArr2;
            }
            this.f85207a[this.f85208b] = c10;
        }

        public void clear() {
            this.f85208b = -1;
        }

        public String toString() {
            return new String(this.f85207a, 0, this.f85208b + 1);
        }

        public void append(int i10) {
            int i11 = this.f85208b + 1;
            this.f85208b = i11;
            char[] cArr = this.f85207a;
            if (cArr.length <= i11) {
                char[] cArr2 = new char[(cArr.length * 2) + 1];
                System.arraycopy(cArr, 0, cArr2, 0, cArr.length);
                this.f85207a = cArr2;
            }
            this.f85207a[this.f85208b] = (char) i10;
        }
    }
}
