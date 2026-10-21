package com.facetec.sdk;

import com.bbva.glomohybrid.base.deeplink.extensions.DeepLinkExtensionsKt;
import com.bbva.network.constant.ConstantsKt;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes9.dex */
public class ga implements Closeable, Flushable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f41744c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String[] f41745d = new String[128];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Writer f41747b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f41749f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f41750g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f41751h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f41752i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f41753j;
    private boolean m;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int[] f41748e = new int[32];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f41746a = 0;

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            f41745d[i10] = String.format("\\u%04x", Integer.valueOf(i10));
        }
        String[] strArr = f41745d;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f41744c = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public ga(Writer writer) {
        d(6);
        this.f41753j = DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER;
        this.m = true;
        if (writer == null) {
            throw new NullPointerException("out == null");
        }
        this.f41747b = writer;
    }

    private void i() throws IOException {
        if (this.f41750g != null) {
            l();
            d(this.f41750g);
            this.f41750g = null;
        }
    }

    private void k() throws IOException {
        if (this.f41749f == null) {
            return;
        }
        this.f41747b.write(10);
        int i10 = this.f41746a;
        for (int i11 = 1; i11 < i10; i11++) {
            this.f41747b.write(this.f41749f);
        }
    }

    private void l() throws IOException {
        int iE = e();
        if (iE == 5) {
            this.f41747b.write(44);
        } else if (iE != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        k();
        c(4);
    }

    private void m() throws IOException {
        int iE = e();
        if (iE == 1) {
            c(2);
            k();
            return;
        }
        if (iE == 2) {
            this.f41747b.append(AbstractJsonLexerKt.COMMA);
            k();
        } else {
            if (iE == 4) {
                this.f41747b.append((CharSequence) this.f41753j);
                c(5);
                return;
            }
            if (iE != 6) {
                if (iE != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (!this.f41752i) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            c(7);
        }
    }

    public ga a() throws IOException {
        i();
        return c(3, AbstractJsonLexerKt.BEGIN_OBJ);
    }

    public final void b(String str) {
        if (str.length() == 0) {
            this.f41749f = null;
            this.f41753j = DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER;
        } else {
            this.f41749f = str;
            this.f41753j = ": ";
        }
    }

    public final void c(boolean z10) {
        this.f41752i = z10;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f41747b.close();
        int i10 = this.f41746a;
        if (i10 > 1 || (i10 == 1 && this.f41748e[i10 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f41746a = 0;
    }

    public final void d(boolean z10) {
        this.m = z10;
    }

    public final void e(boolean z10) {
        this.f41751h = z10;
    }

    public final boolean f() {
        return this.f41751h;
    }

    public void flush() throws IOException {
        if (this.f41746a == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f41747b.flush();
    }

    public ga g() throws IOException {
        if (this.f41750g != null) {
            if (!this.m) {
                this.f41750g = null;
                return this;
            }
            i();
        }
        m();
        this.f41747b.write(AbstractJsonLexerKt.NULL);
        return this;
    }

    public final boolean h() {
        return this.f41752i;
    }

    public final boolean j() {
        return this.m;
    }

    private int e() {
        int i10 = this.f41746a;
        if (i10 != 0) {
            return this.f41748e[i10 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public ga c() throws IOException {
        i();
        return c(1, AbstractJsonLexerKt.BEGIN_LIST);
    }

    public ga d() throws IOException {
        return c(1, 2, AbstractJsonLexerKt.END_LIST);
    }

    private void d(int i10) {
        int i11 = this.f41746a;
        int[] iArr = this.f41748e;
        if (i11 == iArr.length) {
            this.f41748e = Arrays.copyOf(iArr, i11 << 1);
        }
        int[] iArr2 = this.f41748e;
        int i12 = this.f41746a;
        this.f41746a = i12 + 1;
        iArr2[i12] = i10;
    }

    public ga a(boolean z10) throws IOException {
        i();
        m();
        this.f41747b.write(z10 ? "true" : "false");
        return this;
    }

    private ga c(int i10, char c10) throws IOException {
        m();
        d(i10);
        this.f41747b.write(c10);
        return this;
    }

    public ga e(String str) throws IOException {
        if (str == null) {
            return g();
        }
        i();
        m();
        d(str);
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0034  */
    private void d(String str) throws IOException {
        String str2;
        String[] strArr = this.f41751h ? f41744c : f41745d;
        this.f41747b.write(34);
        int length = str.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = str.charAt(i11);
            if (cCharAt < 128) {
                str2 = strArr[cCharAt];
                if (str2 != null) {
                    if (i10 < i11) {
                        this.f41747b.write(str, i10, i11 - i10);
                    }
                    this.f41747b.write(str2);
                    i10 = i11 + 1;
                }
            } else {
                if (cCharAt == 8232) {
                    str2 = "\\u2028";
                } else if (cCharAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i10 < i11) {
                    this.f41747b.write(str, i10, i11 - i10);
                }
                this.f41747b.write(str2);
                i10 = i11 + 1;
            }
        }
        if (i10 < length) {
            this.f41747b.write(str, i10, length - i10);
        }
        this.f41747b.write(34);
    }

    public ga a(Number number) throws IOException {
        if (number == null) {
            return g();
        }
        i();
        String string = number.toString();
        if (!this.f41752i && (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN"))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(String.valueOf(number)));
        }
        m();
        this.f41747b.append((CharSequence) string);
        return this;
    }

    public ga b() throws IOException {
        return c(3, 5, AbstractJsonLexerKt.END_OBJ);
    }

    private ga c(int i10, int i11, char c10) throws IOException {
        int iE = e();
        if (iE != i11 && iE != i10) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f41750g == null) {
            this.f41746a--;
            if (iE == i11) {
                k();
            }
            this.f41747b.write(c10);
            return this;
        }
        StringBuilder sb2 = new StringBuilder("Dangling name: ");
        sb2.append(this.f41750g);
        throw new IllegalStateException(sb2.toString());
    }

    public ga b(Boolean bool) throws IOException {
        if (bool == null) {
            return g();
        }
        i();
        m();
        this.f41747b.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    public ga b(long j10) throws IOException {
        i();
        m();
        this.f41747b.write(Long.toString(j10));
        return this;
    }

    private void c(int i10) {
        this.f41748e[this.f41746a - 1] = i10;
    }

    public ga c(String str) throws IOException {
        if (str != null) {
            if (this.f41750g == null) {
                if (this.f41746a != 0) {
                    this.f41750g = str;
                    return this;
                }
                throw new IllegalStateException("JsonWriter is closed.");
            }
            throw new IllegalStateException();
        }
        throw new NullPointerException(ConstantsKt.NAME_NULL);
    }
}
