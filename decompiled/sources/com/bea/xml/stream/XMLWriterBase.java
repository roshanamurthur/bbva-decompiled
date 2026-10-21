package com.bea.xml.stream;

import com.bbva.glomohybrid.base.deeplink.extensions.DeepLinkExtensionsKt;
import com.bbva.tohu.android.product.valkyria.sdk.logic.ReplenishLogic;
import com.bea.xml.stream.util.NamespaceContextImpl;
import com.bea.xml.stream.util.Stack;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.HashSet;
import javax.xml.XMLConstants;
import javax.xml.namespace.NamespaceContext;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes9.dex */
public class XMLWriterBase extends ReaderToWriter implements XMLStreamWriter {
    protected static final String DEFAULTNS = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Writer f37854b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ConfigurationContextBase f37857e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CharsetEncoder f37858f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public HashSet f37862j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f37863k;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f37855c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f37856d = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Stack f37859g = new Stack();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Stack f37860h = new Stack();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Stack f37861i = new Stack();
    protected NamespaceContextImpl context = new NamespaceContextImpl();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f37864l = 0;
    public final HashSet m = new HashSet();

    public XMLWriterBase() {
    }

    public static void main(String[] strArr) throws Exception {
        XMLOutputFactory xMLOutputFactoryNewInstance = XMLOutputFactory.newInstance();
        xMLOutputFactoryNewInstance.setProperty(XMLOutputFactory.IS_REPAIRING_NAMESPACES, new Boolean(true));
        XMLStreamWriter xMLStreamWriterCreateXMLStreamWriter = xMLOutputFactoryNewInstance.createXMLStreamWriter(new OutputStreamWriter(new FileOutputStream("tmp"), "us-ascii"));
        xMLStreamWriterCreateXMLStreamWriter.writeStartDocument();
        xMLStreamWriterCreateXMLStreamWriter.setPrefix("c", "http://c");
        xMLStreamWriterCreateXMLStreamWriter.setDefaultNamespace("http://d");
        xMLStreamWriterCreateXMLStreamWriter.writeStartElement("http://c", "a");
        xMLStreamWriterCreateXMLStreamWriter.writeAttribute("b", "blah");
        xMLStreamWriterCreateXMLStreamWriter.writeEmptyElement("http://c", "d");
        xMLStreamWriterCreateXMLStreamWriter.writeEmptyElement("http://d", "e");
        xMLStreamWriterCreateXMLStreamWriter.writeEmptyElement("http://e", "f");
        xMLStreamWriterCreateXMLStreamWriter.writeEmptyElement("http://f", "g");
        xMLStreamWriterCreateXMLStreamWriter.writeAttribute("http://c", "chris", "fry");
        xMLStreamWriterCreateXMLStreamWriter.writeCharacters("foo bar foo");
        xMLStreamWriterCreateXMLStreamWriter.writeCharacters("bad char coming[");
        xMLStreamWriterCreateXMLStreamWriter.writeCharacters("$");
        xMLStreamWriterCreateXMLStreamWriter.writeCharacters(Constant.BRACKET_CLOSE);
        xMLStreamWriterCreateXMLStreamWriter.writeEndElement();
        xMLStreamWriterCreateXMLStreamWriter.flush();
    }

    public final void a(String str) throws XMLStreamException {
        if (this.f37863k && !"".equals(str) && getPrefix(str) == null) {
            this.f37864l++;
            StringBuffer stringBuffer = new StringBuffer("ns");
            stringBuffer.append(this.f37864l);
            setPrefix(stringBuffer.toString(), str);
        }
    }

    @Override // javax.xml.stream.XMLStreamWriter
    public void close() throws XMLStreamException {
        flush();
    }

    public void closeEndTag() throws XMLStreamException {
        write(">");
    }

    public void closeStartElement() throws XMLStreamException {
        if (this.f37855c) {
            closeStartTag();
            this.f37855c = false;
        }
    }

    public void closeStartTag() throws XMLStreamException {
        HashSet<String> hashSet;
        if (this.f37863k && (hashSet = this.f37862j) != null) {
            for (String str : hashSet) {
                String prefix = this.context.getPrefix(str);
                if (prefix == null) {
                    StringBuffer stringBuffer = new StringBuffer("Unable to default prefix with uri:");
                    stringBuffer.append(str);
                    throw new XMLStreamException(stringBuffer.toString());
                }
                writeNamespace(prefix, str);
            }
            this.f37862j.clear();
        }
        this.m.clear();
        if (!this.f37856d) {
            write(">");
        } else {
            write("/>");
            this.f37856d = false;
        }
    }

