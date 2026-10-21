package com.sun.mail.imap.protocol;

import androidx.camera.camera2.internal.compat.u;
import androidx.camera.core.processing.f;
import androidx.databinding.e;
import androidx.webkit.ProxyConfig;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.glomohybrid.base.deeplink.extensions.DeepLinkExtensionsKt;
import com.sun.mail.auth.Ntlm;
import com.sun.mail.iap.Argument;
import com.sun.mail.iap.BadCommandException;
import com.sun.mail.iap.ByteArray;
import com.sun.mail.iap.CommandFailedException;
import com.sun.mail.iap.ConnectionException;
import com.sun.mail.iap.Literal;
import com.sun.mail.iap.ParsingException;
import com.sun.mail.iap.Protocol;
import com.sun.mail.iap.ProtocolException;
import com.sun.mail.iap.Response;
import com.sun.mail.imap.ACL;
import com.sun.mail.imap.AppendUID;
import com.sun.mail.imap.CopyUID;
import com.sun.mail.imap.ResyncData;
import com.sun.mail.imap.Rights;
import com.sun.mail.imap.SortTerm;
import com.sun.mail.imap.Utility;
import com.sun.mail.util.ASCIIUtility;
import com.sun.mail.util.BASE64EncoderStream;
import com.sun.mail.util.MailLogger;
import com.sun.mail.util.PropUtil;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.logging.Level;
import javax.mail.Flags;
import javax.mail.Quota;
import javax.mail.internet.MimeUtility;
import javax.mail.search.SearchException;
import javax.mail.search.SearchTerm;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes9.dex */
public class IMAPProtocol extends Protocol {
    protected Set<String> enabled;
    public final boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f65432n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f65433o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f65434p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f65435q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public HashMap f65436r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ArrayList f65437s;
    protected String[] searchCharsets;
    protected SearchSequence searchSequence;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f65438t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final String f65439u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public SaslAuthenticator f65440v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f65441w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ByteArray f65442x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public volatile String f65443y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final byte[] f65431z = {13, 10};
    public static final FetchItem[] A = new FetchItem[0];
    public static final byte[] B = {68, 79, 78, 69, 13, 10};

    public IMAPProtocol(String str, String str2, int i10, Properties properties, boolean z10, MailLogger mailLogger) throws ProtocolException, IOException {
        super(str2, i10, properties, f.d("mail.", str), z10, mailLogger);
        this.m = false;
        this.f65432n = false;
        this.f65434p = true;
        try {
            this.f65439u = str;
            this.f65434p = !PropUtil.getBooleanProperty(properties, "mail.debug.auth", false);
            this.f65433o = PropUtil.getBooleanProperty(properties, this.prefix + ".referralexception", false);
            if (this.f65436r == null) {
                capability();
            }
            if (hasCapability("IMAP4rev1")) {
                this.f65432n = true;
            }
            this.searchCharsets = new String[]{"UTF-8", MimeUtility.mimeCharset(MimeUtility.getDefaultJavaCharset())};
            this.m = true;
        } catch (Throwable th2) {
            if (!this.m) {
                disconnect();
            }
            throw th2;
        }
    }

    public static Quota h(IMAPResponse iMAPResponse) throws ParsingException {
        Quota quota = new Quota(iMAPResponse.readAtomString());
        iMAPResponse.skipSpaces();
        if (iMAPResponse.readByte() != 40) {
            throw new ParsingException("parse error in QUOTA");
        }
        ArrayList arrayList = new ArrayList();
        while (!iMAPResponse.isNextNonSpace(RootService.CLOSE_BRACKET)) {
            String atom = iMAPResponse.readAtom();
            if (atom != null) {
                arrayList.add(new Quota.Resource(atom, iMAPResponse.readLong(), iMAPResponse.readLong()));
            }
        }
        quota.resources = (Quota.Resource[]) arrayList.toArray(new Quota.Resource[arrayList.size()]);
        return quota;
    }

    public static Argument i(ResyncData resyncData) {
        Argument argument = new Argument();
        argument.writeAtom("QRESYNC");
        Argument argument2 = new Argument();
        argument2.writeNumber(resyncData.getUIDValidity());
        argument2.writeNumber(resyncData.getModSeq());
        UIDSet[] resyncUIDSet = Utility.getResyncUIDSet(resyncData);
        if (resyncUIDSet != null) {
            argument2.writeString(UIDSet.toString(resyncUIDSet));
        }
        argument.writeArgument(argument2);
        return argument;
    }

    public void append(String str, Flags flags, Date date, Literal literal) throws ProtocolException {
        appenduid(str, flags, date, literal, false);
    }

    public AppendUID appenduid(String str, Flags flags, Date date, Literal literal) throws ProtocolException {
        return appenduid(str, flags, date, literal, true);
    }

