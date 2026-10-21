package com.bea.xml.stream;

import com.bbva.glomohybrid.base.deeplink.extensions.DeepLinkExtensionsKt;
import java.io.IOException;
import java.io.Writer;
import javax.xml.namespace.QName;
import javax.xml.stream.Location;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;

/* JADX INFO: loaded from: classes9.dex */
public class AttributeBase implements Attribute, Location {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public QName f37798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f37799c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f37800d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f37801e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f37802f = 0;

    public AttributeBase(String str, String str2, String str3, String str4, String str5) {
        this.f37798b = new QName(str2, str3, str == null ? "" : str);
        this.f37797a = str4;
        new QName(str5);
    }

    public static void writeEncodedChar(Writer writer, char c10) throws IOException {
        writer.write("&#");
        writer.write(Integer.toString(c10));
        writer.write(59);
    }

    @Override // javax.xml.stream.events.XMLEvent
    public Characters asCharacters() {
        throw new ClassCastException("cannnot cast AttributeBase to Characters");
    }

    @Override // javax.xml.stream.events.XMLEvent
    public EndElement asEndElement() {
        throw new ClassCastException("cannnot cast AttributeBase to EndElement");
    }

    @Override // javax.xml.stream.events.XMLEvent
    public StartElement asStartElement() {
        throw new ClassCastException("cannnot cast AttributeBase to StartElement");
    }

    @Override // javax.xml.stream.Location
    public int getCharacterOffset() {
        return this.f37802f;
    }

    @Override // javax.xml.stream.Location
    public int getColumnNumber() {
        return this.f37801e;
    }

    @Override // javax.xml.stream.events.Attribute
    public String getDTDType() {
        return "CDATA";
    }

    @Override // javax.xml.stream.events.XMLEvent
    public int getEventType() {
        return 10;
    }

    @Override // javax.xml.stream.Location
    public int getLineNumber() {
        return this.f37800d;
    }

    public String getLocalName() {
        return this.f37798b.getLocalPart();
    }

    public String getLocationURI() {
        return this.f37799c;
    }

    @Override // javax.xml.stream.events.Attribute
    public QName getName() {
        return this.f37798b;
    }

    public String getNamespaceURI() {
        return this.f37798b.getNamespaceURI();
    }

    @Override // javax.xml.stream.Location
    public String getPublicId() {
        return null;
    }

    @Override // javax.xml.stream.events.XMLEvent
    public QName getSchemaType() {
        return null;
    }

    public String getSourceName() {
        return null;
    }

    @Override // javax.xml.stream.Location
    public String getSystemId() {
        return null;
    }

    @Override // javax.xml.stream.events.Attribute
    public String getValue() {
        return this.f37797a;
    }

    public boolean hasName() {
        return this.f37798b != null;
    }

    @Override // javax.xml.stream.events.XMLEvent
    public boolean isAttribute() {
        return true;
    }

    @Override // javax.xml.stream.events.XMLEvent
    public boolean isCharacters() {
        return false;
    }

    public boolean isDefault() {
        return true;
    }

    @Override // javax.xml.stream.events.XMLEvent
    public boolean isEndDocument() {
        return false;
    }

    @Override // javax.xml.stream.events.XMLEvent
    public boolean isEndElement() {
        return false;
    }

    public boolean isEndEntity() {
        return false;
    }

    @Override // javax.xml.stream.events.XMLEvent
    public boolean isEntityReference() {
        return false;
    }

    @Override // javax.xml.stream.events.XMLEvent
    public boolean isNamespace() {
        return false;
    }

    public boolean isNamespaceDeclaration() {
        return false;
    }

    @Override // javax.xml.stream.events.XMLEvent
    public boolean isProcessingInstruction() {
        return false;
    }

    @Override // javax.xml.stream.events.Attribute
    public boolean isSpecified() {
        return true;
    }

    @Override // javax.xml.stream.events.XMLEvent
    public boolean isStartDocument() {
        return false;
    }

    @Override // javax.xml.stream.events.XMLEvent
    public boolean isStartElement() {
        return false;
    }

    public boolean isStartEntity() {
        return false;
    }

    public void setCharacterOffset(int i10) {
        this.f37802f = i10;
    }

    public void setColumnNumber(int i10) {
        this.f37801e = i10;
    }

    public void setLineNumber(int i10) {
        this.f37800d = i10;
    }

    public void setLocationURI(String str) {
        this.f37799c = str;
    }

    public void setNamespaceURI(String str) {
        this.f37798b = new QName(str, this.f37798b.getLocalPart());
    }

    public String toString() {
        String prefix = this.f37798b.getPrefix();
        String str = this.f37797a;
        if (prefix == null || this.f37798b.getPrefix().equals("")) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(this.f37798b.getLocalPart());
            stringBuffer.append("='");
            stringBuffer.append(str);
            stringBuffer.append("'");
            return stringBuffer.toString();
        }
        StringBuffer stringBuffer2 = new StringBuffer("['");
        stringBuffer2.append(this.f37798b.getNamespaceURI());
        stringBuffer2.append("']:");
        stringBuffer2.append(this.f37798b.getPrefix());
        stringBuffer2.append(DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER);
        stringBuffer2.append(this.f37798b.getLocalPart());
        stringBuffer2.append("='");
        stringBuffer2.append(str);
        stringBuffer2.append("'");
        return stringBuffer2.toString();
    }

    @Override // javax.xml.stream.events.XMLEvent
    public void writeAsEncodedUnicode(Writer writer) throws XMLStreamException {
        char cCharAt;
        try {
            String prefix = this.f37798b.getPrefix();
            if (prefix != null && prefix.length() > 0) {
                writer.write(prefix);
                writer.write(58);
            }
            writer.write(this.f37798b.getLocalPart());
            writer.write("=\"");
            String str = this.f37797a;
            int length = str.length();
            if (length > 0) {
                int i10 = 0;
                while (i10 < length && (cCharAt = str.charAt(i10)) != '\"' && cCharAt != '&' && cCharAt != '<' && cCharAt >= ' ') {
                    i10++;
                }
                if (i10 == length) {
                    writer.write(str);
                } else {
                    if (i10 > 0) {
                        writer.write(str, 0, i10);
                    }
                    while (i10 < length) {
                        char cCharAt2 = str.charAt(i10);
                        if (cCharAt2 == '\"') {
                            writer.write("&quot;");
                        } else if (cCharAt2 == '&') {
                            writer.write("&amp;");
                        } else if (cCharAt2 == '<') {
                            writer.write("&lt;");
                        } else if (cCharAt2 < ' ') {
                            writeEncodedChar(writer, cCharAt2);
                        } else {
                            writer.write(cCharAt2);
                        }
                        i10++;
                    }
                }
            }
            writer.write(34);
        } catch (IOException e5) {
            throw new XMLStreamException(e5);
        }
    }

    public AttributeBase(String str, String str2, String str3) {
        this.f37798b = new QName("", str2, str == null ? "" : str);
        this.f37797a = str3;
    }

    public AttributeBase(QName qName, String str) {
        this.f37798b = qName;
        this.f37797a = str;
    }

    @Override // javax.xml.stream.events.XMLEvent
    public Location getLocation() {
        return this;
    }

    public void recycle() {
    }
}
