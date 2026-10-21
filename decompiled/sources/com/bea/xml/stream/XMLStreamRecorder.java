package com.bea.xml.stream;

import com.bea.xml.stream.util.ElementTypeNames;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import javax.xml.XMLConstants;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import mx.openpay.library.domain.util.Constant;
import okhttp3.HttpUrl;

/* JADX INFO: loaded from: classes9.dex */
public class XMLStreamRecorder extends XMLWriterBase {
    public XMLStreamRecorder() {
    }

    public static void main(String[] strArr) throws Exception {
        XMLInputFactory xMLInputFactoryNewInstance = XMLInputFactory.newInstance();
        XMLOutputFactory.newInstance();
        XMLStreamReader xMLStreamReaderCreateXMLStreamReader = xMLInputFactoryNewInstance.createXMLStreamReader(new FileReader(strArr[0]));
        XMLStreamRecorder xMLStreamRecorder = new XMLStreamRecorder(new OutputStreamWriter(new FileOutputStream("out.stream")));
        while (xMLStreamReaderCreateXMLStreamReader.hasNext()) {
            xMLStreamRecorder.write(xMLStreamReaderCreateXMLStreamReader);
            xMLStreamReaderCreateXMLStreamReader.next();
        }
        xMLStreamRecorder.write(xMLStreamReaderCreateXMLStreamReader);
        xMLStreamRecorder.flush();
    }

    @Override // com.bea.xml.stream.XMLWriterBase
    public void closeEndTag() throws XMLStreamException {
        write(AbstractJsonLexerKt.END_LIST);
    }

    @Override // com.bea.xml.stream.XMLWriterBase
    public void closeStartTag() throws XMLStreamException {
        write("];\n");
    }

    @Override // com.bea.xml.stream.XMLWriterBase
    public void openEndTag() throws XMLStreamException {
        write(AbstractJsonLexerKt.BEGIN_LIST);
    }

    @Override // com.bea.xml.stream.XMLWriterBase
    public void openStartTag() throws XMLStreamException {
        write(AbstractJsonLexerKt.BEGIN_LIST);
    }

    @Override // com.bea.xml.stream.ReaderToWriter
    public void write(XMLStreamReader xMLStreamReader) throws XMLStreamException {
        writeType(xMLStreamReader.getEventType());
        super.write(xMLStreamReader);
        if (isOpen()) {
            return;
        }
        write(";\n");
    }

    @Override // com.bea.xml.stream.XMLWriterBase, javax.xml.stream.XMLStreamWriter
    public void writeAttribute(String str, String str2, String str3) throws XMLStreamException {
        write("[[ATTRIBUTE]");
        writeName("", str, str2);
        write("=");
        writeCharactersInternal(str3.toCharArray(), 0, str3.length(), true);
        write(Constant.BRACKET_CLOSE);
    }

    @Override // com.bea.xml.stream.XMLWriterBase, javax.xml.stream.XMLStreamWriter
    public void writeCData(String str) throws XMLStreamException {
        write(Constant.BRACKET_OPEN);
        if (str != null) {
            write(str);
        }
        write(Constant.BRACKET_CLOSE);
    }

