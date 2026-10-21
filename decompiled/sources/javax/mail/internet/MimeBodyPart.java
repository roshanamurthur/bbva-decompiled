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
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Enumeration;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.EncodingAware;
import javax.mail.FolderClosedException;
import javax.mail.Header;
import javax.mail.Message;
import javax.mail.MessageRemovedException;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Part;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes12.dex */
public class MimeBodyPart extends BodyPart implements MimePart {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f78983a = PropUtil.getBooleanSystemProperty("mail.mime.setdefaulttextcharset", true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f78984b = PropUtil.getBooleanSystemProperty("mail.mime.setcontenttypefilename", true);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f78985c = PropUtil.getBooleanSystemProperty("mail.mime.encodefilename", false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f78986d = PropUtil.getBooleanSystemProperty("mail.mime.decodefilename", false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f78987e = PropUtil.getBooleanSystemProperty("mail.mime.ignoremultipartencoding", true);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final boolean f78988f = PropUtil.getBooleanSystemProperty("mail.mime.allowutf8", true);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final boolean f78989g = PropUtil.getBooleanSystemProperty("mail.mime.cachemultipart", true);
    protected Object cachedContent;
    protected byte[] content;
    protected InputStream contentStream;

    /* JADX INFO: renamed from: dh, reason: collision with root package name */
    protected DataHandler f78990dh;
    protected InternetHeaders headers;

    public static class a extends FileDataSource implements EncodingAware {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f78991c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f78992d;

        @Override // javax.activation.FileDataSource, javax.activation.DataSource
        public final String getContentType() {
            String str = this.f78991c;
            return str != null ? str : super.getContentType();
        }

        @Override // javax.mail.EncodingAware
        public final String getEncoding() {
            return this.f78992d;
        }
    }

    public static class b extends DataHandler {
        public final MimePart m;

        public b(MimePart mimePart) {
            super(new MimePartDataSource(mimePart));
            this.m = mimePart;
        }
    }

    public MimeBodyPart() {
        this.headers = new InternetHeaders();
    }

    public static String[] a(MimePart mimePart) throws MessagingException {
        String header = mimePart.getHeader("Content-Language", null);
        if (header == null) {
            return null;
        }
        HeaderTokenizer headerTokenizer = new HeaderTokenizer(header, HeaderTokenizer.MIME);
        ArrayList arrayList = new ArrayList();
        while (true) {
            HeaderTokenizer.Token next = headerTokenizer.next();
            int type = next.getType();
            if (type == -4) {
                break;
            }
            if (type == -1) {
                arrayList.add(next.getValue());
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        String[] strArr = new String[arrayList.size()];
        arrayList.toArray(strArr);
        return strArr;
    }

    public static String b(MimePart mimePart) throws MessagingException {
        HeaderTokenizer.Token next;
        int type;
        String header = mimePart.getHeader("Content-Transfer-Encoding", null);
        if (header == null) {
            return null;
        }
        String strTrim = header.trim();
        if (strTrim.length() == 0) {
            return null;
        }
        if (strTrim.equalsIgnoreCase("7bit") || strTrim.equalsIgnoreCase("8bit") || strTrim.equalsIgnoreCase("quoted-printable") || strTrim.equalsIgnoreCase("binary") || strTrim.equalsIgnoreCase("base64")) {
            return strTrim;
        }
        HeaderTokenizer headerTokenizer = new HeaderTokenizer(strTrim, HeaderTokenizer.MIME);
        do {
            next = headerTokenizer.next();
            type = next.getType();
            if (type == -4) {
                return strTrim;
            }
        } while (type != -1);
        return next.getValue();
    }

    public static String c(MimePart mimePart) throws MessagingException {
        String strCleanContentType;
        String header = mimePart.getHeader(ConstantsKt.CONTENT_DISPOSITION, null);
        String parameter = header != null ? new ContentDisposition(header).getParameter("filename") : null;
        if (parameter == null && (strCleanContentType = MimeUtil.cleanContentType(mimePart, mimePart.getHeader(DigipassManagerConstants.KEY_CONTENT_TYPE, null))) != null) {
            try {
                parameter = new ContentType(strCleanContentType).getParameter("name");
            } catch (ParseException unused) {
            }
        }
        if (!f78986d || parameter == null) {
            return parameter;
        }
        try {
            return MimeUtility.decodeText(parameter);
        } catch (UnsupportedEncodingException e5) {
            throw new MessagingException("Can't decode filename", e5);
        }
    }

    public static boolean d(MimePart mimePart, String str) throws MessagingException {
        String contentType = mimePart.getContentType();
        try {
            return new ContentType(contentType).match(str);
        } catch (ParseException unused) {
            try {
                int iIndexOf = contentType.indexOf(59);
                if (iIndexOf > 0) {
                    return new ContentType(contentType.substring(0, iIndexOf)).match(str);
                }
            } catch (ParseException unused2) {
            }
            return contentType.equalsIgnoreCase(str);
        }
    }

    public static String e(MimePart mimePart, String str) throws MessagingException {
        String contentType;
        if (!f78987e || str == null || str.equalsIgnoreCase("7bit") || str.equalsIgnoreCase("8bit") || str.equalsIgnoreCase("binary") || (contentType = mimePart.getContentType()) == null) {
            return str;
        }
        try {
            ContentType contentType2 = new ContentType(contentType);
            if (contentType2.match("multipart/*")) {
                return null;
            }
            if (contentType2.match("message/*") && !PropUtil.getBooleanSystemProperty("mail.mime.allowencodedmessages", false)) {
                return null;
            }
        } catch (ParseException unused) {
        }
        return str;
    }

    public static void f(MimePart mimePart, String[] strArr) throws MessagingException {
        StringBuilder sb2 = new StringBuilder(strArr[0]);
        int length = strArr[0].length() + 18;
        for (int i10 = 1; i10 < strArr.length; i10++) {
            sb2.append(AbstractJsonLexerKt.COMMA);
            int i11 = length + 1;
            if (i11 > 76) {
                sb2.append("\r\n\t");
                i11 = 8;
            }
            sb2.append(strArr[i10]);
            length = i11 + strArr[i10].length();
        }
        mimePart.setHeader("Content-Language", sb2.toString());
    }

    public static void g(MimePart mimePart, String str, String str2) throws MessagingException {
        if (str == null) {
            mimePart.removeHeader("Content-Description");
            return;
        }
        try {
            mimePart.setHeader("Content-Description", MimeUtility.fold(21, MimeUtility.encodeText(str, str2, null)));
        } catch (UnsupportedEncodingException e5) {
            throw new MessagingException("Encoding error", e5);
        }
    }

    public static void h(MimePart mimePart, String str) throws MessagingException {
        if (str == null) {
            mimePart.removeHeader(ConstantsKt.CONTENT_DISPOSITION);
            return;
        }
        String header = mimePart.getHeader(ConstantsKt.CONTENT_DISPOSITION, null);
        if (header != null) {
            ContentDisposition contentDisposition = new ContentDisposition(header);
            contentDisposition.setDisposition(str);
            str = contentDisposition.toString();
        }
        mimePart.setHeader(ConstantsKt.CONTENT_DISPOSITION, str);
    }

    public static void i(MimePart mimePart, String str) throws MessagingException {
        String strCleanContentType;
        boolean z10 = f78985c;
        if (z10 && str != null) {
            try {
                str = MimeUtility.encodeText(str);
            } catch (UnsupportedEncodingException e5) {
                throw new MessagingException("Can't encode filename", e5);
            }
        }
        String header = mimePart.getHeader(ConstantsKt.CONTENT_DISPOSITION, null);
        if (header == null) {
            header = Part.ATTACHMENT;
        }
        ContentDisposition contentDisposition = new ContentDisposition(header);
        String strE = MimeUtility.e();
        ParameterList parameterList = contentDisposition.getParameterList();
        if (parameterList == null) {
            parameterList = new ParameterList();
            contentDisposition.setParameterList(parameterList);
        }
        if (z10) {
            ParameterList.a aVar = new ParameterList.a();
            aVar.f79022a = str;
            parameterList.f79018a.put("filename", aVar);
        } else {
            parameterList.set("filename", str, strE);
        }
        mimePart.setHeader(ConstantsKt.CONTENT_DISPOSITION, contentDisposition.toString());
        if (!f78984b || (strCleanContentType = MimeUtil.cleanContentType(mimePart, mimePart.getHeader(DigipassManagerConstants.KEY_CONTENT_TYPE, null))) == null) {
            return;
        }
        try {
            ContentType contentType = new ContentType(strCleanContentType);
            ParameterList parameterList2 = contentType.getParameterList();
            if (parameterList2 == null) {
                parameterList2 = new ParameterList();
                contentType.setParameterList(parameterList2);
            }
            if (z10) {
                ParameterList.a aVar2 = new ParameterList.a();
                aVar2.f79022a = str;
                parameterList2.f79018a.put("name", aVar2);
            } else {
                parameterList2.set("name", str, strE);
            }
            mimePart.setHeader(DigipassManagerConstants.KEY_CONTENT_TYPE, contentType.toString());
        } catch (ParseException unused) {
        }
    }

    public static void j(MimePart mimePart, String str, String str2, String str3) throws MessagingException {
        if (str2 == null) {
            str2 = MimeUtility.a(str) != 1 ? MimeUtility.e() : "us-ascii";
        }
        StringBuilder sbD = ci.a.d("text/", str3, "; charset=");
        sbD.append(MimeUtility.quote(str2, HeaderTokenizer.MIME));
        mimePart.setContent(str, sbD.toString());
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0093 A[Catch: IOException -> 0x003a, TRY_ENTER, TryCatch #0 {IOException -> 0x003a, blocks: (B:5:0x000d, B:9:0x001c, B:11:0x0029, B:13:0x002d, B:26:0x0052, B:28:0x0056, B:35:0x008d, B:38:0x0093, B:41:0x009c, B:42:0x00a3, B:44:0x00a9, B:47:0x00af, B:49:0x00b5, B:51:0x00be, B:53:0x00c2, B:55:0x00ca, B:57:0x00d0, B:59:0x00d6, B:63:0x00e5, B:62:0x00e1, B:65:0x00ee, B:67:0x00f2, B:69:0x00fb, B:71:0x0108, B:73:0x010e, B:74:0x0116, B:77:0x011c, B:79:0x0134, B:78:0x012d, B:80:0x0138, B:30:0x005d, B:31:0x0083, B:16:0x0035, B:19:0x003d, B:21:0x0041, B:24:0x0049, B:25:0x004e, B:32:0x0084), top: B:84:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:40:0x009a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x009c A[Catch: IOException -> 0x003a, TryCatch #0 {IOException -> 0x003a, blocks: (B:5:0x000d, B:9:0x001c, B:11:0x0029, B:13:0x002d, B:26:0x0052, B:28:0x0056, B:35:0x008d, B:38:0x0093, B:41:0x009c, B:42:0x00a3, B:44:0x00a9, B:47:0x00af, B:49:0x00b5, B:51:0x00be, B:53:0x00c2, B:55:0x00ca, B:57:0x00d0, B:59:0x00d6, B:63:0x00e5, B:62:0x00e1, B:65:0x00ee, B:67:0x00f2, B:69:0x00fb, B:71:0x0108, B:73:0x010e, B:74:0x0116, B:77:0x011c, B:79:0x0134, B:78:0x012d, B:80:0x0138, B:30:0x005d, B:31:0x0083, B:16:0x0035, B:19:0x003d, B:21:0x0041, B:24:0x0049, B:25:0x004e, B:32:0x0084), top: B:84:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00a9 A[Catch: IOException -> 0x003a, TryCatch #0 {IOException -> 0x003a, blocks: (B:5:0x000d, B:9:0x001c, B:11:0x0029, B:13:0x002d, B:26:0x0052, B:28:0x0056, B:35:0x008d, B:38:0x0093, B:41:0x009c, B:42:0x00a3, B:44:0x00a9, B:47:0x00af, B:49:0x00b5, B:51:0x00be, B:53:0x00c2, B:55:0x00ca, B:57:0x00d0, B:59:0x00d6, B:63:0x00e5, B:62:0x00e1, B:65:0x00ee, B:67:0x00f2, B:69:0x00fb, B:71:0x0108, B:73:0x010e, B:74:0x0116, B:77:0x011c, B:79:0x0134, B:78:0x012d, B:80:0x0138, B:30:0x005d, B:31:0x0083, B:16:0x0035, B:19:0x003d, B:21:0x0041, B:24:0x0049, B:25:0x004e, B:32:0x0084), top: B:84:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00af A[Catch: IOException -> 0x003a, TryCatch #0 {IOException -> 0x003a, blocks: (B:5:0x000d, B:9:0x001c, B:11:0x0029, B:13:0x002d, B:26:0x0052, B:28:0x0056, B:35:0x008d, B:38:0x0093, B:41:0x009c, B:42:0x00a3, B:44:0x00a9, B:47:0x00af, B:49:0x00b5, B:51:0x00be, B:53:0x00c2, B:55:0x00ca, B:57:0x00d0, B:59:0x00d6, B:63:0x00e5, B:62:0x00e1, B:65:0x00ee, B:67:0x00f2, B:69:0x00fb, B:71:0x0108, B:73:0x010e, B:74:0x0116, B:77:0x011c, B:79:0x0134, B:78:0x012d, B:80:0x0138, B:30:0x005d, B:31:0x0083, B:16:0x0035, B:19:0x003d, B:21:0x0041, B:24:0x0049, B:25:0x004e, B:32:0x0084), top: B:84:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00b5 A[Catch: IOException -> 0x003a, TryCatch #0 {IOException -> 0x003a, blocks: (B:5:0x000d, B:9:0x001c, B:11:0x0029, B:13:0x002d, B:26:0x0052, B:28:0x0056, B:35:0x008d, B:38:0x0093, B:41:0x009c, B:42:0x00a3, B:44:0x00a9, B:47:0x00af, B:49:0x00b5, B:51:0x00be, B:53:0x00c2, B:55:0x00ca, B:57:0x00d0, B:59:0x00d6, B:63:0x00e5, B:62:0x00e1, B:65:0x00ee, B:67:0x00f2, B:69:0x00fb, B:71:0x0108, B:73:0x010e, B:74:0x0116, B:77:0x011c, B:79:0x0134, B:78:0x012d, B:80:0x0138, B:30:0x005d, B:31:0x0083, B:16:0x0035, B:19:0x003d, B:21:0x0041, B:24:0x0049, B:25:0x004e, B:32:0x0084), top: B:84:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:62:0x00e1 A[Catch: IOException -> 0x003a, TryCatch #0 {IOException -> 0x003a, blocks: (B:5:0x000d, B:9:0x001c, B:11:0x0029, B:13:0x002d, B:26:0x0052, B:28:0x0056, B:35:0x008d, B:38:0x0093, B:41:0x009c, B:42:0x00a3, B:44:0x00a9, B:47:0x00af, B:49:0x00b5, B:51:0x00be, B:53:0x00c2, B:55:0x00ca, B:57:0x00d0, B:59:0x00d6, B:63:0x00e5, B:62:0x00e1, B:65:0x00ee, B:67:0x00f2, B:69:0x00fb, B:71:0x0108, B:73:0x010e, B:74:0x0116, B:77:0x011c, B:79:0x0134, B:78:0x012d, B:80:0x0138, B:30:0x005d, B:31:0x0083, B:16:0x0035, B:19:0x003d, B:21:0x0041, B:24:0x0049, B:25:0x004e, B:32:0x0084), top: B:84:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:65:0x00ee A[Catch: IOException -> 0x003a, TryCatch #0 {IOException -> 0x003a, blocks: (B:5:0x000d, B:9:0x001c, B:11:0x0029, B:13:0x002d, B:26:0x0052, B:28:0x0056, B:35:0x008d, B:38:0x0093, B:41:0x009c, B:42:0x00a3, B:44:0x00a9, B:47:0x00af, B:49:0x00b5, B:51:0x00be, B:53:0x00c2, B:55:0x00ca, B:57:0x00d0, B:59:0x00d6, B:63:0x00e5, B:62:0x00e1, B:65:0x00ee, B:67:0x00f2, B:69:0x00fb, B:71:0x0108, B:73:0x010e, B:74:0x0116, B:77:0x011c, B:79:0x0134, B:78:0x012d, B:80:0x0138, B:30:0x005d, B:31:0x0083, B:16:0x0035, B:19:0x003d, B:21:0x0041, B:24:0x0049, B:25:0x004e, B:32:0x0084), top: B:84:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:73:0x010e A[Catch: IOException -> 0x003a, TryCatch #0 {IOException -> 0x003a, blocks: (B:5:0x000d, B:9:0x001c, B:11:0x0029, B:13:0x002d, B:26:0x0052, B:28:0x0056, B:35:0x008d, B:38:0x0093, B:41:0x009c, B:42:0x00a3, B:44:0x00a9, B:47:0x00af, B:49:0x00b5, B:51:0x00be, B:53:0x00c2, B:55:0x00ca, B:57:0x00d0, B:59:0x00d6, B:63:0x00e5, B:62:0x00e1, B:65:0x00ee, B:67:0x00f2, B:69:0x00fb, B:71:0x0108, B:73:0x010e, B:74:0x0116, B:77:0x011c, B:79:0x0134, B:78:0x012d, B:80:0x0138, B:30:0x005d, B:31:0x0083, B:16:0x0035, B:19:0x003d, B:21:0x0041, B:24:0x0049, B:25:0x004e, B:32:0x0084), top: B:84:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:77:0x011c A[Catch: IOException -> 0x003a, TRY_ENTER, TryCatch #0 {IOException -> 0x003a, blocks: (B:5:0x000d, B:9:0x001c, B:11:0x0029, B:13:0x002d, B:26:0x0052, B:28:0x0056, B:35:0x008d, B:38:0x0093, B:41:0x009c, B:42:0x00a3, B:44:0x00a9, B:47:0x00af, B:49:0x00b5, B:51:0x00be, B:53:0x00c2, B:55:0x00ca, B:57:0x00d0, B:59:0x00d6, B:63:0x00e5, B:62:0x00e1, B:65:0x00ee, B:67:0x00f2, B:69:0x00fb, B:71:0x0108, B:73:0x010e, B:74:0x0116, B:77:0x011c, B:79:0x0134, B:78:0x012d, B:80:0x0138, B:30:0x005d, B:31:0x0083, B:16:0x0035, B:19:0x003d, B:21:0x0041, B:24:0x0049, B:25:0x004e, B:32:0x0084), top: B:84:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:78:0x012d A[Catch: IOException -> 0x003a, TryCatch #0 {IOException -> 0x003a, blocks: (B:5:0x000d, B:9:0x001c, B:11:0x0029, B:13:0x002d, B:26:0x0052, B:28:0x0056, B:35:0x008d, B:38:0x0093, B:41:0x009c, B:42:0x00a3, B:44:0x00a9, B:47:0x00af, B:49:0x00b5, B:51:0x00be, B:53:0x00c2, B:55:0x00ca, B:57:0x00d0, B:59:0x00d6, B:63:0x00e5, B:62:0x00e1, B:65:0x00ee, B:67:0x00f2, B:69:0x00fb, B:71:0x0108, B:73:0x010e, B:74:0x0116, B:77:0x011c, B:79:0x0134, B:78:0x012d, B:80:0x0138, B:30:0x005d, B:31:0x0083, B:16:0x0035, B:19:0x003d, B:21:0x0041, B:24:0x0049, B:25:0x004e, B:32:0x0084), top: B:84:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:? A[RETURN, SYNTHETIC] */
    public static void k(MimePart mimePart) throws MessagingException {
        String header;
        String parameter;
        ParameterList parameterList;
        String encoding;
        String strE;
        MimePart mimePart2;
        String encoding2;
        Object content;
        DataHandler dataHandler = mimePart.getDataHandler();
        if (dataHandler == null) {
            return;
        }
        try {
            String contentType = dataHandler.getContentType();
            boolean z10 = false;
            boolean z11 = mimePart.getHeader(DigipassManagerConstants.KEY_CONTENT_TYPE) == null;
            ContentType contentType2 = new ContentType(contentType);
            if (!contentType2.match("multipart/*")) {
                if (contentType2.match("message/rfc822")) {
                }
                if (dataHandler instanceof b) {
                    mimePart2 = ((b) dataHandler).m;
                    if (mimePart2 != mimePart) {
                        return;
                    }
                    if (z11) {
                        mimePart.setHeader(DigipassManagerConstants.KEY_CONTENT_TYPE, mimePart2.getContentType());
                    }
                    encoding2 = mimePart2.getEncoding();
                    if (encoding2 != null) {
                        mimePart.setHeader("Content-Transfer-Encoding", encoding2);
                        return;
                    }
                }
                if (!z10) {
                    if (mimePart.getHeader("Content-Transfer-Encoding") == null) {
                        mimePart.setHeader("Content-Transfer-Encoding", MimeUtility.getEncoding(dataHandler));
                    }
                    if (z11 && f78983a && contentType2.match("text/*") && contentType2.getParameter("charset") == null) {
                        encoding = mimePart.getEncoding();
                        if (encoding == null && encoding.equalsIgnoreCase("7bit")) {
                            strE = "us-ascii";
                        } else {
                            strE = MimeUtility.e();
                        }
                        contentType2.setParameter("charset", strE);
                        contentType = contentType2.toString();
                    }
                }
                if (z11) {
                    if (f78984b && (header = mimePart.getHeader(ConstantsKt.CONTENT_DISPOSITION, null)) != null && (parameter = new ContentDisposition(header).getParameter("filename")) != null) {
                        parameterList = contentType2.getParameterList();
                        if (parameterList == null) {
                            parameterList = new ParameterList();
                            contentType2.setParameterList(parameterList);
                        }
                        if (f78985c) {
                            String strEncodeText = MimeUtility.encodeText(parameter);
                            ParameterList.a aVar = new ParameterList.a();
                            aVar.f79022a = strEncodeText;
                            parameterList.f79018a.put("name", aVar);
                        } else {
                            parameterList.set("name", parameter, MimeUtility.e());
                        }
                        contentType = contentType2.toString();
                    }
                    mimePart.setHeader(DigipassManagerConstants.KEY_CONTENT_TYPE, contentType);
                }
            }
            if (mimePart instanceof MimeBodyPart) {
                content = ((MimeBodyPart) mimePart).cachedContent;
                if (content == null) {
                    content = dataHandler.getContent();
                }
            } else if (!(mimePart instanceof MimeMessage) || (content = ((MimeMessage) mimePart).cachedContent) == null) {
                content = dataHandler.getContent();
            }
            if (!(content instanceof MimeMultipart)) {
                throw new MessagingException("MIME part of type \"" + contentType + "\" contains object of type " + content.getClass().getName() + " instead of MimeMultipart");
            }
            ((MimeMultipart) content).updateHeaders();
            z10 = true;
            if (dataHandler instanceof b) {
                mimePart2 = ((b) dataHandler).m;
                if (mimePart2 != mimePart) {
                    return;
                }
                if (z11) {
                    mimePart.setHeader(DigipassManagerConstants.KEY_CONTENT_TYPE, mimePart2.getContentType());
                }
                encoding2 = mimePart2.getEncoding();
                if (encoding2 != null) {
                    mimePart.setHeader("Content-Transfer-Encoding", encoding2);
                    return;
                }
            }
            if (!z10) {
                if (mimePart.getHeader("Content-Transfer-Encoding") == null) {
                    mimePart.setHeader("Content-Transfer-Encoding", MimeUtility.getEncoding(dataHandler));
                }
                if (z11) {
                    encoding = mimePart.getEncoding();
                    if (encoding == null) {
                        strE = MimeUtility.e();
                    } else {
                        strE = MimeUtility.e();
                    }
                    contentType2.setParameter("charset", strE);
                    contentType = contentType2.toString();
                }
            }
            if (z11) {
                if (f78984b) {
                    parameterList = contentType2.getParameterList();
                    if (parameterList == null) {
                        parameterList = new ParameterList();
                        contentType2.setParameterList(parameterList);
                    }
                    if (f78985c) {
                        String strEncodeText2 = MimeUtility.encodeText(parameter);
                        ParameterList.a aVar2 = new ParameterList.a();
                        aVar2.f79022a = strEncodeText2;
                        parameterList.f79018a.put("name", aVar2);
                    } else {
                        parameterList.set("name", parameter, MimeUtility.e());
                    }
                    contentType = contentType2.toString();
                }
                mimePart.setHeader(DigipassManagerConstants.KEY_CONTENT_TYPE, contentType);
            }
        } catch (IOException e5) {
            throw new MessagingException("IOException updating headers", e5);
        }
    }

    public static void l(MimePart mimePart, OutputStream outputStream, String[] strArr) throws MessagingException, IOException {
        LineOutputStream lineOutputStream = outputStream instanceof LineOutputStream ? (LineOutputStream) outputStream : new LineOutputStream(outputStream, f78988f);
        Enumeration<String> nonMatchingHeaderLines = mimePart.getNonMatchingHeaderLines(strArr);
        while (nonMatchingHeaderLines.hasMoreElements()) {
            lineOutputStream.writeln(nonMatchingHeaderLines.nextElement());
        }
        lineOutputStream.writeln();
        InputStream contentStream = null;
        try {
            DataHandler dataHandler = mimePart.getDataHandler();
            if (dataHandler instanceof b) {
                b bVar = (b) dataHandler;
                if (bVar.m.getEncoding() != null) {
                    MimePart mimePart2 = bVar.m;
                    if (mimePart2 instanceof MimeBodyPart) {
                        contentStream = ((MimeBodyPart) mimePart2).getContentStream();
                    } else if (mimePart2 instanceof MimeMessage) {
                        contentStream = ((MimeMessage) mimePart2).getContentStream();
                    }
                }
            }
            if (contentStream != null) {
                byte[] bArr = new byte[8192];
                while (true) {
                    int i10 = contentStream.read(bArr);
                    if (i10 <= 0) {
                        break;
                    } else {
                        outputStream.write(bArr, 0, i10);
                    }
                }
            } else {
                outputStream = MimeUtility.encode(outputStream, e(mimePart, mimePart.getEncoding()));
                mimePart.getDataHandler().writeTo(outputStream);
            }
            if (contentStream != null) {
                contentStream.close();
            }
            outputStream.flush();
        } catch (Throwable th2) {
            if (0 != 0) {
                contentStream.close();
            }
            throw th2;
        }
    }

    @Override // javax.mail.Part
    public void addHeader(String str, String str2) throws MessagingException {
        this.headers.addHeader(str, str2);
    }

    public void addHeaderLine(String str) throws MessagingException {
        this.headers.addHeaderLine(str);
    }

    public void attachFile(File file) throws MessagingException, IOException {
        FileDataSource fileDataSource = new FileDataSource(file);
        setDataHandler(new DataHandler(fileDataSource));
        setFileName(fileDataSource.getName());
        setDisposition(Part.ATTACHMENT);
    }

    public Enumeration<String> getAllHeaderLines() throws MessagingException {
        return this.headers.getAllHeaderLines();
    }

    @Override // javax.mail.Part
    public Enumeration<Header> getAllHeaders() throws MessagingException {
        return this.headers.getAllHeaders();
    }

    @Override // javax.mail.Part
    public Object getContent() throws MessagingException, IOException {
        Object obj = this.cachedContent;
        if (obj != null) {
            return obj;
        }
        try {
            Object content = getDataHandler().getContent();
            if (f78989g && (((content instanceof Multipart) || (content instanceof Message)) && (this.content != null || this.contentStream != null))) {
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

    @Override // javax.mail.internet.MimePart
    public String[] getContentLanguage() throws MessagingException {
        return a(this);
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
            return new ByteArrayInputStream(this.content);
        }
        throw new MessagingException("No MimeBodyPart content");
    }

    @Override // javax.mail.Part
    public String getContentType() throws MessagingException {
        String strCleanContentType = MimeUtil.cleanContentType(this, getHeader(DigipassManagerConstants.KEY_CONTENT_TYPE, null));
        return strCleanContentType == null ? AssetHelper.DEFAULT_MIME_TYPE : strCleanContentType;
    }

    @Override // javax.mail.Part
    public DataHandler getDataHandler() throws MessagingException {
        if (this.f78990dh == null) {
            this.f78990dh = new b(this);
        }
        return this.f78990dh;
    }

    @Override // javax.mail.Part
    public String getDescription() throws MessagingException {
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
        String header = getHeader(ConstantsKt.CONTENT_DISPOSITION, null);
        if (header == null) {
            return null;
        }
        return new ContentDisposition(header).getDisposition();
    }

    public String getEncoding() throws MessagingException {
        return b(this);
    }

    @Override // javax.mail.Part
    public String getFileName() throws MessagingException {
        return c(this);
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

    @Override // javax.mail.Part
    public boolean isMimeType(String str) throws MessagingException {
        return d(this, str);
    }

    @Override // javax.mail.Part
    public void removeHeader(String str) throws MessagingException {
        this.headers.removeHeader(str);
    }

    public void saveFile(File file) throws Throwable {
        BufferedOutputStream bufferedOutputStream;
        InputStream inputStream = null;
        try {
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
            try {
                inputStream = getInputStream();
                byte[] bArr = new byte[8192];
                while (true) {
                    int i10 = inputStream.read(bArr);
                    if (i10 > 0) {
                        bufferedOutputStream.write(bArr, 0, i10);
                    } else {
                        try {
                            break;
                        } catch (IOException unused) {
                        }
                    }
                }
                inputStream.close();
                try {
                    bufferedOutputStream.close();
                } catch (IOException unused2) {
                }
            } catch (Throwable th2) {
                th = th2;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused3) {
                    }
                }
                if (bufferedOutputStream == null) {
                    throw th;
                }
                try {
                    bufferedOutputStream.close();
                    throw th;
                } catch (IOException unused4) {
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            bufferedOutputStream = null;
        }
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

    @Override // javax.mail.internet.MimePart
    public void setContentLanguage(String[] strArr) throws MessagingException {
        f(this, strArr);
    }

    public void setContentMD5(String str) throws MessagingException {
        setHeader("Content-MD5", str);
    }

    @Override // javax.mail.Part
    public void setDataHandler(DataHandler dataHandler) throws MessagingException {
        this.f78990dh = dataHandler;
        this.cachedContent = null;
        removeHeader(DigipassManagerConstants.KEY_CONTENT_TYPE);
        removeHeader("Content-Transfer-Encoding");
    }

    @Override // javax.mail.Part
    public void setDescription(String str) throws MessagingException {
        setDescription(str, null);
    }

    @Override // javax.mail.Part
    public void setDisposition(String str) throws MessagingException {
        h(this, str);
    }

    @Override // javax.mail.Part
    public void setFileName(String str) throws MessagingException {
        i(this, str);
    }

    @Override // javax.mail.Part
    public void setHeader(String str, String str2) throws MessagingException {
        this.headers.setHeader(str, str2);
    }

    @Override // javax.mail.Part, javax.mail.internet.MimePart
    public void setText(String str) throws MessagingException {
        setText(str, null);
    }

    public void updateHeaders() throws MessagingException {
        k(this);
        Object obj = this.cachedContent;
        if (obj != null) {
            this.f78990dh = new DataHandler(obj, getContentType());
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
    }

    @Override // javax.mail.Part
    public void writeTo(OutputStream outputStream) throws MessagingException, IOException {
        l(this, outputStream, null);
    }

    @Override // javax.mail.internet.MimePart
    public String getHeader(String str, String str2) throws MessagingException {
        return this.headers.getHeader(str, str2);
    }

    public void setDescription(String str, String str2) throws MessagingException {
        g(this, str, str2);
    }

    @Override // javax.mail.internet.MimePart
    public void setText(String str, String str2) throws MessagingException {
        j(this, str, str2, "plain");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MimeBodyPart(InputStream inputStream) throws MessagingException {
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
        this.headers = new InternetHeaders(bufferedInputStream);
        if (bufferedInputStream instanceof SharedInputStream) {
            SharedInputStream sharedInputStream = (SharedInputStream) bufferedInputStream;
            this.contentStream = sharedInputStream.newStream(sharedInputStream.getPosition(), -1L);
        } else {
            try {
                this.content = ASCIIUtility.getBytes(bufferedInputStream);
            } catch (IOException e5) {
                throw new MessagingException("Error reading input stream", e5);
            }
        }
    }

    @Override // javax.mail.internet.MimePart
    public void setText(String str, String str2, String str3) throws MessagingException {
        j(this, str, str2, str3);
    }

    @Override // javax.mail.Part
    public void setContent(Multipart multipart) throws MessagingException {
        setDataHandler(new DataHandler(multipart, multipart.getContentType()));
        multipart.setParent(this);
    }

    public void attachFile(String str) throws MessagingException, IOException {
        attachFile(new File(str));
    }

    public void attachFile(File file, String str, String str2) throws MessagingException, IOException {
        a aVar = new a(file);
        aVar.f78991c = str;
        aVar.f78992d = str2;
        setDataHandler(new DataHandler(aVar));
        setFileName(aVar.getName());
        setDisposition(Part.ATTACHMENT);
    }

    public void saveFile(String str) throws Throwable {
        saveFile(new File(str));
    }

    public MimeBodyPart(InternetHeaders internetHeaders, byte[] bArr) throws MessagingException {
        this.headers = internetHeaders;
        this.content = bArr;
    }

    public void attachFile(String str, String str2, String str3) throws MessagingException, IOException {
        attachFile(new File(str), str2, str3);
    }
}
