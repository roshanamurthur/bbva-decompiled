package com.sun.mail.imap;

import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import com.sun.mail.iap.ConnectionException;
import com.sun.mail.iap.ProtocolException;
import com.sun.mail.imap.protocol.BODY;
import com.sun.mail.imap.protocol.BODYSTRUCTURE;
import com.sun.mail.imap.protocol.IMAPProtocol;
import com.sun.mail.util.LineOutputStream;
import com.sun.mail.util.PropUtil;
import com.sun.mail.util.ReadableMime;
import com.sun.mail.util.SharedByteArrayOutputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.io.UnsupportedEncodingException;
import java.util.Enumeration;
import javax.activation.DataHandler;
import javax.mail.FolderClosedException;
import javax.mail.Header;
import javax.mail.IllegalWriteException;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.internet.ContentType;
import javax.mail.internet.InternetHeaders;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeUtility;
import javax.mail.internet.ParameterList;

/* JADX INFO: loaded from: classes9.dex */
public class IMAPBodyPart extends MimeBodyPart implements ReadableMime {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final boolean f65269n = PropUtil.getBooleanSystemProperty("mail.mime.decodefilename", false);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final IMAPMessage f65270h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final BODYSTRUCTURE f65271i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f65272j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f65273k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f65274l;
    public boolean m = false;

    public IMAPBodyPart(BODYSTRUCTURE bodystructure, String str, IMAPMessage iMAPMessage) {
        this.f65271i = bodystructure;
        this.f65272j = str;
        this.f65270h = iMAPMessage;
        this.f65273k = new ContentType(bodystructure.type, bodystructure.subtype, bodystructure.cParams).toString();
    }

    @Override // javax.mail.internet.MimeBodyPart, javax.mail.Part
    public void addHeader(String str, String str2) throws MessagingException {
        throw new IllegalWriteException("IMAPBodyPart is read-only");
    }

    @Override // javax.mail.internet.MimeBodyPart, javax.mail.internet.MimePart
    public void addHeaderLine(String str) throws MessagingException {
        throw new IllegalWriteException("IMAPBodyPart is read-only");
    }

    @Override // javax.mail.internet.MimeBodyPart, javax.mail.internet.MimePart
    public Enumeration<String> getAllHeaderLines() throws MessagingException {
        m();
        return super.getAllHeaderLines();
    }

    @Override // javax.mail.internet.MimeBodyPart, javax.mail.Part
    public Enumeration<Header> getAllHeaders() throws MessagingException {
        m();
        return super.getAllHeaders();
    }

    @Override // javax.mail.internet.MimeBodyPart, javax.mail.internet.MimePart
    public String getContentID() throws MessagingException {
        return this.f65271i.id;
    }

    @Override // javax.mail.internet.MimeBodyPart, javax.mail.internet.MimePart
    public String getContentMD5() throws MessagingException {
        return this.f65271i.md5;
    }

    @Override // javax.mail.internet.MimeBodyPart
    public InputStream getContentStream() throws MessagingException {
        boolean peek = this.f65270h.getPeek();
        synchronized (this.f65270h.getMessageCacheLock()) {
            try {
                IMAPProtocol protocol = this.f65270h.getProtocol();
                this.f65270h.checkExpunged();
                if (protocol.isREV1()) {
                    int i10 = -1;
                    if (this.f65270h.getFetchBlockSize() != -1) {
                        IMAPMessage iMAPMessage = this.f65270h;
                        String str = this.f65272j;
                        if (!iMAPMessage.ignoreBodyStructureSize()) {
                            i10 = this.f65271i.size;
                        }
                        return new IMAPInputStream(iMAPMessage, str, i10, peek);
                    }
                }
                int sequenceNumber = this.f65270h.getSequenceNumber();
                BODY bodyPeekBody = peek ? protocol.peekBody(sequenceNumber, this.f65272j) : protocol.fetchBody(sequenceNumber, this.f65272j);
                ByteArrayInputStream byteArrayInputStream = bodyPeekBody != null ? bodyPeekBody.getByteArrayInputStream() : null;
                if (byteArrayInputStream != null) {
                    return byteArrayInputStream;
                }
                this.f65270h.forceCheckExpunged();
                return new ByteArrayInputStream(new byte[0]);
            } catch (ConnectionException e5) {
                throw new FolderClosedException(this.f65270h.getFolder(), e5.getMessage());
            } catch (ProtocolException e7) {
                throw new MessagingException(e7.getMessage(), e7);
            }
        }
    }

    @Override // javax.mail.internet.MimeBodyPart, javax.mail.Part
    public String getContentType() throws MessagingException {
        return this.f65273k;
    }

