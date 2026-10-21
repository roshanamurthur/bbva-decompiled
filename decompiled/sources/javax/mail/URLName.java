package javax.mail;

import com.bbva.glomohybrid.base.deeplink.extensions.DeepLinkExtensionsKt;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.BitSet;
import java.util.Locale;

/* JADX INFO: loaded from: classes12.dex */
public class URLName {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final boolean f78929k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final BitSet f78930l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f78931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f78932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f78933c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f78934d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public InetAddress f78935e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f78936f;
    protected String fullURL;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f78937g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f78938h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f78939i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f78940j;

    static {
        try {
            f78929k = !Boolean.getBoolean("mail.URLName.dontencode");
        } catch (Exception unused) {
        }
        f78930l = new BitSet(256);
        for (int i10 = 97; i10 <= 122; i10++) {
            f78930l.set(i10);
        }
        for (int i11 = 65; i11 <= 90; i11++) {
            f78930l.set(i11);
        }
        for (int i12 = 48; i12 <= 57; i12++) {
            f78930l.set(i12);
        }
        BitSet bitSet = f78930l;
        bitSet.set(32);
        bitSet.set(45);
        bitSet.set(95);
        bitSet.set(46);
        bitSet.set(42);
    }

    public URLName(String str, String str2, int i10, String str3, String str4, String str5) {
        int iIndexOf;
        this.f78936f = false;
        this.f78940j = 0;
        this.f78931a = str;
        this.f78934d = str2;
        this.f78937g = i10;
        if (str3 == null || (iIndexOf = str3.indexOf(35)) == -1) {
            this.f78938h = str3;
            this.f78939i = null;
        } else {
            this.f78938h = str3.substring(0, iIndexOf);
            this.f78939i = str3.substring(iIndexOf + 1);
        }
        boolean z10 = f78929k;
        this.f78932b = z10 ? b(str4) : str4;
        this.f78933c = z10 ? b(str5) : str5;
    }

    public static String a(String str) {
        if (str == null) {
            return null;
        }
        try {
            int length = str.length();
            int i10 = 0;
            for (int i11 = 0; i11 < length; i11++) {
                if ("+%".indexOf(str.charAt(i11)) >= 0) {
                    if (i11 == -1) {
                        break;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    while (i10 < str.length()) {
                        char cCharAt = str.charAt(i10);
                        if (cCharAt == '%') {
                            int i12 = i10 + 3;
                            try {
                                sb2.append((char) Integer.parseInt(str.substring(i10 + 1, i12), 16));
                                i10 += 2;
                            } catch (NumberFormatException unused) {
                                throw new IllegalArgumentException("Illegal URL encoded value: " + str.substring(i10, i12));
                            }
                        } else if (cCharAt != '+') {
                            sb2.append(cCharAt);
                        } else {
                            sb2.append(' ');
                        }
                        i10++;
                    }
                    String string = sb2.toString();
                    try {
                        return new String(string.getBytes("8859_1"));
                    } catch (UnsupportedEncodingException unused2) {
                        return string;
                    }
                }
            }
        } catch (StringIndexOutOfBoundsException unused3) {
        }
        return str;
    }

    public static String b(String str) {
        if (str == null) {
            return null;
        }
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            BitSet bitSet = f78930l;
            if (cCharAt == ' ' || !bitSet.get(cCharAt)) {
                StringBuilder sb2 = new StringBuilder(str.length());
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(10);
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(byteArrayOutputStream);
                for (int i11 = 0; i11 < str.length(); i11++) {
                    char cCharAt2 = str.charAt(i11);
                    if (bitSet.get(cCharAt2)) {
                        if (cCharAt2 == ' ') {
                            cCharAt2 = '+';
                        }
                        sb2.append(cCharAt2);
                    } else {
                        try {
                            outputStreamWriter.write(cCharAt2);
                            outputStreamWriter.flush();
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            for (int i12 = 0; i12 < byteArray.length; i12++) {
                                sb2.append('%');
                                char cForDigit = Character.forDigit((byteArray[i12] >> 4) & 15, 16);
                                if (Character.isLetter(cForDigit)) {
                                    cForDigit = (char) (cForDigit - ' ');
                                }
                                sb2.append(cForDigit);
                                char cForDigit2 = Character.forDigit(byteArray[i12] & 15, 16);
                                if (Character.isLetter(cForDigit2)) {
                                    cForDigit2 = (char) (cForDigit2 - ' ');
                                }
                                sb2.append(cForDigit2);
                            }
                            byteArrayOutputStream.reset();
                        } catch (IOException unused) {
                            byteArrayOutputStream.reset();
                        }
                    }
                }
                return sb2.toString();
            }
        }
        return str;
    }

