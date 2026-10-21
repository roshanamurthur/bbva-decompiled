package com.bea.xml.stream.filters;

import javax.xml.namespace.QName;
import javax.xml.stream.EventFilter;
import javax.xml.stream.StreamFilter;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

/* JADX INFO: loaded from: classes9.dex */
public class NameFilter implements EventFilter, StreamFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final QName f37888a;

    public NameFilter(QName qName) {
        this.f37888a = qName;
    }

    @Override // javax.xml.stream.EventFilter
    public boolean accept(XMLEvent xMLEvent) {
        if (xMLEvent.isStartElement() || xMLEvent.isEndElement()) {
            return this.f37888a.equals(xMLEvent.isStartElement() ? ((StartElement) xMLEvent).getName() : ((EndElement) xMLEvent).getName());
        }
        return false;
    }

    @Override // javax.xml.stream.StreamFilter
    public boolean accept(XMLStreamReader xMLStreamReader) {
        if (xMLStreamReader.isStartElement() || xMLStreamReader.isEndElement()) {
            return this.f37888a.equals(new QName(xMLStreamReader.getNamespaceURI(), xMLStreamReader.getLocalName()));
        }
        return false;
    }
}
