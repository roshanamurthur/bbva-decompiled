package com.bea.xml.stream.events;

import com.bea.xml.stream.util.ElementTypeNames;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import javax.xml.namespace.QName;
import javax.xml.stream.Location;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes9.dex */
public abstract class BaseEvent implements XMLEvent, Location {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f37865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f37866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f37867c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f37868d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f37869e;

    public BaseEvent() {
        this.f37865a = -1;
        this.f37866b = -1;
        this.f37867c = -1;
        this.f37868d = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.xml.stream.events.XMLEvent
    public Characters asCharacters() {
        return (Characters) this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.xml.stream.events.XMLEvent
    public EndElement asEndElement() {
        return (EndElement) this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.xml.stream.events.XMLEvent
    public StartElement asStartElement() {
        return (StartElement) this;
    }

    public abstract void doWriteAsEncodedUnicode(Writer writer) throws XMLStreamException, IOException;

    @Override // javax.xml.stream.Location
    public int getCharacterOffset() {
        return this.f37868d;
    }

    @Override // javax.xml.stream.Location
    public int getColumnNumber() {
        return this.f37867c;
    }

    @Override // javax.xml.stream.events.XMLEvent
    public int getEventType() {
        return this.f37865a;
    }

    @Override // javax.xml.stream.Location
    public int getLineNumber() {
        return this.f37866b;
    }

    public String getLocationURI() {
        return this.f37869e;
    }

    @Override // javax.xml.stream.Location
    public String getPublicId() {
        return null;
    }

    @Override // javax.xml.stream.events.XMLEvent
    public QName getSchemaType() {
        return null;
    }

    public String getSourceName() {
        return null;
    }

    @Override // javax.xml.stream.Location
    public String getSystemId() {
        return null;
    }

    public String getTypeAsString() {
        return ElementTypeNames.getEventTypeString(this.f37865a);
    }

    @Override // javax.xml.stream.events.XMLEvent
    public boolean isAttribute() {
        return this.f37865a == 10;
    }

    @Override // javax.xml.stream.events.XMLEvent
    public boolean isCharacters() {
        return this.f37865a == 4;
    }

    @Override // javax.xml.stream.events.XMLEvent
    public boolean isEndDocument() {
        return this.f37865a == 8;
    }

    @Override // javax.xml.stream.events.XMLEvent
    public boolean isEndElement() {
        return this.f37865a == 2;
    }

    @Override // javax.xml.stream.events.XMLEvent
    public boolean isEntityReference() {
        return this.f37865a == 9;
    }

    @Override // javax.xml.stream.events.XMLEvent
    public boolean isNamespace() {
        return this.f37865a == 13;
    }

    @Override // javax.xml.stream.events.XMLEvent
    public boolean isProcessingInstruction() {
        return this.f37865a == 3;
    }

    @Override // javax.xml.stream.events.XMLEvent
    public boolean isStartDocument() {
        return this.f37865a == 7;
    }

    @Override // javax.xml.stream.events.XMLEvent
    public boolean isStartElement() {
        return this.f37865a == 1;
    }

    public void setCharacterOffset(int i10) {
        this.f37868d = i10;
    }

    public void setColumnNumber(int i10) {
        this.f37867c = i10;
    }

    public void setEventType(int i10) {
        this.f37865a = i10;
    }

    public void setLineNumber(int i10) {
        this.f37866b = i10;
    }

    public void setLocationURI(String str) {
        this.f37869e = str;
    }

    public String toString() {
        StringWriter stringWriter = new StringWriter(64);
        try {
            writeAsEncodedUnicode(stringWriter);
        } catch (XMLStreamException e5) {
            stringWriter.write("[ERROR: ");
            stringWriter.write(e5.toString());
            stringWriter.write(Constant.BRACKET_CLOSE);
        }
        return stringWriter.toString();
    }

    @Override // javax.xml.stream.events.XMLEvent
    public final void writeAsEncodedUnicode(Writer writer) throws XMLStreamException {
        try {
            doWriteAsEncodedUnicode(writer);
        } catch (IOException e5) {
            throw new XMLStreamException(e5);
        }
    }

    public BaseEvent(int i10) {
        this.f37866b = -1;
        this.f37867c = -1;
        this.f37868d = 0;
        this.f37865a = i10;
    }

    @Override // javax.xml.stream.events.XMLEvent
    public Location getLocation() {
        return this;
    }

    public void recycle() {
    }
}
