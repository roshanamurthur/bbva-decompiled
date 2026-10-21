package com.bea.xml.stream;

import javax.xml.namespace.NamespaceContext;
import javax.xml.namespace.QName;
import javax.xml.stream.Location;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

/* JADX INFO: loaded from: classes9.dex */
public class ReaderDelegate implements XMLStreamReader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public XMLStreamReader f37827a;

    public ReaderDelegate(XMLStreamReader xMLStreamReader) {
        this.f37827a = xMLStreamReader;
    }

    @Override // javax.xml.stream.XMLStreamReader
    public void close() throws XMLStreamException {
        this.f37827a.close();
    }

    @Override // javax.xml.stream.XMLStreamReader
    public int getAttributeCount() {
        return this.f37827a.getAttributeCount();
    }

    @Override // javax.xml.stream.XMLStreamReader
    public String getAttributeLocalName(int i10) {
        return this.f37827a.getAttributeLocalName(i10);
    }

    @Override // javax.xml.stream.XMLStreamReader
    public QName getAttributeName(int i10) {
        return this.f37827a.getAttributeName(i10);
    }

    @Override // javax.xml.stream.XMLStreamReader
    public String getAttributeNamespace(int i10) {
        return this.f37827a.getAttributeNamespace(i10);
    }

    @Override // javax.xml.stream.XMLStreamReader
    public String getAttributePrefix(int i10) {
        return this.f37827a.getAttributePrefix(i10);
    }

    @Override // javax.xml.stream.XMLStreamReader
    public String getAttributeType(int i10) {
        return this.f37827a.getAttributeType(i10);
    }

    @Override // javax.xml.stream.XMLStreamReader
    public String getAttributeValue(String str, String str2) {
        return this.f37827a.getAttributeValue(str, str2);
    }

    @Override // javax.xml.stream.XMLStreamReader
    public String getCharacterEncodingScheme() {
        return this.f37827a.getCharacterEncodingScheme();
    }

    public XMLStreamReader getDelegate() {
        return this.f37827a;
    }

    @Override // javax.xml.stream.XMLStreamReader
    public String getElementText() throws XMLStreamException {
        return this.f37827a.getElementText();
    }

    @Override // javax.xml.stream.XMLStreamReader
    public String getEncoding() {
        return this.f37827a.getEncoding();
    }

    @Override // javax.xml.stream.XMLStreamReader
    public int getEventType() {
        return this.f37827a.getEventType();
    }

    @Override // javax.xml.stream.XMLStreamReader
    public String getLocalName() {
        return this.f37827a.getLocalName();
    }

    @Override // javax.xml.stream.XMLStreamReader
    public Location getLocation() {
        return this.f37827a.getLocation();
    }

    @Override // javax.xml.stream.XMLStreamReader
    public QName getName() {
        return this.f37827a.getName();
    }

    @Override // javax.xml.stream.XMLStreamReader
    public NamespaceContext getNamespaceContext() {
        return this.f37827a.getNamespaceContext();
    }

    @Override // javax.xml.stream.XMLStreamReader
    public int getNamespaceCount() {
        return this.f37827a.getNamespaceCount();
    }

    @Override // javax.xml.stream.XMLStreamReader
    public String getNamespacePrefix(int i10) {
        return this.f37827a.getNamespacePrefix(i10);
    }

    @Override // javax.xml.stream.XMLStreamReader
    public String getNamespaceURI(String str) {
        return this.f37827a.getNamespaceURI(str);
    }

    @Override // javax.xml.stream.XMLStreamReader
    public String getPIData() {
        return this.f37827a.getPIData();
    }

    @Override // javax.xml.stream.XMLStreamReader
    public String getPITarget() {
        return this.f37827a.getPITarget();
    }

    @Override // javax.xml.stream.XMLStreamReader
    public String getPrefix() {
        return this.f37827a.getPrefix();
    }

    @Override // javax.xml.stream.XMLStreamReader
    public Object getProperty(String str) {
        return this.f37827a.getProperty(str);
    }

    @Override // javax.xml.stream.XMLStreamReader
    public String getText() {
        return this.f37827a.getText();
    }

    @Override // javax.xml.stream.XMLStreamReader
    public int getTextCharacters(int i10, char[] cArr, int i11, int i12) throws XMLStreamException {
        return this.f37827a.getTextCharacters(i10, cArr, i11, i12);
    }

    @Override // javax.xml.stream.XMLStreamReader
    public int getTextLength() {
        return this.f37827a.getTextLength();
    }

    @Override // javax.xml.stream.XMLStreamReader
    public int getTextStart() {
        return this.f37827a.getTextStart();
    }

    @Override // javax.xml.stream.XMLStreamReader
    public String getVersion() {
        return this.f37827a.getVersion();
    }

    @Override // javax.xml.stream.XMLStreamReader
    public boolean hasName() {
        return this.f37827a.hasName();
    }

    @Override // javax.xml.stream.XMLStreamReader
    public boolean hasNext() throws XMLStreamException {
        return this.f37827a.hasNext();
    }

    @Override // javax.xml.stream.XMLStreamReader
    public boolean hasText() {
        return this.f37827a.hasText();
    }

    @Override // javax.xml.stream.XMLStreamReader
    public boolean isAttributeSpecified(int i10) {
        return this.f37827a.isAttributeSpecified(i10);
    }

    @Override // javax.xml.stream.XMLStreamReader
    public boolean isCharacters() {
        return this.f37827a.isCharacters();
    }

    @Override // javax.xml.stream.XMLStreamReader
    public boolean isEndElement() {
        return this.f37827a.isEndElement();
    }

    @Override // javax.xml.stream.XMLStreamReader
    public boolean isStandalone() {
        return this.f37827a.isStandalone();
    }

    @Override // javax.xml.stream.XMLStreamReader
    public boolean isStartElement() {
        return this.f37827a.isStartElement();
    }

    @Override // javax.xml.stream.XMLStreamReader
    public boolean isWhiteSpace() {
        return this.f37827a.isWhiteSpace();
    }

    @Override // javax.xml.stream.XMLStreamReader
    public int next() throws XMLStreamException {
        return this.f37827a.next();
    }

    @Override // javax.xml.stream.XMLStreamReader
    public int nextTag() throws XMLStreamException {
        return this.f37827a.nextTag();
    }

    @Override // javax.xml.stream.XMLStreamReader
    public void require(int i10, String str, String str2) throws XMLStreamException {
        this.f37827a.require(i10, str, str2);
    }

    public void setDelegate(XMLStreamReader xMLStreamReader) {
        this.f37827a = xMLStreamReader;
    }

    @Override // javax.xml.stream.XMLStreamReader
    public boolean standaloneSet() {
        return this.f37827a.standaloneSet();
    }

    @Override // javax.xml.stream.XMLStreamReader
    public String getAttributeValue(int i10) {
        return this.f37827a.getAttributeValue(i10);
    }

    @Override // javax.xml.stream.XMLStreamReader
    public String getNamespaceURI(int i10) {
        return this.f37827a.getNamespaceURI(i10);
    }

    @Override // javax.xml.stream.XMLStreamReader
    public char[] getTextCharacters() {
        return this.f37827a.getTextCharacters();
    }

    @Override // javax.xml.stream.XMLStreamReader
    public String getNamespaceURI() {
        return this.f37827a.getNamespaceURI();
    }
}
