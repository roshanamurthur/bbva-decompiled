package com.bea.xml.stream.events;

import com.bea.xml.stream.util.EmptyIterator;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;
import javax.xml.namespace.QName;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.Namespace;

/* JADX INFO: loaded from: classes9.dex */
public class EndElementEvent extends NamedEvent implements EndElement {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f37877g;

    public EndElementEvent() {
        init();
    }

    public void addNamespace(Namespace namespace) {
        if (this.f37877g == null) {
            this.f37877g = new ArrayList();
        }
        this.f37877g.add(namespace);
    }

    @Override // com.bea.xml.stream.events.NamedEvent, com.bea.xml.stream.events.BaseEvent
    public void doWriteAsEncodedUnicode(Writer writer) throws IOException {
        writer.write("</");
        QName name = getName();
        String prefix = name.getPrefix();
        if (prefix != null && prefix.length() > 0) {
            writer.write(prefix);
            writer.write(58);
        }
        writer.write(name.getLocalPart());
        writer.write(62);
    }

    @Override // javax.xml.stream.events.EndElement
    public Iterator getNamespaces() {
        ArrayList arrayList = this.f37877g;
        return arrayList == null ? EmptyIterator.emptyIterator : arrayList.iterator();
    }

    public void init() {
        setEventType(2);
    }

    public void reset() {
        ArrayList arrayList = this.f37877g;
        if (arrayList != null) {
            arrayList.clear();
        }
    }

    @Override // com.bea.xml.stream.events.BaseEvent
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("</");
        stringBuffer.append(nameAsString());
        String string = stringBuffer.toString();
        Iterator namespaces = getNamespaces();
        while (namespaces.hasNext()) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append(string);
            stringBuffer2.append(" ");
            stringBuffer2.append(namespaces.next().toString());
            string = stringBuffer2.toString();
        }
        StringBuffer stringBuffer3 = new StringBuffer();
        stringBuffer3.append(string);
        stringBuffer3.append(">");
        return stringBuffer3.toString();
    }

    public EndElementEvent(QName qName) {
        super(qName);
        init();
    }
}
