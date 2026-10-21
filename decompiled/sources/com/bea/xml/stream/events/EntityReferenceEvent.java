package com.bea.xml.stream.events;

import java.io.IOException;
import java.io.Writer;
import javax.xml.stream.events.EntityDeclaration;
import javax.xml.stream.events.EntityReference;

/* JADX INFO: loaded from: classes9.dex */
public class EntityReferenceEvent extends BaseEvent implements EntityReference {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f37878f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final EntityDeclaration f37879g;

    public EntityReferenceEvent() {
        init();
    }

    @Override // com.bea.xml.stream.events.BaseEvent
    public void doWriteAsEncodedUnicode(Writer writer) throws IOException {
        writer.write(38);
        writer.write(getName());
        writer.write(59);
    }

    public String getBaseURI() {
        return null;
    }

    @Override // javax.xml.stream.events.EntityReference
    public EntityDeclaration getDeclaration() {
        return this.f37879g;
    }

    @Override // javax.xml.stream.events.EntityReference
    public String getName() {
        return this.f37878f;
    }

    @Override // com.bea.xml.stream.events.BaseEvent, javax.xml.stream.Location
    public String getPublicId() {
        return null;
    }

    public String getReplacementText() {
        return this.f37879g.getReplacementText();
    }

    @Override // com.bea.xml.stream.events.BaseEvent, javax.xml.stream.Location
    public String getSystemId() {
        return null;
    }

    public void init() {
        setEventType(9);
    }

    public void setName(String str) {
        this.f37878f = str;
    }

    @Override // com.bea.xml.stream.events.BaseEvent
    public String toString() {
        String replacementText = getReplacementText();
        if (replacementText == null) {
            replacementText = "";
        }
        StringBuffer stringBuffer = new StringBuffer("&");
        stringBuffer.append(getName());
        stringBuffer.append(":='");
        stringBuffer.append(replacementText);
        stringBuffer.append("'");
        return stringBuffer.toString();
    }

    public EntityReferenceEvent(String str, EntityDeclaration entityDeclaration) {
        init();
        this.f37878f = str;
        this.f37879g = entityDeclaration;
    }

    public void setReplacementText(String str) {
    }
}
