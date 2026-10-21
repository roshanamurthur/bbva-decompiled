package com.bea.xml.stream.samples;

import java.io.FileReader;
import java.io.PrintStream;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.events.XMLEvent;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes9.dex */
public class AllocEventParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f37894a;

    public static void main(String[] strArr) throws Exception {
        try {
            f37894a = strArr[0];
        } catch (ArrayIndexOutOfBoundsException unused) {
            System.out.println("usage: java com.bea.xml.stream.samples.AllocEventParse <xmlfile>");
            System.exit(0);
        }
        System.setProperty("javax.xml.stream.XMLInputFactory", "com.bea.xml.stream.MXParserFactory");
        System.setProperty("javax.xml.stream.XMLOutputFactory", "com.bea.xml.stream.XMLOutputFactoryBase");
        System.setProperty("javax.xml.stream.XMLEventFactory", "com.bea.xml.stream.EventFactory");
        XMLInputFactory xMLInputFactoryNewInstance = XMLInputFactory.newInstance();
        xMLInputFactoryNewInstance.setProperty(XMLInputFactory.IS_REPLACING_ENTITY_REFERENCES, Boolean.FALSE);
        XMLEventReader xMLEventReaderCreateXMLEventReader = xMLInputFactoryNewInstance.createXMLEventReader(new FileReader(f37894a));
        while (xMLEventReaderCreateXMLEventReader.hasNext()) {
            XMLEvent xMLEventNextEvent = xMLEventReaderCreateXMLEventReader.nextEvent();
            PrintStream printStream = System.out;
            StringBuffer stringBuffer = new StringBuffer("ID:");
            stringBuffer.append(xMLEventNextEvent.hashCode());
            stringBuffer.append(Constant.BRACKET_OPEN);
            stringBuffer.append(xMLEventNextEvent);
            stringBuffer.append(Constant.BRACKET_CLOSE);
            printStream.println(stringBuffer.toString());
        }
    }
}
