package com.bea.xml.stream.events;

import java.io.IOException;
import java.io.Writer;
import javax.xml.stream.events.EntityDeclaration;

/* JADX INFO: loaded from: classes9.dex */
public class EntityDeclarationEvent extends BaseEvent implements EntityDeclaration {
    protected final String name;
    protected final String replacementText;

    public EntityDeclarationEvent(String str, String str2) {
        super(15);
        this.name = str;
        this.replacementText = str2;
    }

    @Override // com.bea.xml.stream.events.BaseEvent
    public void doWriteAsEncodedUnicode(Writer writer) throws IOException {
        writer.write("<!ENTITY ");
        writer.write(getName());
        writer.write(34);
        writer.write(getReplacementText());
        writer.write("\">");
    }

    @Override // javax.xml.stream.events.EntityDeclaration
    public String getBaseURI() {
        return null;
    }

    @Override // javax.xml.stream.events.EntityDeclaration
    public String getName() {
        return this.name;
    }

    @Override // javax.xml.stream.events.EntityDeclaration
    public String getNotationName() {
        return null;
    }

    @Override // com.bea.xml.stream.events.BaseEvent, javax.xml.stream.Location
    public String getPublicId() {
        return null;
    }

    @Override // javax.xml.stream.events.EntityDeclaration
    public String getReplacementText() {
        return this.replacementText;
    }

    @Override // com.bea.xml.stream.events.BaseEvent, javax.xml.stream.Location
    public String getSystemId() {
        return null;
    }
}
