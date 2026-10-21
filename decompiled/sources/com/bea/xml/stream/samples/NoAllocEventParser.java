package com.bea.xml.stream.samples;

import com.bea.xml.stream.StaticAllocator;
import java.io.FileReader;
import java.io.PrintStream;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.events.XMLEvent;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes9.dex */
public class NoAllocEventParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f37897a;

    public static void main(String[] strArr) throws Exception {
        try {
            f37897a = strArr[0];
        } catch (ArrayIndexOutOfBoundsException unused) {
            System.out.println("usage: java com.bea.xml.stream.samples.EventParse <xmlfile>");
            System.exit(0);
        }
        System.setProperty("javax.xml.stream.XMLInputFactory", "com.bea.xml.stream.MXParserFactory");
        System.setProperty("javax.xml.stream.XMLEventFactory", "com.bea.xml.stream.EventFactory");
        XMLInputFactory xMLInputFactoryNewInstance = XMLInputFactory.newInstance();
        xMLInputFactoryNewInstance.setEventAllocator(new StaticAllocator());
        XMLEventReader xMLEventReaderCreateXMLEventReader = xMLInputFactoryNewInstance.createXMLEventReader(new FileReader(f37897a));
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
