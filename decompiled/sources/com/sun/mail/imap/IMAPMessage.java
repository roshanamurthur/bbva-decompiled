package com.sun.mail.imap;

import androidx.collection.f;
import com.sun.mail.iap.ConnectionException;
import com.sun.mail.iap.ProtocolException;
import com.sun.mail.iap.Response;
import com.sun.mail.imap.protocol.BODY;
import com.sun.mail.imap.protocol.BODYSTRUCTURE;
import com.sun.mail.imap.protocol.ENVELOPE;
import com.sun.mail.imap.protocol.FLAGS;
import com.sun.mail.imap.protocol.FetchItem;
import com.sun.mail.imap.protocol.FetchResponse;
import com.sun.mail.imap.protocol.IMAPProtocol;
import com.sun.mail.imap.protocol.INTERNALDATE;
import com.sun.mail.imap.protocol.Item;
import com.sun.mail.imap.protocol.MODSEQ;
import com.sun.mail.imap.protocol.RFC822DATA;
import com.sun.mail.imap.protocol.RFC822SIZE;
import com.sun.mail.imap.protocol.UID;
import com.sun.mail.util.ReadableMime;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Locale;
import java.util.Map;
import javax.activation.DataHandler;
import javax.mail.Address;
import javax.mail.FetchProfile;
import javax.mail.Flags;
import javax.mail.FolderClosedException;
import javax.mail.Header;
import javax.mail.IllegalWriteException;
import javax.mail.Message;
import javax.mail.MessageRemovedException;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.UIDFolder;
import javax.mail.internet.ContentType;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.InternetHeaders;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeUtility;
import javax.mail.internet.ParameterList;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes9.dex */
public class IMAPMessage extends MimeMessage implements ReadableMime {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f65328p = 0;
    protected BODYSTRUCTURE bs;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Date f65329e;
    protected ENVELOPE envelope;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f65330f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Boolean f65331g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile long f65332h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile long f65333i;
    protected Map<String, Object> items;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f65334j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f65335k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f65336l;
    public volatile boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public volatile boolean f65337n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Hashtable<String, String> f65338o;
    protected String sectionId;

    public static class FetchProfileCondition implements Utility.Condition {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f65339a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f65340b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f65341c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f65342d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f65343e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f65344f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f65345g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f65346h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final String[] f65347i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final HashSet f65348j = new HashSet();

        public FetchProfileCondition(FetchProfile fetchProfile, FetchItem[] fetchItemArr) {
            this.f65339a = false;
            this.f65340b = false;
            this.f65341c = false;
            this.f65342d = false;
            this.f65343e = false;
            this.f65344f = false;
            this.f65345g = false;
            this.f65346h = false;
            this.f65347i = null;
            if (fetchProfile.contains(FetchProfile.Item.ENVELOPE)) {
                this.f65339a = true;
            }
            if (fetchProfile.contains(FetchProfile.Item.FLAGS)) {
                this.f65340b = true;
            }
            if (fetchProfile.contains(FetchProfile.Item.CONTENT_INFO)) {
                this.f65341c = true;
            }
            if (fetchProfile.contains(FetchProfile.Item.SIZE)) {
                this.f65344f = true;
            }
            if (fetchProfile.contains(UIDFolder.FetchProfileItem.UID)) {
                this.f65342d = true;
            }
            if (fetchProfile.contains(IMAPFolder.FetchProfileItem.HEADERS)) {
                this.f65343e = true;
            }
            if (fetchProfile.contains(IMAPFolder.FetchProfileItem.SIZE)) {
                this.f65344f = true;
            }
            if (fetchProfile.contains(IMAPFolder.FetchProfileItem.MESSAGE)) {
                this.f65345g = true;
            }
            if (fetchProfile.contains(IMAPFolder.FetchProfileItem.INTERNALDATE)) {
                this.f65346h = true;
            }
            this.f65347i = fetchProfile.getHeaderNames();
            for (int i10 = 0; i10 < fetchItemArr.length; i10++) {
                if (fetchProfile.contains(fetchItemArr[i10].getFetchProfileItem())) {
                    this.f65348j.add(fetchItemArr[i10]);
                }
            }
        }

