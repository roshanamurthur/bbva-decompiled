package com.bea.xml.stream;

import com.bea.xml.stream.util.ElementTypeNames;
import java.io.FileReader;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.util.Iterator;
import javax.xml.namespace.NamespaceContext;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
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
import javax.xml.stream.util.XMLEventConsumer;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes9.dex */
public class XMLEventWriterBase implements XMLEventWriter, XMLEventConsumer {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final XMLStreamWriter f37849p0;

    public XMLEventWriterBase(XMLStreamWriter xMLStreamWriter) {
        this.f37849p0 = xMLStreamWriter;
    }

    public static void main(String[] strArr) throws Exception {
        System.setProperty("javax.xml.stream.XMLInputFactory", "com.bea.xml.stream.MXParserFactory");
        System.setProperty("javax.xml.stream.XMLEventFactory", "com.bea.xml.stream.EventFactory");
        XMLEventWriterBase xMLEventWriterBase = new XMLEventWriterBase(new XMLWriterBase(new OutputStreamWriter(System.out)));
        MXParser mXParser = new MXParser();
        mXParser.setConfigurationContext(new ConfigurationContextBase());
        mXParser.setInput(new FileReader(strArr[0]));
        XMLEventReaderBase xMLEventReaderBase = new XMLEventReaderBase(mXParser);
        while (xMLEventReaderBase.hasNext()) {
            XMLEvent xMLEventNextEvent = xMLEventReaderBase.nextEvent();
            PrintStream printStream = System.out;
            StringBuffer stringBuffer = new StringBuffer("about to add:[");
            stringBuffer.append(xMLEventNextEvent);
            stringBuffer.append("];");
            printStream.println(stringBuffer.toString());
            xMLEventWriterBase.add(xMLEventNextEvent);
        }
        xMLEventWriterBase.flush();
    }

    @Override // javax.xml.stream.XMLEventWriter, javax.xml.stream.util.XMLEventConsumer
    public void add(XMLEvent xMLEvent) throws XMLStreamException {
        int eventType = xMLEvent.getEventType();
        XMLStreamWriter xMLStreamWriter = this.f37849p0;
        switch (eventType) {
            case 1:
                StartElement startElement = (StartElement) xMLEvent;
                xMLStreamWriter.writeStartElement(startElement.getName().getPrefix(), startElement.getName().getLocalPart(), startElement.getName().getNamespaceURI());
                Iterator namespaces = startElement.getNamespaces();
                while (namespaces.hasNext()) {
                    writeNamespace((Namespace) namespaces.next());
                }
                Iterator attributes = startElement.getAttributes();
                while (attributes.hasNext()) {
                    Attribute attribute = (Attribute) attributes.next();
                    this.f37849p0.writeAttribute(attribute.getName().getNamespaceURI(), attribute.getName().getLocalPart(), attribute.getValue());
                }
                return;
            case 2:
                EndElement endElement = (EndElement) xMLEvent;
                endElement.getName().getPrefix();
                endElement.getName().getNamespaceURI();
                endElement.getName().getLocalPart();
                xMLStreamWriter.writeEndElement();
                return;
            case 3:
                addProcessingInstruction((ProcessingInstruction) xMLEvent);
                return;
            case 4:
                addCharacters((Characters) xMLEvent);
                return;
            case 5:
                addComment((Comment) xMLEvent);
                return;
            case 6:
            case 12:
            default:
                StringBuffer stringBuffer = new StringBuffer("Unable to add event[");
                stringBuffer.append(ElementTypeNames.getEventTypeString(xMLEvent.getEventType()));
                stringBuffer.append(Constant.BRACKET_CLOSE);
                throw new XMLStreamException(stringBuffer.toString());
            case 7:
                addStartDocument((StartDocument) xMLEvent);
                return;
            case 8:
                addEndDocument((EndDocument) xMLEvent);
                return;
            case 9:
                addEntityReference((EntityReference) xMLEvent);
                return;
            case 10:
                addAttribute((Attribute) xMLEvent);
                return;
            case 11:
                addDTD((DTD) xMLEvent);
                return;
            case 13:
                addNamespace((Namespace) xMLEvent);
                return;
        }
    }

