package com.bea.xml.stream;

import com.bea.xml.stream.filters.TypeFilter;
import java.io.FileReader;
import javax.xml.stream.EventFilter;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.XMLEvent;

/* JADX INFO: loaded from: classes9.dex */
public class EventReaderFilter implements XMLEventReader {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final XMLEventReader f37806p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public EventFilter f37807q0;

    public EventReaderFilter(XMLEventReader xMLEventReader) throws XMLStreamException {
        this.f37806p0 = xMLEventReader;
    }

    public static void main(String[] strArr) throws Exception {
        System.setProperty("javax.xml.stream.XMLInputFactory", "com.bea.xml.stream.MXParserFactory");
        System.setProperty("javax.xml.stream.XMLEventFactory", "com.bea.xml.stream.EventFactory");
        XMLInputFactory xMLInputFactoryNewInstance = XMLInputFactory.newInstance();
        TypeFilter typeFilter = new TypeFilter();
        typeFilter.addType(1);
        typeFilter.addType(2);
        XMLEventReader xMLEventReaderCreateFilteredReader = xMLInputFactoryNewInstance.createFilteredReader(xMLInputFactoryNewInstance.createXMLEventReader(new FileReader(strArr[0])), typeFilter);
        while (xMLEventReaderCreateFilteredReader.hasNext()) {
            System.out.println(xMLEventReaderCreateFilteredReader.nextEvent());
        }
    }

    @Override // javax.xml.stream.XMLEventReader
    public void close() throws XMLStreamException {
        this.f37806p0.close();
    }

    @Override // javax.xml.stream.XMLEventReader
    public String getElementText() throws XMLStreamException {
        StringBuffer stringBuffer = new StringBuffer();
        if (!nextEvent().isStartElement()) {
            throw new XMLStreamException("Precondition for readText is nextEvent().getTypeEventType() == START_ELEMENT");
        }
        while (hasNext()) {
            XMLEvent xMLEventPeek = peek();
            if (xMLEventPeek.isStartElement()) {
                throw new XMLStreamException("Unexpected Element start");
            }
            if (xMLEventPeek.isCharacters()) {
                stringBuffer.append(((Characters) xMLEventPeek).getData());
            }
            if (xMLEventPeek.isEndElement()) {
                return stringBuffer.toString();
            }
            nextEvent();
        }
        throw new XMLStreamException("Unexpected end of Document");
    }

    @Override // javax.xml.stream.XMLEventReader
    public Object getProperty(String str) {
        return this.f37806p0.getProperty(str);
    }

    @Override // javax.xml.stream.XMLEventReader, java.util.Iterator
    public boolean hasNext() {
        XMLEventReader xMLEventReader = this.f37806p0;
        while (xMLEventReader.hasNext()) {
            try {
                if (this.f37807q0.accept(xMLEventReader.peek())) {
                    return true;
                }
                xMLEventReader.nextEvent();
            } catch (XMLStreamException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public Object next() {
        try {
            return nextEvent();
        } catch (XMLStreamException unused) {
            return null;
        }
    }

    @Override // javax.xml.stream.XMLEventReader
    public XMLEvent nextEvent() throws XMLStreamException {
        if (hasNext()) {
            return this.f37806p0.nextEvent();
        }
        return null;
    }

    @Override // javax.xml.stream.XMLEventReader
    public XMLEvent nextTag() throws XMLStreamException {
        while (hasNext()) {
            XMLEvent xMLEventNextEvent = nextEvent();
            if (xMLEventNextEvent.isCharacters() && !((Characters) xMLEventNextEvent).isWhiteSpace()) {
                throw new XMLStreamException("Unexpected text");
            }
            if (xMLEventNextEvent.isStartElement() || xMLEventNextEvent.isEndElement()) {
                return xMLEventNextEvent;
            }
        }
        throw new XMLStreamException("Unexpected end of Document");
    }

    @Override // javax.xml.stream.XMLEventReader
    public XMLEvent peek() throws XMLStreamException {
        if (hasNext()) {
            return this.f37806p0.peek();
        }
        return null;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }

    public void setFilter(EventFilter eventFilter) {
        this.f37807q0 = eventFilter;
    }

    public EventReaderFilter(XMLEventReader xMLEventReader, EventFilter eventFilter) throws XMLStreamException {
        this.f37806p0 = xMLEventReader;
        this.f37807q0 = eventFilter;
    }
}
