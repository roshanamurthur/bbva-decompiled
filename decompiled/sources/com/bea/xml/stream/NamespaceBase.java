package com.bea.xml.stream;

import javax.xml.XMLConstants;
import javax.xml.stream.events.Namespace;

/* JADX INFO: loaded from: classes9.dex */
public class NamespaceBase extends AttributeBase implements Namespace {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f37824g;

    public NamespaceBase(String str, String str2) {
        super(XMLConstants.XMLNS_ATTRIBUTE, str, str2);
        this.f37824g = false;
    }

    @Override // com.bea.xml.stream.AttributeBase, javax.xml.stream.events.XMLEvent
    public int getEventType() {
        return 13;
    }

    @Override // com.bea.xml.stream.AttributeBase, javax.xml.stream.events.Namespace
    public String getNamespaceURI() {
        return super.getValue();
    }

    @Override // javax.xml.stream.events.Namespace
    public String getPrefix() {
        return this.f37824g ? "" : super.getLocalName();
    }

    @Override // com.bea.xml.stream.AttributeBase, javax.xml.stream.events.XMLEvent
    public boolean isAttribute() {
        return false;
    }

    @Override // javax.xml.stream.events.Namespace
    public boolean isDefaultNamespaceDeclaration() {
        return this.f37824g;
    }

    @Override // com.bea.xml.stream.AttributeBase, javax.xml.stream.events.XMLEvent
    public boolean isNamespace() {
        return true;
    }

    @Override // com.bea.xml.stream.AttributeBase
    public String toString() {
        if (this.f37824g) {
            StringBuffer stringBuffer = new StringBuffer("xmlns='");
            stringBuffer.append(getNamespaceURI());
            stringBuffer.append("'");
            return stringBuffer.toString();
        }
        StringBuffer stringBuffer2 = new StringBuffer("xmlns:");
        stringBuffer2.append(getPrefix());
        stringBuffer2.append("='");
        stringBuffer2.append(getNamespaceURI());
        stringBuffer2.append("'");
        return stringBuffer2.toString();
    }

    public NamespaceBase(String str) {
        super(XMLConstants.XMLNS_ATTRIBUTE, "", str);
        this.f37824g = true;
    }
}