    public void addAttribute(Attribute attribute) throws XMLStreamException {
        this.f37849p0.writeAttribute(attribute.getName().getNamespaceURI(), attribute.getName().getLocalPart(), attribute.getValue());
    }

    public void addCharacters(Characters characters) throws XMLStreamException {
        boolean zIsCData = characters.isCData();
        XMLStreamWriter xMLStreamWriter = this.f37849p0;
        if (zIsCData) {
            xMLStreamWriter.writeCData(characters.getData());
        } else {
            xMLStreamWriter.writeCharacters(characters.getData());
        }
    }

    public void addComment(Comment comment) throws XMLStreamException {
        this.f37849p0.writeComment(comment.getText());
    }

    public void addDTD(DTD dtd) throws XMLStreamException {
        this.f37849p0.writeDTD(dtd.getDocumentTypeDeclaration());
    }

    public void addEntityReference(EntityReference entityReference) throws XMLStreamException {
        this.f37849p0.writeEntityRef(entityReference.getName());
    }

    public void addNamespace(Namespace namespace) throws XMLStreamException {
        writeNamespace(namespace);
    }

    public void addProcessingInstruction(ProcessingInstruction processingInstruction) throws XMLStreamException {
        this.f37849p0.writeProcessingInstruction(processingInstruction.getTarget(), processingInstruction.getData());
    }

    public void addStartDocument(StartDocument startDocument) throws XMLStreamException {
        String characterEncodingScheme = startDocument.getCharacterEncodingScheme();
        String version = startDocument.getVersion();
        startDocument.isStandalone();
        this.f37849p0.writeStartDocument(characterEncodingScheme, version);
    }

    @Override // javax.xml.stream.XMLEventWriter
    public void close() throws XMLStreamException {
        this.f37849p0.close();
    }

    @Override // javax.xml.stream.XMLEventWriter
    public void flush() throws XMLStreamException {
        this.f37849p0.flush();
    }

    @Override // javax.xml.stream.XMLEventWriter
    public NamespaceContext getNamespaceContext() {
        return this.f37849p0.getNamespaceContext();
    }

    @Override // javax.xml.stream.XMLEventWriter
    public String getPrefix(String str) throws XMLStreamException {
        return this.f37849p0.getPrefix(str);
    }

    @Override // javax.xml.stream.XMLEventWriter
    public void setDefaultNamespace(String str) throws XMLStreamException {
        this.f37849p0.setDefaultNamespace(str);
    }

    @Override // javax.xml.stream.XMLEventWriter
    public void setNamespaceContext(NamespaceContext namespaceContext) throws XMLStreamException {
        this.f37849p0.setNamespaceContext(namespaceContext);
    }

    @Override // javax.xml.stream.XMLEventWriter
    public void setPrefix(String str, String str2) throws XMLStreamException {
        this.f37849p0.setPrefix(str, str2);
    }

    public void writeNamespace(Namespace namespace) throws XMLStreamException {
        boolean zIsDefaultNamespaceDeclaration = namespace.isDefaultNamespaceDeclaration();
        XMLStreamWriter xMLStreamWriter = this.f37849p0;
        if (zIsDefaultNamespaceDeclaration) {
            xMLStreamWriter.writeDefaultNamespace(namespace.getNamespaceURI());
        } else {
            xMLStreamWriter.writeNamespace(namespace.getPrefix(), namespace.getNamespaceURI());
        }
    }

    public void addEndDocument(EndDocument endDocument) throws XMLStreamException {
    }

    @Override // javax.xml.stream.XMLEventWriter
    public void add(XMLEventReader xMLEventReader) throws XMLStreamException {
        while (xMLEventReader.hasNext()) {
            add(xMLEventReader.nextEvent());
        }
    }
}
