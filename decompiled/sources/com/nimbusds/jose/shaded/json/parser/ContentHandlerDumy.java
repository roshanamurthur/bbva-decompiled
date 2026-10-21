package com.nimbusds.jose.shaded.json.parser;

import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public class ContentHandlerDumy implements ContentHandler {
    public static ContentHandlerDumy HANDLER = new ContentHandlerDumy();

    @Override // com.nimbusds.jose.shaded.json.parser.ContentHandler
    public boolean endArray() throws ParseException {
        return false;
    }

    @Override // com.nimbusds.jose.shaded.json.parser.ContentHandler
    public boolean endObject() throws ParseException {
        return false;
    }

    @Override // com.nimbusds.jose.shaded.json.parser.ContentHandler
    public boolean endObjectEntry() throws ParseException {
        return false;
    }

    @Override // com.nimbusds.jose.shaded.json.parser.ContentHandler
    public boolean primitive(Object obj) throws ParseException {
        return false;
    }

    @Override // com.nimbusds.jose.shaded.json.parser.ContentHandler
    public boolean startArray() throws ParseException {
        return false;
    }

    @Override // com.nimbusds.jose.shaded.json.parser.ContentHandler
    public boolean startObject() throws ParseException, IOException {
        return false;
    }

    @Override // com.nimbusds.jose.shaded.json.parser.ContentHandler
    public boolean startObjectEntry(String str) throws ParseException {
        return false;
    }

    @Override // com.nimbusds.jose.shaded.json.parser.ContentHandler
    public void endJSON() throws ParseException {
    }

    @Override // com.nimbusds.jose.shaded.json.parser.ContentHandler
    public void startJSON() throws ParseException {
    }
}
