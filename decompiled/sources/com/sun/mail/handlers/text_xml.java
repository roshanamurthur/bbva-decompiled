package com.sun.mail.handlers;

import androidx.camera.camera2.internal.h0;
import com.bbva.nativesettings.common.Constants;
import java.io.IOException;
import java.io.OutputStream;
import javax.activation.ActivationDataFlavor;
import javax.activation.DataSource;
import javax.mail.internet.ContentType;
import javax.mail.internet.ParseException;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

/* JADX INFO: loaded from: classes9.dex */
public class text_xml extends text_plain {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ActivationDataFlavor[] f65242b = {new ActivationDataFlavor(String.class, "text/xml", "XML String"), new ActivationDataFlavor(String.class, "application/xml", "XML String"), new ActivationDataFlavor(StreamSource.class, "text/xml", "XML"), new ActivationDataFlavor(StreamSource.class, "application/xml", "XML")};

    @Override // com.sun.mail.handlers.handler_base
    public Object getData(ActivationDataFlavor activationDataFlavor, DataSource dataSource) throws IOException {
        if (activationDataFlavor.getRepresentationClass() == String.class) {
            return super.getContent(dataSource);
        }
        if (activationDataFlavor.getRepresentationClass() == StreamSource.class) {
            return new StreamSource(dataSource.getInputStream());
        }
        return null;
    }

    @Override // com.sun.mail.handlers.text_plain, com.sun.mail.handlers.handler_base
    public ActivationDataFlavor[] getDataFlavors() {
        return f65242b;
    }

    @Override // com.sun.mail.handlers.text_plain, javax.activation.DataContentHandler
    public void writeTo(Object obj, String str, OutputStream outputStream) throws IOException {
        try {
            ContentType contentType = new ContentType(str);
            if (contentType.getSubType().equals("xml") && (contentType.getPrimaryType().equals("text") || contentType.getPrimaryType().equals(Constants.APPLICATION))) {
                if (obj instanceof String) {
                    super.writeTo(obj, str, outputStream);
                    return;
                }
                if (!(obj instanceof DataSource) && !(obj instanceof Source)) {
                    throw new IOException("Invalid Object type = " + obj.getClass() + ". XmlDCH can only convert DataSource or Source to XML.");
                }
                try {
                    Transformer transformerNewTransformer = TransformerFactory.newInstance().newTransformer();
                    StreamResult streamResult = new StreamResult(outputStream);
                    if (obj instanceof DataSource) {
                        transformerNewTransformer.transform(new StreamSource(((DataSource) obj).getInputStream()), streamResult);
                        return;
                    } else {
                        transformerNewTransformer.transform((Source) obj, streamResult);
                        return;
                    }
                } catch (RuntimeException e5) {
                    IOException iOException = new IOException("Unable to run the JAXP transformer on a stream " + e5.getMessage());
                    iOException.initCause(e5);
                    throw iOException;
                } catch (TransformerException e7) {
                    IOException iOException2 = new IOException("Unable to run the JAXP transformer on a stream " + e7.getMessage());
                    iOException2.initCause(e7);
                    throw iOException2;
                }
            }
        } catch (RuntimeException | ParseException unused) {
        }
        throw new IOException(h0.b("Invalid content type \"", str, "\" for text/xml DCH"));
    }
}
