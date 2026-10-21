package javax.mail.internet;

import androidx.webkit.internal.AssetHelper;
import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import com.bbva.network.constant.ConstantsKt;
import com.sun.mail.util.ASCIIUtility;
import com.sun.mail.util.FolderClosedIOException;
import com.sun.mail.util.LineOutputStream;
import com.sun.mail.util.MessageRemovedIOException;
import com.sun.mail.util.MimeUtil;
import com.sun.mail.util.PropUtil;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectStreamException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.Properties;
import java.util.concurrent.atomic.AtomicInteger;
import javax.activation.DataHandler;
import javax.mail.Address;
import javax.mail.Flags;
import javax.mail.Folder;
import javax.mail.FolderClosedException;
import javax.mail.Header;
import javax.mail.Message;
import javax.mail.MessageRemovedException;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.util.SharedByteArrayInputStream;

/* JADX INFO: loaded from: classes12.dex */
public class MimeMessage extends Message implements MimePart {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final MailDateFormat f78993c = new MailDateFormat();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Flags f78994d = new Flags(Flags.Flag.ANSWERED);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f78995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f78996b;
    protected Object cachedContent;
    protected byte[] content;
    protected InputStream contentStream;

    /* JADX INFO: renamed from: dh, reason: collision with root package name */
    protected DataHandler f78997dh;
    protected Flags flags;
    protected InternetHeaders headers;
    protected boolean modified;
    protected boolean saved;

    public static class RecipientType extends Message.RecipientType {
        public static final RecipientType NEWSGROUPS = new RecipientType("Newsgroups");

        public RecipientType(String str) {
            super(str);
        }

        @Override // javax.mail.Message.RecipientType
        public Object readResolve() throws ObjectStreamException {
            return this.type.equals("Newsgroups") ? NEWSGROUPS : super.readResolve();
        }
    }

    public MimeMessage(Session session) {
        super(session);
        this.saved = false;
        this.f78995a = true;
        this.f78996b = false;
        this.modified = true;
        this.headers = new InternetHeaders();
        this.flags = new Flags();
        e();
    }

    public static Address[] b(ArrayList arrayList, Address[] addressArr) {
        boolean z10;
        if (addressArr == null) {
            return null;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < addressArr.length; i11++) {
            int i12 = 0;
            while (true) {
                if (i12 >= arrayList.size()) {
                    z10 = false;
                    break;
                }
                if (((InternetAddress) arrayList.get(i12)).equals(addressArr[i11])) {
                    i10++;
                    addressArr[i11] = null;
                    z10 = true;
                    break;
                }
                i12++;
            }
            if (!z10) {
                arrayList.add(addressArr[i11]);
            }
        }
        if (i10 == 0) {
            return addressArr;
        }
        Address[] addressArr2 = addressArr instanceof InternetAddress[] ? new InternetAddress[addressArr.length - i10] : new Address[addressArr.length - i10];
        int i13 = 0;
        for (Address address : addressArr) {
            if (address != null) {
                addressArr2[i13] = address;
                i13++;
            }
        }
        return addressArr2;
    }

    public static String d(Message.RecipientType recipientType) throws MessagingException {
        if (recipientType == Message.RecipientType.TO) {
            return "To";
        }
        if (recipientType == Message.RecipientType.CC) {
            return "Cc";
        }
        if (recipientType == Message.RecipientType.BCC) {
            return "Bcc";
        }
        if (recipientType == RecipientType.NEWSGROUPS) {
            return "Newsgroups";
        }
        throw new MessagingException("Invalid Recipient Type");
    }

    public final void a(String str, Address[] addressArr) throws MessagingException {
        if (addressArr == null || addressArr.length == 0) {
            return;
        }
        Address[] addressArrC = c(str);
        if (addressArrC != null && addressArrC.length != 0) {
            Address[] addressArr2 = new Address[addressArrC.length + addressArr.length];
            System.arraycopy(addressArrC, 0, addressArr2, 0, addressArrC.length);
            System.arraycopy(addressArr, 0, addressArr2, addressArrC.length, addressArr.length);
            addressArr = addressArr2;
        }
        String unicodeString = this.f78996b ? InternetAddress.toUnicodeString(addressArr, str.length() + 2) : InternetAddress.toString(addressArr, str.length() + 2);
        if (unicodeString == null) {
            return;
        }
        setHeader(str, unicodeString);
    }

