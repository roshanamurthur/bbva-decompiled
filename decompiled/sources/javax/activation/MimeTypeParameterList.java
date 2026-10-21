package javax.activation;

import androidx.appcompat.widget.g0;
import androidx.camera.core.processing.f;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Locale;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes12.dex */
public class MimeTypeParameterList {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Hashtable f78871a = new Hashtable();

    public MimeTypeParameterList() {
    }

    public static boolean a(char c10) {
        return c10 > ' ' && c10 < 127 && "()<>@,;:/[]?=\\\"".indexOf(c10) < 0;
    }

    public static int b(int i10, String str) {
        int length = str.length();
        while (i10 < length && Character.isWhitespace(str.charAt(i10))) {
            i10++;
        }
        return i10;
    }

    public String get(String str) {
        return (String) this.f78871a.get(str.trim().toLowerCase(Locale.ENGLISH));
    }

    public Enumeration getNames() {
        return this.f78871a.keys();
    }

    public boolean isEmpty() {
        return this.f78871a.isEmpty();
    }

    public void parse(String str) throws MimeTypeParseException {
        int length;
        int i10;
        String strSubstring;
        if (str != null && (length = str.length()) > 0) {
            int iB = b(0, str);
            while (iB < length && str.charAt(iB) == ';') {
                int iB2 = b(iB + 1, str);
                if (iB2 >= length) {
                    return;
                }
                int i11 = iB2;
                while (i11 < length && a(str.charAt(i11))) {
                    i11++;
                }
                String lowerCase = str.substring(iB2, i11).toLowerCase(Locale.ENGLISH);
                int iB3 = b(i11, str);
                if (iB3 >= length || str.charAt(iB3) != '=') {
                    throw new MimeTypeParseException("Couldn't find the '=' that separates a parameter name from its value.");
                }
                int iB4 = b(iB3 + 1, str);
                if (iB4 >= length) {
                    throw new MimeTypeParseException(f.d("Couldn't find a value for parameter named ", lowerCase));
                }
                char cCharAt = str.charAt(iB4);
                if (cCharAt == '\"') {
                    int i12 = iB4 + 1;
                    if (i12 >= length) {
                        throw new MimeTypeParseException("Encountered unterminated quoted parameter value.");
                    }
                    int i13 = i12;
                    while (i13 < length && (cCharAt = str.charAt(i13)) != '\"') {
                        if (cCharAt == '\\') {
                            i13++;
                        }
                        i13++;
                    }
                    if (cCharAt != '\"') {
                        throw new MimeTypeParseException("Encountered unterminated quoted parameter value.");
                    }
                    String strSubstring2 = str.substring(i12, i13);
                    int length2 = strSubstring2.length();
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.ensureCapacity(length2);
                    boolean z10 = false;
                    for (int i14 = 0; i14 < length2; i14++) {
                        char cCharAt2 = strSubstring2.charAt(i14);
                        if (!z10 && cCharAt2 != '\\') {
                            stringBuffer.append(cCharAt2);
                        } else if (z10) {
                            stringBuffer.append(cCharAt2);
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                    }
                    strSubstring = stringBuffer.toString();
                    i10 = i13 + 1;
                } else {
                    if (!a(cCharAt)) {
                        throw new MimeTypeParseException(g0.c("Unexpected character encountered at index ", iB4));
                    }
                    i10 = iB4;
                    while (i10 < length && a(str.charAt(i10))) {
                        i10++;
                    }
                    strSubstring = str.substring(iB4, i10);
                }
                this.f78871a.put(lowerCase, strSubstring);
                iB = b(i10, str);
            }
            if (iB < length) {
                throw new MimeTypeParseException("More characters encountered in input than expected.");
            }
        }
    }

    public void remove(String str) {
        this.f78871a.remove(str.trim().toLowerCase(Locale.ENGLISH));
    }

    public void set(String str, String str2) {
        this.f78871a.put(str.trim().toLowerCase(Locale.ENGLISH), str2);
    }

    public int size() {
        return this.f78871a.size();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        Hashtable hashtable = this.f78871a;
        stringBuffer.ensureCapacity(hashtable.size() * 16);
        Enumeration enumerationKeys = hashtable.keys();
        while (enumerationKeys.hasMoreElements()) {
            String str = (String) enumerationKeys.nextElement();
            stringBuffer.append("; ");
            stringBuffer.append(str);
            stringBuffer.append('=');
            String string = (String) hashtable.get(str);
            int length = string.length();
            boolean z10 = false;
            for (int i10 = 0; i10 < length && !z10; i10++) {
                z10 = !a(string.charAt(i10));
            }
            if (z10) {
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.ensureCapacity((int) (((double) length) * 1.5d));
                stringBuffer2.append('\"');
                for (int i11 = 0; i11 < length; i11++) {
                    char cCharAt = string.charAt(i11);
                    if (cCharAt == '\\' || cCharAt == '\"') {
                        stringBuffer2.append(AbstractJsonLexerKt.STRING_ESC);
                    }
                    stringBuffer2.append(cCharAt);
                }
                stringBuffer2.append('\"');
                string = stringBuffer2.toString();
            }
            stringBuffer.append(string);
        }
        return stringBuffer.toString();
    }

    public MimeTypeParameterList(String str) throws MimeTypeParseException {
        parse(str);
    }
}
