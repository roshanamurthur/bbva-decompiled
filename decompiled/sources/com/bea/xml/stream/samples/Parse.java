package com.bea.xml.stream.samples;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bea.xml.stream.XMLEventAllocatorBase;
import com.bea.xml.stream.util.ElementTypeNames;
import java.io.FileReader;
import java.io.PrintStream;
import java.util.Iterator;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.Namespace;

/* JADX INFO: loaded from: classes9.dex */
public class Parse {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f37898a;

    public static void a(int i10) {
        PrintStream printStream = System.out;
        StringBuffer stringBuffer = new StringBuffer("EVENT TYPE(");
        stringBuffer.append(i10);
        stringBuffer.append("):");
        printStream.print(stringBuffer.toString());
        printStream.println(getEventTypeString(i10));
    }

    public static void b(XMLStreamReader xMLStreamReader) {
        if (!xMLStreamReader.hasName()) {
            System.out.println("HAS NO NAME");
            return;
        }
        PrintStream printStream = System.out;
        StringBuffer stringBuffer = new StringBuffer("HAS NAME: ");
        stringBuffer.append(xMLStreamReader.getLocalName());
        printStream.println(stringBuffer.toString());
    }

    public static void c(XMLStreamReader xMLStreamReader) {
        if (!xMLStreamReader.hasText()) {
            System.out.println("HAS NO VALUE");
            return;
        }
        PrintStream printStream = System.out;
        StringBuffer stringBuffer = new StringBuffer("HAS VALUE: ");
        stringBuffer.append(xMLStreamReader.getText());
        printStream.println(stringBuffer.toString());
    }

    public static final String getEventTypeString(int i10) {
        return ElementTypeNames.getEventTypeString(i10);
    }

    public static void main(String[] strArr) throws Exception {
        try {
            f37898a = strArr[0];
        } catch (ArrayIndexOutOfBoundsException unused) {
            System.out.println("usage: java com.bea.xml.stream.samples.Parse <xmlfile>");
            System.exit(0);
        }
        System.setProperty("javax.xml.stream.XMLInputFactory", "com.bea.xml.stream.MXParserFactory");
        XMLInputFactory xMLInputFactoryNewInstance = XMLInputFactory.newInstance();
        PrintStream printStream = System.out;
        StringBuffer stringBuffer = new StringBuffer("FACTORY: ");
        stringBuffer.append(xMLInputFactoryNewInstance);
        printStream.println(stringBuffer.toString());
        XMLStreamReader xMLStreamReaderCreateXMLStreamReader = xMLInputFactoryNewInstance.createXMLStreamReader(new FileReader(f37898a));
        StringBuffer stringBuffer2 = new StringBuffer("READER:  ");
        stringBuffer2.append(xMLStreamReaderCreateXMLStreamReader);
        stringBuffer2.append(RootService.LINE_BREAK);
        printStream.println(stringBuffer2.toString());
        int eventType = xMLStreamReaderCreateXMLStreamReader.getEventType();
        printStream.println("PARSER STATE BEFORE FIRST next(): ");
        a(eventType);
        b(xMLStreamReaderCreateXMLStreamReader);
        c(xMLStreamReaderCreateXMLStreamReader);
        printStream.println("-----------------------------");
        while (xMLStreamReaderCreateXMLStreamReader.hasNext()) {
            a(xMLStreamReaderCreateXMLStreamReader.next());
            b(xMLStreamReaderCreateXMLStreamReader);
            c(xMLStreamReaderCreateXMLStreamReader);
            if (xMLStreamReaderCreateXMLStreamReader.isStartElement()) {
                if (xMLStreamReaderCreateXMLStreamReader.getAttributeCount() > 0) {
                    System.out.println("\nHAS ATTRIBUTES: ");
                    Iterator attributes = XMLEventAllocatorBase.getAttributes(xMLStreamReaderCreateXMLStreamReader);
                    while (attributes.hasNext()) {
                        Attribute attribute = (Attribute) attributes.next();
                        PrintStream printStream2 = System.out;
                        printStream2.println("");
                        StringBuffer stringBuffer3 = new StringBuffer("PREFIX: ");
                        stringBuffer3.append(attribute.getName().getPrefix());
                        printStream2.println(stringBuffer3.toString());
                        StringBuffer stringBuffer4 = new StringBuffer("NAMESP: ");
                        stringBuffer4.append(attribute.getName().getNamespaceURI());
                        printStream2.println(stringBuffer4.toString());
                        StringBuffer stringBuffer5 = new StringBuffer("NAME:   ");
                        stringBuffer5.append(attribute.getName().getLocalPart());
                        printStream2.println(stringBuffer5.toString());
                        StringBuffer stringBuffer6 = new StringBuffer("VALUE:  ");
                        stringBuffer6.append(attribute.getValue());
                        printStream2.println(stringBuffer6.toString());
                        StringBuffer stringBuffer7 = new StringBuffer("TYPE:   ");
                        stringBuffer7.append(attribute.getDTDType());
                        printStream2.println(stringBuffer7.toString());
                    }
                } else {
                    System.out.println("HAS NO ATTRIBUTES");
                }
                if (xMLStreamReaderCreateXMLStreamReader.getNamespaceCount() > 0) {
                    System.out.println("\nHAS NAMESPACES: ");
                    Iterator namespaces = XMLEventAllocatorBase.getNamespaces(xMLStreamReaderCreateXMLStreamReader);
                    while (namespaces.hasNext()) {
                        Namespace namespace = (Namespace) namespaces.next();
                        PrintStream printStream3 = System.out;
                        printStream3.println("");
                        StringBuffer stringBuffer8 = new StringBuffer("PREFIX: ");
                        stringBuffer8.append(namespace.getName().getPrefix());
                        printStream3.println(stringBuffer8.toString());
                        StringBuffer stringBuffer9 = new StringBuffer("NAMESP: ");
                        stringBuffer9.append(namespace.getName().getNamespaceURI());
                        printStream3.println(stringBuffer9.toString());
                        StringBuffer stringBuffer10 = new StringBuffer("NAME:   ");
                        stringBuffer10.append(namespace.getName().getLocalPart());
                        printStream3.println(stringBuffer10.toString());
                        StringBuffer stringBuffer11 = new StringBuffer("VALUE:  ");
                        stringBuffer11.append(namespace.getValue());
                        printStream3.println(stringBuffer11.toString());
                        StringBuffer stringBuffer12 = new StringBuffer("TYPE:   ");
                        stringBuffer12.append(namespace.getDTDType());
                        printStream3.println(stringBuffer12.toString());
                    }
                } else {
                    System.out.println("HAS NO NAMESPACES");
                }
            }
            System.out.println("-----------------------------");
        }
    }
}
