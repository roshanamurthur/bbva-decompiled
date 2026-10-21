package com.nimbusds.jose.shaded.json;

import java.io.IOException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes10.dex */
public class JSONStyle {
    public static final int FLAG_AGRESSIVE = 8;
    public static final int FLAG_IGNORE_NULL = 16;
    public static final int FLAG_PROTECT_4WEB = 2;
    public static final int FLAG_PROTECT_KEYS = 1;
    public static final int FLAG_PROTECT_VALUES = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f62758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f62759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f62760c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f62761d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final JStylerObj.MustProtect f62762e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final JStylerObj.MustProtect f62763f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final JStylerObj.StringProtector f62764g;
    public static final JSONStyle NO_COMPRESS = new JSONStyle();
    public static final JSONStyle MAX_COMPRESS = new JSONStyle(-1);
    public static final JSONStyle LT_COMPRESS = new JSONStyle(2);

    public JSONStyle(int i10) {
        boolean z10 = (i10 & 1) == 0;
        this.f62758a = z10;
        boolean z11 = (i10 & 4) == 0;
        this.f62760c = z11;
        boolean z12 = (i10 & 2) == 0;
        this.f62759b = z12;
        this.f62761d = (i10 & 16) > 0;
        JStylerObj.MustProtect mustProtect = (i10 & 8) > 0 ? JStylerObj.f62771c : JStylerObj.f62769a;
        JStylerObj.e eVar = JStylerObj.f62770b;
        if (z11) {
            this.f62763f = eVar;
        } else {
            this.f62763f = mustProtect;
        }
        if (z10) {
            this.f62762e = eVar;
        } else {
            this.f62762e = mustProtect;
        }
        if (z12) {
            this.f62764g = JStylerObj.f62773e;
        } else {
            this.f62764g = JStylerObj.f62772d;
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
        this.f62764g.escape(str, appendable);
    }

    public boolean ignoreNull() {
        return this.f62761d;
    }

    public boolean indent() {
        return false;
    }

    public boolean mustProtectKey(String str) {
        return this.f62762e.mustBeProtect(str);
    }

    public boolean mustProtectValue(String str) {
        return this.f62763f.mustBeProtect(str);
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
        return this.f62759b;
    }

    public boolean protectKeys() {
        return this.f62758a;
    }

    public boolean protectValues() {
        return this.f62760c;
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
