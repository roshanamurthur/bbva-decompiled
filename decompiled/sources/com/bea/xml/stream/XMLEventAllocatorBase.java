package com.bea.xml.stream;

import com.bea.xml.stream.events.DTDEvent;
import com.bea.xml.stream.events.EntityDeclarationEvent;
import com.bea.xml.stream.util.ElementTypeNames;
import com.bea.xml.stream.util.EmptyIterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.Comment;
import javax.xml.stream.events.DTD;
import javax.xml.stream.events.EndDocument;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.EntityReference;
import javax.xml.stream.events.ProcessingInstruction;
import javax.xml.stream.events.StartDocument;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import javax.xml.stream.util.XMLEventAllocator;
import javax.xml.stream.util.XMLEventConsumer;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes9.dex */
public class XMLEventAllocatorBase implements XMLEventAllocator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final XMLEventFactory f37843a = XMLEventFactory.newInstance();

    public static Iterator getAttributes(XMLStreamReader xMLStreamReader) {
        if (xMLStreamReader.getAttributeCount() == 0) {
            return EmptyIterator.emptyIterator;
        }
        int attributeCount = xMLStreamReader.getAttributeCount();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            arrayList.add(new AttributeBase(xMLStreamReader.getAttributePrefix(i10), xMLStreamReader.getAttributeNamespace(i10), xMLStreamReader.getAttributeLocalName(i10), xMLStreamReader.getAttributeValue(i10), xMLStreamReader.getAttributeType(i10)));
        }
        return arrayList.iterator();
    }

    public static Iterator getNamespaces(XMLStreamReader xMLStreamReader) {
        if (xMLStreamReader.getNamespaceCount() == 0) {
            return EmptyIterator.emptyIterator;
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < xMLStreamReader.getNamespaceCount(); i10++) {
            String namespacePrefix = xMLStreamReader.getNamespacePrefix(i10);
            if (namespacePrefix == null || namespacePrefix.equals("")) {
                arrayList.add(new NamespaceBase(xMLStreamReader.getNamespaceURI(i10)));
            } else {
                arrayList.add(new NamespaceBase(namespacePrefix, xMLStreamReader.getNamespaceURI(i10)));
            }
        }
        return arrayList.iterator();
    }

    @Override // javax.xml.stream.util.XMLEventAllocator
    public XMLEvent allocate(XMLStreamReader xMLStreamReader) throws XMLStreamException {
        switch (xMLStreamReader.getEventType()) {
            case 1:
                return allocateStartElement(xMLStreamReader);
            case 2:
                return allocateEndElement(xMLStreamReader);
            case 3:
                return allocatePI(xMLStreamReader);
            case 4:
                return allocateCharacters(xMLStreamReader);
            case 5:
                return allocateComment(xMLStreamReader);
            case 6:
                return allocateCharacters(xMLStreamReader);
            case 7:
                return allocateStartDocument(xMLStreamReader);
            case 8:
                return allocateEndDocument(xMLStreamReader);
            case 9:
                return allocateEntityReference(xMLStreamReader);
            case 10:
            default:
                StringBuffer stringBuffer = new StringBuffer("Unable to allocate event[");
                stringBuffer.append(xMLStreamReader.getEventType());
                stringBuffer.append(" , ");
                stringBuffer.append(ElementTypeNames.getEventTypeString(xMLStreamReader.getEventType()));
                stringBuffer.append(Constant.BRACKET_CLOSE);
                throw new XMLStreamException(stringBuffer.toString());
            case 11:
                return allocateDTD(xMLStreamReader);
            case 12:
                return allocateCData(xMLStreamReader);
        }
    }

    public Characters allocateCData(XMLStreamReader xMLStreamReader) throws XMLStreamException {
        return this.f37843a.createCData(xMLStreamReader.getText());
    }

    public Characters allocateCharacters(XMLStreamReader xMLStreamReader) throws XMLStreamException {
        String str = new String(xMLStreamReader.getTextCharacters(), xMLStreamReader.getTextStart(), xMLStreamReader.getTextLength());
        boolean zIsWhiteSpace = xMLStreamReader.isWhiteSpace();
        XMLEventFactory xMLEventFactory = this.f37843a;
        return zIsWhiteSpace ? xMLEventFactory.createSpace(str) : xMLEventFactory.createCharacters(str);
    }

    public Comment allocateComment(XMLStreamReader xMLStreamReader) throws XMLStreamException {
        return this.f37843a.createComment(xMLStreamReader.getText());
    }

    public DTD allocateDTD(XMLStreamReader xMLStreamReader) throws XMLStreamException {
        if (!(xMLStreamReader instanceof MXParser)) {
            return this.f37843a.createDTD(xMLStreamReader.getText());
        }
        MXParser mXParser = (MXParser) xMLStreamReader;
        DTDEvent dTDEvent = new DTDEvent(xMLStreamReader.getText());
        dTDEvent.setNotations((List) mXParser.getProperty("javax.xml.stream.notations"));
        dTDEvent.setEntities((List) mXParser.getProperty("javax.xml.stream.entities"));
        return dTDEvent;
    }

    public EndDocument allocateEndDocument(XMLStreamReader xMLStreamReader) throws XMLStreamException {
        return this.f37843a.createEndDocument();
    }

    public EndElement allocateEndElement(XMLStreamReader xMLStreamReader) throws XMLStreamException {
        String prefix = xMLStreamReader.getPrefix();
        String namespaceURI = xMLStreamReader.getNamespaceURI();
        if (prefix == null) {
            prefix = "";
        }
        if (namespaceURI == null) {
            namespaceURI = "";
        }
        return this.f37843a.createEndElement(prefix, namespaceURI, xMLStreamReader.getLocalName(), getNamespaces(xMLStreamReader));
    }

    public EntityReference allocateEntityReference(XMLStreamReader xMLStreamReader) throws XMLStreamException {
        String localName = xMLStreamReader.getLocalName();
        boolean z10 = xMLStreamReader instanceof MXParser;
        return this.f37843a.createEntityReference(localName, new EntityDeclarationEvent(localName, xMLStreamReader.getText()));
    }

    public ProcessingInstruction allocatePI(XMLStreamReader xMLStreamReader) throws XMLStreamException {
        return this.f37843a.createProcessingInstruction(xMLStreamReader.getPITarget(), xMLStreamReader.getPIData());
    }

    public Characters allocateSpace(XMLStreamReader xMLStreamReader) throws XMLStreamException {
        return this.f37843a.createSpace(xMLStreamReader.getText());
    }

    public StartDocument allocateStartDocument(XMLStreamReader xMLStreamReader) throws XMLStreamException {
        return allocateXMLDeclaration(xMLStreamReader);
    }

    public StartElement allocateStartElement(XMLStreamReader xMLStreamReader) throws XMLStreamException {
        String prefix = xMLStreamReader.getPrefix();
        String namespaceURI = xMLStreamReader.getNamespaceURI();
        return this.f37843a.createStartElement(prefix == null ? "" : prefix, namespaceURI == null ? "" : namespaceURI, xMLStreamReader.getLocalName(), getAttributes(xMLStreamReader), getNamespaces(xMLStreamReader));
    }

    public StartDocument allocateXMLDeclaration(XMLStreamReader xMLStreamReader) throws XMLStreamException {
        String characterEncodingScheme = xMLStreamReader.getCharacterEncodingScheme();
        String version = xMLStreamReader.getVersion();
        boolean zIsStandalone = xMLStreamReader.isStandalone();
        XMLEventFactory xMLEventFactory = this.f37843a;
        if (characterEncodingScheme != null && version != null && !zIsStandalone) {
            return xMLEventFactory.createStartDocument(characterEncodingScheme, version, zIsStandalone);
        }
        if (version == null || characterEncodingScheme == null) {
            return characterEncodingScheme != null ? xMLEventFactory.createStartDocument(characterEncodingScheme) : xMLEventFactory.createStartDocument();
        }
        return xMLEventFactory.createStartDocument(characterEncodingScheme, version);
    }

    @Override // javax.xml.stream.util.XMLEventAllocator
    public XMLEventAllocator newInstance() {
        return new XMLEventAllocatorBase();
    }

    public String toString() {
        return "NonStaticAllocator";
    }

    @Override // javax.xml.stream.util.XMLEventAllocator
    public void allocate(XMLStreamReader xMLStreamReader, XMLEventConsumer xMLEventConsumer) throws XMLStreamException {
        xMLEventConsumer.add(allocate(xMLStreamReader));
    }
}
