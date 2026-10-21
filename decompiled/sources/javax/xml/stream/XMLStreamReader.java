package javax.xml.stream;

import javax.xml.namespace.NamespaceContext;
import javax.xml.namespace.QName;

/* JADX INFO: loaded from: classes12.dex */
public interface XMLStreamReader extends XMLStreamConstants {
    void close() throws XMLStreamException;

    int getAttributeCount();

    String getAttributeLocalName(int i10);

    QName getAttributeName(int i10);

    String getAttributeNamespace(int i10);

    String getAttributePrefix(int i10);

    String getAttributeType(int i10);

    String getAttributeValue(int i10);

    String getAttributeValue(String str, String str2);

    String getCharacterEncodingScheme();

    String getElementText() throws XMLStreamException;

    String getEncoding();

    int getEventType();

    String getLocalName();

    Location getLocation();

    QName getName();

    NamespaceContext getNamespaceContext();

    int getNamespaceCount();

    String getNamespacePrefix(int i10);

    String getNamespaceURI();

    String getNamespaceURI(int i10);

    String getNamespaceURI(String str);

    String getPIData();

    String getPITarget();

    String getPrefix();

    Object getProperty(String str) throws IllegalArgumentException;

    String getText();

    int getTextCharacters(int i10, char[] cArr, int i11, int i12) throws XMLStreamException;

    char[] getTextCharacters();

    int getTextLength();

    int getTextStart();

    String getVersion();

    boolean hasName();

    boolean hasNext() throws XMLStreamException;

    boolean hasText();

    boolean isAttributeSpecified(int i10);

    boolean isCharacters();

    boolean isEndElement();

    boolean isStandalone();

    boolean isStartElement();

    boolean isWhiteSpace();

    int next() throws XMLStreamException;

    int nextTag() throws XMLStreamException;

    void require(int i10, String str, String str2) throws XMLStreamException;

    boolean standaloneSet();
}