    @Override // com.bea.xml.stream.XMLWriterBase
    public void writeCharactersInternal(char[] cArr, int i10, int i11, boolean z10) throws XMLStreamException {
        if (i11 == 0) {
            write(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
            return;
        }
        write(Constant.BRACKET_OPEN);
        write(cArr, i10, i11);
        write(Constant.BRACKET_CLOSE);
    }

    @Override // com.bea.xml.stream.XMLWriterBase, javax.xml.stream.XMLStreamWriter
    public void writeComment(String str) throws XMLStreamException {
        closeStartElement();
        write(Constant.BRACKET_OPEN);
        if (str != null) {
            write(str);
        }
        write(Constant.BRACKET_CLOSE);
    }

    @Override // com.bea.xml.stream.XMLWriterBase, javax.xml.stream.XMLStreamWriter
    public void writeDTD(String str) throws XMLStreamException {
        write(Constant.BRACKET_OPEN);
        super.write(str);
        write(Constant.BRACKET_CLOSE);
    }

    @Override // com.bea.xml.stream.XMLWriterBase, javax.xml.stream.XMLStreamWriter
    public void writeDefaultNamespace(String str) throws XMLStreamException {
        write("[[DEFAULT][");
        if (!isOpen()) {
            throw new XMLStreamException("A start element must be written before the default namespace");
        }
        write("xmlns]");
        write("=[");
        write(str);
        write(Constant.BRACKET_CLOSE);
        setPrefix("", str);
        write(AbstractJsonLexerKt.END_LIST);
    }

    @Override // com.bea.xml.stream.XMLWriterBase, javax.xml.stream.XMLStreamWriter
    public void writeEntityRef(String str) throws XMLStreamException {
        write(Constant.BRACKET_OPEN);
        super.writeEntityRef(str);
        write(Constant.BRACKET_CLOSE);
    }

    @Override // com.bea.xml.stream.XMLWriterBase
    public String writeName(String str, String str2, String str3) throws XMLStreamException {
        if ("".equals(str2)) {
            write(Constant.BRACKET_OPEN);
        } else {
            StringBuffer stringBuffer = new StringBuffer("['");
            stringBuffer.append(str2);
            stringBuffer.append("':");
            write(stringBuffer.toString());
        }
        String strWriteName = super.writeName(str, str2, str3);
        write(AbstractJsonLexerKt.END_LIST);
        return strWriteName;
    }

    @Override // com.bea.xml.stream.XMLWriterBase, javax.xml.stream.XMLStreamWriter
    public void writeNamespace(String str, String str2) throws XMLStreamException {
        if (!isOpen()) {
            throw new XMLStreamException("A start element must be written before a namespace");
        }
        if (str == null || "".equals(str) || XMLConstants.XMLNS_ATTRIBUTE.equals(str)) {
            writeDefaultNamespace(str2);
            return;
        }
        write("[[NAMESPACE][");
        write("xmlns:");
        write(str);
        write("]=[");
        write(str2);
        write(Constant.BRACKET_CLOSE);
        setPrefix(str, str2);
        write(AbstractJsonLexerKt.END_LIST);
    }

    @Override // com.bea.xml.stream.XMLWriterBase, javax.xml.stream.XMLStreamWriter
    public void writeProcessingInstruction(String str, String str2) throws XMLStreamException {
        closeStartElement();
        write(Constant.BRACKET_OPEN);
        if (str != null) {
            StringBuffer stringBuffer = new StringBuffer(Constant.BRACKET_OPEN);
            stringBuffer.append(str);
            stringBuffer.append(Constant.BRACKET_CLOSE);
            write(stringBuffer.toString());
        }
        if (str2 != null) {
            StringBuffer stringBuffer2 = new StringBuffer(",[");
            stringBuffer2.append(str2);
            stringBuffer2.append(Constant.BRACKET_CLOSE);
            write(stringBuffer2.toString());
        }
        write(Constant.BRACKET_CLOSE);
    }

    @Override // com.bea.xml.stream.XMLWriterBase, javax.xml.stream.XMLStreamWriter
    public void writeStartDocument() throws XMLStreamException {
        write("[[1.0],[utf-8]]");
    }

    public void writeType(int i10) throws XMLStreamException {
        closeStartElement();
        write(AbstractJsonLexerKt.BEGIN_LIST);
        write(ElementTypeNames.getEventTypeString(i10));
        write(AbstractJsonLexerKt.END_LIST);
    }

    public XMLStreamRecorder(Writer writer) {
        super(writer);
    }

    @Override // com.bea.xml.stream.XMLWriterBase, javax.xml.stream.XMLStreamWriter
    public void writeStartDocument(String str) throws XMLStreamException {
        write("[[");
        write(str);
        write("],[utf-8]]");
    }

    @Override // com.bea.xml.stream.XMLWriterBase, javax.xml.stream.XMLStreamWriter
    public void writeStartDocument(String str, String str2) throws XMLStreamException {
        write("[[");
        write(str2);
        write("],[");
        write(str);
        write("]]");
    }
}
