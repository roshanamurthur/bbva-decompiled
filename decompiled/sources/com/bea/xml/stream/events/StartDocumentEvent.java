package com.bea.xml.stream.events;

import java.io.IOException;
import java.io.Writer;
import javax.xml.stream.events.StartDocument;

/* JADX INFO: loaded from: classes9.dex */
public class StartDocumentEvent extends BaseEvent implements StartDocument {
    protected String systemId = "";
    protected String publicId = "";
    protected String encodingScheme = "UTF-8";
    protected boolean standalone = false;
    protected String version = "1.0";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f37883f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f37884g = false;

    public StartDocumentEvent() {
        init();
    }

    public void clear() {
        this.encodingScheme = "UTF-8";
        this.standalone = true;
        this.version = "1.0";
        this.f37883f = false;
        this.f37884g = false;
    }

    @Override // com.bea.xml.stream.events.BaseEvent
    public void doWriteAsEncodedUnicode(Writer writer) throws IOException {
        writer.write("<?xml version=\"");
        writer.write(this.version);
        writer.write("\" encoding='");
        writer.write(this.encodingScheme);
        writer.write(39);
        if (this.f37884g) {
            writer.write(" standalone='");
            writer.write(this.standalone ? "yes'" : "no'");
        }
        writer.write("?>");
    }

    @Override // javax.xml.stream.events.StartDocument
    public boolean encodingSet() {
        return this.f37883f;
    }

    @Override // javax.xml.stream.events.StartDocument
    public String getCharacterEncodingScheme() {
        return this.encodingScheme;
    }

    @Override // com.bea.xml.stream.events.BaseEvent, javax.xml.stream.Location
    public String getSystemId() {
        return this.systemId;
    }

    @Override // javax.xml.stream.events.StartDocument
    public String getVersion() {
        return this.version;
    }

    public void init() {
        setEventType(7);
    }

    @Override // javax.xml.stream.events.StartDocument
    public boolean isStandalone() {
        return this.standalone;
    }

    public void setEncoding(String str) {
        this.encodingScheme = str;
        this.f37883f = true;
    }

    public void setStandalone(boolean z10) {
        this.f37884g = true;
        this.standalone = z10;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    @Override // javax.xml.stream.events.StartDocument
    public boolean standaloneSet() {
        return this.f37884g;
    }

    public void setStandalone(String str) {
        this.f37884g = true;
        if (str == null) {
            this.standalone = true;
        } else if (str.equals("yes")) {
            this.standalone = true;
        } else {
            this.standalone = false;
        }
    }
}