    @Override // javax.mail.Message
    public void addFrom(Address[] addressArr) throws MessagingException {
        a("From", addressArr);
    }

    @Override // javax.mail.Part
    public void addHeader(String str, String str2) throws MessagingException {
        this.headers.addHeader(str, str2);
    }

    public void addHeaderLine(String str) throws MessagingException {
        this.headers.addHeaderLine(str);
    }

    @Override // javax.mail.Message
    public void addRecipients(Message.RecipientType recipientType, Address[] addressArr) throws MessagingException {
        if (recipientType != RecipientType.NEWSGROUPS) {
            a(d(recipientType), addressArr);
            return;
        }
        String string = NewsAddress.toString(addressArr);
        if (string != null) {
            addHeader("Newsgroups", string);
        }
    }

    public final Address[] c(String str) throws MessagingException {
        String header = getHeader(str, ",");
        if (header == null) {
            return null;
        }
        return InternetAddress.parseHeader(header, this.f78995a);
    }

    public InternetHeaders createInternetHeaders(InputStream inputStream) throws MessagingException {
        return new InternetHeaders(inputStream, this.f78996b);
    }

    public MimeMessage createMimeMessage(Session session) throws MessagingException {
        return new MimeMessage(session);
    }

    public final void e() {
        Session session = this.session;
        if (session != null) {
            Properties properties = session.getProperties();
            this.f78995a = PropUtil.getBooleanProperty(properties, "mail.mime.address.strict", true);
            this.f78996b = PropUtil.getBooleanProperty(properties, "mail.mime.allowutf8", false);
        }
    }

    public final void f(String str, Address[] addressArr) throws MessagingException {
        String unicodeString = this.f78996b ? InternetAddress.toUnicodeString(addressArr, str.length() + 2) : InternetAddress.toString(addressArr, str.length() + 2);
        if (unicodeString == null) {
            removeHeader(str);
        } else {
            setHeader(str, unicodeString);
        }
    }

    public Enumeration<String> getAllHeaderLines() throws MessagingException {
        return this.headers.getAllHeaderLines();
    }

    @Override // javax.mail.Part
    public Enumeration<Header> getAllHeaders() throws MessagingException {
        return this.headers.getAllHeaders();
    }

    @Override // javax.mail.Message
    public Address[] getAllRecipients() throws MessagingException {
        Address[] allRecipients = super.getAllRecipients();
        Address[] recipients = getRecipients(RecipientType.NEWSGROUPS);
        if (recipients == null) {
            return allRecipients;
        }
        if (allRecipients == null) {
            return recipients;
        }
        Address[] addressArr = new Address[allRecipients.length + recipients.length];
        System.arraycopy(allRecipients, 0, addressArr, 0, allRecipients.length);
        System.arraycopy(recipients, 0, addressArr, allRecipients.length, recipients.length);
        return addressArr;
    }

    @Override // javax.mail.Part
    public Object getContent() throws MessagingException, IOException {
        Object obj = this.cachedContent;
        if (obj != null) {
            return obj;
        }
        try {
            Object content = getDataHandler().getContent();
            if (MimeBodyPart.f78989g && (((content instanceof Multipart) || (content instanceof Message)) && (this.content != null || this.contentStream != null))) {
                this.cachedContent = content;
                if (content instanceof MimeMultipart) {
                    ((MimeMultipart) content).parse();
                }
            }
            return content;
        } catch (FolderClosedIOException e5) {
            throw new FolderClosedException(e5.getFolder(), e5.getMessage());
        } catch (MessageRemovedIOException e7) {
            throw new MessageRemovedException(e7.getMessage());
        }
    }

    public String getContentID() throws MessagingException {
        return getHeader("Content-Id", null);
    }

    public String[] getContentLanguage() throws MessagingException {
        return MimeBodyPart.a(this);
    }

    public String getContentMD5() throws MessagingException {
        return getHeader("Content-MD5", null);
    }

