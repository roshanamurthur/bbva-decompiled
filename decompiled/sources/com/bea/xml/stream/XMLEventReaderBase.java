package com.bea.xml.stream;

import com.bea.xml.stream.util.CircularQueue;
import com.bea.xml.stream.util.ElementTypeNames;
import java.io.FileReader;
import java.io.PrintStream;
import java.util.NoSuchElementException;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.XMLEvent;
import javax.xml.stream.util.XMLEventAllocator;
import javax.xml.stream.util.XMLEventConsumer;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes9.dex */
public class XMLEventReaderBase implements XMLEventReader, XMLEventConsumer {
    protected XMLEventAllocator allocator;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final CircularQueue f37845p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public boolean f37846q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f37847r0;
    protected XMLStreamReader reader;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public ConfigurationContextBase f37848s0;

    public XMLEventReaderBase(XMLStreamReader xMLStreamReader) throws XMLStreamException {
        this(xMLStreamReader, new XMLEventAllocatorBase());
    }

    public static void main(String[] strArr) throws Exception {
        System.setProperty("javax.xml.stream.XMLInputFactory", "com.bea.xml.stream.MXParserFactory");
        System.setProperty("javax.xml.stream.XMLEventFactory", "com.bea.xml.stream.EventFactory");
        XMLEventReader xMLEventReaderCreateXMLEventReader = XMLInputFactory.newInstance().createXMLEventReader(new FileReader(strArr[0]));
        while (xMLEventReaderCreateXMLEventReader.hasNext()) {
            XMLEvent xMLEventNextEvent = xMLEventReaderCreateXMLEventReader.nextEvent();
            PrintStream printStream = System.out;
            StringBuffer stringBuffer = new StringBuffer(Constant.BRACKET_OPEN);
            stringBuffer.append(ElementTypeNames.getEventTypeString(xMLEventNextEvent.getEventType()));
            stringBuffer.append("][");
            stringBuffer.append(xMLEventNextEvent);
            stringBuffer.append(Constant.BRACKET_CLOSE);
            printStream.println(stringBuffer.toString());
        }
    }

    @Override // javax.xml.stream.util.XMLEventConsumer
    public void add(XMLEvent xMLEvent) throws XMLStreamException {
        this.f37845p0.add(xMLEvent);
    }

    @Override // javax.xml.stream.XMLEventReader
    public void close() throws XMLStreamException {
        internal_close();
    }

    public XMLEvent get() throws XMLStreamException {
        return (XMLEvent) this.f37845p0.remove();
    }

    @Override // javax.xml.stream.XMLEventReader
    public String getElementText() throws XMLStreamException {
        StringBuffer stringBuffer = new StringBuffer();
        XMLEvent xMLEventNextEvent = nextEvent();
        if (!xMLEventNextEvent.isStartElement()) {
            StringBuffer stringBuffer2 = new StringBuffer("Precondition for readText is nextEvent().getTypeEventType() == START_ELEMENT (got ");
            stringBuffer2.append(xMLEventNextEvent.getEventType());
            stringBuffer2.append(")");
            throw new XMLStreamException(stringBuffer2.toString());
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
        return this.f37848s0.getProperty(str);
    }

    @Override // javax.xml.stream.XMLEventReader, java.util.Iterator
    public boolean hasNext() {
        if (!this.f37846q0) {
            return false;
        }
        if (!this.f37845p0.isEmpty()) {
            return true;
        }
        try {
            if (this.reader.hasNext()) {
                return true;
            }
            this.f37846q0 = false;
            return false;
        } catch (XMLStreamException unused) {
        }
    }

    public void internal_close() {
        this.f37847r0 = true;
    }

    public boolean isOpen() {
        return !this.f37847r0;
    }

    public boolean needsMore() {
        return this.f37845p0.isEmpty();
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
        if (!needsMore() || parseSome()) {
            return get();
        }
        throw new NoSuchElementException("Attempt to call nextEvent() on a stream with no more elements");
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

    public boolean parseSome() throws XMLStreamException {
        if (this.f37847r0) {
            return false;
        }
        this.allocator.allocate(this.reader, this);
        if (this.reader.hasNext()) {
            this.reader.next();
        }
        if (this.reader.getEventType() == 8) {
            this.allocator.allocate(this.reader, this);
            this.f37847r0 = true;
        }
        return !needsMore();
    }

    @Override // javax.xml.stream.XMLEventReader
    public XMLEvent peek() throws XMLStreamException {
        CircularQueue circularQueue = this.f37845p0;
        if (!circularQueue.isEmpty()) {
            return (XMLEvent) circularQueue.peek();
        }
        if (parseSome()) {
            return (XMLEvent) circularQueue.peek();
        }
        return null;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }

    public void setAllocator(XMLEventAllocator xMLEventAllocator) {
        if (xMLEventAllocator == null) {
            throw new IllegalArgumentException("XMLEvent Allocator may not be null");
        }
        this.allocator = xMLEventAllocator;
    }

    public void setConfigurationContext(ConfigurationContextBase configurationContextBase) {
        this.f37848s0 = configurationContextBase;
    }

    public XMLEventReaderBase(XMLStreamReader xMLStreamReader, XMLEventAllocator xMLEventAllocator) throws XMLStreamException {
        this.f37845p0 = new CircularQueue();
        this.f37846q0 = true;
        this.f37847r0 = false;
        if (xMLStreamReader == null) {
            throw new IllegalArgumentException("XMLStreamReader may not be null");
        }
        if (xMLEventAllocator == null) {
            throw new IllegalArgumentException("XMLEventAllocator may not be null");
        }
        this.reader = xMLStreamReader;
        this.f37846q0 = true;
        this.allocator = xMLEventAllocator;
        if (xMLStreamReader.getEventType() == 7) {
            XMLEvent xMLEventAllocate = this.allocator.allocate(xMLStreamReader);
            xMLStreamReader.next();
            add(xMLEventAllocate);
        }
    }
}
