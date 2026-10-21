package com.bea.xml.stream;

import java.io.InputStream;
import java.io.Reader;
import javax.xml.stream.EventFilter;
import javax.xml.stream.StreamFilter;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLReporter;
import javax.xml.stream.XMLResolver;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.util.XMLEventAllocator;
import javax.xml.transform.Source;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.sax.SAXSource;
import org.xml.sax.InputSource;

/* JADX INFO: loaded from: classes9.dex */
public class MXParserFactory extends XMLInputFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConfigurationContextBase f37823a = new ConfigurationContextBase();

    public static XMLInputFactory newInstance() {
        return XMLInputFactory.newInstance();
    }

    @Override // javax.xml.stream.XMLInputFactory
    public XMLStreamReader createFilteredReader(XMLStreamReader xMLStreamReader, StreamFilter streamFilter) throws XMLStreamException {
        return new StreamReaderFilter(xMLStreamReader, streamFilter);
    }

    @Override // javax.xml.stream.XMLInputFactory
    public XMLEventReader createXMLEventReader(String str, Reader reader) throws XMLStreamException {
        return createXMLEventReader(reader);
    }

    @Override // javax.xml.stream.XMLInputFactory
    public XMLStreamReader createXMLStreamReader(Source source) throws XMLStreamException {
        if (!(source instanceof SAXSource)) {
            boolean z10 = source instanceof DOMSource;
            StringBuffer stringBuffer = new StringBuffer("XMLInputFactory.createXMLStreamReader(");
            stringBuffer.append(source.getClass().getName());
            stringBuffer.append(") not yet implemented");
            throw new UnsupportedOperationException(stringBuffer.toString());
        }
        InputSource inputSource = ((SAXSource) source).getInputSource();
        if (inputSource != null) {
            String systemId = inputSource.getSystemId();
            Reader characterStream = inputSource.getCharacterStream();
            if (characterStream != null) {
                return createXMLStreamReader(systemId, characterStream);
            }
            InputStream byteStream = inputSource.getByteStream();
            if (byteStream != null) {
                return createXMLStreamReader(systemId, byteStream);
            }
        }
        throw new XMLStreamException("Can only create STaX reader for a SAXSource if Reader or InputStream exposed via getSource(); can not use -- not implemented.");
    }

    @Override // javax.xml.stream.XMLInputFactory
    public XMLEventAllocator getEventAllocator() {
        return this.f37823a.getEventAllocator();
    }

    @Override // javax.xml.stream.XMLInputFactory
    public Object getProperty(String str) throws IllegalArgumentException {
        return this.f37823a.getProperty(str);
    }

    @Override // javax.xml.stream.XMLInputFactory
    public XMLReporter getXMLReporter() {
        return this.f37823a.getXMLReporter();
    }

    @Override // javax.xml.stream.XMLInputFactory
    public XMLResolver getXMLResolver() {
        return this.f37823a.getXMLResolver();
    }

    public boolean isCoalescing() {
        return this.f37823a.isCoalescing();
    }

    @Override // javax.xml.stream.XMLInputFactory
    public boolean isPropertySupported(String str) {
        return this.f37823a.isPropertySupported(str);
    }

    public void setCoalescing(boolean z10) {
        this.f37823a.setCoalescing(z10);
    }

    @Override // javax.xml.stream.XMLInputFactory
    public void setEventAllocator(XMLEventAllocator xMLEventAllocator) {
        this.f37823a.setEventAllocator(xMLEventAllocator);
    }

    @Override // javax.xml.stream.XMLInputFactory
    public void setProperty(String str, Object obj) throws IllegalArgumentException {
        this.f37823a.setProperty(str, obj);
    }

    @Override // javax.xml.stream.XMLInputFactory
    public void setXMLReporter(XMLReporter xMLReporter) {
        this.f37823a.setXMLReporter(xMLReporter);
    }

    @Override // javax.xml.stream.XMLInputFactory
    public void setXMLResolver(XMLResolver xMLResolver) {
        this.f37823a.setXMLResolver(xMLResolver);
    }

    @Override // javax.xml.stream.XMLInputFactory
    public XMLEventReader createFilteredReader(XMLEventReader xMLEventReader, EventFilter eventFilter) throws XMLStreamException {
        return new EventReaderFilter(xMLEventReader, eventFilter);
    }

    @Override // javax.xml.stream.XMLInputFactory
    public XMLEventReader createXMLEventReader(String str, InputStream inputStream) throws XMLStreamException {
        return createXMLEventReader(inputStream);
    }

    @Override // javax.xml.stream.XMLInputFactory
    public XMLEventReader createXMLEventReader(Reader reader) throws XMLStreamException {
        return createXMLEventReader(createXMLStreamReader(reader));
    }

    @Override // javax.xml.stream.XMLInputFactory
    public XMLEventReader createXMLEventReader(XMLStreamReader xMLStreamReader) throws XMLStreamException {
        ConfigurationContextBase configurationContextBase = this.f37823a;
        if (configurationContextBase.getEventAllocator() == null) {
            return new XMLEventReaderBase(xMLStreamReader);
        }
        return new XMLEventReaderBase(xMLStreamReader, configurationContextBase.getEventAllocator().newInstance());
    }

    @Override // javax.xml.stream.XMLInputFactory
    public XMLEventReader createXMLEventReader(Source source) throws XMLStreamException {
        return createXMLEventReader(createXMLStreamReader(source));
    }

    @Override // javax.xml.stream.XMLInputFactory
    public XMLEventReader createXMLEventReader(InputStream inputStream) throws XMLStreamException {
        return createXMLEventReader(createXMLStreamReader(inputStream));
    }

    @Override // javax.xml.stream.XMLInputFactory
    public XMLEventReader createXMLEventReader(InputStream inputStream, String str) throws XMLStreamException {
        return createXMLEventReader(createXMLStreamReader(inputStream, str));
    }

    @Override // javax.xml.stream.XMLInputFactory
    public XMLStreamReader createXMLStreamReader(InputStream inputStream) throws XMLStreamException {
        MXParser mXParser = new MXParser();
        mXParser.setInput(inputStream);
        mXParser.setConfigurationContext(this.f37823a);
        return mXParser;
    }

    @Override // javax.xml.stream.XMLInputFactory
    public XMLStreamReader createXMLStreamReader(InputStream inputStream, String str) throws XMLStreamException {
        MXParser mXParser = new MXParser();
        mXParser.setInput(inputStream, str);
        mXParser.setConfigurationContext(this.f37823a);
        return mXParser;
    }

    @Override // javax.xml.stream.XMLInputFactory
    public XMLStreamReader createXMLStreamReader(String str, InputStream inputStream) throws XMLStreamException {
        return createXMLStreamReader(inputStream);
    }

    @Override // javax.xml.stream.XMLInputFactory
    public XMLStreamReader createXMLStreamReader(String str, Reader reader) throws XMLStreamException {
        return createXMLStreamReader(reader);
    }

    @Override // javax.xml.stream.XMLInputFactory
    public XMLStreamReader createXMLStreamReader(Reader reader) throws XMLStreamException {
        MXParser mXParser = new MXParser();
        mXParser.setInput(reader);
        mXParser.setConfigurationContext(this.f37823a);
        return mXParser;
    }
}
