package javax.mail.internet;

import ad.d;
import androidx.camera.camera2.internal.h0;
import androidx.databinding.e;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.tohu.android.product.valkyria.sdk.logic.ReplenishLogic;
import com.sun.mail.util.PropUtil;
import java.io.UnsupportedEncodingException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Locale;
import java.util.StringTokenizer;
import javax.mail.Address;
import javax.mail.Session;
import kotlin.jvm.internal.CharCompanionObject;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes12.dex */
public class InternetAddress extends Address implements Cloneable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final boolean f78966p0 = PropUtil.getBooleanSystemProperty("mail.mime.address.ignorebogusgroupname", true);

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final boolean f78967q0 = PropUtil.getBooleanSystemProperty("mail.mime.address.usecanonicalhostname", true);

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final boolean f78968r0 = PropUtil.getBooleanSystemProperty("mail.mime.allowutf8", false);

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final String f78969s0 = HeaderTokenizer.RFC822.replace(' ', (char) 0).replace('\t', (char) 0);
    protected String address;
    protected String encodedPersonal;
    protected String personal;

    public InternetAddress() {
    }

    public static InternetAddress a(Session session) throws AddressException, SecurityException, UnknownHostException {
        String property;
        String property2;
        String strC;
        if (session == null) {
            property2 = System.getProperty("user.name");
            strC = c();
            property = null;
        } else {
            property = session.getProperty("mail.from");
            if (property == null) {
                String property3 = session.getProperty("mail.user");
                if (property3 == null || property3.length() == 0) {
                    property3 = session.getProperty("user.name");
                }
                String property4 = (property3 == null || property3.length() == 0) ? System.getProperty("user.name") : property3;
                String property5 = session.getProperty("mail.host");
                if (property5 == null || property5.length() == 0) {
                    property5 = c();
                }
                String str = property4;
                strC = property5;
                property2 = str;
            } else {
                property2 = null;
                strC = null;
            }
        }
        if (property == null && property2 != null && property2.length() != 0 && strC != null && strC.length() != 0) {
            property = MimeUtility.quote(property2.trim(), "()<>,;:\\\"[]@\t ") + "@" + strC;
        }
        if (property == null) {
            return null;
        }
        return new InternetAddress(property);
    }

    public static void b(String str, boolean z10, boolean z11) throws AddressException {
        int i10;
        int i11;
        if (str == null) {
            throw new AddressException("Address is null");
        }
        int length = str.length();
        if (length == 0) {
            throw new AddressException("Empty address", str);
        }
        if (z10 && str.charAt(0) == '@') {
            i10 = 0;
            while (true) {
                int i12 = -1;
                try {
                    int length2 = str.length();
                    for (int i13 = i10; i13 < length2; i13++) {
                        if (",:".indexOf(str.charAt(i13)) >= 0) {
                            i12 = i13;
                            break;
                        }
                    }
                } catch (StringIndexOutOfBoundsException unused) {
                }
                if (i12 < 0) {
                    break;
                }
                if (str.charAt(i10) != '@') {
                    throw new AddressException("Illegal route-addr", str);
                }
                if (str.charAt(i12) == ':') {
                    i10 = i12 + 1;
                    break;
                }
                i10 = i12 + 1;
            }
        } else {
            i10 = 0;
        }
        char c10 = CharCompanionObject.MAX_VALUE;
        boolean z12 = false;
        int i14 = i10;
        char c11 = 65535;
        while (i14 < length) {
            char cCharAt = str.charAt(i14);
            if (cCharAt != '\\' && c10 != '\\') {
                if (cCharAt != '\"') {
                    if (cCharAt == '\r') {
                        int i15 = i14 + 1;
                        if (i15 < length && str.charAt(i15) != '\n') {
                            throw new AddressException("Quoted local address contains CR without LF", str);
                        }
                    } else if (cCharAt == '\n') {
                        int i16 = i14 + 1;
                        if (i16 < length && str.charAt(i16) != ' ' && str.charAt(i16) != '\t') {
                            throw new AddressException("Quoted local address contains newline without whitespace", str);
                        }
                    } else if (cCharAt == '.') {
                        if (i14 == i10) {
                            throw new AddressException("Local address starts with dot", str);
                        }
                        if (c10 == '.') {
                            throw new AddressException("Local address contains dot-dot", str);
                        }
                    }
                    if (z12) {
                        continue;
                    } else {
                        if (cCharAt == '@') {
                            if (i14 == 0) {
                                throw new AddressException("Missing local name", str);
                            }
                            if (c10 == '.') {
                                throw new AddressException("Local address ends with dot", str);
                            }
                            c11 = c10;
                            c10 = cCharAt;
                            break;
                        }
                        if (cCharAt <= ' ' || cCharAt == 127) {
                            throw new AddressException("Local address contains control or whitespace", str);
                        }
                        if ("()<>,;:\\\"[]@".indexOf(cCharAt) >= 0) {
                            throw new AddressException("Local address contains illegal character", str);
                        }
                    }
                } else if (z12) {
                    if (z11 && (i11 = i14 + 1) < length && str.charAt(i11) != '@') {
                        throw new AddressException("Quote not at end of local address", str);
                    }
                    z12 = false;
                } else {
                    if (z11 && i14 != 0) {
                        throw new AddressException("Quote not at start of local address", str);
                    }
                    z12 = true;
                }
            }
            i14++;
            c11 = c10;
            c10 = cCharAt;
        }
        if (z12) {
            throw new AddressException("Unterminated quote", str);
        }
        if (c10 != '@') {
            if (z11) {
                throw new AddressException("Missing final '@domain'", str);
            }
            return;
        }
        int i17 = i14 + 1;
        if (i17 >= length) {
            throw new AddressException("Missing domain", str);
        }
        if (str.charAt(i17) == '.') {
            throw new AddressException("Domain starts with dot", str);
        }
        boolean z13 = false;
        int i18 = i17;
        while (i18 < length) {
            char cCharAt2 = str.charAt(i18);
            if (cCharAt2 == '[') {
                if (i18 != i17) {
                    throw new AddressException("Domain literal not at start of domain", str);
                }
                z13 = true;
            } else if (cCharAt2 == ']') {
                if (i18 != length - 1) {
                    throw new AddressException("Domain literal end not at end of domain", str);
                }
                z13 = false;
            } else {
                if (cCharAt2 <= ' ' || cCharAt2 == 127) {
                    throw new AddressException("Domain contains control or whitespace", str);
                }
                if (z13) {
                    continue;
                } else {
                    if (!Character.isLetterOrDigit(cCharAt2) && cCharAt2 != '-' && cCharAt2 != '.') {
                        throw new AddressException("Domain contains illegal character", str);
                    }
                    if (cCharAt2 == '.' && c11 == '.') {
                        throw new AddressException("Domain contains dot-dot", str);
                    }
                }
            }
            i18++;
            c11 = cCharAt2;
        }
        if (c11 == '.') {
            throw new AddressException("Domain ends with dot", str);
        }
    }

    public static String c() throws UnknownHostException {
        InetAddress localHost = InetAddress.getLocalHost();
        if (localHost == null) {
            return null;
        }
        String canonicalHostName = f78967q0 ? localHost.getCanonicalHostName() : null;
        if (canonicalHostName == null) {
            canonicalHostName = localHost.getHostName();
        }
        if (canonicalHostName == null) {
            canonicalHostName = localHost.getHostAddress();
        }
        if (canonicalHostName == null || canonicalHostName.length() <= 0) {
            return canonicalHostName;
        }
        boolean z10 = false;
        boolean z11 = false;
        for (int i10 = 0; i10 < canonicalHostName.length(); i10++) {
            char cCharAt = canonicalHostName.charAt(i10);
            if ((cCharAt < '0' || cCharAt > '9') && cCharAt != '.') {
                if ((cCharAt >= 'a' && cCharAt <= 'z') || (cCharAt >= 'A' && cCharAt <= 'Z')) {
                    z10 = true;
                } else {
                    if (cCharAt != ':') {
                        return canonicalHostName;
                    }
                    z11 = true;
                }
            }
        }
        return (!z10 || z11) ? androidx.camera.core.impl.utils.a.a(Constant.BRACKET_OPEN, canonicalHostName, AbstractJsonLexerKt.END_LIST) : canonicalHostName;
    }

    /* JADX WARN: Code duplicated, block: B:145:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:147:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:160:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:195:0x023b A[PHI: r2 r8 r9 r13
      0x023b: PHI (r2v38 int) = (r2v34 int), (r2v42 int) binds: [B:208:0x025a, B:193:0x0235] A[DONT_GENERATE, DONT_INLINE]
      0x023b: PHI (r8v18 int) = (r8v16 int), (r8v1 int) binds: [B:208:0x025a, B:193:0x0235] A[DONT_GENERATE, DONT_INLINE]
      0x023b: PHI (r9v12 int) = (r9v1 int), (r9v13 int) binds: [B:208:0x025a, B:193:0x0235] A[DONT_GENERATE, DONT_INLINE]
      0x023b: PHI (r13v7 int) = (r13v1 int), (r13v8 int) binds: [B:208:0x025a, B:193:0x0235] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:209:0x025c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:216:0x026d  */
    /* JADX WARN: Code duplicated, block: B:220:0x027a  */
    /* JADX WARN: Code duplicated, block: B:221:0x027d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:222:0x027f  */
    /* JADX WARN: Code duplicated, block: B:223:0x0283 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:224:0x0285  */
    /* JADX WARN: Code duplicated, block: B:230:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:244:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:250:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:253:0x0301  */
    /* JADX WARN: Code duplicated, block: B:269:0x0329 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:273:0x0333  */
    /* JADX WARN: Code duplicated, block: B:285:0x0362  */
    /* JADX WARN: Code duplicated, block: B:320:0x0260 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:322:0x032d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x009a  */
    public static InternetAddress[] d(String str, boolean z10, boolean z11) throws AddressException {
        String strF;
        int i10;
        String strTrim;
        String strF2;
        InternetAddress internetAddress;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int length = str.length();
        boolean z12 = z11 && !z10;
        ArrayList arrayList = new ArrayList();
        int i17 = 0;
        int i18 = -1;
        int i19 = -1;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        int i20 = -1;
        int i21 = -1;
        while (i17 < length) {
            char cCharAt = str.charAt(i17);
            if (cCharAt == '\t' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == ' ') {
                i10 = 1;
            } else {
                if (cCharAt == '\"') {
                    if (i18 == -1) {
                        i18 = i17;
                    }
                    i17++;
                    int i22 = i17;
                    while (i22 < length) {
                        char cCharAt2 = str.charAt(i22);
                        if (cCharAt2 != '\"') {
                            if (cCharAt2 == '\\') {
                                i22++;
                            }
                            i22++;
                        } else if (i22 >= length) {
                            i17 = i22;
                        } else if (!z12) {
                            throw new AddressException("Missing '\"'", str, i22);
                        }
                    }
                    if (i22 >= length) {
                        i17 = i22;
                    } else if (!z12) {
                        throw new AddressException("Missing '\"'", str, i22);
                    }
                } else if (cCharAt == ',') {
                    if (i18 == -1) {
                        i18 = -1;
                        i19 = i18;
                        i10 = 1;
                        z14 = false;
                        z15 = false;
                    } else if (z13) {
                        i10 = 1;
                        z14 = false;
                    } else {
                        if (i19 == -1) {
                            i19 = i17;
                        }
                        strTrim = str.substring(i18, i19).trim();
                        if (z15 || i20 < 0) {
                            strF2 = null;
                        } else {
                            strF2 = f(str.substring(i20, i21).trim());
                            if (strF2.trim().length() == 0) {
                                strF2 = null;
                            }
                        }
                        if (z11 && !z10 && strF2 != null && strF2.indexOf(64) >= 0 && strTrim.indexOf(64) < 0 && strTrim.indexOf(33) < 0) {
                            String str2 = strF2;
                            strF2 = strTrim;
                            strTrim = str2;
                        }
                        if (!z15 || z10 || z11) {
                            if (!z12) {
                                b(strTrim, z14, false);
                            }
                            internetAddress = new InternetAddress();
                            internetAddress.setAddress(strTrim);
                            if (strF2 != null) {
                                internetAddress.encodedPersonal = strF2;
                            }
                            arrayList.add(internetAddress);
                        } else {
                            StringTokenizer stringTokenizer = new StringTokenizer(strTrim);
                            while (stringTokenizer.hasMoreTokens()) {
                                String strNextToken = stringTokenizer.nextToken();
                                b(strNextToken, false, false);
                                InternetAddress internetAddress2 = new InternetAddress();
                                internetAddress2.setAddress(strNextToken);
                                arrayList.add(internetAddress2);
                            }
                        }
                        i10 = 1;
                        i18 = -1;
                        i19 = -1;
                        z14 = false;
                        z15 = false;
                        i20 = -1;
                        i21 = -1;
                    }
                } else if (cCharAt == '>') {
                    if (!z12) {
                        throw new AddressException("Missing '<'", str, i17);
                    }
                    if (i18 == -1) {
                        i18 = i17;
                    }
                    i10 = 1;
                } else if (cCharAt != '[') {
                    char c10 = RootService.OPEN_BRACKET;
                    if (cCharAt == '(') {
                        if (i18 >= 0 && i19 == -1) {
                            i19 = i17;
                        }
                        i17++;
                        int i23 = i17;
                        int i24 = 1;
                        while (i23 < length && i24 > 0) {
                            char cCharAt3 = str.charAt(i23);
                            if (cCharAt3 == c10) {
                                i24++;
                            } else if (cCharAt3 == ')') {
                                i24--;
                            } else if (cCharAt3 == '\\') {
                                i23++;
                            }
                            i23++;
                            c10 = RootService.OPEN_BRACKET;
                        }
                        if (i24 <= 0) {
                            i11 = i23 - 1;
                            if (i20 == -1) {
                                i20 = i17;
                            }
                            if (i21 == -1) {
                                i17 = i11;
                                i21 = i17;
                            } else {
                                i17 = i11;
                            }
                        } else if (!z12) {
                            throw new AddressException("Missing ')'", str, i23);
                        }
                    } else if (cCharAt != ')') {
                        switch (cCharAt) {
                            case ':':
                                if (z13 && !z12) {
                                    throw new AddressException("Nested group", str, i17);
                                }
                                if (i18 == -1) {
                                    i18 = i17;
                                }
                                if (z11 && !z10) {
                                    int i25 = i17 + 1;
                                    if (i25 < length) {
                                        char cCharAt4 = str.charAt(i25);
                                        if (")>[]:@\\,.".indexOf(cCharAt4) < 0) {
                                            String strSubstring = str.substring(i18, i17);
                                            if (f78966p0 || !(strSubstring.equalsIgnoreCase("mailto") || strSubstring.equalsIgnoreCase("From") || strSubstring.equalsIgnoreCase("To") || strSubstring.equalsIgnoreCase("Cc") || strSubstring.equalsIgnoreCase("Subject") || strSubstring.equalsIgnoreCase("Re"))) {
                                                z13 = true;
                                            } else {
                                                i18 = -1;
                                            }
                                        } else if (cCharAt4 == '@') {
                                            for (int i26 = i17 + 2; i26 < length && (cCharAt4 = str.charAt(i26)) != ';' && ")>[]:@\\,.".indexOf(cCharAt4) < 0; i26++) {
                                            }
                                            if (cCharAt4 != ';') {
                                                String strSubstring2 = str.substring(i18, i17);
                                                if (f78966p0) {
                                                    z13 = true;
                                                } else {
                                                    z13 = true;
                                                }
                                            }
                                        }
                                    } else {
                                        String strSubstring3 = str.substring(i18, i17);
                                        if (f78966p0) {
                                            z13 = true;
                                        } else {
                                            z13 = true;
                                        }
                                    }
                                } else {
                                    i10 = 1;
                                    z13 = true;
                                }
                                z15 = true;
                                break;
                                break;
                            case ';':
                                if (i18 == -1) {
                                    i10 = 1;
                                    i18 = -1;
                                    i19 = -1;
                                    z14 = false;
                                    z15 = false;
                                } else if (!z13) {
                                    if (!z12) {
                                        throw new AddressException("Illegal semicolon, not in group", str, i17);
                                    }
                                    if (i18 == -1) {
                                        i18 = -1;
                                        i19 = i18;
                                        i10 = 1;
                                        z14 = false;
                                        z15 = false;
                                    } else if (z13) {
                                        i10 = 1;
                                        z14 = false;
                                    } else {
                                        if (i19 == -1) {
                                            i19 = i17;
                                        }
                                        strTrim = str.substring(i18, i19).trim();
                                        if (z15) {
                                            strF2 = null;
                                        } else {
                                            strF2 = null;
                                        }
                                        if (z11) {
                                            String str3 = strF2;
                                            strF2 = strTrim;
                                            strTrim = str3;
                                        }
                                        if (z15) {
                                            if (!z12) {
                                                b(strTrim, z14, false);
                                            }
                                            internetAddress = new InternetAddress();
                                            internetAddress.setAddress(strTrim);
                                            if (strF2 != null) {
                                                internetAddress.encodedPersonal = strF2;
                                            }
                                            arrayList.add(internetAddress);
                                        } else {
                                            if (!z12) {
                                                b(strTrim, z14, false);
                                            }
                                            internetAddress = new InternetAddress();
                                            internetAddress.setAddress(strTrim);
                                            if (strF2 != null) {
                                                internetAddress.encodedPersonal = strF2;
                                            }
                                            arrayList.add(internetAddress);
                                        }
                                        i10 = 1;
                                        i18 = -1;
                                        i19 = -1;
                                        z14 = false;
                                        z15 = false;
                                        i20 = -1;
                                        i21 = -1;
                                    }
                                } else if (!z11 || z10 || (i12 = i17 + 1) >= length || str.charAt(i12) != '@') {
                                    InternetAddress internetAddress3 = new InternetAddress();
                                    internetAddress3.setAddress(str.substring(i18, i17 + 1).trim());
                                    arrayList.add(internetAddress3);
                                    i10 = 1;
                                    i18 = -1;
                                    i19 = -1;
                                    z13 = false;
                                    z14 = false;
                                    z15 = false;
                                    i20 = -1;
                                    i21 = -1;
                                } else {
                                    i10 = 1;
                                    z13 = false;
                                }
                                break;
                            case '<':
                                if (!z14) {
                                    z15 = true;
                                } else {
                                    if (!z12) {
                                        throw new AddressException("Extra route-addr", str, i17);
                                    }
                                    if (i18 == -1) {
                                        i18 = -1;
                                        i19 = i18;
                                        i10 = 1;
                                        z14 = false;
                                        z15 = false;
                                        break;
                                    } else if (z13) {
                                        z15 = true;
                                    } else {
                                        if (i19 == -1) {
                                            i19 = i17;
                                        }
                                        String strTrim2 = str.substring(i18, i19).trim();
                                        InternetAddress internetAddress4 = new InternetAddress();
                                        internetAddress4.setAddress(strTrim2);
                                        if (i20 >= 0) {
                                            internetAddress4.encodedPersonal = f(str.substring(i20, i21).trim());
                                        }
                                        arrayList.add(internetAddress4);
                                        i18 = -1;
                                        i19 = -1;
                                        z14 = false;
                                        z15 = false;
                                        i20 = -1;
                                        i21 = -1;
                                    }
                                }
                                int i27 = i17 + 1;
                                int i28 = i27;
                                boolean z16 = false;
                                while (true) {
                                    i13 = i27;
                                    if (i28 < length) {
                                        char cCharAt5 = str.charAt(i28);
                                        i14 = i19;
                                        if (cCharAt5 == '\"') {
                                            z16 = !z16;
                                        } else if (cCharAt5 != '>') {
                                            if (cCharAt5 == '\\') {
                                                i28++;
                                            }
                                        } else if (!z16) {
                                        }
                                        i28++;
                                        i27 = i13;
                                        i19 = i14;
                                    } else {
                                        i14 = i19;
                                    }
                                }
                                if (!z16) {
                                    i19 = i28;
                                } else {
                                    if (!z12) {
                                        throw new AddressException("Missing '\"'", str, i28);
                                    }
                                    int i29 = i13;
                                    while (i29 < length) {
                                        char cCharAt6 = str.charAt(i29);
                                        if (cCharAt6 == '\\') {
                                            i29++;
                                            i16 = 1;
                                        } else if (cCharAt6 == '>') {
                                            i19 = i29;
                                        } else {
                                            i16 = 1;
                                        }
                                        i29 += i16;
                                    }
                                    i19 = i29;
                                }
                                if (i19 >= length) {
                                    if (!z12) {
                                        throw new AddressException("Missing '>'", str, i19);
                                    }
                                    if (i18 == -1) {
                                        i18 = i17;
                                    }
                                    i17 = i13;
                                    i19 = i14;
                                    i10 = 1;
                                } else {
                                    if (z13) {
                                        i15 = i18;
                                    } else {
                                        if (i18 < 0) {
                                            i18 = i20;
                                            i17 = i21;
                                        }
                                        i21 = i17;
                                        i20 = i18;
                                        i15 = i13;
                                    }
                                    i18 = i15;
                                    i17 = i19;
                                    i10 = 1;
                                    z14 = true;
                                }
                                break;
                            default:
                                if (i18 == -1) {
                                    i18 = i17;
                                }
                                i10 = 1;
                                break;
                        }
                    } else {
                        if (!z12) {
                            throw new AddressException("Missing '('", str, i17);
                        }
                        if (i18 == -1) {
                            i18 = i17;
                        }
                        i10 = 1;
                    }
                } else {
                    if (i18 == -1) {
                        i18 = i17;
                    }
                    i17++;
                    i11 = i17;
                    while (i11 < length) {
                        char cCharAt7 = str.charAt(i11);
                        if (cCharAt7 == '\\') {
                            i11++;
                        } else if (cCharAt7 == ']') {
                            if (i11 >= length) {
                                i17 = i11;
                            } else if (!z12) {
                                throw new AddressException("Missing ']'", str, i11);
                            }
                        }
                        i11++;
                    }
                    if (i11 >= length) {
                        i17 = i11;
                    } else if (!z12) {
                        throw new AddressException("Missing ']'", str, i11);
                    }
                }
                i10 = 1;
                z15 = true;
            }
            i17 += i10;
        }
        if (i18 >= 0) {
            if (i19 != -1) {
                length = i19;
            }
            String strTrim3 = str.substring(i18, length).trim();
            if (!z15 || i20 < 0) {
                strF = null;
            } else {
                strF = f(str.substring(i20, i21).trim());
                if (strF.trim().length() == 0) {
                    strF = null;
                }
            }
            if (z11 && !z10 && strF != null && strF.indexOf(64) >= 0 && strTrim3.indexOf(64) < 0 && strTrim3.indexOf(33) < 0) {
                strTrim3 = strF;
                strF = strTrim3;
            }
            if (z15 || z10 || z11) {
                if (!z12) {
                    b(strTrim3, z14, false);
                }
                InternetAddress internetAddress5 = new InternetAddress();
                internetAddress5.setAddress(strTrim3);
                if (strF != null) {
                    internetAddress5.encodedPersonal = strF;
                }
                arrayList.add(internetAddress5);
            } else {
                StringTokenizer stringTokenizer2 = new StringTokenizer(strTrim3);
                while (stringTokenizer2.hasMoreTokens()) {
                    String strNextToken2 = stringTokenizer2.nextToken();
                    b(strNextToken2, false, false);
                    InternetAddress internetAddress6 = new InternetAddress();
                    internetAddress6.setAddress(strNextToken2);
                    arrayList.add(internetAddress6);
                }
            }
        }
        InternetAddress[] internetAddressArr = new InternetAddress[arrayList.size()];
        arrayList.toArray(internetAddressArr);
        return internetAddressArr;
    }

    public static String e(String str) {
        int length = str.length();
        boolean z10 = false;
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == '\"' || cCharAt == '\\') {
                StringBuilder sb2 = new StringBuilder(length + 3);
                sb2.append('\"');
                for (int i11 = 0; i11 < length; i11++) {
                    char cCharAt2 = str.charAt(i11);
                    if (cCharAt2 == '\"' || cCharAt2 == '\\') {
                        sb2.append(AbstractJsonLexerKt.STRING_ESC);
                    }
                    sb2.append(cCharAt2);
                }
                sb2.append('\"');
                return sb2.toString();
            }
            if ((cCharAt < ' ' && cCharAt != '\r' && cCharAt != '\n' && cCharAt != '\t') || ((cCharAt >= 127 && !f78968r0) || f78969s0.indexOf(cCharAt) >= 0)) {
                z10 = true;
            }
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

    public static String f(String str) {
        if (!str.startsWith("\"") || !str.endsWith("\"") || str.length() <= 1) {
            return str;
        }
        String strC = e.c(str, 1, 1);
        if (strC.indexOf(92) < 0) {
            return strC;
        }
        StringBuilder sb2 = new StringBuilder(strC.length());
        int i10 = 0;
        while (i10 < strC.length()) {
            char cCharAt = strC.charAt(i10);
            if (cCharAt == '\\' && i10 < strC.length() - 1) {
                i10++;
                cCharAt = strC.charAt(i10);
            }
            sb2.append(cCharAt);
            i10++;
        }
        return sb2.toString();
    }

    public static InternetAddress getLocalAddress(Session session) {
        try {
            return a(session);
        } catch (SecurityException | UnknownHostException | AddressException unused) {
            return null;
        }
    }

    public static InternetAddress[] parse(String str) throws AddressException {
        return parse(str, true);
    }

    public static InternetAddress[] parseHeader(String str, boolean z10) throws AddressException {
        return d(MimeUtility.unfold(str), z10, true);
    }

    public Object clone() {
        try {
            return (InternetAddress) super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    @Override // javax.mail.Address
    public boolean equals(Object obj) {
        if (!(obj instanceof InternetAddress)) {
            return false;
        }
        String address = ((InternetAddress) obj).getAddress();
        String str = this.address;
        if (address == str) {
            return true;
        }
        return str != null && str.equalsIgnoreCase(address);
    }

    public String getAddress() {
        return this.address;
    }

    public InternetAddress[] getGroup(boolean z10) throws AddressException {
        int iIndexOf;
        String address = getAddress();
        if (address != null && address.endsWith(ReplenishLogic.ID_SEPARATOR) && (iIndexOf = address.indexOf(58)) >= 0) {
            return parseHeader(address.substring(iIndexOf + 1, address.length() - 1), z10);
        }
        return null;
    }

    public String getPersonal() {
        String str = this.personal;
        if (str != null) {
            return str;
        }
        String str2 = this.encodedPersonal;
        if (str2 == null) {
            return null;
        }
        try {
            String strDecodeText = MimeUtility.decodeText(str2);
            this.personal = strDecodeText;
            return strDecodeText;
        } catch (Exception unused) {
            return this.encodedPersonal;
        }
    }

    @Override // javax.mail.Address
    public String getType() {
        return "rfc822";
    }

    public int hashCode() {
        String str = this.address;
        if (str == null) {
            return 0;
        }
        return str.toLowerCase(Locale.ENGLISH).hashCode();
    }

    public boolean isGroup() {
        String str = this.address;
        return str != null && str.endsWith(ReplenishLogic.ID_SEPARATOR) && this.address.indexOf(58) > 0;
    }

    public void setAddress(String str) {
        this.address = str;
    }

    public void setPersonal(String str, String str2) throws UnsupportedEncodingException {
        this.personal = str;
        if (str != null) {
            this.encodedPersonal = MimeUtility.encodeWord(str, str2, null);
        } else {
            this.encodedPersonal = null;
        }
    }

    @Override // javax.mail.Address
    public String toString() {
        String str;
        String str2;
        String str3 = this.address;
        if (str3 == null) {
            str3 = "";
        }
        if (this.encodedPersonal == null && (str2 = this.personal) != null) {
            try {
                this.encodedPersonal = MimeUtility.encodeWord(str2);
            } catch (UnsupportedEncodingException unused) {
            }
        }
        if (this.encodedPersonal != null) {
            return e(this.encodedPersonal) + " <" + str3 + ">";
        }
        if (!isGroup() && (str = this.address) != null) {
            try {
                int length = str.length();
                for (int i10 = 0; i10 < length; i10++) {
                    if ("()<>,;:\\\"[]".indexOf(str.charAt(i10)) >= 0) {
                        if (i10 < 0) {
                            break;
                        }
                        return h0.b("<", str3, ">");
                    }
                }
            } catch (StringIndexOutOfBoundsException unused2) {
            }
        }
        return str3;
    }

    public String toUnicodeString() {
        String str;
        String personal = getPersonal();
        if (personal != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(e(personal));
            sb2.append(" <");
            return d.f(sb2, this.address, ">");
        }
        if (!isGroup() && (str = this.address) != null) {
            try {
                int length = str.length();
                for (int i10 = 0; i10 < length; i10++) {
                    if ("()<>,;:\\\"[]".indexOf(str.charAt(i10)) >= 0) {
                        if (i10 < 0) {
                            break;
                        }
                        return d.f(new StringBuilder("<"), this.address, ">");
                    }
                }
            } catch (StringIndexOutOfBoundsException unused) {
            }
        }
        return this.address;
    }

    public void validate() throws AddressException {
        if (isGroup()) {
            getGroup(true);
        } else {
            b(getAddress(), true, true);
        }
    }

    public InternetAddress(String str) throws AddressException {
        InternetAddress[] internetAddressArr = parse(str, true);
        if (internetAddressArr.length != 1) {
            throw new AddressException("Illegal address", str);
        }
        InternetAddress internetAddress = internetAddressArr[0];
        this.address = internetAddress.address;
        this.personal = internetAddress.personal;
        this.encodedPersonal = internetAddress.encodedPersonal;
    }

    public static InternetAddress[] parse(String str, boolean z10) throws AddressException {
        return d(str, z10, false);
    }

    public void setPersonal(String str) throws UnsupportedEncodingException {
        this.personal = str;
        if (str != null) {
            this.encodedPersonal = MimeUtility.encodeWord(str);
        } else {
            this.encodedPersonal = null;
        }
    }

    public InternetAddress(String str, boolean z10) throws AddressException {
        this(str);
        if (z10) {
            if (isGroup()) {
                getGroup(true);
            } else {
                b(this.address, true, true);
            }
        }
    }

    public InternetAddress(String str, String str2) throws UnsupportedEncodingException {
        this(str, str2, null);
    }

    public InternetAddress(String str, String str2, String str3) throws UnsupportedEncodingException {
        this.address = str;
        setPersonal(str2, str3);
    }

    public static String toString(Address[] addressArr) {
        return toString(addressArr, 0);
    }

    public static String toString(Address[] addressArr, int i10) {
        if (addressArr == null || addressArr.length == 0) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < addressArr.length; i11++) {
            if (i11 != 0) {
                sb2.append(", ");
                i10 += 2;
            }
            String strFold = MimeUtility.fold(0, addressArr[i11].toString());
            int iIndexOf = strFold.indexOf("\r\n");
            if (iIndexOf == -1) {
                iIndexOf = strFold.length();
            }
            if (iIndexOf + i10 > 76) {
                int length = sb2.length();
                if (length > 0) {
                    int i12 = length - 1;
                    if (sb2.charAt(i12) == ' ') {
                        sb2.setLength(i12);
                    }
                }
                sb2.append("\r\n\t");
                i10 = 8;
            }
            sb2.append(strFold);
            int iLastIndexOf = strFold.lastIndexOf("\r\n");
            if (iLastIndexOf != -1) {
                i10 = (strFold.length() - iLastIndexOf) - 2;
            } else {
                i10 = strFold.length() + i10;
            }
        }
        return sb2.toString();
    }

    public static String toUnicodeString(Address[] addressArr) {
        return toUnicodeString(addressArr, 0);
    }

    public static String toUnicodeString(Address[] addressArr, int i10) {
        if (addressArr == null || addressArr.length == 0) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = false;
        for (int i11 = 0; i11 < addressArr.length; i11++) {
            if (i11 != 0) {
                sb2.append(", ");
                i10 += 2;
            }
            String unicodeString = ((InternetAddress) addressArr[i11]).toUnicodeString();
            if (MimeUtility.a(unicodeString) != 1) {
                unicodeString = new String(unicodeString.getBytes(StandardCharsets.UTF_8), StandardCharsets.ISO_8859_1);
                z10 = true;
            }
            String strFold = MimeUtility.fold(0, unicodeString);
            int iIndexOf = strFold.indexOf("\r\n");
            if (iIndexOf == -1) {
                iIndexOf = strFold.length();
            }
            if (iIndexOf + i10 > 76) {
                int length = sb2.length();
                if (length > 0) {
                    int i12 = length - 1;
                    if (sb2.charAt(i12) == ' ') {
                        sb2.setLength(i12);
                    }
                }
                sb2.append("\r\n\t");
                i10 = 8;
            }
            sb2.append(strFold);
            int iLastIndexOf = strFold.lastIndexOf("\r\n");
            if (iLastIndexOf != -1) {
                i10 = (strFold.length() - iLastIndexOf) - 2;
            } else {
                i10 = strFold.length() + i10;
            }
        }
        String string = sb2.toString();
        return z10 ? new String(string.getBytes(StandardCharsets.ISO_8859_1), StandardCharsets.UTF_8) : string;
    }
}
