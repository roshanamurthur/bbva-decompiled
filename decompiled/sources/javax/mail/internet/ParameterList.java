package javax.mail.internet;

import androidx.camera.camera2.internal.compat.u;
import androidx.camera.core.processing.f;
import androidx.webkit.ProxyConfig;
import com.sun.mail.util.ASCIIUtility;
import com.sun.mail.util.PropUtil;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class ParameterList {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f79010e = PropUtil.getBooleanSystemProperty("mail.mime.encodeparameters", true);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final boolean f79011f = PropUtil.getBooleanSystemProperty("mail.mime.decodeparameters", true);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final boolean f79012g = PropUtil.getBooleanSystemProperty("mail.mime.decodeparameters.strict", false);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final boolean f79013h = PropUtil.getBooleanSystemProperty("mail.mime.applefilenames", false);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final boolean f79014i = PropUtil.getBooleanSystemProperty("mail.mime.windowsfilenames", false);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final boolean f79015j = PropUtil.getBooleanSystemProperty("mail.mime.parameters.strict", true);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final boolean f79016k = PropUtil.getBooleanSystemProperty("mail.mime.splitlongparameters", true);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final char[] f79017l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f79018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashSet f79019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f79020c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f79021d;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f79022a;
    }

    public static class b extends ArrayList<Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public String f79023p0;
    }

    public static class c implements Enumeration<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Iterator<String> f79024a;

        @Override // java.util.Enumeration
        public final boolean hasMoreElements() {
            return this.f79024a.hasNext();
        }

        @Override // java.util.Enumeration
        public final String nextElement() {
            return this.f79024a.next();
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f79025a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public StringBuilder f79026b;

        public final void a(String str, String str2) {
            StringBuilder sb2 = this.f79026b;
            sb2.append("; ");
            this.f79025a += 2;
            if (this.f79025a + str2.length() + str.length() + 1 > 76) {
                sb2.append("\r\n\t");
                this.f79025a = 8;
            }
            sb2.append(str);
            sb2.append('=');
            int length = str.length() + 1 + this.f79025a;
            this.f79025a = length;
            if (str2.length() + length <= 76) {
                sb2.append(str2);
                this.f79025a = str2.length() + this.f79025a;
                return;
            }
            String strFold = MimeUtility.fold(this.f79025a, str2);
            sb2.append(strFold);
            int iLastIndexOf = strFold.lastIndexOf(10);
            if (iLastIndexOf >= 0) {
                this.f79025a = ((strFold.length() - iLastIndexOf) - 1) + this.f79025a;
            } else {
                this.f79025a = strFold.length() + this.f79025a;
            }
        }

        public final String toString() {
            return this.f79026b.toString();
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f79027a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f79028b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f79029c;
    }

    public ParameterList() {
        this.f79018a = new LinkedHashMap();
        this.f79021d = null;
        if (f79011f) {
            this.f79019b = new HashSet();
            this.f79020c = new HashMap();
        }
    }

    public static String b(String str, String str2) throws ParseException, UnsupportedEncodingException {
        boolean z10 = f79012g;
        byte[] bArr = new byte[str.length()];
        int i10 = 0;
        int i11 = 0;
        while (i10 < str.length()) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == '%') {
                try {
                    cCharAt = (char) Integer.parseInt(str.substring(i10 + 1, i10 + 3), 16);
                    i10 += 2;
                } catch (NumberFormatException e5) {
                    if (z10) {
                        throw new ParseException(e5.toString());
                    }
                } catch (StringIndexOutOfBoundsException e7) {
                    if (z10) {
                        throw new ParseException(e7.toString());
                    }
                }
            }
            bArr[i11] = (byte) cCharAt;
            i10++;
            i11++;
        }
        if (str2 != null) {
            str2 = MimeUtility.javaCharset(str2);
        }
        if (str2 == null || str2.length() == 0) {
            str2 = MimeUtility.getDefaultJavaCharset();
        }
        return new String(bArr, 0, i11, str2);
    }

    public static void c(ByteArrayOutputStream byteArrayOutputStream, String str) throws ParseException, IOException {
        boolean z10 = f79012g;
        int i10 = 0;
        while (i10 < str.length()) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == '%') {
                try {
                    cCharAt = (char) Integer.parseInt(str.substring(i10 + 1, i10 + 3), 16);
                    i10 += 2;
                } catch (NumberFormatException e5) {
                    if (z10) {
                        throw new ParseException(e5.toString());
                    }
                } catch (StringIndexOutOfBoundsException e7) {
                    if (z10) {
                        throw new ParseException(e7.toString());
                    }
                }
            }
            byteArrayOutputStream.write((byte) cCharAt);
            i10++;
        }
    }

    public static e d(String str) throws ParseException {
        boolean z10 = f79012g;
        e eVar = new e();
        eVar.f79029c = str;
        eVar.f79027a = str;
        try {
            int iIndexOf = str.indexOf(39);
            if (iIndexOf < 0) {
                if (z10) {
                    throw new ParseException("Missing charset in encoded value: ".concat(str));
                }
                return eVar;
            }
            String strSubstring = str.substring(0, iIndexOf);
            int iIndexOf2 = str.indexOf(39, iIndexOf + 1);
            if (iIndexOf2 < 0) {
                if (z10) {
                    throw new ParseException("Missing language in encoded value: ".concat(str));
                }
                return eVar;
            }
            eVar.f79027a = str.substring(iIndexOf2 + 1);
            eVar.f79028b = strSubstring;
            return eVar;
        } catch (NumberFormatException e5) {
            if (z10) {
                throw new ParseException(e5.toString());
            }
        } catch (StringIndexOutOfBoundsException e7) {
            if (z10) {
                throw new ParseException(e7.toString());
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x006c A[Catch: all -> 0x004d, UnsupportedEncodingException -> 0x0062, TryCatch #0 {UnsupportedEncodingException -> 0x0062, blocks: (B:24:0x005d, B:28:0x0066, B:32:0x0072, B:33:0x0079, B:30:0x006c), top: B:83:0x005d, outer: #5 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0072 A[Catch: all -> 0x004d, UnsupportedEncodingException -> 0x0062, TryCatch #0 {UnsupportedEncodingException -> 0x0062, blocks: (B:24:0x005d, B:28:0x0066, B:32:0x0072, B:33:0x0079, B:30:0x006c), top: B:83:0x005d, outer: #5 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0079 A[Catch: all -> 0x004d, UnsupportedEncodingException -> 0x0062, TRY_LEAVE, TryCatch #0 {UnsupportedEncodingException -> 0x0062, blocks: (B:24:0x005d, B:28:0x0066, B:32:0x0072, B:33:0x0079, B:30:0x006c), top: B:83:0x005d, outer: #5 }] */
    public final void a(boolean z10) throws ParseException {
        boolean z11 = f79012g;
        LinkedHashMap linkedHashMap = this.f79018a;
        HashSet<String> hashSet = this.f79019b;
        HashMap map = this.f79020c;
        try {
            for (String str : hashSet) {
                b bVar = new b();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                String strJavaCharset = null;
                int i10 = 0;
                while (true) {
                    String str2 = str + ProxyConfig.MATCH_ALL_SCHEMES + i10;
                    Object obj = map.get(str2);
                    if (obj == null) {
                        break;
                    }
                    bVar.add(obj);
                    try {
                        if (obj instanceof e) {
                            e eVar = (e) obj;
                            if (i10 == 0) {
                                strJavaCharset = eVar.f79028b;
                            } else if (strJavaCharset == null) {
                                hashSet.remove(str);
                                break;
                            }
                            c(byteArrayOutputStream, eVar.f79027a);
                        } else {
                            byteArrayOutputStream.write(ASCIIUtility.getBytes((String) obj));
                        }
                    } catch (IOException unused) {
                    }
                    map.remove(str2);
                    i10++;
                }
                if (i10 == 0) {
                    linkedHashMap.remove(str);
                } else {
                    if (strJavaCharset != null) {
                        try {
                            strJavaCharset = MimeUtility.javaCharset(strJavaCharset);
                            if (strJavaCharset != null || strJavaCharset.length() == 0) {
                                strJavaCharset = MimeUtility.getDefaultJavaCharset();
                            }
                            if (strJavaCharset != null) {
                                bVar.f79023p0 = byteArrayOutputStream.toString(strJavaCharset);
                            } else {
                                bVar.f79023p0 = byteArrayOutputStream.toString();
                            }
                        } catch (UnsupportedEncodingException e5) {
                            if (z11) {
                                throw new ParseException(e5.toString());
                            }
                            try {
                                bVar.f79023p0 = byteArrayOutputStream.toString("iso-8859-1");
                            } catch (UnsupportedEncodingException unused2) {
                            }
                        }
                    } else {
                        if (strJavaCharset != null) {
                            strJavaCharset = MimeUtility.getDefaultJavaCharset();
                        } else {
                            strJavaCharset = MimeUtility.getDefaultJavaCharset();
                        }
                        if (strJavaCharset != null) {
                            bVar.f79023p0 = byteArrayOutputStream.toString(strJavaCharset);
                        } else {
                            bVar.f79023p0 = byteArrayOutputStream.toString();
                        }
                    }
                    linkedHashMap.put(str, bVar);
                }
            }
            if (map.size() > 0) {
                for (Object obj2 : map.values()) {
                    if (obj2 instanceof e) {
                        e eVar2 = (e) obj2;
                        try {
                            eVar2.f79027a = b(eVar2.f79027a, eVar2.f79028b);
                        } catch (UnsupportedEncodingException e7) {
                            if (z11) {
                                throw new ParseException(e7.toString());
                            }
                        }
                    }
                }
                linkedHashMap.putAll(map);
            }
            hashSet.clear();
            map.clear();
        } catch (Throwable th2) {
            if (z10) {
                if (map.size() > 0) {
                    for (Object obj3 : map.values()) {
                        if (obj3 instanceof e) {
                            e eVar3 = (e) obj3;
                            try {
                                eVar3.f79027a = b(eVar3.f79027a, eVar3.f79028b);
                            } catch (UnsupportedEncodingException e10) {
                                if (z11) {
                                    throw new ParseException(e10.toString());
                                }
                            }
                        }
                    }
                    linkedHashMap.putAll(map);
                }
                hashSet.clear();
                map.clear();
            }
            throw th2;
        }
    }

    public void combineSegments() {
        if (!f79011f || this.f79019b.size() <= 0) {
            return;
        }
        try {
            a(true);
        } catch (ParseException unused) {
        }
    }

    public final void e(String str, String str2) throws ParseException {
        Object obj;
        e eVarD;
        int iIndexOf = str.indexOf(42);
        LinkedHashMap linkedHashMap = this.f79018a;
        if (iIndexOf < 0) {
            linkedHashMap.put(str, str2);
            return;
        }
        if (iIndexOf == str.length() - 1) {
            String strSubstring = str.substring(0, iIndexOf);
            e eVarD2 = d(str2);
            try {
                eVarD2.f79027a = b(eVarD2.f79027a, eVarD2.f79028b);
            } catch (UnsupportedEncodingException e5) {
                if (f79012g) {
                    throw new ParseException(e5.toString());
                }
            }
            linkedHashMap.put(strSubstring, eVarD2);
            return;
        }
        String strSubstring2 = str.substring(0, iIndexOf);
        this.f79019b.add(strSubstring2);
        linkedHashMap.put(strSubstring2, "");
        if (str.endsWith(ProxyConfig.MATCH_ALL_SCHEMES)) {
            if (str.endsWith("*0*")) {
                obj = str2;
                eVarD = d(str2);
            } else {
                obj = str2;
                e eVar = new e();
                eVar.f79029c = str2;
                eVar.f79027a = str2;
                eVarD = eVar;
            }
            str = androidx.databinding.e.c(str, 1, 0);
            obj = eVarD;
        }
        obj = str2;
        this.f79020c.put(str, obj);
    }

    public String get(String str) {
        Object obj = this.f79018a.get(str.trim().toLowerCase(Locale.ENGLISH));
        if (obj instanceof b) {
            return ((b) obj).f79023p0;
        }
        if (obj instanceof a) {
            return ((a) obj).f79022a;
        }
        return obj instanceof e ? ((e) obj).f79027a : (String) obj;
    }

    public Enumeration<String> getNames() {
        Iterator<String> it = this.f79018a.keySet().iterator();
        c cVar = new c();
        cVar.f79024a = it;
        return cVar;
    }

    public void remove(String str) {
        this.f79018a.remove(str.trim().toLowerCase(Locale.ENGLISH));
    }

    public void set(String str, String str2) {
        String lowerCase = str.trim().toLowerCase(Locale.ENGLISH);
        LinkedHashMap linkedHashMap = this.f79018a;
        if (!f79011f) {
            linkedHashMap.put(lowerCase, str2);
            return;
        }
        try {
            e(lowerCase, str2);
        } catch (ParseException unused) {
            linkedHashMap.put(lowerCase, str2);
        }
    }

    public int size() {
        return this.f79018a.size();
    }

    public String toString() {
        return toString(0);
    }

    public String toString(int i10) {
        String str;
        String str2;
        d dVar = new d();
        dVar.f79026b = new StringBuilder();
        dVar.f79025a = i10;
        for (Map.Entry entry : this.f79018a.entrySet()) {
            String str3 = (String) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof b) {
                b bVar = (b) value;
                String strF = u.f(str3, ProxyConfig.MATCH_ALL_SCHEMES);
                for (int i11 = 0; i11 < bVar.size(); i11++) {
                    Object obj = bVar.get(i11);
                    if (obj instanceof e) {
                        str = strF + i11 + ProxyConfig.MATCH_ALL_SCHEMES;
                        str2 = ((e) obj).f79029c;
                    } else {
                        str = strF + i11;
                        str2 = (String) obj;
                    }
                    dVar.a(str, MimeUtility.quote(str2, HeaderTokenizer.MIME));
                }
            } else if (value instanceof a) {
                dVar.a(str3, MimeUtility.quote(((a) value).f79022a, HeaderTokenizer.MIME));
            } else if (value instanceof e) {
                dVar.a(u.f(str3, ProxyConfig.MATCH_ALL_SCHEMES), MimeUtility.quote(((e) value).f79029c, HeaderTokenizer.MIME));
            } else {
                String strSubstring = (String) value;
                if (strSubstring.length() > 60 && f79016k && f79010e) {
                    String strF2 = u.f(str3, ProxyConfig.MATCH_ALL_SCHEMES);
                    int i12 = 0;
                    while (strSubstring.length() > 60) {
                        dVar.a(strF2 + i12, MimeUtility.quote(strSubstring.substring(0, 60), HeaderTokenizer.MIME));
                        strSubstring = strSubstring.substring(60);
                        i12++;
                    }
                    if (strSubstring.length() > 0) {
                        dVar.a(strF2 + i12, MimeUtility.quote(strSubstring, HeaderTokenizer.MIME));
                    }
                } else {
                    dVar.a(str3, MimeUtility.quote(strSubstring, HeaderTokenizer.MIME));
                }
            }
        }
        return dVar.f79026b.toString();
    }

    public void set(String str, String str2, String str3) {
        if (f79010e) {
            e eVar = null;
            if (MimeUtility.a(str2) != 1) {
                try {
                    byte[] bytes = str2.getBytes(MimeUtility.javaCharset(str3));
                    StringBuffer stringBuffer = new StringBuffer(str3.length() + bytes.length + 2);
                    stringBuffer.append(str3);
                    stringBuffer.append("''");
                    for (byte b10 : bytes) {
                        char c10 = (char) (b10 & 255);
                        if (c10 > ' ' && c10 < 127 && c10 != '*' && c10 != '\'' && c10 != '%' && HeaderTokenizer.MIME.indexOf(c10) < 0) {
                            stringBuffer.append(c10);
                        } else {
                            stringBuffer.append('%');
                            char[] cArr = f79017l;
                            stringBuffer.append(cArr[c10 >> 4]);
                            stringBuffer.append(cArr[c10 & 15]);
                        }
                    }
                    eVar = new e();
                    eVar.f79028b = str3;
                    eVar.f79027a = str2;
                    eVar.f79029c = stringBuffer.toString();
                } catch (UnsupportedEncodingException unused) {
                }
            }
            if (eVar != null) {
                this.f79018a.put(str.trim().toLowerCase(Locale.ENGLISH), eVar);
                return;
            } else {
                set(str, str2);
                return;
            }
        }
        set(str, str2);
    }

    public ParameterList(String str) throws ParseException {
        boolean z10;
        HeaderTokenizer.Token next;
        String str2;
        this();
        HeaderTokenizer headerTokenizer = new HeaderTokenizer(str, HeaderTokenizer.MIME);
        while (true) {
            HeaderTokenizer.Token next2 = headerTokenizer.next();
            int type = next2.getType();
            z10 = f79011f;
            if (type == -4) {
                break;
            }
            char c10 = (char) type;
            boolean z11 = f79015j;
            if (c10 == ';') {
                HeaderTokenizer.Token next3 = headerTokenizer.next();
                if (next3.getType() == -4) {
                    break;
                }
                if (next3.getType() == -1) {
                    String lowerCase = next3.getValue().toLowerCase(Locale.ENGLISH);
                    HeaderTokenizer.Token next4 = headerTokenizer.next();
                    if (((char) next4.getType()) == '=') {
                        if (f79014i && (lowerCase.equals("name") || lowerCase.equals("filename"))) {
                            next = headerTokenizer.next(';', true);
                        } else if (z11) {
                            next = headerTokenizer.next();
                        } else {
                            next = headerTokenizer.next(';');
                        }
                        int type2 = next.getType();
                        if (type2 != -1 && type2 != -2) {
                            StringBuilder sbD = ci.a.d("In parameter list <", str, ">, expected parameter value, got \"");
                            sbD.append(next.getValue());
                            sbD.append("\"");
                            throw new ParseException(sbD.toString());
                        }
                        String value = next.getValue();
                        this.f79021d = lowerCase;
                        if (z10) {
                            e(lowerCase, value);
                        } else {
                            this.f79018a.put(lowerCase, value);
                        }
                    } else {
                        StringBuilder sbD2 = ci.a.d("In parameter list <", str, ">, expected '=', got \"");
                        sbD2.append(next4.getValue());
                        sbD2.append("\"");
                        throw new ParseException(sbD2.toString());
                    }
                } else {
                    StringBuilder sbD3 = ci.a.d("In parameter list <", str, ">, expected parameter name, got \"");
                    sbD3.append(next3.getValue());
                    sbD3.append("\"");
                    throw new ParseException(sbD3.toString());
                }
            } else if (type == -1 && (str2 = this.f79021d) != null && ((f79013h && (str2.equals("name") || this.f79021d.equals("filename"))) || !z11)) {
                StringBuilder sbE = f.e((String) this.f79018a.get(this.f79021d), " ");
                sbE.append(next2.getValue());
                this.f79018a.put(this.f79021d, sbE.toString());
            } else {
                StringBuilder sbD4 = ci.a.d("In parameter list <", str, ">, expected ';', got \"");
                sbD4.append(next2.getValue());
                sbD4.append("\"");
                throw new ParseException(sbD4.toString());
            }
        }
        if (z10) {
            a(false);
        }
    }
}
