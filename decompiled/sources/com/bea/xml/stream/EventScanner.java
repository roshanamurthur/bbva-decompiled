package com.bea.xml.stream;

import com.bea.xml.stream.util.ElementTypeNames;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.Namespace;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes9.dex */
public class EventScanner {
    protected char currentChar;
    protected Reader reader;
    protected int currentLine = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f37808a = false;

    public EventScanner() {
    }

    public static void main(String[] strArr) throws Exception {
        EventScanner eventScanner = new EventScanner(new FileReader(strArr[0]));
        while (eventScanner.hasNext()) {
            System.out.println(eventScanner.readElement());
        }
    }

    public boolean endDocumentIsPresent() {
        return this.f37808a;
    }

    public char getChar() {
        return this.currentChar;
    }

    public String getName(String str) {
        int iIndexOf = str.indexOf(58);
        return iIndexOf == -1 ? str : str.substring(iIndexOf + 1);
    }

    public String getPrefix(String str) {
        int iIndexOf = str.indexOf(58);
        if (iIndexOf == -1) {
            return null;
        }
        return str.substring(0, iIndexOf);
    }

    public boolean hasNext() throws IOException {
        return this.reader.ready() && !this.f37808a;
    }

    public char read() throws IOException {
        char c10 = (char) this.reader.read();
        this.currentChar = c10;
        if (c10 == '\n') {
            this.currentLine++;
        }
        return c10;
    }

    public Attribute readAttribute() throws XMLStreamException, IOException {
        read(AbstractJsonLexerKt.BEGIN_LIST);
        read(AbstractJsonLexerKt.BEGIN_LIST);
        String string = readString(AbstractJsonLexerKt.END_LIST);
        read(AbstractJsonLexerKt.END_LIST);
        QName name = readName();
        read("=[");
        String string2 = readString(AbstractJsonLexerKt.END_LIST);
        read(AbstractJsonLexerKt.END_LIST);
        read(AbstractJsonLexerKt.END_LIST);
        if (string.equals("ATTRIBUTE")) {
            return new AttributeBase(name, string2);
        }
        if (string.equals("DEFAULT")) {
            return new NamespaceBase(string2);
        }
        if (string.equals("NAMESPACE")) {
            return new NamespaceBase(name.getLocalPart(), string2);
        }
        throw new XMLStreamException("Parser Error expected (ATTRIBUTE||DEFAULT|NAMESPACE");
    }

    public List readAttributes() throws XMLStreamException, IOException {
        ArrayList arrayList = new ArrayList();
        while (getChar() == '[') {
            arrayList.add(readAttribute());
        }
        return arrayList;
    }

    public EventState readCDATA() throws XMLStreamException, IOException {
        EventState eventState = new EventState(12);
        read(AbstractJsonLexerKt.BEGIN_LIST);
        readString(AbstractJsonLexerKt.END_LIST);
        read(AbstractJsonLexerKt.END_LIST);
        return eventState;
    }

    public EventState readCharacterData() throws XMLStreamException, IOException {
        EventState eventState = new EventState(4);
        read(AbstractJsonLexerKt.BEGIN_LIST);
        eventState.setData(readString(AbstractJsonLexerKt.END_LIST));
        read(AbstractJsonLexerKt.END_LIST);
        return eventState;
    }

    public EventState readComment() throws XMLStreamException, IOException {
        EventState eventState = new EventState(5);
        read(AbstractJsonLexerKt.BEGIN_LIST);
        eventState.setData(readString(AbstractJsonLexerKt.END_LIST));
        read(AbstractJsonLexerKt.END_LIST);
        return eventState;
    }

    public EventState readDTD() throws XMLStreamException, IOException {
        EventState eventState = new EventState(11);
        read(AbstractJsonLexerKt.BEGIN_LIST);
        String string = readString(AbstractJsonLexerKt.END_LIST);
        read(AbstractJsonLexerKt.END_LIST);
        eventState.setData(string);
        return eventState;
    }

    public EventState readElement() throws XMLStreamException, IOException {
        EventState startElement;
        int type = readType();
        switch (type) {
            case 1:
                startElement = readStartElement();
                break;
            case 2:
                startElement = readEndElement();
                break;
            case 3:
                startElement = readProcessingInstruction();
                break;
            case 4:
                startElement = readCharacterData();
                break;
            case 5:
                startElement = readComment();
                break;
            case 6:
                startElement = readSpace();
                break;
            case 7:
                startElement = readStartDocument();
                break;
            case 8:
                this.f37808a = true;
                startElement = readEndDocument();
                break;
            case 9:
                startElement = readEntityReference();
                break;
            case 10:
            default:
                StringBuffer stringBuffer = new StringBuffer("Attempt to read unknown element [");
                stringBuffer.append(type);
                stringBuffer.append(Constant.BRACKET_CLOSE);
                throw new XMLStreamException(stringBuffer.toString());
            case 11:
                startElement = readDTD();
                break;
            case 12:
                startElement = readCDATA();
                break;
        }
        read(';');
        skipSpace();
        return startElement;
    }

    public EventState readEndDocument() throws XMLStreamException {
        return new EventState(8);
    }

    public EventState readEndElement() throws XMLStreamException, IOException {
        EventState eventState = new EventState(2);
        read(AbstractJsonLexerKt.BEGIN_LIST);
        eventState.setName(readName());
        read(AbstractJsonLexerKt.END_LIST);
        return eventState;
    }

