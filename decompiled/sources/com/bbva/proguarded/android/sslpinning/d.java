package com.bbva.proguarded.android.sslpinning;

import com.bbva.sl.ar.android.sslpinning.exception.InitializationException;
import java.io.ByteArrayInputStream;
import java.net.URL;
import java.nio.charset.Charset;
import java.security.PublicKey;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.logging.Logger;
import mx.openpay.library.domain.util.Constant;
import org.w3c.dom.DOMException;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

/* JADX INFO: loaded from: classes8.dex */
public class d extends Hashtable<String, m> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final Logger f36140p0 = Logger.getLogger(d.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f36141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f36142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f36143c;

    public static d a(String str, PublicKey publicKey) throws InitializationException {
        return a(v.a(new ByteArrayInputStream(str.getBytes(Charset.forName("UTF-8"))), "sitecatalog"), publicKey);
    }

    public static d a(Element element, PublicKey publicKey) throws InitializationException {
        String str;
        String str2;
        int i10;
        int i11;
        d dVar;
        String str3;
        Element element2 = element;
        if (element2 == null) {
            throw new InitializationException(105, "Configuration error. Null root XML.");
        }
        int i12 = 0;
        if (!element.getNodeName().equals("sitecatalog")) {
            NodeList elementsByTagName = element2.getElementsByTagName("sitecatalog");
            if (elementsByTagName == null || elementsByTagName.getLength() == 0) {
                throw new InitializationException(203, "Configuration error: config file does not have site catalog defined.");
            }
            element2 = (Element) elementsByTagName.item(0);
        }
        Logger logger = f36140p0;
        logger.fine("Verifying site catalog signature.");
        if (!v.a(element2, "signature", publicKey)) {
            throw new InitializationException(111, "Unable to verify the signature: Signature not valid.");
        }
        logger.info("Site catalog signature verified.");
        String str4 = "] does not contain a list of valid hosts.";
        String str5 = "id";
        try {
            d dVar2 = new d();
            String attribute = element2.getAttribute("revision");
            if (attribute == null || attribute.trim().length() <= 0) {
                throw new InitializationException(201, "Catalog without revision");
            }
            logger.fine("Site catalog revision: [" + attribute + Constant.BRACKET_CLOSE);
            dVar2.f36141a = Long.parseLong(attribute);
            dVar2.f36142b = v.a(element2, "version", "1.0");
            NodeList elementsByTagName2 = element2.getElementsByTagName("site");
            if (elementsByTagName2.getLength() == 0) {
                throw new InitializationException(105, "No sites defined.");
            }
            int i13 = 0;
            while (i13 < elementsByTagName2.getLength()) {
                Element element3 = (Element) elementsByTagName2.item(i13);
                String attribute2 = element3.getAttribute(str5);
                if (attribute2 == null) {
                    str3 = "Unidentified site config. Will not load.";
                } else {
                    if (v.a(element3, "enabled")) {
                        m mVar = new m();
                        mVar.f36158a = attribute2;
                        mVar.f36161d = v.a(element3, "checkCertTrust");
                        mVar.f36162e = v.a(element3, "checkCertDate");
                        mVar.f36163f = v.a(element3, "checkHost");
                        mVar.f36164g = v.a(element3, "strictHost");
                        NodeList elementsByTagName3 = element3.getElementsByTagName("validhosts");
                        if (elementsByTagName3.getLength() > 0) {
                            NodeList elementsByTagName4 = ((Element) elementsByTagName3.item(i12)).getElementsByTagName("host");
                            int i14 = 0;
                            while (i14 < elementsByTagName4.getLength()) {
                                String textContent = ((Element) elementsByTagName4.item(i14)).getTextContent();
                                if (textContent != null && textContent.trim().length() > 0) {
                                    mVar.f36160c.add(textContent);
                                    logger.finer("Loading valid host [" + textContent + "] to site [" + attribute2 + "].");
                                }
                                i14++;
                                elementsByTagName4 = elementsByTagName4;
                                str4 = str4;
                            }
                        }
                        str = str4;
                        if (mVar.f36160c.size() == 0) {
                            logger.severe("Site id [" + attribute2 + str);
                            throw new InitializationException(105, "Site id [" + attribute2 + str);
                        }
                        NodeList elementsByTagName5 = element3.getElementsByTagName("validcerts");
                        if (elementsByTagName5.getLength() > 0) {
                            NodeList elementsByTagName6 = ((Element) elementsByTagName5.item(0)).getElementsByTagName("cert");
                            int i15 = 0;
                            while (i15 < elementsByTagName6.getLength()) {
                                Element element4 = (Element) elementsByTagName6.item(i15);
                                NodeList nodeList = elementsByTagName6;
                                String attribute3 = element4.getAttribute(str5);
                                try {
                                    String textContent2 = element4.getTextContent();
                                    if (textContent2 != null && textContent2.trim().length() > 0) {
                                        X509Certificate x509CertificateA = q.a(textContent2);
                                        mVar.f36159b.put(x509CertificateA.getIssuerDN().getName() + Constant.DASH_STRING + x509CertificateA.getSerialNumber().toString(), x509CertificateA);
                                        logger.finer("Loading certificate [" + attribute3 + "] to site [" + attribute2 + "].");
                                    }
                                    i15++;
                                    elementsByTagName6 = nodeList;
                                    str5 = str5;
                                    i13 = i13;
                                    dVar2 = dVar2;
                                } catch (CertificateException unused) {
                                    logger.severe("Site id [" + attribute2 + "] has invalid certificate (" + attribute3 + ").");
                                    throw new InitializationException(105, "Site id [" + attribute2 + "] has invalid certificate (" + attribute3 + ").");
                                }
                            }
                        }
                        str2 = str5;
                        d dVar3 = dVar2;
                        i10 = i13;
                        if (mVar.f36161d && mVar.f36159b.size() == 0) {
                            logger.severe("Site id [" + attribute2 + "] does not contain a list of valid certificates.");
                            throw new InitializationException(105, "Site id [" + attribute2 + "] does not contain a list of valid certificates.");
                        }
                        NodeList elementsByTagName7 = element3.getElementsByTagName("strengthparams");
                        if (elementsByTagName7.getLength() > 0) {
                            i11 = 0;
                            Element element5 = (Element) elementsByTagName7.item(0);
                            o oVar = new o();
                            oVar.f36166a = v.b(element5, "minKeyLength");
                            oVar.f36168c = v.a(element5, "algBlackList", "");
                            oVar.f36167b = v.a(element5, "algWhiteList", ".*");
                            mVar.f36165h = oVar;
                            logger.finer("Loading custom strength params to site [" + attribute2 + "].");
                        } else {
                            i11 = 0;
                        }
                        logger.fine("Loading site [" + attribute2 + "] to catalog.");
                        dVar = dVar3;
                        dVar.put(attribute2, mVar);
                    } else {
                        str3 = "Disabled site config. Will not load.";
                    }
                    i13 = i10 + 1;
                    elementsByTagName2 = elementsByTagName2;
                    dVar2 = dVar;
                    i12 = i11;
                    element2 = element2;
                    str4 = str;
                    str5 = str2;
                }
                logger.info(str3);
                element2 = element2;
                i11 = i12;
                str = str4;
                str2 = str5;
                dVar = dVar2;
                i10 = i13;
                i13 = i10 + 1;
                elementsByTagName2 = elementsByTagName2;
                dVar2 = dVar;
                i12 = i11;
                element2 = element2;
                str4 = str;
                str5 = str2;
            }
            Element element6 = element2;
            d dVar4 = dVar2;
            dVar4.f36143c = v.a(element6);
            return dVar4;
        } catch (DOMException unused2) {
            logger.severe("Error parsing site catalog XML.");
            throw new InitializationException(105, "Error parsing site catalog XML.");
        }
    }

    public final m a(URL url) {
        Enumeration enumerationElements = super.elements();
        l lVar = l.f36155a;
        m mVar = null;
        while (true) {
            boolean zHasMoreElements = enumerationElements.hasMoreElements();
            Logger logger = f36140p0;
            if (!zHasMoreElements) {
                if (lVar == l.f36155a) {
                    logger.finer("No match found for host [" + url.getHost() + "].");
                    return null;
                }
                logger.finer("Found wildcard match with a [" + lVar.f36157c + "] ratio for host [" + url.getHost() + "]: Site [" + mVar.f36158a + "].");
                return mVar;
            }
            m mVar2 = (m) enumerationElements.nextElement();
            String host = url.getHost();
            l lVar2 = l.f36155a;
            Iterator<String> it = mVar2.f36160c.iterator();
            while (it.hasNext()) {
                l lVar3 = new l(n.a(host, it.next()));
                if (lVar3.a()) {
                    lVar2 = lVar3;
                    break;
                }
                if (lVar3.b() && lVar3.a(lVar2)) {
                    lVar2 = lVar3;
                }
            }
            if (lVar2.a()) {
                logger.finer("Found exact match for host [" + url.getHost() + "]: Site [" + mVar2.f36158a + "].");
                return mVar2;
            }
            if (lVar2.b() && lVar2.a(lVar)) {
                mVar = mVar2;
                lVar = lVar2;
            }
        }
    }
}
