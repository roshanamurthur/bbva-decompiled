package com.bea.xml.stream.events;

import com.bbva.glomohybrid.base.deeplink.extensions.DeepLinkExtensionsKt;
import java.io.IOException;
import java.io.Writer;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamException;

/* JADX INFO: loaded from: classes9.dex */
public abstract class NamedEvent extends BaseEvent {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public QName f37880f;

    public NamedEvent() {
    }

    @Override // com.bea.xml.stream.events.BaseEvent
    public abstract void doWriteAsEncodedUnicode(Writer writer) throws XMLStreamException, IOException;

    public QName getName() {
        return this.f37880f;
    }

    public String nameAsString() {
        if ("".equals(this.f37880f.getNamespaceURI())) {
            return this.f37880f.getLocalPart();
        }
        if (this.f37880f.getPrefix() == null || this.f37880f.getPrefix().equals("")) {
            StringBuffer stringBuffer = new StringBuffer("['");
            stringBuffer.append(this.f37880f.getNamespaceURI());
            stringBuffer.append("']:");
            stringBuffer.append(this.f37880f.getLocalPart());
            return stringBuffer.toString();
        }
        StringBuffer stringBuffer2 = new StringBuffer("['");
        stringBuffer2.append(this.f37880f.getNamespaceURI());
        stringBuffer2.append("']:");
        stringBuffer2.append(this.f37880f.getPrefix());
        stringBuffer2.append(DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER);
        stringBuffer2.append(this.f37880f.getLocalPart());
        return stringBuffer2.toString();
    }

    public void setName(QName qName) {
        this.f37880f = qName;
    }

    public NamedEvent(QName qName) {
        this.f37880f = qName;
    }

    public NamedEvent(String str) {
        this.f37880f = new QName(str);
    }

    public NamedEvent(String str, String str2, String str3) {
        this.f37880f = new QName(str2, str3, str);
    }
}