    public final synchronized InetAddress c() {
        if (this.f78936f) {
            return this.f78935e;
        }
        String str = this.f78934d;
        if (str == null) {
            return null;
        }
        try {
            this.f78935e = InetAddress.getByName(str);
        } catch (UnknownHostException unused) {
            this.f78935e = null;
        }
        this.f78936f = true;
        return this.f78935e;
    }

    public boolean equals(Object obj) {
        String str;
        if (!(obj instanceof URLName)) {
            return false;
        }
        URLName uRLName = (URLName) obj;
        String str2 = this.f78931a;
        String str3 = uRLName.f78931a;
        if (str2 != str3 && (str2 == null || !str2.equals(str3))) {
            return false;
        }
        InetAddress inetAddressC = c();
        InetAddress inetAddressC2 = uRLName.c();
        if (inetAddressC == null || inetAddressC2 == null) {
            String str4 = this.f78934d;
            if (str4 == null || (str = uRLName.f78934d) == null) {
                if (str4 != uRLName.f78934d) {
                    return false;
                }
            } else if (!str4.equalsIgnoreCase(str)) {
                return false;
            }
        } else if (!inetAddressC.equals(inetAddressC2)) {
            return false;
        }
        String str5 = this.f78932b;
        String str6 = uRLName.f78932b;
        if (str5 != str6 && (str5 == null || !str5.equals(str6))) {
            return false;
        }
        String str7 = this.f78938h;
        if (str7 == null) {
            str7 = "";
        }
        String str8 = uRLName.f78938h;
        return str7.equals(str8 != null ? str8 : "") && this.f78937g == uRLName.f78937g;
    }

    public String getFile() {
        return this.f78938h;
    }

    public String getHost() {
        return this.f78934d;
    }

    public String getPassword() {
        return f78929k ? a(this.f78933c) : this.f78933c;
    }

    public int getPort() {
        return this.f78937g;
    }

    public String getProtocol() {
        return this.f78931a;
    }

    public String getRef() {
        return this.f78939i;
    }

    public URL getURL() throws MalformedURLException {
        String file = getFile();
        return new URL(getProtocol(), getHost(), getPort(), file == null ? "" : "/".concat(file));
    }

    public String getUsername() {
        return f78929k ? a(this.f78932b) : this.f78932b;
    }

    public int hashCode() {
        int i10 = this.f78940j;
        if (i10 != 0) {
            return i10;
        }
        String str = this.f78931a;
        if (str != null) {
            this.f78940j = str.hashCode() + i10;
        }
        InetAddress inetAddressC = c();
        if (inetAddressC != null) {
            this.f78940j = inetAddressC.hashCode() + this.f78940j;
        } else {
            String str2 = this.f78934d;
            if (str2 != null) {
                this.f78940j = str2.toLowerCase(Locale.ENGLISH).hashCode() + this.f78940j;
            }
        }
        String str3 = this.f78932b;
        if (str3 != null) {
            this.f78940j = str3.hashCode() + this.f78940j;
        }
        String str4 = this.f78938h;
        if (str4 != null) {
            this.f78940j = str4.hashCode() + this.f78940j;
        }
        int i11 = this.f78940j + this.f78937g;
        this.f78940j = i11;
        return i11;
    }