    @Override // javax.xml.stream.XMLStreamWriter
    public void flush() throws XMLStreamException {
        try {
            this.f37854b.flush();
        } catch (IOException e5) {
            throw new XMLStreamException(e5);
        }
    }

    @Override // javax.xml.stream.XMLStreamWriter
    public NamespaceContext getNamespaceContext() {
        return this.context;
    }

    @Override // javax.xml.stream.XMLStreamWriter
    public String getPrefix(String str) throws XMLStreamException {
        return this.context.getPrefix(str);
    }

    @Override // javax.xml.stream.XMLStreamWriter
    public Object getProperty(String str) throws IllegalArgumentException {
        return this.f37857e.getProperty(str);
    }

    public String getURIInternal(String str) {
        String namespaceURI = this.context.getNamespaceURI(str);
        return namespaceURI == null ? "" : namespaceURI;
    }

    public boolean isOpen() {
        return this.f37855c;
    }

    public void openEndTag() throws XMLStreamException {
        write("</");
    }

    public void openStartTag() throws XMLStreamException {
        write("<");
    }

    public void setConfigurationContext(ConfigurationContextBase configurationContextBase) {
        this.f37857e = configurationContextBase;
        this.f37863k = configurationContextBase.isPrefixDefaulting();
    }

    @Override // javax.xml.stream.XMLStreamWriter
    public void setDefaultNamespace(String str) throws XMLStreamException {
        if (this.f37862j == null) {
            this.f37862j = new HashSet();
        }
        this.f37862j.contains(str);
        this.f37862j.add(str);
        this.context.bindDefaultNameSpace(str);
    }

    @Override // javax.xml.stream.XMLStreamWriter
    public void setNamespaceContext(NamespaceContext namespaceContext) throws XMLStreamException {
        if (namespaceContext == null) {
            throw new NullPointerException("The namespace  context may not be null.");
        }
        this.context = new NamespaceContextImpl(namespaceContext);
    }

    @Override // javax.xml.stream.XMLStreamWriter
    public void setPrefix(String str, String str2) throws XMLStreamException {
        if (this.f37862j == null) {
            this.f37862j = new HashSet();
        }
        this.f37862j.contains(str2);
        this.f37862j.add(str2);
        this.context.bindNamespace(str, str2);
    }

    public void setWriter(Writer writer) {
        this.f37854b = writer;
        setStreamWriter(this);
        if (writer instanceof OutputStreamWriter) {
            this.f37858f = Charset.forName(((OutputStreamWriter) writer).getEncoding()).newEncoder();
        } else {
            this.f37858f = null;
        }
    }

    public void write(String str) throws XMLStreamException {
        try {
            this.f37854b.write(str);
        } catch (IOException e5) {
            throw new XMLStreamException(e5);
        }
    }

    @Override // javax.xml.stream.XMLStreamWriter
    public void writeAttribute(String str, String str2) throws XMLStreamException {
        writeAttribute("", str, str2);
    }

    public void writeCData(String str) throws XMLStreamException {
        closeStartElement();
        write("<![CDATA[");
        if (str != null) {
            write(str);
        }
        write("]]>");
    }

    @Override // javax.xml.stream.XMLStreamWriter
    public void writeCharacters(String str) throws XMLStreamException {
        closeStartElement();
        writeCharactersInternal(str.toCharArray(), 0, str.length(), false);
    }

