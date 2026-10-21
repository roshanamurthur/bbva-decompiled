package javax.mail.internet;

import com.bbva.network.constant.ConstantsKt;
import com.sun.mail.util.FolderClosedIOException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.UnknownServiceException;
import javax.activation.DataSource;
import javax.mail.FolderClosedException;
import javax.mail.MessageAware;
import javax.mail.MessageContext;
import javax.mail.MessagingException;

/* JADX INFO: loaded from: classes12.dex */
public class MimePartDataSource implements DataSource, MessageAware {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public MessageContext f78998a;
    protected MimePart part;

    public MimePartDataSource(MimePart mimePart) {
        this.part = mimePart;
    }

    @Override // javax.activation.DataSource
    public String getContentType() {
        try {
            return this.part.getContentType();
        } catch (MessagingException unused) {
            return ConstantsKt.DEFAULT_MEDIATYPE;
        }
    }

    @Override // javax.activation.DataSource
    public InputStream getInputStream() throws IOException {
        InputStream contentStream;
        try {
            MimePart mimePart = this.part;
            if (mimePart instanceof MimeBodyPart) {
                contentStream = ((MimeBodyPart) mimePart).getContentStream();
            } else {
                if (!(mimePart instanceof MimeMessage)) {
                    throw new MessagingException("Unknown part");
                }
                contentStream = ((MimeMessage) mimePart).getContentStream();
            }
            MimePart mimePart2 = this.part;
            String strE = MimeBodyPart.e(mimePart2, mimePart2.getEncoding());
            return strE != null ? MimeUtility.decode(contentStream, strE) : contentStream;
        } catch (FolderClosedException e5) {
            throw new FolderClosedIOException(e5.getFolder(), e5.getMessage());
        } catch (MessagingException e7) {
            IOException iOException = new IOException(e7.getMessage());
            iOException.initCause(e7);
            throw iOException;
        }
    }

    @Override // javax.mail.MessageAware
    public synchronized MessageContext getMessageContext() {
        try {
            if (this.f78998a == null) {
                this.f78998a = new MessageContext(this.part);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f78998a;
    }

    @Override // javax.activation.DataSource
    public String getName() {
        try {
            MimePart mimePart = this.part;
            return mimePart instanceof MimeBodyPart ? ((MimeBodyPart) mimePart).getFileName() : "";
        } catch (MessagingException unused) {
            return "";
        }
    }

    @Override // javax.activation.DataSource
    public OutputStream getOutputStream() throws IOException {
        throw new UnknownServiceException("Writing not supported");
    }
}
