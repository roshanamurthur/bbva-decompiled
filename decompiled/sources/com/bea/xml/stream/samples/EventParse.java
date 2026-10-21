package com.bea.xml.stream.samples;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.glomohybrid.base.deeplink.extensions.DeepLinkExtensionsKt;
import com.bea.xml.stream.XMLEventAllocatorBase;
import com.bea.xml.stream.util.ElementTypeNames;
import java.io.FileReader;
import java.io.PrintStream;
import java.util.Iterator;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.Namespace;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes9.dex */
public class EventParse {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f37895a;

    public static void a(String str, String str2, String str3) {
        if (str2 != null && !"".equals(str2)) {
            PrintStream printStream = System.out;
            StringBuffer stringBuffer = new StringBuffer("['");
            stringBuffer.append(str2);
            stringBuffer.append("']:");
            printStream.print(stringBuffer.toString());
        }
        if (str != null) {
            System.out.print(str.concat(DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER));
        }
        if (str3 != null) {
            System.out.print(str3);
        }
    }

    public static void b(Iterator it) {
        while (it.hasNext()) {
            PrintStream printStream = System.out;
            printStream.print(" ");
            Namespace namespace = (Namespace) it.next();
            if (namespace.isDefaultNamespaceDeclaration()) {
                StringBuffer stringBuffer = new StringBuffer("xmlns='");
                stringBuffer.append(namespace.getNamespaceURI());
                stringBuffer.append("'");
                printStream.print(stringBuffer.toString());
            } else {
                StringBuffer stringBuffer2 = new StringBuffer("xmlns:");
                stringBuffer2.append(namespace.getPrefix());
                stringBuffer2.append("='");
                stringBuffer2.append(namespace.getNamespaceURI());
                stringBuffer2.append("'");
                printStream.print(stringBuffer2.toString());
            }
        }
    }

    public static final String getEventTypeString(int i10) {
        return ElementTypeNames.getEventTypeString(i10);
    }

