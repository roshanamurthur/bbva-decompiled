package bh;

import com.google.zxing.Dimension;
import com.google.zxing.datamatrix.encoder.SymbolInfo;
import com.google.zxing.datamatrix.encoder.SymbolShapeHint;
import java.nio.charset.StandardCharsets;

/* JADX INFO: compiled from: EncoderContext.java */
/* JADX INFO: loaded from: classes10.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SymbolShapeHint f25217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Dimension f25218c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Dimension f25219d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final StringBuilder f25220e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f25221f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f25222g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public SymbolInfo f25223h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f25224i;

    public d(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.ISO_8859_1);
        StringBuilder sb2 = new StringBuilder(bytes.length);
        int length = bytes.length;
        for (int i10 = 0; i10 < length; i10++) {
            char c10 = (char) (bytes[i10] & 255);
            if (c10 == '?' && str.charAt(i10) != '?') {
                throw new IllegalArgumentException("Message contains characters outside ISO-8859-1 encoding.");
            }
            sb2.append(c10);
        }
        this.f25216a = sb2.toString();
        this.f25217b = SymbolShapeHint.FORCE_NONE;
        this.f25220e = new StringBuilder(str.length());
        this.f25222g = -1;
    }

    public final char a() {
        return this.f25216a.charAt(this.f25221f);
    }

    public final boolean b() {
        return this.f25221f < this.f25216a.length() - this.f25224i;
    }

    public final void c(int i10) {
        SymbolInfo symbolInfo = this.f25223h;
        if (symbolInfo == null || i10 > symbolInfo.getDataCapacity()) {
            this.f25223h = SymbolInfo.lookup(i10, this.f25217b, this.f25218c, this.f25219d, true);
        }
    }

    public final void d(char c10) {
        this.f25220e.append(c10);
    }
}