    @Override // javax.mail.internet.MimeBodyPart, javax.mail.Part
    public synchronized DataHandler getDataHandler() throws MessagingException {
        try {
            if (this.f78990dh == null) {
                if (this.f65271i.isMulti()) {
                    this.f78990dh = new DataHandler(new IMAPMultipartDataSource(this, this.f65271i.bodies, this.f65272j, this.f65270h));
                } else if (this.f65271i.isNested() && this.f65270h.isREV1() && this.f65271i.envelope != null) {
                    IMAPMessage iMAPMessage = this.f65270h;
                    BODYSTRUCTURE bodystructure = this.f65271i;
                    this.f78990dh = new DataHandler(new IMAPNestedMessage(iMAPMessage, bodystructure.bodies[0], bodystructure.envelope, this.f65272j), this.f65273k);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return super.getDataHandler();
    }

    @Override // javax.mail.internet.MimeBodyPart, javax.mail.Part
    public String getDescription() throws MessagingException {
        String str = this.f65274l;
        if (str != null) {
            return str;
        }
        BODYSTRUCTURE bodystructure = this.f65271i;
        String str2 = bodystructure.description;
        if (str2 == null) {
            return null;
        }
        try {
            this.f65274l = MimeUtility.decodeText(str2);
        } catch (UnsupportedEncodingException unused) {
            this.f65274l = bodystructure.description;
        }
        return this.f65274l;
    }

    @Override // javax.mail.internet.MimeBodyPart, javax.mail.Part
    public String getDisposition() throws MessagingException {
        return this.f65271i.disposition;
    }

    @Override // javax.mail.internet.MimeBodyPart, javax.mail.internet.MimePart
    public String getEncoding() throws MessagingException {
        return this.f65271i.encoding;
    }

    @Override // javax.mail.internet.MimeBodyPart, javax.mail.Part
    public String getFileName() throws MessagingException {
        ParameterList parameterList;
        BODYSTRUCTURE bodystructure = this.f65271i;
        ParameterList parameterList2 = bodystructure.dParams;
        String str = parameterList2 != null ? parameterList2.get("filename") : null;
        if ((str == null || str.isEmpty()) && (parameterList = bodystructure.cParams) != null) {
            str = parameterList.get("name");
        }
        if (!f65269n || str == null) {
            return str;
        }
        try {
            return MimeUtility.decodeText(str);
        } catch (UnsupportedEncodingException e5) {
            throw new MessagingException("Can't decode filename", e5);
        }
    }

    @Override // javax.mail.internet.MimeBodyPart, javax.mail.Part
    public String[] getHeader(String str) throws MessagingException {
        m();
        return super.getHeader(str);
    }

    @Override // javax.mail.internet.MimeBodyPart, javax.mail.Part
    public int getLineCount() throws MessagingException {
        return this.f65271i.lines;
    }

    @Override // javax.mail.internet.MimeBodyPart, javax.mail.internet.MimePart
    public Enumeration<String> getMatchingHeaderLines(String[] strArr) throws MessagingException {
        m();
        return super.getMatchingHeaderLines(strArr);
    }

    @Override // javax.mail.internet.MimeBodyPart, javax.mail.Part
    public Enumeration<Header> getMatchingHeaders(String[] strArr) throws MessagingException {
        m();
        return super.getMatchingHeaders(strArr);
    }

    @Override // com.sun.mail.util.ReadableMime
    public InputStream getMimeStream() throws MessagingException {
        InputStream stream;
        if (!this.f65270h.isREV1()) {
            m();
        }
        synchronized (this.f65270h.getMessageCacheLock()) {
            try {
                IMAPProtocol protocol = this.f65270h.getProtocol();
                this.f65270h.checkExpunged();
                if (protocol.isREV1()) {
                    BODY bodyPeekBody = protocol.peekBody(this.f65270h.getSequenceNumber(), this.f65272j + ".MIME");
                    if (bodyPeekBody == null) {
                        throw new MessagingException("Failed to fetch headers");
                    }
                    stream = bodyPeekBody.getByteArrayInputStream();
                    if (stream == null) {
                        throw new MessagingException("Failed to fetch headers");
                    }
                } else {
                    SharedByteArrayOutputStream sharedByteArrayOutputStream = new SharedByteArrayOutputStream(0);
                    LineOutputStream lineOutputStream = new LineOutputStream(sharedByteArrayOutputStream);
                    try {
                        Enumeration<String> allHeaderLines = super.getAllHeaderLines();
                        while (allHeaderLines.hasMoreElements()) {
                            lineOutputStream.writeln(allHeaderLines.nextElement());
                        }
                        lineOutputStream.writeln();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        try {
                            lineOutputStream.close();
                        } catch (IOException unused2) {
                        }
                        throw th2;
                    }
                    try {
                        lineOutputStream.close();
                    } catch (IOException unused3) {
                    }
                    stream = sharedByteArrayOutputStream.toStream();
                }
            } catch (ConnectionException e5) {
                throw new FolderClosedException(this.f65270h.getFolder(), e5.getMessage());
            } catch (ProtocolException e7) {
                throw new MessagingException(e7.getMessage(), e7);
            }
        }
        return new SequenceInputStream(stream, getContentStream());
    }

    @Override // javax.mail.internet.MimeBodyPart, javax.mail.internet.MimePart
    public Enumeration<String> getNonMatchingHeaderLines(String[] strArr) throws MessagingException {
        m();
        return super.getNonMatchingHeaderLines(strArr);
    }

    @Override // javax.mail.internet.MimeBodyPart, javax.mail.Part
    public Enumeration<Header> getNonMatchingHeaders(String[] strArr) throws MessagingException {
        m();
        return super.getNonMatchingHeaders(strArr);
    }

    @Override // javax.mail.internet.MimeBodyPart, javax.mail.Part
    public int getSize() throws MessagingException {
        return this.f65271i.size;
    }

    public final synchronized void m() throws MessagingException {
        try {
            if (this.m) {
                return;
            }
            if (this.headers == null) {
                this.headers = new InternetHeaders();
            }
            synchronized (this.f65270h.getMessageCacheLock()) {
                try {
                    try {
                        IMAPProtocol protocol = this.f65270h.getProtocol();
                        this.f65270h.checkExpunged();
                        if (protocol.isREV1()) {
                            BODY bodyPeekBody = protocol.peekBody(this.f65270h.getSequenceNumber(), this.f65272j + ".MIME");
                            if (bodyPeekBody == null) {
                                throw new MessagingException("Failed to fetch headers");
                            }
                            ByteArrayInputStream byteArrayInputStream = bodyPeekBody.getByteArrayInputStream();
                            if (byteArrayInputStream == null) {
                                throw new MessagingException("Failed to fetch headers");
                            }
                            this.headers.load(byteArrayInputStream);
                        } else {
                            this.headers.addHeader(DigipassManagerConstants.KEY_CONTENT_TYPE, this.f65273k);
                            this.headers.addHeader("Content-Transfer-Encoding", this.f65271i.encoding);
                            String str = this.f65271i.description;
                            if (str != null) {
                                this.headers.addHeader("Content-Description", str);
                            }
                            String str2 = this.f65271i.id;
                            if (str2 != null) {
                                this.headers.addHeader("Content-ID", str2);
                            }
                            String str3 = this.f65271i.md5;
                            if (str3 != null) {
                                this.headers.addHeader("Content-MD5", str3);
                            }
                        }
                    } catch (ConnectionException e5) {
                        throw new FolderClosedException(this.f65270h.getFolder(), e5.getMessage());
                    } catch (ProtocolException e7) {
                        throw new MessagingException(e7.getMessage(), e7);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.m = true;
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // javax.mail.internet.MimeBodyPart, javax.mail.Part
    public void removeHeader(String str) throws MessagingException {
        throw new IllegalWriteException("IMAPBodyPart is read-only");
    }

    @Override // javax.mail.internet.MimeBodyPart, javax.mail.Part
    public void setContent(Object obj, String str) throws MessagingException {
        throw new IllegalWriteException("IMAPBodyPart is read-only");
    }

    @Override // javax.mail.internet.MimeBodyPart, javax.mail.internet.MimePart
    public void setContentMD5(String str) throws MessagingException {
        throw new IllegalWriteException("IMAPBodyPart is read-only");
    }

    @Override // javax.mail.internet.MimeBodyPart, javax.mail.Part
    public void setDataHandler(DataHandler dataHandler) throws MessagingException {
        throw new IllegalWriteException("IMAPBodyPart is read-only");
    }

    @Override // javax.mail.internet.MimeBodyPart
    public void setDescription(String str, String str2) throws MessagingException {
        throw new IllegalWriteException("IMAPBodyPart is read-only");
    }

    @Override // javax.mail.internet.MimeBodyPart, javax.mail.Part
    public void setDisposition(String str) throws MessagingException {
        throw new IllegalWriteException("IMAPBodyPart is read-only");
    }

    @Override // javax.mail.internet.MimeBodyPart, javax.mail.Part
    public void setFileName(String str) throws MessagingException {
        throw new IllegalWriteException("IMAPBodyPart is read-only");
    }

    @Override // javax.mail.internet.MimeBodyPart, javax.mail.Part
    public void setHeader(String str, String str2) throws MessagingException {
        throw new IllegalWriteException("IMAPBodyPart is read-only");
    }

    @Override // javax.mail.internet.MimeBodyPart, javax.mail.Part
    public void setContent(Multipart multipart) throws MessagingException {
        throw new IllegalWriteException("IMAPBodyPart is read-only");
    }

    @Override // javax.mail.internet.MimeBodyPart
    public void updateHeaders() {
    }
}
