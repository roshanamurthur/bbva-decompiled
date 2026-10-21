package com.bea.xml.stream;

import com.bea.xml.stream.events.CharactersEvent;
import com.bea.xml.stream.events.CommentEvent;
import com.bea.xml.stream.events.DTDEvent;
import com.bea.xml.stream.events.EndDocumentEvent;
import com.bea.xml.stream.events.EndElementEvent;
import com.bea.xml.stream.events.EntityReferenceEvent;
import com.bea.xml.stream.events.ProcessingInstructionEvent;
import com.bea.xml.stream.events.StartDocumentEvent;
import com.bea.xml.stream.events.StartElementEvent;
import com.bea.xml.stream.util.ElementTypeNames;
import java.util.Iterator;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.Comment;
import javax.xml.stream.events.DTD;
import javax.xml.stream.events.EndDocument;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.EntityReference;
import javax.xml.stream.events.Namespace;
import javax.xml.stream.events.ProcessingInstruction;
import javax.xml.stream.events.StartDocument;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import javax.xml.stream.util.XMLEventAllocator;
import javax.xml.stream.util.XMLEventConsumer;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes9.dex */
public class StaticAllocator implements XMLEventAllocator {
    public static final String FEATURE_STAX_ENTITIES = "javax.xml.stream.entities";
    public static final String FEATURE_STAX_NOTATIONS = "javax.xml.stream.notations";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StartElementEvent f37829a = new StartElementEvent();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EndElementEvent f37830b = new EndElementEvent();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CharactersEvent f37831c = new CharactersEvent();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CharactersEvent f37832d = new CharactersEvent("", true);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CharactersEvent f37833e = new CharactersEvent();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CommentEvent f37834f = new CommentEvent();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final EntityReferenceEvent f37835g = new EntityReferenceEvent();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ProcessingInstructionEvent f37836h = new ProcessingInstructionEvent();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final StartDocumentEvent f37837i = new StartDocumentEvent();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final EndDocumentEvent f37838j = new EndDocumentEvent();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final DTDEvent f37839k = new DTDEvent();

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
        CharactersEvent charactersEvent = this.f37832d;
        charactersEvent.setData(xMLStreamReader.getText());
        return charactersEvent;
    }

    public Characters allocateCharacters(XMLStreamReader xMLStreamReader) throws XMLStreamException {
        CharactersEvent charactersEvent = this.f37831c;
        charactersEvent.setData(xMLStreamReader.getText());
        return charactersEvent;
    }

    public Comment allocateComment(XMLStreamReader xMLStreamReader) throws XMLStreamException {
        String text = xMLStreamReader.getText();
        CommentEvent commentEvent = this.f37834f;
        commentEvent.setData(text);
        return commentEvent;
    }

    public DTD allocateDTD(XMLStreamReader xMLStreamReader) throws XMLStreamException {
        String text = xMLStreamReader.getText();
        DTDEvent dTDEvent = this.f37839k;
        dTDEvent.setDTD(text);
        return dTDEvent;
    }

    public EndDocument allocateEndDocument(XMLStreamReader xMLStreamReader) throws XMLStreamException {
        return this.f37838j;
    }

    public EndElement allocateEndElement(XMLStreamReader xMLStreamReader) throws XMLStreamException {
        EndElementEvent endElementEvent = this.f37830b;
        endElementEvent.reset();
        endElementEvent.setName(new QName(xMLStreamReader.getNamespaceURI(), xMLStreamReader.getLocalName(), EventFactory.checkPrefix(xMLStreamReader.getPrefix())));
        Iterator namespaces = XMLEventAllocatorBase.getNamespaces(xMLStreamReader);
        while (namespaces.hasNext()) {
            endElementEvent.addNamespace((Namespace) namespaces.next());
        }
        return endElementEvent;
    }

    public EntityReference allocateEntityReference(XMLStreamReader xMLStreamReader) throws XMLStreamException {
        String localName = xMLStreamReader.getLocalName();
        EntityReferenceEvent entityReferenceEvent = this.f37835g;
        entityReferenceEvent.setName(localName);
        entityReferenceEvent.setReplacementText(xMLStreamReader.getText());
        return entityReferenceEvent;
    }

    public ProcessingInstruction allocatePI(XMLStreamReader xMLStreamReader) throws XMLStreamException {
        String pITarget = xMLStreamReader.getPITarget();
        ProcessingInstructionEvent processingInstructionEvent = this.f37836h;
        processingInstructionEvent.setTarget(pITarget);
        processingInstructionEvent.setData(xMLStreamReader.getPIData());
        return processingInstructionEvent;
    }

    public Characters allocateSpace(XMLStreamReader xMLStreamReader) throws XMLStreamException {
        CharactersEvent charactersEvent = this.f37833e;
        charactersEvent.setSpace(true);
        charactersEvent.setData(xMLStreamReader.getText());
        return charactersEvent;
    }

    public StartDocument allocateStartDocument(XMLStreamReader xMLStreamReader) throws XMLStreamException {
        allocateXMLDeclaration(xMLStreamReader);
        return this.f37837i;
    }

    public StartElement allocateStartElement(XMLStreamReader xMLStreamReader) throws XMLStreamException {
        StartElementEvent startElementEvent = this.f37829a;
        startElementEvent.reset();
        startElementEvent.setName(new QName(xMLStreamReader.getNamespaceURI(), xMLStreamReader.getLocalName(), EventFactory.checkPrefix(xMLStreamReader.getPrefix())));
        Iterator attributes = XMLEventAllocatorBase.getAttributes(xMLStreamReader);
        while (attributes.hasNext()) {
            startElementEvent.addAttribute((Attribute) attributes.next());
        }
        Iterator namespaces = XMLEventAllocatorBase.getNamespaces(xMLStreamReader);
        while (namespaces.hasNext()) {
            startElementEvent.addAttribute((Namespace) namespaces.next());
        }
        return startElementEvent;
    }

    public StartDocument allocateXMLDeclaration(XMLStreamReader xMLStreamReader) throws XMLStreamException {
        StartDocumentEvent startDocumentEvent = this.f37837i;
        startDocumentEvent.clear();
        String characterEncodingScheme = xMLStreamReader.getCharacterEncodingScheme();
        String version = xMLStreamReader.getVersion();
        boolean zIsStandalone = xMLStreamReader.isStandalone();
        if (characterEncodingScheme != null && version != null && !zIsStandalone) {
            startDocumentEvent.setEncoding(characterEncodingScheme);
            startDocumentEvent.setVersion(version);
            startDocumentEvent.setStandalone(zIsStandalone);
            return startDocumentEvent;
        }
        if (version == null || characterEncodingScheme == null) {
            if (characterEncodingScheme != null) {
                startDocumentEvent.setEncoding(characterEncodingScheme);
            }
            return startDocumentEvent;
        }
        startDocumentEvent.setEncoding(characterEncodingScheme);
        startDocumentEvent.setVersion(version);
        return startDocumentEvent;
    }

    @Override // javax.xml.stream.util.XMLEventAllocator
    public XMLEventAllocator newInstance() {
        return new StaticAllocator();
    }

    public String toString() {
        return "Static Allocator";
    }

    @Override // javax.xml.stream.util.XMLEventAllocator
    public void allocate(XMLStreamReader xMLStreamReader, XMLEventConsumer xMLEventConsumer) throws XMLStreamException {
        xMLEventConsumer.add(allocate(xMLStreamReader));
    }
}
