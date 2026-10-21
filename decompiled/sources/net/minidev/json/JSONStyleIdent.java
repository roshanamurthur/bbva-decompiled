package net.minidev.json;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import java.io.IOException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes12.dex */
public class JSONStyleIdent extends JSONStyle {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final char f85168h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f85169i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f85170j;

    public JSONStyleIdent(int i10) {
        super(i10);
        this.f85168h = ' ';
        this.f85169i = RootService.LINE_BREAK;
        this.f85170j = 0;
    }

    public final void a(Appendable appendable) throws IOException {
        appendable.append(this.f85169i);
        for (int i10 = 0; i10 < this.f85170j; i10++) {
            appendable.append(this.f85168h);
        }
    }

    @Override // net.minidev.json.JSONStyle
    public void arrayNextElm(Appendable appendable) throws IOException {
        appendable.append(AbstractJsonLexerKt.COMMA);
        a(appendable);
    }

    @Override // net.minidev.json.JSONStyle
    public void arrayStart(Appendable appendable) throws IOException {
        appendable.append(AbstractJsonLexerKt.BEGIN_LIST);
        this.f85170j++;
        a(appendable);
    }

    @Override // net.minidev.json.JSONStyle
    public void arrayStop(Appendable appendable) throws IOException {
        this.f85170j--;
        a(appendable);
        appendable.append(AbstractJsonLexerKt.END_LIST);
    }

    @Override // net.minidev.json.JSONStyle
    public void objectEndOfKey(Appendable appendable) throws IOException {
        appendable.append(AbstractJsonLexerKt.COLON);
    }

    @Override // net.minidev.json.JSONStyle
    public void objectNext(Appendable appendable) throws IOException {
        appendable.append(AbstractJsonLexerKt.COMMA);
        a(appendable);
    }

    @Override // net.minidev.json.JSONStyle
    public void objectStart(Appendable appendable) throws IOException {
        appendable.append(AbstractJsonLexerKt.BEGIN_OBJ);
        this.f85170j++;
        a(appendable);
    }

    @Override // net.minidev.json.JSONStyle
    public void objectStop(Appendable appendable) throws IOException {
        this.f85170j--;
        a(appendable);
        appendable.append(AbstractJsonLexerKt.END_OBJ);
    }

    public JSONStyleIdent() {
        this.f85168h = ' ';
        this.f85169i = RootService.LINE_BREAK;
        this.f85170j = 0;
    }

    @Override // net.minidev.json.JSONStyle
    public void arrayObjectEnd(Appendable appendable) throws IOException {
    }

    @Override // net.minidev.json.JSONStyle
    public void arrayfirstObject(Appendable appendable) throws IOException {
    }

    @Override // net.minidev.json.JSONStyle
    public void objectElmStop(Appendable appendable) throws IOException {
    }

    @Override // net.minidev.json.JSONStyle
    public void objectFirstStart(Appendable appendable) throws IOException {
    }
}
