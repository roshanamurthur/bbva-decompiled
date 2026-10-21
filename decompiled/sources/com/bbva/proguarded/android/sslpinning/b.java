package com.bbva.proguarded.android.sslpinning;

import com.bbva.glomohybrid.logs.LogKeysKt;
import com.bbva.sl.ar.android.sslpinning.exception.CryptoException;
import com.bbva.sl.ar.android.sslpinning.exception.InitializationException;
import java.security.PublicKey;
import java.util.Properties;
import java.util.logging.Logger;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

/* JADX INFO: loaded from: classes8.dex */
public abstract class b extends a {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final Logger f36126p0 = Logger.getLogger(b.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected d f36127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected String f36128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected long f36129c = -1;

    public final d a() {
        return this.f36127a;
    }

    public final long b() {
        return this.f36129c;
    }

    public final PublicKey a(Element element) throws InitializationException {
        Logger logger;
        try {
            NodeList elementsByTagName = element.getElementsByTagName(LogKeysKt.PROPERTIES);
            if (elementsByTagName == null || elementsByTagName.getLength() == 0) {
                throw new InitializationException(105, "Configuration error: Config file does not have properties defined.");
            }
            int i10 = 0;
            Element element2 = (Element) elementsByTagName.item(0);
            this.f36128b = v.a(element2, "version", "1.0");
            Properties properties = new Properties();
            NodeList elementsByTagName2 = element2.getElementsByTagName("prp");
            while (true) {
                int length = elementsByTagName2.getLength();
                logger = f36126p0;
                if (i10 >= length) {
                    break;
                }
                Element element3 = (Element) elementsByTagName2.item(i10);
                String attribute = element3.getAttribute("id");
                if (attribute == null) {
                    logger.warning("Unidentified Log Source. Will not load.");
                } else {
                    properties.setProperty(attribute, element3.getTextContent());
                }
                i10++;
            }
            logger.fine("Loaded [" + properties.size() + "] properties from config file.");
            String property = properties.getProperty("com.bbva.sl.ar.sslpinning.pubkey");
            if (property == null || property.trim().length() == 0) {
                throw new InitializationException(107, "Missing public key in config.");
            }
            PublicKey publicKeyA = e.a(property);
            logger.fine("Verifying config properties signature.");
            if (!v.a(element2, "signature", publicKeyA)) {
                throw new InitializationException(111, "Unable to verify the signature: Signature not valid.");
            }
            logger.info("Properties signature verified.");
            putAll(properties);
            return publicKeyA;
        } catch (CryptoException e5) {
            throw new InitializationException(107, "Error loading public key from config.", e5);
        }
    }

    public void a(Element element, PublicKey publicKey) throws InitializationException {
        this.f36127a = d.a(element, publicKey);
        this.f36129c = 0L;
    }
}