    public InputStream getContentStream() throws MessagingException {
        Closeable closeable = this.contentStream;
        if (closeable != null) {
            return ((SharedInputStream) closeable).newStream(0L, -1L);
        }
        if (this.content != null) {
            return new SharedByteArrayInputStream(this.content);
        }
        throw new MessagingException("No MimeMessage content");
    }

    @Override // javax.mail.Part
    public String getContentType() throws MessagingException {
        String strCleanContentType = MimeUtil.cleanContentType(this, getHeader(DigipassManagerConstants.KEY_CONTENT_TYPE, null));
        return strCleanContentType == null ? AssetHelper.DEFAULT_MIME_TYPE : strCleanContentType;
    }

    @Override // javax.mail.Part
    public synchronized DataHandler getDataHandler() throws MessagingException {
        try {
            if (this.f78997dh == null) {
                this.f78997dh = new MimeBodyPart.b(this);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f78997dh;
    }

    @Override // javax.mail.Part
    public String getDescription() throws MessagingException {
        boolean z10 = MimeBodyPart.f78983a;
        String header = getHeader("Content-Description", null);
        if (header == null) {
            return null;
        }
        try {
            return MimeUtility.decodeText(MimeUtility.unfold(header));
        } catch (UnsupportedEncodingException unused) {
            return header;
        }
    }

    @Override // javax.mail.Part
    public String getDisposition() throws MessagingException {
        boolean z10 = MimeBodyPart.f78983a;
        String header = getHeader(ConstantsKt.CONTENT_DISPOSITION, null);
        if (header == null) {
            return null;
        }
        return new ContentDisposition(header).getDisposition();
    }

    public String getEncoding() throws MessagingException {
        return MimeBodyPart.b(this);
    }

    @Override // javax.mail.Part
    public String getFileName() throws MessagingException {
        return MimeBodyPart.c(this);
    }

    @Override // javax.mail.Message
    public synchronized Flags getFlags() throws MessagingException {
        return (Flags) this.flags.clone();
    }

    @Override // javax.mail.Message
    public Address[] getFrom() throws MessagingException {
        Address[] addressArrC = c("From");
        return addressArrC == null ? c("Sender") : addressArrC;
    }

    @Override // javax.mail.Part
    public String[] getHeader(String str) throws MessagingException {
        return this.headers.getHeader(str);
    }

    @Override // javax.mail.Part
    public InputStream getInputStream() throws MessagingException, IOException {
        return getDataHandler().getInputStream();
    }

    @Override // javax.mail.Part
    public int getLineCount() throws MessagingException {
        return -1;
    }

    public Enumeration<String> getMatchingHeaderLines(String[] strArr) throws MessagingException {
        return this.headers.getMatchingHeaderLines(strArr);
    }

    @Override // javax.mail.Part
    public Enumeration<Header> getMatchingHeaders(String[] strArr) throws MessagingException {
        return this.headers.getMatchingHeaders(strArr);
    }

    public String getMessageID() throws MessagingException {
        return getHeader("Message-ID", null);
    }

    public Enumeration<String> getNonMatchingHeaderLines(String[] strArr) throws MessagingException {
        return this.headers.getNonMatchingHeaderLines(strArr);
    }

    @Override // javax.mail.Part
    public Enumeration<Header> getNonMatchingHeaders(String[] strArr) throws MessagingException {
        return this.headers.getNonMatchingHeaders(strArr);
    }

    public InputStream getRawInputStream() throws MessagingException {
        return getContentStream();
    }

    @Override // javax.mail.Message
    public Date getReceivedDate() throws MessagingException {
        return null;
    }

    @Override // javax.mail.Message
    public Address[] getRecipients(Message.RecipientType recipientType) throws MessagingException {
        if (recipientType != RecipientType.NEWSGROUPS) {
            return c(d(recipientType));
        }
        String header = getHeader("Newsgroups", ",");
        if (header == null) {
            return null;
        }
        return NewsAddress.parse(header);
    }

    @Override // javax.mail.Message
    public Address[] getReplyTo() throws MessagingException {
        Address[] addressArrC = c("Reply-To");
        return (addressArrC == null || addressArrC.length == 0) ? getFrom() : addressArrC;
    }

    public Address getSender() throws MessagingException {
        Address[] addressArrC = c("Sender");
        if (addressArrC == null || addressArrC.length == 0) {
            return null;
        }
        return addressArrC[0];
    }

    @Override // javax.mail.Message
    public Date getSentDate() throws MessagingException {
        Date date;
        String header = getHeader("Date", null);
        if (header != null) {
            try {
                MailDateFormat mailDateFormat = f78993c;
                synchronized (mailDateFormat) {
                    date = mailDateFormat.parse(header);
                }
                return date;
            } catch (java.text.ParseException unused) {
            }
        }
        return null;
    }

    @Override // javax.mail.Part
    public int getSize() throws MessagingException {
        byte[] bArr = this.content;
        if (bArr != null) {
            return bArr.length;
        }
        InputStream inputStream = this.contentStream;
        if (inputStream == null) {
            return -1;
        }
        try {
            int iAvailable = inputStream.available();
            if (iAvailable > 0) {
                return iAvailable;
            }
            return -1;
        } catch (IOException unused) {
            return -1;
        }
    }

    @Override // javax.mail.Message
    public String getSubject() throws MessagingException {
        String header = getHeader("Subject", null);
        if (header == null) {
            return null;
        }
        try {
            return MimeUtility.decodeText(MimeUtility.unfold(header));
        } catch (UnsupportedEncodingException unused) {
            return header;
        }
    }

    @Override // javax.mail.Part
    public boolean isMimeType(String str) throws MessagingException {
        return MimeBodyPart.d(this, str);
    }

    @Override // javax.mail.Message
    public synchronized boolean isSet(Flags.Flag flag) throws MessagingException {
        return this.flags.contains(flag);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void parse(InputStream inputStream) throws MessagingException {
        boolean z10 = inputStream instanceof ByteArrayInputStream;
        InputStream bufferedInputStream = inputStream;
        if (!z10 && !(inputStream instanceof BufferedInputStream) && !(inputStream instanceof SharedInputStream)) {
            bufferedInputStream = inputStream;
            bufferedInputStream = inputStream;
            bufferedInputStream = new BufferedInputStream(inputStream);
        }
        bufferedInputStream = inputStream;
        bufferedInputStream = inputStream;
        bufferedInputStream = inputStream;
        this.headers = createInternetHeaders(bufferedInputStream);
        if (bufferedInputStream instanceof SharedInputStream) {
            SharedInputStream sharedInputStream = (SharedInputStream) bufferedInputStream;
            this.contentStream = sharedInputStream.newStream(sharedInputStream.getPosition(), -1L);
        } else {
            try {
                this.content = ASCIIUtility.getBytes(bufferedInputStream);
            } catch (IOException e5) {
                throw new MessagingException("IOException", e5);
            }
        }
        this.modified = false;
    }

    @Override // javax.mail.Part
    public void removeHeader(String str) throws MessagingException {
        this.headers.removeHeader(str);
    }

    @Override // javax.mail.Message
    public Message reply(boolean z10) throws MessagingException {
        return reply(z10, true);
    }

    @Override // javax.mail.Message
    public void saveChanges() throws MessagingException {
        this.modified = true;
        this.saved = true;
        updateHeaders();
    }

    @Override // javax.mail.Part
    public void setContent(Object obj, String str) throws MessagingException {
        if (obj instanceof Multipart) {
            setContent((Multipart) obj);
        } else {
            setDataHandler(new DataHandler(obj, str));
        }
    }

    public void setContentID(String str) throws MessagingException {
        if (str == null) {
            removeHeader("Content-ID");
        } else {
            setHeader("Content-ID", str);
        }
    }

    public void setContentLanguage(String[] strArr) throws MessagingException {
        MimeBodyPart.f(this, strArr);
    }

    public void setContentMD5(String str) throws MessagingException {
        setHeader("Content-MD5", str);
    }

    @Override // javax.mail.Part
    public synchronized void setDataHandler(DataHandler dataHandler) throws MessagingException {
        this.f78997dh = dataHandler;
        this.cachedContent = null;
        boolean z10 = MimeBodyPart.f78983a;
        removeHeader(DigipassManagerConstants.KEY_CONTENT_TYPE);
        removeHeader("Content-Transfer-Encoding");
    }

    @Override // javax.mail.Part
    public void setDescription(String str) throws MessagingException {
        setDescription(str, null);
    }

    @Override // javax.mail.Part
    public void setDisposition(String str) throws MessagingException {
        MimeBodyPart.h(this, str);
    }

    @Override // javax.mail.Part
    public void setFileName(String str) throws MessagingException {
        MimeBodyPart.i(this, str);
    }

    @Override // javax.mail.Message
    public synchronized void setFlags(Flags flags, boolean z10) throws MessagingException {
        try {
            if (z10) {
                this.flags.add(flags);
            } else {
                this.flags.remove(flags);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // javax.mail.Message
    public void setFrom(Address address) throws MessagingException {
        if (address == null) {
            removeHeader("From");
        } else {
            setHeader("From", MimeUtility.fold(6, address.toString()));
        }
    }

    @Override // javax.mail.Part
    public void setHeader(String str, String str2) throws MessagingException {
        this.headers.setHeader(str, str2);
    }

    @Override // javax.mail.Message
    public void setRecipients(Message.RecipientType recipientType, Address[] addressArr) throws MessagingException {
        if (recipientType != RecipientType.NEWSGROUPS) {
            f(d(recipientType), addressArr);
        } else if (addressArr == null || addressArr.length == 0) {
            removeHeader("Newsgroups");
        } else {
            setHeader("Newsgroups", NewsAddress.toString(addressArr));
        }
    }

    @Override // javax.mail.Message
    public void setReplyTo(Address[] addressArr) throws MessagingException {
        f("Reply-To", addressArr);
    }

    public void setSender(Address address) throws MessagingException {
        if (address == null) {
            removeHeader("Sender");
        } else {
            setHeader("Sender", MimeUtility.fold(8, address.toString()));
        }
    }

    @Override // javax.mail.Message
    public void setSentDate(Date date) throws MessagingException {
        if (date == null) {
            removeHeader("Date");
            return;
        }
        MailDateFormat mailDateFormat = f78993c;
        synchronized (mailDateFormat) {
            setHeader("Date", mailDateFormat.format(date));
        }
    }

    @Override // javax.mail.Message
    public void setSubject(String str) throws MessagingException {
        setSubject(str, null);
    }

    @Override // javax.mail.Part, javax.mail.internet.MimePart
    public void setText(String str) throws MessagingException {
        setText(str, null);
    }

    public synchronized void updateHeaders() throws MessagingException {
        try {
            MimeBodyPart.k(this);
            setHeader("MIME-Version", "1.0");
            if (getHeader("Date") == null) {
                setSentDate(new Date());
            }
            updateMessageID();
            Object obj = this.cachedContent;
            if (obj != null) {
                this.f78997dh = new DataHandler(obj, getContentType());
                this.cachedContent = null;
                this.content = null;
                InputStream inputStream = this.contentStream;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                }
                this.contentStream = null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void updateMessageID() throws MessagingException {
        StringBuilder sb2 = new StringBuilder("<");
        Session session = this.session;
        AtomicInteger atomicInteger = b.f79039a;
        InternetAddress localAddress = InternetAddress.getLocalAddress(session);
        String address = localAddress != null ? localAddress.getAddress() : "javamailuser@localhost";
        int iLastIndexOf = address.lastIndexOf(64);
        if (iLastIndexOf >= 0) {
            address = address.substring(iLastIndexOf);
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(sb3.hashCode());
        sb3.append('.');
        sb3.append(b.f79039a.getAndIncrement());
        sb3.append('.');
        sb3.append(System.currentTimeMillis());
        sb3.append(address);
        sb2.append(sb3.toString());
        sb2.append(">");
        setHeader("Message-ID", sb2.toString());
    }

    @Override // javax.mail.Part
    public void writeTo(OutputStream outputStream) throws Throwable {
        writeTo(outputStream, null);
    }

    public String getHeader(String str, String str2) throws MessagingException {
        return this.headers.getHeader(str, str2);
    }

    public Message reply(boolean z10, boolean z11) throws MessagingException {
        MimeMessage mimeMessageCreateMimeMessage = createMimeMessage(this.session);
        String header = getHeader("Subject", null);
        if (header != null) {
            if (!header.regionMatches(true, 0, "Re: ", 0, 4)) {
                header = "Re: ".concat(header);
            }
            mimeMessageCreateMimeMessage.setHeader("Subject", header);
        }
        Address[] replyTo = getReplyTo();
        Message.RecipientType recipientType = Message.RecipientType.TO;
        mimeMessageCreateMimeMessage.setRecipients(recipientType, replyTo);
        if (z10) {
            ArrayList arrayList = new ArrayList();
            InternetAddress localAddress = InternetAddress.getLocalAddress(this.session);
            if (localAddress != null) {
                arrayList.add(localAddress);
            }
            Session session = this.session;
            String property = session != null ? session.getProperty("mail.alternates") : null;
            if (property != null) {
                b(arrayList, InternetAddress.parse(property, false));
            }
            Session session2 = this.session;
            boolean booleanProperty = session2 != null ? PropUtil.getBooleanProperty(session2.getProperties(), "mail.replyallcc", false) : false;
            b(arrayList, replyTo);
            Address[] addressArrB = b(arrayList, getRecipients(recipientType));
            if (addressArrB != null && addressArrB.length > 0) {
                if (booleanProperty) {
                    mimeMessageCreateMimeMessage.addRecipients(Message.RecipientType.CC, addressArrB);
                } else {
                    mimeMessageCreateMimeMessage.addRecipients(recipientType, addressArrB);
                }
            }
            Message.RecipientType recipientType2 = Message.RecipientType.CC;
            Address[] addressArrB2 = b(arrayList, getRecipients(recipientType2));
            if (addressArrB2 != null && addressArrB2.length > 0) {
                mimeMessageCreateMimeMessage.addRecipients(recipientType2, addressArrB2);
            }
            RecipientType recipientType3 = RecipientType.NEWSGROUPS;
            Address[] recipients = getRecipients(recipientType3);
            if (recipients != null && recipients.length > 0) {
                mimeMessageCreateMimeMessage.setRecipients(recipientType3, recipients);
            }
        }
        String header2 = getHeader("Message-Id", null);
        if (header2 != null) {
            mimeMessageCreateMimeMessage.setHeader("In-Reply-To", header2);
        }
        String header3 = getHeader("References", " ");
        if (header3 == null) {
            header3 = getHeader("In-Reply-To", " ");
        }
        if (header2 == null) {
            header2 = header3;
        } else if (header3 != null) {
            header2 = MimeUtility.unfold(header3) + " " + header2;
        }
        if (header2 != null) {
            mimeMessageCreateMimeMessage.setHeader("References", MimeUtility.fold(12, header2));
        }
        if (z11) {
            try {
                setFlags(f78994d, true);
            } catch (MessagingException unused) {
            }
        }
        return mimeMessageCreateMimeMessage;
    }

    public void setDescription(String str, String str2) throws MessagingException {
        MimeBodyPart.g(this, str, str2);
    }

    public void setSubject(String str, String str2) throws MessagingException {
        if (str == null) {
            removeHeader("Subject");
            return;
        }
        try {
            setHeader("Subject", MimeUtility.fold(9, MimeUtility.encodeText(str, str2, null)));
        } catch (UnsupportedEncodingException e5) {
            throw new MessagingException("Encoding error", e5);
        }
    }

    @Override // javax.mail.internet.MimePart
    public void setText(String str, String str2) throws MessagingException {
        MimeBodyPart.j(this, str, str2, "plain");
    }

    public void writeTo(OutputStream outputStream, String[] strArr) throws Throwable {
        InputStream contentStream;
        if (!this.saved) {
            saveChanges();
        }
        if (this.modified) {
            MimeBodyPart.l(this, outputStream, strArr);
            return;
        }
        Enumeration<String> nonMatchingHeaderLines = getNonMatchingHeaderLines(strArr);
        LineOutputStream lineOutputStream = new LineOutputStream(outputStream, this.f78996b);
        while (nonMatchingHeaderLines.hasMoreElements()) {
            lineOutputStream.writeln(nonMatchingHeaderLines.nextElement());
        }
        lineOutputStream.writeln();
        byte[] bArr = this.content;
        if (bArr == null) {
            byte[] bArr2 = new byte[8192];
            try {
                contentStream = getContentStream();
                while (true) {
                    try {
                        int i10 = contentStream.read(bArr2);
                        if (i10 <= 0) {
                            break;
                        } else {
                            outputStream.write(bArr2, 0, i10);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (contentStream != null) {
                            contentStream.close();
                        }
                        throw th;
                    }
                }
                contentStream.close();
            } catch (Throwable th3) {
                th = th3;
                contentStream = null;
            }
        } else {
            outputStream.write(bArr);
        }
        outputStream.flush();
    }

    public void setFrom(String str) throws MessagingException {
        if (str == null) {
            removeHeader("From");
        } else {
            f("From", InternetAddress.parse(str));
        }
    }

    @Override // javax.mail.internet.MimePart
    public void setText(String str, String str2, String str3) throws MessagingException {
        MimeBodyPart.j(this, str, str2, str3);
    }

    @Override // javax.mail.Part
    public void setContent(Multipart multipart) throws MessagingException {
        setDataHandler(new DataHandler(multipart, multipart.getContentType()));
        multipart.setParent(this);
    }

    public void addRecipients(Message.RecipientType recipientType, String str) throws MessagingException {
        if (recipientType == RecipientType.NEWSGROUPS) {
            if (str == null || str.length() == 0) {
                return;
            }
            addHeader("Newsgroups", str);
            return;
        }
        a(d(recipientType), InternetAddress.parse(str));
    }

    @Override // javax.mail.Message
    public void setFrom() throws MessagingException {
        try {
            InternetAddress internetAddressA = InternetAddress.a(this.session);
            if (internetAddressA != null) {
                setFrom(internetAddressA);
                return;
            }
            throw new MessagingException("No From address");
        } catch (Exception e5) {
            throw new MessagingException("No From address", e5);
        }
    }

    public void setRecipients(Message.RecipientType recipientType, String str) throws MessagingException {
        if (recipientType == RecipientType.NEWSGROUPS) {
            if (str != null && str.length() != 0) {
                setHeader("Newsgroups", str);
                return;
            } else {
                removeHeader("Newsgroups");
                return;
            }
        }
        f(d(recipientType), str == null ? null : InternetAddress.parse(str));
    }

    public MimeMessage(Session session, InputStream inputStream) throws MessagingException {
        super(session);
        this.modified = false;
        this.saved = false;
        this.f78995a = true;
        this.f78996b = false;
        this.flags = new Flags();
        e();
        parse(inputStream);
        this.saved = true;
    }

    public MimeMessage(MimeMessage mimeMessage) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        super(mimeMessage.session);
        this.modified = false;
        this.saved = false;
        this.f78995a = true;
        this.f78996b = false;
        Flags flags = mimeMessage.getFlags();
        this.flags = flags;
        if (flags == null) {
            this.flags = new Flags();
        }
        int size = mimeMessage.getSize();
        if (size > 0) {
            byteArrayOutputStream = new ByteArrayOutputStream(size);
        } else {
            byteArrayOutputStream = new ByteArrayOutputStream();
        }
        try {
            this.f78995a = mimeMessage.f78995a;
            mimeMessage.writeTo(byteArrayOutputStream);
            byteArrayOutputStream.close();
            SharedByteArrayInputStream sharedByteArrayInputStream = new SharedByteArrayInputStream(byteArrayOutputStream.toByteArray());
            parse(sharedByteArrayInputStream);
            sharedByteArrayInputStream.close();
            this.saved = true;
        } catch (IOException e5) {
            throw new MessagingException("IOException while copying message", e5);
        }
    }

    public MimeMessage(Folder folder, int i10) {
        super(folder, i10);
        this.modified = false;
        this.saved = false;
        this.f78995a = true;
        this.f78996b = false;
        this.flags = new Flags();
        this.saved = true;
        e();
    }

    public MimeMessage(Folder folder, InputStream inputStream, int i10) throws MessagingException {
        this(folder, i10);
        e();
        parse(inputStream);
    }

    public MimeMessage(Folder folder, InternetHeaders internetHeaders, byte[] bArr, int i10) throws MessagingException {
        this(folder, i10);
        this.headers = internetHeaders;
        this.content = bArr;
        e();
    }
}
