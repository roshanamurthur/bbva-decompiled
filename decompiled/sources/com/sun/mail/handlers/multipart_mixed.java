package com.sun.mail.handlers;

import java.io.IOException;
import java.io.OutputStream;
import javax.activation.ActivationDataFlavor;
import javax.activation.DataSource;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.internet.MimeMultipart;

/* JADX INFO: loaded from: classes9.dex */
public class multipart_mixed extends handler_base {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ActivationDataFlavor[] f65239a = {new ActivationDataFlavor(Multipart.class, "multipart/mixed", "Multipart")};

    @Override // javax.activation.DataContentHandler
    public Object getContent(DataSource dataSource) throws IOException {
        try {
            return new MimeMultipart(dataSource);
        } catch (MessagingException e5) {
            IOException iOException = new IOException("Exception while constructing MimeMultipart");
            iOException.initCause(e5);
            throw iOException;
        }
    }

    @Override // com.sun.mail.handlers.handler_base
    public ActivationDataFlavor[] getDataFlavors() {
        return f65239a;
    }

    @Override // javax.activation.DataContentHandler
    public void writeTo(Object obj, String str, OutputStream outputStream) throws IOException {
        if (obj instanceof Multipart) {
            try {
                ((Multipart) obj).writeTo(outputStream);
            } catch (MessagingException e5) {
                IOException iOException = new IOException("Exception writing Multipart");
                iOException.initCause(e5);
                throw iOException;
            }
        }
    }
}
