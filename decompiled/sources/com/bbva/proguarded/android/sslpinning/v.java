package com.bbva.proguarded.android.sslpinning;

import com.bbva.ethermobilesdk.pinning.constant.ConstantKt;
import com.bbva.glomohybrid.base.deeplink.extensions.DeepLinkExtensionsKt;
import com.bbva.sl.ar.android.sslpinning.exception.InitializationException;
import com.bbva.sl.ar.android.sslpinning.exception.XmlException;
import com.mastercard.sonic.androidsvg.SVGParser;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/* JADX INFO: loaded from: classes8.dex */
public final class v {
    public static String a(Element element) throws XmlException {
        try {
            Transformer transformerNewTransformer = TransformerFactory.newInstance().newTransformer();
            transformerNewTransformer.setOutputProperty("omit-xml-declaration", "yes");
            transformerNewTransformer.setOutputProperty("indent", SVGParser.XML_STYLESHEET_ATTR_ALTERNATE_NO);
            transformerNewTransformer.setOutputProperty("encoding", "UTF-8");
            StringWriter stringWriter = new StringWriter();
            transformerNewTransformer.transform(new DOMSource(element), new StreamResult(stringWriter));
            return stringWriter.getBuffer().toString().replaceAll("\n|\r", "").replaceAll(">\\s*<", "><");
        } catch (IllegalArgumentException e5) {
            throw new XmlException(135, "Error processing XML", e5);
        } catch (TransformerConfigurationException e7) {
            throw new XmlException(135, "Error processing XML", e7);
        } catch (TransformerException e10) {
            throw new XmlException(135, "Error processing XML", e10);
        } catch (TransformerFactoryConfigurationError e11) {
            throw new XmlException(135, "Error processing XML", e11);
        }
    }

    public static int b(Element element, String str) {
        String attribute;
        if (element == null || (attribute = element.getAttribute(str)) == null || attribute.trim().length() <= 0) {
            return 0;
        }
        try {
            return Integer.parseInt(attribute);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public static String a(Element element, String str, String str2) {
        String attribute;
        return (element == null || (attribute = element.getAttribute(str)) == null) ? str2 : attribute;
    }

    public static Element a(InputStream inputStream, String str) throws XmlException {
        try {
            DocumentBuilderFactory documentBuilderFactoryNewInstance = DocumentBuilderFactory.newInstance();
            documentBuilderFactoryNewInstance.setIgnoringElementContentWhitespace(true);
            documentBuilderFactoryNewInstance.setIgnoringComments(true);
            Document document = documentBuilderFactoryNewInstance.newDocumentBuilder().parse(inputStream);
            return str != null ? (Element) document.getElementsByTagName(str).item(0) : document.getDocumentElement();
        } catch (IOException e5) {
            throw new XmlException(132, "Error reading XML file", e5);
        } catch (ParserConfigurationException e7) {
            throw new XmlException(134, "Error parsing XML file", e7);
        } catch (SAXException e10) {
            throw new XmlException(133, "Error parsing XML file", e10);
        }
    }

    public static boolean a(Element element, String str) {
        String attribute;
        if (element == null || (attribute = element.getAttribute(str)) == null || attribute.trim().length() <= 0) {
            return true;
        }
        return Boolean.parseBoolean(attribute);
    }

    public static boolean a(Element element, String str, PublicKey publicKey) throws InitializationException {
        try {
            NodeList elementsByTagName = element.getElementsByTagName(str);
            if (elementsByTagName == null || elementsByTagName.getLength() == 0) {
                throw new InitializationException(202, "Site catalog signature not present");
            }
            if (elementsByTagName.getLength() != 1) {
                throw new InitializationException(202, "Multiple signatures present");
            }
            Element element2 = (Element) elementsByTagName.item(0);
            String attribute = element2.getAttribute("timestamp");
            String textContent = element2.getTextContent();
            if (textContent == null || textContent.trim().length() == 0) {
                throw new InitializationException(202, "Site catalog signature empty");
            }
            String strReplaceAll = textContent.replaceAll("\\s", "");
            element.removeChild(element2);
            String strA = a(element);
            element.appendChild(element2);
            String str2 = attribute + DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER + strA;
            Signature signature = Signature.getInstance(ConstantKt.ALGORITHM_VERIFY_SIGNATURE);
            signature.initVerify(publicKey);
            signature.update(str2.getBytes());
            return signature.verify(f.c(strReplaceAll));
        } catch (InvalidKeyException e5) {
            throw new InitializationException(111, "Unable to verify the signature. Invalid key", e5);
        } catch (NoSuchAlgorithmException e7) {
            throw new InitializationException(111, "Unable to verify the signature. No such algorithm.", e7);
        } catch (SignatureException e10) {
            throw new InitializationException(111, "Unable to verify the signature. Invalid Signature.", e10);
        } catch (DOMException e11) {
            throw new InitializationException(111, "Unable to verify the signature. DOM error.", e11);
        }
    }
}
