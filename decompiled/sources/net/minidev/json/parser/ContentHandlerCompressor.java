package net.minidev.json.parser;

import java.io.IOException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import net.minidev.json.JSONStyle;
import net.minidev.json.JSONValue;

/* JADX INFO: loaded from: classes12.dex */
public class ContentHandlerCompressor implements ContentHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Appendable f85177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JSONStyle f85178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f85179c = new int[10];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f85180d;

    public ContentHandlerCompressor(Appendable appendable, JSONStyle jSONStyle) {
        this.f85177a = appendable;
        this.f85178b = jSONStyle;
    }

    public final void a(int i10) {
        int i11 = this.f85180d + 2;
        this.f85180d = i11;
        int[] iArr = this.f85179c;
        if (i11 >= iArr.length) {
            int[] iArr2 = new int[iArr.length * 2];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.f85179c = iArr2;
        }
        int[] iArr3 = this.f85179c;
        int i12 = this.f85180d;
        iArr3[i12] = i10;
        iArr3[i12 + 1] = 0;
    }

    @Override // net.minidev.json.parser.ContentHandler
    public boolean endArray() throws ParseException, IOException {
        this.f85177a.append(AbstractJsonLexerKt.END_LIST);
        this.f85180d -= 2;
        return false;
    }

    @Override // net.minidev.json.parser.ContentHandler
    public boolean endObject() throws ParseException, IOException {
        this.f85177a.append(AbstractJsonLexerKt.END_OBJ);
        this.f85180d -= 2;
        return false;
    }

    @Override // net.minidev.json.parser.ContentHandler
    public boolean endObjectEntry() throws ParseException, IOException {
        return false;
    }

    @Override // net.minidev.json.parser.ContentHandler
    public boolean primitive(Object obj) throws ParseException, IOException {
        int[] iArr = this.f85179c;
        int i10 = this.f85180d;
        int i11 = iArr[i10];
        Appendable appendable = this.f85177a;
        if (i11 != 0) {
            int i12 = i10 + 1;
            int i13 = iArr[i12];
            iArr[i12] = i13 + 1;
            if (i13 > 0) {
                appendable.append(AbstractJsonLexerKt.COMMA);
            }
        }
        boolean z10 = obj instanceof String;
        JSONStyle jSONStyle = this.f85178b;
        if (z10) {
            jSONStyle.writeString(appendable, (String) obj);
            return false;
        }
        JSONValue.writeJSONString(obj, appendable, jSONStyle);
        return false;
    }

    @Override // net.minidev.json.parser.ContentHandler
    public boolean startArray() throws ParseException, IOException {
        int[] iArr = this.f85179c;
        int i10 = this.f85180d;
        boolean z10 = iArr[i10] == 1;
        Appendable appendable = this.f85177a;
        if (z10) {
            int i11 = i10 + 1;
            int i12 = iArr[i11];
            iArr[i11] = i12 + 1;
            if (i12 > 0) {
                appendable.append(AbstractJsonLexerKt.COMMA);
            }
        }
        appendable.append(AbstractJsonLexerKt.BEGIN_LIST);
        a(1);
        return false;
    }

    @Override // net.minidev.json.parser.ContentHandler
    public boolean startObject() throws ParseException, IOException {
        int[] iArr = this.f85179c;
        int i10 = this.f85180d;
        boolean z10 = iArr[i10] == 1;
        Appendable appendable = this.f85177a;
        if (z10) {
            int i11 = i10 + 1;
            int i12 = iArr[i11];
            iArr[i11] = i12 + 1;
            if (i12 > 0) {
                appendable.append(AbstractJsonLexerKt.COMMA);
            }
        }
        appendable.append(AbstractJsonLexerKt.BEGIN_OBJ);
        a(0);
        return false;
    }

    @Override // net.minidev.json.parser.ContentHandler
    public boolean startObjectEntry(String str) throws ParseException, IOException {
        int[] iArr = this.f85179c;
        int i10 = this.f85180d + 1;
        int i11 = iArr[i10];
        iArr[i10] = i11 + 1;
        Appendable appendable = this.f85177a;
        if (i11 > 0) {
            appendable.append(AbstractJsonLexerKt.COMMA);
        }
        if (str == null) {
            appendable.append(AbstractJsonLexerKt.NULL);
        } else {
            JSONStyle jSONStyle = this.f85178b;
            if (jSONStyle.mustProtectKey(str)) {
                appendable.append('\"');
                JSONValue.escape(str, appendable, jSONStyle);
                appendable.append('\"');
            } else {
                appendable.append(str);
            }
        }
        appendable.append(AbstractJsonLexerKt.COLON);
        return false;
    }

    @Override // net.minidev.json.parser.ContentHandler
    public void endJSON() throws ParseException, IOException {
    }

    @Override // net.minidev.json.parser.ContentHandler
    public void startJSON() throws ParseException, IOException {
    }
}
