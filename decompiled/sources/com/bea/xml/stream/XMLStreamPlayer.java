package com.bea.xml.stream;

import com.bea.xml.stream.util.NamespaceContextImpl;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import javax.xml.namespace.NamespaceContext;
import javax.xml.namespace.QName;
import javax.xml.stream.Location;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;
import javax.xml.stream.events.Attribute;

/* JADX INFO: loaded from: classes9.dex */
public class XMLStreamPlayer implements XMLStreamReader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public EventState f37851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EventScanner f37852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NamespaceContextImpl f37853c = new NamespaceContextImpl();

    public XMLStreamPlayer() {
    }

    public static void main(String[] strArr) throws Exception {
        XMLStreamPlayer xMLStreamPlayer = new XMLStreamPlayer(new FileReader(strArr[0]));
        XMLStreamWriter xMLStreamWriterCreateXMLStreamWriter = XMLOutputFactory.newInstance().createXMLStreamWriter(System.out);
        ReaderToWriter readerToWriter = new ReaderToWriter(xMLStreamWriterCreateXMLStreamWriter);
        while (xMLStreamPlayer.hasNext()) {
            readerToWriter.write(xMLStreamPlayer);
            xMLStreamPlayer.next();
        }
        xMLStreamWriterCreateXMLStreamWriter.flush();
    }

    public final Attribute a(int i10) {
        return (Attribute) this.f37851a.getAttributes().get(i10);
    }

    public boolean endDocumentIsPresent() {
        return this.f37852b.endDocumentIsPresent();
    }

    @Override // javax.xml.stream.XMLStreamReader
    public int getAttributeCount() {
        if (isStartElement()) {
            return this.f37851a.getAttributes().size();
        }
        return 0;
    }

    @Override // javax.xml.stream.XMLStreamReader
    public String getAttributeLocalName(int i10) {
        Attribute attributeA = a(i10);
        if (attributeA == null) {
            return null;
        }
        return attributeA.getName().getLocalPart();
    }

    @Override // javax.xml.stream.XMLStreamReader
    public QName getAttributeName(int i10) {
        return new QName(getAttributeNamespace(i10), getAttributeLocalName(i10), getAttributePrefix(i10));
    }

    @Override // javax.xml.stream.XMLStreamReader
    public String getAttributeNamespace(int i10) {
        Attribute attributeA = a(i10);
        if (attributeA == null) {
            return null;
        }
        return attributeA.getName().getNamespaceURI();
    }

    @Override // javax.xml.stream.XMLStreamReader
    public String getAttributePrefix(int i10) {
        Attribute attributeA = a(i10);
        if (attributeA == null) {
            return null;
        }
        return attributeA.getName().getPrefix();
    }

    @Override // javax.xml.stream.XMLStreamReader
    public String getAttributeType(int i10) {
        return "CDATA";
    }

    @Override // javax.xml.stream.XMLStreamReader
    public String getAttributeValue(String str, String str2) {
        for (int i10 = 0; i10 < getAttributeCount(); i10++) {
            Attribute attributeA = a(i10);
            if (str2.equals(attributeA.getName().getLocalPart())) {
                if (str == null) {
                    return attributeA.getValue();
                }
                if (str.equals(attributeA.getName().getNamespaceURI())) {
                    return attributeA.getValue();
                }
            }
        }
        return null;
    }

    @Override // javax.xml.stream.XMLStreamReader
    public String getCharacterEncodingScheme() {
        return null;
    }

    @Override // javax.xml.stream.XMLStreamReader
    public String getElementText() throws XMLStreamException {
        StringBuffer stringBuffer = new StringBuffer();
        if (getEventType() != 1) {
            throw new XMLStreamException("Precondition for readText is getEventType() == START_ELEMENT");
        }
        while (next() != 8) {
            if (isStartElement()) {
                throw new XMLStreamException("Unexpected Element start");
            }
            if (isCharacters()) {
                stringBuffer.append(getText());
            }
            if (isEndElement()) {
                return stringBuffer.toString();
            }
        }
        throw new XMLStreamException("Unexpected end of Document");
    }

    @Override // javax.xml.stream.XMLStreamReader
    public String getEncoding() {
        return this.f37851a.getData();
    }

    @Override // javax.xml.stream.XMLStreamReader
    public int getEventType() {
        EventState eventState = this.f37851a;
        if (eventState == null) {
            return 8;
        }
        return eventState.getType();
    }

    @Override // javax.xml.stream.XMLStreamReader
    public String getLocalName() {
        return this.f37851a.getLocalName();
    }

    @Override // javax.xml.stream.XMLStreamReader
    public Location getLocation() {
        return null;
    }

    @Override // javax.xml.stream.XMLStreamReader
    public QName getName() {
        return new QName(getNamespaceURI(), getLocalName(), getPrefix());
    }

    @Override // javax.xml.stream.XMLStreamReader
    public NamespaceContext getNamespaceContext() {
        return this.f37853c;
    }

    @Override // javax.xml.stream.XMLStreamReader
    public int getNamespaceCount() {
        if (isStartElement()) {
            return this.f37851a.getNamespaces().size();
        }
        return 0;
    }

    @Override // javax.xml.stream.XMLStreamReader
    public String getNamespacePrefix(int i10) {
        Attribute attribute = (Attribute) this.f37851a.getNamespaces().get(i10);
        if (attribute == null) {
            return null;
        }
        return attribute.getName().getLocalPart();
    }

    @Override // javax.xml.stream.XMLStreamReader
    public String getNamespaceURI(String str) {
        return this.f37853c.getNamespaceURI(str);
    }

    @Override // javax.xml.stream.XMLStreamReader
    public String getPIData() {
        return this.f37851a.getExtraData();
    }

    @Override // javax.xml.stream.XMLStreamReader
    public String getPITarget() {
        return this.f37851a.getData();
    }

    @Override // javax.xml.stream.XMLStreamReader
    public String getPrefix() {
        return this.f37851a.getPrefix();
    }

    @Override // javax.xml.stream.XMLStreamReader
    public Object getProperty(String str) throws IllegalArgumentException {
        return null;
    }

    @Override // javax.xml.stream.XMLStreamReader
    public String getText() {
        return this.f37851a.getData();
    }

    @Override // javax.xml.stream.XMLStreamReader
    public char[] getTextCharacters() {
        return this.f37851a.getData().toCharArray();
    }

    @Override // javax.xml.stream.XMLStreamReader
    public int getTextLength() {
        return this.f37851a.getData().length();
    }

    @Override // javax.xml.stream.XMLStreamReader
    public int getTextStart() {
        return 0;
    }

    public Reader getTextStream() {
        throw new UnsupportedOperationException();
    }

    @Override // javax.xml.stream.XMLStreamReader
    public String getVersion() {
        return "1.0";
    }

    @Override // javax.xml.stream.XMLStreamReader
    public boolean hasName() {
        return (getEventType() & 11) != 0;
    }

    @Override // javax.xml.stream.XMLStreamReader
    public boolean hasNext() throws XMLStreamException {
        try {
            EventState eventState = this.f37851a;
            return (eventState == null || eventState.getType() == 8) ? false : true;
        } catch (Exception e5) {
            throw new XMLStreamException(e5);
        }
    }

    @Override // javax.xml.stream.XMLStreamReader
    public boolean hasText() {
        return (getEventType() & 15) != 0;
    }

    @Override // javax.xml.stream.XMLStreamReader
    public boolean isAttributeSpecified(int i10) {
        return false;
    }

    @Override // javax.xml.stream.XMLStreamReader
    public boolean isCharacters() {
        return (getEventType() & 4) != 0;
    }

    @Override // javax.xml.stream.XMLStreamReader
    public boolean isEndElement() {
        return (getEventType() & 2) != 0;
    }

    @Override // javax.xml.stream.XMLStreamReader
    public boolean isStandalone() {
        return true;
    }

    @Override // javax.xml.stream.XMLStreamReader
    public boolean isStartElement() {
        return (getEventType() & 1) != 0;
    }

    @Override // javax.xml.stream.XMLStreamReader
    public boolean isWhiteSpace() {
        return false;
    }

    @Override // javax.xml.stream.XMLStreamReader
    public int next() throws XMLStreamException {
        EventScanner eventScanner = this.f37852b;
        try {
            if (!eventScanner.hasNext()) {
                this.f37851a = null;
                return -1;
            }
            this.f37851a = eventScanner.readElement();
            boolean zIsStartElement = isStartElement();
            NamespaceContextImpl namespaceContextImpl = this.f37853c;
            if (zIsStartElement) {
                namespaceContextImpl.openScope();
                for (int i10 = 0; i10 < getNamespaceCount(); i10++) {
                    namespaceContextImpl.bindNamespace(getNamespacePrefix(i10), getNamespaceURI(i10));
                }
            } else if (isEndElement() && namespaceContextImpl.getDepth() > 0) {
                namespaceContextImpl.closeScope();
            }
            return this.f37851a.getType();
        } catch (Exception e5) {
            System.out.println(e5);
            e5.printStackTrace();
            throw new XMLStreamException(e5.getMessage(), e5);
        }
    }

    @Override // javax.xml.stream.XMLStreamReader
    public int nextTag() throws XMLStreamException {
        while (next() != 8) {
            if (isCharacters() && !isWhiteSpace()) {
                throw new XMLStreamException("Unexpected text");
            }
            if (isStartElement() || isEndElement()) {
                return getEventType();
            }
        }
        throw new XMLStreamException("Unexpected end of Document");
    }

    @Override // javax.xml.stream.XMLStreamReader
    public boolean standaloneSet() {
        return false;
    }

    public XMLStreamReader subReader() throws XMLStreamException {
        return null;
    }

    @Override // javax.xml.stream.XMLStreamReader
    public String getNamespaceURI(int i10) {
        Attribute attribute = (Attribute) this.f37851a.getNamespaces().get(i10);
        if (attribute == null) {
            return null;
        }
        return attribute.getValue();
    }

    @Override // javax.xml.stream.XMLStreamReader
    public int getTextCharacters(int i10, char[] cArr, int i11, int i12) throws XMLStreamException {
        throw new UnsupportedOperationException();
    }

    public XMLStreamPlayer(InputStream inputStream) {
        try {
            this.f37852b = new EventScanner(new InputStreamReader(inputStream));
            next();
            if (getEventType() == 7) {
                this.f37852b = new EventScanner(new InputStreamReader(inputStream, getCharacterEncodingScheme()));
            }
        } catch (Exception e5) {
            StringBuffer stringBuffer = new StringBuffer("Unable to instantiate the XMLStreamPlayer");
            stringBuffer.append(e5.getMessage());
            throw new IllegalArgumentException(stringBuffer.toString());
        }
    }

    @Override // javax.xml.stream.XMLStreamReader
    public String getNamespaceURI() {
        return this.f37851a.getNamespaceURI();
    }

    @Override // javax.xml.stream.XMLStreamReader
    public String getAttributeValue(int i10) {
        Attribute attributeA = a(i10);
        if (attributeA == null) {
            return null;
        }
        return attributeA.getValue();
    }

    public XMLStreamPlayer(Reader reader) {
        try {
            this.f37852b = new EventScanner(reader);
            next();
        } catch (Exception e5) {
            System.out.println(e5);
        }
    }

    @Override // javax.xml.stream.XMLStreamReader
    public void close() throws XMLStreamException {
    }

    @Override // javax.xml.stream.XMLStreamReader
    public void require(int i10, String str, String str2) throws XMLStreamException {
    }
}