    public synchronized void authlogin(String str, String str2) throws ProtocolException {
        Response responseByeResponse;
        boolean z10;
        String str3;
        try {
            ArrayList arrayList = new ArrayList();
            try {
                if (this.f65434p && isTracing()) {
                    this.logger.fine("AUTHENTICATE LOGIN command trace suppressed");
                    suspendTracing();
                }
                String strWriteCommand = null;
                try {
                    z10 = false;
                    responseByeResponse = null;
                    strWriteCommand = writeCommand("AUTHENTICATE LOGIN", null);
                } catch (Exception e5) {
                    responseByeResponse = Response.byeResponse(e5);
                    z10 = true;
                }
                OutputStream outputStream = getOutputStream();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                BASE64EncoderStream bASE64EncoderStream = new BASE64EncoderStream(byteArrayOutputStream, Integer.MAX_VALUE);
                boolean z11 = true;
                while (!z10) {
                    try {
                        responseByeResponse = readResponse();
                        if (responseByeResponse.isContinuation()) {
                            if (z11) {
                                str3 = str;
                                z11 = false;
                            } else {
                                str3 = str2;
                            }
                            bASE64EncoderStream.write(str3.getBytes(StandardCharsets.UTF_8));
                            bASE64EncoderStream.flush();
                            byteArrayOutputStream.write(f65431z);
                            outputStream.write(byteArrayOutputStream.toByteArray());
                            outputStream.flush();
                            byteArrayOutputStream.reset();
                        } else if ((responseByeResponse.isTagged() && responseByeResponse.getTag().equals(strWriteCommand)) || responseByeResponse.isBYE()) {
                            z10 = true;
                        }
                    } catch (Exception e7) {
                        responseByeResponse = Response.byeResponse(e7);
                    }
                    arrayList.add(responseByeResponse);
                }
                resumeTracing();
                Response[] responseArr = (Response[]) arrayList.toArray(new Response[arrayList.size()]);
                handleCapabilityResponse(responseArr);
                notifyResponseHandlers(responseArr);
                if (this.f65434p && isTracing()) {
                    this.logger.fine("AUTHENTICATE LOGIN command result: " + responseByeResponse);
                }
                handleLoginResult(responseByeResponse);
                setCapabilities(responseByeResponse);
                this.f65435q = true;
            } catch (Throwable th2) {
                resumeTracing();
                throw th2;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public synchronized void authntlm(String str, String str2, String str3) throws ProtocolException {
        Response responseByeResponse;
        boolean z10;
        boolean z11;
        String strGenerateType3Msg;
        try {
            ArrayList arrayList = new ArrayList();
            int intProperty = PropUtil.getIntProperty(this.props, "mail." + this.f65439u + ".auth.ntlm.flags", 0);
            Ntlm ntlm = new Ntlm(this.props.getProperty("mail." + this.f65439u + ".auth.ntlm.domain", ""), getLocalHost(), str2, str3, this.logger);
            try {
                if (this.f65434p && isTracing()) {
                    this.logger.fine("AUTHENTICATE NTLM command trace suppressed");
                    suspendTracing();
                }
                String strWriteCommand = null;
                try {
                    z10 = false;
                    responseByeResponse = null;
                    strWriteCommand = writeCommand("AUTHENTICATE NTLM", null);
                } catch (Exception e5) {
                    responseByeResponse = Response.byeResponse(e5);
                    z10 = true;
                }
                OutputStream outputStream = getOutputStream();
                boolean z12 = true;
                while (!z10) {
                    try {
                        responseByeResponse = readResponse();
                        if (responseByeResponse.isContinuation()) {
                            if (z12) {
                                strGenerateType3Msg = ntlm.generateType1Msg(intProperty);
                                z11 = false;
                            } else {
                                z11 = z12;
                                strGenerateType3Msg = ntlm.generateType3Msg(responseByeResponse.getRest());
                            }
                            try {
                                outputStream.write(strGenerateType3Msg.getBytes(StandardCharsets.UTF_8));
                                outputStream.write(f65431z);
                                outputStream.flush();
                                z12 = z11;
                            } catch (Exception e7) {
                                e = e7;
                                z12 = z11;
                                responseByeResponse = Response.byeResponse(e);
                                z10 = true;
                            }
                        } else if ((responseByeResponse.isTagged() && responseByeResponse.getTag().equals(strWriteCommand)) || responseByeResponse.isBYE()) {
                            z10 = true;
                        }
                    } catch (Exception e10) {
                        e = e10;
                    }
                    arrayList.add(responseByeResponse);
                }
                resumeTracing();
                Response[] responseArr = (Response[]) arrayList.toArray(new Response[arrayList.size()]);
                handleCapabilityResponse(responseArr);
                notifyResponseHandlers(responseArr);
                if (this.f65434p && isTracing()) {
                    this.logger.fine("AUTHENTICATE NTLM command result: " + responseByeResponse);
                }
                handleLoginResult(responseByeResponse);
                setCapabilities(responseByeResponse);
                this.f65435q = true;
            } catch (Throwable th2) {
                resumeTracing();
                throw th2;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public synchronized void authoauth2(String str, String str2) throws ProtocolException {
        Response responseByeResponse;
        boolean z10;
        try {
            ArrayList arrayList = new ArrayList();
            try {
                if (this.f65434p && isTracing()) {
                    this.logger.fine("AUTHENTICATE XOAUTH2 command trace suppressed");
                    suspendTracing();
                }
                String strWriteCommand = null;
                try {
                    Argument argument = new Argument();
                    argument.writeAtom("XOAUTH2");
                    z10 = false;
                    if (hasCapability("SASL-IR")) {
                        byte[] bArrEncode = BASE64EncoderStream.encode(("user=" + str + "\u0001auth=Bearer " + str2 + "\u0001\u0001").getBytes(StandardCharsets.UTF_8));
                        argument.writeAtom(ASCIIUtility.toString(bArrEncode, 0, bArrEncode.length));
                    }
                    strWriteCommand = writeCommand("AUTHENTICATE", argument);
                    responseByeResponse = null;
                } catch (Exception e5) {
                    responseByeResponse = Response.byeResponse(e5);
                    z10 = true;
                }
                OutputStream outputStream = getOutputStream();
                while (!z10) {
                    try {
                        responseByeResponse = readResponse();
                        if (responseByeResponse.isContinuation()) {
                            outputStream.write(BASE64EncoderStream.encode(("user=" + str + "\u0001auth=Bearer " + str2 + "\u0001\u0001").getBytes(StandardCharsets.UTF_8)));
                            outputStream.write(f65431z);
                            outputStream.flush();
                        } else if ((responseByeResponse.isTagged() && responseByeResponse.getTag().equals(strWriteCommand)) || responseByeResponse.isBYE()) {
                            z10 = true;
                        }
                    } catch (Exception e7) {
                        responseByeResponse = Response.byeResponse(e7);
                    }
                    arrayList.add(responseByeResponse);
                }
                resumeTracing();
                Response[] responseArr = (Response[]) arrayList.toArray(new Response[arrayList.size()]);
                handleCapabilityResponse(responseArr);
                notifyResponseHandlers(responseArr);
                if (this.f65434p && isTracing()) {
                    this.logger.fine("AUTHENTICATE XOAUTH2 command result: " + responseByeResponse);
                }
                handleLoginResult(responseByeResponse);
                setCapabilities(responseByeResponse);
                this.f65435q = true;
            } catch (Throwable th2) {
                resumeTracing();
                throw th2;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public synchronized void authplain(String str, String str2, String str3) throws ProtocolException {
        Response responseByeResponse;
        boolean z10;
        try {
            ArrayList arrayList = new ArrayList();
            try {
                if (this.f65434p && isTracing()) {
                    this.logger.fine("AUTHENTICATE PLAIN command trace suppressed");
                    suspendTracing();
                }
                String strWriteCommand = null;
                try {
                    z10 = false;
                    responseByeResponse = null;
                    strWriteCommand = writeCommand("AUTHENTICATE PLAIN", null);
                } catch (Exception e5) {
                    responseByeResponse = Response.byeResponse(e5);
                    z10 = true;
                }
                OutputStream outputStream = getOutputStream();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                BASE64EncoderStream bASE64EncoderStream = new BASE64EncoderStream(byteArrayOutputStream, Integer.MAX_VALUE);
                while (!z10) {
                    try {
                        responseByeResponse = readResponse();
                        if (responseByeResponse.isContinuation()) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(str == null ? "" : str);
                            sb2.append("\u0000");
                            sb2.append(str2);
                            sb2.append("\u0000");
                            sb2.append(str3);
                            bASE64EncoderStream.write(sb2.toString().getBytes(StandardCharsets.UTF_8));
                            bASE64EncoderStream.flush();
                            byteArrayOutputStream.write(f65431z);
                            outputStream.write(byteArrayOutputStream.toByteArray());
                            outputStream.flush();
                            byteArrayOutputStream.reset();
                        } else if ((responseByeResponse.isTagged() && responseByeResponse.getTag().equals(strWriteCommand)) || responseByeResponse.isBYE()) {
                            z10 = true;
                        }
                    } catch (Exception e7) {
                        responseByeResponse = Response.byeResponse(e7);
                    }
                    arrayList.add(responseByeResponse);
                }
                resumeTracing();
                Response[] responseArr = (Response[]) arrayList.toArray(new Response[arrayList.size()]);
                handleCapabilityResponse(responseArr);
                notifyResponseHandlers(responseArr);
                if (this.f65434p && isTracing()) {
                    this.logger.fine("AUTHENTICATE PLAIN command result: " + responseByeResponse);
                }
                handleLoginResult(responseByeResponse);
                setCapabilities(responseByeResponse);
                this.f65435q = true;
            } catch (Throwable th2) {
                resumeTracing();
                throw th2;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final void c(Response response) throws IMAPReferralException {
        int iIndexOf;
        String strSubstring;
        String strTrim;
        String rest = response.getRest();
        if (rest.startsWith(Constant.BRACKET_OPEN) && (iIndexOf = rest.indexOf(32)) > 0 && rest.substring(1, iIndexOf).equalsIgnoreCase("REFERRAL")) {
            int iIndexOf2 = rest.indexOf(93);
            if (iIndexOf2 > 0) {
                strSubstring = rest.substring(iIndexOf + 1, iIndexOf2);
                strTrim = rest.substring(iIndexOf2 + 1).trim();
            } else {
                strSubstring = rest.substring(iIndexOf + 1);
                strTrim = "";
            }
            if (response.isBYE()) {
                disconnect();
            }
            throw new IMAPReferralException(strTrim, strSubstring);
        }
    }

    public void capability() throws ProtocolException {
        Response[] responseArrCommand = command("CAPABILITY", null);
        Response response = responseArrCommand[responseArrCommand.length - 1];
        if (response.isOK()) {
            handleCapabilityResponse(responseArrCommand);
        }
        handleResult(response);
    }

    public void check() throws ProtocolException {
        simpleCommand("CHECK", null);
    }

    public void close() throws ProtocolException {
        simpleCommand("CLOSE", null);
    }

    public void compress() throws ProtocolException {
        try {
            super.startCompression("COMPRESS DEFLATE");
        } catch (ProtocolException e5) {
            this.logger.log(Level.FINE, "COMPRESS ProtocolException", (Throwable) e5);
            throw e5;
        } catch (Exception e7) {
            this.logger.log(Level.FINE, "COMPRESS Exception", (Throwable) e7);
            notifyResponseHandlers(new Response[]{Response.byeResponse(e7)});
            disconnect();
            throw new ProtocolException("COMPRESS failure", e7);
        }
    }

    public void copy(MessageSet[] messageSetArr, String str) throws ProtocolException {
        d(MessageSet.toString(messageSetArr), str, false);
    }

    public CopyUID copyuid(MessageSet[] messageSetArr, String str) throws ProtocolException {
        return d(MessageSet.toString(messageSetArr), str, true);
    }

    public void create(String str) throws ProtocolException {
        Argument argument = new Argument();
        writeMailboxName(argument, str);
        simpleCommand("CREATE", argument);
    }

    public String createFlagList(Flags flags) {
        String str;
        StringBuilder sb2 = new StringBuilder("(");
        boolean z10 = true;
        for (Flags.Flag flag : flags.getSystemFlags()) {
            if (flag == Flags.Flag.ANSWERED) {
                str = "\\Answered";
            } else if (flag == Flags.Flag.DELETED) {
                str = "\\Deleted";
            } else if (flag == Flags.Flag.DRAFT) {
                str = "\\Draft";
            } else if (flag == Flags.Flag.FLAGGED) {
                str = "\\Flagged";
            } else if (flag == Flags.Flag.RECENT) {
                str = "\\Recent";
            } else {
                if (flag == Flags.Flag.SEEN) {
                    str = "\\Seen";
                }
            }
            if (z10) {
                z10 = false;
            } else {
                sb2.append(' ');
            }
            sb2.append(str);
        }
        for (String str2 : flags.getUserFlags()) {
            if (z10) {
                z10 = false;
            } else {
                sb2.append(' ');
            }
            sb2.append(str2);
        }
        sb2.append(")");
        return sb2.toString();
    }

    public final CopyUID d(String str, String str2, boolean z10) throws ProtocolException {
        if (z10 && !hasCapability("UIDPLUS")) {
            throw new BadCommandException("UIDPLUS not supported");
        }
        Argument argument = new Argument();
        argument.writeAtom(str);
        writeMailboxName(argument, str2);
        Response[] responseArrCommand = command("COPY", argument);
        notifyResponseHandlers(responseArrCommand);
        handleResult(responseArrCommand[responseArrCommand.length - 1]);
        if (z10) {
            return getCopyUID(responseArrCommand);
        }
        return null;
    }

    public void delete(String str) throws ProtocolException {
        Argument argument = new Argument();
        writeMailboxName(argument, str);
        simpleCommand("DELETE", argument);
    }

    public void deleteACL(String str, String str2) throws ProtocolException {
        if (!hasCapability("ACL")) {
            throw new BadCommandException("ACL not supported");
        }
        Argument argument = new Argument();
        writeMailboxName(argument, str);
        argument.writeString(str2);
        Response[] responseArrCommand = command("DELETEACL", argument);
        Response response = responseArrCommand[responseArrCommand.length - 1];
        notifyResponseHandlers(responseArrCommand);
        handleResult(response);
    }

    @Override // com.sun.mail.iap.Protocol
    public void disconnect() {
        super.disconnect();
        this.f65435q = false;
    }

    public ListInfo[] doList(String str, String str2, String str3) throws ProtocolException {
        Argument argument = new Argument();
        writeMailboxName(argument, str2);
        writeMailboxName(argument, str3);
        Response[] responseArrCommand = command(str, argument);
        Response response = responseArrCommand[responseArrCommand.length - 1];
        ListInfo[] listInfoArr = null;
        if (response.isOK()) {
            ArrayList arrayList = new ArrayList(1);
            int length = responseArrCommand.length;
            for (int i10 = 0; i10 < length; i10++) {
                Response response2 = responseArrCommand[i10];
                if (response2 instanceof IMAPResponse) {
                    IMAPResponse iMAPResponse = (IMAPResponse) response2;
                    if (iMAPResponse.keyEquals(str)) {
                        arrayList.add(new ListInfo(iMAPResponse));
                        responseArrCommand[i10] = null;
                    }
                }
            }
            if (arrayList.size() > 0) {
                listInfoArr = (ListInfo[]) arrayList.toArray(new ListInfo[arrayList.size()]);
            }
        }
        notifyResponseHandlers(responseArrCommand);
        handleResult(response);
        return listInfoArr;
    }

    public final Response[] e(String str, String str2, boolean z10) throws ProtocolException {
        return z10 ? command(u.g("UID FETCH ", str, " (", str2, ")"), null) : command(u.g("FETCH ", str, " (", str2, ")"), null);
    }

    public void enable(String str) throws ProtocolException {
        if (!hasCapability("ENABLE")) {
            throw new BadCommandException("ENABLE not supported");
        }
        Argument argument = new Argument();
        argument.writeAtom(str);
        simpleCommand("ENABLE", argument);
        if (this.enabled == null) {
            this.enabled = new HashSet();
        }
        this.enabled.add(str.toUpperCase(Locale.ENGLISH));
        this.f65438t = isEnabled("UTF8=ACCEPT");
    }

    public MailboxInfo examine(String str) throws ProtocolException {
        return examine(str, null);
    }

    public void expunge() throws ProtocolException {
        simpleCommand("EXPUNGE", null);
    }

    public final int[] f(String str, SearchTerm searchTerm, String str2) throws SearchException, ProtocolException, IOException {
        int[] iArr = null;
        Argument argumentGenerateSequence = getSearchSequence().generateSequence(searchTerm, str2 == null ? null : MimeUtility.javaCharset(str2));
        argumentGenerateSequence.writeAtom(str);
        Response[] responseArrCommand = str2 == null ? command("SEARCH", argumentGenerateSequence) : command("SEARCH CHARSET ".concat(str2), argumentGenerateSequence);
        Response response = responseArrCommand[responseArrCommand.length - 1];
        if (response.isOK()) {
            ArrayList arrayList = new ArrayList();
            int length = responseArrCommand.length;
            for (int i10 = 0; i10 < length; i10++) {
                Response response2 = responseArrCommand[i10];
                if (response2 instanceof IMAPResponse) {
                    IMAPResponse iMAPResponse = (IMAPResponse) response2;
                    if (iMAPResponse.keyEquals("SEARCH")) {
                        while (true) {
                            int number = iMAPResponse.readNumber();
                            if (number == -1) {
                                break;
                            }
                            arrayList.add(Integer.valueOf(number));
                        }
                        responseArrCommand[i10] = null;
                    }
                }
            }
            int size = arrayList.size();
            iArr = new int[size];
            for (int i11 = 0; i11 < size; i11++) {
                iArr[i11] = ((Integer) arrayList.get(i11)).intValue();
            }
        }
        notifyResponseHandlers(responseArrCommand);
        handleResult(response);
        return iArr;
    }

    public Response[] fetch(MessageSet[] messageSetArr, String str) throws ProtocolException {
        return e(MessageSet.toString(messageSetArr), str, false);
    }

    public BODY fetchBody(int i10, String str) throws ProtocolException {
        return fetchBody(i10, str, false);
    }

    public BODYSTRUCTURE fetchBodyStructure(int i10) throws ProtocolException {
        Response[] responseArrFetch = fetch(i10, "BODYSTRUCTURE");
        notifyResponseHandlers(responseArrFetch);
        Response response = responseArrFetch[responseArrFetch.length - 1];
        if (response.isOK()) {
            return (BODYSTRUCTURE) FetchResponse.getItem(responseArrFetch, i10, BODYSTRUCTURE.class);
        }
        if (response.isNO()) {
            return null;
        }
        handleResult(response);
        return null;
    }

    public Flags fetchFlags(int i10) throws ProtocolException {
        Response[] responseArrFetch = fetch(i10, "FLAGS");
        int length = responseArrFetch.length;
        Flags flags = null;
        for (int i11 = 0; i11 < length; i11++) {
            Response response = responseArrFetch[i11];
            if (response != null && (response instanceof FetchResponse) && ((FetchResponse) response).getNumber() == i10 && (flags = (Flags) ((FetchResponse) responseArrFetch[i11]).getItem(FLAGS.class)) != null) {
                responseArrFetch[i11] = null;
                break;
            }
        }
        notifyResponseHandlers(responseArrFetch);
        handleResult(responseArrFetch[responseArrFetch.length - 1]);
        return flags;
    }

    public MODSEQ fetchMODSEQ(int i10) throws ProtocolException {
        Response[] responseArrFetch = fetch(i10, "MODSEQ");
        notifyResponseHandlers(responseArrFetch);
        Response response = responseArrFetch[responseArrFetch.length - 1];
        if (response.isOK()) {
            return (MODSEQ) FetchResponse.getItem(responseArrFetch, i10, MODSEQ.class);
        }
        if (response.isNO()) {
            return null;
        }
        handleResult(response);
        return null;
    }

    public RFC822DATA fetchRFC822(int i10, String str) throws ProtocolException {
        Response[] responseArrFetch = fetch(i10, str == null ? "RFC822" : "RFC822.".concat(str));
        notifyResponseHandlers(responseArrFetch);
        Response response = responseArrFetch[responseArrFetch.length - 1];
        if (response.isOK()) {
            return (RFC822DATA) FetchResponse.getItem(responseArrFetch, i10, RFC822DATA.class);
        }
        if (response.isNO()) {
            return null;
        }
        handleResult(response);
        return null;
    }

    public BODY fetchSectionBody(int i10, String str, String str2) throws ProtocolException {
        Response[] responseArrFetch = fetch(i10, str2);
        notifyResponseHandlers(responseArrFetch);
        Response response = responseArrFetch[responseArrFetch.length - 1];
        if (!response.isOK()) {
            if (response.isNO()) {
                return null;
            }
            handleResult(response);
            return null;
        }
        List<BODY> items = FetchResponse.getItems(responseArrFetch, i10, BODY.class);
        if (items.size() == 1) {
            return (BODY) items.get(0);
        }
        if (this.logger.isLoggable(Level.FINEST)) {
            this.logger.finest("got " + items.size() + " BODY responses for section " + str);
        }
        for (BODY body : items) {
            if (this.logger.isLoggable(Level.FINEST)) {
                this.logger.finest("got BODY section " + body.getSection());
            }
            if (body.getSection().equalsIgnoreCase(str)) {
                return body;
            }
        }
        return null;
    }

    public void fetchSequenceNumber(long j10) throws ProtocolException {
        Response[] responseArrE = e(String.valueOf(j10), "UID", true);
        notifyResponseHandlers(responseArrE);
        handleResult(responseArrE[responseArrE.length - 1]);
    }

    public long[] fetchSequenceNumbers(long j10, long j11) throws ProtocolException {
        UID uid;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.valueOf(j10));
        sb2.append(DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER);
        sb2.append(j11 == -1 ? ProxyConfig.MATCH_ALL_SCHEMES : String.valueOf(j11));
        Response[] responseArrE = e(sb2.toString(), "UID", true);
        ArrayList arrayList = new ArrayList();
        for (Response response : responseArrE) {
            if (response != null && (response instanceof FetchResponse) && (uid = (UID) ((FetchResponse) response).getItem(UID.class)) != null) {
                arrayList.add(uid);
            }
        }
        notifyResponseHandlers(responseArrE);
        handleResult(responseArrE[responseArrE.length - 1]);
        long[] jArr = new long[arrayList.size()];
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            jArr[i10] = ((UID) arrayList.get(i10)).uid;
        }
        return jArr;
    }

    public UID fetchUID(int i10) throws ProtocolException {
        Response[] responseArrFetch = fetch(i10, "UID");
        notifyResponseHandlers(responseArrFetch);
        Response response = responseArrFetch[responseArrFetch.length - 1];
        if (response.isOK()) {
            return (UID) FetchResponse.getItem(responseArrFetch, i10, UID.class);
        }
        if (response.isNO()) {
            return null;
        }
        handleResult(response);
        return null;
    }

    public final CopyUID g(String str, String str2, boolean z10) throws ProtocolException {
        if (!hasCapability("MOVE")) {
            throw new BadCommandException("MOVE not supported");
        }
        if (z10 && !hasCapability("UIDPLUS")) {
            throw new BadCommandException("UIDPLUS not supported");
        }
        Argument argument = new Argument();
        argument.writeAtom(str);
        writeMailboxName(argument, str2);
        Response[] responseArrCommand = command("MOVE", argument);
        notifyResponseHandlers(responseArrCommand);
        handleResult(responseArrCommand[responseArrCommand.length - 1]);
        if (z10) {
            return getCopyUID(responseArrCommand);
        }
        return null;
    }

    public ACL[] getACL(String str) throws ProtocolException {
        String atomString;
        if (!hasCapability("ACL")) {
            throw new BadCommandException("ACL not supported");
        }
        Argument argument = new Argument();
        writeMailboxName(argument, str);
        Response[] responseArrCommand = command("GETACL", argument);
        Response response = responseArrCommand[responseArrCommand.length - 1];
        ArrayList arrayList = new ArrayList();
        if (response.isOK()) {
            int length = responseArrCommand.length;
            for (int i10 = 0; i10 < length; i10++) {
                Response response2 = responseArrCommand[i10];
                if (response2 instanceof IMAPResponse) {
                    IMAPResponse iMAPResponse = (IMAPResponse) response2;
                    if (iMAPResponse.keyEquals("ACL")) {
                        iMAPResponse.readAtomString();
                        while (true) {
                            String atomString2 = iMAPResponse.readAtomString();
                            if (atomString2 == null || (atomString = iMAPResponse.readAtomString()) == null) {
                                break;
                            }
                            arrayList.add(new ACL(atomString2, new Rights(atomString)));
                        }
                        responseArrCommand[i10] = null;
                    }
                }
            }
        }
        notifyResponseHandlers(responseArrCommand);
        handleResult(response);
        return (ACL[]) arrayList.toArray(new ACL[arrayList.size()]);
    }

    public Map<String, String> getCapabilities() {
        return this.f65436r;
    }

    public CopyUID getCopyUID(Response[] responseArr) {
        byte b10;
        for (int length = responseArr.length - 1; length >= 0; length--) {
            Response response = responseArr[length];
            if (response != null && response.isOK()) {
                do {
                    b10 = response.readByte();
                    if (b10 <= 0) {
                        break;
                    }
                } while (b10 != 91);
                if (b10 != 0 && response.readAtom().equalsIgnoreCase("COPYUID")) {
                    return new CopyUID(response.readLong(), UIDSet.parseUIDSets(response.readAtom()), UIDSet.parseUIDSets(response.readAtom()));
                }
            }
        }
        return null;
    }

    public FetchItem[] getFetchItems() {
        return A;
    }

    public String getProxyAuthUser() {
        return this.f65441w;
    }

    public Quota[] getQuota(String str) throws ProtocolException {
        if (!hasCapability("QUOTA")) {
            throw new BadCommandException("QUOTA not supported");
        }
        Argument argument = new Argument();
        argument.writeString(str);
        Response[] responseArrCommand = command("GETQUOTA", argument);
        ArrayList arrayList = new ArrayList();
        Response response = responseArrCommand[responseArrCommand.length - 1];
        if (response.isOK()) {
            int length = responseArrCommand.length;
            for (int i10 = 0; i10 < length; i10++) {
                Response response2 = responseArrCommand[i10];
                if (response2 instanceof IMAPResponse) {
                    IMAPResponse iMAPResponse = (IMAPResponse) response2;
                    if (iMAPResponse.keyEquals("QUOTA")) {
                        arrayList.add(h(iMAPResponse));
                        responseArrCommand[i10] = null;
                    }
                }
            }
        }
        notifyResponseHandlers(responseArrCommand);
        handleResult(response);
        return (Quota[]) arrayList.toArray(new Quota[arrayList.size()]);
    }

    public Quota[] getQuotaRoot(String str) throws ProtocolException {
        Quota.Resource[] resourceArr;
        if (!hasCapability("QUOTA")) {
            throw new BadCommandException("GETQUOTAROOT not supported");
        }
        Argument argument = new Argument();
        writeMailboxName(argument, str);
        Response[] responseArrCommand = command("GETQUOTAROOT", argument);
        Response response = responseArrCommand[responseArrCommand.length - 1];
        HashMap map = new HashMap();
        if (response.isOK()) {
            int length = responseArrCommand.length;
            for (int i10 = 0; i10 < length; i10++) {
                Response response2 = responseArrCommand[i10];
                if (response2 instanceof IMAPResponse) {
                    IMAPResponse iMAPResponse = (IMAPResponse) response2;
                    if (iMAPResponse.keyEquals("QUOTAROOT")) {
                        iMAPResponse.readAtomString();
                        while (true) {
                            String atomString = iMAPResponse.readAtomString();
                            if (atomString == null || atomString.length() <= 0) {
                                break;
                            }
                            map.put(atomString, new Quota(atomString));
                        }
                        responseArrCommand[i10] = null;
                    } else if (iMAPResponse.keyEquals("QUOTA")) {
                        Quota quotaH = h(iMAPResponse);
                        Quota quota = (Quota) map.get(quotaH.quotaRoot);
                        if (quota != null && (resourceArr = quota.resources) != null) {
                            Quota.Resource[] resourceArr2 = new Quota.Resource[resourceArr.length + quotaH.resources.length];
                            System.arraycopy(resourceArr, 0, resourceArr2, 0, resourceArr.length);
                            Quota.Resource[] resourceArr3 = quotaH.resources;
                            System.arraycopy(resourceArr3, 0, resourceArr2, quota.resources.length, resourceArr3.length);
                            quotaH.resources = resourceArr2;
                        }
                        map.put(quotaH.quotaRoot, quotaH);
                        responseArrCommand[i10] = null;
                    }
                }
            }
        }
        notifyResponseHandlers(responseArrCommand);
        handleResult(response);
        return (Quota[]) map.values().toArray(new Quota[map.size()]);
    }

    @Override // com.sun.mail.iap.Protocol
    public ByteArray getResponseBuffer() {
        ByteArray byteArray = this.f65442x;
        this.f65442x = null;
        return byteArray;
    }

    public SearchSequence getSearchSequence() {
        if (this.searchSequence == null) {
            this.searchSequence = new SearchSequence(this);
        }
        return this.searchSequence;
    }

    public void handleCapabilityResponse(Response[] responseArr) {
        boolean z10 = true;
        for (Response response : responseArr) {
            if (response instanceof IMAPResponse) {
                IMAPResponse iMAPResponse = (IMAPResponse) response;
                if (iMAPResponse.keyEquals("CAPABILITY")) {
                    if (z10) {
                        this.f65436r = new HashMap(10);
                        this.f65437s = new ArrayList(5);
                        z10 = false;
                    }
                    parseCapabilities(iMAPResponse);
                }
            }
        }
    }

    public void handleLoginResult(Response response) throws ProtocolException {
        if (hasCapability("LOGIN-REFERRALS") && (!response.isOK() || this.f65433o)) {
            c(response);
        }
        handleResult(response);
    }

    public boolean hasCapability(String str) {
        if (!str.endsWith(ProxyConfig.MATCH_ALL_SCHEMES)) {
            return this.f65436r.containsKey(str.toUpperCase(Locale.ENGLISH));
        }
        String upperCase = e.c(str, 1, 0).toUpperCase(Locale.ENGLISH);
        Iterator it = this.f65436r.keySet().iterator();
        while (it.hasNext()) {
            if (((String) it.next()).startsWith(upperCase)) {
                return true;
            }
        }
        return false;
    }

    @Deprecated
    public void id(String str) throws ProtocolException {
        HashMap map = new HashMap();
        map.put("GUID", str);
        id(map);
    }

    public void idleAbort() {
        OutputStream outputStream = getOutputStream();
        try {
            outputStream.write(B);
            outputStream.flush();
        } catch (Exception e5) {
            this.logger.log(Level.FINEST, "Exception aborting IDLE", (Throwable) e5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0046 A[Catch: all -> 0x001a, TryCatch #3 {, blocks: (B:3:0x0001, B:5:0x0009, B:7:0x000f, B:20:0x0033, B:24:0x003d, B:26:0x0046, B:29:0x004d, B:31:0x0066, B:23:0x0039, B:15:0x0020, B:17:0x0029, B:34:0x006b, B:35:0x0072), top: B:39:0x0001, inners: #5, #4 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0066 A[Catch: all -> 0x001a, TRY_LEAVE, TryCatch #3 {, blocks: (B:3:0x0001, B:5:0x0009, B:7:0x000f, B:20:0x0033, B:24:0x003d, B:26:0x0046, B:29:0x004d, B:31:0x0066, B:23:0x0039, B:15:0x0020, B:17:0x0029, B:34:0x006b, B:35:0x0072), top: B:39:0x0001, inners: #5, #4 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x0033 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x004d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x0027 A[ADDED_TO_REGION, EDGE_INSN: B:45:0x0027->B:16:0x0027 BREAK  A[LOOP:0: B:19:0x0031->B:48:0x0031], SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0027 -> B:19:0x0031). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:40:0x0033
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public synchronized void idleStart() throws com.sun.mail.iap.ProtocolException {
        /*
            r5 = this;
            monitor-enter(r5)
            java.lang.String r0 = "IDLE"
            boolean r0 = r5.hasCapability(r0)     // Catch: java.lang.Throwable -> L1a
            if (r0 == 0) goto L6b
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L1a
            r0.<init>()     // Catch: java.lang.Throwable -> L1a
            r1 = 1
            java.lang.String r2 = "IDLE"
            r3 = 0
            java.lang.String r2 = r5.writeCommand(r2, r3)     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1c com.sun.mail.iap.LiteralException -> L1e
            r5.f65443y = r2     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1c com.sun.mail.iap.LiteralException -> L1e
            r2 = 0
            goto L31
        L1a:
            r0 = move-exception
            goto L73
        L1c:
            r2 = move-exception
            goto L20
        L1e:
            r2 = move-exception
            goto L29
        L20:
            com.sun.mail.iap.Response r2 = com.sun.mail.iap.Response.byeResponse(r2)     // Catch: java.lang.Throwable -> L1a
            r0.add(r2)     // Catch: java.lang.Throwable -> L1a
        L27:
            r2 = r1
            goto L31
        L29:
            com.sun.mail.iap.Response r2 = r2.getResponse()     // Catch: java.lang.Throwable -> L1a
            r0.add(r2)     // Catch: java.lang.Throwable -> L1a
            goto L27
        L31:
            if (r2 != 0) goto L4d
            com.sun.mail.iap.Response r3 = r5.readResponse()     // Catch: java.lang.Throwable -> L1a com.sun.mail.iap.ProtocolException -> L31 java.io.IOException -> L38
            goto L3d
        L38:
            r3 = move-exception
            com.sun.mail.iap.Response r3 = com.sun.mail.iap.Response.byeResponse(r3)     // Catch: java.lang.Throwable -> L1a
        L3d:
            r0.add(r3)     // Catch: java.lang.Throwable -> L1a
            boolean r4 = r3.isContinuation()     // Catch: java.lang.Throwable -> L1a
            if (r4 != 0) goto L27
            boolean r3 = r3.isBYE()     // Catch: java.lang.Throwable -> L1a
            if (r3 == 0) goto L31
            goto L27
        L4d:
            int r2 = r0.size()     // Catch: java.lang.Throwable -> L1a
            com.sun.mail.iap.Response[] r2 = new com.sun.mail.iap.Response[r2]     // Catch: java.lang.Throwable -> L1a
            java.lang.Object[] r0 = r0.toArray(r2)     // Catch: java.lang.Throwable -> L1a
            com.sun.mail.iap.Response[] r0 = (com.sun.mail.iap.Response[]) r0     // Catch: java.lang.Throwable -> L1a
            int r2 = r0.length     // Catch: java.lang.Throwable -> L1a
            int r2 = r2 - r1
            r1 = r0[r2]     // Catch: java.lang.Throwable -> L1a
            r5.notifyResponseHandlers(r0)     // Catch: java.lang.Throwable -> L1a
            boolean r0 = r1.isContinuation()     // Catch: java.lang.Throwable -> L1a
            if (r0 != 0) goto L69
            r5.handleResult(r1)     // Catch: java.lang.Throwable -> L1a
        L69:
            monitor-exit(r5)
            return
        L6b:
            com.sun.mail.iap.BadCommandException r0 = new com.sun.mail.iap.BadCommandException     // Catch: java.lang.Throwable -> L1a
            java.lang.String r1 = "IDLE not supported"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L1a
            throw r0     // Catch: java.lang.Throwable -> L1a
        L73:
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sun.mail.imap.protocol.IMAPProtocol.idleStart():void");
    }

    public boolean isAuthenticated() {
        return this.f65435q;
    }

    public boolean isEnabled(String str) {
        Set<String> set = this.enabled;
        if (set == null) {
            return false;
        }
        return set.contains(str.toUpperCase(Locale.ENGLISH));
    }

    public boolean isREV1() {
        return this.f65432n;
    }

    public final int[] j(SearchTerm searchTerm, String str) throws SearchException, ProtocolException {
        if (supportsUtf8() || SearchSequence.isAscii(searchTerm)) {
            try {
                return f(str, searchTerm, null);
            } catch (IOException unused) {
            }
        }
        int i10 = 0;
        while (true) {
            String[] strArr = this.searchCharsets;
            if (i10 >= strArr.length) {
                throw new SearchException("Search failed");
            }
            String str2 = strArr[i10];
            if (str2 != null) {
                try {
                    return f(str, searchTerm, str2);
                } catch (CommandFailedException unused2) {
                    this.searchCharsets[i10] = null;
                } catch (ProtocolException e5) {
                    throw e5;
                } catch (IOException unused3) {
                    continue;
                } catch (SearchException e7) {
                    throw e7;
                }
            }
            i10++;
        }
    }

    public final void k(String str, Flags flags, boolean z10) throws ProtocolException {
        Response[] responseArrCommand;
        if (z10) {
            StringBuilder sbD = ci.a.d("STORE ", str, " +FLAGS ");
            sbD.append(createFlagList(flags));
            responseArrCommand = command(sbD.toString(), null);
        } else {
            StringBuilder sbD2 = ci.a.d("STORE ", str, " -FLAGS ");
            sbD2.append(createFlagList(flags));
            responseArrCommand = command(sbD2.toString(), null);
        }
        notifyResponseHandlers(responseArrCommand);
        handleResult(responseArrCommand[responseArrCommand.length - 1]);
    }

    public ListInfo[] list(String str, String str2) throws ProtocolException {
        return doList("LIST", str, str2);
    }

    public Rights[] listRights(String str, String str2) throws ProtocolException {
        if (!hasCapability("ACL")) {
            throw new BadCommandException("ACL not supported");
        }
        Argument argument = new Argument();
        writeMailboxName(argument, str);
        argument.writeString(str2);
        Response[] responseArrCommand = command("LISTRIGHTS", argument);
        Response response = responseArrCommand[responseArrCommand.length - 1];
        ArrayList arrayList = new ArrayList();
        if (response.isOK()) {
            int length = responseArrCommand.length;
            for (int i10 = 0; i10 < length; i10++) {
                Response response2 = responseArrCommand[i10];
                if (response2 instanceof IMAPResponse) {
                    IMAPResponse iMAPResponse = (IMAPResponse) response2;
                    if (iMAPResponse.keyEquals("LISTRIGHTS")) {
                        iMAPResponse.readAtomString();
                        iMAPResponse.readAtomString();
                        while (true) {
                            String atomString = iMAPResponse.readAtomString();
                            if (atomString == null) {
                                break;
                            }
                            arrayList.add(new Rights(atomString));
                        }
                        responseArrCommand[i10] = null;
                    }
                }
            }
        }
        notifyResponseHandlers(responseArrCommand);
        handleResult(response);
        return (Rights[]) arrayList.toArray(new Rights[arrayList.size()]);
    }

    public void login(String str, String str2) throws ProtocolException {
        Argument argument = new Argument();
        argument.writeString(str);
        argument.writeString(str2);
        boolean z10 = this.f65434p;
        if (z10) {
            try {
                if (isTracing()) {
                    this.logger.fine("LOGIN command trace suppressed");
                    suspendTracing();
                }
            } catch (Throwable th2) {
                resumeTracing();
                throw th2;
            }
        }
        Response[] responseArrCommand = command("LOGIN", argument);
        resumeTracing();
        handleCapabilityResponse(responseArrCommand);
        notifyResponseHandlers(responseArrCommand);
        if (z10 && isTracing()) {
            this.logger.fine("LOGIN command result: " + responseArrCommand[responseArrCommand.length - 1]);
        }
        handleLoginResult(responseArrCommand[responseArrCommand.length - 1]);
        setCapabilities(responseArrCommand[responseArrCommand.length - 1]);
        this.f65435q = true;
    }

    public void logout() throws ProtocolException {
        try {
            Response[] responseArrCommand = command("LOGOUT", null);
            this.f65435q = false;
            notifyResponseHandlers(responseArrCommand);
        } finally {
            disconnect();
        }
    }

    public ListInfo[] lsub(String str, String str2) throws ProtocolException {
        return doList("LSUB", str, str2);
    }

    public void move(MessageSet[] messageSetArr, String str) throws ProtocolException {
        g(MessageSet.toString(messageSetArr), str, false);
    }

    public CopyUID moveuid(MessageSet[] messageSetArr, String str) throws ProtocolException {
        return g(MessageSet.toString(messageSetArr), str, true);
    }

    public Rights myRights(String str) throws ProtocolException {
        if (!hasCapability("ACL")) {
            throw new BadCommandException("ACL not supported");
        }
        Argument argument = new Argument();
        writeMailboxName(argument, str);
        Response[] responseArrCommand = command("MYRIGHTS", argument);
        Response response = responseArrCommand[responseArrCommand.length - 1];
        Rights rights = null;
        if (response.isOK()) {
            int length = responseArrCommand.length;
            Rights rights2 = null;
            for (int i10 = 0; i10 < length; i10++) {
                Response response2 = responseArrCommand[i10];
                if (response2 instanceof IMAPResponse) {
                    IMAPResponse iMAPResponse = (IMAPResponse) response2;
                    if (iMAPResponse.keyEquals("MYRIGHTS")) {
                        iMAPResponse.readAtomString();
                        String atomString = iMAPResponse.readAtomString();
                        if (rights2 == null) {
                            rights2 = new Rights(atomString);
                        }
                        responseArrCommand[i10] = null;
                    }
                }
            }
            rights = rights2;
        }
        notifyResponseHandlers(responseArrCommand);
        handleResult(response);
        return rights;
    }

    public Namespaces namespace() throws ProtocolException {
        if (!hasCapability("NAMESPACE")) {
            throw new BadCommandException("NAMESPACE not supported");
        }
        Namespaces namespaces = null;
        Response[] responseArrCommand = command("NAMESPACE", null);
        Response response = responseArrCommand[responseArrCommand.length - 1];
        if (response.isOK()) {
            int length = responseArrCommand.length;
            Namespaces namespaces2 = null;
            for (int i10 = 0; i10 < length; i10++) {
                Response response2 = responseArrCommand[i10];
                if (response2 instanceof IMAPResponse) {
                    IMAPResponse iMAPResponse = (IMAPResponse) response2;
                    if (iMAPResponse.keyEquals("NAMESPACE")) {
                        if (namespaces2 == null) {
                            namespaces2 = new Namespaces(iMAPResponse);
                        }
                        responseArrCommand[i10] = null;
                    }
                }
            }
            namespaces = namespaces2;
        }
        notifyResponseHandlers(responseArrCommand);
        handleResult(response);
        return namespaces;
    }

    public void noop() throws ProtocolException {
        this.logger.fine("IMAPProtocol noop");
        simpleCommand("NOOP", null);
    }

    public void parseCapabilities(Response response) {
        while (true) {
            String atom = response.readAtom();
            if (atom == null) {
                return;
            }
            if (atom.length() != 0) {
                this.f65436r.put(atom.toUpperCase(Locale.ENGLISH), atom);
                if (atom.regionMatches(true, 0, "AUTH=", 0, 5)) {
                    this.f65437s.add(atom.substring(5));
                    if (this.logger.isLoggable(Level.FINE)) {
                        this.logger.fine("AUTH: " + atom.substring(5));
                    }
                }
            } else if (response.peekByte() == 93) {
                return;
            } else {
                response.skipToken();
            }
        }
    }

    public BODY peekBody(int i10, String str) throws ProtocolException {
        return fetchBody(i10, str, true);
    }

    @Override // com.sun.mail.iap.Protocol
    public void processGreeting(Response response) throws ProtocolException {
        if (response.isBYE()) {
            c(response);
            throw new ConnectionException(this, response);
        }
        if (!response.isOK()) {
            if (!((IMAPResponse) response).keyEquals("PREAUTH")) {
                disconnect();
                throw new ConnectionException(this, response);
            }
            this.f65435q = true;
            setCapabilities(response);
            return;
        }
        boolean booleanProperty = PropUtil.getBooleanProperty(this.props, this.prefix + ".referralexception", false);
        this.f65433o = booleanProperty;
        if (booleanProperty) {
            c(response);
        }
        setCapabilities(response);
    }

    public boolean processIdleResponse(Response response) throws ProtocolException {
        notifyResponseHandlers(new Response[]{response});
        boolean zIsBYE = response.isBYE();
        if (response.isTagged() && response.getTag().equals(this.f65443y)) {
            zIsBYE = true;
        }
        if (zIsBYE) {
            this.f65443y = null;
        }
        handleResult(response);
        return !zIsBYE;
    }

    public void proxyauth(String str) throws ProtocolException {
        Argument argument = new Argument();
        argument.writeString(str);
        simpleCommand("PROXYAUTH", argument);
        this.f65441w = str;
    }

    public synchronized Response readIdleResponse() {
        Response responseByeResponse;
        if (this.f65443y == null) {
            return null;
        }
        try {
            responseByeResponse = readResponse();
        } catch (ProtocolException e5) {
            responseByeResponse = Response.byeResponse(e5);
        } catch (IOException e7) {
            responseByeResponse = Response.byeResponse(e7);
        }
        return responseByeResponse;
    }

    @Override // com.sun.mail.iap.Protocol
    public Response readResponse() throws ProtocolException, IOException {
        IMAPResponse iMAPResponse = new IMAPResponse(this);
        return iMAPResponse.keyEquals("FETCH") ? new FetchResponse(iMAPResponse, getFetchItems()) : iMAPResponse;
    }

    public void rename(String str, String str2) throws ProtocolException {
        Argument argument = new Argument();
        writeMailboxName(argument, str);
        writeMailboxName(argument, str2);
        simpleCommand("RENAME", argument);
    }

    public void sasllogin(String[] strArr, String str, String str2, String str3, String str4) throws ProtocolException {
        ArrayList arrayList;
        Properties properties = this.props;
        StringBuilder sb2 = new StringBuilder("mail.");
        String str5 = this.f65439u;
        sb2.append(str5);
        sb2.append(".sasl.usecanonicalhostname");
        String canonicalHostName = PropUtil.getBooleanProperty(properties, sb2.toString(), false) ? getInetAddress().getCanonicalHostName() : this.host;
        if (this.f65440v == null) {
            try {
                this.f65440v = (SaslAuthenticator) Class.forName("com.sun.mail.imap.protocol.IMAPSaslAuthenticator").getConstructor(IMAPProtocol.class, String.class, Properties.class, MailLogger.class, String.class).newInstance(this, str5, this.props, this.logger, canonicalHostName);
            } catch (Exception e5) {
                this.logger.log(Level.FINE, "Can't load SASL authenticator", (Throwable) e5);
                return;
            }
        }
        if (strArr == null || strArr.length <= 0) {
            arrayList = this.f65437s;
        } else {
            arrayList = new ArrayList(strArr.length);
            for (int i10 = 0; i10 < strArr.length; i10++) {
                if (this.f65437s.contains(strArr[i10])) {
                    arrayList.add(strArr[i10]);
                }
            }
        }
        String[] strArr2 = (String[]) arrayList.toArray(new String[arrayList.size()]);
        boolean z10 = this.f65434p;
        if (z10) {
            try {
                if (isTracing()) {
                    this.logger.fine("SASL authentication command trace suppressed");
                    suspendTracing();
                }
            } finally {
                resumeTracing();
            }
        }
        if (this.f65440v.authenticate(strArr2, str, str2, str3, str4)) {
            if (z10 && isTracing()) {
                this.logger.fine("SASL authentication succeeded");
            }
            this.f65435q = true;
        } else if (z10 && isTracing()) {
            this.logger.fine("SASL authentication failed");
        }
    }

    public int[] search(MessageSet[] messageSetArr, SearchTerm searchTerm) throws SearchException, ProtocolException {
        return j(searchTerm, MessageSet.toString(messageSetArr));
    }

    public MailboxInfo select(String str) throws ProtocolException {
        return select(str, null);
    }

    public void setACL(String str, char c10, ACL acl) throws ProtocolException {
        if (!hasCapability("ACL")) {
            throw new BadCommandException("ACL not supported");
        }
        Argument argument = new Argument();
        writeMailboxName(argument, str);
        argument.writeString(acl.getName());
        String string = acl.getRights().toString();
        if (c10 == '+' || c10 == '-') {
            string = c10 + string;
        }
        argument.writeString(string);
        Response[] responseArrCommand = command("SETACL", argument);
        Response response = responseArrCommand[responseArrCommand.length - 1];
        notifyResponseHandlers(responseArrCommand);
        handleResult(response);
    }

    public void setCapabilities(Response response) {
        byte b10;
        do {
            b10 = response.readByte();
            if (b10 <= 0) {
                break;
            }
        } while (b10 != 91);
        if (b10 != 0 && response.readAtom().equalsIgnoreCase("CAPABILITY")) {
            this.f65436r = new HashMap(10);
            this.f65437s = new ArrayList(5);
            parseCapabilities(response);
        }
    }

    public void setQuota(Quota quota) throws ProtocolException {
        if (!hasCapability("QUOTA")) {
            throw new BadCommandException("QUOTA not supported");
        }
        Argument argument = new Argument();
        argument.writeString(quota.quotaRoot);
        Argument argument2 = new Argument();
        if (quota.resources != null) {
            int i10 = 0;
            while (true) {
                Quota.Resource[] resourceArr = quota.resources;
                if (i10 >= resourceArr.length) {
                    break;
                }
                argument2.writeAtom(resourceArr[i10].name);
                argument2.writeNumber(quota.resources[i10].limit);
                i10++;
            }
        }
        argument.writeArgument(argument2);
        Response[] responseArrCommand = command("SETQUOTA", argument);
        Response response = responseArrCommand[responseArrCommand.length - 1];
        notifyResponseHandlers(responseArrCommand);
        handleResult(response);
    }

    public int[] sort(SortTerm[] sortTermArr, SearchTerm searchTerm) throws SearchException, ProtocolException {
        if (!hasCapability("SORT*")) {
            throw new BadCommandException("SORT not supported");
        }
        if (sortTermArr == null || sortTermArr.length == 0) {
            throw new BadCommandException("Must have at least one sort term");
        }
        Argument argument = new Argument();
        Argument argument2 = new Argument();
        for (SortTerm sortTerm : sortTermArr) {
            argument2.writeAtom(sortTerm.toString());
        }
        argument.writeArgument(argument2);
        argument.writeAtom("UTF-8");
        if (searchTerm != null) {
            try {
                argument.append(getSearchSequence().generateSequence(searchTerm, "UTF-8"));
            } catch (IOException e5) {
                throw new SearchException(e5.toString());
            }
        } else {
            argument.writeAtom("ALL");
        }
        Response[] responseArrCommand = command("SORT", argument);
        Response response = responseArrCommand[responseArrCommand.length - 1];
        int[] iArr = null;
        if (response.isOK()) {
            ArrayList arrayList = new ArrayList();
            int length = responseArrCommand.length;
            for (int i10 = 0; i10 < length; i10++) {
                Response response2 = responseArrCommand[i10];
                if (response2 instanceof IMAPResponse) {
                    IMAPResponse iMAPResponse = (IMAPResponse) response2;
                    if (iMAPResponse.keyEquals("SORT")) {
                        while (true) {
                            int number = iMAPResponse.readNumber();
                            if (number == -1) {
                                break;
                            }
                            arrayList.add(Integer.valueOf(number));
                        }
                        responseArrCommand[i10] = null;
                    }
                }
            }
            int size = arrayList.size();
            iArr = new int[size];
            for (int i11 = 0; i11 < size; i11++) {
                iArr[i11] = ((Integer) arrayList.get(i11)).intValue();
            }
        }
        notifyResponseHandlers(responseArrCommand);
        handleResult(response);
        return iArr;
    }

    public void startTLS() throws ProtocolException {
        try {
            super.startTLS("STARTTLS");
        } catch (ProtocolException e5) {
            this.logger.log(Level.FINE, "STARTTLS ProtocolException", (Throwable) e5);
            throw e5;
        } catch (Exception e7) {
            this.logger.log(Level.FINE, "STARTTLS Exception", (Throwable) e7);
            notifyResponseHandlers(new Response[]{Response.byeResponse(e7)});
            disconnect();
            throw new ProtocolException("STARTTLS failure", e7);
        }
    }

    public Status status(String str, String[] strArr) throws ProtocolException {
        if (!isREV1() && !hasCapability("IMAP4SUNVERSION")) {
            throw new BadCommandException("STATUS not supported");
        }
        Argument argument = new Argument();
        writeMailboxName(argument, str);
        Argument argument2 = new Argument();
        if (strArr == null) {
            strArr = Status.f65457a;
        }
        for (String str2 : strArr) {
            argument2.writeAtom(str2);
        }
        argument.writeArgument(argument2);
        Response[] responseArrCommand = command("STATUS", argument);
        Response response = responseArrCommand[responseArrCommand.length - 1];
        Status status = null;
        if (response.isOK()) {
            int length = responseArrCommand.length;
            Status status2 = null;
            for (int i10 = 0; i10 < length; i10++) {
                Response response2 = responseArrCommand[i10];
                if (response2 instanceof IMAPResponse) {
                    IMAPResponse iMAPResponse = (IMAPResponse) response2;
                    if (iMAPResponse.keyEquals("STATUS")) {
                        if (status2 == null) {
                            status2 = new Status(iMAPResponse);
                        } else {
                            Status.add(status2, new Status(iMAPResponse));
                        }
                        responseArrCommand[i10] = null;
                    }
                }
            }
            status = status2;
        }
        notifyResponseHandlers(responseArrCommand);
        handleResult(response);
        return status;
    }

    public void storeFlags(MessageSet[] messageSetArr, Flags flags, boolean z10) throws ProtocolException {
        k(MessageSet.toString(messageSetArr), flags, z10);
    }

    public void subscribe(String str) throws ProtocolException {
        Argument argument = new Argument();
        writeMailboxName(argument, str);
        simpleCommand("SUBSCRIBE", argument);
    }

    @Override // com.sun.mail.iap.Protocol
    public boolean supportsNonSyncLiterals() {
        return hasCapability("LITERAL+");
    }

    @Override // com.sun.mail.iap.Protocol
    public boolean supportsUtf8() {
        return this.f65438t;
    }

    public void uidexpunge(UIDSet[] uIDSetArr) throws ProtocolException {
        if (!hasCapability("UIDPLUS")) {
            throw new BadCommandException("UID EXPUNGE not supported");
        }
        simpleCommand("UID EXPUNGE " + UIDSet.toString(uIDSetArr), null);
    }

    public int[] uidfetchChangedSince(long j10, long j11, long j12) throws ProtocolException {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.valueOf(j10));
        sb2.append(DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER);
        sb2.append(j11 == -1 ? ProxyConfig.MATCH_ALL_SCHEMES : String.valueOf(j11));
        StringBuilder sbD = ci.a.d("UID FETCH ", sb2.toString(), " (FLAGS) (CHANGEDSINCE ");
        sbD.append(String.valueOf(j12));
        sbD.append(")");
        Response[] responseArrCommand = command(sbD.toString(), null);
        ArrayList arrayList = new ArrayList();
        for (Response response : responseArrCommand) {
            if (response != null && (response instanceof FetchResponse)) {
                arrayList.add(Integer.valueOf(((FetchResponse) response).getNumber()));
            }
        }
        notifyResponseHandlers(responseArrCommand);
        handleResult(responseArrCommand[responseArrCommand.length - 1]);
        int size = arrayList.size();
        int[] iArr = new int[size];
        for (int i10 = 0; i10 < size; i10++) {
            iArr[i10] = ((Integer) arrayList.get(i10)).intValue();
        }
        return iArr;
    }

    public void unauthenticate() throws ProtocolException {
        if (!hasCapability("X-UNAUTHENTICATE")) {
            throw new BadCommandException("UNAUTHENTICATE not supported");
        }
        simpleCommand("UNAUTHENTICATE", null);
        this.f65435q = false;
    }

    public void unselect() throws ProtocolException {
        if (!hasCapability("UNSELECT")) {
            throw new BadCommandException("UNSELECT not supported");
        }
        simpleCommand("UNSELECT", null);
    }

    public void unsubscribe(String str) throws ProtocolException {
        Argument argument = new Argument();
        writeMailboxName(argument, str);
        simpleCommand("UNSUBSCRIBE", argument);
    }

    public void writeMailboxName(Argument argument, String str) {
        if (this.f65438t) {
            argument.writeString(str, StandardCharsets.UTF_8);
        } else {
            argument.writeString(BASE64MailboxEncoder.encode(str));
        }
    }

    public AppendUID appenduid(String str, Flags flags, Date date, Literal literal, boolean z10) throws ProtocolException {
        byte b10;
        Argument argument = new Argument();
        writeMailboxName(argument, str);
        if (flags != null) {
            Flags.Flag flag = Flags.Flag.RECENT;
            if (flags.contains(flag)) {
                Flags flags2 = new Flags(flags);
                flags2.remove(flag);
                flags = flags2;
            }
            argument.writeAtom(createFlagList(flags));
        }
        if (date != null) {
            argument.writeString(INTERNALDATE.format(date));
        }
        argument.writeBytes(literal);
        Response[] responseArrCommand = command("APPEND", argument);
        notifyResponseHandlers(responseArrCommand);
        handleResult(responseArrCommand[responseArrCommand.length - 1]);
        if (!z10) {
            return null;
        }
        Response response = responseArrCommand[responseArrCommand.length - 1];
        if (!response.isOK()) {
            return null;
        }
        do {
            b10 = response.readByte();
            if (b10 <= 0) {
                break;
            }
        } while (b10 != 91);
        if (b10 != 0 && response.readAtom().equalsIgnoreCase("APPENDUID")) {
            return new AppendUID(response.readLong(), response.readLong());
        }
        return null;
    }

    public void copy(int i10, int i11, String str) throws ProtocolException {
        d(String.valueOf(i10) + DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER + String.valueOf(i11), str, false);
    }

    public CopyUID copyuid(int i10, int i11, String str) throws ProtocolException {
        return d(String.valueOf(i10) + DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER + String.valueOf(i11), str, true);
    }

    public MailboxInfo examine(String str, ResyncData resyncData) throws ProtocolException {
        Argument argument = new Argument();
        writeMailboxName(argument, str);
        if (resyncData != null) {
            if (resyncData == ResyncData.CONDSTORE) {
                if (!hasCapability("CONDSTORE")) {
                    throw new BadCommandException("CONDSTORE not supported");
                }
                argument.writeArgument(new Argument().writeAtom("CONDSTORE"));
            } else {
                if (!hasCapability("QRESYNC")) {
                    throw new BadCommandException("QRESYNC not supported");
                }
                argument.writeArgument(i(resyncData));
            }
        }
        Response[] responseArrCommand = command("EXAMINE", argument);
        MailboxInfo mailboxInfo = new MailboxInfo(responseArrCommand);
        mailboxInfo.mode = 1;
        notifyResponseHandlers(responseArrCommand);
        handleResult(responseArrCommand[responseArrCommand.length - 1]);
        return mailboxInfo;
    }

    public Response[] fetch(int i10, int i11, String str) throws ProtocolException {
        return e(String.valueOf(i10) + DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER + String.valueOf(i11), str, false);
    }

    public BODY fetchBody(int i10, String str, boolean z10) throws ProtocolException {
        if (str == null) {
            str = "";
        }
        return fetchSectionBody(i10, str, androidx.collection.f.c(new StringBuilder(), z10 ? "BODY.PEEK[" : "BODY[", str, Constant.BRACKET_CLOSE));
    }

    public void move(int i10, int i11, String str) throws ProtocolException {
        g(String.valueOf(i10) + DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER + String.valueOf(i11), str, false);
    }

    public CopyUID moveuid(int i10, int i11, String str) throws ProtocolException {
        return g(String.valueOf(i10) + DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER + String.valueOf(i11), str, true);
    }

    public BODY peekBody(int i10, String str, int i11, int i12) throws ProtocolException {
        return fetchBody(i10, str, i11, i12, true, null);
    }

    public int[] search(SearchTerm searchTerm) throws SearchException, ProtocolException {
        return j(searchTerm, "ALL");
    }

    public MailboxInfo select(String str, ResyncData resyncData) throws ProtocolException {
        Argument argument = new Argument();
        writeMailboxName(argument, str);
        if (resyncData != null) {
            if (resyncData == ResyncData.CONDSTORE) {
                if (!hasCapability("CONDSTORE")) {
                    throw new BadCommandException("CONDSTORE not supported");
                }
                argument.writeArgument(new Argument().writeAtom("CONDSTORE"));
            } else {
                if (!hasCapability("QRESYNC")) {
                    throw new BadCommandException("QRESYNC not supported");
                }
                argument.writeArgument(i(resyncData));
            }
        }
        Response[] responseArrCommand = command("SELECT", argument);
        MailboxInfo mailboxInfo = new MailboxInfo(responseArrCommand);
        notifyResponseHandlers(responseArrCommand);
        Response response = responseArrCommand[responseArrCommand.length - 1];
        if (response.isOK()) {
            if (response.toString().indexOf("READ-ONLY") != -1) {
                mailboxInfo.mode = 1;
            } else {
                mailboxInfo.mode = 2;
            }
        }
        handleResult(response);
        return mailboxInfo;
    }

    public void storeFlags(int i10, int i11, Flags flags, boolean z10) throws ProtocolException {
        k(String.valueOf(i10) + DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER + String.valueOf(i11), flags, z10);
    }

    public Response[] fetch(int i10, String str) throws ProtocolException {
        return e(String.valueOf(i10), str, false);
    }

    public BODY peekBody(int i10, String str, int i11, int i12, ByteArray byteArray) throws ProtocolException {
        return fetchBody(i10, str, i11, i12, true, byteArray);
    }

    public void storeFlags(int i10, Flags flags, boolean z10) throws ProtocolException {
        k(String.valueOf(i10), flags, z10);
    }

    public Map<String, String> id(Map<String, String> map) throws ProtocolException {
        ID id;
        if (hasCapability("ID")) {
            Argument argument = new Argument();
            if (map == null) {
                argument.writeAtom("NIL");
            } else {
                Argument argument2 = new Argument();
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    argument2.writeNString(entry.getKey());
                    argument2.writeNString(entry.getValue());
                }
                argument.writeArgument(argument2);
            }
            Response[] responseArrCommand = command("ID", argument);
            Response response = responseArrCommand[responseArrCommand.length - 1];
            if (response.isOK()) {
                int length = responseArrCommand.length;
                id = null;
                for (int i10 = 0; i10 < length; i10++) {
                    Response response2 = responseArrCommand[i10];
                    if (response2 instanceof IMAPResponse) {
                        IMAPResponse iMAPResponse = (IMAPResponse) response2;
                        if (iMAPResponse.keyEquals("ID")) {
                            if (id == null) {
                                id = new ID(iMAPResponse);
                            }
                            responseArrCommand[i10] = null;
                        }
                    }
                }
            } else {
                id = null;
            }
            notifyResponseHandlers(responseArrCommand);
            handleResult(response);
            if (id == null) {
                return null;
            }
            return id.f65430a;
        }
        throw new BadCommandException("ID not supported");
    }

    public BODY fetchBody(int i10, String str, int i11, int i12) throws ProtocolException {
        return fetchBody(i10, str, i11, i12, false, null);
    }

    public BODY fetchBody(int i10, String str, int i11, int i12, ByteArray byteArray) throws ProtocolException {
        return fetchBody(i10, str, i11, i12, false, byteArray);
    }

    public BODY fetchBody(int i10, String str, int i11, int i12, boolean z10, ByteArray byteArray) throws ProtocolException {
        this.f65442x = byteArray;
        if (str == null) {
            str = "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(z10 ? "BODY.PEEK[" : "BODY[");
        sb2.append(str);
        sb2.append("]<");
        sb2.append(String.valueOf(i11));
        sb2.append(Constant.DOT_STRING);
        sb2.append(String.valueOf(i12));
        sb2.append(">");
        return fetchSectionBody(i10, str, sb2.toString());
    }

    public void fetchSequenceNumbers(long[] jArr) throws ProtocolException {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < jArr.length; i10++) {
            if (i10 > 0) {
                sb2.append(",");
            }
            sb2.append(String.valueOf(jArr[i10]));
        }
        Response[] responseArrE = e(sb2.toString(), "UID", true);
        notifyResponseHandlers(responseArrE);
        handleResult(responseArrE[responseArrE.length - 1]);
    }

    public IMAPProtocol(InputStream inputStream, PrintStream printStream, Properties properties, boolean z10) throws IOException {
        super(inputStream, printStream, properties, z10);
        this.m = false;
        this.f65432n = false;
        this.f65434p = true;
        this.f65439u = "imap";
        this.f65434p = !PropUtil.getBooleanProperty(properties, "mail.debug.auth", false);
        if (this.f65436r == null) {
            this.f65436r = new HashMap();
        }
        this.searchCharsets = new String[]{"UTF-8", MimeUtility.mimeCharset(MimeUtility.getDefaultJavaCharset())};
        this.m = true;
    }
}
