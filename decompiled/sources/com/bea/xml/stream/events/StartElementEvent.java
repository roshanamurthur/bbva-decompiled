package com.bea.xml.stream.events;

import com.bea.xml.stream.util.EmptyIterator;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.xml.namespace.NamespaceContext;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.Namespace;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

/* JADX INFO: loaded from: classes9.dex */
public class StartElementEvent extends NamedEvent implements StartElement {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List f37885g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList f37886h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public NamespaceContext f37887i;

    public StartElementEvent() {
    }

    public void addAttribute(Attribute attribute) {
        if (this.f37885g == null) {
            this.f37885g = new ArrayList();
        }
        this.f37885g.add(attribute);
    }

    public void addNamespace(Namespace namespace) {
        if (this.f37886h == null) {
            this.f37886h = new ArrayList();
        }
        this.f37886h.add(namespace);
    }

    @Override // com.bea.xml.stream.events.NamedEvent, com.bea.xml.stream.events.BaseEvent
    public void doWriteAsEncodedUnicode(Writer writer) throws XMLStreamException, IOException {
        writer.write(60);
        QName name = getName();
        String prefix = name.getPrefix();
        if (prefix != null && prefix.length() > 0) {
            writer.write(prefix);
            writer.write(58);
        }
        writer.write(name.getLocalPart());
        Iterator namespaces = getNamespaces();
        while (namespaces.hasNext()) {
            writer.write(32);
            ((XMLEvent) namespaces.next()).writeAsEncodedUnicode(writer);
        }
        Iterator attributes = getAttributes();
        while (attributes.hasNext()) {
            writer.write(32);
            ((XMLEvent) attributes.next()).writeAsEncodedUnicode(writer);
        }
        writer.write(62);
    }

    @Override // javax.xml.stream.events.StartElement
    public Attribute getAttributeByName(QName qName) {
        if (qName == null) {
            return null;
        }
        Iterator attributes = getAttributes();
        while (attributes.hasNext()) {
            Attribute attribute = (Attribute) attributes.next();
            if (attribute.getName().equals(qName)) {
                return attribute;
            }
        }
        return null;
    }

    @Override // javax.xml.stream.events.StartElement
    public Iterator getAttributes() {
        List list = this.f37885g;
        return list == null ? EmptyIterator.emptyIterator : list.iterator();
    }

    @Override // javax.xml.stream.events.StartElement
    public NamespaceContext getNamespaceContext() {
        return this.f37887i;
    }

    @Override // javax.xml.stream.events.StartElement
    public String getNamespaceURI(String str) {
        NamespaceContext namespaceContext = this.f37887i;
        if (namespaceContext == null) {
            return null;
        }
        return namespaceContext.getNamespaceURI(str);
    }

    @Override // javax.xml.stream.events.StartElement
    public Iterator getNamespaces() {
        ArrayList arrayList = this.f37886h;
        return arrayList == null ? EmptyIterator.emptyIterator : arrayList.iterator();
    }

    public void init() {
        setEventType(1);
    }

    public void reset() {
        List list = this.f37885g;
        if (list != null) {
            list.clear();
        }
        ArrayList arrayList = this.f37886h;
        if (arrayList != null) {
            arrayList.clear();
        }
        if (this.f37887i != null) {
            this.f37887i = null;
        }
    }

    public void setAttributes(List list) {
        this.f37885g = list;
    }

    public void setNamespaceContext(NamespaceContext namespaceContext) {
        this.f37887i = namespaceContext;
    }

    @Override // com.bea.xml.stream.events.BaseEvent
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("<");
        stringBuffer.append(nameAsString());
        String string = stringBuffer.toString();
        Iterator attributes = getAttributes();
        while (attributes.hasNext()) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append(string);
            stringBuffer2.append(" ");
            stringBuffer2.append(attributes.next().toString());
            string = stringBuffer2.toString();
        }
        Iterator namespaces = getNamespaces();
        while (namespaces.hasNext()) {
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append(string);
            stringBuffer3.append(" ");
            stringBuffer3.append(namespaces.next().toString());
            string = stringBuffer3.toString();
        }
        StringBuffer stringBuffer4 = new StringBuffer();
        stringBuffer4.append(string);
        stringBuffer4.append(">");
        return stringBuffer4.toString();
    }

    public StartElementEvent(QName qName) {
        super(qName);
        init();
    }

    public StartElementEvent(StartElement startElement) {
        super(startElement.getName());
        init();
        setName(startElement.getName());
        Iterator attributes = startElement.getAttributes();
        while (attributes.hasNext()) {
            addAttribute((Attribute) attributes.next());
        }
        startElement.getNamespaces();
        Iterator namespaces = startElement.getNamespaces();
        while (namespaces.hasNext()) {
            addNamespace((Namespace) namespaces.next());
        }
    }
}