    public static void main(String[] strArr) throws Exception {
        try {
            f37895a = strArr[0];
        } catch (ArrayIndexOutOfBoundsException unused) {
            System.out.println("usage: java com.bea.xml.stream.samples.EventParse <xmlfile>");
            System.exit(0);
        }
        System.setProperty("javax.xml.stream.XMLInputFactory", "com.bea.xml.stream.MXParserFactory");
        XMLInputFactory xMLInputFactoryNewInstance = XMLInputFactory.newInstance();
        PrintStream printStream = System.out;
        StringBuffer stringBuffer = new StringBuffer("FACTORY: ");
        stringBuffer.append(xMLInputFactoryNewInstance);
        printStream.println(stringBuffer.toString());
        xMLInputFactoryNewInstance.setProperty(XMLInputFactory.IS_REPLACING_ENTITY_REFERENCES, Boolean.FALSE);
        XMLStreamReader xMLStreamReaderCreateXMLStreamReader = xMLInputFactoryNewInstance.createXMLStreamReader(new FileReader(f37895a));
        StringBuffer stringBuffer2 = new StringBuffer("READER:  ");
        stringBuffer2.append(xMLStreamReaderCreateXMLStreamReader);
        stringBuffer2.append(RootService.LINE_BREAK);
        printStream.println(stringBuffer2.toString());
        while (xMLStreamReaderCreateXMLStreamReader.hasNext()) {
            PrintStream printStream2 = System.out;
            StringBuffer stringBuffer3 = new StringBuffer("EVENT:[");
            stringBuffer3.append(xMLStreamReaderCreateXMLStreamReader.getLocation().getLineNumber());
            stringBuffer3.append("][");
            stringBuffer3.append(xMLStreamReaderCreateXMLStreamReader.getLocation().getColumnNumber());
            stringBuffer3.append("] ");
            printStream2.print(stringBuffer3.toString());
            printStream2.print(getEventTypeString(xMLStreamReaderCreateXMLStreamReader.getEventType()));
            printStream2.print(" [");
            int eventType = xMLStreamReaderCreateXMLStreamReader.getEventType();
            if (eventType == 9) {
                StringBuffer stringBuffer4 = new StringBuffer();
                stringBuffer4.append(xMLStreamReaderCreateXMLStreamReader.getLocalName());
                stringBuffer4.append("=");
                printStream2.print(stringBuffer4.toString());
                if (xMLStreamReaderCreateXMLStreamReader.hasText()) {
                    StringBuffer stringBuffer5 = new StringBuffer(Constant.BRACKET_OPEN);
                    stringBuffer5.append(xMLStreamReaderCreateXMLStreamReader.getText());
                    stringBuffer5.append(Constant.BRACKET_CLOSE);
                    printStream2.print(stringBuffer5.toString());
                }
            } else if (eventType != 12) {
                switch (eventType) {
                    case 1:
                        printStream2.print("<");
                        if (xMLStreamReaderCreateXMLStreamReader.hasName()) {
                            a(xMLStreamReaderCreateXMLStreamReader.getPrefix(), xMLStreamReaderCreateXMLStreamReader.getNamespaceURI(), xMLStreamReaderCreateXMLStreamReader.getLocalName());
                        }
                        b(XMLEventAllocatorBase.getNamespaces(xMLStreamReaderCreateXMLStreamReader));
                        if (xMLStreamReaderCreateXMLStreamReader.getAttributeCount() > 0) {
                            Iterator attributes = XMLEventAllocatorBase.getAttributes(xMLStreamReaderCreateXMLStreamReader);
                            while (attributes.hasNext()) {
                                PrintStream printStream3 = System.out;
                                printStream3.print(" ");
                                Attribute attribute = (Attribute) attributes.next();
                                a(attribute.getName().getPrefix(), attribute.getName().getNamespaceURI(), attribute.getName().getLocalPart());
                                StringBuffer stringBuffer6 = new StringBuffer("='");
                                stringBuffer6.append(attribute.getValue());
                                stringBuffer6.append("'");
                                printStream3.print(stringBuffer6.toString());
                            }
                        }
                        System.out.print(">");
                        break;
                    case 2:
                        printStream2.print("</");
                        if (xMLStreamReaderCreateXMLStreamReader.hasName()) {
                            a(xMLStreamReaderCreateXMLStreamReader.getPrefix(), xMLStreamReaderCreateXMLStreamReader.getNamespaceURI(), xMLStreamReaderCreateXMLStreamReader.getLocalName());
                        }
                        b(XMLEventAllocatorBase.getNamespaces(xMLStreamReaderCreateXMLStreamReader));
                        printStream2.print(">");
                        break;
                    case 3:
                        printStream2.print("<?");
                        if (xMLStreamReaderCreateXMLStreamReader.hasText()) {
                            printStream2.print(xMLStreamReaderCreateXMLStreamReader.getText());
                        }
                        printStream2.print("?>");
                        break;
                    case 4:
                    case 6:
                        printStream2.print(new String(xMLStreamReaderCreateXMLStreamReader.getTextCharacters(), xMLStreamReaderCreateXMLStreamReader.getTextStart(), xMLStreamReaderCreateXMLStreamReader.getTextLength()));
                        break;
                    case 5:
                        printStream2.print("<!--");
                        if (xMLStreamReaderCreateXMLStreamReader.hasText()) {
                            printStream2.print(xMLStreamReaderCreateXMLStreamReader.getText());
                        }
                        printStream2.print("-->");
                        break;
                    case 7:
                        printStream2.print("<?xml");
                        StringBuffer stringBuffer7 = new StringBuffer(" version='");
                        stringBuffer7.append(xMLStreamReaderCreateXMLStreamReader.getVersion());
                        stringBuffer7.append("'");
                        printStream2.print(stringBuffer7.toString());
                        StringBuffer stringBuffer8 = new StringBuffer(" encoding='");
                        stringBuffer8.append(xMLStreamReaderCreateXMLStreamReader.getCharacterEncodingScheme());
                        stringBuffer8.append("'");
                        printStream2.print(stringBuffer8.toString());
                        if (xMLStreamReaderCreateXMLStreamReader.isStandalone()) {
                            printStream2.print(" standalone='yes'");
                        } else {
                            printStream2.print(" standalone='no'");
                        }
                        printStream2.print("?>");
                        break;
                }
            } else {
                printStream2.print("<![CDATA[");
                if (xMLStreamReaderCreateXMLStreamReader.hasText()) {
                    printStream2.print(xMLStreamReaderCreateXMLStreamReader.getText());
                }
                printStream2.print("]]>");
            }
            System.out.println(Constant.BRACKET_CLOSE);
            xMLStreamReaderCreateXMLStreamReader.next();
        }
    }
}