    public EventState readEntityReference() throws XMLStreamException, IOException {
        EventState eventState = new EventState(9);
        read(AbstractJsonLexerKt.BEGIN_LIST);
        eventState.setData(readString(AbstractJsonLexerKt.END_LIST));
        read(AbstractJsonLexerKt.END_LIST);
        return eventState;
    }

    public QName readName() throws XMLStreamException, IOException {
        read(AbstractJsonLexerKt.BEGIN_LIST);
        QName name = readName(AbstractJsonLexerKt.END_LIST);
        read(AbstractJsonLexerKt.END_LIST);
        return name;
    }

    public EventState readProcessingInstruction() throws XMLStreamException, IOException {
        String string;
        EventState eventState = new EventState(3);
        read(AbstractJsonLexerKt.BEGIN_LIST);
        String string2 = readString(AbstractJsonLexerKt.END_LIST);
        read(AbstractJsonLexerKt.END_LIST);
        if (getChar() == ',') {
            read(",[");
            string = readString(AbstractJsonLexerKt.END_LIST);
            read(AbstractJsonLexerKt.END_LIST);
        } else {
            string = null;
        }
        eventState.setData(string2);
        eventState.setExtraData(string);
        return eventState;
    }

    public EventState readSpace() throws XMLStreamException, IOException {
        EventState eventState = new EventState(6);
        read(AbstractJsonLexerKt.BEGIN_LIST);
        String string = readString(AbstractJsonLexerKt.END_LIST);
        read(AbstractJsonLexerKt.END_LIST);
        eventState.setData(string);
        return eventState;
    }

    public EventState readStartDocument() throws XMLStreamException, IOException {
        EventState eventState = new EventState(7);
        if (getChar() != ';') {
            read(AbstractJsonLexerKt.BEGIN_LIST);
            read(AbstractJsonLexerKt.BEGIN_LIST);
            String string = readString(AbstractJsonLexerKt.END_LIST);
            read(AbstractJsonLexerKt.END_LIST);
            read(AbstractJsonLexerKt.COMMA);
            read(AbstractJsonLexerKt.BEGIN_LIST);
            String string2 = readString(AbstractJsonLexerKt.END_LIST);
            read(AbstractJsonLexerKt.END_LIST);
            read(AbstractJsonLexerKt.END_LIST);
            eventState.setData(string);
            eventState.setExtraData(string2);
        }
        return eventState;
    }

    public EventState readStartElement() throws XMLStreamException, IOException {
        EventState eventState = new EventState(1);
        read(AbstractJsonLexerKt.BEGIN_LIST);
        eventState.setName(readName());
        if (getChar() == '[') {
            for (Object obj : readAttributes()) {
                if (obj instanceof Namespace) {
                    eventState.addNamespace(obj);
                } else {
                    eventState.addAttribute(obj);
                }
            }
        }
        read(AbstractJsonLexerKt.END_LIST);
        return eventState;
    }

    public String readString(char c10) throws XMLStreamException, IOException {
        StringBuffer stringBuffer = new StringBuffer();
        while (getChar() != c10) {
            if (getChar() == '[' && c10 == ']') {
                read();
                stringBuffer.append(AbstractJsonLexerKt.BEGIN_LIST);
                if (getChar() != ']') {
                    stringBuffer.append(readString(AbstractJsonLexerKt.END_LIST));
                }
                stringBuffer.append(AbstractJsonLexerKt.END_LIST);
                read(AbstractJsonLexerKt.END_LIST);
            } else {
                stringBuffer.append(getChar());
                read();
            }
        }
        return stringBuffer.toString();
    }

    public int readType() throws XMLStreamException, IOException {
        read(AbstractJsonLexerKt.BEGIN_LIST);
        int eventType = ElementTypeNames.getEventType(readString(AbstractJsonLexerKt.END_LIST));
        read(AbstractJsonLexerKt.END_LIST);
        return eventType;
    }

    public void setReader(Reader reader) throws IOException {
        this.reader = reader;
        read();
        skipSpace();
    }

    public void skipSpace() throws IOException {
        while (true) {
            char c10 = this.currentChar;
            if (!((c10 == ' ') | (c10 == '\n') | (c10 == '\t')) && !(c10 == '\r')) {
                return;
            } else {
                read();
            }
        }
    }

    public char read(char c10) throws XMLStreamException, IOException {
        if (this.currentChar == c10) {
            return read();
        }
        StringBuffer stringBuffer = new StringBuffer("Unexpected character '");
        stringBuffer.append(this.currentChar);
        stringBuffer.append("' , expected '");
        stringBuffer.append(c10);
        stringBuffer.append("' at line ");
        stringBuffer.append(this.currentLine);
        throw new XMLStreamException(stringBuffer.toString());
    }

    public EventScanner(Reader reader) throws IOException {
        setReader(reader);
    }

    public QName readName(char c10) throws XMLStreamException, IOException {
        String string;
        if (getChar() == '\'') {
            read('\'');
            string = readString('\'');
            read('\'');
            read(AbstractJsonLexerKt.COLON);
        } else {
            string = "";
        }
        String string2 = readString(c10);
        String prefix = getPrefix(string2);
        return new QName(string, getName(string2), prefix != null ? prefix : "");
    }

    public void read(String str) throws XMLStreamException, IOException {
        for (int i10 = 0; i10 < str.length(); i10++) {
            read(str.charAt(i10));
        }
    }
}