    /* JADX WARN: Code duplicated, block: B:50:0x009f  */
    public void writeCharactersInternal(char[] cArr, int i10, int i11, boolean z10) throws XMLStreamException {
        CharsetEncoder charsetEncoder;
        CharsetEncoder charsetEncoder2;
        if (i11 == 0) {
            return;
        }
        int i12 = 0;
        while (i12 < i11) {
            char c10 = cArr[i12 + i10];
            if (c10 != '\"') {
                if (c10 == '&' || c10 == '<' || c10 == '>') {
                    break;
                }
                if (c10 >= ' ') {
                    if (c10 > 127 && (charsetEncoder2 = this.f37858f) != null && !charsetEncoder2.canEncode(c10)) {
                        break;
                    } else {
                        i12++;
                    }
                } else if (z10 || !(c10 == '\t' || c10 == '\n')) {
                    break;
                } else {
                    i12++;
                }
            } else if (z10) {
                break;
            } else {
                i12++;
            }
        }
        if (i12 >= i11) {
            write(cArr, i10, i11);
            return;
        }
        for (int i13 = 0; i13 < i11; i13++) {
            char c11 = cArr[i13 + i10];
            if (c11 != '\"') {
                if (c11 == '&') {
                    write("&amp;");
                } else if (c11 == '<') {
                    write("&lt;");
                } else if (c11 == '>') {
                    write("&gt;");
                } else if (c11 < ' ') {
                    if (z10 || !(c11 == '\t' || c11 == '\n')) {
                        write("&#");
                        write(Integer.toString(c11));
                        write(';');
                    } else {
                        write(c11);
                    }
                } else if (c11 <= 127 || (charsetEncoder = this.f37858f) == null || charsetEncoder.canEncode(c11)) {
                    write(c11);
                } else {
                    write("&#");
                    write(Integer.toString(c11));
                    write(';');
                }
            } else if (z10) {
                write("&quot;");
            } else {
                write(c11);
            }
        }
    }

    public void writeComment(String str) throws XMLStreamException {
        closeStartElement();
        write("<!--");
        if (str != null) {
            write(str);
        }
        write("-->");
    }

    public void writeDTD(String str) throws XMLStreamException {
        write(str);
    }

    public void writeDefaultNamespace(String str) throws XMLStreamException {
        if (!isOpen()) {
            throw new XMLStreamException("A start element must be written before the default namespace");
        }
        HashSet hashSet = this.m;
        boolean z10 = !hashSet.contains("");
        if (z10) {
            hashSet.add("");
        }
        if (z10) {
            write(" xmlns");
            write("=\"");
            write(str);
            write("\"");
            setPrefix("", str);
        }
    }

    @Override // javax.xml.stream.XMLStreamWriter
    public void writeEmptyElement(String str, String str2) throws XMLStreamException {
        if (this.f37855c) {
            closeStartTag();
        } else {
            this.f37855c = true;
        }
        a(str);
        this.f37856d = true;
        write("<");
        writeName("", str, str2);
    }

    @Override // javax.xml.stream.XMLStreamWriter
    public void writeEndDocument() throws XMLStreamException {
        while (!this.f37859g.isEmpty()) {
            writeEndElement();
        }
    }

    @Override // javax.xml.stream.XMLStreamWriter
    public void writeEndElement() throws XMLStreamException {
        if (isOpen()) {
            closeStartElement();
        }
        String str = (String) this.f37860h.pop();
        String str2 = (String) this.f37859g.pop();
        this.f37861i.pop();
        openEndTag();
        writeName(str, "", str2);
        closeEndTag();
        this.context.closeScope();
    }

    public void writeEntityRef(String str) throws XMLStreamException {
        closeStartElement();
        write("&");
        write(str);
        write(ReplenishLogic.ID_SEPARATOR);
    }

    public String writeName(String str, String str2, String str3) throws XMLStreamException {
        if (!"".equals(str2) && (str = this.context.getPrefix(str2)) == null) {
            str = "";
        }
        if (!"".equals(str)) {
            write(str);
            write(DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER);
        }
        write(str3);
        return str;
    }

    public void writeNamespace(String str, String str2) throws XMLStreamException {
        if (!isOpen()) {
            throw new XMLStreamException("A start element must be written before a namespace");
        }
        if (str == null || "".equals(str) || XMLConstants.XMLNS_ATTRIBUTE.equals(str)) {
            writeDefaultNamespace(str2);
            return;
        }
        HashSet hashSet = this.m;
        boolean z10 = !hashSet.contains(str);
        if (z10) {
            hashSet.add(str);
        }
        if (z10) {
            write(" xmlns:");
            write(str);
            write("=\"");
            write(str2);
            write("\"");
            setPrefix(str, str2);
        }
    }

    @Override // javax.xml.stream.XMLStreamWriter
    public void writeProcessingInstruction(String str) throws XMLStreamException {
        closeStartElement();
        writeProcessingInstruction(str, null);
    }

    public void writeRaw(String str) throws XMLStreamException {
        closeStartElement();
        write(str);
    }

    public void writeStartDocument() throws XMLStreamException {
        write("<?xml version='1.0' encoding='utf-8'?>");
    }

