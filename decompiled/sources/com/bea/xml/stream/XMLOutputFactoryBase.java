package com.bea.xml.stream;

import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import javax.xml.transform.Result;

/* JADX INFO: loaded from: classes9.dex */
public class XMLOutputFactoryBase extends XMLOutputFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConfigurationContextBase f37850a = new ConfigurationContextBase();

    @Override // javax.xml.stream.XMLOutputFactory
    public XMLEventWriter createXMLEventWriter(OutputStream outputStream) throws XMLStreamException {
        return new XMLEventWriterBase(createXMLStreamWriter(outputStream));
    }

    @Override // javax.xml.stream.XMLOutputFactory
    public XMLStreamWriter createXMLStreamWriter(Writer writer) throws XMLStreamException {
        XMLWriterBase xMLWriterBase = new XMLWriterBase(writer);
        xMLWriterBase.setConfigurationContext(this.f37850a);
        return xMLWriterBase;
    }

    @Override // javax.xml.stream.XMLOutputFactory
    public Object getProperty(String str) {
        return this.f37850a.getProperty(str);
    }

    public boolean isPrefixDefaulting() {
        return this.f37850a.isPrefixDefaulting();
    }

    @Override // javax.xml.stream.XMLOutputFactory
    public boolean isPropertySupported(String str) {
        return this.f37850a.isPropertySupported(str);
    }

    public void setPrefixDefaulting(boolean z10) {
        this.f37850a.setPrefixDefaulting(z10);
    }

    @Override // javax.xml.stream.XMLOutputFactory
    public void setProperty(String str, Object obj) {
        this.f37850a.setProperty(str, obj);
    }

    @Override // javax.xml.stream.XMLOutputFactory
    public XMLEventWriter createXMLEventWriter(Writer writer) throws XMLStreamException {
        return new XMLEventWriterBase(createXMLStreamWriter(writer));
    }

    @Override // javax.xml.stream.XMLOutputFactory
    public XMLEventWriter createXMLEventWriter(OutputStream outputStream, String str) throws XMLStreamException {
        return new XMLEventWriterBase(createXMLStreamWriter(outputStream, str));
    }

    @Override // javax.xml.stream.XMLOutputFactory
    public XMLStreamWriter createXMLStreamWriter(OutputStream outputStream) throws XMLStreamException {
        return createXMLStreamWriter(new BufferedWriter(new OutputStreamWriter(outputStream), 500));
    }

    @Override // javax.xml.stream.XMLOutputFactory
    public XMLEventWriter createXMLEventWriter(Result result) throws XMLStreamException {
        throw new UnsupportedOperationException();
    }

    @Override // javax.xml.stream.XMLOutputFactory
    public XMLStreamWriter createXMLStreamWriter(OutputStream outputStream, String str) throws XMLStreamException {
        try {
            return createXMLStreamWriter(new BufferedWriter(new OutputStreamWriter(outputStream, str), 500));
        } catch (UnsupportedEncodingException e5) {
            StringBuffer stringBuffer = new StringBuffer("Unsupported encoding ");
            stringBuffer.append(str);
            throw new XMLStreamException(stringBuffer.toString(), e5);
        }
    }

    @Override // javax.xml.stream.XMLOutputFactory
    public XMLStreamWriter createXMLStreamWriter(Result result) throws XMLStreamException {
        throw new UnsupportedOperationException();
    }
}
