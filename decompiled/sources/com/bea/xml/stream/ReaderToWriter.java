package com.bea.xml.stream;

import java.io.FileReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

/* JADX INFO: loaded from: classes9.dex */
public class ReaderToWriter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public XMLStreamWriter f37828a;

    public ReaderToWriter() {
    }

    public ReaderToWriter(XMLStreamWriter xMLStreamWriter) {
        this.f37828a = xMLStreamWriter;
    }

    public static void main(String[] strArr) throws Exception {
        XMLInputFactory xMLInputFactoryNewInstance = XMLInputFactory.newInstance();
        XMLOutputFactory xMLOutputFactoryNewInstance = XMLOutputFactory.newInstance();
        XMLStreamReader xMLStreamReaderCreateXMLStreamReader = xMLInputFactoryNewInstance.createXMLStreamReader(new FileReader(strArr[0]));
        XMLStreamWriter xMLStreamWriterCreateXMLStreamWriter = xMLOutputFactoryNewInstance.createXMLStreamWriter(System.out);
        ReaderToWriter readerToWriter = new ReaderToWriter(xMLStreamWriterCreateXMLStreamWriter);
        while (xMLStreamReaderCreateXMLStreamReader.hasNext()) {
            readerToWriter.write(xMLStreamReaderCreateXMLStreamReader);
            xMLStreamReaderCreateXMLStreamReader.next();
        }
        xMLStreamWriterCreateXMLStreamWriter.flush();
    }

    public void setStreamWriter(XMLStreamWriter xMLStreamWriter) {
        this.f37828a = xMLStreamWriter;
    }

    public void write(XMLStreamReader xMLStreamReader) throws XMLStreamException {
        System.out.println("wrote event");
        switch (xMLStreamReader.getEventType()) {
            case 1:
                String prefix = xMLStreamReader.getPrefix();
                if (xMLStreamReader.getNamespaceURI() == null) {
                    this.f37828a.writeStartElement(xMLStreamReader.getLocalName());
                } else if (prefix != null) {
                    this.f37828a.writeStartElement(xMLStreamReader.getPrefix(), xMLStreamReader.getLocalName(), xMLStreamReader.getNamespaceURI());
                } else {
                    this.f37828a.writeStartElement(xMLStreamReader.getNamespaceURI(), xMLStreamReader.getLocalName());
                }
                for (int i10 = 0; i10 < xMLStreamReader.getNamespaceCount(); i10++) {
                    this.f37828a.writeNamespace(xMLStreamReader.getNamespacePrefix(i10), xMLStreamReader.getNamespaceURI(i10));
                }
                break;
            case 2:
                this.f37828a.writeEndElement();
                break;
            case 3:
                this.f37828a.writeProcessingInstruction(xMLStreamReader.getPITarget(), xMLStreamReader.getPIData());
                break;
            case 4:
            case 6:
                this.f37828a.writeCharacters(xMLStreamReader.getTextCharacters(), xMLStreamReader.getTextStart(), xMLStreamReader.getTextLength());
                break;
            case 5:
                this.f37828a.writeComment(xMLStreamReader.getText());
                break;
            case 7:
                String characterEncodingScheme = xMLStreamReader.getCharacterEncodingScheme();
                String version = xMLStreamReader.getVersion();
                if (characterEncodingScheme != null && version != null) {
                    this.f37828a.writeStartDocument(characterEncodingScheme, version);
                } else if (version != null) {
                    this.f37828a.writeStartDocument(xMLStreamReader.getVersion());
                }
                break;
            case 8:
                this.f37828a.writeEndDocument();
                break;
            case 9:
                this.f37828a.writeEntityRef(xMLStreamReader.getLocalName());
                break;
            case 11:
                this.f37828a.writeDTD(xMLStreamReader.getText());
                break;
            case 12:
                this.f37828a.writeCData(xMLStreamReader.getText());
                break;
        }
    }

    public XMLStreamWriter writeAll(XMLStreamReader xMLStreamReader) throws XMLStreamException {
        while (xMLStreamReader.hasNext()) {
            write(xMLStreamReader);
            xMLStreamReader.next();
        }
        this.f37828a.flush();
        return this.f37828a;
    }
}