    public void parseString(String str) {
        int iIndexOf;
        String strSubstring;
        this.f78933c = null;
        this.f78932b = null;
        this.f78934d = null;
        this.f78939i = null;
        this.f78938h = null;
        this.f78931a = null;
        this.f78937g = -1;
        int length = str.length();
        int iIndexOf2 = str.indexOf(58);
        if (iIndexOf2 != -1) {
            this.f78931a = str.substring(0, iIndexOf2);
        }
        int i10 = iIndexOf2 + 1;
        if (str.regionMatches(i10, "//", 0, 2)) {
            int i11 = iIndexOf2 + 3;
            int iIndexOf3 = str.indexOf(47, i11);
            if (iIndexOf3 != -1) {
                strSubstring = str.substring(i11, iIndexOf3);
                int i12 = iIndexOf3 + 1;
                if (i12 < length) {
                    this.f78938h = str.substring(i12);
                } else {
                    this.f78938h = "";
                }
            } else {
                strSubstring = str.substring(i11);
            }
            int iIndexOf4 = strSubstring.indexOf(64);
            if (iIndexOf4 != -1) {
                String strSubstring2 = strSubstring.substring(0, iIndexOf4);
                strSubstring = strSubstring.substring(iIndexOf4 + 1);
                int iIndexOf5 = strSubstring2.indexOf(58);
                if (iIndexOf5 != -1) {
                    this.f78932b = strSubstring2.substring(0, iIndexOf5);
                    this.f78933c = strSubstring2.substring(iIndexOf5 + 1);
                } else {
                    this.f78932b = strSubstring2;
                }
            }
            int iIndexOf6 = (strSubstring.length() <= 0 || strSubstring.charAt(0) != '[') ? strSubstring.indexOf(58) : strSubstring.indexOf(58, strSubstring.indexOf(93));
            if (iIndexOf6 != -1) {
                String strSubstring3 = strSubstring.substring(iIndexOf6 + 1);
                if (strSubstring3.length() > 0) {
                    try {
                        this.f78937g = Integer.parseInt(strSubstring3);
                    } catch (NumberFormatException unused) {
                        this.f78937g = -1;
                    }
                }
                this.f78934d = strSubstring.substring(0, iIndexOf6);
            } else {
                this.f78934d = strSubstring;
            }
        } else if (i10 < length) {
            this.f78938h = str.substring(i10);
        }
        String str2 = this.f78938h;
        if (str2 == null || (iIndexOf = str2.indexOf(35)) == -1) {
            return;
        }
        this.f78939i = this.f78938h.substring(iIndexOf + 1);
        this.f78938h = this.f78938h.substring(0, iIndexOf);
    }

    public String toString() {
        if (this.fullURL == null) {
            StringBuilder sb2 = new StringBuilder();
            String str = this.f78931a;
            if (str != null) {
                sb2.append(str);
                sb2.append(DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER);
            }
            if (this.f78932b != null || this.f78934d != null) {
                sb2.append("//");
                String str2 = this.f78932b;
                if (str2 != null) {
                    sb2.append(str2);
                    if (this.f78933c != null) {
                        sb2.append(DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER);
                        sb2.append(this.f78933c);
                    }
                    sb2.append("@");
                }
                String str3 = this.f78934d;
                if (str3 != null) {
                    sb2.append(str3);
                }
                if (this.f78937g != -1) {
                    sb2.append(DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER);
                    sb2.append(Integer.toString(this.f78937g));
                }
                if (this.f78938h != null) {
                    sb2.append("/");
                }
            }
            String str4 = this.f78938h;
            if (str4 != null) {
                sb2.append(str4);
            }
            if (this.f78939i != null) {
                sb2.append("#");
                sb2.append(this.f78939i);
            }
            this.fullURL = sb2.toString();
        }
        return this.fullURL;
    }

    public URLName(URL url) {
        this(url.toString());
    }

    public URLName(String str) {
        this.f78936f = false;
        this.f78937g = -1;
        this.f78940j = 0;
        parseString(str);
    }
}
