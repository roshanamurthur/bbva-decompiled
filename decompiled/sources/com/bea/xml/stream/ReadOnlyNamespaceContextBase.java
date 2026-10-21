package com.bea.xml.stream;

import java.io.FileReader;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.Iterator;
import javax.xml.XMLConstants;
import javax.xml.namespace.NamespaceContext;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes9.dex */
public class ReadOnlyNamespaceContextBase implements NamespaceContext {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String[] f37825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String[] f37826b;

    public ReadOnlyNamespaceContextBase(String[] strArr, String[] strArr2, int i10) {
        String[] strArr3 = new String[i10];
        this.f37825a = strArr3;
        String[] strArr4 = new String[i10];
        this.f37826b = strArr4;
        System.arraycopy(strArr, 0, strArr3, 0, strArr3.length);
        System.arraycopy(strArr2, 0, strArr4, 0, strArr4.length);
    }

    public static void main(String[] strArr) throws Exception {
        MXParser mXParser = new MXParser();
        mXParser.setInput(new FileReader(strArr[0]));
        while (mXParser.hasNext()) {
            if (mXParser.isStartElement()) {
                PrintStream printStream = System.out;
                StringBuffer stringBuffer = new StringBuffer("context[");
                stringBuffer.append(mXParser.getNamespaceContext());
                stringBuffer.append(Constant.BRACKET_CLOSE);
                printStream.println(stringBuffer.toString());
                Iterator prefixes = mXParser.getNamespaceContext().getPrefixes("a");
                while (prefixes.hasNext()) {
                    PrintStream printStream2 = System.out;
                    StringBuffer stringBuffer2 = new StringBuffer("Found prefix:");
                    stringBuffer2.append(prefixes.next());
                    printStream2.println(stringBuffer2.toString());
                }
            }
            mXParser.next();
        }
    }

    public String getDefaultNameSpace() {
        String[] strArr = this.f37826b;
        for (int length = strArr.length - 1; length >= 0; length--) {
            if (this.f37825a[length] == null) {
                return strArr[length];
            }
        }
        return null;
    }

    @Override // javax.xml.namespace.NamespaceContext
    public String getNamespaceURI(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Prefix may not be null.");
        }
        int length = str.length();
        String[] strArr = this.f37825a;
        String[] strArr2 = this.f37826b;
        if (length <= 0) {
            for (int length2 = strArr2.length - 1; length2 >= 0; length2--) {
                if (strArr[length2] == null) {
                    return strArr2[length2];
                }
            }
            return null;
        }
        for (int length3 = strArr2.length - 1; length3 >= 0; length3--) {
            if (str.equals(strArr[length3])) {
                return strArr2[length3];
            }
        }
        if ("xml".equals(str)) {
            return XMLConstants.XML_NS_URI;
        }
        if (XMLConstants.XMLNS_ATTRIBUTE.equals(str)) {
            return XMLConstants.XMLNS_ATTRIBUTE_NS_URI;
        }
        return null;
    }

    @Override // javax.xml.namespace.NamespaceContext
    public String getPrefix(String str) {
        if (str == null) {
            throw new IllegalArgumentException("uri may not be null");
        }
        if (str.length() == 0) {
            throw new IllegalArgumentException("uri may not be empty string");
        }
        String[] strArr = this.f37826b;
        for (int length = strArr.length - 1; length >= 0; length--) {
            if (str.equals(strArr[length])) {
                Object[] objArr = this.f37825a;
                String str2 = objArr[length];
                if (str2 == null) {
                    for (int length2 = strArr.length - 1; length2 > length; length2--) {
                        if (objArr[length2] != null) {
                        }
                    }
                    return "";
                }
                for (int length3 = strArr.length - 1; length3 > length; length3--) {
                    if (!str2.equals(objArr[length3])) {
                    }
                }
                return str2;
            }
        }
        if (XMLConstants.XML_NS_URI.equals(str)) {
            return "xml";
        }
        if (XMLConstants.XMLNS_ATTRIBUTE_NS_URI.equals(str)) {
            return XMLConstants.XMLNS_ATTRIBUTE;
        }
        return null;
    }

    @Override // javax.xml.namespace.NamespaceContext
    public Iterator getPrefixes(String str) {
        if (str == null) {
            throw new IllegalArgumentException("uri may not be null");
        }
        if ("".equals(str)) {
            throw new IllegalArgumentException("uri may not be empty string");
        }
        HashSet hashSet = new HashSet();
        String[] strArr = this.f37826b;
        for (int length = strArr.length - 1; length >= 0; length--) {
            Object[] objArr = this.f37825a;
            String str2 = objArr[length];
            if (str2 == null) {
                str2 = "";
            }
            if (str.equals(strArr[length]) && !hashSet.contains(str2)) {
                if (str2.length() != 0) {
                    int length2 = strArr.length - 1;
                    while (true) {
                        if (length2 <= length) {
                            hashSet.add(str2);
                            break;
                            break;
                        }
                        if (str2.equals(objArr[length2])) {
                            break;
                        }
                        length2--;
                    }
                } else {
                    int length3 = strArr.length - 1;
                    while (true) {
                        if (length3 <= length) {
                            hashSet.add(str2);
                            break;
                        }
                        if (objArr[length3] == null) {
                            break;
                        }
                        length3--;
                    }
                }
            }
        }
        return hashSet.iterator();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        int i10 = 0;
        while (true) {
            String[] strArr = this.f37826b;
            if (i10 >= strArr.length) {
                return stringBuffer.toString();
            }
            StringBuffer stringBuffer2 = new StringBuffer(Constant.BRACKET_OPEN);
            String str = this.f37825a[i10];
            if (str == null) {
                str = "";
            }
            stringBuffer2.append(str);
            stringBuffer2.append("<->");
            stringBuffer2.append(strArr[i10]);
            stringBuffer2.append(Constant.BRACKET_CLOSE);
            stringBuffer.append(stringBuffer2.toString());
            i10++;
        }
    }
}