        @Override // com.sun.mail.imap.Utility.Condition
        public boolean test(IMAPMessage iMAPMessage) {
            if (this.f65339a && iMAPMessage.envelope == null && !iMAPMessage.f65337n) {
                return true;
            }
            if (this.f65340b && IMAPMessage.h(iMAPMessage) == null) {
                return true;
            }
            if (this.f65341c && iMAPMessage.bs == null && !iMAPMessage.f65337n) {
                return true;
            }
            if (this.f65342d && iMAPMessage.getUID() == -1) {
                return true;
            }
            if (this.f65343e && !iMAPMessage.m) {
                return true;
            }
            if (this.f65344f && iMAPMessage.f65330f == -1 && !iMAPMessage.f65337n) {
                return true;
            }
            if (this.f65345g && !iMAPMessage.f65337n) {
                return true;
            }
            if (this.f65346h && iMAPMessage.f65329e == null) {
                return true;
            }
            int i10 = 0;
            while (true) {
                String[] strArr = this.f65347i;
                if (i10 >= strArr.length) {
                    for (FetchItem fetchItem : this.f65348j) {
                        Map<String, Object> map = iMAPMessage.items;
                        if (map == null || map.get(fetchItem.getName()) == null) {
                            return true;
                        }
                    }
                    return false;
                }
                String str = strArr[i10];
                int i11 = IMAPMessage.f65328p;
                if (!iMAPMessage.i(str)) {
                    return true;
                }
                i10++;
            }
        }
    }

    public IMAPMessage(IMAPFolder iMAPFolder, int i10) {
        super(iMAPFolder, i10);
        this.f65330f = -1L;
        this.f65332h = -1L;
        this.f65333i = -1L;
        this.m = false;
        this.f65337n = false;
        this.f65338o = new Hashtable<>(1);
        this.flags = null;
    }

