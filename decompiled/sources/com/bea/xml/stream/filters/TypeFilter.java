package com.bea.xml.stream.filters;

import javax.xml.stream.EventFilter;
import javax.xml.stream.StreamFilter;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.events.XMLEvent;

/* JADX INFO: loaded from: classes9.dex */
public class TypeFilter implements EventFilter, StreamFilter {
    protected boolean[] types = new boolean[20];

    @Override // javax.xml.stream.EventFilter
    public boolean accept(XMLEvent xMLEvent) {
        return this.types[xMLEvent.getEventType()];
    }

    public void addType(int i10) {
        this.types[i10] = true;
    }

    @Override // javax.xml.stream.StreamFilter
    public boolean accept(XMLStreamReader xMLStreamReader) {
        return this.types[xMLStreamReader.getEventType()];
    }
}
