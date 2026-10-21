package com.bea.xml.stream;

import com.bea.xml.stream.util.ElementTypeNames;
import java.io.FileReader;
import java.io.PrintStream;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes9.dex */
public class SubReader extends ReaderDelegate {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f37841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f37842c;

    public SubReader(XMLStreamReader xMLStreamReader) throws XMLStreamException {
        super(xMLStreamReader);
        this.f37841b = 0;
        this.f37842c = true;
        if (!xMLStreamReader.isStartElement()) {
            throw new XMLStreamException("Unable to instantiate a subReader because the underlying reader was not on a start element.");
        }
        this.f37842c = true;
        this.f37841b++;
    }

    public static void main(String[] strArr) throws Exception {
        MXParser mXParser = new MXParser();
        mXParser.setInput(new FileReader(strArr[0]));
        mXParser.moveToStartElement();
        mXParser.next();
        while (mXParser.moveToStartElement()) {
            PrintStream printStream = System.out;
            StringBuffer stringBuffer = new StringBuffer("SE->");
            stringBuffer.append(mXParser.getName());
            printStream.println(stringBuffer.toString());
            sub(mXParser.subReader(), 1);
        }
    }

    public static void print(XMLStreamReader xMLStreamReader, int i10) throws XMLStreamException {
        PrintStream printStream = System.out;
        StringBuffer stringBuffer = new StringBuffer(Constant.BRACKET_OPEN);
        stringBuffer.append(i10);
        stringBuffer.append("]Sub: ");
        stringBuffer.append(ElementTypeNames.getEventTypeString(xMLStreamReader.getEventType()));
        printStream.print(stringBuffer.toString());
        if (xMLStreamReader.hasName()) {
            StringBuffer stringBuffer2 = new StringBuffer("->");
            stringBuffer2.append(xMLStreamReader.getLocalName());
            printStream.println(stringBuffer2.toString());
        } else {
            if (!xMLStreamReader.hasText()) {
                printStream.println();
                return;
            }
            StringBuffer stringBuffer3 = new StringBuffer("->[");
            stringBuffer3.append(xMLStreamReader.getText());
            stringBuffer3.append(Constant.BRACKET_CLOSE);
            printStream.println(stringBuffer3.toString());
        }
    }

    public static void sub(XMLStreamReader xMLStreamReader, int i10) throws Exception {
        while (xMLStreamReader.hasNext()) {
            print(xMLStreamReader, i10);
            xMLStreamReader.next();
        }
    }

    @Override // com.bea.xml.stream.ReaderDelegate, javax.xml.stream.XMLStreamReader
    public boolean hasNext() throws XMLStreamException {
        if (this.f37842c) {
            return super.hasNext();
        }
        return false;
    }

    public boolean moveToEndElement() throws XMLStreamException {
        if (isEndElement()) {
            return true;
        }
        while (hasNext()) {
            if (isEndElement()) {
                return true;
            }
            next();
        }
        return false;
    }

    public boolean moveToStartElement() throws XMLStreamException {
        if (isStartElement()) {
            return true;
        }
        while (hasNext()) {
            if (isStartElement()) {
                return true;
            }
            next();
        }
        return false;
    }

    @Override // com.bea.xml.stream.ReaderDelegate, javax.xml.stream.XMLStreamReader
    public int next() throws XMLStreamException {
        if (this.f37841b <= 0) {
            this.f37842c = false;
        }
        int next = super.next();
        if (isStartElement()) {
            this.f37841b++;
        }
        if (isEndElement()) {
            this.f37841b--;
        }
        return next;
    }

    public int nextElement() throws XMLStreamException {
        next();
        while (hasNext() && !isStartElement() && !isEndElement()) {
            next();
        }
        return super.getEventType();
    }

    public boolean moveToEndElement(String str) throws XMLStreamException {
        if (str == null) {
            return false;
        }
        while (moveToEndElement()) {
            if (str.equals(getLocalName())) {
                return true;
            }
            if (!hasNext()) {
                return false;
            }
            next();
        }
        return false;
    }

    public boolean moveToStartElement(String str) throws XMLStreamException {
        if (str == null) {
            return false;
        }
        while (moveToStartElement()) {
            if (str.equals(getLocalName())) {
                return true;
            }
            if (!hasNext()) {
                return false;
            }
            next();
        }
        return false;
    }

    public boolean moveToEndElement(String str, String str2) throws XMLStreamException {
        if (str != null && str2 != null) {
            while (moveToEndElement(str)) {
                if (str2.equals(getNamespaceURI())) {
                    return true;
                }
                if (!hasNext()) {
                    return false;
                }
                next();
            }
        }
        return false;
    }

    public boolean moveToStartElement(String str, String str2) throws XMLStreamException {
        if (str != null && str2 != null) {
            while (moveToStartElement(str)) {
                if (str2.equals(getNamespaceURI())) {
                    return true;
                }
                if (!hasNext()) {
                    return false;
                }
                next();
            }
        }
        return false;
    }
}
