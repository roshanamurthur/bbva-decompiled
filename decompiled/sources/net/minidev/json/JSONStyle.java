package net.minidev.json;

import java.io.IOException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes12.dex */
public class JSONStyle {
    public static final int FLAG_AGRESSIVE = 8;
    public static final int FLAG_IGNORE_NULL = 16;
    public static final int FLAG_PROTECT_4WEB = 2;
    public static final int FLAG_PROTECT_KEYS = 1;
    public static final int FLAG_PROTECT_VALUES = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f85161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f85162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f85163c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f85164d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final JStylerObj.MustProtect f85165e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final JStylerObj.MustProtect f85166f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final JStylerObj.StringProtector f85167g;
    public static final JSONStyle NO_COMPRESS = new JSONStyle();
    public static final JSONStyle MAX_COMPRESS = new JSONStyle(-1);
    public static final JSONStyle LT_COMPRESS = new JSONStyle(2);

    public JSONStyle(int i10) {
        boolean z10 = (i10 & 1) == 0;
        this.f85161a = z10;
        boolean z11 = (i10 & 4) == 0;
        this.f85163c = z11;
        boolean z12 = (i10 & 2) == 0;
        this.f85162b = z12;
        this.f85164d = (i10 & 16) > 0;
        JStylerObj.MustProtect mustProtect = (i10 & 8) > 0 ? JStylerObj.f85174c : JStylerObj.f85172a;
        JStylerObj.e eVar = JStylerObj.f85173b;
        if (z11) {
            this.f85166f = eVar;
        } else {
            this.f85166f = mustProtect;
        }
        if (z10) {
            this.f85165e = eVar;
        } else {
            this.f85165e = mustProtect;
        }
        if (z12) {
            this.f85167g = JStylerObj.f85176e;
        } else {
            this.f85167g = JStylerObj.f85175d;
        }
    }

    public void arrayNextElm(Appendable appendable) throws IOException {
        appendable.append(AbstractJsonLexerKt.COMMA);
    }

    public void arrayStart(Appendable appendable) throws IOException {
        appendable.append(AbstractJsonLexerKt.BEGIN_LIST);
    }

    public void arrayStop(Appendable appendable) throws IOException {
        appendable.append(AbstractJsonLexerKt.END_LIST);
    }

    public void escape(String str, Appendable appendable) {
        this.f85167g.escape(str, appendable);
    }

    public boolean ignoreNull() {
        return this.f85164d;
    }

    public boolean indent() {
        return false;
    }

    public boolean mustProtectKey(String str) {
        return this.f85165e.mustBeProtect(str);
    }

    public boolean mustProtectValue(String str) {
        return this.f85166f.mustBeProtect(str);
    }

    public void objectEndOfKey(Appendable appendable) throws IOException {
        appendable.append(AbstractJsonLexerKt.COLON);
    }

    public void objectNext(Appendable appendable) throws IOException {
        appendable.append(AbstractJsonLexerKt.COMMA);
    }

    public void objectStart(Appendable appendable) throws IOException {
        appendable.append(AbstractJsonLexerKt.BEGIN_OBJ);
    }

    public void objectStop(Appendable appendable) throws IOException {
        appendable.append(AbstractJsonLexerKt.END_OBJ);
    }

    public boolean protect4Web() {
        return this.f85162b;
    }

    public boolean protectKeys() {
        return this.f85161a;
    }

    public boolean protectValues() {
        return this.f85163c;
    }

    public void writeString(Appendable appendable, String str) throws IOException {
        if (!mustProtectValue(str)) {
            appendable.append(str);
            return;
        }
        appendable.append('\"');
        JSONValue.escape(str, appendable, this);
        appendable.append('\"');
    }

    public JSONStyle() {
        this(0);
    }

    public void arrayObjectEnd(Appendable appendable) throws IOException {
    }

    public void arrayfirstObject(Appendable appendable) throws IOException {
    }

    public void objectElmStop(Appendable appendable) throws IOException {
    }

    public void objectFirstStart(Appendable appendable) throws IOException {
    }
}