    @Override // javax.xml.stream.XMLStreamWriter
    public void writeStartElement(String str, String str2) throws XMLStreamException {
        this.context.openScope();
        writeStartElementInternal(str, str2);
    }

    public void writeStartElementInternal(String str, String str2) throws XMLStreamException {
        if (str == null) {
            throw new IllegalArgumentException("The namespace URI may not be null");
        }
        if (str2 == null) {
            throw new IllegalArgumentException("The local name  may not be null");
        }
        if (this.f37855c) {
            closeStartTag();
        } else {
            this.f37855c = true;
        }
        openStartTag();
        a(str);
        this.f37860h.push(writeName("", str, str2));
        this.f37859g.push(str2);
        this.f37861i.push(str);
    }

    public void writeAttribute(String str, String str2, String str3) throws XMLStreamException {
        if (!isOpen()) {
            throw new XMLStreamException("A start element must be written before an attribute");
        }
        a(str);
        write(" ");
        writeName("", str, str2);
        write("=\"");
        writeCharactersInternal(str3.toCharArray(), 0, str3.length(), true);
        write("\"");
    }

    public void writeStartDocument(String str) throws XMLStreamException {
        write("<?xml version='");
        write(str);
        write("'?>");
    }

    public void write(char c10) throws XMLStreamException {
        try {
            this.f37854b.write(c10);
        } catch (IOException e5) {
            throw new XMLStreamException(e5);
        }
    }

    @Override // javax.xml.stream.XMLStreamWriter
    public void writeCharacters(char[] cArr, int i10, int i11) throws XMLStreamException {
        closeStartElement();
        writeCharactersInternal(cArr, i10, i11, false);
    }

    public void writeProcessingInstruction(String str, String str2) throws XMLStreamException {
        closeStartElement();
        write("<?");
        if (str != null) {
            write(str);
        }
        if (str2 != null) {
            write(' ');
            write(str2);
        }
        write("?>");
    }

    @Override // javax.xml.stream.XMLStreamWriter
    public void writeStartElement(String str, String str2, String str3) throws XMLStreamException {
        if (str3 == null) {
            throw new IllegalArgumentException("The namespace URI may not be null");
        }
        if (str2 == null) {
            throw new IllegalArgumentException("The local name may not be null");
        }
        if (str != null) {
            this.context.openScope();
            a(str3);
            this.context.bindNamespace(str, str3);
            writeStartElementInternal(str3, str2);
            return;
        }
        throw new IllegalArgumentException("The prefix may not be null");
    }

    public void write(char[] cArr) throws XMLStreamException {
        try {
            this.f37854b.write(cArr);
        } catch (IOException e5) {
            throw new XMLStreamException(e5);
        }
    }

    public void writeStartDocument(String str, String str2) throws XMLStreamException {
        write("<?xml version='");
        write(str2);
        write("' encoding='");
        write(str);
        write("'?>");
    }

    public void write(char[] cArr, int i10, int i11) throws XMLStreamException {
        try {
            this.f37854b.write(cArr, i10, i11);
        } catch (IOException e5) {
            throw new XMLStreamException(e5);
        }
    }

    @Override // javax.xml.stream.XMLStreamWriter
    public void writeEmptyElement(String str, String str2, String str3) throws XMLStreamException {
        if (this.f37855c) {
            closeStartTag();
        } else {
            this.f37855c = true;
        }
        a(str3);
        this.f37856d = true;
        write("<");
        write(str);
        write(DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER);
        write(str2);
    }

    public XMLWriterBase(Writer writer) {
        this.f37854b = writer;
        setWriter(writer);
    }

    @Override // javax.xml.stream.XMLStreamWriter
    public void writeAttribute(String str, String str2, String str3, String str4) throws XMLStreamException {
        if (isOpen()) {
            a(str2);
            this.context.bindNamespace(str, str2);
            write(" ");
            writeName(str, str2, str3);
            write("=\"");
            writeCharactersInternal(str4.toCharArray(), 0, str4.length(), true);
            write("\"");
            return;
        }
        throw new XMLStreamException("A start element must be written before an attribute");
    }

    @Override // javax.xml.stream.XMLStreamWriter
    public void writeStartElement(String str) throws XMLStreamException {
        this.context.openScope();
        writeStartElement("", str);
    }

    @Override // javax.xml.stream.XMLStreamWriter
    public void writeEmptyElement(String str) throws XMLStreamException {
        writeEmptyElement("", str);
    }
}
