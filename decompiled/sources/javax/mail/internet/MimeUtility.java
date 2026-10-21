package javax.mail.internet;

import androidx.camera.camera2.internal.compat.u;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.nulabinc.zxcvbn.StandardKeyboards;
import com.sun.mail.util.ASCIIUtility;
import com.sun.mail.util.BASE64DecoderStream;
import com.sun.mail.util.BASE64EncoderStream;
import com.sun.mail.util.BEncoderStream;
import com.sun.mail.util.LineInputStream;
import com.sun.mail.util.PropUtil;
import com.sun.mail.util.QDecoderStream;
import com.sun.mail.util.QEncoderStream;
import com.sun.mail.util.QPDecoderStream;
import com.sun.mail.util.QPEncoderStream;
import com.sun.mail.util.UUDecoderStream;
import com.sun.mail.util.UUEncoderStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.mail.EncodingAware;
import javax.mail.MessagingException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes12.dex */
public class MimeUtility {
    public static final int ALL = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f78999a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f79000b = PropUtil.getBooleanSystemProperty("mail.mime.decodetext.strict", true);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f79001c = PropUtil.getBooleanSystemProperty("mail.mime.encodeeol.strict", false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f79002d = PropUtil.getBooleanSystemProperty("mail.mime.ignoreunknownencoding", false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f79003e = PropUtil.getBooleanSystemProperty("mail.mime.allowutf8", false);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final boolean f79004f = PropUtil.getBooleanSystemProperty("mail.mime.foldencodedwords", false);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final boolean f79005g = PropUtil.getBooleanSystemProperty("mail.mime.foldtext", true);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static String f79006h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static String f79007i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final HashMap f79008j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final HashMap f79009k;

    public class a extends InputStream {
        @Override // java.io.InputStream
        public final int read() {
            return 0;
        }
    }

    static {
        HashMap map = new HashMap(40);
        f79009k = map;
        HashMap map2 = new HashMap(14);
        f79008j = map2;
        try {
            InputStream resourceAsStream = MimeUtility.class.getResourceAsStream("/META-INF/javamail.charset.map");
            if (resourceAsStream != null) {
                try {
                    LineInputStream lineInputStream = new LineInputStream(resourceAsStream);
                    try {
                        f(lineInputStream, map);
                        f(lineInputStream, map2);
                        lineInputStream.close();
                    } catch (Throwable th2) {
                        th = th2;
                        resourceAsStream = lineInputStream;
                        try {
                            resourceAsStream.close();
                        } catch (Exception unused) {
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } catch (Exception unused2) {
        }
        HashMap map3 = f79009k;
        if (map3.isEmpty()) {
            map3.put("8859_1", "ISO-8859-1");
            map3.put("iso8859_1", "ISO-8859-1");
            map3.put("iso8859-1", "ISO-8859-1");
            map3.put("8859_2", "ISO-8859-2");
            map3.put("iso8859_2", "ISO-8859-2");
            map3.put("iso8859-2", "ISO-8859-2");
            map3.put("8859_3", "ISO-8859-3");
            map3.put("iso8859_3", "ISO-8859-3");
            map3.put("iso8859-3", "ISO-8859-3");
            map3.put("8859_4", "ISO-8859-4");
            map3.put("iso8859_4", "ISO-8859-4");
            map3.put("iso8859-4", "ISO-8859-4");
            map3.put("8859_5", "ISO-8859-5");
            map3.put("iso8859_5", "ISO-8859-5");
            map3.put("iso8859-5", "ISO-8859-5");
            map3.put("8859_6", "ISO-8859-6");
            map3.put("iso8859_6", "ISO-8859-6");
            map3.put("iso8859-6", "ISO-8859-6");
            map3.put("8859_7", "ISO-8859-7");
            map3.put("iso8859_7", "ISO-8859-7");
            map3.put("iso8859-7", "ISO-8859-7");
            map3.put("8859_8", "ISO-8859-8");
            map3.put("iso8859_8", "ISO-8859-8");
            map3.put("iso8859-8", "ISO-8859-8");
            map3.put("8859_9", "ISO-8859-9");
            map3.put("iso8859_9", "ISO-8859-9");
            map3.put("iso8859-9", "ISO-8859-9");
            map3.put("sjis", "Shift_JIS");
            map3.put(StandardKeyboards.JIS, "ISO-2022-JP");
            map3.put("iso2022jp", "ISO-2022-JP");
            map3.put("euc_jp", "euc-jp");
            map3.put("koi8_r", "koi8-r");
            map3.put("euc_cn", "euc-cn");
            map3.put("euc_tw", "euc-tw");
            map3.put("euc_kr", "euc-kr");
        }
        HashMap map4 = f79008j;
        if (map4.isEmpty()) {
            map4.put("iso-2022-cn", "ISO2022CN");
            map4.put("iso-2022-kr", "ISO2022KR");
            map4.put("utf-8", "UTF8");
            map4.put("utf8", "UTF8");
            map4.put("ja_jp.iso2022-7", "ISO2022JP");
            map4.put("ja_jp.eucjp", "EUCJIS");
            map4.put("euc-kr", "KSC5601");
            map4.put("euckr", "KSC5601");
            map4.put("us-ascii", "ISO-8859-1");
            map4.put("x-us-ascii", "ISO-8859-1");
            map4.put("gb2312", "GB18030");
            map4.put("cp936", "GB18030");
            map4.put("ms936", "GB18030");
            map4.put("gbk", "GB18030");
        }
    }

    public static int a(String str) {
        int length = str.length();
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            if (i(str.charAt(i12))) {
                i10++;
            } else {
                i11++;
            }
        }
        if (i10 == 0) {
            return 1;
        }
        return i11 > i10 ? 2 : 3;
    }

    public static String b(String str) throws UnsupportedEncodingException {
        int iIndexOf;
        int iIndexOf2;
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        while (true) {
            int iIndexOf3 = str.indexOf("=?", i10);
            if (iIndexOf3 < 0) {
                break;
            }
            sb2.append(str.substring(i10, iIndexOf3));
            int iIndexOf4 = str.indexOf(63, iIndexOf3 + 2);
            if (iIndexOf4 < 0 || (iIndexOf = str.indexOf(63, iIndexOf4 + 1)) < 0 || (iIndexOf2 = str.indexOf("?=", iIndexOf + 1)) < 0) {
                break;
            }
            i10 = iIndexOf2 + 2;
            String strSubstring = str.substring(iIndexOf3, i10);
            try {
                strSubstring = decodeWord(strSubstring);
            } catch (ParseException unused) {
            }
            sb2.append(strSubstring);
        }
        if (i10 == 0) {
            return str;
        }
        if (i10 < str.length()) {
            sb2.append(str.substring(i10));
        }
        return sb2.toString();
    }

    public static void c(String str, boolean z10, String str2, int i10, String str3, boolean z11, boolean z12, StringBuilder sb2) throws UnsupportedEncodingException {
        int length;
        byte[] bytes = str.getBytes(str2);
        if ((z10 ? BEncoderStream.encodedLength(bytes) : QEncoderStream.encodedLength(bytes, z12)) > i10 && (length = str.length()) > 1) {
            int i11 = length / 2;
            if (Character.isHighSurrogate(str.charAt(i11 - 1))) {
                i11--;
            }
            int i12 = i11;
            if (i12 > 0) {
                c(str.substring(0, i12), z10, str2, i10, str3, z11, z12, sb2);
            }
            c(str.substring(i12, length), z10, str2, i10, str3, false, z12, sb2);
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        OutputStream bEncoderStream = z10 ? new BEncoderStream(byteArrayOutputStream) : new QEncoderStream(byteArrayOutputStream, z12);
        try {
            bEncoderStream.write(bytes);
            bEncoderStream.close();
        } catch (IOException unused) {
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (!z11) {
            if (f79004f) {
                sb2.append("\r\n ");
            } else {
                sb2.append(" ");
            }
        }
        sb2.append(str3);
        for (byte b10 : byteArray) {
            sb2.append((char) b10);
        }
        sb2.append("?=");
    }

    public static String d(String str, String str2, String str3, boolean z10) throws UnsupportedEncodingException {
        String strJavaCharset;
        int iA = a(str);
        boolean z11 = true;
        if (iA == 1) {
            return str;
        }
        if (str2 == null) {
            strJavaCharset = getDefaultJavaCharset();
            str2 = e();
        } else {
            strJavaCharset = javaCharset(str2);
        }
        if (str3 == null) {
            str3 = iA != 3 ? TransactionType.TRANSACTION_TYPE_CONTACTLESS_CODE : "B";
        }
        if (!str3.equalsIgnoreCase("B")) {
            if (!str3.equalsIgnoreCase(TransactionType.TRANSACTION_TYPE_CONTACTLESS_CODE)) {
                throw new UnsupportedEncodingException("Unknown transfer encoding: ".concat(str3));
            }
            z11 = false;
        }
        boolean z12 = z11;
        StringBuilder sb2 = new StringBuilder();
        c(str, z12, strJavaCharset, 68 - str2.length(), u.g("=?", str2, "?", str3, "?"), true, z10, sb2);
        return sb2.toString();
    }

    public static InputStream decode(InputStream inputStream, String str) throws MessagingException {
        if (str.equalsIgnoreCase("base64")) {
            return new BASE64DecoderStream(inputStream);
        }
        if (str.equalsIgnoreCase("quoted-printable")) {
            return new QPDecoderStream(inputStream);
        }
        if (str.equalsIgnoreCase("uuencode") || str.equalsIgnoreCase("x-uuencode") || str.equalsIgnoreCase("x-uue")) {
            return new UUDecoderStream(inputStream);
        }
        if (str.equalsIgnoreCase("binary") || str.equalsIgnoreCase("7bit") || str.equalsIgnoreCase("8bit") || f79002d) {
            return inputStream;
        }
        throw new MessagingException("Unknown encoding: ".concat(str));
    }

    public static String decodeText(String str) throws UnsupportedEncodingException {
        String strB;
        if (str.indexOf("=?") == -1) {
            return str;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(str, " \t\n\r", true);
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        boolean zEndsWith = false;
        while (stringTokenizer.hasMoreTokens()) {
            String strNextToken = stringTokenizer.nextToken();
            char cCharAt = strNextToken.charAt(0);
            if (cCharAt == ' ' || cCharAt == '\t' || cCharAt == '\r' || cCharAt == '\n') {
                sb3.append(cCharAt);
            } else {
                try {
                    strB = decodeWord(strNextToken);
                    if (!zEndsWith && sb3.length() > 0) {
                        sb2.append((CharSequence) sb3);
                    }
                    zEndsWith = true;
                } catch (ParseException unused) {
                    if (!f79000b) {
                        strB = b(strNextToken);
                        if (strB != strNextToken) {
                            if ((!zEndsWith || !strNextToken.startsWith("=?")) && sb3.length() > 0) {
                                sb2.append((CharSequence) sb3);
                            }
                            zEndsWith = strNextToken.endsWith("?=");
                        } else if (sb3.length() > 0) {
                            sb2.append((CharSequence) sb3);
                        }
                    } else if (sb3.length() > 0) {
                        sb2.append((CharSequence) sb3);
                    }
                    zEndsWith = false;
                    sb2.append(strNextToken);
                    sb3.setLength(0);
                }
                strNextToken = strB;
                sb2.append(strNextToken);
                sb3.setLength(0);
            }
        }
        sb2.append((CharSequence) sb3);
        return sb2.toString();
    }

    public static String decodeWord(String str) throws ParseException, UnsupportedEncodingException {
        InputStream qDecoderStream;
        if (!str.startsWith("=?")) {
            throw new ParseException("encoded word does not start with \"=?\": ".concat(str));
        }
        int iIndexOf = str.indexOf(63, 2);
        if (iIndexOf == -1) {
            throw new ParseException("encoded word does not include charset: ".concat(str));
        }
        String strSubstring = str.substring(2, iIndexOf);
        int iIndexOf2 = strSubstring.indexOf(42);
        if (iIndexOf2 >= 0) {
            strSubstring = strSubstring.substring(0, iIndexOf2);
        }
        String strJavaCharset = javaCharset(strSubstring);
        int i10 = iIndexOf + 1;
        int iIndexOf3 = str.indexOf(63, i10);
        if (iIndexOf3 == -1) {
            throw new ParseException("encoded word does not include encoding: ".concat(str));
        }
        String strSubstring2 = str.substring(i10, iIndexOf3);
        int i11 = iIndexOf3 + 1;
        int iIndexOf4 = str.indexOf("?=", i11);
        if (iIndexOf4 == -1) {
            throw new ParseException("encoded word does not end with \"?=\": ".concat(str));
        }
        String strSubstring3 = str.substring(i11, iIndexOf4);
        try {
            String str2 = "";
            if (strSubstring3.length() > 0) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(ASCIIUtility.getBytes(strSubstring3));
                if (strSubstring2.equalsIgnoreCase("B")) {
                    qDecoderStream = new BASE64DecoderStream(byteArrayInputStream);
                } else {
                    if (!strSubstring2.equalsIgnoreCase(TransactionType.TRANSACTION_TYPE_CONTACTLESS_CODE)) {
                        throw new UnsupportedEncodingException("unknown encoding: ".concat(strSubstring2));
                    }
                    qDecoderStream = new QDecoderStream(byteArrayInputStream);
                }
                int iAvailable = byteArrayInputStream.available();
                byte[] bArr = new byte[iAvailable];
                int i12 = qDecoderStream.read(bArr, 0, iAvailable);
                if (i12 > 0) {
                    str2 = new String(bArr, 0, i12, strJavaCharset);
                }
            }
            int i13 = iIndexOf4 + 2;
            if (i13 >= str.length()) {
                return str2;
            }
            String strSubstring4 = str.substring(i13);
            if (!f79000b) {
                strSubstring4 = b(strSubstring4);
            }
            return str2 + strSubstring4;
        } catch (UnsupportedEncodingException e5) {
            throw e5;
        } catch (IOException e7) {
            throw new ParseException(e7.toString());
        } catch (IllegalArgumentException unused) {
            throw new UnsupportedEncodingException(strJavaCharset);
        }
    }

    public static String e() {
        if (f79007i == null) {
            try {
                f79007i = System.getProperty("mail.mime.charset");
            } catch (SecurityException unused) {
            }
        }
        if (f79007i == null) {
            f79007i = mimeCharset(getDefaultJavaCharset());
        }
        return f79007i;
    }

    public static OutputStream encode(OutputStream outputStream, String str) throws MessagingException {
        if (str == null) {
            return outputStream;
        }
        if (str.equalsIgnoreCase("base64")) {
            return new BASE64EncoderStream(outputStream);
        }
        if (str.equalsIgnoreCase("quoted-printable")) {
            return new QPEncoderStream(outputStream);
        }
        if (str.equalsIgnoreCase("uuencode") || str.equalsIgnoreCase("x-uuencode") || str.equalsIgnoreCase("x-uue")) {
            return new UUEncoderStream(outputStream);
        }
        if (str.equalsIgnoreCase("binary") || str.equalsIgnoreCase("7bit") || str.equalsIgnoreCase("8bit")) {
            return outputStream;
        }
        throw new MessagingException("Unknown encoding: ".concat(str));
    }

    public static String encodeText(String str) throws UnsupportedEncodingException {
        return encodeText(str, null, null);
    }

    public static String encodeWord(String str) throws UnsupportedEncodingException {
        return encodeWord(str, null, null);
    }

    public static void f(LineInputStream lineInputStream, HashMap map) {
        while (true) {
            try {
                String line = lineInputStream.readLine();
                if (line == null) {
                    return;
                }
                if (line.startsWith("--") && line.endsWith("--")) {
                    return;
                }
                if (line.trim().length() != 0 && !line.startsWith("#")) {
                    StringTokenizer stringTokenizer = new StringTokenizer(line, " \t");
                    try {
                        String strNextToken = stringTokenizer.nextToken();
                        map.put(strNextToken.toLowerCase(Locale.ENGLISH), stringTokenizer.nextToken());
                    } catch (NoSuchElementException unused) {
                    }
                }
            } catch (IOException unused2) {
                return;
            }
        }
    }

    public static String fold(int i10, String str) {
        char cCharAt;
        if (!f79005g) {
            return str;
        }
        int length = str.length() - 1;
        while (length >= 0 && ((cCharAt = str.charAt(length)) == ' ' || cCharAt == '\t' || cCharAt == '\r' || cCharAt == '\n')) {
            length--;
        }
        if (length != str.length() - 1) {
            str = str.substring(0, length + 1);
        }
        if (str.length() + i10 <= 76) {
            return g(str);
        }
        StringBuilder sb2 = new StringBuilder(str.length() + 4);
        char cCharAt2 = 0;
        while (str.length() + i10 > 76) {
            int i11 = 0;
            int i12 = -1;
            while (i11 < str.length() && (i12 == -1 || i10 + i11 <= 76)) {
                char cCharAt3 = str.charAt(i11);
                if ((cCharAt3 == ' ' || cCharAt3 == '\t') && cCharAt2 != ' ' && cCharAt2 != '\t') {
                    i12 = i11;
                }
                i11++;
                cCharAt2 = cCharAt3;
            }
            if (i12 == -1) {
                sb2.append(str);
                str = "";
                break;
            }
            sb2.append(str.substring(0, i12));
            sb2.append("\r\n");
            cCharAt2 = str.charAt(i12);
            sb2.append(cCharAt2);
            str = str.substring(i12 + 1);
            i10 = 1;
        }
        sb2.append(str);
        return g(sb2);
    }

    public static String g(CharSequence charSequence) {
        char cCharAt;
        int i10 = 0;
        while (i10 < charSequence.length() && (cCharAt = charSequence.charAt(i10)) != '\r' && cCharAt != '\n') {
            i10++;
        }
        if (i10 == charSequence.length()) {
            return charSequence.toString();
        }
        StringBuilder sb2 = new StringBuilder(charSequence.length() + 1);
        BufferedReader bufferedReader = new BufferedReader(new StringReader(charSequence.toString()));
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line == null) {
                    return sb2.toString();
                }
                if (line.trim().length() != 0) {
                    if (sb2.length() > 0) {
                        sb2.append("\r\n");
                        char cCharAt2 = line.charAt(0);
                        if (cCharAt2 != ' ' && cCharAt2 != '\t') {
                            sb2.append(' ');
                        }
                    }
                    sb2.append(line);
                }
            } catch (IOException unused) {
                return charSequence.toString();
            }
        }
    }

    public static String getDefaultJavaCharset() {
        String property;
        if (f79006h == null) {
            try {
                property = System.getProperty("mail.mime.charset");
            } catch (SecurityException unused) {
                property = null;
            }
            if (property != null && property.length() > 0) {
                String strJavaCharset = javaCharset(property);
                f79006h = strJavaCharset;
                return strJavaCharset;
            }
            try {
                f79006h = System.getProperty("file.encoding", "8859_1");
            } catch (SecurityException unused2) {
                String encoding = new InputStreamReader(new a()).getEncoding();
                f79006h = encoding;
                if (encoding == null) {
                    f79006h = "8859_1";
                }
            }
        }
        return f79006h;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0069 A[PHI: r7 r9 r18
      0x0069: PHI (r7v11 int) = (r7v12 int), (r7v13 int) binds: [B:29:0x0067, B:25:0x005c] A[DONT_GENERATE, DONT_INLINE]
      0x0069: PHI (r9v8 int) = (r9v9 int), (r9v10 int) binds: [B:29:0x0067, B:25:0x005c] A[DONT_GENERATE, DONT_INLINE]
      0x0069: PHI (r18v3 boolean) = (r18v4 boolean), (r18v5 boolean) binds: [B:29:0x0067, B:25:0x005c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:67:0x00be  */
    /* JADX WARN: Code duplicated, block: B:81:0x00c2 A[DONT_GENERATE, EXC_TOP_SPLITTER, SYNTHETIC] */
    public static String getEncoding(DataSource dataSource) {
        char c10;
        boolean z10;
        int i10;
        int i11;
        String encoding;
        String str = "base64";
        if ((dataSource instanceof EncodingAware) && (encoding = ((EncodingAware) dataSource).getEncoding()) != null) {
            return encoding;
        }
        InputStream inputStream = null;
        try {
            ContentType contentType = new ContentType(dataSource.getContentType());
            inputStream = dataSource.getInputStream();
            boolean zMatch = contentType.match("text/*");
            int i12 = 0;
            boolean z11 = !zMatch;
            boolean z12 = f79001c && z11;
            int i13 = 4096;
            byte[] bArr = new byte[4096];
            int i14 = 0;
            int i15 = 0;
            boolean z13 = false;
            boolean z14 = false;
            int i16 = 0;
            while (true) {
                try {
                    int i17 = inputStream.read(bArr, i12, i13);
                    if (i17 == -1) {
                        if (i15 == 0) {
                            if (!z13) {
                                if (z14) {
                                    c10 = 2;
                                } else {
                                    c10 = 1;
                                }
                            }
                        } else if (i14 > i15) {
                            c10 = 2;
                        }
                        if (c10 != 1) {
                            str = "7bit";
                        } else if (c10 == 2 && (!zMatch || !h(contentType))) {
                            str = "quoted-printable";
                        }
                        return str;
                    }
                    int i18 = 0;
                    int i19 = 0;
                    while (true) {
                        if (i18 < i17) {
                            int i20 = bArr[i18] & 255;
                            byte[] bArr2 = bArr;
                            if (z12) {
                                if (i19 == 13) {
                                    i11 = 10;
                                    z10 = z12;
                                    i10 = 13;
                                    if (i20 != 10) {
                                        z13 = true;
                                    }
                                } else {
                                    i11 = 10;
                                    z10 = z12;
                                    i10 = 13;
                                }
                                if (i19 != i10 && i20 == i11) {
                                    z13 = true;
                                }
                            } else {
                                z10 = z12;
                                i10 = 13;
                                i11 = 10;
                            }
                            if (i20 == i10 || i20 == i11) {
                                i16 = 0;
                            } else {
                                i16++;
                                if (i16 > 998) {
                                    z14 = true;
                                }
                            }
                            if (!i(i20)) {
                                i14++;
                            } else if (!z11) {
                                i15++;
                            }
                            i18++;
                            i19 = i20;
                            bArr = bArr2;
                            z12 = z10;
                        } else {
                            i12 = 0;
                            i13 = 4096;
                        }
                    }
                } catch (IOException unused) {
                }
                c10 = 3;
                if (c10 != 1) {
                    str = "7bit";
                } else if (c10 == 2) {
                    str = "quoted-printable";
                }
                return str;
            }
        } catch (Exception unused2) {
            return "base64";
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused3) {
                }
            }
        }
    }

    public static boolean h(ContentType contentType) {
        Boolean bool;
        Boolean boolValueOf;
        String parameter = contentType.getParameter("charset");
        if (parameter == null) {
            return false;
        }
        String lowerCase = parameter.toLowerCase(Locale.ENGLISH);
        HashMap map = f78999a;
        synchronized (map) {
            bool = (Boolean) map.get(lowerCase);
        }
        if (bool == null) {
            try {
                byte[] bytes = "\r\n".getBytes(lowerCase);
                boolValueOf = Boolean.valueOf((bytes.length == 2 && bytes[0] == 13 && bytes[1] == 10) ? false : true);
            } catch (UnsupportedEncodingException unused) {
                boolValueOf = Boolean.FALSE;
            } catch (RuntimeException unused2) {
                boolValueOf = Boolean.TRUE;
            }
            bool = boolValueOf;
            HashMap map2 = f78999a;
            synchronized (map2) {
                map2.put(lowerCase, bool);
            }
        }
        return bool.booleanValue();
    }

    public static final boolean i(int i10) {
        return i10 >= 127 || !(i10 >= 32 || i10 == 13 || i10 == 10 || i10 == 9);
    }

    public static String javaCharset(String str) {
        HashMap map = f79008j;
        if (map == null || str == null) {
            return str;
        }
        String str2 = (String) map.get(str.toLowerCase(Locale.ENGLISH));
        if (str2 != null) {
            try {
                Charset.forName(str2);
            } catch (Exception unused) {
                str2 = null;
            }
        }
        return str2 == null ? str : str2;
    }

    public static String mimeCharset(String str) {
        String str2;
        HashMap map = f79009k;
        return (map == null || str == null || (str2 = (String) map.get(str.toLowerCase(Locale.ENGLISH))) == null) ? str : str2;
    }

    public static String quote(String str, String str2) {
        char c10 = 0;
        int length = str == null ? 0 : str.length();
        if (length == 0) {
            return "\"\"";
        }
        int i10 = 0;
        boolean z10 = false;
        while (i10 < length) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == '\"' || cCharAt == '\\' || cCharAt == '\r' || cCharAt == '\n') {
                StringBuilder sb2 = new StringBuilder(length + 3);
                sb2.append('\"');
                sb2.append(str.substring(0, i10));
                while (i10 < length) {
                    char cCharAt2 = str.charAt(i10);
                    if ((cCharAt2 == '\"' || cCharAt2 == '\\' || cCharAt2 == '\r' || cCharAt2 == '\n') && (cCharAt2 != '\n' || c10 != '\r')) {
                        sb2.append(AbstractJsonLexerKt.STRING_ESC);
                    }
                    sb2.append(cCharAt2);
                    i10++;
                    c10 = cCharAt2;
                }
                sb2.append('\"');
                return sb2.toString();
            }
            if (cCharAt < ' ' || ((cCharAt >= 127 && !f79003e) || str2.indexOf(cCharAt) >= 0)) {
                z10 = true;
            }
            i10++;
        }
        if (!z10) {
            return str;
        }
        StringBuilder sb3 = new StringBuilder(length + 2);
        sb3.append('\"');
        sb3.append(str);
        sb3.append('\"');
        return sb3.toString();
    }

    public static String unfold(String str) {
        char cCharAt;
        if (!f79005g) {
            return str;
        }
        StringBuilder sb2 = null;
        while (true) {
            int i10 = -1;
            try {
                int length = str.length();
                for (int i11 = 0; i11 < length; i11++) {
                    if ("\r\n".indexOf(str.charAt(i11)) >= 0) {
                        i10 = i11;
                        break;
                    }
                }
            } catch (StringIndexOutOfBoundsException unused) {
            }
            if (i10 < 0) {
                break;
            }
            int length2 = str.length();
            int i12 = i10 + 1;
            if (i12 < length2 && str.charAt(i10) == '\r' && str.charAt(i12) == '\n') {
                i12 = i10 + 2;
            }
            if (i10 > 0) {
                int i13 = i10 - 1;
                if (str.charAt(i13) == '\\') {
                    if (sb2 == null) {
                        sb2 = new StringBuilder(str.length());
                    }
                    sb2.append(str.substring(0, i13));
                    sb2.append(str.substring(i10, i12));
                    str = str.substring(i12);
                }
            }
            if (i12 >= length2 || (cCharAt = str.charAt(i12)) == ' ' || cCharAt == '\t') {
                if (sb2 == null) {
                    sb2 = new StringBuilder(str.length());
                }
                sb2.append(str.substring(0, i10));
                str = str.substring(i12);
            } else {
                if (sb2 == null) {
                    sb2 = new StringBuilder(str.length());
                }
                sb2.append(str.substring(0, i12));
                str = str.substring(i12);
            }
        }
        if (sb2 == null) {
            return str;
        }
        sb2.append(str);
        return sb2.toString();
    }

    public static String encodeText(String str, String str2, String str3) throws UnsupportedEncodingException {
        return d(str, str2, str3, false);
    }

    public static String encodeWord(String str, String str2, String str3) throws UnsupportedEncodingException {
        return d(str, str2, str3, true);
    }

    public static OutputStream encode(OutputStream outputStream, String str, String str2) throws MessagingException {
        if (str == null) {
            return outputStream;
        }
        if (str.equalsIgnoreCase("base64")) {
            return new BASE64EncoderStream(outputStream);
        }
        if (str.equalsIgnoreCase("quoted-printable")) {
            return new QPEncoderStream(outputStream);
        }
        if (!str.equalsIgnoreCase("uuencode") && !str.equalsIgnoreCase("x-uuencode") && !str.equalsIgnoreCase("x-uue")) {
            if (str.equalsIgnoreCase("binary") || str.equalsIgnoreCase("7bit") || str.equalsIgnoreCase("8bit")) {
                return outputStream;
            }
            throw new MessagingException("Unknown encoding: ".concat(str));
        }
        return new UUEncoderStream(outputStream, str2);
    }

    public static String getEncoding(DataHandler dataHandler) {
        if (dataHandler.getName() != null) {
            return getEncoding(dataHandler.getDataSource());
        }
        try {
            if (new ContentType(dataHandler.getContentType()).match("text/*")) {
                javax.mail.internet.a aVar = new javax.mail.internet.a(false, false);
                try {
                    dataHandler.writeTo(aVar);
                } catch (IOException unused) {
                }
                int iB = aVar.b();
                if (iB != 1) {
                    return iB != 2 ? "base64" : "quoted-printable";
                }
            } else {
                javax.mail.internet.a aVar2 = new javax.mail.internet.a(true, f79001c);
                try {
                    dataHandler.writeTo(aVar2);
                } catch (IOException unused2) {
                }
                if (aVar2.b() != 1) {
                    return "base64";
                }
            }
            return "7bit";
        } catch (Exception unused3) {
            return "base64";
        }
    }
}