    public static Flags h(IMAPMessage iMAPMessage) {
        return iMAPMessage.flags;
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.Message
    public void addFrom(Address[] addressArr) throws MessagingException {
        throw new IllegalWriteException("IMAPMessage is read-only");
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.Part
    public void addHeader(String str, String str2) throws MessagingException {
        throw new IllegalWriteException("IMAPMessage is read-only");
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.internet.MimePart
    public void addHeaderLine(String str) throws MessagingException {
        throw new IllegalWriteException("IMAPMessage is read-only");
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.Message
    public void addRecipients(Message.RecipientType recipientType, Address[] addressArr) throws MessagingException {
        throw new IllegalWriteException("IMAPMessage is read-only");
    }

    public void checkExpunged() throws MessageRemovedException {
        if (this.expunged) {
            throw new MessageRemovedException();
        }
    }

    public Object fetchItem(FetchItem fetchItem) throws MessagingException {
        Object obj;
        Object obj2;
        synchronized (getMessageCacheLock()) {
            try {
                try {
                    IMAPProtocol protocol = getProtocol();
                    checkExpunged();
                    int sequenceNumber = getSequenceNumber();
                    Response[] responseArrFetch = protocol.fetch(sequenceNumber, fetchItem.getName());
                    obj = null;
                    for (int i10 = 0; i10 < responseArrFetch.length; i10++) {
                        Response response = responseArrFetch[i10];
                        if (response != null && (response instanceof FetchResponse) && ((FetchResponse) response).getNumber() == sequenceNumber) {
                            handleExtensionFetchItems(((FetchResponse) responseArrFetch[i10]).getExtensionItems());
                            Map<String, Object> map = this.items;
                            if (map != null && (obj2 = map.get(fetchItem.getName())) != null) {
                                obj = obj2;
                            }
                        }
                    }
                    protocol.notifyResponseHandlers(responseArrFetch);
                    protocol.handleResult(responseArrFetch[responseArrFetch.length - 1]);
                } catch (ConnectionException e5) {
                    throw new FolderClosedException(this.folder, e5.getMessage());
                } catch (ProtocolException e7) {
                    forceCheckExpunged();
                    throw new MessagingException(e7.getMessage(), e7);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }

    public void forceCheckExpunged() throws FolderClosedException, MessageRemovedException {
        synchronized (getMessageCacheLock()) {
            try {
                getProtocol().noop();
            } catch (ConnectionException e5) {
                throw new FolderClosedException(this.folder, e5.getMessage());
            } catch (ProtocolException unused) {
            }
        }
        if (this.expunged) {
            throw new MessageRemovedException();
        }
    }

    public final void g(FLAGS flags) {
        this.flags = flags;
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.internet.MimePart
    public Enumeration<String> getAllHeaderLines() throws MessagingException {
        checkExpunged();
        m();
        return super.getAllHeaderLines();
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.Part
    public Enumeration<Header> getAllHeaders() throws MessagingException {
        checkExpunged();
        m();
        return super.getAllHeaders();
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.internet.MimePart
    public String getContentID() throws MessagingException {
        checkExpunged();
        if (this.f65337n) {
            return super.getContentID();
        }
        j();
        return this.bs.id;
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.internet.MimePart
    public String[] getContentLanguage() throws MessagingException {
        checkExpunged();
        if (this.f65337n) {
            return super.getContentLanguage();
        }
        j();
        String[] strArr = this.bs.language;
        if (strArr != null) {
            return (String[]) strArr.clone();
        }
        return null;
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.internet.MimePart
    public String getContentMD5() throws MessagingException {
        checkExpunged();
        if (this.f65337n) {
            return super.getContentMD5();
        }
        j();
        return this.bs.md5;
    }

    @Override // javax.mail.internet.MimeMessage
    public InputStream getContentStream() throws MessagingException {
        if (this.f65337n) {
            return super.getContentStream();
        }
        boolean peek = getPeek();
        synchronized (getMessageCacheLock()) {
            try {
                try {
                    IMAPProtocol protocol = getProtocol();
                    checkExpunged();
                    if (protocol.isREV1()) {
                        int i10 = -1;
                        if (getFetchBlockSize() != -1) {
                            String strN = n("TEXT");
                            if (this.bs != null && !ignoreBodyStructureSize()) {
                                i10 = this.bs.size;
                            }
                            return new IMAPInputStream(this, strN, i10, peek);
                        }
                    }
                    ByteArrayInputStream byteArrayInputStream = null;
                    if (protocol.isREV1()) {
                        BODY bodyPeekBody = peek ? protocol.peekBody(getSequenceNumber(), n("TEXT")) : protocol.fetchBody(getSequenceNumber(), n("TEXT"));
                        if (bodyPeekBody != null) {
                            byteArrayInputStream = bodyPeekBody.getByteArrayInputStream();
                        }
                    } else {
                        RFC822DATA rfc822dataFetchRFC822 = protocol.fetchRFC822(getSequenceNumber(), "TEXT");
                        if (rfc822dataFetchRFC822 != null) {
                            byteArrayInputStream = rfc822dataFetchRFC822.getByteArrayInputStream();
                        }
                    }
                    if (byteArrayInputStream != null) {
                        return byteArrayInputStream;
                    }
                    forceCheckExpunged();
                    return new ByteArrayInputStream(new byte[0]);
                } catch (ConnectionException e5) {
                    throw new FolderClosedException(this.folder, e5.getMessage());
                } catch (ProtocolException e7) {
                    forceCheckExpunged();
                    throw new MessagingException(e7.getMessage(), e7);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.Part
    public synchronized String getContentType() throws MessagingException {
        checkExpunged();
        if (this.f65337n) {
            return super.getContentType();
        }
        if (this.f65334j == null) {
            j();
            BODYSTRUCTURE bodystructure = this.bs;
            this.f65334j = new ContentType(bodystructure.type, bodystructure.subtype, bodystructure.cParams).toString();
        }
        return this.f65334j;
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.Part
    public synchronized DataHandler getDataHandler() throws MessagingException {
        BODYSTRUCTURE bodystructure;
        ENVELOPE envelope;
        String str;
        try {
            checkExpunged();
            if (this.f78997dh == null && !this.f65337n) {
                j();
                if (this.f65334j == null) {
                    BODYSTRUCTURE bodystructure2 = this.bs;
                    this.f65334j = new ContentType(bodystructure2.type, bodystructure2.subtype, bodystructure2.cParams).toString();
                }
                if (this.bs.isMulti()) {
                    this.f78997dh = new DataHandler(new IMAPMultipartDataSource(this, this.bs.bodies, this.sectionId, this));
                } else if (this.bs.isNested() && isREV1() && (envelope = (bodystructure = this.bs).envelope) != null) {
                    BODYSTRUCTURE bodystructure3 = bodystructure.bodies[0];
                    if (this.sectionId == null) {
                        str = "1";
                    } else {
                        str = this.sectionId + ".1";
                    }
                    this.f78997dh = new DataHandler(new IMAPNestedMessage(this, bodystructure3, envelope, str), this.f65334j);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return super.getDataHandler();
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.Part
    public String getDescription() throws MessagingException {
        checkExpunged();
        if (this.f65337n) {
            return super.getDescription();
        }
        String str = this.f65336l;
        if (str != null) {
            return str;
        }
        j();
        String str2 = this.bs.description;
        if (str2 == null) {
            return null;
        }
        try {
            this.f65336l = MimeUtility.decodeText(str2);
        } catch (UnsupportedEncodingException unused) {
            this.f65336l = this.bs.description;
        }
        return this.f65336l;
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.Part
    public String getDisposition() throws MessagingException {
        checkExpunged();
        if (this.f65337n) {
            return super.getDisposition();
        }
        j();
        return this.bs.disposition;
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.internet.MimePart
    public String getEncoding() throws MessagingException {
        checkExpunged();
        if (this.f65337n) {
            return super.getEncoding();
        }
        j();
        return this.bs.encoding;
    }

    public int getFetchBlockSize() {
        return ((IMAPStore) this.folder.getStore()).f65355u0;
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.Part
    public String getFileName() throws MessagingException {
        ParameterList parameterList;
        checkExpunged();
        if (this.f65337n) {
            return super.getFileName();
        }
        j();
        ParameterList parameterList2 = this.bs.dParams;
        String str = parameterList2 != null ? parameterList2.get("filename") : null;
        return (str != null || (parameterList = this.bs.cParams) == null) ? str : parameterList.get("name");
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.Message
    public synchronized Flags getFlags() throws MessagingException {
        checkExpunged();
        l();
        return super.getFlags();
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.Message
    public Address[] getFrom() throws MessagingException {
        checkExpunged();
        if (this.f65337n) {
            return super.getFrom();
        }
        k();
        ENVELOPE envelope = this.envelope;
        InternetAddress[] internetAddressArr = envelope.from;
        if (internetAddressArr == null || internetAddressArr.length == 0) {
            internetAddressArr = envelope.sender;
        }
        if (internetAddressArr == null) {
            return null;
        }
        return (InternetAddress[]) internetAddressArr.clone();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0071  */
    @Override // javax.mail.internet.MimeMessage, javax.mail.Part
    public String[] getHeader(String str) throws MessagingException {
        ByteArrayInputStream byteArrayInputStream;
        checkExpunged();
        if (i(str)) {
            return this.headers.getHeader(str);
        }
        synchronized (getMessageCacheLock()) {
            try {
                try {
                    IMAPProtocol protocol = getProtocol();
                    checkExpunged();
                    if (protocol.isREV1()) {
                        BODY bodyPeekBody = protocol.peekBody(getSequenceNumber(), n("HEADER.FIELDS (" + str + ")"));
                        if (bodyPeekBody != null) {
                            byteArrayInputStream = bodyPeekBody.getByteArrayInputStream();
                        } else {
                            byteArrayInputStream = null;
                        }
                    } else {
                        RFC822DATA rfc822dataFetchRFC822 = protocol.fetchRFC822(getSequenceNumber(), "HEADER.LINES (" + str + ")");
                        if (rfc822dataFetchRFC822 != null) {
                            byteArrayInputStream = rfc822dataFetchRFC822.getByteArrayInputStream();
                        } else {
                            byteArrayInputStream = null;
                        }
                    }
                } catch (ConnectionException e5) {
                    throw new FolderClosedException(this.folder, e5.getMessage());
                } catch (ProtocolException e7) {
                    forceCheckExpunged();
                    throw new MessagingException(e7.getMessage(), e7);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (byteArrayInputStream == null) {
            return null;
        }
        if (this.headers == null) {
            this.headers = new InternetHeaders();
        }
        this.headers.load(byteArrayInputStream);
        this.f65338o.put(str.toUpperCase(Locale.ENGLISH), str);
        return this.headers.getHeader(str);
    }

    public String getInReplyTo() throws MessagingException {
        checkExpunged();
        if (this.f65337n) {
            return super.getHeader("In-Reply-To", " ");
        }
        k();
        return this.envelope.inReplyTo;
    }

    public synchronized Object getItem(FetchItem fetchItem) throws MessagingException {
        Object objFetchItem;
        Map<String, Object> map = this.items;
        objFetchItem = map == null ? null : map.get(fetchItem.getName());
        if (objFetchItem == null) {
            objFetchItem = fetchItem(fetchItem);
        }
        return objFetchItem;
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.Part
    public int getLineCount() throws MessagingException {
        checkExpunged();
        j();
        return this.bs.lines;
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.internet.MimePart
    public Enumeration<String> getMatchingHeaderLines(String[] strArr) throws MessagingException {
        checkExpunged();
        m();
        return super.getMatchingHeaderLines(strArr);
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.Part
    public Enumeration<Header> getMatchingHeaders(String[] strArr) throws MessagingException {
        checkExpunged();
        m();
        return super.getMatchingHeaders(strArr);
    }

    public Object getMessageCacheLock() {
        return ((IMAPFolder) this.folder).messageCacheLock;
    }

    @Override // javax.mail.internet.MimeMessage
    public String getMessageID() throws MessagingException {
        checkExpunged();
        if (this.f65337n) {
            return super.getMessageID();
        }
        k();
        return this.envelope.messageId;
    }

    @Override // com.sun.mail.util.ReadableMime
    public InputStream getMimeStream() throws MessagingException {
        boolean peek = getPeek();
        synchronized (getMessageCacheLock()) {
            try {
                IMAPProtocol protocol = getProtocol();
                checkExpunged();
                if (protocol.isREV1() && getFetchBlockSize() != -1) {
                    return new IMAPInputStream(this, this.sectionId, -1, peek);
                }
                ByteArrayInputStream byteArrayInputStream = null;
                if (protocol.isREV1()) {
                    BODY bodyPeekBody = peek ? protocol.peekBody(getSequenceNumber(), this.sectionId) : protocol.fetchBody(getSequenceNumber(), this.sectionId);
                    if (bodyPeekBody != null) {
                        byteArrayInputStream = bodyPeekBody.getByteArrayInputStream();
                    }
                } else {
                    RFC822DATA rfc822dataFetchRFC822 = protocol.fetchRFC822(getSequenceNumber(), null);
                    if (rfc822dataFetchRFC822 != null) {
                        byteArrayInputStream = rfc822dataFetchRFC822.getByteArrayInputStream();
                    }
                }
                if (byteArrayInputStream != null) {
                    return byteArrayInputStream;
                }
                forceCheckExpunged();
                return new ByteArrayInputStream(new byte[0]);
            } catch (ConnectionException e5) {
                throw new FolderClosedException(this.folder, e5.getMessage());
            } catch (ProtocolException e7) {
                forceCheckExpunged();
                throw new MessagingException(e7.getMessage(), e7);
            }
        }
    }

    public synchronized long getModSeq() throws MessagingException {
        if (this.f65333i != -1) {
            return this.f65333i;
        }
        synchronized (getMessageCacheLock()) {
            try {
                IMAPProtocol protocol = getProtocol();
                checkExpunged();
                MODSEQ modseqFetchMODSEQ = protocol.fetchMODSEQ(getSequenceNumber());
                if (modseqFetchMODSEQ != null) {
                    this.f65333i = modseqFetchMODSEQ.modseq;
                }
            } catch (ConnectionException e5) {
                throw new FolderClosedException(this.folder, e5.getMessage());
            } catch (ProtocolException e7) {
                throw new MessagingException(e7.getMessage(), e7);
            }
        }
        return this.f65333i;
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.internet.MimePart
    public Enumeration<String> getNonMatchingHeaderLines(String[] strArr) throws MessagingException {
        checkExpunged();
        m();
        return super.getNonMatchingHeaderLines(strArr);
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.Part
    public Enumeration<Header> getNonMatchingHeaders(String[] strArr) throws MessagingException {
        checkExpunged();
        m();
        return super.getNonMatchingHeaders(strArr);
    }

    public synchronized boolean getPeek() {
        Boolean bool = this.f65331g;
        if (bool == null) {
            return ((IMAPStore) this.folder.getStore()).Q0;
        }
        return bool.booleanValue();
    }

    public IMAPProtocol getProtocol() throws ProtocolException, FolderClosedException {
        ((IMAPFolder) this.folder).r();
        IMAPProtocol iMAPProtocol = ((IMAPFolder) this.folder).protocol;
        if (iMAPProtocol != null) {
            return iMAPProtocol;
        }
        throw new FolderClosedException(this.folder);
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.Message
    public Date getReceivedDate() throws MessagingException {
        checkExpunged();
        if (this.f65329e == null) {
            k();
        }
        if (this.f65329e == null) {
            return null;
        }
        return new Date(this.f65329e.getTime());
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.Message
    public Address[] getRecipients(Message.RecipientType recipientType) throws MessagingException {
        checkExpunged();
        if (this.f65337n) {
            return super.getRecipients(recipientType);
        }
        k();
        if (recipientType == Message.RecipientType.TO) {
            InternetAddress[] internetAddressArr = this.envelope.to;
            if (internetAddressArr == null) {
                return null;
            }
            return (InternetAddress[]) internetAddressArr.clone();
        }
        if (recipientType == Message.RecipientType.CC) {
            InternetAddress[] internetAddressArr2 = this.envelope.cc;
            if (internetAddressArr2 == null) {
                return null;
            }
            return (InternetAddress[]) internetAddressArr2.clone();
        }
        if (recipientType != Message.RecipientType.BCC) {
            return super.getRecipients(recipientType);
        }
        InternetAddress[] internetAddressArr3 = this.envelope.bcc;
        if (internetAddressArr3 == null) {
            return null;
        }
        return (InternetAddress[]) internetAddressArr3.clone();
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.Message
    public Address[] getReplyTo() throws MessagingException {
        checkExpunged();
        if (this.f65337n) {
            return super.getReplyTo();
        }
        k();
        InternetAddress[] internetAddressArr = this.envelope.replyTo;
        return (internetAddressArr == null || internetAddressArr.length == 0) ? getFrom() : (InternetAddress[]) internetAddressArr.clone();
    }

    @Override // javax.mail.internet.MimeMessage
    public Address getSender() throws MessagingException {
        checkExpunged();
        if (this.f65337n) {
            return super.getSender();
        }
        k();
        InternetAddress[] internetAddressArr = this.envelope.sender;
        if (internetAddressArr == null || internetAddressArr.length <= 0) {
            return null;
        }
        return internetAddressArr[0];
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.Message
    public Date getSentDate() throws MessagingException {
        checkExpunged();
        if (this.f65337n) {
            return super.getSentDate();
        }
        k();
        if (this.envelope.date == null) {
            return null;
        }
        return new Date(this.envelope.date.getTime());
    }

    public int getSequenceNumber() {
        return ((IMAPFolder) this.folder).messageCache.seqnumOf(getMessageNumber());
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.Part
    public int getSize() throws MessagingException {
        checkExpunged();
        if (this.f65330f == -1) {
            k();
        }
        long j10 = this.f65330f;
        if (j10 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) j10;
    }

    public long getSizeLong() throws MessagingException {
        checkExpunged();
        if (this.f65330f == -1) {
            k();
        }
        return this.f65330f;
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.Message
    public String getSubject() throws MessagingException {
        checkExpunged();
        if (this.f65337n) {
            return super.getSubject();
        }
        String str = this.f65335k;
        if (str != null) {
            return str;
        }
        k();
        String str2 = this.envelope.subject;
        if (str2 == null) {
            return null;
        }
        try {
            this.f65335k = MimeUtility.decodeText(MimeUtility.unfold(str2));
        } catch (UnsupportedEncodingException unused) {
            this.f65335k = this.envelope.subject;
        }
        return this.f65335k;
    }

    public long getUID() {
        return this.f65332h;
    }

    public void handleExtensionFetchItems(Map<String, Object> map) {
        if (map == null || map.isEmpty()) {
            return;
        }
        if (this.items == null) {
            this.items = new HashMap();
        }
        this.items.putAll(map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean handleFetchItem(Item item, String[] strArr, boolean z10) throws MessagingException {
        ByteArrayInputStream byteArrayInputStream;
        boolean zIsHeader;
        if (item instanceof Flags) {
            this.flags = (Flags) item;
        } else if (item instanceof ENVELOPE) {
            this.envelope = (ENVELOPE) item;
        } else if (item instanceof INTERNALDATE) {
            this.f65329e = ((INTERNALDATE) item).getDate();
        } else if (item instanceof RFC822SIZE) {
            this.f65330f = ((RFC822SIZE) item).size;
        } else if (item instanceof MODSEQ) {
            this.f65333i = ((MODSEQ) item).modseq;
        } else if (item instanceof BODYSTRUCTURE) {
            this.bs = (BODYSTRUCTURE) item;
        } else if (item instanceof UID) {
            UID uid = (UID) item;
            this.f65332h = uid.uid;
            IMAPFolder iMAPFolder = (IMAPFolder) this.folder;
            if (iMAPFolder.uidTable == null) {
                iMAPFolder.uidTable = new Hashtable<>();
            }
            ((IMAPFolder) this.folder).uidTable.put(Long.valueOf(uid.uid), this);
        } else {
            boolean z11 = item instanceof RFC822DATA;
            if (!z11 && !(item instanceof BODY)) {
                return false;
            }
            if (z11) {
                RFC822DATA rfc822data = (RFC822DATA) item;
                byteArrayInputStream = rfc822data.getByteArrayInputStream();
                zIsHeader = rfc822data.isHeader();
            } else {
                BODY body = (BODY) item;
                byteArrayInputStream = body.getByteArrayInputStream();
                zIsHeader = body.isHeader();
            }
            if (zIsHeader) {
                InternetHeaders internetHeaders = new InternetHeaders();
                if (byteArrayInputStream != null) {
                    internetHeaders.load(byteArrayInputStream);
                }
                if (this.headers == null || z10) {
                    this.headers = internetHeaders;
                } else {
                    Enumeration<Header> allHeaders = internetHeaders.getAllHeaders();
                    while (allHeaders.hasMoreElements()) {
                        Header headerNextElement = allHeaders.nextElement();
                        if (!i(headerNextElement.getName())) {
                            this.headers.addHeader(headerNextElement.getName(), headerNextElement.getValue());
                        }
                    }
                }
                if (z10) {
                    this.m = true;
                } else {
                    for (String str : strArr) {
                        this.f65338o.put(str.toUpperCase(Locale.ENGLISH), str);
                    }
                }
            } else {
                try {
                    this.f65330f = byteArrayInputStream.available();
                } catch (IOException unused) {
                }
                parse(byteArrayInputStream);
                this.f65337n = true;
                this.m = true;
            }
        }
        return true;
    }

    public final boolean i(String str) {
        if (this.m) {
            return true;
        }
        return this.f65338o.containsKey(str.toUpperCase(Locale.ENGLISH));
    }

    public boolean ignoreBodyStructureSize() {
        return ((IMAPStore) this.folder.getStore()).v0;
    }

    public synchronized void invalidateHeaders() {
        this.m = false;
        this.f65338o.clear();
        this.headers = null;
        this.envelope = null;
        this.bs = null;
        this.f65329e = null;
        this.f65330f = -1L;
        this.f65334j = null;
        this.f65335k = null;
        this.f65336l = null;
        this.flags = null;
        this.content = null;
        this.contentStream = null;
        this.f65337n = false;
    }

    public boolean isREV1() throws FolderClosedException {
        IMAPProtocol iMAPProtocol = ((IMAPFolder) this.folder).protocol;
        if (iMAPProtocol != null) {
            return iMAPProtocol.isREV1();
        }
        throw new FolderClosedException(this.folder);
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.Message
    public synchronized boolean isSet(Flags.Flag flag) throws MessagingException {
        checkExpunged();
        l();
        return super.isSet(flag);
    }

    public final synchronized void j() throws MessagingException {
        if (this.bs != null) {
            return;
        }
        synchronized (getMessageCacheLock()) {
            try {
                try {
                    IMAPProtocol protocol = getProtocol();
                    checkExpunged();
                    BODYSTRUCTURE bodystructureFetchBodyStructure = protocol.fetchBodyStructure(getSequenceNumber());
                    this.bs = bodystructureFetchBodyStructure;
                    if (bodystructureFetchBodyStructure == null) {
                        forceCheckExpunged();
                        throw new MessagingException("Unable to load BODYSTRUCTURE");
                    }
                } catch (ConnectionException e5) {
                    throw new FolderClosedException(this.folder, e5.getMessage());
                }
            } catch (ProtocolException e7) {
                forceCheckExpunged();
                throw new MessagingException(e7.getMessage(), e7);
            }
        }
    }

    public final synchronized void k() throws MessagingException {
        if (this.envelope != null) {
            return;
        }
        synchronized (getMessageCacheLock()) {
            try {
                try {
                    IMAPProtocol protocol = getProtocol();
                    checkExpunged();
                    int sequenceNumber = getSequenceNumber();
                    Response[] responseArrFetch = protocol.fetch(sequenceNumber, "ENVELOPE INTERNALDATE RFC822.SIZE");
                    for (int i10 = 0; i10 < responseArrFetch.length; i10++) {
                        Response response = responseArrFetch[i10];
                        if (response != null && (response instanceof FetchResponse) && ((FetchResponse) response).getNumber() == sequenceNumber) {
                            FetchResponse fetchResponse = (FetchResponse) responseArrFetch[i10];
                            int itemCount = fetchResponse.getItemCount();
                            for (int i11 = 0; i11 < itemCount; i11++) {
                                Item item = fetchResponse.getItem(i11);
                                if (item instanceof ENVELOPE) {
                                    this.envelope = (ENVELOPE) item;
                                } else if (item instanceof INTERNALDATE) {
                                    this.f65329e = ((INTERNALDATE) item).getDate();
                                } else if (item instanceof RFC822SIZE) {
                                    this.f65330f = ((RFC822SIZE) item).size;
                                }
                            }
                        }
                    }
                    protocol.notifyResponseHandlers(responseArrFetch);
                    protocol.handleResult(responseArrFetch[responseArrFetch.length - 1]);
                } catch (ConnectionException e5) {
                    throw new FolderClosedException(this.folder, e5.getMessage());
                } catch (ProtocolException e7) {
                    forceCheckExpunged();
                    throw new MessagingException(e7.getMessage(), e7);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (this.envelope == null) {
            throw new MessagingException("Failed to load IMAP envelope");
        }
    }

    public final synchronized void l() throws MessagingException {
        if (this.flags != null) {
            return;
        }
        synchronized (getMessageCacheLock()) {
            try {
                IMAPProtocol protocol = getProtocol();
                checkExpunged();
                Flags flagsFetchFlags = protocol.fetchFlags(getSequenceNumber());
                this.flags = flagsFetchFlags;
                if (flagsFetchFlags == null) {
                    this.flags = new Flags();
                }
            } catch (ConnectionException e5) {
                throw new FolderClosedException(this.folder, e5.getMessage());
            } catch (ProtocolException e7) {
                forceCheckExpunged();
                throw new MessagingException(e7.getMessage(), e7);
            }
        }
    }

    public final synchronized void m() throws MessagingException {
        ByteArrayInputStream byteArrayInputStream;
        if (this.m) {
            return;
        }
        synchronized (getMessageCacheLock()) {
            try {
                try {
                    IMAPProtocol protocol = getProtocol();
                    checkExpunged();
                    byteArrayInputStream = null;
                    if (protocol.isREV1()) {
                        BODY bodyPeekBody = protocol.peekBody(getSequenceNumber(), n("HEADER"));
                        if (bodyPeekBody != null) {
                            byteArrayInputStream = bodyPeekBody.getByteArrayInputStream();
                        }
                    } else {
                        RFC822DATA rfc822dataFetchRFC822 = protocol.fetchRFC822(getSequenceNumber(), "HEADER");
                        if (rfc822dataFetchRFC822 != null) {
                            byteArrayInputStream = rfc822dataFetchRFC822.getByteArrayInputStream();
                        }
                    }
                } catch (ConnectionException e5) {
                    throw new FolderClosedException(this.folder, e5.getMessage());
                } catch (ProtocolException e7) {
                    forceCheckExpunged();
                    throw new MessagingException(e7.getMessage(), e7);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (byteArrayInputStream == null) {
            throw new MessagingException("Cannot load header");
        }
        this.headers = new InternetHeaders(byteArrayInputStream);
        this.m = true;
    }

    public final String n(String str) {
        return this.sectionId == null ? str : f.c(new StringBuilder(), this.sectionId, Constant.DOT_STRING, str);
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.Part
    public void removeHeader(String str) throws MessagingException {
        throw new IllegalWriteException("IMAPMessage is read-only");
    }

    @Override // javax.mail.internet.MimeMessage
    public void setContentID(String str) throws MessagingException {
        throw new IllegalWriteException("IMAPMessage is read-only");
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.internet.MimePart
    public void setContentLanguage(String[] strArr) throws MessagingException {
        throw new IllegalWriteException("IMAPMessage is read-only");
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.internet.MimePart
    public void setContentMD5(String str) throws MessagingException {
        throw new IllegalWriteException("IMAPMessage is read-only");
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.Part
    public void setDataHandler(DataHandler dataHandler) throws MessagingException {
        throw new IllegalWriteException("IMAPMessage is read-only");
    }

    @Override // javax.mail.internet.MimeMessage
    public void setDescription(String str, String str2) throws MessagingException {
        throw new IllegalWriteException("IMAPMessage is read-only");
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.Part
    public void setDisposition(String str) throws MessagingException {
        throw new IllegalWriteException("IMAPMessage is read-only");
    }

    @Override // javax.mail.Message
    public void setExpunged(boolean z10) {
        super.setExpunged(z10);
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.Part
    public void setFileName(String str) throws MessagingException {
        throw new IllegalWriteException("IMAPMessage is read-only");
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.Message
    public synchronized void setFlags(Flags flags, boolean z10) throws MessagingException {
        synchronized (getMessageCacheLock()) {
            try {
                IMAPProtocol protocol = getProtocol();
                checkExpunged();
                protocol.storeFlags(getSequenceNumber(), flags, z10);
            } catch (ConnectionException e5) {
                throw new FolderClosedException(this.folder, e5.getMessage());
            } catch (ProtocolException e7) {
                throw new MessagingException(e7.getMessage(), e7);
            }
        }
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.Message
    public void setFrom(Address address) throws MessagingException {
        throw new IllegalWriteException("IMAPMessage is read-only");
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.Part
    public void setHeader(String str, String str2) throws MessagingException {
        throw new IllegalWriteException("IMAPMessage is read-only");
    }

    @Override // javax.mail.Message
    public void setMessageNumber(int i10) {
        super.setMessageNumber(i10);
    }

    public synchronized void setPeek(boolean z10) {
        this.f65331g = Boolean.valueOf(z10);
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.Message
    public void setRecipients(Message.RecipientType recipientType, Address[] addressArr) throws MessagingException {
        throw new IllegalWriteException("IMAPMessage is read-only");
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.Message
    public void setReplyTo(Address[] addressArr) throws MessagingException {
        throw new IllegalWriteException("IMAPMessage is read-only");
    }

    @Override // javax.mail.internet.MimeMessage
    public void setSender(Address address) throws MessagingException {
        throw new IllegalWriteException("IMAPMessage is read-only");
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.Message
    public void setSentDate(Date date) throws MessagingException {
        throw new IllegalWriteException("IMAPMessage is read-only");
    }

    @Override // javax.mail.internet.MimeMessage
    public void setSubject(String str, String str2) throws MessagingException {
        throw new IllegalWriteException("IMAPMessage is read-only");
    }

    public void setUID(long j10) {
        this.f65332h = j10;
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.Part
    public void writeTo(OutputStream outputStream) throws Throwable {
        if (this.f65337n) {
            super.writeTo(outputStream);
            return;
        }
        InputStream mimeStream = getMimeStream();
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int i10 = mimeStream.read(bArr);
                if (i10 == -1) {
                    mimeStream.close();
                    return;
                }
                outputStream.write(bArr, 0, i10);
            }
        } catch (Throwable th2) {
            mimeStream.close();
            throw th2;
        }
    }

    public IMAPMessage(Session session) {
        super(session);
        this.f65330f = -1L;
        this.f65332h = -1L;
        this.f65333i = -1L;
        this.m = false;
        this.f65337n = false;
        this.f65338o = new Hashtable<>(1);
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.internet.MimePart
    public String getHeader(String str, String str2) throws MessagingException {
        checkExpunged();
        if (getHeader(str) == null) {
            return null;
        }
        return this.headers.getHeader(str, str2);
    }
}
