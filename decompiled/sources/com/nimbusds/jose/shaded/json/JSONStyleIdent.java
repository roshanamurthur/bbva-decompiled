package com.nimbusds.jose.shaded.json;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import java.io.IOException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes10.dex */
public class JSONStyleIdent extends JSONStyle {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final char f62765h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f62766i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f62767j;

    public JSONStyleIdent(int i10) {
        super(i10);
        this.f62765h = ' ';
        this.f62766i = RootService.LINE_BREAK;
        this.f62767j = 0;
    }

    public final void a(Appendable appendable) throws IOException {
        appendable.append(this.f62766i);
        for (int i10 = 0; i10 < this.f62767j; i10++) {
            appendable.append(this.f62765h);
        }
    }

    @Override // com.nimbusds.jose.shaded.json.JSONStyle
    public void arrayNextElm(Appendable appendable) throws IOException {
        appendable.append(AbstractJsonLexerKt.COMMA);
        a(appendable);
    }

    @Override // com.nimbusds.jose.shaded.json.JSONStyle
    public void arrayStart(Appendable appendable) throws IOException {
        appendable.append(AbstractJsonLexerKt.BEGIN_LIST);
        this.f62767j++;
        a(appendable);
    }

    @Override // com.nimbusds.jose.shaded.json.JSONStyle
    public void arrayStop(Appendable appendable) throws IOException {
        this.f62767j--;
        a(appendable);
        appendable.append(AbstractJsonLexerKt.END_LIST);
    }

    @Override // com.nimbusds.jose.shaded.json.JSONStyle
    public void objectEndOfKey(Appendable appendable) throws IOException {
        appendable.append(AbstractJsonLexerKt.COLON);
    }

    @Override // com.nimbusds.jose.shaded.json.JSONStyle
    public void objectNext(Appendable appendable) throws IOException {
        appendable.append(AbstractJsonLexerKt.COMMA);
        a(appendable);
    }

    @Override // com.nimbusds.jose.shaded.json.JSONStyle
    public void objectStart(Appendable appendable) throws IOException {
        appendable.append(AbstractJsonLexerKt.BEGIN_OBJ);
        this.f62767j++;
        a(appendable);
    }

    @Override // com.nimbusds.jose.shaded.json.JSONStyle
    public void objectStop(Appendable appendable) throws IOException {
        this.f62767j--;
        a(appendable);
        appendable.append(AbstractJsonLexerKt.END_OBJ);
    }

    public JSONStyleIdent() {
        this.f62765h = ' ';
        this.f62766i = RootService.LINE_BREAK;
        this.f62767j = 0;
    }

    @Override // com.nimbusds.jose.shaded.json.JSONStyle
    public void arrayObjectEnd(Appendable appendable) throws IOException {
    }

    @Override // com.nimbusds.jose.shaded.json.JSONStyle
    public void arrayfirstObject(Appendable appendable) throws IOException {
    }

    @Override // com.nimbusds.jose.shaded.json.JSONStyle
    public void objectElmStop(Appendable appendable) throws IOException {
    }

    @Override // com.nimbusds.jose.shaded.json.JSONStyle
    public void objectFirstStart(Appendable appendable) throws IOException {
    }
}
